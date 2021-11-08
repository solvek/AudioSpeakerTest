package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: hm */
public class C0582hm extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0482fm f2487a;

    public C0582hm(C0482fm fmVar) {
        this.f2487a = fmVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2487a.f4024a.setEndIconVisible(false);
    }
}
