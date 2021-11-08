package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: qf */
public class C1017qf implements Interpolator {

    /* renamed from: a */
    public float[] f3825a;

    /* renamed from: b */
    public float[] f3826b;

    public C1017qf(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray j = C0806m6.m2449j(context.getResources(), context.getTheme(), attributeSet, C0829mf.f3284l);
        if (C0806m6.m2447h(xmlPullParser, "pathData")) {
            String d = C0806m6.m2443d(j, xmlPullParser, "pathData", 4);
            Path p = C1344x5.m3771p(d);
            if (p != null) {
                mo4083a(p);
            } else {
                throw new InflateException(C0279ch.m1120q("The path is null, which is created from ", d));
            }
        } else if (!C0806m6.m2447h(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0806m6.m2447h(xmlPullParser, "controlY1")) {
            float f = !C0806m6.m2447h(xmlPullParser, "controlX1") ? 0.0f : j.getFloat(0, 0.0f);
            float f2 = !C0806m6.m2447h(xmlPullParser, "controlY1") ? 0.0f : j.getFloat(1, 0.0f);
            boolean h = C0806m6.m2447h(xmlPullParser, "controlX2");
            if (h != C0806m6.m2447h(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!h) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(f, f2, 1.0f, 1.0f);
                mo4083a(path);
            } else {
                float f3 = !C0806m6.m2447h(xmlPullParser, "controlX2") ? 0.0f : j.getFloat(2, 0.0f);
                float f4 = !C0806m6.m2447h(xmlPullParser, "controlY2") ? 0.0f : j.getFloat(3, 0.0f);
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                mo4083a(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        j.recycle();
    }

    /* renamed from: a */
    public final void mo4083a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f3825a = new float[min];
            this.f3826b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f3825a[i2] = fArr[0];
                this.f3826b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f3825a[0])) <= 1.0E-5d && ((double) Math.abs(this.f3826b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f3825a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f3826b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f3825a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder c = C0279ch.m1106c("The Path must start at (0,0) and end at (1,1) start: ");
            c.append(this.f3825a[0]);
            c.append(",");
            c.append(this.f3826b[0]);
            c.append(" end:");
            int i6 = min - 1;
            c.append(this.f3825a[i6]);
            c.append(",");
            c.append(this.f3826b[i6]);
            throw new IllegalArgumentException(c.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f3825a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3825a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f3825a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f3826b[i];
        }
        float[] fArr2 = this.f3826b;
        float f3 = fArr2[i];
        return ((fArr2[length] - f3) * ((f - fArr[i]) / f2)) + f3;
    }
}
