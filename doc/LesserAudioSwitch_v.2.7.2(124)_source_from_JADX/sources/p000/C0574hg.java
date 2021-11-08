package p000;

import android.os.Bundle;
import com.android.billingclient.api.SkuDetails;
import java.util.concurrent.Callable;

/* renamed from: hg */
public final class C0574hg implements Callable<Bundle> {

    /* renamed from: a */
    public final /* synthetic */ int f2473a;

    /* renamed from: b */
    public final /* synthetic */ SkuDetails f2474b;

    /* renamed from: c */
    public final /* synthetic */ String f2475c;

    /* renamed from: d */
    public final /* synthetic */ C0221bg f2476d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f2477e;

    /* renamed from: f */
    public final /* synthetic */ C1455zf f2478f;

    public C0574hg(C1455zf zfVar, int i, SkuDetails skuDetails, String str, C0221bg bgVar, Bundle bundle) {
        this.f2478f = zfVar;
        this.f2473a = i;
        this.f2474b = skuDetails;
        this.f2475c = str;
        this.f2476d = bgVar;
        this.f2477e = bundle;
    }

    public final /* synthetic */ Object call() {
        C1455zf zfVar = this.f2478f;
        C0379dh dhVar = zfVar.f5296f;
        int i = this.f2473a;
        String packageName = zfVar.f5295e.getPackageName();
        String a = this.f2474b.mo1803a();
        String str = this.f2475c;
        this.f2476d.getClass();
        return dhVar.mo2659i(i, packageName, a, str, (String) null, this.f2477e);
    }
}
