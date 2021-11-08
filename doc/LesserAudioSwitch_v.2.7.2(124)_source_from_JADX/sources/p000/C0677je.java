package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: je */
public abstract class C0677je implements Cloneable {

    /* renamed from: v */
    public static final int[] f2874v = {2, 1, 3, 4};

    /* renamed from: w */
    public static final C0468fe f2875w = new C0678a();

    /* renamed from: x */
    public static ThreadLocal<C0254c4<Animator, C0679b>> f2876x = new ThreadLocal<>();

    /* renamed from: b */
    public String f2877b = getClass().getName();

    /* renamed from: c */
    public long f2878c = -1;

    /* renamed from: d */
    public long f2879d = -1;

    /* renamed from: e */
    public TimeInterpolator f2880e = null;

    /* renamed from: f */
    public ArrayList<Integer> f2881f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f2882g = new ArrayList<>();

    /* renamed from: h */
    public C1109se f2883h = new C1109se();

    /* renamed from: i */
    public C1109se f2884i = new C1109se();

    /* renamed from: j */
    public C0973pe f2885j = null;

    /* renamed from: k */
    public int[] f2886k = f2874v;

    /* renamed from: l */
    public ArrayList<C1059re> f2887l;

    /* renamed from: m */
    public ArrayList<C1059re> f2888m;

    /* renamed from: n */
    public ArrayList<Animator> f2889n = new ArrayList<>();

    /* renamed from: o */
    public int f2890o = 0;

    /* renamed from: p */
    public boolean f2891p = false;

    /* renamed from: q */
    public boolean f2892q = false;

    /* renamed from: r */
    public ArrayList<C0681d> f2893r = null;

    /* renamed from: s */
    public ArrayList<Animator> f2894s = new ArrayList<>();

    /* renamed from: t */
    public C0680c f2895t;

    /* renamed from: u */
    public C0468fe f2896u = f2875w;

    /* renamed from: je$a */
    public static class C0678a extends C0468fe {
        /* renamed from: a */
        public Path mo2789a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: je$b */
    public static class C0679b {

        /* renamed from: a */
        public View f2897a;

        /* renamed from: b */
        public String f2898b;

        /* renamed from: c */
        public C1059re f2899c;

        /* renamed from: d */
        public C0779lf f2900d;

        /* renamed from: e */
        public C0677je f2901e;

        public C0679b(View view, String str, C0677je jeVar, C0779lf lfVar, C1059re reVar) {
            this.f2897a = view;
            this.f2898b = str;
            this.f2899c = reVar;
            this.f2900d = lfVar;
            this.f2901e = jeVar;
        }
    }

    /* renamed from: je$c */
    public static abstract class C0680c {
    }

    /* renamed from: je$d */
    public interface C0681d {
        /* renamed from: a */
        void mo2723a(C0677je jeVar);

        /* renamed from: b */
        void mo1758b(C0677je jeVar);

        /* renamed from: c */
        void mo1759c(C0677je jeVar);

        /* renamed from: d */
        void mo1760d(C0677je jeVar);

        /* renamed from: e */
        void mo1761e(C0677je jeVar);
    }

