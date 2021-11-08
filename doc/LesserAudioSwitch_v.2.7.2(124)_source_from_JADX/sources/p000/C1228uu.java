package p000;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: uu */
public class C1228uu {

    /* renamed from: b */
    public static Class f4686b;

    /* renamed from: c */
    public static Method f4687c;

    /* renamed from: d */
    public static Method f4688d;

    /* renamed from: a */
    public Object f4689a = null;

    static {
        C0200av.m970a(-102983409161388L);
        try {
            Class a = C0389dn.m1512a(C0200av.m970a(-103000589030572L), C1228uu.class.getClassLoader());
            f4686b = a;
            String a2 = C0200av.m970a(-103086488376492L);
            Class cls = Integer.TYPE;
            f4687c = a.getDeclaredMethod(a2, new Class[]{byte[].class, cls});
            f4688d = f4686b.getDeclaredMethod(C0200av.m970a(-103150912885932L), new Class[]{String.class, cls});
        } catch (Exception e) {
            C0279ch.m1114k(-103198157526188L, new StringBuilder(), e, C0200av.m970a(-103180977657004L));
        }
    }

    public C1228uu(Context context) {
        Object obj = new Object[0];
        try {
            Method b = C0431en.m1605b(Context.class.getDeclaredMethods(), C0200av.m970a(-100500918064300L));
            Method declaredMethod = b.getReturnType().getDeclaredMethod(C0200av.m970a(-100578227475628L), new Class[]{String.class, Integer.TYPE});
            Object invoke = C0431en.m1605b(Context.class.getDeclaredMethods(), C0200av.m970a(-100642651985068L)).invoke(context, new Object[0]);
            Object invoke2 = declaredMethod.invoke(b.invoke(context, new Object[0]), new Object[]{invoke, 64});
            obj = invoke2.getClass().getDeclaredField(C0200av.m970a(-100707076494508L)).get(invoke2);
        } catch (Exception e) {
            C0279ch.m1114k(-100771501003948L, new StringBuilder(), e, C0200av.m970a(-100754321134764L));
        }
        this.f4689a = obj;
    }
}
