package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: i4 */
public abstract class C0601i4<K, V> {

    /* renamed from: a */
    public C0601i4<K, V>.C0201b f2531a;

    /* renamed from: b */
    public C0601i4<K, V>.C0243c f2532b;

    /* renamed from: c */
    public C0601i4<K, V>.C0398e f2533c;

    /* renamed from: i4$a */
    public final class C0602a<T> implements Iterator<T> {

        /* renamed from: b */
        public final int f2534b;

        /* renamed from: c */
        public int f2535c;

        /* renamed from: d */
        public int f2536d;

        /* renamed from: e */
        public boolean f2537e = false;

        public C0602a(int i) {
            this.f2534b = i;
            this.f2535c = C0601i4.this.mo1690d();
        }

        public boolean hasNext() {
            return this.f2536d < this.f2535c;
        }

        public T next() {
            if (hasNext()) {
                T b = C0601i4.this.mo1688b(this.f2536d, this.f2534b);
                this.f2536d++;
                this.f2537e = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f2537e) {
                int i = this.f2536d - 1;
                this.f2536d = i;
                this.f2535c--;
                this.f2537e = false;
                C0601i4.this.mo1694h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: i4$b */
    public final class C0603b implements Set<Map.Entry<K, V>> {
        public C0603b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C0601i4.this.mo1690d();
            for (Map.Entry entry : collection) {
                C0601i4.this.mo1693g(entry.getKey(), entry.getValue());
            }
            return d != C0601i4.this.mo1690d();
        }

        public void clear() {
            C0601i4.this.mo1687a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C0601i4.this.mo1691e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C0453f4.m1647c(C0601i4.this.mo1688b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0601i4.m1915j(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C0601i4.this.mo1690d() - 1; d >= 0; d--) {
                Object b = C0601i4.this.mo1688b(d, 0);
                Object b2 = C0601i4.this.mo1688b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C0601i4.this.mo1690d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0605d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0601i4.this.mo1690d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i4$c */
    public final class C0604c implements Set<K> {
        public C0604c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0601i4.this.mo1687a();
        }

        public boolean contains(Object obj) {
            return C0601i4.this.mo1691e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map c = C0601i4.this.mo1689c();
            for (Object containsKey : collection) {
                if (!c.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0601i4.m1915j(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C0601i4.this.mo1690d() - 1; d >= 0; d--) {
                Object b = C0601i4.this.mo1688b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C0601i4.this.mo1690d() == 0;
        }

        public Iterator<K> iterator() {
            return new C0602a(0);
        }

        public boolean remove(Object obj) {
            int e = C0601i4.this.mo1691e(obj);
            if (e < 0) {
                return false;
            }
            C0601i4.this.mo1694h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map c = C0601i4.this.mo1689c();
            int size = c.size();
            for (Object remove : collection) {
                c.remove(remove);
            }
            return size != c.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return C0601i4.m1916k(C0601i4.this.mo1689c(), collection);
        }

        public int size() {
            return C0601i4.this.mo1690d();
        }

        public Object[] toArray() {
            return C0601i4.this.mo3124l(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0601i4.this.mo3125m(tArr, 0);
        }
    }

    /* renamed from: i4$d */
    public final class C0605d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f2541b;

        /* renamed from: c */
        public int f2542c;

        /* renamed from: d */
        public boolean f2543d = false;

        public C0605d() {
            this.f2541b = C0601i4.this.mo1690d() - 1;
            this.f2542c = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f2543d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C0453f4.m1647c(entry.getKey(), C0601i4.this.mo1688b(this.f2542c, 0)) && C0453f4.m1647c(entry.getValue(), C0601i4.this.mo1688b(this.f2542c, 1));
            }
        }

        public K getKey() {
            if (this.f2543d) {
                return C0601i4.this.mo1688b(this.f2542c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f2543d) {
                return C0601i4.this.mo1688b(this.f2542c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f2542c < this.f2541b;
        }

        public int hashCode() {
            if (this.f2543d) {
                int i = 0;
                Object b = C0601i4.this.mo1688b(this.f2542c, 0);
                Object b2 = C0601i4.this.mo1688b(this.f2542c, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.f2542c++;
                this.f2543d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f2543d) {
                C0601i4.this.mo1694h(this.f2542c);
                this.f2542c--;
                this.f2541b--;
                this.f2543d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f2543d) {
                return C0601i4.this.mo1695i(this.f2542c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: i4$e */
    public final class C0606e implements Collection<V> {
        public C0606e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0601i4.this.mo1687a();
        }

        public boolean contains(Object obj) {
            return C0601i4.this.mo1692f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0601i4.this.mo1690d() == 0;
        }

        public Iterator<V> iterator() {
            return new C0602a(1);
        }

        public boolean remove(Object obj) {
            int f = C0601i4.this.mo1692f(obj);
            if (f < 0) {
                return false;
            }
            C0601i4.this.mo1694h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C0601i4.this.mo1690d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C0601i4.this.mo1688b(i, 1))) {
                    C0601i4.this.mo1694h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C0601i4.this.mo1690d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C0601i4.this.mo1688b(i, 1))) {
                    C0601i4.this.mo1694h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0601i4.this.mo1690d();
        }

        public Object[] toArray() {
            return C0601i4.this.mo3124l(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0601i4.this.mo3125m(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <T> boolean m1915j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static <K, V> boolean m1916k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo1687a();

    /* renamed from: b */
    public abstract Object mo1688b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo1689c();

    /* renamed from: d */
    public abstract int mo1690d();

    /* renamed from: e */
    public abstract int mo1691e(Object obj);

    /* renamed from: f */
    public abstract int mo1692f(Object obj);

    /* renamed from: g */
    public abstract void mo1693g(K k, V v);

    /* renamed from: h */
    public abstract void mo1694h(int i);

    /* renamed from: i */
    public abstract V mo1695i(int i, V v);

    /* renamed from: l */
    public Object[] mo3124l(int i) {
        int d = mo1690d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo1688b(i2, i);
        }
        return objArr;
    }

    /* renamed from: m */
    public <T> T[] mo3125m(T[] tArr, int i) {
        int d = mo1690d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo1688b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
