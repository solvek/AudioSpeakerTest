package p000;

import android.os.Bundle;
import com.android.billingclient.api.SkuDetails;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: gg */
public final class C0535gg implements Callable<Bundle> {

    /* renamed from: a */
    public final /* synthetic */ C0221bg f2323a;

    /* renamed from: b */
    public final /* synthetic */ SkuDetails f2324b;

    /* renamed from: c */
    public final /* synthetic */ C1455zf f2325c;

    public C0535gg(C1455zf zfVar, C0221bg bgVar, SkuDetails skuDetails) {
        this.f2325c = zfVar;
        this.f2323a = bgVar;
        this.f2324b = skuDetails;
    }

    public final Object call() {
        C1455zf zfVar = this.f2325c;
        return zfVar.f5296f.mo2655e(5, zfVar.f5295e.getPackageName(), Arrays.asList(new String[]{this.f2323a.f1265b}), this.f2324b.mo1803a(), "subs", (String) null);
    }
}
