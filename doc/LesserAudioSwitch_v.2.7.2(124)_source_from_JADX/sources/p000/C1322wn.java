package p000;

import android.content.Context;
import p000.C0735ko;

/* renamed from: wn */
public final /* synthetic */ class C1322wn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f4974b;

    /* renamed from: c */
    public final /* synthetic */ C0544go f4975c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4976d;

    /* renamed from: e */
    public final /* synthetic */ C0735ko.C0740e f4977e;

    public /* synthetic */ C1322wn(Context context, C0544go goVar, boolean z, C0735ko.C0740e eVar) {
        this.f4974b = context;
        this.f4975c = goVar;
        this.f4976d = z;
        this.f4977e = eVar;
    }

    public final void run() {
        Context context = this.f4974b;
        C0544go goVar = this.f4975c;
        boolean z = this.f4976d;
        C0735ko.C0740e eVar = this.f4977e;
        try {
            new C0936oo(context).mo3867w(goVar, Boolean.valueOf(z));
        } catch (Exception e) {
            C0279ch.m1110g(-35771465946284L, C0200av.m970a(-35741401175212L), e);
        }
        if (eVar != null) {
            eVar.mo2960a();
        }
    }
}
