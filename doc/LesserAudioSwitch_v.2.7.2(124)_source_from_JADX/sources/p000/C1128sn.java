package p000;

import android.content.Context;
import p000.C0735ko;

/* renamed from: sn */
public final /* synthetic */ class C1128sn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f4300b;

    /* renamed from: c */
    public final /* synthetic */ C1129so f4301c;

    /* renamed from: d */
    public final /* synthetic */ C0735ko.C0740e f4302d;

    public /* synthetic */ C1128sn(Context context, C1129so soVar, C0735ko.C0740e eVar) {
        this.f4300b = context;
        this.f4301c = soVar;
        this.f4302d = eVar;
    }

    public final void run() {
        Context context = this.f4300b;
        C1129so soVar = this.f4301c;
        C0735ko.C0740e eVar = this.f4302d;
        try {
            new C0936oo(context).mo3866u(new C1179to(soVar));
        } catch (Exception e) {
            C0279ch.m1110g(-35251774903468L, C0200av.m970a(-35221710132396L), e);
        }
        if (eVar != null) {
            eVar.mo2960a();
        }
    }
}
