package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: t6 */
public class C1150t6 extends C1046r6 {

    /* renamed from: g */
    public final Class<?> f4381g;

    /* renamed from: h */
    public final Constructor<?> f4382h;

    /* renamed from: i */
    public final Method f4383i;

    /* renamed from: j */
    public final Method f4384j;

    /* renamed from: k */
    public final Method f4385k;

    /* renamed from: l */
    public final Method f4386l;

    /* renamed from: m */
    public final Method f4387m;

    public C1150t6() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = mo4628q(cls2);
            method2 = mo4629r(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = mo4630s(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4381g = cls;
        this.f4382h = constructor;
        this.f4383i = method3;
        this.f4384j = method2;
        this.f4385k = method;
        this.f4386l = method4;
        this.f4387m = method5;
    }

    /* renamed from: p */
    private Object m3224p() {
        try {
            return this.f4382h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo4193a(Context context, C0558h6 h6Var, Resources resources, int i) {
        if (!mo4627o()) {
            return super.mo4193a(context, h6Var, resources, i);
        }
        Object p = m3224p();
        if (p == null) {
            return null;
        }
        for (C0609i6 i6Var : h6Var.f2439a) {
            if (!mo4624l(context, p, i6Var.f2623a, i6Var.f2627e, i6Var.f2624b, i6Var.f2625c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(i6Var.f2626d))) {
                mo4623k(p);
                return null;
            }
        }
        if (!mo4626n(p)) {
            return null;
        }
        return mo4625m(p);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4194b(android.content.Context r12, android.os.CancellationSignal r13, p000.C0808m7.C0811c[] r14, int r15) {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r11.mo4627o()
            if (r0 != 0) goto L_0x004e
            w6$a r0 = new w6$a
            r0.<init>(r11)
            java.lang.Object r14 = p000.C1295w6.m3608e(r14, r15, r0)
            m7$c r14 = (p000.C0808m7.C0811c) r14
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.f3227a     // Catch:{ IOException -> 0x004d }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch:{ IOException -> 0x004d }
            if (r12 != 0) goto L_0x002b
            if (r12 == 0) goto L_0x002a
            r12.close()     // Catch:{ IOException -> 0x004d }
        L_0x002a:
            return r2
        L_0x002b:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0048 }
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch:{ all -> 0x0048 }
            r13.<init>(r15)     // Catch:{ all -> 0x0048 }
            int r15 = r14.f3229c     // Catch:{ all -> 0x0048 }
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch:{ all -> 0x0048 }
            boolean r14 = r14.f3230d     // Catch:{ all -> 0x0048 }
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch:{ all -> 0x0048 }
            android.graphics.Typeface r13 = r13.build()     // Catch:{ all -> 0x0048 }
            r12.close()     // Catch:{ IOException -> 0x004d }
            return r13
        L_0x0048:
            r13 = move-exception
            r12.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r13     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            return r2
        L_0x004e:
            h4<java.lang.String, android.graphics.Typeface> r0 = p000.C0808m7.f3220a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r14.length
            r4 = 0
            r5 = 0
        L_0x0058:
            if (r5 >= r3) goto L_0x0074
            r6 = r14[r5]
            int r7 = r6.f3231e
            if (r7 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            android.net.Uri r6 = r6.f3227a
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            java.nio.ByteBuffer r7 = p000.C1344x5.m3730L(r12, r13, r6)
            r0.put(r6, r7)
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x0058
        L_0x0074:
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r0)
            java.lang.Object r13 = r11.m3224p()
            if (r13 != 0) goto L_0x007f
            return r2
        L_0x007f:
            int r0 = r14.length
            r3 = 0
            r5 = 0
        L_0x0082:
            if (r3 >= r0) goto L_0x00cb
            r6 = r14[r3]
            android.net.Uri r7 = r6.f3227a
            java.lang.Object r7 = r12.get(r7)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L_0x0091
            goto L_0x00c8
        L_0x0091:
            int r5 = r6.f3228b
            int r8 = r6.f3229c
            boolean r6 = r6.f3230d
            java.lang.reflect.Method r9 = r11.f4384j     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r10[r4] = r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r10[r1] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r5 = 2
            r10[r5] = r2     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r10[r5] = r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            r10[r5] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            java.lang.Object r5 = r9.invoke(r13, r10)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            boolean r5 = r5.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c0 }
            goto L_0x00c1
        L_0x00c0:
            r5 = 0
        L_0x00c1:
            if (r5 != 0) goto L_0x00c7
            r11.mo4623k(r13)
            return r2
        L_0x00c7:
            r5 = 1
        L_0x00c8:
            int r3 = r3 + 1
            goto L_0x0082
        L_0x00cb:
            if (r5 != 0) goto L_0x00d1
            r11.mo4623k(r13)
            return r2
        L_0x00d1:
            boolean r12 = r11.mo4626n(r13)
            if (r12 != 0) goto L_0x00d8
            return r2
        L_0x00d8:
            android.graphics.Typeface r12 = r11.mo4625m(r13)
            if (r12 != 0) goto L_0x00df
            return r2
        L_0x00df:
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1150t6.mo4194b(android.content.Context, android.os.CancellationSignal, m7$c[], int):android.graphics.Typeface");
    }

    /* renamed from: d */
    public Typeface mo4622d(Context context, Resources resources, int i, String str, int i2) {
        if (!mo4627o()) {
            return super.mo4622d(context, resources, i, str, i2);
        }
        Object p = m3224p();
        if (p == null) {
            return null;
        }
        if (!mo4624l(context, p, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            mo4623k(p);
            return null;
        } else if (!mo4626n(p)) {
            return null;
        } else {
            return mo4625m(p);
        }
    }

    /* renamed from: k */
    public final void mo4623k(Object obj) {
        try {
            this.f4386l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: l */
    public final boolean mo4624l(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4383i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public Typeface mo4625m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4381g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4387m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final boolean mo4626n(Object obj) {
        try {
            return ((Boolean) this.f4385k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public final boolean mo4627o() {
        return this.f4383i != null;
    }

    /* renamed from: q */
    public Method mo4628q(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: r */
    public Method mo4629r(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: s */
    public Method mo4630s(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
