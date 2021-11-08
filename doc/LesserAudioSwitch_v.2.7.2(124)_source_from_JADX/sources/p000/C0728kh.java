package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.hardware.usb.UsbDevice;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import com.nordskog.LesserAudioSwitch.p002ui.GenericUnlockActivity;
import com.nordskog.LesserAudioSwitch.service.HeadphonesMonitorService;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.C0353cu;
import p000.C0652iu;
import p000.C0735ko;
import p000.C0901o;
import p000.C1067rl;
import p000.C1366xi;

/* renamed from: kh */
public final class C0728kh {
    /* renamed from: A */
    public static void m2272A(Context context) {
        C0652iu.C0653a aVar = C0697ju.f2933a;
        String a = C0200av.m970a(-109099442590892L);
        int i = Build.VERSION.SDK_INT;
        if (C0697ju.m2192o(context, a, i) != i) {
            C0550gu.m1820b("LAS Version", "SDK changed to " + i + ", resetting addressable");
            C0697ju.m2174C(context, C0200av.m970a(-111152436958380L), i);
            C0697ju.m2176E(context, C0735ko.C0736a.f3022b);
        }
    }

    /* renamed from: B */
    public static TypedValue m2273B(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: C */
    public static boolean m2274C(Context context, int i, boolean z) {
        TypedValue B = m2273B(context, i);
        return (B == null || B.type != 18) ? z : B.data != 0;
    }

    /* renamed from: D */
    public static int m2275D(Context context, int i, String str) {
        TypedValue B = m2273B(context, i);
        if (B != null) {
            return B.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: E */
    public static short m2276E(short s, int i) {
        return (short) ((s >>> (32 - i)) | (s << i));
    }

    /* renamed from: F */
    public static boolean m2277F(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? m2278G(context) : C0697ju.m2195r(context);
    }

    /* renamed from: G */
    public static boolean m2278G(Context context) {
        boolean z = false;
        if (C0697ju.m2195r(context) || C0697ju.m2178a(context) || C0697ju.f2934b.mo3309a(context, false)) {
            z = true;
        }
        if (z || C0697ju.m2187j(context, C0697ju.m2193p(context)) != C1072ro.BLUETOOTH_FOR_RECORDING) {
            return z;
        }
        return true;
    }

    /* renamed from: H */
    public static void m2279H(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C1067rl) {
            C1067rl rlVar = (C1067rl) background;
            C1067rl.C1069b bVar = rlVar.f3979b;
            if (bVar.f4016o != f) {
                bVar.f4016o = f;
                rlVar.mo4309w();
            }
        }
    }

    /* renamed from: I */
    public static <T extends Enum<T>> void m2280I(Context context, String str, T t) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.nordskog.LesserAudioSwitch_events", 0).edit();
        edit.putString(str, t.toString());
        edit.apply();
    }

    /* renamed from: J */
    public static void m2281J(View view, C1067rl rlVar) {
        C0383dk dkVar = rlVar.f3979b.f4003b;
        if (dkVar != null && dkVar.f1902a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += C0813m8.m2474h((View) parent);
            }
            C1067rl.C1069b bVar = rlVar.f3979b;
            if (bVar.f4015n != f) {
                bVar.f4015n = f;
                rlVar.mo4309w();
            }
        }
    }

