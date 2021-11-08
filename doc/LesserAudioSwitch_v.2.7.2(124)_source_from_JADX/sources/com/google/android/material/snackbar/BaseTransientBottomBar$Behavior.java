package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C1465zl f1618h = new C1465zl(this);

    /* renamed from: B */
    public boolean mo1863B(View view) {
        this.f1618h.getClass();
        return view instanceof C0284cm;
    }

    /* renamed from: j */
    public boolean mo117j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f1618h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0386dm.f1909c == null) {
                    C0386dm.f1909c = new C0386dm();
                }
                synchronized (C0386dm.f1909c.f1910a) {
                }
            }
        } else if (coordinatorLayout.mo677p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0386dm.f1909c == null) {
                C0386dm.f1909c = new C0386dm();
            }
            synchronized (C0386dm.f1909c.f1910a) {
            }
        }
        return super.mo117j(coordinatorLayout, view, motionEvent);
    }
}
