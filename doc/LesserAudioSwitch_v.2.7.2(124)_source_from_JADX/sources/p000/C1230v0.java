package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: v0 */
public abstract class C1230v0 {

    /* renamed from: a */
    public final Context f4691a;

    /* renamed from: b */
    public C0663j4<C0409e7, MenuItem> f4692b;

    /* renamed from: c */
    public C0663j4<C0456f7, SubMenu> f4693c;

    public C1230v0(Context context) {
        this.f4691a = context;
    }

    /* renamed from: c */
    public final MenuItem mo4800c(MenuItem menuItem) {
        if (!(menuItem instanceof C0409e7)) {
            return menuItem;
        }
        C0409e7 e7Var = (C0409e7) menuItem;
        if (this.f4692b == null) {
            this.f4692b = new C0663j4<>();
        }
        MenuItem orDefault = this.f4692b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        C0246c1 c1Var = new C0246c1(this.f4691a, e7Var);
        this.f4692b.put(e7Var, c1Var);
        return c1Var;
    }

    /* renamed from: d */
    public final SubMenu mo4801d(SubMenu subMenu) {
        if (!(subMenu instanceof C0456f7)) {
            return subMenu;
        }
        C0456f7 f7Var = (C0456f7) subMenu;
        if (this.f4693c == null) {
            this.f4693c = new C0663j4<>();
        }
        SubMenu subMenu2 = this.f4693c.get(f7Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0752l1 l1Var = new C0752l1(this.f4691a, f7Var);
        this.f4693c.put(f7Var, l1Var);
        return l1Var;
    }
}
