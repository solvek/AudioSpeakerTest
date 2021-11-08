package p000;

import android.os.IBinder;

/* renamed from: jf */
public class C0682jf implements C0779lf {

    /* renamed from: a */
    public final IBinder f2902a;

    public C0682jf(IBinder iBinder) {
        this.f2902a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0682jf) && ((C0682jf) obj).f2902a.equals(this.f2902a);
    }

    public int hashCode() {
        return this.f2902a.hashCode();
    }
}
