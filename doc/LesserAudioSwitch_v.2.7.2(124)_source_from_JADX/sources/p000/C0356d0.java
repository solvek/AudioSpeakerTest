package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.C0496g;
import p000.C0750l0;
import p000.C1435z0;

/* renamed from: d0 */
public class C0356d0 extends C0496g implements ActionBarOverlayLayout.C0048d {

    /* renamed from: A */
    public static final Interpolator f1840A = new DecelerateInterpolator();

    /* renamed from: z */
    public static final Interpolator f1841z = new AccelerateInterpolator();

    /* renamed from: a */
    public Context f1842a;

    /* renamed from: b */
    public Context f1843b;

    /* renamed from: c */
    public ActionBarOverlayLayout f1844c;

    /* renamed from: d */
    public ActionBarContainer f1845d;

    /* renamed from: e */
    public C0855n2 f1846e;

    /* renamed from: f */
    public ActionBarContextView f1847f;

    /* renamed from: g */
    public View f1848g;

    /* renamed from: h */
    public boolean f1849h;

    /* renamed from: i */
    public C0360d f1850i;

    /* renamed from: j */
    public C0750l0 f1851j;

    /* renamed from: k */
    public C0750l0.C0751a f1852k;

    /* renamed from: l */
    public boolean f1853l;

    /* renamed from: m */
    public ArrayList<C0496g.C0498b> f1854m = new ArrayList<>();

    /* renamed from: n */
    public boolean f1855n;

    /* renamed from: o */
    public int f1856o = 0;

    /* renamed from: p */
    public boolean f1857p = true;

    /* renamed from: q */
    public boolean f1858q;

    /* renamed from: r */
    public boolean f1859r;

    /* renamed from: s */
    public boolean f1860s = true;

    /* renamed from: t */
    public C1036r0 f1861t;

    /* renamed from: u */
    public boolean f1862u;

    /* renamed from: v */
    public boolean f1863v;

    /* renamed from: w */
    public final C1102s8 f1864w = new C0357a();

    /* renamed from: x */
    public final C1102s8 f1865x = new C0358b();

    /* renamed from: y */
    public final C1202u8 f1866y = new C0359c();

    /* renamed from: d0$a */
    public class C0357a extends C1156t8 {
        public C0357a() {
        }

