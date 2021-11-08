package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: r1 */
public class C1038r1 extends Button implements C0761l8, C0214b9, C0458f9 {

    /* renamed from: b */
    public final C0998q1 f3890b;

    /* renamed from: c */
    public final C0598i2 f3891c;

    public C1038r1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public C1038r1(Context context, AttributeSet attributeSet, int i) {
        super(C0404e3.m1540a(context), attributeSet, i);
        C0253c3.m1047a(this, getContext());
        C0998q1 q1Var = new C0998q1(this);
        this.f3890b = q1Var;
        q1Var.mo4058d(attributeSet, i);
        C0598i2 i2Var = new C0598i2(this);
        this.f3891c = i2Var;
        i2Var.mo3115e(attributeSet, i);
        i2Var.mo3113b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0998q1 q1Var = this.f3890b;
        if (q1Var != null) {
            q1Var.mo4055a();
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            return Math.round(i2Var.f2520i.f2955e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeMinTextSize();
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            return Math.round(i2Var.f2520i.f2954d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeStepGranularity();
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            return Math.round(i2Var.f2520i.f2953c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0598i2 i2Var = this.f3891c;
        return i2Var != null ? i2Var.f2520i.f2956f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            return i2Var.f2520i.f2951a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0998q1 q1Var = this.f3890b;
        if (q1Var != null) {
            return q1Var.mo4056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0998q1 q1Var = this.f3890b;
        if (q1Var != null) {
            return q1Var.mo4057c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0452f3 f3Var = this.f3891c.f2519h;
        if (f3Var != null) {
            return f3Var.f2089a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0452f3 f3Var = this.f3891c.f2519h;
        if (f3Var != null) {
            return f3Var.f2090b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null && !C0214b9.f1256a) {
            i2Var.f2520i.mo3495b();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null && !C0214b9.f1256a && i2Var.mo3114d()) {
            this.f3891c.f2520i.mo3495b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0214b9.f1256a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            i2Var.mo3117g(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0214b9.f1256a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            i2Var.mo3118h(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0214b9.f1256a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            i2Var.mo3119i(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0998q1 q1Var = this.f3890b;
        if (q1Var != null) {
            q1Var.mo4059e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0998q1 q1Var = this.f3890b;
        if (q1Var != null) {
            q1Var.mo4060f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1344x5.m3766k0(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            i2Var.f2512a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0998q1 q1Var = this.f3890b;
        if (q1Var != null) {
            q1Var.mo4062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0998q1 q1Var = this.f3890b;
        if (q1Var != null) {
            q1Var.mo4063i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3891c.mo3120j(colorStateList);
        this.f3891c.mo3113b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3891c.mo3121k(mode);
        this.f3891c.mo3113b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null) {
            i2Var.mo3116f(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        boolean z = C0214b9.f1256a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0598i2 i2Var = this.f3891c;
        if (i2Var != null && !z && !i2Var.mo3114d()) {
            i2Var.f2520i.mo3498g(i, f);
        }
    }
}
