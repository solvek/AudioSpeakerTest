package p000;

import androidx.fragment.app.Fragment;

/* renamed from: ea */
public class C0412ea {

    /* renamed from: a */
    public static final C0663j4<String, Class<?>> f1985a = new C0663j4<>();

    /* renamed from: b */
    public static Class<?> m1562b(ClassLoader classLoader, String str) {
        C0663j4<String, Class<?>> j4Var = f1985a;
        Class<?> orDefault = j4Var.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        j4Var.put(str, cls);
        return cls;
    }

    /* renamed from: c */
    public static Class<? extends Fragment> m1563c(ClassLoader classLoader, String str) {
        try {
            return m1562b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0103b(C0279ch.m1121r("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0103b(C0279ch.m1121r("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo2719a(ClassLoader classLoader, String str) {
        throw null;
    }
}
