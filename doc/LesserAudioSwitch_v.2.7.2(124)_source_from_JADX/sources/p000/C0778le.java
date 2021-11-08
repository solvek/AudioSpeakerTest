package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: le */
public class C0778le extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0677je f3147a;

    public C0778le(C0677je jeVar) {
        this.f3147a = jeVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3147a.mo3448m();
        animator.removeListener(this);
    }
}
