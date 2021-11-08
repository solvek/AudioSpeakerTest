package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: cp */
public class C0348cp {

    /* renamed from: a */
    public final String f1827a;

    /* renamed from: b */
    public final String f1828b;

    /* renamed from: c */
    public final String f1829c;

    /* renamed from: d */
    public final String f1830d;

    /* renamed from: e */
    public Object f1831e;

    /* renamed from: f */
    public C0544go f1832f;

    public C0348cp(String str, String str2, String str3, String str4, C0544go goVar) {
        this.f1827a = str;
        this.f1828b = str2;
        this.f1829c = str3;
        this.f1830d = str4;
        String p = C0728kh.m2300p();
        String q = C0728kh.m2301q();
        int i = C1136su.f4328a;
        Class cls = String.class;
        Object obj = null;
        try {
            Object obj2 = p + q;
            Class cls2 = C1228uu.f4686b;
            byte[] bArr = new byte[0];
            try {
                bArr = (byte[]) C1228uu.f4688d.invoke((Object) null, new Object[]{obj2, 0});
            } catch (Exception e) {
                C0550gu.m1822d(C0200av.m970a(-99714939049132L), C0200av.m970a(-99732118918316L) + e.getMessage());
            }
            Class a = C0389dn.m1512a(C0200av.m970a(-98246060233900L), cls.getClassLoader());
            Constructor declaredConstructor = C0389dn.m1512a(C0200av.m970a(-98353434416300L), cls.getClassLoader()).getDeclaredConstructor(new Class[]{byte[].class});
            Class a2 = C0389dn.m1512a(C0200av.m970a(-98516643173548L), cls.getClassLoader());
            Method declaredMethod = a.getDeclaredMethod(C0200av.m970a(-98632607290540L), new Class[]{cls});
            obj = a.getDeclaredMethod(C0200av.m970a(-98684146898092L), new Class[]{a2}).invoke(declaredMethod.invoke((Object) null, new Object[]{C0200av.m970a(-98748571407532L)}), new Object[]{declaredConstructor.newInstance(new Object[]{bArr})});
        } catch (Exception e2) {
            C0279ch.m1114k(-98782931145900L, new StringBuilder(), e2, C0200av.m970a(-98765751276716L));
        }
        this.f1831e = obj;
        this.f1832f = goVar;
    }

    public String toString() {
        StringBuilder c = C0279ch.m1106c("P: ");
        c.append(this.f1827a);
        c.append("\n");
        c.append("DI: ");
        c.append(this.f1829c);
        c.append("\n");
        c.append("HEX: ");
        c.append(this.f1830d);
        c.append("\n");
        c.append("OW: ");
        c.append(this.f1832f);
        c.append("\n");
        c.append("SI: ");
        c.append(this.f1828b);
        c.append("\n");
        c.append("PK: ");
        c.append(this.f1831e);
        c.append("\n");
        return c.toString();
    }

    public C0348cp(String str, String str2, String str3, String str4, C0544go goVar, String str5) {
        this.f1827a = str;
        this.f1828b = str2;
        this.f1829c = str3;
        this.f1830d = str4;
        int i = C1136su.f4328a;
        Class cls = String.class;
        Object obj = null;
        try {
            Object obj2 = str5 + C0200av.m970a(-98241765266604L);
            Class cls2 = C1228uu.f4686b;
            byte[] bArr = new byte[0];
            try {
                bArr = (byte[]) C1228uu.f4688d.invoke((Object) null, new Object[]{obj2, 0});
            } catch (Exception e) {
                C0550gu.m1822d(C0200av.m970a(-99714939049132L), C0200av.m970a(-99732118918316L) + e.getMessage());
            }
            Class a = C0389dn.m1512a(C0200av.m970a(-98246060233900L), cls.getClassLoader());
            Constructor declaredConstructor = C0389dn.m1512a(C0200av.m970a(-98353434416300L), cls.getClassLoader()).getDeclaredConstructor(new Class[]{byte[].class});
            Class a2 = C0389dn.m1512a(C0200av.m970a(-98516643173548L), cls.getClassLoader());
            Method declaredMethod = a.getDeclaredMethod(C0200av.m970a(-98632607290540L), new Class[]{cls});
            obj = a.getDeclaredMethod(C0200av.m970a(-98684146898092L), new Class[]{a2}).invoke(declaredMethod.invoke((Object) null, new Object[]{C0200av.m970a(-98748571407532L)}), new Object[]{declaredConstructor.newInstance(new Object[]{bArr})});
        } catch (Exception e2) {
            C0279ch.m1114k(-98782931145900L, new StringBuilder(), e2, C0200av.m970a(-98765751276716L));
        }
        this.f1831e = obj;
        this.f1832f = goVar;
        String.valueOf(goVar.ordinal());
    }
}
