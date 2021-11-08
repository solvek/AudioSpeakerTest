package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: r6 */
public class C1046r6 extends C1295w6 {

    /* renamed from: b */
    public static Class<?> f3924b = null;

    /* renamed from: c */
    public static Constructor<?> f3925c = null;

    /* renamed from: d */
    public static Method f3926d = null;

    /* renamed from: e */
    public static Method f3927e = null;

    /* renamed from: f */
    public static boolean f3928f = false;

    /* renamed from: h */
    public static boolean m2983h(Object obj, String str, int i, boolean z) {
        m2984j();
        try {
            return ((Boolean) f3926d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public static void m2984j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f3928f) {
            f3928f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                e.getClass().getName();
                method2 = null;
                cls = null;
                method = null;
            }
            f3925c = constructor;
            f3924b = cls;
            f3926d = method;
            f3927e = method2;
        }
    }

    /* renamed from: a */
    public Typeface mo4193a(Context context, C0558h6 h6Var, Resources resources, int i) {
        m2984j();
        try {
            Object newInstance = f3925c.newInstance(new Object[0]);
            C0609i6[] i6VarArr = h6Var.f2439a;
            int length = i6VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C0609i6 i6Var = i6VarArr[i2];
                File D = C1344x5.m3722D(context);
                if (D == null) {
                    return null;
                }
                try {
                    if (!C1344x5.m3765k(D, resources, i6Var.f2628f)) {
                        D.delete();
                        return null;
                    } else if (!m2983h(newInstance, D.getPath(), i6Var.f2624b, i6Var.f2625c)) {
                        return null;
                    } else {
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    D.delete();
                }
            }
            m2984j();
            try {
                Object newInstance2 = Array.newInstance(f3924b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f3927e.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0057 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4194b(android.content.Context r4, android.os.CancellationSignal r5, p000.C0808m7.C0811c[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            w6$a r0 = new w6$a
            r0.<init>(r3)
            java.lang.Object r6 = p000.C1295w6.m3608e(r6, r7, r0)
            m7$c r6 = (p000.C0808m7.C0811c) r6
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f3227a     // Catch:{ IOException -> 0x0058 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0058 }
            if (r5 != 0) goto L_0x0025
            if (r5 == 0) goto L_0x0024
            r5.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0024:
            return r1
        L_0x0025:
            java.io.File r6 = r3.mo4195i(r5)     // Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x003a
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0053 }
            if (r7 != 0) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0053 }
            r5.close()     // Catch:{ IOException -> 0x0058 }
            return r4
        L_0x003a:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0053 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0053 }
            r6.<init>(r7)     // Catch:{ all -> 0x0053 }
            android.graphics.Typeface r4 = r3.mo4835c(r4, r6)     // Catch:{ all -> 0x004e }
            r6.close()     // Catch:{ all -> 0x0053 }
            r5.close()     // Catch:{ IOException -> 0x0058 }
            return r4
        L_0x004e:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r4     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r4     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1046r6.mo4194b(android.content.Context, android.os.CancellationSignal, m7$c[], int):android.graphics.Typeface");
    }

    /* renamed from: i */
    public final File mo4195i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }
}
