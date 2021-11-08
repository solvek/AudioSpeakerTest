package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.C0821mb;
import p000.C1359xd;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements C0868nb {

    /* renamed from: a */
    public final C1452zd f1160a;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C0191a implements C1359xd.C1361b {

        /* renamed from: a */
        public final Set<String> f1161a = new HashSet();

        public C0191a(C1359xd xdVar) {
            if (xdVar.f5071a.mo4421d("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }

        /* renamed from: a */
        public Bundle mo1463a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f1161a));
            return bundle;
        }
    }

    public Recreator(C1452zd zdVar) {
        this.f1160a = zdVar;
    }

    /* renamed from: g */
    public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
        if (aVar == C0821mb.C0822a.ON_CREATE) {
            ((C1011qb) pbVar.mo124a()).f3808a.mo4422e(this);
            C1359xd d = this.f1160a.mo126d();
            if (d.f5073c) {
                Bundle bundle = d.f5072b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                    d.f5072b.remove("androidx.savedstate.Restarter");
                    if (d.f5072b.isEmpty()) {
                        d.f5072b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 != null) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            try {
                                Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C1359xd.C1360a.class);
                                try {
                                    Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        ((C1359xd.C1360a) declaredConstructor.newInstance(new Object[0])).mo906a(this.f1160a);
                                    } catch (Exception e) {
                                        throw new RuntimeException(C0279ch.m1120q("Failed to instantiate ", next), e);
                                    }
                                } catch (NoSuchMethodException e2) {
                                    StringBuilder c = C0279ch.m1106c("Class");
                                    c.append(asSubclass.getSimpleName());
                                    c.append(" must have default constructor in order to be automatically recreated");
                                    throw new IllegalStateException(c.toString(), e2);
                                }
                            } catch (ClassNotFoundException e3) {
                                throw new RuntimeException(C0279ch.m1121r("Class ", next, " wasn't found"), e3);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
