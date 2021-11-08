package p000;

import android.animation.Animator;
import android.view.animation.Animation;

/* renamed from: z9 */
public class C1448z9 {

    /* renamed from: a */
    public final Animation f5276a;

    /* renamed from: b */
    public final Animator f5277b;

    public C1448z9(Animator animator) {
        this.f5276a = null;
        this.f5277b = animator;
    }

    public C1448z9(Animation animation) {
        this.f5276a = animation;
        this.f5277b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}
