package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000.C0601i4;

/* renamed from: c4 */
public class C0254c4<K, V> extends C0663j4<K, V> implements Map<K, V> {

    /* renamed from: i */
    public C0601i4<K, V> f1337i;

    /* renamed from: c4$a */
    public class C0255a extends C0601i4<K, V> {
        public C0255a() {
        }

        /* renamed from: a */
        public void mo1687a() {
            C0254c4.this.clear();
        }

        /* renamed from: b */
        public Object mo1688b(int i, int i2) {
            return C0254c4.this.f2826c[(i << 1) + i2];
        }

        /* renamed from: c */
        public Map<K, V> mo1689c() {
            return C0254c4.this;
        }

        /* renamed from: d */
        public int mo1690d() {
            return C0254c4.this.f2827d;
        }

        /* renamed from: e */
        public int mo1691e(Object obj) {
            return C0254c4.this.mo3396e(obj);
        }

        /* renamed from: f */
        public int mo1692f(Object obj) {
            return C0254c4.this.mo3399g(obj);
        }

        /* renamed from: g */
        public void mo1693g(K k, V v) {
            C0254c4.this.put(k, v);
        }

        /* renamed from: h */
        public void mo1694h(int i) {
            C0254c4.this.mo3404i(i);
        }

        /* renamed from: i */
        public V mo1695i(int i, V v) {
            int i2 = (i << 1) + 1;
            V[] vArr = C0254c4.this.f2826c;
            V v2 = vArr[i2];
            vArr[i2] = v;
            return v2;
        }
    }

    public C0254c4() {
    }

    public C0254c4(int i) {
        super(i);
    }

    public C0254c4(C0663j4 j4Var) {
        if (j4Var != null) {
            int i = j4Var.f2827d;
            mo3391b(this.f2827d + i);
            if (this.f2827d != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(j4Var.mo3402h(i2), j4Var.mo3407k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(j4Var.f2825b, 0, this.f2825b, 0, i);
                System.arraycopy(j4Var.f2826c, 0, this.f2826c, 0, i << 1);
                this.f2827d = i;
            }
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C0601i4 l = mo1684l();
        if (l.f2531a == null) {
            l.f2531a = new C0601i4.C0603b();
        }
        return l.f2531a;
    }

    public Set<K> keySet() {
        C0601i4 l = mo1684l();
        if (l.f2532b == null) {
            l.f2532b = new C0601i4.C0604c();
        }
        return l.f2532b;
    }

    /* renamed from: l */
    public final C0601i4<K, V> mo1684l() {
        if (this.f1337i == null) {
            this.f1337i = new C0255a();
        }
        return this.f1337i;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo3391b(map.size() + this.f2827d);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        C0601i4 l = mo1684l();
        if (l.f2533c == null) {
            l.f2533c = new C0601i4.C0606e();
        }
        return l.f2533c;
    }
}
