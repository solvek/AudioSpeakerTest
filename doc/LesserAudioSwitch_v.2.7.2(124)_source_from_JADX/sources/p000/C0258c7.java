package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: c7 */
public final class C0258c7 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f1343a;

    /* renamed from: b */
    public Drawable.ConstantState f1344b;

    /* renamed from: c */
    public ColorStateList f1345c = null;

    /* renamed from: d */
    public PorterDuff.Mode f1346d = C0010a7.f47h;

    public C0258c7(C0258c7 c7Var) {
        if (c7Var != null) {
            this.f1343a = c7Var.f1343a;
            this.f1344b = c7Var.f1344b;
            this.f1345c = c7Var.f1345c;
            this.f1346d = c7Var.f1346d;
        }
    }

    public int getChangingConfigurations() {
        int i = this.f1343a;
        Drawable.ConstantState constantState = this.f1344b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0212b7(this, resources) : new C0010a7(this, resources);
    }
}
