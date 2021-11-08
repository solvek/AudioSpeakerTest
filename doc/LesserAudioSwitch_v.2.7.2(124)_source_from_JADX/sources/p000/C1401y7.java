package p000;

/* renamed from: y7 */
public class C1401y7<T> extends C1346x7<T> {

    /* renamed from: c */
    public final Object f5163c = new Object();

    public C1401y7(int i) {
        super(i);
    }

    /* renamed from: a */
    public T mo5053a() {
        T a;
        synchronized (this.f5163c) {
            a = super.mo5053a();
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo5054b(T t) {
        boolean b;
        synchronized (this.f5163c) {
            b = super.mo5054b(t);
        }
        return b;
    }
}
