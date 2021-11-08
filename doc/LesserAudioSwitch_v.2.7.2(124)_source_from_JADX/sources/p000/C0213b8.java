package p000;

/* renamed from: b8 */
public final class C0213b8 {

    /* renamed from: a */
    public final Object f1255a;

    public C0213b8(Object obj) {
        this.f1255a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0213b8.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f1255a;
        Object obj3 = ((C0213b8) obj).f1255a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f1255a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder c = C0279ch.m1106c("DisplayCutoutCompat{");
        c.append(this.f1255a);
        c.append("}");
        return c.toString();
    }
}
