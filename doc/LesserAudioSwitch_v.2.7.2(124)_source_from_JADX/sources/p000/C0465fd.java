package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fd */
public class C0465fd extends C1108sd {

    /* renamed from: s */
    public static TimeInterpolator f2109s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C0145a0> f2110h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C0145a0> f2111i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0467b> f2112j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C0466a> f2113k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C0145a0>> f2114l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C0467b>> f2115m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C0466a>> f2116n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C0145a0> f2117o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C0145a0> f2118p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C0145a0> f2119q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C0145a0> f2120r = new ArrayList<>();

    /* renamed from: fd$a */
    public static class C0466a {

        /* renamed from: a */
        public RecyclerView.C0145a0 f2121a;

        /* renamed from: b */
        public RecyclerView.C0145a0 f2122b;

        /* renamed from: c */
        public int f2123c;

        /* renamed from: d */
        public int f2124d;

        /* renamed from: e */
        public int f2125e;

        /* renamed from: f */
        public int f2126f;

        public C0466a(RecyclerView.C0145a0 a0Var, RecyclerView.C0145a0 a0Var2, int i, int i2, int i3, int i4) {
            this.f2121a = a0Var;
            this.f2122b = a0Var2;
            this.f2123c = i;
            this.f2124d = i2;
            this.f2125e = i3;
            this.f2126f = i4;
        }

        public String toString() {
            StringBuilder c = C0279ch.m1106c("ChangeInfo{oldHolder=");
            c.append(this.f2121a);
            c.append(", newHolder=");
            c.append(this.f2122b);
            c.append(", fromX=");
            c.append(this.f2123c);
            c.append(", fromY=");
            c.append(this.f2124d);
            c.append(", toX=");
            c.append(this.f2125e);
            c.append(", toY=");
            c.append(this.f2126f);
            c.append('}');
            return c.toString();
        }
    }

    /* renamed from: fd$b */
    public static class C0467b {

        /* renamed from: a */
        public RecyclerView.C0145a0 f2127a;

        /* renamed from: b */
        public int f2128b;

        /* renamed from: c */
        public int f2129c;

        /* renamed from: d */
        public int f2130d;

        /* renamed from: e */
        public int f2131e;

        public C0467b(RecyclerView.C0145a0 a0Var, int i, int i2, int i3, int i4) {
            this.f2127a = a0Var;
            this.f2128b = i;
            this.f2129c = i2;
            this.f2130d = i3;
            this.f2131e = i4;
        }
    }

