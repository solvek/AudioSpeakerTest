package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: q1 */
public class C0998q1 {

    /* renamed from: a */
    public final View f3764a;

    /* renamed from: b */
    public final C1231v1 f3765b;

    /* renamed from: c */
    public int f3766c = -1;

    /* renamed from: d */
    public C0452f3 f3767d;

    /* renamed from: e */
    public C0452f3 f3768e;

    /* renamed from: f */
    public C0452f3 f3769f;

    public C0998q1(View view) {
        this.f3764a = view;
        this.f3765b = C1231v1.m3413a();
    }

    /* renamed from: a */
    public void mo4055a() {
        Drawable background = this.f3764a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f3767d != null) {
                if (this.f3769f == null) {
                    this.f3769f = new C0452f3();
                }
                C0452f3 f3Var = this.f3769f;
                PorterDuff.Mode mode = null;
                f3Var.f2089a = null;
                f3Var.f2092d = false;
                f3Var.f2090b = null;
                f3Var.f2091c = false;
                ColorStateList g = C0813m8.m2473g(this.f3764a);
                if (g != null) {
                    f3Var.f2092d = true;
                    f3Var.f2089a = g;
                }
                View view = this.f3764a;
                if (i >= 21) {
                    mode = view.getBackgroundTintMode();
                } else if (view instanceof C0761l8) {
                    mode = ((C0761l8) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    f3Var.f2091c = true;
                    f3Var.f2090b = mode;
                }
                if (f3Var.f2092d || f3Var.f2091c) {
                    C1231v1.m3416f(background, f3Var, this.f3764a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0452f3 f3Var2 = this.f3768e;
            if (f3Var2 != null) {
                C1231v1.m3416f(background, f3Var2, this.f3764a.getDrawableState());
                return;
            }
            C0452f3 f3Var3 = this.f3767d;
            if (f3Var3 != null) {
                C1231v1.m3416f(background, f3Var3, this.f3764a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public ColorStateList mo4056b() {
        C0452f3 f3Var = this.f3768e;
        if (f3Var != null) {
            return f3Var.f2089a;
        }
        return null;
    }

    /* renamed from: c */
    public PorterDuff.Mode mo4057c() {
        C0452f3 f3Var = this.f3768e;
        if (f3Var != null) {
            return f3Var.f2090b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[Catch:{ all -> 0x0079 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4058d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.view.View r0 = r9.f3764a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p000.C0440f.f2045A
            r8 = 0
            h3 r0 = p000.C0555h3.m1825q(r0, r10, r3, r11, r8)
            android.view.View r1 = r9.f3764a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f2425b
            r7 = 0
            r4 = r10
            r6 = r11
            p000.C0813m8.m2456E(r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = r0.mo3035o(r8)     // Catch:{ all -> 0x0079 }
            r11 = -1
            if (r10 == 0) goto L_0x003b
            int r10 = r0.mo3032l(r8, r11)     // Catch:{ all -> 0x0079 }
            r9.f3766c = r10     // Catch:{ all -> 0x0079 }
            v1 r10 = r9.f3765b     // Catch:{ all -> 0x0079 }
            android.view.View r1 = r9.f3764a     // Catch:{ all -> 0x0079 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0079 }
            int r2 = r9.f3766c     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r10 = r10.mo4803d(r1, r2)     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x003b
            r9.mo4061g(r10)     // Catch:{ all -> 0x0079 }
        L_0x003b:
            r10 = 1
            boolean r1 = r0.mo3035o(r10)     // Catch:{ all -> 0x0079 }
            r2 = 21
            if (r1 == 0) goto L_0x0088
            android.view.View r1 = r9.f3764a     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r3 = r0.mo3023c(r10)     // Catch:{ all -> 0x0079 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0079 }
            if (r4 < r2) goto L_0x007f
            r1.setBackgroundTintList(r3)     // Catch:{ all -> 0x0079 }
            if (r4 != r2) goto L_0x0088
            android.graphics.drawable.Drawable r3 = r1.getBackground()     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r4 = r1.getBackgroundTintList()     // Catch:{ all -> 0x0079 }
            if (r4 != 0) goto L_0x0066
            android.graphics.PorterDuff$Mode r4 = r1.getBackgroundTintMode()     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r4 = 0
            goto L_0x0067
        L_0x0066:
            r4 = 1
        L_0x0067:
            if (r3 == 0) goto L_0x0088
            if (r4 == 0) goto L_0x0088
            boolean r4 = r3.isStateful()     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x007b
            int[] r4 = r1.getDrawableState()     // Catch:{ all -> 0x0079 }
            r3.setState(r4)     // Catch:{ all -> 0x0079 }
            goto L_0x007b
        L_0x0079:
            r10 = move-exception
            goto L_0x00d8
        L_0x007b:
            r1.setBackground(r3)     // Catch:{ all -> 0x0079 }
            goto L_0x0088
        L_0x007f:
            boolean r4 = r1 instanceof p000.C0761l8     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x0088
            l8 r1 = (p000.C0761l8) r1     // Catch:{ all -> 0x0079 }
            r1.setSupportBackgroundTintList(r3)     // Catch:{ all -> 0x0079 }
        L_0x0088:
            r1 = 2
            boolean r3 = r0.mo3035o(r1)     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x00d2
            android.view.View r3 = r9.f3764a     // Catch:{ all -> 0x0079 }
            int r11 = r0.mo3030j(r1, r11)     // Catch:{ all -> 0x0079 }
            r1 = 0
            android.graphics.PorterDuff$Mode r11 = p000.C0912o2.m2667d(r11, r1)     // Catch:{ all -> 0x0079 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0079 }
            if (r1 < r2) goto L_0x00c9
            r3.setBackgroundTintMode(r11)     // Catch:{ all -> 0x0079 }
            if (r1 != r2) goto L_0x00d2
            android.graphics.drawable.Drawable r11 = r3.getBackground()     // Catch:{ all -> 0x0079 }
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x00b3
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x00b4
        L_0x00b3:
            r8 = 1
        L_0x00b4:
            if (r11 == 0) goto L_0x00d2
            if (r8 == 0) goto L_0x00d2
            boolean r10 = r11.isStateful()     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x00c5
            int[] r10 = r3.getDrawableState()     // Catch:{ all -> 0x0079 }
            r11.setState(r10)     // Catch:{ all -> 0x0079 }
        L_0x00c5:
            r3.setBackground(r11)     // Catch:{ all -> 0x0079 }
            goto L_0x00d2
        L_0x00c9:
            boolean r10 = r3 instanceof p000.C0761l8     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x00d2
            l8 r3 = (p000.C0761l8) r3     // Catch:{ all -> 0x0079 }
            r3.setSupportBackgroundTintMode(r11)     // Catch:{ all -> 0x0079 }
        L_0x00d2:
            android.content.res.TypedArray r10 = r0.f2425b
            r10.recycle()
            return
        L_0x00d8:
            android.content.res.TypedArray r11 = r0.f2425b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0998q1.mo4058d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void mo4059e() {
        this.f3766c = -1;
        mo4061g((ColorStateList) null);
        mo4055a();
    }

    /* renamed from: f */
    public void mo4060f(int i) {
        this.f3766c = i;
        C1231v1 v1Var = this.f3765b;
        mo4061g(v1Var != null ? v1Var.mo4803d(this.f3764a.getContext(), i) : null);
        mo4055a();
    }

    /* renamed from: g */
    public void mo4061g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3767d == null) {
                this.f3767d = new C0452f3();
            }
            C0452f3 f3Var = this.f3767d;
            f3Var.f2089a = colorStateList;
            f3Var.f2092d = true;
        } else {
            this.f3767d = null;
        }
        mo4055a();
    }

    /* renamed from: h */
    public void mo4062h(ColorStateList colorStateList) {
        if (this.f3768e == null) {
            this.f3768e = new C0452f3();
        }
        C0452f3 f3Var = this.f3768e;
        f3Var.f2089a = colorStateList;
        f3Var.f2092d = true;
        mo4055a();
    }

    /* renamed from: i */
    public void mo4063i(PorterDuff.Mode mode) {
        if (this.f3768e == null) {
            this.f3768e = new C0452f3();
        }
        C0452f3 f3Var = this.f3768e;
        f3Var.f2090b = mode;
        f3Var.f2091c = true;
        mo4055a();
    }
}
