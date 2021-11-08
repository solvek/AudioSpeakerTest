package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: x1 */
public class C1333x1 {

    /* renamed from: a */
    public final ImageView f4999a;

    /* renamed from: b */
    public C0452f3 f5000b;

    /* renamed from: c */
    public C0452f3 f5001c;

    public C1333x1(ImageView imageView) {
        this.f4999a = imageView;
    }

    /* renamed from: a */
    public void mo5032a() {
        Drawable drawable = this.f4999a.getDrawable();
        if (drawable != null) {
            C0912o2.m2665b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f5001c == null) {
                    this.f5001c = new C0452f3();
                }
                C0452f3 f3Var = this.f5001c;
                PorterDuff.Mode mode = null;
                f3Var.f2089a = null;
                f3Var.f2092d = false;
                f3Var.f2090b = null;
                f3Var.f2091c = false;
                ImageView imageView = this.f4999a;
                ColorStateList imageTintList = i >= 21 ? imageView.getImageTintList() : imageView instanceof C0524g9 ? ((C0524g9) imageView).getSupportImageTintList() : null;
                if (imageTintList != null) {
                    f3Var.f2092d = true;
                    f3Var.f2089a = imageTintList;
                }
                ImageView imageView2 = this.f4999a;
                if (i >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof C0524g9) {
                    mode = ((C0524g9) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    f3Var.f2091c = true;
                    f3Var.f2090b = mode;
                }
                if (f3Var.f2092d || f3Var.f2091c) {
                    C1231v1.m3416f(drawable, f3Var, this.f4999a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0452f3 f3Var2 = this.f5000b;
            if (f3Var2 != null) {
                C1231v1.m3416f(drawable, f3Var2, this.f4999a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public boolean mo5033b() {
        return Build.VERSION.SDK_INT < 21 || !(this.f4999a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: c */
    public void mo5034c(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int l;
        Context context = this.f4999a.getContext();
        int[] iArr = C0440f.f2052f;
        C0555h3 q = C0555h3.m1825q(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f4999a;
        C0813m8.m2456E(imageView, imageView.getContext(), iArr, attributeSet, q.f2425b, i, 0);
        try {
            Drawable drawable3 = this.f4999a.getDrawable();
            if (!(drawable3 != null || (l = q.mo3032l(1, -1)) == -1 || (drawable3 = C0399e0.m1530b(this.f4999a.getContext(), l)) == null)) {
                this.f4999a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                C0912o2.m2665b(drawable3);
            }
            if (q.mo3035o(2)) {
                ImageView imageView2 = this.f4999a;
                ColorStateList c = q.mo3023c(2);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21) {
                    imageView2.setImageTintList(c);
                    if (!(i2 != 21 || (drawable2 = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else if (imageView2 instanceof C0524g9) {
                    ((C0524g9) imageView2).setSupportImageTintList(c);
                }
            }
            if (q.mo3035o(3)) {
                ImageView imageView3 = this.f4999a;
                PorterDuff.Mode d = C0912o2.m2667d(q.mo3030j(3, -1), (PorterDuff.Mode) null);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21) {
                    imageView3.setImageTintMode(d);
                    if (!(i3 != 21 || (drawable = imageView3.getDrawable()) == null || imageView3.getImageTintList() == null)) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView3.getDrawableState());
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                } else if (imageView3 instanceof C0524g9) {
                    ((C0524g9) imageView3).setSupportImageTintMode(d);
                }
            }
        } finally {
            q.f2425b.recycle();
        }
    }

    /* renamed from: d */
    public void mo5035d(int i) {
        if (i != 0) {
            Drawable b = C0399e0.m1530b(this.f4999a.getContext(), i);
            if (b != null) {
                C0912o2.m2665b(b);
            }
            this.f4999a.setImageDrawable(b);
        } else {
            this.f4999a.setImageDrawable((Drawable) null);
        }
        mo5032a();
    }

    /* renamed from: e */
    public void mo5036e(ColorStateList colorStateList) {
        if (this.f5000b == null) {
            this.f5000b = new C0452f3();
        }
        C0452f3 f3Var = this.f5000b;
        f3Var.f2089a = colorStateList;
        f3Var.f2092d = true;
        mo5032a();
    }

    /* renamed from: f */
    public void mo5037f(PorterDuff.Mode mode) {
        if (this.f5000b == null) {
            this.f5000b = new C0452f3();
        }
        C0452f3 f3Var = this.f5000b;
        f3Var.f2090b = mode;
        f3Var.f2091c = true;
        mo5032a();
    }
}
