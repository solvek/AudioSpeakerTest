package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.C0465fd;
import p000.C0568hd;
import p000.C1057rd;
import p000.C1254vc;
import p000.C1257vd;
import p000.C1303wc;
import p000.C1306wd;
import p000.C1347x8;

public class RecyclerView extends ViewGroup implements C0368d8 {

    /* renamed from: A0 */
    public static final boolean f913A0;

    /* renamed from: B0 */
    public static final boolean f914B0;

    /* renamed from: C0 */
    public static final boolean f915C0;

    /* renamed from: D0 */
    public static final boolean f916D0;

    /* renamed from: E0 */
    public static final boolean f917E0;

    /* renamed from: F0 */
    public static final Class<?>[] f918F0;

    /* renamed from: G0 */
    public static final Interpolator f919G0 = new C0147c();

    /* renamed from: y0 */
    public static final int[] f920y0 = {16843830};

    /* renamed from: z0 */
    public static final boolean f921z0;

    /* renamed from: A */
    public int f922A;

    /* renamed from: B */
    public boolean f923B;

    /* renamed from: C */
    public final AccessibilityManager f924C;

    /* renamed from: D */
    public boolean f925D;

    /* renamed from: E */
    public boolean f926E;

    /* renamed from: F */
    public int f927F;

    /* renamed from: G */
    public int f928G;

    /* renamed from: H */
    public C0153i f929H;

    /* renamed from: I */
    public EdgeEffect f930I;

    /* renamed from: J */
    public EdgeEffect f931J;

    /* renamed from: K */
    public EdgeEffect f932K;

    /* renamed from: L */
    public EdgeEffect f933L;

    /* renamed from: M */
    public C0154j f934M;

    /* renamed from: N */
    public int f935N;

    /* renamed from: O */
    public int f936O;

    /* renamed from: P */
    public VelocityTracker f937P;

    /* renamed from: Q */
    public int f938Q;

    /* renamed from: R */
    public int f939R;

    /* renamed from: S */
    public int f940S;

    /* renamed from: T */
    public int f941T;

    /* renamed from: U */
    public int f942U;

    /* renamed from: V */
    public C0166o f943V;

    /* renamed from: W */
    public final int f944W;

    /* renamed from: a0 */
    public final int f945a0;

    /* renamed from: b */
    public final C0173u f946b;

    /* renamed from: b0 */
    public float f947b0;

    /* renamed from: c */
    public final C0171s f948c;

    /* renamed from: c0 */
    public float f949c0;

    /* renamed from: d */
    public C0174v f950d;

    /* renamed from: d0 */
    public boolean f951d0;

    /* renamed from: e */
    public C1254vc f952e;

    /* renamed from: e0 */
    public final C0181z f953e0;

    /* renamed from: f */
    public C1303wc f954f;

    /* renamed from: f0 */
    public C0568hd f955f0;

    /* renamed from: g */
    public final C1306wd f956g;

    /* renamed from: g0 */
    public C0568hd.C0570b f957g0;

    /* renamed from: h */
    public boolean f958h;

    /* renamed from: h0 */
    public final C0179x f959h0;

    /* renamed from: i */
    public final Runnable f960i;

    /* renamed from: i0 */
    public C0168q f961i0;

    /* renamed from: j */
    public final Rect f962j;

    /* renamed from: j0 */
    public List<C0168q> f963j0;

    /* renamed from: k */
    public final Rect f964k;

    /* renamed from: k0 */
    public boolean f965k0;

    /* renamed from: l */
    public final RectF f966l;

    /* renamed from: l0 */
    public boolean f967l0;

    /* renamed from: m */
    public C0149e f968m;

    /* renamed from: m0 */
    public C0154j.C0156b f969m0;

    /* renamed from: n */
    public C0160m f970n;

    /* renamed from: n0 */
    public boolean f971n0;

    /* renamed from: o */
    public C0172t f972o;

    /* renamed from: o0 */
    public C1057rd f973o0;

    /* renamed from: p */
    public final ArrayList<C0159l> f974p;

    /* renamed from: p0 */
    public C0152h f975p0;

    /* renamed from: q */
    public final ArrayList<C0167p> f976q;

    /* renamed from: q0 */
    public final int[] f977q0;

    /* renamed from: r */
    public C0167p f978r;

    /* renamed from: r0 */
    public C0410e8 f979r0;

    /* renamed from: s */
    public boolean f980s;

    /* renamed from: s0 */
    public final int[] f981s0;

    /* renamed from: t */
    public boolean f982t;

    /* renamed from: t0 */
    public final int[] f983t0;

    /* renamed from: u */
    public boolean f984u;

    /* renamed from: u0 */
    public final int[] f985u0;

    /* renamed from: v */
    public boolean f986v;

    /* renamed from: v0 */
    public final List<C0145a0> f987v0;

    /* renamed from: w */
    public int f988w;

    /* renamed from: w0 */
    public Runnable f989w0;

    /* renamed from: x */
    public boolean f990x;

    /* renamed from: x0 */
    public final C1306wd.C1308b f991x0;

    /* renamed from: y */
    public boolean f992y;

