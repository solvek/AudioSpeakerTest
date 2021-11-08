package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import p000.C0808m7;
import p000.C0860n7;

@SuppressLint({"NewApi"})
/* renamed from: q6 */
public class C1005q6 {

    /* renamed from: a */
    public static final C1295w6 f3777a;

    /* renamed from: b */
    public static final C0556h4<String, Typeface> f3778b = new C0556h4<>(16);

    static {
        C1295w6 w6Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            w6Var = new C1239v6();
        } else if (i >= 28) {
            w6Var = new C1200u6();
        } else if (i >= 26) {
            w6Var = new C1150t6();
        } else {
            if (i >= 24) {
                if (C1100s6.f4163d != null) {
                    w6Var = new C1100s6();
                }
            }
            w6Var = i >= 21 ? new C1046r6() : new C1295w6();
        }
        f3777a = w6Var;
    }

    /* renamed from: a */
    public static Typeface m2911a(Context context, C0520g6 g6Var, Resources resources, int i, int i2, C0757l6 l6Var, Handler handler, boolean z) {
        Typeface typeface;
        if (g6Var instanceof C0666j6) {
            C0666j6 j6Var = (C0666j6) g6Var;
            boolean z2 = true;
            if (!z ? l6Var != null : j6Var.f2843c != 0) {
                z2 = false;
            }
            int i3 = z ? j6Var.f2842b : -1;
            C0610i7 i7Var = j6Var.f2841a;
            C0556h4<String, Typeface> h4Var = C0808m7.f3220a;
            String str = i7Var.f2633e + "-" + i2;
            typeface = C0808m7.f3220a.mo3036a(str);
            if (typeface != null) {
                if (l6Var != null) {
                    l6Var.mo2734d(typeface);
                }
            } else if (!z2 || i3 != -1) {
                C0667j7 j7Var = new C0667j7(context, i7Var, i2, str);
                typeface = null;
                if (z2) {
                    try {
                        typeface = ((C0808m7.C0812d) C0808m7.f3221b.mo3736b(j7Var, i3)).f3232a;
                    } catch (InterruptedException unused) {
                    }
                } else {
                    C0716k7 k7Var = l6Var == null ? null : new C0716k7(l6Var, handler);
                    synchronized (C0808m7.f3222c) {
                        C0663j4<String, ArrayList<C0860n7.C0863c<C0808m7.C0812d>>> j4Var = C0808m7.f3223d;
                        ArrayList orDefault = j4Var.getOrDefault(str, null);
                        if (orDefault == null) {
                            if (k7Var != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(k7Var);
                                j4Var.put(str, arrayList);
                            }
                            C0860n7 n7Var = C0808m7.f3221b;
                            C0760l7 l7Var = new C0760l7(str);
                            n7Var.getClass();
                            n7Var.mo3735a(new C0917o7(n7Var, j7Var, new Handler(), l7Var));
                        } else if (k7Var != null) {
                            orDefault.add(k7Var);
                        }
                    }
                }
            } else {
                C0808m7.C0812d b = C0808m7.m2451b(context, i7Var, i2);
                if (l6Var != null) {
                    int i4 = b.f3233b;
                    if (i4 == 0) {
                        l6Var.mo3599b(b.f3232a, handler);
                    } else {
                        l6Var.mo3598a(i4, handler);
                    }
                }
                typeface = b.f3232a;
            }
        } else {
            typeface = f3777a.mo4193a(context, (C0558h6) g6Var, resources, i2);
            if (l6Var != null) {
                if (typeface != null) {
                    l6Var.mo3599b(typeface, handler);
                } else {
                    l6Var.mo3598a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3778b.mo3037b(m2913c(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: b */
    public static Typeface m2912b(Context context, Resources resources, int i, String str, int i2) {
        Typeface d = f3777a.mo4622d(context, resources, i, str, i2);
        if (d != null) {
            f3778b.mo3037b(m2913c(resources, i, i2), d);
        }
        return d;
    }

    /* renamed from: c */
    public static String m2913c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
