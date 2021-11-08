package androidx.lifecycle;

import java.util.Map;
import p000.C0821mb;

public abstract class LiveData<T> {

    /* renamed from: i */
    public static final Object f733i = new Object();

    /* renamed from: a */
    public final Object f734a = new Object();

    /* renamed from: b */
    public C1141t3<C1253vb<? super T>, LiveData<T>.C0000a> f735b = new C1141t3<>();

    /* renamed from: c */
    public int f736c = 0;

    /* renamed from: d */
    public volatile Object f737d;

    /* renamed from: e */
    public volatile Object f738e;

    /* renamed from: f */
    public int f739f;

    /* renamed from: g */
    public boolean f740g;

    /* renamed from: h */
    public boolean f741h;

    public class LifecycleBoundObserver extends LiveData<T>.C0000a implements C0868nb {

        /* renamed from: e */
        public final C0967pb f742e;

        /* renamed from: f */
        public final /* synthetic */ LiveData f743f;

        /* renamed from: g */
        public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
            if (((C1011qb) this.f742e.mo124a()).f3809b == C0821mb.C0823b.DESTROYED) {
                this.f743f.mo902f(this.f744a);
            } else {
                mo905h(mo904j());
            }
        }

        /* renamed from: i */
        public void mo903i() {
            ((C1011qb) this.f742e.mo124a()).f3808a.mo4422e(this);
        }

        /* renamed from: j */
        public boolean mo904j() {
            return ((C1011qb) this.f742e.mo124a()).f3809b.compareTo(C0821mb.C0823b.STARTED) >= 0;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public abstract class C0105a {

        /* renamed from: a */
        public final C1253vb<? super T> f744a;

        /* renamed from: b */
        public boolean f745b;

        /* renamed from: c */
        public int f746c;

        /* renamed from: d */
        public final /* synthetic */ LiveData f747d;

        /* renamed from: h */
        public void mo905h(boolean z) {
            if (z != this.f745b) {
                this.f745b = z;
                LiveData liveData = this.f747d;
                int i = liveData.f736c;
                int i2 = 1;
                boolean z2 = i == 0;
                if (!z) {
                    i2 = -1;
                }
                liveData.f736c = i + i2;
                if (z2 && z) {
                    liveData.mo900d();
                }
                LiveData liveData2 = this.f747d;
                if (liveData2.f736c == 0 && !this.f745b) {
                    liveData2.mo901e();
                }
                if (this.f745b) {
                    this.f747d.mo899c(this);
                }
            }
        }

        /* renamed from: i */
        public void mo903i() {
        }

        /* renamed from: j */
        public abstract boolean mo904j();
    }

    public LiveData() {
        Object obj = f733i;
        this.f738e = obj;
        this.f737d = obj;
        this.f739f = -1;
    }

    /* renamed from: a */
    public static void m367a(String str) {
        if (!C0954p3.m2753b().f3546a.mo3949a()) {
            throw new IllegalStateException(C0279ch.m1121r("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void mo898b(LiveData<T>.C0000a aVar) {
        if (aVar.f745b) {
            if (!aVar.mo904j()) {
                aVar.mo905h(false);
                return;
            }
            int i = aVar.f746c;
            int i2 = this.f739f;
            if (i < i2) {
                aVar.f746c = i2;
                aVar.f744a.mo4883a(this.f737d);
            }
        }
    }

    /* renamed from: c */
    public void mo899c(LiveData<T>.C0000a aVar) {
        if (this.f740g) {
            this.f741h = true;
            return;
        }
        this.f740g = true;
        do {
            this.f741h = false;
            if (aVar == null) {
                C1141t3<K, V>.C0355d b = this.f735b.mo4602b();
                while (b.hasNext()) {
                    mo898b((C0105a) ((Map.Entry) b.next()).getValue());
                    if (this.f741h) {
                        break;
                    }
                }
            } else {
                mo898b(aVar);
                aVar = null;
            }
        } while (this.f741h);
        this.f740g = false;
    }

    /* renamed from: d */
    public void mo900d() {
    }

    /* renamed from: e */
    public void mo901e() {
    }

    /* renamed from: f */
    public void mo902f(C1253vb<? super T> vbVar) {
        m367a("removeObserver");
        C0105a e = this.f735b.mo4422e(vbVar);
        if (e != null) {
            e.mo903i();
            e.mo905h(false);
        }
    }
}
