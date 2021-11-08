package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a4 */
public class C0007a4 extends Drawable {

    /* renamed from: a */
    public float f21a;

    /* renamed from: b */
    public float f22b;

    /* renamed from: c */
    public boolean f23c;

    /* renamed from: d */
    public boolean f24d;

    /* renamed from: e */
    public ColorStateList f25e;

    /* renamed from: f */
    public PorterDuffColorFilter f26f;

    /* renamed from: g */
    public ColorStateList f27g;

    /* renamed from: h */
    public PorterDuff.Mode f28h;

    /* renamed from: a */
    public final PorterDuffColorFilter mo30a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void mo31b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        int i = rect.left;
        throw null;
    }

    public void draw(Canvas canvas) {
        if (this.f26f == null) {
            float f = this.f21a;
            canvas.drawRoundRect((RectF) null, f, f, (Paint) null);
            return;
        }
        throw null;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect((Rect) null, this.f21a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f25e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f27g
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f25e
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0007a4.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo31b(rect);
        throw null;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f25e;
        colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        throw null;
    }

    public void setAlpha(int i) {
        throw null;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f27g = colorStateList;
        this.f26f = mo30a(colorStateList, this.f28h);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f28h = mode;
        this.f26f = mo30a(this.f27g, mode);
        invalidateSelf();
    }
}
