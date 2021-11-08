package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.PurchaseItemView;
import p000.C0901o;

/* renamed from: bt */
public class C0235bt extends C0930oi {

    /* renamed from: q0 */
    public static final /* synthetic */ int f1296q0 = 0;

    /* renamed from: h0 */
    public PurchaseItemView f1297h0;

    /* renamed from: i0 */
    public ViewGroup f1298i0;

    /* renamed from: j0 */
    public boolean f1299j0;

    /* renamed from: k0 */
    public Handler f1300k0;

    /* renamed from: l0 */
    public View f1301l0;

    /* renamed from: m0 */
    public Context f1302m0;

    /* renamed from: n0 */
    public Runnable f1303n0;

    /* renamed from: o0 */
    public C0241f f1304o0;

    /* renamed from: p0 */
    public boolean f1305p0;

    /* renamed from: bt$a */
    public class C0236a implements PurchaseItemView.C0344a {
        public C0236a() {
        }
    }

    /* renamed from: bt$b */
    public class C0237b implements View.OnClickListener {
        public C0237b() {
        }

        public void onClick(View view) {
            C0235bt btVar = C0235bt.this;
            if (!btVar.f1305p0) {
                btVar.mo3847B0();
            }
        }
    }

    /* renamed from: bt$c */
    public class C0238c implements DialogInterface.OnClickListener {
        public C0238c(C0235bt btVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: bt$d */
    public class C0239d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f1308b;

        public C0239d(boolean z) {
            this.f1308b = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (this.f1308b) {
                C0235bt.this.mo3847B0();
            }
        }
    }

    /* renamed from: bt$e */
    public class C0240e implements DialogInterface.OnShowListener {
        public C0240e(C0235bt btVar) {
        }

        public void onShow(DialogInterface dialogInterface) {
            BottomSheetBehavior.m1200H((FrameLayout) ((C0880ni) dialogInterface).findViewById(R.id.design_bottom_sheet)).mo1909L(3);
        }
    }

    /* renamed from: bt$f */
    public interface C0241f {
        /* renamed from: a */
        void mo1620a();
    }

    static {
        C0200av.m970a(-97129368736940L);
    }

