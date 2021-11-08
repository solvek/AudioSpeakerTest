package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: j4 */
public class C0663j4<K, V> {

    /* renamed from: e */
    public static Object[] f2821e;

    /* renamed from: f */
    public static int f2822f;

    /* renamed from: g */
    public static Object[] f2823g;

    /* renamed from: h */
    public static int f2824h;

    /* renamed from: b */
    public int[] f2825b;

    /* renamed from: c */
    public Object[] f2826c;

    /* renamed from: d */
    public int f2827d;

    public C0663j4() {
        this.f2825b = C0453f4.f2093a;
        this.f2826c = C0453f4.f2095c;
        this.f2827d = 0;
    }

    public C0663j4(int i) {
        if (i == 0) {
            this.f2825b = C0453f4.f2093a;
            this.f2826c = C0453f4.f2095c;
        } else {
            mo3390a(i);
        }
        this.f2827d = 0;
    }

    /* renamed from: c */
    public static void m2105c(int[] iArr, Object[] objArr, int i) {
        Class<C0663j4> cls = C0663j4.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f2824h < 10) {
                    objArr[0] = f2823g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2823g = objArr;
                    f2824h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f2822f < 10) {
                    objArr[0] = f2821e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2821e = objArr;
                    f2822f++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo3390a(int i) {
        Class<C0663j4> cls = C0663j4.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f2823g;
                if (objArr != null) {
                    this.f2826c = objArr;
                    f2823g = (Object[]) objArr[0];
                    this.f2825b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2824h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f2821e;
                if (objArr2 != null) {
                    this.f2826c = objArr2;
                    f2821e = (Object[]) objArr2[0];
                    this.f2825b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2822f--;
                    return;
                }
            }
        }
        this.f2825b = new int[i];
        this.f2826c = new Object[(i << 1)];
    }

    /* renamed from: b */
    public void mo3391b(int i) {
        int i2 = this.f2827d;
        int[] iArr = this.f2825b;
        if (iArr.length < i) {
            Object[] objArr = this.f2826c;
            mo3390a(i);
            if (this.f2827d > 0) {
                System.arraycopy(iArr, 0, this.f2825b, 0, i2);
                System.arraycopy(objArr, 0, this.f2826c, 0, i2 << 1);
            }
            m2105c(iArr, objArr, i2);
        }
        if (this.f2827d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f2827d;
        if (i > 0) {
            int[] iArr = this.f2825b;
            Object[] objArr = this.f2826c;
            this.f2825b = C0453f4.f2093a;
            this.f2826c = C0453f4.f2095c;
            this.f2827d = 0;
            m2105c(iArr, objArr, i);
        }
        if (this.f2827d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo3396e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo3399g(obj) >= 0;
    }

    /* renamed from: d */
    public int mo3395d(Object obj, int i) {
        int i2 = this.f2827d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = C0453f4.m1645a(this.f2825b, i2, i);
            if (a < 0 || obj.equals(this.f2826c[a << 1])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.f2825b[i3] == i) {
                if (obj.equals(this.f2826c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.f2825b[i4] == i) {
                if (obj.equals(this.f2826c[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return i3 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public int mo3396e(Object obj) {
        return obj == null ? mo3398f() : mo3395d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0663j4) {
            C0663j4 j4Var = (C0663j4) obj;
            if (this.f2827d != j4Var.f2827d) {
                return false;
            }
            int i = 0;
            while (i < this.f2827d) {
                try {
                    Object h = mo3402h(i);
                    Object k = mo3407k(i);
                    Object obj2 = j4Var.get(h);
                    if (k == null) {
                        if (obj2 != null || !j4Var.containsKey(h)) {
                            return false;
                        }
                    } else if (!k.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f2827d != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f2827d) {
                try {
                    Object h2 = mo3402h(i2);
                    Object k2 = mo3407k(i2);
                    Object obj3 = map.get(h2);
                    if (k2 == null) {
                        if (obj3 != null || !map.containsKey(h2)) {
                            return false;
                        }
                    } else if (!k2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo3398f() {
        int i = this.f2827d;
        if (i == 0) {
            return -1;
        }
        try {
            int a = C0453f4.m1645a(this.f2825b, i, 0);
            if (a < 0 || this.f2826c[a << 1] == null) {
                return a;
            }
            int i2 = a + 1;
            while (i2 < i && this.f2825b[i2] == 0) {
                if (this.f2826c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a - 1;
            while (i3 >= 0 && this.f2825b[i3] == 0) {
                if (this.f2826c[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return i2 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public int mo3399g(Object obj) {
        int i = this.f2827d * 2;
        Object[] objArr = this.f2826c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int e = mo3396e(obj);
        return e >= 0 ? this.f2826c[(e << 1) + 1] : v;
    }

    /* renamed from: h */
    public K mo3402h(int i) {
        return this.f2826c[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f2825b;
        Object[] objArr = this.f2826c;
        int i = this.f2827d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public V mo3404i(int i) {
        V[] vArr = this.f2826c;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f2827d;
        int i4 = 0;
        if (i3 <= 1) {
            m2105c(this.f2825b, vArr, i3);
            this.f2825b = C0453f4.f2093a;
            this.f2826c = C0453f4.f2095c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2825b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f2826c;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f2826c;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                mo3390a(i6);
                if (i3 == this.f2827d) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f2825b, 0, i);
                        System.arraycopy(vArr, 0, this.f2826c, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f2825b, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f2826c, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f2827d) {
            this.f2827d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean isEmpty() {
        return this.f2827d <= 0;
    }

    /* renamed from: j */
    public V mo3406j(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f2826c;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: k */
    public V mo3407k(int i) {
        return this.f2826c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f2827d;
        if (k == null) {
            i2 = mo3398f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo3395d(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f2826c;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.f2825b;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f2826c;
            mo3390a(i6);
            if (i3 == this.f2827d) {
                int[] iArr2 = this.f2825b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f2826c, 0, objArr.length);
                }
                m2105c(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2825b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f2826c;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f2827d - i5) << 1);
        }
        int i8 = this.f2827d;
        if (i3 == i8) {
            int[] iArr4 = this.f2825b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f2826c;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f2827d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, (Object) null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int e = mo3396e(obj);
        if (e >= 0) {
            return mo3404i(e);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e = mo3396e(obj);
        if (e < 0) {
            return false;
        }
        Object k = mo3407k(e);
        if (obj2 != k && (obj2 == null || !obj2.equals(k))) {
            return false;
        }
        mo3404i(e);
        return true;
    }

    public V replace(K k, V v) {
        int e = mo3396e(k);
        if (e >= 0) {
            return mo3406j(e, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int e = mo3396e(k);
        if (e < 0) {
            return false;
        }
        V k2 = mo3407k(e);
        if (k2 != v && (v == null || !v.equals(k2))) {
            return false;
        }
        mo3406j(e, v2);
        return true;
    }

    public int size() {
        return this.f2827d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2827d * 28);
        sb.append('{');
        for (int i = 0; i < this.f2827d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h = mo3402h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object k = mo3407k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
