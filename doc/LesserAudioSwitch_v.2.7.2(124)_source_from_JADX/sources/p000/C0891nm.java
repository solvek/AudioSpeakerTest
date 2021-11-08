package p000;

import android.animation.ValueAnimator;

/* renamed from: nm */
public class C0891nm implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0836mm f3417a;

    public C0891nm(C0836mm mmVar) {
        this.f3417a = mmVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3417a.f4026c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
