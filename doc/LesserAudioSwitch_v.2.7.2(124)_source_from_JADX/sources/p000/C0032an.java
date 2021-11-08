package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import p000.C1366xi;

/* renamed from: an */
public class C0032an extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1366xi f121a;

    public C0032an(FabTransformationBehavior fabTransformationBehavior, C1366xi xiVar) {
        this.f121a = xiVar;
    }

    public void onAnimationEnd(Animator animator) {
        C1366xi.C1371e revealInfo = this.f121a.getRevealInfo();
        revealInfo.f5088c = Float.MAX_VALUE;
        this.f121a.setRevealInfo(revealInfo);
    }
}
