package p000;

import java.util.ArrayList;
import p000.C1236v4;

/* renamed from: s4 */
public class C1098s4 extends C1441z4 {

    /* renamed from: k0 */
    public int f4157k0 = 0;

    /* renamed from: l0 */
    public ArrayList<C0210b5> f4158l0 = new ArrayList<>(4);

    /* renamed from: m0 */
    public boolean f4159m0 = true;

    /* renamed from: a */
    public void mo4423a(C0955p4 p4Var) {
        C1196u4[] u4VarArr;
        boolean z;
        C1196u4 u4Var;
        C1043r4 r4Var;
        int i;
        int i2;
        C1236v4.C1237a aVar = C1236v4.C1237a.MATCH_CONSTRAINT;
        C1236v4.C1237a aVar2 = C1236v4.C1237a.WRAP_CONTENT;
        C1196u4[] u4VarArr2 = this.f4703A;
        u4VarArr2[0] = this.f4755s;
        u4VarArr2[2] = this.f4756t;
        u4VarArr2[1] = this.f4757u;
        u4VarArr2[3] = this.f4758v;
        int i3 = 0;
        while (true) {
            u4VarArr = this.f4703A;
            if (i3 >= u4VarArr.length) {
                break;
            }
            u4VarArr[i3].f4589i = p4Var.mo3961l(u4VarArr[i3]);
            i3++;
        }
        int i4 = this.f4157k0;
        if (i4 >= 0 && i4 < 4) {
            C1196u4 u4Var2 = u4VarArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.f5260j0) {
                    z = false;
                    break;
                }
                C1236v4 v4Var = this.f5259i0[i5];
                if ((this.f4159m0 || v4Var.mo4424b()) && ((((i = this.f4157k0) == 0 || i == 1) && v4Var.mo4820i() == aVar) || (((i2 = this.f4157k0) == 2 || i2 == 3) && v4Var.mo4824m() == aVar))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            int i6 = this.f4157k0;
            if (i6 == 0 || i6 == 1 ? this.f4706D.mo4820i() == aVar2 : this.f4706D.mo4824m() == aVar2) {
                z = false;
            }
            for (int i7 = 0; i7 < this.f5260j0; i7++) {
                C1236v4 v4Var2 = this.f5259i0[i7];
                if (this.f4159m0 || v4Var2.mo4424b()) {
                    C1043r4 l = p4Var.mo3961l(v4Var2.f4703A[this.f4157k0]);
                    C1196u4[] u4VarArr3 = v4Var2.f4703A;
                    int i8 = this.f4157k0;
                    u4VarArr3[i8].f4589i = l;
                    if (i8 == 0 || i8 == 2) {
                        C1043r4 r4Var2 = u4Var2.f4589i;
                        C0804m4 m = p4Var.mo3962m();
                        C1043r4 n = p4Var.mo3963n();
                        n.f3906c = 0;
                        m.mo3661e(r4Var2, l, n, 0);
                        if (z) {
                            m.f3215c.mo3589h(p4Var.mo3960k(1, (String) null), (float) ((int) (m.f3215c.mo3584c(n) * -1.0f)));
                        }
                        p4Var.mo3952c(m);
                    } else {
                        C1043r4 r4Var3 = u4Var2.f4589i;
                        C0804m4 m2 = p4Var.mo3962m();
                        C1043r4 n2 = p4Var.mo3963n();
                        n2.f3906c = 0;
                        m2.mo3660d(r4Var3, l, n2, 0);
                        if (z) {
                            m2.f3215c.mo3589h(p4Var.mo3960k(1, (String) null), (float) ((int) (m2.f3215c.mo3584c(n2) * -1.0f)));
                        }
                        p4Var.mo3952c(m2);
                    }
                }
            }
            int i9 = this.f4157k0;
            if (i9 == 0) {
                p4Var.mo3953d(this.f4757u.f4589i, this.f4755s.f4589i, 0, 6);
                if (!z) {
                    r4Var = this.f4755s.f4589i;
                    u4Var = this.f4706D.f4757u;
                } else {
                    return;
                }
            } else if (i9 == 1) {
                p4Var.mo3953d(this.f4755s.f4589i, this.f4757u.f4589i, 0, 6);
                if (!z) {
                    r4Var = this.f4755s.f4589i;
                    u4Var = this.f4706D.f4755s;
                } else {
                    return;
                }
            } else if (i9 == 2) {
                p4Var.mo3953d(this.f4758v.f4589i, this.f4756t.f4589i, 0, 6);
                if (!z) {
                    r4Var = this.f4756t.f4589i;
                    u4Var = this.f4706D.f4758v;
                } else {
                    return;
                }
            } else if (i9 == 3) {
                p4Var.mo3953d(this.f4756t.f4589i, this.f4758v.f4589i, 0, 6);
                if (!z) {
                    r4Var = this.f4756t.f4589i;
                    u4Var = this.f4706D.f4756t;
                } else {
                    return;
                }
            } else {
                return;
            }
            p4Var.mo3953d(r4Var, u4Var.f4589i, 0, 5);
        }
    }

