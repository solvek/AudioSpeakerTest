package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000.C0750l0;
import p000.C1435z0;

/* renamed from: o0 */
public class C0903o0 extends C0750l0 implements C1435z0.C1436a {

    /* renamed from: d */
    public Context f3438d;

    /* renamed from: e */
    public ActionBarContextView f3439e;

    /* renamed from: f */
    public C0750l0.C0751a f3440f;

    /* renamed from: g */
    public WeakReference<View> f3441g;

    /* renamed from: h */
    public boolean f3442h;

    /* renamed from: i */
    public C1435z0 f3443i;

    public C0903o0(Context context, ActionBarContextView actionBarContextView, C0750l0.C0751a aVar, boolean z) {
        this.f3438d = context;
        this.f3439e = actionBarContextView;
        this.f3440f = aVar;
        C1435z0 z0Var = new C1435z0(actionBarContextView.getContext());
        z0Var.f5236l = 1;
        this.f3443i = z0Var;
        z0Var.f5229e = this;
    }

    /* renamed from: a */
    public void mo307a(C1435z0 z0Var) {
        mo2613i();
        C0904o1 o1Var = this.f3439e.f3204e;
        if (o1Var != null) {
            o1Var.mo3825n();
        }
    }

    /* renamed from: b */
    public boolean mo308b(C1435z0 z0Var, MenuItem menuItem) {
        return this.f3440f.mo3570c(this, menuItem);
    }

    /* renamed from: c */
    public void mo2607c() {
        if (!this.f3442h) {
            this.f3442h = true;
            this.f3439e.sendAccessibilityEvent(32);
            this.f3440f.mo3569b(this);
        }
    }

    /* renamed from: d */
    public View mo2608d() {
        WeakReference<View> weakReference = this.f3441g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo2609e() {
        return this.f3443i;
    }

    /* renamed from: f */
    public MenuInflater mo2610f() {
        return new C0995q0(this.f3439e.getContext());
    }

    /* renamed from: g */
    public CharSequence mo2611g() {
        return this.f3439e.getSubtitle();
    }

    /* renamed from: h */
    public CharSequence mo2612h() {
        return this.f3439e.getTitle();
    }

    /* renamed from: i */
    public void mo2613i() {
        this.f3440f.mo3568a(this, this.f3443i);
    }

    /* renamed from: j */
    public boolean mo2614j() {
        return this.f3439e.f261s;
    }

    /* renamed from: k */
    public void mo2615k(View view) {
        this.f3439e.setCustomView(view);
        this.f3441g = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: l */
    public void mo2616l(int i) {
        this.f3439e.setSubtitle(this.f3438d.getString(i));
    }

    /* renamed from: m */
    public void mo2617m(CharSequence charSequence) {
        this.f3439e.setSubtitle(charSequence);
    }

    /* renamed from: n */
    public void mo2618n(int i) {
        this.f3439e.setTitle(this.f3438d.getString(i));
    }

    /* renamed from: o */
    public void mo2619o(CharSequence charSequence) {
        this.f3439e.setTitle(charSequence);
    }

    /* renamed from: p */
    public void mo2620p(boolean z) {
        this.f3085c = z;
        this.f3439e.setTitleOptional(z);
    }
}
