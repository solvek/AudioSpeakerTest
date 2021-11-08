package p000;

import java.util.Arrays;
import p000.C1043r4;

/* renamed from: p4 */
public class C0955p4 {

    /* renamed from: o */
    public static int f3548o = 1000;

    /* renamed from: a */
    public int f3549a;

    /* renamed from: b */
    public C0956a f3550b;

    /* renamed from: c */
    public int f3551c;

    /* renamed from: d */
    public int f3552d;

    /* renamed from: e */
    public C0804m4[] f3553e;

    /* renamed from: f */
    public boolean f3554f;

    /* renamed from: g */
    public boolean[] f3555g;

    /* renamed from: h */
    public int f3556h;

    /* renamed from: i */
    public int f3557i;

    /* renamed from: j */
    public int f3558j;

    /* renamed from: k */
    public final C0857n4 f3559k;

    /* renamed from: l */
    public C1043r4[] f3560l;

    /* renamed from: m */
    public int f3561m;

    /* renamed from: n */
    public final C0956a f3562n;

    /* renamed from: p4$a */
    public interface C0956a {
        /* renamed from: a */
        void mo3657a(C1043r4 r4Var);
    }

    public C0955p4() {
        this.f3549a = 0;
        this.f3551c = 32;
        this.f3552d = 32;
        this.f3553e = null;
        this.f3554f = false;
        this.f3555g = new boolean[32];
        this.f3556h = 1;
        this.f3557i = 0;
        this.f3558j = 32;
        this.f3560l = new C1043r4[f3548o];
        this.f3561m = 0;
        this.f3553e = new C0804m4[32];
        mo3968s();
        C0857n4 n4Var = new C0857n4();
        this.f3559k = n4Var;
        this.f3550b = new C0914o4(n4Var);
        this.f3562n = new C0804m4(n4Var);
    }

    /* renamed from: a */
    public final C1043r4 mo3950a(C1043r4.C1044a aVar, String str) {
        C1043r4 a = this.f3559k.f3337b.mo4065a();
        if (a == null) {
            a = new C1043r4(aVar);
        } else {
            a.mo4190c();
        }
        a.f3909f = aVar;
        int i = this.f3561m;
        int i2 = f3548o;
        if (i >= i2) {
            int i3 = i2 * 2;
            f3548o = i3;
            this.f3560l = (C1043r4[]) Arrays.copyOf(this.f3560l, i3);
        }
        C1043r4[] r4VarArr = this.f3560l;
        int i4 = this.f3561m;
        this.f3561m = i4 + 1;
        r4VarArr[i4] = a;
        return a;
    }

