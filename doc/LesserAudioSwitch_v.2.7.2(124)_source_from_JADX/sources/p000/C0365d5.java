package p000;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: d5 */
public class C0365d5 {

    /* renamed from: a */
    public HashSet<C0365d5> f1878a = new HashSet<>(2);

    /* renamed from: b */
    public int f1879b = 0;

    /* renamed from: a */
    public void mo2636a() {
        this.f1879b = 1;
        Iterator<C0365d5> it = this.f1878a.iterator();
        while (it.hasNext()) {
            it.next().mo1574d();
        }
    }

    /* renamed from: b */
    public void mo2637b() {
        this.f1879b = 0;
        Iterator<C0365d5> it = this.f1878a.iterator();
        while (it.hasNext()) {
            it.next().mo2637b();
        }
    }

    /* renamed from: c */
    public boolean mo2638c() {
        return this.f1879b == 1;
    }

    /* renamed from: d */
    public void mo1574d() {
    }
}
