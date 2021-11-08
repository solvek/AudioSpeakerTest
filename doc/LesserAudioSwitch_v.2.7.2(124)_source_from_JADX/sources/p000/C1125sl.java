package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: sl */
public final class C1125sl implements C0890nl {

    /* renamed from: a */
    public final float f4272a;

    public C1125sl(float f) {
        this.f4272a = f;
    }

    /* renamed from: a */
    public float mo3635a(RectF rectF) {
        return rectF.height() * this.f4272a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1125sl) && this.f4272a == ((C1125sl) obj).f4272a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4272a)});
    }
}
