package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0449f1;

/* renamed from: j3 */
public class C0661j3 implements C0855n2 {

    /* renamed from: a */
    public Toolbar f2802a;

    /* renamed from: b */
    public int f2803b;

    /* renamed from: c */
    public View f2804c;

    /* renamed from: d */
    public View f2805d;

    /* renamed from: e */
    public Drawable f2806e;

    /* renamed from: f */
    public Drawable f2807f;

    /* renamed from: g */
    public Drawable f2808g;

    /* renamed from: h */
    public boolean f2809h;

    /* renamed from: i */
    public CharSequence f2810i;

    /* renamed from: j */
    public CharSequence f2811j;

    /* renamed from: k */
    public CharSequence f2812k;

    /* renamed from: l */
    public Window.Callback f2813l;

    /* renamed from: m */
    public boolean f2814m;

    /* renamed from: n */
    public C0904o1 f2815n;

    /* renamed from: o */
    public int f2816o = 0;

    /* renamed from: p */
    public Drawable f2817p;

    /* renamed from: j3$a */
    public class C0662a extends C1156t8 {

        /* renamed from: a */
        public boolean f2818a = false;

        /* renamed from: b */
        public final /* synthetic */ int f2819b;

        public C0662a(int i) {
            this.f2819b = i;
        }

        /* renamed from: a */
        public void mo2606a(View view) {
            if (!this.f2818a) {
                C0661j3.this.f2802a.setVisibility(this.f2819b);
            }
        }

        /* renamed from: b */
        public void mo3388b(View view) {
            C0661j3.this.f2802a.setVisibility(0);
        }

        /* renamed from: c */
        public void mo3389c(View view) {
            this.f2818a = true;
        }
    }

