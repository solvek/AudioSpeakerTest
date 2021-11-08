package p000;

import com.android.billingclient.api.Purchase;
import p000.C1468zo;

/* renamed from: uo */
public final /* synthetic */ class C1222uo implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1468zo f4676b;

    /* renamed from: c */
    public final /* synthetic */ C1468zo.C1472d f4677c;

    /* renamed from: d */
    public final /* synthetic */ Purchase f4678d;

    public /* synthetic */ C1222uo(C1468zo zoVar, C1468zo.C1472d dVar, Purchase purchase) {
        this.f4676b = zoVar;
        this.f4677c = dVar;
        this.f4678d = purchase;
    }

    public final void run() {
        C1468zo zoVar = this.f4676b;
        C1468zo.C1472d dVar = this.f4677c;
        Purchase purchase = this.f4678d;
        zoVar.getClass();
        if (!dVar.f5358b) {
            C0550gu.m1822d(C0200av.m970a(-54261300155564L), C0200av.m970a(-54342904534188L));
            zoVar.mo5306a(purchase, false);
        }
    }
}
