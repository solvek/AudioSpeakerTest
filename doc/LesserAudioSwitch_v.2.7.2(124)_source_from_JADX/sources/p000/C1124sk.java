package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: sk */
public class C1124sk extends C1095s2 {

    /* renamed from: q */
    public Drawable f4266q;

    /* renamed from: r */
    public final Rect f4267r;

    /* renamed from: s */
    public final Rect f4268s;

    /* renamed from: t */
    public int f4269t;

    /* renamed from: u */
    public boolean f4270u;

    /* renamed from: v */
    public boolean f4271v;

    public C1124sk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1124sk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4267r = new Rect();
        this.f4268s = new Rect();
        this.f4269t = 119;
        this.f4270u = true;
        this.f4271v = false;
        int[] iArr = C0781lh.f3156h;
        C1315wk.m3651a(context, attributeSet, i, 0);
        C1315wk.m3652b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f4269t = obtainStyledAttributes.getInt(1, this.f4269t);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f4270u = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f4266q;
        if (drawable != null) {
            if (this.f4271v) {
                this.f4271v = false;
                Rect rect = this.f4267r;
                Rect rect2 = this.f4268s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f4270u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f4269t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f4266q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4266q;
        if (drawable != null && drawable.isStateful()) {
            this.f4266q.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f4266q;
    }

    public int getForegroundGravity() {
        return this.f4269t;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4266q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4271v = z | this.f4271v;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f4271v = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f4266q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f4266q);
            }
            this.f4266q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f4269t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f4269t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4269t = i;
            if (i == 119 && this.f4266q != null) {
                this.f4266q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4266q;
    }
}
