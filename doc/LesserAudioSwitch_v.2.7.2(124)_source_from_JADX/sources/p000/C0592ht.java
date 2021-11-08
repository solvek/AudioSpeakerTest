package p000;

import android.content.Context;
import com.nordskog.LesserAudioSwitch.p002ui.WidgetConfigActivity;
import p000.C0235bt;

/* renamed from: ht */
public class C0592ht implements C0235bt.C0241f {

    /* renamed from: a */
    public final /* synthetic */ Context f2502a;

    /* renamed from: b */
    public final /* synthetic */ WidgetConfigActivity f2503b;

    public C0592ht(WidgetConfigActivity widgetConfigActivity, Context context) {
        this.f2503b = widgetConfigActivity;
        this.f2502a = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1620a() {
        /*
            r27 = this;
            r1 = r27
            android.content.Context r0 = r1.f2502a
            java.lang.String r2 = p000.C1384xo.f5119a
            int r3 = p000.C1425yo.f5206a
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            r4 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)
            r5 = 0
            java.lang.String r2 = r3.getString(r2, r5)
            r3 = 2
            r5 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r7 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r9 = 1
            if (r2 == 0) goto L_0x00df
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x0039
            goto L_0x00df
        L_0x0039:
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x0041
            goto L_0x00ae
        L_0x0041:
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0057
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r7)
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r10)
            p000.C0391dp.f1915a = r0
        L_0x0057:
            java.lang.String r0 = p000.C0391dp.f1915a
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r0
        L_0x0061:
            java.lang.String r0 = p000.C0391dp.f1915a
            r10 = 5
            if (r0 == 0) goto L_0x0075
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L_0x0075
            int r0 = r0.hashCode()
            byte r0 = (byte) r0
            if (r0 != 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            int r10 = r10 * -1
            byte r0 = (byte) r10
            p000.C0495fu.m1724a(r2)
            int r10 = r2.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x007f:
            int r12 = r2.length
            if (r11 >= r12) goto L_0x0098
            byte r12 = r2[r11]
            int r12 = r12 + r0
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x008c
            int r12 = r12 + -256
            goto L_0x0092
        L_0x008c:
            r13 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r13) goto L_0x0092
            int r12 = r12 + 256
        L_0x0092:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x007f
        L_0x0098:
            p000.C0495fu.m1724a(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r0 < r2) goto L_0x00a9
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r10, r0)
            goto L_0x00ae
        L_0x00a9:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r10)
        L_0x00ae:
            r10 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r10)
            java.lang.String[] r0 = r2.split(r0)
            int r2 = r0.length
            r10 = 4
            if (r2 == r10) goto L_0x00cc
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00eb
        L_0x00cc:
            cp r2 = new cp
            r18 = r0[r4]
            r19 = r0[r9]
            r20 = r0[r3]
            r9 = 3
            r21 = r0[r9]
            go r22 = p000.C0433ep.f2029a
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00ec
        L_0x00df:
            cp r0 = new cp
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            go r14 = p000.C0433ep.f2035g
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x00eb:
            r2 = r0
        L_0x00ec:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r2.f1827a
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f9
            goto L_0x0116
        L_0x00f9:
            java.lang.String r0 = r2.f1828b
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0104
            goto L_0x0116
        L_0x0104:
            java.lang.String r0 = r2.f1829c
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010f
            goto L_0x0116
        L_0x010f:
            java.lang.Object r0 = r2.f1831e
            if (r0 != 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r0 = 1
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            r9 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r11 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x012c
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            r0 = 0
            goto L_0x015b
        L_0x012c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r2.f1827a
            r0.append(r13)
            java.lang.String r13 = r2.f1828b
            r0.append(r13)
            java.lang.String r13 = r2.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r13)
            java.lang.String r13 = r2.f1830d
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x014f
            p000.C0200av.m970a(r11)
            p000.C0200av.m970a(r9)
        L_0x014f:
            if (r0 == 0) goto L_0x0154
            go r13 = p000.C0433ep.f2039k
            goto L_0x0156
        L_0x0154:
            go r13 = p000.C0433ep.f2031c
        L_0x0156:
            java.lang.String.valueOf(r13)
            r2.f1832f = r13
        L_0x015b:
            if (r0 == 0) goto L_0x045f
            android.content.Context r0 = r1.f2502a
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            java.lang.Class<byte[]> r14 = byte[].class
            java.lang.String r15 = r2.f1827a
            if (r15 == 0) goto L_0x018b
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x016e
            goto L_0x018b
        L_0x016e:
            java.lang.String r15 = r2.f1828b
            if (r15 == 0) goto L_0x018b
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x0179
            goto L_0x018b
        L_0x0179:
            java.lang.String r15 = r2.f1829c
            if (r15 == 0) goto L_0x018b
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x0184
            goto L_0x018b
        L_0x0184:
            java.lang.Object r15 = r2.f1831e
            if (r15 != 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            r15 = 1
            goto L_0x018c
        L_0x018b:
            r15 = 0
        L_0x018c:
            if (r15 != 0) goto L_0x0197
            go r9 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r9)
            r2.f1832f = r9
            r9 = 0
            goto L_0x01c7
        L_0x0197:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r3 = r2.f1827a
            r15.append(r3)
            java.lang.String r3 = r2.f1828b
            r15.append(r3)
            java.lang.String r3 = r2.f1829c
            java.lang.String r3 = p000.C0279ch.m1122s(r15, r3)
            java.lang.String r15 = r2.f1830d
            boolean r3 = r3.equals(r15)
            if (r3 != 0) goto L_0x01ba
            p000.C0200av.m970a(r11)
            p000.C0200av.m970a(r9)
        L_0x01ba:
            if (r3 == 0) goto L_0x01bf
            go r9 = p000.C0433ep.f2039k
            goto L_0x01c1
        L_0x01bf:
            go r9 = p000.C0433ep.f2031c
        L_0x01c1:
            java.lang.String.valueOf(r9)
            r2.f1832f = r9
            r9 = r3
        L_0x01c7:
            if (r9 != 0) goto L_0x01cd
            go r0 = r2.f1832f
            goto L_0x0453
        L_0x01cd:
            java.lang.String r3 = r2.f1829c
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x01e1
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r7 = p000.C0200av.m970a(r7)
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r7)
            p000.C0391dp.f1915a = r0
        L_0x01e1:
            java.lang.String r0 = p000.C0391dp.f1915a
            if (r0 != 0) goto L_0x01eb
            java.lang.String r0 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r0
        L_0x01eb:
            java.lang.String r0 = p000.C0391dp.f1915a
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x020e
            r5 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
            r5 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x0453
        L_0x020e:
            java.lang.String r0 = r2.f1828b
            java.lang.Class r3 = p000.C1228uu.f4686b
            byte[] r3 = new byte[r4]
            java.lang.reflect.Method r5 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x022b }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x022b }
            r6[r4] = r0     // Catch:{ Exception -> 0x022b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x022b }
            r7 = 1
            r6[r7] = r0     // Catch:{ Exception -> 0x022b }
            r0 = 0
            java.lang.Object r0 = r5.invoke(r0, r6)     // Catch:{ Exception -> 0x022b }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x022b }
            r3 = r0
            goto L_0x0242
        L_0x022b:
            r0 = move-exception
            r5 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r7, r6, r0, r5)
        L_0x0242:
            if (r3 == 0) goto L_0x043a
            int r0 = r3.length
            if (r0 != 0) goto L_0x0249
            goto L_0x043a
        L_0x0249:
            int r0 = p000.C1136su.f4328a
            r5 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r9 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r7, r9, r3)
            r11 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r15 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r17 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r21 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r23 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r25 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            java.lang.String r7 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x031f }
            java.lang.ClassLoader r8 = r13.getClassLoader()     // Catch:{ Exception -> 0x031f }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x031f }
            java.lang.String r8 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x031f }
            java.lang.ClassLoader r9 = r13.getClassLoader()     // Catch:{ Exception -> 0x031f }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r9)     // Catch:{ Exception -> 0x031f }
            java.lang.String r9 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x031f }
            r10 = 1
            java.lang.Class[] r15 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x031f }
            r15[r4] = r13     // Catch:{ Exception -> 0x031f }
            java.lang.reflect.Method r9 = r7.getDeclaredMethod(r9, r15)     // Catch:{ Exception -> 0x031f }
            java.lang.String r15 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x031f }
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x031f }
            r11[r4] = r8     // Catch:{ Exception -> 0x031f }
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r15, r11)     // Catch:{ Exception -> 0x031f }
            r11 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x031f }
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x031f }
            r11[r4] = r14     // Catch:{ Exception -> 0x031f }
            java.lang.reflect.Method r11 = r7.getDeclaredMethod(r15, r11)     // Catch:{ Exception -> 0x031f }
            r15 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x031f }
            java.lang.Class[] r15 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x031f }
            r15[r4] = r14     // Catch:{ Exception -> 0x031f }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r12, r15)     // Catch:{ Exception -> 0x031f }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x031f }
            r15 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x031f }
            r12[r4] = r15     // Catch:{ Exception -> 0x031f }
            r15 = 0
            java.lang.Object r9 = r9.invoke(r15, r12)     // Catch:{ Exception -> 0x031f }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x031f }
            java.lang.Object r15 = r2.f1831e     // Catch:{ Exception -> 0x031f }
            r12[r4] = r15     // Catch:{ Exception -> 0x031f }
            r8.invoke(r9, r12)     // Catch:{ Exception -> 0x031f }
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x031f }
            r8[r4] = r0     // Catch:{ Exception -> 0x031f }
            r11.invoke(r9, r8)     // Catch:{ Exception -> 0x031f }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x031f }
            r0[r4] = r3     // Catch:{ Exception -> 0x031f }
            java.lang.Object r0 = r7.invoke(r9, r0)     // Catch:{ Exception -> 0x031f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x031f }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x031f }
            if (r0 != 0) goto L_0x030e
            r0 = 1
            goto L_0x030f
        L_0x030e:
            r0 = 0
        L_0x030f:
            r7 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r7)     // Catch:{ Exception -> 0x031f }
            p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x031f }
            if (r0 == 0) goto L_0x031d
            r5 = r6
        L_0x031d:
            r6 = r5
            goto L_0x0331
        L_0x031f:
            r0 = move-exception
            java.lang.String r5 = p000.C0200av.m970a(r21)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r7, r0, r5)
        L_0x0331:
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x0352
            r5 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
            r5 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x0453
        L_0x0352:
            java.lang.String r0 = r2.f1827a
            byte[] r0 = r0.getBytes()
            go r5 = p000.C0433ep.f2034f
            go r6 = p000.C0433ep.f2036h
            go r7 = p000.C0433ep.f2038j
            r8 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r8, r10, r3)
            java.lang.String r8 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x040d }
            java.lang.ClassLoader r9 = r13.getClassLoader()     // Catch:{ Exception -> 0x040d }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r9)     // Catch:{ Exception -> 0x040d }
            java.lang.String r9 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x040d }
            java.lang.ClassLoader r10 = r13.getClassLoader()     // Catch:{ Exception -> 0x040d }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r10)     // Catch:{ Exception -> 0x040d }
            r10 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x040d }
            r11 = 1
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x040d }
            r12[r4] = r13     // Catch:{ Exception -> 0x040d }
            java.lang.reflect.Method r10 = r8.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x040d }
            r12 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x040d }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x040d }
            r13[r4] = r9     // Catch:{ Exception -> 0x040d }
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x040d }
            r12 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x040d }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x040d }
            r13[r4] = r14     // Catch:{ Exception -> 0x040d }
            java.lang.reflect.Method r12 = r8.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x040d }
            r15 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x040d }
            java.lang.Class[] r15 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x040d }
            r15[r4] = r14     // Catch:{ Exception -> 0x040d }
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r13, r15)     // Catch:{ Exception -> 0x040d }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x040d }
            r14 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x040d }
            r13[r4] = r14     // Catch:{ Exception -> 0x040d }
            r14 = 0
            java.lang.Object r10 = r10.invoke(r14, r13)     // Catch:{ Exception -> 0x040d }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x040d }
            java.lang.Object r14 = r2.f1831e     // Catch:{ Exception -> 0x040d }
            r13[r4] = r14     // Catch:{ Exception -> 0x040d }
            r9.invoke(r10, r13)     // Catch:{ Exception -> 0x040d }
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x040d }
            r9[r4] = r0     // Catch:{ Exception -> 0x040d }
            r12.invoke(r10, r9)     // Catch:{ Exception -> 0x040d }
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x040d }
            r0[r4] = r3     // Catch:{ Exception -> 0x040d }
            java.lang.Object r0 = r8.invoke(r10, r0)     // Catch:{ Exception -> 0x040d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x040d }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x040d }
            if (r0 != 0) goto L_0x03fc
            r0 = 1
            goto L_0x03fd
        L_0x03fc:
            r0 = 0
        L_0x03fd:
            r8 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r8)     // Catch:{ Exception -> 0x040d }
            p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x040d }
            if (r0 == 0) goto L_0x040b
            r5 = r6
        L_0x040b:
            r0 = r5
            goto L_0x0420
        L_0x040d:
            r0 = move-exception
            java.lang.String r3 = p000.C0200av.m970a(r21)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r8 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r5, r0, r3)
            r0 = r7
        L_0x0420:
            go r3 = p000.C0433ep.f2036h
            if (r0 != r3) goto L_0x0434
            r5 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
            r5 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
        L_0x0434:
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            goto L_0x0453
        L_0x043a:
            r5 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
            r5 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r5)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r2.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0453:
            go r2 = p000.C0433ep.f2034f
            if (r0 == r2) goto L_0x045b
            go r2 = p000.C0433ep.f2029a
            if (r0 != r2) goto L_0x045c
        L_0x045b:
            r4 = 1
        L_0x045c:
            if (r4 == 0) goto L_0x045f
            goto L_0x0464
        L_0x045f:
            com.nordskog.LesserAudioSwitch.ui.WidgetConfigActivity r0 = r1.f2503b
            r0.finish()
        L_0x0464:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0592ht.mo1620a():void");
    }
}
