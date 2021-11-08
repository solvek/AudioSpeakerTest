package p000;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ce */
public class C0266ce extends C0677je {

    /* renamed from: A */
    public static final Property<Drawable, PointF> f1362A = new C0267a(PointF.class, "boundsOrigin");

    /* renamed from: B */
    public static final Property<C0275i, PointF> f1363B = new C0268b(PointF.class, "topLeft");

    /* renamed from: C */
    public static final Property<C0275i, PointF> f1364C = new C0269c(PointF.class, "bottomRight");

    /* renamed from: D */
    public static final Property<View, PointF> f1365D = new C0270d(PointF.class, "bottomRight");

    /* renamed from: E */
    public static final Property<View, PointF> f1366E = new C0271e(PointF.class, "topLeft");

    /* renamed from: F */
    public static final Property<View, PointF> f1367F = new C0272f(PointF.class, "position");

    /* renamed from: G */
    public static C0572he f1368G = new C0572he();

    /* renamed from: z */
    public static final String[] f1369z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y */
    public int[] f1370y = new int[2];

    /* renamed from: ce$a */
    public static class C0267a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f1371a = new Rect();

        public C0267a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f1371a);
            Rect rect = this.f1371a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f1371a);
            this.f1371a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1371a);
        }
    }

    /* renamed from: ce$b */
    public static class C0268b extends Property<C0275i, PointF> {
        public C0268b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C0275i iVar = (C0275i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C0275i iVar = (C0275i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f1375a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f1376b = round;
            int i = iVar.f1380f + 1;
            iVar.f1380f = i;
            if (i == iVar.f1381g) {
                C0021af.m44c(iVar.f1379e, iVar.f1375a, round, iVar.f1377c, iVar.f1378d);
                iVar.f1380f = 0;
                iVar.f1381g = 0;
            }
        }
    }

    /* renamed from: ce$c */
    public static class C0269c extends Property<C0275i, PointF> {
        public C0269c(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C0275i iVar = (C0275i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C0275i iVar = (C0275i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f1377c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f1378d = round;
            int i = iVar.f1381g + 1;
            iVar.f1381g = i;
            if (iVar.f1380f == i) {
                C0021af.m44c(iVar.f1379e, iVar.f1375a, iVar.f1376b, iVar.f1377c, round);
                iVar.f1380f = 0;
                iVar.f1381g = 0;
            }
        }
    }

    /* renamed from: ce$d */
    public static class C0270d extends Property<View, PointF> {
        public C0270d(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C0021af.m44c(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: ce$e */
    public static class C0271e extends Property<View, PointF> {
        public C0271e(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C0021af.m44c(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: ce$f */
    public static class C0272f extends Property<View, PointF> {
        public C0272f(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0021af.m44c(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: ce$g */
    public class C0273g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0275i f1372a;
        private C0275i mViewBounds;

        public C0273g(C0266ce ceVar, C0275i iVar) {
            this.f1372a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: ce$h */
    public class C0274h extends C0828me {

        /* renamed from: a */
        public boolean f1373a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f1374b;

        public C0274h(C0266ce ceVar, ViewGroup viewGroup) {
            this.f1374b = viewGroup;
        }

        /* renamed from: b */
        public void mo1758b(C0677je jeVar) {
            C1309we.m3650b(this.f1374b, false);
            this.f1373a = true;
        }

        /* renamed from: c */
        public void mo1759c(C0677je jeVar) {
            if (!this.f1373a) {
                C1309we.m3650b(this.f1374b, false);
            }
            jeVar.mo3454v(this);
        }

        /* renamed from: d */
        public void mo1760d(C0677je jeVar) {
            C1309we.m3650b(this.f1374b, false);
        }

        /* renamed from: e */
        public void mo1761e(C0677je jeVar) {
            C1309we.m3650b(this.f1374b, true);
        }
    }

    /* renamed from: ce$i */
    public static class C0275i {

        /* renamed from: a */
        public int f1375a;

        /* renamed from: b */
        public int f1376b;

        /* renamed from: c */
        public int f1377c;

        /* renamed from: d */
        public int f1378d;

        /* renamed from: e */
        public View f1379e;

        /* renamed from: f */
        public int f1380f;

        /* renamed from: g */
        public int f1381g;

        public C0275i(View view) {
            this.f1379e = view;
        }
    }

    /* renamed from: H */
    public final void mo1741H(C1059re reVar) {
        View view = reVar.f3955b;
        if (C0813m8.m2486t(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            reVar.f3954a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            reVar.f3954a.put("android:changeBounds:parent", reVar.f3955b.getParent());
        }
    }

    /* renamed from: d */
    public void mo1742d(C1059re reVar) {
        mo1741H(reVar);
    }

    /* renamed from: g */
    public void mo1743g(C1059re reVar) {
        mo1741H(reVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo1744k(android.view.ViewGroup r19, p000.C1059re r20, p000.C1059re r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x012c
            if (r2 != 0) goto L_0x000c
            goto L_0x012c
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f3954a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f3954a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x012a
            if (r5 != 0) goto L_0x0024
            goto L_0x012a
        L_0x0024:
            android.view.View r4 = r2.f3955b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f3954a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f3954a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f3954a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f3954a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = 1
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x0126
            p000.C0021af.m44c(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00e8
            if (r13 != r15) goto L_0x00a9
            if (r14 != r3) goto L_0x00a9
            r0 = r18
            fe r1 = r0.f2896u
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo2789a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f1367F
            goto L_0x0108
        L_0x00a9:
            r0 = r18
            ce$i r3 = new ce$i
            r3.<init>(r4)
            fe r13 = r0.f2896u
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.mo2789a(r7, r9, r8, r10)
            android.util.Property<ce$i, android.graphics.PointF> r8 = f1363B
            android.animation.ObjectAnimator r7 = p000.C1107sc.m3168f(r3, r8, r7)
            fe r8 = r0.f2896u
            float r9 = (float) r11
            float r5 = (float) r5
            float r10 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.mo2789a(r9, r5, r10, r6)
            android.util.Property<ce$i, android.graphics.PointF> r6 = f1364C
            android.animation.ObjectAnimator r5 = p000.C1107sc.m3168f(r3, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            ce$g r1 = new ce$g
            r1.<init>(r0, r3)
            r6.addListener(r1)
            goto L_0x010c
        L_0x00e8:
            r0 = r18
            if (r7 != r8) goto L_0x00fc
            if (r9 == r10) goto L_0x00ef
            goto L_0x00fc
        L_0x00ef:
            fe r1 = r0.f2896u
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.mo2789a(r3, r5, r7, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f1365D
            goto L_0x0108
        L_0x00fc:
            fe r1 = r0.f2896u
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo2789a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f1366E
        L_0x0108:
            android.animation.ObjectAnimator r6 = p000.C1107sc.m3168f(r4, r3, r1)
        L_0x010c:
            android.view.ViewParent r1 = r4.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0125
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            p000.C1309we.m3650b(r1, r2)
            ce$h r2 = new ce$h
            r2.<init>(r0, r1)
            r0.mo3439a(r2)
        L_0x0125:
            return r6
        L_0x0126:
            r0 = r18
            r1 = 0
            return r1
        L_0x012a:
            r1 = 0
            return r1
        L_0x012c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0266ce.mo1744k(android.view.ViewGroup, re, re):android.animation.Animator");
    }

    /* renamed from: p */
    public String[] mo1745p() {
        return f1369z;
    }
}
