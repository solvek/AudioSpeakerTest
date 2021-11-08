package p000;

import p000.C1196u4;

/* renamed from: b5 */
public class C0210b5 extends C0365d5 {

    /* renamed from: c */
    public C1196u4 f1238c;

    /* renamed from: d */
    public C0210b5 f1239d;

    /* renamed from: e */
    public float f1240e;

    /* renamed from: f */
    public C0210b5 f1241f;

    /* renamed from: g */
    public float f1242g;

    /* renamed from: h */
    public int f1243h = 0;

    /* renamed from: i */
    public C0210b5 f1244i;

    /* renamed from: j */
    public C0256c5 f1245j = null;

    /* renamed from: k */
    public int f1246k = 1;

    /* renamed from: l */
    public C0256c5 f1247l = null;

    /* renamed from: m */
    public int f1248m = 1;

    public C0210b5(C1196u4 u4Var) {
        this.f1238c = u4Var;
    }

    /* renamed from: d */
    public void mo1574d() {
        int i;
        C0210b5 b5Var;
        C0210b5 b5Var2;
        C0210b5 b5Var3;
        C0210b5 b5Var4;
        C0210b5 b5Var5;
        C0210b5 b5Var6;
        float f;
        float f2;
        C0210b5 b5Var7;
        float f3;
        boolean z = true;
        if (this.f1879b != 1 && (i = this.f1243h) != 4) {
            C0256c5 c5Var = this.f1245j;
            if (c5Var != null) {
                if (c5Var.f1879b == 1) {
                    this.f1240e = ((float) this.f1246k) * c5Var.f1339c;
                } else {
                    return;
                }
            }
            C0256c5 c5Var2 = this.f1247l;
            if (c5Var2 != null) {
                if (c5Var2.f1879b == 1) {
                    float f4 = c5Var2.f1339c;
                } else {
                    return;
                }
            }
            if (i == 1 && ((b5Var7 = this.f1239d) == null || b5Var7.f1879b == 1)) {
                if (b5Var7 == null) {
                    this.f1241f = this;
                    f3 = this.f1240e;
                } else {
                    this.f1241f = b5Var7.f1241f;
                    f3 = b5Var7.f1242g + this.f1240e;
                }
                this.f1242g = f3;
                mo2636a();
                return;
            }
            if (i == 2 && (b5Var4 = this.f1239d) != null && b5Var4.f1879b == 1 && (b5Var5 = this.f1244i) != null && (b5Var6 = b5Var5.f1239d) != null && b5Var6.f1879b == 1) {
                this.f1241f = b5Var4.f1241f;
                b5Var5.f1241f = b5Var6.f1241f;
                C1196u4 u4Var = this.f1238c;
                C1196u4.C1198b bVar = u4Var.f4583c;
                C1196u4.C1198b bVar2 = C1196u4.C1198b.RIGHT;
                int i2 = 0;
                if (!(bVar == bVar2 || bVar == C1196u4.C1198b.BOTTOM)) {
                    z = false;
                }
                float f5 = z ? b5Var4.f1242g - b5Var6.f1242g : b5Var6.f1242g - b5Var4.f1242g;
                if (bVar == C1196u4.C1198b.LEFT || bVar == bVar2) {
                    f = f5 - ((float) u4Var.f4582b.mo4825n());
                    f2 = this.f1238c.f4582b.f4724V;
                } else {
                    f = f5 - ((float) u4Var.f4582b.mo4819h());
                    f2 = this.f1238c.f4582b.f4725W;
                }
                int b = this.f1238c.mo4768b();
                int b2 = this.f1244i.f1238c.mo4768b();
                C1196u4 u4Var2 = this.f1238c.f4584d;
                C0210b5 b5Var8 = this.f1244i;
                if (u4Var2 == b5Var8.f1238c.f4584d) {
                    f2 = 0.5f;
                    b2 = 0;
                } else {
                    i2 = b;
                }
                float f6 = (float) i2;
                float f7 = (float) b2;
                float f8 = (f - f6) - f7;
                if (z) {
                    b5Var8.f1242g = (f8 * f2) + b5Var8.f1239d.f1242g + f7;
                    this.f1242g = (this.f1239d.f1242g - f6) - ((1.0f - f2) * f8);
                } else {
                    this.f1242g = (f8 * f2) + this.f1239d.f1242g + f6;
                    b5Var8.f1242g = (b5Var8.f1239d.f1242g - f7) - ((1.0f - f2) * f8);
                }
            } else if (i == 3 && (b5Var = this.f1239d) != null && b5Var.f1879b == 1 && (b5Var2 = this.f1244i) != null && (b5Var3 = b5Var2.f1239d) != null && b5Var3.f1879b == 1) {
                this.f1241f = b5Var.f1241f;
                b5Var2.f1241f = b5Var3.f1241f;
                this.f1242g = b5Var.f1242g + this.f1240e;
                b5Var2.f1242g = b5Var3.f1242g + b5Var2.f1240e;
            } else if (i == 5) {
                this.f1238c.f4582b.mo4427u();
                return;
            } else {
                return;
            }
            mo2636a();
            this.f1244i.mo2636a();
        }
    }

