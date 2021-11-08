package p000;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: xh */
public class C1365xh implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f5079a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f5080b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5081c;

    public C1365xh(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f5081c = baseBehavior;
        this.f5079a = coordinatorLayout;
        this.f5080b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5081c.mo115G(this.f5079a, this.f5080b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
