package com.nordskog.LesserAudioSwitch.quicksettingtile;

import android.os.Build;
import android.provider.Settings;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

public abstract class BaseTile extends TileService {

    /* renamed from: b */
    public C1129so f1745b = C1129so.DEFAULT;

    public static class BluetoothSwitchTile extends BaseTile {
        /* renamed from: a */
        public void mo2539a() {
            this.f1745b = C1129so.BLUETOOTH;
        }
    }

    public static class CastSwitchTile extends BaseTile {
        /* renamed from: a */
        public void mo2539a() {
            this.f1745b = C1129so.CAST;
        }
    }

    public static class HeadphoneseSwitchTile extends BaseTile {
        /* renamed from: a */
        public void mo2539a() {
            this.f1745b = C1129so.HEADPHONES;
        }
    }

    public static class MuteSwitchTile extends BaseTile {
        /* renamed from: a */
        public void mo2539a() {
            this.f1745b = C1129so.MUTE;
        }
    }

    public static class SpeakerSwitchTile extends BaseTile {
        /* renamed from: a */
        public void mo2539a() {
            this.f1745b = C1129so.SPEAKER;
        }
    }

    public static class USBSwitchTile extends BaseTile {
        /* renamed from: a */
        public void mo2539a() {
            this.f1745b = C1129so.USB;
        }
    }

    public static class UnmuteSwitchTile extends BaseTile {
        /* renamed from: a */
        public void mo2539a() {
            this.f1745b = C1129so.UNMUTE;
        }
    }

    public BaseTile() {
        mo2539a();
    }

