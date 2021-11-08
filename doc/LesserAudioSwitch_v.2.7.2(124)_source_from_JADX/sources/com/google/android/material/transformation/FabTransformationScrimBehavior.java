package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C1169th f1733c = new C1169th(75, 150);

    /* renamed from: d */
    public final C1169th f1734d = new C1169th(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C0338a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f1735a;

        /* renamed from: b */
        public final /* synthetic */ View f1736b;

        public C0338a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f1735a = z;
            this.f1736b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1735a) {
                this.f1736b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f1735a) {
                this.f1736b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A */
    public boolean mo112A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: D */
    public AnimatorSet mo2516D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        mo2532E(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        C0728kh.m2310z(animatorSet, arrayList);
        animatorSet.addListener(new C0338a(this, z, view2));
        return animatorSet;
    }

    /* renamed from: E */
    public final void mo2532E(View view, boolean z, boolean z2, List list) {
        ObjectAnimator objectAnimator;
        C1169th thVar = z ? this.f1733c : this.f1734d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        thVar.mo4669a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    public boolean mo701d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
