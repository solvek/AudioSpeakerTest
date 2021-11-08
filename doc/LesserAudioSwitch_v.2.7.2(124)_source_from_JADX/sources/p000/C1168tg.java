package p000;

import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* renamed from: tg */
public final class C1168tg implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ String f4436a;

    /* renamed from: b */
    public final /* synthetic */ List f4437b;

    /* renamed from: c */
    public final /* synthetic */ C0422eg f4438c;

    /* renamed from: d */
    public final /* synthetic */ C1455zf f4439d;

    public C1168tg(C1455zf zfVar, String str, List list, String str2, C0422eg egVar) {
        this.f4439d = zfVar;
        this.f4436a = str;
        this.f4437b = list;
        this.f4438c = egVar;
    }

    public final Object call() {
        Object obj;
        SkuDetails.C0289a aVar;
        int i;
        List list;
        Bundle bundle;
        C1455zf zfVar = this.f4439d;
        String str = this.f4436a;
        List list2 = this.f4437b;
        zfVar.getClass();
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                aVar = new SkuDetails.C0289a(0, "", arrayList);
                break;
            }
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(list2.subList(i2, i3 > size ? size : i3));
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle2.putString("playBillingLibraryVersion", zfVar.f5292b);
            try {
                if (zfVar.f5302l) {
                    C0379dh dhVar = zfVar.f5296f;
                    String packageName = zfVar.f5295e.getPackageName();
                    boolean z = zfVar.f5301k;
                    boolean z2 = zfVar.f5303m;
                    boolean z3 = zfVar.f5304n;
                    String str2 = zfVar.f5292b;
                    int i4 = C0423eh.f2000a;
                    list = list2;
                    Bundle bundle3 = new Bundle();
                    if (z) {
                        bundle3.putString("playBillingLibraryVersion", str2);
                    }
                    if (z && z3) {
                        bundle3.putBoolean("enablePendingPurchases", true);
                    }
                    i = 5;
                    try {
                        bundle = dhVar.mo2652b(10, packageName, str, bundle2, bundle3);
                    } catch (Exception e) {
                        e = e;
                        String valueOf = String.valueOf(e);
                        "querySkuDetailsAsync got a remote exception (try to reconnect).".length();
                        valueOf.length();
                        int i5 = C0423eh.f2000a;
                        Log.isLoggable("BillingClient", i);
                        obj = null;
                        aVar = new SkuDetails.C0289a(-1, "Service connection is disconnected.", (List<SkuDetails>) null);
                        C1455zf.m3962d(this.f4439d, new C1311wg(this, aVar));
                        return obj;
                    }
                } else {
                    list = list2;
                    i = 5;
                    bundle = zfVar.f5296f.mo2654d(3, zfVar.f5295e.getPackageName(), str, bundle2);
                }
                if (bundle == null) {
                    int i6 = C0423eh.f2000a;
                    Log.isLoggable("BillingClient", i);
                    obj = null;
                    aVar = new SkuDetails.C0289a(4, "Null sku details list", (List<SkuDetails>) null);
                    break;
                } else if (!bundle.containsKey("DETAILS_LIST")) {
                    int a = C0423eh.m1591a(bundle, "BillingClient");
                    String d = C0423eh.m1594d(bundle, "BillingClient");
                    if (a != 0) {
                        Log.isLoggable("BillingClient", i);
                        aVar = new SkuDetails.C0289a(a, d, arrayList);
                    } else {
                        Log.isLoggable("BillingClient", i);
                        aVar = new SkuDetails.C0289a(6, d, arrayList);
                    }
                    obj = null;
                } else {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        int i7 = C0423eh.f2000a;
                        Log.isLoggable("BillingClient", i);
                        obj = null;
                        aVar = new SkuDetails.C0289a(4, "querySkuDetailsAsync got null response list", (List<SkuDetails>) null);
                        break;
                    }
                    int i8 = 0;
                    while (i8 < stringArrayList.size()) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i8));
                            String.valueOf(skuDetails).length();
                            int i9 = C0423eh.f2000a;
                            Log.isLoggable("BillingClient", 2);
                            arrayList.add(skuDetails);
                            i8++;
                        } catch (JSONException unused) {
                            int i10 = C0423eh.f2000a;
                            Log.isLoggable("BillingClient", i);
                            aVar = new SkuDetails.C0289a(6, "Error trying to decode SkuDetails.", (List<SkuDetails>) null);
                            obj = null;
                        }
                    }
                    i2 = i3;
                    list2 = list;
                }
            } catch (Exception e2) {
                e = e2;
                i = 5;
                String valueOf2 = String.valueOf(e);
                "querySkuDetailsAsync got a remote exception (try to reconnect).".length();
                valueOf2.length();
                int i52 = C0423eh.f2000a;
                Log.isLoggable("BillingClient", i);
                obj = null;
                aVar = new SkuDetails.C0289a(-1, "Service connection is disconnected.", (List<SkuDetails>) null);
                C1455zf.m3962d(this.f4439d, new C1311wg(this, aVar));
                return obj;
            }
        }
        C1455zf.m3962d(this.f4439d, new C1311wg(this, aVar));
        return obj;
    }
}
