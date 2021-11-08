package p000;

import android.animation.ValueAnimator;

/* renamed from: jm */
public class C0689jm implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0482fm f2921a;

    public C0689jm(C0482fm fmVar) {
        this.f2921a = fmVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f2921a.f4026c.setScaleX(floatValue);
        this.f2921a.f4026c.setScaleY(floatValue);
    }
}
