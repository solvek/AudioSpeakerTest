package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: lu */
public class C0796lu<T> {

    /* renamed from: e */
    public static Handler f3194e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public ArrayList<C0593hu<Object, C0797a<T>>> f3195a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<C0593hu<Object, C0797a<T>>> f3196b = new ArrayList<>();

    /* renamed from: c */
    public T f3197c;

    /* renamed from: d */
    public boolean f3198d = false;

    /* renamed from: lu$a */
    public interface C0797a<T> {
        /* renamed from: a */
        void mo1471a(T t);
    }

    /* renamed from: a */
    public void mo3645a(T t) {
        this.f3198d = true;
        this.f3197c = t;
        Iterator<C0593hu<Object, C0797a<T>>> it = this.f3195a.iterator();
        while (it.hasNext()) {
            f3194e.post(new C1390xt(it.next(), t));
        }
        Iterator<C0593hu<Object, C0797a<T>>> it2 = this.f3196b.iterator();
        while (it2.hasNext()) {
            f3194e.post(new C1278vt(it2.next(), t));
        }
        this.f3196b.clear();
    }

    /* renamed from: b */
    public void mo3646b(Object obj, C0797a<T> aVar, boolean z) {
        if (!this.f3198d || z) {
            this.f3196b.add(new C0593hu(obj, aVar));
            return;
        }
        this.f3196b.add(new C0593hu(obj, aVar));
        f3194e.post(new C1227ut(this, aVar));
    }

    /* renamed from: c */
    public void mo3647c(Object obj, C0797a<T> aVar, boolean z) {
        if (!this.f3198d || z) {
            this.f3195a.add(new C0593hu(obj, aVar));
            return;
        }
        this.f3195a.add(new C0593hu(obj, aVar));
        f3194e.post(new C1328wt(this, aVar));
    }

    /* renamed from: d */
    public void mo3648d(Object obj) {
        Iterator<C0593hu<Object, C0797a<T>>> it = this.f3195a.iterator();
        while (it.hasNext()) {
            if (it.next().f2504a == obj) {
                it.remove();
            }
        }
        Iterator<C0593hu<Object, C0797a<T>>> it2 = this.f3196b.iterator();
        while (it2.hasNext()) {
            if (it2.next().f2504a == obj) {
                it2.remove();
            }
        }
    }

    /* renamed from: e */
    public void mo3649e() {
        this.f3198d = false;
        this.f3197c = null;
    }
}
