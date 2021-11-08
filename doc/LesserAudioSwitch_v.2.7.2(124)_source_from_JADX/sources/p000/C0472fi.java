package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: fi */
public class C0472fi extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f2132a;

    public C0472fi(BottomAppBar bottomAppBar) {
        this.f2132a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m1190v(this.f2132a);
    }

    public void onAnimationStart(Animator animator) {
        this.f2132a.f1468T++;
    }
}
