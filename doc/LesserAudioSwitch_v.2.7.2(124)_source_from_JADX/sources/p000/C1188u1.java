package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: u1 */
public class C1188u1 {

    /* renamed from: a */
    public final CompoundButton f4538a;

    /* renamed from: b */
    public ColorStateList f4539b = null;

    /* renamed from: c */
    public PorterDuff.Mode f4540c = null;

    /* renamed from: d */
    public boolean f4541d = false;

    /* renamed from: e */
    public boolean f4542e = false;

    /* renamed from: f */
    public boolean f4543f;

    public C1188u1(CompoundButton compoundButton) {
        this.f4538a = compoundButton;
    }

    /* renamed from: a */
    public void mo4740a() {
        Drawable u = C1344x5.m3776u(this.f4538a);
        if (u == null) {
            return;
        }
        if (this.f4541d || this.f4542e) {
            Drawable mutate = C1344x5.m3764j0(u).mutate();
            if (this.f4541d) {
                C1344x5.m3752d0(mutate, this.f4539b);
            }
            if (this.f4542e) {
                C1344x5.m3754e0(mutate, this.f4540c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f4538a.getDrawableState());
            }
            this.f4538a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = p000.C1344x5.m3776u(r2.f4538a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4741b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f4538a
            android.graphics.drawable.Drawable r0 = p000.C1344x5.m3776u(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1188u1.mo4741b(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC, Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[Catch:{ all -> 0x0089 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4742c(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f4538a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p000.C0440f.f2058l
            r8 = 0
            h3 r0 = p000.C0555h3.m1825q(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f4538a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f2425b
            r7 = 0
            r4 = r10
            r6 = r11
            p000.C0813m8.m2456E(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.mo3035o(r10)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x0036
            int r11 = r0.mo3032l(r10, r8)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x0036
            android.widget.CompoundButton r1 = r9.f4538a     // Catch:{ NotFoundException -> 0x0036 }
            android.content.Context r2 = r1.getContext()     // Catch:{ NotFoundException -> 0x0036 }
            android.graphics.drawable.Drawable r11 = p000.C0399e0.m1530b(r2, r11)     // Catch:{ NotFoundException -> 0x0036 }
            r1.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 != 0) goto L_0x0052
            boolean r10 = r0.mo3035o(r8)     // Catch:{ all -> 0x0089 }
            if (r10 == 0) goto L_0x0052
            int r10 = r0.mo3032l(r8, r8)     // Catch:{ all -> 0x0089 }
            if (r10 == 0) goto L_0x0052
            android.widget.CompoundButton r11 = r9.f4538a     // Catch:{ all -> 0x0089 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0089 }
            android.graphics.drawable.Drawable r10 = p000.C0399e0.m1530b(r1, r10)     // Catch:{ all -> 0x0089 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0089 }
        L_0x0052:
            r10 = 2
            boolean r11 = r0.mo3035o(r10)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x0062
            android.widget.CompoundButton r11 = r9.f4538a     // Catch:{ all -> 0x0089 }
            android.content.res.ColorStateList r10 = r0.mo3023c(r10)     // Catch:{ all -> 0x0089 }
            p000.C1344x5.m3735Q(r11, r10)     // Catch:{ all -> 0x0089 }
        L_0x0062:
            r10 = 3
            boolean r11 = r0.mo3035o(r10)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x008b
            android.widget.CompoundButton r11 = r9.f4538a     // Catch:{ all -> 0x0089 }
            r1 = -1
            int r10 = r0.mo3030j(r10, r1)     // Catch:{ all -> 0x0089 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = p000.C0912o2.m2667d(r10, r1)     // Catch:{ all -> 0x0089 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0089 }
            r2 = 21
            if (r1 < r2) goto L_0x007f
            r11.setButtonTintMode(r10)     // Catch:{ all -> 0x0089 }
            goto L_0x008b
        L_0x007f:
            boolean r1 = r11 instanceof p000.C0411e9     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x008b
            e9 r11 = (p000.C0411e9) r11     // Catch:{ all -> 0x0089 }
            r11.setSupportButtonTintMode(r10)     // Catch:{ all -> 0x0089 }
            goto L_0x008b
        L_0x0089:
            r10 = move-exception
            goto L_0x0091
        L_0x008b:
            android.content.res.TypedArray r10 = r0.f2425b
            r10.recycle()
            return
        L_0x0091:
            android.content.res.TypedArray r11 = r0.f2425b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1188u1.mo4742c(android.util.AttributeSet, int):void");
    }
}
