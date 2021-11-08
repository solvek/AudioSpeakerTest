package p000;

import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: ma */
public final class C0819ma extends C1412yb {

    /* renamed from: g */
    public static final C1450zb f3251g = new C0820a();

    /* renamed from: b */
    public final HashMap<String, Fragment> f3252b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C0819ma> f3253c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C0264cc> f3254d = new HashMap<>();

    /* renamed from: e */
    public final boolean f3255e;

    /* renamed from: f */
    public boolean f3256f = false;

    /* renamed from: ma$a */
    public static class C0820a implements C1450zb {
        /* renamed from: a */
        public <T extends C1412yb> T mo3677a(Class<T> cls) {
            return new C0819ma(true);
        }
    }

    public C0819ma(boolean z) {
        this.f3255e = z;
    }

    /* renamed from: a */
    public void mo2780a() {
        if (C0614ia.m1934M(3)) {
            "onCleared called for " + this;
        }
        this.f3256f = true;
    }

    /* renamed from: b */
    public boolean mo3673b(Fragment fragment) {
        if (this.f3252b.containsKey(fragment.f697e) && this.f3255e) {
            return this.f3256f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0819ma.class != obj.getClass()) {
            return false;
        }
        C0819ma maVar = (C0819ma) obj;
        return this.f3252b.equals(maVar.f3252b) && this.f3253c.equals(maVar.f3253c) && this.f3254d.equals(maVar.f3254d);
    }

    public int hashCode() {
        int hashCode = this.f3253c.hashCode();
        return this.f3254d.hashCode() + ((hashCode + (this.f3252b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3252b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3253c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3254d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
