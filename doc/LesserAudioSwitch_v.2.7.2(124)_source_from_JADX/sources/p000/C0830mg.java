package p000;

import java.util.concurrent.Callable;
import p000.C1455zf;

/* renamed from: mg */
public final class C0830mg implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ C1455zf.C1456a f3285a;

    public C0830mg(C1455zf.C1456a aVar) {
        this.f3285a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r12 = this;
            zf$a r0 = r12.f3285a
            java.lang.Object r0 = r0.f5307a
            monitor-enter(r0)
            zf$a r1 = r12.f3285a     // Catch:{ all -> 0x00c8 }
            boolean r2 = r1.f5308b     // Catch:{ all -> 0x00c8 }
            r3 = 0
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c7
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
            r0 = 5
            r2 = 3
            r4 = 0
            zf r1 = p000.C1455zf.this     // Catch:{ Exception -> 0x00ab }
            android.content.Context r1 = r1.f5295e     // Catch:{ Exception -> 0x00ab }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x00ab }
            r5 = 13
            r6 = 13
            r7 = 3
        L_0x0020:
            if (r6 < r2) goto L_0x0037
            zf$a r8 = r12.f3285a     // Catch:{ Exception -> 0x0034 }
            zf r8 = p000.C1455zf.this     // Catch:{ Exception -> 0x0034 }
            dh r8 = r8.f5296f     // Catch:{ Exception -> 0x0034 }
            java.lang.String r9 = "subs"
            int r7 = r8.mo2656f(r6, r1, r9)     // Catch:{ Exception -> 0x0034 }
            if (r7 != 0) goto L_0x0031
            goto L_0x0038
        L_0x0031:
            int r6 = r6 + -1
            goto L_0x0020
        L_0x0034:
            r2 = r7
            goto L_0x00ab
        L_0x0037:
            r6 = 0
        L_0x0038:
            zf$a r8 = r12.f3285a     // Catch:{ Exception -> 0x0034 }
            zf r8 = p000.C1455zf.this     // Catch:{ Exception -> 0x0034 }
            r9 = 1
            if (r6 < r0) goto L_0x0041
            r10 = 1
            goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            r8.f5299i = r10     // Catch:{ Exception -> 0x0034 }
            if (r6 < r2) goto L_0x0048
            r10 = 1
            goto L_0x0049
        L_0x0048:
            r10 = 0
        L_0x0049:
            r8.f5298h = r10     // Catch:{ Exception -> 0x0034 }
            r8 = 2
            if (r6 >= r2) goto L_0x0055
            java.lang.String r6 = "BillingClient"
            int r10 = p000.C0423eh.f2000a     // Catch:{ Exception -> 0x0034 }
            android.util.Log.isLoggable(r6, r8)     // Catch:{ Exception -> 0x0034 }
        L_0x0055:
            r6 = 13
        L_0x0057:
            if (r6 < r2) goto L_0x006b
            zf$a r10 = r12.f3285a     // Catch:{ Exception -> 0x0034 }
            zf r10 = p000.C1455zf.this     // Catch:{ Exception -> 0x0034 }
            dh r10 = r10.f5296f     // Catch:{ Exception -> 0x0034 }
            java.lang.String r11 = "inapp"
            int r7 = r10.mo2656f(r6, r1, r11)     // Catch:{ Exception -> 0x0034 }
            if (r7 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r6 = r6 + -1
            goto L_0x0057
        L_0x006b:
            r6 = 0
        L_0x006c:
            zf$a r1 = r12.f3285a     // Catch:{ Exception -> 0x0034 }
            zf r1 = p000.C1455zf.this     // Catch:{ Exception -> 0x0034 }
            if (r6 < r5) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            r1.f5303m = r5     // Catch:{ Exception -> 0x0034 }
            r5 = 10
            if (r6 < r5) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            r1.f5302l = r5     // Catch:{ Exception -> 0x0034 }
            r5 = 9
            if (r6 < r5) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            r1.f5301k = r5     // Catch:{ Exception -> 0x0034 }
            r5 = 6
            if (r6 < r5) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r9 = 0
        L_0x008e:
            r1.f5300j = r9     // Catch:{ Exception -> 0x0034 }
            if (r6 >= r2) goto L_0x0099
            java.lang.String r1 = "BillingClient"
            int r2 = p000.C0423eh.f2000a     // Catch:{ Exception -> 0x0034 }
            android.util.Log.isLoggable(r1, r0)     // Catch:{ Exception -> 0x0034 }
        L_0x0099:
            if (r7 != 0) goto L_0x00a2
            zf$a r1 = r12.f3285a     // Catch:{ Exception -> 0x0034 }
            zf r1 = p000.C1455zf.this     // Catch:{ Exception -> 0x0034 }
            r1.f5291a = r8     // Catch:{ Exception -> 0x0034 }
            goto L_0x00bb
        L_0x00a2:
            zf$a r1 = r12.f3285a     // Catch:{ Exception -> 0x0034 }
            zf r1 = p000.C1455zf.this     // Catch:{ Exception -> 0x0034 }
            r1.f5291a = r4     // Catch:{ Exception -> 0x0034 }
            r1.f5296f = r3     // Catch:{ Exception -> 0x0034 }
            goto L_0x00bb
        L_0x00ab:
            java.lang.String r1 = "BillingClient"
            int r5 = p000.C0423eh.f2000a
            android.util.Log.isLoggable(r1, r0)
            zf$a r0 = r12.f3285a
            zf r0 = p000.C1455zf.this
            r0.f5291a = r4
            r0.f5296f = r3
            r7 = r2
        L_0x00bb:
            zf$a r0 = r12.f3285a
            if (r7 != 0) goto L_0x00c2
            cg r1 = p000.C0977pg.f3636k
            goto L_0x00c4
        L_0x00c2:
            cg r1 = p000.C0977pg.f3626a
        L_0x00c4:
            p000.C1455zf.C1456a.m3967a(r0, r1)
        L_0x00c7:
            return r3
        L_0x00c8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x00cc
        L_0x00cb:
            throw r1
        L_0x00cc:
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0830mg.call():java.lang.Object");
    }
}
