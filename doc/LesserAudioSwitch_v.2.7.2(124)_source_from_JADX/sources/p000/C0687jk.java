package p000;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: jk */
public class C0687jk implements TypeEvaluator<Float> {

    /* renamed from: a */
    public FloatEvaluator f2908a = new FloatEvaluator();

    public C0687jk(C0634ik ikVar) {
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.f2908a.evaluate(f, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