    /* renamed from: b */
    public void mo3951b(C1043r4 r4Var, C1043r4 r4Var2, int i, float f, C1043r4 r4Var3, C1043r4 r4Var4, int i2, int i3) {
        float f2;
        C0804m4 m = mo3962m();
        if (r4Var2 == r4Var3) {
            m.f3215c.mo3589h(r4Var, 1.0f);
            m.f3215c.mo3589h(r4Var4, 1.0f);
            m.f3215c.mo3589h(r4Var2, -2.0f);
        } else {
            if (f == 0.5f) {
                m.f3215c.mo3589h(r4Var, 1.0f);
                m.f3215c.mo3589h(r4Var2, -1.0f);
                m.f3215c.mo3589h(r4Var3, -1.0f);
                m.f3215c.mo3589h(r4Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    f2 = (float) ((-i) + i2);
                }
            } else if (f <= 0.0f) {
                m.f3215c.mo3589h(r4Var, -1.0f);
                m.f3215c.mo3589h(r4Var2, 1.0f);
                f2 = (float) i;
            } else if (f >= 1.0f) {
                m.f3215c.mo3589h(r4Var3, -1.0f);
                m.f3215c.mo3589h(r4Var4, 1.0f);
                f2 = (float) i2;
            } else {
                float f3 = 1.0f - f;
                m.f3215c.mo3589h(r4Var, f3 * 1.0f);
                m.f3215c.mo3589h(r4Var2, f3 * -1.0f);
                m.f3215c.mo3589h(r4Var3, -1.0f * f);
                m.f3215c.mo3589h(r4Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    m.f3214b = (((float) i2) * f) + (((float) (-i)) * f3);
                }
            }
            m.f3214b = f2;
        }
        if (i3 != 6) {
            m.mo3658b(this, i3);
        }
        mo3952c(m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x00e1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3952c(p000.C0804m4 r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r4$a r2 = p000.C1043r4.C1044a.UNRESTRICTED
            int r3 = r0.f3557i
            r4 = 1
            int r3 = r3 + r4
            int r5 = r0.f3558j
            if (r3 >= r5) goto L_0x0015
            int r3 = r0.f3556h
            int r3 = r3 + r4
            int r5 = r0.f3552d
            if (r3 < r5) goto L_0x0018
        L_0x0015:
            r19.mo3965p()
        L_0x0018:
            boolean r3 = r1.f3216d
            if (r3 != 0) goto L_0x018e
            r19.mo3970u(r20)
            r4 r3 = r1.f3213a
            r6 = 0
            if (r3 != 0) goto L_0x0032
            float r3 = r1.f3214b
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0032
            l4 r3 = r1.f3215c
            int r3 = r3.f3095a
            if (r3 != 0) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x0036
            return
        L_0x0036:
            float r3 = r1.f3214b
            r7 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x005d
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r8
            r1.f3214b = r3
            l4 r3 = r1.f3215c
            int r9 = r3.f3102h
            r10 = 0
        L_0x0048:
            if (r9 == r7) goto L_0x005d
            int r11 = r3.f3095a
            if (r10 >= r11) goto L_0x005d
            float[] r11 = r3.f3101g
            r12 = r11[r9]
            float r12 = r12 * r8
            r11[r9] = r12
            int[] r11 = r3.f3100f
            r9 = r11[r9]
            int r10 = r10 + 1
            goto L_0x0048
        L_0x005d:
            l4 r3 = r1.f3215c
            int r8 = r3.f3102h
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0069:
            if (r8 == r7) goto L_0x00e9
            int r5 = r3.f3095a
            if (r10 >= r5) goto L_0x00e9
            float[] r5 = r3.f3101g
            r17 = r5[r8]
            r18 = 981668463(0x3a83126f, float:0.001)
            n4 r7 = r3.f3097c
            r4[] r7 = r7.f3338c
            int[] r9 = r3.f3099e
            r9 = r9[r8]
            r7 = r7[r9]
            int r9 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x008e
            r9 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r9 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x009b
            r5[r8] = r6
            goto L_0x0094
        L_0x008e:
            int r9 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x009b
            r5[r8] = r6
        L_0x0094:
            m4 r5 = r3.f3096b
            r7.mo4189b(r5)
            r17 = 0
        L_0x009b:
            int r5 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00e1
            r4$a r5 = r7.f3909f
            if (r5 != r2) goto L_0x00bf
            if (r12 != 0) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b2
        L_0x00aa:
            boolean r14 = r3.mo3588g(r7)
            r12 = r7
            r13 = r17
            goto L_0x00e1
        L_0x00b2:
            if (r14 != 0) goto L_0x00e1
            boolean r5 = r3.mo3588g(r7)
            if (r5 == 0) goto L_0x00e1
            r12 = r7
            r13 = r17
            r14 = 1
            goto L_0x00e1
        L_0x00bf:
            if (r12 != 0) goto L_0x00e1
            int r5 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e1
            if (r11 != 0) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d4
        L_0x00cc:
            boolean r16 = r3.mo3588g(r7)
            r11 = r7
            r15 = r17
            goto L_0x00e1
        L_0x00d4:
            if (r16 != 0) goto L_0x00e1
            boolean r5 = r3.mo3588g(r7)
            if (r5 == 0) goto L_0x00e1
            r11 = r7
            r15 = r17
            r16 = 1
        L_0x00e1:
            int[] r5 = r3.f3100f
            r8 = r5[r8]
            int r10 = r10 + 1
            r7 = -1
            goto L_0x0069
        L_0x00e9:
            if (r12 == 0) goto L_0x00ec
            r11 = r12
        L_0x00ec:
            if (r11 != 0) goto L_0x00f0
            r3 = 1
            goto L_0x00f4
        L_0x00f0:
            r1.mo3663g(r11)
            r3 = 0
        L_0x00f4:
            l4 r5 = r1.f3215c
            int r5 = r5.f3095a
            if (r5 != 0) goto L_0x00fc
            r1.f3216d = r4
        L_0x00fc:
            if (r3 == 0) goto L_0x0178
            int r3 = r0.f3556h
            int r3 = r3 + r4
            int r5 = r0.f3552d
            if (r3 < r5) goto L_0x0108
            r19.mo3965p()
        L_0x0108:
            r4$a r3 = p000.C1043r4.C1044a.SLACK
            r5 = 0
            r4 r3 = r0.mo3950a(r3, r5)
            int r5 = r0.f3549a
            int r5 = r5 + r4
            r0.f3549a = r5
            int r7 = r0.f3556h
            int r7 = r7 + r4
            r0.f3556h = r7
            r3.f3904a = r5
            n4 r7 = r0.f3559k
            r4[] r7 = r7.f3338c
            r7[r5] = r3
            r1.f3213a = r3
            r19.mo3958i(r20)
            p4$a r5 = r0.f3562n
            m4 r5 = (p000.C0804m4) r5
            r5.getClass()
            r7 = 0
            r5.f3213a = r7
            l4 r7 = r5.f3215c
            r7.mo3583b()
            r7 = 0
        L_0x0136:
            l4 r8 = r1.f3215c
            int r9 = r8.f3095a
            if (r7 >= r9) goto L_0x014e
            r4 r8 = r8.mo3586e(r7)
            l4 r9 = r1.f3215c
            float r9 = r9.mo3587f(r7)
            l4 r10 = r5.f3215c
            r10.mo3582a(r8, r9, r4)
            int r7 = r7 + 1
            goto L_0x0136
        L_0x014e:
            p4$a r5 = r0.f3562n
            r0.mo3967r(r5)
            int r5 = r3.f3905b
            r7 = -1
            if (r5 != r7) goto L_0x0176
            r4 r5 = r1.f3213a
            if (r5 != r3) goto L_0x0168
            l4 r5 = r1.f3215c
            r7 = 0
            r4 r3 = r5.mo3585d(r7, r3)
            if (r3 == 0) goto L_0x0168
            r1.mo3663g(r3)
        L_0x0168:
            boolean r3 = r1.f3216d
            if (r3 != 0) goto L_0x0171
            r4 r3 = r1.f3213a
            r3.mo4191d(r1)
        L_0x0171:
            int r3 = r0.f3557i
            int r3 = r3 - r4
            r0.f3557i = r3
        L_0x0176:
            r3 = 1
            goto L_0x0179
        L_0x0178:
            r3 = 0
        L_0x0179:
            r4 r5 = r1.f3213a
            if (r5 == 0) goto L_0x0188
            r4$a r5 = r5.f3909f
            if (r5 == r2) goto L_0x0189
            float r2 = r1.f3214b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r4 = 0
        L_0x0189:
            if (r4 != 0) goto L_0x018c
            return
        L_0x018c:
            r5 = r3
            goto L_0x018f
        L_0x018e:
            r5 = 0
        L_0x018f:
            if (r5 != 0) goto L_0x0194
            r19.mo3958i(r20)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0955p4.mo3952c(m4):void");
    }

    /* renamed from: d */
    public C0804m4 mo3953d(C1043r4 r4Var, C1043r4 r4Var2, int i, int i2) {
        C0804m4 m = mo3962m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m.f3214b = (float) i;
        }
        if (!z) {
            m.f3215c.mo3589h(r4Var, -1.0f);
            m.f3215c.mo3589h(r4Var2, 1.0f);
        } else {
            m.f3215c.mo3589h(r4Var, 1.0f);
            m.f3215c.mo3589h(r4Var2, -1.0f);
        }
        if (i2 != 6) {
            m.mo3658b(this, i2);
        }
        mo3952c(m);
        return m;
    }

    /* renamed from: e */
    public void mo3954e(C1043r4 r4Var, int i) {
        C0804m4 m4Var;
        C0755l4 l4Var;
        float f;
        int i2 = r4Var.f3905b;
        if (i2 != -1) {
            C0804m4 m4Var2 = this.f3553e[i2];
            if (!m4Var2.f3216d) {
                if (m4Var2.f3215c.f3095a == 0) {
                    m4Var2.f3216d = true;
                } else {
                    m4Var = mo3962m();
                    if (i < 0) {
                        m4Var.f3214b = (float) (i * -1);
                        l4Var = m4Var.f3215c;
                        f = 1.0f;
                    } else {
                        m4Var.f3214b = (float) i;
                        l4Var = m4Var.f3215c;
                        f = -1.0f;
                    }
                    l4Var.mo3589h(r4Var, f);
                }
            }
            m4Var2.f3214b = (float) i;
            return;
        }
        m4Var = mo3962m();
        m4Var.f3213a = r4Var;
        float f2 = (float) i;
        r4Var.f3907d = f2;
        m4Var.f3214b = f2;
        m4Var.f3216d = true;
        mo3952c(m4Var);
    }

    /* renamed from: f */
    public void mo3955f(C1043r4 r4Var, C1043r4 r4Var2, int i, int i2) {
        C0804m4 m = mo3962m();
        C1043r4 n = mo3963n();
        n.f3906c = 0;
        m.mo3660d(r4Var, r4Var2, n, i);
        if (i2 != 6) {
            m.f3215c.mo3589h(mo3960k(i2, (String) null), (float) ((int) (m.f3215c.mo3584c(n) * -1.0f)));
        }
        mo3952c(m);
    }

    /* renamed from: g */
    public void mo3956g(C1043r4 r4Var, C1043r4 r4Var2, int i, int i2) {
        C0804m4 m = mo3962m();
        C1043r4 n = mo3963n();
        n.f3906c = 0;
        m.mo3661e(r4Var, r4Var2, n, i);
        if (i2 != 6) {
            m.f3215c.mo3589h(mo3960k(i2, (String) null), (float) ((int) (m.f3215c.mo3584c(n) * -1.0f)));
        }
        mo3952c(m);
    }

    /* renamed from: h */
    public void mo3957h(C1043r4 r4Var, C1043r4 r4Var2, C1043r4 r4Var3, C1043r4 r4Var4, float f, int i) {
        C0804m4 m = mo3962m();
        m.mo3659c(r4Var, r4Var2, r4Var3, r4Var4, f);
        if (i != 6) {
            m.mo3658b(this, i);
        }
        mo3952c(m);
    }

    /* renamed from: i */
    public final void mo3958i(C0804m4 m4Var) {
        C0804m4[] m4VarArr = this.f3553e;
        int i = this.f3557i;
        if (m4VarArr[i] != null) {
            this.f3559k.f3336a.mo4066b(m4VarArr[i]);
        }
        C0804m4[] m4VarArr2 = this.f3553e;
        int i2 = this.f3557i;
        m4VarArr2[i2] = m4Var;
        C1043r4 r4Var = m4Var.f3213a;
        r4Var.f3905b = i2;
        this.f3557i = i2 + 1;
        r4Var.mo4191d(m4Var);
    }

    /* renamed from: j */
    public final void mo3959j() {
        for (int i = 0; i < this.f3557i; i++) {
            C0804m4 m4Var = this.f3553e[i];
            m4Var.f3213a.f3907d = m4Var.f3214b;
        }
    }

    /* renamed from: k */
    public C1043r4 mo3960k(int i, String str) {
        if (this.f3556h + 1 >= this.f3552d) {
            mo3965p();
        }
        C1043r4 a = mo3950a(C1043r4.C1044a.ERROR, str);
        int i2 = this.f3549a + 1;
        this.f3549a = i2;
        this.f3556h++;
        a.f3904a = i2;
        a.f3906c = i;
        this.f3559k.f3338c[i2] = a;
        this.f3550b.mo3657a(a);
        return a;
    }

    /* renamed from: l */
    public C1043r4 mo3961l(Object obj) {
        C1043r4 r4Var = null;
        if (obj == null) {
            return null;
        }
        if (this.f3556h + 1 >= this.f3552d) {
            mo3965p();
        }
        if (obj instanceof C1196u4) {
            C1196u4 u4Var = (C1196u4) obj;
            r4Var = u4Var.f4589i;
            if (r4Var == null) {
                u4Var.mo4771e();
                r4Var = u4Var.f4589i;
            }
            int i = r4Var.f3904a;
            if (i == -1 || i > this.f3549a || this.f3559k.f3338c[i] == null) {
                if (i != -1) {
                    r4Var.mo4190c();
                }
                int i2 = this.f3549a + 1;
                this.f3549a = i2;
                this.f3556h++;
                r4Var.f3904a = i2;
                r4Var.f3909f = C1043r4.C1044a.UNRESTRICTED;
                this.f3559k.f3338c[i2] = r4Var;
            }
        }
        return r4Var;
    }

    /* renamed from: m */
    public C0804m4 mo3962m() {
        C0804m4 a = this.f3559k.f3336a.mo4065a();
        if (a == null) {
            a = new C0804m4(this.f3559k);
        } else {
            a.f3213a = null;
            a.f3215c.mo3583b();
            a.f3214b = 0.0f;
            a.f3216d = false;
        }
        C1043r4.f3903j++;
        return a;
    }

    /* renamed from: n */
    public C1043r4 mo3963n() {
        if (this.f3556h + 1 >= this.f3552d) {
            mo3965p();
        }
        C1043r4 a = mo3950a(C1043r4.C1044a.SLACK, (String) null);
        int i = this.f3549a + 1;
        this.f3549a = i;
        this.f3556h++;
        a.f3904a = i;
        this.f3559k.f3338c[i] = a;
        return a;
    }

    /* renamed from: o */
    public int mo3964o(Object obj) {
        C1043r4 r4Var = ((C1196u4) obj).f4589i;
        if (r4Var != null) {
            return (int) (r4Var.f3907d + 0.5f);
        }
        return 0;
    }

    /* renamed from: p */
    public final void mo3965p() {
        int i = this.f3551c * 2;
        this.f3551c = i;
        this.f3553e = (C0804m4[]) Arrays.copyOf(this.f3553e, i);
        C0857n4 n4Var = this.f3559k;
        n4Var.f3338c = (C1043r4[]) Arrays.copyOf(n4Var.f3338c, this.f3551c);
        int i2 = this.f3551c;
        this.f3555g = new boolean[i2];
        this.f3552d = i2;
        this.f3558j = i2;
    }

    /* renamed from: q */
    public void mo3966q(C0956a aVar) {
        float f;
        int i;
        boolean z;
        mo3970u((C0804m4) aVar);
        C1043r4.C1044a aVar2 = C1043r4.C1044a.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f3557i) {
                z = false;
                break;
            }
            C0804m4[] m4VarArr = this.f3553e;
            if (m4VarArr[i2].f3213a.f3909f != aVar2 && m4VarArr[i2].f3214b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.f3557i) {
                    C0804m4 m4Var = this.f3553e[i4];
                    if (m4Var.f3213a.f3909f != aVar2 && !m4Var.f3216d && m4Var.f3214b < f) {
                        int i8 = 1;
                        while (i8 < this.f3556h) {
                            C1043r4 r4Var = this.f3559k.f3338c[i8];
                            float c = m4Var.f3215c.mo3584c(r4Var);
                            if (c > f) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f3 = r4Var.f3908e[i9] / c;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f2 = f3;
                                        i5 = i4;
                                        i6 = i8;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                }
                if (i5 != -1) {
                    C0804m4 m4Var2 = this.f3553e[i5];
                    m4Var2.f3213a.f3905b = -1;
                    m4Var2.mo3663g(this.f3559k.f3338c[i6]);
                    C1043r4 r4Var2 = m4Var2.f3213a;
                    r4Var2.f3905b = i5;
                    r4Var2.mo4191d(m4Var2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f3556h / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        mo3967r(aVar);
        mo3959j();
    }

    /* renamed from: r */
    public final int mo3967r(C0956a aVar) {
        boolean z;
        for (int i = 0; i < this.f3556h; i++) {
            this.f3555g[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f3556h * 2) {
                return i2;
            }
            C0804m4 m4Var = (C0804m4) aVar;
            C1043r4 r4Var = m4Var.f3213a;
            if (r4Var != null) {
                this.f3555g[r4Var.f3904a] = true;
            }
            C1043r4 d = m4Var.f3215c.mo3585d(this.f3555g, (C1043r4) null);
            if (d != null) {
                boolean[] zArr = this.f3555g;
                int i3 = d.f3904a;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f3557i; i5++) {
                    C0804m4 m4Var2 = this.f3553e[i5];
                    if (m4Var2.f3213a.f3909f != C1043r4.C1044a.UNRESTRICTED && !m4Var2.f3216d) {
                        C0755l4 l4Var = m4Var2.f3215c;
                        int i6 = l4Var.f3102h;
                        if (i6 != -1) {
                            int i7 = 0;
                            while (true) {
                                if (i6 == -1 || i7 >= l4Var.f3095a) {
                                    break;
                                } else if (l4Var.f3099e[i6] == d.f3904a) {
                                    z = true;
                                    break;
                                } else {
                                    i6 = l4Var.f3100f[i6];
                                    i7++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            float c = m4Var2.f3215c.mo3584c(d);
                            if (c < 0.0f) {
                                float f2 = (-m4Var2.f3214b) / c;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0804m4 m4Var3 = this.f3553e[i4];
                    m4Var3.f3213a.f3905b = -1;
                    m4Var3.mo3663g(d);
                    C1043r4 r4Var2 = m4Var3.f3213a;
                    r4Var2.f3905b = i4;
                    r4Var2.mo4191d(m4Var3);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: s */
    public final void mo3968s() {
        int i = 0;
        while (true) {
            C0804m4[] m4VarArr = this.f3553e;
            if (i < m4VarArr.length) {
                C0804m4 m4Var = m4VarArr[i];
                if (m4Var != null) {
                    this.f3559k.f3336a.mo4066b(m4Var);
                }
                this.f3553e[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public void mo3969t() {
        C0857n4 n4Var;
        int i = 0;
        while (true) {
            n4Var = this.f3559k;
            C1043r4[] r4VarArr = n4Var.f3338c;
            if (i >= r4VarArr.length) {
                break;
            }
            C1043r4 r4Var = r4VarArr[i];
            if (r4Var != null) {
                r4Var.mo4190c();
            }
            i++;
        }
        C1003q4<C1043r4> q4Var = n4Var.f3337b;
        C1043r4[] r4VarArr2 = this.f3560l;
        int i2 = this.f3561m;
        q4Var.getClass();
        if (i2 > r4VarArr2.length) {
            i2 = r4VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C1043r4 r4Var2 = r4VarArr2[i3];
            int i4 = q4Var.f3774b;
            Object[] objArr = q4Var.f3773a;
            if (i4 < objArr.length) {
                objArr[i4] = r4Var2;
                q4Var.f3774b = i4 + 1;
            }
        }
        this.f3561m = 0;
        Arrays.fill(this.f3559k.f3338c, (Object) null);
        this.f3549a = 0;
        C0804m4 m4Var = (C0804m4) this.f3550b;
        m4Var.f3215c.mo3583b();
        m4Var.f3213a = null;
        m4Var.f3214b = 0.0f;
        this.f3556h = 1;
        for (int i5 = 0; i5 < this.f3557i; i5++) {
            this.f3553e[i5].getClass();
        }
        mo3968s();
        this.f3557i = 0;
    }

    /* renamed from: u */
    public final void mo3970u(C0804m4 m4Var) {
        if (this.f3557i > 0) {
            C0755l4 l4Var = m4Var.f3215c;
            C0804m4[] m4VarArr = this.f3553e;
            loop0:
            while (true) {
                int i = l4Var.f3102h;
                int i2 = 0;
                int i3 = 0;
                while (i != -1 && i3 < l4Var.f3095a) {
                    C1043r4 r4Var = l4Var.f3097c.f3338c[l4Var.f3099e[i]];
                    if (r4Var.f3905b != -1) {
                        float f = l4Var.f3101g[i];
                        l4Var.mo3590i(r4Var, true);
                        C0804m4 m4Var2 = m4VarArr[r4Var.f3905b];
                        if (!m4Var2.f3216d) {
                            C0755l4 l4Var2 = m4Var2.f3215c;
                            int i4 = l4Var2.f3102h;
                            while (i4 != -1 && i2 < l4Var2.f3095a) {
                                l4Var.mo3582a(l4Var.f3097c.f3338c[l4Var2.f3099e[i4]], l4Var2.f3101g[i4] * f, true);
                                i4 = l4Var2.f3100f[i4];
                                i2++;
                            }
                        }
                        m4Var.f3214b = (m4Var2.f3214b * f) + m4Var.f3214b;
                        m4Var2.f3213a.mo4189b(m4Var);
                    } else {
                        i = l4Var.f3100f[i];
                        i3++;
                    }
                }
            }
            if (m4Var.f3215c.f3095a == 0) {
                m4Var.f3216d = true;
            }
        }
    }
}
