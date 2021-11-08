package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a8 */
public abstract class C0011a8 {

    /* renamed from: a */
    public C0012a f54a;

    /* renamed from: a8$a */
    public interface C0012a {
    }

    public C0011a8(Context context) {
    }

    /* renamed from: a */
    public boolean mo83a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo84b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo85c();

    /* renamed from: d */
    public View mo86d(MenuItem menuItem) {
        return mo85c();
    }

    /* renamed from: e */
    public boolean mo87e() {
        return false;
    }

    /* renamed from: f */
    public void mo88f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo89g() {
        return false;
    }

    /* renamed from: h */
    public void mo90h(C0012a aVar) {
        if (this.f54a != null) {
            getClass().getSimpleName();
        }
        this.f54a = aVar;
    }
}
