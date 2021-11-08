package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: bd */
public class C0218bd extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C0145a0 f1259a;

    /* renamed from: b */
    public final /* synthetic */ View f1260b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f1261c;

    /* renamed from: d */
    public final /* synthetic */ C0465fd f1262d;

    public C0218bd(C0465fd fdVar, RecyclerView.C0145a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1262d = fdVar;
        this.f1259a = a0Var;
        this.f1260b = view;
        this.f1261c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1260b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f1261c.setListener((Animator.AnimatorListener) null);
        this.f1262d.mo1287c(this.f1259a);
        this.f1262d.f2117o.remove(this.f1259a);
        this.f1262d.mo2784k();
    }

    public void onAnimationStart(Animator animator) {
        this.f1262d.getClass();
    }
}
