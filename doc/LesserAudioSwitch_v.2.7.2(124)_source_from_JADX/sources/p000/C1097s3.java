package p000;

import java.util.HashMap;
import p000.C1141t3;

/* renamed from: s3 */
public class C1097s3<K, V> extends C1141t3<K, V> {

    /* renamed from: f */
    public HashMap<K, C1141t3.C1144c<K, V>> f4156f = new HashMap<>();

    /* renamed from: a */
    public C1141t3.C1144c<K, V> mo4419a(K k) {
        return this.f4156f.get(k);
    }

    public boolean contains(K k) {
        return this.f4156f.containsKey(k);
    }

    /* renamed from: d */
    public V mo4421d(K k, V v) {
        C1141t3.C1144c cVar = this.f4156f.get(k);
        if (cVar != null) {
            return cVar.f4354c;
        }
        this.f4156f.put(k, mo4603c(k, v));
        return null;
    }

    /* renamed from: e */
    public V mo4422e(K k) {
        V e = super.mo4422e(k);
        this.f4156f.remove(k);
        return e;
    }
}
