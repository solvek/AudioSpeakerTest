package com.nordskog.LesserAudioSwitch.p002ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.WidgetConfigActivity */
public class WidgetConfigActivity extends C0947p {

    /* renamed from: r */
    public static final int[] f1807r = {R.drawable.switch_vector_cute_mute, R.drawable.switch_vector_cute_speakers, R.drawable.switch_vector_cute_headphones, R.drawable.switch_vector_cute_bluetooth, R.drawable.switch_vector_cute_usb, R.drawable.switch_vector_cute_cast, R.drawable.switch_vector_cute_default};

    /* renamed from: s */
    public static final int[] f1808s = {R.drawable.switch_vector_boring_mute, R.drawable.switch_vector_boring_speakers, R.drawable.switch_vector_boring_headphones, R.drawable.switch_vector_boring_bluetooth, R.drawable.switch_vector_boring_usb, R.drawable.switch_vector_boring_cast, R.drawable.switch_vector_boring_unmute};

    /* renamed from: t */
    public static final int[] f1809t = {R.string.action_output_mute, R.string.action_output_speaker, R.string.action_output_headphones, R.string.action_output_bluetooth, R.string.action_output_usb, R.string.action_output_cast, R.string.action_output_unmute};

    /* renamed from: o */
    public int f1810o = 0;

    /* renamed from: p */
    public boolean f1811p = false;