        /* renamed from: a */
        public void mo2606a(View view) {
            View view2;
            C0356d0 d0Var = C0356d0.this;
            if (d0Var.f1857p && (view2 = d0Var.f1848g) != null) {
                view2.setTranslationY(0.0f);
                C0356d0.this.f1845d.setTranslationY(0.0f);
            }
            C0356d0.this.f1845d.setVisibility(8);
            C0356d0.this.f1845d.setTransitioning(false);
            C0356d0 d0Var2 = C0356d0.this;
            d0Var2.f1861t = null;
            C0750l0.C0751a aVar = d0Var2.f1852k;
            if (aVar != null) {
                aVar.mo3569b(d0Var2.f1851j);
                d0Var2.f1851j = null;
                d0Var2.f1852k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C0356d0.this.f1844c;
            if (actionBarOverlayLayout != null) {
                C0813m8.m2455D(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: d0$b */
    public class C0358b extends C1156t8 {
        public C0358b() {
        }

        /* renamed from: a */
        public void mo2606a(View view) {
            C0356d0 d0Var = C0356d0.this;
            d0Var.f1861t = null;
            d0Var.f1845d.requestLayout();
        }
    }

    /* renamed from: d0$c */
    public class C0359c implements C1202u8 {
        public C0359c() {
        }
    }

    /* renamed from: d0$d */
    public class C0360d extends C0750l0 implements C1435z0.C1436a {

        /* renamed from: d */
        public final Context f1870d;

        /* renamed from: e */
        public final C1435z0 f1871e;

        /* renamed from: f */
        public C0750l0.C0751a f1872f;

        /* renamed from: g */
        public WeakReference<View> f1873g;

        public C0360d(Context context, C0750l0.C0751a aVar) {
            this.f1870d = context;
            this.f1872f = aVar;
            C1435z0 z0Var = new C1435z0(context);
            z0Var.f5236l = 1;
            this.f1871e = z0Var;
            z0Var.f5229e = this;
        }

        /* renamed from: a */
        public void mo307a(C1435z0 z0Var) {
            if (this.f1872f != null) {
                mo2613i();
                C0904o1 o1Var = C0356d0.this.f1847f.f3204e;
                if (o1Var != null) {
                    o1Var.mo3825n();
                }
            }
        }

        /* renamed from: b */
        public boolean mo308b(C1435z0 z0Var, MenuItem menuItem) {
            C0750l0.C0751a aVar = this.f1872f;
            if (aVar != null) {
                return aVar.mo3570c(this, menuItem);
            }
            return false;
        }

        /* renamed from: c */
        public void mo2607c() {
            C0356d0 d0Var = C0356d0.this;
            if (d0Var.f1850i == this) {
                if (!(!d0Var.f1858q)) {
                    d0Var.f1851j = this;
                    d0Var.f1852k = this.f1872f;
                } else {
                    this.f1872f.mo3569b(this);
                }
                this.f1872f = null;
                C0356d0.this.mo2602d(false);
                ActionBarContextView actionBarContextView = C0356d0.this.f1847f;
                if (actionBarContextView.f254l == null) {
                    actionBarContextView.mo210h();
                }
                C0356d0.this.f1846e.mo3374p().sendAccessibilityEvent(32);
                C0356d0 d0Var2 = C0356d0.this;
                d0Var2.f1844c.setHideOnContentScrollEnabled(d0Var2.f1863v);
                C0356d0.this.f1850i = null;
            }
        }

        /* renamed from: d */
        public View mo2608d() {
            WeakReference<View> weakReference = this.f1873g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo2609e() {
            return this.f1871e;
        }

        /* renamed from: f */
        public MenuInflater mo2610f() {
            return new C0995q0(this.f1870d);
        }

        /* renamed from: g */
        public CharSequence mo2611g() {
            return C0356d0.this.f1847f.getSubtitle();
        }

        /* renamed from: h */
        public CharSequence mo2612h() {
            return C0356d0.this.f1847f.getTitle();
        }

        /* renamed from: i */
        public void mo2613i() {
            if (C0356d0.this.f1850i == this) {
                this.f1871e.mo5266z();
                try {
                    this.f1872f.mo3568a(this, this.f1871e);
                } finally {
                    this.f1871e.mo5265y();
                }
            }
        }

        /* renamed from: j */
        public boolean mo2614j() {
            return C0356d0.this.f1847f.f261s;
        }

        /* renamed from: k */
        public void mo2615k(View view) {
            C0356d0.this.f1847f.setCustomView(view);
            this.f1873g = new WeakReference<>(view);
        }

        /* renamed from: l */
        public void mo2616l(int i) {
            C0356d0.this.f1847f.setSubtitle(C0356d0.this.f1842a.getResources().getString(i));
        }

        /* renamed from: m */
        public void mo2617m(CharSequence charSequence) {
            C0356d0.this.f1847f.setSubtitle(charSequence);
        }

        /* renamed from: n */
        public void mo2618n(int i) {
            C0356d0.this.f1847f.setTitle(C0356d0.this.f1842a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo2619o(CharSequence charSequence) {
            C0356d0.this.f1847f.setTitle(charSequence);
        }

        /* renamed from: p */
        public void mo2620p(boolean z) {
            this.f3085c = z;
            C0356d0.this.f1847f.setTitleOptional(z);
        }
    }

    public C0356d0(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        mo2603e(decorView);
        if (!z) {
            this.f1848g = decorView.findViewById(16908290);
        }
    }

    public C0356d0(Dialog dialog) {
        new ArrayList();
        mo2603e(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    public void mo2599a(boolean z) {
        if (z != this.f1853l) {
            this.f1853l = z;
            int size = this.f1854m.size();
            for (int i = 0; i < size; i++) {
                this.f1854m.get(i).mo2814a(z);
            }
        }
    }

    /* renamed from: b */
    public Context mo2600b() {
        if (this.f1843b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1842a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1843b = new ContextThemeWrapper(this.f1842a, i);
            } else {
                this.f1843b = this.f1842a;
            }
        }
        return this.f1843b;
    }

    /* renamed from: c */
    public void mo2601c(boolean z) {
        if (!this.f1849h) {
            int i = z ? 4 : 0;
            int j = this.f1846e.mo3368j();
            this.f1849h = true;
            this.f1846e.mo3383u((i & 4) | (j & -5));
        }
    }

    /* renamed from: d */
    public void mo2602d(boolean z) {
        C1049r8 r8Var;
        C1049r8 r8Var2;
        if (z) {
            if (!this.f1859r) {
                this.f1859r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1844c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                mo2605g(false);
            }
        } else if (this.f1859r) {
            this.f1859r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1844c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            mo2605g(false);
        }
        if (C0813m8.m2486t(this.f1845d)) {
            if (z) {
                r8Var = this.f1846e.mo3367i(4, 100);
                r8Var2 = this.f1847f.mo3653e(0, 200);
            } else {
                r8Var2 = this.f1846e.mo3367i(0, 200);
                r8Var = this.f1847f.mo3653e(8, 100);
            }
            C1036r0 r0Var = new C1036r0();
            r0Var.f3881a.add(r8Var);
            View view = (View) r8Var.f3933a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) r8Var2.f3933a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            r0Var.f3881a.add(r8Var2);
            r0Var.mo4166b();
        } else if (z) {
            this.f1846e.mo3369k(4);
            this.f1847f.setVisibility(0);
        } else {
            this.f1846e.mo3369k(0);
            this.f1847f.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo2603e(View view) {
        C0855n2 n2Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f1844c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C0855n2) {
            n2Var = (C0855n2) findViewById;
        } else if (findViewById instanceof Toolbar) {
            n2Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder c = C0279ch.m1106c("Can't make a decor toolbar out of ");
            c.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(c.toString());
        }
        this.f1846e = n2Var;
        this.f1847f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1845d = actionBarContainer;
        C0855n2 n2Var2 = this.f1846e;
        if (n2Var2 == null || this.f1847f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0356d0.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1842a = n2Var2.mo3382t();
        boolean z = (this.f1846e.mo3368j() & 4) != 0;
        if (z) {
            this.f1849h = true;
        }
        Context context = this.f1842a;
        this.f1846e.mo3375q((context.getApplicationInfo().targetSdkVersion < 14) || z);
        mo2604f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1842a.obtainStyledAttributes((AttributeSet) null, C0440f.f2047a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1844c;
            if (actionBarOverlayLayout2.f278i) {
                this.f1863v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            ActionBarContainer actionBarContainer2 = this.f1845d;
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 21) {
                actionBarContainer2.setElevation(f);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public final void mo2604f(boolean z) {
        this.f1855n = z;
        if (!z) {
            this.f1846e.mo3373o((C0005a3) null);
            this.f1845d.setTabContainer((C0005a3) null);
        } else {
            this.f1845d.setTabContainer((C0005a3) null);
            this.f1846e.mo3373o((C0005a3) null);
        }
        boolean z2 = true;
        boolean z3 = this.f1846e.mo3384v() == 2;
        this.f1846e.mo3377s(!this.f1855n && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1844c;
        if (this.f1855n || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: g */
    public final void mo2605g(boolean z) {
        View view;
        View view2;
        View view3;
        if (this.f1859r || !this.f1858q) {
            if (!this.f1860s) {
                this.f1860s = true;
                C1036r0 r0Var = this.f1861t;
                if (r0Var != null) {
                    r0Var.mo4165a();
                }
                this.f1845d.setVisibility(0);
                if (this.f1856o != 0 || (!this.f1862u && !z)) {
                    this.f1845d.setAlpha(1.0f);
                    this.f1845d.setTranslationY(0.0f);
                    if (this.f1857p && (view2 = this.f1848g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f1865x.mo2606a((View) null);
                } else {
                    this.f1845d.setTranslationY(0.0f);
                    float f = (float) (-this.f1845d.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f1845d.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f1845d.setTranslationY(f);
                    C1036r0 r0Var2 = new C1036r0();
                    C1049r8 a = C0813m8.m2467a(this.f1845d);
                    a.mo4217g(0.0f);
                    a.mo4216f(this.f1866y);
                    if (!r0Var2.f3885e) {
                        r0Var2.f3881a.add(a);
                    }
                    if (this.f1857p && (view3 = this.f1848g) != null) {
                        view3.setTranslationY(f);
                        C1049r8 a2 = C0813m8.m2467a(this.f1848g);
                        a2.mo4217g(0.0f);
                        if (!r0Var2.f3885e) {
                            r0Var2.f3881a.add(a2);
                        }
                    }
                    Interpolator interpolator = f1840A;
                    boolean z2 = r0Var2.f3885e;
                    if (!z2) {
                        r0Var2.f3883c = interpolator;
                    }
                    if (!z2) {
                        r0Var2.f3882b = 250;
                    }
                    C1102s8 s8Var = this.f1865x;
                    if (!z2) {
                        r0Var2.f3884d = s8Var;
                    }
                    this.f1861t = r0Var2;
                    r0Var2.mo4166b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1844c;
                if (actionBarOverlayLayout != null) {
                    C0813m8.m2455D(actionBarOverlayLayout);
                }
            }
        } else if (this.f1860s) {
            this.f1860s = false;
            C1036r0 r0Var3 = this.f1861t;
            if (r0Var3 != null) {
                r0Var3.mo4165a();
            }
            if (this.f1856o != 0 || (!this.f1862u && !z)) {
                this.f1864w.mo2606a((View) null);
                return;
            }
            this.f1845d.setAlpha(1.0f);
            this.f1845d.setTransitioning(true);
            C1036r0 r0Var4 = new C1036r0();
            float f2 = (float) (-this.f1845d.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f1845d.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C1049r8 a3 = C0813m8.m2467a(this.f1845d);
            a3.mo4217g(f2);
            a3.mo4216f(this.f1866y);
            if (!r0Var4.f3885e) {
                r0Var4.f3881a.add(a3);
            }
            if (this.f1857p && (view = this.f1848g) != null) {
                C1049r8 a4 = C0813m8.m2467a(view);
                a4.mo4217g(f2);
                if (!r0Var4.f3885e) {
                    r0Var4.f3881a.add(a4);
                }
            }
            Interpolator interpolator2 = f1841z;
            boolean z3 = r0Var4.f3885e;
            if (!z3) {
                r0Var4.f3883c = interpolator2;
            }
            if (!z3) {
                r0Var4.f3882b = 250;
            }
            C1102s8 s8Var2 = this.f1864w;
            if (!z3) {
                r0Var4.f3884d = s8Var2;
            }
            this.f1861t = r0Var4;
            r0Var4.mo4166b();
        }
    }
}
