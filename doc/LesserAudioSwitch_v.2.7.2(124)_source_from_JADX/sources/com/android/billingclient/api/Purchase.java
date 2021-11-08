package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class Purchase {

    /* renamed from: a */
    public final String f1408a;

    /* renamed from: b */
    public final String f1409b;

    /* renamed from: c */
    public final JSONObject f1410c;

    /* renamed from: com.android.billingclient.api.Purchase$a */
    public static class C0288a {

        /* renamed from: a */
        public final List<Purchase> f1411a;

        /* renamed from: b */
        public final C0277cg f1412b;

        public C0288a(C0277cg cgVar, List<Purchase> list) {
            this.f1411a = list;
            this.f1412b = cgVar;
        }
    }

    public Purchase(String str, String str2) {
        this.f1408a = str;
        this.f1409b = str2;
        this.f1410c = new JSONObject(str);
    }

    /* renamed from: a */
    public int mo1797a() {
        return this.f1410c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: b */
    public String mo1798b() {
        JSONObject jSONObject = this.f1410c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: c */
    public String mo1799c() {
        return this.f1410c.optString("productId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f1408a, purchase.f1408a) && TextUtils.equals(this.f1409b, purchase.f1409b);
    }

    public int hashCode() {
        return this.f1408a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f1408a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
