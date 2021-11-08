package p000;

/* renamed from: x7 */
public class C1346x7<T> {

    /* renamed from: a */
    public final Object[] f5035a;

    /* renamed from: b */
    public int f5036b;

    public C1346x7(int i) {
        if (i > 0) {
            this.f5035a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo5053a() {
        int i = this.f5036b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f5035a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f5036b = i - 1;
        return t;
    }

    /* renamed from: b */
    public boolean mo5054b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f5036b;
            if (i2 >= i) {
                z = false;
                break;
            } else if (this.f5035a[i2] == t) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            Object[] objArr = this.f5035a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f5036b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
