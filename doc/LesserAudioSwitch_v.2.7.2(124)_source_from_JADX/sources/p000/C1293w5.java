package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: w5 */
public final class C1293w5 {

    /* renamed from: a */
    public static final Class<?> f4916a;

    /* renamed from: b */
    public static final Field f4917b;

    /* renamed from: c */
    public static final Field f4918c;

    /* renamed from: d */
    public static final Method f4919d;

    /* renamed from: e */
    public static final Method f4920e;

    /* renamed from: f */
    public static final Method f4921f;

    /* renamed from: g */
    public static final Handler f4922g = new Handler(Looper.getMainLooper());

    /* renamed from: w5$a */
    public static final class C1294a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f4923a;

        /* renamed from: b */
        public Activity f4924b;

        /* renamed from: c */
        public boolean f4925c = false;

        /* renamed from: d */
        public boolean f4926d = false;

        /* renamed from: e */
        public boolean f4927e = false;

        public C1294a(Activity activity) {
            this.f4924b = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f4924b == activity) {
                this.f4924b = null;
                this.f4926d = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f4926d && !this.f4927e && !this.f4925c) {
                Object obj = this.f4923a;
                boolean z = false;
                try {
                    Object obj2 = C1293w5.f4918c.get(activity);
                    if (obj2 == obj) {
                        C1293w5.f4922g.postAtFrontOfQueue(new C1238v5(C1293w5.f4917b.get(activity), obj2));
                        z = true;
                    }
                } catch (Throwable unused) {
                }
                if (z) {
                    this.f4927e = true;
                    this.f4923a = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f4924b == activity) {
                this.f4925c = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            f4922g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            f4916a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            f4917b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0032 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r2 = r0
        L_0x0033:
            f4918c = r2
            java.lang.Class<?> r2 = f4916a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r2 = r0
            goto L_0x0055
        L_0x0040:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003e }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003e }
            r7[r1] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003e }
            r2.setAccessible(r1)     // Catch:{ all -> 0x003e }
        L_0x0055:
            f4919d = r2
            java.lang.Class<?> r2 = f4916a
            if (r2 != 0) goto L_0x005d
        L_0x005b:
            r2 = r0
            goto L_0x006e
        L_0x005d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x005b }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x005b }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005b }
            r7[r1] = r8     // Catch:{ all -> 0x005b }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x005b }
            r2.setAccessible(r1)     // Catch:{ all -> 0x005b }
        L_0x006e:
            f4920e = r2
            java.lang.Class<?> r2 = f4916a
            boolean r4 = m3607a()
            if (r4 == 0) goto L_0x00af
            if (r2 != 0) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00af }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00af }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch:{ all -> 0x00af }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00af }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00af }
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00af }
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00af }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00af }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00af }
            r2.setAccessible(r1)     // Catch:{ all -> 0x00af }
            r0 = r2
        L_0x00af:
            f4921f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1293w5.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m3607a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
