package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* renamed from: fa */
public abstract class C0459fa<E> extends C0215ba {

    /* renamed from: b */
    public final Activity f2100b;

    /* renamed from: c */
    public final Context f2101c;

    /* renamed from: d */
    public final Handler f2102d;

    /* renamed from: e */
    public final C0614ia f2103e = new C0721ka();

    public C0459fa(C1250v9 v9Var) {
        Handler handler = new Handler();
        this.f2100b = v9Var;
        C1344x5.m3755f(v9Var, "context == null");
        this.f2101c = v9Var;
        C1344x5.m3755f(handler, "handler == null");
        this.f2102d = handler;
    }

    /* renamed from: g */
    public abstract void mo2772g(Fragment fragment);

    /* renamed from: h */
    public abstract E mo2773h();

    /* renamed from: i */
    public abstract LayoutInflater mo2774i();

    /* renamed from: j */
    public abstract boolean mo2775j(Fragment fragment);

    /* renamed from: k */
    public abstract void mo2776k();
}
