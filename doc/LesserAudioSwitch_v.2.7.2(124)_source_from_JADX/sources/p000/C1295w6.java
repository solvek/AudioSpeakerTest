package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0808m7;

/* renamed from: w6 */
public class C1295w6 {

    /* renamed from: a */
    public ConcurrentHashMap<Long, C0558h6> f4928a = new ConcurrentHashMap<>();

    /* renamed from: w6$a */
    public class C1296a implements C1297b<C0808m7.C0811c> {
        public C1296a(C1295w6 w6Var) {
        }

        /* renamed from: a */
        public int mo4971a(Object obj) {
            return ((C0808m7.C0811c) obj).f3229c;
        }

        /* renamed from: b */
        public boolean mo4972b(Object obj) {
            return ((C0808m7.C0811c) obj).f3230d;
        }
    }

    /* renamed from: w6$b */
    public interface C1297b<T> {
        /* renamed from: a */
        int mo4971a(T t);

        /* renamed from: b */
        boolean mo4972b(T t);
    }

    /* renamed from: e */
    public static <T> T m3608e(T[] tArr, int i, C1297b<T> bVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(bVar.mo4971a(t2) - i2) * 2) + (bVar.mo4972b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: g */
    public static long m3609g(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public Typeface mo4193a(Context context, C0558h6 h6Var, Resources resources, int i) {
        C0609i6 i6Var = (C0609i6) m3608e(h6Var.f2439a, i, new C1345x6(this));
        if (i6Var == null) {
            return null;
        }
        Typeface b = C1005q6.m2912b(context, resources, i6Var.f2628f, i6Var.f2623a, i);
        long g = m3609g(b);
        if (g != 0) {
            this.f4928a.put(Long.valueOf(g), h6Var);
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024 A[SYNTHETIC, Splitter:B:17:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002b A[SYNTHETIC, Splitter:B:25:0x002b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4194b(android.content.Context r3, android.os.CancellationSignal r4, p000.C0808m7.C0811c[] r5, int r6) {
        /*
            r2 = this;
            int r4 = r5.length
            r0 = 0
            r1 = 1
            if (r4 >= r1) goto L_0x0006
            return r0
        L_0x0006:
            m7$c r4 = r2.mo4836f(r5, r6)
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.net.Uri r4 = r4.f3227a     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.graphics.Typeface r3 = r2.mo4835c(r3, r4)     // Catch:{ IOException -> 0x0029, all -> 0x001e }
            if (r4 == 0) goto L_0x001d
            r4.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r3
        L_0x001e:
            r3 = move-exception
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r3
        L_0x0028:
            r4 = r0
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1295w6.mo4194b(android.content.Context, android.os.CancellationSignal, m7$c[], int):android.graphics.Typeface");
    }

    /* renamed from: c */
    public Typeface mo4835c(Context context, InputStream inputStream) {
        File D = C1344x5.m3722D(context);
        if (D == null) {
            return null;
        }
        try {
            if (!C1344x5.m3767l(D, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(D.getPath());
            D.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo4622d(Context context, Resources resources, int i, String str, int i2) {
        File D = C1344x5.m3722D(context);
        if (D == null) {
            return null;
        }
        try {
            if (!C1344x5.m3765k(D, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(D.getPath());
            D.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D.delete();
        }
    }

    /* renamed from: f */
    public C0808m7.C0811c mo4836f(C0808m7.C0811c[] cVarArr, int i) {
        return (C0808m7.C0811c) m3608e(cVarArr, i, new C1296a(this));
    }
}
