package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.C0568hd;
import p000.C1347x8;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: G */
    public boolean f862G = false;

    /* renamed from: H */
    public int f863H = -1;

    /* renamed from: I */
    public int[] f864I;

    /* renamed from: J */
    public View[] f865J;

    /* renamed from: K */
    public final SparseIntArray f866K = new SparseIntArray();

    /* renamed from: L */
    public final SparseIntArray f867L = new SparseIntArray();

    /* renamed from: M */
    public C0138c f868M = new C0136a();

    /* renamed from: N */
    public final Rect f869N = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0136a extends C0138c {
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0137b extends RecyclerView.C0165n {

        /* renamed from: e */
        public int f870e = -1;

        /* renamed from: f */
        public int f871f = 0;

        public C0137b(int i, int i2) {
            super(i, i2);
        }

        public C0137b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0137b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0137b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0138c {

        /* renamed from: a */
        public final SparseIntArray f872a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f873b = new SparseIntArray();

        /* renamed from: a */
        public int mo1041a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        mo1015O1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo1015O1(RecyclerView.C0160m.m716R(context, attributeSet, i, i2).f1047b);
    }

    /* renamed from: A */
    public int mo1003A(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        if (this.f880r == 1) {
            return this.f863H;
        }
        if (xVar.mo1394b() < 1) {
            return 0;
        }
        return mo1008J1(sVar, xVar, xVar.mo1394b() - 1) + 1;
    }

    /* renamed from: C1 */
    public void mo1004C1(boolean z) {
        if (!z) {
            mo1056d((String) null);
            if (this.f886x) {
                this.f886x = false;
                mo1315J0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: G1 */
    public final void mo1005G1(int i) {
        int i2;
        int[] iArr = this.f864I;
        int i3 = this.f863H;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f864I = iArr;
    }

    /* renamed from: H1 */
    public final void mo1006H1() {
        View[] viewArr = this.f865J;
        if (viewArr == null || viewArr.length != this.f863H) {
            this.f865J = new View[this.f863H];
        }
    }

    /* renamed from: I1 */
    public int mo1007I1(int i, int i2) {
        if (this.f880r != 1 || !mo1081t1()) {
            int[] iArr = this.f864I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f864I;
        int i3 = this.f863H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: J1 */
    public final int mo1008J1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, int i) {
        if (!xVar.f1091g) {
            return this.f868M.mo1041a(i, this.f863H);
        }
        int c = sVar.mo1372c(i);
        if (c == -1) {
            return 0;
        }
        return this.f868M.mo1041a(c, this.f863H);
    }

    /* renamed from: K0 */
    public int mo1009K0(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        mo1017P1();
        mo1006H1();
        if (this.f880r == 1) {
            return 0;
        }
        return mo1042A1(i, sVar, xVar);
    }

    /* renamed from: K1 */
    public final int mo1010K1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, int i) {
        if (!xVar.f1091g) {
            C0138c cVar = this.f868M;
            int i2 = this.f863H;
            cVar.getClass();
            return i % i2;
        }
        int i3 = this.f867L.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c = sVar.mo1372c(i);
        if (c == -1) {
            return 0;
        }
        C0138c cVar2 = this.f868M;
        int i4 = this.f863H;
        cVar2.getClass();
        return c % i4;
    }

    /* renamed from: L1 */
    public final int mo1011L1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, int i) {
        if (xVar.f1091g) {
            int i2 = this.f866K.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            if (sVar.mo1372c(i) == -1) {
                return 1;
            }
        }
        this.f868M.getClass();
        return 1;
    }

    /* renamed from: M0 */
    public int mo1012M0(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        mo1017P1();
        mo1006H1();
        if (this.f880r == 0) {
            return 0;
        }
        return mo1042A1(i, sVar, xVar);
    }

    /* renamed from: M1 */
    public final void mo1013M1(View view, int i, boolean z) {
        int i2;
        int i3;
        C0137b bVar = (C0137b) view.getLayoutParams();
        Rect rect = bVar.f1051b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int I1 = mo1007I1(bVar.f870e, bVar.f871f);
        if (this.f880r == 1) {
            i2 = RecyclerView.C0160m.m719z(I1, i, i5, bVar.width, false);
            i3 = RecyclerView.C0160m.m719z(this.f882t.mo3697l(), this.f1041o, i4, bVar.height, true);
        } else {
            int z2 = RecyclerView.C0160m.m719z(I1, i, i4, bVar.height, false);
            int z3 = RecyclerView.C0160m.m719z(this.f882t.mo3697l(), this.f1040n, i5, bVar.width, true);
            i3 = z2;
            i2 = z3;
        }
        mo1014N1(view, i2, i3, z);
    }

    /* renamed from: N1 */
    public final void mo1014N1(View view, int i, int i2, boolean z) {
        RecyclerView.C0165n nVar = (RecyclerView.C0165n) view.getLayoutParams();
        if (z ? mo1330U0(view, i, i2, nVar) : mo1327S0(view, i, i2, nVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: O1 */
    public void mo1015O1(int i) {
        if (i != this.f863H) {
            this.f862G = true;
            if (i >= 1) {
                this.f863H = i;
                this.f868M.f872a.clear();
                mo1315J0();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: P0 */
    public void mo1016P0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f864I == null) {
            super.mo1016P0(rect, i, i2);
        }
        int O = mo1321O() + mo1319N();
        int M = mo1318M() + mo1323P();
        if (this.f880r == 1) {
            i4 = RecyclerView.C0160m.m718h(i2, rect.height() + M, mo1316K());
            int[] iArr = this.f864I;
            i3 = RecyclerView.C0160m.m718h(i, iArr[iArr.length - 1] + O, mo1317L());
        } else {
            i3 = RecyclerView.C0160m.m718h(i, rect.width() + O, mo1317L());
            int[] iArr2 = this.f864I;
            i4 = RecyclerView.C0160m.m718h(i2, iArr2[iArr2.length - 1] + M, mo1316K());
        }
        this.f1028b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: P1 */
    public final void mo1017P1() {
        int i;
        int i2;
        if (this.f880r == 1) {
            i2 = this.f1042p - mo1321O();
            i = mo1319N();
        } else {
            i2 = this.f1043q - mo1318M();
            i = mo1323P();
        }
        mo1005G1(i2 - i);
    }

    /* renamed from: S */
    public int mo1018S(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        if (this.f880r == 0) {
            return this.f863H;
        }
        if (xVar.mo1394b() < 1) {
            return 0;
        }
        return mo1008J1(sVar, xVar, xVar.mo1394b() - 1) + 1;
    }

    /* renamed from: X0 */
    public boolean mo1019X0() {
        return this.f875B == null && !this.f862G;
    }

    /* renamed from: Z0 */
    public void mo1020Z0(RecyclerView.C0179x xVar, LinearLayoutManager.C0141c cVar, RecyclerView.C0160m.C0163c cVar2) {
        int i = this.f863H;
        for (int i2 = 0; i2 < this.f863H && cVar.mo1094b(xVar) && i > 0; i2++) {
            ((C0568hd.C0570b) cVar2).mo3077a(cVar.f901d, Math.max(0, cVar.f904g));
            this.f868M.getClass();
            i--;
            cVar.f901d += cVar.f902e;
        }
    }

    /* renamed from: g */
    public boolean mo1021g(RecyclerView.C0165n nVar) {
        return nVar instanceof C0137b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1022h0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0171s r25, androidx.recyclerview.widget.RecyclerView.C0179x r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.mo1349s(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0137b) r5
            int r6 = r5.f870e
            int r5 = r5.f871f
            int r5 = r5 + r6
            android.view.View r7 = super.mo1022h0(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.mo1057d1(r7)
            r8 = 1
            if (r7 != r8) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f885w
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.mo1354y()
            int r7 = r7 - r8
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r22.mo1354y()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f880r
            if (r13 != r8) goto L_0x0051
            boolean r13 = r22.mo1081t1()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo1008J1(r1, r2, r7)
            r10 = r7
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0128
            r17 = r11
            int r11 = r0.mo1008J1(r1, r2, r10)
            android.view.View r1 = r0.mo1352x(r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x0128
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0083
            if (r11 == r14) goto L_0x0083
            if (r4 == 0) goto L_0x007a
            goto L_0x0128
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r9
            r9 = 0
            goto L_0x0118
        L_0x0083:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.C0137b) r11
            int r2 = r11.f870e
            r18 = r3
            int r3 = r11.f871f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009b
            if (r2 != r6) goto L_0x009b
            if (r3 != r5) goto L_0x009b
            return r1
        L_0x009b:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a3
            if (r4 == 0) goto L_0x00ab
        L_0x00a3:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ae
            if (r7 != 0) goto L_0x00ae
        L_0x00ab:
            r21 = r7
            goto L_0x00cc
        L_0x00ae:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d1
            if (r7 <= r9) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            if (r7 != r9) goto L_0x00ea
            if (r2 <= r15) goto L_0x00c9
            r7 = 1
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            if (r13 != r7) goto L_0x00ea
        L_0x00cc:
            r19 = r9
            r7 = 1
            r9 = 0
            goto L_0x00ee
        L_0x00d1:
            if (r4 != 0) goto L_0x00ea
            r19 = r9
            r9 = 0
            boolean r20 = r0.mo1333Y(r1, r9)
            if (r20 == 0) goto L_0x00ed
            if (r7 <= r12) goto L_0x00df
            goto L_0x00e8
        L_0x00df:
            if (r7 != r12) goto L_0x00ed
            if (r2 <= r8) goto L_0x00e5
            r7 = 1
            goto L_0x00e6
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            if (r13 != r7) goto L_0x00ed
        L_0x00e8:
            r7 = 1
            goto L_0x00ee
        L_0x00ea:
            r19 = r9
            r9 = 0
        L_0x00ed:
            r7 = 0
        L_0x00ee:
            if (r7 == 0) goto L_0x0118
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x0109
            int r4 = r11.f870e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r19 = r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x011a
        L_0x0109:
            int r7 = r11.f870e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r7 = r1
            goto L_0x011a
        L_0x0118:
            r7 = r21
        L_0x011a:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r9 = r19
            goto L_0x005e
        L_0x0128:
            r21 = r7
            if (r4 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r4 = r21
        L_0x012f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1022h0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    /* renamed from: l */
    public int mo1023l(RecyclerView.C0179x xVar) {
        return mo1054b1(xVar);
    }

    /* renamed from: l0 */
    public void mo1024l0(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, View view, C1347x8 x8Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0137b)) {
            mo1344k0(view, x8Var);
            return;
        }
        C0137b bVar = (C0137b) layoutParams;
        int J1 = mo1008J1(sVar, xVar, bVar.mo1360a());
        if (this.f880r == 0) {
            i4 = bVar.f870e;
            i3 = bVar.f871f;
            i = 1;
            z2 = false;
            z = false;
            i2 = J1;
        } else {
            i3 = 1;
            i2 = bVar.f870e;
            i = bVar.f871f;
            z2 = false;
            z = false;
            i4 = J1;
        }
        x8Var.mo5064j(C1347x8.C1350c.m3799a(i4, i3, i2, i, z2, z));
    }

    /* renamed from: m */
    public int mo1025m(RecyclerView.C0179x xVar) {
        return mo1055c1(xVar);
    }

    /* renamed from: n0 */
    public void mo1026n0(RecyclerView recyclerView, int i, int i2) {
        this.f868M.f872a.clear();
        this.f868M.f873b.clear();
    }

    /* renamed from: o */
    public int mo1027o(RecyclerView.C0179x xVar) {
        return mo1054b1(xVar);
    }

    /* renamed from: o0 */
    public void mo1028o0(RecyclerView recyclerView) {
        this.f868M.f872a.clear();
        this.f868M.f873b.clear();
    }

    /* renamed from: o1 */
    public View mo1029o1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, int i, int i2, int i3) {
        mo1059e1();
        int k = this.f882t.mo3696k();
        int g = this.f882t.mo3692g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View x = mo1352x(i);
            int Q = mo1324Q(x);
            if (Q >= 0 && Q < i3 && mo1010K1(sVar, xVar, Q) == 0) {
                if (((RecyclerView.C0165n) x.getLayoutParams()).mo1362c()) {
                    if (view2 == null) {
                        view2 = x;
                    }
                } else if (this.f882t.mo3690e(x) < g && this.f882t.mo3687b(x) >= k) {
                    return x;
                } else {
                    if (view == null) {
                        view = x;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: p */
    public int mo1030p(RecyclerView.C0179x xVar) {
        return mo1055c1(xVar);
    }

    /* renamed from: p0 */
    public void mo1031p0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f868M.f872a.clear();
        this.f868M.f873b.clear();
    }

    /* renamed from: q0 */
    public void mo1032q0(RecyclerView recyclerView, int i, int i2) {
        this.f868M.f872a.clear();
        this.f868M.f873b.clear();
    }

    /* renamed from: s0 */
    public void mo1033s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f868M.f872a.clear();
        this.f868M.f873b.clear();
    }

    /* renamed from: t0 */
    public void mo1034t0(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        if (xVar.f1091g) {
            int y = mo1354y();
            for (int i = 0; i < y; i++) {
                C0137b bVar = (C0137b) mo1352x(i).getLayoutParams();
                int a = bVar.mo1360a();
                this.f866K.put(a, bVar.f871f);
                this.f867L.put(a, bVar.f870e);
            }
        }
        super.mo1034t0(sVar, xVar);
        this.f866K.clear();
        this.f867L.clear();
    }

    /* renamed from: u */
    public RecyclerView.C0165n mo1035u() {
        return this.f880r == 0 ? new C0137b(-2, -1) : new C0137b(-1, -2);
    }

    /* renamed from: u0 */
    public void mo1036u0(RecyclerView.C0179x xVar) {
        this.f875B = null;
        this.f888z = -1;
        this.f874A = Integer.MIN_VALUE;
        this.f876C.mo1091d();
        this.f862G = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x025b  */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1037u1(androidx.recyclerview.widget.RecyclerView.C0171s r19, androidx.recyclerview.widget.RecyclerView.C0179x r20, androidx.recyclerview.widget.LinearLayoutManager.C0141c r21, androidx.recyclerview.widget.LinearLayoutManager.C0140b r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            od r3 = r6.f882t
            int r3 = r3.mo3695j()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r18.mo1354y()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.f864I
            int r11 = r6.f863H
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r18.mo1017P1()
        L_0x002c:
            int r11 = r2.f902e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.f863H
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f901d
            int r12 = r6.mo1010K1(r0, r1, r12)
            int r13 = r2.f901d
            int r13 = r6.mo1011L1(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.f863H
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.mo1094b(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f901d
            int r15 = r6.mo1011L1(r0, r1, r14)
            int r4 = r6.f863H
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.mo1095c(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.f865J
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f863H
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f895b = r8
            return
        L_0x00a2:
            if (r11 == 0) goto L_0x00aa
            r14 = r13
            r12 = 0
            r15 = 0
            r16 = 1
            goto L_0x00b0
        L_0x00aa:
            int r12 = r13 + -1
            r14 = -1
            r15 = 0
            r16 = -1
        L_0x00b0:
            if (r12 == r14) goto L_0x00cf
            android.view.View[] r4 = r6.f865J
            r4 = r4[r12]
            android.view.ViewGroup$LayoutParams r17 = r4.getLayoutParams()
            r8 = r17
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.C0137b) r8
            int r4 = r6.mo1324Q(r4)
            int r4 = r6.mo1011L1(r0, r1, r4)
            r8.f871f = r4
            r8.f870e = r15
            int r15 = r15 + r4
            int r12 = r12 + r16
            r8 = 1
            goto L_0x00b0
        L_0x00cf:
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x00d2:
            if (r1 >= r13) goto L_0x012c
            android.view.View[] r8 = r6.f865J
            r8 = r8[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$a0> r12 = r2.f908k
            if (r12 != 0) goto L_0x00e6
            if (r11 == 0) goto L_0x00e2
            r6.mo1336b(r8)
            goto L_0x00f2
        L_0x00e2:
            r6.mo1338c(r8, r5, r5)
            goto L_0x00f2
        L_0x00e6:
            if (r11 == 0) goto L_0x00ee
            r12 = -1
            r14 = 1
            r6.mo1338c(r8, r12, r14)
            goto L_0x00f2
        L_0x00ee:
            r14 = 1
            r6.mo1338c(r8, r5, r14)
        L_0x00f2:
            android.graphics.Rect r12 = r6.f869N
            androidx.recyclerview.widget.RecyclerView r14 = r6.f1028b
            if (r14 != 0) goto L_0x00fc
            r12.set(r5, r5, r5, r5)
            goto L_0x0103
        L_0x00fc:
            android.graphics.Rect r14 = r14.mo1110L(r8)
            r12.set(r14)
        L_0x0103:
            r6.mo1013M1(r8, r3, r5)
            od r12 = r6.f882t
            int r12 = r12.mo3688c(r8)
            if (r12 <= r4) goto L_0x010f
            r4 = r12
        L_0x010f:
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r12 = (androidx.recyclerview.widget.GridLayoutManager.C0137b) r12
            r14 = 1065353216(0x3f800000, float:1.0)
            od r15 = r6.f882t
            int r8 = r15.mo3689d(r8)
            float r8 = (float) r8
            float r8 = r8 * r14
            int r12 = r12.f871f
            float r12 = (float) r12
            float r8 = r8 / r12
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0129
            r0 = r8
        L_0x0129:
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x012c:
            if (r9 == 0) goto L_0x0158
            int r1 = r6.f863H
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r10)
            r6.mo1005G1(r0)
            r0 = 0
            r4 = 0
        L_0x0140:
            if (r0 >= r13) goto L_0x0158
            android.view.View[] r1 = r6.f865J
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r6.mo1013M1(r1, r3, r8)
            od r3 = r6.f882t
            int r1 = r3.mo3688c(r1)
            if (r1 <= r4) goto L_0x0155
            r4 = r1
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x0140
        L_0x0158:
            r0 = 0
        L_0x0159:
            if (r0 >= r13) goto L_0x01ba
            android.view.View[] r1 = r6.f865J
            r1 = r1[r0]
            od r3 = r6.f882t
            int r3 = r3.mo3688c(r1)
            if (r3 == r4) goto L_0x01b4
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.C0137b) r3
            android.graphics.Rect r8 = r3.f1051b
            int r9 = r8.top
            int r10 = r8.bottom
            int r9 = r9 + r10
            int r10 = r3.topMargin
            int r9 = r9 + r10
            int r10 = r3.bottomMargin
            int r9 = r9 + r10
            int r10 = r8.left
            int r8 = r8.right
            int r10 = r10 + r8
            int r8 = r3.leftMargin
            int r10 = r10 + r8
            int r8 = r3.rightMargin
            int r10 = r10 + r8
            int r8 = r3.f870e
            int r11 = r3.f871f
            int r8 = r6.mo1007I1(r8, r11)
            int r11 = r6.f880r
            r12 = 1
            if (r11 != r12) goto L_0x01a1
            int r3 = r3.width
            r11 = 1073741824(0x40000000, float:2.0)
            int r3 = androidx.recyclerview.widget.RecyclerView.C0160m.m719z(r8, r11, r10, r3, r5)
            int r8 = r4 - r9
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            goto L_0x01b0
        L_0x01a1:
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = r4 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r3 = r3.height
            int r8 = androidx.recyclerview.widget.RecyclerView.C0160m.m719z(r8, r11, r9, r3, r5)
            r3 = r10
        L_0x01b0:
            r6.mo1014N1(r1, r3, r8, r12)
            goto L_0x01b7
        L_0x01b4:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 1
        L_0x01b7:
            int r0 = r0 + 1
            goto L_0x0159
        L_0x01ba:
            r12 = 1
            r7.f894a = r4
            int r0 = r6.f880r
            if (r0 != r12) goto L_0x01d3
            int r0 = r2.f903f
            r1 = -1
            if (r0 != r1) goto L_0x01cb
            int r0 = r2.f899b
            int r1 = r0 - r4
            goto L_0x01cf
        L_0x01cb:
            int r1 = r2.f899b
            int r0 = r4 + r1
        L_0x01cf:
            r2 = r1
            r1 = 0
            r3 = 0
            goto L_0x01e5
        L_0x01d3:
            r1 = -1
            int r0 = r2.f903f
            if (r0 != r1) goto L_0x01dd
            int r0 = r2.f899b
            int r1 = r0 - r4
            goto L_0x01e1
        L_0x01dd:
            int r1 = r2.f899b
            int r0 = r4 + r1
        L_0x01e1:
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
        L_0x01e5:
            r8 = 0
        L_0x01e6:
            if (r8 >= r13) goto L_0x026f
            android.view.View[] r4 = r6.f865J
            r9 = r4[r8]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.C0137b) r10
            int r4 = r6.f880r
            r5 = 1
            if (r4 != r5) goto L_0x022c
            boolean r1 = r18.mo1081t1()
            if (r1 == 0) goto L_0x0215
            int r1 = r18.mo1319N()
            int[] r3 = r6.f864I
            int r4 = r6.f863H
            int r5 = r10.f870e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            od r3 = r6.f882t
            int r3 = r3.mo3689d(r9)
            int r3 = r1 - r3
            goto L_0x023e
        L_0x0215:
            int r1 = r18.mo1319N()
            int[] r3 = r6.f864I
            int r4 = r10.f870e
            r3 = r3[r4]
            int r1 = r1 + r3
            od r3 = r6.f882t
            int r3 = r3.mo3689d(r9)
            int r3 = r3 + r1
            r11 = r0
            r15 = r1
            r14 = r2
            r12 = r3
            goto L_0x0242
        L_0x022c:
            int r0 = r18.mo1323P()
            int[] r2 = r6.f864I
            int r4 = r10.f870e
            r2 = r2[r4]
            int r2 = r2 + r0
            od r0 = r6.f882t
            int r0 = r0.mo3689d(r9)
            int r0 = r0 + r2
        L_0x023e:
            r11 = r0
            r12 = r1
            r14 = r2
            r15 = r3
        L_0x0242:
            r0 = r18
            r1 = r9
            r2 = r15
            r3 = r14
            r4 = r12
            r5 = r11
            r0.mo1334Z(r1, r2, r3, r4, r5)
            boolean r0 = r10.mo1362c()
            if (r0 != 0) goto L_0x025b
            boolean r0 = r10.mo1361b()
            if (r0 == 0) goto L_0x0259
            goto L_0x025b
        L_0x0259:
            r0 = 1
            goto L_0x025e
        L_0x025b:
            r0 = 1
            r7.f896c = r0
        L_0x025e:
            boolean r1 = r7.f897d
            boolean r2 = r9.hasFocusable()
            r1 = r1 | r2
            r7.f897d = r1
            int r8 = r8 + 1
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            goto L_0x01e6
        L_0x026f:
            android.view.View[] r0 = r6.f865J
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1037u1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: v */
    public RecyclerView.C0165n mo1038v(Context context, AttributeSet attributeSet) {
        return new C0137b(context, attributeSet);
    }

    /* renamed from: v1 */
    public void mo1039v1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, LinearLayoutManager.C0139a aVar, int i) {
        mo1017P1();
        if (xVar.mo1394b() > 0 && !xVar.f1091g) {
            boolean z = i == 1;
            int K1 = mo1010K1(sVar, xVar, aVar.f890b);
            if (z) {
                while (K1 > 0) {
                    int i2 = aVar.f890b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f890b = i3;
                    K1 = mo1010K1(sVar, xVar, i3);
                }
            } else {
                int b = xVar.mo1394b() - 1;
                int i4 = aVar.f890b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int K12 = mo1010K1(sVar, xVar, i5);
                    if (K12 <= K1) {
                        break;
                    }
                    i4 = i5;
                    K1 = K12;
                }
                aVar.f890b = i4;
            }
        }
        mo1006H1();
    }

    /* renamed from: w */
    public RecyclerView.C0165n mo1040w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0137b((ViewGroup.MarginLayoutParams) layoutParams) : new C0137b(layoutParams);
    }
}
