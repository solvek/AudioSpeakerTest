package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0449f1;

/* renamed from: j1 */
public final class C0657j1 extends C0361d1 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0449f1, View.OnKeyListener {

    /* renamed from: c */
    public final Context f2776c;

    /* renamed from: d */
    public final C1435z0 f2777d;

    /* renamed from: e */
    public final C1394y0 f2778e;

    /* renamed from: f */
    public final boolean f2779f;

    /* renamed from: g */
    public final int f2780g;

    /* renamed from: h */
    public final int f2781h;

    /* renamed from: i */
    public final int f2782i;

    /* renamed from: j */
    public final C1289w2 f2783j;

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f2784k = new C0658a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f2785l = new C0659b();

    /* renamed from: m */
    public PopupWindow.OnDismissListener f2786m;

    /* renamed from: n */
    public View f2787n;

    /* renamed from: o */
    public View f2788o;

    /* renamed from: p */
    public C0449f1.C0450a f2789p;

    /* renamed from: q */
    public ViewTreeObserver f2790q;

    /* renamed from: r */
    public boolean f2791r;

    /* renamed from: s */
    public boolean f2792s;

    /* renamed from: t */
    public int f2793t;

    /* renamed from: u */
    public int f2794u = 0;

    /* renamed from: v */
    public boolean f2795v;

    /* renamed from: j1$a */
    public class C0658a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0658a() {
        }

