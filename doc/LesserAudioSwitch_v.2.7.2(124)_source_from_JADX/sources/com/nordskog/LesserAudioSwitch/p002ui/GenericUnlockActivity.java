package com.nordskog.LesserAudioSwitch.p002ui;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.GenericUnlockActivity */
public class GenericUnlockActivity extends C0947p {

    /* renamed from: o */
    public static final /* synthetic */ int f1761o = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r1 = r32
            super.onCreate(r33)
            r0 = 2131427357(0x7f0b001d, float:1.8476328E38)
            r1.setContentView((int) r0)
            java.lang.String r0 = p000.C1384xo.f5119a
            int r2 = p000.C1425yo.f5206a
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            r3 = 0
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r3)
            r4 = 0
            java.lang.String r0 = r2.getString(r0, r4)
            r2 = 2
            r4 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r6 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r8 = 1
            if (r0 == 0) goto L_0x00e6
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0040
            goto L_0x00e6
        L_0x0040:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0048
            goto L_0x00b5
        L_0x0048:
            byte[] r0 = android.util.Base64.decode(r0, r3)
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x005e
            android.content.ContentResolver r9 = r32.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r6)
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r10)
            p000.C0391dp.f1915a = r9
        L_0x005e:
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x0068
            java.lang.String r9 = p000.C0200av.m970a(r4)
            p000.C0391dp.f1915a = r9
        L_0x0068:
            java.lang.String r9 = p000.C0391dp.f1915a
            r10 = 5
            if (r9 == 0) goto L_0x007c
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x007c
            int r9 = r9.hashCode()
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r10 = r9
        L_0x007c:
            int r10 = r10 * -1
            byte r9 = (byte) r10
            p000.C0495fu.m1724a(r0)
            int r10 = r0.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x0086:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x009f
            byte r12 = r0[r11]
            int r12 = r12 + r9
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x0093
            int r12 = r12 + -256
            goto L_0x0099
        L_0x0093:
            r13 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r13) goto L_0x0099
            int r12 = r12 + 256
        L_0x0099:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0086
        L_0x009f:
            p000.C0495fu.m1724a(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r9 = 19
            if (r0 < r9) goto L_0x00b0
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r10, r9)
            goto L_0x00b5
        L_0x00b0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x00b5:
            r9 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            r10 = 4
            if (r9 == r10) goto L_0x00d3
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00f2
        L_0x00d3:
            cp r9 = new cp
            r18 = r0[r3]
            r19 = r0[r8]
            r20 = r0[r2]
            r10 = 3
            r21 = r0[r10]
            go r22 = p000.C0433ep.f2029a
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00f3
        L_0x00e6:
            cp r0 = new cp
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            go r15 = p000.C0433ep.f2035g
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x00f2:
            r9 = r0
        L_0x00f3:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0100
            goto L_0x011d
        L_0x0100:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010b
            goto L_0x011d
        L_0x010b:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0116
            goto L_0x011d
        L_0x0116:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r0 = 1
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            r10 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x0133
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x0162
        L_0x0133:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r9.f1827a
            r0.append(r14)
            java.lang.String r14 = r9.f1828b
            r0.append(r14)
            java.lang.String r14 = r9.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r14)
            java.lang.String r14 = r9.f1830d
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x0156
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x0156:
            if (r0 == 0) goto L_0x015b
            go r14 = p000.C0433ep.f2039k
            goto L_0x015d
        L_0x015b:
            go r14 = p000.C0433ep.f2031c
        L_0x015d:
            java.lang.String.valueOf(r14)
            r9.f1832f = r14
        L_0x0162:
            if (r0 == 0) goto L_0x048c
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x0190
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0173
            goto L_0x0190
        L_0x0173:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x0190
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017e
            goto L_0x0190
        L_0x017e:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x0190
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0189
            goto L_0x0190
        L_0x0189:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x018e
            goto L_0x0190
        L_0x018e:
            r0 = 1
            goto L_0x0191
        L_0x0190:
            r0 = 0
        L_0x0191:
            if (r0 != 0) goto L_0x019c
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x01cb
        L_0x019c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = r9.f1827a
            r0.append(r8)
            java.lang.String r8 = r9.f1828b
            r0.append(r8)
            java.lang.String r8 = r9.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r8)
            java.lang.String r8 = r9.f1830d
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x01bf
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x01bf:
            if (r0 == 0) goto L_0x01c4
            go r8 = p000.C0433ep.f2039k
            goto L_0x01c6
        L_0x01c4:
            go r8 = p000.C0433ep.f2031c
        L_0x01c6:
            java.lang.String.valueOf(r8)
            r9.f1832f = r8
        L_0x01cb:
            if (r0 != 0) goto L_0x01d2
            go r0 = r9.f1832f
        L_0x01cf:
            r12 = 0
            goto L_0x0452
        L_0x01d2:
            java.lang.String r0 = r9.f1829c
            java.lang.String r8 = p000.C0391dp.f1915a
            if (r8 != 0) goto L_0x01e6
            android.content.ContentResolver r8 = r32.getContentResolver()
            java.lang.String r6 = p000.C0200av.m970a(r6)
            java.lang.String r6 = android.provider.Settings.Secure.getString(r8, r6)
            p000.C0391dp.f1915a = r6
        L_0x01e6:
            java.lang.String r6 = p000.C0391dp.f1915a
            if (r6 != 0) goto L_0x01f0
            java.lang.String r4 = p000.C0200av.m970a(r4)
            p000.C0391dp.f1915a = r4
        L_0x01f0:
            java.lang.String r4 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0212
            r4 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x01cf
        L_0x0212:
            java.lang.String r0 = r9.f1828b
            java.lang.Class r4 = p000.C1228uu.f4686b
            byte[] r4 = new byte[r3]
            java.lang.reflect.Method r5 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x022e }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x022e }
            r2[r3] = r0     // Catch:{ Exception -> 0x022e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x022e }
            r6 = 1
            r2[r6] = r0     // Catch:{ Exception -> 0x022e }
            r0 = 0
            java.lang.Object r0 = r5.invoke(r0, r2)     // Catch:{ Exception -> 0x022e }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x022e }
            r4 = r0
            goto L_0x0245
        L_0x022e:
            r0 = move-exception
            r5 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r5, r0, r2)
        L_0x0245:
            if (r4 == 0) goto L_0x0438
            int r0 = r4.length
            if (r0 != 0) goto L_0x024c
            goto L_0x0438
        L_0x024c:
            int r0 = p000.C1136su.f4328a
            r5 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r4)
            r12 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r16 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r18 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r22 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r24 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r26 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            r28 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x0323 }
            java.lang.ClassLoader r6 = r14.getClassLoader()     // Catch:{ Exception -> 0x0323 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r8, r6)     // Catch:{ Exception -> 0x0323 }
            java.lang.String r7 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x0323 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0323 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0323 }
            java.lang.String r8 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x0323 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0323 }
            r11[r3] = r14     // Catch:{ Exception -> 0x0323 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0323 }
            java.lang.String r11 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0323 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0323 }
            r12[r3] = r7     // Catch:{ Exception -> 0x0323 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0323 }
            r11 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0323 }
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0323 }
            r11[r3] = r15     // Catch:{ Exception -> 0x0323 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r13, r11)     // Catch:{ Exception -> 0x0323 }
            r12 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0323 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0323 }
            r13 = 0
            r12[r13] = r15     // Catch:{ Exception -> 0x0323 }
            java.lang.reflect.Method r3 = r6.getDeclaredMethod(r3, r12)     // Catch:{ Exception -> 0x0323 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0323 }
            r30 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r30)     // Catch:{ Exception -> 0x0323 }
            r6[r13] = r12     // Catch:{ Exception -> 0x0323 }
            r12 = 0
            java.lang.Object r6 = r8.invoke(r12, r6)     // Catch:{ Exception -> 0x0323 }
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0323 }
            java.lang.Object r12 = r9.f1831e     // Catch:{ Exception -> 0x0323 }
            r8[r13] = r12     // Catch:{ Exception -> 0x0323 }
            r7.invoke(r6, r8)     // Catch:{ Exception -> 0x0323 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0323 }
            r7[r13] = r0     // Catch:{ Exception -> 0x0323 }
            r11.invoke(r6, r7)     // Catch:{ Exception -> 0x0323 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0323 }
            r0[r13] = r4     // Catch:{ Exception -> 0x0323 }
            java.lang.Object r0 = r3.invoke(r6, r0)     // Catch:{ Exception -> 0x0323 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0323 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0323 }
            if (r0 != 0) goto L_0x0317
            r0 = 1
            goto L_0x0318
        L_0x0317:
            r0 = 0
        L_0x0318:
            p000.C0200av.m970a(r28)     // Catch:{ Exception -> 0x0323 }
            p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x0323 }
            if (r0 == 0) goto L_0x0321
            r2 = r5
        L_0x0321:
            r5 = r2
            goto L_0x0335
        L_0x0323:
            r0 = move-exception
            java.lang.String r2 = p000.C0200av.m970a(r22)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r3, r0, r2)
        L_0x0335:
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L_0x0356
            r2 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x01cf
        L_0x0356:
            java.lang.String r0 = r9.f1827a
            byte[] r0 = r0.getBytes()
            go r2 = p000.C0433ep.f2034f
            go r3 = p000.C0433ep.f2036h
            go r5 = p000.C0433ep.f2038j
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r4)
            java.lang.String r6 = p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x040a }
            java.lang.ClassLoader r7 = r14.getClassLoader()     // Catch:{ Exception -> 0x040a }
            java.lang.Class r6 = p000.C0389dn.m1512a(r6, r7)     // Catch:{ Exception -> 0x040a }
            java.lang.String r7 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x040a }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x040a }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x040a }
            java.lang.String r8 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x040a }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x040a }
            r12 = 0
            r11[r12] = r14     // Catch:{ Exception -> 0x0408 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0408 }
            r13 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0408 }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0408 }
            r13[r12] = r7     // Catch:{ Exception -> 0x0408 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0408 }
            r13 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0408 }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0408 }
            r13[r12] = r15     // Catch:{ Exception -> 0x0408 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0408 }
            r13 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0408 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0408 }
            r14[r12] = r15     // Catch:{ Exception -> 0x0408 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x0408 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0408 }
            r14 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x0408 }
            r13[r12] = r14     // Catch:{ Exception -> 0x0408 }
            r14 = 0
            java.lang.Object r8 = r8.invoke(r14, r13)     // Catch:{ Exception -> 0x0408 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0408 }
            java.lang.Object r14 = r9.f1831e     // Catch:{ Exception -> 0x0408 }
            r13[r12] = r14     // Catch:{ Exception -> 0x0408 }
            r7.invoke(r8, r13)     // Catch:{ Exception -> 0x0408 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0408 }
            r7[r12] = r0     // Catch:{ Exception -> 0x0408 }
            r11.invoke(r8, r7)     // Catch:{ Exception -> 0x0408 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0408 }
            r0[r12] = r4     // Catch:{ Exception -> 0x0408 }
            java.lang.Object r0 = r6.invoke(r8, r0)     // Catch:{ Exception -> 0x0408 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0408 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0408 }
            if (r0 != 0) goto L_0x03fc
            r0 = 1
            goto L_0x03fd
        L_0x03fc:
            r0 = 0
        L_0x03fd:
            p000.C0200av.m970a(r28)     // Catch:{ Exception -> 0x0408 }
            p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x0408 }
            if (r0 == 0) goto L_0x0406
            r2 = r3
        L_0x0406:
            r0 = r2
            goto L_0x041e
        L_0x0408:
            r0 = move-exception
            goto L_0x040c
        L_0x040a:
            r0 = move-exception
            r12 = 0
        L_0x040c:
            java.lang.String r2 = p000.C0200av.m970a(r22)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r3, r0, r2)
            r0 = r5
        L_0x041e:
            go r2 = p000.C0433ep.f2036h
            if (r0 != r2) goto L_0x0432
            r2 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
        L_0x0432:
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            goto L_0x0452
        L_0x0438:
            r12 = 0
            r2 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0452:
            go r2 = p000.C0433ep.f2034f
            if (r0 == r2) goto L_0x045d
            go r2 = p000.C0433ep.f2029a
            if (r0 != r2) goto L_0x045b
            goto L_0x045d
        L_0x045b:
            r3 = 0
            goto L_0x045e
        L_0x045d:
            r3 = 1
        L_0x045e:
            if (r3 == 0) goto L_0x048c
            p000.C0728kh.m2283L(r32)
            o$a r0 = new o$a
            r0.<init>(r1)
            r2 = 2131689561(0x7f0f0059, float:1.900814E38)
            r0.mo3819d(r2)
            r2 = 2131689580(0x7f0f006c, float:1.900818E38)
            r0.mo3817b(r2)
            r2 = 2131689538(0x7f0f0042, float:1.9008094E38)
            rq r3 = p000.C1074rq.f4042b
            r0.mo3818c(r2, r3)
            o r0 = r0.mo3816a()
            sq r2 = new sq
            r2.<init>(r1)
            r0.setOnDismissListener(r2)
            r0.show()
            goto L_0x04a1
        L_0x048c:
            bt r0 = new bt
            r0.<init>()
            ws r2 = new ws
            r2.<init>(r1)
            r0.f1304o0 = r2
            ia r2 = r32.mo4865l()
            java.lang.String r3 = "un_pu"
            r0.mo4634A0(r2, r3)
        L_0x04a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.p002ui.GenericUnlockActivity.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        C0690jn.f2922a = false;
    }

    public void onResume() {
        C0690jn.f2922a = true;
        super.onResume();
    }
}
