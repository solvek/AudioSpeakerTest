package p000;

import android.os.Build;
import android.os.Trace;

/* renamed from: h7 */
public final class C0559h7 {
    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1850a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m1851b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
