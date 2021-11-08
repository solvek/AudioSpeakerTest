package p000;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: wd */
public class C1306wd {

    /* renamed from: a */
    public final C0663j4<RecyclerView.C0145a0, C1307a> f4950a = new C0663j4<>();

    /* renamed from: b */
    public final C0518g4<RecyclerView.C0145a0> f4951b = new C0518g4<>();

    /* renamed from: wd$a */
    public static class C1307a {

        /* renamed from: d */
        public static C1346x7<C1307a> f4952d = new C1346x7<>(20);

        /* renamed from: a */
        public int f4953a;

        /* renamed from: b */
        public RecyclerView.C0154j.C0157c f4954b;

        /* renamed from: c */
        public RecyclerView.C0154j.C0157c f4955c;

        /* renamed from: a */
        public static C1307a m3647a() {
            C1307a a = f4952d.mo5053a();
            return a == null ? new C1307a() : a;
        }

        /* renamed from: b */
        public static void m3648b(C1307a aVar) {
            aVar.f4953a = 0;
            aVar.f4954b = null;
            aVar.f4955c = null;
            f4952d.mo5054b(aVar);
        }
    }

    /* renamed from: wd$b */
    public interface C1308b {
    }

    /* renamed from: a */
    public void mo5002a(RecyclerView.C0145a0 a0Var) {
        C1307a orDefault = this.f4950a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = C1307a.m3647a();
            this.f4950a.put(a0Var, orDefault);
        }
        orDefault.f4953a |= 1;
    }

    /* renamed from: b */
    public void mo5003b(RecyclerView.C0145a0 a0Var, RecyclerView.C0154j.C0157c cVar) {
        C1307a orDefault = this.f4950a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = C1307a.m3647a();
            this.f4950a.put(a0Var, orDefault);
        }
        orDefault.f4955c = cVar;
        orDefault.f4953a |= 8;
    }

    /* renamed from: c */
    public void mo5004c(RecyclerView.C0145a0 a0Var, RecyclerView.C0154j.C0157c cVar) {
        C1307a orDefault = this.f4950a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = C1307a.m3647a();
            this.f4950a.put(a0Var, orDefault);
        }
        orDefault.f4954b = cVar;
        orDefault.f4953a |= 4;
    }

    /* renamed from: d */
    public boolean mo5005d(RecyclerView.C0145a0 a0Var) {
        C1307a orDefault = this.f4950a.getOrDefault(a0Var, null);
        return (orDefault == null || (orDefault.f4953a & 1) == 0) ? false : true;
    }

    /* renamed from: e */
    public final RecyclerView.C0154j.C0157c mo5006e(RecyclerView.C0145a0 a0Var, int i) {
        C1307a k;
        RecyclerView.C0154j.C0157c cVar;
        int e = this.f4950a.mo3396e(a0Var);
        if (e >= 0 && (k = this.f4950a.mo3407k(e)) != null) {
            int i2 = k.f4953a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                k.f4953a = i3;
                if (i == 4) {
                    cVar = k.f4954b;
                } else if (i == 8) {
                    cVar = k.f4955c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4950a.mo3404i(e);
                    C1307a.m3648b(k);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public void mo5007f(RecyclerView.C0145a0 a0Var) {
        C1307a orDefault = this.f4950a.getOrDefault(a0Var, null);
        if (orDefault != null) {
            orDefault.f4953a &= -2;
        }
    }

    /* renamed from: g */
    public void mo5008g(RecyclerView.C0145a0 a0Var) {
        int h = this.f4951b.mo2930h() - 1;
        while (true) {
            if (h < 0) {
                break;
            } else if (a0Var == this.f4951b.mo2931i(h)) {
                C0518g4<RecyclerView.C0145a0> g4Var = this.f4951b;
                Object[] objArr = g4Var.f2265d;
                Object obj = objArr[h];
                Object obj2 = C0518g4.f2262f;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    g4Var.f2263b = true;
                }
            } else {
                h--;
            }
        }
        C1307a remove = this.f4950a.remove(a0Var);
        if (remove != null) {
            C1307a.m3648b(remove);
        }
    }
}
