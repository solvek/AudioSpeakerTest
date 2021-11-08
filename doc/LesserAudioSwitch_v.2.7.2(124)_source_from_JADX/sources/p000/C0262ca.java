package p000;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;

/* renamed from: ca */
public final class C0262ca extends FrameLayout {

    /* renamed from: b */
    public ArrayList<View> f1352b;

    /* renamed from: c */
    public ArrayList<View> f1353c;

    /* renamed from: d */
    public boolean f1354d = true;

    public C0262ca(Context context, AttributeSet attributeSet, C0614ia iaVar) {
        super(context, attributeSet);
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1008q9.f3783b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment G = iaVar.mo3198G(id);
        if (classAttribute != null && G == null) {
            if (id <= 0) {
                throw new IllegalStateException(C0279ch.m1121r("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? C0279ch.m1120q(" with tag ", string) : ""));
            }
            Fragment a = iaVar.mo3202K().mo2719a(context.getClassLoader(), classAttribute);
            a.mo843U(attributeSet, (Bundle) null);
            C1053r9 r9Var = new C1053r9(iaVar);
            r9Var.f3799p = true;
            a.f679D = this;
            r9Var.mo4069d(getId(), a, string, 1);
            if (!r9Var.f3790g) {
                r9Var.f3791h = false;
                r9Var.f3941q.mo3194C(r9Var, true);
                return;
            }
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
    }

    /* renamed from: a */
    public final void mo1701a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f1353c) != null && arrayList.contains(view))) {
            if (this.f1352b == null) {
                this.f1352b = new ArrayList<>();
            }
            this.f1352b.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f1354d && this.f1352b != null) {
            for (int i = 0; i < this.f1352b.size(); i++) {
                super.drawChild(canvas, this.f1352b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f1354d || (arrayList = this.f1352b) == null || arrayList.size() <= 0 || !this.f1352b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1353c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1352b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1354d = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            mo1701a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z) {
        if (z) {
            mo1701a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        mo1701a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        mo1701a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        mo1701a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo1701a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo1701a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1354d = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1353c == null) {
                this.f1353c = new ArrayList<>();
            }
            this.f1353c.add(view);
        }
        super.startViewTransition(view);
    }
}
