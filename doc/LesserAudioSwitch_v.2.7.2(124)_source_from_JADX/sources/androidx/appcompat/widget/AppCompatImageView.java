package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView implements C0761l8, C0524g9 {

    /* renamed from: b */
    public final C0998q1 f321b;

    /* renamed from: c */
    public final C1333x1 f322c;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0404e3.m1540a(context), attributeSet, i);
        C0253c3.m1047a(this, getContext());
        C0998q1 q1Var = new C0998q1(this);
        this.f321b = q1Var;
        q1Var.mo4058d(attributeSet, i);
        C1333x1 x1Var = new C1333x1(this);
        this.f322c = x1Var;
        x1Var.mo5034c(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0998q1 q1Var = this.f321b;
        if (q1Var != null) {
            q1Var.mo4055a();
        }
        C1333x1 x1Var = this.f322c;
        if (x1Var != null) {
            x1Var.mo5032a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0998q1 q1Var = this.f321b;
        if (q1Var != null) {
            return q1Var.mo4056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0998q1 q1Var = this.f321b;
        if (q1Var != null) {
            return q1Var.mo4057c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0452f3 f3Var;
        C1333x1 x1Var = this.f322c;
        if (x1Var == null || (f3Var = x1Var.f5000b) == null) {
            return null;
        }
        return f3Var.f2089a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0452f3 f3Var;
        C1333x1 x1Var = this.f322c;
        if (x1Var == null || (f3Var = x1Var.f5000b) == null) {
            return null;
        }
        return f3Var.f2090b;
    }

    public boolean hasOverlappingRendering() {
        return this.f322c.mo5033b() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0998q1 q1Var = this.f321b;
        if (q1Var != null) {
            q1Var.mo4059e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0998q1 q1Var = this.f321b;
        if (q1Var != null) {
            q1Var.mo4060f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1333x1 x1Var = this.f322c;
        if (x1Var != null) {
            x1Var.mo5032a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1333x1 x1Var = this.f322c;
        if (x1Var != null) {
            x1Var.mo5032a();
        }
    }

    public void setImageResource(int i) {
        C1333x1 x1Var = this.f322c;
        if (x1Var != null) {
            x1Var.mo5035d(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1333x1 x1Var = this.f322c;
        if (x1Var != null) {
            x1Var.mo5032a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0998q1 q1Var = this.f321b;
        if (q1Var != null) {
            q1Var.mo4062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0998q1 q1Var = this.f321b;
        if (q1Var != null) {
            q1Var.mo4063i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1333x1 x1Var = this.f322c;
        if (x1Var != null) {
            x1Var.mo5036e(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1333x1 x1Var = this.f322c;
        if (x1Var != null) {
            x1Var.mo5037f(mode);
        }
    }
}
