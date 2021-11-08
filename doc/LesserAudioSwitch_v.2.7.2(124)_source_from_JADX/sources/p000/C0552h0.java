package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: h0 */
public class C0552h0 extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public Drawable f2420b;

    public C0552h0(Drawable drawable) {
        Drawable drawable2 = this.f2420b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2420b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f2420b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f2420b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f2420b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2420b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2420b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2420b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2420b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2420b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2420b.getPadding(rect);
    }

    public int[] getState() {
        return this.f2420b.getState();
    }

    public Region getTransparentRegion() {
        return this.f2420b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C1344x5.m3725G(this.f2420b);
    }

    public boolean isStateful() {
        return this.f2420b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f2420b.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f2420b.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f2420b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2420b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C1344x5.m3734P(this.f2420b, z);
    }

    public void setChangingConfigurations(int i) {
        this.f2420b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2420b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2420b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2420b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C1344x5.m3739U(this.f2420b, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C1344x5.m3740V(this.f2420b, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f2420b.setState(iArr);
    }

    public void setTint(int i) {
        C1344x5.m3750c0(this.f2420b, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C1344x5.m3752d0(this.f2420b, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1344x5.m3754e0(this.f2420b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2420b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
