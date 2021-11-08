package p000;

import android.view.View;

/* renamed from: yk */
public final class C1421yk implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        C0813m8.m2455D(view);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