    /* renamed from: e */
    public void mo1289e(RecyclerView.C0145a0 a0Var) {
        View view = a0Var.f996a;
        view.animate().cancel();
        int size = this.f2112j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2112j.get(size).f2127a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo1287c(a0Var);
                this.f2112j.remove(size);
            }
        }
        mo2785l(this.f2113k, a0Var);
        if (this.f2110h.remove(a0Var)) {
            view.setAlpha(1.0f);
            mo1287c(a0Var);
        }
        if (this.f2111i.remove(a0Var)) {
            view.setAlpha(1.0f);
            mo1287c(a0Var);
        }
        int size2 = this.f2116n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f2116n.get(size2);
            mo2785l(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.f2116n.remove(size2);
            }
        }
        int size3 = this.f2115m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f2115m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C0467b) arrayList2.get(size4)).f2127a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo1287c(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2115m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2114l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f2114l.get(size5);
                if (arrayList3.remove(a0Var)) {
                    view.setAlpha(1.0f);
                    mo1287c(a0Var);
                    if (arrayList3.isEmpty()) {
                        this.f2114l.remove(size5);
                    }
                }
            } else {
                this.f2119q.remove(a0Var);
                this.f2117o.remove(a0Var);
                this.f2120r.remove(a0Var);
                this.f2118p.remove(a0Var);
                mo2784k();
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo1290f() {
        int size = this.f2112j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0467b bVar = this.f2112j.get(size);
            View view = bVar.f2127a.f996a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo1287c(bVar.f2127a);
            this.f2112j.remove(size);
        }
        int size2 = this.f2110h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo1287c(this.f2110h.get(size2));
            this.f2110h.remove(size2);
        }
        int size3 = this.f2111i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0145a0 a0Var = this.f2111i.get(size3);
            a0Var.f996a.setAlpha(1.0f);
            mo1287c(a0Var);
            this.f2111i.remove(size3);
        }
        int size4 = this.f2113k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C0466a aVar = this.f2113k.get(size4);
            RecyclerView.C0145a0 a0Var2 = aVar.f2121a;
            if (a0Var2 != null) {
                mo2786m(aVar, a0Var2);
            }
            RecyclerView.C0145a0 a0Var3 = aVar.f2122b;
            if (a0Var3 != null) {
                mo2786m(aVar, a0Var3);
            }
        }
        this.f2113k.clear();
        if (mo1291g()) {
            int size5 = this.f2115m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f2115m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C0467b bVar2 = (C0467b) arrayList.get(size6);
                        View view2 = bVar2.f2127a.f996a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        mo1287c(bVar2.f2127a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f2115m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f2114l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f2114l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.C0145a0 a0Var4 = (RecyclerView.C0145a0) arrayList2.get(size8);
                        a0Var4.f996a.setAlpha(1.0f);
                        mo1287c(a0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f2114l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f2116n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f2116n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C0466a aVar2 = (C0466a) arrayList3.get(size10);
                            RecyclerView.C0145a0 a0Var5 = aVar2.f2121a;
                            if (a0Var5 != null) {
                                mo2786m(aVar2, a0Var5);
                            }
                            RecyclerView.C0145a0 a0Var6 = aVar2.f2122b;
                            if (a0Var6 != null) {
                                mo2786m(aVar2, a0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f2116n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo2783j(this.f2119q);
                    mo2783j(this.f2118p);
                    mo2783j(this.f2117o);
                    mo2783j(this.f2120r);
                    mo1288d();
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public boolean mo1291g() {
        return !this.f2111i.isEmpty() || !this.f2113k.isEmpty() || !this.f2112j.isEmpty() || !this.f2110h.isEmpty() || !this.f2118p.isEmpty() || !this.f2119q.isEmpty() || !this.f2117o.isEmpty() || !this.f2120r.isEmpty() || !this.f2115m.isEmpty() || !this.f2114l.isEmpty() || !this.f2116n.isEmpty();
    }

    /* renamed from: i */
    public boolean mo2782i(RecyclerView.C0145a0 a0Var, int i, int i2, int i3, int i4) {
        View view = a0Var.f996a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) a0Var.f996a.getTranslationY());
        mo2787n(a0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo1287c(a0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f2112j.add(new C0467b(a0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: j */
    public void mo2783j(List<RecyclerView.C0145a0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).f996a.animate().cancel();
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo2784k() {
        if (!mo1291g()) {
            mo1288d();
        }
    }

    /* renamed from: l */
    public final void mo2785l(List<C0466a> list, RecyclerView.C0145a0 a0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0466a aVar = list.get(size);
                if (mo2786m(aVar, a0Var) && aVar.f2121a == null && aVar.f2122b == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public final boolean mo2786m(C0466a aVar, RecyclerView.C0145a0 a0Var) {
        if (aVar.f2122b == a0Var) {
            aVar.f2122b = null;
        } else if (aVar.f2121a != a0Var) {
            return false;
        } else {
            aVar.f2121a = null;
        }
        a0Var.f996a.setAlpha(1.0f);
        a0Var.f996a.setTranslationX(0.0f);
        a0Var.f996a.setTranslationY(0.0f);
        mo1287c(a0Var);
        return true;
    }

    /* renamed from: n */
    public final void mo2787n(RecyclerView.C0145a0 a0Var) {
        if (f2109s == null) {
            f2109s = new ValueAnimator().getInterpolator();
        }
        a0Var.f996a.animate().setInterpolator(f2109s);
        mo1289e(a0Var);
    }
}
