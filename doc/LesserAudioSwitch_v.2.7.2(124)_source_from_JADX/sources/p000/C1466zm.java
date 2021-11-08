package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: zm */
public class C1466zm extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1366xi f5328a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f5329b;

    public C1466zm(FabTransformationBehavior fabTransformationBehavior, C1366xi xiVar, Drawable drawable) {
        this.f5328a = xiVar;
        this.f5329b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f5328a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public void onAnimationStart(Animator animator) {
        this.f5328a.setCircularRevealOverlayDrawable(this.f5329b);
    }
}