    /* renamed from: K */
    public static void m2282K(Context context, boolean z) {
        if (m2278G(context)) {
            boolean z2 = HeadphonesMonitorService.f1746b;
            if (z2) {
                HeadphonesMonitorService.this.mo2544c();
            } else if (!z2) {
                try {
                    Intent intent = new Intent(context, HeadphonesMonitorService.class);
                    if (Build.VERSION.SDK_INT < 26 || z) {
                        context.startService(intent);
                    } else {
                        context.startForegroundService(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(context, context.getResources().getString(R.string.service_launch_error), 1).show();
                    e.printStackTrace();
                }
            }
        } else {
            boolean z3 = HeadphonesMonitorService.f1746b;
            if (z3 && z3) {
                context.stopService(new Intent(context, HeadphonesMonitorService.class));
            }
        }
    }

    /* renamed from: L */
    public static void m2283L(Context context) {
        HeadphonesMonitorService.C0341b bVar;
        if (m2277F(context) && (bVar = HeadphonesMonitorService.f1748d) != null) {
            C0788lo loVar = C1426yp.m3890b(context).f5213e;
            HeadphonesMonitorService.C0340a aVar = (HeadphonesMonitorService.C0340a) bVar;
            if (m2277F(HeadphonesMonitorService.this)) {
                HeadphonesMonitorService headphonesMonitorService = HeadphonesMonitorService.this;
                boolean z = HeadphonesMonitorService.f1746b;
                headphonesMonitorService.mo2542a(loVar);
            }
        }
    }

    /* renamed from: M */
    public static PorterDuffColorFilter m2284M(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    /* renamed from: a */
    public static boolean m2285a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: b */
    public static boolean m2286b(Context context) {
        C0735ko.C0736a aVar;
        if (!m2305u()) {
            return true;
        }
        C0899nu nuVar = C0936oo.f3508c;
        C0735ko.C0738c[] cVarArr = C0735ko.f3014c;
        if (!m2305u()) {
            aVar = C0735ko.C0736a.f3022b;
        } else {
            m2272A(context);
            aVar = C0697ju.m2197t(context);
            C0735ko.C0736a s = C0697ju.m2196s(context);
            if (aVar != C0735ko.C0736a.f3022b) {
                String a = C0200av.m970a(-20657476031660L);
                C0550gu.m1820b(a, C0200av.m970a(-20687540802732L) + aVar.toString());
            } else {
                aVar = s;
            }
        }
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            C0353cu.C0354a aVar2 = new C0353cu.C0354a(null);
            new C0845mo(context, aVar2).start();
            try {
                return ((Boolean) aVar2.mo2597b(2000, TimeUnit.MILLISECONDS)).booleanValue();
            } catch (Exception e) {
                C0279ch.m1110g(-34027709224108L, C0200av.m970a(-33997644453036L), e);
            }
        }
        return false;
    }

    /* renamed from: c */
    public static Animator m2287c(C1366xi xiVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(xiVar, C1366xi.C1369c.f5084a, C1366xi.C1368b.f5082b, new C1366xi.C1371e[]{new C1366xi.C1371e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C1366xi.C1371e revealInfo = xiVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) xiVar, (int) f, (int) f2, revealInfo.f5088c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: d */
    public static C0933ol m2288d(int i) {
        if (i == 0) {
            return new C1176tl();
        }
        if (i != 1) {
            return new C1176tl();
        }
        return new C0982pl();
    }

    /* renamed from: e */
    public static void m2289e(Context context, int i, int i2, int i3) {
        C0901o.C0902a aVar = new C0901o.C0902a(context);
        AlertController.C0039b bVar = aVar.f3436a;
        bVar.f193d = bVar.f190a.getText(i);
        AlertController.C0039b bVar2 = aVar.f3436a;
        bVar2.f195f = bVar2.f190a.getText(i2);
        aVar.mo3818c(i3, C0945ot.f3517b);
        aVar.mo3816a().show();
    }

    /* renamed from: f */
    public static float m2290f(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: g */
    public static RemoteViews m2291g(Context context) {
        C0348cp cpVar;
        boolean z;
        int i;
        String str;
        String str2;
        byte hashCode;
        Context context2 = context;
        String str3 = C1384xo.f5119a;
        int i2 = C1425yo.f5206a;
        String string = context2.getSharedPreferences(C0200av.m970a(-37364898813100L), 0).getString(Integer.toHexString(str3.hashCode()), (String) null);
        boolean z2 = true;
        int i3 = 2;
        if (string == null || string.isEmpty()) {
            cpVar = new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g);
        } else {
            if (!string.isEmpty()) {
                byte[] decode = Base64.decode(string, 0);
                if (C0391dp.f1915a == null) {
                    C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
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
                for (int i4 = 0; i4 < decode.length; i4++) {
                    int i5 = decode[i4] + b2;
                    if (i5 > 127) {
                        i5 -= 256;
                    } else if (i5 < -128) {
                        i5 += 256;
                    }
                    bArr[i4] = (byte) i5;
                }
                C0495fu.m1724a(bArr);
                string = Build.VERSION.SDK_INT >= 19 ? new String(bArr, StandardCharsets.UTF_8) : new String(bArr);
            }
            String[] split = string.split(C0200av.m970a(-38004848940204L));
            cpVar = split.length != 4 ? new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g) : new C0348cp(split[0], split[1], split[2], split[3], C0433ep.f2029a);
        }
        String str5 = C0391dp.f1915a;
        String str6 = cpVar.f1827a;
        if (str6 == null || str6.isEmpty() || (str = cpVar.f1828b) == null || str.isEmpty() || (str2 = cpVar.f1829c) == null || str2.isEmpty() || cpVar.f1831e == null) {
            z2 = false;
        }
        if (!z2) {
            C0544go goVar = C0433ep.f2030b;
            String.valueOf(goVar);
            cpVar.f1832f = goVar;
            z = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(cpVar.f1827a);
            sb.append(cpVar.f1828b);
            boolean equals = C0279ch.m1122s(sb, cpVar.f1829c).equals(cpVar.f1830d);
            if (!equals) {
                C0200av.m970a(-70015240197292L);
                C0200av.m970a(-70036715033772L);
            }
            C0544go goVar2 = equals ? C0433ep.f2039k : C0433ep.f2031c;
            String.valueOf(goVar2);
            cpVar.f1832f = goVar2;
            z = equals;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), z ? R.layout.notification_button_layout : R.layout.notification_button_locked_layout);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            C1385xp.values();
            if (i6 >= 7) {
                break;
            }
            if (C1385xp.values()[i6].f5135f.mo4551a(context2)) {
                i7++;
                i3 = i6;
            }
            i6++;
        }
        int i8 = 0;
        while (true) {
            C1385xp.values();
            if (i8 >= 7) {
                return remoteViews;
            }
            C1385xp xpVar = C1385xp.values()[i8];
            remoteViews.setViewVisibility(xpVar.f5131b, xpVar.f5135f.mo4551a(context2) ? 0 : 8);
            remoteViews.setImageViewResource(xpVar.f5132c, xpVar.f5135f.f4319f);
            remoteViews.setTextViewText(xpVar.f5133d, context2.getText(xpVar.f5135f.f4316c).toString().toUpperCase());
            if (i8 == i3 && (i = xpVar.f5134e) != 0) {
                remoteViews.setViewVisibility(i, 8);
            }
            if (i7 > 3) {
                remoteViews.setViewVisibility(xpVar.f5133d, 8);
            }
            if (xpVar.f5135f.mo4551a(context2)) {
                if (z) {
                    remoteViews.setOnClickPendingIntent(xpVar.f5131b, SoundBroadcastReceiver.m1386f(context2, xpVar.f5135f));
                } else {
                    int i9 = xpVar.f5131b;
                    int i10 = GenericUnlockActivity.f1761o;
                    remoteViews.setOnClickPendingIntent(i9, PendingIntent.getActivity(context2, 0, new Intent(context2, GenericUnlockActivity.class), 134217728));
                }
            }
            i8++;
        }
    }

    /* renamed from: h */
    public static long m2292h(int i, String[] strArr, long j) {
        return (((long) strArr[i / 8191].charAt(i % 8191)) << 32) ^ m2308x(j);
    }

    /* renamed from: i */
    public static int m2293i(Context context, int i, int i2) {
        TypedValue B = m2273B(context, i);
        return B != null ? B.data : i2;
    }

    /* renamed from: j */
    public static int m2294j(View view, int i) {
        return m2275D(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = r2.getColor(r3, -1);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m2295k(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p000.C0399e0.m1529a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 15
            if (r1 > r0) goto L_0x0026
            r1 = -1
            int r0 = r2.getColor(r3, r1)
            if (r0 == r1) goto L_0x0026
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            return r1
        L_0x0026:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0728kh.m2295k(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r2 = r3.f2425b.getColor(r4, -1);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m2296l(android.content.Context r2, p000.C0555h3 r3, int r4) {
        /*
            android.content.res.TypedArray r0 = r3.f2425b
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L_0x0018
            r0 = 0
            android.content.res.TypedArray r1 = r3.f2425b
            int r0 = r1.getResourceId(r4, r0)
            if (r0 == 0) goto L_0x0018
            android.content.res.ColorStateList r2 = p000.C0399e0.m1529a(r2, r0)
            if (r2 == 0) goto L_0x0018
            return r2
        L_0x0018:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 15
            if (r2 > r0) goto L_0x002c
            android.content.res.TypedArray r2 = r3.f2425b
            r0 = -1
            int r2 = r2.getColor(r4, r0)
            if (r2 == r0) goto L_0x002c
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            return r2
        L_0x002c:
            android.content.res.ColorStateList r2 = r3.mo3023c(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0728kh.m2296l(android.content.Context, h3, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p000.C0399e0.m1530b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m2297m(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = p000.C0399e0.m1530b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0728kh.m2297m(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: n */
    public static <T extends Enum<T>> T m2298n(Context context, String str, T t) {
        try {
            return Enum.valueOf(t.getDeclaringClass(), context.getSharedPreferences("com.nordskog.LesserAudioSwitch_events", 0).getString(str, t.toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return t;
        }
    }

    /* renamed from: o */
    public static C1129so m2299o(Context context, C0489fo foVar, boolean z) {
        String str = z ? "_onConnect" : "_onDisconnect";
        return (C1129so) m2298n(context, foVar.toString() + str, z ? foVar.mo2806a() : C1129so.SPEAKER);
    }

    /* renamed from: p */
    public static String m2300p() {
        return C0200av.m970a(-57796058240172L);
    }

    /* renamed from: q */
    public static String m2301q() {
        return C0200av.m970a(-58779605750956L);
    }

    /* renamed from: r */
    public static boolean m2302r(Context context) {
        C0899nu nuVar = C0936oo.f3508c;
        C0652iu.C0653a aVar = C0697ju.f2933a;
        String a = C0200av.m970a(-108970593572012L);
        int i = Build.VERSION.SDK_INT;
        if (C0697ju.m2192o(context, a, i) != i) {
            C0550gu.m1820b("LAS Version", "SDK changed to " + i + ", resetting earpiece");
            C0697ju.m2174C(context, C0200av.m970a(-111023587939500L), i);
            C0697ju.m2172A(context, C0735ko.C0737b.f3028d);
        }
        C0735ko.C0738c[] cVarArr = C0735ko.f3014c;
        int ordinal = ((C0735ko.C0737b) C0697ju.m2185h(context, C0200av.m970a(-107171002274988L), C0735ko.C0737b.f3028d)).ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        C0353cu.C0354a aVar2 = new C0353cu.C0354a(Boolean.TRUE);
        new C0893no(context, aVar2).start();
        try {
            return ((Boolean) aVar2.mo2597b(2000, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (Exception e) {
            C0279ch.m1110g(-34238162621612L, C0200av.m970a(-34208097850540L), e);
            return true;
        }
    }

    /* renamed from: s */
    public static boolean m2303s(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        int interfaceCount = usbDevice.getInterfaceCount();
        for (int i = 0; i < interfaceCount; i++) {
            if (usbDevice.getInterface(i).getInterfaceClass() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m2304t(View view) {
        return C0813m8.m2478l(view) == 1;
    }

    /* renamed from: u */
    public static boolean m2305u() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: v */
    public static int m2306v(int i, int i2, float f) {
        return C0859n6.m2572a(C0859n6.m2574c(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    /* renamed from: w */
    public static float m2307w(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* renamed from: x */
    public static long m2308x(long j) {
        short s = (short) ((int) (j & 65535));
        short s2 = (short) ((int) ((j >>> 16) & 65535));
        short s3 = (short) (s2 ^ s);
        return ((((long) m2276E(s3, 10)) | (((long) ((short) (m2276E((short) (s + s2), 9) + s))) << 16)) << 16) | ((long) ((short) (((short) (m2276E(s, 13) ^ s3)) ^ (s3 << 5))));
    }

    /* renamed from: y */
    public static PorterDuff.Mode m2309y(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: z */
    public static void m2310z(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
