package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.nordskog.LesserAudioSwitch.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C0461fc;
import p000.C0521g7;
import p000.C0821mb;
import p000.C1009qa;
import p000.C1353xa;

/* renamed from: ia */
public abstract class C0614ia {

    /* renamed from: A */
    public ArrayList<C0621g> f2637A;

    /* renamed from: B */
    public C0819ma f2638B;

    /* renamed from: C */
    public Runnable f2639C = new C0618d();

    /* renamed from: a */
    public final ArrayList<C0619e> f2640a = new ArrayList<>();

    /* renamed from: b */
    public boolean f2641b;

    /* renamed from: c */
    public final C0966pa f2642c = new C0966pa();

    /* renamed from: d */
    public ArrayList<C1053r9> f2643d;

    /* renamed from: e */
    public ArrayList<Fragment> f2644e;

    /* renamed from: f */
    public final C0525ga f2645f = new C0525ga(this);

    /* renamed from: g */
    public OnBackPressedDispatcher f2646g;

    /* renamed from: h */
    public final C0243c f2647h = new C0615a(false);

    /* renamed from: i */
    public final AtomicInteger f2648i = new AtomicInteger();

    /* renamed from: j */
    public ConcurrentHashMap<Fragment, HashSet<C0521g7>> f2649j = new ConcurrentHashMap<>();

    /* renamed from: k */
    public final C1353xa.C1354a f2650k = new C0616b();

    /* renamed from: l */
    public final C0564ha f2651l = new C0564ha(this);

    /* renamed from: m */
    public int f2652m = -1;

    /* renamed from: n */
    public C0459fa<?> f2653n;

    /* renamed from: o */
    public C0215ba f2654o;

    /* renamed from: p */
    public Fragment f2655p;

    /* renamed from: q */
    public Fragment f2656q;

    /* renamed from: r */
    public C0412ea f2657r = new C0617c();

    /* renamed from: s */
    public boolean f2658s;

    /* renamed from: t */
    public boolean f2659t;

    /* renamed from: u */
    public boolean f2660u;

    /* renamed from: v */
    public boolean f2661v;

    /* renamed from: w */
    public boolean f2662w;

    /* renamed from: x */
    public ArrayList<C1053r9> f2663x;

    /* renamed from: y */
    public ArrayList<Boolean> f2664y;

    /* renamed from: z */
    public ArrayList<Fragment> f2665z;

    /* renamed from: ia$a */
    public class C0615a extends C0243c {
        public C0615a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo1622a() {
            C0614ia iaVar = C0614ia.this;
            iaVar.mo3193B(true);
            if (iaVar.f2647h.f1311a) {
                iaVar.mo3212V();
            } else {
                iaVar.f2646g.mo134a();
            }
        }
    }

    /* renamed from: ia$b */
    public class C0616b implements C1353xa.C1354a {
        public C0616b() {
        }

