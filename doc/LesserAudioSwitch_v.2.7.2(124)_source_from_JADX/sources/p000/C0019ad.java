package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ad */
public class C0019ad extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C0145a0 f91a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f92b;

    /* renamed from: c */
    public final /* synthetic */ View f93c;

    /* renamed from: d */
    public final /* synthetic */ C0465fd f94d;

    public C0019ad(C0465fd fdVar, RecyclerView.C0145a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f94d = fdVar;
        this.f91a = a0Var;
        this.f92b = viewPropertyAnimator;
        this.f93c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f92b.setListener((Animator.AnimatorListener) null);
        this.f93c.setAlpha(1.0f);
        this.f94d.mo1287c(this.f91a);
        this.f94d.f2119q.remove(this.f91a);
        this.f94d.mo2784k();
    }

    public void onAnimationStart(Animator animator) {
        this.f94d.getClass();
    }
}
