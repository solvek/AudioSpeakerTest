package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: ja */
public class C0670ja extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2851a;

    /* renamed from: b */
    public final /* synthetic */ View f2852b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f2853c;

    public C0670ja(C0614ia iaVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f2851a = viewGroup;
        this.f2852b = view;
        this.f2853c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2851a.endViewTransition(this.f2852b);
        animator.removeListener(this);
        Fragment fragment = this.f2853c;
        View view = fragment.f680E;
        if (view != null && fragment.f717y) {
            view.setVisibility(8);
        }
    }
}
