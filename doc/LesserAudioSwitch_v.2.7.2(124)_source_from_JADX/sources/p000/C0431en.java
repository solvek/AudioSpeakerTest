package p000;

import java.lang.reflect.Method;

/* renamed from: en */
public class C0431en {

    /* renamed from: a */
    public static final /* synthetic */ int f2021a = 0;

    static {
        String str = C0389dn.f1913a;
    }

    /* renamed from: a */
    public static Method m1604a(Method[] methodArr, String str) {
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Method m1605b(Method[] methodArr, String str) {
        for (int i = 0; i < methodArr.length; i++) {
            if (methodArr[i].getName().equals(str)) {
                return methodArr[i];
            }
        }
        return null;
    }
}
