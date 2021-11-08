package p000;

import androidx.fragment.app.Fragment;
import p000.C0614ia;
import p000.C1353xa;

/* renamed from: ta */
public final class C1161ta implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1353xa.C1354a f4412b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f4413c;

    /* renamed from: d */
    public final /* synthetic */ C0521g7 f4414d;

    public C1161ta(C1353xa.C1354a aVar, Fragment fragment, C0521g7 g7Var) {
        this.f4412b = aVar;
        this.f4413c = fragment;
        this.f4414d = g7Var;
    }

    public void run() {
        ((C0614ia.C0616b) this.f4412b).mo3254a(this.f4413c, this.f4414d);
    }
}
