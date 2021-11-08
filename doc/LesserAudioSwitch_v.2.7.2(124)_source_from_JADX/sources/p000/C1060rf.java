package p000;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: rf */
public abstract class C1060rf extends Drawable implements C1400y6 {

    /* renamed from: b */
    public Drawable f3957b;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3957b;
        if (drawable != null && Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3739U(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3740V(drawable, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
