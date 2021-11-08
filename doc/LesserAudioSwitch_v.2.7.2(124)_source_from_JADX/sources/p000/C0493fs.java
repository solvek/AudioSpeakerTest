package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.PurchaseItemView;

/* renamed from: fs */
public final /* synthetic */ class C0493fs implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ PurchaseItemView f2182b;

    public /* synthetic */ C0493fs(PurchaseItemView purchaseItemView) {
        this.f2182b = purchaseItemView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: hg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: jg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: gg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: hg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: hg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: hg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r0 = r19
            com.nordskog.LesserAudioSwitch.ui.PurchaseItemView r1 = r0.f2182b
            com.nordskog.LesserAudioSwitch.ui.PurchaseItemView$a r2 = r1.f1795l
            if (r2 == 0) goto L_0x0418
            bp r1 = r1.f1793j
            bt$a r2 = (p000.C0235bt.C0236a) r2
            if (r1 == 0) goto L_0x0418
            bt r3 = p000.C0235bt.this
            r4 = 1
            r3.f1299j0 = r4
            android.content.Context r3 = r3.mo868l()
            r5 = -94548093392044(0xffffaa024e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)
            zo r3 = p000.C1468zo.m3977e(r3, r5)
            lu<fp> r5 = r3.f5348l
            r5.mo3649e()
            bt r2 = p000.C0235bt.this
            v9 r2 = r2.mo862i()
            boolean r5 = r3.f5339c
            if (r5 != 0) goto L_0x005e
            r3 = 2131689582(0x7f0f006e, float:1.9008183E38)
            p000.C1468zo.m3976d(r2, r3)
            r2 = -52994284803244(0xffffcfcd4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = -53075889181868(0xffffcfba4e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r4)
            r3.append(r4)
            java.lang.String r1 = r1.f1290a
            r3.append(r1)
            r4 = -53153198593196(0xffffcfa84e7aab54, double:NaN)
            goto L_0x00c0
        L_0x005e:
            boolean r5 = r3.f5340d
            r6 = 2131689581(0x7f0f006d, float:1.9008181E38)
            if (r5 != 0) goto L_0x008d
            p000.C1468zo.m3976d(r2, r6)
            r2 = -53316407350444(0xffffcf824e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = -53398011729068(0xffffcf6f4e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r4)
            r3.append(r4)
            java.lang.String r1 = r1.f1290a
            r3.append(r1)
            r4 = -53475321140396(0xffffcf5d4e7aab54, double:NaN)
            goto L_0x00c0
        L_0x008d:
            java.util.Map<java.lang.String, com.android.billingclient.api.SkuDetails> r5 = r3.f5341e
            java.lang.String r7 = r1.f1290a
            java.lang.Object r5 = r5.get(r7)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            if (r5 != 0) goto L_0x00d0
            p000.C1468zo.m3976d(r2, r6)
            r2 = -53621350028460(0xffffcf3b4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = -53702954407084(0xffffcf284e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r4)
            r3.append(r4)
            java.lang.String r1 = r1.f1290a
            r3.append(r1)
            r4 = -53780263818412(0xffffcf164e7aab54, double:NaN)
        L_0x00c0:
            java.lang.String r1 = p000.C0200av.m970a(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            p000.C0550gu.m1822d(r2, r1)
            goto L_0x0418
        L_0x00d0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r5)
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x0410
            int r5 = r1.size()
            r6 = 0
            r7 = 0
        L_0x00e4:
            if (r7 >= r5) goto L_0x00f9
            java.lang.Object r8 = r1.get(r7)
            int r7 = r7 + 1
            com.android.billingclient.api.SkuDetails r8 = (com.android.billingclient.api.SkuDetails) r8
            if (r8 == 0) goto L_0x00f1
            goto L_0x00e4
        L_0x00f1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "SKU cannot be null."
            r1.<init>(r2)
            throw r1
        L_0x00f9:
            int r5 = r1.size()
            if (r5 <= r4) goto L_0x0177
            java.lang.Object r5 = r1.get(r6)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.String r7 = r5.mo1804b()
            int r8 = r1.size()
            r9 = 0
        L_0x010e:
            if (r9 >= r8) goto L_0x012b
            java.lang.Object r10 = r1.get(r9)
            int r9 = r9 + 1
            com.android.billingclient.api.SkuDetails r10 = (com.android.billingclient.api.SkuDetails) r10
            java.lang.String r10 = r10.mo1804b()
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x0123
            goto L_0x010e
        L_0x0123:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "SKUs should have the same type."
            r1.<init>(r2)
            throw r1
        L_0x012b:
            java.lang.String r5 = r5.mo1805c()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r8 = "All SKUs must have the same package name."
            if (r7 == 0) goto L_0x0157
            int r5 = r1.size()
            r7 = 0
        L_0x013c:
            if (r7 >= r5) goto L_0x0177
            java.lang.Object r9 = r1.get(r7)
            int r7 = r7 + 1
            com.android.billingclient.api.SkuDetails r9 = (com.android.billingclient.api.SkuDetails) r9
            java.lang.String r9 = r9.mo1805c()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0151
            goto L_0x013c
        L_0x0151:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r8)
            throw r1
        L_0x0157:
            int r7 = r1.size()
            r9 = 0
        L_0x015c:
            if (r9 >= r7) goto L_0x0177
            java.lang.Object r10 = r1.get(r9)
            int r9 = r9 + 1
            com.android.billingclient.api.SkuDetails r10 = (com.android.billingclient.api.SkuDetails) r10
            java.lang.String r10 = r10.mo1805c()
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x0171
            goto L_0x015c
        L_0x0171:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r8)
            throw r1
        L_0x0177:
            bg r14 = new bg
            r5 = 0
            r14.<init>(r5)
            r14.f1264a = r5
            r14.f1267d = r5
            r14.f1265b = r5
            r14.f1266c = r5
            r14.f1268e = r6
            r14.f1269f = r1
            r14.f1270g = r6
            yf r1 = r3.f5337a
            zf r1 = (p000.C1455zf) r1
            java.lang.String r7 = "BUY_INTENT"
            boolean r8 = r1.mo5290a()
            if (r8 != 0) goto L_0x0199
            goto L_0x03d1
        L_0x0199:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList<com.android.billingclient.api.SkuDetails> r9 = r14.f1269f
            r8.addAll(r9)
            java.lang.Object r9 = r8.get(r6)
            r12 = r9
            com.android.billingclient.api.SkuDetails r12 = (com.android.billingclient.api.SkuDetails) r12
            java.lang.String r13 = r12.mo1804b()
            java.lang.String r9 = "subs"
            boolean r9 = r13.equals(r9)
            java.lang.String r15 = "BillingClient"
            r11 = 5
            if (r9 == 0) goto L_0x01c6
            boolean r9 = r1.f5298h
            if (r9 != 0) goto L_0x01c6
            int r2 = p000.C0423eh.f2000a
            android.util.Log.isLoggable(r15, r11)
            cg r2 = p000.C0977pg.f3639n
            goto L_0x03e0
        L_0x01c6:
            java.lang.String r9 = r14.f1265b
            if (r9 == 0) goto L_0x01cc
            r9 = 1
            goto L_0x01cd
        L_0x01cc:
            r9 = 0
        L_0x01cd:
            if (r9 == 0) goto L_0x01dc
            boolean r10 = r1.f5299i
            if (r10 != 0) goto L_0x01dc
            int r2 = p000.C0423eh.f2000a
            android.util.Log.isLoggable(r15, r11)
            cg r2 = p000.C0977pg.f3640o
            goto L_0x03e0
        L_0x01dc:
            java.util.ArrayList<com.android.billingclient.api.SkuDetails> r10 = r14.f1269f
            int r5 = r10.size()
        L_0x01e2:
            if (r6 >= r5) goto L_0x01f8
            java.lang.Object r17 = r10.get(r6)
            int r6 = r6 + 1
            com.android.billingclient.api.SkuDetails r17 = (com.android.billingclient.api.SkuDetails) r17
            java.lang.String r17 = r17.mo1805c()
            boolean r17 = r17.isEmpty()
            if (r17 == 0) goto L_0x01e2
            r5 = 0
            goto L_0x01f9
        L_0x01f8:
            r5 = 1
        L_0x01f9:
            boolean r6 = r14.f1270g
            if (r6 != 0) goto L_0x020e
            java.lang.String r6 = r14.f1264a
            if (r6 != 0) goto L_0x020e
            java.lang.String r6 = r14.f1267d
            if (r6 != 0) goto L_0x020e
            int r6 = r14.f1268e
            if (r6 != 0) goto L_0x020e
            if (r5 == 0) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            r5 = 0
            goto L_0x020f
        L_0x020e:
            r5 = 1
        L_0x020f:
            if (r5 == 0) goto L_0x021e
            boolean r5 = r1.f5300j
            if (r5 != 0) goto L_0x021e
            int r2 = p000.C0423eh.f2000a
            android.util.Log.isLoggable(r15, r11)
            cg r2 = p000.C0977pg.f3633h
            goto L_0x03e0
        L_0x021e:
            java.lang.String r5 = ""
            r6 = 0
        L_0x0221:
            int r10 = r8.size()
            if (r6 >= r10) goto L_0x0264
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r10 = r8.get(r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r17 = r5.length()
            int r18 = r10.length()
            int r11 = r18 + r17
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r5 = r8.size()
            r10 = 1
            int r5 = r5 - r10
            if (r6 >= r5) goto L_0x025e
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = ", "
            java.lang.String r4 = r4.concat(r5)
        L_0x025e:
            r5 = r4
            int r6 = r6 + 1
            r4 = 1
            r11 = 5
            goto L_0x0221
        L_0x0264:
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r4.length()
            r13.length()
            int r4 = p000.C0423eh.f2000a
            r4 = 2
            android.util.Log.isLoggable(r15, r4)
            boolean r4 = r1.f5300j
            if (r4 == 0) goto L_0x036f
            boolean r4 = r1.f5301k
            boolean r6 = r1.f5304n
            java.lang.String r9 = r1.f5292b
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r10 = "playBillingLibraryVersion"
            r11.putString(r10, r9)
            int r9 = r14.f1268e
            if (r9 == 0) goto L_0x0291
            java.lang.String r10 = "prorationMode"
            r11.putInt(r10, r9)
        L_0x0291:
            java.lang.String r9 = r14.f1264a
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x02a0
            java.lang.String r9 = r14.f1264a
            java.lang.String r10 = "accountId"
            r11.putString(r10, r9)
        L_0x02a0:
            java.lang.String r9 = r14.f1267d
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x02af
            java.lang.String r9 = r14.f1267d
            java.lang.String r10 = "obfuscatedProfileId"
            r11.putString(r10, r9)
        L_0x02af:
            boolean r9 = r14.f1270g
            if (r9 == 0) goto L_0x02ba
            java.lang.String r9 = "vr"
            r10 = 1
            r11.putBoolean(r9, r10)
            goto L_0x02bb
        L_0x02ba:
            r10 = 1
        L_0x02bb:
            java.lang.String r9 = r14.f1265b
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x02d9
            java.util.ArrayList r9 = new java.util.ArrayList
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.String r10 = r14.f1265b
            r16 = 0
            r0[r16] = r10
            java.util.List r0 = java.util.Arrays.asList(r0)
            r9.<init>(r0)
            java.lang.String r0 = "skusToReplace"
            r11.putStringArrayList(r0, r9)
        L_0x02d9:
            java.lang.String r0 = r14.f1266c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = r14.f1266c
            java.lang.String r9 = "oldSkuPurchaseToken"
            r11.putString(r9, r0)
        L_0x02e8:
            if (r4 == 0) goto L_0x02f2
            if (r6 == 0) goto L_0x02f2
            java.lang.String r0 = "enablePendingPurchases"
            r4 = 1
            r11.putBoolean(r0, r4)
        L_0x02f2:
            org.json.JSONObject r0 = r12.f1414b
            java.lang.String r4 = "skuDetailsToken"
            java.lang.String r0 = r0.optString(r4)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0309
            org.json.JSONObject r0 = r12.f1414b
            java.lang.String r0 = r0.optString(r4)
            r11.putString(r4, r0)
        L_0x0309:
            java.lang.String r0 = r12.mo1805c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x031c
            java.lang.String r0 = r12.mo1805c()
            java.lang.String r4 = "skuPackageName"
            r11.putString(r4, r0)
        L_0x031c:
            r0 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0328
            java.lang.String r4 = "accountName"
            r11.putString(r4, r0)
        L_0x0328:
            int r0 = r8.size()
            r4 = 1
            if (r0 <= r4) goto L_0x0354
            java.util.ArrayList r0 = new java.util.ArrayList
            int r6 = r8.size()
            int r6 = r6 - r4
            r0.<init>(r6)
        L_0x0339:
            int r6 = r8.size()
            if (r4 >= r6) goto L_0x034f
            java.lang.Object r6 = r8.get(r4)
            com.android.billingclient.api.SkuDetails r6 = (com.android.billingclient.api.SkuDetails) r6
            java.lang.String r6 = r6.mo1803a()
            r0.add(r6)
            int r4 = r4 + 1
            goto L_0x0339
        L_0x034f:
            java.lang.String r4 = "additionalSkus"
            r11.putStringArrayList(r4, r0)
        L_0x0354:
            boolean r0 = r1.f5301k
            if (r0 == 0) goto L_0x035b
            r0 = 9
            goto L_0x0362
        L_0x035b:
            boolean r0 = r14.f1270g
            if (r0 == 0) goto L_0x0361
            r0 = 7
            goto L_0x0362
        L_0x0361:
            r0 = 6
        L_0x0362:
            hg r4 = new hg
            r9 = r4
            r10 = r1
            r6 = r11
            r8 = 5
            r11 = r0
            r0 = r15
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x037e
        L_0x036f:
            r0 = r15
            r8 = 5
            if (r9 == 0) goto L_0x0379
            gg r4 = new gg
            r4.<init>(r1, r14, r12)
            goto L_0x037e
        L_0x0379:
            jg r4 = new jg
            r4.<init>(r1, r12, r13)
        L_0x037e:
            r9 = 5000(0x1388, double:2.4703E-320)
            r6 = 0
            java.util.concurrent.Future r4 = r1.mo5292c(r4, r9, r6)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            java.lang.Object r4 = r4.get(r9, r6)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            int r6 = p000.C0423eh.m1591a(r4, r0)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            java.lang.String r9 = p000.C0423eh.m1594d(r4, r0)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            if (r6 == 0) goto L_0x03aa
            android.util.Log.isLoggable(r0, r8)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            cg$a r2 = p000.C0277cg.m1102a()     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            r2.f1386a = r6     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            r2.f1387b = r9     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            cg r2 = r2.mo1764a()     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            r1.mo5291b(r2)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            goto L_0x03e3
        L_0x03aa:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r9 = com.android.billingclient.api.ProxyBillingActivity.class
            r6.<init>(r2, r9)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            java.lang.String r9 = "result_receiver"
            android.os.ResultReceiver r10 = r1.f5306p     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            r6.putExtra(r9, r10)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            android.os.Parcelable r4 = r4.getParcelable(r7)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            r6.putExtra(r7, r4)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            r2.startActivity(r6)     // Catch:{ CancellationException | TimeoutException -> 0x03d4, Exception -> 0x03c7 }
            cg r2 = p000.C0977pg.f3636k
            goto L_0x03e3
        L_0x03c7:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r2.length()
            android.util.Log.isLoggable(r0, r8)
        L_0x03d1:
            cg r2 = p000.C0977pg.f3637l
            goto L_0x03e0
        L_0x03d4:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r2.length()
            android.util.Log.isLoggable(r0, r8)
            cg r2 = p000.C0977pg.f3638m
        L_0x03e0:
            r1.mo5291b(r2)
        L_0x03e3:
            int r0 = r2.f1384a
            if (r0 == 0) goto L_0x0418
            r0 = -54046551790764(0xffffced84e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = -54128156169388(0xffffcec54e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r4)
            r1.append(r4)
            java.lang.String r2 = r3.mo5314l(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p000.C0550gu.m1822d(r0, r1)
            goto L_0x0418
        L_0x0410:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "SkuDetails must be provided."
            r0.<init>(r1)
            throw r0
        L_0x0418:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0493fs.onClick(android.view.View):void");
    }
}
