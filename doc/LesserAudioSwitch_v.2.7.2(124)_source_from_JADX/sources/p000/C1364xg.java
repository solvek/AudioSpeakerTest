package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: xg */
public final class C1364xg implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ C1310wf f5076a;

    /* renamed from: b */
    public final /* synthetic */ C1363xf f5077b;

    /* renamed from: c */
    public final /* synthetic */ C1455zf f5078c;

    public C1364xg(C1455zf zfVar, C1310wf wfVar, C1363xf xfVar) {
        this.f5078c = zfVar;
        this.f5076a = wfVar;
        this.f5077b = xfVar;
    }

    public final Object call() {
        try {
            C1455zf zfVar = this.f5078c;
            C0379dh dhVar = zfVar.f5296f;
            String packageName = zfVar.f5295e.getPackageName();
            String str = this.f5076a.f4957a;
            String str2 = this.f5078c.f5292b;
            int i = C0423eh.f2000a;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str2);
            Bundle g = dhVar.mo2657g(9, packageName, str, bundle);
            C1455zf.m3962d(this.f5078c, new C1417yg(this, C0423eh.m1591a(g, "BillingClient"), C0423eh.m1594d(g, "BillingClient")));
            return null;
        } catch (Exception e) {
            C1455zf.m3962d(this.f5078c, new C1457zg(this, e));
            return null;
        }
    }
}