    /* renamed from: c */
    public static void m2130c(C1109se seVar, View view, C1059re reVar) {
        seVar.f4183a.put(view, reVar);
        int id = view.getId();
        if (id >= 0) {
            if (seVar.f4184b.indexOfKey(id) >= 0) {
                seVar.f4184b.put(id, (Object) null);
            } else {
                seVar.f4184b.put(id, view);
            }
        }
        String q = C0813m8.m2483q(view);
        if (q != null) {
            if (seVar.f4186d.mo3396e(q) >= 0) {
                seVar.f4186d.put(q, null);
            } else {
                seVar.f4186d.put(q, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0518g4<View> g4Var = seVar.f4185c;
                if (g4Var.f2263b) {
                    g4Var.mo2926d();
                }
                if (C0453f4.m1646b(g4Var.f2264c, g4Var.f2266e, itemIdAtPosition) >= 0) {
                    View e = seVar.f4185c.mo2927e(itemIdAtPosition);
                    if (e != null) {
                        C0813m8.m2461J(e, false);
                        seVar.f4185c.mo2929g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0813m8.m2461J(view, true);
                seVar.f4185c.mo2929g(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: o */
    public static C0254c4<Animator, C0679b> m2131o() {
        C0254c4<Animator, C0679b> c4Var = f2876x.get();
        if (c4Var != null) {
            return c4Var;
        }
        C0254c4<Animator, C0679b> c4Var2 = new C0254c4<>();
        f2876x.set(c4Var2);
        return c4Var2;
    }

    /* renamed from: t */
    public static boolean m2132t(C1059re reVar, C1059re reVar2, String str) {
        Object obj = reVar.f3954a.get(str);
        Object obj2 = reVar2.f3954a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo3432A(C0680c cVar) {
        this.f2895t = cVar;
    }

    /* renamed from: B */
    public C0677je mo3433B(TimeInterpolator timeInterpolator) {
        this.f2880e = timeInterpolator;
        return this;
    }

    /* renamed from: C */
    public void mo3434C(C0468fe feVar) {
        if (feVar == null) {
            feVar = f2875w;
        }
        this.f2896u = feVar;
    }

    /* renamed from: D */
    public void mo3435D(C0925oe oeVar) {
    }

    /* renamed from: E */
    public C0677je mo3436E(long j) {
        this.f2878c = j;
        return this;
    }

    /* renamed from: F */
    public void mo3437F() {
        if (this.f2890o == 0) {
            ArrayList<C0681d> arrayList = this.f2893r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2893r.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0681d) arrayList2.get(i)).mo2723a(this);
                }
            }
            this.f2892q = false;
        }
        this.f2890o++;
    }

    /* renamed from: G */
    public String mo3438G(String str) {
        StringBuilder c = C0279ch.m1106c(str);
        c.append(getClass().getSimpleName());
        c.append("@");
        c.append(Integer.toHexString(hashCode()));
        c.append(": ");
        String sb = c.toString();
        if (this.f2879d != -1) {
            sb = sb + "dur(" + this.f2879d + ") ";
        }
        if (this.f2878c != -1) {
            sb = sb + "dly(" + this.f2878c + ") ";
        }
        if (this.f2880e != null) {
            sb = sb + "interp(" + this.f2880e + ") ";
        }
        if (this.f2881f.size() <= 0 && this.f2882g.size() <= 0) {
            return sb;
        }
        String q = C0279ch.m1120q(sb, "tgts(");
        if (this.f2881f.size() > 0) {
            for (int i = 0; i < this.f2881f.size(); i++) {
                if (i > 0) {
                    q = C0279ch.m1120q(q, ", ");
                }
                StringBuilder c2 = C0279ch.m1106c(q);
                c2.append(this.f2881f.get(i));
                q = c2.toString();
            }
        }
        if (this.f2882g.size() > 0) {
            for (int i2 = 0; i2 < this.f2882g.size(); i2++) {
                if (i2 > 0) {
                    q = C0279ch.m1120q(q, ", ");
                }
                StringBuilder c3 = C0279ch.m1106c(q);
                c3.append(this.f2882g.get(i2));
                q = c3.toString();
            }
        }
        return C0279ch.m1120q(q, ")");
    }

    /* renamed from: a */
    public C0677je mo3439a(C0681d dVar) {
        if (this.f2893r == null) {
            this.f2893r = new ArrayList<>();
        }
        this.f2893r.add(dVar);
        return this;
    }

    /* renamed from: b */
    public C0677je mo3440b(View view) {
        this.f2882g.add(view);
        return this;
    }

    /* renamed from: d */
    public abstract void mo1742d(C1059re reVar);

    /* renamed from: e */
    public final void mo3442e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C1059re reVar = new C1059re(view);
                if (z) {
                    mo1743g(reVar);
                } else {
                    mo1742d(reVar);
                }
                reVar.f3956c.add(this);
                mo3443f(reVar);
                m2130c(z ? this.f2883h : this.f2884i, view, reVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    mo3442e(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo3443f(C1059re reVar) {
    }

    /* renamed from: g */
    public abstract void mo1743g(C1059re reVar);

    /* renamed from: h */
    public void mo3444h(ViewGroup viewGroup, boolean z) {
        mo3445i(z);
        if (this.f2881f.size() > 0 || this.f2882g.size() > 0) {
            for (int i = 0; i < this.f2881f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f2881f.get(i).intValue());
                if (findViewById != null) {
                    C1059re reVar = new C1059re(findViewById);
                    if (z) {
                        mo1743g(reVar);
                    } else {
                        mo1742d(reVar);
                    }
                    reVar.f3956c.add(this);
                    mo3443f(reVar);
                    m2130c(z ? this.f2883h : this.f2884i, findViewById, reVar);
                }
            }
            for (int i2 = 0; i2 < this.f2882g.size(); i2++) {
                View view = this.f2882g.get(i2);
                C1059re reVar2 = new C1059re(view);
                if (z) {
                    mo1743g(reVar2);
                } else {
                    mo1742d(reVar2);
                }
                reVar2.f3956c.add(this);
                mo3443f(reVar2);
                m2130c(z ? this.f2883h : this.f2884i, view, reVar2);
            }
            return;
        }
        mo3442e(viewGroup, z);
    }

    /* renamed from: i */
    public void mo3445i(boolean z) {
        C1109se seVar;
        if (z) {
            this.f2883h.f4183a.clear();
            this.f2883h.f4184b.clear();
            seVar = this.f2883h;
        } else {
            this.f2884i.f4183a.clear();
            this.f2884i.f4184b.clear();
            seVar = this.f2884i;
        }
        seVar.f4185c.mo2923b();
    }

    /* renamed from: j */
    public C0677je clone() {
        try {
            C0677je jeVar = (C0677je) super.clone();
            jeVar.f2894s = new ArrayList<>();
            jeVar.f2883h = new C1109se();
            jeVar.f2884i = new C1109se();
            jeVar.f2887l = null;
            jeVar.f2888m = null;
            return jeVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public Animator mo1744k(ViewGroup viewGroup, C1059re reVar, C1059re reVar2) {
        return null;
    }

    /* renamed from: l */
    public void mo3447l(ViewGroup viewGroup, C1109se seVar, C1109se seVar2, ArrayList<C1059re> arrayList, ArrayList<C1059re> arrayList2) {
        int i;
        Animator animator;
        C1059re reVar;
        View view;
        C1059re reVar2;
        Animator animator2;
        C0254c4<Animator, C0679b> o = m2131o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C1059re reVar3 = arrayList.get(i2);
            C1059re reVar4 = arrayList2.get(i2);
            if (reVar3 != null && !reVar3.f3956c.contains(this)) {
                reVar3 = null;
            }
            if (reVar4 != null && !reVar4.f3956c.contains(this)) {
                reVar4 = null;
            }
            if (!(reVar3 == null && reVar4 == null)) {
                if (reVar3 == null || reVar4 == null || mo3265r(reVar3, reVar4)) {
                    Animator k = mo1744k(viewGroup, reVar3, reVar4);
                    if (k != null) {
                        if (reVar4 != null) {
                            View view2 = reVar4.f3955b;
                            String[] p = mo1745p();
                            if (p != null && p.length > 0) {
                                reVar2 = new C1059re(view2);
                                C1059re reVar5 = seVar2.f4183a.get(view2);
                                if (reVar5 != null) {
                                    int i3 = 0;
                                    while (i3 < p.length) {
                                        reVar2.f3954a.put(p[i3], reVar5.f3954a.get(p[i3]));
                                        i3++;
                                        k = k;
                                        size = size;
                                        reVar5 = reVar5;
                                    }
                                }
                                Animator animator3 = k;
                                i = size;
                                int i4 = o.f2827d;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= i4) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C0679b bVar = o.get(o.mo3402h(i5));
                                    if (bVar.f2899c != null && bVar.f2897a == view2 && bVar.f2898b.equals(this.f2877b) && bVar.f2899c.equals(reVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                C1109se seVar3 = seVar2;
                                i = size;
                                animator2 = k;
                                reVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            reVar = reVar2;
                        } else {
                            C1109se seVar4 = seVar2;
                            i = size;
                            view = reVar3.f3955b;
                            animator = k;
                            reVar = null;
                        }
                        if (animator != null) {
                            o.put(animator, new C0679b(view, this.f2877b, this, C0021af.m43b(viewGroup), reVar));
                            this.f2894s.add(animator);
                        }
                        i2++;
                        size = i;
                    }
                    C1109se seVar5 = seVar2;
                    i = size;
                    i2++;
                    size = i;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            C1109se seVar52 = seVar2;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f2894s.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public void mo3448m() {
        int i = this.f2890o - 1;
        this.f2890o = i;
        if (i == 0) {
            ArrayList<C0681d> arrayList = this.f2893r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2893r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0681d) arrayList2.get(i2)).mo1759c(this);
                }
            }
            for (int i3 = 0; i3 < this.f2883h.f4185c.mo2930h(); i3++) {
                View i4 = this.f2883h.f4185c.mo2931i(i3);
                if (i4 != null) {
                    C0813m8.m2461J(i4, false);
                }
            }
            for (int i5 = 0; i5 < this.f2884i.f4185c.mo2930h(); i5++) {
                View i6 = this.f2884i.f4185c.mo2931i(i5);
                if (i6 != null) {
                    C0813m8.m2461J(i6, false);
                }
            }
            this.f2892q = true;
        }
    }

    /* renamed from: n */
    public C1059re mo3449n(View view, boolean z) {
        C0973pe peVar = this.f2885j;
        if (peVar != null) {
            return peVar.mo3449n(view, z);
        }
        ArrayList<C1059re> arrayList = z ? this.f2887l : this.f2888m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1059re reVar = arrayList.get(i2);
            if (reVar == null) {
                return null;
            }
            if (reVar.f3955b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f2888m : this.f2887l).get(i);
    }

    /* renamed from: p */
    public String[] mo1745p() {
        return null;
    }

    /* renamed from: q */
    public C1059re mo3450q(View view, boolean z) {
        C0973pe peVar = this.f2885j;
        if (peVar != null) {
            return peVar.mo3450q(view, z);
        }
        return (z ? this.f2883h : this.f2884i).f4183a.getOrDefault(view, null);
    }

    /* renamed from: r */
    public boolean mo3265r(C1059re reVar, C1059re reVar2) {
        if (reVar == null || reVar2 == null) {
            return false;
        }
        String[] p = mo1745p();
        if (p != null) {
            int length = p.length;
            int i = 0;
            while (i < length) {
                if (!m2132t(reVar, reVar2, p[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String t : reVar.f3954a.keySet()) {
            if (m2132t(reVar, reVar2, t)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: s */
    public boolean mo3451s(View view) {
        return (this.f2881f.size() == 0 && this.f2882g.size() == 0) || this.f2881f.contains(Integer.valueOf(view.getId())) || this.f2882g.contains(view);
    }

    public String toString() {
        return mo3438G("");
    }

    /* renamed from: u */
    public void mo3453u(View view) {
        int i;
        if (!this.f2892q) {
            C0254c4<Animator, C0679b> o = m2131o();
            int i2 = o.f2827d;
            C0779lf b = C0021af.m43b(view);
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                C0679b k = o.mo3407k(i3);
                if (k.f2897a != null && b.equals(k.f2900d)) {
                    Animator h = o.mo3402h(i3);
                    if (Build.VERSION.SDK_INT >= 19) {
                        h.pause();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = h.getListeners();
                        if (listeners != null) {
                            int size = listeners.size();
                            while (i < size) {
                                Animator.AnimatorListener animatorListener = listeners.get(i);
                                if (animatorListener instanceof C0020ae) {
                                    ((C0020ae) animatorListener).onAnimationPause(h);
                                }
                                i++;
                            }
                        }
                    }
                }
                i3--;
            }
            ArrayList<C0681d> arrayList = this.f2893r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2893r.clone();
                int size2 = arrayList2.size();
                while (i < size2) {
                    ((C0681d) arrayList2.get(i)).mo1760d(this);
                    i++;
                }
            }
            this.f2891p = true;
        }
    }

    /* renamed from: v */
    public C0677je mo3454v(C0681d dVar) {
        ArrayList<C0681d> arrayList = this.f2893r;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f2893r.size() == 0) {
            this.f2893r = null;
        }
        return this;
    }

    /* renamed from: w */
    public C0677je mo3455w(View view) {
        this.f2882g.remove(view);
        return this;
    }

    /* renamed from: x */
    public void mo3456x(View view) {
        if (this.f2891p) {
            if (!this.f2892q) {
                C0254c4<Animator, C0679b> o = m2131o();
                int i = o.f2827d;
                C0779lf b = C0021af.m43b(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C0679b k = o.mo3407k(i2);
                    if (k.f2897a != null && b.equals(k.f2900d)) {
                        Animator h = o.mo3402h(i2);
                        if (Build.VERSION.SDK_INT >= 19) {
                            h.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = h.getListeners();
                            if (listeners != null) {
                                int size = listeners.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i3);
                                    if (animatorListener instanceof C0020ae) {
                                        ((C0020ae) animatorListener).onAnimationResume(h);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList<C0681d> arrayList = this.f2893r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2893r.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((C0681d) arrayList2.get(i4)).mo1761e(this);
                    }
                }
            }
            this.f2891p = false;
        }
    }

    /* renamed from: y */
    public void mo3457y() {
        mo3437F();
        C0254c4<Animator, C0679b> o = m2131o();
        Iterator<Animator> it = this.f2894s.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o.containsKey(next)) {
                mo3437F();
                if (next != null) {
                    next.addListener(new C0725ke(this, o));
                    long j = this.f2879d;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f2878c;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f2880e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C0778le(this));
                    next.start();
                }
            }
        }
        this.f2894s.clear();
        mo3448m();
    }

    /* renamed from: z */
    public C0677je mo3458z(long j) {
        this.f2879d = j;
        return this;
    }
}
