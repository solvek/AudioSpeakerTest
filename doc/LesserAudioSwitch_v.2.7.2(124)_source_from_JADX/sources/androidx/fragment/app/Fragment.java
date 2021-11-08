package androidx.fragment.app;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.UUID;
import p000.C0614ia;
import p000.C0821mb;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C0967pb, C0372dc, C1452zd {

    /* renamed from: S */
    public static final Object f675S = new Object();

    /* renamed from: A */
    public boolean f676A;

    /* renamed from: B */
    public boolean f677B = true;

    /* renamed from: C */
    public boolean f678C;

    /* renamed from: D */
    public ViewGroup f679D;

    /* renamed from: E */
    public View f680E;

    /* renamed from: F */
    public boolean f681F;

    /* renamed from: G */
    public boolean f682G = true;

    /* renamed from: H */
    public C0102a f683H;

    /* renamed from: I */
    public boolean f684I;

    /* renamed from: J */
    public boolean f685J;

    /* renamed from: K */
    public float f686K;

    /* renamed from: L */
    public LayoutInflater f687L;

    /* renamed from: M */
    public boolean f688M;

    /* renamed from: N */
    public C0821mb.C0823b f689N = C0821mb.C0823b.RESUMED;

    /* renamed from: O */
    public C1011qb f690O;

    /* renamed from: P */
    public C0371db f691P;

    /* renamed from: Q */
    public C1205ub<C0967pb> f692Q = new C1205ub<>();

    /* renamed from: R */
    public C1414yd f693R;

    /* renamed from: b */
    public int f694b = -1;

    /* renamed from: c */
    public Bundle f695c;

    /* renamed from: d */
    public SparseArray<Parcelable> f696d;

    /* renamed from: e */
    public String f697e = UUID.randomUUID().toString();

    /* renamed from: f */
    public Bundle f698f;

    /* renamed from: g */
    public Fragment f699g;

    /* renamed from: h */
    public String f700h = null;

    /* renamed from: i */
    public int f701i;

    /* renamed from: j */
    public Boolean f702j = null;

    /* renamed from: k */
    public boolean f703k;

    /* renamed from: l */
    public boolean f704l;

    /* renamed from: m */
    public boolean f705m;

    /* renamed from: n */
    public boolean f706n;

    /* renamed from: o */
    public boolean f707o;

    /* renamed from: p */
    public boolean f708p;

    /* renamed from: q */
    public int f709q;

    /* renamed from: r */
    public C0614ia f710r;

    /* renamed from: s */
    public C0459fa<?> f711s;

    /* renamed from: t */
    public C0614ia f712t = new C0721ka();

    /* renamed from: u */
    public Fragment f713u;

    /* renamed from: v */
    public int f714v;

    /* renamed from: w */
    public int f715w;

    /* renamed from: x */
    public String f716x;

    /* renamed from: y */
    public boolean f717y;

    /* renamed from: z */
    public boolean f718z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    public static class C0102a {

        /* renamed from: a */
        public View f720a;

        /* renamed from: b */
        public Animator f721b;

        /* renamed from: c */
        public int f722c;

        /* renamed from: d */
        public int f723d;

        /* renamed from: e */
        public int f724e;

        /* renamed from: f */
        public Object f725f;

        /* renamed from: g */
        public Object f726g;

        /* renamed from: h */
        public Object f727h;

        /* renamed from: i */
        public C0104c f728i;

        /* renamed from: j */
        public boolean f729j;

        public C0102a() {
            Object obj = Fragment.f675S;
            this.f725f = obj;
            this.f726g = obj;
            this.f727h = obj;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public static class C0103b extends RuntimeException {
        public C0103b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public interface C0104c {
    }

    public Fragment() {
        mo824B();
    }

    /* renamed from: A */
    public final Fragment mo823A() {
        String str;
        Fragment fragment = this.f699g;
        if (fragment != null) {
            return fragment;
        }
        C0614ia iaVar = this.f710r;
        if (iaVar == null || (str = this.f700h) == null) {
            return null;
        }
        return iaVar.mo3197F(str);
    }

    /* renamed from: B */
    public final void mo824B() {
        this.f690O = new C1011qb(this);
        this.f693R = new C1414yd(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f690O.mo3678a(new C0868nb() {
                /* renamed from: g */
                public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
                    View view;
                    if (aVar == C0821mb.C0822a.ON_STOP && (view = Fragment.this.f680E) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    /* renamed from: C */
    public boolean mo825C() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return false;
        }
        return aVar.f729j;
    }

    /* renamed from: D */
    public final boolean mo826D() {
        return this.f709q > 0;
    }

    /* renamed from: E */
    public final boolean mo827E() {
        Fragment fragment = this.f713u;
        return fragment != null && (fragment.f704l || fragment.mo827E());
    }

    /* renamed from: F */
    public void mo828F(Bundle bundle) {
        this.f678C = true;
    }

    /* renamed from: G */
    public void mo829G() {
    }

    @Deprecated
    /* renamed from: H */
    public void mo830H() {
        this.f678C = true;
    }

    /* renamed from: I */
    public void mo831I(Context context) {
        this.f678C = true;
        C0459fa<?> faVar = this.f711s;
        if ((faVar == null ? null : faVar.f2100b) != null) {
            this.f678C = false;
            mo830H();
        }
    }

    /* renamed from: J */
    public void mo832J() {
    }

    /* renamed from: K */
    public boolean mo833K() {
        return false;
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        Parcelable parcelable;
        boolean z = true;
        this.f678C = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f712t.mo3218a0(parcelable);
            this.f712t.mo3238l();
        }
        C0614ia iaVar = this.f712t;
        if (iaVar.f2652m < 1) {
            z = false;
        }
        if (!z) {
            iaVar.mo3238l();
        }
    }

    /* renamed from: M */
    public Animation mo835M() {
        return null;
    }

    /* renamed from: N */
    public Animator mo836N() {
        return null;
    }

    /* renamed from: O */
    public View mo837O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: P */
    public void mo838P() {
        this.f678C = true;
    }

    /* renamed from: Q */
    public void mo839Q() {
        this.f678C = true;
    }

    /* renamed from: R */
    public LayoutInflater mo840R(Bundle bundle) {
        return mo881q();
    }

    /* renamed from: S */
    public void mo841S() {
    }

    @Deprecated
    /* renamed from: T */
    public void mo842T() {
        this.f678C = true;
    }

    /* renamed from: U */
    public void mo843U(AttributeSet attributeSet, Bundle bundle) {
        this.f678C = true;
        C0459fa<?> faVar = this.f711s;
        if ((faVar == null ? null : faVar.f2100b) != null) {
            this.f678C = false;
            mo842T();
        }
    }

    /* renamed from: V */
    public void mo844V() {
    }

    /* renamed from: W */
    public void mo845W() {
        this.f678C = true;
    }

    /* renamed from: X */
    public void mo846X() {
    }

    /* renamed from: Y */
    public void mo847Y() {
    }

    /* renamed from: Z */
    public void mo848Z() {
    }

    /* renamed from: a */
    public C0821mb mo124a() {
        return this.f690O;
    }

    /* renamed from: a0 */
    public void mo849a0() {
        this.f678C = true;
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
    }

    /* renamed from: c0 */
    public void mo851c0() {
        this.f678C = true;
    }

    /* renamed from: d */
    public final C1359xd mo126d() {
        return this.f693R.f5187b;
    }

    /* renamed from: d0 */
    public void mo852d0() {
        this.f678C = true;
    }

    /* renamed from: e */
    public C0264cc mo127e() {
        C0614ia iaVar = this.f710r;
        if (iaVar != null) {
            C0819ma maVar = iaVar.f2638B;
            C0264cc ccVar = maVar.f3254d.get(this.f697e);
            if (ccVar != null) {
                return ccVar;
            }
            C0264cc ccVar2 = new C0264cc();
            maVar.f3254d.put(this.f697e, ccVar2);
            return ccVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: e0 */
    public void mo853e0(View view, Bundle bundle) {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo855f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f714v));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f715w));
        printWriter.print(" mTag=");
        printWriter.println(this.f716x);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f694b);
        printWriter.print(" mWho=");
        printWriter.print(this.f697e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f709q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f703k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f704l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f705m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f706n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f717y);
        printWriter.print(" mDetached=");
        printWriter.print(this.f718z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f677B);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f676A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f682G);
        if (this.f710r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f710r);
        }
        if (this.f711s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f711s);
        }
        if (this.f713u != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f713u);
        }
        if (this.f698f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f698f);
        }
        if (this.f695c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f695c);
        }
        if (this.f696d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f696d);
        }
        Fragment A = mo823A();
        if (A != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(A);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f701i);
        }
        if (mo883r() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo883r());
        }
        if (this.f679D != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f679D);
        }
        if (this.f680E != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f680E);
        }
        if (mo864j() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo864j());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo896y());
        }
        if (mo868l() != null) {
            C0414ec.m1565b(this).mo2720a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f712t + ":");
        this.f712t.mo3251x(C0279ch.m1120q(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: f0 */
    public void mo856f0() {
        this.f678C = true;
    }

    /* renamed from: g */
    public final C0102a mo857g() {
        if (this.f683H == null) {
            this.f683H = new C0102a();
        }
        return this.f683H;
    }

    /* renamed from: g0 */
    public void mo858g0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f712t.mo3211U();
        boolean z = true;
        this.f708p = true;
        this.f691P = new C0371db();
        View O = mo837O(layoutInflater, viewGroup, bundle);
        this.f680E = O;
        if (O != null) {
            C0371db dbVar = this.f691P;
            if (dbVar.f1887b == null) {
                dbVar.f1887b = new C1011qb(dbVar);
            }
            this.f692Q.mo2778g(this.f691P);
            return;
        }
        if (this.f691P.f1887b == null) {
            z = false;
        }
        if (!z) {
            this.f691P = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* renamed from: h */
    public Fragment mo859h(String str) {
        return str.equals(this.f697e) ? this : this.f712t.mo3200I(str);
    }

    /* renamed from: h0 */
    public LayoutInflater mo860h0(Bundle bundle) {
        LayoutInflater R = mo840R(bundle);
        this.f687L = R;
        return R;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final C1250v9 mo862i() {
        C0459fa<?> faVar = this.f711s;
        if (faVar == null) {
            return null;
        }
        return (C1250v9) faVar.f2100b;
    }

    /* renamed from: i0 */
    public void mo863i0() {
        onLowMemory();
        this.f712t.mo3241o();
    }

    /* renamed from: j */
    public View mo864j() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return null;
        }
        return aVar.f720a;
    }

    /* renamed from: j0 */
    public boolean mo865j0(Menu menu) {
        if (!this.f717y) {
            return false | this.f712t.mo3248u(menu);
        }
        return false;
    }

    /* renamed from: k */
    public final C0614ia mo866k() {
        if (this.f711s != null) {
            return this.f712t;
        }
        throw new IllegalStateException(C0279ch.m1119p("Fragment ", this, " has not been attached yet."));
    }

    /* renamed from: k0 */
    public final C1250v9 mo867k0() {
        C1250v9 i = mo862i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException(C0279ch.m1119p("Fragment ", this, " not attached to an activity."));
    }

    /* renamed from: l */
    public Context mo868l() {
        C0459fa<?> faVar = this.f711s;
        if (faVar == null) {
            return null;
        }
        return faVar.f2101c;
    }

    /* renamed from: l0 */
    public final Context mo869l0() {
        Context l = mo868l();
        if (l != null) {
            return l;
        }
        throw new IllegalStateException(C0279ch.m1119p("Fragment ", this, " not attached to a context."));
    }

    /* renamed from: m */
    public Object mo870m() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return null;
        }
        aVar.getClass();
        return null;
    }

    /* renamed from: m0 */
    public final View mo871m0() {
        View view = this.f680E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0279ch.m1119p("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* renamed from: n */
    public void mo872n() {
        C0102a aVar = this.f683H;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    /* renamed from: n0 */
    public void mo873n0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f712t.mo3218a0(parcelable);
            this.f712t.mo3238l();
        }
    }

    /* renamed from: o */
    public Object mo874o() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return null;
        }
        aVar.getClass();
        return null;
    }

    /* renamed from: o0 */
    public void mo875o0(View view) {
        mo857g().f720a = view;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f678C = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo867k0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f678C = true;
    }

    /* renamed from: p */
    public void mo879p() {
        C0102a aVar = this.f683H;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    /* renamed from: p0 */
    public void mo880p0(Animator animator) {
        mo857g().f721b = animator;
    }

    @Deprecated
    /* renamed from: q */
    public LayoutInflater mo881q() {
        C0459fa<?> faVar = this.f711s;
        if (faVar != null) {
            LayoutInflater i = faVar.mo2774i();
            C1344x5.m3737S(i, this.f712t.f2645f);
            return i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: q0 */
    public void mo882q0(Bundle bundle) {
        C0614ia iaVar = this.f710r;
        if (iaVar != null) {
            if (iaVar == null ? false : iaVar.mo3206P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f698f = bundle;
    }

    /* renamed from: r */
    public int mo883r() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f723d;
    }

    /* renamed from: r0 */
    public void mo884r0(boolean z) {
        mo857g().f729j = z;
    }

    /* renamed from: s */
    public final C0614ia mo885s() {
        C0614ia iaVar = this.f710r;
        if (iaVar != null) {
            return iaVar;
        }
        throw new IllegalStateException(C0279ch.m1119p("Fragment ", this, " not associated with a fragment manager."));
    }

    /* renamed from: s0 */
    public void mo886s0(int i) {
        if (this.f683H != null || i != 0) {
            mo857g().f723d = i;
        }
    }

    /* renamed from: t */
    public Object mo887t() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f726g;
        if (obj != f675S) {
            return obj;
        }
        mo874o();
        return null;
    }

    /* renamed from: t0 */
    public void mo888t0(C0104c cVar) {
        mo857g();
        C0104c cVar2 = this.f683H.f728i;
        if (cVar != cVar2) {
            if (cVar != null && cVar2 != null) {
                throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
            } else if (cVar != null) {
                ((C0614ia.C0621g) cVar).f2675c++;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f697e);
        sb.append(")");
        if (this.f714v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f714v));
        }
        if (this.f716x != null) {
            sb.append(" ");
            sb.append(this.f716x);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final Resources mo890u() {
        return mo869l0().getResources();
    }

    /* renamed from: u0 */
    public void mo891u0(int i) {
        mo857g().f722c = i;
    }

    /* renamed from: v */
    public Object mo892v() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f725f;
        if (obj != f675S) {
            return obj;
        }
        mo870m();
        return null;
    }

    /* renamed from: v0 */
    public void mo893v0(Fragment fragment, int i) {
        C0614ia iaVar = this.f710r;
        C0614ia iaVar2 = fragment.f710r;
        if (iaVar == null || iaVar2 == null || iaVar == iaVar2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.mo823A();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (this.f710r == null || fragment.f710r == null) {
                this.f700h = null;
                this.f699g = fragment;
            } else {
                this.f700h = fragment.f697e;
                this.f699g = null;
            }
            this.f701i = i;
            return;
        }
        throw new IllegalArgumentException(C0279ch.m1119p("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
    }

    /* renamed from: w */
    public Object mo894w() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return null;
        }
        aVar.getClass();
        return null;
    }

    /* renamed from: x */
    public Object mo895x() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f727h;
        if (obj != f675S) {
            return obj;
        }
        mo894w();
        return null;
    }

    /* renamed from: y */
    public int mo896y() {
        C0102a aVar = this.f683H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f722c;
    }

    /* renamed from: z */
    public final String mo897z(int i) {
        return mo890u().getString(i);
    }
}
