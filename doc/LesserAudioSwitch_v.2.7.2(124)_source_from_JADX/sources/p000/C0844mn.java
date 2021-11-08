package p000;

import android.content.Context;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0584ho;
import p000.C0936oo;
import p000.C0985po;

/* renamed from: mn */
public final /* synthetic */ class C0844mn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f3316b;

    /* renamed from: c */
    public final /* synthetic */ C0936oo.C0937a f3317c;

    public /* synthetic */ C0844mn(Context context, C0936oo.C0937a aVar) {
        this.f3316b = context;
        this.f3317c = aVar;
    }

    public final void run() {
        Context context = this.f3316b;
        C0936oo.C0937a aVar = this.f3317c;
        ArrayList arrayList = (ArrayList) C0584ho.m1883a((AudioManager) context.getSystemService(C0200av.m970a(-33971874649260L)));
        C0985po[] poVarArr = new C0985po[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0584ho.C0586b bVar = (C0584ho.C0586b) it.next();
            C1028qo qoVar = C1028qo.f3842A.get(Integer.valueOf(bVar.mo3098a()));
            String b = bVar.mo3099b();
            if (qoVar != null) {
                poVarArr[i] = new C0985po.C0986a(qoVar, bVar.mo3100c().toString(), b, bVar.mo3101d());
            } else {
                poVarArr[i] = new C0985po.C0986a(bVar.mo3098a(), bVar.mo3100c().toString(), b, bVar.mo3101d());
            }
            i++;
        }
        aVar.mo3807a(poVarArr);
    }
}
