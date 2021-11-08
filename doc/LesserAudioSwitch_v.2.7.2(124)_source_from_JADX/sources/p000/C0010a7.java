package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: a7 */
public class C0010a7 extends Drawable implements Drawable.Callback, C1443z6, C1400y6 {

    /* renamed from: h */
    public static final PorterDuff.Mode f47h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f48b;

    /* renamed from: c */
    public PorterDuff.Mode f49c;

    /* renamed from: d */
    public boolean f50d;

    /* renamed from: e */
    public C0258c7 f51e;

    /* renamed from: f */
    public boolean f52f;

    /* renamed from: g */
    public Drawable f53g;

    public C0010a7(Drawable drawable) {
        this.f51e = new C0258c7(this.f51e);
        mo48b(drawable);
    }

    /* renamed from: a */
    public final Drawable mo47a() {
        return this.f53g;
    }

    /* renamed from: b */
    public final void mo48b(Drawable drawable) {
        Drawable drawable2 = this.f53g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f53g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0258c7 c7Var = this.f51e;
            if (c7Var != null) {
                c7Var.f1344b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public boolean mo49c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo50d(int[] iArr) {
        if (!mo49c()) {
            return false;
        }
        C0258c7 c7Var = this.f51e;
        ColorStateList colorStateList = c7Var.f1345c;
        PorterDuff.Mode mode = c7Var.f1346d;
        if (colorStateList == null || mode == null) {
            this.f50d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f50d && colorForState == this.f48b && mode == this.f49c)) {
                setColorFilter(colorForState, mode);
                this.f48b = colorForState;
                this.f49c = mode;
                this.f50d = true;
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        this.f53g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0258c7 c7Var = this.f51e;
        return changingConfigurations | (c7Var != null ? c7Var.getChangingConfigurations() : 0) | this.f53g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0258c7 c7Var = this.f51e;
        if (c7Var == null) {
            return null;
        }
        if (!(c7Var.f1344b != null)) {
            return null;
        }
        c7Var.f1343a = getChangingConfigurations();
        return this.f51e;
    }

    public Drawable getCurrent() {
        return this.f53g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f53g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f53g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f53g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f53g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f53g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f53g.getPadding(rect);
    }

    public int[] getState() {
        return this.f53g.getState();
    }

    public Region getTransparentRegion() {
        return this.f53g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f53g.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f51e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo49c()
            if (r0 == 0) goto L_0x000d
            c7 r0 = r1.f51e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1345c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f53g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0010a7.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f53g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f52f && super.mutate() == this) {
            this.f51e = new C0258c7(this.f51e);
            Drawable drawable = this.f53g;
            if (drawable != null) {
                drawable.mutate();
            }
            C0258c7 c7Var = this.f51e;
            if (c7Var != null) {
                Drawable drawable2 = this.f53g;
                c7Var.f1344b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f52f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f53g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        return this.f53g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f53g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f53g.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f53g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f53g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f53g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f53g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return mo50d(iArr) || this.f53g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f51e.f1345c = colorStateList;
        mo50d(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f51e.f1346d = mode;
        mo50d(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f53g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C0010a7(C0258c7 c7Var, Resources resources) {
        Drawable.ConstantState constantState;
        this.f51e = c7Var;
        if (c7Var != null && (constantState = c7Var.f1344b) != null) {
            mo48b(constantState.newDrawable(resources));
        }
    }
}
