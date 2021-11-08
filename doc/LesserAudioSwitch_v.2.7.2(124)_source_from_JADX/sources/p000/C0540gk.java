package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p000.C0634ik;

/* renamed from: gk */
public class C0540gk extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f2333a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2334b;

    /* renamed from: c */
    public final /* synthetic */ C0634ik.C0640f f2335c;

    /* renamed from: d */
    public final /* synthetic */ C0634ik f2336d;

    public C0540gk(C0634ik ikVar, boolean z, C0634ik.C0640f fVar) {
        this.f2336d = ikVar;
        this.f2334b = z;
        this.f2335c = fVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2333a = true;
    }

    public void onAnimationEnd(Animator animator) {
        C0634ik ikVar = this.f2336d;
        ikVar.f2738o = 0;
        ikVar.f2733j = null;
        if (!this.f2333a) {
            FloatingActionButton floatingActionButton = ikVar.f2742s;
            boolean z = this.f2334b;
            floatingActionButton.mo1605b(z ? 8 : 4, z);
            C0634ik.C0640f fVar = this.f2335c;
            if (fVar != null) {
                C0480fk fkVar = (C0480fk) fVar;
                fkVar.f2152a.mo2283a(fkVar.f2153b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f2336d.f2742s.mo1605b(0, this.f2334b);
        C0634ik ikVar = this.f2336d;
        ikVar.f2738o = 1;
        ikVar.f2733j = animator;
        this.f2333a = false;
    }
}
