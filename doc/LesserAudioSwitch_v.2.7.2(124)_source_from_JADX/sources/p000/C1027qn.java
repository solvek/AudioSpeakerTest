package p000;

import android.content.Context;
import p000.C0936oo;

/* renamed from: qn */
public final /* synthetic */ class C1027qn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f3839b;

    /* renamed from: c */
    public final /* synthetic */ C0544go f3840c;

    /* renamed from: d */
    public final /* synthetic */ C0936oo.C0940d f3841d;

    public /* synthetic */ C1027qn(Context context, C0544go goVar, C0936oo.C0940d dVar) {
        this.f3839b = context;
        this.f3840c = goVar;
        this.f3841d = dVar;
    }

    public final void run() {
        boolean z;
        Context context = this.f3839b;
        C0544go goVar = this.f3840c;
        C0936oo.C0940d dVar = this.f3841d;
        try {
            new C0735ko(context);
            z = C0936oo.m2706l(goVar);
        } catch (Exception e) {
            C0279ch.m1110g(-35406393726124L, C0200av.m970a(-35376328955052L), e);
            z = false;
        }
        if (dVar != null) {
            dVar.mo3305a(z);
        }
    }
}
