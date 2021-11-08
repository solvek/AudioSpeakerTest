package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.C0962p9;
import p000.C1347x8;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0088c<V> {

    /* renamed from: a */
    public C0962p9 f1449a;

    /* renamed from: b */
    public boolean f1450b;

    /* renamed from: c */
    public int f1451c = 2;

    /* renamed from: d */
    public float f1452d = 0.5f;

    /* renamed from: e */
    public float f1453e = 0.0f;

    /* renamed from: f */
    public float f1454f = 0.5f;

    /* renamed from: g */
    public final C0962p9.C0965c f1455g = new C0294a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C0294a extends C0962p9.C0965c {

        /* renamed from: a */
        public int f1456a;

        /* renamed from: b */
        public int f1457b = -1;

        public C0294a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f1456a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1864a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p000.C0813m8.m2478l(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f1451c
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f1456a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f1456a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f1456a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f1456a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f1456a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0294a.mo1864a(android.view.View, int, int):int");
        }

        /* renamed from: b */
        public int mo1865b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: c */
        public int mo1866c(View view) {
            return view.getWidth();
        }

        /* renamed from: e */
        public void mo1867e(View view, int i) {
            this.f1457b = i;
            this.f1456a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: f */
        public void mo1868f(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        /* renamed from: g */
        public void mo1869g(View view, int i, int i2, int i3, int i4) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f1453e) + ((float) this.f1456a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f1454f) + ((float) this.f1456a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m1177C(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
            if (java.lang.Math.abs(r7.getLeft() - r6.f1456a) >= java.lang.Math.round(((float) r7.getWidth()) * r6.f1458c.f1452d)) goto L_0x002c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1870h(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r9 = -1
                r6.f1457b = r9
                int r9 = r7.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003e
                int r3 = p000.C0813m8.m2478l(r7)
                if (r3 != r2) goto L_0x0016
                r3 = 1
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f1451c
                r5 = 2
                if (r4 != r5) goto L_0x001f
                goto L_0x002c
            L_0x001f:
                if (r4 != 0) goto L_0x0030
                if (r3 == 0) goto L_0x0028
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x0028:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x002e
            L_0x002c:
                r8 = 1
                goto L_0x005b
            L_0x002e:
                r8 = 0
                goto L_0x005b
            L_0x0030:
                if (r4 != r2) goto L_0x002e
                if (r3 == 0) goto L_0x0039
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x002e
                goto L_0x003d
            L_0x0039:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x002e
            L_0x003d:
                goto L_0x002c
            L_0x003e:
                int r8 = r7.getLeft()
                int r0 = r6.f1456a
                int r8 = r8 - r0
                int r0 = r7.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f1452d
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L_0x002e
                goto L_0x002c
            L_0x005b:
                if (r8 == 0) goto L_0x006a
                int r8 = r7.getLeft()
                int r0 = r6.f1456a
                if (r8 >= r0) goto L_0x0067
                int r0 = r0 - r9
                goto L_0x0068
            L_0x0067:
                int r0 = r0 + r9
            L_0x0068:
                r1 = 1
                goto L_0x006c
            L_0x006a:
                int r0 = r6.f1456a
            L_0x006c:
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                p9 r8 = r8.f1449a
                int r9 = r7.getTop()
                boolean r8 = r8.mo3996t(r0, r9)
                if (r8 == 0) goto L_0x0085
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.<init>(r7, r1)
                p000.C0813m8.m2491y(r7, r8)
                goto L_0x008c
            L_0x0085:
                if (r1 == 0) goto L_0x008c
                com.google.android.material.behavior.SwipeDismissBehavior r7 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r7.getClass()
            L_0x008c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0294a.mo1870h(android.view.View, float, float):void");
        }

        /* renamed from: i */
        public boolean mo1871i(View view, int i) {
            int i2 = this.f1457b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo1863B(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C0295b implements Runnable {

        /* renamed from: b */
        public final View f1459b;

        /* renamed from: c */
        public final boolean f1460c;

        public C0295b(View view, boolean z) {
            this.f1459b = view;
            this.f1460c = z;
        }

        public void run() {
            C0962p9 p9Var = SwipeDismissBehavior.this.f1449a;
            if (p9Var != null && p9Var.mo3985i(true)) {
                C0813m8.m2491y(this.f1459b, this);
            } else if (this.f1460c) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    /* renamed from: C */
    public static float m1177C(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: A */
    public boolean mo112A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0962p9 p9Var = this.f1449a;
        if (p9Var == null) {
            return false;
        }
        p9Var.mo3990n(motionEvent);
        return true;
    }

    /* renamed from: B */
    public boolean mo1863B(View view) {
        return true;
    }

    /* renamed from: j */
    public boolean mo117j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1450b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo677p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1450b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1450b = false;
        }
        if (!z) {
            return false;
        }
        if (this.f1449a == null) {
            this.f1449a = new C0962p9(coordinatorLayout.getContext(), coordinatorLayout, this.f1455g);
        }
        return this.f1449a.mo3997u(motionEvent);
    }

    /* renamed from: k */
    public boolean mo707k(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0813m8.m2477k(v) != 0) {
            return false;
        }
        C0813m8.m2462K(v, 1);
        C0813m8.m2452A(v, 1048576);
        if (!mo1863B(v)) {
            return false;
        }
        C0813m8.m2454C(v, C1347x8.C1348a.f5046j, (CharSequence) null, new C0424ei(this));
        return false;
    }
}
