package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p000.C0634ik;

/* renamed from: hk */
public class C0578hk extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f2481a;

    /* renamed from: b */
    public final /* synthetic */ C0634ik.C0640f f2482b;

    /* renamed from: c */
    public final /* synthetic */ C0634ik f2483c;

    public C0578hk(C0634ik ikVar, boolean z, C0634ik.C0640f fVar) {
        this.f2483c = ikVar;
        this.f2481a = z;
        this.f2482b = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        C0634ik ikVar = this.f2483c;
        ikVar.f2738o = 0;
        ikVar.f2733j = null;
        C0634ik.C0640f fVar = this.f2482b;
        if (fVar != null) {
            C0480fk fkVar = (C0480fk) fVar;
            fkVar.f2152a.mo2284b(fkVar.f2153b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f2483c.f2742s.mo1605b(0, this.f2481a);
        C0634ik ikVar = this.f2483c;
        ikVar.f2738o = 2;
        ikVar.f2733j = animator;
    }
}
