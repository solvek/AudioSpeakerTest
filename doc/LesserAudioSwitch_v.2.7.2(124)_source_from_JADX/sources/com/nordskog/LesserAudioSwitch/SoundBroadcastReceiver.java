package com.nordskog.LesserAudioSwitch;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import p000.C0735ko;

public class SoundBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static C0339a f1738a = null;

    /* renamed from: b */
    public static final Handler f1739b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static long f1740c = 0;

    /* renamed from: d */
    public static boolean f1741d = false;

    /* renamed from: com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver$a */
    public static class C0339a {

        /* renamed from: a */
        public C0489fo f1742a;

        /* renamed from: b */
        public boolean f1743b;

        /* renamed from: c */
        public long f1744c = System.currentTimeMillis();

        public C0339a(C0489fo foVar, boolean z) {
            this.f1742a = foVar;
            this.f1743b = z;
        }
    }

    static {
        C0200av.m970a(-91043400078508L);
        C0200av.m970a(-91107824587948L);
        C0200av.m970a(-91275328312492L);
        C0200av.m970a(-91455716938924L);
        C0200av.m970a(-91631810598060L);
        C0200av.m970a(-91782134453420L);
        C0200av.m970a(-91936753276076L);
        C0200av.m970a(-92091372098732L);
        C0200av.m970a(-92254580855980L);
        C0200av.m970a(-92460739286188L);
        C0200av.m970a(-92688372552876L);
        C0200av.m970a(-92890236015788L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x027b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1381a(com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver r37, android.content.Context r38) {
        /*
            r1 = r37
            r2 = r38
            so r3 = p000.C1129so.DEFAULT
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r4 - r6
            iu$a r0 = p000.C0697ju.f2933a
            r8 = -111414429963436(0xffff9aab4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r8)
            android.content.SharedPreferences r8 = p000.C0697ju.m2198u(r38)
            r9 = 0
            long r8 = r8.getLong(r0, r9)
            r10 = -77613037343916(0xffffb9694e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = -77677461853356(0xffffb95a4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r11)
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            p000.C0550gu.m1820b(r0, r10)
            r10 = -77750476297388(0xffffb9494e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = -77814900806828(0xffffb93a4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r11)
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            p000.C0550gu.m1820b(r0, r10)
            r10 = 1
            f1741d = r10
            r11 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x009e
            r6 = -77883620283564(0xffffb92a4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -77948044793004(0xffffb91b4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -111328530617516(0xffff9abf4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            android.content.SharedPreferences r6 = p000.C0697ju.m2198u(r38)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r6.putLong(r0, r4)
            r6.apply()
            r0 = 1
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 != 0) goto L_0x00b7
            r0 = -78076893811884(0xffffb8fd4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            r1 = -78141318321324(0xffffb8ee4e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)
            p000.C0550gu.m1820b(r0, r1)
            return r11
        L_0x00b7:
            p000.C0697ju.m2175D(r2, r3)
            iu$a r0 = p000.C0697ju.f2936d
            boolean r0 = r0.mo3309a(r2, r11)
            if (r0 != 0) goto L_0x00c7
            iu$a r0 = p000.C0697ju.f2937e
            r0.mo3310b(r2, r11)
        L_0x00c7:
            fo r0 = p000.C0489fo.USB
            r4 = 0
            p000.C0432eo.m1611f(r2, r0, r4)
            fo r5 = p000.C0489fo.WIRED_HEADPHONE
            p000.C0432eo.m1611f(r2, r5, r4)
            fo r6 = p000.C0489fo.BLUETOOTH
            p000.C0432eo.m1611f(r2, r6, r4)
            java.util.HashMap<fo, java.util.Set<java.lang.String>> r7 = p000.C0432eo.f2023b
            java.lang.Object r5 = r7.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            java.util.HashMap<fo, java.util.Set<java.lang.String>> r7 = p000.C0432eo.f2023b
            java.lang.Object r0 = r7.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            java.util.HashMap<fo, java.util.Set<java.lang.String>> r7 = p000.C0432eo.f2023b
            java.lang.Object r6 = r7.get(r6)
            java.util.Set r6 = (java.util.Set) r6
            r5.clear()
            r0.clear()
            r6.clear()
            iu$a r0 = p000.C0432eo.f2024c
            boolean r5 = p000.C0728kh.m2305u()
            r0.mo3310b(r2, r5)
            iu$b<qo> r0 = p000.C0432eo.f2027f
            qo r5 = p000.C1028qo.TYPE_UNKNOWN
            r0.mo3312b(r2, r5)
            iu$a r0 = p000.C0432eo.f2025d
            r0.mo3310b(r2, r11)
            iu$a r0 = p000.C0432eo.f2028g
            r0.mo3310b(r2, r11)
            java.util.HashMap<fo, java.lang.String> r0 = p000.C0432eo.f2022a
            r0.clear()
            boolean r0 = p000.C0697ju.m2199v(r38)
            r5 = 4
            if (r0 == 0) goto L_0x05df
            boolean r0 = p000.C0697ju.m2178a(r38)
            if (r0 != 0) goto L_0x05ca
            java.lang.String r0 = p000.C1384xo.f5119a
            int r6 = p000.C1425yo.f5206a
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r6)
            android.content.SharedPreferences r6 = r2.getSharedPreferences(r6, r11)
            java.lang.String r0 = r6.getString(r0, r4)
            r4 = 2
            r6 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r8 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            if (r0 == 0) goto L_0x01fc
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x0156
            goto L_0x01fc
        L_0x0156:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x015e
            goto L_0x01cb
        L_0x015e:
            byte[] r0 = android.util.Base64.decode(r0, r11)
            java.lang.String r12 = p000.C0391dp.f1915a
            if (r12 != 0) goto L_0x0174
            android.content.ContentResolver r12 = r38.getContentResolver()
            java.lang.String r13 = p000.C0200av.m970a(r6)
            java.lang.String r12 = android.provider.Settings.Secure.getString(r12, r13)
            p000.C0391dp.f1915a = r12
        L_0x0174:
            java.lang.String r12 = p000.C0391dp.f1915a
            if (r12 != 0) goto L_0x017e
            java.lang.String r8 = p000.C0200av.m970a(r8)
            p000.C0391dp.f1915a = r8
        L_0x017e:
            java.lang.String r8 = p000.C0391dp.f1915a
            r9 = 5
            if (r8 == 0) goto L_0x0192
            boolean r12 = r8.isEmpty()
            if (r12 != 0) goto L_0x0192
            int r8 = r8.hashCode()
            byte r8 = (byte) r8
            if (r8 != 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r9 = r8
        L_0x0192:
            int r9 = r9 * -1
            byte r8 = (byte) r9
            p000.C0495fu.m1724a(r0)
            int r9 = r0.length
            byte[] r9 = new byte[r9]
            r12 = 0
        L_0x019c:
            int r13 = r0.length
            if (r12 >= r13) goto L_0x01b5
            byte r13 = r0[r12]
            int r13 = r13 + r8
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 <= r14) goto L_0x01a9
            int r13 = r13 + -256
            goto L_0x01af
        L_0x01a9:
            r14 = -128(0xffffffffffffff80, float:NaN)
            if (r13 >= r14) goto L_0x01af
            int r13 = r13 + 256
        L_0x01af:
            byte r13 = (byte) r13
            r9[r12] = r13
            int r12 = r12 + 1
            goto L_0x019c
        L_0x01b5:
            p000.C0495fu.m1724a(r9)
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 19
            if (r0 < r8) goto L_0x01c6
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r9, r8)
            goto L_0x01cb
        L_0x01c6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
        L_0x01cb:
            r8 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r8)
            java.lang.String[] r0 = r0.split(r8)
            int r8 = r0.length
            if (r8 == r5) goto L_0x01e9
            cp r0 = new cp
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            go r17 = p000.C0433ep.f2035g
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x0209
        L_0x01e9:
            cp r5 = new cp
            r19 = r0[r11]
            r20 = r0[r10]
            r21 = r0[r4]
            r8 = 3
            r22 = r0[r8]
            go r23 = p000.C0433ep.f2029a
            r18 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x020a
        L_0x01fc:
            cp r0 = new cp
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            go r17 = p000.C0433ep.f2035g
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x0209:
            r5 = r0
        L_0x020a:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r5.f1827a
            if (r0 == 0) goto L_0x0234
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0217
            goto L_0x0234
        L_0x0217:
            java.lang.String r0 = r5.f1828b
            if (r0 == 0) goto L_0x0234
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0222
            goto L_0x0234
        L_0x0222:
            java.lang.String r0 = r5.f1829c
            if (r0 == 0) goto L_0x0234
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x022d
            goto L_0x0234
        L_0x022d:
            java.lang.Object r0 = r5.f1831e
            if (r0 != 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            r0 = 1
            goto L_0x0235
        L_0x0234:
            r0 = 0
        L_0x0235:
            r8 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x024a
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r5.f1832f = r0
            r0 = 0
            goto L_0x0279
        L_0x024a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r5.f1827a
            r0.append(r14)
            java.lang.String r14 = r5.f1828b
            r0.append(r14)
            java.lang.String r14 = r5.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r14)
            java.lang.String r14 = r5.f1830d
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x026d
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r8)
        L_0x026d:
            if (r0 == 0) goto L_0x0272
            go r14 = p000.C0433ep.f2039k
            goto L_0x0274
        L_0x0272:
            go r14 = p000.C0433ep.f2031c
        L_0x0274:
            java.lang.String.valueOf(r14)
            r5.f1832f = r14
        L_0x0279:
            if (r0 == 0) goto L_0x05bb
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r5.f1827a
            if (r0 == 0) goto L_0x02a7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x028a
            goto L_0x02a7
        L_0x028a:
            java.lang.String r0 = r5.f1828b
            if (r0 == 0) goto L_0x02a7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0295
            goto L_0x02a7
        L_0x0295:
            java.lang.String r0 = r5.f1829c
            if (r0 == 0) goto L_0x02a7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02a0
            goto L_0x02a7
        L_0x02a0:
            java.lang.Object r0 = r5.f1831e
            if (r0 != 0) goto L_0x02a5
            goto L_0x02a7
        L_0x02a5:
            r0 = 1
            goto L_0x02a8
        L_0x02a7:
            r0 = 0
        L_0x02a8:
            if (r0 != 0) goto L_0x02b3
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r5.f1832f = r0
            r0 = 0
            goto L_0x02e2
        L_0x02b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = r5.f1827a
            r0.append(r10)
            java.lang.String r10 = r5.f1828b
            r0.append(r10)
            java.lang.String r10 = r5.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r10)
            java.lang.String r10 = r5.f1830d
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x02d6
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r8)
        L_0x02d6:
            if (r0 == 0) goto L_0x02db
            go r8 = p000.C0433ep.f2039k
            goto L_0x02dd
        L_0x02db:
            go r8 = p000.C0433ep.f2031c
        L_0x02dd:
            java.lang.String.valueOf(r8)
            r5.f1832f = r8
        L_0x02e2:
            if (r0 != 0) goto L_0x02e8
            go r0 = r5.f1832f
            goto L_0x0574
        L_0x02e8:
            java.lang.String r0 = r5.f1829c
            java.lang.String r8 = p000.C0391dp.f1915a
            if (r8 != 0) goto L_0x02fc
            android.content.ContentResolver r8 = r38.getContentResolver()
            java.lang.String r6 = p000.C0200av.m970a(r6)
            java.lang.String r6 = android.provider.Settings.Secure.getString(r8, r6)
            p000.C0391dp.f1915a = r6
        L_0x02fc:
            java.lang.String r6 = p000.C0391dp.f1915a
            if (r6 != 0) goto L_0x030b
            r6 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r6)
            p000.C0391dp.f1915a = r6
        L_0x030b:
            java.lang.String r6 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x032e
            r6 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r5.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x0574
        L_0x032e:
            java.lang.String r0 = r5.f1828b
            java.lang.Class r6 = p000.C1228uu.f4686b
            byte[] r6 = new byte[r11]
            java.lang.reflect.Method r7 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x034a }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x034a }
            r4[r11] = r0     // Catch:{ Exception -> 0x034a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x034a }
            r8 = 1
            r4[r8] = r0     // Catch:{ Exception -> 0x034a }
            r0 = 0
            java.lang.Object r0 = r7.invoke(r0, r4)     // Catch:{ Exception -> 0x034a }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x034a }
            r6 = r0
            goto L_0x0361
        L_0x034a:
            r0 = move-exception
            r7 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r7, r0, r4)
        L_0x0361:
            if (r6 == 0) goto L_0x055b
            int r0 = r6.length
            if (r0 != 0) goto L_0x0368
            goto L_0x055b
        L_0x0368:
            int r0 = p000.C1136su.f4328a
            r7 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r7)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r8 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r12 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r8, r12, r6)
            r17 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            r19 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            r21 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r23 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r25 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r27 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r29 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r31 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x0448 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0448 }
            java.lang.Class r8 = p000.C0389dn.m1512a(r10, r8)     // Catch:{ Exception -> 0x0448 }
            java.lang.String r9 = p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x0448 }
            java.lang.ClassLoader r10 = r14.getClassLoader()     // Catch:{ Exception -> 0x0448 }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r10)     // Catch:{ Exception -> 0x0448 }
            java.lang.String r10 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x0448 }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0448 }
            r13[r11] = r14     // Catch:{ Exception -> 0x0448 }
            java.lang.reflect.Method r10 = r8.getDeclaredMethod(r10, r13)     // Catch:{ Exception -> 0x0448 }
            java.lang.String r13 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x0448 }
            r35 = r4
            java.lang.Class[] r4 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0448 }
            r4[r11] = r9     // Catch:{ Exception -> 0x0448 }
            java.lang.reflect.Method r4 = r8.getDeclaredMethod(r13, r4)     // Catch:{ Exception -> 0x0448 }
            java.lang.String r9 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0448 }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0448 }
            r13[r11] = r15     // Catch:{ Exception -> 0x0448 }
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r9, r13)     // Catch:{ Exception -> 0x0448 }
            java.lang.String r13 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0448 }
            r36 = r7
            java.lang.Class[] r7 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0446 }
            r7[r11] = r15     // Catch:{ Exception -> 0x0446 }
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r13, r7)     // Catch:{ Exception -> 0x0446 }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0446 }
            r33 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r33)     // Catch:{ Exception -> 0x0446 }
            r8[r11] = r13     // Catch:{ Exception -> 0x0446 }
            r13 = 0
            java.lang.Object r8 = r10.invoke(r13, r8)     // Catch:{ Exception -> 0x0446 }
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r13 = r5.f1831e     // Catch:{ Exception -> 0x0446 }
            r10[r11] = r13     // Catch:{ Exception -> 0x0446 }
            r4.invoke(r8, r10)     // Catch:{ Exception -> 0x0446 }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0446 }
            r4[r11] = r0     // Catch:{ Exception -> 0x0446 }
            r9.invoke(r8, r4)     // Catch:{ Exception -> 0x0446 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0446 }
            r0[r11] = r6     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r0 = r7.invoke(r8, r0)     // Catch:{ Exception -> 0x0446 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0446 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0446 }
            if (r0 != 0) goto L_0x0431
            r0 = 1
            goto L_0x0432
        L_0x0431:
            r0 = 0
        L_0x0432:
            r7 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r7)     // Catch:{ Exception -> 0x0446 }
            p000.C0200av.m970a(r31)     // Catch:{ Exception -> 0x0446 }
            if (r0 == 0) goto L_0x0442
            r4 = r36
            goto L_0x0444
        L_0x0442:
            r4 = r35
        L_0x0444:
            r7 = r4
            goto L_0x045e
        L_0x0446:
            r0 = move-exception
            goto L_0x044b
        L_0x0448:
            r0 = move-exception
            r36 = r7
        L_0x044b:
            java.lang.String r4 = p000.C0200av.m970a(r27)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r7, r0, r4)
            r7 = r36
        L_0x045e:
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L_0x047f
            r6 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r5.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x0574
        L_0x047f:
            java.lang.String r0 = r5.f1827a
            byte[] r0 = r0.getBytes()
            go r4 = p000.C0433ep.f2034f
            go r7 = p000.C0433ep.f2036h
            go r8 = p000.C0433ep.f2038j
            r9 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r12 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r9, r12, r6)
            java.lang.String r9 = p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x052e }
            java.lang.ClassLoader r10 = r14.getClassLoader()     // Catch:{ Exception -> 0x052e }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r10)     // Catch:{ Exception -> 0x052e }
            java.lang.String r10 = p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x052e }
            java.lang.ClassLoader r12 = r14.getClassLoader()     // Catch:{ Exception -> 0x052e }
            java.lang.Class r10 = p000.C0389dn.m1512a(r10, r12)     // Catch:{ Exception -> 0x052e }
            java.lang.String r12 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x052e }
            r23 = r4
            r13 = 1
            java.lang.Class[] r4 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x052e }
            r4[r11] = r14     // Catch:{ Exception -> 0x052e }
            java.lang.reflect.Method r4 = r9.getDeclaredMethod(r12, r4)     // Catch:{ Exception -> 0x052e }
            java.lang.String r12 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x052e }
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x052e }
            r14[r11] = r10     // Catch:{ Exception -> 0x052e }
            java.lang.reflect.Method r10 = r9.getDeclaredMethod(r12, r14)     // Catch:{ Exception -> 0x052e }
            java.lang.String r12 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x052e }
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x052e }
            r14[r11] = r15     // Catch:{ Exception -> 0x052e }
            java.lang.reflect.Method r12 = r9.getDeclaredMethod(r12, r14)     // Catch:{ Exception -> 0x052e }
            java.lang.String r14 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x052e }
            r17 = r7
            java.lang.Class[] r7 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x052e }
            r7[r11] = r15     // Catch:{ Exception -> 0x052e }
            java.lang.reflect.Method r7 = r9.getDeclaredMethod(r14, r7)     // Catch:{ Exception -> 0x052e }
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x052e }
            r14 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x052e }
            r9[r11] = r14     // Catch:{ Exception -> 0x052e }
            r14 = 0
            java.lang.Object r4 = r4.invoke(r14, r9)     // Catch:{ Exception -> 0x052e }
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x052e }
            java.lang.Object r14 = r5.f1831e     // Catch:{ Exception -> 0x052e }
            r9[r11] = r14     // Catch:{ Exception -> 0x052e }
            r10.invoke(r4, r9)     // Catch:{ Exception -> 0x052e }
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x052e }
            r9[r11] = r0     // Catch:{ Exception -> 0x052e }
            r12.invoke(r4, r9)     // Catch:{ Exception -> 0x052e }
            java.lang.Object[] r0 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x052e }
            r0[r11] = r6     // Catch:{ Exception -> 0x052e }
            java.lang.Object r0 = r7.invoke(r4, r0)     // Catch:{ Exception -> 0x052e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x052e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x052e }
            if (r0 != 0) goto L_0x0519
            r0 = 1
            goto L_0x051a
        L_0x0519:
            r0 = 0
        L_0x051a:
            r6 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ Exception -> 0x052e }
            p000.C0200av.m970a(r31)     // Catch:{ Exception -> 0x052e }
            if (r0 == 0) goto L_0x052a
            r4 = r17
            goto L_0x052c
        L_0x052a:
            r4 = r23
        L_0x052c:
            r0 = r4
            goto L_0x0541
        L_0x052e:
            r0 = move-exception
            java.lang.String r4 = p000.C0200av.m970a(r27)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r9, r6, r0, r4)
            r0 = r8
        L_0x0541:
            go r4 = p000.C0433ep.f2036h
            if (r0 != r4) goto L_0x0555
            r6 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
        L_0x0555:
            java.lang.String.valueOf(r0)
            r5.f1832f = r0
            goto L_0x0574
        L_0x055b:
            r6 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r5.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0574:
            go r4 = p000.C0433ep.f2034f
            if (r0 == r4) goto L_0x057f
            go r4 = p000.C0433ep.f2029a
            if (r0 != r4) goto L_0x057d
            goto L_0x057f
        L_0x057d:
            r0 = 0
            goto L_0x0580
        L_0x057f:
            r0 = 1
        L_0x0580:
            if (r0 == 0) goto L_0x05bb
            java.lang.String r0 = "on_boot_action"
            java.lang.Enum r0 = p000.C0728kh.m2298n(r2, r0, r3)
            so r0 = (p000.C1129so) r0
            if (r0 == 0) goto L_0x05df
            if (r0 == r3) goto L_0x05df
            r3 = -78308822045868(0xffffb8c74e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = -78373246555308(0xffffb8b84e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)
            r4.append(r5)
            java.lang.String r5 = r0.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            p000.C0550gu.m1820b(r3, r4)
            r3 = 0
            m1390k(r1, r2, r0, r3)
            goto L_0x05df
        L_0x05bb:
            r3 = -78502095574188(0xffffb89a4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            r3 = -78566520083628(0xffffb88b4e7aab54, double:NaN)
            goto L_0x05d8
        L_0x05ca:
            r3 = -78824218121388(0xffffb84f4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            r3 = -78888642630828(0xffffb8404e7aab54, double:NaN)
        L_0x05d8:
            java.lang.String r3 = p000.C0200av.m970a(r3)
            p000.C0550gu.m1820b(r0, r3)
        L_0x05df:
            if (r1 == 0) goto L_0x06c8
            boolean r0 = p000.C0728kh.m2285a()
            if (r0 == 0) goto L_0x06c8
            iu$a r0 = p000.C0697ju.f2940h
            boolean r0 = r0.mo3309a(r2, r11)
            if (r0 != 0) goto L_0x06c8
            iu$a r0 = p000.C0697ju.f2941i
            boolean r0 = r0.mo3309a(r2, r11)
            if (r0 != 0) goto L_0x06c8
            iu$a r0 = p000.C0697ju.f2941i
            r1 = 1
            r0.mo3310b(r2, r1)
            boolean r0 = p000.C0728kh.m2278G(r38)
            if (r0 != 0) goto L_0x0618
            java.lang.String r0 = "com.nordskog.LesserAudioSwitch_widgets"
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r11)
            java.util.Map r0 = r0.getAll()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0615
            r0 = 1
            goto L_0x0616
        L_0x0615:
            r0 = 0
        L_0x0616:
            if (r0 == 0) goto L_0x06c8
        L_0x0618:
            boolean r0 = com.nordskog.LesserAudioSwitch.service.HeadphonesMonitorService.f1746b
            r0 = -75744726570156(0xffffbb1c4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x066d
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            r3 = -75800561145004(0xffffbb0f4e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            android.content.res.Resources r4 = r38.getResources()
            r5 = 2131689667(0x7f0f00c3, float:1.9008356E38)
            java.lang.String r4 = r4.getString(r5)
            r5 = 4
            r1.<init>(r3, r4, r5)
            r1.setShowBadge(r11)
            r3 = 0
            r1.setSound(r3, r3)
            r0.createNotificationChannel(r1)
            a6 r1 = new a6
            r3 = -75912230294700(0xffffbaf54e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            r1.<init>(r2, r3)
            r3 = -76023899444396(0xffffbadb4e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            r1.f42m = r3
            goto L_0x067f
        L_0x066d:
            a6 r1 = new a6
            r3 = -76135568594092(0xffffbac14e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            r1.<init>(r2, r3)
            r1.f37h = r11
            r1.f43n = r11
        L_0x067f:
            r3 = 2131165462(0x7f070116, float:1.7945142E38)
            android.app.Notification r4 = r1.f45p
            r4.icon = r3
            android.content.res.Resources r3 = r38.getResources()
            r4 = 2131689770(0x7f0f012a, float:1.9008565E38)
            java.lang.String r3 = r3.getString(r4)
            r1.mo44d(r3)
            android.content.res.Resources r3 = r38.getResources()
            r4 = 2131689771(0x7f0f012b, float:1.9008567E38)
            java.lang.String r3 = r3.getString(r4)
            r1.mo43c(r3)
            android.content.res.Resources r3 = r38.getResources()
            r4 = 2131165470(0x7f07011e, float:1.7945158E38)
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r4)
            r1.mo45e(r3)
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.nordskog.LesserAudioSwitch.ui.MainActivity> r4 = com.nordskog.LesserAudioSwitch.p002ui.MainActivity.class
            r3.<init>(r2, r4)
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r11, r3, r4)
            r1.f35f = r2
            int r2 = com.nordskog.LesserAudioSwitch.service.HeadphonesMonitorService.f1752h
            android.app.Notification r1 = r1.mo42a()
            r0.notify(r2, r1)
        L_0x06c8:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver.m1381a(com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver, android.content.Context):boolean");
    }

    /* renamed from: b */
    public static PendingIntent m1382b(Context context) {
        Intent intent = new Intent(context, SoundBroadcastReceiver.class);
        intent.setAction(C0200av.m970a(-88672578131116L));
        intent.putExtra(C0200av.m970a(-88848671790252L), true);
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: c */
    public static PendingIntent m1383c(Context context) {
        Intent intent = new Intent(context, SoundBroadcastReceiver.class);
        intent.setAction(C0200av.m970a(-89454262178988L));
        intent.putExtra(C0200av.m970a(-89608881001644L), true);
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: d */
    public static PendingIntent m1384d(Context context) {
        Intent intent = new Intent(context, SoundBroadcastReceiver.class);
        intent.setAction(C0200av.m970a(-88264556237996L));
        intent.putExtra(C0200av.m970a(-88444944864428L), true);
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: e */
    public static PendingIntent m1385e(Context context) {
        Intent intent = new Intent(context, SoundBroadcastReceiver.class);
        intent.setAction(C0200av.m970a(-89836514268332L));
        intent.putExtra(C0200av.m970a(-89991133090988L), true);
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: f */
    public static PendingIntent m1386f(Context context, C1129so soVar) {
        int ordinal = soVar.ordinal();
        if (ordinal == 1) {
            return m1387g(context);
        }
        if (ordinal == 3) {
            return m1384d(context);
        }
        switch (ordinal) {
            case 5:
                return m1382b(context);
            case 6:
                return m1389i(context);
            case 7:
                return m1383c(context);
            case 8:
                return m1385e(context);
            case 9:
                return m1388h(context);
            default:
                return m1387g(context);
        }
    }

    /* renamed from: g */
    public static PendingIntent m1387g(Context context) {
        Intent intent = new Intent(context, SoundBroadcastReceiver.class);
        intent.setAction(C0200av.m970a(-87869419246764L));
        intent.putExtra(C0200av.m970a(-88036922971308L), true);
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: h */
    public static PendingIntent m1388h(Context context) {
        Intent intent = new Intent(context, SoundBroadcastReceiver.class);
        intent.setAction(C0200av.m970a(-90218766357676L));
        intent.putExtra(C0200av.m970a(-90381975114924L), true);
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: i */
    public static PendingIntent m1389i(Context context) {
        Intent intent = new Intent(context, SoundBroadcastReceiver.class);
        intent.setAction(C0200av.m970a(-89076305056940L));
        intent.putExtra(C0200av.m970a(-89226628912300L), true);
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    /* renamed from: k */
    public static void m1390k(SoundBroadcastReceiver soundBroadcastReceiver, Context context, C1129so soVar, BroadcastReceiver.PendingResult pendingResult) {
        C0735ko.C0740e eVar;
        if (soundBroadcastReceiver != null) {
            if (pendingResult == null) {
                pendingResult = soundBroadcastReceiver.goAsync();
            }
            eVar = new C0583hn(pendingResult);
        } else {
            eVar = new C0543gn(pendingResult);
        }
        C0936oo.m2711v(context, soVar, eVar);
    }

    /* renamed from: n */
    public static void m1391n(Context context) {
        boolean z;
        C1426yp b = C1426yp.m3890b(context);
        synchronized (b.f5215g) {
            z = !b.f5215g.isEmpty();
        }
        if (z) {
            C1426yp.m3892g(context);
        }
    }

    /* renamed from: j */
    public final void mo2535j(Context context, C1129so soVar, BroadcastReceiver.PendingResult pendingResult) {
        m1390k(this, context, soVar, pendingResult);
    }

    /* renamed from: l */
    public final void mo2536l(Context context, C1129so soVar, BroadcastReceiver.PendingResult pendingResult) {
        C0936oo.f3508c.mo3811b(context, new C1383xn(context, soVar, new C0645in(pendingResult)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0a4b, code lost:
        if ((r0 == p000.C0433ep.f2034f || r0 == p000.C0433ep.f2029a) != false) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0a7d, code lost:
        r0 = p000.C0728kh.m2299o(r49, r50, r51);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x091f  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x093a  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0a48  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0a4a  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0a87  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0aa3  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0aad  */
    /* JADX WARNING: Removed duplicated region for block: B:407:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2537m(android.content.Context r49, p000.C0489fo r50, boolean r51, android.content.BroadcastReceiver.PendingResult r52) {
        /*
            r48 = this;
            r7 = r48
            r3 = r49
            r4 = r50
            r5 = r51
            r1 = r52
            fo r2 = p000.C0489fo.BLUETOOTH
            java.lang.Class<byte[]> r6 = byte[].class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r10 = 1500(0x5dc, double:7.41E-321)
            r12 = 3000(0xbb8, double:1.482E-320)
            if (r1 != 0) goto L_0x009b
            boolean r14 = p000.C0728kh.m2305u()
            if (r14 == 0) goto L_0x0043
            long r14 = java.lang.System.currentTimeMillis()
            long r16 = f1740c
            long r14 = r14 - r16
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 >= 0) goto L_0x0043
            r0 = -85657511089324(0xffffb2184e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            r1 = -85721935598764(0xffffb2094e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)
            p000.C0550gu.m1820b(r0, r1)
            return
        L_0x0043:
            boolean r10 = p000.C0728kh.m2305u()
            if (r10 == 0) goto L_0x0065
            nu r10 = p000.C0936oo.f3508c
            boolean r10 = r10.f3432f
            if (r10 == 0) goto L_0x0065
            r0 = -86065532982444(0xffffb1b94e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            r1 = -86129957491884(0xffffb1aa4e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)
            p000.C0550gu.m1820b(r0, r1)
            return
        L_0x0065:
            boolean r10 = p000.C0697ju.m2178a(r49)
            if (r10 == 0) goto L_0x009b
            so r10 = r50.mo2806a()
            so r11 = p000.C1129so.BLUETOOTH
            if (r10 != r11) goto L_0x009b
            nu r10 = p000.C0936oo.f3508c
            long r10 = java.lang.System.currentTimeMillis()
            long r14 = p000.C0936oo.f3509d
            long r10 = r10 - r14
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0082
            r10 = 1
            goto L_0x0083
        L_0x0082:
            r10 = 0
        L_0x0083:
            if (r10 == 0) goto L_0x009b
            r0 = -86349000823980(0xffffb1774e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            r1 = -86413425333420(0xffffb1684e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)
            p000.C0550gu.m1820b(r0, r1)
            return
        L_0x009b:
            if (r1 != 0) goto L_0x010c
            r10 = -86761317684396(0xffffb1174e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = -86825742193836(0xffffb1084e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)
            r11.append(r12)
            java.lang.String r12 = r50.toString()
            r11.append(r12)
            r12 = -86971771081900(0xffffb0e64e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            p000.C0550gu.m1820b(r10, r11)
            com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver$a r10 = new com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver$a
            r10.<init>(r4, r5)
            com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver$a r11 = f1738a
            if (r11 == 0) goto L_0x00f6
            fo r12 = r11.f1742a
            if (r12 != r4) goto L_0x00f6
            boolean r12 = r11.f1743b
            if (r12 != r5) goto L_0x00f6
            long r11 = r11.f1744c
            long r13 = r10.f1744c
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)
            r13 = 3000(0xbb8, double:1.482E-320)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00f6
            r11 = 1
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            f1738a = r10
            if (r11 == 0) goto L_0x0143
            r0 = -87031900624044(0xffffb0d84e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -87096325133484(0xffffb0c94e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            return
        L_0x010c:
            r10 = -87285303694508(0xffffb09d4e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = -87349728203948(0xffffb08e4e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)
            r11.append(r12)
            java.lang.String r12 = r50.toString()
            r11.append(r12)
            r12 = -87530116830380(0xffffb0644e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            p000.C0550gu.m1820b(r10, r11)
        L_0x0143:
            r10 = -37364898813100(0xffffde044e7aab54, double:NaN)
            r16 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            r18 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r20 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r22 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r24 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            r26 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            r28 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            r30 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            r14 = -128(0xffffffffffffff80, float:NaN)
            r15 = 127(0x7f, float:1.78E-43)
            r12 = 19
            r34 = 3
            r35 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            r37 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            r13 = 0
            if (r1 != 0) goto L_0x05f7
            r40 = 500(0x1f4, double:2.47E-321)
            fo r1 = p000.C0489fo.USB
            if (r4 == r1) goto L_0x0195
            fo r1 = p000.C0489fo.WIRED_HEADPHONE
            if (r4 != r1) goto L_0x0190
            goto L_0x0195
        L_0x0190:
            if (r4 != r2) goto L_0x0197
            r40 = 2500(0x9c4, double:1.235E-320)
            goto L_0x0197
        L_0x0195:
            r40 = 1500(0x5dc, double:7.41E-321)
        L_0x0197:
            java.lang.String r1 = p000.C0391dp.f1915a
            java.lang.String r1 = p000.C1384xo.f5120b
            int r2 = p000.C1425yo.f5206a
            int r1 = r1.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r2 = p000.C0200av.m970a(r10)
            android.content.SharedPreferences r2 = r3.getSharedPreferences(r2, r9)
            java.lang.String r1 = r2.getString(r1, r13)
            if (r1 == 0) goto L_0x025c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01bb
            goto L_0x025c
        L_0x01bb:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01c3
            goto L_0x022b
        L_0x01c3:
            byte[] r1 = android.util.Base64.decode(r1, r9)
            java.lang.String r2 = p000.C0391dp.f1915a
            if (r2 != 0) goto L_0x01d9
            android.content.ContentResolver r2 = r49.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r20)
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r10)
            p000.C0391dp.f1915a = r2
        L_0x01d9:
            java.lang.String r2 = p000.C0391dp.f1915a
            if (r2 != 0) goto L_0x01e3
            java.lang.String r2 = p000.C0200av.m970a(r22)
            p000.C0391dp.f1915a = r2
        L_0x01e3:
            java.lang.String r2 = p000.C0391dp.f1915a
            if (r2 == 0) goto L_0x01f7
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L_0x01f7
            int r2 = r2.hashCode()
            byte r2 = (byte) r2
            if (r2 != 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r13 = r2
            goto L_0x01f8
        L_0x01f7:
            r13 = 5
        L_0x01f8:
            int r13 = r13 * -1
            byte r2 = (byte) r13
            p000.C0495fu.m1724a(r1)
            int r10 = r1.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x0202:
            int r13 = r1.length
            if (r11 >= r13) goto L_0x0217
            byte r13 = r1[r11]
            int r13 = r13 + r2
            if (r13 <= r15) goto L_0x020d
            int r13 = r13 + -256
            goto L_0x0211
        L_0x020d:
            if (r13 >= r14) goto L_0x0211
            int r13 = r13 + 256
        L_0x0211:
            byte r13 = (byte) r13
            r10[r11] = r13
            int r11 = r11 + 1
            goto L_0x0202
        L_0x0217:
            p000.C0495fu.m1724a(r10)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r12) goto L_0x0226
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r10, r2)
            goto L_0x022b
        L_0x0226:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r10)
        L_0x022b:
            java.lang.String r2 = p000.C0200av.m970a(r35)
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r10 = 4
            if (r2 == r10) goto L_0x0249
            cp r1 = new cp
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            go r47 = p000.C0433ep.f2035g
            r42 = r1
            r42.<init>(r43, r44, r45, r46, r47)
            goto L_0x026d
        L_0x0249:
            cp r2 = new cp
            r11 = r1[r9]
            r10 = 1
            r12 = r1[r10]
            r10 = 2
            r13 = r1[r10]
            r14 = r1[r34]
            go r15 = p000.C0433ep.f2029a
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x026e
        L_0x025c:
            cp r1 = new cp
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            go r47 = p000.C0433ep.f2035g
            r42 = r1
            r42.<init>(r43, r44, r45, r46, r47)
        L_0x026d:
            r2 = r1
        L_0x026e:
            java.lang.String r1 = r2.f1827a
            if (r1 == 0) goto L_0x0296
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0279
            goto L_0x0296
        L_0x0279:
            java.lang.String r1 = r2.f1828b
            if (r1 == 0) goto L_0x0296
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0284
            goto L_0x0296
        L_0x0284:
            java.lang.String r1 = r2.f1829c
            if (r1 == 0) goto L_0x0296
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x028f
            goto L_0x0296
        L_0x028f:
            java.lang.Object r1 = r2.f1831e
            if (r1 != 0) goto L_0x0294
            goto L_0x0296
        L_0x0294:
            r1 = 1
            goto L_0x0297
        L_0x0296:
            r1 = 0
        L_0x0297:
            if (r1 != 0) goto L_0x02a2
            go r1 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r1)
            r2.f1832f = r1
            r1 = 0
            goto L_0x02d1
        L_0x02a2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = r2.f1827a
            r1.append(r10)
            java.lang.String r10 = r2.f1828b
            r1.append(r10)
            java.lang.String r10 = r2.f1829c
            java.lang.String r1 = p000.C0279ch.m1122s(r1, r10)
            java.lang.String r10 = r2.f1830d
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x02c5
            p000.C0200av.m970a(r16)
            p000.C0200av.m970a(r18)
        L_0x02c5:
            if (r1 == 0) goto L_0x02ca
            go r10 = p000.C0433ep.f2039k
            goto L_0x02cc
        L_0x02ca:
            go r10 = p000.C0433ep.f2031c
        L_0x02cc:
            java.lang.String.valueOf(r10)
            r2.f1832f = r10
        L_0x02d1:
            if (r1 == 0) goto L_0x05d7
            java.lang.String r1 = r2.f1827a
            if (r1 == 0) goto L_0x02fb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02de
            goto L_0x02fb
        L_0x02de:
            java.lang.String r1 = r2.f1828b
            if (r1 == 0) goto L_0x02fb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02e9
            goto L_0x02fb
        L_0x02e9:
            java.lang.String r1 = r2.f1829c
            if (r1 == 0) goto L_0x02fb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02f4
            goto L_0x02fb
        L_0x02f4:
            java.lang.Object r1 = r2.f1831e
            if (r1 != 0) goto L_0x02f9
            goto L_0x02fb
        L_0x02f9:
            r1 = 1
            goto L_0x02fc
        L_0x02fb:
            r1 = 0
        L_0x02fc:
            if (r1 != 0) goto L_0x0307
            go r1 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r1)
            r2.f1832f = r1
            r1 = 0
            goto L_0x0336
        L_0x0307:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = r2.f1827a
            r1.append(r10)
            java.lang.String r10 = r2.f1828b
            r1.append(r10)
            java.lang.String r10 = r2.f1829c
            java.lang.String r1 = p000.C0279ch.m1122s(r1, r10)
            java.lang.String r10 = r2.f1830d
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x032a
            p000.C0200av.m970a(r16)
            p000.C0200av.m970a(r18)
        L_0x032a:
            if (r1 == 0) goto L_0x032f
            go r10 = p000.C0433ep.f2039k
            goto L_0x0331
        L_0x032f:
            go r10 = p000.C0433ep.f2031c
        L_0x0331:
            java.lang.String.valueOf(r10)
            r2.f1832f = r10
        L_0x0336:
            if (r1 != 0) goto L_0x033c
            go r0 = r2.f1832f
            goto L_0x05b7
        L_0x033c:
            java.lang.String r1 = r2.f1829c
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0350
            android.content.ContentResolver r10 = r49.getContentResolver()
            java.lang.String r11 = p000.C0200av.m970a(r20)
            java.lang.String r10 = android.provider.Settings.Secure.getString(r10, r11)
            p000.C0391dp.f1915a = r10
        L_0x0350:
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x035a
            java.lang.String r10 = p000.C0200av.m970a(r22)
            p000.C0391dp.f1915a = r10
        L_0x035a:
            java.lang.String r10 = p000.C0391dp.f1915a
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0373
            p000.C0200av.m970a(r30)
            p000.C0200av.m970a(r28)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x05b7
        L_0x0373:
            java.lang.String r1 = r2.f1828b
            java.lang.Class r10 = p000.C1228uu.f4686b
            byte[] r10 = new byte[r9]
            java.lang.reflect.Method r11 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x038c }
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x038c }
            r12[r9] = r1     // Catch:{ Exception -> 0x038c }
            r1 = 1
            r12[r1] = r0     // Catch:{ Exception -> 0x038c }
            r0 = 0
            java.lang.Object r0 = r11.invoke(r0, r12)     // Catch:{ Exception -> 0x038c }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x038c }
            r10 = r0
            goto L_0x039e
        L_0x038c:
            r0 = move-exception
            java.lang.String r1 = p000.C0200av.m970a(r26)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r12, r11, r0, r1)
        L_0x039e:
            if (r10 == 0) goto L_0x05a3
            int r0 = r10.length
            if (r0 != 0) goto L_0x03a5
            goto L_0x05a3
        L_0x03a5:
            int r0 = p000.C1136su.f4328a
            r0 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r12 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            r14 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            p000.C0279ch.m1109f(r14, r12, r10)
            r16 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r18 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r22 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r24 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x0482 }
            java.lang.ClassLoader r13 = r8.getClassLoader()     // Catch:{ Exception -> 0x0482 }
            java.lang.Class r12 = p000.C0389dn.m1512a(r12, r13)     // Catch:{ Exception -> 0x0482 }
            java.lang.String r13 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x0482 }
            java.lang.ClassLoader r14 = r8.getClassLoader()     // Catch:{ Exception -> 0x0482 }
            java.lang.Class r13 = p000.C0389dn.m1512a(r13, r14)     // Catch:{ Exception -> 0x0482 }
            java.lang.String r14 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x0482 }
            r15 = 1
            r52 = r1
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0482 }
            r1[r9] = r8     // Catch:{ Exception -> 0x0482 }
            java.lang.reflect.Method r1 = r12.getDeclaredMethod(r14, r1)     // Catch:{ Exception -> 0x0482 }
            r28 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r28)     // Catch:{ Exception -> 0x0482 }
            r30 = r11
            java.lang.Class[] r11 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0480 }
            r11[r9] = r13     // Catch:{ Exception -> 0x0480 }
            java.lang.reflect.Method r11 = r12.getDeclaredMethod(r14, r11)     // Catch:{ Exception -> 0x0480 }
            r13 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0480 }
            java.lang.Class[] r13 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0480 }
            r14 = 0
            r13[r14] = r6     // Catch:{ Exception -> 0x0480 }
            java.lang.reflect.Method r9 = r12.getDeclaredMethod(r9, r13)     // Catch:{ Exception -> 0x0480 }
            r32 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r32)     // Catch:{ Exception -> 0x0480 }
            r15 = 1
            java.lang.Class[] r7 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0480 }
            r7[r14] = r6     // Catch:{ Exception -> 0x0480 }
            java.lang.reflect.Method r7 = r12.getDeclaredMethod(r13, r7)     // Catch:{ Exception -> 0x0480 }
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0480 }
            java.lang.String r13 = p000.C0200av.m970a(r37)     // Catch:{ Exception -> 0x0480 }
            r12[r14] = r13     // Catch:{ Exception -> 0x0480 }
            r13 = 0
            java.lang.Object r1 = r1.invoke(r13, r12)     // Catch:{ Exception -> 0x0480 }
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0480 }
            java.lang.Object r13 = r2.f1831e     // Catch:{ Exception -> 0x0480 }
            r12[r14] = r13     // Catch:{ Exception -> 0x0480 }
            r11.invoke(r1, r12)     // Catch:{ Exception -> 0x0480 }
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0480 }
            r11[r14] = r0     // Catch:{ Exception -> 0x0480 }
            r9.invoke(r1, r11)     // Catch:{ Exception -> 0x0480 }
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0480 }
            r0[r14] = r10     // Catch:{ Exception -> 0x0480 }
            java.lang.Object r0 = r7.invoke(r1, r0)     // Catch:{ Exception -> 0x0480 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0480 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0480 }
            if (r0 != 0) goto L_0x0466
            r0 = 1
            goto L_0x0467
        L_0x0466:
            r0 = 0
        L_0x0467:
            r11 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0480 }
            r11 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0480 }
            if (r0 == 0) goto L_0x047c
            r1 = r30
            goto L_0x047e
        L_0x047c:
            r1 = r52
        L_0x047e:
            r11 = r1
            goto L_0x0498
        L_0x0480:
            r0 = move-exception
            goto L_0x0485
        L_0x0482:
            r0 = move-exception
            r30 = r11
        L_0x0485:
            java.lang.String r1 = p000.C0200av.m970a(r22)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r11 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r11, r7, r0, r1)
            r11 = r30
        L_0x0498:
            boolean r0 = r11.booleanValue()
            if (r0 == 0) goto L_0x04b9
            r0 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x05b7
        L_0x04b9:
            java.lang.String r0 = r2.f1827a
            byte[] r0 = r0.getBytes()
            go r1 = p000.C0433ep.f2034f
            go r7 = p000.C0433ep.f2036h
            go r9 = p000.C0433ep.f2038j
            r11 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            r13 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            p000.C0279ch.m1109f(r13, r11, r10)
            java.lang.String r11 = p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x0576 }
            java.lang.ClassLoader r12 = r8.getClassLoader()     // Catch:{ Exception -> 0x0576 }
            java.lang.Class r11 = p000.C0389dn.m1512a(r11, r12)     // Catch:{ Exception -> 0x0576 }
            java.lang.String r12 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x0576 }
            java.lang.ClassLoader r13 = r8.getClassLoader()     // Catch:{ Exception -> 0x0576 }
            java.lang.Class r12 = p000.C0389dn.m1512a(r12, r13)     // Catch:{ Exception -> 0x0576 }
            java.lang.String r13 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x0576 }
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0576 }
            r16 = 0
            r15[r16] = r8     // Catch:{ Exception -> 0x0576 }
            java.lang.reflect.Method r8 = r11.getDeclaredMethod(r13, r15)     // Catch:{ Exception -> 0x0576 }
            r17 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0576 }
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0576 }
            r15[r16] = r12     // Catch:{ Exception -> 0x0576 }
            java.lang.reflect.Method r12 = r11.getDeclaredMethod(r13, r15)     // Catch:{ Exception -> 0x0576 }
            r17 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0576 }
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0576 }
            r15[r16] = r6     // Catch:{ Exception -> 0x0576 }
            java.lang.reflect.Method r13 = r11.getDeclaredMethod(r13, r15)     // Catch:{ Exception -> 0x0576 }
            r17 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0576 }
            r52 = r1
            java.lang.Class[] r1 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0576 }
            r1[r16] = r6     // Catch:{ Exception -> 0x0576 }
            java.lang.reflect.Method r1 = r11.getDeclaredMethod(r15, r1)     // Catch:{ Exception -> 0x0576 }
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0576 }
            java.lang.String r11 = p000.C0200av.m970a(r37)     // Catch:{ Exception -> 0x0576 }
            r6[r16] = r11     // Catch:{ Exception -> 0x0576 }
            r11 = 0
            java.lang.Object r6 = r8.invoke(r11, r6)     // Catch:{ Exception -> 0x0576 }
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0576 }
            java.lang.Object r11 = r2.f1831e     // Catch:{ Exception -> 0x0576 }
            r8[r16] = r11     // Catch:{ Exception -> 0x0576 }
            r12.invoke(r6, r8)     // Catch:{ Exception -> 0x0576 }
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0576 }
            r8[r16] = r0     // Catch:{ Exception -> 0x0576 }
            r13.invoke(r6, r8)     // Catch:{ Exception -> 0x0576 }
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0576 }
            r0[r16] = r10     // Catch:{ Exception -> 0x0576 }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ Exception -> 0x0576 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0576 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0576 }
            if (r0 != 0) goto L_0x055d
            r0 = 1
            goto L_0x055e
        L_0x055d:
            r0 = 0
        L_0x055e:
            r10 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x0576 }
            r10 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x0576 }
            if (r0 == 0) goto L_0x0572
            r1 = r7
            goto L_0x0574
        L_0x0572:
            r1 = r52
        L_0x0574:
            r0 = r1
            goto L_0x0589
        L_0x0576:
            r0 = move-exception
            java.lang.String r1 = p000.C0200av.m970a(r22)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r7, r6, r0, r1)
            r0 = r9
        L_0x0589:
            go r1 = p000.C0433ep.f2036h
            if (r0 != r1) goto L_0x059d
            r6 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
        L_0x059d:
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            goto L_0x05b7
        L_0x05a3:
            p000.C0200av.m970a(r24)
            r0 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x05b7:
            go r1 = p000.C0433ep.f2034f
            if (r0 == r1) goto L_0x05c2
            go r1 = p000.C0433ep.f2029a
            if (r0 != r1) goto L_0x05c0
            goto L_0x05c2
        L_0x05c0:
            r0 = 0
            goto L_0x05c3
        L_0x05c2:
            r0 = 1
        L_0x05c3:
            if (r0 == 0) goto L_0x05d7
            r0 = -70577880913068(0xffffbfcf4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70599355749548(0xffffbfca4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r9 = 0
            goto L_0x05d8
        L_0x05d7:
            r9 = 1
        L_0x05d8:
            if (r9 != 0) goto L_0x05dd
            r40 = 300000(0x493e0, double:1.482197E-318)
        L_0x05dd:
            r7 = r40
            android.content.BroadcastReceiver$PendingResult r6 = r48.goAsync()
            android.os.Handler r0 = f1739b
            fn r9 = new fn
            r1 = r9
            r2 = r48
            r3 = r49
            r4 = r50
            r5 = r51
            r1.<init>(r2, r3, r4, r5, r6)
            r0.postDelayed(r9, r7)
            return
        L_0x05f7:
            if (r5 == 0) goto L_0x05fc
            p000.C1426yp.f5208i = r4
            goto L_0x0604
        L_0x05fc:
            fo r7 = p000.C1426yp.f5208i
            if (r4 != r7) goto L_0x0604
            fo r7 = p000.C0489fo.DEFAULT
            p000.C1426yp.f5208i = r7
        L_0x0604:
            boolean r7 = p000.C0697ju.m2178a(r49)
            if (r7 == 0) goto L_0x0a6e
            java.lang.String r9 = p000.C1384xo.f5119a
            int r12 = p000.C1425yo.f5206a
            int r9 = r9.hashCode()
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            java.lang.String r10 = p000.C0200av.m970a(r10)
            r11 = 0
            android.content.SharedPreferences r10 = r3.getSharedPreferences(r10, r11)
            r12 = 0
            java.lang.String r9 = r10.getString(r9, r12)
            if (r9 == 0) goto L_0x06d4
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x062e
            goto L_0x06d4
        L_0x062e:
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0636
            goto L_0x069f
        L_0x0636:
            byte[] r9 = android.util.Base64.decode(r9, r11)
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x064c
            android.content.ContentResolver r10 = r49.getContentResolver()
            java.lang.String r12 = p000.C0200av.m970a(r20)
            java.lang.String r10 = android.provider.Settings.Secure.getString(r10, r12)
            p000.C0391dp.f1915a = r10
        L_0x064c:
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0656
            java.lang.String r10 = p000.C0200av.m970a(r22)
            p000.C0391dp.f1915a = r10
        L_0x0656:
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 == 0) goto L_0x066a
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x066a
            int r10 = r10.hashCode()
            byte r10 = (byte) r10
            if (r10 != 0) goto L_0x0668
            goto L_0x066a
        L_0x0668:
            r13 = r10
            goto L_0x066b
        L_0x066a:
            r13 = 5
        L_0x066b:
            int r13 = r13 * -1
            byte r10 = (byte) r13
            p000.C0495fu.m1724a(r9)
            int r12 = r9.length
            byte[] r12 = new byte[r12]
        L_0x0674:
            int r13 = r9.length
            if (r11 >= r13) goto L_0x0689
            byte r13 = r9[r11]
            int r13 = r13 + r10
            if (r13 <= r15) goto L_0x067f
            int r13 = r13 + -256
            goto L_0x0683
        L_0x067f:
            if (r13 >= r14) goto L_0x0683
            int r13 = r13 + 256
        L_0x0683:
            byte r13 = (byte) r13
            r12[r11] = r13
            int r11 = r11 + 1
            goto L_0x0674
        L_0x0689:
            p000.C0495fu.m1724a(r12)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 19
            if (r9 < r10) goto L_0x069a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            r9.<init>(r12, r10)
            goto L_0x069f
        L_0x069a:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r12)
        L_0x069f:
            java.lang.String r10 = p000.C0200av.m970a(r35)
            java.lang.String[] r9 = r9.split(r10)
            int r10 = r9.length
            r11 = 4
            if (r10 == r11) goto L_0x06bd
            cp r9 = new cp
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            go r44 = p000.C0433ep.f2035g
            r39 = r9
            r39.<init>(r40, r41, r42, r43, r44)
            goto L_0x06e5
        L_0x06bd:
            cp r35 = new cp
            r10 = 0
            r11 = r9[r10]
            r10 = 1
            r12 = r9[r10]
            r10 = 2
            r13 = r9[r10]
            r14 = r9[r34]
            go r15 = p000.C0433ep.f2029a
            r10 = r35
            r10.<init>(r11, r12, r13, r14, r15)
            r9 = r35
            goto L_0x06e5
        L_0x06d4:
            cp r9 = new cp
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            go r44 = p000.C0433ep.f2035g
            r39 = r9
            r39.<init>(r40, r41, r42, r43, r44)
        L_0x06e5:
            java.lang.String r10 = p000.C0391dp.f1915a
            java.lang.String r10 = r9.f1827a
            if (r10 == 0) goto L_0x070f
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x06f2
            goto L_0x070f
        L_0x06f2:
            java.lang.String r10 = r9.f1828b
            if (r10 == 0) goto L_0x070f
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x06fd
            goto L_0x070f
        L_0x06fd:
            java.lang.String r10 = r9.f1829c
            if (r10 == 0) goto L_0x070f
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0708
            goto L_0x070f
        L_0x0708:
            java.lang.Object r10 = r9.f1831e
            if (r10 != 0) goto L_0x070d
            goto L_0x070f
        L_0x070d:
            r10 = 1
            goto L_0x0710
        L_0x070f:
            r10 = 0
        L_0x0710:
            if (r10 != 0) goto L_0x071b
            go r10 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r10)
            r9.f1832f = r10
            r10 = 0
            goto L_0x074a
        L_0x071b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r9.f1827a
            r10.append(r11)
            java.lang.String r11 = r9.f1828b
            r10.append(r11)
            java.lang.String r11 = r9.f1829c
            java.lang.String r10 = p000.C0279ch.m1122s(r10, r11)
            java.lang.String r11 = r9.f1830d
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x073e
            p000.C0200av.m970a(r16)
            p000.C0200av.m970a(r18)
        L_0x073e:
            if (r10 == 0) goto L_0x0743
            go r11 = p000.C0433ep.f2039k
            goto L_0x0745
        L_0x0743:
            go r11 = p000.C0433ep.f2031c
        L_0x0745:
            java.lang.String.valueOf(r11)
            r9.f1832f = r11
        L_0x074a:
            if (r10 == 0) goto L_0x0a4e
            java.lang.String r10 = r9.f1827a
            if (r10 == 0) goto L_0x0774
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0757
            goto L_0x0774
        L_0x0757:
            java.lang.String r10 = r9.f1828b
            if (r10 == 0) goto L_0x0774
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0762
            goto L_0x0774
        L_0x0762:
            java.lang.String r10 = r9.f1829c
            if (r10 == 0) goto L_0x0774
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x076d
            goto L_0x0774
        L_0x076d:
            java.lang.Object r10 = r9.f1831e
            if (r10 != 0) goto L_0x0772
            goto L_0x0774
        L_0x0772:
            r10 = 1
            goto L_0x0775
        L_0x0774:
            r10 = 0
        L_0x0775:
            if (r10 != 0) goto L_0x0780
            go r10 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r10)
            r9.f1832f = r10
            r10 = 0
            goto L_0x07af
        L_0x0780:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r9.f1827a
            r10.append(r11)
            java.lang.String r11 = r9.f1828b
            r10.append(r11)
            java.lang.String r11 = r9.f1829c
            java.lang.String r10 = p000.C0279ch.m1122s(r10, r11)
            java.lang.String r11 = r9.f1830d
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x07a3
            p000.C0200av.m970a(r16)
            p000.C0200av.m970a(r18)
        L_0x07a3:
            if (r10 == 0) goto L_0x07a8
            go r11 = p000.C0433ep.f2039k
            goto L_0x07aa
        L_0x07a8:
            go r11 = p000.C0433ep.f2031c
        L_0x07aa:
            java.lang.String.valueOf(r11)
            r9.f1832f = r11
        L_0x07af:
            if (r10 != 0) goto L_0x07b4
            go r0 = r9.f1832f
            goto L_0x07e9
        L_0x07b4:
            java.lang.String r10 = r9.f1829c
            java.lang.String r11 = p000.C0391dp.f1915a
            if (r11 != 0) goto L_0x07c8
            android.content.ContentResolver r11 = r49.getContentResolver()
            java.lang.String r12 = p000.C0200av.m970a(r20)
            java.lang.String r11 = android.provider.Settings.Secure.getString(r11, r12)
            p000.C0391dp.f1915a = r11
        L_0x07c8:
            java.lang.String r11 = p000.C0391dp.f1915a
            if (r11 != 0) goto L_0x07d2
            java.lang.String r11 = p000.C0200av.m970a(r22)
            p000.C0391dp.f1915a = r11
        L_0x07d2:
            java.lang.String r11 = p000.C0391dp.f1915a
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x07ed
            p000.C0200av.m970a(r30)
            p000.C0200av.m970a(r28)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2033e
        L_0x07e9:
            r23 = r7
            goto L_0x0a3f
        L_0x07ed:
            java.lang.String r10 = r9.f1828b
            java.lang.Class r11 = p000.C1228uu.f4686b
            r11 = 0
            byte[] r12 = new byte[r11]
            java.lang.reflect.Method r13 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x0807 }
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0807 }
            r14[r11] = r10     // Catch:{ Exception -> 0x0807 }
            r10 = 1
            r14[r10] = r0     // Catch:{ Exception -> 0x0807 }
            r0 = 0
            java.lang.Object r0 = r13.invoke(r0, r14)     // Catch:{ Exception -> 0x0807 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0807 }
            r12 = r0
            goto L_0x0819
        L_0x0807:
            r0 = move-exception
            java.lang.String r10 = p000.C0200av.m970a(r26)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r13 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r13, r11, r0, r10)
        L_0x0819:
            if (r12 == 0) goto L_0x0a29
            int r0 = r12.length
            if (r0 != 0) goto L_0x0820
            goto L_0x0a29
        L_0x0820:
            int r0 = p000.C1136su.f4328a
            r10 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r10)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r15 = r10
            r16 = r11
            r10 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r13 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r10, r13, r12)
            r17 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r19 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r24 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r26 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x0903 }
            java.lang.ClassLoader r11 = r8.getClassLoader()     // Catch:{ Exception -> 0x0903 }
            java.lang.Class r10 = p000.C0389dn.m1512a(r10, r11)     // Catch:{ Exception -> 0x0903 }
            java.lang.String r11 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0903 }
            java.lang.ClassLoader r13 = r8.getClassLoader()     // Catch:{ Exception -> 0x0903 }
            java.lang.Class r11 = p000.C0389dn.m1512a(r11, r13)     // Catch:{ Exception -> 0x0903 }
            java.lang.String r13 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0903 }
            r14 = 1
            java.lang.Class[] r14 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0903 }
            r23 = 0
            r14[r23] = r8     // Catch:{ Exception -> 0x0903 }
            java.lang.reflect.Method r13 = r10.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x0903 }
            r30 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r30)     // Catch:{ Exception -> 0x0903 }
            r23 = r7
            r7 = 1
            r32 = r15
            java.lang.Class[] r15 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0901 }
            r33 = 0
            r15[r33] = r11     // Catch:{ Exception -> 0x0901 }
            java.lang.reflect.Method r11 = r10.getDeclaredMethod(r14, r15)     // Catch:{ Exception -> 0x0901 }
            r14 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x0901 }
            java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0901 }
            r14[r33] = r6     // Catch:{ Exception -> 0x0901 }
            java.lang.reflect.Method r1 = r10.getDeclaredMethod(r1, r14)     // Catch:{ Exception -> 0x0901 }
            r14 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x0901 }
            java.lang.Class[] r15 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0901 }
            r15[r33] = r6     // Catch:{ Exception -> 0x0901 }
            java.lang.reflect.Method r10 = r10.getDeclaredMethod(r14, r15)     // Catch:{ Exception -> 0x0901 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0901 }
            java.lang.String r15 = p000.C0200av.m970a(r37)     // Catch:{ Exception -> 0x0901 }
            r14[r33] = r15     // Catch:{ Exception -> 0x0901 }
            r15 = 0
            java.lang.Object r13 = r13.invoke(r15, r14)     // Catch:{ Exception -> 0x0901 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0901 }
            java.lang.Object r15 = r9.f1831e     // Catch:{ Exception -> 0x0901 }
            r14[r33] = r15     // Catch:{ Exception -> 0x0901 }
            r11.invoke(r13, r14)     // Catch:{ Exception -> 0x0901 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0901 }
            r11[r33] = r0     // Catch:{ Exception -> 0x0901 }
            r1.invoke(r13, r11)     // Catch:{ Exception -> 0x0901 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0901 }
            r0[r33] = r12     // Catch:{ Exception -> 0x0901 }
            java.lang.Object r0 = r10.invoke(r13, r0)     // Catch:{ Exception -> 0x0901 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0901 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0901 }
            if (r0 != 0) goto L_0x08e7
            r0 = 1
            goto L_0x08e8
        L_0x08e7:
            r0 = 0
        L_0x08e8:
            r10 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x0901 }
            r10 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x0901 }
            if (r0 == 0) goto L_0x08fd
            r10 = r16
            goto L_0x08ff
        L_0x08fd:
            r10 = r32
        L_0x08ff:
            r11 = r10
            goto L_0x0919
        L_0x0901:
            r0 = move-exception
            goto L_0x0906
        L_0x0903:
            r0 = move-exception
            r23 = r7
        L_0x0906:
            java.lang.String r1 = p000.C0200av.m970a(r24)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r10 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r10, r7, r0, r1)
            r11 = r16
        L_0x0919:
            boolean r0 = r11.booleanValue()
            if (r0 == 0) goto L_0x093a
            r0 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x0a3f
        L_0x093a:
            java.lang.String r0 = r9.f1827a
            byte[] r0 = r0.getBytes()
            go r1 = p000.C0433ep.f2034f
            go r7 = p000.C0433ep.f2036h
            go r10 = p000.C0433ep.f2038j
            r15 = r10
            r10 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r13 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r10, r13, r12)
            java.lang.String r10 = p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x09fc }
            java.lang.ClassLoader r11 = r8.getClassLoader()     // Catch:{ Exception -> 0x09fc }
            java.lang.Class r10 = p000.C0389dn.m1512a(r10, r11)     // Catch:{ Exception -> 0x09fc }
            java.lang.String r11 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x09fc }
            java.lang.ClassLoader r13 = r8.getClassLoader()     // Catch:{ Exception -> 0x09fc }
            java.lang.Class r11 = p000.C0389dn.m1512a(r11, r13)     // Catch:{ Exception -> 0x09fc }
            java.lang.String r13 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x09fc }
            r14 = 1
            java.lang.Class[] r14 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x09fc }
            r16 = 0
            r14[r16] = r8     // Catch:{ Exception -> 0x09fc }
            java.lang.reflect.Method r8 = r10.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x09fc }
            r13 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x09fc }
            r14 = 1
            r17 = r1
            java.lang.Class[] r1 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x09fc }
            r1[r16] = r11     // Catch:{ Exception -> 0x09fc }
            java.lang.reflect.Method r1 = r10.getDeclaredMethod(r13, r1)     // Catch:{ Exception -> 0x09fc }
            r18 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x09fc }
            java.lang.Class[] r13 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x09fc }
            r13[r16] = r6     // Catch:{ Exception -> 0x09fc }
            java.lang.reflect.Method r11 = r10.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x09fc }
            r18 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x09fc }
            r18 = r7
            java.lang.Class[] r7 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x09fc }
            r7[r16] = r6     // Catch:{ Exception -> 0x09fc }
            java.lang.reflect.Method r6 = r10.getDeclaredMethod(r13, r7)     // Catch:{ Exception -> 0x09fc }
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x09fc }
            java.lang.String r10 = p000.C0200av.m970a(r37)     // Catch:{ Exception -> 0x09fc }
            r7[r16] = r10     // Catch:{ Exception -> 0x09fc }
            r10 = 0
            java.lang.Object r7 = r8.invoke(r10, r7)     // Catch:{ Exception -> 0x09fc }
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x09fc }
            java.lang.Object r10 = r9.f1831e     // Catch:{ Exception -> 0x09fc }
            r8[r16] = r10     // Catch:{ Exception -> 0x09fc }
            r1.invoke(r7, r8)     // Catch:{ Exception -> 0x09fc }
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x09fc }
            r1[r16] = r0     // Catch:{ Exception -> 0x09fc }
            r11.invoke(r7, r1)     // Catch:{ Exception -> 0x09fc }
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x09fc }
            r0[r16] = r12     // Catch:{ Exception -> 0x09fc }
            java.lang.Object r0 = r6.invoke(r7, r0)     // Catch:{ Exception -> 0x09fc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x09fc }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x09fc }
            if (r0 != 0) goto L_0x09e2
            r0 = 1
            goto L_0x09e3
        L_0x09e2:
            r0 = 0
        L_0x09e3:
            r6 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ Exception -> 0x09fc }
            r6 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ Exception -> 0x09fc }
            if (r0 == 0) goto L_0x09f8
            r1 = r18
            goto L_0x09fa
        L_0x09f8:
            r1 = r17
        L_0x09fa:
            r0 = r1
            goto L_0x0a0f
        L_0x09fc:
            r0 = move-exception
            java.lang.String r1 = p000.C0200av.m970a(r24)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r7, r6, r0, r1)
            r0 = r15
        L_0x0a0f:
            go r1 = p000.C0433ep.f2036h
            if (r0 != r1) goto L_0x0a23
            r6 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
        L_0x0a23:
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            goto L_0x0a3f
        L_0x0a29:
            r23 = r7
            p000.C0200av.m970a(r24)
            r0 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0a3f:
            go r1 = p000.C0433ep.f2034f
            if (r0 == r1) goto L_0x0a4a
            go r1 = p000.C0433ep.f2029a
            if (r0 != r1) goto L_0x0a48
            goto L_0x0a4a
        L_0x0a48:
            r0 = 0
            goto L_0x0a4b
        L_0x0a4a:
            r0 = 1
        L_0x0a4b:
            if (r0 == 0) goto L_0x0a50
            goto L_0x0a70
        L_0x0a4e:
            r23 = r7
        L_0x0a50:
            boolean r0 = p000.C0851mu.m2546a(r49)
            if (r0 == 0) goto L_0x0a57
            goto L_0x0a70
        L_0x0a57:
            r0 = -87590246372524(0xffffb0564e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r0)
            r6 = -87654670881964(0xffffb0474e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r6)
            p000.C0550gu.m1822d(r0, r1)
            r7 = 0
            goto L_0x0a72
        L_0x0a6e:
            r23 = r7
        L_0x0a70:
            r7 = r23
        L_0x0a72:
            boolean r0 = p000.C0697ju.m2179b(r49)
            if (r0 != 0) goto L_0x0a7b
            if (r4 != r2) goto L_0x0a7b
            return
        L_0x0a7b:
            if (r7 == 0) goto L_0x0aa3
            so r0 = p000.C0728kh.m2299o(r49, r50, r51)
            int r1 = r0.ordinal()
            if (r1 == 0) goto L_0x0aa3
            r2 = 10
            if (r1 == r2) goto L_0x0a8c
            goto L_0x0a92
        L_0x0a8c:
            so r0 = r50.mo2806a()
            if (r5 == 0) goto L_0x0a9a
        L_0x0a92:
            r1 = r48
            r2 = r52
            r1.mo2535j(r3, r0, r2)
            goto L_0x0aa1
        L_0x0a9a:
            r1 = r48
            r2 = r52
            r1.mo2536l(r3, r0, r2)
        L_0x0aa1:
            r0 = 1
            goto L_0x0aab
        L_0x0aa3:
            r1 = r48
            r2 = r52
            m1391n(r49)
            r0 = 0
        L_0x0aab:
            if (r0 != 0) goto L_0x0ab0
            r52.finish()
        L_0x0ab0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver.mo2537m(android.content.Context, fo, boolean, android.content.BroadcastReceiver$PendingResult):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x041b, code lost:
        m1390k(r1, r5, r0, (android.content.BroadcastReceiver.PendingResult) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x043c, code lost:
        if (r19.getAction().equals(p000.C0200av.m970a(-83007516267692L)) == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x043e, code lost:
        r0 = p000.C0697ju.f2933a;
        r0 = p000.C0697ju.m2192o(r5, p000.C0200av.m970a(-106835994825900L), 0);
        p000.C0697ju.m2174C(r5, p000.C0200av.m970a(-106964843844780L), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x045b, code lost:
        if (r0 == 0) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x045d, code lost:
        if (r0 == 1) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x045f, code lost:
        if (r0 == 2) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0461, code lost:
        if (r0 == 3) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0463, code lost:
        if (r0 == 4) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0467, code lost:
        p000.C0550gu.m1820b("LAS Migration", "Migrating from 0");
        p000.C0697ju.m2202y(r5, p000.C0200av.m970a(-109911191409836L), false);
        r0 = p000.C0697ju.m2180c(r5, p000.C0200av.m970a(-107832427238572L), false);
        r6 = !r0;
        p000.C0697ju.m2202y(r5, p000.C0200av.m970a(-110542551602348L), r6);
        p000.C0550gu.m1820b("LAS Migration", "doNotMute was " + r0 + ", setting mute speaker to: " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x04af, code lost:
        p000.C0550gu.m1820b("LAS Migration", "Migrating from 1");
        r0 = p000.C0851mu.f3325a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x04c1, code lost:
        if (java.lang.System.currentTimeMillis() >= 1588291200000L) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x04c7, code lost:
        if (p000.C0697ju.m2178a(r5) != false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x04cd, code lost:
        if (p000.C0697ju.m2199v(r5) == false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04d0, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04d1, code lost:
        if (r14 == false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x04d3, code lost:
        p000.C0200av.m970a(-127889924510892L);
        p000.C0200av.m970a(-127902809412780L);
        r6 = p000.C0200av.m970a(-128014478562476L);
        r0 = p000.C0200av.m970a(-128160507450540L);
        r7 = p000.C0748ku.f3081a;
        r0 = p000.C0279ch.m1106c(r0);
        r0.append(p000.C0200av.m970a(-117921305416876L));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x050e, code lost:
        if (p000.C0391dp.f1915a != null) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0510, code lost:
        p000.C0391dp.f1915a = android.provider.Settings.Secure.getString(r5.getContentResolver(), p000.C0200av.m970a(-70479096665260L));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0525, code lost:
        if (p000.C0391dp.f1915a != null) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0527, code lost:
        p000.C0391dp.f1915a = p000.C0200av.m970a(-70526341305516L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x052d, code lost:
        r0.append(p000.C0391dp.f1915a);
        r0.append(p000.C0200av.m970a(-117934190318764L));
        r7 = r0.toString();
        r0 = p000.C1425yo.f5206a;
        r12 = p000.C0200av.m970a(-118015794697388L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r0 = p000.C0194ap.m964a(p000.C0200av.m970a(-118063039337644L));
        r14 = java.security.Signature.getInstance(p000.C0200av.m970a(-121726646441132L));
        r14.initSign(r0);
        r14.update(r7.getBytes());
        r12 = android.util.Base64.encodeToString(r14.sign(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x057a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x057b, code lost:
        p000.C0200av.m970a(-122134668334252L);
        p000.C0200av.m970a(-122147553236140L);
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x058f, code lost:
        p000.C0200av.m970a(-122031589119148L);
        r14 = -122044474021036L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x059d, code lost:
        p000.C0200av.m970a(-121902740100268L);
        r14 = -121915625002156L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x05ab, code lost:
        p000.C0200av.m970a(-121778186048684L);
        r14 = -121791070950572L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x05b8, code lost:
        p000.C0200av.m970a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x06df, code lost:
        p000.C0200av.m970a(-128306536338604L);
        p000.C0200av.m970a(-128319421240492L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0272, code lost:
        r3.append(p000.C0200av.m970a(r4));
        r3.append(r0);
        p000.C0550gu.m1819a(r2, r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0288, code lost:
        mo2537m(r5, r3, r13, (android.content.BroadcastReceiver.PendingResult) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r18, android.content.Intent r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            fo r0 = p000.C0489fo.USB
            fo r3 = p000.C0489fo.WIRED_HEADPHONE
            so r4 = p000.C1129so.HEADPHONES
            android.content.Context r5 = r18.getApplicationContext()
            if (r2 == 0) goto L_0x0779
            java.lang.String r6 = r19.getAction()
            if (r6 != 0) goto L_0x0018
            goto L_0x0779
        L_0x0018:
            boolean r6 = f1741d
            if (r6 != 0) goto L_0x0037
            boolean r6 = m1381a(r1, r5)
            if (r6 != 0) goto L_0x0037
            r6 = -79163520537772(0xffffb8004e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r6)
            r7 = -79227945047212(0xffffb7f14e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r7)
            p000.C0550gu.m1820b(r6, r7)
        L_0x0037:
            java.lang.String r6 = r19.getAction()
            int r7 = r6.hashCode()
            r8 = 2
            r9 = -1
            r10 = 3
            r11 = 4
            r12 = 5
            r13 = 0
            r14 = 1
            switch(r7) {
                case -2114103349: goto L_0x0180;
                case -1955011497: goto L_0x016f;
                case -1931133476: goto L_0x015e;
                case -1676458352: goto L_0x014c;
                case -1608292967: goto L_0x013a;
                case -1290021075: goto L_0x0129;
                case -549244379: goto L_0x0117;
                case -216149461: goto L_0x0104;
                case 263851463: goto L_0x00f2;
                case 264168609: goto L_0x00e0;
                case 545516589: goto L_0x00cd;
                case 685340858: goto L_0x00ba;
                case 798292259: goto L_0x00a8;
                case 1244161670: goto L_0x0095;
                case 1342430171: goto L_0x0082;
                case 1737074039: goto L_0x0070;
                case 1853590790: goto L_0x005e;
                case 1889301123: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0192
        L_0x004b:
            r15 = -81263759545516(0xffffb6174e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 10
            goto L_0x0193
        L_0x005e:
            r15 = -80263032165548(0xffffb7004e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 4
            goto L_0x0193
        L_0x0070:
            r15 = -79734751188140(0xffffb77b4e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 1
            goto L_0x0193
        L_0x0082:
            r15 = -82182882546860(0xffffb5414e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 15
            goto L_0x0193
        L_0x0095:
            r15 = -82672508818604(0xffffb4cf4e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 17
            goto L_0x0193
        L_0x00a8:
            r15 = -79575837398188(0xffffb7a04e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 0
            goto L_0x0193
        L_0x00ba:
            r15 = -80898687325356(0xffffb66c4e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 8
            goto L_0x0193
        L_0x00cd:
            r15 = -82389040977068(0xffffb5114e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 16
            goto L_0x0193
        L_0x00e0:
            r15 = -80744068502700(0xffffb6904e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 7
            goto L_0x0193
        L_0x00f2:
            r15 = -80589449680044(0xffffb6b44e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 6
            goto L_0x0193
        L_0x0104:
            r15 = -81061896082604(0xffffb6464e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 9
            goto L_0x0193
        L_0x0117:
            r15 = -81469917975724(0xffffb5e74e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 11
            goto L_0x0193
        L_0x0129:
            r15 = -80082643539116(0xffffb72a4e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 3
            goto L_0x0193
        L_0x013a:
            r15 = -81826400261292(0xffffb5944e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 13
            goto L_0x0193
        L_0x014c:
            r15 = -82032558691500(0xffffb5644e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 14
            goto L_0x0193
        L_0x015e:
            r15 = -80439125824684(0xffffb6d74e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 5
            goto L_0x0193
        L_0x016f:
            r15 = -79915139814572(0xffffb7514e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 2
            goto L_0x0193
        L_0x0180:
            r15 = -81620241831084(0xffffb5c44e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r15)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            r6 = 12
            goto L_0x0193
        L_0x0192:
            r6 = -1
        L_0x0193:
            r15 = -110353573041324(0xffff9ba24e7aab54, double:NaN)
            r7 = 0
            switch(r6) {
                case 0: goto L_0x0420;
                case 1: goto L_0x042b;
                case 2: goto L_0x0409;
                case 3: goto L_0x03f4;
                case 4: goto L_0x03e1;
                case 5: goto L_0x03ce;
                case 6: goto L_0x03bb;
                case 7: goto L_0x03a8;
                case 8: goto L_0x0395;
                case 9: goto L_0x037a;
                case 10: goto L_0x035f;
                case 11: goto L_0x0325;
                case 12: goto L_0x02d9;
                case 13: goto L_0x028d;
                case 14: goto L_0x0223;
                case 15: goto L_0x0212;
                case 16: goto L_0x01b1;
                case 17: goto L_0x01b1;
                default: goto L_0x019c;
            }
        L_0x019c:
            r3 = -85485712397484(0xffffb2404e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
            r3 = -85550136906924(0xffffb2314e7aab54, double:NaN)
            p000.C0200av.m970a(r3)
            r19.getAction()
            goto L_0x0779
        L_0x01b1:
            boolean r0 = p000.C0697ju.m2179b(r5)
            if (r0 != 0) goto L_0x01b8
            return
        L_0x01b8:
            r3 = -84918776714412(0xffffb2c44e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            int r0 = r2.getIntExtra(r0, r9)
            r3 = -85081985471660(0xffffb29e4e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r19.getAction()
            r4.append(r2)
            r9 = -85146409981100(0xffffb28f4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r9)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = r4.toString()
            p000.C0550gu.m1820b(r3, r2)
            if (r0 == 0) goto L_0x0208
            if (r0 == r8) goto L_0x0208
            r2 = -85189359654060(0xffffb2854e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = -85253784163500(0xffffb2764e7aab54, double:NaN)
            goto L_0x0272
        L_0x0208:
            fo r2 = p000.C0489fo.BLUETOOTH
            if (r0 != r8) goto L_0x020d
            r13 = 1
        L_0x020d:
            r1.mo2537m(r5, r2, r13, r7)
            goto L_0x0779
        L_0x0212:
            r8 = -84854352204972(0xffffb2d34e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r8)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            goto L_0x0288
        L_0x0223:
            r10 = -84446330311852(0xffffb3324e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r10)
            int r0 = r2.getIntExtra(r0, r9)
            r8 = -84472100115628(0xffffb32c4e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r8)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r19.getAction()
            r6.append(r2)
            r8 = -84536524625068(0xffffb31d4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r8)
            r6.append(r2)
            r6.append(r0)
            java.lang.String r2 = r6.toString()
            p000.C0550gu.m1820b(r4, r2)
            if (r0 == 0) goto L_0x0285
            if (r0 == r14) goto L_0x0285
            r2 = -84579474298028(0xffffb3134e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = -84643898807468(0xffffb3044e7aab54, double:NaN)
        L_0x0272:
            java.lang.String r4 = p000.C0200av.m970a(r4)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.C0550gu.m1819a(r2, r0)
            goto L_0x0779
        L_0x0285:
            if (r0 != r14) goto L_0x0288
            r13 = 1
        L_0x0288:
            r1.mo2537m(r5, r3, r13, r7)
            goto L_0x0779
        L_0x028d:
            r3 = -84308891358380(0xffffb3524e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r19.getAction()
            r4.append(r6)
            r8 = -84373315867820(0xffffb3434e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r8)
            r4.append(r6)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            p000.C0550gu.m1820b(r3, r4)
            boolean r3 = p000.C0697ju.m2200w(r5)
            if (r3 != 0) goto L_0x02bf
            return
        L_0x02bf:
            r3 = -84416265540780(0xffffb3394e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            android.hardware.usb.UsbDevice r2 = (android.hardware.usb.UsbDevice) r2
            boolean r2 = p000.C0728kh.m2303s(r2)
            if (r2 == 0) goto L_0x0779
            r1.mo2537m(r5, r0, r13, r7)
            goto L_0x0779
        L_0x02d9:
            r3 = -84171452404908(0xffffb3724e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r19.getAction()
            r4.append(r6)
            r8 = -84235876914348(0xffffb3634e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r8)
            r4.append(r6)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            p000.C0550gu.m1820b(r3, r4)
            boolean r3 = p000.C0697ju.m2200w(r5)
            if (r3 != 0) goto L_0x030b
            return
        L_0x030b:
            r3 = -84278826587308(0xffffb3594e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            android.hardware.usb.UsbDevice r2 = (android.hardware.usb.UsbDevice) r2
            boolean r2 = p000.C0728kh.m2303s(r2)
            if (r2 == 0) goto L_0x0779
            r1.mo2537m(r5, r0, r14, r7)
            goto L_0x0779
        L_0x0325:
            nu r0 = p000.C0936oo.f3508c
            boolean r0 = r0.f3432f
            if (r0 == 0) goto L_0x0348
            r2 = -83832149988524(0xffffb3c14e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r2)
            r2 = -83896574497964(0xffffb3b24e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            p000.C0550gu.m1820b(r0, r2)
            long r2 = java.lang.System.currentTimeMillis()
            f1740c = r2
            goto L_0x0779
        L_0x0348:
            r2 = -84055488287916(0xffffb38d4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r2)
            r2 = -84119912797356(0xffffb37e4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            p000.C0550gu.m1820b(r0, r2)
            goto L_0x0779
        L_0x035f:
            r3 = -83767725479084(0xffffb3d04e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            iu$a r0 = p000.C0697ju.f2933a
            java.lang.String r0 = p000.C0200av.m970a(r15)
            p000.C0697ju.m2202y(r5, r0, r13)
            goto L_0x0776
        L_0x037a:
            r3 = -83703300969644(0xffffb3df4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            iu$a r0 = p000.C0697ju.f2933a
            java.lang.String r0 = p000.C0200av.m970a(r15)
            p000.C0697ju.m2202y(r5, r0, r14)
            goto L_0x0776
        L_0x0395:
            r3 = -83638876460204(0xffffb3ee4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            so r0 = p000.C1129so.UNMUTE
            goto L_0x041b
        L_0x03a8:
            r3 = -83574451950764(0xffffb3fd4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            so r0 = p000.C1129so.MUTE
            goto L_0x041b
        L_0x03bb:
            r3 = -83510027441324(0xffffb40c4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            so r0 = p000.C1129so.CAST
            goto L_0x041b
        L_0x03ce:
            r3 = -83445602931884(0xffffb41b4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            so r0 = p000.C1129so.USB
            goto L_0x041b
        L_0x03e1:
            r3 = -83381178422444(0xffffb42a4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            so r0 = p000.C1129so.BLUETOOTH
            goto L_0x041b
        L_0x03f4:
            r8 = -83316753913004(0xffffb4394e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r8)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            m1390k(r1, r5, r4, r7)
            goto L_0x0779
        L_0x0409:
            r3 = -83252329403564(0xffffb4484e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
            so r0 = p000.C1129so.SPEAKER
        L_0x041b:
            m1390k(r1, r5, r0, r7)
            goto L_0x0779
        L_0x0420:
            r6 = -82943091758252(0xffffb4904e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r19.getAction()
        L_0x042b:
            java.lang.String r0 = r19.getAction()
            r6 = -83007516267692(0xffffb4814e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r6)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0766
            iu$a r0 = p000.C0697ju.f2933a
            r6 = -106835994825900(0xffff9ed54e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            int r0 = p000.C0697ju.m2192o(r5, r0, r13)
            r6 = -106964843844780(0xffff9eb74e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r6)
            p000.C0697ju.m2174C(r5, r3, r12)
            java.lang.String r3 = "LAS Migration"
            if (r0 == 0) goto L_0x0467
            if (r0 == r14) goto L_0x04af
            if (r0 == r8) goto L_0x06ef
            if (r0 == r10) goto L_0x0708
            if (r0 == r11) goto L_0x0739
            goto L_0x0766
        L_0x0467:
            java.lang.String r0 = "Migrating from 0"
            p000.C0550gu.m1820b(r3, r0)
            r6 = -109911191409836(0xffff9c094e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            p000.C0697ju.m2202y(r5, r0, r13)
            r6 = -107832427238572(0xffff9ded4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            boolean r0 = p000.C0697ju.m2180c(r5, r0, r13)
            r6 = r0 ^ 1
            r7 = -110542551602348(0xffff9b764e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r7)
            p000.C0697ju.m2202y(r5, r7, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "doNotMute was "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = ", setting mute speaker to: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            p000.C0550gu.m1820b(r3, r0)
        L_0x04af:
            java.lang.String r0 = "Migrating from 1"
            p000.C0550gu.m1820b(r3, r0)
            int r0 = p000.C0851mu.f3325a
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 1588291200000(0x171cd886400, double:7.84720117512E-312)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x04d0
            boolean r0 = p000.C0697ju.m2178a(r5)
            if (r0 != 0) goto L_0x04d1
            boolean r0 = p000.C0697ju.m2199v(r5)
            if (r0 == 0) goto L_0x04d0
            goto L_0x04d1
        L_0x04d0:
            r14 = 0
        L_0x04d1:
            if (r14 == 0) goto L_0x06df
            r6 = -127889924510892(0xffff8baf4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -127902809412780(0xffff8bac4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -128014478562476(0xffff8b924e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r6)
            r7 = -128160507450540(0xffff8b704e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r7)
            int r7 = p000.C0748ku.f3081a
            java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
            r7 = -117921305416876(0xffff94c04e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r7)
            r0.append(r7)
            java.lang.String r7 = p000.C0391dp.f1915a
            r8 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            if (r7 != 0) goto L_0x051e
            android.content.ContentResolver r7 = r5.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r8)
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r10)
            p000.C0391dp.f1915a = r7
        L_0x051e:
            java.lang.String r7 = p000.C0391dp.f1915a
            r10 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            if (r7 != 0) goto L_0x052d
            java.lang.String r7 = p000.C0200av.m970a(r10)
            p000.C0391dp.f1915a = r7
        L_0x052d:
            java.lang.String r7 = p000.C0391dp.f1915a
            r0.append(r7)
            r14 = -117934190318764(0xffff94bd4e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r14)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            int r0 = p000.C1425yo.f5206a
            r14 = -118015794697388(0xffff94aa4e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r14)
            r14 = -118063039337644(0xffff949f4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r14)     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            java.security.PrivateKey r0 = p000.C0194ap.m964a(r0)     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            r14 = -121726646441132(0xffff914a4e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            java.security.Signature r14 = java.security.Signature.getInstance(r14)     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            r14.initSign(r0)     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            byte[] r0 = r7.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            r14.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            byte[] r0 = r14.sign()     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            java.lang.String r12 = android.util.Base64.encodeToString(r0, r13)     // Catch:{ NoSuchAlgorithmException -> 0x05ab, InvalidKeyException -> 0x059d, SignatureException -> 0x058f, Exception -> 0x057a }
            goto L_0x05bb
        L_0x057a:
            r0 = move-exception
            r14 = -122134668334252(0xffff90eb4e7aab54, double:NaN)
            p000.C0200av.m970a(r14)
            r14 = -122147553236140(0xffff90e84e7aab54, double:NaN)
            p000.C0200av.m970a(r14)
            r0.printStackTrace()
            goto L_0x05bb
        L_0x058f:
            r14 = -122031589119148(0xffff91034e7aab54, double:NaN)
            p000.C0200av.m970a(r14)
            r14 = -122044474021036(0xffff91004e7aab54, double:NaN)
            goto L_0x05b8
        L_0x059d:
            r14 = -121902740100268(0xffff91214e7aab54, double:NaN)
            p000.C0200av.m970a(r14)
            r14 = -121915625002156(0xffff911e4e7aab54, double:NaN)
            goto L_0x05b8
        L_0x05ab:
            r14 = -121778186048684(0xffff913e4e7aab54, double:NaN)
            p000.C0200av.m970a(r14)
            r14 = -121791070950572(0xffff913b4e7aab54, double:NaN)
        L_0x05b8:
            p000.C0200av.m970a(r14)
        L_0x05bb:
            java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r7)
            r14 = -37729971033260(0xffffddaf4e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)
            r0.append(r14)
            r0.append(r12)
            r14 = -37798690509996(0xffffdd9f4e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)
            r0.append(r14)
            java.lang.String r14 = p000.C0391dp.f1915a
            if (r14 != 0) goto L_0x05ec
            android.content.ContentResolver r14 = r5.getContentResolver()
            java.lang.String r15 = p000.C0200av.m970a(r8)
            java.lang.String r14 = android.provider.Settings.Secure.getString(r14, r15)
            p000.C0391dp.f1915a = r14
        L_0x05ec:
            java.lang.String r14 = p000.C0391dp.f1915a
            if (r14 != 0) goto L_0x05f6
            java.lang.String r14 = p000.C0200av.m970a(r10)
            p000.C0391dp.f1915a = r14
        L_0x05f6:
            java.lang.String r14 = p000.C0391dp.f1915a
            r0.append(r14)
            r14 = -37867409986732(0xffffdd8f4e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)
            r0.append(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            r14.append(r12)
            java.lang.String r7 = p000.C0391dp.f1915a
            if (r7 != 0) goto L_0x0624
            android.content.ContentResolver r7 = r5.getContentResolver()
            java.lang.String r12 = p000.C0200av.m970a(r8)
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r12)
            p000.C0391dp.f1915a = r7
        L_0x0624:
            java.lang.String r7 = p000.C0391dp.f1915a
            if (r7 != 0) goto L_0x062e
            java.lang.String r7 = p000.C0200av.m970a(r10)
            p000.C0391dp.f1915a = r7
        L_0x062e:
            java.lang.String r7 = p000.C0391dp.f1915a
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            int r7 = r7.hashCode()
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            r0.append(r7)
            int r6 = r6.hashCode()
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x06c7
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x0658
            goto L_0x06c7
        L_0x0658:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x0661
            byte[] r0 = new byte[r13]
            goto L_0x0672
        L_0x0661:
            int r7 = android.os.Build.VERSION.SDK_INT
            r12 = 19
            if (r7 < r12) goto L_0x066e
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r7)
            goto L_0x0672
        L_0x066e:
            byte[] r0 = r0.getBytes()
        L_0x0672:
            java.lang.String r7 = p000.C0391dp.f1915a
            if (r7 != 0) goto L_0x0684
            android.content.ContentResolver r7 = r5.getContentResolver()
            java.lang.String r8 = p000.C0200av.m970a(r8)
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)
            p000.C0391dp.f1915a = r7
        L_0x0684:
            java.lang.String r7 = p000.C0391dp.f1915a
            if (r7 != 0) goto L_0x068e
            java.lang.String r7 = p000.C0200av.m970a(r10)
            p000.C0391dp.f1915a = r7
        L_0x068e:
            java.lang.String r7 = p000.C0391dp.f1915a
            if (r7 == 0) goto L_0x069f
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x069f
            int r7 = r7.hashCode()
            byte r7 = (byte) r7
            if (r7 != 0) goto L_0x06a0
        L_0x069f:
            r7 = 5
        L_0x06a0:
            p000.C0495fu.m1724a(r0)
            int r8 = r0.length
            byte[] r8 = new byte[r8]
            r9 = 0
        L_0x06a7:
            int r10 = r0.length
            if (r9 >= r10) goto L_0x06c0
            byte r10 = r0[r9]
            int r10 = r10 + r7
            r11 = 127(0x7f, float:1.78E-43)
            if (r10 <= r11) goto L_0x06b4
            int r10 = r10 + -256
            goto L_0x06ba
        L_0x06b4:
            r11 = -128(0xffffffffffffff80, float:NaN)
            if (r10 >= r11) goto L_0x06ba
            int r10 = r10 + 256
        L_0x06ba:
            byte r10 = (byte) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x06a7
        L_0x06c0:
            p000.C0495fu.m1724a(r8)
            java.lang.String r0 = android.util.Base64.encodeToString(r8, r13)
        L_0x06c7:
            r7 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r7)
            android.content.SharedPreferences r7 = r5.getSharedPreferences(r7, r13)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r7.putString(r6, r0)
            r7.apply()
            goto L_0x06ef
        L_0x06df:
            r6 = -128306536338604(0xffff8b4e4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
            r6 = -128319421240492(0xffff8b4b4e7aab54, double:NaN)
            p000.C0200av.m970a(r6)
        L_0x06ef:
            java.lang.String r0 = "Migrating from 2"
            p000.C0550gu.m1820b(r3, r0)
            boolean r0 = p000.C0697ju.m2199v(r5)
            if (r0 == 0) goto L_0x0708
            java.lang.String r0 = "Restore last on boot enabled, will set from last output."
            p000.C0550gu.m1820b(r3, r0)
            so r0 = p000.C0697ju.m2193p(r5)
            java.lang.String r6 = "on_boot_action"
            p000.C0728kh.m2280I(r5, r6, r0)
        L_0x0708:
            java.lang.String r0 = "Migrating from 3"
            p000.C0550gu.m1820b(r3, r0)
            java.lang.String r0 = "pref_force_mic"
            boolean r0 = p000.C0697ju.m2201x(r5, r0)
            if (r0 != 0) goto L_0x0721
            r6 = -111500329309356(0xffff9a974e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            p000.C0697ju.m2202y(r5, r0, r13)
        L_0x0721:
            boolean r0 = p000.C0697ju.m2186i(r5)
            if (r0 == 0) goto L_0x0739
            ro r0 = p000.C0697ju.m2191n(r5)
            ro r6 = p000.C1072ro.AUTO
            if (r0 != r6) goto L_0x0739
            java.lang.String r0 = "Input mode for headset was auto on migration, will set to wired headset"
            p000.C0550gu.m1820b(r3, r0)
            ro r0 = p000.C1072ro.WIRED_HEADSET
            p000.C0697ju.m2173B(r5, r4, r0)
        L_0x0739:
            java.lang.String r0 = "Migrating from 4"
            p000.C0550gu.m1820b(r3, r0)
            java.lang.String r0 = "pref_usb_mode"
            boolean r0 = p000.C0697ju.m2201x(r5, r0)
            if (r0 != 0) goto L_0x0752
            r3 = -108330643444908(0xffff9d794e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            p000.C0697ju.m2202y(r5, r0, r13)
        L_0x0752:
            java.lang.String r0 = "pref_bluetooth_mode"
            boolean r0 = p000.C0697ju.m2201x(r5, r0)
            if (r0 != 0) goto L_0x0766
            r3 = -108184614556844(0xffff9d9b4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            p000.C0697ju.m2202y(r5, r0, r13)
        L_0x0766:
            r3 = -83187904894124(0xffffb4574e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)
            java.lang.String r2 = r19.getAction()
            p000.C0550gu.m1820b(r0, r2)
        L_0x0776:
            p000.C0728kh.m2282K(r5, r13)
        L_0x0779:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
