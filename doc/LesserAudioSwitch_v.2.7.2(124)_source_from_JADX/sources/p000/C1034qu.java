package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: qu */
public final /* synthetic */ class C1034qu implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3876b;

    /* renamed from: c */
    public final /* synthetic */ Object[] f3877c;

    /* renamed from: d */
    public final /* synthetic */ int f3878d;

    public /* synthetic */ C1034qu(ArrayList arrayList, Object[] objArr, int i) {
        this.f3876b = arrayList;
        this.f3877c = objArr;
        this.f3878d = i;
    }

    public final void run() {
        ArrayList arrayList = this.f3876b;
        Object obj = this.f3877c[this.f3878d];
        Class cls = byte[].class;
        String str = null;
        try {
            Class a = C0389dn.m1512a(C0200av.m970a(-100088601203884L), obj.getClass().getClassLoader());
            Object invoke = a.getDeclaredMethod(C0200av.m970a(-100208860288172L), new Class[]{String.class}).invoke((Object) null, new Object[]{C0200av.m970a(-100260399895724L)});
            a.getDeclaredMethod(C0200av.m970a(-100277579764908L), new Class[]{cls}).invoke(invoke, new Object[]{obj.getClass().getMethod(C0200av.m970a(-100307644535980L), new Class[0]).invoke(obj, new Object[0])});
            Object obj2 = (byte[]) a.getDeclaredMethod(C0200av.m970a(-100359184143532L), new Class[0]).invoke(invoke, new Object[0]);
            try {
                Class a2 = C0389dn.m1512a(C0200av.m970a(-99826608198828L), obj2.getClass().getClassLoader());
                C1228uu.f4686b = a2;
                Method declaredMethod = a2.getDeclaredMethod(C0200av.m970a(-99912507544748L), new Class[]{cls, Integer.TYPE});
                C1228uu.f4687c = declaredMethod;
                str = (String) declaredMethod.invoke((Object) null, new Object[]{obj2, 2});
            } catch (Exception e) {
                String a3 = C0200av.m970a(-99976932054188L);
                C0550gu.m1822d(a3, C0200av.m970a(-99994111923372L) + e.getMessage());
            }
        } catch (Exception e2) {
            C0279ch.m1114k(-100406428783788L, new StringBuilder(), e2, C0200av.m970a(-100389248914604L));
        }
        arrayList.add(str);
    }
}
