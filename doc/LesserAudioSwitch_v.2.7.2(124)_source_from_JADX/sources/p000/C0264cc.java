package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cc */
public class C0264cc {

    /* renamed from: a */
    public final HashMap<String, C1412yb> f1355a = new HashMap<>();

    /* renamed from: a */
    public final void mo1737a() {
        for (C1412yb next : this.f1355a.values()) {
            Map<String, Object> map = next.f5183a;
            if (map != null) {
                synchronized (map) {
                    for (Object next2 : next.f5183a.values()) {
                        if (next2 instanceof Closeable) {
                            try {
                                ((Closeable) next2).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            next.mo2780a();
        }
        this.f1355a.clear();
    }
}
