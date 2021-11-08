package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ui */
public final class C1212ui extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1366xi f4628a;

    public C1212ui(C1366xi xiVar) {
        this.f4628a = xiVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4628a.mo4907a();
    }

    public void onAnimationStart(Animator animator) {
        this.f4628a.mo4908b();
    }
}
