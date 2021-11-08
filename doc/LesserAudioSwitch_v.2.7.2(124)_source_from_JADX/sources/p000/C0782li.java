package p000;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: li */
public class C0782li implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f3173a;

    public C0782li(BottomSheetBehavior bottomSheetBehavior) {
        this.f3173a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1067rl rlVar = this.f3173a.f1498h;
        if (rlVar != null) {
            rlVar.mo4301q(floatValue);
        }
    }
}
