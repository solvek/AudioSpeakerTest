package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0088c<V> {

    /* renamed from: a */
    public int f1444a = 0;

    /* renamed from: b */
    public int f1445b = 2;

    /* renamed from: c */
    public int f1446c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f1447d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C0293a extends AnimatorListenerAdapter {
        public C0293a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f1447d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B */
    public final void mo1861B(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f1447d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0293a());
    }

    /* renamed from: k */
    public boolean mo707k(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f1444a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    /* renamed from: r */
    public void mo714r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f1445b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f1447d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.f1445b = 1;
                mo1861B(v, this.f1444a + this.f1446c, 175, C0831mh.f3288c);
            }
        } else if (i2 < 0 && this.f1445b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f1447d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f1445b = 2;
            mo1861B(v, 0, 225, C0831mh.f3289d);
        }
    }

    /* renamed from: x */
    public boolean mo720x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }
}
