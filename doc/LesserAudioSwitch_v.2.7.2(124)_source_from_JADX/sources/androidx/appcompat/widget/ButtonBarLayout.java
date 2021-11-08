package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.nordskog.LesserAudioSwitch.R;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f323b;

    /* renamed from: c */
    public int f324c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C0440f.f2057k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0813m8.m2456E(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f323b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    public final int mo333a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo334b() {
        return getOrientation() == 1;
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f323b) {
            if (size > this.f324c && mo334b()) {
                setStacked(false);
            }
            this.f324c = size;
        }
        if (mo334b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f323b && !mo334b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = mo333a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (mo334b()) {
                int a2 = mo333a(a + 1);
                i4 = a2 >= 0 ? getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        if (C0813m8.m2479m(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f323b != z) {
            this.f323b = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
