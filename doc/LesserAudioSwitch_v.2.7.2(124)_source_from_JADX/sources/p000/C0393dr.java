package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: dr */
public final /* synthetic */ class C0393dr implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f1917b;

    public /* synthetic */ C0393dr(MainActivity mainActivity) {
        this.f1917b = mainActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0466, code lost:
        if ((r0 == p000.C0433ep.f2034f || r0 == p000.C0433ep.f2029a) == false) goto L_0x0468;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r32) {
        /*
            r31 = this;
            r1 = r31
            com.nordskog.LesserAudioSwitch.ui.MainActivity r2 = r1.f1917b
            r2.getClass()
            boolean r0 = p000.C0697ju.m2178a(r2)
            if (r0 == 0) goto L_0x04b6
            boolean r0 = p000.C0851mu.m2546a(r2)
            if (r0 == 0) goto L_0x04b6
            java.lang.String r0 = p000.C1384xo.f5119a
            int r3 = p000.C1425yo.f5206a
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r3 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            r4 = 0
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r4)
            r5 = 0
            java.lang.String r0 = r3.getString(r0, r5)
            r3 = 2
            r5 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r7 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r9 = 1
            if (r0 == 0) goto L_0x00ef
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x0048
            goto L_0x00ef
        L_0x0048:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x0050
            goto L_0x00bd
        L_0x0050:
            byte[] r0 = android.util.Base64.decode(r0, r4)
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0066
            android.content.ContentResolver r10 = r2.getContentResolver()
            java.lang.String r11 = p000.C0200av.m970a(r7)
            java.lang.String r10 = android.provider.Settings.Secure.getString(r10, r11)
            p000.C0391dp.f1915a = r10
        L_0x0066:
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0070
            java.lang.String r10 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r10
        L_0x0070:
            java.lang.String r10 = p000.C0391dp.f1915a
            r11 = 5
            if (r10 == 0) goto L_0x0084
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x0084
            int r10 = r10.hashCode()
            byte r10 = (byte) r10
            if (r10 != 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r11 = r10
        L_0x0084:
            int r11 = r11 * -1
            byte r10 = (byte) r11
            p000.C0495fu.m1724a(r0)
            int r11 = r0.length
            byte[] r11 = new byte[r11]
            r12 = 0
        L_0x008e:
            int r13 = r0.length
            if (r12 >= r13) goto L_0x00a7
            byte r13 = r0[r12]
            int r13 = r13 + r10
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 <= r14) goto L_0x009b
            int r13 = r13 + -256
            goto L_0x00a1
        L_0x009b:
            r14 = -128(0xffffffffffffff80, float:NaN)
            if (r13 >= r14) goto L_0x00a1
            int r13 = r13 + 256
        L_0x00a1:
            byte r13 = (byte) r13
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x008e
        L_0x00a7:
            p000.C0495fu.m1724a(r11)
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 19
            if (r0 < r10) goto L_0x00b8
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r11, r10)
            goto L_0x00bd
        L_0x00b8:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r11)
        L_0x00bd:
            r10 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)
            java.lang.String[] r0 = r0.split(r10)
            int r10 = r0.length
            r11 = 4
            if (r10 == r11) goto L_0x00dc
            cp r0 = new cp
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            go r17 = p000.C0433ep.f2035g
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x00fb
        L_0x00dc:
            cp r10 = new cp
            r19 = r0[r4]
            r20 = r0[r9]
            r21 = r0[r3]
            r9 = 3
            r22 = r0[r9]
            go r23 = p000.C0433ep.f2029a
            r18 = r10
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x00fc
        L_0x00ef:
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r10.f1827a
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0109
            goto L_0x0126
        L_0x0109:
            java.lang.String r0 = r10.f1828b
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0114
            goto L_0x0126
        L_0x0114:
            java.lang.String r0 = r10.f1829c
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011f
            goto L_0x0126
        L_0x011f:
            java.lang.Object r0 = r10.f1831e
            if (r0 != 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r0 = 1
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            r11 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r13 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x013c
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            r0 = 0
            goto L_0x016b
        L_0x013c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r10.f1827a
            r0.append(r9)
            java.lang.String r9 = r10.f1828b
            r0.append(r9)
            java.lang.String r9 = r10.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r9)
            java.lang.String r9 = r10.f1830d
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x015f
            p000.C0200av.m970a(r13)
            p000.C0200av.m970a(r11)
        L_0x015f:
            if (r0 == 0) goto L_0x0164
            go r9 = p000.C0433ep.f2039k
            goto L_0x0166
        L_0x0164:
            go r9 = p000.C0433ep.f2031c
        L_0x0166:
            java.lang.String.valueOf(r9)
            r10.f1832f = r9
        L_0x016b:
            if (r0 == 0) goto L_0x0468
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r10.f1827a
            if (r0 == 0) goto L_0x0199
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017c
            goto L_0x0199
        L_0x017c:
            java.lang.String r0 = r10.f1828b
            if (r0 == 0) goto L_0x0199
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0187
            goto L_0x0199
        L_0x0187:
            java.lang.String r0 = r10.f1829c
            if (r0 == 0) goto L_0x0199
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0192
            goto L_0x0199
        L_0x0192:
            java.lang.Object r0 = r10.f1831e
            if (r0 != 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            r0 = 1
            goto L_0x019a
        L_0x0199:
            r0 = 0
        L_0x019a:
            if (r0 != 0) goto L_0x01a5
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            r0 = 0
            goto L_0x01d4
        L_0x01a5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r10.f1827a
            r0.append(r3)
            java.lang.String r3 = r10.f1828b
            r0.append(r3)
            java.lang.String r3 = r10.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r3)
            java.lang.String r3 = r10.f1830d
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01c8
            p000.C0200av.m970a(r13)
            p000.C0200av.m970a(r11)
        L_0x01c8:
            if (r0 == 0) goto L_0x01cd
            go r3 = p000.C0433ep.f2039k
            goto L_0x01cf
        L_0x01cd:
            go r3 = p000.C0433ep.f2031c
        L_0x01cf:
            java.lang.String.valueOf(r3)
            r10.f1832f = r3
        L_0x01d4:
            if (r0 != 0) goto L_0x01da
            go r0 = r10.f1832f
            goto L_0x045a
        L_0x01da:
            java.lang.String r0 = r10.f1829c
            java.lang.String r3 = p000.C0391dp.f1915a
            if (r3 != 0) goto L_0x01ee
            android.content.ContentResolver r3 = r2.getContentResolver()
            java.lang.String r7 = p000.C0200av.m970a(r7)
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r7)
            p000.C0391dp.f1915a = r3
        L_0x01ee:
            java.lang.String r3 = p000.C0391dp.f1915a
            if (r3 != 0) goto L_0x01f8
            java.lang.String r3 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r3
        L_0x01f8:
            java.lang.String r3 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x021b
            r3 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
            r3 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x045a
        L_0x021b:
            java.lang.String r0 = r10.f1828b
            java.lang.Class r3 = p000.C1228uu.f4686b
            byte[] r3 = new byte[r4]
            java.lang.reflect.Method r5 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x0238 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0238 }
            r6[r4] = r0     // Catch:{ Exception -> 0x0238 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0238 }
            r7 = 1
            r6[r7] = r0     // Catch:{ Exception -> 0x0238 }
            r0 = 0
            java.lang.Object r0 = r5.invoke(r0, r6)     // Catch:{ Exception -> 0x0238 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0238 }
            r3 = r0
            goto L_0x024f
        L_0x0238:
            r0 = move-exception
            r5 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r7, r6, r0, r5)
        L_0x024f:
            if (r3 == 0) goto L_0x0441
            int r0 = r3.length
            if (r0 != 0) goto L_0x0256
            goto L_0x0441
        L_0x0256:
            int r0 = p000.C1136su.f4328a
            r5 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r11 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r7, r11, r3)
            r13 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r16 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r20 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r22 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r24 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            r26 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            r28 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r22)     // Catch:{ Exception -> 0x032f }
            java.lang.ClassLoader r8 = r9.getClassLoader()     // Catch:{ Exception -> 0x032f }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x032f }
            java.lang.String r8 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x032f }
            java.lang.ClassLoader r11 = r9.getClassLoader()     // Catch:{ Exception -> 0x032f }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r11)     // Catch:{ Exception -> 0x032f }
            java.lang.String r11 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x032f }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x032f }
            r13[r4] = r9     // Catch:{ Exception -> 0x032f }
            java.lang.reflect.Method r11 = r7.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x032f }
            r13 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x032f }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x032f }
            r14 = 0
            r13[r14] = r8     // Catch:{ Exception -> 0x032f }
            java.lang.reflect.Method r4 = r7.getDeclaredMethod(r4, r13)     // Catch:{ Exception -> 0x032f }
            r18 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x032f }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x032f }
            r13[r14] = r15     // Catch:{ Exception -> 0x032f }
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r8, r13)     // Catch:{ Exception -> 0x032f }
            r13 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x032f }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x032f }
            r30 = 0
            r14[r30] = r15     // Catch:{ Exception -> 0x032f }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x032f }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x032f }
            java.lang.String r14 = p000.C0200av.m970a(r28)     // Catch:{ Exception -> 0x032f }
            r13[r30] = r14     // Catch:{ Exception -> 0x032f }
            r14 = 0
            java.lang.Object r11 = r11.invoke(r14, r13)     // Catch:{ Exception -> 0x032f }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x032f }
            java.lang.Object r14 = r10.f1831e     // Catch:{ Exception -> 0x032f }
            r13[r30] = r14     // Catch:{ Exception -> 0x032f }
            r4.invoke(r11, r13)     // Catch:{ Exception -> 0x032f }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x032f }
            r4[r30] = r0     // Catch:{ Exception -> 0x032f }
            r8.invoke(r11, r4)     // Catch:{ Exception -> 0x032f }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x032f }
            r0[r30] = r3     // Catch:{ Exception -> 0x032f }
            java.lang.Object r0 = r7.invoke(r11, r0)     // Catch:{ Exception -> 0x032f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x032f }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x032f }
            if (r0 != 0) goto L_0x0323
            r0 = 1
            goto L_0x0324
        L_0x0323:
            r0 = 0
        L_0x0324:
            p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x032f }
            p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x032f }
            if (r0 == 0) goto L_0x032d
            r5 = r6
        L_0x032d:
            r6 = r5
            goto L_0x0341
        L_0x032f:
            r0 = move-exception
            java.lang.String r4 = p000.C0200av.m970a(r20)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r7, r5, r0, r4)
        L_0x0341:
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x0362
            r3 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
            r3 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x045a
        L_0x0362:
            java.lang.String r0 = r10.f1827a
            byte[] r0 = r0.getBytes()
            go r4 = p000.C0433ep.f2034f
            go r5 = p000.C0433ep.f2036h
            go r6 = p000.C0433ep.f2038j
            r7 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r11 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r7, r11, r3)
            java.lang.String r7 = p000.C0200av.m970a(r22)     // Catch:{ Exception -> 0x0414 }
            java.lang.ClassLoader r8 = r9.getClassLoader()     // Catch:{ Exception -> 0x0414 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0414 }
            java.lang.String r8 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x0414 }
            java.lang.ClassLoader r11 = r9.getClassLoader()     // Catch:{ Exception -> 0x0414 }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r11)     // Catch:{ Exception -> 0x0414 }
            r11 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0414 }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0414 }
            r14 = 0
            r13[r14] = r9     // Catch:{ Exception -> 0x0414 }
            java.lang.reflect.Method r9 = r7.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0414 }
            r16 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x0414 }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0414 }
            r13[r14] = r8     // Catch:{ Exception -> 0x0414 }
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0414 }
            r16 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x0414 }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0414 }
            r13[r14] = r15     // Catch:{ Exception -> 0x0414 }
            java.lang.reflect.Method r11 = r7.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0414 }
            r16 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x0414 }
            java.lang.Class[] r1 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0414 }
            r1[r14] = r15     // Catch:{ Exception -> 0x0414 }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r13, r1)     // Catch:{ Exception -> 0x0414 }
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0414 }
            java.lang.String r13 = p000.C0200av.m970a(r28)     // Catch:{ Exception -> 0x0414 }
            r7[r14] = r13     // Catch:{ Exception -> 0x0414 }
            r13 = 0
            java.lang.Object r7 = r9.invoke(r13, r7)     // Catch:{ Exception -> 0x0414 }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0414 }
            java.lang.Object r13 = r10.f1831e     // Catch:{ Exception -> 0x0414 }
            r9[r14] = r13     // Catch:{ Exception -> 0x0414 }
            r8.invoke(r7, r9)     // Catch:{ Exception -> 0x0414 }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0414 }
            r8[r14] = r0     // Catch:{ Exception -> 0x0414 }
            r11.invoke(r7, r8)     // Catch:{ Exception -> 0x0414 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0414 }
            r0[r14] = r3     // Catch:{ Exception -> 0x0414 }
            java.lang.Object r0 = r1.invoke(r7, r0)     // Catch:{ Exception -> 0x0414 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0414 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0414 }
            if (r0 != 0) goto L_0x0408
            r0 = 1
            goto L_0x0409
        L_0x0408:
            r0 = 0
        L_0x0409:
            p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x0414 }
            p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x0414 }
            if (r0 == 0) goto L_0x0412
            r4 = r5
        L_0x0412:
            r0 = r4
            goto L_0x0427
        L_0x0414:
            r0 = move-exception
            java.lang.String r1 = p000.C0200av.m970a(r20)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r4, r3, r0, r1)
            r0 = r6
        L_0x0427:
            go r1 = p000.C0433ep.f2036h
            if (r0 != r1) goto L_0x043b
            r3 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
            r3 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
        L_0x043b:
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            goto L_0x045a
        L_0x0441:
            r0 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x045a:
            go r1 = p000.C0433ep.f2034f
            if (r0 == r1) goto L_0x0465
            go r1 = p000.C0433ep.f2029a
            if (r0 != r1) goto L_0x0463
            goto L_0x0465
        L_0x0463:
            r0 = 0
            goto L_0x0466
        L_0x0465:
            r0 = 1
        L_0x0466:
            if (r0 != 0) goto L_0x04b6
        L_0x0468:
            r0 = 2131689562(0x7f0f005a, float:1.9008143E38)
            r1 = 2131689522(0x7f0f0032, float:1.9008062E38)
            r3 = 2131689523(0x7f0f0033, float:1.9008064E38)
            r4 = 2131689535(0x7f0f003f, float:1.9008088E38)
            rr r5 = new rr
            r5.<init>(r2)
            o$a r6 = new o$a
            r6.<init>(r2)
            androidx.appcompat.app.AlertController$b r2 = r6.f3436a
            android.content.Context r7 = r2.f190a
            java.lang.CharSequence r0 = r7.getText(r0)
            r2.f193d = r0
            androidx.appcompat.app.AlertController$b r0 = r6.f3436a
            android.content.Context r2 = r0.f190a
            java.lang.CharSequence r1 = r2.getText(r1)
            r0.f195f = r1
            nt r0 = new nt
            r0.<init>(r5)
            r6.mo3818c(r3, r0)
            pt r0 = new pt
            r1 = 0
            r0.<init>(r1)
            androidx.appcompat.app.AlertController$b r1 = r6.f3436a
            android.content.Context r2 = r1.f190a
            java.lang.CharSequence r2 = r2.getText(r4)
            r1.f198i = r2
            androidx.appcompat.app.AlertController$b r1 = r6.f3436a
            r1.f199j = r0
            o r0 = r6.mo3816a()
            r0.show()
            goto L_0x04bb
        L_0x04b6:
            com.nordskog.LesserAudioSwitch.ui.MainActivity$b r0 = com.nordskog.LesserAudioSwitch.p002ui.MainActivity.C0343b.f1781b
            r2.mo2564x(r0)
        L_0x04bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0393dr.onClick(android.view.View):void");
    }
}
