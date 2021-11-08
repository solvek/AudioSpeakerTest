package p000;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: wh */
public class C1312wh implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1067rl f4960a;

    public C1312wh(AppBarLayout appBarLayout, C1067rl rlVar) {
        this.f4960a = rlVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4960a.mo4297o(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
