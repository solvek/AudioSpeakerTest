package p000;

/* renamed from: q4 */
public class C1003q4<T> {

    /* renamed from: a */
    public final Object[] f3773a;

    /* renamed from: b */
    public int f3774b;

    public C1003q4(int i) {
        if (i > 0) {
            this.f3773a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo4065a() {
        int i = this.f3774b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f3773a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f3774b = i - 1;
        return t;
    }

    /* renamed from: b */
    public boolean mo4066b(T t) {
        int i = this.f3774b;
        Object[] objArr = this.f3773a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f3774b = i + 1;
        return true;
    }
}
