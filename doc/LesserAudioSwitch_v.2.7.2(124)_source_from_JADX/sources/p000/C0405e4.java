package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000.C0601i4;

/* renamed from: e4 */
public final class C0405e4<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f1958f = new int[0];

    /* renamed from: g */
    public static final Object[] f1959g = new Object[0];

    /* renamed from: h */
    public static Object[] f1960h;

    /* renamed from: i */
    public static int f1961i;

    /* renamed from: j */
    public static Object[] f1962j;

    /* renamed from: k */
    public static int f1963k;

    /* renamed from: b */
    public int[] f1964b = f1958f;

    /* renamed from: c */
    public Object[] f1965c = f1959g;

    /* renamed from: d */
    public int f1966d = 0;

    /* renamed from: e */
    public C0601i4<E, E> f1967e;

    /* renamed from: b */
    public static void m1541b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0405e4.class) {
                if (f1963k < 10) {
                    objArr[0] = f1962j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1962j = objArr;
                    f1963k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0405e4.class) {
                if (f1961i < 10) {
                    objArr[0] = f1960h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1960h = objArr;
                    f1961i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2687a(int i) {
        if (i == 8) {
            synchronized (C0405e4.class) {
                Object[] objArr = f1962j;
                if (objArr != null) {
                    this.f1965c = objArr;
                    f1962j = (Object[]) objArr[0];
                    this.f1964b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1963k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0405e4.class) {
                Object[] objArr2 = f1960h;
                if (objArr2 != null) {
                    this.f1965c = objArr2;
                    f1960h = (Object[]) objArr2[0];
                    this.f1964b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1961i--;
                    return;
                }
            }
        }
        this.f1964b = new int[i];
        this.f1965c = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo2695e();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo2694d(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f1966d;
        int[] iArr = this.f1964b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1965c;
            mo2687a(i5);
            int[] iArr2 = this.f1964b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1965c, 0, objArr.length);
            }
            m1541b(iArr, objArr, this.f1966d);
        }
        int i6 = this.f1966d;
        if (i3 < i6) {
            int[] iArr3 = this.f1964b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1965c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1966d - i3);
        }
        this.f1964b[i3] = i;
        this.f1965c[i3] = e;
        this.f1966d++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f1966d;
        int[] iArr = this.f1964b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1965c;
            mo2687a(size);
            int i = this.f1966d;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f1964b, 0, i);
                System.arraycopy(objArr, 0, this.f1965c, 0, this.f1966d);
            }
            m1541b(iArr, objArr, this.f1966d);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public int mo2690c(Object obj) {
        return obj == null ? mo2695e() : mo2694d(obj, obj.hashCode());
    }

    public void clear() {
        int i = this.f1966d;
        if (i != 0) {
            m1541b(this.f1964b, this.f1965c, i);
            this.f1964b = f1958f;
            this.f1965c = f1959g;
            this.f1966d = 0;
        }
    }

    public boolean contains(Object obj) {
        return mo2690c(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int mo2694d(Object obj, int i) {
        int i2 = this.f1966d;
        if (i2 == 0) {
            return -1;
        }
        int a = C0453f4.m1645a(this.f1964b, i2, i);
        if (a < 0 || obj.equals(this.f1965c[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1964b[i3] == i) {
            if (obj.equals(this.f1965c[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1964b[i4] == i) {
            if (obj.equals(this.f1965c[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: e */
    public final int mo2695e() {
        int i = this.f1966d;
        if (i == 0) {
            return -1;
        }
        int a = C0453f4.m1645a(this.f1964b, i, 0);
        if (a < 0 || this.f1965c[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1964b[i2] == 0) {
            if (this.f1965c[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1964b[i3] == 0) {
            if (this.f1965c[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1966d != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1966d) {
                try {
                    if (!set.contains(this.f1965c[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public E mo2697f(int i) {
        E[] eArr = this.f1965c;
        E e = eArr[i];
        int i2 = this.f1966d;
        if (i2 <= 1) {
            m1541b(this.f1964b, eArr, i2);
            this.f1964b = f1958f;
            this.f1965c = f1959g;
            this.f1966d = 0;
        } else {
            int[] iArr = this.f1964b;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f1966d = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f1965c;
                    System.arraycopy(objArr, i5, objArr, i, this.f1966d - i);
                }
                this.f1965c[this.f1966d] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                mo2687a(i3);
                this.f1966d--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1964b, 0, i);
                    System.arraycopy(eArr, 0, this.f1965c, 0, i);
                }
                int i6 = this.f1966d;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f1964b, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f1965c, i, this.f1966d - i);
                }
            }
        }
        return e;
    }

    public int hashCode() {
        int[] iArr = this.f1964b;
        int i = this.f1966d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public boolean isEmpty() {
        return this.f1966d <= 0;
    }

    public Iterator<E> iterator() {
        if (this.f1967e == null) {
            this.f1967e = new C0364d4(this);
        }
        C0601i4<E, E> i4Var = this.f1967e;
        if (i4Var.f2532b == null) {
            i4Var.f2532b = new C0601i4.C0604c();
        }
        return i4Var.f2532b.iterator();
    }

    public boolean remove(Object obj) {
        int c = mo2690c(obj);
        if (c < 0) {
            return false;
        }
        mo2697f(c);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1966d - 1; i >= 0; i--) {
            if (!collection.contains(this.f1965c[i])) {
                mo2697f(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f1966d;
    }

    public Object[] toArray() {
        int i = this.f1966d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1965c, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1966d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1966d);
        }
        System.arraycopy(this.f1965c, 0, tArr, 0, this.f1966d);
        int length = tArr.length;
        int i = this.f1966d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1966d * 14);
        sb.append('{');
        for (int i = 0; i < this.f1966d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1965c[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
