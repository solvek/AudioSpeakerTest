package androidx.lifecycle;

import p000.C0671jb;
import p000.C0821mb;

public class ReflectiveGenericLifecycleObserver implements C0868nb {

    /* renamed from: a */
    public final Object f748a;

    /* renamed from: b */
    public final C0671jb.C0672a f749b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f748a = obj;
        this.f749b = C0671jb.f2854c.mo3424b(obj.getClass());
    }

    /* renamed from: g */
    public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
        C0671jb.C0672a aVar2 = this.f749b;
        Object obj = this.f748a;
        C0671jb.C0672a.m2121a(aVar2.f2857a.get(aVar), pbVar, aVar, obj);
        C0671jb.C0672a.m2121a(aVar2.f2857a.get(C0821mb.C0822a.ON_ANY), pbVar, aVar, obj);
    }
}
