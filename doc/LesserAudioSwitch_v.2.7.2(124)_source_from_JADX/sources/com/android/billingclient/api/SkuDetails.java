package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class SkuDetails {

    /* renamed from: a */
    public final String f1413a;

    /* renamed from: b */
    public final JSONObject f1414b;

    /* renamed from: com.android.billingclient.api.SkuDetails$a */
    public static class C0289a {

        /* renamed from: a */
        public final List<SkuDetails> f1415a;

        /* renamed from: b */
        public final int f1416b;

        /* renamed from: c */
        public final String f1417c;

        public C0289a(int i, String str, List<SkuDetails> list) {
            this.f1416b = i;
            this.f1417c = str;
            this.f1415a = list;
        }
    }

    public SkuDetails(String str) {
        this.f1413a = str;
        this.f1414b = new JSONObject(str);
        if (TextUtils.isEmpty(mo1803a())) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(mo1804b())) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    /* renamed from: a */
    public String mo1803a() {
        return this.f1414b.optString("productId");
    }

    /* renamed from: b */
    public String mo1804b() {
        return this.f1414b.optString("type");
    }

    /* renamed from: c */
    public final String mo1805c() {
        return this.f1414b.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f1413a, ((SkuDetails) obj).f1413a);
    }

    public int hashCode() {
        return this.f1413a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f1413a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
