package p000;

import p000.C1196u4;
import p000.C1236v4;

/* renamed from: y4 */
public class C1398y4 extends C1236v4 {

    /* renamed from: i0 */
    public float f5157i0 = -1.0f;

    /* renamed from: j0 */
    public int f5158j0 = -1;

    /* renamed from: k0 */
    public int f5159k0 = -1;

    /* renamed from: l0 */
    public C1196u4 f5160l0 = this.f4756t;

    /* renamed from: m0 */
    public int f5161m0;

    public C1398y4() {
        this.f5161m0 = 0;
        this.f4704B.clear();
        this.f4704B.add(this.f5160l0);
        int length = this.f4703A.length;
        for (int i = 0; i < length; i++) {
            this.f4703A[i] = this.f5160l0;
        }
    }

    /* renamed from: E */
    public void mo4814E(C0955p4 p4Var) {
        if (this.f4706D != null) {
            int o = p4Var.mo3964o(this.f5160l0);
            if (this.f5161m0 == 1) {
                this.f4711I = o;
                this.f4712J = 0;
                mo4831w(this.f4706D.mo4819h());
                mo4813C(0);
                return;
            }
            this.f4711I = 0;
            this.f4712J = o;
            mo4813C(this.f4706D.mo4825n());
            mo4831w(0);
        }
    }

