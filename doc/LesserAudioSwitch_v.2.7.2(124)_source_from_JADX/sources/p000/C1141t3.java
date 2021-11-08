package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: t3 */
public class C1141t3<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public C1144c<K, V> f4349b;

    /* renamed from: c */
    public C1144c<K, V> f4350c;

    /* renamed from: d */
    public WeakHashMap<C1147f<K, V>, Boolean> f4351d = new WeakHashMap<>();

    /* renamed from: e */
    public int f4352e = 0;

    /* renamed from: t3$a */
    public static class C1142a<K, V> extends C1146e<K, V> {
        public C1142a(C1144c<K, V> cVar, C1144c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C1144c<K, V> mo4608b(C1144c<K, V> cVar) {
            return cVar.f4356e;
        }

        /* renamed from: c */
        public C1144c<K, V> mo4609c(C1144c<K, V> cVar) {
            return cVar.f4355d;
        }
    }

    /* renamed from: t3$b */
    public static class C1143b<K, V> extends C1146e<K, V> {
        public C1143b(C1144c<K, V> cVar, C1144c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C1144c<K, V> mo4608b(C1144c<K, V> cVar) {
            return cVar.f4355d;
        }

        /* renamed from: c */
        public C1144c<K, V> mo4609c(C1144c<K, V> cVar) {
            return cVar.f4356e;
        }
    }

    /* renamed from: t3$c */
    public static class C1144c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f4353b;

        /* renamed from: c */
        public final V f4354c;

        /* renamed from: d */
        public C1144c<K, V> f4355d;

        /* renamed from: e */
        public C1144c<K, V> f4356e;

        public C1144c(K k, V v) {
            this.f4353b = k;
            this.f4354c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1144c)) {
                return false;
            }
            C1144c cVar = (C1144c) obj;
            return this.f4353b.equals(cVar.f4353b) && this.f4354c.equals(cVar.f4354c);
        }

        public K getKey() {
            return this.f4353b;
        }

        public V getValue() {
            return this.f4354c;
        }

        public int hashCode() {
            return this.f4353b.hashCode() ^ this.f4354c.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f4353b + "=" + this.f4354c;
        }
    }

    /* renamed from: t3$d */
    public class C1145d implements Iterator<Map.Entry<K, V>>, C1147f<K, V> {

        /* renamed from: b */
        public C1144c<K, V> f4357b;

        /* renamed from: c */
        public boolean f4358c = true;

        public C1145d() {
        }

        /* renamed from: a */
        public void mo4616a(C1144c<K, V> cVar) {
            C1144c<K, V> cVar2 = this.f4357b;
            if (cVar == cVar2) {
                C1144c<K, V> cVar3 = cVar2.f4356e;
                this.f4357b = cVar3;
                this.f4358c = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f4358c) {
                return C1141t3.this.f4349b != null;
            }
            C1144c<K, V> cVar = this.f4357b;
            return (cVar == null || cVar.f4355d == null) ? false : true;
        }

        public Object next() {
            C1144c<K, V> cVar;
            if (this.f4358c) {
                this.f4358c = false;
                cVar = C1141t3.this.f4349b;
            } else {
                C1144c<K, V> cVar2 = this.f4357b;
                cVar = cVar2 != null ? cVar2.f4355d : null;
            }
            this.f4357b = cVar;
            return cVar;
        }
    }

    /* renamed from: t3$e */
    public static abstract class C1146e<K, V> implements Iterator<Map.Entry<K, V>>, C1147f<K, V> {

        /* renamed from: b */
        public C1144c<K, V> f4360b;

        /* renamed from: c */
        public C1144c<K, V> f4361c;

        public C1146e(C1144c<K, V> cVar, C1144c<K, V> cVar2) {
            this.f4360b = cVar2;
            this.f4361c = cVar;
        }

        /* renamed from: a */
        public void mo4616a(C1144c<K, V> cVar) {
            C1144c<K, V> cVar2 = null;
            if (this.f4360b == cVar && cVar == this.f4361c) {
                this.f4361c = null;
                this.f4360b = null;
            }
            C1144c<K, V> cVar3 = this.f4360b;
            if (cVar3 == cVar) {
                this.f4360b = mo4608b(cVar3);
            }
            C1144c<K, V> cVar4 = this.f4361c;
            if (cVar4 == cVar) {
                C1144c<K, V> cVar5 = this.f4360b;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = mo4609c(cVar4);
                }
                this.f4361c = cVar2;
            }
        }

        /* renamed from: b */
        public abstract C1144c<K, V> mo4608b(C1144c<K, V> cVar);

        /* renamed from: c */
        public abstract C1144c<K, V> mo4609c(C1144c<K, V> cVar);

        public boolean hasNext() {
            return this.f4361c != null;
        }

        public Object next() {
            C1144c<K, V> cVar = this.f4361c;
            C1144c<K, V> cVar2 = this.f4360b;
            this.f4361c = (cVar == cVar2 || cVar2 == null) ? null : mo4609c(cVar);
            return cVar;
        }
    }

    /* renamed from: t3$f */
    public interface C1147f<K, V> {
        /* renamed from: a */
        void mo4616a(C1144c<K, V> cVar);
    }

    /* renamed from: a */
    public C1144c<K, V> mo4419a(K k) {
        C1144c<K, V> cVar = this.f4349b;
        while (cVar != null && !cVar.f4353b.equals(k)) {
            cVar = cVar.f4355d;
        }
        return cVar;
    }

    /* renamed from: b */
    public C1141t3<K, V>.C0355d mo4602b() {
        C1141t3<K, V>.C0355d dVar = new C1145d();
        this.f4351d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: c */
    public C1144c<K, V> mo4603c(K k, V v) {
        C1144c<K, V> cVar = new C1144c<>(k, v);
        this.f4352e++;
        C1144c<K, V> cVar2 = this.f4350c;
        if (cVar2 == null) {
            this.f4349b = cVar;
        } else {
            cVar2.f4355d = cVar;
            cVar.f4356e = cVar2;
        }
        this.f4350c = cVar;
        return cVar;
    }

    /* renamed from: d */
    public V mo4421d(K k, V v) {
        C1144c a = mo4419a(k);
        if (a != null) {
            return a.f4354c;
        }
        mo4603c(k, v);
        return null;
    }

    /* renamed from: e */
    public V mo4422e(K k) {
        C1144c a = mo4419a(k);
        if (a == null) {
            return null;
        }
        this.f4352e--;
        if (!this.f4351d.isEmpty()) {
            for (C1147f<K, V> a2 : this.f4351d.keySet()) {
                a2.mo4616a(a);
            }
        }
        C1144c<K, V> cVar = a.f4356e;
        C1144c<K, V> cVar2 = a.f4355d;
        if (cVar != null) {
            cVar.f4355d = cVar2;
        } else {
            this.f4349b = cVar2;
        }
        C1144c<K, V> cVar3 = a.f4355d;
        if (cVar3 != null) {
            cVar3.f4356e = cVar;
        } else {
            this.f4350c = cVar;
        }
        a.f4355d = null;
        a.f4356e = null;
        return a.f4354c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((p000.C1141t3.C1146e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p000.C1141t3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t3 r7 = (p000.C1141t3) r7
            int r1 = r6.f4352e
            int r3 = r7.f4352e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            t3$e r3 = (p000.C1141t3.C1146e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            t3$e r4 = (p000.C1141t3.C1146e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            t3$e r7 = (p000.C1141t3.C1146e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1141t3.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C1146e eVar = (C1146e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C1142a aVar = new C1142a(this.f4349b, this.f4350c);
        this.f4351d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder c = C0279ch.m1106c("[");
        Iterator it = iterator();
        while (true) {
            C1146e eVar = (C1146e) it;
            if (eVar.hasNext()) {
                c.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    c.append(", ");
                }
            } else {
                c.append("]");
                return c.toString();
            }
        }
    }
}