    public C0235bt() {
        this.f1297h0 = null;
        this.f1298i0 = null;
        this.f1299j0 = false;
        this.f1300k0 = null;
        this.f1301l0 = null;
        this.f1302m0 = null;
        this.f1303n0 = null;
        this.f1304o0 = null;
        this.f1305p0 = false;
        this.f1300k0 = new Handler(Looper.getMainLooper());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0181  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1611C0() {
        /*
            r33 = this;
            r1 = r33
            boolean r0 = r1.f1305p0
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.content.Context r2 = r33.mo868l()
            if (r2 != 0) goto L_0x0023
            r2 = -95647605019820(0xffffa9024e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r2)
            r2 = -95716324496556(0xffffa8f24e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            p000.C0550gu.m1822d(r0, r2)
            return
        L_0x0023:
            android.content.Context r0 = r33.mo868l()
            java.lang.String r3 = p000.C1384xo.f5119a
            int r4 = p000.C1425yo.f5206a
            int r3 = r3.hashCode()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r4 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r4)
            r5 = 0
            android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r5)
            r6 = 0
            java.lang.String r3 = r4.getString(r3, r6)
            r4 = 2
            r6 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r8 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r10 = 1
            if (r3 == 0) goto L_0x0103
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L_0x005c
            goto L_0x0103
        L_0x005c:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L_0x0064
            goto L_0x00d1
        L_0x0064:
            byte[] r3 = android.util.Base64.decode(r3, r5)
            java.lang.String r11 = p000.C0391dp.f1915a
            if (r11 != 0) goto L_0x007a
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r11 = p000.C0200av.m970a(r8)
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r11)
            p000.C0391dp.f1915a = r0
        L_0x007a:
            java.lang.String r0 = p000.C0391dp.f1915a
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = p000.C0200av.m970a(r6)
            p000.C0391dp.f1915a = r0
        L_0x0084:
            java.lang.String r0 = p000.C0391dp.f1915a
            r11 = 5
            if (r0 == 0) goto L_0x0098
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L_0x0098
            int r0 = r0.hashCode()
            byte r0 = (byte) r0
            if (r0 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r11 = r0
        L_0x0098:
            int r11 = r11 * -1
            byte r0 = (byte) r11
            p000.C0495fu.m1724a(r3)
            int r11 = r3.length
            byte[] r11 = new byte[r11]
            r12 = 0
        L_0x00a2:
            int r13 = r3.length
            if (r12 >= r13) goto L_0x00bb
            byte r13 = r3[r12]
            int r13 = r13 + r0
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 <= r14) goto L_0x00af
            int r13 = r13 + -256
            goto L_0x00b5
        L_0x00af:
            r14 = -128(0xffffffffffffff80, float:NaN)
            if (r13 >= r14) goto L_0x00b5
            int r13 = r13 + 256
        L_0x00b5:
            byte r13 = (byte) r13
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x00a2
        L_0x00bb:
            p000.C0495fu.m1724a(r11)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r0 < r3) goto L_0x00cc
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r11, r0)
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r11)
        L_0x00d1:
            r11 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r11)
            java.lang.String[] r0 = r3.split(r0)
            int r3 = r0.length
            r11 = 4
            if (r3 == r11) goto L_0x00f0
            cp r0 = new cp
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            go r17 = p000.C0433ep.f2035g
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x010f
        L_0x00f0:
            cp r3 = new cp
            r19 = r0[r5]
            r20 = r0[r10]
            r21 = r0[r4]
            r4 = 3
            r22 = r0[r4]
            go r23 = p000.C0433ep.f2029a
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x0110
        L_0x0103:
            cp r0 = new cp
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            go r15 = p000.C0433ep.f2035g
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x010f:
            r3 = r0
        L_0x0110:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r3.f1827a
            if (r0 == 0) goto L_0x013a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011d
            goto L_0x013a
        L_0x011d:
            java.lang.String r0 = r3.f1828b
            if (r0 == 0) goto L_0x013a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0128
            goto L_0x013a
        L_0x0128:
            java.lang.String r0 = r3.f1829c
            if (r0 == 0) goto L_0x013a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0133
            goto L_0x013a
        L_0x0133:
            java.lang.Object r0 = r3.f1831e
            if (r0 != 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r0 = 1
            goto L_0x013b
        L_0x013a:
            r0 = 0
        L_0x013b:
            r10 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x0150
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            r0 = 0
            goto L_0x017f
        L_0x0150:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r3.f1827a
            r0.append(r4)
            java.lang.String r4 = r3.f1828b
            r0.append(r4)
            java.lang.String r4 = r3.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r4)
            java.lang.String r4 = r3.f1830d
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0173
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x0173:
            if (r0 == 0) goto L_0x0178
            go r4 = p000.C0433ep.f2039k
            goto L_0x017a
        L_0x0178:
            go r4 = p000.C0433ep.f2031c
        L_0x017a:
            java.lang.String.valueOf(r4)
            r3.f1832f = r4
        L_0x017f:
            if (r0 == 0) goto L_0x04b7
            android.content.Context r0 = r33.mo868l()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class<byte[]> r14 = byte[].class
            java.lang.String r15 = r3.f1827a
            if (r15 == 0) goto L_0x01b1
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x0194
            goto L_0x01b1
        L_0x0194:
            java.lang.String r15 = r3.f1828b
            if (r15 == 0) goto L_0x01b1
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x019f
            goto L_0x01b1
        L_0x019f:
            java.lang.String r15 = r3.f1829c
            if (r15 == 0) goto L_0x01b1
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x01aa
            goto L_0x01b1
        L_0x01aa:
            java.lang.Object r15 = r3.f1831e
            if (r15 != 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r15 = 1
            goto L_0x01b2
        L_0x01b1:
            r15 = 0
        L_0x01b2:
            if (r15 != 0) goto L_0x01bd
            go r10 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r10)
            r3.f1832f = r10
            r10 = 0
            goto L_0x01ed
        L_0x01bd:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = r3.f1827a
            r15.append(r5)
            java.lang.String r5 = r3.f1828b
            r15.append(r5)
            java.lang.String r5 = r3.f1829c
            java.lang.String r5 = p000.C0279ch.m1122s(r15, r5)
            java.lang.String r15 = r3.f1830d
            boolean r5 = r5.equals(r15)
            if (r5 != 0) goto L_0x01e0
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            go r10 = p000.C0433ep.f2039k
            goto L_0x01e7
        L_0x01e5:
            go r10 = p000.C0433ep.f2031c
        L_0x01e7:
            java.lang.String.valueOf(r10)
            r3.f1832f = r10
            r10 = r5
        L_0x01ed:
            if (r10 != 0) goto L_0x01f4
            go r0 = r3.f1832f
        L_0x01f1:
            r15 = 0
            goto L_0x0477
        L_0x01f4:
            java.lang.String r5 = r3.f1829c
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0208
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r8 = p000.C0200av.m970a(r8)
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r8)
            p000.C0391dp.f1915a = r0
        L_0x0208:
            java.lang.String r0 = p000.C0391dp.f1915a
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = p000.C0200av.m970a(r6)
            p000.C0391dp.f1915a = r0
        L_0x0212:
            java.lang.String r0 = p000.C0391dp.f1915a
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0234
            r4 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x01f1
        L_0x0234:
            java.lang.String r0 = r3.f1828b
            java.lang.Class r5 = p000.C1228uu.f4686b
            r6 = 0
            byte[] r5 = new byte[r6]
            java.lang.reflect.Method r7 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x0252 }
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0252 }
            r8[r6] = r0     // Catch:{ Exception -> 0x0252 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0252 }
            r6 = 1
            r8[r6] = r0     // Catch:{ Exception -> 0x0252 }
            r0 = 0
            java.lang.Object r0 = r7.invoke(r0, r8)     // Catch:{ Exception -> 0x0252 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0252 }
            r5 = r0
            goto L_0x0269
        L_0x0252:
            r0 = move-exception
            r6 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r7, r0, r6)
        L_0x0269:
            if (r5 == 0) goto L_0x045d
            int r0 = r5.length
            if (r0 != 0) goto L_0x0270
            goto L_0x045d
        L_0x0270:
            int r0 = p000.C1136su.f4328a
            r6 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r8 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r8, r10, r5)
            r17 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r19 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r21 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r25 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r27 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r29 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0348 }
            java.lang.ClassLoader r8 = r4.getClassLoader()     // Catch:{ Exception -> 0x0348 }
            java.lang.Class r8 = p000.C0389dn.m1512a(r15, r8)     // Catch:{ Exception -> 0x0348 }
            java.lang.String r9 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x0348 }
            java.lang.ClassLoader r15 = r4.getClassLoader()     // Catch:{ Exception -> 0x0348 }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r15)     // Catch:{ Exception -> 0x0348 }
            java.lang.String r15 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0348 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0348 }
            r16 = 0
            r11[r16] = r4     // Catch:{ Exception -> 0x0348 }
            java.lang.reflect.Method r11 = r8.getDeclaredMethod(r15, r11)     // Catch:{ Exception -> 0x0348 }
            java.lang.String r15 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0348 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0348 }
            r12[r16] = r9     // Catch:{ Exception -> 0x0348 }
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r15, r12)     // Catch:{ Exception -> 0x0348 }
            r12 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0348 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0348 }
            r12[r16] = r14     // Catch:{ Exception -> 0x0348 }
            java.lang.reflect.Method r12 = r8.getDeclaredMethod(r15, r12)     // Catch:{ Exception -> 0x0348 }
            r31 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r31)     // Catch:{ Exception -> 0x0348 }
            java.lang.Class[] r15 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0348 }
            r15[r16] = r14     // Catch:{ Exception -> 0x0348 }
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r13, r15)     // Catch:{ Exception -> 0x0348 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0348 }
            r23 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x0348 }
            r13[r16] = r15     // Catch:{ Exception -> 0x0348 }
            r15 = 0
            java.lang.Object r11 = r11.invoke(r15, r13)     // Catch:{ Exception -> 0x0348 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0348 }
            java.lang.Object r15 = r3.f1831e     // Catch:{ Exception -> 0x0348 }
            r13[r16] = r15     // Catch:{ Exception -> 0x0348 }
            r9.invoke(r11, r13)     // Catch:{ Exception -> 0x0348 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0348 }
            r9[r16] = r0     // Catch:{ Exception -> 0x0348 }
            r12.invoke(r11, r9)     // Catch:{ Exception -> 0x0348 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0348 }
            r0[r16] = r5     // Catch:{ Exception -> 0x0348 }
            java.lang.Object r0 = r8.invoke(r11, r0)     // Catch:{ Exception -> 0x0348 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0348 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0348 }
            if (r0 != 0) goto L_0x0337
            r0 = 1
            goto L_0x0338
        L_0x0337:
            r0 = 0
        L_0x0338:
            r8 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r8)     // Catch:{ Exception -> 0x0348 }
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x0348 }
            if (r0 == 0) goto L_0x0346
            r6 = r7
        L_0x0346:
            r7 = r6
            goto L_0x035a
        L_0x0348:
            r0 = move-exception
            java.lang.String r6 = p000.C0200av.m970a(r25)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r9, r8, r0, r6)
        L_0x035a:
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L_0x037b
            r4 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x01f1
        L_0x037b:
            java.lang.String r0 = r3.f1827a
            byte[] r0 = r0.getBytes()
            go r6 = p000.C0433ep.f2034f
            go r7 = p000.C0433ep.f2036h
            go r8 = p000.C0433ep.f2038j
            r9 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r11 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r9, r11, r5)
            java.lang.String r9 = p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x042f }
            java.lang.ClassLoader r10 = r4.getClassLoader()     // Catch:{ Exception -> 0x042f }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r10)     // Catch:{ Exception -> 0x042f }
            java.lang.String r10 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x042f }
            java.lang.ClassLoader r11 = r4.getClassLoader()     // Catch:{ Exception -> 0x042f }
            java.lang.Class r10 = p000.C0389dn.m1512a(r10, r11)     // Catch:{ Exception -> 0x042f }
            java.lang.String r11 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x042f }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x042f }
            r15 = 0
            r13[r15] = r4     // Catch:{ Exception -> 0x042d }
            java.lang.reflect.Method r4 = r9.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x042d }
            java.lang.String r11 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x042d }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x042d }
            r13[r15] = r10     // Catch:{ Exception -> 0x042d }
            java.lang.reflect.Method r10 = r9.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x042d }
            r16 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x042d }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x042d }
            r13[r15] = r14     // Catch:{ Exception -> 0x042d }
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x042d }
            r16 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r16)     // Catch:{ Exception -> 0x042d }
            java.lang.Class[] r1 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x042d }
            r1[r15] = r14     // Catch:{ Exception -> 0x042d }
            java.lang.reflect.Method r1 = r9.getDeclaredMethod(r13, r1)     // Catch:{ Exception -> 0x042d }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x042d }
            r13 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x042d }
            r9[r15] = r13     // Catch:{ Exception -> 0x042d }
            r13 = 0
            java.lang.Object r4 = r4.invoke(r13, r9)     // Catch:{ Exception -> 0x042d }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x042d }
            java.lang.Object r13 = r3.f1831e     // Catch:{ Exception -> 0x042d }
            r9[r15] = r13     // Catch:{ Exception -> 0x042d }
            r10.invoke(r4, r9)     // Catch:{ Exception -> 0x042d }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x042d }
            r9[r15] = r0     // Catch:{ Exception -> 0x042d }
            r11.invoke(r4, r9)     // Catch:{ Exception -> 0x042d }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x042d }
            r0[r15] = r5     // Catch:{ Exception -> 0x042d }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ Exception -> 0x042d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x042d }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x042d }
            if (r0 != 0) goto L_0x041c
            r0 = 1
            goto L_0x041d
        L_0x041c:
            r0 = 0
        L_0x041d:
            r4 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r4)     // Catch:{ Exception -> 0x042d }
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x042d }
            if (r0 == 0) goto L_0x042b
            r6 = r7
        L_0x042b:
            r0 = r6
            goto L_0x0443
        L_0x042d:
            r0 = move-exception
            goto L_0x0431
        L_0x042f:
            r0 = move-exception
            r15 = 0
        L_0x0431:
            java.lang.String r1 = p000.C0200av.m970a(r25)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r5, r4, r0, r1)
            r0 = r8
        L_0x0443:
            go r1 = p000.C0433ep.f2036h
            if (r0 != r1) goto L_0x0457
            r4 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
        L_0x0457:
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            goto L_0x0477
        L_0x045d:
            r15 = 0
            r0 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            r0 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r0)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r3.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0477:
            go r1 = p000.C0433ep.f2034f
            if (r0 == r1) goto L_0x0482
            go r1 = p000.C0433ep.f2029a
            if (r0 != r1) goto L_0x0480
            goto L_0x0482
        L_0x0480:
            r5 = 0
            goto L_0x0483
        L_0x0482:
            r5 = 1
        L_0x0483:
            if (r5 == 0) goto L_0x04b7
            p000.C0728kh.m2283L(r2)
            android.content.Context r0 = r33.mo868l()
            r1 = 2131689584(0x7f0f0070, float:1.9008188E38)
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            android.content.Context r0 = r33.mo868l()
            r1 = -95802223842476(0xffffa8de4e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)
            zo r0 = p000.C1468zo.m3977e(r0, r1)
            r1 = -95870943319212(0xffffa8ce4e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)
            r0.mo5307b(r1)
            r33.mo3847B0()
        L_0x04b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0235bt.mo1611C0():void");
    }

    /* renamed from: D0 */
    public final void mo1612D0(C0490fp fpVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        Context l = mo868l();
        if (l == null) {
            C0200av.m970a(-96807246189740L);
            C0200av.m970a(-96875965666476L);
            return;
        }
        Resources resources = l.getResources();
        sb.append(resources.getString(C0545gp.f2411a.get(fpVar.f2179b, 0).intValue()));
        if (fpVar.f2178a != null) {
            sb.append(C0200av.m970a(-97112188867756L));
            sb.append(resources.getString(R.string.iap_purchase_error_code_prefix));
            sb.append(C0200av.m970a(-97120778802348L));
            sb.append(fpVar.f2178a.f1384a);
        }
        C0901o.C0902a aVar = new C0901o.C0902a(l);
        aVar.mo3819d(R.string.iap_dialog_error_title);
        aVar.f3436a.f195f = sb.toString();
        aVar.mo3818c(R.string.button_understood, new C0239d(z));
        aVar.mo3816a().show();
    }

    /* renamed from: E0 */
    public final void mo1613E0(View view, int i, int i2, int i3, int i4, int i5) {
        ((TextView) view.findViewById(R.id.promo_item_name)).setText(i);
        ((ImageView) view.findViewById(R.id.promo_item_icon)).setImageResource(i3);
        View findViewById = view.findViewById(R.id.promo_item_details);
        TextView textView = (TextView) view.findViewById(R.id.promo_item_title2);
        if (i2 > 0) {
            textView.setText(i2);
        } else {
            textView.setVisibility(8);
        }
        if (i4 != 0 && i5 != 0) {
            C0901o.C0902a aVar = new C0901o.C0902a(view.getContext());
            AlertController.C0039b bVar = aVar.f3436a;
            bVar.f193d = bVar.f190a.getText(i4);
            AlertController.C0039b bVar2 = aVar.f3436a;
            bVar2.f195f = bVar2.f190a.getText(i5);
            aVar.mo3818c(R.string.button_understood, new C0238c(this));
            findViewById.setOnClickListener(new C1475zr(aVar.mo3816a()));
        }
    }

    /* renamed from: I */
    public void mo831I(Context context) {
        this.f1302m0 = context;
        C0200av.m970a(-96592497824940L);
        C0200av.m970a(-96661217301676L);
        super.mo831I(context);
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
    }

    /* renamed from: O */
    public View mo837O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C0853n0(mo862i(), R.style.AppTheme)).inflate(R.layout.dialog_unlock, viewGroup, false);
        this.f1301l0 = inflate;
        mo1613E0(inflate.findViewById(R.id.unlock_promo_auto_switch), R.string.iap_promo_auto_switch, R.string.iap_promo_auto_switch_small_text, R.drawable.ic_iap_icon_auto, R.string.iap_feature_details_auto_switch_title, R.string.iap_feature_details_auto_switch_message);
        mo1613E0(this.f1301l0.findViewById(R.id.unlock_promo_remove_ads), R.string.iap_promo_remove_ads, 0, 0, 0, 0);
        mo1613E0(this.f1301l0.findViewById(R.id.unlock_promo_widgets), R.string.iap_promo_widgets, R.string.iap_promo_widget_small_text, R.drawable.switch_vector_boring_headphones, R.string.iap_feature_details_widget_title, R.string.iap_feature_details_widget_message);
        this.f1297h0 = (PurchaseItemView) this.f1301l0.findViewById(R.id.unlock_purchase_item);
        ViewGroup viewGroup2 = (ViewGroup) this.f1301l0.findViewById(R.id.unlock_awaiting_response_cover);
        this.f1298i0 = viewGroup2;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(2000);
        ((ImageView) viewGroup2.findViewById(R.id.unlock_awaiting_respnse_loading)).startAnimation(rotateAnimation);
        this.f1297h0.setOnPurchaseViewClickedListener(new C0236a());
        this.f1301l0.findViewById(R.id.dialog_close_icon).setOnClickListener(new C0237b());
        return this.f1301l0;
    }

