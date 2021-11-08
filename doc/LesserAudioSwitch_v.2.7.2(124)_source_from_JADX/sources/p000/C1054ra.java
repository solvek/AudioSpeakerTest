package p000;

import androidx.fragment.app.Fragment;
import p000.C0614ia;
import p000.C1353xa;

/* renamed from: ra */
public final class C1054ra implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1353xa.C1354a f3944b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f3945c;

    /* renamed from: d */
    public final /* synthetic */ C0521g7 f3946d;

    public C1054ra(C1353xa.C1354a aVar, Fragment fragment, C0521g7 g7Var) {
        this.f3944b = aVar;
        this.f3945c = fragment;
        this.f3946d = g7Var;
    }

    public void run() {
        ((C0614ia.C0616b) this.f3944b).mo3254a(this.f3945c, this.f3946d);
    }
}