    /* renamed from: e */
    public void mo1575e(C0955p4 p4Var) {
        C1043r4 r4Var = this.f1238c.f4589i;
        C0210b5 b5Var = this.f1241f;
        if (b5Var == null) {
            p4Var.mo3954e(r4Var, (int) (this.f1242g + 0.5f));
        } else {
            p4Var.mo3953d(r4Var, p4Var.mo3961l(b5Var.f1238c), (int) (this.f1242g + 0.5f), 6);
        }
    }

    /* renamed from: f */
    public void mo1576f(int i, C0210b5 b5Var, int i2) {
        this.f1243h = i;
        this.f1239d = b5Var;
        this.f1240e = (float) i2;
        b5Var.f1878a.add(this);
    }

    /* renamed from: g */
    public void mo1577g(C0210b5 b5Var, int i) {
        this.f1239d = b5Var;
        this.f1240e = (float) i;
        b5Var.f1878a.add(this);
    }

    /* renamed from: h */
    public void mo1578h(C0210b5 b5Var, int i, C0256c5 c5Var) {
        this.f1239d = b5Var;
        b5Var.f1878a.add(this);
        this.f1245j = c5Var;
        this.f1246k = i;
        c5Var.f1878a.add(this);
    }

    /* renamed from: i */
    public void mo1579i() {
        this.f1879b = 0;
        this.f1878a.clear();
        this.f1239d = null;
        this.f1240e = 0.0f;
        this.f1245j = null;
        this.f1246k = 1;
        this.f1247l = null;
        this.f1248m = 1;
        this.f1241f = null;
        this.f1242g = 0.0f;
        this.f1244i = null;
        this.f1243h = 0;
    }

    /* renamed from: j */
    public void mo1580j(C0210b5 b5Var, float f) {
        int i = this.f1879b;
        if (i == 0 || !(this.f1241f == b5Var || this.f1242g == f)) {
            this.f1241f = b5Var;
            this.f1242g = f;
            if (i == 1) {
                mo2637b();
            }
            mo2636a();
        }
    }

    /* renamed from: k */
    public String mo1581k(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public String toString() {
        String str;
        StringBuilder sb;
        if (this.f1879b != 1) {
            sb = C0279ch.m1106c("{ ");
            sb.append(this.f1238c);
            str = " UNRESOLVED} type: ";
        } else if (this.f1241f == this) {
            sb = C0279ch.m1106c("[");
            sb.append(this.f1238c);
            sb.append(", RESOLVED: ");
            sb.append(this.f1242g);
            str = "]  type: ";
        } else {
            sb = C0279ch.m1106c("[");
            sb.append(this.f1238c);
            sb.append(", RESOLVED: ");
            sb.append(this.f1241f);
            sb.append(":");
            sb.append(this.f1242g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(mo1581k(this.f1243h));
        return sb.toString();
    }
}
