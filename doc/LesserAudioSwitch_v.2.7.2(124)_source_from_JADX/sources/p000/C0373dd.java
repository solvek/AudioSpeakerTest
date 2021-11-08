package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import p000.C0465fd;

/* renamed from: dd */
public class C0373dd extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0465fd.C0466a f1888a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f1889b;

    /* renamed from: c */
    public final /* synthetic */ View f1890c;

    /* renamed from: d */
    public final /* synthetic */ C0465fd f1891d;

    public C0373dd(C0465fd fdVar, C0465fd.C0466a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1891d = fdVar;
        this.f1888a = aVar;
        this.f1889b = viewPropertyAnimator;
        this.f1890c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1889b.setListener((Animator.AnimatorListener) null);
        this.f1890c.setAlpha(1.0f);
        this.f1890c.setTranslationX(0.0f);
        this.f1890c.setTranslationY(0.0f);
        this.f1891d.mo1287c(this.f1888a.f2121a);
        this.f1891d.f2120r.remove(this.f1888a.f2121a);
        this.f1891d.mo2784k();
    }

    public void onAnimationStart(Animator animator) {
        C0465fd fdVar = this.f1891d;
        RecyclerView.C0145a0 a0Var = this.f1888a.f2121a;
        fdVar.getClass();
    }
}
