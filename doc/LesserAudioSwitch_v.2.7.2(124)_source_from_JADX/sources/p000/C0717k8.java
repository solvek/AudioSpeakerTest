package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: k8 */
public final class C0717k8 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f2984b;

    /* renamed from: c */
    public ViewTreeObserver f2985c;

    /* renamed from: d */
    public final Runnable f2986d;

    public C0717k8(View view, Runnable runnable) {
        this.f2984b = view;
        this.f2985c = view.getViewTreeObserver();
        this.f2986d = runnable;
    }

    /* renamed from: a */
    public static C0717k8 m2248a(View view, Runnable runnable) {
        if (view != null) {
            C0717k8 k8Var = new C0717k8(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(k8Var);
            view.addOnAttachStateChangeListener(k8Var);
            return k8Var;
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void mo3533b() {
        (this.f2985c.isAlive() ? this.f2985c : this.f2984b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2984b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo3533b();
        this.f2986d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2985c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo3533b();
    }
}
