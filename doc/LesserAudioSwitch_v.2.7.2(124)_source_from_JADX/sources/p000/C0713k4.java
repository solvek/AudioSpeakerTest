package p000;

/* renamed from: k4 */
public class C0713k4<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f2975f = new Object();

    /* renamed from: b */
    public boolean f2976b;

    /* renamed from: c */
    public int[] f2977c;

    /* renamed from: d */
    public Object[] f2978d;

    /* renamed from: e */
    public int f2979e;

    public C0713k4() {
        this(10);
    }

    public C0713k4(int i) {
        this.f2976b = false;
        if (i == 0) {
            this.f2977c = C0453f4.f2093a;
            this.f2978d = C0453f4.f2095c;
            return;
        }
        int e = C0453f4.m1649e(i);
        this.f2977c = new int[e];
        this.f2978d = new Object[e];
    }

    /* renamed from: a */
    public void mo3514a(int i, E e) {
        int i2 = this.f2979e;
        if (i2 == 0 || i > this.f2977c[i2 - 1]) {
            if (this.f2976b && i2 >= this.f2977c.length) {
                mo3516c();
            }
            int i3 = this.f2979e;
            if (i3 >= this.f2977c.length) {
                int e2 = C0453f4.m1649e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f2977c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2978d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2977c = iArr;
                this.f2978d = objArr;
            }
            this.f2977c[i3] = i;
            this.f2978d[i3] = e;
            this.f2979e = i3 + 1;
            return;
        }
        mo3521g(i, e);
    }

    /* renamed from: b */
    public C0713k4<E> clone() {
        try {
            C0713k4<E> k4Var = (C0713k4) super.clone();
            k4Var.f2977c = (int[]) this.f2977c.clone();
            k4Var.f2978d = (Object[]) this.f2978d.clone();
            return k4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final void mo3516c() {
        int i = this.f2979e;
        int[] iArr = this.f2977c;
        Object[] objArr = this.f2978d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2975f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2976b = false;
        this.f2979e = i2;
    }

    /* renamed from: d */
    public E mo3518d(int i) {
        return mo3519e(i, (Object) null);
    }

    /* renamed from: e */
    public E mo3519e(int i, E e) {
        int a = C0453f4.m1645a(this.f2977c, this.f2979e, i);
        if (a >= 0) {
            E[] eArr = this.f2978d;
            if (eArr[a] != f2975f) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: f */
    public int mo3520f(int i) {
        if (this.f2976b) {
            mo3516c();
        }
        return this.f2977c[i];
    }

    /* renamed from: g */
    public void mo3521g(int i, E e) {
        int a = C0453f4.m1645a(this.f2977c, this.f2979e, i);
        if (a >= 0) {
            this.f2978d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        int i3 = this.f2979e;
        if (i2 < i3) {
            Object[] objArr = this.f2978d;
            if (objArr[i2] == f2975f) {
                this.f2977c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f2976b && i3 >= this.f2977c.length) {
            mo3516c();
            i2 = C0453f4.m1645a(this.f2977c, this.f2979e, i) ^ -1;
        }
        int i4 = this.f2979e;
        if (i4 >= this.f2977c.length) {
            int e2 = C0453f4.m1649e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f2977c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2978d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2977c = iArr;
            this.f2978d = objArr2;
        }
        int i5 = this.f2979e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f2977c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2978d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2979e - i2);
        }
        this.f2977c[i2] = i;
        this.f2978d[i2] = e;
        this.f2979e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f2978d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3522h(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f2977c
            int r1 = r3.f2979e
            int r4 = p000.C0453f4.m1645a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f2978d
            r1 = r0[r4]
            java.lang.Object r2 = f2975f
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f2976b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0713k4.mo3522h(int):void");
    }

    /* renamed from: i */
    public int mo3523i() {
        if (this.f2976b) {
            mo3516c();
        }
        return this.f2979e;
    }

    /* renamed from: j */
    public E mo3524j(int i) {
        if (this.f2976b) {
            mo3516c();
        }
        return this.f2978d[i];
    }

    public String toString() {
        if (mo3523i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2979e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2979e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo3520f(i));
            sb.append('=');
            Object j = mo3524j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
