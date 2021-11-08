package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: tk */
public final class C1173tk {

    /* renamed from: a */
    public final ArrayList<C1175b> f4510a = new ArrayList<>();

    /* renamed from: b */
    public C1175b f4511b = null;

    /* renamed from: c */
    public ValueAnimator f4512c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f4513d = new C1174a();

    /* renamed from: tk$a */
    public class C1174a extends AnimatorListenerAdapter {
        public C1174a() {
        }

        public void onAnimationEnd(Animator animator) {
            C1173tk tkVar = C1173tk.this;
            if (tkVar.f4512c == animator) {
                tkVar.f4512c = null;
            }
        }
    }

    /* renamed from: tk$b */
    public static class C1175b {

        /* renamed from: a */
        public final int[] f4515a;

        /* renamed from: b */
        public final ValueAnimator f4516b;

        public C1175b(int[] iArr, ValueAnimator valueAnimator) {
            this.f4515a = iArr;
            this.f4516b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void mo4730a(int[] iArr, ValueAnimator valueAnimator) {
        C1175b bVar = new C1175b(iArr, valueAnimator);
        valueAnimator.addListener(this.f4513d);
        this.f4510a.add(bVar);
    }
}
