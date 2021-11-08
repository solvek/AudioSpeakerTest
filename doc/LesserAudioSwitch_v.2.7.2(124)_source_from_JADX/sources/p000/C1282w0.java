package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;
import p000.C0449f1;

/* renamed from: w0 */
public final class C1282w0 extends C0361d1 implements C0449f1, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public PopupWindow.OnDismissListener f4854A;

    /* renamed from: B */
    public boolean f4855B;

    /* renamed from: c */
    public final Context f4856c;

    /* renamed from: d */
    public final int f4857d;

    /* renamed from: e */
    public final int f4858e;

    /* renamed from: f */
    public final int f4859f;

    /* renamed from: g */
    public final boolean f4860g;

    /* renamed from: h */
    public final Handler f4861h;

    /* renamed from: i */
    public final List<C1435z0> f4862i = new ArrayList();

    /* renamed from: j */
    public final List<C1287d> f4863j = new ArrayList();

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f4864k = new C1283a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f4865l = new C1284b();

    /* renamed from: m */
    public final C1233v2 f4866m = new C1285c();

    /* renamed from: n */
    public int f4867n;

    /* renamed from: o */
    public int f4868o;

    /* renamed from: p */
    public View f4869p;

    /* renamed from: q */
    public View f4870q;

    /* renamed from: r */
    public int f4871r;

    /* renamed from: s */
    public boolean f4872s;

    /* renamed from: t */
    public boolean f4873t;

    /* renamed from: u */
    public int f4874u;

    /* renamed from: v */
    public int f4875v;

    /* renamed from: w */
    public boolean f4876w;

    /* renamed from: x */
    public boolean f4877x;

    /* renamed from: y */
    public C0449f1.C0450a f4878y;

    /* renamed from: z */
    public ViewTreeObserver f4879z;

    /* renamed from: w0$a */
    public class C1283a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C1283a() {
        }

        public void onGlobalLayout() {
            if (C1282w0.this.mo3108a() && C1282w0.this.f4863j.size() > 0 && !C1282w0.this.f4863j.get(0).f4887a.f4572z) {
                View view = C1282w0.this.f4870q;
                if (view == null || !view.isShown()) {
                    C1282w0.this.dismiss();
                    return;
                }
                for (C1287d dVar : C1282w0.this.f4863j) {
                    dVar.f4887a.mo3111i();
                }
            }
        }
    }

    /* renamed from: w0$b */
    public class C1284b implements View.OnAttachStateChangeListener {
        public C1284b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C1282w0.this.f4879z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C1282w0.this.f4879z = view.getViewTreeObserver();
                }
                C1282w0 w0Var = C1282w0.this;
                w0Var.f4879z.removeGlobalOnLayoutListener(w0Var.f4864k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: w0$c */
    public class C1285c implements C1233v2 {

        /* renamed from: w0$c$a */
        public class C1286a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C1287d f4883b;

            /* renamed from: c */
            public final /* synthetic */ MenuItem f4884c;

            /* renamed from: d */
            public final /* synthetic */ C1435z0 f4885d;

            public C1286a(C1287d dVar, MenuItem menuItem, C1435z0 z0Var) {
                this.f4883b = dVar;
                this.f4884c = menuItem;
                this.f4885d = z0Var;
            }

            public void run() {
                C1287d dVar = this.f4883b;
                if (dVar != null) {
                    C1282w0.this.f4855B = true;
                    dVar.f4888b.mo5236c(false);
                    C1282w0.this.f4855B = false;
                }
                if (this.f4884c.isEnabled() && this.f4884c.hasSubMenu()) {
                    this.f4885d.mo5252r(this.f4884c, 4);
                }
            }
        }

        public C1285c() {
        }

        /* renamed from: g */
        public void mo4808g(C1435z0 z0Var, MenuItem menuItem) {
            C1287d dVar = null;
            C1282w0.this.f4861h.removeCallbacksAndMessages((Object) null);
            int size = C1282w0.this.f4863j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (z0Var == C1282w0.this.f4863j.get(i).f4888b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C1282w0.this.f4863j.size()) {
                    dVar = C1282w0.this.f4863j.get(i2);
                }
                C1282w0.this.f4861h.postAtTime(new C1286a(dVar, menuItem, z0Var), z0Var, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: k */
        public void mo4809k(C1435z0 z0Var, MenuItem menuItem) {
            C1282w0.this.f4861h.removeCallbacksAndMessages(z0Var);
        }
    }

    /* renamed from: w0$d */
    public static class C1287d {

        /* renamed from: a */
        public final C1289w2 f4887a;

        /* renamed from: b */
        public final C1435z0 f4888b;

        /* renamed from: c */
        public final int f4889c;

        public C1287d(C1289w2 w2Var, C1435z0 z0Var, int i) {
            this.f4887a = w2Var;
            this.f4888b = z0Var;
            this.f4889c = i;
        }
    }

    public C1282w0(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f4867n = 0;
        this.f4868o = 0;
        this.f4856c = context;
        this.f4869p = view;
        this.f4858e = i;
        this.f4859f = i2;
        this.f4860g = z;
        this.f4876w = false;
        this.f4871r = C0813m8.m2478l(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f4857d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4861h = new Handler();
    }

    /* renamed from: a */
    public boolean mo3108a() {
        return this.f4863j.size() > 0 && this.f4863j.get(0).f4887a.mo3108a();
    }

    /* renamed from: b */
    public void mo589b(C1435z0 z0Var, boolean z) {
        int i;
        int size = this.f4863j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (z0Var == this.f4863j.get(i2).f4888b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.f4863j.size()) {
                this.f4863j.get(i3).f4888b.mo5236c(false);
            }
            C1287d remove = this.f4863j.remove(i2);
            remove.f4888b.mo5261u(this);
            if (this.f4855B) {
                C1289w2 w2Var = remove.f4887a;
                w2Var.getClass();
                if (Build.VERSION.SDK_INT >= 23) {
                    w2Var.f4547A.setExitTransition((Transition) null);
                }
                remove.f4887a.f4547A.setAnimationStyle(0);
            }
            remove.f4887a.dismiss();
            int size2 = this.f4863j.size();
            if (size2 > 0) {
                i = this.f4863j.get(size2 - 1).f4889c;
            } else {
                i = C0813m8.m2478l(this.f4869p) == 1 ? 0 : 1;
            }
            this.f4871r = i;
            if (size2 == 0) {
                dismiss();
                C0449f1.C0450a aVar = this.f4878y;
                if (aVar != null) {
                    aVar.mo10b(z0Var, true);
                }
                ViewTreeObserver viewTreeObserver = this.f4879z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f4879z.removeGlobalOnLayoutListener(this.f4864k);
                    }
                    this.f4879z = null;
                }
                this.f4870q.removeOnAttachStateChangeListener(this.f4865l);
                this.f4854A.onDismiss();
            } else if (z) {
                this.f4863j.get(0).f4888b.mo5236c(false);
            }
        }
    }

    /* renamed from: d */
    public void mo2761d(C0449f1.C0450a aVar) {
        this.f4878y = aVar;
    }

    public void dismiss() {
        int size = this.f4863j.size();
        if (size > 0) {
            C1287d[] dVarArr = (C1287d[]) this.f4863j.toArray(new C1287d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1287d dVar = dVarArr[i];
                if (dVar.f4887a.mo3108a()) {
                    dVar.f4887a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public ListView mo3110e() {
        if (this.f4863j.isEmpty()) {
            return null;
        }
        List<C1287d> list = this.f4863j;
        return list.get(list.size() - 1).f4887a.f4550d;
    }

    /* renamed from: f */
    public boolean mo591f(C0705k1 k1Var) {
        for (C1287d next : this.f4863j) {
            if (k1Var == next.f4888b) {
                next.f4887a.f4550d.requestFocus();
                return true;
            }
        }
        if (!k1Var.hasVisibleItems()) {
            return false;
        }
        k1Var.mo5235b(this, this.f4856c);
        if (mo3108a()) {
            mo4930w(k1Var);
        } else {
            this.f4862i.add(k1Var);
        }
        C0449f1.C0450a aVar = this.f4878y;
        if (aVar != null) {
            aVar.mo11c(k1Var);
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo592g() {
        return false;
    }

    /* renamed from: h */
    public void mo593h(boolean z) {
        for (C1287d dVar : this.f4863j) {
            ListAdapter adapter = dVar.f4887a.f4550d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1394y0) adapter).notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public void mo3111i() {
        if (!mo3108a()) {
            for (C1435z0 w : this.f4862i) {
                mo4930w(w);
            }
            this.f4862i.clear();
            View view = this.f4869p;
            this.f4870q = view;
            if (view != null) {
                boolean z = this.f4879z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f4879z = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f4864k);
                }
                this.f4870q.addOnAttachStateChangeListener(this.f4865l);
            }
        }
    }

    /* renamed from: l */
    public void mo2621l(C1435z0 z0Var) {
        z0Var.mo5235b(this, this.f4856c);
        if (mo3108a()) {
            mo4930w(z0Var);
        } else {
            this.f4862i.add(z0Var);
        }
    }

    /* renamed from: m */
    public boolean mo2622m() {
        return false;
    }

    /* renamed from: o */
    public void mo2623o(View view) {
        if (this.f4869p != view) {
            this.f4869p = view;
            this.f4868o = C1344x5.m3775t(this.f4867n, C0813m8.m2478l(view));
        }
    }

    public void onDismiss() {
        C1287d dVar;
        int size = this.f4863j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f4863j.get(i);
            if (!dVar.f4887a.mo3108a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f4888b.mo5236c(false);
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
        this.f4876w = z;
    }

    /* renamed from: q */
    public void mo2626q(int i) {
        if (this.f4867n != i) {
            this.f4867n = i;
            this.f4868o = C1344x5.m3775t(i, C0813m8.m2478l(this.f4869p));
        }
    }

    /* renamed from: r */
    public void mo2627r(int i) {
        this.f4872s = true;
        this.f4874u = i;
    }

    /* renamed from: s */
    public void mo2628s(PopupWindow.OnDismissListener onDismissListener) {
        this.f4854A = onDismissListener;
    }

    /* renamed from: t */
    public void mo2629t(boolean z) {
        this.f4877x = z;
    }

    /* renamed from: u */
    public void mo2630u(int i) {
        this.f4873t = true;
        this.f4875v = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        if (((r10.getWidth() + r12[0]) + r4) > r11.right) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0148, code lost:
        if ((r12[0] - r4) < 0) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01eb  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4930w(p000.C1435z0 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f4856c
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            y0 r3 = new y0
            boolean r4 = r0.f4860g
            r5 = 2131427339(0x7f0b000b, float:1.8476291E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.mo3108a()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.f4876w
            if (r4 == 0) goto L_0x0022
            r3.f5149d = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.mo3108a()
            if (r4 == 0) goto L_0x002e
            boolean r4 = p000.C0361d1.m1464v(r17)
            r3.f5149d = r4
        L_0x002e:
            android.content.Context r4 = r0.f4856c
            int r6 = r0.f4857d
            r7 = 0
            int r4 = p000.C0361d1.m1463n(r3, r7, r4, r6)
            w2 r6 = new w2
            android.content.Context r8 = r0.f4856c
            int r9 = r0.f4858e
            int r10 = r0.f4859f
            r6.<init>(r8, r7, r9, r10)
            v2 r8 = r0.f4866m
            r6.f4894E = r8
            r6.f4564r = r0
            android.widget.PopupWindow r8 = r6.f4547A
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.f4869p
            r6.f4563q = r8
            int r8 = r0.f4868o
            r6.f4559m = r8
            r6.mo4751s(r5)
            android.widget.PopupWindow r8 = r6.f4547A
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.mo2898o(r3)
            r6.mo4750r(r4)
            int r3 = r0.f4868o
            r6.f4559m = r3
            java.util.List<w0$d> r3 = r0.f4863j
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e6
            java.util.List<w0$d> r3 = r0.f4863j
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            w0$d r3 = (p000.C1282w0.C1287d) r3
            z0 r10 = r3.f4888b
            int r11 = r10.size()
            r12 = 0
        L_0x0085:
            if (r12 >= r11) goto L_0x009b
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0098
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            goto L_0x0085
        L_0x009b:
            r13 = r7
        L_0x009c:
            if (r13 != 0) goto L_0x009f
            goto L_0x00e8
        L_0x009f:
            w2 r10 = r3.f4887a
            p2 r10 = r10.f4550d
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b8
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            y0 r11 = (p000.C1394y0) r11
            goto L_0x00bb
        L_0x00b8:
            y0 r11 = (p000.C1394y0) r11
            r12 = 0
        L_0x00bb:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00c0:
            r9 = -1
            if (r15 >= r14) goto L_0x00ce
            b1 r7 = r11.getItem(r15)
            if (r13 != r7) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00c0
        L_0x00ce:
            r15 = -1
        L_0x00cf:
            if (r15 != r9) goto L_0x00d2
            goto L_0x00e7
        L_0x00d2:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e7
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e8
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            r7 = 0
        L_0x00e8:
            if (r7 == 0) goto L_0x01af
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0102
            java.lang.reflect.Method r9 = p000.C1289w2.f4893F
            if (r9 == 0) goto L_0x0107
            android.widget.PopupWindow r10 = r6.f4547A     // Catch:{ Exception -> 0x0100 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0100 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0100 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0100 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0100 }
            goto L_0x0107
        L_0x0100:
            goto L_0x0107
        L_0x0102:
            android.widget.PopupWindow r9 = r6.f4547A
            r9.setTouchModal(r8)
        L_0x0107:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x0113
            android.widget.PopupWindow r10 = r6.f4547A
            r11 = 0
            r10.setEnterTransition(r11)
        L_0x0113:
            java.util.List<w0$d> r10 = r0.f4863j
            int r11 = r10.size()
            int r11 = r11 - r5
            java.lang.Object r10 = r10.get(r11)
            w0$d r10 = (p000.C1282w0.C1287d) r10
            w2 r10 = r10.f4887a
            p2 r10 = r10.f4550d
            r11 = 2
            int[] r12 = new int[r11]
            r10.getLocationOnScreen(r12)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r13 = r0.f4870q
            r13.getWindowVisibleDisplayFrame(r11)
            int r13 = r0.f4871r
            if (r13 != r5) goto L_0x0145
            r12 = r12[r8]
            int r10 = r10.getWidth()
            int r10 = r10 + r12
            int r10 = r10 + r4
            int r11 = r11.right
            if (r10 <= r11) goto L_0x014a
            goto L_0x014c
        L_0x0145:
            r10 = r12[r8]
            int r10 = r10 - r4
            if (r10 >= 0) goto L_0x014c
        L_0x014a:
            r10 = 1
            goto L_0x014d
        L_0x014c:
            r10 = 0
        L_0x014d:
            if (r10 != r5) goto L_0x0151
            r11 = 1
            goto L_0x0152
        L_0x0151:
            r11 = 0
        L_0x0152:
            r0.f4871r = r10
            r10 = 26
            r12 = 5
            if (r9 < r10) goto L_0x015e
            r6.f4563q = r7
            r9 = 0
            r13 = 0
            goto L_0x018f
        L_0x015e:
            r9 = 2
            int[] r10 = new int[r9]
            android.view.View r13 = r0.f4869p
            r13.getLocationOnScreen(r10)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.f4868o
            r13 = r13 & 7
            if (r13 != r12) goto L_0x0185
            r13 = r10[r8]
            android.view.View r14 = r0.f4869p
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r10[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x0185:
            r13 = r9[r8]
            r14 = r10[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r10 = r10[r5]
            int r9 = r9 - r10
        L_0x018f:
            int r10 = r0.f4868o
            r10 = r10 & r12
            if (r10 != r12) goto L_0x019c
            if (r11 == 0) goto L_0x0197
            goto L_0x01a2
        L_0x0197:
            int r4 = r7.getWidth()
            goto L_0x01a4
        L_0x019c:
            if (r11 == 0) goto L_0x01a4
            int r4 = r7.getWidth()
        L_0x01a2:
            int r13 = r13 + r4
            goto L_0x01a5
        L_0x01a4:
            int r13 = r13 - r4
        L_0x01a5:
            r6.f4553g = r13
            r6.f4558l = r5
            r6.f4557k = r5
            r6.mo4747m(r9)
            goto L_0x01cd
        L_0x01af:
            boolean r4 = r0.f4872s
            if (r4 == 0) goto L_0x01b7
            int r4 = r0.f4874u
            r6.f4553g = r4
        L_0x01b7:
            boolean r4 = r0.f4873t
            if (r4 == 0) goto L_0x01c0
            int r4 = r0.f4875v
            r6.mo4747m(r4)
        L_0x01c0:
            android.graphics.Rect r4 = r0.f1875b
            if (r4 == 0) goto L_0x01ca
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r4)
            goto L_0x01cb
        L_0x01ca:
            r11 = 0
        L_0x01cb:
            r6.f4571y = r11
        L_0x01cd:
            w0$d r4 = new w0$d
            int r5 = r0.f4871r
            r4.<init>(r6, r1, r5)
            java.util.List<w0$d> r5 = r0.f4863j
            r5.add(r4)
            r6.mo3111i()
            p2 r4 = r6.f4550d
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x020c
            boolean r3 = r0.f4877x
            if (r3 == 0) goto L_0x020c
            java.lang.CharSequence r3 = r1.f5237m
            if (r3 == 0) goto L_0x020c
            r3 = 2131427346(0x7f0b0012, float:1.8476306E38)
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f5237m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.mo3111i()
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1282w0.mo4930w(z0):void");
    }
}
