package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: bb */
public class C0216bb implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f1257b;

    /* renamed from: c */
    public final /* synthetic */ Map f1258c;

    public C0216bb(C0263cb cbVar, ArrayList arrayList, Map map) {
        this.f1257b = arrayList;
        this.f1258c = map;
    }

    public void run() {
        int size = this.f1257b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1257b.get(i);
            C0813m8.m2465N(view, (String) this.f1258c.get(C0813m8.m2483q(view)));
        }
    }
}
