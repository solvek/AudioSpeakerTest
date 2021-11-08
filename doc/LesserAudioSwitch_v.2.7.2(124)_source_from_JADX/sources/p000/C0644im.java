package p000;

import android.animation.ValueAnimator;

/* renamed from: im */
public class C0644im implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0482fm f2759a;

    public C0644im(C0482fm fmVar) {
        this.f2759a = fmVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2759a.f4026c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