    /* renamed from: F */
    public void mo5183F(int i) {
        if (this.f5161m0 != i) {
            this.f5161m0 = i;
            this.f4704B.clear();
            this.f5160l0 = this.f5161m0 == 1 ? this.f4755s : this.f4756t;
            this.f4704B.add(this.f5160l0);
            int length = this.f4703A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f4703A[i2] = this.f5160l0;
            }
        }
    }

    /* renamed from: a */
    public void mo4423a(C0955p4 p4Var) {
        C1236v4.C1237a aVar = C1236v4.C1237a.WRAP_CONTENT;
        C1292w4 w4Var = (C1292w4) this.f4706D;
        if (w4Var != null) {
            C1196u4 f = w4Var.mo4817f(C1196u4.C1198b.LEFT);
            C1196u4 f2 = w4Var.mo4817f(C1196u4.C1198b.RIGHT);
            C1236v4 v4Var = this.f4706D;
            boolean z = true;
            boolean z2 = v4Var != null && v4Var.f4705C[0] == aVar;
            if (this.f5161m0 == 0) {
                f = w4Var.mo4817f(C1196u4.C1198b.TOP);
                f2 = w4Var.mo4817f(C1196u4.C1198b.BOTTOM);
                C1236v4 v4Var2 = this.f4706D;
                if (v4Var2 == null || v4Var2.f4705C[1] != aVar) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f5158j0 != -1) {
                C1043r4 l = p4Var.mo3961l(this.f5160l0);
                p4Var.mo3953d(l, p4Var.mo3961l(f), this.f5158j0, 6);
                if (z2) {
                    p4Var.mo3955f(p4Var.mo3961l(f2), l, 0, 5);
                }
            } else if (this.f5159k0 != -1) {
                C1043r4 l2 = p4Var.mo3961l(this.f5160l0);
                C1043r4 l3 = p4Var.mo3961l(f2);
                p4Var.mo3953d(l2, l3, -this.f5159k0, 6);
                if (z2) {
                    p4Var.mo3955f(l2, p4Var.mo3961l(f), 0, 5);
                    p4Var.mo3955f(l3, l2, 0, 5);
                }
            } else if (this.f5157i0 != -1.0f) {
                C1043r4 l4 = p4Var.mo3961l(this.f5160l0);
                C1043r4 l5 = p4Var.mo3961l(f);
                C1043r4 l6 = p4Var.mo3961l(f2);
                float f3 = this.f5157i0;
                C0804m4 m = p4Var.mo3962m();
                m.f3215c.mo3589h(l4, -1.0f);
                m.f3215c.mo3589h(l5, 1.0f - f3);
                m.f3215c.mo3589h(l6, f3);
                p4Var.mo3952c(m);
            }
        }
    }

    /* renamed from: b */
    public boolean mo4424b() {
        return true;
    }

    /* renamed from: c */
    public void mo4425c(int i) {
        int i2;
        C0210b5 b5Var;
        C1196u4 u4Var;
        C0210b5 b5Var2;
        C1196u4 u4Var2;
        C0210b5 b5Var3;
        int i3;
        C1196u4 u4Var3;
        C0210b5 b5Var4;
        C1236v4.C1237a aVar = C1236v4.C1237a.FIXED;
        C1236v4 v4Var = this.f4706D;
        if (v4Var != null) {
            if (this.f5161m0 == 1) {
                this.f4756t.f4581a.mo1576f(1, v4Var.f4756t.f4581a, 0);
                this.f4758v.f4581a.mo1576f(1, v4Var.f4756t.f4581a, 0);
                int i4 = this.f5158j0;
                if (i4 != -1) {
                    this.f4755s.f4581a.mo1576f(1, v4Var.f4755s.f4581a, i4);
                    b5Var2 = this.f4757u.f4581a;
                    u4Var3 = v4Var.f4755s;
                } else {
                    int i5 = this.f5159k0;
                    if (i5 != -1) {
                        this.f4755s.f4581a.mo1576f(1, v4Var.f4757u.f4581a, -i5);
                        b5Var4 = this.f4757u.f4581a;
                        u4Var2 = v4Var.f4757u;
                        b5Var3 = u4Var2.f4581a;
                        i3 = -this.f5159k0;
                        b5Var2.mo1576f(1, b5Var3, i3);
                    } else if (this.f5157i0 != -1.0f && v4Var.mo4820i() == aVar) {
                        i2 = (int) (((float) v4Var.f4707E) * this.f5157i0);
                        this.f4755s.f4581a.mo1576f(1, v4Var.f4755s.f4581a, i2);
                        b5Var = this.f4757u.f4581a;
                        u4Var = v4Var.f4755s;
                        b5Var.mo1576f(1, u4Var.f4581a, i2);
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                this.f4755s.f4581a.mo1576f(1, v4Var.f4755s.f4581a, 0);
                this.f4757u.f4581a.mo1576f(1, v4Var.f4755s.f4581a, 0);
                int i6 = this.f5158j0;
                if (i6 != -1) {
                    this.f4756t.f4581a.mo1576f(1, v4Var.f4756t.f4581a, i6);
                    b5Var2 = this.f4758v.f4581a;
                    u4Var3 = v4Var.f4756t;
                } else {
                    int i7 = this.f5159k0;
                    if (i7 != -1) {
                        this.f4756t.f4581a.mo1576f(1, v4Var.f4758v.f4581a, -i7);
                        b5Var4 = this.f4758v.f4581a;
                        u4Var2 = v4Var.f4758v;
                        b5Var3 = u4Var2.f4581a;
                        i3 = -this.f5159k0;
                        b5Var2.mo1576f(1, b5Var3, i3);
                    } else if (this.f5157i0 != -1.0f && v4Var.mo4824m() == aVar) {
                        i2 = (int) (((float) v4Var.f4708F) * this.f5157i0);
                        this.f4756t.f4581a.mo1576f(1, v4Var.f4756t.f4581a, i2);
                        b5Var = this.f4758v.f4581a;
                        u4Var = v4Var.f4756t;
                        b5Var.mo1576f(1, u4Var.f4581a, i2);
                        return;
                    } else {
                        return;
                    }
                }
            }
            b5Var3 = u4Var3.f4581a;
            i3 = this.f5158j0;
            b5Var2.mo1576f(1, b5Var3, i3);
        }
    }

    /* renamed from: f */
    public C1196u4 mo4817f(C1196u4.C1198b bVar) {
        switch (bVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f5161m0 == 1) {
                    return this.f5160l0;
                }
                break;
            case 2:
            case 4:
                if (this.f5161m0 == 0) {
                    return this.f5160l0;
                }
                break;
        }
        throw new AssertionError(bVar.name());
    }
}
