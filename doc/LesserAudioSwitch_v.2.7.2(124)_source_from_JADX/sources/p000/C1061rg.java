package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: rg */
public final class C1061rg {

    /* renamed from: a */
    public final Context f3958a;

    /* renamed from: b */
    public final C1120sg f3959b;

    public C1061rg(Context context, C0378dg dgVar) {
        this.f3958a = context;
        this.f3959b = new C1120sg(this, dgVar, (C1018qg) null);
    }

    /* renamed from: a */
    public final void mo4255a() {
        C1120sg sgVar = this.f3959b;
        Context context = this.f3958a;
        if (sgVar.f4256b) {
            context.unregisterReceiver(sgVar.f4257c.f3959b);
            sgVar.f4256b = false;
            return;
        }
        int i = C0423eh.f2000a;
        Log.isLoggable("BillingBroadcastManager", 5);
    }
}