    /* renamed from: z */
    public boolean f993z;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C0144a implements Runnable {
        public C0144a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f986v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f980s) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f992y) {
                    recyclerView2.f990x = true;
                } else {
                    recyclerView2.mo1186n();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C0145a0 {

        /* renamed from: s */
        public static final List<Object> f995s = Collections.emptyList();

        /* renamed from: a */
        public final View f996a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f997b;

        /* renamed from: c */
        public int f998c = -1;

        /* renamed from: d */
        public int f999d = -1;

        /* renamed from: e */
        public long f1000e = -1;

        /* renamed from: f */
        public int f1001f = -1;

        /* renamed from: g */
        public int f1002g = -1;

        /* renamed from: h */
        public C0145a0 f1003h = null;

        /* renamed from: i */
        public C0145a0 f1004i = null;

        /* renamed from: j */
        public int f1005j;

        /* renamed from: k */
        public List<Object> f1006k = null;

        /* renamed from: l */
        public List<Object> f1007l = null;

        /* renamed from: m */
        public int f1008m = 0;

        /* renamed from: n */
        public C0171s f1009n = null;

        /* renamed from: o */
        public boolean f1010o = false;

        /* renamed from: p */
        public int f1011p = 0;

        /* renamed from: q */
        public int f1012q = -1;

        /* renamed from: r */
        public RecyclerView f1013r;

        public C0145a0(View view) {
            if (view != null) {
                this.f996a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        public void mo1246a(Object obj) {
            if (obj == null) {
                mo1247b(1024);
            } else if ((1024 & this.f1005j) == 0) {
                if (this.f1006k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1006k = arrayList;
                    this.f1007l = Collections.unmodifiableList(arrayList);
                }
                this.f1006k.add(obj);
            }
        }

        /* renamed from: b */
        public void mo1247b(int i) {
            this.f1005j = i | this.f1005j;
        }

        /* renamed from: c */
        public void mo1248c() {
            this.f999d = -1;
            this.f1002g = -1;
        }

        /* renamed from: d */
        public void mo1249d() {
            this.f1005j &= -33;
        }

        /* renamed from: e */
        public final int mo1250e() {
            RecyclerView recyclerView = this.f1013r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo1107H(this);
        }

        /* renamed from: f */
        public final int mo1251f() {
            int i = this.f1002g;
            return i == -1 ? this.f998c : i;
        }

        /* renamed from: g */
        public List<Object> mo1252g() {
            if ((this.f1005j & 1024) != 0) {
                return f995s;
            }
            List<Object> list = this.f1006k;
            return (list == null || list.size() == 0) ? f995s : this.f1007l;
        }

        /* renamed from: h */
        public boolean mo1253h(int i) {
            return (i & this.f1005j) != 0;
        }

        /* renamed from: i */
        public boolean mo1254i() {
            return (this.f996a.getParent() == null || this.f996a.getParent() == this.f1013r) ? false : true;
        }

        /* renamed from: j */
        public boolean mo1255j() {
            return (this.f1005j & 1) != 0;
        }

        /* renamed from: k */
        public boolean mo1256k() {
            return (this.f1005j & 4) != 0;
        }

        /* renamed from: l */
        public final boolean mo1257l() {
            if ((this.f1005j & 16) != 0) {
                return false;
            }
            View view = this.f996a;
            Field field = C0813m8.f3234a;
            return !(Build.VERSION.SDK_INT >= 16 ? view.hasTransientState() : false);
        }

        /* renamed from: m */
        public boolean mo1258m() {
            return (this.f1005j & 8) != 0;
        }

        /* renamed from: n */
        public boolean mo1259n() {
            return this.f1009n != null;
        }

        /* renamed from: o */
        public boolean mo1260o() {
            return (this.f1005j & 256) != 0;
        }

        /* renamed from: p */
        public boolean mo1261p() {
            return (this.f1005j & 2) != 0;
        }

        /* renamed from: q */
        public void mo1262q(int i, boolean z) {
            if (this.f999d == -1) {
                this.f999d = this.f998c;
            }
            if (this.f1002g == -1) {
                this.f1002g = this.f998c;
            }
            if (z) {
                this.f1002g += i;
            }
            this.f998c += i;
            if (this.f996a.getLayoutParams() != null) {
                ((C0165n) this.f996a.getLayoutParams()).f1052c = true;
            }
        }

        /* renamed from: r */
        public void mo1263r() {
            this.f1005j = 0;
            this.f998c = -1;
            this.f999d = -1;
            this.f1000e = -1;
            this.f1002g = -1;
            this.f1008m = 0;
            this.f1003h = null;
            this.f1004i = null;
            List<Object> list = this.f1006k;
            if (list != null) {
                list.clear();
            }
            this.f1005j &= -1025;
            this.f1011p = 0;
            this.f1012q = -1;
            RecyclerView.m605k(this);
        }

        /* renamed from: s */
        public void mo1264s(int i, int i2) {
            this.f1005j = (i & i2) | (this.f1005j & (i2 ^ -1));
        }

        /* renamed from: t */
        public final void mo1265t(boolean z) {
            int i;
            int i2 = this.f1008m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f1008m = i3;
            if (i3 < 0) {
                this.f1008m = 0;
                "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
                return;
            }
            if (!z && i3 == 1) {
                i = this.f1005j | 16;
            } else if (z && i3 == 0) {
                i = this.f1005j & -17;
            } else {
                return;
            }
            this.f1005j = i;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f998c + " id=" + this.f1000e + ", oldPos=" + this.f999d + ", pLpos:" + this.f1002g);
            if (mo1259n()) {
                sb.append(" scrap ");
                sb.append(this.f1010o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo1256k()) {
                sb.append(" invalid");
            }
            if (!mo1255j()) {
                sb.append(" unbound");
            }
            boolean z = false;
            if ((this.f1005j & 2) != 0) {
                sb.append(" update");
            }
            if (mo1258m()) {
                sb.append(" removed");
            }
            if (mo1267u()) {
                sb.append(" ignored");
            }
            if (mo1260o()) {
                sb.append(" tmpDetached");
            }
            if (!mo1257l()) {
                StringBuilder c = C0279ch.m1106c(" not recyclable(");
                c.append(this.f1008m);
                c.append(")");
                sb.append(c.toString());
            }
            if ((this.f1005j & 512) != 0 || mo1256k()) {
                z = true;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f996a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public boolean mo1267u() {
            return (this.f1005j & 128) != 0;
        }

        /* renamed from: v */
        public boolean mo1268v() {
            return (this.f1005j & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C0146b implements Runnable {
        public C0146b() {
        }

        public void run() {
            C0154j jVar = RecyclerView.this.f934M;
            if (jVar != null) {
                C0465fd fdVar = (C0465fd) jVar;
                boolean z = !fdVar.f2110h.isEmpty();
                boolean z2 = !fdVar.f2112j.isEmpty();
                boolean z3 = !fdVar.f2113k.isEmpty();
                boolean z4 = !fdVar.f2111i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<C0145a0> it = fdVar.f2110h.iterator();
                    while (it.hasNext()) {
                        C0145a0 next = it.next();
                        View view = next.f996a;
                        ViewPropertyAnimator animate = view.animate();
                        fdVar.f2119q.add(next);
                        animate.setDuration(fdVar.f1021d).alpha(0.0f).setListener(new C0019ad(fdVar, next, animate, view)).start();
                    }
                    fdVar.f2110h.clear();
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(fdVar.f2112j);
                        fdVar.f2115m.add(arrayList);
                        fdVar.f2112j.clear();
                        C1358xc xcVar = new C1358xc(fdVar, arrayList);
                        if (z) {
                            C0813m8.m2492z(((C0465fd.C0467b) arrayList.get(0)).f2127a.f996a, xcVar, fdVar.f1021d);
                        } else {
                            xcVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(fdVar.f2113k);
                        fdVar.f2116n.add(arrayList2);
                        fdVar.f2113k.clear();
                        C1413yc ycVar = new C1413yc(fdVar, arrayList2);
                        if (z) {
                            C0813m8.m2492z(((C0465fd.C0466a) arrayList2.get(0)).f2121a.f996a, ycVar, fdVar.f1021d);
                        } else {
                            ycVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(fdVar.f2111i);
                        fdVar.f2114l.add(arrayList3);
                        fdVar.f2111i.clear();
                        C1451zc zcVar = new C1451zc(fdVar, arrayList3);
                        if (z || z2 || z3) {
                            long j = 0;
                            long j2 = z ? fdVar.f1021d : 0;
                            long j3 = z2 ? fdVar.f1022e : 0;
                            if (z3) {
                                j = fdVar.f1023f;
                            }
                            C0813m8.m2492z(((C0145a0) arrayList3.get(0)).f996a, zcVar, Math.max(j3, j) + j2);
                        } else {
                            zcVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.f971n0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public static class C0147c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0148d implements C1306wd.C1308b {
        public C0148d() {
        }

        /* renamed from: a */
        public void mo1271a(C0145a0 a0Var, C0154j.C0157c cVar, C0154j.C0157c cVar2) {
            boolean z;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getClass();
            a0Var.mo1265t(false);
            C1108sd sdVar = (C1108sd) recyclerView.f934M;
            sdVar.getClass();
            if (cVar == null || ((i = cVar.f1024a) == (i2 = cVar2.f1024a) && cVar.f1025b == cVar2.f1025b)) {
                C0465fd fdVar = (C0465fd) sdVar;
                fdVar.mo2787n(a0Var);
                a0Var.f996a.setAlpha(0.0f);
                fdVar.f2111i.add(a0Var);
                z = true;
            } else {
                z = sdVar.mo2782i(a0Var, i, cVar.f1025b, i2, cVar2.f1025b);
            }
            if (z) {
                recyclerView.mo1125a0();
            }
        }

        /* renamed from: b */
        public void mo1272b(C0145a0 a0Var, C0154j.C0157c cVar, C0154j.C0157c cVar2) {
            boolean z;
            RecyclerView.this.f948c.mo1381l(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mo1147f(a0Var);
            a0Var.mo1265t(false);
            C1108sd sdVar = (C1108sd) recyclerView.f934M;
            sdVar.getClass();
            int i = cVar.f1024a;
            int i2 = cVar.f1025b;
            View view = a0Var.f996a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f1024a;
            int top = cVar2 == null ? view.getTop() : cVar2.f1025b;
            if (a0Var.mo1258m() || (i == left && i2 == top)) {
                C0465fd fdVar = (C0465fd) sdVar;
                fdVar.mo2787n(a0Var);
                fdVar.f2110h.add(a0Var);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = sdVar.mo2782i(a0Var, i, i2, left, top);
            }
            if (z) {
                recyclerView.mo1125a0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static abstract class C0149e<VH extends C0145a0> {

        /* renamed from: a */
        public final C0150f f1016a = new C0150f();

        /* renamed from: b */
        public boolean f1017b = false;

        /* renamed from: a */
        public abstract int mo1273a();

        /* renamed from: b */
        public long mo1274b(int i) {
            return -1;
        }

        /* renamed from: c */
        public int mo1275c(int i) {
            return 0;
        }

        /* renamed from: d */
        public abstract void mo1276d(VH vh, int i);

        /* renamed from: e */
        public abstract VH mo1277e(ViewGroup viewGroup, int i);

        /* renamed from: f */
        public void mo1278f(boolean z) {
            if (!this.f1016a.mo1279a()) {
                this.f1017b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static class C0150f extends Observable<C0151g> {
        /* renamed from: a */
        public boolean mo1279a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo1280b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0151g) this.mObservers.get(size)).mo1282a();
            }
        }

        /* renamed from: c */
        public void mo1281c(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0151g) this.mObservers.get(size)).mo1283b(i, i2, obj);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0151g {
        /* renamed from: a */
        public void mo1282a() {
        }

        /* renamed from: b */
        public void mo1283b(int i, int i2, Object obj) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public interface C0152h {
        /* renamed from: a */
        int mo1284a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C0153i {
        /* renamed from: a */
        public EdgeEffect mo1285a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C0154j {

        /* renamed from: a */
        public C0156b f1018a = null;

        /* renamed from: b */
        public ArrayList<C0155a> f1019b = new ArrayList<>();

        /* renamed from: c */
        public long f1020c = 120;

        /* renamed from: d */
        public long f1021d = 120;

        /* renamed from: e */
        public long f1022e = 250;

        /* renamed from: f */
        public long f1023f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$a */
        public interface C0155a {
            /* renamed from: a */
            void mo1293a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$b */
        public interface C0156b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$c */
        public static class C0157c {

            /* renamed from: a */
            public int f1024a;

            /* renamed from: b */
            public int f1025b;
        }

        /* renamed from: b */
        public static int m704b(C0145a0 a0Var) {
            int i = a0Var.f1005j & 14;
            if (a0Var.mo1256k()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = a0Var.f999d;
            int e = a0Var.mo1250e();
            return (i2 == -1 || e == -1 || i2 == e) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo1286a(C0145a0 a0Var, C0145a0 a0Var2, C0157c cVar, C0157c cVar2);

        /* renamed from: c */
        public final void mo1287c(C0145a0 a0Var) {
            C0156b bVar = this.f1018a;
            if (bVar != null) {
                C0158k kVar = (C0158k) bVar;
                kVar.getClass();
                boolean z = true;
                a0Var.mo1265t(true);
                if (a0Var.f1003h != null && a0Var.f1004i == null) {
                    a0Var.f1003h = null;
                }
                a0Var.f1004i = null;
                if (!((a0Var.f1005j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = a0Var.f996a;
                    recyclerView.mo1185m0();
                    C1303wc wcVar = recyclerView.f954f;
                    int indexOfChild = ((C0972pd) wcVar.f4945a).f3617a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        wcVar.mo4991l(view);
                    } else if (wcVar.f4946b.mo4996d(indexOfChild)) {
                        wcVar.f4946b.mo4998f(indexOfChild);
                        wcVar.mo4991l(view);
                        ((C0972pd) wcVar.f4945a).mo4014c(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        C0145a0 K = RecyclerView.m600K(view);
                        recyclerView.f948c.mo1381l(K);
                        recyclerView.f948c.mo1378i(K);
                    }
                    recyclerView.mo1189o0(!z);
                    if (!z && a0Var.mo1260o()) {
                        RecyclerView.this.removeDetachedView(a0Var.f996a, false);
                    }
                }
            }
        }

        /* renamed from: d */
        public final void mo1288d() {
            int size = this.f1019b.size();
            for (int i = 0; i < size; i++) {
                this.f1019b.get(i).mo1293a();
            }
            this.f1019b.clear();
        }

        /* renamed from: e */
        public abstract void mo1289e(C0145a0 a0Var);

        /* renamed from: f */
        public abstract void mo1290f();

        /* renamed from: g */
        public abstract boolean mo1291g();

        /* renamed from: h */
        public C0157c mo1292h(C0145a0 a0Var) {
            C0157c cVar = new C0157c();
            View view = a0Var.f996a;
            cVar.f1024a = view.getLeft();
            cVar.f1025b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public class C0158k implements C0154j.C0156b {
        public C0158k() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0159l {
        /* renamed from: d */
        public void mo1294d(Rect rect, View view, RecyclerView recyclerView, C0179x xVar) {
            ((C0165n) view.getLayoutParams()).mo1360a();
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo1295e(Canvas canvas, RecyclerView recyclerView, C0179x xVar) {
        }

        /* renamed from: f */
        public void mo1296f(Canvas canvas, RecyclerView recyclerView, C0179x xVar) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C0160m {

        /* renamed from: a */
        public C1303wc f1027a;

        /* renamed from: b */
        public RecyclerView f1028b;

        /* renamed from: c */
        public final C1257vd.C1259b f1029c;

        /* renamed from: d */
        public final C1257vd.C1259b f1030d;

        /* renamed from: e */
        public C1257vd f1031e;

        /* renamed from: f */
        public C1257vd f1032f;

        /* renamed from: g */
        public C0176w f1033g;

        /* renamed from: h */
        public boolean f1034h = false;

        /* renamed from: i */
        public boolean f1035i = false;

        /* renamed from: j */
        public boolean f1036j = true;

        /* renamed from: k */
        public boolean f1037k = true;

        /* renamed from: l */
        public int f1038l;

        /* renamed from: m */
        public boolean f1039m;

        /* renamed from: n */
        public int f1040n;

        /* renamed from: o */
        public int f1041o;

        /* renamed from: p */
        public int f1042p;

        /* renamed from: q */
        public int f1043q;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public class C0161a implements C1257vd.C1259b {
            public C0161a() {
            }

            /* renamed from: a */
            public int mo1355a() {
                C0160m mVar = C0160m.this;
                return mVar.f1042p - mVar.mo1321O();
            }

            /* renamed from: b */
            public int mo1356b() {
                return C0160m.this.mo1319N();
            }

            /* renamed from: c */
            public int mo1357c(View view) {
                return C0160m.this.mo1308G(view) + ((C0165n) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: d */
            public int mo1358d(View view) {
                return C0160m.this.mo1302D(view) - ((C0165n) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: e */
            public View mo1359e(int i) {
                return C0160m.this.mo1352x(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public class C0162b implements C1257vd.C1259b {
            public C0162b() {
            }

            /* renamed from: a */
            public int mo1355a() {
                C0160m mVar = C0160m.this;
                return mVar.f1043q - mVar.mo1318M();
            }

            /* renamed from: b */
            public int mo1356b() {
                return C0160m.this.mo1323P();
            }

            /* renamed from: c */
            public int mo1357c(View view) {
                return C0160m.this.mo1298B(view) + ((C0165n) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: d */
            public int mo1358d(View view) {
                return C0160m.this.mo1310H(view) - ((C0165n) view.getLayoutParams()).topMargin;
            }

            /* renamed from: e */
            public View mo1359e(int i) {
                return C0160m.this.mo1352x(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public interface C0163c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$d */
        public static class C0164d {

            /* renamed from: a */
            public int f1046a;

            /* renamed from: b */
            public int f1047b;

            /* renamed from: c */
            public boolean f1048c;

            /* renamed from: d */
            public boolean f1049d;
        }

        public C0160m() {
            C0161a aVar = new C0161a();
            this.f1029c = aVar;
            C0162b bVar = new C0162b();
            this.f1030d = bVar;
            this.f1031e = new C1257vd(aVar);
            this.f1032f = new C1257vd(bVar);
        }

        /* renamed from: R */
        public static C0164d m716R(Context context, AttributeSet attributeSet, int i, int i2) {
            C0164d dVar = new C0164d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1206uc.f4616a, i, i2);
            dVar.f1046a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1047b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1048c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f1049d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: X */
        public static boolean m717X(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: h */
        public static int m718h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m719z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0160m.m719z(int, int, int, int, boolean):int");
        }

        /* renamed from: A */
        public int mo1003A(C0171s sVar, C0179x xVar) {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView == null || recyclerView.f968m == null || !mo1058e()) {
                return 1;
            }
            return this.f1028b.f968m.mo1273a();
        }

        /* renamed from: A0 */
        public void mo1297A0(int i) {
        }

        /* renamed from: B */
        public int mo1298B(View view) {
            return view.getBottom() + ((C0165n) view.getLayoutParams()).f1051b.bottom;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[ADDED_TO_REGION] */
        /* renamed from: B0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1299B0(int r11) {
            /*
                r10 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r10.f1028b
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                r2 = 4096(0x1000, float:5.74E-42)
                r3 = 1
                if (r11 == r2) goto L_0x003e
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r11 == r2) goto L_0x0012
                r5 = 0
                r6 = 0
                goto L_0x006c
            L_0x0012:
                r11 = -1
                boolean r0 = r0.canScrollVertically(r11)
                if (r0 == 0) goto L_0x0027
                int r0 = r10.f1043q
                int r2 = r10.mo1323P()
                int r0 = r0 - r2
                int r2 = r10.mo1318M()
                int r0 = r0 - r2
                int r0 = -r0
                goto L_0x0028
            L_0x0027:
                r0 = 0
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r2 = r10.f1028b
                boolean r11 = r2.canScrollHorizontally(r11)
                if (r11 == 0) goto L_0x006a
                int r11 = r10.f1042p
                int r2 = r10.mo1319N()
                int r11 = r11 - r2
                int r2 = r10.mo1321O()
                int r11 = r11 - r2
                int r11 = -r11
                goto L_0x0067
            L_0x003e:
                boolean r11 = r0.canScrollVertically(r3)
                if (r11 == 0) goto L_0x0052
                int r11 = r10.f1043q
                int r0 = r10.mo1323P()
                int r11 = r11 - r0
                int r0 = r10.mo1318M()
                int r11 = r11 - r0
                r0 = r11
                goto L_0x0053
            L_0x0052:
                r0 = 0
            L_0x0053:
                androidx.recyclerview.widget.RecyclerView r11 = r10.f1028b
                boolean r11 = r11.canScrollHorizontally(r3)
                if (r11 == 0) goto L_0x006a
                int r11 = r10.f1042p
                int r2 = r10.mo1319N()
                int r11 = r11 - r2
                int r2 = r10.mo1321O()
                int r11 = r11 - r2
            L_0x0067:
                r5 = r11
                r6 = r0
                goto L_0x006c
            L_0x006a:
                r6 = r0
                r5 = 0
            L_0x006c:
                if (r6 != 0) goto L_0x0071
                if (r5 != 0) goto L_0x0071
                return r1
            L_0x0071:
                androidx.recyclerview.widget.RecyclerView r4 = r10.f1028b
                r7 = 0
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 1
                r4.mo1183l0(r5, r6, r7, r8, r9)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0160m.mo1299B0(int):boolean");
        }

        /* renamed from: C */
        public void mo1300C(View view, Rect rect) {
            int[] iArr = RecyclerView.f920y0;
            C0165n nVar = (C0165n) view.getLayoutParams();
            Rect rect2 = nVar.f1051b;
            rect.set((view.getLeft() - rect2.left) - nVar.leftMargin, (view.getTop() - rect2.top) - nVar.topMargin, view.getRight() + rect2.right + nVar.rightMargin, view.getBottom() + rect2.bottom + nVar.bottomMargin);
        }

        /* renamed from: C0 */
        public boolean mo1301C0() {
            return false;
        }

        /* renamed from: D */
        public int mo1302D(View view) {
            return view.getLeft() - ((C0165n) view.getLayoutParams()).f1051b.left;
        }

        /* renamed from: D0 */
        public void mo1303D0(C0171s sVar) {
            for (int y = mo1354y() - 1; y >= 0; y--) {
                if (!RecyclerView.m600K(mo1352x(y)).mo1267u()) {
                    mo1309G0(y, sVar);
                }
            }
        }

        /* renamed from: E */
        public int mo1304E(View view) {
            Rect rect = ((C0165n) view.getLayoutParams()).f1051b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: E0 */
        public void mo1305E0(C0171s sVar) {
            int size = sVar.f1060a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = sVar.f1060a.get(i).f996a;
                C0145a0 K = RecyclerView.m600K(view);
                if (!K.mo1267u()) {
                    K.mo1265t(false);
                    if (K.mo1260o()) {
                        this.f1028b.removeDetachedView(view, false);
                    }
                    C0154j jVar = this.f1028b.f934M;
                    if (jVar != null) {
                        jVar.mo1289e(K);
                    }
                    K.mo1265t(true);
                    C0145a0 K2 = RecyclerView.m600K(view);
                    K2.f1009n = null;
                    K2.f1010o = false;
                    K2.mo1249d();
                    sVar.mo1378i(K2);
                }
            }
            sVar.f1060a.clear();
            ArrayList<C0145a0> arrayList = sVar.f1061b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1028b.invalidate();
            }
        }

        /* renamed from: F */
        public int mo1306F(View view) {
            Rect rect = ((C0165n) view.getLayoutParams()).f1051b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: F0 */
        public void mo1307F0(View view, C0171s sVar) {
            C1303wc wcVar = this.f1027a;
            int indexOfChild = ((C0972pd) wcVar.f4945a).f3617a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (wcVar.f4946b.mo4998f(indexOfChild)) {
                    wcVar.mo4991l(view);
                }
                ((C0972pd) wcVar.f4945a).mo4014c(indexOfChild);
            }
            sVar.mo1377h(view);
        }

        /* renamed from: G */
        public int mo1308G(View view) {
            return view.getRight() + ((C0165n) view.getLayoutParams()).f1051b.right;
        }

        /* renamed from: G0 */
        public void mo1309G0(int i, C0171s sVar) {
            View x = mo1352x(i);
            mo1311H0(i);
            sVar.mo1377h(x);
        }

        /* renamed from: H */
        public int mo1310H(View view) {
            return view.getTop() - ((C0165n) view.getLayoutParams()).f1051b.top;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f1027a;
            r4 = r0.mo4985f(r4);
         */
        /* renamed from: H0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1311H0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.mo1352x(r4)
                if (r0 == 0) goto L_0x0029
                wc r0 = r3.f1027a
                int r4 = r0.mo4985f(r4)
                wc$b r1 = r0.f4945a
                pd r1 = (p000.C0972pd) r1
                android.view.View r1 = r1.mo4012a(r4)
                if (r1 != 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                wc$a r2 = r0.f4946b
                boolean r2 = r2.mo4998f(r4)
                if (r2 == 0) goto L_0x0022
                r0.mo4991l(r1)
            L_0x0022:
                wc$b r0 = r0.f4945a
                pd r0 = (p000.C0972pd) r0
                r0.mo4014c(r4)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0160m.mo1311H0(int):void");
        }

        /* renamed from: I */
        public View mo1312I() {
            View focusedChild;
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1027a.f4947c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r1 == false) goto L_0x00bf;
         */
        /* renamed from: I0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1313I0(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.mo1319N()
                int r4 = r18.mo1323P()
                int r5 = r0.f1042p
                int r6 = r18.mo1321O()
                int r5 = r5 - r6
                int r6 = r0.f1043q
                int r7 = r18.mo1318M()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.mo1314J()
                r11 = 1
                if (r6 != r11) goto L_0x0063
                if (r5 == 0) goto L_0x005e
                goto L_0x006b
            L_0x005e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L_0x006b
            L_0x0063:
                if (r10 == 0) goto L_0x0066
                goto L_0x006a
            L_0x0066:
                int r10 = java.lang.Math.min(r7, r5)
            L_0x006a:
                r5 = r10
            L_0x006b:
                if (r4 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                int r4 = java.lang.Math.min(r8, r1)
            L_0x0072:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto L_0x00ba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L_0x0083
                goto L_0x00b7
            L_0x0083:
                int r2 = r18.mo1319N()
                int r4 = r18.mo1323P()
                int r5 = r0.f1042p
                int r6 = r18.mo1321O()
                int r5 = r5 - r6
                int r6 = r0.f1043q
                int r7 = r18.mo1318M()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f1028b
                android.graphics.Rect r7 = r7.f962j
                r0.mo1300C(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto L_0x00b7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto L_0x00b7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto L_0x00b7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r1 = 1
                goto L_0x00b8
            L_0x00b7:
                r1 = 0
            L_0x00b8:
                if (r1 == 0) goto L_0x00bf
            L_0x00ba:
                if (r13 != 0) goto L_0x00c0
                if (r14 == 0) goto L_0x00bf
                goto L_0x00c0
            L_0x00bf:
                return r3
            L_0x00c0:
                if (r22 == 0) goto L_0x00c8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto L_0x00d4
            L_0x00c8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.mo1183l0(r13, r14, r15, r16, r17)
            L_0x00d4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0160m.mo1313I0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: J */
        public int mo1314J() {
            return C0813m8.m2478l(this.f1028b);
        }

        /* renamed from: J0 */
        public void mo1315J0() {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: K */
        public int mo1316K() {
            return C0813m8.m2479m(this.f1028b);
        }

        /* renamed from: K0 */
        public int mo1009K0(int i, C0171s sVar, C0179x xVar) {
            return 0;
        }

        /* renamed from: L */
        public int mo1317L() {
            return C0813m8.m2480n(this.f1028b);
        }

        /* renamed from: L0 */
        public void mo1047L0(int i) {
        }

        /* renamed from: M */
        public int mo1318M() {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: M0 */
        public int mo1012M0(int i, C0171s sVar, C0179x xVar) {
            return 0;
        }

        /* renamed from: N */
        public int mo1319N() {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: N0 */
        public void mo1320N0(RecyclerView recyclerView) {
            mo1322O0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: O */
        public int mo1321O() {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: O0 */
        public void mo1322O0(int i, int i2) {
            this.f1042p = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f1040n = mode;
            if (mode == 0 && !RecyclerView.f913A0) {
                this.f1042p = 0;
            }
            this.f1043q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1041o = mode2;
            if (mode2 == 0 && !RecyclerView.f913A0) {
                this.f1043q = 0;
            }
        }

        /* renamed from: P */
        public int mo1323P() {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: P0 */
        public void mo1016P0(Rect rect, int i, int i2) {
            int O = mo1321O() + mo1319N() + rect.width();
            int M = mo1318M() + mo1323P() + rect.height();
            this.f1028b.setMeasuredDimension(m718h(i, O, mo1317L()), m718h(i2, M, mo1316K()));
        }

        /* renamed from: Q */
        public int mo1324Q(View view) {
            return ((C0165n) view.getLayoutParams()).mo1360a();
        }

        /* renamed from: Q0 */
        public void mo1325Q0(int i, int i2) {
            int y = mo1354y();
            if (y == 0) {
                this.f1028b.mo1188o(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < y; i7++) {
                View x = mo1352x(i7);
                Rect rect = this.f1028b.f962j;
                mo1300C(x, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f1028b.f962j.set(i5, i6, i3, i4);
            mo1016P0(this.f1028b.f962j, i, i2);
        }

        /* renamed from: R0 */
        public void mo1326R0(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f1028b = null;
                this.f1027a = null;
                i = 0;
                this.f1042p = 0;
            } else {
                this.f1028b = recyclerView;
                this.f1027a = recyclerView.f954f;
                this.f1042p = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f1043q = i;
            this.f1040n = 1073741824;
            this.f1041o = 1073741824;
        }

        /* renamed from: S */
        public int mo1018S(C0171s sVar, C0179x xVar) {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView == null || recyclerView.f968m == null || !mo1060f()) {
                return 1;
            }
            return this.f1028b.f968m.mo1273a();
        }

        /* renamed from: S0 */
        public boolean mo1327S0(View view, int i, int i2, C0165n nVar) {
            return view.isLayoutRequested() || !this.f1036j || !m717X(view.getWidth(), i, nVar.width) || !m717X(view.getHeight(), i2, nVar.height);
        }

        /* renamed from: T */
        public int mo1328T() {
            return 0;
        }

        /* renamed from: T0 */
        public boolean mo1048T0() {
            return false;
        }

        /* renamed from: U */
        public void mo1329U(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0165n) view.getLayoutParams()).f1051b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f1028b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1028b.f966l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: U0 */
        public boolean mo1330U0(View view, int i, int i2, C0165n nVar) {
            return !this.f1036j || !m717X(view.getMeasuredWidth(), i, nVar.width) || !m717X(view.getMeasuredHeight(), i2, nVar.height);
        }

        /* renamed from: V */
        public boolean mo1049V() {
            return false;
        }

        /* renamed from: V0 */
        public void mo1050V0(RecyclerView recyclerView, C0179x xVar, int i) {
        }

        /* renamed from: W */
        public boolean mo1331W() {
            return false;
        }

        /* renamed from: W0 */
        public void mo1332W0(C0176w wVar) {
            C0176w wVar2 = this.f1033g;
            if (!(wVar2 == null || wVar == wVar2 || !wVar2.f1074e)) {
                wVar2.mo1390c();
            }
            this.f1033g = wVar;
            RecyclerView recyclerView = this.f1028b;
            wVar.getClass();
            recyclerView.f953e0.mo1398c();
            if (wVar.f1077h) {
                wVar.getClass().getSimpleName();
                wVar.getClass().getSimpleName();
            }
            wVar.f1071b = recyclerView;
            wVar.f1072c = this;
            int i = wVar.f1070a;
            if (i != -1) {
                recyclerView.f959h0.f1085a = i;
                wVar.f1074e = true;
                wVar.f1073d = true;
                wVar.f1075f = recyclerView.f970n.mo1080t(i);
                wVar.f1071b.f953e0.mo1396a();
                wVar.f1077h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: X0 */
        public boolean mo1019X0() {
            return false;
        }

        /* renamed from: Y */
        public boolean mo1333Y(View view, boolean z) {
            boolean z2 = this.f1031e.mo4901b(view, 24579) && this.f1032f.mo4901b(view, 24579);
            return z ? z2 : !z2;
        }

        /* renamed from: Z */
        public void mo1334Z(View view, int i, int i2, int i3, int i4) {
            C0165n nVar = (C0165n) view.getLayoutParams();
            Rect rect = nVar.f1051b;
            view.layout(i + rect.left + nVar.leftMargin, i2 + rect.top + nVar.topMargin, (i3 - rect.right) - nVar.rightMargin, (i4 - rect.bottom) - nVar.bottomMargin);
        }

        /* renamed from: a0 */
        public void mo1335a0(int i) {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                int e = recyclerView.f954f.mo4984e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f954f.mo4983d(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: b */
        public void mo1336b(View view) {
            mo1338c(view, -1, false);
        }

        /* renamed from: b0 */
        public void mo1337b0(int i) {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                int e = recyclerView.f954f.mo4984e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f954f.mo4983d(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* renamed from: c */
        public final void mo1338c(View view, int i, boolean z) {
            C0145a0 K = RecyclerView.m600K(view);
            if (z || K.mo1258m()) {
                this.f1028b.f956g.mo5002a(K);
            } else {
                this.f1028b.f956g.mo5007f(K);
            }
            C0165n nVar = (C0165n) view.getLayoutParams();
            if (K.mo1268v() || K.mo1259n()) {
                if (K.mo1259n()) {
                    K.f1009n.mo1381l(K);
                } else {
                    K.mo1249d();
                }
                this.f1027a.mo4981b(view, i, view.getLayoutParams(), false);
            } else {
                int i2 = -1;
                if (view.getParent() == this.f1028b) {
                    int j = this.f1027a.mo4989j(view);
                    if (i == -1) {
                        i = this.f1027a.mo4984e();
                    }
                    if (j == -1) {
                        StringBuilder c = C0279ch.m1106c("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        c.append(this.f1028b.indexOfChild(view));
                        throw new IllegalStateException(C0279ch.m1116m(this.f1028b, c));
                    } else if (j != i) {
                        C0160m mVar = this.f1028b.f970n;
                        View x = mVar.mo1352x(j);
                        if (x != null) {
                            mVar.mo1352x(j);
                            mVar.mo1347r(j);
                            C0165n nVar2 = (C0165n) x.getLayoutParams();
                            C0145a0 K2 = RecyclerView.m600K(x);
                            if (K2.mo1258m()) {
                                mVar.f1028b.f956g.mo5002a(K2);
                            } else {
                                mVar.f1028b.f956g.mo5007f(K2);
                            }
                            mVar.f1027a.mo4981b(x, i, nVar2, K2.mo1258m());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + mVar.f1028b.toString());
                        }
                    }
                } else {
                    this.f1027a.mo4980a(view, i, false);
                    nVar.f1052c = true;
                    C0176w wVar = this.f1033g;
                    if (wVar != null && wVar.f1074e) {
                        wVar.f1071b.getClass();
                        C0145a0 K3 = RecyclerView.m600K(view);
                        if (K3 != null) {
                            i2 = K3.mo1251f();
                        }
                        if (i2 == wVar.f1070a) {
                            wVar.f1075f = view;
                        }
                    }
                }
            }
            if (nVar.f1053d) {
                K.f996a.invalidate();
                nVar.f1053d = false;
            }
        }

        /* renamed from: c0 */
        public void mo1339c0() {
        }

        /* renamed from: d */
        public void mo1056d(String str) {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null) {
                recyclerView.mo1175i(str);
            }
        }

        /* renamed from: d0 */
        public boolean mo1340d0() {
            return false;
        }

        /* renamed from: e */
        public boolean mo1058e() {
            return false;
        }

        /* renamed from: e0 */
        public void mo1341e0() {
        }

        /* renamed from: f */
        public boolean mo1060f() {
            return false;
        }

        @Deprecated
        /* renamed from: f0 */
        public void mo1342f0() {
        }

        /* renamed from: g */
        public boolean mo1021g(C0165n nVar) {
            return nVar != null;
        }

        /* renamed from: g0 */
        public void mo1062g0(RecyclerView recyclerView, C0171s sVar) {
            mo1342f0();
        }

        /* renamed from: h0 */
        public View mo1022h0(View view, int i, C0171s sVar, C0179x xVar) {
            return null;
        }

        /* renamed from: i */
        public void mo1065i(int i, int i2, C0179x xVar, C0163c cVar) {
        }

        /* renamed from: i0 */
        public void mo1066i0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1028b;
            C0171s sVar = recyclerView.f948c;
            C0179x xVar = recyclerView.f959h0;
            mo1343j0(accessibilityEvent);
        }

        /* renamed from: j */
        public void mo1068j(int i, C0163c cVar) {
        }

        /* renamed from: j0 */
        public void mo1343j0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1028b.canScrollVertically(-1) && !this.f1028b.canScrollHorizontally(-1) && !this.f1028b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0149e eVar = this.f1028b.f968m;
                if (eVar != null) {
                    accessibilityEvent.setItemCount(eVar.mo1273a());
                }
            }
        }

        /* renamed from: k */
        public int mo1070k(C0179x xVar) {
            return 0;
        }

        /* renamed from: k0 */
        public void mo1344k0(View view, C1347x8 x8Var) {
            C0145a0 K = RecyclerView.m600K(view);
            if (K != null && !K.mo1258m() && !this.f1027a.mo4990k(K.f996a)) {
                RecyclerView recyclerView = this.f1028b;
                mo1024l0(recyclerView.f948c, recyclerView.f959h0, view, x8Var);
            }
        }

        /* renamed from: l */
        public int mo1023l(C0179x xVar) {
            return 0;
        }

        /* renamed from: l0 */
        public void mo1024l0(C0171s sVar, C0179x xVar, View view, C1347x8 x8Var) {
            x8Var.mo5064j(C1347x8.C1350c.m3799a(mo1060f() ? mo1324Q(view) : 0, 1, mo1058e() ? mo1324Q(view) : 0, 1, false, false));
        }

        /* renamed from: m */
        public int mo1025m(C0179x xVar) {
            return 0;
        }

        /* renamed from: m0 */
        public View mo1345m0() {
            return null;
        }

        /* renamed from: n */
        public int mo1074n(C0179x xVar) {
            return 0;
        }

        /* renamed from: n0 */
        public void mo1026n0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: o */
        public int mo1027o(C0179x xVar) {
            return 0;
        }

        /* renamed from: o0 */
        public void mo1028o0(RecyclerView recyclerView) {
        }

        /* renamed from: p */
        public int mo1030p(C0179x xVar) {
            return 0;
        }

        /* renamed from: p0 */
        public void mo1031p0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: q */
        public void mo1346q(C0171s sVar) {
            int y = mo1354y();
            while (true) {
                y--;
                if (y >= 0) {
                    View x = mo1352x(y);
                    C0145a0 K = RecyclerView.m600K(x);
                    if (!K.mo1267u()) {
                        if (!K.mo1256k() || K.mo1258m() || this.f1028b.f968m.f1017b) {
                            mo1352x(y);
                            mo1347r(y);
                            sVar.mo1379j(x);
                            this.f1028b.f956g.mo5007f(K);
                        } else {
                            mo1311H0(y);
                            sVar.mo1378i(K);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: q0 */
        public void mo1032q0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: r */
        public final void mo1347r(int i) {
            this.f1027a.mo4982c(i);
        }

        /* renamed from: r0 */
        public void mo1348r0() {
        }

        /* renamed from: s */
        public View mo1349s(View view) {
            View C;
            RecyclerView recyclerView = this.f1028b;
            if (recyclerView == null || (C = recyclerView.mo1103C(view)) == null || this.f1027a.f4947c.contains(C)) {
                return null;
            }
            return C;
        }

        /* renamed from: s0 */
        public void mo1033s0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo1348r0();
        }

        /* renamed from: t */
        public View mo1080t(int i) {
            int y = mo1354y();
            for (int i2 = 0; i2 < y; i2++) {
                View x = mo1352x(i2);
                C0145a0 K = RecyclerView.m600K(x);
                if (K != null && K.mo1251f() == i && !K.mo1267u() && (this.f1028b.f959h0.f1091g || !K.mo1258m())) {
                    return x;
                }
            }
            return null;
        }

        /* renamed from: t0 */
        public void mo1034t0(C0171s sVar, C0179x xVar) {
        }

        /* renamed from: u */
        public abstract C0165n mo1035u();

        /* renamed from: u0 */
        public void mo1036u0(C0179x xVar) {
        }

        /* renamed from: v */
        public C0165n mo1038v(Context context, AttributeSet attributeSet) {
            return new C0165n(context, attributeSet);
        }

        /* renamed from: v0 */
        public void mo1350v0(int i, int i2) {
            this.f1028b.mo1188o(i, i2);
        }

        /* renamed from: w */
        public C0165n mo1040w(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0165n ? new C0165n((C0165n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0165n((ViewGroup.MarginLayoutParams) layoutParams) : new C0165n(layoutParams);
        }

        @Deprecated
        /* renamed from: w0 */
        public boolean mo1351w0(RecyclerView recyclerView) {
            C0176w wVar = this.f1033g;
            if ((wVar != null && wVar.f1074e) || recyclerView.mo1114P()) {
                return true;
            }
            return false;
        }

        /* renamed from: x */
        public View mo1352x(int i) {
            C1303wc wcVar = this.f1027a;
            if (wcVar == null) {
                return null;
            }
            return ((C0972pd) wcVar.f4945a).mo4012a(wcVar.mo4985f(i));
        }

        /* renamed from: x0 */
        public boolean mo1353x0(RecyclerView recyclerView, View view, View view2) {
            return mo1351w0(recyclerView);
        }

        /* renamed from: y */
        public int mo1354y() {
            C1303wc wcVar = this.f1027a;
            if (wcVar != null) {
                return wcVar.mo4984e();
            }
            return 0;
        }

        /* renamed from: y0 */
        public void mo1084y0(Parcelable parcelable) {
        }

        /* renamed from: z0 */
        public Parcelable mo1086z0() {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static class C0165n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0145a0 f1050a;

        /* renamed from: b */
        public final Rect f1051b = new Rect();

        /* renamed from: c */
        public boolean f1052c = true;

        /* renamed from: d */
        public boolean f1053d = false;

        public C0165n(int i, int i2) {
            super(i, i2);
        }

        public C0165n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0165n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0165n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0165n(C0165n nVar) {
            super(nVar);
        }

        /* renamed from: a */
        public int mo1360a() {
            return this.f1050a.mo1251f();
        }

        /* renamed from: b */
        public boolean mo1361b() {
            return this.f1050a.mo1261p();
        }

        /* renamed from: c */
        public boolean mo1362c() {
            return this.f1050a.mo1258m();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0166o {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public interface C0167p {
        /* renamed from: a */
        void mo1363a(boolean z);

        /* renamed from: b */
        boolean mo1364b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo1365c(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static abstract class C0168q {
        /* renamed from: a */
        public void mo1366a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo1367b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static class C0169r {

        /* renamed from: a */
        public SparseArray<C0170a> f1054a = new SparseArray<>();

        /* renamed from: b */
        public int f1055b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$r$a */
        public static class C0170a {

            /* renamed from: a */
            public final ArrayList<C0145a0> f1056a = new ArrayList<>();

            /* renamed from: b */
            public int f1057b = 5;

            /* renamed from: c */
            public long f1058c = 0;

            /* renamed from: d */
            public long f1059d = 0;
        }

        /* renamed from: a */
        public final C0170a mo1368a(int i) {
            C0170a aVar = this.f1054a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0170a aVar2 = new C0170a();
            this.f1054a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: b */
        public long mo1369b(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public final class C0171s {

        /* renamed from: a */
        public final ArrayList<C0145a0> f1060a;

        /* renamed from: b */
        public ArrayList<C0145a0> f1061b = null;

        /* renamed from: c */
        public final ArrayList<C0145a0> f1062c = new ArrayList<>();

        /* renamed from: d */
        public final List<C0145a0> f1063d;

        /* renamed from: e */
        public int f1064e;

        /* renamed from: f */
        public int f1065f;

        /* renamed from: g */
        public C0169r f1066g;

        public C0171s() {
            ArrayList<C0145a0> arrayList = new ArrayList<>();
            this.f1060a = arrayList;
            this.f1063d = Collections.unmodifiableList(arrayList);
            this.f1064e = 2;
            this.f1065f = 2;
        }

        /* renamed from: a */
        public void mo1370a(C0145a0 a0Var, boolean z) {
            RecyclerView.m605k(a0Var);
            View view = a0Var.f996a;
            C1057rd rdVar = RecyclerView.this.f973o0;
            if (rdVar != null) {
                C1444z7 j = rdVar.mo4077j();
                C0813m8.m2457F(view, j instanceof C1057rd.C1058a ? ((C1057rd.C1058a) j).f3953e.remove(view) : null);
            }
            if (z) {
                C0172t tVar = RecyclerView.this.f972o;
                if (tVar != null) {
                    tVar.mo1383a(a0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                C0149e eVar = recyclerView.f968m;
                if (recyclerView.f959h0 != null) {
                    recyclerView.f956g.mo5008g(a0Var);
                }
            }
            a0Var.f1013r = null;
            C0169r d = mo1373d();
            d.getClass();
            int i = a0Var.f1001f;
            ArrayList<C0145a0> arrayList = d.mo1368a(i).f1056a;
            if (d.f1054a.get(i).f1057b > arrayList.size()) {
                a0Var.mo1263r();
                arrayList.add(a0Var);
            }
        }

        /* renamed from: b */
        public void mo1371b() {
            this.f1060a.clear();
            mo1375f();
        }

        /* renamed from: c */
        public int mo1372c(int i) {
            if (i < 0 || i >= RecyclerView.this.f959h0.mo1394b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f959h0.mo1394b());
                throw new IndexOutOfBoundsException(C0279ch.m1116m(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f959h0.f1091g) {
                return i;
            }
            return recyclerView.f952e.mo4889f(i, 0);
        }

        /* renamed from: d */
        public C0169r mo1373d() {
            if (this.f1066g == null) {
                this.f1066g = new C0169r();
            }
            return this.f1066g;
        }

        /* renamed from: e */
        public final void mo1374e(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    mo1374e((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: f */
        public void mo1375f() {
            for (int size = this.f1062c.size() - 1; size >= 0; size--) {
                mo1376g(size);
            }
            this.f1062c.clear();
            if (RecyclerView.f915C0) {
                C0568hd.C0570b bVar = RecyclerView.this.f957g0;
                int[] iArr = bVar.f2462c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2463d = 0;
            }
        }

        /* renamed from: g */
        public void mo1376g(int i) {
            mo1370a(this.f1062c.get(i), true);
            this.f1062c.remove(i);
        }

        /* renamed from: h */
        public void mo1377h(View view) {
            C0145a0 K = RecyclerView.m600K(view);
            if (K.mo1260o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.mo1259n()) {
                K.f1009n.mo1381l(K);
            } else if (K.mo1268v()) {
                K.mo1249d();
            }
            mo1378i(K);
            if (RecyclerView.this.f934M != null && !K.mo1257l()) {
                RecyclerView.this.f934M.mo1289e(K);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00a9 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1378i(androidx.recyclerview.widget.RecyclerView.C0145a0 r6) {
            /*
                r5 = this;
                boolean r0 = r6.mo1259n()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x00dc
                android.view.View r0 = r6.f996a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00dc
            L_0x0012:
                boolean r0 = r6.mo1260o()
                if (r0 != 0) goto L_0x00c3
                boolean r0 = r6.mo1267u()
                if (r0 != 0) goto L_0x00b1
                int r0 = r6.f1005j
                r3 = 16
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0037
                android.view.View r0 = r6.f996a
                java.lang.reflect.Field r4 = p000.C0813m8.f3234a
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r3) goto L_0x0032
                boolean r0 = r0.hasTransientState()
                goto L_0x0033
            L_0x0032:
                r0 = 0
            L_0x0033:
                if (r0 == 0) goto L_0x0037
                r0 = 1
                goto L_0x0038
            L_0x0037:
                r0 = 0
            L_0x0038:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.f968m
                if (r3 == 0) goto L_0x0043
                if (r0 == 0) goto L_0x0043
                r3.getClass()
            L_0x0043:
                boolean r3 = r6.mo1257l()
                if (r3 == 0) goto L_0x009f
                int r3 = r5.f1065f
                if (r3 <= 0) goto L_0x0098
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r6.mo1253h(r3)
                if (r3 != 0) goto L_0x0098
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r5.f1062c
                int r3 = r3.size()
                int r4 = r5.f1065f
                if (r3 < r4) goto L_0x0066
                if (r3 <= 0) goto L_0x0066
                r5.mo1376g(r1)
                int r3 = r3 + -1
            L_0x0066:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f915C0
                if (r1 == 0) goto L_0x0091
                if (r3 <= 0) goto L_0x0091
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                hd$b r1 = r1.f957g0
                int r4 = r6.f998c
                boolean r1 = r1.mo3079c(r4)
                if (r1 != 0) goto L_0x0091
            L_0x0078:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x0090
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r1 = r5.f1062c
                java.lang.Object r1 = r1.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r1 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r1
                int r1 = r1.f998c
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                hd$b r4 = r4.f957g0
                boolean r1 = r4.mo3079c(r1)
                if (r1 != 0) goto L_0x0078
            L_0x0090:
                int r3 = r3 + r2
            L_0x0091:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r1 = r5.f1062c
                r1.add(r3, r6)
                r1 = 1
                goto L_0x0099
            L_0x0098:
                r1 = 0
            L_0x0099:
                if (r1 != 0) goto L_0x009f
                r5.mo1370a(r6, r2)
                goto L_0x00a0
            L_0x009f:
                r2 = 0
            L_0x00a0:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                wd r3 = r3.f956g
                r3.mo5008g(r6)
                if (r1 != 0) goto L_0x00b0
                if (r2 != 0) goto L_0x00b0
                if (r0 == 0) goto L_0x00b0
                r0 = 0
                r6.f1013r = r0
            L_0x00b0:
                return
            L_0x00b1:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p000.C0279ch.m1116m(r1, r0)
                r6.<init>(r0)
                throw r6
            L_0x00c3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r6)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r6 = p000.C0279ch.m1116m(r6, r1)
                r0.<init>(r6)
                throw r0
            L_0x00dc:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
                boolean r3 = r6.mo1259n()
                r2.append(r3)
                java.lang.String r3 = " isAttached:"
                r2.append(r3)
                android.view.View r6 = r6.f996a
                android.view.ViewParent r6 = r6.getParent()
                if (r6 == 0) goto L_0x00f9
                r1 = 1
            L_0x00f9:
                r2.append(r1)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r6 = p000.C0279ch.m1116m(r6, r2)
                r0.<init>(r6)
                goto L_0x0107
            L_0x0106:
                throw r0
            L_0x0107:
                goto L_0x0106
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0171s.mo1378i(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1379j(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r5 = androidx.recyclerview.widget.RecyclerView.m600K(r5)
                r0 = 12
                boolean r0 = r5.mo1253h(r0)
                r1 = 0
                if (r0 != 0) goto L_0x0055
                boolean r0 = r5.mo1261p()
                if (r0 == 0) goto L_0x0055
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.f934M
                r2 = 1
                if (r0 == 0) goto L_0x003f
                java.util.List r3 = r5.mo1252g()
                fd r0 = (p000.C0465fd) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0039
                boolean r0 = r0.f4182g
                if (r0 == 0) goto L_0x0033
                boolean r0 = r5.mo1256k()
                if (r0 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r0 = 0
                goto L_0x0034
            L_0x0033:
                r0 = 1
            L_0x0034:
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = 0
                goto L_0x003a
            L_0x0039:
                r0 = 1
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = 0
                goto L_0x0040
            L_0x003f:
                r0 = 1
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0055
            L_0x0043:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f1061b
                if (r0 != 0) goto L_0x004e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f1061b = r0
            L_0x004e:
                r5.f1009n = r4
                r5.f1010o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f1061b
                goto L_0x0082
            L_0x0055:
                boolean r0 = r5.mo1256k()
                if (r0 == 0) goto L_0x007c
                boolean r0 = r5.mo1258m()
                if (r0 != 0) goto L_0x007c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.f968m
                boolean r0 = r0.f1017b
                if (r0 == 0) goto L_0x006a
                goto L_0x007c
            L_0x006a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p000.C0279ch.m1116m(r1, r0)
                r5.<init>(r0)
                throw r5
            L_0x007c:
                r5.f1009n = r4
                r5.f1010o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f1060a
            L_0x0082:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0171s.mo1379j(android.view.View):void");
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ff, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x0457, code lost:
            if (r7.mo1256k() == false) goto L_0x048d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x048b, code lost:
            if ((r10 == 0 || r10 + r8 < r20) == false) goto L_0x048d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:219:0x041f  */
        /* JADX WARNING: Removed duplicated region for block: B:224:0x0440  */
        /* JADX WARNING: Removed duplicated region for block: B:225:0x0443  */
        /* JADX WARNING: Removed duplicated region for block: B:278:0x053f  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x0546  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0145a0 mo1380k(int r18, boolean r19, long r20) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                if (r0 < 0) goto L_0x0568
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f959h0
                int r2 = r2.mo1394b()
                if (r0 >= r2) goto L_0x0568
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f959h0
                boolean r2 = r2.f1091g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r1.f1061b
                if (r2 == 0) goto L_0x0086
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x0086
            L_0x0027:
                r6 = 0
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f1061b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r7
                boolean r8 = r7.mo1268v()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.mo1251f()
                if (r8 != r0) goto L_0x0042
                r7.mo1247b(r3)
                goto L_0x0087
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r6.f968m
                boolean r7 = r7.f1017b
                if (r7 == 0) goto L_0x0086
                vc r6 = r6.f952e
                int r6 = r6.mo4889f(r0, r5)
                if (r6 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r7.f968m
                int r7 = r7.mo1273a()
                if (r6 >= r7) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r7.f968m
                long r6 = r7.mo1274b(r6)
                r8 = 0
            L_0x0068:
                if (r8 >= r2) goto L_0x0086
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f1061b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r9
                boolean r10 = r9.mo1268v()
                if (r10 != 0) goto L_0x0083
                long r10 = r9.f1000e
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x0083
                r9.mo1247b(r3)
                r7 = r9
                goto L_0x0087
            L_0x0083:
                int r8 = r8 + 1
                goto L_0x0068
            L_0x0086:
                r7 = r4
            L_0x0087:
                if (r7 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008b:
                r7 = r4
            L_0x008c:
                r2 = 0
            L_0x008d:
                r6 = -1
                if (r7 != 0) goto L_0x0248
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f1060a
                int r7 = r7.size()
                r8 = 0
            L_0x0097:
                if (r8 >= r7) goto L_0x00c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f1060a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r9
                boolean r10 = r9.mo1268v()
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.mo1251f()
                if (r10 != r0) goto L_0x00c6
                boolean r10 = r9.mo1256k()
                if (r10 != 0) goto L_0x00c6
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r10 = r10.f959h0
                boolean r10 = r10.f1091g
                if (r10 != 0) goto L_0x00c1
                boolean r10 = r9.mo1258m()
                if (r10 != 0) goto L_0x00c6
            L_0x00c1:
                r9.mo1247b(r3)
                goto L_0x01b4
            L_0x00c6:
                int r8 = r8 + 1
                goto L_0x0097
            L_0x00c9:
                if (r19 != 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                wc r7 = r7.f954f
                java.util.List<android.view.View> r8 = r7.f4947c
                int r8 = r8.size()
                r9 = 0
            L_0x00d6:
                if (r9 >= r8) goto L_0x0101
                java.util.List<android.view.View> r10 = r7.f4947c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                wc$b r11 = r7.f4945a
                pd r11 = (p000.C0972pd) r11
                r11.getClass()
                androidx.recyclerview.widget.RecyclerView$a0 r11 = androidx.recyclerview.widget.RecyclerView.m600K(r10)
                int r12 = r11.mo1251f()
                if (r12 != r0) goto L_0x00fe
                boolean r12 = r11.mo1256k()
                if (r12 != 0) goto L_0x00fe
                boolean r11 = r11.mo1258m()
                if (r11 != 0) goto L_0x00fe
                goto L_0x0102
            L_0x00fe:
                int r9 = r9 + 1
                goto L_0x00d6
            L_0x0101:
                r10 = r4
            L_0x0102:
                if (r10 == 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView$a0 r7 = androidx.recyclerview.widget.RecyclerView.m600K(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                wc r8 = r8.f954f
                wc$b r9 = r8.f4945a
                pd r9 = (p000.C0972pd) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f3617a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0173
                wc$a r11 = r8.f4946b
                boolean r11 = r11.mo4996d(r9)
                if (r11 == 0) goto L_0x015c
                wc$a r11 = r8.f4946b
                r11.mo4993a(r9)
                r8.mo4991l(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                wc r8 = r8.f954f
                int r8 = r8.mo4989j(r10)
                if (r8 == r6) goto L_0x0143
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                wc r9 = r9.f954f
                r9.mo4982c(r8)
                r1.mo1379j(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.mo1247b(r8)
                goto L_0x01ba
            L_0x0143:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p000.C0279ch.m1116m(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0173:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x018a:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f1062c
                int r7 = r7.size()
                r8 = 0
            L_0x0191:
                if (r8 >= r7) goto L_0x01b9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f1062c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r9
                boolean r10 = r9.mo1256k()
                if (r10 != 0) goto L_0x01b6
                int r10 = r9.mo1251f()
                if (r10 != r0) goto L_0x01b6
                boolean r10 = r9.mo1254i()
                if (r10 != 0) goto L_0x01b6
                if (r19 != 0) goto L_0x01b4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f1062c
                r7.remove(r8)
            L_0x01b4:
                r7 = r9
                goto L_0x01ba
            L_0x01b6:
                int r8 = r8 + 1
                goto L_0x0191
            L_0x01b9:
                r7 = r4
            L_0x01ba:
                if (r7 == 0) goto L_0x0248
                boolean r8 = r7.mo1258m()
                if (r8 == 0) goto L_0x01c9
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r8 = r8.f959h0
                boolean r8 = r8.f1091g
                goto L_0x0204
            L_0x01c9:
                int r8 = r7.f998c
                if (r8 < 0) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r9 = r9.f968m
                int r9 = r9.mo1273a()
                if (r8 >= r9) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r9 = r8.f959h0
                boolean r9 = r9.f1091g
                if (r9 != 0) goto L_0x01ec
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.f968m
                int r9 = r7.f998c
                int r8 = r8.mo1275c(r9)
                int r9 = r7.f1001f
                if (r8 == r9) goto L_0x01ec
                goto L_0x0201
            L_0x01ec:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.f968m
                boolean r9 = r8.f1017b
                if (r9 == 0) goto L_0x0203
                long r9 = r7.f1000e
                int r11 = r7.f998c
                long r11 = r8.mo1274b(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x0201
                goto L_0x0203
            L_0x0201:
                r8 = 0
                goto L_0x0204
            L_0x0203:
                r8 = 1
            L_0x0204:
                if (r8 != 0) goto L_0x022d
                if (r19 != 0) goto L_0x022b
                r8 = 4
                r7.mo1247b(r8)
                boolean r8 = r7.mo1259n()
                if (r8 == 0) goto L_0x021f
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f996a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$s r8 = r7.f1009n
                r8.mo1381l(r7)
                goto L_0x0228
            L_0x021f:
                boolean r8 = r7.mo1268v()
                if (r8 == 0) goto L_0x0228
                r7.mo1249d()
            L_0x0228:
                r1.mo1378i(r7)
            L_0x022b:
                r7 = r4
                goto L_0x0248
            L_0x022d:
                r2 = 1
                goto L_0x0248
            L_0x022f:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p000.C0279ch.m1116m(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0248:
                r8 = 2
                if (r7 != 0) goto L_0x0402
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                vc r9 = r9.f952e
                int r9 = r9.mo4889f(r0, r5)
                if (r9 < 0) goto L_0x03d1
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r10 = r10.f968m
                int r10 = r10.mo1273a()
                if (r9 >= r10) goto L_0x03d1
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r10 = r10.f968m
                int r10 = r10.mo1275c(r9)
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f968m
                boolean r12 = r11.f1017b
                if (r12 == 0) goto L_0x0305
                long r11 = r11.mo1274b(r9)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f1060a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x027a:
                if (r7 < 0) goto L_0x02cd
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r13 = r1.f1060a
                java.lang.Object r13 = r13.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r13 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r13
                long r14 = r13.f1000e
                int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                if (r16 != 0) goto L_0x02ca
                boolean r14 = r13.mo1268v()
                if (r14 != 0) goto L_0x02ca
                int r14 = r13.f1001f
                if (r10 != r14) goto L_0x02ac
                r13.mo1247b(r3)
                boolean r3 = r13.mo1258m()
                if (r3 == 0) goto L_0x02aa
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f959h0
                boolean r3 = r3.f1091g
                if (r3 != 0) goto L_0x02aa
                r3 = 14
                r13.mo1264s(r8, r3)
            L_0x02aa:
                r7 = r13
                goto L_0x0300
            L_0x02ac:
                if (r19 != 0) goto L_0x02ca
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r14 = r1.f1060a
                r14.remove(r7)
                androidx.recyclerview.widget.RecyclerView r14 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r15 = r13.f996a
                r14.removeDetachedView(r15, r5)
                android.view.View r13 = r13.f996a
                androidx.recyclerview.widget.RecyclerView$a0 r13 = androidx.recyclerview.widget.RecyclerView.m600K(r13)
                r13.f1009n = r4
                r13.f1010o = r5
                r13.mo1249d()
                r1.mo1378i(r13)
            L_0x02ca:
                int r7 = r7 + -1
                goto L_0x027a
            L_0x02cd:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r1.f1062c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02d4:
                if (r3 < 0) goto L_0x02ff
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f1062c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r7
                long r13 = r7.f1000e
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 != 0) goto L_0x02fc
                boolean r13 = r7.mo1254i()
                if (r13 != 0) goto L_0x02fc
                int r13 = r7.f1001f
                if (r10 != r13) goto L_0x02f6
                if (r19 != 0) goto L_0x0300
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r11 = r1.f1062c
                r11.remove(r3)
                goto L_0x0300
            L_0x02f6:
                if (r19 != 0) goto L_0x02fc
                r1.mo1376g(r3)
                goto L_0x02ff
            L_0x02fc:
                int r3 = r3 + -1
                goto L_0x02d4
            L_0x02ff:
                r7 = r4
            L_0x0300:
                if (r7 == 0) goto L_0x0305
                r7.f998c = r9
                r2 = 1
            L_0x0305:
                if (r7 != 0) goto L_0x0352
                androidx.recyclerview.widget.RecyclerView$r r3 = r17.mo1373d()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$r$a> r3 = r3.f1054a
                java.lang.Object r3 = r3.get(r10)
                androidx.recyclerview.widget.RecyclerView$r$a r3 = (androidx.recyclerview.widget.RecyclerView.C0169r.C0170a) r3
                if (r3 == 0) goto L_0x033c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r3.f1056a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x033c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r3.f1056a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x0324:
                if (r7 < 0) goto L_0x033c
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r6 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r6
                boolean r6 = r6.mo1254i()
                if (r6 != 0) goto L_0x0339
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r3 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r3
                goto L_0x033d
            L_0x0339:
                int r7 = r7 + -1
                goto L_0x0324
            L_0x033c:
                r3 = r4
            L_0x033d:
                if (r3 == 0) goto L_0x0351
                r3.mo1263r()
                boolean r6 = androidx.recyclerview.widget.RecyclerView.f921z0
                if (r6 == 0) goto L_0x0351
                android.view.View r6 = r3.f996a
                boolean r7 = r6 instanceof android.view.ViewGroup
                if (r7 == 0) goto L_0x0351
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                r1.mo1374e(r6, r5)
            L_0x0351:
                r7 = r3
            L_0x0352:
                if (r7 != 0) goto L_0x0402
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
                if (r3 == 0) goto L_0x037d
                androidx.recyclerview.widget.RecyclerView$r r3 = r1.f1066g
                androidx.recyclerview.widget.RecyclerView$r$a r3 = r3.mo1368a(r10)
                long r11 = r3.f1058c
                r13 = 0
                int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r3 == 0) goto L_0x0379
                long r11 = r11 + r6
                int r3 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
                if (r3 >= 0) goto L_0x0377
                goto L_0x0379
            L_0x0377:
                r3 = 0
                goto L_0x037a
            L_0x0379:
                r3 = 1
            L_0x037a:
                if (r3 != 0) goto L_0x037d
                return r4
            L_0x037d:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r4 = r3.f968m
                r4.getClass()
                java.lang.String r9 = "RV CreateView"
                p000.C0559h7.m1850a(r9)     // Catch:{ all -> 0x03cc }
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r4.mo1277e(r3, r10)     // Catch:{ all -> 0x03cc }
                android.view.View r4 = r3.f996a     // Catch:{ all -> 0x03cc }
                android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x03cc }
                if (r4 != 0) goto L_0x03c4
                r3.f1001f = r10     // Catch:{ all -> 0x03cc }
                p000.C0559h7.m1851b()
                boolean r4 = androidx.recyclerview.widget.RecyclerView.f915C0
                if (r4 == 0) goto L_0x03ad
                android.view.View r4 = r3.f996a
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.m599F(r4)
                if (r4 == 0) goto L_0x03ad
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r4)
                r3.f997b = r9
            L_0x03ad:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                long r11 = r4.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r4 = r1.f1066g
                long r11 = r11 - r6
                androidx.recyclerview.widget.RecyclerView$r$a r6 = r4.mo1368a(r10)
                long r9 = r6.f1058c
                long r9 = r4.mo1369b(r9, r11)
                r6.f1058c = r9
                r7 = r3
                goto L_0x0402
            L_0x03c4:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03cc }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03cc }
                throw r0     // Catch:{ all -> 0x03cc }
            L_0x03cc:
                r0 = move-exception
                p000.C0559h7.m1851b()
                throw r0
            L_0x03d1:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r9)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r0 = r0.f959h0
                int r0 = r0.mo1394b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p000.C0279ch.m1116m(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x0402:
                if (r2 == 0) goto L_0x0432
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f959h0
                boolean r3 = r3.f1091g
                if (r3 != 0) goto L_0x0432
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r4 = r7.mo1253h(r3)
                if (r4 == 0) goto L_0x0432
                r7.mo1264s(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f959h0
                boolean r3 = r3.f1094j
                if (r3 == 0) goto L_0x0432
                androidx.recyclerview.widget.RecyclerView.C0154j.m704b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r3 = r3.f934M
                r7.mo1252g()
                androidx.recyclerview.widget.RecyclerView$j$c r3 = r3.mo1292h(r7)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.mo1136d0(r7, r3)
            L_0x0432:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f959h0
                boolean r3 = r3.f1091g
                if (r3 == 0) goto L_0x0443
                boolean r3 = r7.mo1255j()
                if (r3 == 0) goto L_0x0443
                r7.f1002g = r0
                goto L_0x048d
            L_0x0443:
                boolean r3 = r7.mo1255j()
                if (r3 == 0) goto L_0x0459
                int r3 = r7.f1005j
                r3 = r3 & r8
                if (r3 == 0) goto L_0x0450
                r3 = 1
                goto L_0x0451
            L_0x0450:
                r3 = 0
            L_0x0451:
                if (r3 != 0) goto L_0x0459
                boolean r3 = r7.mo1256k()
                if (r3 == 0) goto L_0x048d
            L_0x0459:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                vc r3 = r3.f952e
                int r3 = r3.mo4889f(r0, r5)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r7.f1013r = r4
                int r6 = r7.f1001f
                long r8 = r4.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x0490
                androidx.recyclerview.widget.RecyclerView$r r4 = r1.f1066g
                androidx.recyclerview.widget.RecyclerView$r$a r4 = r4.mo1368a(r6)
                long r10 = r4.f1059d
                r12 = 0
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 == 0) goto L_0x048a
                long r10 = r10 + r8
                int r4 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
                if (r4 >= 0) goto L_0x0488
                goto L_0x048a
            L_0x0488:
                r4 = 0
                goto L_0x048b
            L_0x048a:
                r4 = 1
            L_0x048b:
                if (r4 != 0) goto L_0x0490
            L_0x048d:
                r0 = 0
                goto L_0x0537
            L_0x0490:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r4 = r4.f968m
                r4.getClass()
                r7.f998c = r3
                boolean r6 = r4.f1017b
                if (r6 == 0) goto L_0x04a3
                long r10 = r4.mo1274b(r3)
                r7.f1000e = r10
            L_0x04a3:
                r6 = 519(0x207, float:7.27E-43)
                r10 = 1
                r7.mo1264s(r10, r6)
                java.lang.String r6 = "RV OnBindView"
                p000.C0559h7.m1850a(r6)
                r7.mo1252g()
                r4.mo1276d(r7, r3)
                java.util.List<java.lang.Object> r3 = r7.f1006k
                if (r3 == 0) goto L_0x04bb
                r3.clear()
            L_0x04bb:
                int r3 = r7.f1005j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f1005j = r3
                android.view.View r3 = r7.f996a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView.C0165n
                if (r4 == 0) goto L_0x04d0
                androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.C0165n) r3
                r4 = 1
                r3.f1052c = r4
            L_0x04d0:
                p000.C0559h7.m1851b()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r3 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r6 = r1.f1066g
                int r10 = r7.f1001f
                long r3 = r3 - r8
                androidx.recyclerview.widget.RecyclerView$r$a r8 = r6.mo1368a(r10)
                long r9 = r8.f1059d
                long r3 = r6.mo1369b(r9, r3)
                r8.f1059d = r3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.f924C
                if (r3 == 0) goto L_0x04f8
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x04f8
                r3 = 1
                goto L_0x04f9
            L_0x04f8:
                r3 = 0
            L_0x04f9:
                if (r3 == 0) goto L_0x052c
                android.view.View r3 = r7.f996a
                int r4 = p000.C0813m8.m2477k(r3)
                r6 = 1
                if (r4 != 0) goto L_0x0507
                p000.C0813m8.m2462K(r3, r6)
            L_0x0507:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                rd r4 = r4.f973o0
                if (r4 != 0) goto L_0x050e
                goto L_0x052c
            L_0x050e:
                z7 r4 = r4.mo4077j()
                boolean r6 = r4 instanceof p000.C1057rd.C1058a
                if (r6 == 0) goto L_0x0529
                r6 = r4
                rd$a r6 = (p000.C1057rd.C1058a) r6
                r6.getClass()
                z7 r8 = p000.C0813m8.m2471e(r3)
                if (r8 == 0) goto L_0x0529
                if (r8 == r6) goto L_0x0529
                java.util.Map<android.view.View, z7> r6 = r6.f3953e
                r6.put(r3, r8)
            L_0x0529:
                p000.C0813m8.m2457F(r3, r4)
            L_0x052c:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f959h0
                boolean r3 = r3.f1091g
                if (r3 == 0) goto L_0x0536
                r7.f1002g = r0
            L_0x0536:
                r0 = 1
            L_0x0537:
                android.view.View r3 = r7.f996a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 != 0) goto L_0x0546
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
                goto L_0x0554
            L_0x0546:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                boolean r4 = r4.checkLayoutParams(r3)
                if (r4 != 0) goto L_0x055c
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
            L_0x0554:
                androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.C0165n) r3
                android.view.View r4 = r7.f996a
                r4.setLayoutParams(r3)
                goto L_0x055e
            L_0x055c:
                androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.C0165n) r3
            L_0x055e:
                r3.f1050a = r7
                if (r2 == 0) goto L_0x0565
                if (r0 == 0) goto L_0x0565
                r5 = 1
            L_0x0565:
                r3.f1053d = r5
                return r7
            L_0x0568:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r0 = r0.f959h0
                int r0 = r0.mo1394b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p000.C0279ch.m1116m(r0, r3)
                r2.<init>(r0)
                goto L_0x059a
            L_0x0599:
                throw r2
            L_0x059a:
                goto L_0x0599
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0171s.mo1380k(int, boolean, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        /* renamed from: l */
        public void mo1381l(C0145a0 a0Var) {
            (a0Var.f1010o ? this.f1061b : this.f1060a).remove(a0Var);
            a0Var.f1009n = null;
            a0Var.f1010o = false;
            a0Var.mo1249d();
        }

        /* renamed from: m */
        public void mo1382m() {
            C0160m mVar = RecyclerView.this.f970n;
            this.f1065f = this.f1064e + (mVar != null ? mVar.f1038l : 0);
            for (int size = this.f1062c.size() - 1; size >= 0 && this.f1062c.size() > this.f1065f; size--) {
                mo1376g(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public interface C0172t {
        /* renamed from: a */
        void mo1383a(C0145a0 a0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public class C0173u extends C0151g {
        public C0173u() {
        }

        /* renamed from: a */
        public void mo1282a() {
            RecyclerView.this.mo1175i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f959h0.f1090f = true;
            recyclerView.mo1128c0(true);
            if (!RecyclerView.this.f952e.mo4890g()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: b */
        public void mo1283b(int i, int i2, Object obj) {
            RecyclerView.this.mo1175i((String) null);
            C1254vc vcVar = RecyclerView.this.f952e;
            vcVar.getClass();
            boolean z = false;
            if (i2 >= 1) {
                vcVar.f4802b.add(vcVar.mo4891h(4, i, i2, obj));
                vcVar.f4806f |= 4;
                if (vcVar.f4802b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                mo1384c();
            }
        }

        /* renamed from: c */
        public void mo1384c() {
            if (RecyclerView.f914B0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f982t && recyclerView.f980s) {
                    C0813m8.m2491y(recyclerView, recyclerView.f960i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f923B = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C0174v extends C0718k9 {
        public static final Parcelable.Creator<C0174v> CREATOR = new C0175a();

        /* renamed from: d */
        public Parcelable f1069d;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class C0175a implements Parcelable.ClassLoaderCreator<C0174v> {
            public Object createFromParcel(Parcel parcel) {
                return new C0174v(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0174v[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0174v(parcel, classLoader);
            }
        }

        public C0174v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1069d = parcel.readParcelable(classLoader == null ? C0160m.class.getClassLoader() : classLoader);
        }

        public C0174v(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            parcel.writeParcelable(this.f1069d, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static abstract class C0176w {

        /* renamed from: a */
        public int f1070a = -1;

        /* renamed from: b */
        public RecyclerView f1071b;

        /* renamed from: c */
        public C0160m f1072c;

        /* renamed from: d */
        public boolean f1073d;

        /* renamed from: e */
        public boolean f1074e;

        /* renamed from: f */
        public View f1075f;

        /* renamed from: g */
        public final C0177a f1076g = new C0177a(0, 0);

        /* renamed from: h */
        public boolean f1077h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public static class C0177a {

            /* renamed from: a */
            public int f1078a;

            /* renamed from: b */
            public int f1079b;

            /* renamed from: c */
            public int f1080c;

            /* renamed from: d */
            public int f1081d = -1;

            /* renamed from: e */
            public Interpolator f1082e;

            /* renamed from: f */
            public boolean f1083f = false;

            /* renamed from: g */
            public int f1084g = 0;

            public C0177a(int i, int i2) {
                this.f1078a = i;
                this.f1079b = i2;
                this.f1080c = Integer.MIN_VALUE;
                this.f1082e = null;
            }

            /* renamed from: a */
            public void mo1391a(RecyclerView recyclerView) {
                int i = this.f1081d;
                if (i >= 0) {
                    this.f1081d = -1;
                    recyclerView.mo1115Q(i);
                    this.f1083f = false;
                } else if (this.f1083f) {
                    Interpolator interpolator = this.f1082e;
                    if (interpolator == null || this.f1080c >= 1) {
                        int i2 = this.f1080c;
                        if (i2 >= 1) {
                            recyclerView.f953e0.mo1397b(this.f1078a, this.f1079b, i2, interpolator);
                            this.f1084g++;
                            this.f1083f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f1084g = 0;
                }
            }

            /* renamed from: b */
            public void mo1392b(int i, int i2, int i3, Interpolator interpolator) {
                this.f1078a = i;
                this.f1079b = i2;
                this.f1080c = i3;
                this.f1082e = interpolator;
                this.f1083f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$b */
        public interface C0178b {
            /* renamed from: a */
            PointF mo1052a(int i);
        }

        /* renamed from: a */
        public void mo1388a(int i, int i2) {
            C0160m mVar;
            RecyclerView recyclerView = this.f1071b;
            int i3 = -1;
            if (this.f1070a == -1 || recyclerView == null) {
                mo1390c();
            }
            PointF pointF = null;
            if (this.f1073d && this.f1075f == null && (mVar = this.f1072c) != null) {
                PointF a = mVar instanceof C0178b ? ((C0178b) mVar).mo1052a(this.f1070a) : null;
                if (a != null) {
                    float f = a.x;
                    if (!(f == 0.0f && a.y == 0.0f)) {
                        recyclerView.mo1176i0((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                    }
                }
            }
            boolean z = false;
            this.f1073d = false;
            View view = this.f1075f;
            if (view != null) {
                this.f1071b.getClass();
                C0145a0 K = RecyclerView.m600K(view);
                if (K != null) {
                    i3 = K.mo1251f();
                }
                if (i3 == this.f1070a) {
                    mo1389b(this.f1075f, recyclerView.f959h0, this.f1076g);
                    this.f1076g.mo1391a(recyclerView);
                    mo1390c();
                } else {
                    this.f1075f = null;
                }
            }
            if (this.f1074e) {
                C0179x xVar = recyclerView.f959h0;
                C0177a aVar = this.f1076g;
                C0676jd jdVar = (C0676jd) this;
                if (jdVar.f1071b.f970n.mo1354y() == 0) {
                    jdVar.mo1390c();
                } else {
                    int i4 = jdVar.f2872o;
                    int i5 = i4 - i;
                    if (i4 * i5 <= 0) {
                        i5 = 0;
                    }
                    jdVar.f2872o = i5;
                    int i6 = jdVar.f2873p;
                    int i7 = i6 - i2;
                    if (i6 * i7 <= 0) {
                        i7 = 0;
                    }
                    jdVar.f2873p = i7;
                    if (i5 == 0 && i7 == 0) {
                        int i8 = jdVar.f1070a;
                        C0160m mVar2 = jdVar.f1072c;
                        if (mVar2 instanceof C0178b) {
                            pointF = ((C0178b) mVar2).mo1052a(i8);
                        }
                        if (pointF != null) {
                            float f2 = pointF.x;
                            if (!(f2 == 0.0f && pointF.y == 0.0f)) {
                                float f3 = pointF.y;
                                float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
                                float f4 = pointF.x / sqrt;
                                pointF.x = f4;
                                float f5 = pointF.y / sqrt;
                                pointF.y = f5;
                                jdVar.f2868k = pointF;
                                jdVar.f2872o = (int) (f4 * 10000.0f);
                                jdVar.f2873p = (int) (f5 * 10000.0f);
                                aVar.mo1392b((int) (((float) jdVar.f2872o) * 1.2f), (int) (((float) jdVar.f2873p) * 1.2f), (int) (((float) jdVar.mo3431f(10000)) * 1.2f), jdVar.f2866i);
                            }
                        }
                        aVar.f1081d = jdVar.f1070a;
                        jdVar.mo1390c();
                    }
                }
                C0177a aVar2 = this.f1076g;
                if (aVar2.f1081d >= 0) {
                    z = true;
                }
                aVar2.mo1391a(recyclerView);
                if (z && this.f1074e) {
                    this.f1073d = true;
                    recyclerView.f953e0.mo1396a();
                }
            }
        }

        /* renamed from: b */
        public abstract void mo1389b(View view, C0179x xVar, C0177a aVar);

        /* renamed from: c */
        public final void mo1390c() {
            if (this.f1074e) {
                this.f1074e = false;
                C0676jd jdVar = (C0676jd) this;
                jdVar.f2873p = 0;
                jdVar.f2872o = 0;
                jdVar.f2868k = null;
                this.f1071b.f959h0.f1085a = -1;
                this.f1075f = null;
                this.f1070a = -1;
                this.f1073d = false;
                C0160m mVar = this.f1072c;
                if (mVar.f1033g == this) {
                    mVar.f1033g = null;
                }
                this.f1072c = null;
                this.f1071b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static class C0179x {

        /* renamed from: a */
        public int f1085a = -1;

        /* renamed from: b */
        public int f1086b = 0;

        /* renamed from: c */
        public int f1087c = 0;

        /* renamed from: d */
        public int f1088d = 1;

        /* renamed from: e */
        public int f1089e = 0;

        /* renamed from: f */
        public boolean f1090f = false;

        /* renamed from: g */
        public boolean f1091g = false;

        /* renamed from: h */
        public boolean f1092h = false;

        /* renamed from: i */
        public boolean f1093i = false;

        /* renamed from: j */
        public boolean f1094j = false;

        /* renamed from: k */
        public boolean f1095k = false;

        /* renamed from: l */
        public int f1096l;

        /* renamed from: m */
        public long f1097m;

        /* renamed from: n */
        public int f1098n;

        /* renamed from: a */
        public void mo1393a(int i) {
            if ((this.f1088d & i) == 0) {
                StringBuilder c = C0279ch.m1106c("Layout state should be one of ");
                c.append(Integer.toBinaryString(i));
                c.append(" but it is ");
                c.append(Integer.toBinaryString(this.f1088d));
                throw new IllegalStateException(c.toString());
            }
        }

        /* renamed from: b */
        public int mo1394b() {
            return this.f1091g ? this.f1086b - this.f1087c : this.f1089e;
        }

        public String toString() {
            StringBuilder c = C0279ch.m1106c("State{mTargetPosition=");
            c.append(this.f1085a);
            c.append(", mData=");
            c.append((Object) null);
            c.append(", mItemCount=");
            c.append(this.f1089e);
            c.append(", mIsMeasuring=");
            c.append(this.f1093i);
            c.append(", mPreviousLayoutItemCount=");
            c.append(this.f1086b);
            c.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            c.append(this.f1087c);
            c.append(", mStructureChanged=");
            c.append(this.f1090f);
            c.append(", mInPreLayout=");
            c.append(this.f1091g);
            c.append(", mRunSimpleAnimations=");
            c.append(this.f1094j);
            c.append(", mRunPredictiveAnimations=");
            c.append(this.f1095k);
            c.append('}');
            return c.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class C0180y {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public class C0181z implements Runnable {

        /* renamed from: b */
        public int f1099b;

        /* renamed from: c */
        public int f1100c;

        /* renamed from: d */
        public OverScroller f1101d;

        /* renamed from: e */
        public Interpolator f1102e;

        /* renamed from: f */
        public boolean f1103f = false;

        /* renamed from: g */
        public boolean f1104g = false;

        public C0181z() {
            Interpolator interpolator = RecyclerView.f919G0;
            this.f1102e = interpolator;
            this.f1101d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public void mo1396a() {
            if (this.f1103f) {
                this.f1104g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C0813m8.m2491y(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void mo1397b(int i, int i2, int i3, Interpolator interpolator) {
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i * i)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i5 = width / 2;
                float f = (float) width;
                float f2 = (float) i5;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, 2000);
            }
            int i6 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f919G0;
            }
            if (this.f1102e != interpolator) {
                this.f1102e = interpolator;
                this.f1101d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1100c = 0;
            this.f1099b = 0;
            RecyclerView.this.setScrollState(2);
            this.f1101d.startScroll(0, 0, i, i2, i6);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1101d.computeScrollOffset();
            }
            mo1396a();
        }

        /* renamed from: c */
        public void mo1398c() {
            RecyclerView.this.removeCallbacks(this);
            this.f1101d.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f970n == null) {
                mo1398c();
                return;
            }
            this.f1104g = false;
            this.f1103f = true;
            recyclerView.mo1186n();
            OverScroller overScroller = this.f1101d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f1099b;
                int i4 = currY - this.f1100c;
                this.f1099b = currX;
                this.f1100c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f985u0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo1238t(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f985u0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo1184m(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f968m != null) {
                    int[] iArr3 = recyclerView3.f985u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo1176i0(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f985u0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0176w wVar = recyclerView4.f970n.f1033g;
                    if (wVar != null && !wVar.f1073d && wVar.f1074e) {
                        int b = recyclerView4.f959h0.mo1394b();
                        if (b == 0) {
                            wVar.mo1390c();
                        } else {
                            if (wVar.f1070a >= b) {
                                wVar.f1070a = b - 1;
                            }
                            wVar.mo1388a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f974p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f985u0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo1239u(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f985u0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo1240v(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                C0176w wVar2 = recyclerView7.f970n.f1033g;
                if ((wVar2 != null && wVar2.f1073d) || !z) {
                    mo1396a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    C0568hd hdVar = recyclerView8.f955f0;
                    if (hdVar != null) {
                        hdVar.mo3072a(recyclerView8, i, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        recyclerView9.getClass();
                        if (i7 < 0) {
                            recyclerView9.mo1242x();
                            if (recyclerView9.f930I.isFinished()) {
                                recyclerView9.f930I.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView9.mo1243y();
                            if (recyclerView9.f932K.isFinished()) {
                                recyclerView9.f932K.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.mo1244z();
                            if (recyclerView9.f931J.isFinished()) {
                                recyclerView9.f931J.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.mo1241w();
                            if (recyclerView9.f933L.isFinished()) {
                                recyclerView9.f933L.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i7 == 0 && currVelocity == 0)) {
                            Field field = C0813m8.f3234a;
                            if (Build.VERSION.SDK_INT >= 16) {
                                recyclerView9.postInvalidateOnAnimation();
                            } else {
                                recyclerView9.postInvalidate();
                            }
                        }
                    }
                    if (RecyclerView.f915C0) {
                        C0568hd.C0570b bVar = RecyclerView.this.f957g0;
                        int[] iArr7 = bVar.f2462c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f2463d = 0;
                    }
                }
            }
            C0176w wVar3 = RecyclerView.this.f970n.f1033g;
            if (wVar3 != null && wVar3.f1073d) {
                wVar3.mo1388a(0, 0);
            }
            this.f1103f = false;
            if (this.f1104g) {
                RecyclerView.this.removeCallbacks(this);
                C0813m8.m2491y(RecyclerView.this, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo1203p0(1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f920y0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            f921z0 = r2
            r2 = 23
            if (r1 < r2) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            f913A0 = r2
            r2 = 16
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            f914B0 = r2
            r2 = 21
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            f915C0 = r2
            r2 = 15
            if (r1 > r2) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            f916D0 = r4
            if (r1 > r2) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            f917E0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f918F0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f919G0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        char c;
        StringBuilder sb;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        this.f946b = new C0173u();
        this.f948c = new C0171s();
        this.f956g = new C1306wd();
        this.f960i = new C0144a();
        this.f962j = new Rect();
        this.f964k = new Rect();
        this.f966l = new RectF();
        this.f974p = new ArrayList<>();
        this.f976q = new ArrayList<>();
        this.f988w = 0;
        this.f925D = false;
        this.f926E = false;
        this.f927F = 0;
        this.f928G = 0;
        this.f929H = new C0153i();
        this.f934M = new C0465fd();
        this.f935N = 0;
        this.f936O = -1;
        this.f947b0 = Float.MIN_VALUE;
        this.f949c0 = Float.MIN_VALUE;
        boolean z = true;
        this.f951d0 = true;
        this.f953e0 = new C0181z();
        this.f957g0 = f915C0 ? new C0568hd.C0570b() : null;
        this.f959h0 = new C0179x();
        this.f965k0 = false;
        this.f967l0 = false;
        this.f969m0 = new C0158k();
        this.f971n0 = false;
        this.f977q0 = new int[2];
        this.f981s0 = new int[2];
        this.f983t0 = new int[2];
        this.f985u0 = new int[2];
        this.f987v0 = new ArrayList();
        this.f989w0 = new C0146b();
        this.f991x0 = new C0148d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f942U = viewConfiguration.getScaledTouchSlop();
        Method method = C1007q8.f3781a;
        int i4 = Build.VERSION.SDK_INT;
        this.f947b0 = i4 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : C1007q8.m2914a(viewConfiguration, context2);
        this.f949c0 = i4 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : C1007q8.m2914a(viewConfiguration, context2);
        this.f944W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f945a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f934M.f1018a = this.f969m0;
        this.f952e = new C1254vc(new C1015qd(this));
        this.f954f = new C1303wc(new C0972pd(this));
        Field field = C0813m8.f3234a;
        if ((i4 >= 26 ? getImportantForAutofill() : 0) == 0 && i4 >= 26) {
            setImportantForAutofill(8);
        }
        if (C0813m8.m2477k(this) == 0) {
            C0813m8.m2462K(this, 1);
        }
        this.f924C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1057rd(this));
        int[] iArr = C1206uc.f4616a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i3, 0);
        if (i4 >= 29) {
            i2 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        } else {
            i2 = 8;
        }
        String string = obtainStyledAttributes.getString(i2);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f958h = obtainStyledAttributes.getBoolean(1, true);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        this.f984u = z2;
        if (z2) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(C0279ch.m1116m(this, C0279ch.m1106c("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c = 2;
            new C0528gd(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        } else {
            c = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0160m.class);
                    try {
                        constructor = asSubclass.getConstructor(f918F0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        noSuchMethodException = e;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0160m) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e7);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            int[] iArr2 = f920y0;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i3, 0);
            if (i5 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: F */
    public static RecyclerView m599F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView F = m599F(viewGroup.getChildAt(i));
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    /* renamed from: K */
    public static C0145a0 m600K(View view) {
        if (view == null) {
            return null;
        }
        return ((C0165n) view.getLayoutParams()).f1050a;
    }

    private C0410e8 getScrollingChildHelper() {
        if (this.f979r0 == null) {
            this.f979r0 = new C0410e8(this);
        }
        return this.f979r0;
    }

    /* renamed from: k */
    public static void m605k(C0145a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.f997b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        a0Var.f997b = null;
                        return;
                    } else if (view != a0Var.f996a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public String mo1101A() {
        StringBuilder c = C0279ch.m1106c(" ");
        c.append(super.toString());
        c.append(", adapter:");
        c.append(this.f968m);
        c.append(", layout:");
        c.append(this.f970n);
        c.append(", context:");
        c.append(getContext());
        return c.toString();
    }

    /* renamed from: B */
    public final void mo1102B(C0179x xVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f953e0.f1101d;
            overScroller.getFinalX();
            overScroller.getCurrX();
            xVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        xVar.getClass();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1103C(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo1103C(android.view.View):android.view.View");
    }

    /* renamed from: D */
    public final boolean mo1104D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f976q.size();
        int i = 0;
        while (i < size) {
            C0167p pVar = this.f976q.get(i);
            if (!pVar.mo1364b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f978r = pVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void mo1105E(int[] iArr) {
        int e = this.f954f.mo4984e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            C0145a0 K = m600K(this.f954f.mo4983d(i3));
            if (!K.mo1267u()) {
                int f = K.mo1251f();
                if (f < i) {
                    i = f;
                }
                if (f > i2) {
                    i2 = f;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: G */
    public C0145a0 mo1106G(int i) {
        C0145a0 a0Var = null;
        if (this.f925D) {
            return null;
        }
        int h = this.f954f.mo4987h();
        for (int i2 = 0; i2 < h; i2++) {
            C0145a0 K = m600K(this.f954f.mo4986g(i2));
            if (K != null && !K.mo1258m() && mo1107H(K) == i) {
                if (!this.f954f.mo4990k(K.f996a)) {
                    return K;
                }
                a0Var = K;
            }
        }
        return a0Var;
    }

    /* renamed from: H */
    public int mo1107H(C0145a0 a0Var) {
        if (!a0Var.mo1253h(524) && a0Var.mo1255j()) {
            C1254vc vcVar = this.f952e;
            int i = a0Var.f998c;
            int size = vcVar.f4802b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1254vc.C1256b bVar = vcVar.f4802b.get(i2);
                int i3 = bVar.f4807a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = bVar.f4808b;
                        if (i4 <= i) {
                            int i5 = bVar.f4810d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = bVar.f4808b;
                        if (i6 == i) {
                            i = bVar.f4810d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (bVar.f4810d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (bVar.f4808b <= i) {
                    i += bVar.f4810d;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: I */
    public long mo1108I(C0145a0 a0Var) {
        if (this.f968m.f1017b) {
            return a0Var.f1000e;
        }
        return (long) a0Var.f998c;
    }

    /* renamed from: J */
    public C0145a0 mo1109J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m600K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: L */
    public Rect mo1110L(View view) {
        C0165n nVar = (C0165n) view.getLayoutParams();
        if (!nVar.f1052c) {
            return nVar.f1051b;
        }
        if (this.f959h0.f1091g && (nVar.mo1361b() || nVar.f1050a.mo1256k())) {
            return nVar.f1051b;
        }
        Rect rect = nVar.f1051b;
        rect.set(0, 0, 0, 0);
        int size = this.f974p.size();
        for (int i = 0; i < size; i++) {
            this.f962j.set(0, 0, 0, 0);
            this.f974p.get(i).mo1294d(this.f962j, view, this, this.f959h0);
            int i2 = rect.left;
            Rect rect2 = this.f962j;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f1052c = false;
        return rect;
    }

    /* renamed from: M */
    public boolean mo1111M() {
        return !this.f986v || this.f925D || this.f952e.mo4890g();
    }

    /* renamed from: N */
    public void mo1112N() {
        this.f933L = null;
        this.f931J = null;
        this.f932K = null;
        this.f930I = null;
    }

    /* renamed from: O */
    public void mo1113O() {
        if (this.f974p.size() != 0) {
            C0160m mVar = this.f970n;
            if (mVar != null) {
                mVar.mo1056d("Cannot invalidate item decorations during a scroll or layout");
            }
            mo1116R();
            requestLayout();
        }
    }

    /* renamed from: P */
    public boolean mo1114P() {
        return this.f927F > 0;
    }

    /* renamed from: Q */
    public void mo1115Q(int i) {
        if (this.f970n != null) {
            setScrollState(2);
            this.f970n.mo1047L0(i);
            awakenScrollBars();
        }
    }

    /* renamed from: R */
    public void mo1116R() {
        int h = this.f954f.mo4987h();
        for (int i = 0; i < h; i++) {
            ((C0165n) this.f954f.mo4986g(i).getLayoutParams()).f1052c = true;
        }
        C0171s sVar = this.f948c;
        int size = sVar.f1062c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0165n nVar = (C0165n) sVar.f1062c.get(i2).f996a.getLayoutParams();
            if (nVar != null) {
                nVar.f1052c = true;
            }
        }
    }

    /* renamed from: S */
    public void mo1117S(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.f954f.mo4987h();
        for (int i4 = 0; i4 < h; i4++) {
            C0145a0 K = m600K(this.f954f.mo4986g(i4));
            if (K != null && !K.mo1267u()) {
                int i5 = K.f998c;
                if (i5 >= i3) {
                    K.mo1262q(-i2, z);
                } else if (i5 >= i) {
                    K.mo1247b(8);
                    K.mo1262q(-i2, z);
                    K.f998c = i - 1;
                }
                this.f959h0.f1090f = true;
            }
        }
        C0171s sVar = this.f948c;
        int size = sVar.f1062c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0145a0 a0Var = sVar.f1062c.get(size);
                if (a0Var != null) {
                    int i6 = a0Var.f998c;
                    if (i6 >= i3) {
                        a0Var.mo1262q(-i2, z);
                    } else if (i6 >= i) {
                        a0Var.mo1247b(8);
                        sVar.mo1376g(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* renamed from: T */
    public void mo1118T() {
    }

    /* renamed from: U */
    public void mo1119U() {
    }

    /* renamed from: V */
    public void mo1120V() {
        this.f927F++;
    }

    /* renamed from: W */
    public void mo1121W(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f927F - 1;
        this.f927F = i2;
        if (i2 < 1) {
            this.f927F = 0;
            if (z) {
                int i3 = this.f922A;
                this.f922A = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f924C;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        if (Build.VERSION.SDK_INT >= 19) {
                            obtain.setContentChangeTypes(i3);
                        }
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f987v0.size() - 1; size >= 0; size--) {
                    C0145a0 a0Var = this.f987v0.get(size);
                    if (a0Var.f996a.getParent() == this && !a0Var.mo1267u() && (i = a0Var.f1012q) != -1) {
                        C0813m8.m2462K(a0Var.f996a, i);
                        a0Var.f1012q = -1;
                    }
                }
                this.f987v0.clear();
            }
        }
    }

    /* renamed from: X */
    public final void mo1122X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f936O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f936O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f940S = x;
            this.f938Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f941T = y;
            this.f939R = y;
        }
    }

    /* renamed from: Y */
    public void mo1123Y() {
    }

    /* renamed from: Z */
    public void mo1124Z() {
    }

    /* renamed from: a0 */
    public void mo1125a0() {
        if (!this.f971n0 && this.f980s) {
            C0813m8.m2491y(this, this.f989w0);
            this.f971n0 = true;
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0160m mVar = this.f970n;
        if (mVar == null || !mVar.mo1340d0()) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public final void mo1127b0() {
        boolean z;
        boolean z2 = false;
        if (this.f925D) {
            C1254vc vcVar = this.f952e;
            vcVar.mo4895l(vcVar.f4802b);
            vcVar.mo4895l(vcVar.f4803c);
            vcVar.f4806f = 0;
            if (this.f926E) {
                this.f970n.mo1028o0(this);
            }
        }
        if (this.f934M != null && this.f970n.mo1019X0()) {
            this.f952e.mo4893j();
        } else {
            this.f952e.mo4886c();
        }
        boolean z3 = this.f965k0 || this.f967l0;
        C0179x xVar = this.f959h0;
        boolean z4 = this.f986v && this.f934M != null && ((z = this.f925D) || z3 || this.f970n.f1034h) && (!z || this.f968m.f1017b);
        xVar.f1094j = z4;
        if (z4 && z3 && !this.f925D) {
            if (this.f934M != null && this.f970n.mo1019X0()) {
                z2 = true;
            }
        }
        xVar.f1095k = z2;
    }

    /* renamed from: c0 */
    public void mo1128c0(boolean z) {
        this.f926E = z | this.f926E;
        this.f925D = true;
        int h = this.f954f.mo4987h();
        for (int i = 0; i < h; i++) {
            C0145a0 K = m600K(this.f954f.mo4986g(i));
            if (K != null && !K.mo1267u()) {
                K.mo1247b(6);
            }
        }
        mo1116R();
        C0171s sVar = this.f948c;
        int size = sVar.f1062c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0145a0 a0Var = sVar.f1062c.get(i2);
            if (a0Var != null) {
                a0Var.mo1247b(6);
                a0Var.mo1246a((Object) null);
            }
        }
        C0149e eVar = RecyclerView.this.f968m;
        if (eVar == null || !eVar.f1017b) {
            sVar.mo1375f();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0165n) && this.f970n.mo1021g((C0165n) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0160m mVar = this.f970n;
        if (mVar != null && mVar.mo1058e()) {
            return this.f970n.mo1070k(this.f959h0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0160m mVar = this.f970n;
        if (mVar != null && mVar.mo1058e()) {
            return this.f970n.mo1023l(this.f959h0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0160m mVar = this.f970n;
        if (mVar != null && mVar.mo1058e()) {
            return this.f970n.mo1025m(this.f959h0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0160m mVar = this.f970n;
        if (mVar != null && mVar.mo1060f()) {
            return this.f970n.mo1074n(this.f959h0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0160m mVar = this.f970n;
        if (mVar != null && mVar.mo1060f()) {
            return this.f970n.mo1027o(this.f959h0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0160m mVar = this.f970n;
        if (mVar != null && mVar.mo1060f()) {
            return this.f970n.mo1030p(this.f959h0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public void mo1136d0(C0145a0 a0Var, C0154j.C0157c cVar) {
        a0Var.mo1264s(0, 8192);
        if (this.f959h0.f1092h && a0Var.mo1261p() && !a0Var.mo1258m() && !a0Var.mo1267u()) {
            this.f956g.f4951b.mo2929g(mo1108I(a0Var), a0Var);
        }
        this.f956g.mo5004c(a0Var, cVar);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo2708a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo2709b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo2710c(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo2712e(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.f974p.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f974p.get(i).mo1296f(canvas, this, this.f959h0);
        }
        EdgeEffect edgeEffect = this.f930I;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f958h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f930I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f931J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f958h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f931J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f932K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f958h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f932K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f933L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f958h) {
                f2 = (float) (getPaddingRight() + (-getWidth()));
                f = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f2 = (float) (-getWidth());
                f = (float) (-getHeight());
            }
            canvas.translate(f2, f);
            EdgeEffect edgeEffect8 = this.f933L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f934M == null || this.f974p.size() <= 0 || !this.f934M.mo1291g()) {
            z3 = z;
        }
        if (z3) {
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public void mo1146e0() {
        C0154j jVar = this.f934M;
        if (jVar != null) {
            jVar.mo1290f();
        }
        C0160m mVar = this.f970n;
        if (mVar != null) {
            mVar.mo1303D0(this.f948c);
            this.f970n.mo1305E0(this.f948c);
        }
        this.f948c.mo1371b();
    }

    /* renamed from: f */
    public final void mo1147f(C0145a0 a0Var) {
        View view = a0Var.f996a;
        boolean z = view.getParent() == this;
        this.f948c.mo1381l(mo1109J(view));
        if (a0Var.mo1260o()) {
            this.f954f.mo4981b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1303wc wcVar = this.f954f;
        if (!z) {
            wcVar.mo4980a(view, -1, true);
            return;
        }
        int indexOfChild = ((C0972pd) wcVar.f4945a).f3617a.indexOfChild(view);
        if (indexOfChild >= 0) {
            wcVar.f4946b.mo5000h(indexOfChild);
            wcVar.mo4988i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: f0 */
    public final void mo1148f0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f962j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0165n) {
            C0165n nVar = (C0165n) layoutParams;
            if (!nVar.f1052c) {
                Rect rect = nVar.f1051b;
                Rect rect2 = this.f962j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f962j);
            offsetRectIntoDescendantCoords(view, this.f962j);
        }
        this.f970n.mo1313I0(this, view, this.f962j, !this.f986v, view2 == null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0175, code lost:
        if (r3 > 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x018f, code lost:
        if (r6 > 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0192, code lost:
        if (r3 < 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0195, code lost:
        if (r6 < 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x019e, code lost:
        if ((r6 * r1) < 0) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01a7, code lost:
        if ((r6 * r1) > 0) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f970n
            android.view.View r0 = r0.mo1345m0()
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView$e r0 = r13.f968m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f970n
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.mo1114P()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.f992y
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x009f
            if (r15 == r7) goto L_0x0030
            if (r15 != r2) goto L_0x009f
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f970n
            boolean r0 = r0.mo1060f()
            if (r0 == 0) goto L_0x004e
            if (r15 != r7) goto L_0x003d
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003f
        L_0x003d:
            r0 = 33
        L_0x003f:
            android.view.View r8 = r3.findNextFocus(r13, r14, r0)
            if (r8 != 0) goto L_0x0047
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            boolean r9 = f916D0
            if (r9 == 0) goto L_0x004f
            r15 = r0
            goto L_0x004f
        L_0x004e:
            r8 = 0
        L_0x004f:
            if (r8 != 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f970n
            boolean r0 = r0.mo1058e()
            if (r0 == 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f970n
            int r0 = r0.mo1314J()
            if (r0 != r2) goto L_0x0063
            r0 = 1
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r15 != r7) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x006f
            r0 = 66
            goto L_0x0071
        L_0x006f:
            r0 = 17
        L_0x0071:
            android.view.View r8 = r3.findNextFocus(r13, r14, r0)
            if (r8 != 0) goto L_0x0079
            r8 = 1
            goto L_0x007a
        L_0x0079:
            r8 = 0
        L_0x007a:
            boolean r9 = f916D0
            if (r9 == 0) goto L_0x007f
            r15 = r0
        L_0x007f:
            if (r8 == 0) goto L_0x009a
            r13.mo1186n()
            android.view.View r0 = r13.mo1103C(r14)
            if (r0 != 0) goto L_0x008b
            return r6
        L_0x008b:
            r13.mo1185m0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f970n
            androidx.recyclerview.widget.RecyclerView$s r8 = r13.f948c
            androidx.recyclerview.widget.RecyclerView$x r9 = r13.f959h0
            r0.mo1022h0(r14, r15, r8, r9)
            r13.mo1189o0(r1)
        L_0x009a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00c3
        L_0x009f:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00c2
            if (r0 == 0) goto L_0x00c2
            r13.mo1186n()
            android.view.View r0 = r13.mo1103C(r14)
            if (r0 != 0) goto L_0x00b1
            return r6
        L_0x00b1:
            r13.mo1185m0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f970n
            androidx.recyclerview.widget.RecyclerView$s r3 = r13.f948c
            androidx.recyclerview.widget.RecyclerView$x r8 = r13.f959h0
            android.view.View r0 = r0.mo1022h0(r14, r15, r3, r8)
            r13.mo1189o0(r1)
            goto L_0x00c3
        L_0x00c2:
            r0 = r3
        L_0x00c3:
            if (r0 == 0) goto L_0x00da
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00da
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00d6
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00d6:
            r13.mo1148f0(r0, r6)
            return r14
        L_0x00da:
            if (r0 == 0) goto L_0x01ab
            if (r0 != r13) goto L_0x00e0
            goto L_0x01ab
        L_0x00e0:
            android.view.View r3 = r13.mo1103C(r0)
            if (r3 != 0) goto L_0x00e8
            goto L_0x01ac
        L_0x00e8:
            if (r14 != 0) goto L_0x00ec
            goto L_0x01a9
        L_0x00ec:
            android.view.View r3 = r13.mo1103C(r14)
            if (r3 != 0) goto L_0x00f4
            goto L_0x01a9
        L_0x00f4:
            android.graphics.Rect r3 = r13.f962j
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r3 = r13.f964k
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r1 = r13.f962j
            r13.offsetDescendantRectToMyCoords(r14, r1)
            android.graphics.Rect r1 = r13.f964k
            r13.offsetDescendantRectToMyCoords(r0, r1)
            androidx.recyclerview.widget.RecyclerView$m r1 = r13.f970n
            int r1 = r1.mo1314J()
            if (r1 != r2) goto L_0x0122
            r1 = -1
            goto L_0x0123
        L_0x0122:
            r1 = 1
        L_0x0123:
            android.graphics.Rect r3 = r13.f962j
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f964k
            int r9 = r8.left
            if (r6 < r9) goto L_0x0131
            int r10 = r3.right
            if (r10 > r9) goto L_0x0139
        L_0x0131:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x0139
            r6 = 1
            goto L_0x0146
        L_0x0139:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0141
            if (r6 < r11) goto L_0x0145
        L_0x0141:
            if (r6 <= r9) goto L_0x0145
            r6 = -1
            goto L_0x0146
        L_0x0145:
            r6 = 0
        L_0x0146:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x0150
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x0158
        L_0x0150:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x0158
            r3 = 1
            goto L_0x0165
        L_0x0158:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x0160
            if (r9 < r8) goto L_0x0164
        L_0x0160:
            if (r9 <= r10) goto L_0x0164
            r3 = -1
            goto L_0x0165
        L_0x0164:
            r3 = 0
        L_0x0165:
            if (r15 == r2) goto L_0x01a1
            if (r15 == r7) goto L_0x0198
            if (r15 == r5) goto L_0x0195
            if (r15 == r4) goto L_0x0192
            r1 = 66
            if (r15 == r1) goto L_0x018f
            r1 = 130(0x82, float:1.82E-43)
            if (r15 != r1) goto L_0x0178
            if (r3 <= 0) goto L_0x01ab
            goto L_0x01a9
        L_0x0178:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = p000.C0279ch.m1116m(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x018f:
            if (r6 <= 0) goto L_0x01ab
            goto L_0x01a9
        L_0x0192:
            if (r3 >= 0) goto L_0x01ab
            goto L_0x01a9
        L_0x0195:
            if (r6 >= 0) goto L_0x01ab
            goto L_0x01a9
        L_0x0198:
            if (r3 > 0) goto L_0x01a9
            if (r3 != 0) goto L_0x01ab
            int r6 = r6 * r1
            if (r6 < 0) goto L_0x01ab
            goto L_0x01a9
        L_0x01a1:
            if (r3 < 0) goto L_0x01a9
            if (r3 != 0) goto L_0x01ab
            int r6 = r6 * r1
            if (r6 > 0) goto L_0x01ab
        L_0x01a9:
            r1 = 1
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            if (r1 == 0) goto L_0x01af
            goto L_0x01b3
        L_0x01af:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x01b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public void mo1150g(C0159l lVar) {
        C0160m mVar = this.f970n;
        if (mVar != null) {
            mVar.mo1056d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f974p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f974p.add(lVar);
        mo1116R();
        requestLayout();
    }

    /* renamed from: g0 */
    public final void mo1151g0() {
        VelocityTracker velocityTracker = this.f937P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        mo1203p0(0);
        EdgeEffect edgeEffect = this.f930I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f930I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f931J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f931J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f932K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f932K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f933L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f933L.isFinished();
        }
        if (z) {
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0160m mVar = this.f970n;
        if (mVar != null) {
            return mVar.mo1035u();
        }
        throw new IllegalStateException(C0279ch.m1116m(this, C0279ch.m1106c("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0160m mVar = this.f970n;
        if (mVar != null) {
            return mVar.mo1038v(getContext(), attributeSet);
        }
        throw new IllegalStateException(C0279ch.m1116m(this, C0279ch.m1106c("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0160m mVar = this.f970n;
        if (mVar != null) {
            return mVar.mo1040w(layoutParams);
        }
        throw new IllegalStateException(C0279ch.m1116m(this, C0279ch.m1106c("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0149e getAdapter() {
        return this.f968m;
    }

    public int getBaseline() {
        C0160m mVar = this.f970n;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    public int getChildDrawingOrder(int i, int i2) {
        C0152h hVar = this.f975p0;
        return hVar == null ? super.getChildDrawingOrder(i, i2) : hVar.mo1284a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f958h;
    }

    public C1057rd getCompatAccessibilityDelegate() {
        return this.f973o0;
    }

    public C0153i getEdgeEffectFactory() {
        return this.f929H;
    }

    public C0154j getItemAnimator() {
        return this.f934M;
    }

    public int getItemDecorationCount() {
        return this.f974p.size();
    }

    public C0160m getLayoutManager() {
        return this.f970n;
    }

    public int getMaxFlingVelocity() {
        return this.f945a0;
    }

    public int getMinFlingVelocity() {
        return this.f944W;
    }

    public long getNanoTime() {
        if (f915C0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0166o getOnFlingListener() {
        return this.f943V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f951d0;
    }

    public C0169r getRecycledViewPool() {
        return this.f948c.mo1373d();
    }

    public int getScrollState() {
        return this.f935N;
    }

    /* renamed from: h */
    public void mo1172h(C0168q qVar) {
        if (this.f963j0 == null) {
            this.f963j0 = new ArrayList();
        }
        this.f963j0.add(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1173h0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            r17.mo1186n()
            androidx.recyclerview.widget.RecyclerView$e r0 = r8.f968m
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0028
            int[] r0 = r8.f985u0
            r0[r12] = r12
            r0[r11] = r12
            r8.mo1176i0(r9, r10, r0)
            int[] r0 = r8.f985u0
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
            goto L_0x002d
        L_0x0028:
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r0 = r8.f974p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r17.invalidate()
        L_0x0038:
            int[] r7 = r8.f985u0
            r7[r12] = r12
            r7[r11] = r12
            int[] r5 = r8.f981s0
            r6 = 0
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r15
            r4 = r16
            r0.mo1239u(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f985u0
            r1 = r0[r12]
            int r15 = r15 - r1
            r1 = r0[r11]
            int r1 = r16 - r1
            r2 = r0[r12]
            if (r2 != 0) goto L_0x005f
            r0 = r0[r11]
            if (r0 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r0 = 0
            goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            int r2 = r8.f940S
            int[] r3 = r8.f981s0
            r4 = r3[r12]
            int r2 = r2 - r4
            r8.f940S = r2
            int r2 = r8.f941T
            r4 = r3[r11]
            int r2 = r2 - r4
            r8.f941T = r2
            int[] r2 = r8.f983t0
            r4 = r2[r12]
            r5 = r3[r12]
            int r4 = r4 + r5
            r2[r12] = r4
            r4 = r2[r11]
            r3 = r3[r11]
            int r4 = r4 + r3
            r2[r11] = r4
            int r2 = r17.getOverScrollMode()
            r3 = 2
            if (r2 == r3) goto L_0x012a
            if (r20 == 0) goto L_0x0127
            r2 = 8194(0x2002, float:1.1482E-41)
            int r3 = r20.getSource()
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0094
            r2 = 1
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            if (r2 != 0) goto L_0x0127
            float r2 = r20.getX()
            float r3 = (float) r15
            float r4 = r20.getY()
            float r1 = (float) r1
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00bd
            r17.mo1242x()
            android.widget.EdgeEffect r7 = r8.f930I
            float r15 = -r3
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r15 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
            float r4 = r5 - r4
            goto L_0x00d3
        L_0x00bd:
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            r17.mo1243y()
            android.widget.EdgeEffect r7 = r8.f932K
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r3 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
        L_0x00d3:
            p000.C1344x5.m3731M(r7, r15, r4)
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f3
            r17.mo1244z()
            android.widget.EdgeEffect r4 = r8.f931J
            float r5 = -r1
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r5 = r5 / r7
            int r7 = r17.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            p000.C1344x5.m3731M(r4, r5, r2)
            goto L_0x010d
        L_0x00f3:
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x010e
            r17.mo1241w()
            android.widget.EdgeEffect r4 = r8.f933L
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r7 = r1 / r7
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r5 = r5 - r2
            p000.C1344x5.m3731M(r4, r7, r5)
        L_0x010d:
            r4 = 1
        L_0x010e:
            if (r4 != 0) goto L_0x0118
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0118
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0127
        L_0x0118:
            java.lang.reflect.Field r1 = p000.C0813m8.f3234a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x0124
            r17.postInvalidateOnAnimation()
            goto L_0x0127
        L_0x0124:
            r17.postInvalidate()
        L_0x0127:
            r17.mo1184m(r18, r19)
        L_0x012a:
            if (r14 != 0) goto L_0x012e
            if (r13 == 0) goto L_0x0131
        L_0x012e:
            r8.mo1240v(r14, r13)
        L_0x0131:
            boolean r1 = r17.awakenScrollBars()
            if (r1 != 0) goto L_0x013a
            r17.invalidate()
        L_0x013a:
            if (r0 != 0) goto L_0x0143
            if (r14 != 0) goto L_0x0143
            if (r13 == 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r11 = 0
            goto L_0x0144
        L_0x0143:
            r11 = 1
        L_0x0144:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo1173h0(int, int, android.view.MotionEvent):boolean");
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2715h(0);
    }

    /* renamed from: i */
    public void mo1175i(String str) {
        if (mo1114P()) {
            if (str == null) {
                throw new IllegalStateException(C0279ch.m1116m(this, C0279ch.m1106c("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.f928G > 0) {
            new IllegalStateException(C0279ch.m1116m(this, C0279ch.m1106c("")));
        }
    }

    /* renamed from: i0 */
    public void mo1176i0(int i, int i2, int[] iArr) {
        C0145a0 a0Var;
        mo1185m0();
        mo1120V();
        C0559h7.m1850a("RV Scroll");
        mo1102B(this.f959h0);
        int K0 = i != 0 ? this.f970n.mo1009K0(i, this.f948c, this.f959h0) : 0;
        int M0 = i2 != 0 ? this.f970n.mo1012M0(i2, this.f948c, this.f959h0) : 0;
        C0559h7.m1851b();
        int e = this.f954f.mo4984e();
        for (int i3 = 0; i3 < e; i3++) {
            View d = this.f954f.mo4983d(i3);
            C0145a0 J = mo1109J(d);
            if (!(J == null || (a0Var = J.f1004i) == null)) {
                View view = a0Var.f996a;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        mo1121W(true);
        mo1189o0(false);
        if (iArr != null) {
            iArr[0] = K0;
            iArr[1] = M0;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f980s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f992y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1983d;
    }

    /* renamed from: j */
    public final void mo1179j() {
        mo1151g0();
        setScrollState(0);
    }

    /* renamed from: j0 */
    public void mo1180j0(int i) {
        if (!this.f992y) {
            mo1205q0();
            C0160m mVar = this.f970n;
            if (mVar != null) {
                mVar.mo1047L0(i);
                awakenScrollBars();
            }
        }
    }

    /* renamed from: k0 */
    public boolean mo1181k0(C0145a0 a0Var, int i) {
        if (mo1114P()) {
            a0Var.f1012q = i;
            this.f987v0.add(a0Var);
            return false;
        }
        C0813m8.m2462K(a0Var.f996a, i);
        return true;
    }

    /* renamed from: l */
    public void mo1182l() {
        int h = this.f954f.mo4987h();
        for (int i = 0; i < h; i++) {
            C0145a0 K = m600K(this.f954f.mo4986g(i));
            if (!K.mo1267u()) {
                K.mo1248c();
            }
        }
        C0171s sVar = this.f948c;
        int size = sVar.f1062c.size();
        for (int i2 = 0; i2 < size; i2++) {
            sVar.f1062c.get(i2).mo1248c();
        }
        int size2 = sVar.f1060a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sVar.f1060a.get(i3).mo1248c();
        }
        ArrayList<C0145a0> arrayList = sVar.f1061b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                sVar.f1061b.get(i4).mo1248c();
            }
        }
    }

    /* renamed from: l0 */
    public void mo1183l0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0160m mVar = this.f970n;
        if (mVar != null && !this.f992y) {
            int i4 = 0;
            if (!mVar.mo1058e()) {
                i = 0;
            }
            if (!this.f970n.mo1060f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo1187n0(i4, 1);
                    }
                    this.f953e0.mo1397b(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* renamed from: m */
    public void mo1184m(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f930I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f930I.onRelease();
            z = this.f930I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f932K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f932K.onRelease();
            z |= this.f932K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f931J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f931J.onRelease();
            z |= this.f931J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f933L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f933L.onRelease();
            z |= this.f933L.isFinished();
        }
        if (z) {
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    /* renamed from: m0 */
    public void mo1185m0() {
        int i = this.f988w + 1;
        this.f988w = i;
        if (i == 1 && !this.f992y) {
            this.f990x = false;
        }
    }

    /* renamed from: n */
    public void mo1186n() {
        if (!this.f986v || this.f925D) {
            C0559h7.m1850a("RV FullInvalidate");
            mo1204q();
            C0559h7.m1851b();
        } else if (this.f952e.mo4890g()) {
            C1254vc vcVar = this.f952e;
            int i = vcVar.f4806f;
            boolean z = false;
            if ((i & 4) != 0) {
                if (!((i & 11) != 0)) {
                    C0559h7.m1850a("RV PartialInvalidate");
                    mo1185m0();
                    mo1120V();
                    this.f952e.mo4893j();
                    if (!this.f990x) {
                        int e = this.f954f.mo4984e();
                        int i2 = 0;
                        while (true) {
                            if (i2 < e) {
                                C0145a0 K = m600K(this.f954f.mo4983d(i2));
                                if (K != null && !K.mo1267u() && K.mo1261p()) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            mo1204q();
                        } else {
                            this.f952e.mo4885b();
                        }
                    }
                    mo1189o0(true);
                    mo1121W(true);
                    C0559h7.m1851b();
                }
            }
            if (vcVar.mo4890g()) {
                C0559h7.m1850a("RV FullInvalidate");
                mo1204q();
                C0559h7.m1851b();
            }
        }
    }

    /* renamed from: n0 */
    public boolean mo1187n0(int i, int i2) {
        return getScrollingChildHelper().mo2717j(i, i2);
    }

    /* renamed from: o */
    public void mo1188o(int i, int i2) {
        setMeasuredDimension(C0160m.m718h(i, getPaddingRight() + getPaddingLeft(), C0813m8.m2480n(this)), C0160m.m718h(i2, getPaddingBottom() + getPaddingTop(), C0813m8.m2479m(this)));
    }

    /* renamed from: o0 */
    public void mo1189o0(boolean z) {
        if (this.f988w < 1) {
            this.f988w = 1;
        }
        if (!z && !this.f992y) {
            this.f990x = false;
        }
        if (this.f988w == 1) {
            if (z && this.f990x && !this.f992y && this.f970n != null && this.f968m != null) {
                mo1204q();
            }
            if (!this.f992y) {
                this.f990x = false;
            }
        }
        this.f988w--;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f927F = 0;
        this.f980s = true;
        this.f986v = this.f986v && !isLayoutRequested();
        C0160m mVar = this.f970n;
        if (mVar != null) {
            mVar.f1035i = true;
            mVar.mo1341e0();
        }
        this.f971n0 = false;
        if (f915C0) {
            ThreadLocal<C0568hd> threadLocal = C0568hd.f2454f;
            C0568hd hdVar = threadLocal.get();
            this.f955f0 = hdVar;
            if (hdVar == null) {
                this.f955f0 = new C0568hd();
                Field field = C0813m8.f3234a;
                Display display = Build.VERSION.SDK_INT >= 17 ? getDisplay() : C0813m8.m2485s(this) ? ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay() : null;
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C0568hd hdVar2 = this.f955f0;
                hdVar2.f2458d = (long) (1.0E9f / f);
                threadLocal.set(hdVar2);
            }
            this.f955f0.f2456b.add(this);
        }
    }

    public void onDetachedFromWindow() {
        C0568hd hdVar;
        super.onDetachedFromWindow();
        C0154j jVar = this.f934M;
        if (jVar != null) {
            jVar.mo1290f();
        }
        mo1205q0();
        this.f980s = false;
        C0160m mVar = this.f970n;
        if (mVar != null) {
            C0171s sVar = this.f948c;
            mVar.f1035i = false;
            mVar.mo1062g0(this, sVar);
        }
        this.f987v0.clear();
        removeCallbacks(this.f989w0);
        this.f956g.getClass();
        do {
        } while (C1306wd.C1307a.f4952d.mo5053a() != null);
        if (f915C0 && (hdVar = this.f955f0) != null) {
            hdVar.f2456b.remove(this);
            this.f955f0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f974p.size();
        for (int i = 0; i < size; i++) {
            this.f974p.get(i).mo1295e(canvas, this, this.f959h0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f970n != null && !this.f992y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f970n.mo1060f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f970n.mo1058e()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo1173h0((int) (f * this.f947b0), (int) (f2 * this.f949c0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f970n.mo1060f()) {
                        f2 = -axisValue;
                    } else if (this.f970n.mo1058e()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo1173h0((int) (f * this.f947b0), (int) (f2 * this.f949c0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo1173h0((int) (f * this.f947b0), (int) (f2 * this.f949c0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f992y) {
            return false;
        }
        this.f978r = null;
        if (mo1104D(motionEvent)) {
            mo1179j();
            return true;
        }
        C0160m mVar = this.f970n;
        if (mVar == null) {
            return false;
        }
        boolean e = mVar.mo1058e();
        boolean f = this.f970n.mo1060f();
        if (this.f937P == null) {
            this.f937P = VelocityTracker.obtain();
        }
        this.f937P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f993z) {
                this.f993z = false;
            }
            this.f936O = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f940S = x;
            this.f938Q = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f941T = y;
            this.f939R = y;
            if (this.f935N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo1203p0(1);
            }
            int[] iArr = this.f983t0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f) {
                e |= true;
            }
            mo1187n0(e ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f937P.clear();
            mo1203p0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f936O);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f935N != 1) {
                int i = x2 - this.f938Q;
                int i2 = y2 - this.f939R;
                if (!e || Math.abs(i) <= this.f942U) {
                    z = false;
                } else {
                    this.f940S = x2;
                    z = true;
                }
                if (f && Math.abs(i2) > this.f942U) {
                    this.f941T = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo1179j();
        } else if (actionMasked == 5) {
            this.f936O = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f940S = x3;
            this.f938Q = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f941T = y3;
            this.f939R = y3;
        } else if (actionMasked == 6) {
            mo1122X(motionEvent);
        }
        return this.f935N == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0559h7.m1850a("RV OnLayout");
        mo1204q();
        C0559h7.m1851b();
        this.f986v = true;
    }

    public void onMeasure(int i, int i2) {
        C0160m mVar = this.f970n;
        if (mVar == null) {
            mo1188o(i, i2);
            return;
        }
        boolean z = false;
        if (mVar.mo1049V()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f970n.mo1350v0(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f968m != null) {
                if (this.f959h0.f1088d == 1) {
                    mo1206r();
                }
                this.f970n.mo1322O0(i, i2);
                this.f959h0.f1093i = true;
                mo1212s();
                this.f970n.mo1325Q0(i, i2);
                if (this.f970n.mo1048T0()) {
                    this.f970n.mo1322O0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f959h0.f1093i = true;
                    mo1212s();
                    this.f970n.mo1325Q0(i, i2);
                }
            }
        } else if (this.f982t) {
            this.f970n.mo1350v0(i, i2);
        } else {
            if (this.f923B) {
                mo1185m0();
                mo1120V();
                mo1127b0();
                mo1121W(true);
                C0179x xVar = this.f959h0;
                if (xVar.f1095k) {
                    xVar.f1091g = true;
                } else {
                    this.f952e.mo4886c();
                    this.f959h0.f1091g = false;
                }
                this.f923B = false;
                mo1189o0(false);
            } else if (this.f959h0.f1095k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0149e eVar = this.f968m;
            if (eVar != null) {
                this.f959h0.f1089e = eVar.mo1273a();
            } else {
                this.f959h0.f1089e = 0;
            }
            mo1185m0();
            this.f970n.mo1350v0(i, i2);
            mo1189o0(false);
            this.f959h0.f1091g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo1114P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0174v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0174v vVar = (C0174v) parcelable;
        this.f950d = vVar;
        super.onRestoreInstanceState(vVar.f2988b);
        C0160m mVar = this.f970n;
        if (mVar != null && (parcelable2 = this.f950d.f1069d) != null) {
            mVar.mo1084y0(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        C0174v vVar = new C0174v(super.onSaveInstanceState());
        C0174v vVar2 = this.f950d;
        if (vVar2 != null) {
            vVar.f1069d = vVar2.f1069d;
        } else {
            C0160m mVar = this.f970n;
            vVar.f1069d = mVar != null ? mVar.mo1086z0() : null;
        }
        return vVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo1112N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0251, code lost:
        r4 = r14 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02bc, code lost:
        if (r1 == false) goto L_0x02bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            boolean r2 = r0.f992y
            r3 = 0
            if (r2 != 0) goto L_0x0356
            boolean r2 = r0.f993z
            if (r2 == 0) goto L_0x000f
            goto L_0x0356
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$p r2 = r0.f978r
            r4 = 0
            r5 = 3
            r6 = 1
            if (r2 != 0) goto L_0x0023
            int r2 = r29.getAction()
            if (r2 != 0) goto L_0x001e
            r2 = 0
            goto L_0x0031
        L_0x001e:
            boolean r2 = r28.mo1104D(r29)
            goto L_0x0031
        L_0x0023:
            r2.mo1365c(r0, r1)
            int r2 = r29.getAction()
            if (r2 == r5) goto L_0x002e
            if (r2 != r6) goto L_0x0030
        L_0x002e:
            r0.f978r = r4
        L_0x0030:
            r2 = 1
        L_0x0031:
            if (r2 == 0) goto L_0x0037
            r28.mo1179j()
            return r6
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$m r2 = r0.f970n
            if (r2 != 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r2 = r2.mo1058e()
            androidx.recyclerview.widget.RecyclerView$m r7 = r0.f970n
            boolean r7 = r7.mo1060f()
            android.view.VelocityTracker r8 = r0.f937P
            if (r8 != 0) goto L_0x0050
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r0.f937P = r8
        L_0x0050:
            int r8 = r29.getActionMasked()
            int r9 = r29.getActionIndex()
            if (r8 != 0) goto L_0x0060
            int[] r10 = r0.f983t0
            r10[r6] = r3
            r10[r3] = r3
        L_0x0060:
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r29)
            int[] r11 = r0.f983t0
            r12 = r11[r3]
            float r12 = (float) r12
            r11 = r11[r6]
            float r11 = (float) r11
            r10.offsetLocation(r12, r11)
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 == 0) goto L_0x0327
            r12 = 2
            if (r8 == r6) goto L_0x0169
            if (r8 == r12) goto L_0x00a6
            if (r8 == r5) goto L_0x00a2
            r2 = 5
            if (r8 == r2) goto L_0x0087
            r2 = 6
            if (r8 == r2) goto L_0x0083
        L_0x0080:
            r1 = 0
            goto L_0x0349
        L_0x0083:
            r28.mo1122X(r29)
            goto L_0x0080
        L_0x0087:
            int r2 = r1.getPointerId(r9)
            r0.f936O = r2
            float r2 = r1.getX(r9)
            float r2 = r2 + r11
            int r2 = (int) r2
            r0.f940S = r2
            r0.f938Q = r2
            float r1 = r1.getY(r9)
            float r1 = r1 + r11
            int r1 = (int) r1
            r0.f941T = r1
            r0.f939R = r1
            goto L_0x0080
        L_0x00a2:
            r28.mo1179j()
            goto L_0x0080
        L_0x00a6:
            int r4 = r0.f936O
            int r4 = r1.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x00af
            return r3
        L_0x00af:
            float r5 = r1.getX(r4)
            float r5 = r5 + r11
            int r5 = (int) r5
            float r4 = r1.getY(r4)
            float r4 = r4 + r11
            int r4 = (int) r4
            int r8 = r0.f940S
            int r8 = r8 - r5
            int r9 = r0.f941T
            int r9 = r9 - r4
            int r11 = r0.f935N
            if (r11 == r6) goto L_0x00f4
            if (r2 == 0) goto L_0x00da
            int r11 = r0.f942U
            if (r8 <= 0) goto L_0x00d1
            int r8 = r8 - r11
            int r8 = java.lang.Math.max(r3, r8)
            goto L_0x00d6
        L_0x00d1:
            int r8 = r8 + r11
            int r8 = java.lang.Math.min(r3, r8)
        L_0x00d6:
            if (r8 == 0) goto L_0x00da
            r11 = 1
            goto L_0x00db
        L_0x00da:
            r11 = 0
        L_0x00db:
            if (r7 == 0) goto L_0x00ef
            int r12 = r0.f942U
            if (r9 <= 0) goto L_0x00e7
            int r9 = r9 - r12
            int r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ec
        L_0x00e7:
            int r9 = r9 + r12
            int r9 = java.lang.Math.min(r3, r9)
        L_0x00ec:
            if (r9 == 0) goto L_0x00ef
            r11 = 1
        L_0x00ef:
            if (r11 == 0) goto L_0x00f4
            r0.setScrollState(r6)
        L_0x00f4:
            int r11 = r0.f935N
            if (r11 != r6) goto L_0x0080
            int[] r15 = r0.f985u0
            r15[r3] = r3
            r15[r6] = r3
            if (r2 == 0) goto L_0x0102
            r13 = r8
            goto L_0x0103
        L_0x0102:
            r13 = 0
        L_0x0103:
            if (r7 == 0) goto L_0x0107
            r14 = r9
            goto L_0x0108
        L_0x0107:
            r14 = 0
        L_0x0108:
            int[] r11 = r0.f981s0
            r17 = 0
            e8 r12 = r28.getScrollingChildHelper()
            r16 = r11
            boolean r11 = r12.mo2710c(r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0139
            int[] r11 = r0.f985u0
            r12 = r11[r3]
            int r8 = r8 - r12
            r11 = r11[r6]
            int r9 = r9 - r11
            int[] r11 = r0.f983t0
            r12 = r11[r3]
            int[] r13 = r0.f981s0
            r14 = r13[r3]
            int r12 = r12 + r14
            r11[r3] = r12
            r12 = r11[r6]
            r13 = r13[r6]
            int r12 = r12 + r13
            r11[r6] = r12
            android.view.ViewParent r11 = r28.getParent()
            r11.requestDisallowInterceptTouchEvent(r6)
        L_0x0139:
            int[] r11 = r0.f981s0
            r12 = r11[r3]
            int r5 = r5 - r12
            r0.f940S = r5
            r5 = r11[r6]
            int r4 = r4 - r5
            r0.f941T = r4
            if (r2 == 0) goto L_0x0149
            r2 = r8
            goto L_0x014a
        L_0x0149:
            r2 = 0
        L_0x014a:
            if (r7 == 0) goto L_0x014e
            r4 = r9
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r1 = r0.mo1173h0(r2, r4, r1)
            if (r1 == 0) goto L_0x015c
            android.view.ViewParent r1 = r28.getParent()
            r1.requestDisallowInterceptTouchEvent(r6)
        L_0x015c:
            hd r1 = r0.f955f0
            if (r1 == 0) goto L_0x0080
            if (r8 != 0) goto L_0x0164
            if (r9 == 0) goto L_0x0080
        L_0x0164:
            r1.mo3072a(r0, r8, r9)
            goto L_0x0080
        L_0x0169:
            android.view.VelocityTracker r1 = r0.f937P
            r1.addMovement(r10)
            android.view.VelocityTracker r1 = r0.f937P
            r5 = 1000(0x3e8, float:1.401E-42)
            int r8 = r0.f945a0
            float r8 = (float) r8
            r1.computeCurrentVelocity(r5, r8)
            r1 = 0
            if (r2 == 0) goto L_0x0185
            android.view.VelocityTracker r2 = r0.f937P
            int r5 = r0.f936O
            float r2 = r2.getXVelocity(r5)
            float r2 = -r2
            goto L_0x0186
        L_0x0185:
            r2 = 0
        L_0x0186:
            if (r7 == 0) goto L_0x0192
            android.view.VelocityTracker r5 = r0.f937P
            int r7 = r0.f936O
            float r5 = r5.getYVelocity(r7)
            float r5 = -r5
            goto L_0x0193
        L_0x0192:
            r5 = 0
        L_0x0193:
            int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x019b
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x031f
        L_0x019b:
            int r2 = (int) r2
            int r5 = (int) r5
            androidx.recyclerview.widget.RecyclerView$m r7 = r0.f970n
            if (r7 != 0) goto L_0x01a3
            goto L_0x031c
        L_0x01a3:
            boolean r8 = r0.f992y
            if (r8 == 0) goto L_0x01a9
            goto L_0x031c
        L_0x01a9:
            boolean r7 = r7.mo1058e()
            androidx.recyclerview.widget.RecyclerView$m r8 = r0.f970n
            boolean r8 = r8.mo1060f()
            if (r7 == 0) goto L_0x01bd
            int r9 = java.lang.Math.abs(r2)
            int r11 = r0.f944W
            if (r9 >= r11) goto L_0x01be
        L_0x01bd:
            r2 = 0
        L_0x01be:
            if (r8 == 0) goto L_0x01c8
            int r9 = java.lang.Math.abs(r5)
            int r11 = r0.f944W
            if (r9 >= r11) goto L_0x01c9
        L_0x01c8:
            r5 = 0
        L_0x01c9:
            if (r2 != 0) goto L_0x01cf
            if (r5 != 0) goto L_0x01cf
            goto L_0x031c
        L_0x01cf:
            float r9 = (float) r2
            float r11 = (float) r5
            boolean r13 = r0.dispatchNestedPreFling(r9, r11)
            if (r13 != 0) goto L_0x031b
            if (r7 != 0) goto L_0x01de
            if (r8 == 0) goto L_0x01dc
            goto L_0x01de
        L_0x01dc:
            r13 = 0
            goto L_0x01df
        L_0x01de:
            r13 = 1
        L_0x01df:
            r0.dispatchNestedFling(r9, r11, r13)
            androidx.recyclerview.widget.RecyclerView$o r9 = r0.f943V
            if (r9 == 0) goto L_0x02bf
            td r9 = (p000.C1164td) r9
            androidx.recyclerview.widget.RecyclerView r11 = r9.f4428a
            androidx.recyclerview.widget.RecyclerView$m r11 = r11.getLayoutManager()
            if (r11 != 0) goto L_0x01f2
            goto L_0x02bb
        L_0x01f2:
            androidx.recyclerview.widget.RecyclerView r14 = r9.f4428a
            androidx.recyclerview.widget.RecyclerView$e r14 = r14.getAdapter()
            if (r14 != 0) goto L_0x01fc
            goto L_0x02bb
        L_0x01fc:
            androidx.recyclerview.widget.RecyclerView r14 = r9.f4428a
            int r14 = r14.getMinFlingVelocity()
            int r15 = java.lang.Math.abs(r5)
            if (r15 > r14) goto L_0x020e
            int r15 = java.lang.Math.abs(r2)
            if (r15 <= r14) goto L_0x02bb
        L_0x020e:
            boolean r14 = r11 instanceof androidx.recyclerview.widget.RecyclerView.C0176w.C0178b
            if (r14 != 0) goto L_0x0214
            goto L_0x02af
        L_0x0214:
            if (r14 != 0) goto L_0x0218
            r15 = r4
            goto L_0x0223
        L_0x0218:
            ud r15 = new ud
            androidx.recyclerview.widget.RecyclerView r4 = r9.f4428a
            android.content.Context r4 = r4.getContext()
            r15.<init>(r9, r4)
        L_0x0223:
            if (r15 != 0) goto L_0x0227
            goto L_0x02af
        L_0x0227:
            kd r9 = (p000.C0724kd) r9
            r4 = -1
            if (r14 != 0) goto L_0x022e
            goto L_0x02a1
        L_0x022e:
            androidx.recyclerview.widget.RecyclerView r14 = r11.f1028b
            if (r14 == 0) goto L_0x0237
            androidx.recyclerview.widget.RecyclerView$e r14 = r14.getAdapter()
            goto L_0x0238
        L_0x0237:
            r14 = 0
        L_0x0238:
            if (r14 == 0) goto L_0x023f
            int r14 = r14.mo1273a()
            goto L_0x0240
        L_0x023f:
            r14 = 0
        L_0x0240:
            if (r14 != 0) goto L_0x0243
            goto L_0x02a1
        L_0x0243:
            android.view.View r12 = r9.mo3551b(r11)
            if (r12 != 0) goto L_0x024a
            goto L_0x02a1
        L_0x024a:
            int r12 = r11.mo1324Q(r12)
            if (r12 != r4) goto L_0x0251
            goto L_0x02a1
        L_0x0251:
            r6 = r11
            androidx.recyclerview.widget.RecyclerView$w$b r6 = (androidx.recyclerview.widget.RecyclerView.C0176w.C0178b) r6
            int r4 = r14 + -1
            android.graphics.PointF r6 = r6.mo1052a(r4)
            if (r6 != 0) goto L_0x025d
            goto L_0x02a1
        L_0x025d:
            boolean r18 = r11.mo1058e()
            if (r18 == 0) goto L_0x0275
            od r1 = r9.mo3555g(r11)
            int r1 = r9.mo3553e(r11, r1, r2, r3)
            float r3 = r6.x
            r18 = 0
            int r3 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x0278
            int r1 = -r1
            goto L_0x0278
        L_0x0275:
            r18 = 0
            r1 = 0
        L_0x0278:
            boolean r3 = r11.mo1060f()
            if (r3 == 0) goto L_0x0293
            od r3 = r9.mo3556h(r11)
            r19 = r1
            r1 = 0
            int r3 = r9.mo3553e(r11, r3, r1, r5)
            float r1 = r6.y
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x0291
            int r1 = -r3
            goto L_0x0296
        L_0x0291:
            r1 = r3
            goto L_0x0296
        L_0x0293:
            r19 = r1
            r1 = 0
        L_0x0296:
            boolean r3 = r11.mo1060f()
            if (r3 == 0) goto L_0x029d
            goto L_0x029f
        L_0x029d:
            r1 = r19
        L_0x029f:
            if (r1 != 0) goto L_0x02a4
        L_0x02a1:
            r1 = -1
            r4 = -1
            goto L_0x02ad
        L_0x02a4:
            int r1 = r1 + r12
            if (r1 >= 0) goto L_0x02a8
            r1 = 0
        L_0x02a8:
            if (r1 < r14) goto L_0x02ab
            goto L_0x02ac
        L_0x02ab:
            r4 = r1
        L_0x02ac:
            r1 = -1
        L_0x02ad:
            if (r4 != r1) goto L_0x02b1
        L_0x02af:
            r1 = 0
            goto L_0x02b7
        L_0x02b1:
            r15.f1070a = r4
            r11.mo1332W0(r15)
            r1 = 1
        L_0x02b7:
            if (r1 == 0) goto L_0x02bb
            r1 = 1
            goto L_0x02bc
        L_0x02bb:
            r1 = 0
        L_0x02bc:
            if (r1 == 0) goto L_0x02bf
            goto L_0x0319
        L_0x02bf:
            if (r13 == 0) goto L_0x031b
            if (r8 == 0) goto L_0x02c5
            r7 = r7 | 2
        L_0x02c5:
            r1 = 1
            r0.mo1187n0(r7, r1)
            int r1 = r0.f945a0
            int r3 = -r1
            int r1 = java.lang.Math.min(r2, r1)
            int r22 = java.lang.Math.max(r3, r1)
            int r1 = r0.f945a0
            int r2 = -r1
            int r1 = java.lang.Math.min(r5, r1)
            int r23 = java.lang.Math.max(r2, r1)
            androidx.recyclerview.widget.RecyclerView$z r1 = r0.f953e0
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            r3 = 2
            r2.setScrollState(r3)
            r2 = 0
            r1.f1100c = r2
            r1.f1099b = r2
            android.view.animation.Interpolator r2 = r1.f1102e
            android.view.animation.Interpolator r3 = f919G0
            if (r2 == r3) goto L_0x0301
            r1.f1102e = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r4 = r4.getContext()
            r2.<init>(r4, r3)
            r1.f1101d = r2
        L_0x0301:
            android.widget.OverScroller r2 = r1.f1101d
            r20 = 0
            r21 = 0
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            r25 = 2147483647(0x7fffffff, float:NaN)
            r26 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = 2147483647(0x7fffffff, float:NaN)
            r19 = r2
            r19.fling(r20, r21, r22, r23, r24, r25, r26, r27)
            r1.mo1396a()
        L_0x0319:
            r3 = 1
            goto L_0x031c
        L_0x031b:
            r3 = 0
        L_0x031c:
            if (r3 != 0) goto L_0x0322
            r3 = 0
        L_0x031f:
            r0.setScrollState(r3)
        L_0x0322:
            r28.mo1151g0()
            r3 = 1
            goto L_0x034a
        L_0x0327:
            int r4 = r1.getPointerId(r3)
            r0.f936O = r4
            float r3 = r29.getX()
            float r3 = r3 + r11
            int r3 = (int) r3
            r0.f940S = r3
            r0.f938Q = r3
            float r1 = r29.getY()
            float r1 = r1 + r11
            int r1 = (int) r1
            r0.f941T = r1
            r0.f939R = r1
            if (r7 == 0) goto L_0x0345
            r2 = r2 | 2
        L_0x0345:
            r1 = 0
            r0.mo1187n0(r2, r1)
        L_0x0349:
            r3 = 0
        L_0x034a:
            if (r3 != 0) goto L_0x0351
            android.view.VelocityTracker r1 = r0.f937P
            r1.addMovement(r10)
        L_0x0351:
            r10.recycle()
            r1 = 1
            return r1
        L_0x0356:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo1202p(View view) {
        C0145a0 K = m600K(view);
        mo1119U();
        C0149e eVar = this.f968m;
        if (eVar != null && K != null) {
            eVar.getClass();
        }
    }

    /* renamed from: p0 */
    public void mo1203p0(int i) {
        getScrollingChildHelper().mo2718k(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0304, code lost:
        if (r15.f954f.mo4990k(r0) == false) goto L_0x03c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1204q() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f968m
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f959h0
            r1 = 0
            r0.f1093i = r1
            int r0 = r0.f1088d
            r2 = 1
            if (r0 != r2) goto L_0x0018
            r15.mo1206r()
            goto L_0x004a
        L_0x0018:
            vc r0 = r15.f952e
            java.util.ArrayList<vc$b> r3 = r0.f4803c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002c
            java.util.ArrayList<vc$b> r0 = r0.f4802b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x004a
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            int r0 = r0.f1042p
            int r3 = r15.getWidth()
            if (r0 != r3) goto L_0x004a
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            int r0 = r0.f1043q
            int r3 = r15.getHeight()
            if (r0 == r3) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            r0.mo1320N0(r15)
            goto L_0x0052
        L_0x004a:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            r0.mo1320N0(r15)
            r15.mo1212s()
        L_0x0052:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f959h0
            r3 = 4
            r0.mo1393a(r3)
            r15.mo1185m0()
            r15.mo1120V()
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f959h0
            r0.f1088d = r2
            boolean r0 = r0.f1094j
            r4 = 0
            if (r0 == 0) goto L_0x024b
            wc r0 = r15.f954f
            int r0 = r0.mo4984e()
            int r0 = r0 - r2
        L_0x006e:
            if (r0 < 0) goto L_0x0195
            wc r5 = r15.f954f
            android.view.View r5 = r5.mo4983d(r0)
            androidx.recyclerview.widget.RecyclerView$a0 r5 = m600K(r5)
            boolean r6 = r5.mo1267u()
            if (r6 == 0) goto L_0x0082
            goto L_0x0191
        L_0x0082:
            long r6 = r15.mo1108I(r5)
            androidx.recyclerview.widget.RecyclerView$j r8 = r15.f934M
            r8.getClass()
            androidx.recyclerview.widget.RecyclerView$j$c r8 = new androidx.recyclerview.widget.RecyclerView$j$c
            r8.<init>()
            android.view.View r9 = r5.f996a
            int r10 = r9.getLeft()
            r8.f1024a = r10
            int r10 = r9.getTop()
            r8.f1025b = r10
            r9.getRight()
            r9.getBottom()
            wd r9 = r15.f956g
            g4<androidx.recyclerview.widget.RecyclerView$a0> r9 = r9.f4951b
            java.lang.Object r9 = r9.mo2928f(r6, r4)
            androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r9
            if (r9 == 0) goto L_0x018c
            boolean r10 = r9.mo1267u()
            if (r10 != 0) goto L_0x018c
            wd r10 = r15.f956g
            boolean r10 = r10.mo5005d(r9)
            wd r11 = r15.f956g
            boolean r11 = r11.mo5005d(r5)
            if (r10 == 0) goto L_0x00c8
            if (r9 != r5) goto L_0x00c8
            goto L_0x018c
        L_0x00c8:
            wd r12 = r15.f956g
            androidx.recyclerview.widget.RecyclerView$j$c r12 = r12.mo5006e(r9, r3)
            wd r13 = r15.f956g
            r13.mo5003b(r5, r8)
            wd r8 = r15.f956g
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r8.mo5006e(r5, r13)
            if (r12 != 0) goto L_0x0162
            wc r8 = r15.f954f
            int r8 = r8.mo4984e()
            r10 = 0
        L_0x00e4:
            if (r10 >= r8) goto L_0x0142
            wc r11 = r15.f954f
            android.view.View r11 = r11.mo4983d(r10)
            androidx.recyclerview.widget.RecyclerView$a0 r11 = m600K(r11)
            if (r11 != r5) goto L_0x00f3
            goto L_0x013f
        L_0x00f3:
            long r12 = r15.mo1108I(r11)
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f968m
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.f1017b
            if (r0 == 0) goto L_0x0122
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = p000.C0279ch.m1116m(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0122:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = p000.C0279ch.m1116m(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x013f:
            int r10 = r10 + 1
            goto L_0x00e4
        L_0x0142:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r15.mo1101A()
            r6.append(r5)
            r6.toString()
            goto L_0x0191
        L_0x0162:
            r9.mo1265t(r1)
            if (r10 == 0) goto L_0x016a
            r15.mo1147f(r9)
        L_0x016a:
            if (r9 == r5) goto L_0x0180
            if (r11 == 0) goto L_0x0171
            r15.mo1147f(r5)
        L_0x0171:
            r9.f1003h = r5
            r15.mo1147f(r9)
            androidx.recyclerview.widget.RecyclerView$s r6 = r15.f948c
            r6.mo1381l(r9)
            r5.mo1265t(r1)
            r5.f1004i = r9
        L_0x0180:
            androidx.recyclerview.widget.RecyclerView$j r6 = r15.f934M
            boolean r5 = r6.mo1286a(r9, r5, r12, r8)
            if (r5 == 0) goto L_0x0191
            r15.mo1125a0()
            goto L_0x0191
        L_0x018c:
            wd r6 = r15.f956g
            r6.mo5003b(r5, r8)
        L_0x0191:
            int r0 = r0 + -1
            goto L_0x006e
        L_0x0195:
            wd r0 = r15.f956g
            wd$b r3 = r15.f991x0
            j4<androidx.recyclerview.widget.RecyclerView$a0, wd$a> r4 = r0.f4950a
            int r4 = r4.f2827d
        L_0x019d:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x024b
            j4<androidx.recyclerview.widget.RecyclerView$a0, wd$a> r5 = r0.f4950a
            java.lang.Object r5 = r5.mo3402h(r4)
            r7 = r5
            androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r7
            j4<androidx.recyclerview.widget.RecyclerView$a0, wd$a> r5 = r0.f4950a
            java.lang.Object r5 = r5.mo3404i(r4)
            wd$a r5 = (p000.C1306wd.C1307a) r5
            int r6 = r5.f4953a
            r8 = r6 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01ba
            goto L_0x01c2
        L_0x01ba:
            r8 = r6 & 1
            if (r8 == 0) goto L_0x01d5
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r5.f4954b
            if (r6 != 0) goto L_0x01d2
        L_0x01c2:
            r6 = r3
            androidx.recyclerview.widget.RecyclerView$d r6 = (androidx.recyclerview.widget.RecyclerView.C0148d) r6
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r8 = r6.f970n
            android.view.View r7 = r7.f996a
            androidx.recyclerview.widget.RecyclerView$s r6 = r6.f948c
            r8.mo1307F0(r7, r6)
            goto L_0x0246
        L_0x01d2:
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r5.f4955c
            goto L_0x0231
        L_0x01d5:
            r8 = r6 & 14
            r9 = 14
            if (r8 != r9) goto L_0x01dc
            goto L_0x023c
        L_0x01dc:
            r8 = r6 & 12
            r9 = 12
            if (r8 != r9) goto L_0x022a
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r5.f4954b
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r5.f4955c
            r12 = r3
            androidx.recyclerview.widget.RecyclerView$d r12 = (androidx.recyclerview.widget.RecyclerView.C0148d) r12
            r12.getClass()
            r7.mo1265t(r1)
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            boolean r10 = r9.f925D
            androidx.recyclerview.widget.RecyclerView$j r9 = r9.f934M
            if (r10 == 0) goto L_0x01fe
            boolean r6 = r9.mo1286a(r7, r7, r6, r8)
            if (r6 == 0) goto L_0x0246
            goto L_0x0224
        L_0x01fe:
            sd r9 = (p000.C1108sd) r9
            r9.getClass()
            int r10 = r6.f1024a
            int r11 = r8.f1024a
            if (r10 != r11) goto L_0x0215
            int r13 = r6.f1025b
            int r14 = r8.f1025b
            if (r13 == r14) goto L_0x0210
            goto L_0x0215
        L_0x0210:
            r9.mo1287c(r7)
            r6 = 0
            goto L_0x0222
        L_0x0215:
            int r13 = r6.f1025b
            int r14 = r8.f1025b
            r6 = r9
            r8 = r10
            r9 = r13
            r10 = r11
            r11 = r14
            boolean r6 = r6.mo2782i(r7, r8, r9, r10, r11)
        L_0x0222:
            if (r6 == 0) goto L_0x0246
        L_0x0224:
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.mo1125a0()
            goto L_0x0246
        L_0x022a:
            r8 = r6 & 4
            if (r8 == 0) goto L_0x0238
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r5.f4954b
            r8 = 0
        L_0x0231:
            r9 = r3
            androidx.recyclerview.widget.RecyclerView$d r9 = (androidx.recyclerview.widget.RecyclerView.C0148d) r9
            r9.mo1272b(r7, r6, r8)
            goto L_0x0246
        L_0x0238:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0246
        L_0x023c:
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r5.f4954b
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r5.f4955c
            r9 = r3
            androidx.recyclerview.widget.RecyclerView$d r9 = (androidx.recyclerview.widget.RecyclerView.C0148d) r9
            r9.mo1271a(r7, r6, r8)
        L_0x0246:
            p000.C1306wd.C1307a.m3648b(r5)
            goto L_0x019d
        L_0x024b:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            androidx.recyclerview.widget.RecyclerView$s r3 = r15.f948c
            r0.mo1305E0(r3)
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f959h0
            int r3 = r0.f1089e
            r0.f1086b = r3
            r15.f925D = r1
            r15.f926E = r1
            r0.f1094j = r1
            r0.f1095k = r1
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            r0.f1034h = r1
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f948c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f1061b
            if (r0 == 0) goto L_0x026d
            r0.clear()
        L_0x026d:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            boolean r3 = r0.f1039m
            if (r3 == 0) goto L_0x027c
            r0.f1038l = r1
            r0.f1039m = r1
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f948c
            r0.mo1382m()
        L_0x027c:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f970n
            androidx.recyclerview.widget.RecyclerView$x r3 = r15.f959h0
            r0.mo1036u0(r3)
            r15.mo1121W(r2)
            r15.mo1189o0(r1)
            wd r0 = r15.f956g
            j4<androidx.recyclerview.widget.RecyclerView$a0, wd$a> r3 = r0.f4950a
            r3.clear()
            g4<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f4951b
            r0.mo2923b()
            int[] r0 = r15.f977q0
            r3 = r0[r1]
            r4 = r0[r2]
            r15.mo1105E(r0)
            int[] r0 = r15.f977q0
            r5 = r0[r1]
            if (r5 != r3) goto L_0x02aa
            r0 = r0[r2]
            if (r0 == r4) goto L_0x02a9
            goto L_0x02aa
        L_0x02a9:
            r2 = 0
        L_0x02aa:
            if (r2 == 0) goto L_0x02af
            r15.mo1240v(r1, r1)
        L_0x02af:
            boolean r0 = r15.f951d0
            r2 = -1
            if (r0 == 0) goto L_0x03c8
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f968m
            if (r0 == 0) goto L_0x03c8
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x03c8
            int r0 = r15.getDescendantFocusability()
            r4 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r4) goto L_0x03c8
            int r0 = r15.getDescendantFocusability()
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r4) goto L_0x02d7
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x02d7
            goto L_0x03c8
        L_0x02d7:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x0308
            android.view.View r0 = r15.getFocusedChild()
            boolean r4 = f917E0
            if (r4 == 0) goto L_0x02fe
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L_0x02f1
            boolean r4 = r0.hasFocus()
            if (r4 != 0) goto L_0x02fe
        L_0x02f1:
            wc r0 = r15.f954f
            int r0 = r0.mo4984e()
            if (r0 != 0) goto L_0x0308
            r15.requestFocus()
            goto L_0x03c8
        L_0x02fe:
            wc r4 = r15.f954f
            boolean r0 = r4.mo4990k(r0)
            if (r0 != 0) goto L_0x0308
            goto L_0x03c8
        L_0x0308:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f959h0
            long r4 = r0.f1097m
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x034d
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f968m
            boolean r0 = r0.f1017b
            if (r0 == 0) goto L_0x034d
            if (r0 != 0) goto L_0x031a
            r0 = 0
            goto L_0x034b
        L_0x031a:
            wc r0 = r15.f954f
            int r0 = r0.mo4987h()
            r6 = 0
            r7 = 0
        L_0x0322:
            if (r6 >= r0) goto L_0x034a
            wc r8 = r15.f954f
            android.view.View r8 = r8.mo4986g(r6)
            androidx.recyclerview.widget.RecyclerView$a0 r8 = m600K(r8)
            if (r8 == 0) goto L_0x0347
            boolean r9 = r8.mo1258m()
            if (r9 != 0) goto L_0x0347
            long r9 = r8.f1000e
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x0347
            wc r7 = r15.f954f
            android.view.View r9 = r8.f996a
            boolean r7 = r7.mo4990k(r9)
            if (r7 == 0) goto L_0x034e
            r7 = r8
        L_0x0347:
            int r6 = r6 + 1
            goto L_0x0322
        L_0x034a:
            r0 = r7
        L_0x034b:
            r8 = r0
            goto L_0x034e
        L_0x034d:
            r8 = 0
        L_0x034e:
            if (r8 == 0) goto L_0x0366
            wc r0 = r15.f954f
            android.view.View r4 = r8.f996a
            boolean r0 = r0.mo4990k(r4)
            if (r0 != 0) goto L_0x0366
            android.view.View r0 = r8.f996a
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x0363
            goto L_0x0366
        L_0x0363:
            android.view.View r0 = r8.f996a
            goto L_0x03ad
        L_0x0366:
            wc r0 = r15.f954f
            int r0 = r0.mo4984e()
            if (r0 <= 0) goto L_0x03ac
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f959h0
            int r4 = r0.f1096l
            r5 = -1
            if (r4 == r5) goto L_0x0376
            r1 = r4
        L_0x0376:
            int r0 = r0.mo1394b()
            r4 = r1
        L_0x037b:
            if (r4 >= r0) goto L_0x0392
            androidx.recyclerview.widget.RecyclerView$a0 r5 = r15.mo1106G(r4)
            if (r5 != 0) goto L_0x0384
            goto L_0x0392
        L_0x0384:
            android.view.View r6 = r5.f996a
            boolean r6 = r6.hasFocusable()
            if (r6 == 0) goto L_0x038f
            android.view.View r0 = r5.f996a
            goto L_0x03ad
        L_0x038f:
            int r4 = r4 + 1
            goto L_0x037b
        L_0x0392:
            int r0 = java.lang.Math.min(r0, r1)
        L_0x0396:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x03ac
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r15.mo1106G(r0)
            if (r1 != 0) goto L_0x03a1
            goto L_0x03ac
        L_0x03a1:
            android.view.View r4 = r1.f996a
            boolean r4 = r4.hasFocusable()
            if (r4 == 0) goto L_0x0396
            android.view.View r0 = r1.f996a
            goto L_0x03ad
        L_0x03ac:
            r0 = 0
        L_0x03ad:
            if (r0 == 0) goto L_0x03c8
            androidx.recyclerview.widget.RecyclerView$x r1 = r15.f959h0
            int r1 = r1.f1098n
            long r4 = (long) r1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x03c5
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x03c5
            boolean r4 = r1.isFocusable()
            if (r4 == 0) goto L_0x03c5
            r0 = r1
        L_0x03c5:
            r0.requestFocus()
        L_0x03c8:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f959h0
            r0.f1097m = r2
            r1 = -1
            r0.f1096l = r1
            r0.f1098n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo1204q():void");
    }

    /* renamed from: q0 */
    public void mo1205q0() {
        C0176w wVar;
        setScrollState(0);
        this.f953e0.mo1398c();
        C0160m mVar = this.f970n;
        if (mVar != null && (wVar = mVar.f1033g) != null) {
            wVar.mo1390c();
        }
    }

    /* renamed from: r */
    public final void mo1206r() {
        int id;
        View C;
        this.f959h0.mo1393a(1);
        mo1102B(this.f959h0);
        this.f959h0.f1093i = false;
        mo1185m0();
        C1306wd wdVar = this.f956g;
        wdVar.f4950a.clear();
        wdVar.f4951b.mo2923b();
        mo1120V();
        mo1127b0();
        View focusedChild = (!this.f951d0 || !hasFocus() || this.f968m == null) ? null : getFocusedChild();
        C0145a0 J = (focusedChild == null || (C = mo1103C(focusedChild)) == null) ? null : mo1109J(C);
        long j = -1;
        if (J == null) {
            C0179x xVar = this.f959h0;
            xVar.f1097m = -1;
            xVar.f1096l = -1;
            xVar.f1098n = -1;
        } else {
            C0179x xVar2 = this.f959h0;
            if (this.f968m.f1017b) {
                j = J.f1000e;
            }
            xVar2.f1097m = j;
            xVar2.f1096l = this.f925D ? -1 : J.mo1258m() ? J.f999d : J.mo1250e();
            C0179x xVar3 = this.f959h0;
            View view = J.f996a;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        xVar3.f1098n = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            xVar3.f1098n = id;
        }
        C0179x xVar4 = this.f959h0;
        xVar4.f1092h = xVar4.f1094j && this.f967l0;
        this.f967l0 = false;
        this.f965k0 = false;
        xVar4.f1091g = xVar4.f1095k;
        xVar4.f1089e = this.f968m.mo1273a();
        mo1105E(this.f977q0);
        if (this.f959h0.f1094j) {
            int e = this.f954f.mo4984e();
            for (int i = 0; i < e; i++) {
                C0145a0 K = m600K(this.f954f.mo4983d(i));
                if (!K.mo1267u() && (!K.mo1256k() || this.f968m.f1017b)) {
                    C0154j jVar = this.f934M;
                    C0154j.m704b(K);
                    K.mo1252g();
                    this.f956g.mo5004c(K, jVar.mo1292h(K));
                    if (this.f959h0.f1092h && K.mo1261p() && !K.mo1258m() && !K.mo1267u() && !K.mo1256k()) {
                        this.f956g.f4951b.mo2929g(mo1108I(K), K);
                    }
                }
            }
        }
        if (this.f959h0.f1095k) {
            int h = this.f954f.mo4987h();
            for (int i2 = 0; i2 < h; i2++) {
                C0145a0 K2 = m600K(this.f954f.mo4986g(i2));
                if (!K2.mo1267u() && K2.f999d == -1) {
                    K2.f999d = K2.f998c;
                }
            }
            C0179x xVar5 = this.f959h0;
            boolean z = xVar5.f1090f;
            xVar5.f1090f = false;
            this.f970n.mo1034t0(this.f948c, xVar5);
            this.f959h0.f1090f = z;
            for (int i3 = 0; i3 < this.f954f.mo4984e(); i3++) {
                C0145a0 K3 = m600K(this.f954f.mo4983d(i3));
                if (!K3.mo1267u()) {
                    C1306wd.C1307a orDefault = this.f956g.f4950a.getOrDefault(K3, null);
                    if (!((orDefault == null || (orDefault.f4953a & 4) == 0) ? false : true)) {
                        C0154j.m704b(K3);
                        boolean h2 = K3.mo1253h(8192);
                        C0154j jVar2 = this.f934M;
                        K3.mo1252g();
                        C0154j.C0157c h3 = jVar2.mo1292h(K3);
                        if (h2) {
                            mo1136d0(K3, h3);
                        } else {
                            C1306wd wdVar2 = this.f956g;
                            C1306wd.C1307a orDefault2 = wdVar2.f4950a.getOrDefault(K3, null);
                            if (orDefault2 == null) {
                                orDefault2 = C1306wd.C1307a.m3647a();
                                wdVar2.f4950a.put(K3, orDefault2);
                            }
                            orDefault2.f4953a |= 2;
                            orDefault2.f4954b = h3;
                        }
                    }
                }
            }
        }
        mo1182l();
        mo1121W(true);
        mo1189o0(false);
        this.f959h0.f1088d = 2;
    }

    public void removeDetachedView(View view, boolean z) {
        C0145a0 K = m600K(view);
        if (K != null) {
            if (K.mo1260o()) {
                K.f1005j &= -257;
            } else if (!K.mo1267u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(K);
                throw new IllegalArgumentException(C0279ch.m1116m(this, sb));
            }
        }
        view.clearAnimation();
        mo1202p(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f970n.mo1353x0(this, view, view2) && view2 != null) {
            mo1148f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f970n.mo1313I0(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f976q.size();
        for (int i = 0; i < size; i++) {
            this.f976q.get(i).mo1363a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f988w != 0 || this.f992y) {
            this.f990x = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void mo1212s() {
        mo1185m0();
        mo1120V();
        this.f959h0.mo1393a(6);
        this.f952e.mo4886c();
        this.f959h0.f1089e = this.f968m.mo1273a();
        C0179x xVar = this.f959h0;
        xVar.f1087c = 0;
        xVar.f1091g = false;
        this.f970n.mo1034t0(this.f948c, xVar);
        C0179x xVar2 = this.f959h0;
        xVar2.f1090f = false;
        this.f950d = null;
        xVar2.f1094j = xVar2.f1094j && this.f934M != null;
        xVar2.f1088d = 4;
        mo1121W(true);
        mo1189o0(false);
    }

    public void scrollBy(int i, int i2) {
        C0160m mVar = this.f970n;
        if (mVar != null && !this.f992y) {
            boolean e = mVar.mo1058e();
            boolean f = this.f970n.mo1060f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                mo1173h0(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (mo1114P()) {
            int contentChangeTypes = (accessibilityEvent == null || Build.VERSION.SDK_INT < 19) ? 0 : accessibilityEvent.getContentChangeTypes();
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.f922A |= i;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1057rd rdVar) {
        this.f973o0 = rdVar;
        C0813m8.m2457F(this, rdVar);
    }

    public void setAdapter(C0149e eVar) {
        setLayoutFrozen(false);
        C0149e eVar2 = this.f968m;
        if (eVar2 != null) {
            eVar2.f1016a.unregisterObserver(this.f946b);
            this.f968m.getClass();
        }
        mo1146e0();
        C1254vc vcVar = this.f952e;
        vcVar.mo4895l(vcVar.f4802b);
        vcVar.mo4895l(vcVar.f4803c);
        vcVar.f4806f = 0;
        C0149e eVar3 = this.f968m;
        this.f968m = eVar;
        if (eVar != null) {
            eVar.f1016a.registerObserver(this.f946b);
        }
        C0160m mVar = this.f970n;
        if (mVar != null) {
            mVar.mo1339c0();
        }
        C0171s sVar = this.f948c;
        C0149e eVar4 = this.f968m;
        sVar.mo1371b();
        C0169r d = sVar.mo1373d();
        d.getClass();
        if (eVar3 != null) {
            d.f1055b--;
        }
        if (d.f1055b == 0) {
            for (int i = 0; i < d.f1054a.size(); i++) {
                d.f1054a.valueAt(i).f1056a.clear();
            }
        }
        if (eVar4 != null) {
            d.f1055b++;
        }
        this.f959h0.f1090f = true;
        mo1128c0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0152h hVar) {
        if (hVar != this.f975p0) {
            this.f975p0 = hVar;
            setChildrenDrawingOrderEnabled(hVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f958h) {
            mo1112N();
        }
        this.f958h = z;
        super.setClipToPadding(z);
        if (this.f986v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0153i iVar) {
        iVar.getClass();
        this.f929H = iVar;
        mo1112N();
    }

    public void setHasFixedSize(boolean z) {
        this.f982t = z;
    }

    public void setItemAnimator(C0154j jVar) {
        C0154j jVar2 = this.f934M;
        if (jVar2 != null) {
            jVar2.mo1290f();
            this.f934M.f1018a = null;
        }
        this.f934M = jVar;
        if (jVar != null) {
            jVar.f1018a = this.f969m0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0171s sVar = this.f948c;
        sVar.f1064e = i;
        sVar.mo1382m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0160m mVar) {
        if (mVar != this.f970n) {
            mo1205q0();
            if (this.f970n != null) {
                C0154j jVar = this.f934M;
                if (jVar != null) {
                    jVar.mo1290f();
                }
                this.f970n.mo1303D0(this.f948c);
                this.f970n.mo1305E0(this.f948c);
                this.f948c.mo1371b();
                if (this.f980s) {
                    C0160m mVar2 = this.f970n;
                    C0171s sVar = this.f948c;
                    mVar2.f1035i = false;
                    mVar2.mo1062g0(this, sVar);
                }
                this.f970n.mo1326R0((RecyclerView) null);
                this.f970n = null;
            } else {
                this.f948c.mo1371b();
            }
            C1303wc wcVar = this.f954f;
            C1303wc.C1304a aVar = wcVar.f4946b;
            aVar.f4948a = 0;
            C1303wc.C1304a aVar2 = aVar.f4949b;
            if (aVar2 != null) {
                aVar2.mo4999g();
            }
            int size = wcVar.f4947c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0972pd pdVar = (C0972pd) wcVar.f4945a;
                pdVar.getClass();
                C0145a0 K = m600K(wcVar.f4947c.get(size));
                if (K != null) {
                    pdVar.f3617a.mo1181k0(K, K.f1011p);
                    K.f1011p = 0;
                }
                wcVar.f4947c.remove(size);
            }
            C0972pd pdVar2 = (C0972pd) wcVar.f4945a;
            int b = pdVar2.mo4013b();
            for (int i = 0; i < b; i++) {
                View a = pdVar2.mo4012a(i);
                pdVar2.f3617a.mo1202p(a);
                a.clearAnimation();
            }
            pdVar2.f3617a.removeAllViews();
            this.f970n = mVar;
            if (mVar != null) {
                if (mVar.f1028b == null) {
                    mVar.mo1326R0(this);
                    if (this.f980s) {
                        C0160m mVar3 = this.f970n;
                        mVar3.f1035i = true;
                        mVar3.mo1341e0();
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(mVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(C0279ch.m1116m(mVar.f1028b, sb));
                }
            }
            this.f948c.mo1382m();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo2716i(z);
    }

    public void setOnFlingListener(C0166o oVar) {
        this.f943V = oVar;
    }

    @Deprecated
    public void setOnScrollListener(C0168q qVar) {
        this.f961i0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f951d0 = z;
    }

    public void setRecycledViewPool(C0169r rVar) {
        C0171s sVar = this.f948c;
        C0169r rVar2 = sVar.f1066g;
        if (rVar2 != null) {
            rVar2.f1055b--;
        }
        sVar.f1066g = rVar;
        if (rVar != null && RecyclerView.this.getAdapter() != null) {
            sVar.f1066g.f1055b++;
        }
    }

    public void setRecyclerListener(C0172t tVar) {
        this.f972o = tVar;
    }

    public void setScrollState(int i) {
        C0176w wVar;
        if (i != this.f935N) {
            this.f935N = i;
            if (i != 2) {
                this.f953e0.mo1398c();
                C0160m mVar = this.f970n;
                if (!(mVar == null || (wVar = mVar.f1033g) == null)) {
                    wVar.mo1390c();
                }
            }
            C0160m mVar2 = this.f970n;
            if (mVar2 != null) {
                mVar2.mo1297A0(i);
            }
            mo1123Y();
            C0168q qVar = this.f961i0;
            if (qVar != null) {
                qVar.mo1366a(this, i);
            }
            List<C0168q> list = this.f963j0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.f963j0.get(size).mo1366a(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f942U = i != 1 ? viewConfiguration.getScaledTouchSlop() : viewConfiguration.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(C0180y yVar) {
        this.f948c.getClass();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo2717j(i, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo2718k(0);
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f992y) {
            mo1175i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f992y = false;
                if (!(!this.f990x || this.f970n == null || this.f968m == null)) {
                    requestLayout();
                }
                this.f990x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f992y = true;
            this.f993z = true;
            mo1205q0();
        }
    }

    /* renamed from: t */
    public boolean mo1238t(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo2710c(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: u */
    public final void mo1239u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo2713f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: v */
    public void mo1240v(int i, int i2) {
        this.f928G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo1124Z();
        C0168q qVar = this.f961i0;
        if (qVar != null) {
            qVar.mo1367b(this, i, i2);
        }
        List<C0168q> list = this.f963j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f963j0.get(size).mo1367b(this, i, i2);
            }
        }
        this.f928G--;
    }

    /* renamed from: w */
    public void mo1241w() {
        int i;
        int i2;
        if (this.f933L == null) {
            EdgeEffect a = this.f929H.mo1285a(this);
            this.f933L = a;
            if (this.f958h) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: x */
    public void mo1242x() {
        int i;
        int i2;
        if (this.f930I == null) {
            EdgeEffect a = this.f929H.mo1285a(this);
            this.f930I = a;
            if (this.f958h) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: y */
    public void mo1243y() {
        int i;
        int i2;
        if (this.f932K == null) {
            EdgeEffect a = this.f929H.mo1285a(this);
            this.f932K = a;
            if (this.f958h) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: z */
    public void mo1244z() {
        int i;
        int i2;
        if (this.f931J == null) {
            EdgeEffect a = this.f929H.mo1285a(this);
            this.f931J = a;
            if (this.f958h) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }
}
