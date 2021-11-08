package p000;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: q7 */
public final class C1006q7 {

    /* renamed from: a */
    public static Method f3779a;

    /* renamed from: b */
    public static Method f3780b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                f3779a = cls2.getMethod("getScript", new Class[]{cls});
                f3780b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception unused) {
                f3779a = null;
                f3780b = null;
            }
        } else if (i < 24) {
            try {
                f3780b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
