package p000;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: pa */
public class C0966pa {

    /* renamed from: a */
    public final ArrayList<Fragment> f3605a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C0921oa> f3606b = new HashMap<>();

    /* renamed from: a */
    public void mo4001a(Fragment fragment) {
        if (!this.f3605a.contains(fragment)) {
            synchronized (this.f3605a) {
                this.f3605a.add(fragment);
            }
            fragment.f703k = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public void mo4002b() {
        this.f3606b.values().removeAll(Collections.singleton((Object) null));
    }

    /* renamed from: c */
    public boolean mo4003c(String str) {
        return this.f3606b.containsKey(str);
    }

    /* renamed from: d */
    public void mo4004d(int i) {
        Iterator<Fragment> it = this.f3605a.iterator();
        while (it.hasNext()) {
            C0921oa oaVar = this.f3606b.get(it.next().f697e);
            if (oaVar != null) {
                oaVar.f3490c = i;
            }
        }
        for (C0921oa next : this.f3606b.values()) {
            if (next != null) {
                next.f3490c = i;
            }
        }
    }

    /* renamed from: e */
    public Fragment mo4005e(String str) {
        C0921oa oaVar = this.f3606b.get(str);
        if (oaVar != null) {
            return oaVar.f3489b;
        }
        return null;
    }

    /* renamed from: f */
    public List<Fragment> mo4006f() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0921oa> it = this.f3606b.values().iterator();
        while (it.hasNext()) {
            C0921oa next = it.next();
            arrayList.add(next != null ? next.f3489b : null);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<Fragment> mo4007g() {
        ArrayList arrayList;
        if (this.f3605a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3605a) {
            arrayList = new ArrayList(this.f3605a);
        }
        return arrayList;
    }

    /* renamed from: h */
    public void mo4008h(Fragment fragment) {
        synchronized (this.f3605a) {
            this.f3605a.remove(fragment);
        }
        fragment.f703k = false;
    }
}
