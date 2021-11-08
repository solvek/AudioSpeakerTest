package p000;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p000.C0449f1;
import p000.C0750l0;
import p000.C1435z0;

/* renamed from: s */
public class C1079s extends C1035r implements C1435z0.C1436a, LayoutInflater.Factory2 {

    /* renamed from: Z */
    public static final C0663j4<String, Integer> f4048Z = new C0663j4<>();

    /* renamed from: a0 */
    public static final boolean f4049a0;

    /* renamed from: b0 */
    public static final int[] f4050b0 = {16842836};

    /* renamed from: c0 */
    public static final boolean f4051c0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: d0 */
    public static final boolean f4052d0;

    /* renamed from: e0 */
    public static boolean f4053e0 = true;

    /* renamed from: A */
    public boolean f4054A;

    /* renamed from: B */
    public boolean f4055B;

    /* renamed from: C */
    public boolean f4056C;

    /* renamed from: D */
    public boolean f4057D;

    /* renamed from: E */
    public boolean f4058E;

    /* renamed from: F */
    public C1091j[] f4059F;

    /* renamed from: G */
    public C1091j f4060G;

    /* renamed from: H */
    public boolean f4061H;

    /* renamed from: I */
    public boolean f4062I;

    /* renamed from: J */
    public boolean f4063J;

    /* renamed from: K */
    public boolean f4064K;

    /* renamed from: L */
    public boolean f4065L;

    /* renamed from: M */
    public int f4066M = -100;

    /* renamed from: N */
    public int f4067N;

    /* renamed from: O */
    public boolean f4068O;

    /* renamed from: P */
    public boolean f4069P;

    /* renamed from: Q */
    public C1087g f4070Q;

    /* renamed from: R */
    public C1087g f4071R;

    /* renamed from: S */
    public boolean f4072S;

    /* renamed from: T */
    public int f4073T;

    /* renamed from: U */
    public final Runnable f4074U = new C1081b();

    /* renamed from: V */
    public boolean f4075V;

    /* renamed from: W */
    public Rect f4076W;

    /* renamed from: X */
    public Rect f4077X;

    /* renamed from: Y */
    public C0001a0 f4078Y;

    /* renamed from: d */
    public final Object f4079d;

    /* renamed from: e */
    public final Context f4080e;

    /* renamed from: f */
    public Window f4081f;

    /* renamed from: g */
    public C1085e f4082g;

    /* renamed from: h */
    public final C0994q f4083h;

    /* renamed from: i */
    public C0496g f4084i;

    /* renamed from: j */
    public MenuInflater f4085j;

    /* renamed from: k */
    public CharSequence f4086k;

    /* renamed from: l */
    public C0802m2 f4087l;

    /* renamed from: m */
    public C1082c f4088m;

    /* renamed from: n */
    public C1092k f4089n;

    /* renamed from: o */
    public C0750l0 f4090o;

    /* renamed from: p */
    public ActionBarContextView f4091p;

    /* renamed from: q */
    public PopupWindow f4092q;

    /* renamed from: r */
    public Runnable f4093r;

    /* renamed from: s */
    public C1049r8 f4094s = null;

    /* renamed from: t */
    public boolean f4095t;

    /* renamed from: u */
    public ViewGroup f4096u;

    /* renamed from: v */
    public TextView f4097v;

    /* renamed from: w */
    public View f4098w;

    /* renamed from: x */
    public boolean f4099x;

    /* renamed from: y */
    public boolean f4100y;

    /* renamed from: z */
    public boolean f4101z;

    /* renamed from: s$a */
    public class C1080a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f4102a;

