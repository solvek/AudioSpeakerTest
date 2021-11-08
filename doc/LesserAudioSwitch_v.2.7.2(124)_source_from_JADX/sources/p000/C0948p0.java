package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000.C0750l0;

/* renamed from: p0 */
public class C0948p0 extends ActionMode {

    /* renamed from: a */
    public final Context f3521a;

    /* renamed from: b */
    public final C0750l0 f3522b;

    /* renamed from: p0$a */
    public static class C0949a implements C0750l0.C0751a {

        /* renamed from: a */
        public final ActionMode.Callback f3523a;

        /* renamed from: b */
        public final Context f3524b;

        /* renamed from: c */
        public final ArrayList<C0948p0> f3525c = new ArrayList<>();

        /* renamed from: d */
        public final C0663j4<Menu, Menu> f3526d = new C0663j4<>();

        public C0949a(Context context, ActionMode.Callback callback) {
            this.f3524b = context;
            this.f3523a = callback;
        }

        /* renamed from: a */
        public boolean mo3568a(C0750l0 l0Var, Menu menu) {
            return this.f3523a.onPrepareActionMode(mo3926e(l0Var), mo3927f(menu));
        }

        /* renamed from: b */
        public void mo3569b(C0750l0 l0Var) {
            this.f3523a.onDestroyActionMode(mo3926e(l0Var));
        }

        /* renamed from: c */
        public boolean mo3570c(C0750l0 l0Var, MenuItem menuItem) {
            return this.f3523a.onActionItemClicked(mo3926e(l0Var), new C0246c1(this.f3524b, (C0409e7) menuItem));
        }

        /* renamed from: d */
        public boolean mo3571d(C0750l0 l0Var, Menu menu) {
            return this.f3523a.onCreateActionMode(mo3926e(l0Var), mo3927f(menu));
        }

        /* renamed from: e */
        public ActionMode mo3926e(C0750l0 l0Var) {
            int size = this.f3525c.size();
            for (int i = 0; i < size; i++) {
                C0948p0 p0Var = this.f3525c.get(i);
                if (p0Var != null && p0Var.f3522b == l0Var) {
                    return p0Var;
                }
            }
            C0948p0 p0Var2 = new C0948p0(this.f3524b, l0Var);
            this.f3525c.add(p0Var2);
            return p0Var2;
        }

        /* renamed from: f */
        public final Menu mo3927f(Menu menu) {
            Menu orDefault = this.f3526d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            C0553h1 h1Var = new C0553h1(this.f3524b, (C0367d7) menu);
            this.f3526d.put(menu, h1Var);
            return h1Var;
        }
    }

    public C0948p0(Context context, C0750l0 l0Var) {
        this.f3521a = context;
        this.f3522b = l0Var;
    }

    public void finish() {
        this.f3522b.mo2607c();
    }

    public View getCustomView() {
        return this.f3522b.mo2608d();
    }

    public Menu getMenu() {
        return new C0553h1(this.f3521a, (C0367d7) this.f3522b.mo2609e());
    }

    public MenuInflater getMenuInflater() {
        return this.f3522b.mo2610f();
    }

    public CharSequence getSubtitle() {
        return this.f3522b.mo2611g();
    }

    public Object getTag() {
        return this.f3522b.f3084b;
    }

    public CharSequence getTitle() {
        return this.f3522b.mo2612h();
    }

    public boolean getTitleOptionalHint() {
        return this.f3522b.f3085c;
    }

    public void invalidate() {
        this.f3522b.mo2613i();
    }

    public boolean isTitleOptional() {
        return this.f3522b.mo2614j();
    }

    public void setCustomView(View view) {
        this.f3522b.mo2615k(view);
    }

    public void setSubtitle(int i) {
        this.f3522b.mo2616l(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3522b.mo2617m(charSequence);
    }

    public void setTag(Object obj) {
        this.f3522b.f3084b = obj;
    }

    public void setTitle(int i) {
        this.f3522b.mo2618n(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3522b.mo2619o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f3522b.mo2620p(z);
    }
}
