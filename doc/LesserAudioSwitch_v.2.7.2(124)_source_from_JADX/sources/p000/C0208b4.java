package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: b4 */
public class C0208b4 extends Drawable {

    /* renamed from: g */
    public static final double f1230g = Math.cos(Math.toRadians(45.0d));

    /* renamed from: h */
    public static C0209a f1231h;

    /* renamed from: a */
    public float f1232a;

    /* renamed from: b */
    public float f1233b;

    /* renamed from: c */
    public float f1234c;

    /* renamed from: d */
    public ColorStateList f1235d;

    /* renamed from: e */
    public boolean f1236e;

    /* renamed from: f */
    public boolean f1237f;

    /* renamed from: b4$a */
    public interface C0209a {
    }

    /* renamed from: a */
    public static float m994a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (((1.0d - f1230g) * d2) + d);
    }

    /* renamed from: b */
    public static float m995b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = (double) f3;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (((1.0d - f1230g) * d2) + d);
    }

    public void draw(Canvas canvas) {
        if (this.f1236e) {
            int i = getBounds().left;
            throw null;
        } else {
            canvas.translate(0.0f, this.f1234c / 2.0f);
            throw null;
        }
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m995b(this.f1233b, this.f1232a, this.f1237f));
        int ceil2 = (int) Math.ceil((double) m994a(this.f1233b, this.f1232a, this.f1237f));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1235d;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1236e = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1235d;
        colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        throw null;
    }

    public void setAlpha(int i) {
        throw null;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }
}
