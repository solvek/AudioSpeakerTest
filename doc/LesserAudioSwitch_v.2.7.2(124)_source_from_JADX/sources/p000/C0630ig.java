package p000;

import com.android.billingclient.api.Purchase;
import java.util.concurrent.Callable;

/* renamed from: ig */
public final class C0630ig implements Callable<Purchase.C0288a> {

    /* renamed from: a */
    public final /* synthetic */ String f2705a;

    /* renamed from: b */
    public final /* synthetic */ C1455zf f2706b;

    public C0630ig(C1455zf zfVar, String str) {
        this.f2706b = zfVar;
        this.f2705a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r17 = this;
            r1 = r17
            zf r0 = r1.f2706b
            java.lang.String r8 = r1.f2705a
            r0.getClass()
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r3 = r2.length()
            java.lang.String r4 = "Querying owned items, item type: "
            if (r3 == 0) goto L_0x0019
            r4.concat(r2)
            goto L_0x001e
        L_0x0019:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x001e:
            int r2 = p000.C0423eh.f2000a
            java.lang.String r9 = "BillingClient"
            r10 = 2
            android.util.Log.isLoggable(r9, r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            boolean r2 = r0.f5301k
            boolean r3 = r0.f5304n
            java.lang.String r4 = r0.f5292b
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r5 = "playBillingLibraryVersion"
            r12.putString(r5, r4)
            r13 = 1
            if (r2 == 0) goto L_0x0045
            if (r3 == 0) goto L_0x0045
            java.lang.String r2 = "enablePendingPurchases"
            r12.putBoolean(r2, r13)
        L_0x0045:
            r6 = 0
        L_0x0046:
            r15 = 5
            boolean r2 = r0.f5301k     // Catch:{ Exception -> 0x01b0 }
            if (r2 == 0) goto L_0x005c
            dh r2 = r0.f5296f     // Catch:{ Exception -> 0x01b0 }
            r3 = 9
            android.content.Context r4 = r0.f5295e     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x01b0 }
            r5 = r8
            r7 = r12
            android.os.Bundle r2 = r2.mo2653c(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01b0 }
            goto L_0x0069
        L_0x005c:
            dh r2 = r0.f5296f     // Catch:{ Exception -> 0x01b0 }
            r3 = 3
            android.content.Context r4 = r0.f5295e     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x01b0 }
            android.os.Bundle r2 = r2.mo2651a(r3, r4, r8, r6)     // Catch:{ Exception -> 0x01b0 }
        L_0x0069:
            java.lang.String r3 = "getPurchase()"
            cg r4 = p000.C0977pg.f3635j
            java.lang.String r5 = "INAPP_DATA_SIGNATURE_LIST"
            java.lang.String r6 = "INAPP_PURCHASE_DATA_LIST"
            java.lang.String r7 = "INAPP_PURCHASE_ITEM_LIST"
            r16 = 0
            if (r2 != 0) goto L_0x0086
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r16] = r3
            java.lang.String r3 = "%s got null owned items list"
            java.lang.String.format(r3, r14)
            int r3 = p000.C0423eh.f2000a
            android.util.Log.isLoggable(r9, r15)
            goto L_0x00b1
        L_0x0086:
            int r14 = p000.C0423eh.m1591a(r2, r9)
            java.lang.String r15 = p000.C0423eh.m1594d(r2, r9)
            cg$a r13 = p000.C0277cg.m1102a()
            r13.f1386a = r14
            r13.f1387b = r15
            cg r13 = r13.mo1764a()
            if (r14 == 0) goto L_0x00b3
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r16] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r14 = 1
            r4[r14] = r3
            java.lang.String r3 = "%s failed. Response code: %s"
            java.lang.String.format(r3, r4)
            r3 = 5
            android.util.Log.isLoggable(r9, r3)
            r4 = r13
        L_0x00b1:
            r13 = 1
            goto L_0x0109
        L_0x00b3:
            boolean r13 = r2.containsKey(r7)
            if (r13 == 0) goto L_0x00fb
            boolean r13 = r2.containsKey(r6)
            if (r13 == 0) goto L_0x00fb
            boolean r13 = r2.containsKey(r5)
            if (r13 != 0) goto L_0x00c6
            goto L_0x00fb
        L_0x00c6:
            java.util.ArrayList r13 = r2.getStringArrayList(r7)
            java.util.ArrayList r14 = r2.getStringArrayList(r6)
            java.util.ArrayList r15 = r2.getStringArrayList(r5)
            if (r13 != 0) goto L_0x00df
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r16] = r3
            java.lang.String r3 = "Bundle returned from %s contains null SKUs list."
            java.lang.String.format(r3, r14)
            goto L_0x0105
        L_0x00df:
            r13 = 1
            if (r14 != 0) goto L_0x00ec
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r16] = r3
            java.lang.String r3 = "Bundle returned from %s contains null purchases list."
            java.lang.String.format(r3, r14)
            goto L_0x0105
        L_0x00ec:
            if (r15 != 0) goto L_0x00f8
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r16] = r3
            java.lang.String r3 = "Bundle returned from %s contains null signatures list."
            java.lang.String.format(r3, r14)
            goto L_0x0105
        L_0x00f8:
            cg r4 = p000.C0977pg.f3636k
            goto L_0x0109
        L_0x00fb:
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r16] = r3
            java.lang.String r3 = "Bundle returned from %s doesn't contain required fields."
            java.lang.String.format(r3, r14)
        L_0x0105:
            r3 = 5
            android.util.Log.isLoggable(r9, r3)
        L_0x0109:
            cg r3 = p000.C0977pg.f3636k
            if (r4 == r3) goto L_0x0115
            com.android.billingclient.api.Purchase$a r0 = new com.android.billingclient.api.Purchase$a
            r2 = 0
            r0.<init>(r4, r2)
            goto L_0x01c4
        L_0x0115:
            java.util.ArrayList r3 = r2.getStringArrayList(r7)
            java.util.ArrayList r4 = r2.getStringArrayList(r6)
            java.util.ArrayList r5 = r2.getStringArrayList(r5)
            r6 = 0
        L_0x0122:
            int r7 = r4.size()
            if (r6 >= r7) goto L_0x0181
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r14 = r5.get(r6)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r3.get(r6)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r13 = "Sku is owned: "
            java.lang.String r15 = java.lang.String.valueOf(r15)
            int r16 = r15.length()
            if (r16 == 0) goto L_0x014a
            r13.concat(r15)
            goto L_0x014f
        L_0x014a:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r13)
        L_0x014f:
            android.util.Log.isLoggable(r9, r10)
            com.android.billingclient.api.Purchase r13 = new com.android.billingclient.api.Purchase     // Catch:{ JSONException -> 0x016c }
            r13.<init>(r7, r14)     // Catch:{ JSONException -> 0x016c }
            java.lang.String r7 = r13.mo1798b()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0165
            r7 = 5
            android.util.Log.isLoggable(r9, r7)
        L_0x0165:
            r11.add(r13)
            int r6 = r6 + 1
            r13 = 1
            goto L_0x0122
        L_0x016c:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            r2 = 5
            android.util.Log.isLoggable(r9, r2)
            com.android.billingclient.api.Purchase$a r0 = new com.android.billingclient.api.Purchase$a
            cg r2 = p000.C0977pg.f3635j
            r3 = 0
            r0.<init>(r2, r3)
            goto L_0x01c4
        L_0x0181:
            java.lang.String r3 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r6 = r2.getString(r3)
            java.lang.String r2 = "Continuation token: "
            java.lang.String r3 = java.lang.String.valueOf(r6)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0197
            r2.concat(r3)
            goto L_0x019c
        L_0x0197:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
        L_0x019c:
            android.util.Log.isLoggable(r9, r10)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x01ad
            com.android.billingclient.api.Purchase$a r0 = new com.android.billingclient.api.Purchase$a
            cg r2 = p000.C0977pg.f3636k
            r0.<init>(r2, r11)
            goto L_0x01c4
        L_0x01ad:
            r13 = 1
            goto L_0x0046
        L_0x01b0:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            r2 = 5
            android.util.Log.isLoggable(r9, r2)
            com.android.billingclient.api.Purchase$a r0 = new com.android.billingclient.api.Purchase$a
            cg r2 = p000.C0977pg.f3637l
            r3 = 0
            r0.<init>(r2, r3)
        L_0x01c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0630ig.call():java.lang.Object");
    }
}
