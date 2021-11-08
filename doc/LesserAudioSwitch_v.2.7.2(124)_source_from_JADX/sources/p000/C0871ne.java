package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ne */
public class C0871ne {

    /* renamed from: a */
    public static C0677je f3367a = new C0219be();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C0254c4<ViewGroup, ArrayList<C0677je>>>> f3368b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f3369c = new ArrayList<>();

    /* renamed from: ne$a */
    public static class C0872a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public C0677je f3370b;

        /* renamed from: c */
        public ViewGroup f3371c;

        /* renamed from: ne$a$a */
        public class C0873a extends C0828me {

            /* renamed from: a */
            public final /* synthetic */ C0254c4 f3372a;

            public C0873a(C0254c4 c4Var) {
                this.f3372a = c4Var;
            }

            /* renamed from: c */
            public void mo1759c(C0677je jeVar) {
                ((ArrayList) this.f3372a.get(C0872a.this.f3371c)).remove(jeVar);
                jeVar.mo3454v(this);
            }
        }

        public C0872a(C0677je jeVar, ViewGroup viewGroup) {
            this.f3370b = jeVar;
            this.f3371c = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0244  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01f4 A[EDGE_INSN: B:136:0x01f4->B:91:0x01f4 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01f9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f3371c
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f3371c
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = p000.C0871ne.f3369c
                android.view.ViewGroup r2 = r0.f3371c
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                c4 r1 = p000.C0871ne.m2595a()
                android.view.ViewGroup r3 = r0.f3371c
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f3371c
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                je r6 = r0.f3370b
                r3.add(r6)
                je r3 = r0.f3370b
                ne$a$a r6 = new ne$a$a
                r6.<init>(r1)
                r3.mo3439a(r6)
                je r1 = r0.f3370b
                android.view.ViewGroup r3 = r0.f3371c
                r6 = 0
                r1.mo3444h(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                je r3 = (p000.C0677je) r3
                android.view.ViewGroup r5 = r0.f3371c
                r3.mo3456x(r5)
                goto L_0x0060
            L_0x0072:
                je r1 = r0.f3370b
                android.view.ViewGroup r8 = r0.f3371c
                r1.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f2887l = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f2888m = r3
                se r3 = r1.f2883h
                se r5 = r1.f2884i
                c4 r7 = new c4
                c4<android.view.View, re> r9 = r3.f4183a
                r7.<init>((p000.C0663j4) r9)
                c4 r9 = new c4
                c4<android.view.View, re> r10 = r5.f4183a
                r9.<init>((p000.C0663j4) r10)
                r10 = 0
            L_0x009a:
                int[] r11 = r1.f2886k
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01f4
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01b4
                r12 = 2
                if (r11 == r12) goto L_0x0166
                r12 = 3
                if (r11 == r12) goto L_0x0112
                r12 = 4
                if (r11 == r12) goto L_0x00af
            L_0x00ac:
                r17 = r3
                goto L_0x010e
            L_0x00af:
                g4<android.view.View> r11 = r3.f4185c
                g4<android.view.View> r12 = r5.f4185c
                int r13 = r11.mo2930h()
                r14 = 0
            L_0x00b8:
                if (r14 >= r13) goto L_0x00ac
                java.lang.Object r15 = r11.mo2931i(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0104
                boolean r16 = r1.mo3451s(r15)
                if (r16 == 0) goto L_0x0104
                boolean r6 = r11.f2263b
                if (r6 == 0) goto L_0x00cf
                r11.mo2926d()
            L_0x00cf:
                long[] r6 = r11.f2264c
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.mo2927e(r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0106
                boolean r3 = r1.mo3451s(r2)
                if (r3 == 0) goto L_0x0106
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                re r3 = (p000.C1059re) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                re r6 = (p000.C1059re) r6
                if (r3 == 0) goto L_0x0106
                if (r6 == 0) goto L_0x0106
                java.util.ArrayList<re> r4 = r1.f2887l
                r4.add(r3)
                java.util.ArrayList<re> r3 = r1.f2888m
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0106
            L_0x0104:
                r17 = r3
            L_0x0106:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00b8
            L_0x010e:
                r2 = r17
                goto L_0x01ea
            L_0x0112:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.f4184b
                android.util.SparseArray<android.view.View> r4 = r5.f4184b
                int r6 = r3.size()
                r11 = 0
            L_0x011c:
                if (r11 >= r6) goto L_0x01ea
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0161
                boolean r13 = r1.mo3451s(r12)
                if (r13 == 0) goto L_0x0161
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0161
                boolean r14 = r1.mo3451s(r13)
                if (r14 == 0) goto L_0x0161
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                re r15 = (p000.C1059re) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                re r14 = (p000.C1059re) r14
                if (r15 == 0) goto L_0x0161
                if (r14 == 0) goto L_0x0161
                java.util.ArrayList<re> r0 = r1.f2887l
                r0.add(r15)
                java.util.ArrayList<re> r0 = r1.f2888m
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0161:
                int r11 = r11 + 1
                r0 = r18
                goto L_0x011c
            L_0x0166:
                r2 = r3
                c4<java.lang.String, android.view.View> r0 = r2.f4186d
                c4<java.lang.String, android.view.View> r3 = r5.f4186d
                int r4 = r0.f2827d
                r6 = 0
            L_0x016e:
                if (r6 >= r4) goto L_0x01ea
                java.lang.Object r11 = r0.mo3407k(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01b1
                boolean r12 = r1.mo3451s(r11)
                if (r12 == 0) goto L_0x01b1
                java.lang.Object r12 = r0.mo3402h(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01b1
                boolean r13 = r1.mo3451s(r12)
                if (r13 == 0) goto L_0x01b1
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                re r14 = (p000.C1059re) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                re r15 = (p000.C1059re) r15
                if (r14 == 0) goto L_0x01b1
                if (r15 == 0) goto L_0x01b1
                java.util.ArrayList<re> r13 = r1.f2887l
                r13.add(r14)
                java.util.ArrayList<re> r13 = r1.f2888m
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01b1:
                int r6 = r6 + 1
                goto L_0x016e
            L_0x01b4:
                r2 = r3
                int r0 = r7.f2827d
            L_0x01b7:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01ea
                java.lang.Object r3 = r7.mo3402h(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01b7
                boolean r4 = r1.mo3451s(r3)
                if (r4 == 0) goto L_0x01b7
                java.lang.Object r3 = r9.remove(r3)
                re r3 = (p000.C1059re) r3
                if (r3 == 0) goto L_0x01b7
                android.view.View r4 = r3.f3955b
                boolean r4 = r1.mo3451s(r4)
                if (r4 == 0) goto L_0x01b7
                java.lang.Object r4 = r7.mo3404i(r0)
                re r4 = (p000.C1059re) r4
                java.util.ArrayList<re> r6 = r1.f2887l
                r6.add(r4)
                java.util.ArrayList<re> r4 = r1.f2888m
                r4.add(r3)
                goto L_0x01b7
            L_0x01ea:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009a
            L_0x01f4:
                r0 = 0
            L_0x01f5:
                int r2 = r7.f2827d
                if (r0 >= r2) goto L_0x0215
                java.lang.Object r2 = r7.mo3407k(r0)
                re r2 = (p000.C1059re) r2
                android.view.View r3 = r2.f3955b
                boolean r3 = r1.mo3451s(r3)
                if (r3 == 0) goto L_0x0212
                java.util.ArrayList<re> r3 = r1.f2887l
                r3.add(r2)
                java.util.ArrayList<re> r2 = r1.f2888m
                r3 = 0
                r2.add(r3)
            L_0x0212:
                int r0 = r0 + 1
                goto L_0x01f5
            L_0x0215:
                r0 = 0
            L_0x0216:
                int r2 = r9.f2827d
                if (r0 >= r2) goto L_0x0236
                java.lang.Object r2 = r9.mo3407k(r0)
                re r2 = (p000.C1059re) r2
                android.view.View r3 = r2.f3955b
                boolean r3 = r1.mo3451s(r3)
                if (r3 == 0) goto L_0x0233
                java.util.ArrayList<re> r3 = r1.f2888m
                r3.add(r2)
                java.util.ArrayList<re> r2 = r1.f2887l
                r3 = 0
                r2.add(r3)
            L_0x0233:
                int r0 = r0 + 1
                goto L_0x0216
            L_0x0236:
                c4 r0 = p000.C0677je.m2131o()
                int r2 = r0.f2827d
                lf r3 = p000.C0021af.m43b(r8)
                r4 = 1
                int r2 = r2 - r4
            L_0x0242:
                if (r2 < 0) goto L_0x02a5
                java.lang.Object r4 = r0.mo3402h(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                r5 = 0
                if (r4 == 0) goto L_0x02a2
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                je$b r6 = (p000.C0677je.C0679b) r6
                if (r6 == 0) goto L_0x02a2
                android.view.View r7 = r6.f2897a
                if (r7 == 0) goto L_0x02a2
                lf r7 = r6.f2900d
                boolean r7 = r3.equals(r7)
                if (r7 == 0) goto L_0x02a2
                re r7 = r6.f2899c
                android.view.View r9 = r6.f2897a
                r10 = 1
                re r11 = r1.mo3450q(r9, r10)
                re r12 = r1.mo3449n(r9, r10)
                if (r11 != 0) goto L_0x027d
                if (r12 != 0) goto L_0x027d
                se r10 = r1.f2884i
                c4<android.view.View, re> r10 = r10.f4183a
                java.lang.Object r9 = r10.get(r9)
                r12 = r9
                re r12 = (p000.C1059re) r12
            L_0x027d:
                if (r11 != 0) goto L_0x0281
                if (r12 == 0) goto L_0x028b
            L_0x0281:
                je r6 = r6.f2901e
                boolean r6 = r6.mo3265r(r7, r12)
                if (r6 == 0) goto L_0x028b
                r6 = 1
                goto L_0x028c
            L_0x028b:
                r6 = 0
            L_0x028c:
                if (r6 == 0) goto L_0x02a2
                boolean r6 = r4.isRunning()
                if (r6 != 0) goto L_0x029f
                boolean r6 = r4.isStarted()
                if (r6 == 0) goto L_0x029b
                goto L_0x029f
            L_0x029b:
                r0.remove(r4)
                goto L_0x02a2
            L_0x029f:
                r4.cancel()
            L_0x02a2:
                int r2 = r2 + -1
                goto L_0x0242
            L_0x02a5:
                se r9 = r1.f2883h
                se r10 = r1.f2884i
                java.util.ArrayList<re> r11 = r1.f2887l
                java.util.ArrayList<re> r12 = r1.f2888m
                r7 = r1
                r7.mo3447l(r8, r9, r10, r11, r12)
                r1.mo3457y()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0871ne.C0872a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f3371c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3371c.removeOnAttachStateChangeListener(this);
            C0871ne.f3369c.remove(this.f3371c);
            ArrayList arrayList = C0871ne.m2595a().get(this.f3371c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0677je) it.next()).mo3456x(this.f3371c);
                }
            }
            this.f3370b.mo3445i(true);
        }
    }

    /* renamed from: a */
    public static C0254c4<ViewGroup, ArrayList<C0677je>> m2595a() {
        C0254c4<ViewGroup, ArrayList<C0677je>> c4Var;
        WeakReference weakReference = f3368b.get();
        if (weakReference != null && (c4Var = (C0254c4) weakReference.get()) != null) {
            return c4Var;
        }
        C0254c4<ViewGroup, ArrayList<C0677je>> c4Var2 = new C0254c4<>();
        f3368b.set(new WeakReference(c4Var2));
        return c4Var2;
    }
}