    public C0661j3(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f2802a = toolbar;
        this.f2810i = toolbar.getTitle();
        this.f2811j = toolbar.getSubtitle();
        this.f2809h = this.f2810i != null;
        this.f2808g = toolbar.getNavigationIcon();
        String str = null;
        C0555h3 q = C0555h3.m1825q(toolbar.getContext(), (AttributeSet) null, C0440f.f2047a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.f2817p = q.mo3027g(15);
        if (z) {
            CharSequence n = q.mo3034n(27);
            if (!TextUtils.isEmpty(n)) {
                this.f2809h = true;
                this.f2810i = n;
                if ((this.f2803b & 8) != 0) {
                    this.f2802a.setTitle(n);
                }
            }
            CharSequence n2 = q.mo3034n(25);
            if (!TextUtils.isEmpty(n2)) {
                this.f2811j = n2;
                if ((this.f2803b & 8) != 0) {
                    this.f2802a.setSubtitle(n2);
                }
            }
            Drawable g = q.mo3027g(20);
            if (g != null) {
                this.f2807f = g;
                mo3387y();
            }
            Drawable g2 = q.mo3027g(17);
            if (g2 != null) {
                this.f2806e = g2;
                mo3387y();
            }
            if (this.f2808g == null && (drawable = this.f2817p) != null) {
                this.f2808g = drawable;
                mo3386x();
            }
            mo3383u(q.mo3030j(10, 0));
            int l = q.mo3032l(9, 0);
            if (l != 0) {
                View inflate = LayoutInflater.from(this.f2802a.getContext()).inflate(l, this.f2802a, false);
                View view = this.f2805d;
                if (!(view == null || (this.f2803b & 16) == 0)) {
                    this.f2802a.removeView(view);
                }
                this.f2805d = inflate;
                if (!(inflate == null || (this.f2803b & 16) == 0)) {
                    this.f2802a.addView(inflate);
                }
                mo3383u(this.f2803b | 16);
            }
            int k = q.mo3031k(13, 0);
            if (k > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2802a.getLayoutParams();
                layoutParams.height = k;
                this.f2802a.setLayoutParams(layoutParams);
            }
            int e = q.mo3025e(7, -1);
            int e2 = q.mo3025e(3, -1);
            if (e >= 0 || e2 >= 0) {
                Toolbar toolbar2 = this.f2802a;
                int max = Math.max(e, 0);
                int max2 = Math.max(e2, 0);
                toolbar2.mo497d();
                toolbar2.f485u.mo5270a(max, max2);
            }
            int l2 = q.mo3032l(28, 0);
            if (l2 != 0) {
                Toolbar toolbar3 = this.f2802a;
                Context context = toolbar3.getContext();
                toolbar3.f477m = l2;
                TextView textView = toolbar3.f467c;
                if (textView != null) {
                    textView.setTextAppearance(context, l2);
                }
            }
            int l3 = q.mo3032l(26, 0);
            if (l3 != 0) {
                Toolbar toolbar4 = this.f2802a;
                Context context2 = toolbar4.getContext();
                toolbar4.f478n = l3;
                TextView textView2 = toolbar4.f468d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l3);
                }
            }
            int l4 = q.mo3032l(22, 0);
            if (l4 != 0) {
                this.f2802a.setPopupTheme(l4);
            }
        } else {
            if (this.f2802a.getNavigationIcon() != null) {
                this.f2817p = this.f2802a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f2803b = i;
        }
        q.f2425b.recycle();
        if (R.string.abc_action_bar_up_description != this.f2816o) {
            this.f2816o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f2802a.getNavigationContentDescription())) {
                int i2 = this.f2816o;
                this.f2812k = i2 != 0 ? mo3382t().getString(i2) : str;
                mo3385w();
            }
        }
        this.f2812k = this.f2802a.getNavigationContentDescription();
        this.f2802a.setNavigationOnClickListener(new C0600i3(this));
    }

    /* renamed from: a */
    public boolean mo3357a() {
        return this.f2802a.mo586u();
    }

    /* renamed from: b */
    public void mo3358b(Menu menu, C0449f1.C0450a aVar) {
        C0203b1 b1Var;
        if (this.f2815n == null) {
            this.f2815n = new C0904o1(this.f2802a.getContext());
        }
        C0904o1 o1Var = this.f2815n;
        o1Var.f4534f = aVar;
        Toolbar toolbar = this.f2802a;
        C1435z0 z0Var = (C1435z0) menu;
        if (z0Var != null || toolbar.f466b != null) {
            toolbar.mo499f();
            C1435z0 z0Var2 = toolbar.f466b.f301q;
            if (z0Var2 != z0Var) {
                if (z0Var2 != null) {
                    z0Var2.mo5261u(toolbar.f462K);
                    z0Var2.mo5261u(toolbar.f463L);
                }
                if (toolbar.f463L == null) {
                    toolbar.f463L = new Toolbar.C0078d();
                }
                o1Var.f3452r = true;
                if (z0Var != null) {
                    z0Var.mo5235b(o1Var, toolbar.f475k);
                    z0Var.mo5235b(toolbar.f463L, toolbar.f475k);
                } else {
                    o1Var.mo594j(toolbar.f475k, (C1435z0) null);
                    Toolbar.C0078d dVar = toolbar.f463L;
                    C1435z0 z0Var3 = dVar.f494b;
                    if (!(z0Var3 == null || (b1Var = dVar.f495c) == null)) {
                        z0Var3.mo3477d(b1Var);
                    }
                    dVar.f494b = null;
                    o1Var.mo593h(true);
                    toolbar.f463L.mo593h(true);
                }
                toolbar.f466b.setPopupTheme(toolbar.f476l);
                toolbar.f466b.setPresenter(o1Var);
                toolbar.f462K = o1Var;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3359c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f2802a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f466b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            o1 r0 = r0.f305u
            if (r0 == 0) goto L_0x001e
            o1$c r3 = r0.f3457w
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.mo3824m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0661j3.mo3359c():boolean");
    }

    public void collapseActionView() {
        Toolbar.C0078d dVar = this.f2802a.f463L;
        C0203b1 b1Var = dVar == null ? null : dVar.f495c;
        if (b1Var != null) {
            b1Var.collapseActionView();
        }
    }

    /* renamed from: d */
    public void mo3361d() {
        this.f2814m = true;
    }

    /* renamed from: e */
    public boolean mo3362e() {
        return this.f2802a.mo541o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f466b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3363f() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f2802a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f466b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f304t
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0661j3.mo3363f():boolean");
    }

    /* renamed from: g */
    public boolean mo3364g() {
        ActionMenuView actionMenuView = this.f2802a.f466b;
        if (actionMenuView == null) {
            return false;
        }
        C0904o1 o1Var = actionMenuView.f305u;
        if (o1Var != null && o1Var.mo3822i()) {
            return true;
        }
        return false;
    }

    public CharSequence getTitle() {
        return this.f2802a.getTitle();
    }

    /* renamed from: h */
    public void mo3366h() {
        C0904o1 o1Var;
        ActionMenuView actionMenuView = this.f2802a.f466b;
        if (actionMenuView != null && (o1Var = actionMenuView.f305u) != null) {
            o1Var.mo3820a();
        }
    }

    /* renamed from: i */
    public C1049r8 mo3367i(int i, long j) {
        C1049r8 a = C0813m8.m2467a(this.f2802a);
        a.mo4211a(i == 0 ? 1.0f : 0.0f);
        a.mo4213c(j);
        a.mo4214d(new C0662a(i));
        return a;
    }

    /* renamed from: j */
    public int mo3368j() {
        return this.f2803b;
    }

    /* renamed from: k */
    public void mo3369k(int i) {
        this.f2802a.setVisibility(i);
    }

    /* renamed from: l */
    public void mo3370l() {
    }

    /* renamed from: m */
    public boolean mo3371m() {
        Toolbar.C0078d dVar = this.f2802a.f463L;
        return (dVar == null || dVar.f495c == null) ? false : true;
    }

    /* renamed from: n */
    public void mo3372n(int i) {
        this.f2807f = i != 0 ? C0399e0.m1530b(mo3382t(), i) : null;
        mo3387y();
    }

    /* renamed from: o */
    public void mo3373o(C0005a3 a3Var) {
        Toolbar toolbar;
        View view = this.f2804c;
        if (view != null && view.getParent() == (toolbar = this.f2802a)) {
            toolbar.removeView(this.f2804c);
        }
        this.f2804c = null;
    }

    /* renamed from: p */
    public ViewGroup mo3374p() {
        return this.f2802a;
    }

    /* renamed from: q */
    public void mo3375q(boolean z) {
    }

    /* renamed from: r */
    public void mo3376r() {
    }

    /* renamed from: s */
    public void mo3377s(boolean z) {
        this.f2802a.setCollapsible(z);
    }

    public void setIcon(int i) {
        this.f2806e = i != 0 ? C0399e0.m1530b(mo3382t(), i) : null;
        mo3387y();
    }

    public void setIcon(Drawable drawable) {
        this.f2806e = drawable;
        mo3387y();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f2813l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f2809h) {
            this.f2810i = charSequence;
            if ((this.f2803b & 8) != 0) {
                this.f2802a.setTitle(charSequence);
            }
        }
    }

    /* renamed from: t */
    public Context mo3382t() {
        return this.f2802a.getContext();
    }

    /* renamed from: u */
    public void mo3383u(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f2803b ^ i;
        this.f2803b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo3385w();
                }
                mo3386x();
            }
            if ((i2 & 3) != 0) {
                mo3387y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2802a.setTitle(this.f2810i);
                    toolbar = this.f2802a;
                    charSequence = this.f2811j;
                } else {
                    charSequence = null;
                    this.f2802a.setTitle((CharSequence) null);
                    toolbar = this.f2802a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f2805d) != null) {
                if ((i & 16) != 0) {
                    this.f2802a.addView(view);
                } else {
                    this.f2802a.removeView(view);
                }
            }
        }
    }

    /* renamed from: v */
    public int mo3384v() {
        return 0;
    }

    /* renamed from: w */
    public final void mo3385w() {
        if ((this.f2803b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2812k)) {
            this.f2802a.setNavigationContentDescription(this.f2816o);
        } else {
            this.f2802a.setNavigationContentDescription(this.f2812k);
        }
    }

    /* renamed from: x */
    public final void mo3386x() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f2803b & 4) != 0) {
            toolbar = this.f2802a;
            drawable = this.f2808g;
            if (drawable == null) {
                drawable = this.f2817p;
            }
        } else {
            toolbar = this.f2802a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: y */
    public final void mo3387y() {
        Drawable drawable;
        int i = this.f2803b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2807f) == null) {
            drawable = this.f2806e;
        }
        this.f2802a.setLogo(drawable);
    }
}
