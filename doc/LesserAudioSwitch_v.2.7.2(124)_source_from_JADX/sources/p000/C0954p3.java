package p000;

/* renamed from: p3 */
public class C0954p3 extends C1042r3 {

    /* renamed from: c */
    public static volatile C0954p3 f3545c;

    /* renamed from: a */
    public C1042r3 f3546a;

    /* renamed from: b */
    public C1042r3 f3547b;

    public C0954p3() {
        C1001q3 q3Var = new C1001q3();
        this.f3547b = q3Var;
        this.f3546a = q3Var;
    }

    /* renamed from: b */
    public static C0954p3 m2753b() {
        if (f3545c != null) {
            return f3545c;
        }
        synchronized (C0954p3.class) {
            if (f3545c == null) {
                f3545c = new C0954p3();
            }
        }
        return f3545c;
    }

    /* renamed from: a */
    public boolean mo3949a() {
        return this.f3546a.mo3949a();
    }
}
