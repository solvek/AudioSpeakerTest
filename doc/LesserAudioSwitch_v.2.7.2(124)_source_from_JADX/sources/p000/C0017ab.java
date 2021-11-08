package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ab */
public class C0017ab implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f89b;

    /* renamed from: c */
    public final /* synthetic */ Map f90c;

    public C0017ab(C0263cb cbVar, ArrayList arrayList, Map map) {
        this.f89b = arrayList;
        this.f90c = map;
    }

    public void run() {
        String str;
        int size = this.f89b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f89b.get(i);
            String q = C0813m8.m2483q(view);
            if (q != null) {
                Iterator it = this.f90c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (q.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                C0813m8.m2465N(view, str);
            }
        }
    }
}
