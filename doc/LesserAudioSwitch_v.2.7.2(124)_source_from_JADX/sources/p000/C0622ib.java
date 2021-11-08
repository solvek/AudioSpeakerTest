package p000;

import android.view.animation.Interpolator;

/* renamed from: ib */
public abstract class C0622ib implements Interpolator {

    /* renamed from: a */
    public final float[] f2676a;

    /* renamed from: b */
    public final float f2677b;

    public C0622ib(float[] fArr) {
        this.f2676a = fArr;
        this.f2677b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2676a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f2677b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f2676a;
        return ((fArr2[min + 1] - fArr2[min]) * f3) + fArr2[min];
    }
}
