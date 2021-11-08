package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* renamed from: de */
public class C0374de extends C0627if {

    /* renamed from: de$a */
    public class C0375a extends C0828me {

        /* renamed from: a */
        public final /* synthetic */ View f1892a;

        public C0375a(C0374de deVar, View view) {
            this.f1892a = view;
        }

        /* renamed from: c */
        public void mo1759c(C0677je jeVar) {
            View view = this.f1892a;
            C0534gf gfVar = C0021af.f95a;
            gfVar.mo1600e(view, 1.0f);
            gfVar.mo1597a(this.f1892a);
            jeVar.mo3454v(this);
        }
    }

    /* renamed from: de$b */
    public static class C0376b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f1893a;

        /* renamed from: b */
        public boolean f1894b = false;

        public C0376b(View view) {
            this.f1893a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0021af.f95a.mo1600e(this.f1893a, 1.0f);
            if (this.f1894b) {
                this.f1893a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f1893a;
            Field field = C0813m8.f3234a;
            if ((Build.VERSION.SDK_INT >= 16 ? view.hasOverlappingRendering() : true) && this.f1893a.getLayerType() == 0) {
                this.f1894b = true;
                this.f1893a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C0374de(int i) {
        if ((i & -4) == 0) {
            this.f2692y = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: J */
    public Animator mo2646J(ViewGroup viewGroup, View view, C1059re reVar, C1059re reVar2) {
        C0021af.f95a.mo1599c(view);
        Float f = (Float) reVar.f3954a.get("android:fade:transitionAlpha");
        return mo2647K(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    /* renamed from: K */
    public final Animator mo2647K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0021af.f95a.mo1600e(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0021af.f96b, new float[]{f2});
        ofFloat.addListener(new C0376b(view));
        mo3439a(new C0375a(this, view));
        return ofFloat;
    }

    /* renamed from: g */
    public void mo1743g(C1059re reVar) {
        mo3263H(reVar);
        reVar.f3954a.put("android:fade:transitionAlpha", Float.valueOf(C0021af.m42a(reVar.f3955b)));
    }
}
