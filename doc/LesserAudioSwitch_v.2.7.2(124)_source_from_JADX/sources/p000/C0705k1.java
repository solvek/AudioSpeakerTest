package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k1 */
public class C0705k1 extends C1435z0 implements SubMenu {

    /* renamed from: A */
    public C0203b1 f2946A;

    /* renamed from: z */
    public C1435z0 f2947z;

    public C0705k1(Context context, C1435z0 z0Var, C0203b1 b1Var) {
        super(context);
        this.f2947z = z0Var;
        this.f2946A = b1Var;
    }

    /* renamed from: d */
    public boolean mo3477d(C0203b1 b1Var) {
        return this.f2947z.mo3477d(b1Var);
    }

    /* renamed from: e */
    public boolean mo3478e(C1435z0 z0Var, MenuItem menuItem) {
        return super.mo3478e(z0Var, menuItem) || this.f2947z.mo3478e(z0Var, menuItem);
    }

    /* renamed from: f */
    public boolean mo3479f(C0203b1 b1Var) {
        return this.f2947z.mo3479f(b1Var);
    }

    public MenuItem getItem() {
        return this.f2946A;
    }

    /* renamed from: j */
    public String mo3481j() {
        C0203b1 b1Var = this.f2946A;
        int i = b1Var != null ? b1Var.f1181a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i;
    }

    /* renamed from: k */
    public C1435z0 mo3482k() {
        return this.f2947z.mo3482k();
    }

    /* renamed from: m */
    public boolean mo3483m() {
        return this.f2947z.mo3483m();
    }

    /* renamed from: n */
    public boolean mo3484n() {
        return this.f2947z.mo3484n();
    }

    /* renamed from: o */
    public boolean mo3485o() {
        return this.f2947z.mo3485o();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f2947z.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        mo5264x(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo5264x(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo5264x(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f2946A.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f2946A.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f2947z.setQwertyMode(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo5264x(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo5264x(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }
}
