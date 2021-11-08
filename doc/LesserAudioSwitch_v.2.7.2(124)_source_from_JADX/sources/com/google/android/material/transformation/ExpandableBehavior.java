package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.C0088c<View> {

    /* renamed from: a */
    public int f1715a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C0334a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ View f1716b;

        /* renamed from: c */
        public final /* synthetic */ int f1717c;

        /* renamed from: d */
        public final /* synthetic */ C0426ek f1718d;

        public C0334a(View view, int i, C0426ek ekVar) {
            this.f1716b = view;
            this.f1717c = i;
            this.f1718d = ekVar;
        }

        public boolean onPreDraw() {
            this.f1716b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f1715a == this.f1717c) {
                C0426ek ekVar = this.f1718d;
                expandableBehavior.mo2514C((View) ekVar, this.f1716b, ekVar.mo2213a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B */
    public final boolean mo2513B(boolean z) {
        if (!z) {
            return this.f1715a == 1;
        }
        int i = this.f1715a;
        return i == 0 || i == 2;
    }

    /* renamed from: C */
    public abstract boolean mo2514C(View view, View view2, boolean z, boolean z2);

    /* renamed from: g */
    public boolean mo704g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C0426ek ekVar = (C0426ek) view2;
        if (!mo2513B(ekVar.mo2213a())) {
            return false;
        }
        this.f1715a = ekVar.mo2213a() ? 1 : 2;
        return mo2514C((View) ekVar, view, ekVar.mo2213a(), true);
    }

    /* renamed from: k */
    public boolean mo707k(CoordinatorLayout coordinatorLayout, View view, int i) {
        C0426ek ekVar;
        if (!C0813m8.m2486t(view)) {
            List<View> d = coordinatorLayout.mo651d(view);
            int size = d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    ekVar = null;
                    break;
                }
                View view2 = d.get(i2);
                if (mo701d(coordinatorLayout, view, view2)) {
                    ekVar = (C0426ek) view2;
                    break;
                }
                i2++;
            }
            if (ekVar != null && mo2513B(ekVar.mo2213a())) {
                int i3 = ekVar.mo2213a() ? 1 : 2;
                this.f1715a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new C0334a(view, i3, ekVar));
            }
        }
        return false;
    }
}
