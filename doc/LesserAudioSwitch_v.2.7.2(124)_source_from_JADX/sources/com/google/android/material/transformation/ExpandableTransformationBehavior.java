package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f1720b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C0335a extends AnimatorListenerAdapter {
        public C0335a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f1720b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: C */
    public boolean mo2514C(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f1720b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet D = mo2516D(view, view2, z, z3);
        this.f1720b = D;
        D.addListener(new C0335a());
        this.f1720b.start();
        if (!z2) {
            this.f1720b.end();
        }
        return true;
    }

    /* renamed from: D */
    public abstract AnimatorSet mo2516D(View view, View view2, boolean z, boolean z2);
}