    /* renamed from: Q */
    public void mo839Q() {
        this.f1302m0 = null;
        C0200av.m970a(-96699872007340L);
        C0200av.m970a(-96768591484076L);
        this.f678C = true;
        if (!this.f4408g0 && !this.f4407f0) {
            this.f4407f0 = true;
        }
    }

    /* renamed from: W */
    public void mo845W() {
        Runnable runnable;
        C0200av.m970a(-95939662795948L);
        C0200av.m970a(-96008382272684L);
        Handler handler = this.f1300k0;
        if (!(handler == null || (runnable = this.f1303n0) == null)) {
            handler.removeCallbacks(runnable);
            this.f1303n0 = null;
        }
        C1468zo.m3977e(mo868l(), C0200av.m970a(-96042742011052L)).mo5307b(C0200av.m970a(-96111461487788L));
        this.f678C = true;
    }

    /* renamed from: a0 */
    public void mo849a0() {
        this.f1305p0 = false;
        C0200av.m970a(-96485123642540L);
        C0200av.m970a(-96553843119276L);
        this.f678C = true;
        C1468zo e = C1468zo.m3977e(mo868l(), C0200av.m970a(-94754251822252L));
        if (C1468zo.f5334t.contains(C0200av.m970a(-94822971298988L))) {
            C0200av.m970a(-94891690775724L);
            C0200av.m970a(-94960410252460L);
            e.mo5307b(C0200av.m970a(-95097849205932L));
        }
        if (e != null) {
            e.f5346j.mo3647c(C0200av.m970a(-95166568682668L), new C1429yr(this), false);
            e.f5348l.mo3647c(C0200av.m970a(-95235288159404L), new C0234bs(this, e), false);
            e.f5349m.f1921a.add(new C0593hu(C0200av.m970a(-95304007636140L), new C1387xr(this)));
            e.f5350n.mo3647c(C0200av.m970a(-95372727112876L), new C0197as(this), false);
            e.f5351o.mo3646b(C0200av.m970a(-95441446589612L), new C0394ds(this), true);
            e.f5353q.mo3647c(C0200av.m970a(-95510166066348L), new C1326wr(this), true);
            e.f5352p.mo3647c(C0200av.m970a(-95578885543084L), new C0351cs(this), true);
            e.mo5312i();
            e.mo5313j();
        }
        if (this.f1299j0) {
            C0352ct ctVar = new C0352ct(this);
            this.f1303n0 = ctVar;
            Handler handler = this.f1300k0;
            if (handler != null) {
                handler.postDelayed(ctVar, 7000);
            }
            this.f1299j0 = false;
            this.f1298i0.setVisibility(0);
        }
    }

    /* renamed from: c0 */
    public void mo851c0() {
        super.mo851c0();
    }

    /* renamed from: d0 */
    public void mo852d0() {
        C0200av.m970a(-96180180964524L);
        C0200av.m970a(-96248900441260L);
        this.f1305p0 = true;
        C1468zo.m3977e(mo868l(), C0200av.m970a(-96278965212332L)).mo5307b(C0200av.m970a(-96347684689068L));
        C1468zo.m3978k(C0200av.m970a(-96416404165804L));
        super.mo852d0();
    }

    /* renamed from: l */
    public Context mo868l() {
        Context l = super.mo868l();
        if (l != null) {
            return l;
        }
        Context context = this.f1302m0;
        return context != null ? context : mo862i();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C0241f fVar = this.f1304o0;
        if (fVar != null) {
            fVar.mo1620a();
        }
    }

    /* renamed from: x0 */
    public Dialog mo1615x0(Bundle bundle) {
        C0880ni niVar = new C0880ni(mo868l(), this.f4400Y);
        niVar.setOnShowListener(new C0240e(this));
        return niVar;
    }
}
