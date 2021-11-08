package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0677je;
import p000.C0871ne;

@SuppressLint({"RestrictedApi"})
/* renamed from: ee */
public class C0416ee extends C0263cb {

    /* renamed from: ee$a */
    public class C0417a extends C0677je.C0680c {
        public C0417a(C0416ee eeVar, Rect rect) {
        }
    }

    /* renamed from: ee$b */
    public class C0418b implements C0677je.C0681d {

        /* renamed from: a */
        public final /* synthetic */ View f1990a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1991b;

        public C0418b(C0416ee eeVar, View view, ArrayList arrayList) {
            this.f1990a = view;
            this.f1991b = arrayList;
        }

        /* renamed from: a */
        public void mo2723a(C0677je jeVar) {
        }

        /* renamed from: b */
        public void mo1758b(C0677je jeVar) {
        }

        /* renamed from: c */
        public void mo1759c(C0677je jeVar) {
            jeVar.mo3454v(this);
            this.f1990a.setVisibility(8);
            int size = this.f1991b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1991b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo1760d(C0677je jeVar) {
        }

        /* renamed from: e */
        public void mo1761e(C0677je jeVar) {
        }
    }

    /* renamed from: ee$c */
    public class C0419c extends C0828me {

        /* renamed from: a */
        public final /* synthetic */ Object f1992a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1993b;

        /* renamed from: c */
        public final /* synthetic */ Object f1994c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f1995d;

        /* renamed from: e */
        public final /* synthetic */ Object f1996e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f1997f;

        public C0419c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1992a = obj;
            this.f1993b = arrayList;
            this.f1994c = obj2;
            this.f1995d = arrayList2;
            this.f1996e = obj3;
            this.f1997f = arrayList3;
        }

        /* renamed from: a */
        public void mo2723a(C0677je jeVar) {
            Object obj = this.f1992a;
            if (obj != null) {
                C0416ee.this.mo1728n(obj, this.f1993b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1994c;
            if (obj2 != null) {
                C0416ee.this.mo1728n(obj2, this.f1995d, (ArrayList<View>) null);
            }
            Object obj3 = this.f1996e;
            if (obj3 != null) {
                C0416ee.this.mo1728n(obj3, this.f1997f, (ArrayList<View>) null);
            }
        }

        /* renamed from: c */
        public void mo1759c(C0677je jeVar) {
            jeVar.mo3454v(this);
        }
    }

    /* renamed from: ee$d */
    public class C0420d extends C0677je.C0680c {
        public C0420d(C0416ee eeVar, Rect rect) {
        }
    }

    /* renamed from: w */
    public static boolean m1567w(C0677je jeVar) {
        return !C0263cb.m1070k(jeVar.f2881f) || !C0263cb.m1070k((List) null) || !C0263cb.m1070k((List) null);
    }

    /* renamed from: a */
    public void mo1718a(Object obj, View view) {
        if (obj != null) {
            ((C0677je) obj).mo3440b(view);
        }
    }

    /* renamed from: b */
    public void mo1719b(Object obj, ArrayList<View> arrayList) {
        C0677je jeVar = (C0677je) obj;
        if (jeVar != null) {
            int i = 0;
            if (jeVar instanceof C0973pe) {
                C0973pe peVar = (C0973pe) jeVar;
                int size = peVar.f3621y.size();
                while (i < size) {
                    mo1719b(peVar.mo4016I(i), arrayList);
                    i++;
                }
            } else if (!m1567w(jeVar) && C0263cb.m1070k(jeVar.f2882g)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    jeVar.mo3440b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo1720c(ViewGroup viewGroup, Object obj) {
        C0677je jeVar = (C0677je) obj;
        if (!C0871ne.f3369c.contains(viewGroup) && C0813m8.m2486t(viewGroup)) {
            C0871ne.f3369c.add(viewGroup);
            C0677je j = jeVar.clone();
            ArrayList orDefault = C0871ne.m2595a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((C0677je) it.next()).mo3453u(viewGroup);
                }
            }
            if (j != null) {
                j.mo3444h(viewGroup, true);
            }
            if (((C0626ie) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                if (j != null) {
                    C0871ne.C0872a aVar = new C0871ne.C0872a(j, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: e */
    public boolean mo1721e(Object obj) {
        return obj instanceof C0677je;
    }

    /* renamed from: g */
    public Object mo1723g(Object obj) {
        if (obj != null) {
            return ((C0677je) obj).clone();
        }
        return null;
    }

    /* renamed from: l */
    public Object mo1726l(Object obj, Object obj2, Object obj3) {
        C0973pe peVar = new C0973pe();
        if (obj != null) {
            peVar.mo4015H((C0677je) obj);
        }
        if (obj2 != null) {
            peVar.mo4015H((C0677je) obj2);
        }
        if (obj3 != null) {
            peVar.mo4015H((C0677je) obj3);
        }
        return peVar;
    }

    /* renamed from: m */
    public void mo1727m(Object obj, View view) {
        if (obj != null) {
            ((C0677je) obj).mo3455w(view);
        }
    }

    /* renamed from: n */
    public void mo1728n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0677je jeVar = (C0677je) obj;
        int i = 0;
        if (jeVar instanceof C0973pe) {
            C0973pe peVar = (C0973pe) jeVar;
            int size = peVar.f3621y.size();
            while (i < size) {
                mo1728n(peVar.mo4016I(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m1567w(jeVar)) {
            ArrayList<View> arrayList3 = jeVar.f2882g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    jeVar.mo3440b(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        jeVar.mo3455w(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo1729o(Object obj, View view, ArrayList<View> arrayList) {
        ((C0677je) obj).mo3439a(new C0418b(this, view, arrayList));
    }

    /* renamed from: p */
    public void mo1730p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C0677je) obj).mo3439a(new C0419c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: q */
    public void mo1731q(Object obj, Rect rect) {
        if (obj != null) {
            ((C0677je) obj).mo3432A(new C0420d(this, rect));
        }
    }

    /* renamed from: r */
    public void mo1732r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo1725j(view, rect);
            ((C0677je) obj).mo3432A(new C0417a(this, rect));
        }
    }

    /* renamed from: t */
    public void mo1734t(Object obj, View view, ArrayList<View> arrayList) {
        C0973pe peVar = (C0973pe) obj;
        ArrayList<View> arrayList2 = peVar.f2882g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0263cb.m1068d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo1719b(peVar, arrayList);
    }

    /* renamed from: u */
    public void mo1735u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0973pe peVar = (C0973pe) obj;
        if (peVar != null) {
            peVar.f2882g.clear();
            peVar.f2882g.addAll(arrayList2);
            mo1728n(peVar, arrayList, arrayList2);
        }
    }

    /* renamed from: v */
    public Object mo1736v(Object obj) {
        if (obj == null) {
            return null;
        }
        C0973pe peVar = new C0973pe();
        peVar.mo4015H((C0677je) obj);
        return peVar;
    }
}