        public void onGlobalLayout() {
            if (C0657j1.this.mo3108a()) {
                C0657j1 j1Var = C0657j1.this;
                if (!j1Var.f2783j.f4572z) {
                    View view = j1Var.f2788o;
                    if (view == null || !view.isShown()) {
                        C0657j1.this.dismiss();
                    } else {
                        C0657j1.this.f2783j.mo3111i();
                    }
                }
            }
        }
    }

    /* renamed from: j1$b */
    public class C0659b implements View.OnAttachStateChangeListener {
        public C0659b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0657j1.this.f2790q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0657j1.this.f2790q = view.getViewTreeObserver();
                }
                C0657j1 j1Var = C0657j1.this;
                j1Var.f2790q.removeGlobalOnLayoutListener(j1Var.f2784k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0657j1(Context context, C1435z0 z0Var, View view, int i, int i2, boolean z) {
        this.f2776c = context;
        this.f2777d = z0Var;
        this.f2779f = z;
        this.f2778e = new C1394y0(z0Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f2781h = i;
        this.f2782i = i2;
        Resources resources = context.getResources();
        this.f2780g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2787n = view;
        this.f2783j = new C1289w2(context, (AttributeSet) null, i, i2);
        z0Var.mo5235b(this, context);
    }

    /* renamed from: a */
    public boolean mo3108a() {
        return !this.f2791r && this.f2783j.mo3108a();
    }

    /* renamed from: b */
    public void mo589b(C1435z0 z0Var, boolean z) {
        if (z0Var == this.f2777d) {
            dismiss();
            C0449f1.C0450a aVar = this.f2789p;
            if (aVar != null) {
                aVar.mo10b(z0Var, z);
            }
        }
    }

    /* renamed from: d */
    public void mo2761d(C0449f1.C0450a aVar) {
        this.f2789p = aVar;
    }

    public void dismiss() {
        if (mo3108a()) {
            this.f2783j.dismiss();
        }
    }

    /* renamed from: e */
    public ListView mo3110e() {
        return this.f2783j.f4550d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo591f(p000.C0705k1 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            e1 r0 = new e1
            android.content.Context r3 = r9.f2776c
            android.view.View r5 = r9.f2788o
            boolean r6 = r9.f2779f
            int r7 = r9.f2781h
            int r8 = r9.f2782i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            f1$a r2 = r9.f2789p
            r0.mo2677d(r2)
            boolean r2 = p000.C0361d1.m1464v(r10)
            r0.f1943h = r2
            d1 r3 = r0.f1945j
            if (r3 == 0) goto L_0x002a
            r3.mo2625p(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f2786m
            r0.f1946k = r2
            r2 = 0
            r9.f2786m = r2
            z0 r2 = r9.f2777d
            r2.mo5236c(r1)
            w2 r2 = r9.f2783j
            int r3 = r2.f4553g
            boolean r4 = r2.f4556j
            if (r4 != 0) goto L_0x0040
            r2 = 0
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f4554h
        L_0x0042:
            int r4 = r9.f2794u
            android.view.View r5 = r9.f2787n
            int r5 = p000.C0813m8.m2478l(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005a
            android.view.View r4 = r9.f2787n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005a:
            boolean r4 = r0.mo2675b()
            r5 = 1
            if (r4 == 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            android.view.View r4 = r0.f1941f
            if (r4 != 0) goto L_0x0068
            r0 = 0
            goto L_0x006c
        L_0x0068:
            r0.mo2678e(r3, r2, r5, r5)
        L_0x006b:
            r0 = 1
        L_0x006c:
            if (r0 == 0) goto L_0x0076
            f1$a r0 = r9.f2789p
            if (r0 == 0) goto L_0x0075
            r0.mo11c(r10)
        L_0x0075:
            return r5
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0657j1.mo591f(k1):boolean");
    }

    /* renamed from: g */
    public boolean mo592g() {
        return false;
    }

    /* renamed from: h */
    public void mo593h(boolean z) {
        this.f2792s = false;
        C1394y0 y0Var = this.f2778e;
        if (y0Var != null) {
            y0Var.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3111i() {
        /*
            r7 = this;
            boolean r0 = r7.mo3108a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0008:
            r1 = 1
            goto L_0x00c7
        L_0x000b:
            boolean r0 = r7.f2791r
            if (r0 != 0) goto L_0x00c7
            android.view.View r0 = r7.f2787n
            if (r0 != 0) goto L_0x0015
            goto L_0x00c7
        L_0x0015:
            r7.f2788o = r0
            w2 r0 = r7.f2783j
            android.widget.PopupWindow r0 = r0.f4547A
            r0.setOnDismissListener(r7)
            w2 r0 = r7.f2783j
            r0.f4564r = r7
            r0.mo4751s(r2)
            android.view.View r0 = r7.f2788o
            android.view.ViewTreeObserver r3 = r7.f2790q
            if (r3 != 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f2790q = r4
            if (r3 == 0) goto L_0x003b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f2784k
            r4.addOnGlobalLayoutListener(r3)
        L_0x003b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f2785l
            r0.addOnAttachStateChangeListener(r3)
            w2 r3 = r7.f2783j
            r3.f4563q = r0
            int r0 = r7.f2794u
            r3.f4559m = r0
            boolean r0 = r7.f2792s
            r3 = 0
            if (r0 != 0) goto L_0x005b
            y0 r0 = r7.f2778e
            android.content.Context r4 = r7.f2776c
            int r5 = r7.f2780g
            int r0 = p000.C0361d1.m1463n(r0, r3, r4, r5)
            r7.f2793t = r0
            r7.f2792s = r2
        L_0x005b:
            w2 r0 = r7.f2783j
            int r4 = r7.f2793t
            r0.mo4750r(r4)
            w2 r0 = r7.f2783j
            r4 = 2
            android.widget.PopupWindow r0 = r0.f4547A
            r0.setInputMethodMode(r4)
            w2 r0 = r7.f2783j
            android.graphics.Rect r4 = r7.f1875b
            r0.getClass()
            if (r4 == 0) goto L_0x0079
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L_0x007a
        L_0x0079:
            r5 = r3
        L_0x007a:
            r0.f4571y = r5
            w2 r0 = r7.f2783j
            r0.mo3111i()
            w2 r0 = r7.f2783j
            p2 r0 = r0.f4550d
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f2795v
            if (r4 == 0) goto L_0x00b9
            z0 r4 = r7.f2777d
            java.lang.CharSequence r4 = r4.f5237m
            if (r4 == 0) goto L_0x00b9
            android.content.Context r4 = r7.f2776c
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131427346(0x7f0b0012, float:1.8476306E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00b3
            z0 r6 = r7.f2777d
            java.lang.CharSequence r6 = r6.f5237m
            r5.setText(r6)
        L_0x00b3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        L_0x00b9:
            w2 r0 = r7.f2783j
            y0 r1 = r7.f2778e
            r0.mo2898o(r1)
            w2 r0 = r7.f2783j
            r0.mo3111i()
            goto L_0x0008
        L_0x00c7:
            if (r1 == 0) goto L_0x00ca
            return
        L_0x00ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            goto L_0x00d3
        L_0x00d2:
            throw r0
        L_0x00d3:
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0657j1.mo3111i():void");
    }

    /* renamed from: l */
    public void mo2621l(C1435z0 z0Var) {
    }

    /* renamed from: o */
    public void mo2623o(View view) {
        this.f2787n = view;
    }

    public void onDismiss() {
        this.f2791r = true;
        this.f2777d.mo5236c(true);
        ViewTreeObserver viewTreeObserver = this.f2790q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2790q = this.f2788o.getViewTreeObserver();
            }
            this.f2790q.removeGlobalOnLayoutListener(this.f2784k);
            this.f2790q = null;
        }
        this.f2788o.removeOnAttachStateChangeListener(this.f2785l);
        PopupWindow.OnDismissListener onDismissListener = this.f2786m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo2625p(boolean z) {
        this.f2778e.f5149d = z;
    }

    /* renamed from: q */
    public void mo2626q(int i) {
        this.f2794u = i;
    }

    /* renamed from: r */
    public void mo2627r(int i) {
        this.f2783j.f4553g = i;
    }

    /* renamed from: s */
    public void mo2628s(PopupWindow.OnDismissListener onDismissListener) {
        this.f2786m = onDismissListener;
    }

    /* renamed from: t */
    public void mo2629t(boolean z) {
        this.f2795v = z;
    }

    /* renamed from: u */
    public void mo2630u(int i) {
        C1289w2 w2Var = this.f2783j;
        w2Var.f4554h = i;
        w2Var.f4556j = true;
    }
}
