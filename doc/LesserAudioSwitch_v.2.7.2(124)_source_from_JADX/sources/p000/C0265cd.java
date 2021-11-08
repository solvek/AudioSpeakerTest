package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cd */
public class C0265cd extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C0145a0 f1356a;

    /* renamed from: b */
    public final /* synthetic */ int f1357b;

    /* renamed from: c */
    public final /* synthetic */ View f1358c;

    /* renamed from: d */
    public final /* synthetic */ int f1359d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f1360e;

    /* renamed from: f */
    public final /* synthetic */ C0465fd f1361f;

    public C0265cd(C0465fd fdVar, RecyclerView.C0145a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1361f = fdVar;
        this.f1356a = a0Var;
        this.f1357b = i;
        this.f1358c = view;
        this.f1359d = i2;
        this.f1360e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f1357b != 0) {
            this.f1358c.setTranslationX(0.0f);
        }
        if (this.f1359d != 0) {
            this.f1358c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f1360e.setListener((Animator.AnimatorListener) null);
        this.f1361f.mo1287c(this.f1356a);
        this.f1361f.f2118p.remove(this.f1356a);
        this.f1361f.mo2784k();
    }

    public void onAnimationStart(Animator animator) {
        this.f1361f.getClass();
    }
}
