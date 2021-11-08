package p000;

/* renamed from: g4 */
public class C0518g4<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f2262f = new Object();

    /* renamed from: b */
    public boolean f2263b = false;

    /* renamed from: c */
    public long[] f2264c;

    /* renamed from: d */
    public Object[] f2265d;

    /* renamed from: e */
    public int f2266e;

    public C0518g4() {
        int f = C0453f4.m1650f(10);
        this.f2264c = new long[f];
        this.f2265d = new Object[f];
    }

    /* renamed from: a */
    public void mo2922a(long j, E e) {
        int i = this.f2266e;
        if (i == 0 || j > this.f2264c[i - 1]) {
            if (this.f2263b && i >= this.f2264c.length) {
                mo2926d();
            }
            int i2 = this.f2266e;
            if (i2 >= this.f2264c.length) {
                int f = C0453f4.m1650f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f2264c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f2265d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2264c = jArr;
                this.f2265d = objArr;
            }
            this.f2264c[i2] = j;
            this.f2265d[i2] = e;
            this.f2266e = i2 + 1;
            return;
        }
        mo2929g(j, e);
    }

    /* renamed from: b */
    public void mo2923b() {
        int i = this.f2266e;
        Object[] objArr = this.f2265d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2266e = 0;
        this.f2263b = false;
    }

    /* renamed from: c */
    public C0518g4<E> clone() {
        try {
            C0518g4<E> g4Var = (C0518g4) super.clone();
            g4Var.f2264c = (long[]) this.f2264c.clone();
            g4Var.f2265d = (Object[]) this.f2265d.clone();
            return g4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void mo2926d() {
        int i = this.f2266e;
        long[] jArr = this.f2264c;
        Object[] objArr = this.f2265d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2262f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2263b = false;
        this.f2266e = i2;
    }

    /* renamed from: e */
    public E mo2927e(long j) {
        return mo2928f(j, (Object) null);
    }

    /* renamed from: f */
    public E mo2928f(long j, E e) {
        int b = C0453f4.m1646b(this.f2264c, this.f2266e, j);
        if (b >= 0) {
            E[] eArr = this.f2265d;
            if (eArr[b] != f2262f) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: g */
    public void mo2929g(long j, E e) {
        int b = C0453f4.m1646b(this.f2264c, this.f2266e, j);
        if (b >= 0) {
            this.f2265d[b] = e;
            return;
        }
        int i = b ^ -1;
        int i2 = this.f2266e;
        if (i < i2) {
            Object[] objArr = this.f2265d;
            if (objArr[i] == f2262f) {
                this.f2264c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f2263b && i2 >= this.f2264c.length) {
            mo2926d();
            i = C0453f4.m1646b(this.f2264c, this.f2266e, j) ^ -1;
        }
        int i3 = this.f2266e;
        if (i3 >= this.f2264c.length) {
            int f = C0453f4.m1650f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f2264c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2265d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2264c = jArr;
            this.f2265d = objArr2;
        }
        int i4 = this.f2266e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f2264c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f2265d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f2266e - i);
        }
        this.f2264c[i] = j;
        this.f2265d[i] = e;
        this.f2266e++;
    }

    /* renamed from: h */
    public int mo2930h() {
        if (this.f2263b) {
            mo2926d();
        }
        return this.f2266e;
    }

    /* renamed from: i */
    public E mo2931i(int i) {
        if (this.f2263b) {
            mo2926d();
        }
        return this.f2265d[i];
    }

    public String toString() {
        if (mo2930h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2266e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2266e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f2263b) {
                mo2926d();
            }
            sb.append(this.f2264c[i]);
            sb.append('=');
            Object i2 = mo2931i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
