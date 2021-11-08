package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: bi */
public abstract class C0223bi extends C0280ci<View> {

    /* renamed from: c */
    public final Rect f1272c = new Rect();

    /* renamed from: d */
    public final Rect f1273d = new Rect();

    /* renamed from: e */
    public int f1274e = 0;

    /* renamed from: f */
    public int f1275f;

    public C0223bi() {
    }

    public C0223bi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: C */
    public void mo1602C(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout F = ((AppBarLayout.ScrollingViewBehavior) this).mo1858F(coordinatorLayout.mo651d(view));
        if (F != null) {
            CoordinatorLayout.C0091f fVar = (CoordinatorLayout.C0091f) view.getLayoutParams();
            Rect rect = this.f1272c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, F.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((F.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C1241v8 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0813m8.m2476j(coordinatorLayout) && !C0813m8.m2476j(view)) {
                rect.left = lastWindowInsets.mo4842b() + rect.left;
                rect.right -= lastWindowInsets.mo4843c();
            }
            Rect rect2 = this.f1273d;
            int i3 = fVar.f613c;
            int i4 = i3 == 0 ? 8388659 : i3;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (Build.VERSION.SDK_INT >= 17) {
                Gravity.apply(i4, measuredWidth, measuredHeight, rect, rect2, i);
            } else {
                Gravity.apply(i4, measuredWidth, measuredHeight, rect, rect2);
            }
            int E = mo1603E(F);
            view.layout(rect2.left, rect2.top - E, rect2.right, rect2.bottom - E);
            i2 = rect2.top - F.getBottom();
        } else {
            coordinatorLayout.mo679r(view, i);
            i2 = 0;
        }
        this.f1274e = i2;
    }

    /* renamed from: E */
    public final int mo1603E(View view) {
        int i;
        if (this.f1275f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.C0088c cVar = ((CoordinatorLayout.C0091f) appBarLayout.getLayoutParams()).f611a;
            int E = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).mo113E() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + E > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = 1.0f + (((float) E) / ((float) i));
            }
        }
        int i2 = this.f1275f;
        return C1344x5.m3759h((int) (f * ((float) i2)), 0, i2);
    }

    /* renamed from: l */
    public boolean mo708l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout F;
        C1241v8 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (F = ((AppBarLayout.ScrollingViewBehavior) this).mo1858F(coordinatorLayout.mo651d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0813m8.m2476j(F) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo4841a() + lastWindowInsets.mo4844d();
        }
        coordinatorLayout.mo682s(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + F.getTotalScrollRange()) - F.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }
}
