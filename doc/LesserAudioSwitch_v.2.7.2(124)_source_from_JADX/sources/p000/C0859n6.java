package p000;

import android.graphics.Color;

/* renamed from: n6 */
public final class C0859n6 {
    static {
        new ThreadLocal();
    }

    /* renamed from: a */
    public static int m2572a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, m2573b(Color.red(i), alpha2, Color.red(i2), alpha, i3), m2573b(Color.green(i), alpha2, Color.green(i2), alpha, i3), m2573b(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: b */
    public static int m2573b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* renamed from: c */
    public static int m2574c(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
