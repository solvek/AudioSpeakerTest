package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import p000.C0465fd;

/* renamed from: ed */
public class C0415ed extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0465fd.C0466a f1986a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f1987b;

    /* renamed from: c */
    public final /* synthetic */ View f1988c;

    /* renamed from: d */
    public final /* synthetic */ C0465fd f1989d;

    public C0415ed(C0465fd fdVar, C0465fd.C0466a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1989d = fdVar;
        this.f1986a = aVar;
        this.f1987b = viewPropertyAnimator;
        this.f1988c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1987b.setListener((Animator.AnimatorListener) null);
        this.f1988c.setAlpha(1.0f);
        this.f1988c.setTranslationX(0.0f);
        this.f1988c.setTranslationY(0.0f);
        this.f1989d.mo1287c(this.f1986a.f2122b);
        this.f1989d.f2120r.remove(this.f1986a.f2122b);
        this.f1989d.mo2784k();
    }

    public void onAnimationStart(Animator animator) {
        C0465fd fdVar = this.f1989d;
        RecyclerView.C0145a0 a0Var = this.f1986a.f2122b;
        fdVar.getClass();
    }
}
