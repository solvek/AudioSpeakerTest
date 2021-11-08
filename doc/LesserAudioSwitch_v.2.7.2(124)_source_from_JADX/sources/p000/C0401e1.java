package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import p000.C0449f1;

/* renamed from: e1 */
public class C0401e1 {

    /* renamed from: a */
    public final Context f1936a;

    /* renamed from: b */
    public final C1435z0 f1937b;

    /* renamed from: c */
    public final boolean f1938c;

    /* renamed from: d */
    public final int f1939d;

    /* renamed from: e */
    public final int f1940e;

    /* renamed from: f */
    public View f1941f;

    /* renamed from: g */
    public int f1942g = 8388611;

    /* renamed from: h */
    public boolean f1943h;

    /* renamed from: i */
    public C0449f1.C0450a f1944i;

    /* renamed from: j */
    public C0361d1 f1945j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f1946k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f1947l = new C0402a();

    /* renamed from: e1$a */
    public class C0402a implements PopupWindow.OnDismissListener {
        public C0402a() {
        }

        public void onDismiss() {
            C0401e1.this.mo2676c();
        }
    }

    public C0401e1(Context context, C1435z0 z0Var, View view, boolean z, int i, int i2) {
        this.f1936a = context;
        this.f1937b = z0Var;
        this.f1941f = view;
        this.f1938c = z;
        this.f1939d = i;
        this.f1940e = i2;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [f1, d1] */
    /* JADX WARNING: type inference failed for: r7v1, types: [j1] */
    /* JADX WARNING: type inference failed for: r1v13, types: [w0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.C0361d1 mo2674a() {
        /*
            r14 = this;
            d1 r0 = r14.f1945j
            if (r0 != 0) goto L_0x0083
            android.content.Context r0 = r14.f1936a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0021
            r0.getRealSize(r1)
            goto L_0x0024
        L_0x0021:
            r0.getSize(r1)
        L_0x0024:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1936a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099670(0x7f060016, float:1.78117E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0051
            w0 r0 = new w0
            android.content.Context r2 = r14.f1936a
            android.view.View r3 = r14.f1941f
            int r4 = r14.f1939d
            int r5 = r14.f1940e
            boolean r6 = r14.f1938c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0063
        L_0x0051:
            j1 r0 = new j1
            android.content.Context r8 = r14.f1936a
            z0 r9 = r14.f1937b
            android.view.View r10 = r14.f1941f
            int r11 = r14.f1939d
            int r12 = r14.f1940e
            boolean r13 = r14.f1938c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0063:
            z0 r1 = r14.f1937b
            r0.mo2621l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1947l
            r0.mo2628s(r1)
            android.view.View r1 = r14.f1941f
            r0.mo2623o(r1)
            f1$a r1 = r14.f1944i
            r0.mo2761d(r1)
            boolean r1 = r14.f1943h
            r0.mo2625p(r1)
            int r1 = r14.f1942g
            r0.mo2626q(r1)
            r14.f1945j = r0
        L_0x0083:
            d1 r0 = r14.f1945j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0401e1.mo2674a():d1");
    }

    /* renamed from: b */
    public boolean mo2675b() {
        C0361d1 d1Var = this.f1945j;
        return d1Var != null && d1Var.mo3108a();
    }

    /* renamed from: c */
    public void mo2676c() {
        this.f1945j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1946k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public void mo2677d(C0449f1.C0450a aVar) {
        this.f1944i = aVar;
        C0361d1 d1Var = this.f1945j;
        if (d1Var != null) {
            d1Var.mo2761d(aVar);
        }
    }

    /* renamed from: e */
    public final void mo2678e(int i, int i2, boolean z, boolean z2) {
        C0361d1 a = mo2674a();
        a.mo2629t(z2);
        if (z) {
            if ((C1344x5.m3775t(this.f1942g, C0813m8.m2478l(this.f1941f)) & 7) == 5) {
                i -= this.f1941f.getWidth();
            }
            a.mo2627r(i);
            a.mo2630u(i2);
            int i3 = (int) ((this.f1936a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f1875b = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.mo3111i();
    }

    /* renamed from: f */
    public boolean mo2679f() {
        if (mo2675b()) {
            return true;
        }
        if (this.f1941f == null) {
            return false;
        }
        mo2678e(0, 0, false, false);
        return true;
    }
}
