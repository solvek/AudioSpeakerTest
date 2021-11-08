package p000;

/* renamed from: mu */
public class C0851mu {

    /* renamed from: a */
    public static final /* synthetic */ int f3325a = 0;

    static {
        C0200av.m970a(-128598594114732L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x047f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0481 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0180  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2546a(android.content.Context r29) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            r3 = 0
            r4 = 1608768000000(0x176920b9000, double:7.948370009287E-312)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0483
            r0 = -128452565226668(0xffff8b2c4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            int r1 = p000.C1425yo.f5206a
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r4 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r4)
            r4 = r29
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r3)
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)
            r1 = 2
            r5 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r7 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            if (r0 == 0) goto L_0x00fe
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0050
            goto L_0x00fe
        L_0x0050:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0058
            goto L_0x00c5
        L_0x0058:
            byte[] r0 = android.util.Base64.decode(r0, r3)
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x006e
            android.content.ContentResolver r9 = r29.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r7)
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r10)
            p000.C0391dp.f1915a = r9
        L_0x006e:
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x0078
            java.lang.String r9 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r9
        L_0x0078:
            java.lang.String r9 = p000.C0391dp.f1915a
            r10 = 5
            if (r9 == 0) goto L_0x008c
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x008c
            int r9 = r9.hashCode()
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r10 = r9
        L_0x008c:
            int r10 = r10 * -1
            byte r9 = (byte) r10
            p000.C0495fu.m1724a(r0)
            int r10 = r0.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x0096:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x00af
            byte r12 = r0[r11]
            int r12 = r12 + r9
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00a3
            int r12 = r12 + -256
            goto L_0x00a9
        L_0x00a3:
            r13 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r13) goto L_0x00a9
            int r12 = r12 + 256
        L_0x00a9:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0096
        L_0x00af:
            p000.C0495fu.m1724a(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r9 = 19
            if (r0 < r9) goto L_0x00c0
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r10, r9)
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x00c5:
            r9 = -37936129463468(0xffffdd7f4e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            r10 = 4
            if (r9 == r10) goto L_0x00e7
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            java.lang.String r17 = p000.C0748ku.m2317a()
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x010e
        L_0x00e7:
            cp r9 = new cp
            r19 = r0[r3]
            r20 = r0[r2]
            r21 = r0[r1]
            r10 = 3
            r22 = r0[r10]
            go r23 = p000.C0433ep.f2029a
            java.lang.String r24 = p000.C0748ku.m2317a()
            r18 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x010f
        L_0x00fe:
            cp r0 = new cp
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            go r15 = p000.C0433ep.f2035g
            java.lang.String r16 = p000.C0748ku.m2317a()
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x010e:
            r9 = r0
        L_0x010f:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x0139
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011c
            goto L_0x0139
        L_0x011c:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x0139
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0127
            goto L_0x0139
        L_0x0127:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x0139
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0132
            goto L_0x0139
        L_0x0132:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r0 = 1
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            r10 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x014f
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x017e
        L_0x014f:
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
            if (r0 != 0) goto L_0x0172
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x0172:
            if (r0 == 0) goto L_0x0177
            go r14 = p000.C0433ep.f2039k
            goto L_0x0179
        L_0x0177:
            go r14 = p000.C0433ep.f2031c
        L_0x0179:
            java.lang.String.valueOf(r14)
            r9.f1832f = r14
        L_0x017e:
            if (r0 == 0) goto L_0x0481
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018f
            goto L_0x01ac
        L_0x018f:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x019a
            goto L_0x01ac
        L_0x019a:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a5
            goto L_0x01ac
        L_0x01a5:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r0 = 1
            goto L_0x01ad
        L_0x01ac:
            r0 = 0
        L_0x01ad:
            if (r0 != 0) goto L_0x01b8
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x01e7
        L_0x01b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.f1827a
            r0.append(r2)
            java.lang.String r2 = r9.f1828b
            r0.append(r2)
            java.lang.String r2 = r9.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r2)
            java.lang.String r2 = r9.f1830d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01db
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x01db:
            if (r0 == 0) goto L_0x01e0
            go r2 = p000.C0433ep.f2039k
            goto L_0x01e2
        L_0x01e0:
            go r2 = p000.C0433ep.f2031c
        L_0x01e2:
            java.lang.String.valueOf(r2)
            r9.f1832f = r2
        L_0x01e7:
            if (r0 != 0) goto L_0x01ee
            go r0 = r9.f1832f
        L_0x01eb:
            r10 = 1
            goto L_0x0471
        L_0x01ee:
            java.lang.String r0 = r9.f1829c
            java.lang.String r2 = p000.C0391dp.f1915a
            if (r2 != 0) goto L_0x0202
            android.content.ContentResolver r2 = r29.getContentResolver()
            java.lang.String r4 = p000.C0200av.m970a(r7)
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r4)
            p000.C0391dp.f1915a = r2
        L_0x0202:
            java.lang.String r2 = p000.C0391dp.f1915a
            if (r2 != 0) goto L_0x020c
            java.lang.String r2 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r2
        L_0x020c:
            java.lang.String r2 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x022e
            r0 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x01eb
        L_0x022e:
            java.lang.String r0 = r9.f1828b
            java.lang.Class r2 = p000.C1228uu.f4686b
            byte[] r2 = new byte[r3]
            java.lang.reflect.Method r4 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x024a }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x024a }
            r1[r3] = r0     // Catch:{ Exception -> 0x024a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x024a }
            r5 = 1
            r1[r5] = r0     // Catch:{ Exception -> 0x024a }
            r0 = 0
            java.lang.Object r0 = r4.invoke(r0, r1)     // Catch:{ Exception -> 0x024a }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x024a }
            r2 = r0
            goto L_0x0261
        L_0x024a:
            r0 = move-exception
            r4 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r5, r4, r0, r1)
        L_0x0261:
            if (r2 == 0) goto L_0x0457
            int r0 = r2.length
            if (r0 != 0) goto L_0x0268
            goto L_0x0457
        L_0x0268:
            int r0 = p000.C1136su.f4328a
            r0 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r7 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r5, r7, r2)
            r10 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r12 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r17 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r21 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r23 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r25 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            r27 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x033e }
            java.lang.ClassLoader r6 = r14.getClassLoader()     // Catch:{ Exception -> 0x033e }
            java.lang.Class r5 = p000.C0389dn.m1512a(r5, r6)     // Catch:{ Exception -> 0x033e }
            java.lang.String r6 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x033e }
            java.lang.ClassLoader r7 = r14.getClassLoader()     // Catch:{ Exception -> 0x033e }
            java.lang.Class r6 = p000.C0389dn.m1512a(r6, r7)     // Catch:{ Exception -> 0x033e }
            java.lang.String r7 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x033e }
            r8 = 1
            java.lang.Class[] r12 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x033e }
            r12[r3] = r14     // Catch:{ Exception -> 0x033e }
            java.lang.reflect.Method r7 = r5.getDeclaredMethod(r7, r12)     // Catch:{ Exception -> 0x033e }
            java.lang.String r12 = p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x033e }
            java.lang.Class[] r13 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x033e }
            r13[r3] = r6     // Catch:{ Exception -> 0x033e }
            java.lang.reflect.Method r6 = r5.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x033e }
            r12 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x033e }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x033e }
            r11[r3] = r15     // Catch:{ Exception -> 0x033e }
            java.lang.reflect.Method r10 = r5.getDeclaredMethod(r10, r11)     // Catch:{ Exception -> 0x033e }
            r11 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x033e }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x033e }
            r11[r3] = r15     // Catch:{ Exception -> 0x033e }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r13, r11)     // Catch:{ Exception -> 0x033e }
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x033e }
            r12 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x033e }
            r11[r3] = r12     // Catch:{ Exception -> 0x033e }
            r12 = 0
            java.lang.Object r7 = r7.invoke(r12, r11)     // Catch:{ Exception -> 0x033e }
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x033e }
            java.lang.Object r12 = r9.f1831e     // Catch:{ Exception -> 0x033e }
            r11[r3] = r12     // Catch:{ Exception -> 0x033e }
            r6.invoke(r7, r11)     // Catch:{ Exception -> 0x033e }
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x033e }
            r6[r3] = r0     // Catch:{ Exception -> 0x033e }
            r10.invoke(r7, r6)     // Catch:{ Exception -> 0x033e }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x033e }
            r0[r3] = r2     // Catch:{ Exception -> 0x033e }
            java.lang.Object r0 = r5.invoke(r7, r0)     // Catch:{ Exception -> 0x033e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x033e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x033e }
            if (r0 != 0) goto L_0x0332
            r0 = 1
            goto L_0x0333
        L_0x0332:
            r0 = 0
        L_0x0333:
            p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x033e }
            p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x033e }
            if (r0 == 0) goto L_0x033c
            r1 = r4
        L_0x033c:
            r4 = r1
            goto L_0x0350
        L_0x033e:
            r0 = move-exception
            java.lang.String r1 = p000.C0200av.m970a(r21)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r5, r0, r1)
        L_0x0350:
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0371
            r0 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x01eb
        L_0x0371:
            java.lang.String r0 = r9.f1827a
            byte[] r0 = r0.getBytes()
            go r1 = p000.C0433ep.f2034f
            go r4 = p000.C0433ep.f2036h
            go r5 = p000.C0433ep.f2038j
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r2)
            java.lang.String r6 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x0429 }
            java.lang.ClassLoader r7 = r14.getClassLoader()     // Catch:{ Exception -> 0x0429 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r6, r7)     // Catch:{ Exception -> 0x0429 }
            java.lang.String r7 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0429 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0429 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0429 }
            r10 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x0429 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0427 }
            r11[r3] = r14     // Catch:{ Exception -> 0x0427 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0427 }
            r11 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0427 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0427 }
            r12[r3] = r7     // Catch:{ Exception -> 0x0427 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0427 }
            r11 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0427 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0427 }
            r12[r3] = r15     // Catch:{ Exception -> 0x0427 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0427 }
            r12 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0427 }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0427 }
            r13[r3] = r15     // Catch:{ Exception -> 0x0427 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x0427 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0427 }
            r13 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0427 }
            r12[r3] = r13     // Catch:{ Exception -> 0x0427 }
            r13 = 0
            java.lang.Object r8 = r8.invoke(r13, r12)     // Catch:{ Exception -> 0x0427 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r13 = r9.f1831e     // Catch:{ Exception -> 0x0427 }
            r12[r3] = r13     // Catch:{ Exception -> 0x0427 }
            r7.invoke(r8, r12)     // Catch:{ Exception -> 0x0427 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0427 }
            r7[r3] = r0     // Catch:{ Exception -> 0x0427 }
            r11.invoke(r8, r7)     // Catch:{ Exception -> 0x0427 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0427 }
            r0[r3] = r2     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r0 = r6.invoke(r8, r0)     // Catch:{ Exception -> 0x0427 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0427 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0427 }
            if (r0 != 0) goto L_0x041b
            r0 = 1
            goto L_0x041c
        L_0x041b:
            r0 = 0
        L_0x041c:
            p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0427 }
            p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x0427 }
            if (r0 == 0) goto L_0x0425
            r1 = r4
        L_0x0425:
            r0 = r1
            goto L_0x043d
        L_0x0427:
            r0 = move-exception
            goto L_0x042b
        L_0x0429:
            r0 = move-exception
            r10 = 1
        L_0x042b:
            java.lang.String r1 = p000.C0200av.m970a(r21)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r3, r2, r0, r1)
            r0 = r5
        L_0x043d:
            go r1 = p000.C0433ep.f2036h
            if (r0 != r1) goto L_0x0451
            r1 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
        L_0x0451:
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            goto L_0x0471
        L_0x0457:
            r10 = 1
            r0 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0471:
            go r1 = p000.C0433ep.f2034f
            if (r0 == r1) goto L_0x047c
            go r1 = p000.C0433ep.f2029a
            if (r0 != r1) goto L_0x047a
            goto L_0x047c
        L_0x047a:
            r0 = 0
            goto L_0x047d
        L_0x047c:
            r0 = 1
        L_0x047d:
            if (r0 == 0) goto L_0x0481
            r2 = 1
            goto L_0x0482
        L_0x0481:
            r2 = 0
        L_0x0482:
            return r2
        L_0x0483:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0851mu.m2546a(android.content.Context):boolean");
    }
}
