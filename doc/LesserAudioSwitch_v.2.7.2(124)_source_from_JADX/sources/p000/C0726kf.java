package p000;

import android.view.View;
import android.view.WindowId;

/* renamed from: kf */
public class C0726kf implements C0779lf {

    /* renamed from: a */
    public final WindowId f3001a;

    public C0726kf(View view) {
        this.f3001a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0726kf) && ((C0726kf) obj).f3001a.equals(this.f3001a);
    }

    public int hashCode() {
        return this.f3001a.hashCode();
    }
}
