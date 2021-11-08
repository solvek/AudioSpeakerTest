package p000;

import android.widget.Toast;

/* renamed from: zn */
public final /* synthetic */ class C1467zn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0936oo f5330b;

    /* renamed from: c */
    public final /* synthetic */ int f5331c;

    public /* synthetic */ C1467zn(C0936oo ooVar, int i) {
        this.f5330b = ooVar;
        this.f5331c = i;
    }

    public final void run() {
        C0936oo ooVar = this.f5330b;
        Toast.makeText(ooVar.f3510a, this.f5331c, 0).show();
    }
}
