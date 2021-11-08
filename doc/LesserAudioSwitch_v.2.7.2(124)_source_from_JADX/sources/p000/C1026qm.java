package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qm */
public class C1026qm extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0836mm f3838a;

    public C1026qm(C0836mm mmVar) {
        this.f3838a = mmVar;
    }

    public void onAnimationEnd(Animator animator) {
        C0836mm mmVar = this.f3838a;
        mmVar.f4026c.setChecked(mmVar.f3301j);
        this.f3838a.f3307p.start();
    }
}
