package p000;

import android.os.Build;

/* renamed from: qe */
public class C1016qe {

    /* renamed from: a */
    public static final boolean f3822a;

    /* renamed from: b */
    public static final boolean f3823b;

    /* renamed from: c */
    public static final boolean f3824c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f3822a = i >= 19;
        f3823b = i >= 18;
        if (i < 28) {
            z = false;
        }
        f3824c = z;
    }
}
