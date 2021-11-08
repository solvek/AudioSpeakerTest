package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: sg */
public final class C1120sg extends BroadcastReceiver {

    /* renamed from: a */
    public final C0378dg f4255a;

    /* renamed from: b */
    public boolean f4256b;

    /* renamed from: c */
    public final /* synthetic */ C1061rg f4257c;

    public C1120sg(C1061rg rgVar, C0378dg dgVar, C1018qg qgVar) {
        this.f4257c = rgVar;
        this.f4255a = dgVar;
    }

    public final void onReceive(Context context, Intent intent) {
        ((C1468zo) this.f4255a).mo5310g(C0423eh.m1593c(intent, "BillingBroadcastManager"), C0423eh.m1592b(intent.getExtras()));
    }
}
