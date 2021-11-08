package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: gm */
public class C0542gm extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0482fm f2337a;

    public C0542gm(C0482fm fmVar) {
        this.f2337a = fmVar;
    }

    public void onAnimationStart(Animator animator) {
        this.f2337a.f4024a.setEndIconVisible(true);
    }
}
