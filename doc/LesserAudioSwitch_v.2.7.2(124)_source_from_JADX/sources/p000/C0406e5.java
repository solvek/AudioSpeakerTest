package p000;

import java.util.ArrayList;
import p000.C1196u4;

/* renamed from: e5 */
public class C0406e5 {

    /* renamed from: a */
    public int f1968a;

    /* renamed from: b */
    public int f1969b;

    /* renamed from: c */
    public int f1970c;

    /* renamed from: d */
    public int f1971d;

    /* renamed from: e */
    public ArrayList<C0407a> f1972e = new ArrayList<>();

    /* renamed from: e5$a */
    public static class C0407a {

        /* renamed from: a */
        public C1196u4 f1973a;

        /* renamed from: b */
        public C1196u4 f1974b;

        /* renamed from: c */
        public int f1975c;

        /* renamed from: d */
        public C1196u4.C1197a f1976d;

        /* renamed from: e */
        public int f1977e;

        public C0407a(C1196u4 u4Var) {
            this.f1973a = u4Var;
            this.f1974b = u4Var.f4584d;
            this.f1975c = u4Var.mo4768b();
            this.f1976d = u4Var.f4587g;
            this.f1977e = u4Var.f4588h;
        }
    }

    public C0406e5(C1236v4 v4Var) {
        this.f1968a = v4Var.f4711I;
        this.f1969b = v4Var.f4712J;
        this.f1970c = v4Var.mo4825n();
        this.f1971d = v4Var.mo4819h();
        ArrayList<C1196u4> arrayList = v4Var.f4704B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f1972e.add(new C0407a(arrayList.get(i)));
        }
    }
}