        public C1080a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f4102a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f4102a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f4102a.uncaughtException(thread, th);
        }
    }

    /* renamed from: s$b */
    public class C1081b implements Runnable {
        public C1081b() {
        }

        public void run() {
            C1079s sVar = C1079s.this;
            if ((sVar.f4073T & 1) != 0) {
                sVar.mo4324H(0);
            }
            C1079s sVar2 = C1079s.this;
            if ((sVar2.f4073T & 4096) != 0) {
                sVar2.mo4324H(108);
            }
            C1079s sVar3 = C1079s.this;
            sVar3.f4072S = false;
            sVar3.f4073T = 0;
        }
    }

    /* renamed from: s$c */
    public final class C1082c implements C0449f1.C0450a {
        public C1082c() {
        }

        /* renamed from: b */
        public void mo10b(C1435z0 z0Var, boolean z) {
            C1079s.this.mo4320D(z0Var);
        }

        /* renamed from: c */
        public boolean mo11c(C1435z0 z0Var) {
            Window.Callback O = C1079s.this.mo4331O();
            if (O == null) {
                return true;
            }
            O.onMenuOpened(108, z0Var);
            return true;
        }
    }

    /* renamed from: s$d */
    public class C1083d implements C0750l0.C0751a {

        /* renamed from: a */
        public C0750l0.C0751a f4105a;

        /* renamed from: s$d$a */
        public class C1084a extends C1156t8 {
            public C1084a() {
            }

            /* renamed from: a */
            public void mo2606a(View view) {
                C1079s.this.f4091p.setVisibility(8);
                C1079s sVar = C1079s.this;
                PopupWindow popupWindow = sVar.f4092q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar.f4091p.getParent() instanceof View) {
                    C0813m8.m2455D((View) C1079s.this.f4091p.getParent());
                }
                C1079s.this.f4091p.removeAllViews();
                C1079s.this.f4094s.mo4214d((C1102s8) null);
                C1079s sVar2 = C1079s.this;
                sVar2.f4094s = null;
                C0813m8.m2455D(sVar2.f4096u);
            }
        }

        public C1083d(C0750l0.C0751a aVar) {
            this.f4105a = aVar;
        }

        /* renamed from: a */
        public boolean mo3568a(C0750l0 l0Var, Menu menu) {
            C0813m8.m2455D(C1079s.this.f4096u);
            return this.f4105a.mo3568a(l0Var, menu);
        }

        /* renamed from: b */
        public void mo3569b(C0750l0 l0Var) {
            this.f4105a.mo3569b(l0Var);
            C1079s sVar = C1079s.this;
            if (sVar.f4092q != null) {
                sVar.f4081f.getDecorView().removeCallbacks(C1079s.this.f4093r);
            }
            C1079s sVar2 = C1079s.this;
            if (sVar2.f4091p != null) {
                sVar2.mo4325I();
                C1079s sVar3 = C1079s.this;
                C1049r8 a = C0813m8.m2467a(sVar3.f4091p);
                a.mo4211a(0.0f);
                sVar3.f4094s = a;
                C1079s.this.f4094s.mo4214d(new C1084a());
            }
            C1079s sVar4 = C1079s.this;
            C0994q qVar = sVar4.f4083h;
            if (qVar != null) {
                qVar.mo3880f(sVar4.f4090o);
            }
            C1079s sVar5 = C1079s.this;
            sVar5.f4090o = null;
            C0813m8.m2455D(sVar5.f4096u);
        }

        /* renamed from: c */
        public boolean mo3570c(C0750l0 l0Var, MenuItem menuItem) {
            return this.f4105a.mo3570c(l0Var, menuItem);
        }

        /* renamed from: d */
        public boolean mo3571d(C0750l0 l0Var, Menu menu) {
            return this.f4105a.mo3571d(l0Var, menu);
        }
    }

    /* renamed from: s$f */
    public class C1086f extends C1087g {

        /* renamed from: c */
        public final PowerManager f4109c;

        public C1086f(Context context) {
            super();
            this.f4109c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* renamed from: b */
        public IntentFilter mo4357b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo4358c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f4109c.isPowerSaveMode()) ? 1 : 2;
        }

        /* renamed from: d */
        public void mo4359d() {
            C1079s.this.mo4343z();
        }
    }

    /* renamed from: s$g */
    public abstract class C1087g {

        /* renamed from: a */
        public BroadcastReceiver f4111a;

        /* renamed from: s$g$a */
        public class C1088a extends BroadcastReceiver {
            public C1088a() {
            }

            public void onReceive(Context context, Intent intent) {
                C1087g.this.mo4359d();
            }
        }

        public C1087g() {
        }

        /* renamed from: a */
        public void mo4360a() {
            BroadcastReceiver broadcastReceiver = this.f4111a;
            if (broadcastReceiver != null) {
                try {
                    C1079s.this.f4080e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f4111a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo4357b();

        /* renamed from: c */
        public abstract int mo4358c();

        /* renamed from: d */
        public abstract void mo4359d();

        /* renamed from: e */
        public void mo4361e() {
            mo4360a();
            IntentFilter b = mo4357b();
            if (b != null && b.countActions() != 0) {
                if (this.f4111a == null) {
                    this.f4111a = new C1088a();
                }
                C1079s.this.f4080e.registerReceiver(this.f4111a, b);
            }
        }
    }

    /* renamed from: s$h */
    public class C1089h extends C1087g {

        /* renamed from: c */
        public final C0244c0 f4114c;

        public C1089h(C0244c0 c0Var) {
            super();
            this.f4114c = c0Var;
        }

        /* renamed from: b */
        public IntentFilter mo4357b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4358c() {
            /*
                r22 = this;
                r0 = r22
                c0 r1 = r0.f4114c
                c0$a r2 = r1.f1316c
                long r3 = r2.f1318b
                long r5 = java.lang.System.currentTimeMillis()
                r7 = 0
                r8 = 1
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x0014
                r3 = 1
                goto L_0x0015
            L_0x0014:
                r3 = 0
            L_0x0015:
                if (r3 == 0) goto L_0x001b
            L_0x0017:
                boolean r1 = r2.f1317a
                goto L_0x00f9
            L_0x001b:
                android.content.Context r3 = r1.f1314a
                java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = p000.C1344x5.m3757g(r3, r4)
                r4 = 0
                if (r3 != 0) goto L_0x0037
                java.lang.String r3 = "network"
                android.location.LocationManager r5 = r1.f1315b     // Catch:{ Exception -> 0x0037 }
                boolean r5 = r5.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0037 }
                if (r5 == 0) goto L_0x0037
                android.location.LocationManager r5 = r1.f1315b     // Catch:{ Exception -> 0x0037 }
                android.location.Location r3 = r5.getLastKnownLocation(r3)     // Catch:{ Exception -> 0x0037 }
                goto L_0x0038
            L_0x0037:
                r3 = r4
            L_0x0038:
                android.content.Context r5 = r1.f1314a
                java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
                int r5 = p000.C1344x5.m3757g(r5, r6)
                if (r5 != 0) goto L_0x0054
                java.lang.String r5 = "gps"
                android.location.LocationManager r6 = r1.f1315b     // Catch:{ Exception -> 0x0053 }
                boolean r6 = r6.isProviderEnabled(r5)     // Catch:{ Exception -> 0x0053 }
                if (r6 == 0) goto L_0x0054
                android.location.LocationManager r6 = r1.f1315b     // Catch:{ Exception -> 0x0053 }
                android.location.Location r4 = r6.getLastKnownLocation(r5)     // Catch:{ Exception -> 0x0053 }
                goto L_0x0054
            L_0x0053:
            L_0x0054:
                if (r4 == 0) goto L_0x0065
                if (r3 == 0) goto L_0x0065
                long r5 = r4.getTime()
                long r9 = r3.getTime()
                int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x0068
                goto L_0x0067
            L_0x0065:
                if (r4 == 0) goto L_0x0068
            L_0x0067:
                r3 = r4
            L_0x0068:
                if (r3 == 0) goto L_0x00e6
                c0$a r1 = r1.f1316c
                long r4 = java.lang.System.currentTimeMillis()
                b0 r6 = p000.C0202b0.f1173d
                if (r6 != 0) goto L_0x007b
                b0 r6 = new b0
                r6.<init>()
                p000.C0202b0.f1173d = r6
            L_0x007b:
                b0 r6 = p000.C0202b0.f1173d
                r16 = 86400000(0x5265c00, double:4.2687272E-316)
                long r10 = r4 - r16
                double r12 = r3.getLatitude()
                double r14 = r3.getLongitude()
                r9 = r6
                r9.mo1474a(r10, r12, r14)
                double r12 = r3.getLatitude()
                double r14 = r3.getLongitude()
                r10 = r4
                r9.mo1474a(r10, r12, r14)
                int r9 = r6.f1176c
                if (r9 != r8) goto L_0x009f
                r7 = 1
            L_0x009f:
                long r14 = r6.f1175b
                long r12 = r6.f1174a
                long r10 = r4 + r16
                double r16 = r3.getLatitude()
                double r18 = r3.getLongitude()
                r9 = r6
                r20 = r12
                r12 = r16
                r16 = r14
                r14 = r18
                r9.mo1474a(r10, r12, r14)
                long r9 = r6.f1175b
                r11 = 0
                r13 = -1
                int r3 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
                if (r3 == 0) goto L_0x00dc
                int r3 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                if (r3 != 0) goto L_0x00c8
                goto L_0x00dc
            L_0x00c8:
                int r3 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r3 <= 0) goto L_0x00ce
                long r9 = r9 + r11
                goto L_0x00d7
            L_0x00ce:
                int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
                if (r3 <= 0) goto L_0x00d5
                long r9 = r20 + r11
                goto L_0x00d7
            L_0x00d5:
                long r9 = r16 + r11
            L_0x00d7:
                r3 = 60000(0xea60, double:2.9644E-319)
                long r9 = r9 + r3
                goto L_0x00e0
            L_0x00dc:
                r9 = 43200000(0x2932e00, double:2.1343636E-316)
                long r9 = r9 + r4
            L_0x00e0:
                r1.f1317a = r7
                r1.f1318b = r9
                goto L_0x0017
            L_0x00e6:
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00f7
                r2 = 22
                if (r1 < r2) goto L_0x00f8
            L_0x00f7:
                r7 = 1
            L_0x00f8:
                r1 = r7
            L_0x00f9:
                if (r1 == 0) goto L_0x00fc
                r8 = 2
            L_0x00fc:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.C1089h.mo4358c():int");
        }

        /* renamed from: d */
        public void mo4359d() {
            C1079s.this.mo4343z();
        }
    }

    /* renamed from: s$i */
    public class C1090i extends ContentFrameLayout {
        public C1090i(Context context) {
            super(context, (AttributeSet) null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C1079s.this.mo4323G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    C1079s sVar = C1079s.this;
                    sVar.mo4321E(sVar.mo4330N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0399e0.m1530b(getContext(), i));
        }
    }

    /* renamed from: s$j */
    public static final class C1091j {

        /* renamed from: a */
        public int f4117a;

        /* renamed from: b */
        public int f4118b;

        /* renamed from: c */
        public int f4119c;

        /* renamed from: d */
        public int f4120d;

        /* renamed from: e */
        public ViewGroup f4121e;

        /* renamed from: f */
        public View f4122f;

        /* renamed from: g */
        public View f4123g;

        /* renamed from: h */
        public C1435z0 f4124h;

        /* renamed from: i */
        public C1331x0 f4125i;

        /* renamed from: j */
        public Context f4126j;

        /* renamed from: k */
        public boolean f4127k;

        /* renamed from: l */
        public boolean f4128l;

        /* renamed from: m */
        public boolean f4129m;

        /* renamed from: n */
        public boolean f4130n;

        /* renamed from: o */
        public boolean f4131o = false;

        /* renamed from: p */
        public boolean f4132p;

        /* renamed from: q */
        public Bundle f4133q;

        public C1091j(int i) {
            this.f4117a = i;
        }

        /* renamed from: a */
        public void mo4366a(C1435z0 z0Var) {
            C1331x0 x0Var;
            C1435z0 z0Var2 = this.f4124h;
            if (z0Var != z0Var2) {
                if (z0Var2 != null) {
                    z0Var2.mo5261u(this.f4125i);
                }
                this.f4124h = z0Var;
                if (z0Var != null && (x0Var = this.f4125i) != null) {
                    z0Var.mo5235b(x0Var, z0Var.f5225a);
                }
            }
        }
    }

    /* renamed from: s$k */
    public final class C1092k implements C0449f1.C0450a {
        public C1092k() {
        }

        /* renamed from: b */
        public void mo10b(C1435z0 z0Var, boolean z) {
            C1435z0 k = z0Var.mo3482k();
            boolean z2 = k != z0Var;
            C1079s sVar = C1079s.this;
            if (z2) {
                z0Var = k;
            }
            C1091j L = sVar.mo4328L(z0Var);
            if (L == null) {
                return;
            }
            if (z2) {
                C1079s.this.mo4319C(L.f4117a, L, k);
                C1079s.this.mo4321E(L, true);
                return;
            }
            C1079s.this.mo4321E(L, z);
        }

        /* renamed from: c */
        public boolean mo11c(C1435z0 z0Var) {
            Window.Callback O;
            if (z0Var != z0Var.mo3482k()) {
                return true;
            }
            C1079s sVar = C1079s.this;
            if (!sVar.f4101z || (O = sVar.mo4331O()) == null || C1079s.this.f4065L) {
                return true;
            }
            O.onMenuOpened(108, z0Var);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f4049a0 = z2;
        if (i >= 17) {
            z = true;
        }
        f4052d0 = z;
        if (z2 && !f4053e0) {
            Thread.setDefaultUncaughtExceptionHandler(new C1080a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1079s(android.content.Context r4, android.view.Window r5, p000.C0994q r6, java.lang.Object r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4094s = r0
            r1 = -100
            r3.f4066M = r1
            s$b r2 = new s$b
            r2.<init>()
            r3.f4074U = r2
            r3.f4080e = r4
            r3.f4083h = r6
            r3.f4079d = r7
            boolean r6 = r7 instanceof android.app.Dialog
            if (r6 == 0) goto L_0x003c
        L_0x001b:
            if (r4 == 0) goto L_0x002f
            boolean r6 = r4 instanceof p000.C0947p
            if (r6 == 0) goto L_0x0024
            p r4 = (p000.C0947p) r4
            goto L_0x0030
        L_0x0024:
            boolean r6 = r4 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L_0x002f
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L_0x001b
        L_0x002f:
            r4 = r0
        L_0x0030:
            if (r4 == 0) goto L_0x003c
            r r4 = r4.mo3900p()
            int r4 = r4.mo4146f()
            r3.f4066M = r4
        L_0x003c:
            int r4 = r3.f4066M
            if (r4 != r1) goto L_0x0067
            j4<java.lang.String, java.lang.Integer> r4 = f4048Z
            java.lang.Object r6 = r3.f4079d
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r4.getOrDefault(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0067
            int r6 = r6.intValue()
            r3.f4066M = r6
            java.lang.Object r6 = r3.f4079d
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4.remove(r6)
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r3.mo4318B(r5)
        L_0x006c:
            p000.C1231v1.m3415e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.<init>(android.content.Context, android.view.Window, q, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.Map} */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0242, code lost:
        if (r2 != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0247, code lost:
        if (r1.f4064K != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013a, code lost:
        if (r0 != false) goto L_0x013f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0144 A[ADDED_TO_REGION] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4317A(boolean r19) {
        /*
            r18 = this;
            r1 = r18
            boolean r0 = r1.f4065L
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r1.f4066M
            r3 = -100
            if (r0 == r3) goto L_0x000f
            r3 = r0
        L_0x000f:
            android.content.Context r0 = r1.f4080e
            int r0 = r1.mo4334R(r0, r3)
            android.content.Context r4 = r1.f4080e
            r5 = 0
            android.content.res.Configuration r0 = r1.mo4322F(r4, r0, r5)
            boolean r4 = r1.f4069P
            r6 = 24
            r7 = 1
            if (r4 != 0) goto L_0x0063
            java.lang.Object r4 = r1.f4079d
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L_0x0063
            android.content.Context r4 = r1.f4080e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            if (r4 != 0) goto L_0x0033
            r4 = 0
            goto L_0x0067
        L_0x0033:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0061 }
            r9 = 29
            if (r8 < r9) goto L_0x003c
            r8 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0042
        L_0x003c:
            if (r8 < r6) goto L_0x0041
            r8 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0042
        L_0x0041:
            r8 = 0
        L_0x0042:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.Context r10 = r1.f4080e     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.Object r11 = r1.f4079d     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.Class r11 = r11.getClass()     // Catch:{ NameNotFoundException -> 0x0061 }
            r9.<init>(r10, r11)     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.pm.ActivityInfo r4 = r4.getActivityInfo(r9, r8)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r4 == 0) goto L_0x005d
            int r4 = r4.configChanges     // Catch:{ NameNotFoundException -> 0x0061 }
            r4 = r4 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x005d
            r4 = 1
            goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            r1.f4068O = r4     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0063
        L_0x0061:
            r1.f4068O = r2
        L_0x0063:
            r1.f4069P = r7
            boolean r4 = r1.f4068O
        L_0x0067:
            android.content.Context r8 = r1.f4080e
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.uiMode
            r8 = r8 & 48
            int r0 = r0.uiMode
            r9 = r0 & 48
            r11 = 28
            if (r8 == r9) goto L_0x0141
            if (r19 == 0) goto L_0x0141
            if (r4 != 0) goto L_0x0141
            boolean r0 = r1.f4062I
            if (r0 == 0) goto L_0x0141
            boolean r0 = f4051c0
            if (r0 != 0) goto L_0x008d
            boolean r0 = r1.f4063J
            if (r0 == 0) goto L_0x0141
        L_0x008d:
            java.lang.Object r0 = r1.f4079d
            boolean r12 = r0 instanceof android.app.Activity
            if (r12 == 0) goto L_0x0141
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChild()
            if (r0 != 0) goto L_0x0141
            java.lang.Object r0 = r1.f4079d
            r12 = r0
            android.app.Activity r12 = (android.app.Activity) r12
            int r0 = p000.C1099s5.f4160c
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r11) goto L_0x00a8
            goto L_0x013c
        L_0x00a8:
            java.lang.Class<?> r13 = p000.C1293w5.f4916a
            if (r0 < r11) goto L_0x00b1
            r12.recreate()
            goto L_0x012b
        L_0x00b1:
            boolean r0 = p000.C1293w5.m3607a()
            if (r0 == 0) goto L_0x00bd
            java.lang.reflect.Method r0 = p000.C1293w5.f4921f
            if (r0 != 0) goto L_0x00bd
            goto L_0x0139
        L_0x00bd:
            java.lang.reflect.Method r0 = p000.C1293w5.f4920e
            if (r0 != 0) goto L_0x00c7
            java.lang.reflect.Method r0 = p000.C1293w5.f4919d
            if (r0 != 0) goto L_0x00c7
            goto L_0x0139
        L_0x00c7:
            java.lang.reflect.Field r0 = p000.C1293w5.f4918c     // Catch:{ all -> 0x0139 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0139 }
            if (r0 != 0) goto L_0x00d0
            goto L_0x0139
        L_0x00d0:
            java.lang.reflect.Field r13 = p000.C1293w5.f4917b     // Catch:{ all -> 0x0139 }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ all -> 0x0139 }
            if (r13 != 0) goto L_0x00d9
            goto L_0x0139
        L_0x00d9:
            android.app.Application r14 = r12.getApplication()     // Catch:{ all -> 0x0139 }
            w5$a r15 = new w5$a     // Catch:{ all -> 0x0139 }
            r15.<init>(r12)     // Catch:{ all -> 0x0139 }
            r14.registerActivityLifecycleCallbacks(r15)     // Catch:{ all -> 0x0139 }
            android.os.Handler r6 = p000.C1293w5.f4922g     // Catch:{ all -> 0x0139 }
            t5 r11 = new t5     // Catch:{ all -> 0x0139 }
            r11.<init>(r15, r0)     // Catch:{ all -> 0x0139 }
            r6.post(r11)     // Catch:{ all -> 0x0139 }
            boolean r11 = p000.C1293w5.m3607a()     // Catch:{ all -> 0x012d }
            if (r11 == 0) goto L_0x0120
            java.lang.reflect.Method r11 = p000.C1293w5.f4921f     // Catch:{ all -> 0x012d }
            r10 = 9
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x012d }
            r10[r2] = r0     // Catch:{ all -> 0x012d }
            r10[r7] = r5     // Catch:{ all -> 0x012d }
            r0 = 2
            r10[r0] = r5     // Catch:{ all -> 0x012d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x012d }
            r16 = 3
            r10[r16] = r0     // Catch:{ all -> 0x012d }
            r0 = 4
            java.lang.Boolean r17 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x012d }
            r10[r0] = r17     // Catch:{ all -> 0x012d }
            r0 = 5
            r10[r0] = r5     // Catch:{ all -> 0x012d }
            r0 = 6
            r10[r0] = r5     // Catch:{ all -> 0x012d }
            r0 = 7
            r10[r0] = r17     // Catch:{ all -> 0x012d }
            r0 = 8
            r10[r0] = r17     // Catch:{ all -> 0x012d }
            r11.invoke(r13, r10)     // Catch:{ all -> 0x012d }
            goto L_0x0123
        L_0x0120:
            r12.recreate()     // Catch:{ all -> 0x012d }
        L_0x0123:
            u5 r0 = new u5     // Catch:{ all -> 0x0139 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x0139 }
            r6.post(r0)     // Catch:{ all -> 0x0139 }
        L_0x012b:
            r0 = 1
            goto L_0x013a
        L_0x012d:
            r0 = move-exception
            android.os.Handler r6 = p000.C1293w5.f4922g     // Catch:{ all -> 0x0139 }
            u5 r10 = new u5     // Catch:{ all -> 0x0139 }
            r10.<init>(r14, r15)     // Catch:{ all -> 0x0139 }
            r6.post(r10)     // Catch:{ all -> 0x0139 }
            throw r0     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = 0
        L_0x013a:
            if (r0 != 0) goto L_0x013f
        L_0x013c:
            r12.recreate()
        L_0x013f:
            r0 = 1
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            if (r0 != 0) goto L_0x024d
            if (r8 == r9) goto L_0x024d
            android.content.Context r0 = r1.f4080e
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r6 = new android.content.res.Configuration
            android.content.res.Configuration r8 = r0.getConfiguration()
            r6.<init>(r8)
            android.content.res.Configuration r8 = r0.getConfiguration()
            int r8 = r8.uiMode
            r8 = r8 & -49
            r8 = r8 | r9
            r6.uiMode = r8
            r0.updateConfiguration(r6, r5)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            r10 = 23
            if (r8 >= r9) goto L_0x0208
            r9 = 28
            if (r8 < r9) goto L_0x0171
            goto L_0x0208
        L_0x0171:
            java.lang.String r9 = "mDrawableCache"
            r11 = 24
            if (r8 < r11) goto L_0x01bd
            boolean r8 = p000.C0398e.f1930h
            if (r8 != 0) goto L_0x018a
            java.lang.Class<android.content.res.Resources> r8 = android.content.res.Resources.class
            java.lang.String r11 = "mResourcesImpl"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r11)     // Catch:{ NoSuchFieldException -> 0x0188 }
            p000.C0398e.f1929g = r8     // Catch:{ NoSuchFieldException -> 0x0188 }
            r8.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x0188 }
        L_0x0188:
            p000.C0398e.f1930h = r7
        L_0x018a:
            java.lang.reflect.Field r8 = p000.C0398e.f1929g
            if (r8 != 0) goto L_0x0190
            goto L_0x0208
        L_0x0190:
            java.lang.Object r0 = r8.get(r0)     // Catch:{ IllegalAccessException -> 0x0195 }
            goto L_0x0196
        L_0x0195:
            r0 = r5
        L_0x0196:
            if (r0 != 0) goto L_0x019a
            goto L_0x0208
        L_0x019a:
            boolean r8 = p000.C0398e.f1924b
            if (r8 != 0) goto L_0x01ad
            java.lang.Class r8 = r0.getClass()     // Catch:{ NoSuchFieldException -> 0x01ab }
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch:{ NoSuchFieldException -> 0x01ab }
            p000.C0398e.f1923a = r8     // Catch:{ NoSuchFieldException -> 0x01ab }
            r8.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x01ab }
        L_0x01ab:
            p000.C0398e.f1924b = r7
        L_0x01ad:
            java.lang.reflect.Field r8 = p000.C0398e.f1923a
            if (r8 == 0) goto L_0x01b7
            java.lang.Object r5 = r8.get(r0)     // Catch:{ IllegalAccessException -> 0x01b6 }
            goto L_0x01b7
        L_0x01b6:
        L_0x01b7:
            if (r5 == 0) goto L_0x0208
            p000.C0398e.m1520d(r5)
            goto L_0x0208
        L_0x01bd:
            if (r8 < r10) goto L_0x01e1
            boolean r8 = p000.C0398e.f1924b
            if (r8 != 0) goto L_0x01d0
            java.lang.Class<android.content.res.Resources> r8 = android.content.res.Resources.class
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch:{ NoSuchFieldException -> 0x01ce }
            p000.C0398e.f1923a = r8     // Catch:{ NoSuchFieldException -> 0x01ce }
            r8.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x01ce }
        L_0x01ce:
            p000.C0398e.f1924b = r7
        L_0x01d0:
            java.lang.reflect.Field r8 = p000.C0398e.f1923a
            if (r8 == 0) goto L_0x01da
            java.lang.Object r5 = r8.get(r0)     // Catch:{ IllegalAccessException -> 0x01d9 }
            goto L_0x01da
        L_0x01d9:
        L_0x01da:
            if (r5 != 0) goto L_0x01dd
            goto L_0x0208
        L_0x01dd:
            p000.C0398e.m1520d(r5)
            goto L_0x0208
        L_0x01e1:
            r11 = 21
            if (r8 < r11) goto L_0x0208
            boolean r8 = p000.C0398e.f1924b
            if (r8 != 0) goto L_0x01f6
            java.lang.Class<android.content.res.Resources> r8 = android.content.res.Resources.class
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch:{ NoSuchFieldException -> 0x01f4 }
            p000.C0398e.f1923a = r8     // Catch:{ NoSuchFieldException -> 0x01f4 }
            r8.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x01f4 }
        L_0x01f4:
            p000.C0398e.f1924b = r7
        L_0x01f6:
            java.lang.reflect.Field r8 = p000.C0398e.f1923a
            if (r8 == 0) goto L_0x0208
            java.lang.Object r0 = r8.get(r0)     // Catch:{ IllegalAccessException -> 0x0202 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IllegalAccessException -> 0x0202 }
            r5 = r0
            goto L_0x0203
        L_0x0202:
        L_0x0203:
            if (r5 == 0) goto L_0x0208
            r5.clear()
        L_0x0208:
            int r0 = r1.f4067N
            if (r0 == 0) goto L_0x0220
            android.content.Context r5 = r1.f4080e
            r5.setTheme(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x0220
            android.content.Context r0 = r1.f4080e
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r5 = r1.f4067N
            r0.applyStyle(r5, r7)
        L_0x0220:
            if (r4 == 0) goto L_0x024e
            java.lang.Object r0 = r1.f4079d
            boolean r4 = r0 instanceof android.app.Activity
            if (r4 == 0) goto L_0x024e
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r4 = r0 instanceof p000.C0967pb
            if (r4 == 0) goto L_0x0245
            r4 = r0
            pb r4 = (p000.C0967pb) r4
            mb r4 = r4.mo124a()
            qb r4 = (p000.C1011qb) r4
            mb$b r4 = r4.f3809b
            mb$b r5 = p000.C0821mb.C0823b.STARTED
            int r4 = r4.compareTo(r5)
            if (r4 < 0) goto L_0x0242
            r2 = 1
        L_0x0242:
            if (r2 == 0) goto L_0x024e
            goto L_0x0249
        L_0x0245:
            boolean r2 = r1.f4064K
            if (r2 == 0) goto L_0x024e
        L_0x0249:
            r0.onConfigurationChanged(r6)
            goto L_0x024e
        L_0x024d:
            r7 = r0
        L_0x024e:
            if (r7 == 0) goto L_0x025b
            java.lang.Object r0 = r1.f4079d
            boolean r2 = r0 instanceof p000.C0947p
            if (r2 == 0) goto L_0x025b
            p r0 = (p000.C0947p) r0
            r0.mo3903s()
        L_0x025b:
            if (r3 != 0) goto L_0x0267
            android.content.Context r0 = r1.f4080e
            s$g r0 = r1.mo4329M(r0)
            r0.mo4361e()
            goto L_0x026e
        L_0x0267:
            s$g r0 = r1.f4070Q
            if (r0 == 0) goto L_0x026e
            r0.mo4360a()
        L_0x026e:
            r2 = 3
            if (r3 != r2) goto L_0x0284
            android.content.Context r0 = r1.f4080e
            s$g r2 = r1.f4071R
            if (r2 != 0) goto L_0x027e
            s$f r2 = new s$f
            r2.<init>(r0)
            r1.f4071R = r2
        L_0x027e:
            s$g r0 = r1.f4071R
            r0.mo4361e()
            goto L_0x028b
        L_0x0284:
            s$g r0 = r1.f4071R
            if (r0 == 0) goto L_0x028b
            r0.mo4360a()
        L_0x028b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.mo4317A(boolean):boolean");
    }

    /* renamed from: B */
    public final void mo4318B(Window window) {
        if (this.f4081f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C1085e)) {
                C1085e eVar = new C1085e(callback);
                this.f4082g = eVar;
                window.setCallback(eVar);
                C0555h3 p = C0555h3.m1824p(this.f4080e, (AttributeSet) null, f4050b0);
                Drawable h = p.mo3028h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                p.f2425b.recycle();
                this.f4081f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: C */
    public void mo4319C(int i, C1091j jVar, Menu menu) {
        if (menu == null && jVar != null) {
            menu = jVar.f4124h;
        }
        if ((jVar == null || jVar.f4129m) && !this.f4065L) {
            this.f4082g.f4135b.onPanelClosed(i, menu);
        }
    }

    /* renamed from: D */
    public void mo4320D(C1435z0 z0Var) {
        if (!this.f4058E) {
            this.f4058E = true;
            this.f4087l.mo241j();
            Window.Callback O = mo4331O();
            if (O != null && !this.f4065L) {
                O.onPanelClosed(108, z0Var);
            }
            this.f4058E = false;
        }
    }

    /* renamed from: E */
    public void mo4321E(C1091j jVar, boolean z) {
        ViewGroup viewGroup;
        C0802m2 m2Var;
        if (!z || jVar.f4117a != 0 || (m2Var = this.f4087l) == null || !m2Var.mo229e()) {
            WindowManager windowManager = (WindowManager) this.f4080e.getSystemService("window");
            if (!(windowManager == null || !jVar.f4129m || (viewGroup = jVar.f4121e) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo4319C(jVar.f4117a, jVar, (Menu) null);
                }
            }
            jVar.f4127k = false;
            jVar.f4128l = false;
            jVar.f4129m = false;
            jVar.f4122f = null;
            jVar.f4131o = true;
            if (this.f4060G == jVar) {
                this.f4060G = null;
                return;
            }
            return;
        }
        mo4320D(jVar.f4124h);
    }

    /* renamed from: F */
    public final Configuration mo4322F(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x011b, code lost:
        if (r7 != false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4323G(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4079d
            boolean r1 = r0 instanceof p000.C0259c8.C0260a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof p000.C1392y
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f4081f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p000.C0259c8.m1064a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            s$e r0 = r6.f4082g
            android.view.Window$Callback r0 = r0.f4135b
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0122
            s$j r0 = r6.mo4330N(r4)
            boolean r1 = r0.f4129m
            if (r1 != 0) goto L_0x0122
            r6.mo4337U(r0, r7)
            goto L_0x0122
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r6.f4061H = r2
        L_0x0062:
            r2 = 0
            goto L_0x0122
        L_0x0065:
            if (r0 == r5) goto L_0x00e6
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            l0 r0 = r6.f4090o
            if (r0 == 0) goto L_0x0070
            goto L_0x0122
        L_0x0070:
            s$j r0 = r6.mo4330N(r4)
            m2 r1 = r6.f4087l
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.mo230f()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.f4080e
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            m2 r1 = r6.f4087l
            boolean r1 = r1.mo229e()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.f4065L
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.mo4337U(r0, r7)
            if (r7 == 0) goto L_0x00ca
            m2 r7 = r6.f4087l
            boolean r7 = r7.mo223a()
            goto L_0x00d0
        L_0x00a3:
            m2 r7 = r6.f4087l
            boolean r7 = r7.mo232g()
            goto L_0x00d0
        L_0x00aa:
            boolean r1 = r0.f4129m
            if (r1 != 0) goto L_0x00cc
            boolean r3 = r0.f4128l
            if (r3 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.f4127k
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.f4132p
            if (r1 == 0) goto L_0x00c2
            r0.f4127k = r4
            boolean r1 = r6.mo4337U(r0, r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = 1
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.mo4335S(r0, r7)
            r7 = 1
            goto L_0x00d0
        L_0x00ca:
            r7 = 0
            goto L_0x00d0
        L_0x00cc:
            r6.mo4321E(r0, r2)
            r7 = r1
        L_0x00d0:
            if (r7 == 0) goto L_0x0122
            android.content.Context r7 = r6.f4080e
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x0122
            r7.playSoundEffect(r4)
            goto L_0x0122
        L_0x00e6:
            boolean r7 = r6.f4061H
            r6.f4061H = r4
            s$j r0 = r6.mo4330N(r4)
            boolean r1 = r0.f4129m
            if (r1 == 0) goto L_0x00f8
            if (r7 != 0) goto L_0x0122
            r6.mo4321E(r0, r2)
            goto L_0x0122
        L_0x00f8:
            l0 r7 = r6.f4090o
            if (r7 == 0) goto L_0x0100
            r7.mo2607c()
            goto L_0x011d
        L_0x0100:
            r6.mo4332P()
            g r7 = r6.f4084i
            if (r7 == 0) goto L_0x011f
            d0 r7 = (p000.C0356d0) r7
            n2 r0 = r7.f1846e
            if (r0 == 0) goto L_0x011a
            boolean r0 = r0.mo3371m()
            if (r0 == 0) goto L_0x011a
            n2 r7 = r7.f1846e
            r7.collapseActionView()
            r7 = 1
            goto L_0x011b
        L_0x011a:
            r7 = 0
        L_0x011b:
            if (r7 == 0) goto L_0x011f
        L_0x011d:
            r7 = 1
            goto L_0x0120
        L_0x011f:
            r7 = 0
        L_0x0120:
            if (r7 == 0) goto L_0x0062
        L_0x0122:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.mo4323G(android.view.KeyEvent):boolean");
    }

    /* renamed from: H */
    public void mo4324H(int i) {
        C1091j N = mo4330N(i);
        if (N.f4124h != null) {
            Bundle bundle = new Bundle();
            N.f4124h.mo5263w(bundle);
            if (bundle.size() > 0) {
                N.f4133q = bundle;
            }
            N.f4124h.mo5266z();
            N.f4124h.clear();
        }
        N.f4132p = true;
        N.f4131o = true;
        if ((i == 108 || i == 0) && this.f4087l != null) {
            C1091j N2 = mo4330N(0);
            N2.f4127k = false;
            mo4337U(N2, (KeyEvent) null);
        }
    }

    /* renamed from: I */
    public void mo4325I() {
        C1049r8 r8Var = this.f4094s;
        if (r8Var != null) {
            r8Var.mo4212b();
        }
    }

    /* renamed from: J */
    public final void mo4326J() {
        ViewGroup viewGroup;
        if (!this.f4095t) {
            TypedArray obtainStyledAttributes = this.f4080e.obtainStyledAttributes(C0440f.f2056j);
            if (obtainStyledAttributes.hasValue(115)) {
                if (obtainStyledAttributes.getBoolean(124, false)) {
                    mo4159t(1);
                } else if (obtainStyledAttributes.getBoolean(115, false)) {
                    mo4159t(108);
                }
                if (obtainStyledAttributes.getBoolean(116, false)) {
                    mo4159t(109);
                }
                if (obtainStyledAttributes.getBoolean(117, false)) {
                    mo4159t(10);
                }
                this.f4056C = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                mo4327K();
                this.f4081f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f4080e);
                if (this.f4057D) {
                    viewGroup = (ViewGroup) from.inflate(this.f4055B ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.f4056C) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f4054A = false;
                    this.f4101z = false;
                } else if (this.f4101z) {
                    TypedValue typedValue = new TypedValue();
                    this.f4080e.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0853n0(this.f4080e, typedValue.resourceId) : this.f4080e).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    C0802m2 m2Var = (C0802m2) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f4087l = m2Var;
                    m2Var.setWindowCallback(mo4331O());
                    if (this.f4054A) {
                        this.f4087l.mo239h(109);
                    }
                    if (this.f4099x) {
                        this.f4087l.mo239h(2);
                    }
                    if (this.f4100y) {
                        this.f4087l.mo239h(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 21) {
                        C0813m8.m2463L(viewGroup, new C1137t(this));
                    } else if (viewGroup instanceof C0999q2) {
                        ((C0999q2) viewGroup).setOnFitSystemWindowsListener(new C1186u(this));
                    }
                    if (this.f4087l == null) {
                        this.f4097v = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = C0856n3.f3335a;
                    if (i >= 16) {
                        try {
                            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                            if (!method2.isAccessible()) {
                                method2.setAccessible(true);
                            }
                            method2.invoke(viewGroup, new Object[0]);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f4081f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f4081f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C1229v(this));
                    this.f4096u = viewGroup;
                    Object obj = this.f4079d;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4086k;
                    if (!TextUtils.isEmpty(title)) {
                        C0802m2 m2Var2 = this.f4087l;
                        if (m2Var2 != null) {
                            m2Var2.setWindowTitle(title);
                        } else {
                            C0496g gVar = this.f4084i;
                            if (gVar != null) {
                                ((C0356d0) gVar).f1846e.setWindowTitle(title);
                            } else {
                                TextView textView = this.f4097v;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4096u.findViewById(16908290);
                    View decorView = this.f4081f.getDecorView();
                    contentFrameLayout2.f331h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (C0813m8.m2486t(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f4080e.obtainStyledAttributes(C0440f.f2056j);
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(118)) {
                        obtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(119)) {
                        obtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f4095t = true;
                    C1091j N = mo4330N(0);
                    if (!this.f4065L && N.f4124h == null) {
                        mo4333Q(108);
                        return;
                    }
                    return;
                }
                StringBuilder c = C0279ch.m1106c("AppCompat does not support the current theme features: { windowActionBar: ");
                c.append(this.f4101z);
                c.append(", windowActionBarOverlay: ");
                c.append(this.f4054A);
                c.append(", android:windowIsFloating: ");
                c.append(this.f4056C);
                c.append(", windowActionModeOverlay: ");
                c.append(this.f4055B);
                c.append(", windowNoTitle: ");
                c.append(this.f4057D);
                c.append(" }");
                throw new IllegalArgumentException(c.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: K */
    public final void mo4327K() {
        if (this.f4081f == null) {
            Object obj = this.f4079d;
            if (obj instanceof Activity) {
                mo4318B(((Activity) obj).getWindow());
            }
        }
        if (this.f4081f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: L */
    public C1091j mo4328L(Menu menu) {
        C1091j[] jVarArr = this.f4059F;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C1091j jVar = jVarArr[i];
            if (jVar != null && jVar.f4124h == menu) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final C1087g mo4329M(Context context) {
        if (this.f4070Q == null) {
            if (C0244c0.f1313d == null) {
                Context applicationContext = context.getApplicationContext();
                C0244c0.f1313d = new C0244c0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4070Q = new C1089h(C0244c0.f1313d);
        }
        return this.f4070Q;
    }

    /* renamed from: N */
    public C1091j mo4330N(int i) {
        C1091j[] jVarArr = this.f4059F;
        if (jVarArr == null || jVarArr.length <= i) {
            C1091j[] jVarArr2 = new C1091j[(i + 1)];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.f4059F = jVarArr2;
            jVarArr = jVarArr2;
        }
        C1091j jVar = jVarArr[i];
        if (jVar != null) {
            return jVar;
        }
        C1091j jVar2 = new C1091j(i);
        jVarArr[i] = jVar2;
        return jVar2;
    }

    /* renamed from: O */
    public final Window.Callback mo4331O() {
        return this.f4081f.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4332P() {
        /*
            r3 = this;
            r3.mo4326J()
            boolean r0 = r3.f4101z
            if (r0 == 0) goto L_0x0037
            g r0 = r3.f4084i
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f4079d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            d0 r0 = new d0
            java.lang.Object r1 = r3.f4079d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f4054A
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f4084i = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            d0 r0 = new d0
            java.lang.Object r1 = r3.f4079d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            g r0 = r3.f4084i
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f4075V
            r0.mo2601c(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.mo4332P():void");
    }

    /* renamed from: Q */
    public final void mo4333Q(int i) {
        this.f4073T = (1 << i) | this.f4073T;
        if (!this.f4072S) {
            C0813m8.m2491y(this.f4081f.getDecorView(), this.f4074U);
            this.f4072S = true;
        }
    }

    /* renamed from: R */
    public int mo4334R(Context context, int i) {
        C1087g M;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.f4071R == null) {
                            this.f4071R = new C1086f(context);
                        }
                        M = this.f4071R;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                M = mo4329M(context);
            }
            return M.mo4358c();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0154, code lost:
        if (r14 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4335S(p000.C1079s.C1091j r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f4129m
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r12.f4065L
            if (r0 == 0) goto L_0x000a
            goto L_0x01d5
        L_0x000a:
            int r0 = r13.f4117a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f4080e
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.mo4331O()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.f4117a
            z0 r4 = r13.f4124h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.mo4321E(r13, r1)
            return
        L_0x003b:
            android.content.Context r0 = r12.f4080e
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.mo4337U(r13, r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f4121e
            r3 = -2
            r4 = -1
            if (r14 == 0) goto L_0x006b
            boolean r5 = r13.f4131o
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r14 = r13.f4123g
            if (r14 == 0) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x01b2
            int r14 = r14.width
            if (r14 != r4) goto L_0x01b2
            r5 = -1
            goto L_0x01b3
        L_0x006b:
            if (r14 != 0) goto L_0x00e3
            r12.mo4332P()
            g r14 = r12.f4084i
            if (r14 == 0) goto L_0x0079
            android.content.Context r14 = r14.mo2600b()
            goto L_0x007a
        L_0x0079:
            r14 = 0
        L_0x007a:
            if (r14 != 0) goto L_0x007e
            android.content.Context r14 = r12.f4080e
        L_0x007e:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r14.getTheme()
            r5.setTo(r6)
            r6 = 2130903042(0x7f030002, float:1.741289E38)
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x009f
            r5.applyStyle(r6, r1)
        L_0x009f:
            r6 = 2130903568(0x7f030210, float:1.7413958E38)
            r5.resolveAttribute(r6, r4, r1)
            int r4 = r4.resourceId
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r4 = 2131755426(0x7f1001a2, float:1.914173E38)
        L_0x00ad:
            r5.applyStyle(r4, r1)
            n0 r4 = new n0
            r4.<init>(r14, r2)
            android.content.res.Resources$Theme r14 = r4.getTheme()
            r14.setTo(r5)
            r13.f4126j = r4
            int[] r14 = p000.C0440f.f2056j
            android.content.res.TypedArray r14 = r4.obtainStyledAttributes(r14)
            r4 = 84
            int r4 = r14.getResourceId(r4, r2)
            r13.f4118b = r4
            int r4 = r14.getResourceId(r1, r2)
            r13.f4120d = r4
            r14.recycle()
            s$i r14 = new s$i
            android.content.Context r4 = r13.f4126j
            r14.<init>(r4)
            r13.f4121e = r14
            r14 = 81
            r13.f4119c = r14
            goto L_0x00f2
        L_0x00e3:
            boolean r4 = r13.f4131o
            if (r4 == 0) goto L_0x00f2
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00f2
            android.view.ViewGroup r14 = r13.f4121e
            r14.removeAllViews()
        L_0x00f2:
            android.view.View r14 = r13.f4123g
            if (r14 == 0) goto L_0x00f9
            r13.f4122f = r14
            goto L_0x0156
        L_0x00f9:
            z0 r14 = r13.f4124h
            if (r14 != 0) goto L_0x00fe
            goto L_0x0158
        L_0x00fe:
            s$k r14 = r12.f4089n
            if (r14 != 0) goto L_0x0109
            s$k r14 = new s$k
            r14.<init>()
            r12.f4089n = r14
        L_0x0109:
            s$k r14 = r12.f4089n
            x0 r4 = r13.f4125i
            if (r4 != 0) goto L_0x0124
            x0 r4 = new x0
            android.content.Context r5 = r13.f4126j
            r6 = 2131427344(0x7f0b0010, float:1.8476302E38)
            r4.<init>(r5, r6)
            r13.f4125i = r4
            r4.f4995f = r14
            z0 r14 = r13.f4124h
            android.content.Context r5 = r14.f5225a
            r14.mo5235b(r4, r5)
        L_0x0124:
            x0 r14 = r13.f4125i
            android.view.ViewGroup r4 = r13.f4121e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r14.f4994e
            if (r5 != 0) goto L_0x0150
            android.view.LayoutInflater r5 = r14.f4992c
            r6 = 2131427341(0x7f0b000d, float:1.8476296E38)
            android.view.View r4 = r5.inflate(r6, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r14.f4994e = r4
            x0$a r4 = r14.f4996g
            if (r4 != 0) goto L_0x0144
            x0$a r4 = new x0$a
            r4.<init>()
            r14.f4996g = r4
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f4994e
            x0$a r5 = r14.f4996g
            r4.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f4994e
            r4.setOnItemClickListener(r14)
        L_0x0150:
            androidx.appcompat.view.menu.ExpandedMenuView r14 = r14.f4994e
            r13.f4122f = r14
            if (r14 == 0) goto L_0x0158
        L_0x0156:
            r14 = 1
            goto L_0x0159
        L_0x0158:
            r14 = 0
        L_0x0159:
            if (r14 == 0) goto L_0x01d3
            android.view.View r14 = r13.f4122f
            if (r14 != 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            android.view.View r14 = r13.f4123g
            if (r14 == 0) goto L_0x0165
            goto L_0x0173
        L_0x0165:
            x0 r14 = r13.f4125i
            android.widget.ListAdapter r14 = r14.mo5023a()
            x0$a r14 = (p000.C1331x0.C1332a) r14
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x0175
        L_0x0173:
            r14 = 1
            goto L_0x0176
        L_0x0175:
            r14 = 0
        L_0x0176:
            if (r14 != 0) goto L_0x0179
            goto L_0x01d3
        L_0x0179:
            android.view.View r14 = r13.f4122f
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x0186:
            int r4 = r13.f4118b
            android.view.ViewGroup r5 = r13.f4121e
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f4122f
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x019e
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f4122f
            r4.removeView(r5)
        L_0x019e:
            android.view.ViewGroup r4 = r13.f4121e
            android.view.View r5 = r13.f4122f
            r4.addView(r5, r14)
            android.view.View r14 = r13.f4122f
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x01b2
            android.view.View r14 = r13.f4122f
            r14.requestFocus()
        L_0x01b2:
            r5 = -2
        L_0x01b3:
            r13.f4128l = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            r7 = 0
            r8 = 0
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.f4119c
            r14.gravity = r2
            int r2 = r13.f4120d
            r14.windowAnimations = r2
            android.view.ViewGroup r2 = r13.f4121e
            r0.addView(r2, r14)
            r13.f4129m = r1
            return
        L_0x01d3:
            r13.f4131o = r1
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.mo4335S(s$j, android.view.KeyEvent):void");
    }

    /* renamed from: T */
    public final boolean mo4336T(C1091j jVar, int i, KeyEvent keyEvent, int i2) {
        C1435z0 z0Var;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.f4127k || mo4337U(jVar, keyEvent)) && (z0Var = jVar.f4124h) != null) {
            z = z0Var.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f4087l == null) {
            mo4321E(jVar, true);
        }
        return z;
    }

    /* renamed from: U */
    public final boolean mo4337U(C1091j jVar, KeyEvent keyEvent) {
        C0802m2 m2Var;
        C0802m2 m2Var2;
        C0802m2 m2Var3;
        Resources.Theme theme;
        C0802m2 m2Var4;
        if (this.f4065L) {
            return false;
        }
        if (jVar.f4127k) {
            return true;
        }
        C1091j jVar2 = this.f4060G;
        if (!(jVar2 == null || jVar2 == jVar)) {
            mo4321E(jVar2, false);
        }
        Window.Callback O = mo4331O();
        if (O != null) {
            jVar.f4123g = O.onCreatePanelView(jVar.f4117a);
        }
        int i = jVar.f4117a;
        boolean z = i == 0 || i == 108;
        if (z && (m2Var4 = this.f4087l) != null) {
            m2Var4.mo227d();
        }
        if (jVar.f4123g == null) {
            C1435z0 z0Var = jVar.f4124h;
            if (z0Var == null || jVar.f4132p) {
                if (z0Var == null) {
                    Context context = this.f4080e;
                    int i2 = jVar.f4117a;
                    if ((i2 == 0 || i2 == 108) && this.f4087l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0853n0 n0Var = new C0853n0(context, 0);
                            n0Var.getTheme().setTo(theme);
                            context = n0Var;
                        }
                    }
                    C1435z0 z0Var2 = new C1435z0(context);
                    z0Var2.f5229e = this;
                    jVar.mo4366a(z0Var2);
                    if (jVar.f4124h == null) {
                        return false;
                    }
                }
                if (z && (m2Var3 = this.f4087l) != null) {
                    if (this.f4088m == null) {
                        this.f4088m = new C1082c();
                    }
                    m2Var3.mo224b(jVar.f4124h, this.f4088m);
                }
                jVar.f4124h.mo5266z();
                if (!O.onCreatePanelMenu(jVar.f4117a, jVar.f4124h)) {
                    jVar.mo4366a((C1435z0) null);
                    if (z && (m2Var2 = this.f4087l) != null) {
                        m2Var2.mo224b((Menu) null, this.f4088m);
                    }
                    return false;
                }
                jVar.f4132p = false;
            }
            jVar.f4124h.mo5266z();
            Bundle bundle = jVar.f4133q;
            if (bundle != null) {
                jVar.f4124h.mo5262v(bundle);
                jVar.f4133q = null;
            }
            if (!O.onPreparePanel(0, jVar.f4123g, jVar.f4124h)) {
                if (z && (m2Var = this.f4087l) != null) {
                    m2Var.mo224b((Menu) null, this.f4088m);
                }
                jVar.f4124h.mo5265y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.f4130n = z2;
            jVar.f4124h.setQwertyMode(z2);
            jVar.f4124h.mo5265y();
        }
        jVar.f4127k = true;
        jVar.f4128l = false;
        this.f4060G = jVar;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f4096u;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4338V() {
        /*
            r1 = this;
            boolean r0 = r1.f4095t
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f4096u
            if (r0 == 0) goto L_0x0010
            boolean r0 = p000.C0813m8.m2486t(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.mo4338V():boolean");
    }

    /* renamed from: W */
    public final void mo4339W() {
        if (this.f4095t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: X */
    public final int mo4340X(C1241v8 v8Var, Rect rect) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4 = 0;
        int d = v8Var != null ? v8Var.mo4844d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f4091p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f4091p.getLayoutParams();
            boolean z3 = true;
            if (this.f4091p.isShown()) {
                if (this.f4076W == null) {
                    this.f4076W = new Rect();
                    this.f4077X = new Rect();
                }
                Rect rect2 = this.f4076W;
                Rect rect3 = this.f4077X;
                if (v8Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(v8Var.mo4842b(), v8Var.mo4844d(), v8Var.mo4843c(), v8Var.mo4841a());
                }
                ViewGroup viewGroup = this.f4096u;
                Method method = C0856n3.f3335a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect2, rect3});
                    } catch (Exception unused) {
                    }
                }
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                ViewGroup viewGroup2 = this.f4096u;
                Field field = C0813m8.f3234a;
                C1241v8 h = Build.VERSION.SDK_INT >= 23 ? C1241v8.m3464h(viewGroup2.getRootWindowInsets()) : null;
                if (h == null) {
                    i = 0;
                } else {
                    i = h.mo4842b();
                }
                int c = h == null ? 0 : h.mo4843c();
                if (marginLayoutParams2.topMargin == i5 && marginLayoutParams2.leftMargin == i6 && marginLayoutParams2.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i5;
                    marginLayoutParams2.leftMargin = i6;
                    marginLayoutParams2.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.f4098w != null) {
                    View view = this.f4098w;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i3 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == c))) {
                        marginLayoutParams.height = i3;
                        marginLayoutParams.leftMargin = i;
                        marginLayoutParams.rightMargin = c;
                        this.f4098w.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f4080e);
                    this.f4098w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = c;
                    this.f4096u.addView(this.f4098w, -1, layoutParams);
                }
                View view3 = this.f4098w;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f4098w;
                    if ((C0813m8.m2484r(view4) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        context = this.f4080e;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f4080e;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(C0408e6.m1547a(context, i2));
                }
                if (!this.f4055B && z) {
                    d = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f4091p.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.f4098w;
        if (view5 != null) {
            if (!z) {
                i4 = 8;
            }
            view5.setVisibility(i4);
        }
        return d;
    }

    /* renamed from: a */
    public void mo307a(C1435z0 z0Var) {
        C0802m2 m2Var = this.f4087l;
        if (m2Var == null || !m2Var.mo230f() || (ViewConfiguration.get(this.f4080e).hasPermanentMenuKey() && !this.f4087l.mo225c())) {
            C1091j N = mo4330N(0);
            N.f4131o = true;
            mo4321E(N, false);
            mo4335S(N, (KeyEvent) null);
            return;
        }
        Window.Callback O = mo4331O();
        if (this.f4087l.mo229e()) {
            this.f4087l.mo232g();
            if (!this.f4065L) {
                O.onPanelClosed(108, mo4330N(0).f4124h);
            }
        } else if (O != null && !this.f4065L) {
            if (this.f4072S && (1 & this.f4073T) != 0) {
                this.f4081f.getDecorView().removeCallbacks(this.f4074U);
                this.f4074U.run();
            }
            C1091j N2 = mo4330N(0);
            C1435z0 z0Var2 = N2.f4124h;
            if (z0Var2 != null && !N2.f4132p && O.onPreparePanel(0, N2.f4123g, z0Var2)) {
                O.onMenuOpened(108, N2.f4124h);
                this.f4087l.mo223a();
            }
        }
    }

    /* renamed from: b */
    public boolean mo308b(C1435z0 z0Var, MenuItem menuItem) {
        C1091j L;
        Window.Callback O = mo4331O();
        if (O == null || this.f4065L || (L = mo4328L(z0Var.mo3482k())) == null) {
            return false;
        }
        return O.onMenuItemSelected(L.f4117a, menuItem);
    }

    /* renamed from: c */
    public void mo4143c(View view, ViewGroup.LayoutParams layoutParams) {
        mo4326J();
        ((ViewGroup) this.f4096u.findViewById(16908290)).addView(view, layoutParams);
        this.f4082g.f4135b.onContentChanged();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x01c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x01cf */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context mo4144d(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            r9.f4062I = r0
            int r1 = r9.f4066M
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            r1 = -100
        L_0x000c:
            int r1 = r9.mo4334R(r10, r1)
            boolean r2 = f4052d0
            r3 = 0
            if (r2 == 0) goto L_0x0025
            boolean r2 = r10 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0025
            android.content.res.Configuration r2 = r9.mo4322F(r10, r1, r3)
            r4 = r10
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0024 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0024 }
            return r10
        L_0x0024:
        L_0x0025:
            boolean r2 = r10 instanceof p000.C0853n0
            if (r2 == 0) goto L_0x0035
            android.content.res.Configuration r2 = r9.mo4322F(r10, r1, r3)
            r4 = r10
            n0 r4 = (p000.C0853n0) r4     // Catch:{ IllegalStateException -> 0x0034 }
            r4.mo3722a(r2)     // Catch:{ IllegalStateException -> 0x0034 }
            return r10
        L_0x0034:
        L_0x0035:
            boolean r2 = f4051c0
            if (r2 != 0) goto L_0x003a
            return r10
        L_0x003a:
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01d7 }
            android.content.pm.ApplicationInfo r4 = r10.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x01d7 }
            android.content.res.Resources r2 = r2.getResourcesForApplication(r4)     // Catch:{ NameNotFoundException -> 0x01d7 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ NameNotFoundException -> 0x01d7 }
            android.content.res.Resources r4 = r10.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            boolean r5 = r2.equals(r4)
            if (r5 != 0) goto L_0x017f
            android.content.res.Configuration r5 = new android.content.res.Configuration
            r5.<init>()
            r6 = 0
            r5.fontScale = r6
            if (r4 == 0) goto L_0x0180
            int r6 = r2.diff(r4)
            if (r6 != 0) goto L_0x006a
            goto L_0x0180
        L_0x006a:
            float r6 = r2.fontScale
            float r7 = r4.fontScale
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0074
            r5.fontScale = r7
        L_0x0074:
            int r6 = r2.mcc
            int r7 = r4.mcc
            if (r6 == r7) goto L_0x007c
            r5.mcc = r7
        L_0x007c:
            int r6 = r2.mnc
            int r7 = r4.mnc
            if (r6 == r7) goto L_0x0084
            r5.mnc = r7
        L_0x0084:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 24
            if (r6 < r7) goto L_0x00a0
            android.os.LocaleList r7 = r2.getLocales()
            android.os.LocaleList r8 = r4.getLocales()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00ae
            r5.setLocales(r8)
            java.util.Locale r7 = r4.locale
            r5.locale = r7
            goto L_0x00ae
        L_0x00a0:
            java.util.Locale r7 = r2.locale
            java.util.Locale r8 = r4.locale
            boolean r7 = p000.C1344x5.m3773r(r7, r8)
            if (r7 != 0) goto L_0x00ae
            java.util.Locale r7 = r4.locale
            r5.locale = r7
        L_0x00ae:
            int r7 = r2.touchscreen
            int r8 = r4.touchscreen
            if (r7 == r8) goto L_0x00b6
            r5.touchscreen = r8
        L_0x00b6:
            int r7 = r2.keyboard
            int r8 = r4.keyboard
            if (r7 == r8) goto L_0x00be
            r5.keyboard = r8
        L_0x00be:
            int r7 = r2.keyboardHidden
            int r8 = r4.keyboardHidden
            if (r7 == r8) goto L_0x00c6
            r5.keyboardHidden = r8
        L_0x00c6:
            int r7 = r2.navigation
            int r8 = r4.navigation
            if (r7 == r8) goto L_0x00ce
            r5.navigation = r8
        L_0x00ce:
            int r7 = r2.navigationHidden
            int r8 = r4.navigationHidden
            if (r7 == r8) goto L_0x00d6
            r5.navigationHidden = r8
        L_0x00d6:
            int r7 = r2.orientation
            int r8 = r4.orientation
            if (r7 == r8) goto L_0x00de
            r5.orientation = r8
        L_0x00de:
            int r7 = r2.screenLayout
            r7 = r7 & 15
            int r8 = r4.screenLayout
            r8 = r8 & 15
            if (r7 == r8) goto L_0x00ed
            int r7 = r5.screenLayout
            r7 = r7 | r8
            r5.screenLayout = r7
        L_0x00ed:
            int r7 = r2.screenLayout
            r7 = r7 & 192(0xc0, float:2.69E-43)
            int r8 = r4.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r7 == r8) goto L_0x00fc
            int r7 = r5.screenLayout
            r7 = r7 | r8
            r5.screenLayout = r7
        L_0x00fc:
            int r7 = r2.screenLayout
            r7 = r7 & 48
            int r8 = r4.screenLayout
            r8 = r8 & 48
            if (r7 == r8) goto L_0x010b
            int r7 = r5.screenLayout
            r7 = r7 | r8
            r5.screenLayout = r7
        L_0x010b:
            int r7 = r2.screenLayout
            r7 = r7 & 768(0x300, float:1.076E-42)
            int r8 = r4.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r7 == r8) goto L_0x011a
            int r7 = r5.screenLayout
            r7 = r7 | r8
            r5.screenLayout = r7
        L_0x011a:
            r7 = 26
            if (r6 < r7) goto L_0x013c
            int r7 = r2.colorMode
            r7 = r7 & 3
            int r8 = r4.colorMode
            r8 = r8 & 3
            if (r7 == r8) goto L_0x012d
            int r7 = r5.colorMode
            r7 = r7 | r8
            r5.colorMode = r7
        L_0x012d:
            int r7 = r2.colorMode
            r7 = r7 & 12
            int r8 = r4.colorMode
            r8 = r8 & 12
            if (r7 == r8) goto L_0x013c
            int r7 = r5.colorMode
            r7 = r7 | r8
            r5.colorMode = r7
        L_0x013c:
            int r7 = r2.uiMode
            r7 = r7 & 15
            int r8 = r4.uiMode
            r8 = r8 & 15
            if (r7 == r8) goto L_0x014b
            int r7 = r5.uiMode
            r7 = r7 | r8
            r5.uiMode = r7
        L_0x014b:
            int r7 = r2.uiMode
            r7 = r7 & 48
            int r8 = r4.uiMode
            r8 = r8 & 48
            if (r7 == r8) goto L_0x015a
            int r7 = r5.uiMode
            r7 = r7 | r8
            r5.uiMode = r7
        L_0x015a:
            int r7 = r2.screenWidthDp
            int r8 = r4.screenWidthDp
            if (r7 == r8) goto L_0x0162
            r5.screenWidthDp = r8
        L_0x0162:
            int r7 = r2.screenHeightDp
            int r8 = r4.screenHeightDp
            if (r7 == r8) goto L_0x016a
            r5.screenHeightDp = r8
        L_0x016a:
            int r7 = r2.smallestScreenWidthDp
            int r8 = r4.smallestScreenWidthDp
            if (r7 == r8) goto L_0x0172
            r5.smallestScreenWidthDp = r8
        L_0x0172:
            r7 = 17
            if (r6 < r7) goto L_0x0180
            int r2 = r2.densityDpi
            int r4 = r4.densityDpi
            if (r2 == r4) goto L_0x0180
            r5.densityDpi = r4
            goto L_0x0180
        L_0x017f:
            r5 = r3
        L_0x0180:
            android.content.res.Configuration r1 = r9.mo4322F(r10, r1, r5)
            n0 r2 = new n0
            r4 = 2131755438(0x7f1001ae, float:1.9141755E38)
            r2.<init>(r10, r4)
            r2.mo3722a(r1)
            r1 = 0
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ NullPointerException -> 0x0198 }
            if (r10 == 0) goto L_0x0198
            r10 = 1
            goto L_0x0199
        L_0x0198:
            r10 = 0
        L_0x0199:
            if (r10 == 0) goto L_0x01d6
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x01a9
            r10.rebase()
            goto L_0x01d6
        L_0x01a9:
            r5 = 23
            if (r4 < r5) goto L_0x01d6
            java.lang.Object r4 = p000.C0806m6.C0807a.f3217a
            monitor-enter(r4)
            boolean r5 = p000.C0806m6.C0807a.f3219c     // Catch:{ all -> 0x01d3 }
            if (r5 != 0) goto L_0x01c5
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x01c3 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01c3 }
            p000.C0806m6.C0807a.f3218b = r5     // Catch:{ NoSuchMethodException -> 0x01c3 }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01c3 }
        L_0x01c3:
            p000.C0806m6.C0807a.f3219c = r0     // Catch:{ all -> 0x01d3 }
        L_0x01c5:
            java.lang.reflect.Method r0 = p000.C0806m6.C0807a.f3218b     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x01d1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x01cf }
            r0.invoke(r10, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x01cf }
            goto L_0x01d1
        L_0x01cf:
            p000.C0806m6.C0807a.f3218b = r3     // Catch:{ all -> 0x01d3 }
        L_0x01d1:
            monitor-exit(r4)     // Catch:{ all -> 0x01d3 }
            goto L_0x01d6
        L_0x01d3:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d3 }
            throw r10
        L_0x01d6:
            return r2
        L_0x01d7:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Application failed to obtain resources from itself"
            r0.<init>(r1, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.mo4144d(android.content.Context):android.content.Context");
    }

    /* renamed from: e */
    public <T extends View> T mo4145e(int i) {
        mo4326J();
        return this.f4081f.findViewById(i);
    }

    /* renamed from: f */
    public int mo4146f() {
        return this.f4066M;
    }

    /* renamed from: g */
    public MenuInflater mo4147g() {
        if (this.f4085j == null) {
            mo4332P();
            C0496g gVar = this.f4084i;
            this.f4085j = new C0995q0(gVar != null ? gVar.mo2600b() : this.f4080e);
        }
        return this.f4085j;
    }

    /* renamed from: h */
    public C0496g mo4148h() {
        mo4332P();
        return this.f4084i;
    }

    /* renamed from: i */
    public void mo4149i() {
        LayoutInflater from = LayoutInflater.from(this.f4080e);
        if (from.getFactory() == null) {
            C1344x5.m3737S(from, this);
        } else {
            boolean z = from.getFactory2() instanceof C1079s;
        }
    }

    /* renamed from: j */
    public void mo4150j() {
        mo4332P();
        C0496g gVar = this.f4084i;
        mo4333Q(0);
    }

    /* renamed from: k */
    public void mo4151k(Configuration configuration) {
        if (this.f4101z && this.f4095t) {
            mo4332P();
            C0496g gVar = this.f4084i;
            if (gVar != null) {
                C0356d0 d0Var = (C0356d0) gVar;
                d0Var.mo2604f(d0Var.f1842a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1231v1 a = C1231v1.m3413a();
        Context context = this.f4080e;
        synchronized (a) {
            C1334x2 x2Var = a.f4696a;
            synchronized (x2Var) {
                C0518g4 g4Var = x2Var.f5008d.get(context);
                if (g4Var != null) {
                    g4Var.mo2923b();
                }
            }
        }
        mo4317A(false);
    }

    /* renamed from: l */
    public void mo4152l(Bundle bundle) {
        this.f4062I = true;
        mo4317A(false);
        mo4327K();
        Object obj = this.f4079d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = C1344x5.m3721C(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0496g gVar = this.f4084i;
                if (gVar == null) {
                    this.f4075V = true;
                } else {
                    gVar.mo2601c(true);
                }
            }
            synchronized (C1035r.f3880c) {
                C1035r.m2947s(this);
                C1035r.f3879b.add(new WeakReference(this));
            }
        }
        this.f4063J = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4153m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4079d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = p000.C1035r.f3880c
            monitor-enter(r0)
            p000.C1035r.m2947s(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f4072S
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f4081f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f4074U
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 0
            r3.f4064K = r0
            r0 = 1
            r3.f4065L = r0
            int r0 = r3.f4066M
            r1 = -100
            if (r0 == r1) goto L_0x0050
            java.lang.Object r0 = r3.f4079d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0050
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0050
            j4<java.lang.String, java.lang.Integer> r0 = f4048Z
            java.lang.Object r1 = r3.f4079d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4066M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005f
        L_0x0050:
            j4<java.lang.String, java.lang.Integer> r0 = f4048Z
            java.lang.Object r1 = r3.f4079d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005f:
            g r0 = r3.f4084i
            if (r0 == 0) goto L_0x0066
            r0.getClass()
        L_0x0066:
            s$g r0 = r3.f4070Q
            if (r0 == 0) goto L_0x006d
            r0.mo4360a()
        L_0x006d:
            s$g r0 = r3.f4071R
            if (r0 == 0) goto L_0x0074
            r0.mo4360a()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.mo4153m():void");
    }

    /* renamed from: n */
    public void mo4154n(Bundle bundle) {
        mo4326J();
    }

    /* renamed from: o */
    public void mo4155o() {
        mo4332P();
        C0496g gVar = this.f4084i;
        if (gVar != null) {
            ((C0356d0) gVar).f1862u = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: c2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v89, resolved type: y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: j2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: androidx.appcompat.widget.AppCompatImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: b2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: l2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: androidx.appcompat.widget.AppCompatImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: s1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: r1} */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v86 */
    /* JADX WARNING: type inference failed for: r0v101 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0237, code lost:
        if ((r8 >= 15 ? r0.hasOnClickListeners() : false) == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r10).getDepth() > 1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0136, code lost:
        if (r8.equals("ImageButton") == false) goto L_0x0165;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e3 A[Catch:{ Exception -> 0x0217, all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0203 A[SYNTHETIC, Splitter:B:123:0x0203] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0165 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r6 = this;
            a0 r0 = r6.f4078Y
            r1 = 0
            if (r0 != 0) goto L_0x0037
            android.content.Context r0 = r6.f4080e
            int[] r2 = p000.C0440f.f2056j
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            r2 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001b
            a0 r0 = new a0
            r0.<init>()
            goto L_0x0035
        L_0x001b:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0030 }
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0030 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0030 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ all -> 0x0030 }
            a0 r0 = (p000.C0001a0) r0     // Catch:{ all -> 0x0030 }
            r6.f4078Y = r0     // Catch:{ all -> 0x0030 }
            goto L_0x0037
        L_0x0030:
            a0 r0 = new a0
            r0.<init>()
        L_0x0035:
            r6.f4078Y = r0
        L_0x0037:
            boolean r0 = f4049a0
            r2 = 1
            if (r0 == 0) goto L_0x006f
            boolean r0 = r10 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L_0x004a
            r0 = r10
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x006f
            goto L_0x0058
        L_0x004a:
            r0 = r7
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x0050
            goto L_0x006f
        L_0x0050:
            android.view.Window r3 = r6.f4081f
            android.view.View r3 = r3.getDecorView()
        L_0x0056:
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            r0 = 1
            goto L_0x0070
        L_0x005a:
            if (r0 == r3) goto L_0x006f
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L_0x006f
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            boolean r4 = p000.C0813m8.m2485s(r4)
            if (r4 == 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0056
        L_0x006f:
            r0 = 0
        L_0x0070:
            a0 r3 = r6.f4078Y
            boolean r4 = f4049a0
            int r5 = p000.C0803m3.f3212a
            r3.getClass()
            if (r0 == 0) goto L_0x0082
            if (r7 == 0) goto L_0x0082
            android.content.Context r7 = r7.getContext()
            goto L_0x0083
        L_0x0082:
            r7 = r9
        L_0x0083:
            r0 = 4
            int[] r5 = p000.C0440f.f2072z
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r10, r5, r1, r1)
            if (r4 == 0) goto L_0x0091
            int r4 = r5.getResourceId(r1, r1)
            goto L_0x0092
        L_0x0091:
            r4 = 0
        L_0x0092:
            if (r4 != 0) goto L_0x0098
            int r4 = r5.getResourceId(r0, r1)
        L_0x0098:
            r5.recycle()
            if (r4 == 0) goto L_0x00ae
            boolean r5 = r7 instanceof p000.C0853n0
            if (r5 == 0) goto L_0x00a8
            r5 = r7
            n0 r5 = (p000.C0853n0) r5
            int r5 = r5.f3329a
            if (r5 == r4) goto L_0x00ae
        L_0x00a8:
            n0 r5 = new n0
            r5.<init>(r7, r4)
            r7 = r5
        L_0x00ae:
            r8.hashCode()
            int r4 = r8.hashCode()
            r5 = -1
            switch(r4) {
                case -1946472170: goto L_0x015a;
                case -1455429095: goto L_0x014f;
                case -1346021293: goto L_0x0144;
                case -938935918: goto L_0x0139;
                case -937446323: goto L_0x0130;
                case -658531749: goto L_0x0125;
                case -339785223: goto L_0x011a;
                case 776382189: goto L_0x010f;
                case 799298502: goto L_0x0101;
                case 1125864064: goto L_0x00f3;
                case 1413872058: goto L_0x00e5;
                case 1601505219: goto L_0x00d7;
                case 1666676343: goto L_0x00c9;
                case 2001146706: goto L_0x00bb;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x0165
        L_0x00bb:
            java.lang.String r0 = "Button"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0165
        L_0x00c5:
            r0 = 13
            goto L_0x0166
        L_0x00c9:
            java.lang.String r0 = "EditText"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x0165
        L_0x00d3:
            r0 = 12
            goto L_0x0166
        L_0x00d7:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00e1
            goto L_0x0165
        L_0x00e1:
            r0 = 11
            goto L_0x0166
        L_0x00e5:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00ef
            goto L_0x0165
        L_0x00ef:
            r0 = 10
            goto L_0x0166
        L_0x00f3:
            java.lang.String r0 = "ImageView"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00fd
            goto L_0x0165
        L_0x00fd:
            r0 = 9
            goto L_0x0166
        L_0x0101:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x010b
            goto L_0x0165
        L_0x010b:
            r0 = 8
            goto L_0x0166
        L_0x010f:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0118
            goto L_0x0165
        L_0x0118:
            r0 = 7
            goto L_0x0166
        L_0x011a:
            java.lang.String r0 = "Spinner"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0123
            goto L_0x0165
        L_0x0123:
            r0 = 6
            goto L_0x0166
        L_0x0125:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x012e
            goto L_0x0165
        L_0x012e:
            r0 = 5
            goto L_0x0166
        L_0x0130:
            java.lang.String r4 = "ImageButton"
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L_0x0166
            goto L_0x0165
        L_0x0139:
            java.lang.String r0 = "TextView"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0142
            goto L_0x0165
        L_0x0142:
            r0 = 3
            goto L_0x0166
        L_0x0144:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x014d
            goto L_0x0165
        L_0x014d:
            r0 = 2
            goto L_0x0166
        L_0x014f:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0158
            goto L_0x0165
        L_0x0158:
            r0 = 1
            goto L_0x0166
        L_0x015a:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0163
            goto L_0x0165
        L_0x0163:
            r0 = 0
            goto L_0x0166
        L_0x0165:
            r0 = -1
        L_0x0166:
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01b4;
                case 2: goto L_0x01ae;
                case 3: goto L_0x01a9;
                case 4: goto L_0x01a3;
                case 5: goto L_0x019d;
                case 6: goto L_0x0194;
                case 7: goto L_0x018f;
                case 8: goto L_0x0189;
                case 9: goto L_0x0183;
                case 10: goto L_0x017e;
                case 11: goto L_0x0179;
                case 12: goto L_0x0173;
                case 13: goto L_0x016e;
                default: goto L_0x0169;
            }
        L_0x0169:
            android.view.View r0 = r3.mo6f()
            goto L_0x01c2
        L_0x016e:
            r1 r0 = r3.mo2b(r7, r10)
            goto L_0x01bf
        L_0x0173:
            w1 r0 = new w1
            r0.<init>(r7, r10)
            goto L_0x01bf
        L_0x0179:
            s1 r0 = r3.mo3c(r7, r10)
            goto L_0x01bf
        L_0x017e:
            p1 r0 = r3.mo1a(r7, r10)
            goto L_0x01bf
        L_0x0183:
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            r0.<init>(r7, r10)
            goto L_0x01bf
        L_0x0189:
            l2 r0 = new l2
            r0.<init>(r7, r10)
            goto L_0x01bf
        L_0x018f:
            b2 r0 = r3.mo4d(r7, r10)
            goto L_0x01bf
        L_0x0194:
            g2 r0 = new g2
            r4 = 2130903649(0x7f030261, float:1.7414122E38)
            r0.<init>(r7, r10, r4)
            goto L_0x01bf
        L_0x019d:
            d2 r0 = new d2
            r0.<init>(r7, r10)
            goto L_0x01bf
        L_0x01a3:
            androidx.appcompat.widget.AppCompatImageButton r0 = new androidx.appcompat.widget.AppCompatImageButton
            r0.<init>(r7, r10)
            goto L_0x01bf
        L_0x01a9:
            j2 r0 = r3.mo5e(r7, r10)
            goto L_0x01bf
        L_0x01ae:
            y1 r0 = new y1
            r0.<init>(r7, r10)
            goto L_0x01bf
        L_0x01b4:
            t1 r0 = new t1
            r0.<init>(r7, r10)
            goto L_0x01bf
        L_0x01ba:
            c2 r0 = new c2
            r0.<init>(r7, r10)
        L_0x01bf:
            r3.mo8h(r0, r8)
        L_0x01c2:
            if (r0 != 0) goto L_0x021d
            if (r9 == r7) goto L_0x021d
            java.lang.String r9 = "view"
            boolean r9 = r8.equals(r9)
            r0 = 0
            if (r9 == 0) goto L_0x01d5
            java.lang.String r8 = "class"
            java.lang.String r8 = r10.getAttributeValue(r0, r8)
        L_0x01d5:
            java.lang.Object[] r9 = r3.f4a     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            r9[r1] = r7     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            r9[r2] = r10     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            r9 = 46
            int r9 = r8.indexOf(r9)     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            if (r5 != r9) goto L_0x0203
            r9 = 0
        L_0x01e4:
            java.lang.String[] r4 = p000.C0001a0.f2d     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            int r5 = r4.length     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            if (r9 >= r5) goto L_0x01fc
            r4 = r4[r9]     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            android.view.View r4 = r3.mo7g(r7, r8, r4)     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            if (r4 == 0) goto L_0x01f9
            java.lang.Object[] r7 = r3.f4a
            r7[r1] = r0
            r7[r2] = r0
            r0 = r4
            goto L_0x021d
        L_0x01f9:
            int r9 = r9 + 1
            goto L_0x01e4
        L_0x01fc:
            java.lang.Object[] r7 = r3.f4a
            r7[r1] = r0
            r7[r2] = r0
            goto L_0x021d
        L_0x0203:
            android.view.View r7 = r3.mo7g(r7, r8, r0)     // Catch:{ Exception -> 0x0217, all -> 0x020f }
            java.lang.Object[] r8 = r3.f4a
            r8[r1] = r0
            r8[r2] = r0
            r0 = r7
            goto L_0x021d
        L_0x020f:
            r7 = move-exception
            java.lang.Object[] r8 = r3.f4a
            r8[r1] = r0
            r8[r2] = r0
            throw r7
        L_0x0217:
            java.lang.Object[] r7 = r3.f4a
            r7[r1] = r0
            r7[r2] = r0
        L_0x021d:
            if (r0 == 0) goto L_0x0251
            android.content.Context r7 = r0.getContext()
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L_0x0251
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 15
            if (r8 < r9) goto L_0x023a
            java.lang.reflect.Field r2 = p000.C0813m8.f3234a
            if (r8 < r9) goto L_0x0236
            boolean r8 = r0.hasOnClickListeners()
            goto L_0x0237
        L_0x0236:
            r8 = 0
        L_0x0237:
            if (r8 != 0) goto L_0x023a
            goto L_0x0251
        L_0x023a:
            int[] r8 = p000.C0001a0.f1c
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r10, r8)
            java.lang.String r8 = r7.getString(r1)
            if (r8 == 0) goto L_0x024e
            a0$a r9 = new a0$a
            r9.<init>(r0, r8)
            r0.setOnClickListener(r9)
        L_0x024e:
            r7.recycle()
        L_0x0251:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo4156p(Bundle bundle) {
    }

    /* renamed from: q */
    public void mo4157q() {
        this.f4064K = true;
        mo4343z();
    }

    /* renamed from: r */
    public void mo4158r() {
        this.f4064K = false;
        mo4332P();
        C0496g gVar = this.f4084i;
        if (gVar != null) {
            C0356d0 d0Var = (C0356d0) gVar;
            d0Var.f1862u = false;
            C1036r0 r0Var = d0Var.f1861t;
            if (r0Var != null) {
                r0Var.mo4165a();
            }
        }
    }

    /* renamed from: t */
    public boolean mo4159t(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f4057D && i == 108) {
            return false;
        }
        if (this.f4101z && i == 1) {
            this.f4101z = false;
        }
        if (i == 1) {
            mo4339W();
            this.f4057D = true;
            return true;
        } else if (i == 2) {
            mo4339W();
            this.f4099x = true;
            return true;
        } else if (i == 5) {
            mo4339W();
            this.f4100y = true;
            return true;
        } else if (i == 10) {
            mo4339W();
            this.f4055B = true;
            return true;
        } else if (i == 108) {
            mo4339W();
            this.f4101z = true;
            return true;
        } else if (i != 109) {
            return this.f4081f.requestFeature(i);
        } else {
            mo4339W();
            this.f4054A = true;
            return true;
        }
    }

    /* renamed from: u */
    public void mo4160u(int i) {
        mo4326J();
        ViewGroup viewGroup = (ViewGroup) this.f4096u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4080e).inflate(i, viewGroup);
        this.f4082g.f4135b.onContentChanged();
    }

    /* renamed from: v */
    public void mo4161v(View view) {
        mo4326J();
        ViewGroup viewGroup = (ViewGroup) this.f4096u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4082g.f4135b.onContentChanged();
    }

    /* renamed from: w */
    public void mo4162w(View view, ViewGroup.LayoutParams layoutParams) {
        mo4326J();
        ViewGroup viewGroup = (ViewGroup) this.f4096u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4082g.f4135b.onContentChanged();
    }

    /* renamed from: x */
    public void mo4163x(int i) {
        this.f4067N = i;
    }

    /* renamed from: y */
    public final void mo4164y(CharSequence charSequence) {
        this.f4086k = charSequence;
        C0802m2 m2Var = this.f4087l;
        if (m2Var != null) {
            m2Var.setWindowTitle(charSequence);
            return;
        }
        C0496g gVar = this.f4084i;
        if (gVar != null) {
            ((C0356d0) gVar).f1846e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.f4097v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: z */
    public boolean mo4343z() {
        return mo4317A(true);
    }

    /* renamed from: s$e */
    public class C1085e extends C1093s0 {
        public C1085e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode mo4346a(android.view.ActionMode.Callback r11) {
            /*
                r10 = this;
                p0$a r0 = new p0$a
                s r1 = p000.C1079s.this
                android.content.Context r1 = r1.f4080e
                r0.<init>(r1, r11)
                s r11 = p000.C1079s.this
                r11.getClass()
                l0 r1 = r11.f4090o
                if (r1 == 0) goto L_0x0015
                r1.mo2607c()
            L_0x0015:
                s$d r1 = new s$d
                r1.<init>(r0)
                r11.mo4332P()
                g r2 = r11.f4084i
                r3 = 32
                r4 = 1
                r5 = 0
                r6 = 0
                if (r2 == 0) goto L_0x007f
                d0 r2 = (p000.C0356d0) r2
                d0$d r7 = r2.f1850i
                if (r7 == 0) goto L_0x002f
                r7.mo2607c()
            L_0x002f:
                androidx.appcompat.widget.ActionBarOverlayLayout r7 = r2.f1844c
                r7.setHideOnContentScrollEnabled(r5)
                androidx.appcompat.widget.ActionBarContextView r7 = r2.f1847f
                r7.mo210h()
                d0$d r7 = new d0$d
                androidx.appcompat.widget.ActionBarContextView r8 = r2.f1847f
                android.content.Context r8 = r8.getContext()
                r7.<init>(r8, r1)
                z0 r8 = r7.f1871e
                r8.mo5266z()
                l0$a r8 = r7.f1872f     // Catch:{ all -> 0x0078 }
                z0 r9 = r7.f1871e     // Catch:{ all -> 0x0078 }
                boolean r8 = r8.mo3571d(r7, r9)     // Catch:{ all -> 0x0078 }
                z0 r9 = r7.f1871e
                r9.mo5265y()
                if (r8 == 0) goto L_0x006b
                r2.f1850i = r7
                r7.mo2613i()
                androidx.appcompat.widget.ActionBarContextView r8 = r2.f1847f
                r8.mo202f(r7)
                r2.mo2602d(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f1847f
                r2.sendAccessibilityEvent(r3)
                goto L_0x006c
            L_0x006b:
                r7 = r6
            L_0x006c:
                r11.f4090o = r7
                if (r7 == 0) goto L_0x007f
                q r2 = r11.f4083h
                if (r2 == 0) goto L_0x007f
                r2.mo3877b(r7)
                goto L_0x007f
            L_0x0078:
                r11 = move-exception
                z0 r0 = r7.f1871e
                r0.mo5265y()
                throw r11
            L_0x007f:
                l0 r2 = r11.f4090o
                if (r2 != 0) goto L_0x01f3
                r11.mo4325I()
                l0 r2 = r11.f4090o
                if (r2 == 0) goto L_0x008d
                r2.mo2607c()
            L_0x008d:
                q r2 = r11.f4083h
                if (r2 == 0) goto L_0x009a
                boolean r7 = r11.f4065L
                if (r7 != 0) goto L_0x009a
                l0 r2 = r2.mo3882g(r1)     // Catch:{ AbstractMethodError -> 0x009a }
                goto L_0x009b
            L_0x009a:
                r2 = r6
            L_0x009b:
                if (r2 == 0) goto L_0x00a1
                r11.f4090o = r2
                goto L_0x01e4
            L_0x00a1:
                androidx.appcompat.widget.ActionBarContextView r2 = r11.f4091p
                if (r2 != 0) goto L_0x015b
                boolean r2 = r11.f4056C
                if (r2 == 0) goto L_0x012e
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
                android.content.Context r7 = r11.f4080e
                android.content.res.Resources$Theme r7 = r7.getTheme()
                r8 = 2130903049(0x7f030009, float:1.7412905E38)
                r7.resolveAttribute(r8, r2, r4)
                int r8 = r2.resourceId
                if (r8 == 0) goto L_0x00df
                android.content.Context r8 = r11.f4080e
                android.content.res.Resources r8 = r8.getResources()
                android.content.res.Resources$Theme r8 = r8.newTheme()
                r8.setTo(r7)
                int r7 = r2.resourceId
                r8.applyStyle(r7, r4)
                n0 r7 = new n0
                android.content.Context r9 = r11.f4080e
                r7.<init>(r9, r5)
                android.content.res.Resources$Theme r9 = r7.getTheme()
                r9.setTo(r8)
                goto L_0x00e1
            L_0x00df:
                android.content.Context r7 = r11.f4080e
            L_0x00e1:
                androidx.appcompat.widget.ActionBarContextView r8 = new androidx.appcompat.widget.ActionBarContextView
                r8.<init>(r7, r6)
                r11.f4091p = r8
                android.widget.PopupWindow r8 = new android.widget.PopupWindow
                r9 = 2130903063(0x7f030017, float:1.7412933E38)
                r8.<init>(r7, r6, r9)
                r11.f4092q = r8
                r9 = 2
                p000.C1344x5.m3756f0(r8, r9)
                android.widget.PopupWindow r8 = r11.f4092q
                androidx.appcompat.widget.ActionBarContextView r9 = r11.f4091p
                r8.setContentView(r9)
                android.widget.PopupWindow r8 = r11.f4092q
                r9 = -1
                r8.setWidth(r9)
                android.content.res.Resources$Theme r8 = r7.getTheme()
                r9 = 2130903043(0x7f030003, float:1.7412893E38)
                r8.resolveAttribute(r9, r2, r4)
                int r2 = r2.data
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r7)
                androidx.appcompat.widget.ActionBarContextView r7 = r11.f4091p
                r7.setContentHeight(r2)
                android.widget.PopupWindow r2 = r11.f4092q
                r7 = -2
                r2.setHeight(r7)
                w r2 = new w
                r2.<init>(r11)
                r11.f4093r = r2
                goto L_0x015b
            L_0x012e:
                android.view.ViewGroup r2 = r11.f4096u
                r7 = 2131230777(0x7f080039, float:1.8077616E38)
                android.view.View r2 = r2.findViewById(r7)
                androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
                if (r2 == 0) goto L_0x015b
                r11.mo4332P()
                g r7 = r11.f4084i
                if (r7 == 0) goto L_0x0147
                android.content.Context r7 = r7.mo2600b()
                goto L_0x0148
            L_0x0147:
                r7 = r6
            L_0x0148:
                if (r7 != 0) goto L_0x014c
                android.content.Context r7 = r11.f4080e
            L_0x014c:
                android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
                r2.setLayoutInflater(r7)
                android.view.View r2 = r2.mo600a()
                androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
                r11.f4091p = r2
            L_0x015b:
                androidx.appcompat.widget.ActionBarContextView r2 = r11.f4091p
                if (r2 == 0) goto L_0x01e4
                r11.mo4325I()
                androidx.appcompat.widget.ActionBarContextView r2 = r11.f4091p
                r2.mo210h()
                o0 r2 = new o0
                androidx.appcompat.widget.ActionBarContextView r7 = r11.f4091p
                android.content.Context r7 = r7.getContext()
                androidx.appcompat.widget.ActionBarContextView r8 = r11.f4091p
                android.widget.PopupWindow r9 = r11.f4092q
                if (r9 != 0) goto L_0x0176
                goto L_0x0177
            L_0x0176:
                r4 = 0
            L_0x0177:
                r2.<init>(r7, r8, r1, r4)
                z0 r4 = r2.f3443i
                boolean r1 = r1.mo3571d(r2, r4)
                if (r1 == 0) goto L_0x01e2
                r2.mo2613i()
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                r1.mo202f(r2)
                r11.f4090o = r2
                boolean r1 = r11.mo4338V()
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto L_0x01ae
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                r3 = 0
                r1.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                r8 r1 = p000.C0813m8.m2467a(r1)
                r1.mo4211a(r2)
                r11.f4094s = r1
                x r2 = new x
                r2.<init>(r11)
                r1.mo4214d(r2)
                goto L_0x01d2
            L_0x01ae:
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                r1.setAlpha(r2)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                r1.setVisibility(r5)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                r1.sendAccessibilityEvent(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                android.view.ViewParent r1 = r1.getParent()
                boolean r1 = r1 instanceof android.view.View
                if (r1 == 0) goto L_0x01d2
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f4091p
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                p000.C0813m8.m2455D(r1)
            L_0x01d2:
                android.widget.PopupWindow r1 = r11.f4092q
                if (r1 == 0) goto L_0x01e4
                android.view.Window r1 = r11.f4081f
                android.view.View r1 = r1.getDecorView()
                java.lang.Runnable r2 = r11.f4093r
                r1.post(r2)
                goto L_0x01e4
            L_0x01e2:
                r11.f4090o = r6
            L_0x01e4:
                l0 r1 = r11.f4090o
                if (r1 == 0) goto L_0x01ef
                q r2 = r11.f4083h
                if (r2 == 0) goto L_0x01ef
                r2.mo3877b(r1)
            L_0x01ef:
                l0 r1 = r11.f4090o
                r11.f4090o = r1
            L_0x01f3:
                l0 r11 = r11.f4090o
                if (r11 == 0) goto L_0x01fc
                android.view.ActionMode r11 = r0.mo3926e(r11)
                return r11
            L_0x01fc:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.C1085e.mo4346a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C1079s.this.mo4323G(keyEvent) || this.f4135b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            if (r3 != false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            if (r7 != false) goto L_0x006b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                android.view.Window$Callback r0 = r6.f4135b
                boolean r0 = r0.dispatchKeyShortcutEvent(r7)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0072
                s r0 = p000.C1079s.this
                int r3 = r7.getKeyCode()
                r0.mo4332P()
                g r4 = r0.f4084i
                if (r4 == 0) goto L_0x003f
                d0 r4 = (p000.C0356d0) r4
                d0$d r4 = r4.f1850i
                if (r4 != 0) goto L_0x001e
                goto L_0x003b
            L_0x001e:
                z0 r4 = r4.f1871e
                if (r4 == 0) goto L_0x003b
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r1) goto L_0x0032
                r5 = 1
                goto L_0x0033
            L_0x0032:
                r5 = 0
            L_0x0033:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r2)
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                if (r3 == 0) goto L_0x003f
                goto L_0x006b
            L_0x003f:
                s$j r3 = r0.f4060G
                if (r3 == 0) goto L_0x0054
                int r4 = r7.getKeyCode()
                boolean r3 = r0.mo4336T(r3, r4, r7, r1)
                if (r3 == 0) goto L_0x0054
                s$j r7 = r0.f4060G
                if (r7 == 0) goto L_0x006b
                r7.f4128l = r1
                goto L_0x006b
            L_0x0054:
                s$j r3 = r0.f4060G
                if (r3 != 0) goto L_0x006d
                s$j r3 = r0.mo4330N(r2)
                r0.mo4337U(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.mo4336T(r3, r4, r7, r1)
                r3.f4127k = r2
                if (r7 == 0) goto L_0x006d
            L_0x006b:
                r7 = 1
                goto L_0x006e
            L_0x006d:
                r7 = 0
            L_0x006e:
                if (r7 == 0) goto L_0x0071
                goto L_0x0072
            L_0x0071:
                r1 = 0
            L_0x0072:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1079s.C1085e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C1435z0)) {
                return this.f4135b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            this.f4135b.onMenuOpened(i, menu);
            C1079s sVar = C1079s.this;
            sVar.getClass();
            if (i == 108) {
                sVar.mo4332P();
                C0496g gVar = sVar.f4084i;
                if (gVar != null) {
                    gVar.mo2599a(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            this.f4135b.onPanelClosed(i, menu);
            C1079s sVar = C1079s.this;
            sVar.getClass();
            if (i == 108) {
                sVar.mo4332P();
                C0496g gVar = sVar.f4084i;
                if (gVar != null) {
                    gVar.mo2599a(false);
                }
            } else if (i == 0) {
                C1091j N = sVar.mo4330N(i);
                if (N.f4129m) {
                    sVar.mo4321E(N, false);
                }
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C1435z0 z0Var = menu instanceof C1435z0 ? (C1435z0) menu : null;
            if (i == 0 && z0Var == null) {
                return false;
            }
            if (z0Var != null) {
                z0Var.f5248x = true;
            }
            boolean onPreparePanel = this.f4135b.onPreparePanel(i, view, menu);
            if (z0Var != null) {
                z0Var.f5248x = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C1435z0 z0Var = C1079s.this.mo4330N(0).f4124h;
            if (z0Var != null) {
                this.f4135b.onProvideKeyboardShortcuts(list, z0Var, i);
            } else {
                this.f4135b.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            C1079s.this.getClass();
            return mo4346a(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            C1079s.this.getClass();
            if (i != 0) {
                return this.f4135b.onWindowStartingActionMode(callback, i);
            }
            return mo4346a(callback);
        }
    }
}
