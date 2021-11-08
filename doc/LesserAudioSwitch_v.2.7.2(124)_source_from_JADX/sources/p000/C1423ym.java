package p000;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: ym */
public class C1423ym implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f5204a;

    public C1423ym(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f5204a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5204a.invalidate();
    }
}
