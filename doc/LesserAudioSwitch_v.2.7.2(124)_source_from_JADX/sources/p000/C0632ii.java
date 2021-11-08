package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: ii */
public class C0632ii extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f2709a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f2710b;

    /* renamed from: c */
    public final /* synthetic */ int f2711c;

    /* renamed from: d */
    public final /* synthetic */ boolean f2712d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f2713e;

    public C0632ii(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f2713e = bottomAppBar;
        this.f2710b = actionMenuView;
        this.f2711c = i;
        this.f2712d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2709a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f2709a) {
            BottomAppBar bottomAppBar = this.f2713e;
            ActionMenuView actionMenuView = this.f2710b;
            int i = this.f2711c;
            boolean z = this.f2712d;
            int i2 = BottomAppBar.f1462W;
            actionMenuView.setTranslationX((float) bottomAppBar.mo1895z(actionMenuView, i, z));
        }
    }
}
