package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.List;
import p000.C0277cg;

/* renamed from: ug */
public final class C1210ug extends ResultReceiver {

    /* renamed from: b */
    public final /* synthetic */ C1455zf f4627b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1210ug(C1455zf zfVar, Handler handler) {
        super(handler);
        this.f4627b = zfVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        C0378dg dgVar = this.f4627b.f5294d.f3959b.f4255a;
        if (dgVar == null) {
            int i2 = C0423eh.f2000a;
            Log.isLoggable("BillingClient", 5);
            return;
        }
        List<Purchase> b = C0423eh.m1592b(bundle);
        C0277cg.C0278a a = C0277cg.m1102a();
        a.f1386a = i;
        a.f1387b = C0423eh.m1594d(bundle, "BillingClient");
        ((C1468zo) dgVar).mo5310g(a.mo1764a(), b);
    }
}
