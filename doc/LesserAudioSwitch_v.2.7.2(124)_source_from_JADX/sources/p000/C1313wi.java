package p000;

import android.os.Build;

/* renamed from: wi */
public class C1313wi {

    /* renamed from: a */
    public static final int f4961a;

    static {
        int i = Build.VERSION.SDK_INT;
        f4961a = i >= 21 ? 2 : i >= 18 ? 1 : 0;
    }
}
