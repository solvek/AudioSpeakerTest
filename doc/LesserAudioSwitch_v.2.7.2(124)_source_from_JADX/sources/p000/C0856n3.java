package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: n3 */
public class C0856n3 {

    /* renamed from: a */
    public static Method f3335a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f3335a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f3335a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2571a(View view) {
        return C0813m8.m2478l(view) == 1;
    }
}
