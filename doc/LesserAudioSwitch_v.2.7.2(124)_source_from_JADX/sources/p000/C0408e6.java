package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* renamed from: e6 */
public class C0408e6 {

    /* renamed from: a */
    public static final Object f1978a = new Object();

    /* renamed from: b */
    public static TypedValue f1979b;

    /* renamed from: a */
    public static int m1547a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: b */
    public static Drawable m1548b(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f1978a) {
                if (f1979b == null) {
                    f1979b = new TypedValue();
                }
                context.getResources().getValue(i, f1979b, true);
                i = f1979b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }
}
