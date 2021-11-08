package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: va */
public final class C1252va implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Fragment f4794b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f4795c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4796d;

    /* renamed from: e */
    public final /* synthetic */ C0254c4 f4797e;

    /* renamed from: f */
    public final /* synthetic */ View f4798f;

    /* renamed from: g */
    public final /* synthetic */ C0263cb f4799g;

    /* renamed from: h */
    public final /* synthetic */ Rect f4800h;

    public C1252va(Fragment fragment, Fragment fragment2, boolean z, C0254c4 c4Var, View view, C0263cb cbVar, Rect rect) {
        this.f4794b = fragment;
        this.f4795c = fragment2;
        this.f4796d = z;
        this.f4797e = c4Var;
        this.f4798f = view;
        this.f4799g = cbVar;
        this.f4800h = rect;
    }

    public void run() {
        C1353xa.m3802c(this.f4794b, this.f4795c, this.f4796d, this.f4797e, false);
        View view = this.f4798f;
        if (view != null) {
            this.f4799g.mo1725j(view, this.f4800h);
        }
    }
}
