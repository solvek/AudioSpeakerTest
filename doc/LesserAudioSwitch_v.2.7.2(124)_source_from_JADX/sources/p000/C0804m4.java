package p000;

import p000.C0955p4;

/* renamed from: m4 */
public class C0804m4 implements C0955p4.C0956a {

    /* renamed from: a */
    public C1043r4 f3213a = null;

    /* renamed from: b */
    public float f3214b = 0.0f;

    /* renamed from: c */
    public final C0755l4 f3215c;

    /* renamed from: d */
    public boolean f3216d = false;

    public C0804m4(C0857n4 n4Var) {
        this.f3215c = new C0755l4(this, n4Var);
    }

    /* renamed from: a */
    public void mo3657a(C1043r4 r4Var) {
        int i = r4Var.f3906c;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f3215c.mo3589h(r4Var, f);
    }

    /* renamed from: b */
    public C0804m4 mo3658b(C0955p4 p4Var, int i) {
        this.f3215c.mo3589h(p4Var.mo3960k(i, "ep"), 1.0f);
        this.f3215c.mo3589h(p4Var.mo3960k(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: c */
    public C0804m4 mo3659c(C1043r4 r4Var, C1043r4 r4Var2, C1043r4 r4Var3, C1043r4 r4Var4, float f) {
        this.f3215c.mo3589h(r4Var, -1.0f);
        this.f3215c.mo3589h(r4Var2, 1.0f);
        this.f3215c.mo3589h(r4Var3, f);
        this.f3215c.mo3589h(r4Var4, -f);
        return this;
    }

    /* renamed from: d */
    public C0804m4 mo3660d(C1043r4 r4Var, C1043r4 r4Var2, C1043r4 r4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3214b = (float) i;
        }
        if (!z) {
            this.f3215c.mo3589h(r4Var, -1.0f);
            this.f3215c.mo3589h(r4Var2, 1.0f);
            this.f3215c.mo3589h(r4Var3, 1.0f);
        } else {
            this.f3215c.mo3589h(r4Var, 1.0f);
            this.f3215c.mo3589h(r4Var2, -1.0f);
            this.f3215c.mo3589h(r4Var3, -1.0f);
        }
        return this;
    }

    /* renamed from: e */
    public C0804m4 mo3661e(C1043r4 r4Var, C1043r4 r4Var2, C1043r4 r4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3214b = (float) i;
        }
        if (!z) {
            this.f3215c.mo3589h(r4Var, -1.0f);
            this.f3215c.mo3589h(r4Var2, 1.0f);
            this.f3215c.mo3589h(r4Var3, -1.0f);
        } else {
            this.f3215c.mo3589h(r4Var, 1.0f);
            this.f3215c.mo3589h(r4Var2, -1.0f);
            this.f3215c.mo3589h(r4Var3, 1.0f);
        }
        return this;
    }

    /* renamed from: f */
    public C0804m4 mo3662f(C1043r4 r4Var, C1043r4 r4Var2, C1043r4 r4Var3, C1043r4 r4Var4, float f) {
        this.f3215c.mo3589h(r4Var3, 0.5f);
        this.f3215c.mo3589h(r4Var4, 0.5f);
        this.f3215c.mo3589h(r4Var, -0.5f);
        this.f3215c.mo3589h(r4Var2, -0.5f);
        this.f3214b = -f;
        return this;
    }

    /* renamed from: g */
    public void mo3663g(C1043r4 r4Var) {
        C1043r4 r4Var2 = this.f3213a;
        if (r4Var2 != null) {
            this.f3215c.mo3589h(r4Var2, -1.0f);
            this.f3213a = null;
        }
        float i = this.f3215c.mo3590i(r4Var, true) * -1.0f;
        this.f3213a = r4Var;
        if (i != 1.0f) {
            this.f3214b /= i;
            C0755l4 l4Var = this.f3215c;
            int i2 = l4Var.f3102h;
            int i3 = 0;
            while (i2 != -1 && i3 < l4Var.f3095a) {
                float[] fArr = l4Var.f3101g;
                fArr[i2] = fArr[i2] / i;
                i2 = l4Var.f3100f[i2];
                i3++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            r4 r0 = r7.f3213a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
            r4 r1 = r7.f3213a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = p000.C0279ch.m1120q(r0, r1)
            float r1 = r7.f3214b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
            float r1 = r7.f3214b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            l4 r4 = r7.f3215c
            int r4 = r4.f3095a
        L_0x0038:
            if (r3 >= r4) goto L_0x00a0
            l4 r5 = r7.f3215c
            r4 r5 = r5.mo3586e(r3)
            if (r5 != 0) goto L_0x0043
            goto L_0x009d
        L_0x0043:
            l4 r5 = r7.f3215c
            float r5 = r5.mo3587f(r3)
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            goto L_0x009d
        L_0x004e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x005d
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0077
            java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
            java.lang.String r1 = "- "
            goto L_0x006e
        L_0x005d:
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0068
            java.lang.String r1 = " + "
            java.lang.String r0 = p000.C0279ch.m1120q(r0, r1)
            goto L_0x0077
        L_0x0068:
            java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
            java.lang.String r1 = " - "
        L_0x006e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r5 = r5 * r6
        L_0x0077:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0083
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0090
        L_0x0083:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " "
        L_0x0090:
            r1.append(r0)
            java.lang.String r0 = "null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x009d:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x00a0:
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p000.C0279ch.m1120q(r0, r1)
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0804m4.toString():java.lang.String");
    }
}
