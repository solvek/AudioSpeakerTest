package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p000.C0277cg;

/* renamed from: eh */
public final class C0423eh {

    /* renamed from: a */
    public static int f2000a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m1591a(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            Log.isLoggable(str, 2);
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            if (name.length() != 0) {
                "Unexpected type for bundle response code: ".concat(name);
            } else {
                new String("Unexpected type for bundle response code: ");
            }
            Log.isLoggable(str, 5);
            return 6;
        }
    }

    /* renamed from: b */
    public static List<Purchase> m1592b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Log.isLoggable("BillingHelper", 5);
            Purchase e = m1595e(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (e == null) {
                Log.isLoggable("BillingHelper", 5);
                return null;
            }
            arrayList.add(e);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase e2 = m1595e(stringArrayList.get(i), stringArrayList2.get(i));
                if (e2 != null) {
                    arrayList.add(e2);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static C0277cg m1593c(Intent intent, String str) {
        if (intent == null) {
            Log.isLoggable("BillingHelper", 5);
            C0277cg.C0278a a = C0277cg.m1102a();
            a.f1386a = 6;
            a.f1387b = "An internal error occurred.";
            return a.mo1764a();
        }
        C0277cg.C0278a a2 = C0277cg.m1102a();
        a2.f1386a = m1591a(intent.getExtras(), str);
        a2.f1387b = m1594d(intent.getExtras(), str);
        return a2.mo1764a();
    }

    /* renamed from: d */
    public static String m1594d(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            Log.isLoggable(str, 2);
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (name.length() != 0) {
                "Unexpected type for debug message: ".concat(name);
            } else {
                new String("Unexpected type for debug message: ");
            }
            Log.isLoggable(str, 5);
            return "";
        }
    }

    /* renamed from: e */
    public static Purchase m1595e(String str, String str2) {
        if (str == null || str2 == null) {
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            String.valueOf(e).length();
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
    }
}
