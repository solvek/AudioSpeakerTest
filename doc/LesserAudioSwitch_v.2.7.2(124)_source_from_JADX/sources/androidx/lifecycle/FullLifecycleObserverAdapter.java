package androidx.lifecycle;

import p000.C0821mb;

public class FullLifecycleObserverAdapter implements C0868nb {

    /* renamed from: a */
    public final C0722kb f731a;

    /* renamed from: b */
    public final C0868nb f732b;

    public FullLifecycleObserverAdapter(C0722kb kbVar, C0868nb nbVar) {
        this.f731a = kbVar;
        this.f732b = nbVar;
    }

    /* renamed from: g */
    public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f731a.mo3545e(pbVar);
                break;
            case 1:
                this.f731a.mo3546f(pbVar);
                break;
            case 2:
                this.f731a.mo3541a(pbVar);
                break;
            case 3:
                this.f731a.mo3542b(pbVar);
                break;
            case 4:
                this.f731a.mo3544d(pbVar);
                break;
            case 5:
                this.f731a.mo3543c(pbVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0868nb nbVar = this.f732b;
        if (nbVar != null) {
            nbVar.mo132g(pbVar, aVar);
        }
    }
}
