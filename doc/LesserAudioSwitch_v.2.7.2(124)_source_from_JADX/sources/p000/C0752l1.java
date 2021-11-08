package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l1 */
public class C0752l1 extends C0553h1 implements SubMenu {

    /* renamed from: e */
    public final C0456f7 f3086e;

    public C0752l1(Context context, C0456f7 f7Var) {
        super(context, f7Var);
        this.f3086e = f7Var;
    }

    public void clearHeader() {
        this.f3086e.clearHeader();
    }

    public MenuItem getItem() {
        return mo4800c(this.f3086e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f3086e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f3086e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f3086e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f3086e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f3086e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f3086e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f3086e.setIcon(drawable);
        return this;
    }
}
