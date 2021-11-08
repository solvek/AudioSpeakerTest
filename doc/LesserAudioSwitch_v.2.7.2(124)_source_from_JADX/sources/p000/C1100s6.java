package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000.C0808m7;

/* renamed from: s6 */
public class C1100s6 extends C1295w6 {

    /* renamed from: b */
    public static final Class<?> f4161b;

    /* renamed from: c */
    public static final Constructor<?> f4162c;

    /* renamed from: d */
    public static final Method f4163d;

    /* renamed from: e */
    public static final Method f4164e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            cls = null;
            method2 = null;
            method = null;
        }
        f4162c = constructor;
        f4161b = cls;
        f4163d = method;
        f4164e = method2;
    }

    /* renamed from: h */
    public static boolean m3153h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f4163d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static Typeface m3154i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4161b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4164e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:8:0x0015->B:35:0x0061, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4193a(android.content.Context r17, p000.C0558h6 r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r0 = 0
            r1 = 0
            java.lang.reflect.Constructor<?> r2 = f4162c     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            if (r2 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r3 = r18
            i6[] r3 = r3.f2439a
            int r4 = r3.length
            r5 = 0
        L_0x0015:
            if (r5 >= r4) goto L_0x0069
            r6 = r3[r5]
            int r0 = r6.f2628f
            java.io.File r7 = p000.C1344x5.m3722D(r17)
            r8 = r19
            if (r7 != 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            boolean r0 = p000.C1344x5.m3765k(r7, r8, r0)     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x002f
            r7.delete()
        L_0x002d:
            r0 = r1
            goto L_0x0051
        L_0x002f:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004d }
            r9.<init>(r7)     // Catch:{ IOException -> 0x004d }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x0048 }
            long r14 = r10.size()     // Catch:{ all -> 0x0048 }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0048 }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x0048 }
            r9.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r0 = r1
        L_0x004e:
            r7.delete()
        L_0x0051:
            if (r0 != 0) goto L_0x0054
            return r1
        L_0x0054:
            int r7 = r6.f2627e
            int r9 = r6.f2624b
            boolean r6 = r6.f2625c
            boolean r0 = m3153h(r2, r0, r7, r9, r6)
            if (r0 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0064:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0069:
            android.graphics.Typeface r0 = m3154i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1100s6.mo4193a(android.content.Context, h6, android.content.res.Resources, int):android.graphics.Typeface");
    }

    /* renamed from: b */
    public Typeface mo4194b(Context context, CancellationSignal cancellationSignal, C0808m7.C0811c[] cVarArr, int i) {
        Object obj;
        try {
            obj = f4162c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0663j4 j4Var = new C0663j4();
        for (C0808m7.C0811c cVar : cVarArr) {
            Uri uri = cVar.f3227a;
            ByteBuffer byteBuffer = (ByteBuffer) j4Var.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C1344x5.m3730L(context, cancellationSignal, uri);
                j4Var.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m3153h(obj, byteBuffer, cVar.f3228b, cVar.f3229c, cVar.f3230d)) {
                return null;
            }
        }
        Typeface i2 = m3154i(obj);
        if (i2 == null) {
            return null;
        }
        return Typeface.create(i2, i);
    }
}
