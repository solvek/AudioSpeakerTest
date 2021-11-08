package p000;

import android.os.Bundle;
import com.android.billingclient.api.SkuDetails;
import java.util.concurrent.Callable;

/* renamed from: jg */
public final class C0683jg implements Callable<Bundle> {

    /* renamed from: a */
    public final /* synthetic */ SkuDetails f2903a;

    /* renamed from: b */
    public final /* synthetic */ String f2904b;

    /* renamed from: c */
    public final /* synthetic */ C1455zf f2905c;

    public C0683jg(C1455zf zfVar, SkuDetails skuDetails, String str) {
        this.f2905c = zfVar;
        this.f2903a = skuDetails;
        this.f2904b = str;
    }

    public final /* synthetic */ Object call() {
        C1455zf zfVar = this.f2905c;
        return zfVar.f5296f.mo2658h(3, zfVar.f5295e.getPackageName(), this.f2903a.mo1803a(), this.f2904b, (String) null);
    }
}
