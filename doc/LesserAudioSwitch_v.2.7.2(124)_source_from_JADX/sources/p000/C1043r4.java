package p000;

import java.util.Arrays;

/* renamed from: r4 */
public class C1043r4 {

    /* renamed from: j */
    public static int f3903j = 1;

    /* renamed from: a */
    public int f3904a = -1;

    /* renamed from: b */
    public int f3905b = -1;

    /* renamed from: c */
    public int f3906c = 0;

    /* renamed from: d */
    public float f3907d;

    /* renamed from: e */
    public float[] f3908e = new float[7];

    /* renamed from: f */
    public C1044a f3909f;

    /* renamed from: g */
    public C0804m4[] f3910g = new C0804m4[8];

    /* renamed from: h */
    public int f3911h = 0;

    /* renamed from: i */
    public int f3912i = 0;

    /* renamed from: r4$a */
    public enum C1044a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C1043r4(C1044a aVar) {
        this.f3909f = aVar;
    }

    /* renamed from: a */
    public final void mo4188a(C0804m4 m4Var) {
        int i = 0;
        while (true) {
            int i2 = this.f3911h;
            if (i >= i2) {
                C0804m4[] m4VarArr = this.f3910g;
                if (i2 >= m4VarArr.length) {
                    this.f3910g = (C0804m4[]) Arrays.copyOf(m4VarArr, m4VarArr.length * 2);
                }
                C0804m4[] m4VarArr2 = this.f3910g;
                int i3 = this.f3911h;
                m4VarArr2[i3] = m4Var;
                this.f3911h = i3 + 1;
                return;
            } else if (this.f3910g[i] != m4Var) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo4189b(C0804m4 m4Var) {
        int i = this.f3911h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3910g[i2] == m4Var) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0804m4[] m4VarArr = this.f3910g;
                    int i4 = i2 + i3;
                    m4VarArr[i4] = m4VarArr[i4 + 1];
                }
                this.f3911h--;
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo4190c() {
        this.f3909f = C1044a.UNKNOWN;
        this.f3906c = 0;
        this.f3904a = -1;
        this.f3905b = -1;
        this.f3907d = 0.0f;
        this.f3911h = 0;
        this.f3912i = 0;
    }

    /* renamed from: d */
    public final void mo4191d(C0804m4 m4Var) {
        int i = this.f3911h;
        for (int i2 = 0; i2 < i; i2++) {
            C0804m4[] m4VarArr = this.f3910g;
            C0755l4 l4Var = m4VarArr[i2].f3215c;
            C0804m4 m4Var2 = m4VarArr[i2];
            while (true) {
                int i3 = l4Var.f3102h;
                int i4 = 0;
                while (i3 != -1 && i4 < l4Var.f3095a) {
                    int i5 = l4Var.f3099e[i3];
                    C1043r4 r4Var = m4Var.f3213a;
                    if (i5 == r4Var.f3904a) {
                        float f = l4Var.f3101g[i3];
                        l4Var.mo3590i(r4Var, false);
                        C0755l4 l4Var2 = m4Var.f3215c;
                        int i6 = l4Var2.f3102h;
                        int i7 = 0;
                        while (i6 != -1 && i7 < l4Var2.f3095a) {
                            l4Var.mo3582a(l4Var.f3097c.f3338c[l4Var2.f3099e[i6]], l4Var2.f3101g[i6] * f, false);
                            i6 = l4Var2.f3100f[i6];
                            i7++;
                        }
                        m4Var2.f3214b = (m4Var.f3214b * f) + m4Var2.f3214b;
                    } else {
                        i3 = l4Var.f3100f[i3];
                        i4++;
                    }
                }
            }
        }
        this.f3911h = 0;
    }

    public String toString() {
        return "null";
    }
}
