package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: s1 */
public class C1094s1 extends CheckBox implements C0411e9, C0761l8 {

    /* renamed from: b */
    public final C1188u1 f4136b;

    /* renamed from: c */
    public final C0998q1 f4137c;

    /* renamed from: d */
    public final C0598i2 f4138d;

    public C1094s1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public C1094s1(Context context, AttributeSet attributeSet, int i) {
        super(C0404e3.m1540a(context), attributeSet, i);
        C0253c3.m1047a(this, getContext());
        C1188u1 u1Var = new C1188u1(this);
        this.f4136b = u1Var;
        u1Var.mo4742c(attributeSet, i);
        C0998q1 q1Var = new C0998q1(this);
        this.f4137c = q1Var;
        q1Var.mo4058d(attributeSet, i);
        C0598i2 i2Var = new C0598i2(this);
        this.f4138d = i2Var;
        i2Var.mo3115e(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0998q1 q1Var = this.f4137c;
        if (q1Var != null) {
            q1Var.mo4055a();
        }
        C0598i2 i2Var = this.f4138d;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1188u1 u1Var = this.f4136b;
        return u1Var != null ? u1Var.mo4741b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0998q1 q1Var = this.f4137c;
        if (q1Var != null) {
            return q1Var.mo4056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0998q1 q1Var = this.f4137c;
        if (q1Var != null) {
            return q1Var.mo4057c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1188u1 u1Var = this.f4136b;
        if (u1Var != null) {
            return u1Var.f4539b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1188u1 u1Var = this.f4136b;
        if (u1Var != null) {
            return u1Var.f4540c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0998q1 q1Var = this.f4137c;
        if (q1Var != null) {
            q1Var.mo4059e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0998q1 q1Var = this.f4137c;
        if (q1Var != null) {
            q1Var.mo4060f(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0399e0.m1530b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1188u1 u1Var = this.f4136b;
        if (u1Var == null) {
            return;
        }
        if (u1Var.f4543f) {
            u1Var.f4543f = false;
            return;
        }
        u1Var.f4543f = true;
        u1Var.mo4740a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0998q1 q1Var = this.f4137c;
        if (q1Var != null) {
            q1Var.mo4062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0998q1 q1Var = this.f4137c;
        if (q1Var != null) {
            q1Var.mo4063i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1188u1 u1Var = this.f4136b;
        if (u1Var != null) {
            u1Var.f4539b = colorStateList;
            u1Var.f4541d = true;
            u1Var.mo4740a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1188u1 u1Var = this.f4136b;
        if (u1Var != null) {
            u1Var.f4540c = mode;
            u1Var.f4542e = true;
            u1Var.mo4740a();
        }
    }
}