    /* renamed from: q */
    public Set<Integer> f1812q = new HashSet();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r1 = r32
            super.onCreate(r33)
            android.content.Context r0 = r32.getApplicationContext()
            iu$a r2 = p000.C0697ju.f2933a
            r2 = -106964843844780(0xffff9eb74e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            r3 = 5
            p000.C0697ju.m2174C(r0, r2, r3)
            r0 = 2131427359(0x7f0b001f, float:1.8476332E38)
            r1.setContentView((int) r0)
            android.content.Intent r0 = r32.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r2 = 0
            if (r0 == 0) goto L_0x0031
            java.lang.String r4 = "appWidgetId"
            int r0 = r0.getInt(r4, r2)
            r1.f1810o = r0
        L_0x0031:
            int r0 = r1.f1810o
            if (r0 != 0) goto L_0x0039
            r32.finish()
            return
        L_0x0039:
            android.content.Context r0 = r32.getApplicationContext()
            boolean r0 = p000.C0728kh.m2286b(r0)
            if (r0 != 0) goto L_0x0059
            r0 = 2131231191(0x7f0801d7, float:1.8078456E38)
            android.view.View r0 = r1.findViewById(r0)
            r4 = 2131231194(0x7f0801da, float:1.8078462E38)
            android.view.View r4 = r1.findViewById(r4)
            r5 = 8
            r0.setVisibility(r5)
            r4.setVisibility(r5)
        L_0x0059:
            r0 = 2131231187(0x7f0801d3, float:1.8078448E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r4 = 2131231186(0x7f0801d2, float:1.8078446E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            os r5 = new os
            r5.<init>(r1)
            r0.setOnClickListener(r5)
            ns r0 = new ns
            r0.<init>(r1)
            r4.setOnClickListener(r0)
            r0 = 2131231188(0x7f0801d4, float:1.807845E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            ms r4 = new ms
            r4.<init>(r1)
            r0.setOnClickListener(r4)
            java.util.Set<java.lang.Integer> r0 = r1.f1812q
            r4 = 2131231192(0x7f0801d8, float:1.8078458E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            java.util.Set<java.lang.Integer> r0 = r1.f1812q
            r4 = 2131231190(0x7f0801d6, float:1.8078454E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r32.mo2585v()
            java.lang.String r0 = p000.C1384xo.f5119a
            int r4 = p000.C1425yo.f5206a
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r4 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r4)
            android.content.SharedPreferences r4 = r1.getSharedPreferences(r4, r2)
            r5 = 0
            java.lang.String r0 = r4.getString(r0, r5)
            r4 = 2
            r5 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r7 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r9 = 1
            if (r0 == 0) goto L_0x0180
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x00db
            goto L_0x0180
        L_0x00db:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x00e3
            goto L_0x014f
        L_0x00e3:
            byte[] r0 = android.util.Base64.decode(r0, r2)
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x00f9
            android.content.ContentResolver r10 = r32.getContentResolver()
            java.lang.String r11 = p000.C0200av.m970a(r7)
            java.lang.String r10 = android.provider.Settings.Secure.getString(r10, r11)
            p000.C0391dp.f1915a = r10
        L_0x00f9:
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0103
            java.lang.String r10 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r10
        L_0x0103:
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 == 0) goto L_0x0116
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x0116
            int r10 = r10.hashCode()
            byte r10 = (byte) r10
            if (r10 != 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r3 = r10
        L_0x0116:
            int r3 = r3 * -1
            byte r3 = (byte) r3
            p000.C0495fu.m1724a(r0)
            int r10 = r0.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x0120:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x0139
            byte r12 = r0[r11]
            int r12 = r12 + r3
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x012d
            int r12 = r12 + -256
            goto L_0x0133
        L_0x012d:
            r13 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r13) goto L_0x0133
            int r12 = r12 + 256
        L_0x0133:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0120
        L_0x0139:
            p000.C0495fu.m1724a(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r0 < r3) goto L_0x014a
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r10, r3)
            goto L_0x014f
        L_0x014a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x014f:
            r10 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r10)
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            r10 = 4
            if (r3 == r10) goto L_0x016d
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x018c
        L_0x016d:
            cp r3 = new cp
            r18 = r0[r2]
            r19 = r0[r9]
            r20 = r0[r4]
            r10 = 3
            r21 = r0[r10]
            go r22 = p000.C0433ep.f2029a
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x018d
        L_0x0180:
            cp r0 = new cp
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            go r15 = p000.C0433ep.f2035g
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x018c:
            r3 = r0
        L_0x018d:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r3.f1827a
            if (r0 == 0) goto L_0x01b7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x019a
            goto L_0x01b7
        L_0x019a:
            java.lang.String r0 = r3.f1828b
            if (r0 == 0) goto L_0x01b7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a5
            goto L_0x01b7
        L_0x01a5:
            java.lang.String r0 = r3.f1829c
            if (r0 == 0) goto L_0x01b7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b0
            goto L_0x01b7
        L_0x01b0:
            java.lang.Object r0 = r3.f1831e
            if (r0 != 0) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            r0 = 1
            goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            r10 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x01cd
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            r0 = 0
            goto L_0x01fc
        L_0x01cd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r3.f1827a
            r0.append(r14)
            java.lang.String r14 = r3.f1828b
            r0.append(r14)
            java.lang.String r14 = r3.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r14)
            java.lang.String r14 = r3.f1830d
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x01f0
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x01f0:
            if (r0 == 0) goto L_0x01f5
            go r14 = p000.C0433ep.f2039k
            goto L_0x01f7
        L_0x01f5:
            go r14 = p000.C0433ep.f2031c
        L_0x01f7:
            java.lang.String.valueOf(r14)
            r3.f1832f = r14
        L_0x01fc:
            if (r0 == 0) goto L_0x04ed
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r3.f1827a
            if (r0 == 0) goto L_0x022a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x020d
            goto L_0x022a
        L_0x020d:
            java.lang.String r0 = r3.f1828b
            if (r0 == 0) goto L_0x022a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0218
            goto L_0x022a
        L_0x0218:
            java.lang.String r0 = r3.f1829c
            if (r0 == 0) goto L_0x022a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0223
            goto L_0x022a
        L_0x0223:
            java.lang.Object r0 = r3.f1831e
            if (r0 != 0) goto L_0x0228
            goto L_0x022a
        L_0x0228:
            r0 = 1
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            if (r0 != 0) goto L_0x0236
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            r0 = 0
            goto L_0x0265
        L_0x0236:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r3.f1827a
            r0.append(r9)
            java.lang.String r9 = r3.f1828b
            r0.append(r9)
            java.lang.String r9 = r3.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r9)
            java.lang.String r9 = r3.f1830d
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0259
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x0259:
            if (r0 == 0) goto L_0x025e
            go r9 = p000.C0433ep.f2039k
            goto L_0x0260
        L_0x025e:
            go r9 = p000.C0433ep.f2031c
        L_0x0260:
            java.lang.String.valueOf(r9)
            r3.f1832f = r9
        L_0x0265:
            if (r0 != 0) goto L_0x026b
            go r0 = r3.f1832f
            goto L_0x04e1
        L_0x026b:
            java.lang.String r0 = r3.f1829c
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x027f
            android.content.ContentResolver r9 = r32.getContentResolver()
            java.lang.String r7 = p000.C0200av.m970a(r7)
            java.lang.String r7 = android.provider.Settings.Secure.getString(r9, r7)
            p000.C0391dp.f1915a = r7
        L_0x027f:
            java.lang.String r7 = p000.C0391dp.f1915a
            if (r7 != 0) goto L_0x0289
            java.lang.String r5 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r5
        L_0x0289:
            java.lang.String r5 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02ac
            r4 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x04e1
        L_0x02ac:
            java.lang.String r0 = r3.f1828b
            java.lang.Class r5 = p000.C1228uu.f4686b
            byte[] r5 = new byte[r2]
            java.lang.reflect.Method r6 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x02c8 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02c8 }
            r4[r2] = r0     // Catch:{ Exception -> 0x02c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02c8 }
            r7 = 1
            r4[r7] = r0     // Catch:{ Exception -> 0x02c8 }
            r0 = 0
            java.lang.Object r0 = r6.invoke(r0, r4)     // Catch:{ Exception -> 0x02c8 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x02c8 }
            r5 = r0
            goto L_0x02df
        L_0x02c8:
            r0 = move-exception
            r6 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r7, r6, r0, r4)
        L_0x02df:
            if (r5 == 0) goto L_0x04c8
            int r0 = r5.length
            if (r0 != 0) goto L_0x02e6
            goto L_0x04c8
        L_0x02e6:
            int r0 = p000.C1136su.f4328a
            r6 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r9 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r7, r9, r5)
            r11 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r16 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r18 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r22 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r24 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r26 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            r28 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            r30 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x03bc }
            java.lang.ClassLoader r7 = r14.getClassLoader()     // Catch:{ Exception -> 0x03bc }
            java.lang.Class r7 = p000.C0389dn.m1512a(r13, r7)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r8 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x03bc }
            java.lang.ClassLoader r13 = r14.getClassLoader()     // Catch:{ Exception -> 0x03bc }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r13)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r13 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x03bc }
            r9 = 1
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03bc }
            r10[r2] = r14     // Catch:{ Exception -> 0x03bc }
            java.lang.reflect.Method r10 = r7.getDeclaredMethod(r13, r10)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r13 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x03bc }
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03bc }
            r11[r2] = r8     // Catch:{ Exception -> 0x03bc }
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r13, r11)     // Catch:{ Exception -> 0x03bc }
            r11 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x03bc }
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03bc }
            r11[r2] = r15     // Catch:{ Exception -> 0x03bc }
            java.lang.reflect.Method r11 = r7.getDeclaredMethod(r13, r11)     // Catch:{ Exception -> 0x03bc }
            r12 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x03bc }
            java.lang.Class[] r13 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03bc }
            r13[r2] = r15     // Catch:{ Exception -> 0x03bc }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x03bc }
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03bc }
            java.lang.String r13 = p000.C0200av.m970a(r30)     // Catch:{ Exception -> 0x03bc }
            r12[r2] = r13     // Catch:{ Exception -> 0x03bc }
            r13 = 0
            java.lang.Object r10 = r10.invoke(r13, r12)     // Catch:{ Exception -> 0x03bc }
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03bc }
            java.lang.Object r13 = r3.f1831e     // Catch:{ Exception -> 0x03bc }
            r12[r2] = r13     // Catch:{ Exception -> 0x03bc }
            r8.invoke(r10, r12)     // Catch:{ Exception -> 0x03bc }
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03bc }
            r8[r2] = r0     // Catch:{ Exception -> 0x03bc }
            r11.invoke(r10, r8)     // Catch:{ Exception -> 0x03bc }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03bc }
            r0[r2] = r5     // Catch:{ Exception -> 0x03bc }
            java.lang.Object r0 = r7.invoke(r10, r0)     // Catch:{ Exception -> 0x03bc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x03bc }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x03bc }
            if (r0 != 0) goto L_0x03b0
            r0 = 1
            goto L_0x03b1
        L_0x03b0:
            r0 = 0
        L_0x03b1:
            p000.C0200av.m970a(r28)     // Catch:{ Exception -> 0x03bc }
            p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x03bc }
            if (r0 == 0) goto L_0x03ba
            r4 = r6
        L_0x03ba:
            r6 = r4
            goto L_0x03ce
        L_0x03bc:
            r0 = move-exception
            java.lang.String r4 = p000.C0200av.m970a(r22)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r7, r0, r4)
        L_0x03ce:
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x03ef
            r4 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x04e1
        L_0x03ef:
            java.lang.String r0 = r3.f1827a
            byte[] r0 = r0.getBytes()
            go r4 = p000.C0433ep.f2034f
            go r6 = p000.C0433ep.f2036h
            go r7 = p000.C0433ep.f2038j
            r8 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r8, r10, r5)
            java.lang.String r8 = p000.C0200av.m970a(r24)     // Catch:{ Exception -> 0x049b }
            java.lang.ClassLoader r9 = r14.getClassLoader()     // Catch:{ Exception -> 0x049b }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r9)     // Catch:{ Exception -> 0x049b }
            java.lang.String r9 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x049b }
            java.lang.ClassLoader r10 = r14.getClassLoader()     // Catch:{ Exception -> 0x049b }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r10)     // Catch:{ Exception -> 0x049b }
            java.lang.String r10 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x049b }
            r11 = 1
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x049b }
            r12[r2] = r14     // Catch:{ Exception -> 0x049b }
            java.lang.reflect.Method r10 = r8.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x049b }
            r12 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x049b }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x049b }
            r13[r2] = r9     // Catch:{ Exception -> 0x049b }
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x049b }
            r12 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x049b }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x049b }
            r13[r2] = r15     // Catch:{ Exception -> 0x049b }
            java.lang.reflect.Method r12 = r8.getDeclaredMethod(r12, r13)     // Catch:{ Exception -> 0x049b }
            r13 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x049b }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x049b }
            r14[r2] = r15     // Catch:{ Exception -> 0x049b }
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x049b }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x049b }
            java.lang.String r14 = p000.C0200av.m970a(r30)     // Catch:{ Exception -> 0x049b }
            r13[r2] = r14     // Catch:{ Exception -> 0x049b }
            r14 = 0
            java.lang.Object r10 = r10.invoke(r14, r13)     // Catch:{ Exception -> 0x049b }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x049b }
            java.lang.Object r14 = r3.f1831e     // Catch:{ Exception -> 0x049b }
            r13[r2] = r14     // Catch:{ Exception -> 0x049b }
            r9.invoke(r10, r13)     // Catch:{ Exception -> 0x049b }
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x049b }
            r9[r2] = r0     // Catch:{ Exception -> 0x049b }
            r12.invoke(r10, r9)     // Catch:{ Exception -> 0x049b }
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x049b }
            r0[r2] = r5     // Catch:{ Exception -> 0x049b }
            java.lang.Object r0 = r8.invoke(r10, r0)     // Catch:{ Exception -> 0x049b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x049b }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x049b }
            if (r0 != 0) goto L_0x048f
            r0 = 1
            goto L_0x0490
        L_0x048f:
            r0 = 0
        L_0x0490:
            p000.C0200av.m970a(r28)     // Catch:{ Exception -> 0x049b }
            p000.C0200av.m970a(r26)     // Catch:{ Exception -> 0x049b }
            if (r0 == 0) goto L_0x0499
            r4 = r6
        L_0x0499:
            r0 = r4
            goto L_0x04ae
        L_0x049b:
            r0 = move-exception
            java.lang.String r4 = p000.C0200av.m970a(r22)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r8 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r5, r0, r4)
            r0 = r7
        L_0x04ae:
            go r4 = p000.C0433ep.f2036h
            if (r0 != r4) goto L_0x04c2
            r4 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
        L_0x04c2:
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            goto L_0x04e1
        L_0x04c8:
            r4 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x04e1:
            go r3 = p000.C0433ep.f2034f
            if (r0 == r3) goto L_0x04e9
            go r3 = p000.C0433ep.f2029a
            if (r0 != r3) goto L_0x04ea
        L_0x04e9:
            r2 = 1
        L_0x04ea:
            if (r2 == 0) goto L_0x04ed
            goto L_0x0506
        L_0x04ed:
            bt r0 = new bt
            r0.<init>()
            android.content.Context r2 = r32.getApplicationContext()
            ht r3 = new ht
            r3.<init>(r1, r2)
            r0.f1304o0 = r3
            ia r2 = r32.mo4865l()
            java.lang.String r3 = "w_pu"
            r0.mo4634A0(r2, r3)
        L_0x0506:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.p002ui.WidgetConfigActivity.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        C0690jn.f2922a = false;
    }

    public void onResume() {
        C0690jn.f2922a = true;
        super.onResume();
    }

    /* renamed from: u */
    public final void mo2584u(View view, boolean z) {
        ImageView imageView = (ImageView) view.findViewById(R.id.widget_button_image);
        if (z) {
            imageView.setImageState(new int[]{16842912}, false);
            this.f1812q.add(Integer.valueOf(view.getId()));
        } else {
            imageView.setImageState(new int[0], false);
            this.f1812q.remove(Integer.valueOf(view.getId()));
        }
        view.invalidate();
    }

    /* renamed from: v */
    public final void mo2585v() {
        int i = 0;
        while (true) {
            int[] iArr = C1478zu.f5370a;
            if (i < iArr.length) {
                View findViewById = findViewById(iArr[i]);
                int i2 = f1807r[i];
                int i3 = f1808s[i];
                int i4 = f1809t[i];
                findViewById.setOnClickListener(new C0549gt(this));
                ImageView imageView = (ImageView) findViewById.findViewById(R.id.widget_button_image);
                TextView textView = (TextView) findViewById.findViewById(R.id.widget_textview);
                if (this.f1811p) {
                    imageView.setImageResource(i3);
                } else {
                    imageView.setImageResource(i2);
                }
                textView.setText(i4);
                mo2584u(findViewById, this.f1812q.contains(Integer.valueOf(findViewById.getId())));
                i++;
            } else {
                return;
            }
        }
    }
}
