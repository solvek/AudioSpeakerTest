package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ml */
public final class C0835ml implements C0890nl {

    /* renamed from: a */
    public final C0890nl f3292a;

    /* renamed from: b */
    public final float f3293b;

    public C0835ml(float f, C0890nl nlVar) {
        while (nlVar instanceof C0835ml) {
            nlVar = ((C0835ml) nlVar).f3292a;
            f += ((C0835ml) nlVar).f3293b;
        }
        this.f3292a = nlVar;
        this.f3293b = f;
    }

    /* renamed from: a */
    public float mo3635a(RectF rectF) {
        return Math.max(0.0f, this.f3292a.mo3635a(rectF) + this.f3293b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0835ml)) {
            return false;
        }
        C0835ml mlVar = (C0835ml) obj;
        return this.f3292a.equals(mlVar.f3292a) && this.f3293b == mlVar.f3293b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3292a, Float.valueOf(this.f3293b)});
    }
}
