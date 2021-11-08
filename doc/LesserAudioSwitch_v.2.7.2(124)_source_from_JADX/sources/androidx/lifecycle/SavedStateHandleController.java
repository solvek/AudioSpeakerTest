package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p000.C0821mb;
import p000.C1359xd;

public final class SavedStateHandleController implements C0868nb {

    /* renamed from: a */
    public boolean f750a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    public final class C01061 implements C0868nb {

        /* renamed from: a */
        public final /* synthetic */ C0821mb f751a;

        /* renamed from: b */
        public final /* synthetic */ C1359xd f752b;

        /* renamed from: g */
        public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
            if (aVar == C0821mb.C0822a.ON_START) {
                ((C1011qb) this.f751a).f3808a.mo4422e(this);
                this.f752b.mo5095a(C0107a.class);
            }
        }
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C0107a implements C1359xd.C1360a {
        /* renamed from: a */
        public void mo906a(C1452zd zdVar) {
            Object obj;
            boolean z;
            if (zdVar instanceof C0372dc) {
                C0264cc e = ((C0372dc) zdVar).mo127e();
                C1359xd d = zdVar.mo126d();
                e.getClass();
                Iterator it = new HashSet(e.f1355a.keySet()).iterator();
                while (it.hasNext()) {
                    C1412yb ybVar = e.f1355a.get((String) it.next());
                    C0821mb a = zdVar.mo124a();
                    Map<String, Object> map = ybVar.f5183a;
                    if (map == null) {
                        obj = null;
                    } else {
                        synchronized (map) {
                            obj = ybVar.f5183a.get("androidx.lifecycle.savedstate.vm.tag");
                        }
                    }
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                    if (savedStateHandleController != null && !(z = savedStateHandleController.f750a)) {
                        if (z) {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                        savedStateHandleController.f750a = true;
                        a.mo3678a(savedStateHandleController);
                        throw null;
                    }
                }
                if (!new HashSet(e.f1355a.keySet()).isEmpty()) {
                    d.mo5095a(C0107a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: g */
    public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
        if (aVar == C0821mb.C0822a.ON_DESTROY) {
            this.f750a = false;
            ((C1011qb) pbVar.mo124a()).f3808a.mo4422e(this);
        }
    }
}
