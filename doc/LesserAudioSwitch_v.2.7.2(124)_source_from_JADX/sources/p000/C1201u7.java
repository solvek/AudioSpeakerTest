package p000;

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: u7 */
public final class C1201u7 {

    /* renamed from: a */
    public static final Locale f4606a = new Locale("", "");

    /* renamed from: a */
    public static int m3366a(Locale locale) {
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f4606a)) {
            Method method = C1006q7.f3779a;
            if (i >= 24) {
                str = ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
            } else if (i >= 21) {
                try {
                    str = ((Locale) C1006q7.f3780b.invoke((Object) null, new Object[]{locale})).getScript();
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    str = locale.getScript();
                }
            } else {
                String locale2 = locale.toString();
                try {
                    Method method2 = C1006q7.f3780b;
                    if (method2 != null) {
                        locale2 = (String) method2.invoke((Object) null, new Object[]{locale2});
                    }
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                if (locale2 != null) {
                    try {
                        Method method3 = C1006q7.f3779a;
                        if (method3 != null) {
                            str = (String) method3.invoke((Object) null, new Object[]{locale2});
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
                str = null;
            }
            if (str == null) {
                byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
                if (directionality == 1 || directionality == 2) {
                    return 1;
                }
                return 0;
            } else if (str.equalsIgnoreCase("Arab") || str.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
