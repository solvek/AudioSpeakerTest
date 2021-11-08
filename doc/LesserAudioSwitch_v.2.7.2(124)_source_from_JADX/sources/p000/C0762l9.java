package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l9 */
public abstract class C0762l9 extends C1444z7 {

    /* renamed from: n */
    public static final Rect f3113n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C0818m9<C1347x8> f3114o = new C0763a();

    /* renamed from: p */
    public static final C0865n9<C0713k4<C1347x8>, C1347x8> f3115p = new C0764b();

    /* renamed from: d */
    public final Rect f3116d = new Rect();

    /* renamed from: e */
    public final Rect f3117e = new Rect();

    /* renamed from: f */
    public final Rect f3118f = new Rect();

    /* renamed from: g */
    public final int[] f3119g = new int[2];

    /* renamed from: h */
    public final AccessibilityManager f3120h;

    /* renamed from: i */
    public final View f3121i;

    /* renamed from: j */
    public C0765c f3122j;

    /* renamed from: k */
    public int f3123k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f3124l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f3125m = Integer.MIN_VALUE;

    /* renamed from: l9$a */
    public static class C0763a implements C0818m9<C1347x8> {
        /* renamed from: a */
        public void mo3613a(Object obj, Rect rect) {
            ((C1347x8) obj).f5038a.getBoundsInParent(rect);
        }
    }

    /* renamed from: l9$b */
    public static class C0764b implements C0865n9<C0713k4<C1347x8>, C1347x8> {
    }

    /* renamed from: l9$c */
    public class C0765c extends C1402y8 {
        public C0765c() {
        }

        /* renamed from: a */
        public C1347x8 mo3614a(int i) {
            return new C1347x8(AccessibilityNodeInfo.obtain(C0762l9.this.mo3609q(i).f5038a));
        }

        /* renamed from: b */
        public C1347x8 mo3615b(int i) {
            int i2 = i == 2 ? C0762l9.this.f3123k : C0762l9.this.f3124l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new C1347x8(AccessibilityNodeInfo.obtain(C0762l9.this.mo3609q(i2).f5038a));
        }

