package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: ge */
public class C0533ge<T> extends Property<T, Float> {

    /* renamed from: a */
    public final Property<T, PointF> f2313a;

    /* renamed from: b */
    public final PathMeasure f2314b;

    /* renamed from: c */
    public final float f2315c;

    /* renamed from: d */
    public final float[] f2316d = new float[2];

    /* renamed from: e */
    public final PointF f2317e = new PointF();

    /* renamed from: f */
    public float f2318f;

    public C0533ge(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f2313a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f2314b = pathMeasure;
        this.f2315c = pathMeasure.getLength();
    }

    public Object get(Object obj) {
        return Float.valueOf(this.f2318f);
    }

    public void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.f2318f = f.floatValue();
        this.f2314b.getPosTan(f.floatValue() * this.f2315c, this.f2316d, (float[]) null);
        PointF pointF = this.f2317e;
        float[] fArr = this.f2316d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f2313a.set(obj, pointF);
    }
}