    /* renamed from: b */
    public boolean mo4424b() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4425c(int r8) {
        /*
            r7 = this;
            v4 r8 = r7.f4706D
            if (r8 != 0) goto L_0x0005
            return
        L_0x0005:
            w4 r8 = (p000.C1292w4) r8
            r0 = 2
            boolean r8 = r8.mo4960I(r0)
            if (r8 != 0) goto L_0x000f
            return
        L_0x000f:
            int r8 = r7.f4157k0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L_0x0027
            if (r8 == r2) goto L_0x0024
            if (r8 == r0) goto L_0x0021
            if (r8 == r1) goto L_0x001c
            return
        L_0x001c:
            u4 r3 = r7.f4758v
        L_0x001e:
            b5 r3 = r3.f4581a
            goto L_0x002a
        L_0x0021:
            u4 r3 = r7.f4756t
            goto L_0x001e
        L_0x0024:
            u4 r3 = r7.f4757u
            goto L_0x001e
        L_0x0027:
            u4 r3 = r7.f4755s
            goto L_0x001e
        L_0x002a:
            r4 = 5
            r3.f1243h = r4
            r4 = 0
            r5 = 0
            if (r8 == 0) goto L_0x003e
            if (r8 != r2) goto L_0x0034
            goto L_0x003e
        L_0x0034:
            u4 r8 = r7.f4755s
            b5 r8 = r8.f4581a
            r8.mo1580j(r5, r4)
            u4 r8 = r7.f4757u
            goto L_0x0047
        L_0x003e:
            u4 r8 = r7.f4756t
            b5 r8 = r8.f4581a
            r8.mo1580j(r5, r4)
            u4 r8 = r7.f4758v
        L_0x0047:
            b5 r8 = r8.f4581a
            r8.mo1580j(r5, r4)
            java.util.ArrayList<b5> r8 = r7.f4158l0
            r8.clear()
            r8 = 0
        L_0x0052:
            int r4 = r7.f5260j0
            if (r8 >= r4) goto L_0x008e
            v4[] r4 = r7.f5259i0
            r4 = r4[r8]
            boolean r6 = r7.f4159m0
            if (r6 != 0) goto L_0x0065
            boolean r6 = r4.mo4424b()
            if (r6 != 0) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            int r6 = r7.f4157k0
            if (r6 == 0) goto L_0x007c
            if (r6 == r2) goto L_0x0079
            if (r6 == r0) goto L_0x0076
            if (r6 == r1) goto L_0x0071
            r4 = r5
            goto L_0x007f
        L_0x0071:
            u4 r4 = r4.f4758v
        L_0x0073:
            b5 r4 = r4.f4581a
            goto L_0x007f
        L_0x0076:
            u4 r4 = r4.f4756t
            goto L_0x0073
        L_0x0079:
            u4 r4 = r4.f4757u
            goto L_0x0073
        L_0x007c:
            u4 r4 = r4.f4755s
            goto L_0x0073
        L_0x007f:
            if (r4 == 0) goto L_0x008b
            java.util.ArrayList<b5> r6 = r7.f4158l0
            r6.add(r4)
            java.util.HashSet<d5> r4 = r4.f1878a
            r4.add(r3)
        L_0x008b:
            int r8 = r8 + 1
            goto L_0x0052
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1098s4.mo4425c(int):void");
    }

    /* renamed from: s */
    public void mo4426s() {
        super.mo4426s();
        this.f4158l0.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4427u() {
        /*
            r11 = this;
            int r0 = r11.f4157k0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0020
            if (r0 == r4) goto L_0x001a
            if (r0 == r3) goto L_0x0015
            if (r0 == r2) goto L_0x0012
            return
        L_0x0012:
            u4 r0 = r11.f4758v
            goto L_0x001c
        L_0x0015:
            u4 r0 = r11.f4756t
        L_0x0017:
            b5 r0 = r0.f4581a
            goto L_0x0023
        L_0x001a:
            u4 r0 = r11.f4757u
        L_0x001c:
            b5 r0 = r0.f4581a
            r1 = 0
            goto L_0x0023
        L_0x0020:
            u4 r0 = r11.f4755s
            goto L_0x0017
        L_0x0023:
            java.util.ArrayList<b5> r5 = r11.f4158l0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L_0x002b:
            if (r7 >= r5) goto L_0x0055
            java.util.ArrayList<b5> r8 = r11.f4158l0
            java.lang.Object r8 = r8.get(r7)
            b5 r8 = (p000.C0210b5) r8
            int r9 = r8.f1879b
            if (r9 == r4) goto L_0x003a
            return
        L_0x003a:
            int r9 = r11.f4157k0
            if (r9 == 0) goto L_0x0048
            if (r9 != r3) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            float r9 = r8.f1242g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0052
            goto L_0x004e
        L_0x0048:
            float r9 = r8.f1242g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0052
        L_0x004e:
            b5 r1 = r8.f1241f
            r6 = r1
            r1 = r9
        L_0x0052:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0055:
            r0.f1241f = r6
            r0.f1242g = r1
            r0.mo2636a()
            int r0 = r11.f4157k0
            if (r0 == 0) goto L_0x0070
            if (r0 == r4) goto L_0x006d
            if (r0 == r3) goto L_0x006a
            if (r0 == r2) goto L_0x0067
            return
        L_0x0067:
            u4 r0 = r11.f4756t
            goto L_0x0072
        L_0x006a:
            u4 r0 = r11.f4758v
            goto L_0x0072
        L_0x006d:
            u4 r0 = r11.f4755s
            goto L_0x0072
        L_0x0070:
            u4 r0 = r11.f4757u
        L_0x0072:
            b5 r0 = r0.f4581a
            r0.mo1580j(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1098s4.mo4427u():void");
    }
}
