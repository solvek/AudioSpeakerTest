package p000;

/* renamed from: o6 */
public final class C0916o6 {

    /* renamed from: e */
    public static final C0916o6 f3474e = new C0916o6(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3475a;

    /* renamed from: b */
    public final int f3476b;

    /* renamed from: c */
    public final int f3477c;

    /* renamed from: d */
    public final int f3478d;

    public C0916o6(int i, int i2, int i3, int i4) {
        this.f3475a = i;
        this.f3476b = i2;
        this.f3477c = i3;
        this.f3478d = i4;
    }

    /* renamed from: a */
    public static C0916o6 m2670a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f3474e : new C0916o6(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0916o6.class != obj.getClass()) {
            return false;
        }
        C0916o6 o6Var = (C0916o6) obj;
        return this.f3478d == o6Var.f3478d && this.f3475a == o6Var.f3475a && this.f3477c == o6Var.f3477c && this.f3476b == o6Var.f3476b;
    }

    public int hashCode() {
        return (((((this.f3475a * 31) + this.f3476b) * 31) + this.f3477c) * 31) + this.f3478d;
    }

    public String toString() {
        StringBuilder c = C0279ch.m1106c("Insets{left=");
        c.append(this.f3475a);
        c.append(", top=");
        c.append(this.f3476b);
        c.append(", right=");
        c.append(this.f3477c);
        c.append(", bottom=");
        c.append(this.f3478d);
        c.append('}');
        return c.toString();
    }
}
