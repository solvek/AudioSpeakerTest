package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ke */
public class C0725ke extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0254c4 f2999a;

    /* renamed from: b */
    public final /* synthetic */ C0677je f3000b;

    public C0725ke(C0677je jeVar, C0254c4 c4Var) {
        this.f3000b = jeVar;
        this.f2999a = c4Var;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2999a.remove(animator);
        this.f3000b.f2889n.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f3000b.f2889n.add(animator);
    }
}