        /* renamed from: a */
        public void mo3254a(Fragment fragment, C0521g7 g7Var) {
            boolean z;
            synchronized (g7Var) {
                z = g7Var.f2270a;
            }
            if (!z) {
                C0614ia iaVar = C0614ia.this;
                HashSet hashSet = iaVar.f2649j.get(fragment);
                if (hashSet != null && hashSet.remove(g7Var) && hashSet.isEmpty()) {
                    iaVar.f2649j.remove(fragment);
                    if (fragment.f694b < 3) {
                        iaVar.mo3231h(fragment);
                        iaVar.mo3210T(fragment, fragment.mo896y());
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo3255b(Fragment fragment, C0521g7 g7Var) {
            C0614ia iaVar = C0614ia.this;
            if (iaVar.f2649j.get(fragment) == null) {
                iaVar.f2649j.put(fragment, new HashSet());
            }
            iaVar.f2649j.get(fragment).add(g7Var);
        }
    }

    /* renamed from: ia$c */
    public class C0617c extends C0412ea {
        public C0617c() {
        }

        /* renamed from: a */
        public Fragment mo2719a(ClassLoader classLoader, String str) {
            C0459fa<?> faVar = C0614ia.this.f2653n;
            Context context = faVar.f2101c;
            faVar.getClass();
            Object obj = Fragment.f675S;
            try {
                return (Fragment) C0412ea.m1563c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new Fragment.C0103b(C0279ch.m1121r("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (IllegalAccessException e2) {
                throw new Fragment.C0103b(C0279ch.m1121r("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.C0103b(C0279ch.m1121r("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.C0103b(C0279ch.m1121r("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* renamed from: ia$d */
    public class C0618d implements Runnable {
        public C0618d() {
        }

        public void run() {
            C0614ia.this.mo3193B(true);
        }
    }

    /* renamed from: ia$e */
    public interface C0619e {
        /* renamed from: a */
        boolean mo3257a(ArrayList<C1053r9> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: ia$f */
    public class C0620f implements C0619e {

        /* renamed from: a */
        public final int f2670a;

        /* renamed from: b */
        public final int f2671b;

        public C0620f(String str, int i, int i2) {
            this.f2670a = i;
            this.f2671b = i2;
        }

        /* renamed from: a */
        public boolean mo3257a(ArrayList<C1053r9> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0614ia.this.f2656q;
            if (fragment != null && this.f2670a < 0 && fragment.mo866k().mo3212V()) {
                return false;
            }
            return C0614ia.this.mo3213W(arrayList, arrayList2, (String) null, this.f2670a, this.f2671b);
        }
    }

    /* renamed from: ia$g */
    public static class C0621g implements Fragment.C0104c {

        /* renamed from: a */
        public final boolean f2673a;

        /* renamed from: b */
        public final C1053r9 f2674b;

        /* renamed from: c */
        public int f2675c;

        public C0621g(C1053r9 r9Var, boolean z) {
            this.f2673a = z;
            this.f2674b = r9Var;
        }

        /* renamed from: a */
        public void mo3258a() {
            boolean z = this.f2675c > 0;
            for (Fragment t0 : this.f2674b.f3941q.f2642c.mo4007g()) {
                t0.mo888t0((Fragment.C0104c) null);
            }
            C1053r9 r9Var = this.f2674b;
            r9Var.f3941q.mo3229g(r9Var, this.f2673a, !z, true);
        }
    }

    /* renamed from: M */
    public static boolean m1934M(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: A */
    public final void mo3192A(boolean z) {
        if (this.f2641b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2653n == null) {
            if (this.f2661v) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f2653n.f2102d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z || !mo3206P()) {
            if (this.f2663x == null) {
                this.f2663x = new ArrayList<>();
                this.f2664y = new ArrayList<>();
            }
            this.f2641b = true;
            try {
                mo3196E((ArrayList<C1053r9>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2641b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: B */
    public boolean mo3193B(boolean z) {
        boolean z2;
        mo3192A(z);
        boolean z3 = false;
        while (true) {
            ArrayList<C1053r9> arrayList = this.f2663x;
            ArrayList<Boolean> arrayList2 = this.f2664y;
            synchronized (this.f2640a) {
                if (this.f2640a.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.f2640a.size();
                    z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= this.f2640a.get(i).mo3257a(arrayList, arrayList2);
                    }
                    this.f2640a.clear();
                    this.f2653n.f2102d.removeCallbacks(this.f2639C);
                }
            }
            if (z2) {
                this.f2641b = true;
                try {
                    mo3215Y(this.f2663x, this.f2664y);
                    mo3227f();
                    z3 = true;
                } catch (Throwable th) {
                    mo3227f();
                    throw th;
                }
            } else {
                mo3236j0();
                mo3250w();
                this.f2642c.mo4002b();
                return z3;
            }
        }
        while (true) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C */
    public void mo3194C(C0619e eVar, boolean z) {
        if (!z || (this.f2653n != null && !this.f2661v)) {
            mo3192A(z);
            ((C1053r9) eVar).mo3257a(this.f2663x, this.f2664y);
            this.f2641b = true;
            try {
                mo3215Y(this.f2663x, this.f2664y);
                mo3227f();
                mo3236j0();
                mo3250w();
                this.f2642c.mo4002b();
            } catch (Throwable th) {
                mo3227f();
                throw th;
            }
        }
    }

    /* renamed from: D */
    public final void mo3195D(ArrayList<C1053r9> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        ArrayList<C1053r9> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i7 = i;
        int i8 = i2;
        boolean z2 = arrayList3.get(i7).f3799p;
        ArrayList<Fragment> arrayList5 = this.f2665z;
        if (arrayList5 == null) {
            this.f2665z = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f2665z.addAll(this.f2642c.mo4007g());
        Fragment fragment = this.f2656q;
        int i9 = i7;
        boolean z3 = false;
        while (true) {
            int i10 = 1;
            if (i9 < i8) {
                C1053r9 r9Var = arrayList3.get(i9);
                int i11 = 3;
                if (!arrayList4.get(i9).booleanValue()) {
                    ArrayList<Fragment> arrayList6 = this.f2665z;
                    int i12 = 0;
                    while (i12 < r9Var.f3784a.size()) {
                        C1009qa.C1010a aVar = r9Var.f3784a.get(i12);
                        int i13 = aVar.f3800a;
                        if (i13 != i10) {
                            if (i13 == 2) {
                                Fragment fragment2 = aVar.f3801b;
                                int i14 = fragment2.f715w;
                                int size = arrayList6.size() - 1;
                                boolean z4 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList6.get(size);
                                    if (fragment3.f715w != i14) {
                                        i6 = i14;
                                    } else if (fragment3 == fragment2) {
                                        i6 = i14;
                                        z4 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i6 = i14;
                                            r9Var.f3784a.add(i12, new C1009qa.C1010a(9, fragment3));
                                            i12++;
                                            fragment = null;
                                        } else {
                                            i6 = i14;
                                        }
                                        C1009qa.C1010a aVar2 = new C1009qa.C1010a(3, fragment3);
                                        aVar2.f3802c = aVar.f3802c;
                                        aVar2.f3804e = aVar.f3804e;
                                        aVar2.f3803d = aVar.f3803d;
                                        aVar2.f3805f = aVar.f3805f;
                                        r9Var.f3784a.add(i12, aVar2);
                                        arrayList6.remove(fragment3);
                                        i12++;
                                    }
                                    size--;
                                    ArrayList<Boolean> arrayList7 = arrayList2;
                                    i14 = i6;
                                }
                                if (z4) {
                                    r9Var.f3784a.remove(i12);
                                    i12--;
                                } else {
                                    i5 = 1;
                                    aVar.f3800a = 1;
                                    arrayList6.add(fragment2);
                                    i12 += i5;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                    int i15 = i;
                                    i11 = 3;
                                    i10 = 1;
                                }
                            } else if (i13 == i11 || i13 == 6) {
                                arrayList6.remove(aVar.f3801b);
                                Fragment fragment4 = aVar.f3801b;
                                if (fragment4 == fragment) {
                                    r9Var.f3784a.add(i12, new C1009qa.C1010a(9, fragment4));
                                    i12++;
                                    fragment = null;
                                }
                            } else if (i13 != 7) {
                                if (i13 == 8) {
                                    r9Var.f3784a.add(i12, new C1009qa.C1010a(9, fragment));
                                    i12++;
                                    fragment = aVar.f3801b;
                                }
                            }
                            i5 = 1;
                            i12 += i5;
                            ArrayList<Boolean> arrayList82 = arrayList2;
                            int i152 = i;
                            i11 = 3;
                            i10 = 1;
                        }
                        i5 = 1;
                        arrayList6.add(aVar.f3801b);
                        i12 += i5;
                        ArrayList<Boolean> arrayList822 = arrayList2;
                        int i1522 = i;
                        i11 = 3;
                        i10 = 1;
                    }
                } else {
                    int i16 = 1;
                    ArrayList<Fragment> arrayList9 = this.f2665z;
                    int size2 = r9Var.f3784a.size() - 1;
                    while (size2 >= 0) {
                        C1009qa.C1010a aVar3 = r9Var.f3784a.get(size2);
                        int i17 = aVar3.f3800a;
                        if (i17 != i16) {
                            if (i17 != 3) {
                                switch (i17) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar3.f3801b;
                                        break;
                                    case 10:
                                        aVar3.f3807h = aVar3.f3806g;
                                        break;
                                }
                            }
                            arrayList9.add(aVar3.f3801b);
                            size2--;
                            i16 = 1;
                        }
                        arrayList9.remove(aVar3.f3801b);
                        size2--;
                        i16 = 1;
                    }
                }
                z3 = z3 || r9Var.f3790g;
                i9++;
                arrayList4 = arrayList2;
                int i18 = i;
            } else {
                this.f2665z.clear();
                if (!z2) {
                    C1353xa.m3814o(this, arrayList, arrayList2, i, i2, false, this.f2650k);
                }
                int i19 = i;
                while (i19 < i8) {
                    C1053r9 r9Var2 = arrayList3.get(i19);
                    if (arrayList2.get(i19).booleanValue()) {
                        r9Var2.mo4222f(-1);
                        r9Var2.mo4227k(i19 == i8 + -1);
                    } else {
                        r9Var2.mo4222f(1);
                        r9Var2.mo4226j();
                    }
                    i19++;
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                if (z2) {
                    C0405e4 e4Var = new C0405e4();
                    mo3217a(e4Var);
                    i3 = i;
                    int i20 = i8;
                    for (int i21 = i8 - 1; i21 >= i3; i21--) {
                        C1053r9 r9Var3 = arrayList3.get(i21);
                        boolean booleanValue = arrayList10.get(i21).booleanValue();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= r9Var3.f3784a.size()) {
                                z = false;
                            } else if (C1053r9.m2999n(r9Var3.f3784a.get(i22))) {
                                z = true;
                            } else {
                                i22++;
                            }
                        }
                        if (z && !r9Var3.mo4229m(arrayList3, i21 + 1, i8)) {
                            if (this.f2637A == null) {
                                this.f2637A = new ArrayList<>();
                            }
                            C0621g gVar = new C0621g(r9Var3, booleanValue);
                            this.f2637A.add(gVar);
                            for (int i23 = 0; i23 < r9Var3.f3784a.size(); i23++) {
                                C1009qa.C1010a aVar4 = r9Var3.f3784a.get(i23);
                                if (C1053r9.m2999n(aVar4)) {
                                    aVar4.f3801b.mo888t0(gVar);
                                }
                            }
                            if (booleanValue) {
                                r9Var3.mo4226j();
                            } else {
                                r9Var3.mo4227k(false);
                            }
                            i20--;
                            if (i21 != i20) {
                                arrayList3.remove(i21);
                                arrayList3.add(i20, r9Var3);
                            }
                            mo3217a(e4Var);
                        }
                    }
                    int i24 = e4Var.f1966d;
                    for (int i25 = 0; i25 < i24; i25++) {
                        Fragment fragment5 = (Fragment) e4Var.f1965c[i25];
                        if (!fragment5.f703k) {
                            View m0 = fragment5.mo871m0();
                            fragment5.f686K = m0.getAlpha();
                            m0.setAlpha(0.0f);
                        }
                    }
                    i4 = i20;
                } else {
                    i3 = i;
                    i4 = i8;
                }
                if (i4 != i3 && z2) {
                    C1353xa.m3814o(this, arrayList, arrayList2, i, i4, true, this.f2650k);
                    mo3209S(this.f2652m, true);
                }
                while (i3 < i8) {
                    C1053r9 r9Var4 = arrayList3.get(i3);
                    if (arrayList10.get(i3).booleanValue() && r9Var4.f3943s >= 0) {
                        r9Var4.f3943s = -1;
                    }
                    r9Var4.getClass();
                    i3++;
                }
                return;
            }
        }
    }

    /* renamed from: E */
    public final void mo3196E(ArrayList<C1053r9> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0621g> arrayList3 = this.f2637A;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0621g gVar = this.f2637A.get(i);
            if (arrayList == null || gVar.f2673a || (indexOf2 = arrayList.indexOf(gVar.f2674b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((gVar.f2675c == 0) || (arrayList != null && gVar.f2674b.mo4229m(arrayList, 0, arrayList.size()))) {
                    this.f2637A.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || gVar.f2673a || (indexOf = arrayList.indexOf(gVar.f2674b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        gVar.mo3258a();
                    }
                }
                i++;
            } else {
                this.f2637A.remove(i);
                i--;
                size--;
            }
            C1053r9 r9Var = gVar.f2674b;
            r9Var.f3941q.mo3229g(r9Var, gVar.f2673a, false, false);
            i++;
        }
    }

    /* renamed from: F */
    public Fragment mo3197F(String str) {
        return this.f2642c.mo4005e(str);
    }

    /* renamed from: G */
    public Fragment mo3198G(int i) {
        C0966pa paVar = this.f2642c;
        int size = paVar.f3605a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = paVar.f3605a.get(size);
                if (fragment != null && fragment.f714v == i) {
                    return fragment;
                }
            } else {
                for (C0921oa next : paVar.f3606b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.f3489b;
                        if (fragment2.f714v == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: H */
    public Fragment mo3199H(String str) {
        C0966pa paVar = this.f2642c;
        paVar.getClass();
        int size = paVar.f3605a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = paVar.f3605a.get(size);
                if (fragment != null && str.equals(fragment.f716x)) {
                    return fragment;
                }
            } else {
                for (C0921oa next : paVar.f3606b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.f3489b;
                        if (str.equals(fragment2.f716x)) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: I */
    public Fragment mo3200I(String str) {
        Fragment h;
        for (C0921oa next : this.f2642c.f3606b.values()) {
            if (next != null && (h = next.f3489b.mo859h(str)) != null) {
                return h;
            }
        }
        return null;
    }

    /* renamed from: J */
    public final ViewGroup mo3201J(Fragment fragment) {
        if (fragment.f715w > 0 && this.f2654o.mo1592f()) {
            View b = this.f2654o.mo1591b(fragment.f715w);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    /* renamed from: K */
    public C0412ea mo3202K() {
        Fragment fragment = this.f2655p;
        return fragment != null ? fragment.f710r.mo3202K() : this.f2657r;
    }

    /* renamed from: L */
    public void mo3203L(Fragment fragment) {
        if (m1934M(2)) {
            "hide: " + fragment;
        }
        if (!fragment.f717y) {
            fragment.f717y = true;
            fragment.f685J = true ^ fragment.f685J;
            mo3230g0(fragment);
        }
    }

    /* renamed from: N */
    public final boolean mo3204N(Fragment fragment) {
        C0614ia iaVar = fragment.f712t;
        Iterator it = ((ArrayList) iaVar.f2642c.mo4006f()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z = iaVar.mo3204N(fragment2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public boolean mo3205O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C0614ia iaVar = fragment.f710r;
        if (!fragment.equals(iaVar.f2656q) || !mo3205O(iaVar.f2655p)) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public boolean mo3206P() {
        return this.f2659t || this.f2660u;
    }

    /* renamed from: Q */
    public void mo3207Q(Fragment fragment) {
        if (!this.f2642c.mo4003c(fragment.f697e)) {
            C0921oa oaVar = new C0921oa(this.f2651l, fragment);
            oaVar.mo3837a(this.f2653n.f2101c.getClassLoader());
            this.f2642c.f3606b.put(oaVar.f3489b.f697e, oaVar);
            oaVar.f3490c = this.f2652m;
            if (m1934M(2)) {
                "Added fragment to active set " + fragment;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r0 = r5.f680E;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3208R(androidx.fragment.app.Fragment r9) {
        /*
            r8 = this;
            pa r0 = r8.f2642c
            java.lang.String r1 = r9.f697e
            boolean r0 = r0.mo4003c(r1)
            if (r0 != 0) goto L_0x0034
            r0 = 3
            boolean r0 = m1934M(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " to state "
            r0.append(r9)
            int r9 = r8.f2652m
            r0.append(r9)
            java.lang.String r9 = "since it is not added to "
            r0.append(r9)
            r0.append(r8)
            r0.toString()
        L_0x0033:
            return
        L_0x0034:
            int r0 = r8.f2652m
            r8.mo3210T(r9, r0)
            android.view.View r0 = r9.f680E
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bd
            pa r0 = r8.f2642c
            r0.getClass()
            android.view.ViewGroup r3 = r9.f679D
            android.view.View r4 = r9.f680E
            r5 = 0
            if (r3 == 0) goto L_0x0069
            if (r4 != 0) goto L_0x004e
            goto L_0x0069
        L_0x004e:
            java.util.ArrayList<androidx.fragment.app.Fragment> r4 = r0.f3605a
            int r4 = r4.indexOf(r9)
        L_0x0054:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0069
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.f3605a
            java.lang.Object r6 = r6.get(r4)
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            android.view.ViewGroup r7 = r6.f679D
            if (r7 != r3) goto L_0x0054
            android.view.View r7 = r6.f680E
            if (r7 == 0) goto L_0x0054
            r5 = r6
        L_0x0069:
            if (r5 == 0) goto L_0x0083
            android.view.View r0 = r5.f680E
            android.view.ViewGroup r3 = r9.f679D
            int r0 = r3.indexOfChild(r0)
            android.view.View r4 = r9.f680E
            int r4 = r3.indexOfChild(r4)
            if (r4 >= r0) goto L_0x0083
            r3.removeViewAt(r4)
            android.view.View r4 = r9.f680E
            r3.addView(r4, r0)
        L_0x0083:
            boolean r0 = r9.f684I
            if (r0 == 0) goto L_0x00bd
            android.view.ViewGroup r0 = r9.f679D
            if (r0 == 0) goto L_0x00bd
            float r0 = r9.f686K
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0097
            android.view.View r4 = r9.f680E
            r4.setAlpha(r0)
        L_0x0097:
            r9.f686K = r3
            r9.f684I = r2
            fa<?> r0 = r8.f2653n
            android.content.Context r0 = r0.f2101c
            ba r3 = r8.f2654o
            z9 r0 = p000.C1344x5.m3727I(r0, r3, r9, r1)
            if (r0 == 0) goto L_0x00bd
            android.view.animation.Animation r3 = r0.f5276a
            if (r3 == 0) goto L_0x00b1
            android.view.View r0 = r9.f680E
            r0.startAnimation(r3)
            goto L_0x00bd
        L_0x00b1:
            android.animation.Animator r3 = r0.f5277b
            android.view.View r4 = r9.f680E
            r3.setTarget(r4)
            android.animation.Animator r0 = r0.f5277b
            r0.start()
        L_0x00bd:
            boolean r0 = r9.f685J
            if (r0 == 0) goto L_0x0143
            android.view.View r0 = r9.f680E
            if (r0 == 0) goto L_0x0132
            fa<?> r0 = r8.f2653n
            android.content.Context r0 = r0.f2101c
            ba r3 = r8.f2654o
            boolean r4 = r9.f717y
            r4 = r4 ^ r1
            z9 r0 = p000.C1344x5.m3727I(r0, r3, r9, r4)
            if (r0 == 0) goto L_0x0108
            android.animation.Animator r3 = r0.f5277b
            if (r3 == 0) goto L_0x0108
            android.view.View r4 = r9.f680E
            r3.setTarget(r4)
            boolean r3 = r9.f717y
            if (r3 == 0) goto L_0x00fd
            boolean r3 = r9.mo825C()
            if (r3 == 0) goto L_0x00eb
            r9.mo884r0(r2)
            goto L_0x0102
        L_0x00eb:
            android.view.ViewGroup r3 = r9.f679D
            android.view.View r4 = r9.f680E
            r3.startViewTransition(r4)
            android.animation.Animator r5 = r0.f5277b
            ja r6 = new ja
            r6.<init>(r8, r3, r4, r9)
            r5.addListener(r6)
            goto L_0x0102
        L_0x00fd:
            android.view.View r3 = r9.f680E
            r3.setVisibility(r2)
        L_0x0102:
            android.animation.Animator r0 = r0.f5277b
            r0.start()
            goto L_0x0132
        L_0x0108:
            if (r0 == 0) goto L_0x0116
            android.view.View r3 = r9.f680E
            android.view.animation.Animation r4 = r0.f5276a
            r3.startAnimation(r4)
            android.view.animation.Animation r0 = r0.f5276a
            r0.start()
        L_0x0116:
            boolean r0 = r9.f717y
            if (r0 == 0) goto L_0x0123
            boolean r0 = r9.mo825C()
            if (r0 != 0) goto L_0x0123
            r0 = 8
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            android.view.View r3 = r9.f680E
            r3.setVisibility(r0)
            boolean r0 = r9.mo825C()
            if (r0 == 0) goto L_0x0132
            r9.mo884r0(r2)
        L_0x0132:
            boolean r0 = r9.f703k
            if (r0 == 0) goto L_0x013e
            boolean r0 = r8.mo3204N(r9)
            if (r0 == 0) goto L_0x013e
            r8.f2658s = r1
        L_0x013e:
            r9.f685J = r2
            r9.mo841S()
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0614ia.mo3208R(androidx.fragment.app.Fragment):void");
    }

    /* renamed from: S */
    public void mo3209S(int i, boolean z) {
        C0459fa<?> faVar;
        if (this.f2653n == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2652m) {
            this.f2652m = i;
            for (Fragment R : this.f2642c.mo4007g()) {
                mo3208R(R);
            }
            Iterator it = ((ArrayList) this.f2642c.mo4006f()).iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                if (fragment != null && !fragment.f684I) {
                    mo3208R(fragment);
                }
            }
            mo3234i0();
            if (this.f2658s && (faVar = this.f2653n) != null && this.f2652m == 4) {
                faVar.mo2776k();
                this.f2658s = false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v35, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        if (r2 != 3) goto L_0x087a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x05ed */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05ed A[LOOP:0: B:252:0x05ed->B:383:0x05ed, LOOP_START, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0204  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210T(androidx.fragment.app.Fragment r14, int r15) {
        /*
            r13 = this;
            pa r0 = r13.f2642c
            java.lang.String r1 = r14.f697e
            java.util.HashMap<java.lang.String, oa> r0 = r0.f3606b
            java.lang.Object r0 = r0.get(r1)
            oa r0 = (p000.C0921oa) r0
            r1 = 1
            if (r0 != 0) goto L_0x0018
            oa r0 = new oa
            ha r2 = r13.f2651l
            r0.<init>(r2, r14)
            r0.f3490c = r1
        L_0x0018:
            int r2 = r0.f3490c
            androidx.fragment.app.Fragment r3 = r0.f3489b
            boolean r4 = r3.f705m
            r5 = 2
            if (r4 == 0) goto L_0x0037
            boolean r4 = r3.f706n
            if (r4 == 0) goto L_0x002a
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0037
        L_0x002a:
            if (r2 >= r5) goto L_0x0033
            int r3 = r3.f694b
            int r2 = java.lang.Math.min(r2, r3)
            goto L_0x0037
        L_0x0033:
            int r2 = java.lang.Math.min(r2, r1)
        L_0x0037:
            androidx.fragment.app.Fragment r3 = r0.f3489b
            boolean r3 = r3.f703k
            if (r3 != 0) goto L_0x0041
            int r2 = java.lang.Math.min(r2, r1)
        L_0x0041:
            androidx.fragment.app.Fragment r3 = r0.f3489b
            boolean r4 = r3.f704l
            r6 = -1
            if (r4 == 0) goto L_0x0057
            boolean r3 = r3.mo826D()
            if (r3 == 0) goto L_0x0053
            int r2 = java.lang.Math.min(r2, r1)
            goto L_0x0057
        L_0x0053:
            int r2 = java.lang.Math.min(r2, r6)
        L_0x0057:
            androidx.fragment.app.Fragment r3 = r0.f3489b
            boolean r4 = r3.f681F
            r7 = 3
            if (r4 == 0) goto L_0x0066
            int r3 = r3.f694b
            if (r3 >= r7) goto L_0x0066
            int r2 = java.lang.Math.min(r2, r5)
        L_0x0066:
            androidx.fragment.app.Fragment r3 = r0.f3489b
            mb$b r3 = r3.f689N
            int r3 = r3.ordinal()
            r4 = 4
            if (r3 == r5) goto L_0x007f
            if (r3 == r7) goto L_0x007a
            if (r3 == r4) goto L_0x0083
            int r2 = java.lang.Math.min(r2, r6)
            goto L_0x0083
        L_0x007a:
            int r2 = java.lang.Math.min(r2, r7)
            goto L_0x0083
        L_0x007f:
            int r2 = java.lang.Math.min(r2, r1)
        L_0x0083:
            int r15 = java.lang.Math.min(r15, r2)
            int r2 = r14.f694b
            r3 = 0
            r4 = 0
            if (r2 > r15) goto L_0x04b7
            if (r2 >= r15) goto L_0x009a
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<g7>> r2 = r13.f2649j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x009a
            r13.mo3225e(r14)
        L_0x009a:
            int r2 = r14.f694b
            if (r2 == r6) goto L_0x00a8
            if (r2 == 0) goto L_0x0197
            if (r2 == r1) goto L_0x01fd
            if (r2 == r5) goto L_0x03f2
            if (r2 == r7) goto L_0x0450
            goto L_0x087a
        L_0x00a8:
            if (r15 <= r6) goto L_0x0197
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x00c0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r2.append(r8)
            r2.append(r14)
            r2.toString()
        L_0x00c0:
            androidx.fragment.app.Fragment r2 = r14.f699g
            if (r2 == 0) goto L_0x0108
            java.lang.String r8 = r2.f697e
            androidx.fragment.app.Fragment r8 = r13.mo3197F(r8)
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x00e2
            androidx.fragment.app.Fragment r2 = r14.f699g
            int r8 = r2.f694b
            if (r8 >= r1) goto L_0x00d9
            r13.mo3210T(r2, r1)
        L_0x00d9:
            androidx.fragment.app.Fragment r2 = r14.f699g
            java.lang.String r2 = r2.f697e
            r14.f700h = r2
            r14.f699g = r3
            goto L_0x0108
        L_0x00e2:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " declared target fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r14 = r14.f699g
            r0.append(r14)
            java.lang.String r14 = " that does not belong to this FragmentManager!"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        L_0x0108:
            java.lang.String r2 = r14.f700h
            if (r2 == 0) goto L_0x0142
            pa r8 = r13.f2642c
            androidx.fragment.app.Fragment r2 = r8.mo4005e(r2)
            if (r2 == 0) goto L_0x011c
            int r8 = r2.f694b
            if (r8 >= r1) goto L_0x0142
            r13.mo3210T(r2, r1)
            goto L_0x0142
        L_0x011c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " declared target fragment "
            r0.append(r1)
            java.lang.String r14 = r14.f700h
            r0.append(r14)
            java.lang.String r14 = " that does not belong to this FragmentManager!"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        L_0x0142:
            fa<?> r2 = r13.f2653n
            androidx.fragment.app.Fragment r8 = r13.f2655p
            androidx.fragment.app.Fragment r9 = r0.f3489b
            r9.f711s = r2
            r9.f713u = r8
            r9.f710r = r13
            ha r8 = r0.f3488a
            android.content.Context r10 = r2.f2101c
            r8.mo3064g(r9, r10, r4)
            androidx.fragment.app.Fragment r8 = r0.f3489b
            ia r9 = r8.f712t
            fa<?> r10 = r8.f711s
            u9 r11 = new u9
            r11.<init>(r8)
            r9.mo3221c(r10, r11, r8)
            r8.f694b = r4
            r8.f678C = r4
            fa<?> r9 = r8.f711s
            android.content.Context r9 = r9.f2101c
            r8.mo831I(r9)
            boolean r9 = r8.f678C
            if (r9 == 0) goto L_0x0189
            androidx.fragment.app.Fragment r8 = r0.f3489b
            androidx.fragment.app.Fragment r9 = r8.f713u
            if (r9 != 0) goto L_0x017c
            r2.mo2772g(r8)
            goto L_0x017f
        L_0x017c:
            r9.mo832J()
        L_0x017f:
            ha r8 = r0.f3488a
            androidx.fragment.app.Fragment r9 = r0.f3489b
            android.content.Context r2 = r2.f2101c
            r8.mo3059b(r9, r2, r4)
            goto L_0x0197
        L_0x0189:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onAttach()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r8, r0)
            r14.<init>(r15)
            throw r14
        L_0x0197:
            if (r15 <= 0) goto L_0x01fd
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x01ad
            java.lang.String r2 = "moveto CREATED: "
            java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
            androidx.fragment.app.Fragment r8 = r0.f3489b
            r2.append(r8)
            r2.toString()
        L_0x01ad:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            boolean r8 = r2.f688M
            if (r8 != 0) goto L_0x01f4
            ha r8 = r0.f3488a
            android.os.Bundle r9 = r2.f695c
            r8.mo3065h(r2, r9, r4)
            androidx.fragment.app.Fragment r2 = r0.f3489b
            android.os.Bundle r8 = r2.f695c
            ia r9 = r2.f712t
            r9.mo3211U()
            r2.f694b = r1
            r2.f678C = r4
            yd r9 = r2.f693R
            r9.mo5208a(r8)
            r2.mo834L(r8)
            r2.f688M = r1
            boolean r8 = r2.f678C
            if (r8 == 0) goto L_0x01e6
            qb r2 = r2.f690O
            mb$a r8 = p000.C0821mb.C0822a.ON_CREATE
            r2.mo4072d(r8)
            ha r2 = r0.f3488a
            androidx.fragment.app.Fragment r8 = r0.f3489b
            android.os.Bundle r9 = r8.f695c
            r2.mo3060c(r8, r9, r4)
            goto L_0x01fd
        L_0x01e6:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onCreate()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r2, r0)
            r14.<init>(r15)
            throw r14
        L_0x01f4:
            android.os.Bundle r8 = r2.f695c
            r2.mo873n0(r8)
            androidx.fragment.app.Fragment r2 = r0.f3489b
            r2.f694b = r1
        L_0x01fd:
            r2 = 8
            r8 = 2131230890(0x7f0800aa, float:1.8077846E38)
            if (r15 <= r6) goto L_0x0264
            androidx.fragment.app.Fragment r9 = r0.f3489b
            boolean r10 = r9.f705m
            if (r10 == 0) goto L_0x0264
            boolean r10 = r9.f706n
            if (r10 == 0) goto L_0x0264
            boolean r9 = r9.f708p
            if (r9 != 0) goto L_0x0264
            boolean r9 = m1934M(r7)
            if (r9 == 0) goto L_0x0226
            java.lang.String r9 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r9 = p000.C0279ch.m1106c(r9)
            androidx.fragment.app.Fragment r10 = r0.f3489b
            r9.append(r10)
            r9.toString()
        L_0x0226:
            androidx.fragment.app.Fragment r9 = r0.f3489b
            android.os.Bundle r10 = r9.f695c
            android.view.LayoutInflater r10 = r9.mo860h0(r10)
            androidx.fragment.app.Fragment r11 = r0.f3489b
            android.os.Bundle r11 = r11.f695c
            r9.mo858g0(r10, r3, r11)
            androidx.fragment.app.Fragment r9 = r0.f3489b
            android.view.View r9 = r9.f680E
            if (r9 == 0) goto L_0x0264
            r9.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r9 = r0.f3489b
            android.view.View r10 = r9.f680E
            r10.setTag(r8, r9)
            androidx.fragment.app.Fragment r9 = r0.f3489b
            boolean r10 = r9.f717y
            if (r10 == 0) goto L_0x0250
            android.view.View r9 = r9.f680E
            r9.setVisibility(r2)
        L_0x0250:
            androidx.fragment.app.Fragment r9 = r0.f3489b
            android.view.View r10 = r9.f680E
            android.os.Bundle r11 = r9.f695c
            r9.mo853e0(r10, r11)
            ha r9 = r0.f3488a
            androidx.fragment.app.Fragment r10 = r0.f3489b
            android.view.View r11 = r10.f680E
            android.os.Bundle r12 = r10.f695c
            r9.mo3070m(r10, r11, r12, r4)
        L_0x0264:
            if (r15 <= r1) goto L_0x03f2
            ba r9 = r13.f2654o
            androidx.fragment.app.Fragment r10 = r0.f3489b
            boolean r10 = r10.f705m
            if (r10 == 0) goto L_0x0270
            goto L_0x035d
        L_0x0270:
            boolean r10 = m1934M(r7)
            if (r10 == 0) goto L_0x0284
            java.lang.String r10 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r10 = p000.C0279ch.m1106c(r10)
            androidx.fragment.app.Fragment r11 = r0.f3489b
            r10.append(r11)
            r10.toString()
        L_0x0284:
            androidx.fragment.app.Fragment r10 = r0.f3489b
            android.view.ViewGroup r11 = r10.f679D
            if (r11 == 0) goto L_0x028b
            goto L_0x02f8
        L_0x028b:
            int r10 = r10.f715w
            if (r10 == 0) goto L_0x02f7
            if (r10 == r6) goto L_0x02dd
            android.view.View r6 = r9.mo1591b(r10)
            r11 = r6
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            if (r11 != 0) goto L_0x02f8
            androidx.fragment.app.Fragment r6 = r0.f3489b
            boolean r9 = r6.f707o
            if (r9 == 0) goto L_0x02a1
            goto L_0x02f8
        L_0x02a1:
            android.content.res.Resources r14 = r6.mo890u()     // Catch:{ NotFoundException -> 0x02ae }
            androidx.fragment.app.Fragment r15 = r0.f3489b     // Catch:{ NotFoundException -> 0x02ae }
            int r15 = r15.f715w     // Catch:{ NotFoundException -> 0x02ae }
            java.lang.String r14 = r14.getResourceName(r15)     // Catch:{ NotFoundException -> 0x02ae }
            goto L_0x02b0
        L_0x02ae:
            java.lang.String r14 = "unknown"
        L_0x02b0:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No view found for id 0x"
            java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
            androidx.fragment.app.Fragment r2 = r0.f3489b
            int r2 = r2.f715w
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = ") for fragment "
            r1.append(r14)
            androidx.fragment.app.Fragment r14 = r0.f3489b
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r15.<init>(r14)
            throw r15
        L_0x02dd:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Cannot create fragment "
            java.lang.StringBuilder r15 = p000.C0279ch.m1106c(r15)
            androidx.fragment.app.Fragment r0 = r0.f3489b
            r15.append(r0)
            java.lang.String r0 = " for a container view with no id"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x02f7:
            r11 = r3
        L_0x02f8:
            androidx.fragment.app.Fragment r6 = r0.f3489b
            r6.f679D = r11
            android.os.Bundle r9 = r6.f695c
            android.view.LayoutInflater r9 = r6.mo860h0(r9)
            androidx.fragment.app.Fragment r10 = r0.f3489b
            android.os.Bundle r10 = r10.f695c
            r6.mo858g0(r9, r11, r10)
            androidx.fragment.app.Fragment r6 = r0.f3489b
            android.view.View r6 = r6.f680E
            if (r6 == 0) goto L_0x035d
            r6.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r6 = r0.f3489b
            android.view.View r9 = r6.f680E
            r9.setTag(r8, r6)
            if (r11 == 0) goto L_0x0322
            androidx.fragment.app.Fragment r6 = r0.f3489b
            android.view.View r6 = r6.f680E
            r11.addView(r6)
        L_0x0322:
            androidx.fragment.app.Fragment r6 = r0.f3489b
            boolean r8 = r6.f717y
            if (r8 == 0) goto L_0x032d
            android.view.View r6 = r6.f680E
            r6.setVisibility(r2)
        L_0x032d:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            android.view.View r2 = r2.f680E
            p000.C0813m8.m2455D(r2)
            androidx.fragment.app.Fragment r2 = r0.f3489b
            android.view.View r6 = r2.f680E
            android.os.Bundle r8 = r2.f695c
            r2.mo853e0(r6, r8)
            ha r2 = r0.f3488a
            androidx.fragment.app.Fragment r6 = r0.f3489b
            android.view.View r8 = r6.f680E
            android.os.Bundle r9 = r6.f695c
            r2.mo3070m(r6, r8, r9, r4)
            androidx.fragment.app.Fragment r2 = r0.f3489b
            android.view.View r6 = r2.f680E
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x035a
            androidx.fragment.app.Fragment r6 = r0.f3489b
            android.view.ViewGroup r6 = r6.f679D
            if (r6 == 0) goto L_0x035a
            r6 = 1
            goto L_0x035b
        L_0x035a:
            r6 = 0
        L_0x035b:
            r2.f684I = r6
        L_0x035d:
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x0371
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
            androidx.fragment.app.Fragment r6 = r0.f3489b
            r2.append(r6)
            r2.toString()
        L_0x0371:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            android.os.Bundle r6 = r2.f695c
            ia r8 = r2.f712t
            r8.mo3211U()
            r2.f694b = r5
            r2.f678C = r4
            r2.mo828F(r6)
            boolean r6 = r2.f678C
            if (r6 == 0) goto L_0x03e4
            ia r2 = r2.f712t
            r2.f2659t = r4
            r2.f2660u = r4
            r2.mo3249v(r5)
            ha r2 = r0.f3488a
            androidx.fragment.app.Fragment r6 = r0.f3489b
            android.os.Bundle r8 = r6.f695c
            r2.mo3058a(r6, r8, r4)
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x03ab
            java.lang.String r2 = "moveto RESTORE_VIEW_STATE: "
            java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
            androidx.fragment.app.Fragment r6 = r0.f3489b
            r2.append(r6)
            r2.toString()
        L_0x03ab:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            android.view.View r6 = r2.f680E
            if (r6 == 0) goto L_0x03df
            android.util.SparseArray<android.os.Parcelable> r8 = r2.f696d
            if (r8 == 0) goto L_0x03ba
            r6.restoreHierarchyState(r8)
            r2.f696d = r3
        L_0x03ba:
            r2.f678C = r4
            r2.mo856f0()
            boolean r6 = r2.f678C
            if (r6 == 0) goto L_0x03d1
            android.view.View r6 = r2.f680E
            if (r6 == 0) goto L_0x03df
            db r2 = r2.f691P
            mb$a r6 = p000.C0821mb.C0822a.ON_CREATE
            qb r2 = r2.f1887b
            r2.mo4072d(r6)
            goto L_0x03df
        L_0x03d1:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onViewStateRestored()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r2, r0)
            r14.<init>(r15)
            throw r14
        L_0x03df:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            r2.f695c = r3
            goto L_0x03f2
        L_0x03e4:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onActivityCreated()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r2, r0)
            r14.<init>(r15)
            throw r14
        L_0x03f2:
            if (r15 <= r5) goto L_0x0450
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x0408
            java.lang.String r2 = "moveto STARTED: "
            java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
            androidx.fragment.app.Fragment r5 = r0.f3489b
            r2.append(r5)
            r2.toString()
        L_0x0408:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            ia r5 = r2.f712t
            r5.mo3211U()
            ia r5 = r2.f712t
            r5.mo3193B(r1)
            r2.f694b = r7
            r2.f678C = r4
            r2.mo851c0()
            boolean r5 = r2.f678C
            if (r5 == 0) goto L_0x0442
            qb r5 = r2.f690O
            mb$a r6 = p000.C0821mb.C0822a.ON_START
            r5.mo4072d(r6)
            android.view.View r5 = r2.f680E
            if (r5 == 0) goto L_0x0431
            db r5 = r2.f691P
            qb r5 = r5.f1887b
            r5.mo4072d(r6)
        L_0x0431:
            ia r2 = r2.f712t
            r2.f2659t = r4
            r2.f2660u = r4
            r2.mo3249v(r7)
            ha r2 = r0.f3488a
            androidx.fragment.app.Fragment r5 = r0.f3489b
            r2.mo3068k(r5, r4)
            goto L_0x0450
        L_0x0442:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onStart()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r2, r0)
            r14.<init>(r15)
            throw r14
        L_0x0450:
            if (r15 <= r7) goto L_0x087a
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x0466
            java.lang.String r2 = "moveto RESUMED: "
            java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
            androidx.fragment.app.Fragment r5 = r0.f3489b
            r2.append(r5)
            r2.toString()
        L_0x0466:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            ia r5 = r2.f712t
            r5.mo3211U()
            ia r5 = r2.f712t
            r5.mo3193B(r1)
            r1 = 4
            r2.f694b = r1
            r2.f678C = r4
            r2.mo849a0()
            boolean r1 = r2.f678C
            if (r1 == 0) goto L_0x04a9
            qb r1 = r2.f690O
            mb$a r5 = p000.C0821mb.C0822a.ON_RESUME
            r1.mo4072d(r5)
            android.view.View r1 = r2.f680E
            if (r1 == 0) goto L_0x0490
            db r1 = r2.f691P
            qb r1 = r1.f1887b
            r1.mo4072d(r5)
        L_0x0490:
            ia r1 = r2.f712t
            r1.f2659t = r4
            r1.f2660u = r4
            r2 = 4
            r1.mo3249v(r2)
            ha r1 = r0.f3488a
            androidx.fragment.app.Fragment r2 = r0.f3489b
            r1.mo3066i(r2, r4)
            androidx.fragment.app.Fragment r0 = r0.f3489b
            r0.f695c = r3
            r0.f696d = r3
            goto L_0x087a
        L_0x04a9:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onResume()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r2, r0)
            r14.<init>(r15)
            throw r14
        L_0x04b7:
            if (r2 <= r15) goto L_0x087a
            if (r2 == 0) goto L_0x07bf
            if (r2 == r1) goto L_0x065c
            if (r2 == r5) goto L_0x056c
            if (r2 == r7) goto L_0x0518
            r8 = 4
            if (r2 == r8) goto L_0x04c6
            goto L_0x087a
        L_0x04c6:
            if (r15 >= r8) goto L_0x0518
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x04dc
            java.lang.String r2 = "movefrom RESUMED: "
            java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
            androidx.fragment.app.Fragment r8 = r0.f3489b
            r2.append(r8)
            r2.toString()
        L_0x04dc:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            ia r8 = r2.f712t
            r8.mo3249v(r7)
            android.view.View r8 = r2.f680E
            if (r8 == 0) goto L_0x04f0
            db r8 = r2.f691P
            mb$a r9 = p000.C0821mb.C0822a.ON_PAUSE
            qb r8 = r8.f1887b
            r8.mo4072d(r9)
        L_0x04f0:
            qb r8 = r2.f690O
            mb$a r9 = p000.C0821mb.C0822a.ON_PAUSE
            r8.mo4072d(r9)
            r2.f694b = r7
            r2.f678C = r4
            r2.mo845W()
            boolean r8 = r2.f678C
            if (r8 == 0) goto L_0x050a
            ha r2 = r0.f3488a
            androidx.fragment.app.Fragment r8 = r0.f3489b
            r2.mo3063f(r8, r4)
            goto L_0x0518
        L_0x050a:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onPause()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r2, r0)
            r14.<init>(r15)
            throw r14
        L_0x0518:
            if (r15 >= r7) goto L_0x056c
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x052e
            java.lang.String r2 = "movefrom STARTED: "
            java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
            androidx.fragment.app.Fragment r8 = r0.f3489b
            r2.append(r8)
            r2.toString()
        L_0x052e:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            ia r8 = r2.f712t
            r8.f2660u = r1
            r8.mo3249v(r5)
            android.view.View r8 = r2.f680E
            if (r8 == 0) goto L_0x0544
            db r8 = r2.f691P
            mb$a r9 = p000.C0821mb.C0822a.ON_STOP
            qb r8 = r8.f1887b
            r8.mo4072d(r9)
        L_0x0544:
            qb r8 = r2.f690O
            mb$a r9 = p000.C0821mb.C0822a.ON_STOP
            r8.mo4072d(r9)
            r2.f694b = r5
            r2.f678C = r4
            r2.mo852d0()
            boolean r8 = r2.f678C
            if (r8 == 0) goto L_0x055e
            ha r2 = r0.f3488a
            androidx.fragment.app.Fragment r8 = r0.f3489b
            r2.mo3069l(r8, r4)
            goto L_0x056c
        L_0x055e:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onStop()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r2, r0)
            r14.<init>(r15)
            throw r14
        L_0x056c:
            if (r15 >= r5) goto L_0x065c
            boolean r2 = m1934M(r7)
            if (r2 == 0) goto L_0x0584
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "movefrom ACTIVITY_CREATED: "
            r2.append(r5)
            r2.append(r14)
            r2.toString()
        L_0x0584:
            android.view.View r2 = r14.f680E
            if (r2 == 0) goto L_0x0597
            fa<?> r2 = r13.f2653n
            boolean r2 = r2.mo2775j(r14)
            if (r2 == 0) goto L_0x0597
            android.util.SparseArray<android.os.Parcelable> r2 = r14.f696d
            if (r2 != 0) goto L_0x0597
            r0.mo3838b()
        L_0x0597:
            android.view.View r2 = r14.f680E
            if (r2 == 0) goto L_0x064d
            android.view.ViewGroup r5 = r14.f679D
            if (r5 == 0) goto L_0x064d
            r5.endViewTransition(r2)
            android.view.View r2 = r14.f680E
            r2.clearAnimation()
            boolean r2 = r14.mo827E()
            if (r2 != 0) goto L_0x064d
            int r2 = r13.f2652m
            r5 = 0
            if (r2 <= r6) goto L_0x05ce
            boolean r2 = r13.f2661v
            if (r2 != 0) goto L_0x05ce
            android.view.View r2 = r14.f680E
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x05ce
            float r2 = r14.f686K
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x05ce
            fa<?> r2 = r13.f2653n
            android.content.Context r2 = r2.f2101c
            ba r3 = r13.f2654o
            z9 r3 = p000.C1344x5.m3727I(r2, r3, r14, r4)
        L_0x05ce:
            r14.f686K = r5
            android.view.ViewGroup r2 = r14.f679D
            android.view.View r4 = r14.f680E
            if (r3 == 0) goto L_0x0645
            r14.mo891u0(r15)
            xa$a r5 = r13.f2650k
            android.view.View r8 = r14.f680E
            android.view.ViewGroup r7 = r14.f679D
            r7.startViewTransition(r8)
            g7 r11 = new g7
            r11.<init>()
            w9 r6 = new w9
            r6.<init>(r14)
            monitor-enter(r11)
        L_0x05ed:
            boolean r9 = r11.f2272c     // Catch:{ all -> 0x0642 }
            if (r9 == 0) goto L_0x05f5
            r11.wait()     // Catch:{ InterruptedException -> 0x05ed }
            goto L_0x05ed
        L_0x05f5:
            g7$a r9 = r11.f2271b     // Catch:{ all -> 0x0642 }
            if (r9 != r6) goto L_0x05fa
            goto L_0x0605
        L_0x05fa:
            r11.f2271b = r6     // Catch:{ all -> 0x0642 }
            boolean r9 = r11.f2270a     // Catch:{ all -> 0x0642 }
            if (r9 == 0) goto L_0x0605
            monitor-exit(r11)     // Catch:{ all -> 0x0642 }
            r6.mo4977a()
            goto L_0x0606
        L_0x0605:
            monitor-exit(r11)     // Catch:{ all -> 0x0642 }
        L_0x0606:
            r10 = r5
            ia$b r10 = (p000.C0614ia.C0616b) r10
            r10.mo3255b(r14, r11)
            android.view.animation.Animation r5 = r3.f5276a
            if (r5 == 0) goto L_0x062a
            aa r5 = new aa
            android.view.animation.Animation r3 = r3.f5276a
            r5.<init>(r3, r7, r8)
            android.view.View r3 = r14.f680E
            r14.mo875o0(r3)
            x9 r3 = new x9
            r3.<init>(r7, r14, r10, r11)
            r5.setAnimationListener(r3)
            android.view.View r3 = r14.f680E
            r3.startAnimation(r5)
            goto L_0x0645
        L_0x062a:
            android.animation.Animator r3 = r3.f5277b
            r14.mo880p0(r3)
            y9 r5 = new y9
            r6 = r5
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r3.addListener(r5)
            android.view.View r5 = r14.f680E
            r3.setTarget(r5)
            r3.start()
            goto L_0x0645
        L_0x0642:
            r14 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0642 }
            throw r14
        L_0x0645:
            r2.removeView(r4)
            android.view.ViewGroup r3 = r14.f679D
            if (r2 == r3) goto L_0x064d
            return
        L_0x064d:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<g7>> r2 = r13.f2649j
            java.lang.Object r2 = r2.get(r14)
            if (r2 != 0) goto L_0x0659
            r13.mo3231h(r14)
            goto L_0x065c
        L_0x0659:
            r14.mo891u0(r15)
        L_0x065c:
            if (r15 >= r1) goto L_0x07bf
            boolean r2 = r14.f704l
            if (r2 == 0) goto L_0x066a
            boolean r2 = r14.mo826D()
            if (r2 != 0) goto L_0x066a
            r2 = 1
            goto L_0x066b
        L_0x066a:
            r2 = 0
        L_0x066b:
            if (r2 != 0) goto L_0x0689
            ma r2 = r13.f2638B
            boolean r2 = r2.mo3673b(r14)
            if (r2 == 0) goto L_0x0676
            goto L_0x0689
        L_0x0676:
            java.lang.String r2 = r14.f700h
            if (r2 == 0) goto L_0x06f3
            pa r3 = r13.f2642c
            androidx.fragment.app.Fragment r2 = r3.mo4005e(r2)
            if (r2 == 0) goto L_0x06f3
            boolean r3 = r2.f676A
            if (r3 == 0) goto L_0x06f3
            r14.f699g = r2
            goto L_0x06f3
        L_0x0689:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            pa r3 = r13.f2642c
            java.lang.String r4 = r2.f697e
            boolean r3 = r3.mo4003c(r4)
            if (r3 != 0) goto L_0x0696
            goto L_0x06f3
        L_0x0696:
            r3 = 2
            boolean r3 = m1934M(r3)
            if (r3 == 0) goto L_0x06ad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Removed fragment from active set "
            r3.append(r4)
            r3.append(r2)
            r3.toString()
        L_0x06ad:
            pa r3 = r13.f2642c
            r3.getClass()
            androidx.fragment.app.Fragment r4 = r0.f3489b
            java.util.HashMap<java.lang.String, oa> r5 = r3.f3606b
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x06be:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x06de
            java.lang.Object r6 = r5.next()
            oa r6 = (p000.C0921oa) r6
            if (r6 == 0) goto L_0x06be
            androidx.fragment.app.Fragment r6 = r6.f3489b
            java.lang.String r7 = r4.f697e
            java.lang.String r8 = r6.f700h
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x06be
            r6.f699g = r4
            r7 = 0
            r6.f700h = r7
            goto L_0x06be
        L_0x06de:
            r5 = 0
            java.util.HashMap<java.lang.String, oa> r6 = r3.f3606b
            java.lang.String r7 = r4.f697e
            r6.put(r7, r5)
            java.lang.String r5 = r4.f700h
            if (r5 == 0) goto L_0x06f0
            androidx.fragment.app.Fragment r3 = r3.mo4005e(r5)
            r4.f699g = r3
        L_0x06f0:
            r13.mo3216Z(r2)
        L_0x06f3:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<g7>> r2 = r13.f2649j
            java.lang.Object r2 = r2.get(r14)
            if (r2 == 0) goto L_0x0701
            r14.mo891u0(r15)
            r15 = 1
            goto L_0x07bf
        L_0x0701:
            fa<?> r2 = r13.f2653n
            ma r3 = r13.f2638B
            r4 = 3
            boolean r4 = m1934M(r4)
            if (r4 == 0) goto L_0x071a
            java.lang.String r4 = "movefrom CREATED: "
            java.lang.StringBuilder r4 = p000.C0279ch.m1106c(r4)
            androidx.fragment.app.Fragment r5 = r0.f3489b
            r4.append(r5)
            r4.toString()
        L_0x071a:
            androidx.fragment.app.Fragment r4 = r0.f3489b
            boolean r5 = r4.f704l
            if (r5 == 0) goto L_0x0728
            boolean r4 = r4.mo826D()
            if (r4 != 0) goto L_0x0728
            r4 = 1
            goto L_0x0729
        L_0x0728:
            r4 = 0
        L_0x0729:
            if (r4 != 0) goto L_0x0736
            androidx.fragment.app.Fragment r5 = r0.f3489b
            boolean r5 = r3.mo3673b(r5)
            if (r5 == 0) goto L_0x0734
            goto L_0x0736
        L_0x0734:
            r5 = 0
            goto L_0x0737
        L_0x0736:
            r5 = 1
        L_0x0737:
            if (r5 == 0) goto L_0x07ba
            boolean r5 = r2 instanceof p000.C0372dc
            if (r5 == 0) goto L_0x0740
            boolean r2 = r3.f3256f
            goto L_0x074f
        L_0x0740:
            android.content.Context r2 = r2.f2101c
            boolean r5 = r2 instanceof android.app.Activity
            if (r5 == 0) goto L_0x074e
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isChangingConfigurations()
            r2 = r2 ^ r1
            goto L_0x074f
        L_0x074e:
            r2 = 1
        L_0x074f:
            if (r4 != 0) goto L_0x0753
            if (r2 == 0) goto L_0x079b
        L_0x0753:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            r3.getClass()
            r4 = 3
            boolean r4 = m1934M(r4)
            if (r4 == 0) goto L_0x076f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Clearing non-config state for "
            r4.append(r5)
            r4.append(r2)
            r4.toString()
        L_0x076f:
            java.util.HashMap<java.lang.String, ma> r4 = r3.f3253c
            java.lang.String r5 = r2.f697e
            java.lang.Object r4 = r4.get(r5)
            ma r4 = (p000.C0819ma) r4
            if (r4 == 0) goto L_0x0785
            r4.mo2780a()
            java.util.HashMap<java.lang.String, ma> r4 = r3.f3253c
            java.lang.String r5 = r2.f697e
            r4.remove(r5)
        L_0x0785:
            java.util.HashMap<java.lang.String, cc> r4 = r3.f3254d
            java.lang.String r5 = r2.f697e
            java.lang.Object r4 = r4.get(r5)
            cc r4 = (p000.C0264cc) r4
            if (r4 == 0) goto L_0x079b
            r4.mo1737a()
            java.util.HashMap<java.lang.String, cc> r3 = r3.f3254d
            java.lang.String r2 = r2.f697e
            r3.remove(r2)
        L_0x079b:
            androidx.fragment.app.Fragment r2 = r0.f3489b
            ia r3 = r2.f712t
            r3.mo3240n()
            qb r3 = r2.f690O
            mb$a r4 = p000.C0821mb.C0822a.ON_DESTROY
            r3.mo4072d(r4)
            r3 = 0
            r2.f694b = r3
            r2.f678C = r3
            r2.f688M = r3
            r2.f678C = r1
            ha r2 = r0.f3488a
            androidx.fragment.app.Fragment r4 = r0.f3489b
            r2.mo3061d(r4, r3)
            goto L_0x07bf
        L_0x07ba:
            r2 = 0
            androidx.fragment.app.Fragment r3 = r0.f3489b
            r3.f694b = r2
        L_0x07bf:
            if (r15 >= 0) goto L_0x087a
            ma r2 = r13.f2638B
            r3 = 3
            boolean r3 = m1934M(r3)
            if (r3 == 0) goto L_0x07d8
            java.lang.String r3 = "movefrom ATTACHED: "
            java.lang.StringBuilder r3 = p000.C0279ch.m1106c(r3)
            androidx.fragment.app.Fragment r4 = r0.f3489b
            r3.append(r4)
            r3.toString()
        L_0x07d8:
            androidx.fragment.app.Fragment r3 = r0.f3489b
            r4 = -1
            r3.f694b = r4
            r4 = 0
            r3.f678C = r4
            r3.mo839Q()
            r4 = 0
            r3.f687L = r4
            boolean r4 = r3.f678C
            if (r4 == 0) goto L_0x086c
            ia r4 = r3.f712t
            boolean r5 = r4.f2661v
            if (r5 != 0) goto L_0x07fa
            r4.mo3240n()
            ka r4 = new ka
            r4.<init>()
            r3.f712t = r4
        L_0x07fa:
            ha r3 = r0.f3488a
            androidx.fragment.app.Fragment r4 = r0.f3489b
            r5 = 0
            r3.mo3062e(r4, r5)
            androidx.fragment.app.Fragment r3 = r0.f3489b
            r4 = -1
            r3.f694b = r4
            r4 = 0
            r3.f711s = r4
            r3.f713u = r4
            r3.f710r = r4
            boolean r4 = r3.f704l
            if (r4 == 0) goto L_0x0819
            boolean r3 = r3.mo826D()
            if (r3 != 0) goto L_0x0819
            goto L_0x081a
        L_0x0819:
            r1 = 0
        L_0x081a:
            if (r1 != 0) goto L_0x0824
            androidx.fragment.app.Fragment r1 = r0.f3489b
            boolean r1 = r2.mo3673b(r1)
            if (r1 == 0) goto L_0x087a
        L_0x0824:
            r1 = 3
            boolean r1 = m1934M(r1)
            if (r1 == 0) goto L_0x0839
            java.lang.String r1 = "initState called for fragment: "
            java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
            androidx.fragment.app.Fragment r2 = r0.f3489b
            r1.append(r2)
            r1.toString()
        L_0x0839:
            androidx.fragment.app.Fragment r0 = r0.f3489b
            r0.mo824B()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.f697e = r1
            r1 = 0
            r0.f703k = r1
            r0.f704l = r1
            r0.f705m = r1
            r0.f706n = r1
            r0.f707o = r1
            r0.f709q = r1
            r2 = 0
            r0.f710r = r2
            ka r3 = new ka
            r3.<init>()
            r0.f712t = r3
            r0.f711s = r2
            r0.f714v = r1
            r0.f715w = r1
            r0.f716x = r2
            r0.f717y = r1
            r0.f718z = r1
            goto L_0x087a
        L_0x086c:
            eb r14 = new eb
            java.lang.String r15 = "Fragment "
            java.lang.String r0 = " did not call through to super.onDetach()"
            java.lang.String r15 = p000.C0279ch.m1119p(r15, r3, r0)
            r14.<init>(r15)
            throw r14
        L_0x087a:
            int r0 = r14.f694b
            if (r0 == r15) goto L_0x08a9
            r0 = 3
            boolean r0 = m1934M(r0)
            if (r0 == 0) goto L_0x08a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r14.f694b
            r0.append(r1)
            r0.toString()
        L_0x08a7:
            r14.f694b = r15
        L_0x08a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0614ia.mo3210T(androidx.fragment.app.Fragment, int):void");
    }

    /* renamed from: U */
    public void mo3211U() {
        if (this.f2653n != null) {
            this.f2659t = false;
            this.f2660u = false;
            for (Fragment next : this.f2642c.mo4007g()) {
                if (next != null) {
                    next.f712t.mo3211U();
                }
            }
        }
    }

    /* renamed from: V */
    public boolean mo3212V() {
        mo3193B(false);
        mo3192A(true);
        Fragment fragment = this.f2656q;
        if (fragment != null && fragment.mo866k().mo3212V()) {
            return true;
        }
        boolean W = mo3213W(this.f2663x, this.f2664y, (String) null, -1, 0);
        if (W) {
            this.f2641b = true;
            try {
                mo3215Y(this.f2663x, this.f2664y);
            } finally {
                mo3227f();
            }
        }
        mo3236j0();
        mo3250w();
        this.f2642c.mo4002b();
        return W;
    }

    /* renamed from: W */
    public boolean mo3213W(ArrayList<C1053r9> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        ArrayList<C1053r9> arrayList3 = this.f2643d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2643d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1053r9 r9Var = this.f2643d.get(size2);
                    if ((str != null && str.equals(r9Var.f3792i)) || (i >= 0 && i == r9Var.f3943s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1053r9 r9Var2 = this.f2643d.get(size2);
                        if ((str == null || !str.equals(r9Var2.f3792i)) && (i < 0 || i != r9Var2.f3943s)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f2643d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2643d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2643d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: X */
    public void mo3214X(Fragment fragment) {
        if (m1934M(2)) {
            "remove: " + fragment + " nesting=" + fragment.f709q;
        }
        boolean z = !fragment.mo826D();
        if (!fragment.f718z || z) {
            this.f2642c.mo4008h(fragment);
            if (mo3204N(fragment)) {
                this.f2658s = true;
            }
            fragment.f704l = true;
            mo3230g0(fragment);
        }
    }

    /* renamed from: Y */
    public final void mo3215Y(ArrayList<C1053r9> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                mo3196E(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3799p) {
                        if (i2 != i) {
                            mo3195D(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3799p) {
                                i2++;
                            }
                        }
                        mo3195D(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    mo3195D(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: Z */
    public void mo3216Z(Fragment fragment) {
        if (mo3206P()) {
            m1934M(2);
            return;
        }
        if ((this.f2638B.f3252b.remove(fragment.f697e) != null) && m1934M(2)) {
            "Updating retained Fragments: Removed " + fragment;
        }
    }

    /* renamed from: a */
    public final void mo3217a(C0405e4<Fragment> e4Var) {
        int i = this.f2652m;
        if (i >= 1) {
            int min = Math.min(i, 3);
            for (Fragment next : this.f2642c.mo4007g()) {
                if (next.f694b < min) {
                    mo3210T(next, min);
                    if (next.f680E != null && !next.f717y && next.f684I) {
                        e4Var.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: a0 */
    public void mo3218a0(Parcelable parcelable) {
        C0921oa oaVar;
        if (parcelable != null) {
            C0766la laVar = (C0766la) parcelable;
            if (laVar.f3127b != null) {
                this.f2642c.f3606b.clear();
                Iterator<C0866na> it = laVar.f3127b.iterator();
                while (it.hasNext()) {
                    C0866na next = it.next();
                    if (next != null) {
                        Fragment fragment = this.f2638B.f3252b.get(next.f3353c);
                        if (fragment != null) {
                            if (m1934M(2)) {
                                "restoreSaveState: re-attaching retained " + fragment;
                            }
                            oaVar = new C0921oa(this.f2651l, fragment, next);
                        } else {
                            oaVar = new C0921oa(this.f2651l, this.f2653n.f2101c.getClassLoader(), mo3202K(), next);
                        }
                        Fragment fragment2 = oaVar.f3489b;
                        fragment2.f710r = this;
                        if (m1934M(2)) {
                            StringBuilder c = C0279ch.m1106c("restoreSaveState: active (");
                            c.append(fragment2.f697e);
                            c.append("): ");
                            c.append(fragment2);
                            c.toString();
                        }
                        oaVar.mo3837a(this.f2653n.f2101c.getClassLoader());
                        this.f2642c.f3606b.put(oaVar.f3489b.f697e, oaVar);
                        oaVar.f3490c = this.f2652m;
                    }
                }
                for (Fragment next2 : this.f2638B.f3252b.values()) {
                    if (!this.f2642c.mo4003c(next2.f697e)) {
                        if (m1934M(2)) {
                            "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + laVar.f3127b;
                        }
                        mo3210T(next2, 1);
                        next2.f704l = true;
                        mo3210T(next2, -1);
                    }
                }
                C0966pa paVar = this.f2642c;
                ArrayList<String> arrayList = laVar.f3128c;
                paVar.f3605a.clear();
                if (arrayList != null) {
                    for (String next3 : arrayList) {
                        Fragment e = paVar.mo4005e(next3);
                        if (e != null) {
                            if (m1934M(2)) {
                                "restoreSaveState: added (" + next3 + "): " + e;
                            }
                            paVar.mo4001a(e);
                        } else {
                            throw new IllegalStateException(C0279ch.m1121r("No instantiated fragment for (", next3, ")"));
                        }
                    }
                }
                if (laVar.f3129d != null) {
                    this.f2643d = new ArrayList<>(laVar.f3129d.length);
                    int i = 0;
                    while (true) {
                        C1103s9[] s9VarArr = laVar.f3129d;
                        if (i >= s9VarArr.length) {
                            break;
                        }
                        C1103s9 s9Var = s9VarArr[i];
                        s9Var.getClass();
                        C1053r9 r9Var = new C1053r9(this);
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int[] iArr = s9Var.f4165b;
                            if (i2 >= iArr.length) {
                                break;
                            }
                            C1009qa.C1010a aVar = new C1009qa.C1010a();
                            int i4 = i2 + 1;
                            aVar.f3800a = iArr[i2];
                            if (m1934M(2)) {
                                "Instantiate " + r9Var + " op #" + i3 + " base fragment #" + s9Var.f4165b[i4];
                            }
                            String str = s9Var.f4166c.get(i3);
                            aVar.f3801b = str != null ? this.f2642c.mo4005e(str) : null;
                            aVar.f3806g = C0821mb.C0823b.values()[s9Var.f4167d[i3]];
                            aVar.f3807h = C0821mb.C0823b.values()[s9Var.f4168e[i3]];
                            int[] iArr2 = s9Var.f4165b;
                            int i5 = i4 + 1;
                            int i6 = iArr2[i4];
                            aVar.f3802c = i6;
                            int i7 = i5 + 1;
                            int i8 = iArr2[i5];
                            aVar.f3803d = i8;
                            int i9 = i7 + 1;
                            int i10 = iArr2[i7];
                            aVar.f3804e = i10;
                            int i11 = iArr2[i9];
                            aVar.f3805f = i11;
                            r9Var.f3785b = i6;
                            r9Var.f3786c = i8;
                            r9Var.f3787d = i10;
                            r9Var.f3788e = i11;
                            r9Var.mo4067b(aVar);
                            i3++;
                            i2 = i9 + 1;
                        }
                        r9Var.f3789f = s9Var.f4169f;
                        r9Var.f3792i = s9Var.f4170g;
                        r9Var.f3943s = s9Var.f4171h;
                        r9Var.f3790g = true;
                        r9Var.f3793j = s9Var.f4172i;
                        r9Var.f3794k = s9Var.f4173j;
                        r9Var.f3795l = s9Var.f4174k;
                        r9Var.f3796m = s9Var.f4175l;
                        r9Var.f3797n = s9Var.f4176m;
                        r9Var.f3798o = s9Var.f4177n;
                        r9Var.f3799p = s9Var.f4178o;
                        r9Var.mo4222f(1);
                        if (m1934M(2)) {
                            "restoreAllState: back stack #" + i + " (index " + r9Var.f3943s + "): " + r9Var;
                            PrintWriter printWriter = new PrintWriter(new C1240v7("FragmentManager"));
                            r9Var.mo4225i("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2643d.add(r9Var);
                        i++;
                    }
                } else {
                    this.f2643d = null;
                }
                this.f2648i.set(laVar.f3130e);
                String str2 = laVar.f3131f;
                if (str2 != null) {
                    Fragment e2 = this.f2642c.mo4005e(str2);
                    this.f2656q = e2;
                    mo3245s(e2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo3219b(Fragment fragment) {
        if (m1934M(2)) {
            "add: " + fragment;
        }
        mo3207Q(fragment);
        if (!fragment.f718z) {
            this.f2642c.mo4001a(fragment);
            fragment.f704l = false;
            if (fragment.f680E == null) {
                fragment.f685J = false;
            }
            if (mo3204N(fragment)) {
                this.f2658s = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: s9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo3220b0() {
        /*
            r11 = this;
            java.util.ArrayList<ia$g> r0 = r11.f2637A
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0005:
            java.util.ArrayList<ia$g> r0 = r11.f2637A
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0019
            java.util.ArrayList<ia$g> r0 = r11.f2637A
            java.lang.Object r0 = r0.remove(r1)
            ia$g r0 = (p000.C0614ia.C0621g) r0
            r0.mo3258a()
            goto L_0x0005
        L_0x0019:
            r11.mo3252y()
            r0 = 1
            r11.mo3193B(r0)
            r11.f2659t = r0
            pa r0 = r11.f2642c
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, oa> r3 = r0.f3606b
            int r3 = r3.size()
            r2.<init>(r3)
            java.util.HashMap<java.lang.String, oa> r0 = r0.f3606b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r3 = r0.hasNext()
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r0.next()
            oa r3 = (p000.C0921oa) r3
            if (r3 == 0) goto L_0x003c
            androidx.fragment.app.Fragment r6 = r3.f3489b
            na r7 = new na
            r7.<init>((androidx.fragment.app.Fragment) r6)
            androidx.fragment.app.Fragment r8 = r3.f3489b
            int r9 = r8.f694b
            r10 = -1
            if (r9 <= r10) goto L_0x00e8
            android.os.Bundle r9 = r7.f3364n
            if (r9 != 0) goto L_0x00e8
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            androidx.fragment.app.Fragment r9 = r3.f3489b
            r9.mo850b0(r8)
            yd r10 = r9.f693R
            r10.mo5209b(r8)
            ia r9 = r9.f712t
            android.os.Parcelable r9 = r9.mo3220b0()
            if (r9 == 0) goto L_0x007a
            java.lang.String r10 = "android:support:fragments"
            r8.putParcelable(r10, r9)
        L_0x007a:
            ha r9 = r3.f3488a
            androidx.fragment.app.Fragment r10 = r3.f3489b
            r9.mo3067j(r10, r8, r1)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = r8
        L_0x0089:
            androidx.fragment.app.Fragment r8 = r3.f3489b
            android.view.View r8 = r8.f680E
            if (r8 == 0) goto L_0x0092
            r3.mo3838b()
        L_0x0092:
            androidx.fragment.app.Fragment r8 = r3.f3489b
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f696d
            if (r8 == 0) goto L_0x00a8
            if (r4 != 0) goto L_0x009f
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x009f:
            androidx.fragment.app.Fragment r8 = r3.f3489b
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f696d
            java.lang.String r9 = "android:view_state"
            r4.putSparseParcelableArray(r9, r8)
        L_0x00a8:
            androidx.fragment.app.Fragment r8 = r3.f3489b
            boolean r8 = r8.f682G
            if (r8 != 0) goto L_0x00be
            if (r4 != 0) goto L_0x00b5
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00b5:
            androidx.fragment.app.Fragment r8 = r3.f3489b
            boolean r8 = r8.f682G
            java.lang.String r9 = "android:user_visible_hint"
            r4.putBoolean(r9, r8)
        L_0x00be:
            r7.f3364n = r4
            androidx.fragment.app.Fragment r8 = r3.f3489b
            java.lang.String r8 = r8.f700h
            if (r8 == 0) goto L_0x00ec
            if (r4 != 0) goto L_0x00cf
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r7.f3364n = r4
        L_0x00cf:
            android.os.Bundle r4 = r7.f3364n
            androidx.fragment.app.Fragment r8 = r3.f3489b
            java.lang.String r8 = r8.f700h
            java.lang.String r9 = "android:target_state"
            r4.putString(r9, r8)
            androidx.fragment.app.Fragment r3 = r3.f3489b
            int r3 = r3.f701i
            if (r3 == 0) goto L_0x00ec
            android.os.Bundle r4 = r7.f3364n
            java.lang.String r8 = "android:target_req_state"
            r4.putInt(r8, r3)
            goto L_0x00ec
        L_0x00e8:
            android.os.Bundle r3 = r8.f695c
            r7.f3364n = r3
        L_0x00ec:
            r2.add(r7)
            boolean r3 = m1934M(r5)
            if (r3 == 0) goto L_0x003c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Saved state of "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ": "
            r3.append(r4)
            android.os.Bundle r4 = r7.f3364n
            r3.append(r4)
            r3.toString()
            goto L_0x003c
        L_0x0111:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x011c
            boolean r0 = m1934M(r5)
            return r4
        L_0x011c:
            pa r0 = r11.f2642c
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r0.f3605a
            monitor-enter(r3)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.f3605a     // Catch:{ all -> 0x01d0 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x01d0 }
            if (r6 == 0) goto L_0x012c
            monitor-exit(r3)     // Catch:{ all -> 0x01d0 }
            r6 = r4
            goto L_0x0170
        L_0x012c:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01d0 }
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r0.f3605a     // Catch:{ all -> 0x01d0 }
            int r7 = r7.size()     // Catch:{ all -> 0x01d0 }
            r6.<init>(r7)     // Catch:{ all -> 0x01d0 }
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r0.f3605a     // Catch:{ all -> 0x01d0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01d0 }
        L_0x013d:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x01d0 }
            if (r7 == 0) goto L_0x016f
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x01d0 }
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7     // Catch:{ all -> 0x01d0 }
            java.lang.String r8 = r7.f697e     // Catch:{ all -> 0x01d0 }
            r6.add(r8)     // Catch:{ all -> 0x01d0 }
            boolean r8 = m1934M(r5)     // Catch:{ all -> 0x01d0 }
            if (r8 == 0) goto L_0x013d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d0 }
            r8.<init>()     // Catch:{ all -> 0x01d0 }
            java.lang.String r9 = "saveAllState: adding fragment ("
            r8.append(r9)     // Catch:{ all -> 0x01d0 }
            java.lang.String r9 = r7.f697e     // Catch:{ all -> 0x01d0 }
            r8.append(r9)     // Catch:{ all -> 0x01d0 }
            java.lang.String r9 = "): "
            r8.append(r9)     // Catch:{ all -> 0x01d0 }
            r8.append(r7)     // Catch:{ all -> 0x01d0 }
            r8.toString()     // Catch:{ all -> 0x01d0 }
            goto L_0x013d
        L_0x016f:
            monitor-exit(r3)     // Catch:{ all -> 0x01d0 }
        L_0x0170:
            java.util.ArrayList<r9> r0 = r11.f2643d
            if (r0 == 0) goto L_0x01b4
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01b4
            s9[] r4 = new p000.C1103s9[r0]
        L_0x017c:
            if (r1 >= r0) goto L_0x01b4
            s9 r3 = new s9
            java.util.ArrayList<r9> r7 = r11.f2643d
            java.lang.Object r7 = r7.get(r1)
            r9 r7 = (p000.C1053r9) r7
            r3.<init>((p000.C1053r9) r7)
            r4[r1] = r3
            boolean r3 = m1934M(r5)
            if (r3 == 0) goto L_0x01b1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "saveAllState: adding back stack #"
            r3.append(r7)
            r3.append(r1)
            java.lang.String r7 = ": "
            r3.append(r7)
            java.util.ArrayList<r9> r7 = r11.f2643d
            java.lang.Object r7 = r7.get(r1)
            r3.append(r7)
            r3.toString()
        L_0x01b1:
            int r1 = r1 + 1
            goto L_0x017c
        L_0x01b4:
            la r0 = new la
            r0.<init>()
            r0.f3127b = r2
            r0.f3128c = r6
            r0.f3129d = r4
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f2648i
            int r1 = r1.get()
            r0.f3130e = r1
            androidx.fragment.app.Fragment r1 = r11.f2656q
            if (r1 == 0) goto L_0x01cf
            java.lang.String r1 = r1.f697e
            r0.f3131f = r1
        L_0x01cf:
            return r0
        L_0x01d0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d0 }
            goto L_0x01d4
        L_0x01d3:
            throw r0
        L_0x01d4:
            goto L_0x01d3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0614ia.mo3220b0():android.os.Parcelable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3221c(p000.C0459fa<?> r5, p000.C0215ba r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            fa<?> r0 = r4.f2653n
            if (r0 != 0) goto L_0x00c3
            r4.f2653n = r5
            r4.f2654o = r6
            r4.f2655p = r7
            if (r7 == 0) goto L_0x000f
            r4.mo3236j0()
        L_0x000f:
            boolean r6 = r5 instanceof p000.C0355d
            if (r6 == 0) goto L_0x003c
            r6 = r5
            d r6 = (p000.C0355d) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.mo125c()
            r4.f2646g = r0
            if (r7 == 0) goto L_0x001f
            r6 = r7
        L_0x001f:
            c r1 = r4.f2647h
            r0.getClass()
            mb r6 = r6.mo124a()
            r2 = r6
            qb r2 = (p000.C1011qb) r2
            mb$b r2 = r2.f3809b
            mb$b r3 = p000.C0821mb.C0823b.DESTROYED
            if (r2 != r3) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r2 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r2.<init>(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList<b> r6 = r1.f1312b
            r6.add(r2)
        L_0x003c:
            if (r7 == 0) goto L_0x005f
            ia r5 = r7.f710r
            ma r5 = r5.f2638B
            java.util.HashMap<java.lang.String, ma> r6 = r5.f3253c
            java.lang.String r0 = r7.f697e
            java.lang.Object r6 = r6.get(r0)
            ma r6 = (p000.C0819ma) r6
            if (r6 != 0) goto L_0x005c
            ma r6 = new ma
            boolean r0 = r5.f3255e
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, ma> r5 = r5.f3253c
            java.lang.String r7 = r7.f697e
            r5.put(r7, r6)
        L_0x005c:
            r4.f2638B = r6
            goto L_0x00c2
        L_0x005f:
            boolean r6 = r5 instanceof p000.C0372dc
            if (r6 == 0) goto L_0x00ba
            dc r5 = (p000.C0372dc) r5
            cc r5 = r5.mo127e()
            zb r6 = p000.C0819ma.f3251g
            java.lang.Class<ma> r7 = p000.C0819ma.class
            java.lang.String r0 = r7.getCanonicalName()
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = p000.C0279ch.m1120q(r1, r0)
            java.util.HashMap<java.lang.String, yb> r1 = r5.f1355a
            java.lang.Object r1 = r1.get(r0)
            yb r1 = (p000.C1412yb) r1
            boolean r2 = r7.isInstance(r1)
            if (r2 == 0) goto L_0x008e
            boolean r5 = r6 instanceof p000.C0217bc
            if (r5 == 0) goto L_0x00ad
            bc r6 = (p000.C0217bc) r6
            goto L_0x00ad
        L_0x008e:
            boolean r1 = r6 instanceof p000.C0018ac
            if (r1 == 0) goto L_0x0099
            ac r6 = (p000.C0018ac) r6
            yb r6 = r6.mo102a(r0, r7)
            goto L_0x009f
        L_0x0099:
            ma$a r6 = (p000.C0819ma.C0820a) r6
            yb r6 = r6.mo3677a(r7)
        L_0x009f:
            r1 = r6
            java.util.HashMap<java.lang.String, yb> r5 = r5.f1355a
            java.lang.Object r5 = r5.put(r0, r1)
            yb r5 = (p000.C1412yb) r5
            if (r5 == 0) goto L_0x00ad
            r5.mo2780a()
        L_0x00ad:
            ma r1 = (p000.C0819ma) r1
            r4.f2638B = r1
            goto L_0x00c2
        L_0x00b2:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00ba:
            ma r5 = new ma
            r6 = 0
            r5.<init>(r6)
            r4.f2638B = r5
        L_0x00c2:
            return
        L_0x00c3:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0614ia.mo3221c(fa, ba, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: c0 */
    public void mo3222c0() {
        synchronized (this.f2640a) {
            ArrayList<C0621g> arrayList = this.f2637A;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f2640a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2653n.f2102d.removeCallbacks(this.f2639C);
                this.f2653n.f2102d.post(this.f2639C);
                mo3236j0();
            }
        }
    }

    /* renamed from: d */
    public void mo3223d(Fragment fragment) {
        if (m1934M(2)) {
            "attach: " + fragment;
        }
        if (fragment.f718z) {
            fragment.f718z = false;
            if (!fragment.f703k) {
                this.f2642c.mo4001a(fragment);
                if (m1934M(2)) {
                    "add from attach: " + fragment;
                }
                if (mo3204N(fragment)) {
                    this.f2658s = true;
                }
            }
        }
    }

    /* renamed from: d0 */
    public void mo3224d0(Fragment fragment, boolean z) {
        ViewGroup J = mo3201J(fragment);
        if (J != null && (J instanceof C0262ca)) {
            ((C0262ca) J).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: e */
    public final void mo3225e(Fragment fragment) {
        HashSet hashSet = this.f2649j.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0521g7 g7Var = (C0521g7) it.next();
                synchronized (g7Var) {
                    if (!g7Var.f2270a) {
                        g7Var.f2270a = true;
                        g7Var.f2272c = true;
                        C0521g7.C0522a aVar = g7Var.f2271b;
                        if (aVar != null) {
                            try {
                                ((C1300w9) aVar).mo4977a();
                            } catch (Throwable th) {
                                synchronized (g7Var) {
                                    g7Var.f2272c = false;
                                    g7Var.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (g7Var) {
                            g7Var.f2272c = false;
                            g7Var.notifyAll();
                        }
                    }
                }
            }
            hashSet.clear();
            mo3231h(fragment);
            this.f2649j.remove(fragment);
        }
    }

    /* renamed from: e0 */
    public void mo3226e0(Fragment fragment, C0821mb.C0823b bVar) {
        if (!fragment.equals(mo3197F(fragment.f697e)) || !(fragment.f711s == null || fragment.f710r == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f689N = bVar;
    }

    /* renamed from: f */
    public final void mo3227f() {
        this.f2641b = false;
        this.f2664y.clear();
        this.f2663x.clear();
    }

    /* renamed from: f0 */
    public void mo3228f0(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3197F(fragment.f697e)) && (fragment.f711s == null || fragment.f710r == this))) {
            Fragment fragment2 = this.f2656q;
            this.f2656q = fragment;
            mo3245s(fragment2);
            mo3245s(this.f2656q);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: g */
    public void mo3229g(C1053r9 r9Var, boolean z, boolean z2, boolean z3) {
        if (z) {
            r9Var.mo4227k(z3);
        } else {
            r9Var.mo4226j();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(r9Var);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C1353xa.m3814o(this, arrayList, arrayList2, 0, 1, true, this.f2650k);
        }
        if (z3) {
            mo3209S(this.f2652m, true);
        }
        Iterator it = ((ArrayList) this.f2642c.mo4006f()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.f680E != null && fragment.f684I && r9Var.mo4228l(fragment.f715w)) {
                float f = fragment.f686K;
                if (f > 0.0f) {
                    fragment.f680E.setAlpha(f);
                }
                if (z3) {
                    fragment.f686K = 0.0f;
                } else {
                    fragment.f686K = -1.0f;
                    fragment.f684I = false;
                }
            }
        }
    }

    /* renamed from: g0 */
    public final void mo3230g0(Fragment fragment) {
        ViewGroup J = mo3201J(fragment);
        if (J != null) {
            if (J.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                J.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) J.getTag(R.id.visible_removing_fragment_view_tag)).mo886s0(fragment.mo883r());
        }
    }

    /* renamed from: h */
    public final void mo3231h(Fragment fragment) {
        fragment.f712t.mo3249v(1);
        if (fragment.f680E != null) {
            C0371db dbVar = fragment.f691P;
            dbVar.f1887b.mo4072d(C0821mb.C0822a.ON_DESTROY);
        }
        fragment.f694b = 1;
        fragment.f678C = false;
        fragment.mo838P();
        if (fragment.f678C) {
            C0461fc.C0463b bVar = ((C0461fc) C0414ec.m1565b(fragment)).f2106b;
            int i = bVar.f2108b.mo3523i();
            for (int i2 = 0; i2 < i; i2++) {
                bVar.f2108b.mo3524j(i2).getClass();
            }
            fragment.f708p = false;
            this.f2651l.mo3071n(fragment, false);
            fragment.f679D = null;
            fragment.f680E = null;
            fragment.f691P = null;
            fragment.f692Q.mo2778g(null);
            fragment.f706n = false;
            return;
        }
        throw new C0413eb(C0279ch.m1119p("Fragment ", fragment, " did not call through to super.onDestroyView()"));
    }

    /* renamed from: h0 */
    public void mo3232h0(Fragment fragment) {
        if (m1934M(2)) {
            "show: " + fragment;
        }
        if (fragment.f717y) {
            fragment.f717y = false;
            fragment.f685J = !fragment.f685J;
        }
    }

    /* renamed from: i */
    public void mo3233i(Fragment fragment) {
        if (m1934M(2)) {
            "detach: " + fragment;
        }
        if (!fragment.f718z) {
            fragment.f718z = true;
            if (fragment.f703k) {
                if (m1934M(2)) {
                    "remove from detach: " + fragment;
                }
                this.f2642c.mo4008h(fragment);
                if (mo3204N(fragment)) {
                    this.f2658s = true;
                }
                mo3230g0(fragment);
            }
        }
    }

    /* renamed from: i0 */
    public final void mo3234i0() {
        Iterator it = ((ArrayList) this.f2642c.mo4006f()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.f681F) {
                if (this.f2641b) {
                    this.f2662w = true;
                } else {
                    fragment.f681F = false;
                    mo3210T(fragment, this.f2652m);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo3235j(Configuration configuration) {
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null) {
                next.onConfigurationChanged(configuration);
                next.f712t.mo3235j(configuration);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (mo3205O(r4.f2655p) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.f1311a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f2647h;
        r1 = r4.f2643d;
     */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3236j0() {
        /*
            r4 = this;
            java.util.ArrayList<ia$e> r0 = r4.f2640a
            monitor-enter(r0)
            java.util.ArrayList<ia$e> r1 = r4.f2640a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            c r1 = r4.f2647h     // Catch:{ all -> 0x002f }
            r1.f1311a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            c r0 = r4.f2647h
            java.util.ArrayList<r9> r1 = r4.f2643d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.Fragment r1 = r4.f2655p
            boolean r1 = r4.mo3205O(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.f1311a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0614ia.mo3236j0():void");
    }

    /* renamed from: k */
    public boolean mo3237k(MenuItem menuItem) {
        if (this.f2652m < 1) {
            return false;
        }
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null) {
                if (!next.f717y && (next.mo833K() || next.f712t.mo3237k(menuItem))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public void mo3238l() {
        this.f2659t = false;
        this.f2660u = false;
        mo3249v(1);
    }

    /* renamed from: m */
    public boolean mo3239m(Menu menu, MenuInflater menuInflater) {
        if (this.f2652m < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null) {
                if (!next.f717y ? next.f712t.mo3239m(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                    z = true;
                }
            }
        }
        if (this.f2644e != null) {
            for (int i = 0; i < this.f2644e.size(); i++) {
                Fragment fragment = this.f2644e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.getClass();
                }
            }
        }
        this.f2644e = arrayList;
        return z;
    }

    /* renamed from: n */
    public void mo3240n() {
        this.f2661v = true;
        mo3193B(true);
        mo3252y();
        mo3249v(-1);
        this.f2653n = null;
        this.f2654o = null;
        this.f2655p = null;
        if (this.f2646g != null) {
            Iterator<C0201b> it = this.f2647h.f1312b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f2646g = null;
        }
    }

    /* renamed from: o */
    public void mo3241o() {
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null) {
                next.mo863i0();
            }
        }
    }

    /* renamed from: p */
    public void mo3242p(boolean z) {
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null) {
                next.mo844V();
                next.f712t.mo3242p(z);
            }
        }
    }

    /* renamed from: q */
    public boolean mo3243q(MenuItem menuItem) {
        if (this.f2652m < 1) {
            return false;
        }
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null) {
                if (!next.f717y && next.f712t.mo3243q(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public void mo3244r(Menu menu) {
        if (this.f2652m >= 1) {
            for (Fragment next : this.f2642c.mo4007g()) {
                if (next != null && !next.f717y) {
                    next.f712t.mo3244r(menu);
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo3245s(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3197F(fragment.f697e))) {
            boolean O = fragment.f710r.mo3205O(fragment);
            Boolean bool = fragment.f702j;
            if (bool == null || bool.booleanValue() != O) {
                fragment.f702j = Boolean.valueOf(O);
                fragment.mo847Y();
                C0614ia iaVar = fragment.f712t;
                iaVar.mo3236j0();
                iaVar.mo3245s(iaVar.f2656q);
            }
        }
    }

    /* renamed from: t */
    public void mo3246t(boolean z) {
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null) {
                next.mo846X();
                next.f712t.mo3246t(z);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2655p;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2655p;
        } else {
            C0459fa<?> faVar = this.f2653n;
            if (faVar != null) {
                sb.append(faVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f2653n;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo3248u(Menu menu) {
        boolean z = false;
        if (this.f2652m < 1) {
            return false;
        }
        for (Fragment next : this.f2642c.mo4007g()) {
            if (next != null && next.mo865j0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: v */
    public final void mo3249v(int i) {
        try {
            this.f2641b = true;
            this.f2642c.mo4004d(i);
            mo3209S(i, false);
            this.f2641b = false;
            mo3193B(true);
        } catch (Throwable th) {
            this.f2641b = false;
            throw th;
        }
    }

    /* renamed from: w */
    public final void mo3250w() {
        if (this.f2662w) {
            this.f2662w = false;
            mo3234i0();
        }
    }

    /* renamed from: x */
    public void mo3251x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String q = C0279ch.m1120q(str, "    ");
        C0966pa paVar = this.f2642c;
        paVar.getClass();
        String str2 = str + "    ";
        if (!paVar.f3606b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0921oa next : paVar.f3606b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment fragment = next.f3489b;
                    printWriter.println(fragment);
                    fragment.mo855f(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = paVar.f3605a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(paVar.f3605a.get(i).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f2644e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f2644e.get(i2).toString());
            }
        }
        ArrayList<C1053r9> arrayList2 = this.f2643d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C1053r9 r9Var = this.f2643d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(r9Var.toString());
                r9Var.mo4225i(q, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2648i.get());
        synchronized (this.f2640a) {
            int size4 = this.f2640a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f2640a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2653n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2654o);
        if (this.f2655p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2655p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2652m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2659t);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2660u);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2661v);
        if (this.f2658s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2658s);
        }
    }

    /* renamed from: y */
    public final void mo3252y() {
        if (!this.f2649j.isEmpty()) {
            for (Fragment next : this.f2649j.keySet()) {
                mo3225e(next);
                mo3210T(next, next.mo896y());
            }
        }
    }

    /* renamed from: z */
    public void mo3253z(C0619e eVar, boolean z) {
        if (!z) {
            if (this.f2653n == null) {
                if (this.f2661v) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (mo3206P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2640a) {
            if (this.f2653n != null) {
                this.f2640a.add(eVar);
                mo3222c0();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }
}
