package p000;

import android.bluetooth.BluetoothProfile;
import p000.C0353cu;

/* renamed from: io */
public class C0646io implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f2761a;

    /* renamed from: b */
    public final /* synthetic */ C0353cu.C0354a f2762b;

    /* renamed from: c */
    public final /* synthetic */ C0735ko f2763c;

    public C0646io(C0735ko koVar, boolean z, C0353cu.C0354a aVar) {
        this.f2763c = koVar;
        this.f2761a = z;
        this.f2762b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0095=Splitter:B:25:0x0095, B:49:0x0146=Splitter:B:49:0x0146} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onServiceConnected(int r21, android.bluetooth.BluetoothProfile r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r5 = r2
            android.bluetooth.BluetoothA2dp r5 = (android.bluetooth.BluetoothA2dp) r5     // Catch:{ all -> 0x01fa }
            ko r0 = r1.f2763c     // Catch:{ all -> 0x01fa }
            r0.getClass()     // Catch:{ all -> 0x01fa }
            go r0 = p000.C0544go.f2384l     // Catch:{ all -> 0x01fa }
            fo r0 = p000.C0489fo.BLUETOOTH     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = p000.C0432eo.m1607b(r0)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x001a
            goto L_0x0023
        L_0x001a:
            r6 = -22762010006700(0xffffeb4c4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)     // Catch:{ all -> 0x01fa }
        L_0x0023:
            r6 = -25386235024556(0xffffe8e94e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ all -> 0x01fa }
            r6 = -25416299795628(0xffffe8e24e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ all -> 0x01fa }
            r6 = 0
            boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x01fa }
            if (r7 != 0) goto L_0x0057
            android.bluetooth.BluetoothAdapter r7 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0043 }
            android.bluetooth.BluetoothDevice r6 = r7.getRemoteDevice(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0057
        L_0x0043:
            r0 = move-exception
            r7 = -25583803520172(0xffffe8bb4e7aab54, double:NaN)
            p000.C0200av.m970a(r7)     // Catch:{ all -> 0x01fa }
            r7 = -25613868291244(0xffffe8b44e7aab54, double:NaN)
            p000.C0200av.m970a(r7)     // Catch:{ all -> 0x01fa }
            r0.printStackTrace()     // Catch:{ all -> 0x01fa }
        L_0x0057:
            boolean r0 = r1.f2761a     // Catch:{ all -> 0x01fa }
            r7 = 2
            r8 = -24991098033324(0xffffe9454e7aab54, double:NaN)
            r10 = 29
            java.lang.String r11 = "XIAOMI"
            r16 = -25119947052204(0xffffe9274e7aab54, double:NaN)
            r14 = 1
            if (r0 == 0) goto L_0x011c
            java.lang.Class<android.bluetooth.BluetoothA2dp> r0 = android.bluetooth.BluetoothA2dp.class
            r18 = -25304630645932(0xffffe8fc4e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r18)     // Catch:{ Exception -> 0x0090 }
            java.lang.Class[] r12 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0090 }
            java.lang.Class<android.bluetooth.BluetoothDevice> r13 = android.bluetooth.BluetoothDevice.class
            r12[r4] = r13     // Catch:{ Exception -> 0x0090 }
            java.lang.reflect.Method r0 = r0.getMethod(r15, r12)     // Catch:{ Exception -> 0x0090 }
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0090 }
            r12[r4] = r6     // Catch:{ Exception -> 0x0090 }
            java.lang.Object r0 = r0.invoke(r5, r12)     // Catch:{ Exception -> 0x0090 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0090 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0090 }
            r12 = r0
            goto L_0x0095
        L_0x0090:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x01fa }
            r12 = 0
        L_0x0095:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x01f7 }
            boolean r0 = r0.equalsIgnoreCase(r11)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x01c8
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01f7 }
            if (r0 < r10) goto L_0x00a3
            r0 = 1
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            if (r0 == 0) goto L_0x01c8
            r10 = -15069723579564(0xfffff24b4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x01f7 }
            r10 = -15099788350636(0xfffff2444e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x01f7 }
            p000.C0550gu.m1820b(r0, r10)     // Catch:{ all -> 0x01f7 }
            r0 = 100
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            java.lang.String r8 = p000.C0200av.m970a(r8)     // Catch:{ Exception -> 0x0106 }
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0106 }
            r9[r4] = r3     // Catch:{ Exception -> 0x0106 }
            java.lang.Class<java.lang.Class[]> r3 = java.lang.Class[].class
            r9[r14] = r3     // Catch:{ Exception -> 0x0106 }
            java.lang.reflect.Method r3 = r10.getMethod(r8, r9)     // Catch:{ Exception -> 0x0106 }
            java.lang.Class<android.bluetooth.BluetoothA2dp> r8 = android.bluetooth.BluetoothA2dp.class
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0106 }
            r10 = -25068407444652(0xffffe9334e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ Exception -> 0x0106 }
            r9[r4] = r10     // Catch:{ Exception -> 0x0106 }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0106 }
            java.lang.Class<android.bluetooth.BluetoothDevice> r11 = android.bluetooth.BluetoothDevice.class
            r10[r4] = r11     // Catch:{ Exception -> 0x0106 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0106 }
            r10[r14] = r11     // Catch:{ Exception -> 0x0106 }
            r9[r14] = r10     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r3 = r3.invoke(r8, r9)     // Catch:{ Exception -> 0x0106 }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ Exception -> 0x0106 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0106 }
            r7[r4] = r6     // Catch:{ Exception -> 0x0106 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0106 }
            r7[r14] = r0     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r0 = r3.invoke(r5, r7)     // Catch:{ Exception -> 0x0106 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0106 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0106 }
            goto L_0x01b3
        L_0x0106:
            r0 = move-exception
            java.lang.String r3 = p000.C0200av.m970a(r16)     // Catch:{ all -> 0x01f7 }
            r5 = -25150011823276(0xffffe9204e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x01f7 }
            p000.C0550gu.m1819a(r3, r5)     // Catch:{ all -> 0x01f7 }
        L_0x0117:
            p000.C0550gu.m1821c(r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x01c9
        L_0x011c:
            java.lang.Class<android.bluetooth.BluetoothA2dp> r0 = android.bluetooth.BluetoothA2dp.class
            r12 = -25338990384300(0xffffe8f44e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0141 }
            java.lang.Class[] r13 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0141 }
            java.lang.Class<android.bluetooth.BluetoothDevice> r15 = android.bluetooth.BluetoothDevice.class
            r13[r4] = r15     // Catch:{ Exception -> 0x0141 }
            java.lang.reflect.Method r0 = r0.getMethod(r12, r13)     // Catch:{ Exception -> 0x0141 }
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0141 }
            r12[r4] = r6     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r0 = r0.invoke(r5, r12)     // Catch:{ Exception -> 0x0141 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0141 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0141 }
            r12 = r0
            goto L_0x0146
        L_0x0141:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x01fa }
            r12 = 0
        L_0x0146:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x01f7 }
            boolean r0 = r0.equalsIgnoreCase(r11)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x01c8
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01f7 }
            if (r0 < r10) goto L_0x0154
            r0 = 1
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            if (r0 == 0) goto L_0x01c8
            r10 = -15310241748140(0xfffff2134e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x01f7 }
            r10 = -15340306519212(0xfffff20c4e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x01f7 }
            p000.C0550gu.m1820b(r0, r10)     // Catch:{ all -> 0x01f7 }
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r8 = p000.C0200av.m970a(r8)     // Catch:{ Exception -> 0x01b5 }
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x01b5 }
            r9[r4] = r3     // Catch:{ Exception -> 0x01b5 }
            java.lang.Class<java.lang.Class[]> r3 = java.lang.Class[].class
            r9[r14] = r3     // Catch:{ Exception -> 0x01b5 }
            java.lang.reflect.Method r0 = r0.getMethod(r8, r9)     // Catch:{ Exception -> 0x01b5 }
            java.lang.Class<android.bluetooth.BluetoothA2dp> r3 = android.bluetooth.BluetoothA2dp.class
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01b5 }
            r9 = -25068407444652(0xffffe9334e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)     // Catch:{ Exception -> 0x01b5 }
            r8[r4] = r9     // Catch:{ Exception -> 0x01b5 }
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x01b5 }
            java.lang.Class<android.bluetooth.BluetoothDevice> r10 = android.bluetooth.BluetoothDevice.class
            r9[r4] = r10     // Catch:{ Exception -> 0x01b5 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x01b5 }
            r9[r14] = r10     // Catch:{ Exception -> 0x01b5 }
            r8[r14] = r9     // Catch:{ Exception -> 0x01b5 }
            java.lang.Object r0 = r0.invoke(r3, r8)     // Catch:{ Exception -> 0x01b5 }
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch:{ Exception -> 0x01b5 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01b5 }
            r3[r4] = r6     // Catch:{ Exception -> 0x01b5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01b5 }
            r3[r14] = r6     // Catch:{ Exception -> 0x01b5 }
            java.lang.Object r0 = r0.invoke(r5, r3)     // Catch:{ Exception -> 0x01b5 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x01b5 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x01b5 }
        L_0x01b3:
            r4 = r0
            goto L_0x01c9
        L_0x01b5:
            r0 = move-exception
            java.lang.String r3 = p000.C0200av.m970a(r16)     // Catch:{ all -> 0x01f7 }
            r5 = -25150011823276(0xffffe9204e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x01f7 }
            p000.C0550gu.m1819a(r3, r5)     // Catch:{ all -> 0x01f7 }
            goto L_0x0117
        L_0x01c8:
            r4 = r12
        L_0x01c9:
            r5 = -15542169982124(0xfffff1dd4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r3.<init>()     // Catch:{ all -> 0x01fa }
            r5 = -15572234753196(0xfffff1d64e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x01fa }
            r3.append(r5)     // Catch:{ all -> 0x01fa }
            r3.append(r4)     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01fa }
            p000.C0550gu.m1820b(r0, r3)     // Catch:{ all -> 0x01fa }
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ all -> 0x01fa }
            r3 = r21
            r0.closeProfileProxy(r3, r2)     // Catch:{ all -> 0x01fa }
            goto L_0x0216
        L_0x01f7:
            r0 = move-exception
            r4 = r12
            goto L_0x01fb
        L_0x01fa:
            r0 = move-exception
        L_0x01fb:
            r2 = -15696788804780(0xfffff1b94e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            r5 = -15726853575852(0xfffff1b24e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r5)
            p000.C0550gu.m1819a(r2, r3)
            p000.C0550gu.m1821c(r0)
            r0.printStackTrace()
        L_0x0216:
            cu$a r0 = r1.f2762b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.mo2596a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0646io.onServiceConnected(int, android.bluetooth.BluetoothProfile):void");
    }

    public void onServiceDisconnected(int i) {
    }
}
