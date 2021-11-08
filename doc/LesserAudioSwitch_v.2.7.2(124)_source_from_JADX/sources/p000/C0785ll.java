package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ll */
public final class C0785ll implements C0890nl {

    /* renamed from: a */
    public final float f3176a;

    public C0785ll(float f) {
        this.f3176a = f;
    }

    /* renamed from: a */
    public float mo3635a(RectF rectF) {
        return this.f3176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0785ll) && this.f3176a == ((C0785ll) obj).f3176a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3176a)});
    }
}
