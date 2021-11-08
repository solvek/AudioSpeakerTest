package p000;

import android.content.Context;
import p000.C0936oo;

/* renamed from: co */
public final /* synthetic */ class C0287co implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f1405b;

    /* renamed from: c */
    public final /* synthetic */ C0936oo.C0938b f1406c;

    public /* synthetic */ C0287co(Context context, C0936oo.C0938b bVar) {
        this.f1405b = context;
        this.f1406c = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5 A[LOOP:3: B:39:0x00bf->B:41:0x00c5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f1405b
            oo$b r1 = r15.f1406c
            ko r2 = new ko
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ko$f[] r3 = p000.C0735ko.C0741f.values()
            r4 = 0
            r5 = 0
        L_0x0014:
            r6 = 12
            if (r5 >= r6) goto L_0x00ee
            r6 = r3[r5]
            java.lang.reflect.Method r7 = p000.C0735ko.f3018g
            r8 = 1
            if (r7 == 0) goto L_0x003a
            android.media.AudioManager r9 = r2.f3020a     // Catch:{ Exception -> 0x0036 }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0036 }
            int r11 = r6.f3073b     // Catch:{ Exception -> 0x0036 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0036 }
            r10[r4] = r11     // Catch:{ Exception -> 0x0036 }
            java.lang.Object r7 = r7.invoke(r9, r10)     // Catch:{ Exception -> 0x0036 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0036 }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x0036 }
            goto L_0x003b
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()
        L_0x003a:
            r7 = 0
        L_0x003b:
            int r9 = r7 + -1
            r9 = r9 & r7
            if (r9 == 0) goto L_0x0078
            go r9 = p000.C0544go.f2370e
            int r9 = r9.f2409b
            r10 = r7 & r9
            if (r10 == 0) goto L_0x004a
        L_0x0048:
            r7 = r9
            goto L_0x0078
        L_0x004a:
            go r9 = p000.C0544go.f2406x
            int r9 = r9.f2409b
            r10 = r7 & r9
            if (r10 == 0) goto L_0x0053
            goto L_0x0048
        L_0x0053:
            go r9 = p000.C0544go.f2407y
            int r9 = r9.f2409b
            r10 = r7 & r9
            if (r10 == 0) goto L_0x005c
            goto L_0x0048
        L_0x005c:
            go r9 = p000.C0544go.f2339A
            int r9 = r9.f2409b
            r10 = r7 & r9
            if (r10 == 0) goto L_0x0065
            goto L_0x0048
        L_0x0065:
            go[] r9 = p000.C0544go.f2399s0
            int r10 = r9.length
            r11 = 0
        L_0x0069:
            if (r11 >= r10) goto L_0x0078
            r12 = r9[r11]
            int r12 = r12.f2409b
            r13 = r12 & r7
            if (r13 != r12) goto L_0x0075
            r7 = r12
            goto L_0x0078
        L_0x0075:
            int r11 = r11 + 1
            goto L_0x0069
        L_0x0078:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            go[] r10 = p000.C0544go.values()
            r11 = 0
        L_0x0082:
            r12 = 62
            if (r11 >= r12) goto L_0x009d
            r12 = r10[r11]
            go r13 = p000.C0544go.f2368d
            if (r12 != r13) goto L_0x0091
            int r13 = r12.f2409b
            if (r7 != r13) goto L_0x009a
            goto L_0x0097
        L_0x0091:
            int r13 = r12.f2409b
            r14 = r13 & r7
            if (r14 != r13) goto L_0x009a
        L_0x0097:
            r9.add(r12)
        L_0x009a:
            int r11 = r11 + 1
            goto L_0x0082
        L_0x009d:
            r10 = -22766304973996(0xffffeb4b4e7aab54, double:NaN)
            p000.C0200av.m970a(r10)
            r10 = -22796369745068(0xffffeb444e7aab54, double:NaN)
            p000.C0200av.m970a(r10)
            r9.size()
            r10 = -22826434516140(0xffffeb3d4e7aab54, double:NaN)
            p000.C0200av.m970a(r10)
            r6.toString()
            java.util.Iterator r7 = r9.iterator()
        L_0x00bf:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00d7
            java.lang.Object r10 = r7.next()
            go r10 = (p000.C0544go) r10
            r11 = -22886564058284(0xffffeb2f4e7aab54, double:NaN)
            p000.C0200av.m970a(r11)
            r10.toString()
            goto L_0x00bf
        L_0x00d7:
            int r7 = r9.size()
            int r7 = r7 - r8
            java.lang.Object r7 = r9.get(r7)
            go r7 = (p000.C0544go) r7
            hu r8 = new hu
            r8.<init>(r6, r7)
            r0.add(r8)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ee:
            hq r1 = (p000.C0589hq) r1
            us r1 = r1.f2499a
            vs r1 = r1.f4683b
            int r2 = p000.C1277vs.f4842a0
            r1.getClass()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            jq r3 = new jq
            r3.<init>(r1, r0)
            r2.post(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0287co.run():void");
    }
}
