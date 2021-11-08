package p000;

import java.util.Iterator;
import p000.C0438eu;

/* renamed from: st */
public final /* synthetic */ class C1135st implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f4327b;

    public /* synthetic */ C1135st(String str) {
        this.f4327b = str;
    }

    public final void run() {
        String str = this.f4327b;
        Iterator<C0438eu.C0439a> it = C0438eu.f2044b.iterator();
        while (it.hasNext()) {
            C0438eu.C0439a next = it.next();
            if (next != null) {
                next.mo2743a(str);
            }
        }
    }
}