        /* renamed from: c */
        public boolean mo3616c(int i, int i2, Bundle bundle) {
            int i3;
            C0762l9 l9Var = C0762l9.this;
            boolean z = false;
            if (i == -1) {
                View view = l9Var.f3121i;
                Field field = C0813m8.f3234a;
                if (Build.VERSION.SDK_INT >= 16) {
                    z = view.performAccessibilityAction(i2, bundle);
                }
            } else if (i2 == 1) {
                return l9Var.mo3610v(i);
            } else {
                if (i2 == 2) {
                    return l9Var.mo3605k(i);
                }
                if (i2 != 64) {
                    return i2 != 128 ? l9Var.mo2144r(i, i2, bundle) : l9Var.mo3604j(i);
                }
                if (l9Var.f3120h.isEnabled() && l9Var.f3120h.isTouchExplorationEnabled() && (i3 = l9Var.f3123k) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        l9Var.mo3604j(i3);
                    }
                    l9Var.f3123k = i;
                    l9Var.f3121i.invalidate();
                    l9Var.mo3611w(i, 32768);
                    z = true;
                }
            }
            return z;
        }
    }

    public C0762l9(View view) {
        if (view != null) {
            this.f3121i = view;
            this.f3120h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0813m8.m2477k(view) == 0) {
                C0813m8.m2462K(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: b */
    public C1402y8 mo3603b(View view) {
        if (this.f3122j == null) {
            this.f3122j = new C0765c();
        }
        return this.f3122j;
    }

    /* renamed from: c */
    public void mo816c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5273a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo817d(View view, C1347x8 x8Var) {
        this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
        mo2145s(x8Var);
    }

    /* renamed from: j */
    public final boolean mo3604j(int i) {
        if (this.f3123k != i) {
            return false;
        }
        this.f3123k = Integer.MIN_VALUE;
        this.f3121i.invalidate();
        mo3611w(i, 65536);
        return true;
    }

    /* renamed from: k */
    public final boolean mo3605k(int i) {
        if (this.f3124l != i) {
            return false;
        }
        this.f3124l = Integer.MIN_VALUE;
        mo2147u(i, false);
        mo3611w(i, 8);
        return true;
    }

    /* renamed from: l */
    public final C1347x8 mo3606l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C1347x8 x8Var = new C1347x8(obtain);
        obtain.setEnabled(true);
        x8Var.f5038a.setFocusable(true);
        x8Var.f5038a.setClassName("android.view.View");
        Rect rect = f3113n;
        x8Var.f5038a.setBoundsInParent(rect);
        x8Var.f5038a.setBoundsInScreen(rect);
        View view = this.f3121i;
        x8Var.f5039b = -1;
        x8Var.f5038a.setParent(view);
        mo2146t(i, x8Var);
        if (x8Var.mo5060g() == null && x8Var.mo5057e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        x8Var.f5038a.getBoundsInParent(this.f3117e);
        if (!this.f3117e.equals(rect)) {
            int actions = x8Var.f5038a.getActions();
            if ((actions & 64) == 0) {
                int i2 = 128;
                if ((actions & 128) == 0) {
                    x8Var.f5038a.setPackageName(this.f3121i.getContext().getPackageName());
                    View view2 = this.f3121i;
                    x8Var.f5040c = i;
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 16) {
                        x8Var.f5038a.setSource(view2, i);
                    }
                    boolean z = false;
                    if (this.f3123k == i) {
                        if (i3 >= 16) {
                            x8Var.f5038a.setAccessibilityFocused(true);
                        }
                        accessibilityNodeInfo = x8Var.f5038a;
                    } else {
                        if (i3 >= 16) {
                            x8Var.f5038a.setAccessibilityFocused(false);
                        }
                        accessibilityNodeInfo = x8Var.f5038a;
                        i2 = 64;
                    }
                    accessibilityNodeInfo.addAction(i2);
                    boolean z2 = this.f3124l == i;
                    if (z2) {
                        x8Var.f5038a.addAction(2);
                    } else if (x8Var.f5038a.isFocusable()) {
                        x8Var.f5038a.addAction(1);
                    }
                    x8Var.f5038a.setFocused(z2);
                    this.f3121i.getLocationOnScreen(this.f3119g);
                    x8Var.f5038a.getBoundsInScreen(this.f3116d);
                    if (this.f3116d.equals(rect)) {
                        x8Var.f5038a.getBoundsInParent(this.f3116d);
                        if (x8Var.f5039b != -1) {
                            C1347x8 x8Var2 = new C1347x8(AccessibilityNodeInfo.obtain());
                            for (int i4 = x8Var.f5039b; i4 != -1; i4 = x8Var2.f5039b) {
                                View view3 = this.f3121i;
                                x8Var2.f5039b = -1;
                                if (Build.VERSION.SDK_INT >= 16) {
                                    x8Var2.f5038a.setParent(view3, -1);
                                }
                                x8Var2.f5038a.setBoundsInParent(f3113n);
                                mo2146t(i4, x8Var2);
                                x8Var2.f5038a.getBoundsInParent(this.f3117e);
                                Rect rect2 = this.f3116d;
                                Rect rect3 = this.f3117e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            x8Var2.f5038a.recycle();
                        }
                        this.f3116d.offset(this.f3119g[0] - this.f3121i.getScrollX(), this.f3119g[1] - this.f3121i.getScrollY());
                    }
                    if (this.f3121i.getLocalVisibleRect(this.f3118f)) {
                        this.f3118f.offset(this.f3119g[0] - this.f3121i.getScrollX(), this.f3119g[1] - this.f3121i.getScrollY());
                        if (this.f3116d.intersect(this.f3118f)) {
                            x8Var.f5038a.setBoundsInScreen(this.f3116d);
                            Rect rect4 = this.f3116d;
                            if (rect4 != null && !rect4.isEmpty() && this.f3121i.getWindowVisibility() == 0) {
                                View view4 = this.f3121i;
                                while (true) {
                                    ViewParent parent = view4.getParent();
                                    if (parent instanceof View) {
                                        view4 = (View) parent;
                                        if (view4.getAlpha() > 0.0f) {
                                            if (view4.getVisibility() != 0) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z = true;
                                    }
                                }
                            }
                            if (z && Build.VERSION.SDK_INT >= 16) {
                                x8Var.f5038a.setVisibleToUser(true);
                            }
                        }
                    }
                    return x8Var;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: m */
    public final boolean mo3607m(MotionEvent motionEvent) {
        int i;
        if (this.f3120h.isEnabled() && this.f3120h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int n = mo2142n(motionEvent.getX(), motionEvent.getY());
                int i2 = this.f3125m;
                if (i2 != n) {
                    this.f3125m = n;
                    mo3611w(n, 128);
                    mo3611w(i2, 256);
                }
                if (n != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || (i = this.f3125m) == Integer.MIN_VALUE) {
                return false;
            } else {
                if (i != Integer.MIN_VALUE) {
                    this.f3125m = Integer.MIN_VALUE;
                    mo3611w(Integer.MIN_VALUE, 128);
                    mo3611w(i, 256);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public abstract int mo2142n(float f, float f2);

    /* renamed from: o */
    public abstract void mo2143o(List<Integer> list);

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x013e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0139  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3608p(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mo2143o(r3)
            k4 r4 = new k4
            r5 = 10
            r4.<init>(r5)
            r5 = 0
            r6 = 0
        L_0x0017:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0027
            x8 r7 = r0.mo3606l(r6)
            r4.mo3521g(r6, r7)
            int r6 = r6 + 1
            goto L_0x0017
        L_0x0027:
            int r3 = r0.f3124l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x002f
            r3 = 0
            goto L_0x0035
        L_0x002f:
            java.lang.Object r3 = r4.mo3518d(r3)
            x8 r3 = (p000.C1347x8) r3
        L_0x0035:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0141
            if (r1 == r8) goto L_0x0141
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0055
            if (r1 == r12) goto L_0x0055
            if (r1 == r11) goto L_0x0055
            if (r1 != r8) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0055:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f3124l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L_0x006a
            x8 r2 = r0.mo3609q(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f5038a
            r2.getBoundsInParent(r14)
            goto L_0x0097
        L_0x006a:
            if (r2 == 0) goto L_0x0070
            r14.set(r2)
            goto L_0x0097
        L_0x0070:
            android.view.View r2 = r0.f3121i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x0094
            if (r1 == r12) goto L_0x0090
            if (r1 == r11) goto L_0x008c
            if (r1 != r8) goto L_0x0086
            r14.set(r5, r9, r15, r9)
            goto L_0x0097
        L_0x0086:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x008c:
            r14.set(r9, r5, r9, r2)
            goto L_0x0097
        L_0x0090:
            r14.set(r5, r2, r15, r2)
            goto L_0x0097
        L_0x0094:
            r14.set(r15, r5, r15, r2)
        L_0x0097:
            n9<k4<x8>, x8> r2 = f3115p
            m9<x8> r15 = f3114o
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14)
            if (r1 == r13) goto L_0x00c5
            if (r1 == r12) goto L_0x00bc
            if (r1 == r11) goto L_0x00b5
            if (r1 != r8) goto L_0x00af
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00c1
        L_0x00af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x00b5:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00ca
        L_0x00bc:
            int r6 = r14.height()
            int r6 = r6 + r10
        L_0x00c1:
            r7.offset(r5, r6)
            goto L_0x00cd
        L_0x00c5:
            int r6 = r14.width()
            int r6 = r6 + r10
        L_0x00ca:
            r7.offset(r6, r5)
        L_0x00cd:
            l9$b r2 = (p000.C0762l9.C0764b) r2
            r2.getClass()
            int r2 = r4.mo3523i()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = 0
            r16 = 0
        L_0x00de:
            if (r8 >= r2) goto L_0x01b4
            boolean r11 = r4.f2976b
            if (r11 == 0) goto L_0x00e7
            r4.mo3516c()
        L_0x00e7:
            java.lang.Object[] r11 = r4.f2978d
            r11 = r11[r8]
            x8 r11 = (p000.C1347x8) r11
            if (r11 != r3) goto L_0x00f0
            goto L_0x013e
        L_0x00f0:
            r12 = r15
            l9$a r12 = (p000.C0762l9.C0763a) r12
            r12.mo3613a(r11, r6)
            boolean r12 = p000.C1344x5.m3726H(r14, r6, r1)
            if (r12 != 0) goto L_0x00fd
            goto L_0x0136
        L_0x00fd:
            boolean r12 = p000.C1344x5.m3726H(r14, r7, r1)
            if (r12 != 0) goto L_0x0104
            goto L_0x0134
        L_0x0104:
            boolean r12 = p000.C1344x5.m3745a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x010b
            goto L_0x0134
        L_0x010b:
            boolean r12 = p000.C1344x5.m3745a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0112
            goto L_0x0136
        L_0x0112:
            int r12 = p000.C1344x5.m3728J(r1, r14, r6)
            int r13 = p000.C1344x5.m3729K(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = p000.C1344x5.m3728J(r1, r14, r7)
            int r17 = p000.C1344x5.m3729K(r1, r14, r7)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x0136
        L_0x0134:
            r12 = 1
            goto L_0x0137
        L_0x0136:
            r12 = 0
        L_0x0137:
            if (r12 == 0) goto L_0x013e
            r7.set(r6)
            r16 = r11
        L_0x013e:
            int r8 = r8 + 1
            goto L_0x00de
        L_0x0141:
            android.view.View r2 = r0.f3121i
            int r2 = p000.C0813m8.m2478l(r2)
            if (r2 != r10) goto L_0x014b
            r2 = 1
            goto L_0x014c
        L_0x014b:
            r2 = 0
        L_0x014c:
            n9<k4<x8>, x8> r6 = f3115p
            m9<x8> r7 = f3114o
            l9$b r6 = (p000.C0762l9.C0764b) r6
            r6.getClass()
            int r6 = r4.mo3523i()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = 0
        L_0x015f:
            if (r12 >= r6) goto L_0x0174
            boolean r13 = r4.f2976b
            if (r13 == 0) goto L_0x0168
            r4.mo3516c()
        L_0x0168:
            java.lang.Object[] r13 = r4.f2978d
            r13 = r13[r12]
            x8 r13 = (p000.C1347x8) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x015f
        L_0x0174:
            o9 r6 = new o9
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x019e
            if (r1 != r8) goto L_0x0196
            int r1 = r11.size()
            if (r3 != 0) goto L_0x0188
            r2 = -1
            goto L_0x018c
        L_0x0188:
            int r2 = r11.lastIndexOf(r3)
        L_0x018c:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x0194
            java.lang.Object r6 = r11.get(r2)
            goto L_0x01b0
        L_0x0194:
            r6 = 0
            goto L_0x01b0
        L_0x0196:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x019e:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01a5
            goto L_0x01a9
        L_0x01a5:
            int r1 = r11.indexOf(r3)
        L_0x01a9:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x0194
            java.lang.Object r6 = r11.get(r1)
        L_0x01b0:
            r16 = r6
            x8 r16 = (p000.C1347x8) r16
        L_0x01b4:
            r1 = r16
            if (r1 != 0) goto L_0x01bb
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01d5
        L_0x01bb:
            boolean r2 = r4.f2976b
            if (r2 == 0) goto L_0x01c2
            r4.mo3516c()
        L_0x01c2:
            int r2 = r4.f2979e
            if (r5 >= r2) goto L_0x01d1
            java.lang.Object[] r2 = r4.f2978d
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01ce
            r9 = r5
            goto L_0x01d1
        L_0x01ce:
            int r5 = r5 + 1
            goto L_0x01c2
        L_0x01d1:
            int r7 = r4.mo3520f(r9)
        L_0x01d5:
            boolean r1 = r0.mo3610v(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0762l9.mo3608p(int, android.graphics.Rect):boolean");
    }

    /* renamed from: q */
    public C1347x8 mo3609q(int i) {
        if (i != -1) {
            return mo3606l(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f3121i);
        C1347x8 x8Var = new C1347x8(obtain);
        View view = this.f3121i;
        Field field = C0813m8.f3234a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo2143o(arrayList);
        if (x8Var.f5038a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = this.f3121i;
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                if (Build.VERSION.SDK_INT >= 16) {
                    x8Var.f5038a.addChild(view2, intValue);
                }
            }
            return x8Var;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: r */
    public abstract boolean mo2144r(int i, int i2, Bundle bundle);

    /* renamed from: s */
    public void mo2145s(C1347x8 x8Var) {
    }

    /* renamed from: t */
    public abstract void mo2146t(int i, C1347x8 x8Var);

    /* renamed from: u */
    public void mo2147u(int i, boolean z) {
    }

    /* renamed from: v */
    public final boolean mo3610v(int i) {
        int i2;
        if ((!this.f3121i.isFocused() && !this.f3121i.requestFocus()) || (i2 = this.f3124l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo3605k(i2);
        }
        this.f3124l = i;
        mo2147u(i, true);
        mo3611w(i, 8);
        return true;
    }

    /* renamed from: w */
    public final boolean mo3611w(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i == Integer.MIN_VALUE || !this.f3120h.isEnabled() || (parent = this.f3121i.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            C1347x8 q = mo3609q(i);
            accessibilityEvent.getText().add(q.mo5060g());
            accessibilityEvent.setContentDescription(q.mo5057e());
            accessibilityEvent.setScrollable(q.f5038a.isScrollable());
            accessibilityEvent.setPassword(q.f5038a.isPassword());
            accessibilityEvent.setEnabled(q.f5038a.isEnabled());
            accessibilityEvent.setChecked(q.f5038a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(q.f5038a.getClassName());
                View view = this.f3121i;
                if (Build.VERSION.SDK_INT >= 16) {
                    accessibilityEvent.setSource(view, i);
                }
                accessibilityEvent.setPackageName(this.f3121i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            this.f3121i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f3121i, accessibilityEvent);
    }

    /* renamed from: x */
    public final void mo3612x(int i) {
        int i2 = this.f3125m;
        if (i2 != i) {
            this.f3125m = i;
            mo3611w(i, 128);
            mo3611w(i2, 256);
        }
    }
}
