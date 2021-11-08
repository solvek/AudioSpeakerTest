package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: hi */
public class C0576hi extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f2479a;

    public C0576hi(BottomAppBar bottomAppBar) {
        this.f2479a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m1190v(this.f2479a);
        this.f2479a.f1464P = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f2479a.f1468T++;
    }
}
