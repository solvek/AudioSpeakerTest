package p000;

import java.util.Arrays;
import p000.C1043r4;

/* renamed from: l4 */
public class C0755l4 {

    /* renamed from: a */
    public int f3095a = 0;

    /* renamed from: b */
    public final C0804m4 f3096b;

    /* renamed from: c */
    public final C0857n4 f3097c;

    /* renamed from: d */
    public int f3098d = 8;

    /* renamed from: e */
    public int[] f3099e = new int[8];

    /* renamed from: f */
    public int[] f3100f = new int[8];

    /* renamed from: g */
    public float[] f3101g = new float[8];

    /* renamed from: h */
    public int f3102h = -1;

    /* renamed from: i */
    public int f3103i = -1;

    /* renamed from: j */
    public boolean f3104j = false;

    public C0755l4(C0804m4 m4Var, C0857n4 n4Var) {
        this.f3096b = m4Var;
        this.f3097c = n4Var;
    }

    /* renamed from: a */
    public final void mo3582a(C1043r4 r4Var, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f3102h;
            if (i == -1) {
                this.f3102h = 0;
                this.f3101g[0] = f;
                this.f3099e[0] = r4Var.f3904a;
                this.f3100f[0] = -1;
                r4Var.f3912i++;
                r4Var.mo4188a(this.f3096b);
                this.f3095a++;
                if (!this.f3104j) {
                    int i2 = this.f3103i + 1;
                    this.f3103i = i2;
                    int[] iArr = this.f3099e;
                    if (i2 >= iArr.length) {
                        this.f3104j = true;
                        this.f3103i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f3095a) {
                int[] iArr2 = this.f3099e;
                int i5 = iArr2[i];
                int i6 = r4Var.f3904a;
                if (i5 == i6) {
                    float[] fArr = this.f3101g;
                    fArr[i] = fArr[i] + f;
                    if (fArr[i] == 0.0f) {
                        if (i == this.f3102h) {
                            this.f3102h = this.f3100f[i];
                        } else {
                            int[] iArr3 = this.f3100f;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            r4Var.mo4189b(this.f3096b);
                        }
                        if (this.f3104j) {
                            this.f3103i = i;
                        }
                        r4Var.f3912i--;
                        this.f3095a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f3100f[i];
                i3++;
            }
            int i7 = this.f3103i;
            int i8 = i7 + 1;
            if (this.f3104j) {
                int[] iArr4 = this.f3099e;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f3099e;
            if (i7 >= iArr5.length && this.f3095a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f3099e;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f3099e;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f3098d * 2;
                this.f3098d = i10;
                this.f3104j = false;
                this.f3103i = i7 - 1;
                this.f3101g = Arrays.copyOf(this.f3101g, i10);
                this.f3099e = Arrays.copyOf(this.f3099e, this.f3098d);
                this.f3100f = Arrays.copyOf(this.f3100f, this.f3098d);
            }
            this.f3099e[i7] = r4Var.f3904a;
            this.f3101g[i7] = f;
            int[] iArr8 = this.f3100f;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f3102h;
                this.f3102h = i7;
            }
            r4Var.f3912i++;
            r4Var.mo4188a(this.f3096b);
            this.f3095a++;
            if (!this.f3104j) {
                this.f3103i++;
            }
            int i11 = this.f3103i;
            int[] iArr9 = this.f3099e;
            if (i11 >= iArr9.length) {
                this.f3104j = true;
                this.f3103i = iArr9.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void mo3583b() {
        int i = this.f3102h;
        int i2 = 0;
        while (i != -1 && i2 < this.f3095a) {
            C1043r4 r4Var = this.f3097c.f3338c[this.f3099e[i]];
            if (r4Var != null) {
                r4Var.mo4189b(this.f3096b);
            }
            i = this.f3100f[i];
            i2++;
        }
        this.f3102h = -1;
        this.f3103i = -1;
        this.f3104j = false;
        this.f3095a = 0;
    }

    /* renamed from: c */
    public final float mo3584c(C1043r4 r4Var) {
        int i = this.f3102h;
        int i2 = 0;
        while (i != -1 && i2 < this.f3095a) {
            if (this.f3099e[i] == r4Var.f3904a) {
                return this.f3101g[i];
            }
            i = this.f3100f[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public C1043r4 mo3585d(boolean[] zArr, C1043r4 r4Var) {
        C1043r4.C1044a aVar;
        int i = this.f3102h;
        int i2 = 0;
        C1043r4 r4Var2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f3095a) {
            float[] fArr = this.f3101g;
            if (fArr[i] < 0.0f) {
                C1043r4 r4Var3 = this.f3097c.f3338c[this.f3099e[i]];
                if ((zArr == null || !zArr[r4Var3.f3904a]) && r4Var3 != r4Var && ((aVar = r4Var3.f3909f) == C1043r4.C1044a.SLACK || aVar == C1043r4.C1044a.ERROR)) {
                    float f2 = fArr[i];
                    if (f2 < f) {
                        f = f2;
                        r4Var2 = r4Var3;
                    }
                }
            }
            i = this.f3100f[i];
            i2++;
        }
        return r4Var2;
    }

    /* renamed from: e */
    public final C1043r4 mo3586e(int i) {
        int i2 = this.f3102h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3095a) {
            if (i3 == i) {
                return this.f3097c.f3338c[this.f3099e[i2]];
            }
            i2 = this.f3100f[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: f */
    public final float mo3587f(int i) {
        int i2 = this.f3102h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3095a) {
            if (i3 == i) {
                return this.f3101g[i2];
            }
            i2 = this.f3100f[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final boolean mo3588g(C1043r4 r4Var) {
        return r4Var.f3912i <= 1;
    }

    /* renamed from: h */
    public final void mo3589h(C1043r4 r4Var, float f) {
        if (f == 0.0f) {
            mo3590i(r4Var, true);
            return;
        }
        int i = this.f3102h;
        if (i == -1) {
            this.f3102h = 0;
            this.f3101g[0] = f;
            this.f3099e[0] = r4Var.f3904a;
            this.f3100f[0] = -1;
            r4Var.f3912i++;
            r4Var.mo4188a(this.f3096b);
            this.f3095a++;
            if (!this.f3104j) {
                int i2 = this.f3103i + 1;
                this.f3103i = i2;
                int[] iArr = this.f3099e;
                if (i2 >= iArr.length) {
                    this.f3104j = true;
                    this.f3103i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f3095a) {
            int[] iArr2 = this.f3099e;
            int i5 = iArr2[i];
            int i6 = r4Var.f3904a;
            if (i5 == i6) {
                this.f3101g[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f3100f[i];
            i3++;
        }
        int i7 = this.f3103i;
        int i8 = i7 + 1;
        if (this.f3104j) {
            int[] iArr3 = this.f3099e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f3099e;
        if (i7 >= iArr4.length && this.f3095a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f3099e;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f3099e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f3098d * 2;
            this.f3098d = i10;
            this.f3104j = false;
            this.f3103i = i7 - 1;
            this.f3101g = Arrays.copyOf(this.f3101g, i10);
            this.f3099e = Arrays.copyOf(this.f3099e, this.f3098d);
            this.f3100f = Arrays.copyOf(this.f3100f, this.f3098d);
        }
        this.f3099e[i7] = r4Var.f3904a;
        this.f3101g[i7] = f;
        int[] iArr7 = this.f3100f;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f3102h;
            this.f3102h = i7;
        }
        r4Var.f3912i++;
        r4Var.mo4188a(this.f3096b);
        int i11 = this.f3095a + 1;
        this.f3095a = i11;
        if (!this.f3104j) {
            this.f3103i++;
        }
        int[] iArr8 = this.f3099e;
        if (i11 >= iArr8.length) {
            this.f3104j = true;
        }
        if (this.f3103i >= iArr8.length) {
            this.f3104j = true;
            this.f3103i = iArr8.length - 1;
        }
    }

    /* renamed from: i */
    public final float mo3590i(C1043r4 r4Var, boolean z) {
        int i = this.f3102h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3095a) {
            if (this.f3099e[i] == r4Var.f3904a) {
                if (i == this.f3102h) {
                    this.f3102h = this.f3100f[i];
                } else {
                    int[] iArr = this.f3100f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    r4Var.mo4189b(this.f3096b);
                }
                r4Var.f3912i--;
                this.f3095a--;
                this.f3099e[i] = -1;
                if (this.f3104j) {
                    this.f3103i = i;
                }
                return this.f3101g[i];
            }
            i2++;
            i3 = i;
            i = this.f3100f[i];
        }
        return 0.0f;
    }

    public String toString() {
        int i = this.f3102h;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f3095a) {
            StringBuilder c = C0279ch.m1106c(C0279ch.m1120q(str, " -> "));
            c.append(this.f3101g[i]);
            c.append(" : ");
            StringBuilder c2 = C0279ch.m1106c(c.toString());
            c2.append(this.f3097c.f3338c[this.f3099e[i]]);
            str = c2.toString();
            i = this.f3100f[i];
            i2++;
        }
        return str;
    }
}