    /* renamed from: a */
    public abstract void mo2539a();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick() {
        /*
            r31 = this;
            r1 = r31
            super.onClick()
            so r0 = r1.f1745b
            r0.toString()
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
            if (r0 == 0) goto L_0x00e5
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x003f
            goto L_0x00e5
        L_0x003f:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0047
            goto L_0x00b4
        L_0x0047:
            byte[] r0 = android.util.Base64.decode(r0, r3)
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x005d
            android.content.ContentResolver r9 = r31.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r6)
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r10)
            p000.C0391dp.f1915a = r9
        L_0x005d:
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x0067
            java.lang.String r9 = p000.C0200av.m970a(r4)
            p000.C0391dp.f1915a = r9
        L_0x0067:
            java.lang.String r9 = p000.C0391dp.f1915a
            r10 = 5
            if (r9 == 0) goto L_0x007b
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x007b
            int r9 = r9.hashCode()
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r10 = r9
        L_0x007b:
            int r10 = r10 * -1
            byte r9 = (byte) r10
            p000.C0495fu.m1724a(r0)
            int r10 = r0.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x0085:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x009e
            byte r12 = r0[r11]
            int r12 = r12 + r9
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x0092
            int r12 = r12 + -256
            goto L_0x0098
        L_0x0092:
            r13 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r13) goto L_0x0098
            int r12 = r12 + 256
        L_0x0098:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0085
        L_0x009e:
            p000.C0495fu.m1724a(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r9 = 19
            if (r0 < r9) goto L_0x00af
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r10, r9)
            goto L_0x00b4
        L_0x00af:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x00b4:
            r9 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            r10 = 4
            if (r9 == r10) goto L_0x00d2
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00f1
        L_0x00d2:
            cp r9 = new cp
            r18 = r0[r3]
            r19 = r0[r8]
            r20 = r0[r2]
            r10 = 3
            r21 = r0[r10]
            go r22 = p000.C0433ep.f2029a
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00f2
        L_0x00e5:
            cp r0 = new cp
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            go r15 = p000.C0433ep.f2035g
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x00f1:
            r9 = r0
        L_0x00f2:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x011c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ff
            goto L_0x011c
        L_0x00ff:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x011c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010a
            goto L_0x011c
        L_0x010a:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x011c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0115
            goto L_0x011c
        L_0x0115:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r0 = 1
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            r10 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x0132
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x0161
        L_0x0132:
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
            if (r0 != 0) goto L_0x0155
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            go r14 = p000.C0433ep.f2039k
            goto L_0x015c
        L_0x015a:
            go r14 = p000.C0433ep.f2031c
        L_0x015c:
            java.lang.String.valueOf(r14)
            r9.f1832f = r14
        L_0x0161:
            if (r0 == 0) goto L_0x0466
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x018f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0172
            goto L_0x018f
        L_0x0172:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x018f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017d
            goto L_0x018f
        L_0x017d:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x018f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0188
            goto L_0x018f
        L_0x0188:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r0 = 1
            goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            if (r0 != 0) goto L_0x019b
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x01ca
        L_0x019b:
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
            if (r0 != 0) goto L_0x01be
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x01be:
            if (r0 == 0) goto L_0x01c3
            go r8 = p000.C0433ep.f2039k
            goto L_0x01c5
        L_0x01c3:
            go r8 = p000.C0433ep.f2031c
        L_0x01c5:
            java.lang.String.valueOf(r8)
            r9.f1832f = r8
        L_0x01ca:
            if (r0 != 0) goto L_0x01d1
            go r0 = r9.f1832f
        L_0x01ce:
            r12 = 0
            goto L_0x0451
        L_0x01d1:
            java.lang.String r0 = r9.f1829c
            java.lang.String r8 = p000.C0391dp.f1915a
            if (r8 != 0) goto L_0x01e5
            android.content.ContentResolver r8 = r31.getContentResolver()
            java.lang.String r6 = p000.C0200av.m970a(r6)
            java.lang.String r6 = android.provider.Settings.Secure.getString(r8, r6)
            p000.C0391dp.f1915a = r6
        L_0x01e5:
            java.lang.String r6 = p000.C0391dp.f1915a
            if (r6 != 0) goto L_0x01ef
            java.lang.String r4 = p000.C0200av.m970a(r4)
            p000.C0391dp.f1915a = r4
        L_0x01ef:
            java.lang.String r4 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0211
            r4 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x01ce
        L_0x0211:
            java.lang.String r0 = r9.f1828b
            java.lang.Class r4 = p000.C1228uu.f4686b
            byte[] r4 = new byte[r3]
            java.lang.reflect.Method r5 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x022d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x022d }
            r2[r3] = r0     // Catch:{ Exception -> 0x022d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x022d }
            r6 = 1
            r2[r6] = r0     // Catch:{ Exception -> 0x022d }
            r0 = 0
            java.lang.Object r0 = r5.invoke(r0, r2)     // Catch:{ Exception -> 0x022d }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x022d }
            r4 = r0
            goto L_0x0244
        L_0x022d:
            r0 = move-exception
            r5 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r5, r0, r2)
        L_0x0244:
            if (r4 == 0) goto L_0x0437
            int r0 = r4.length
            if (r0 != 0) goto L_0x024b
            goto L_0x0437
        L_0x024b:
            int r0 = p000.C1136su.f4328a
            r5 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r4)
            r17 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r19 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r21 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r25 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r27 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r29 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0322 }
            java.lang.ClassLoader r6 = r14.getClassLoader()     // Catch:{ Exception -> 0x0322 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r8, r6)     // Catch:{ Exception -> 0x0322 }
            java.lang.String r7 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x0322 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0322 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0322 }
            java.lang.String r8 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0322 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0322 }
            r11[r3] = r14     // Catch:{ Exception -> 0x0322 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0322 }
            java.lang.String r11 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0322 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0322 }
            r12[r3] = r7     // Catch:{ Exception -> 0x0322 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0322 }
            r11 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0322 }
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0322 }
            r11[r3] = r15     // Catch:{ Exception -> 0x0322 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r13, r11)     // Catch:{ Exception -> 0x0322 }
            r12 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0322 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0322 }
            r13 = 0
            r12[r13] = r15     // Catch:{ Exception -> 0x0322 }
            java.lang.reflect.Method r3 = r6.getDeclaredMethod(r3, r12)     // Catch:{ Exception -> 0x0322 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0322 }
            r23 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x0322 }
            r6[r13] = r12     // Catch:{ Exception -> 0x0322 }
            r12 = 0
            java.lang.Object r6 = r8.invoke(r12, r6)     // Catch:{ Exception -> 0x0322 }
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0322 }
            java.lang.Object r12 = r9.f1831e     // Catch:{ Exception -> 0x0322 }
            r8[r13] = r12     // Catch:{ Exception -> 0x0322 }
            r7.invoke(r6, r8)     // Catch:{ Exception -> 0x0322 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0322 }
            r7[r13] = r0     // Catch:{ Exception -> 0x0322 }
            r11.invoke(r6, r7)     // Catch:{ Exception -> 0x0322 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0322 }
            r0[r13] = r4     // Catch:{ Exception -> 0x0322 }
            java.lang.Object r0 = r3.invoke(r6, r0)     // Catch:{ Exception -> 0x0322 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0322 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0322 }
            if (r0 != 0) goto L_0x0311
            r0 = 1
            goto L_0x0312
        L_0x0311:
            r0 = 0
        L_0x0312:
            r6 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ Exception -> 0x0322 }
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x0322 }
            if (r0 == 0) goto L_0x0320
            r2 = r5
        L_0x0320:
            r5 = r2
            goto L_0x0334
        L_0x0322:
            r0 = move-exception
            java.lang.String r2 = p000.C0200av.m970a(r25)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r3, r0, r2)
        L_0x0334:
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L_0x0355
            r2 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x01ce
        L_0x0355:
            java.lang.String r0 = r9.f1827a
            byte[] r0 = r0.getBytes()
            go r2 = p000.C0433ep.f2034f
            go r3 = p000.C0433ep.f2036h
            go r5 = p000.C0433ep.f2038j
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r4)
            java.lang.String r6 = p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0409 }
            java.lang.ClassLoader r7 = r14.getClassLoader()     // Catch:{ Exception -> 0x0409 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r6, r7)     // Catch:{ Exception -> 0x0409 }
            java.lang.String r7 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x0409 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0409 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0409 }
            java.lang.String r8 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0409 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0409 }
            r12 = 0
            r11[r12] = r14     // Catch:{ Exception -> 0x0407 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0407 }
            java.lang.String r11 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0407 }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0407 }
            r13[r12] = r7     // Catch:{ Exception -> 0x0407 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0407 }
            r13 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0407 }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0407 }
            r13[r12] = r15     // Catch:{ Exception -> 0x0407 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0407 }
            r13 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0407 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0407 }
            r14[r12] = r15     // Catch:{ Exception -> 0x0407 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x0407 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0407 }
            r14 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x0407 }
            r13[r12] = r14     // Catch:{ Exception -> 0x0407 }
            r14 = 0
            java.lang.Object r8 = r8.invoke(r14, r13)     // Catch:{ Exception -> 0x0407 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0407 }
            java.lang.Object r14 = r9.f1831e     // Catch:{ Exception -> 0x0407 }
            r13[r12] = r14     // Catch:{ Exception -> 0x0407 }
            r7.invoke(r8, r13)     // Catch:{ Exception -> 0x0407 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0407 }
            r7[r12] = r0     // Catch:{ Exception -> 0x0407 }
            r11.invoke(r8, r7)     // Catch:{ Exception -> 0x0407 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0407 }
            r0[r12] = r4     // Catch:{ Exception -> 0x0407 }
            java.lang.Object r0 = r6.invoke(r8, r0)     // Catch:{ Exception -> 0x0407 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0407 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0407 }
            if (r0 != 0) goto L_0x03f6
            r0 = 1
            goto L_0x03f7
        L_0x03f6:
            r0 = 0
        L_0x03f7:
            r6 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ Exception -> 0x0407 }
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x0407 }
            if (r0 == 0) goto L_0x0405
            r2 = r3
        L_0x0405:
            r0 = r2
            goto L_0x041d
        L_0x0407:
            r0 = move-exception
            goto L_0x040b
        L_0x0409:
            r0 = move-exception
            r12 = 0
        L_0x040b:
            java.lang.String r2 = p000.C0200av.m970a(r25)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r3, r0, r2)
            r0 = r5
        L_0x041d:
            go r2 = p000.C0433ep.f2036h
            if (r0 != r2) goto L_0x0431
            r2 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
        L_0x0431:
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            goto L_0x0451
        L_0x0437:
            r12 = 0
            r2 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0451:
            go r2 = p000.C0433ep.f2034f
            if (r0 == r2) goto L_0x045c
            go r2 = p000.C0433ep.f2029a
            if (r0 != r2) goto L_0x045a
            goto L_0x045c
        L_0x045a:
            r3 = 0
            goto L_0x045d
        L_0x045c:
            r3 = 1
        L_0x045d:
            if (r3 == 0) goto L_0x0466
            so r0 = r1.f1745b
            r2 = 0
            p000.C0936oo.m2711v(r1, r0, r2)
            goto L_0x0485
        L_0x0466:
            boolean r0 = r31.isLocked()
            if (r0 == 0) goto L_0x0475
            hp r0 = new hp
            r0.<init>(r1)
            r1.unlockAndRun(r0)
            goto L_0x0485
        L_0x0475:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.nordskog.LesserAudioSwitch.ui.GenericUnlockActivity> r2 = com.nordskog.LesserAudioSwitch.p002ui.GenericUnlockActivity.class
            r0.<init>(r1, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r0.addFlags(r2)
            r1.startActivityAndCollapse(r0)
        L_0x0485:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.quicksettingtile.BaseTile.onClick():void");
    }

    public void onStartListening() {
        C0348cp cpVar;
        C0544go goVar;
        String str;
        String str2;
        byte hashCode;
        super.onStartListening();
        String str3 = C1384xo.f5119a;
        int i = C1425yo.f5206a;
        boolean z = false;
        String string = getSharedPreferences(C0200av.m970a(-37364898813100L), 0).getString(Integer.toHexString(str3.hashCode()), (String) null);
        int i2 = 2;
        if (string == null || string.isEmpty()) {
            cpVar = new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g);
        } else {
            if (!string.isEmpty()) {
                byte[] decode = Base64.decode(string, 0);
                if (C0391dp.f1915a == null) {
                    C0391dp.f1915a = Settings.Secure.getString(getContentResolver(), C0200av.m970a(-70479096665260L));
                }
                if (C0391dp.f1915a == null) {
                    C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                }
                String str4 = C0391dp.f1915a;
                byte b = 5;
                if (!(str4 == null || str4.isEmpty() || (hashCode = (byte) str4.hashCode()) == 0)) {
                    b = hashCode;
                }
                byte b2 = (byte) (b * -1);
                C0495fu.m1724a(decode);
                byte[] bArr = new byte[decode.length];
                for (int i3 = 0; i3 < decode.length; i3++) {
                    int i4 = decode[i3] + b2;
                    if (i4 > 127) {
                        i4 -= 256;
                    } else if (i4 < -128) {
                        i4 += 256;
                    }
                    bArr[i3] = (byte) i4;
                }
                C0495fu.m1724a(bArr);
                string = Build.VERSION.SDK_INT >= 19 ? new String(bArr, StandardCharsets.UTF_8) : new String(bArr);
            }
            String[] split = string.split(C0200av.m970a(-38004848940204L));
            cpVar = split.length != 4 ? new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g) : new C0348cp(split[0], split[1], split[2], split[3], C0433ep.f2029a);
        }
        String str5 = C0391dp.f1915a;
        String str6 = cpVar.f1827a;
        if (!((str6 == null || str6.isEmpty() || (str = cpVar.f1828b) == null || str.isEmpty() || (str2 = cpVar.f1829c) == null || str2.isEmpty() || cpVar.f1831e == null) ? false : true)) {
            goVar = C0433ep.f2030b;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(cpVar.f1827a);
            sb.append(cpVar.f1828b);
            z = C0279ch.m1122s(sb, cpVar.f1829c).equals(cpVar.f1830d);
            if (!z) {
                C0200av.m970a(-70015240197292L);
                C0200av.m970a(-70036715033772L);
            }
            goVar = z ? C0433ep.f2039k : C0433ep.f2031c;
        }
        String.valueOf(goVar);
        cpVar.f1832f = goVar;
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            if (!z) {
                i2 = 1;
            }
            try {
                qsTile.setState(i2);
                qsTile.updateTile();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
