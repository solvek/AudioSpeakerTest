package p000;

import android.content.Context;
import p000.C1426yp;

/* renamed from: bo */
public final /* synthetic */ class C0230bo implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f1287b;

    /* renamed from: c */
    public final /* synthetic */ C1426yp.C1427a f1288c;

    public /* synthetic */ C0230bo(Context context, C1426yp.C1427a aVar) {
        this.f1287b = context;
        this.f1288c = aVar;
    }

    public final void run() {
        Context context = this.f1287b;
        try {
            this.f1288c.mo2545i(new C0936oo(context).mo3854b());
        } catch (InterruptedException e) {
            C0200av.m970a(-34401371378860L);
            C0200av.m970a(-34431436149932L);
            e.printStackTrace();
        }
    }
}
