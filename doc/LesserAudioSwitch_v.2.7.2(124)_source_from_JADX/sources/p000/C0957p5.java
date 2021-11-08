package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: p5 */
public final class C0957p5<T> {

    /* renamed from: a */
    public final C1346x7<ArrayList<T>> f3563a = new C1346x7<>(10);

    /* renamed from: b */
    public final C0663j4<T, ArrayList<T>> f3564b = new C0663j4<>();

    /* renamed from: c */
    public final ArrayList<T> f3565c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f3566d = new HashSet<>();

    /* renamed from: a */
    public void mo3971a(T t) {
        if (!(this.f3564b.mo3396e(t) >= 0)) {
            this.f3564b.put(t, null);
        }
    }

    /* renamed from: b */
    public final void mo3972b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList orDefault = this.f3564b.getOrDefault(t, null);
                if (orDefault != null) {
                    int size = orDefault.size();
                    for (int i = 0; i < size; i++) {
                        mo3972b(orDefault.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
