package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: b7 */
public class C0212b7 extends C0010a7 {

    /* renamed from: i */
    public static Method f1254i;

    public C0212b7(Drawable drawable) {
        super(drawable);
        if (f1254i == null) {
            try {
                f1254i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public boolean mo49c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f53g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f53g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f53g.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f53g;
        if (!(drawable == null || (method = f1254i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f53g.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f53g.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo49c()) {
            super.setTint(i);
        } else {
            this.f53g.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo49c()) {
            this.f51e.f1345c = colorStateList;
            mo50d(getState());
            return;
        }
        this.f53g.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo49c()) {
            this.f51e.f1346d = mode;
            mo50d(getState());
            return;
        }
        this.f53g.setTintMode(mode);
    }

    public C0212b7(C0258c7 c7Var, Resources resources) {
        super(c7Var, resources);
        if (f1254i == null) {
            try {
                f1254i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}
