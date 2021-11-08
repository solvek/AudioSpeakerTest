package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: r8 */
public final class C1049r8 {

    /* renamed from: a */
    public WeakReference<View> f3933a;

    /* renamed from: b */
    public int f3934b = -1;

    /* renamed from: r8$a */
    public class C1050a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1102s8 f3935a;

        /* renamed from: b */
        public final /* synthetic */ View f3936b;

        public C1050a(C1049r8 r8Var, C1102s8 s8Var, View view) {
            this.f3935a = s8Var;
            this.f3936b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3935a.mo3389c(this.f3936b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3935a.mo2606a(this.f3936b);
        }

        public void onAnimationStart(Animator animator) {
            this.f3935a.mo3388b(this.f3936b);
        }
    }

    /* renamed from: r8$b */
    public class C1051b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C1202u8 f3937a;

        /* renamed from: b */
        public final /* synthetic */ View f3938b;

        public C1051b(C1049r8 r8Var, C1202u8 u8Var, View view) {
            this.f3937a = u8Var;
            this.f3938b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) C0356d0.this.f1845d.getParent()).invalidate();
        }
    }

    /* renamed from: r8$c */
    public static class C1052c implements C1102s8 {

        /* renamed from: a */
        public C1049r8 f3939a;

        /* renamed from: b */
        public boolean f3940b;

        public C1052c(C1049r8 r8Var) {
            this.f3939a = r8Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: s8} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2606a(android.view.View r4) {
            /*
                r3 = this;
                r8 r0 = r3.f3939a
                int r0 = r0.f3934b
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                r8 r0 = r3.f3939a
                r0.f3934b = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f3940b
                if (r0 != 0) goto L_0x0033
            L_0x0019:
                r8 r0 = r3.f3939a
                r0.getClass()
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p000.C1102s8
                if (r1 == 0) goto L_0x002b
                r2 = r0
                s8 r2 = (p000.C1102s8) r2
            L_0x002b:
                if (r2 == 0) goto L_0x0030
                r2.mo2606a(r4)
            L_0x0030:
                r4 = 1
                r3.f3940b = r4
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1049r8.C1052c.mo2606a(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: s8} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3388b(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f3940b = r0
                r8 r0 = r3.f3939a
                int r0 = r0.f3934b
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                r8 r0 = r3.f3939a
                r0.getClass()
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p000.C1102s8
                if (r2 == 0) goto L_0x0021
                r1 = r0
                s8 r1 = (p000.C1102s8) r1
            L_0x0021:
                if (r1 == 0) goto L_0x0026
                r1.mo3388b(r4)
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1049r8.C1052c.mo3388b(android.view.View):void");
        }

        /* renamed from: c */
        public void mo3389c(View view) {
            Object tag = view.getTag(2113929216);
            C1102s8 s8Var = tag instanceof C1102s8 ? (C1102s8) tag : null;
            if (s8Var != null) {
                s8Var.mo3389c(view);
            }
        }
    }

    public C1049r8(View view) {
        this.f3933a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C1049r8 mo4211a(float f) {
        View view = (View) this.f3933a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo4212b() {
        View view = (View) this.f3933a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public C1049r8 mo4213c(long j) {
        View view = (View) this.f3933a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: d */
    public C1049r8 mo4214d(C1102s8 s8Var) {
        View view = (View) this.f3933a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, s8Var);
                s8Var = new C1052c(this);
            }
            mo4215e(view, s8Var);
        }
        return this;
    }

    /* renamed from: e */
    public final void mo4215e(View view, C1102s8 s8Var) {
        if (s8Var != null) {
            view.animate().setListener(new C1050a(this, s8Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: f */
    public C1049r8 mo4216f(C1202u8 u8Var) {
        View view = (View) this.f3933a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C1051b bVar = null;
            if (u8Var != null) {
                bVar = new C1051b(this, u8Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: g */
    public C1049r8 mo4217g(float f) {
        View view = (View) this.f3933a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
