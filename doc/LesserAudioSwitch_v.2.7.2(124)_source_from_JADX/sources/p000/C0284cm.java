package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;

/* renamed from: cm */
public class C0284cm extends FrameLayout {

    /* renamed from: i */
    public static final View.OnTouchListener f1397i = new C0285a();

    /* renamed from: b */
    public C0228bm f1398b;

    /* renamed from: c */
    public C0031am f1399c;

    /* renamed from: d */
    public int f1400d;

    /* renamed from: e */
    public final float f1401e;

    /* renamed from: f */
    public final float f1402f;

    /* renamed from: g */
    public ColorStateList f1403g;

    /* renamed from: h */
    public PorterDuff.Mode f1404h;

    /* renamed from: cm$a */
    public static class C0285a implements View.OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C0284cm(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, 0, 0), attributeSet);
        Drawable drawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0781lh.f3168t);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(6, 0);
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 21) {
                setElevation(dimensionPixelSize);
            }
        }
        this.f1400d = obtainStyledAttributes.getInt(2, 0);
        this.f1401e = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(C0728kh.m2295k(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(C0728kh.m2309y(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1402f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1397i);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C0728kh.m2306v(C0728kh.m2294j(this, R.attr.colorSurface), C0728kh.m2294j(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            if (this.f1403g != null) {
                drawable = C1344x5.m3764j0(gradientDrawable);
                C1344x5.m3752d0(drawable, this.f1403g);
            } else {
                drawable = C1344x5.m3764j0(gradientDrawable);
            }
            Field field2 = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(drawable);
            } else {
                setBackgroundDrawable(drawable);
            }
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1402f;
    }

    public int getAnimationMode() {
        return this.f1400d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1401e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0031am amVar = this.f1399c;
        if (amVar != null) {
            amVar.onViewAttachedToWindow(this);
        }
        C0813m8.m2455D(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0031am amVar = this.f1399c;
        if (amVar != null) {
            amVar.onViewDetachedFromWindow(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0228bm bmVar = this.f1398b;
        if (bmVar != null) {
            bmVar.mo1608a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f1400d = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f1403g == null)) {
            drawable = C1344x5.m3764j0(drawable.mutate());
            C1344x5.m3752d0(drawable, this.f1403g);
            C1344x5.m3754e0(drawable, this.f1404h);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1403g = colorStateList;
        if (getBackground() != null) {
            Drawable j0 = C1344x5.m3764j0(getBackground().mutate());
            C1344x5.m3752d0(j0, colorStateList);
            C1344x5.m3754e0(j0, this.f1404h);
            if (j0 != getBackground()) {
                super.setBackgroundDrawable(j0);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1404h = mode;
        if (getBackground() != null) {
            Drawable j0 = C1344x5.m3764j0(getBackground().mutate());
            C1344x5.m3754e0(j0, mode);
            if (j0 != getBackground()) {
                super.setBackgroundDrawable(j0);
            }
        }
    }

    public void setOnAttachStateChangeListener(C0031am amVar) {
        this.f1399c = amVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f1397i);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(C0228bm bmVar) {
        this.f1398b = bmVar;
    }
}
