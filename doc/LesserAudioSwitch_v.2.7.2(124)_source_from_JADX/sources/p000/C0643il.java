package p000;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* renamed from: il */
public class C0643il {

    /* renamed from: a */
    public static final boolean f2756a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    public static final int[] f2757b = {16842910, 16842919};

    /* renamed from: c */
    public static final String f2758c = C0643il.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m2052a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            int alpha = Color.alpha(colorStateList.getColorForState(f2757b, 0));
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m2053b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
