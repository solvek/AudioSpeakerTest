package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000.C1266vk;

/* renamed from: ti */
public class C1170ti extends C1067rl implements C1400y6, Drawable.Callback, C1266vk.C1268b {

    /* renamed from: I0 */
    public static final int[] f4445I0 = {16842910};

    /* renamed from: J0 */
    public static final ShapeDrawable f4446J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public ColorStateList f4447A;

    /* renamed from: A0 */
    public int[] f4448A0;

    /* renamed from: B */
    public float f4449B;

    /* renamed from: B0 */
    public boolean f4450B0;

    /* renamed from: C */
    public float f4451C = -1.0f;

    /* renamed from: C0 */
    public ColorStateList f4452C0;

    /* renamed from: D */
    public ColorStateList f4453D;

    /* renamed from: D0 */
    public WeakReference<C1171a> f4454D0 = new WeakReference<>((Object) null);

    /* renamed from: E */
    public float f4455E;

    /* renamed from: E0 */
    public TextUtils.TruncateAt f4456E0;

    /* renamed from: F */
    public ColorStateList f4457F;

    /* renamed from: F0 */
    public boolean f4458F0;

    /* renamed from: G */
    public CharSequence f4459G;

    /* renamed from: G0 */
    public int f4460G0;

    /* renamed from: H */
    public boolean f4461H;

    /* renamed from: H0 */
    public boolean f4462H0;

    /* renamed from: I */
    public Drawable f4463I;

    /* renamed from: J */
    public ColorStateList f4464J;

    /* renamed from: K */
    public float f4465K;

    /* renamed from: L */
    public boolean f4466L;

    /* renamed from: M */
    public boolean f4467M;

    /* renamed from: N */
    public Drawable f4468N;

    /* renamed from: O */
    public Drawable f4469O;

    /* renamed from: P */
    public ColorStateList f4470P;

    /* renamed from: Q */
    public float f4471Q;

    /* renamed from: R */
    public CharSequence f4472R;

    /* renamed from: S */
    public boolean f4473S;

    /* renamed from: T */
    public boolean f4474T;

    /* renamed from: U */
    public Drawable f4475U;

    /* renamed from: V */
    public ColorStateList f4476V;

    /* renamed from: W */
    public C1121sh f4477W;

    /* renamed from: X */
    public C1121sh f4478X;

    /* renamed from: Y */
    public float f4479Y;

    /* renamed from: Z */
    public float f4480Z;

    /* renamed from: a0 */
    public float f4481a0;

    /* renamed from: b0 */
    public float f4482b0;

    /* renamed from: c0 */
    public float f4483c0;

    /* renamed from: d0 */
    public float f4484d0;

    /* renamed from: e0 */
    public float f4485e0;

    /* renamed from: f0 */
    public float f4486f0;

    /* renamed from: g0 */
    public final Context f4487g0;

    /* renamed from: h0 */
    public final Paint f4488h0 = new Paint(1);

    /* renamed from: i0 */
    public final Paint.FontMetrics f4489i0 = new Paint.FontMetrics();

    /* renamed from: j0 */
    public final RectF f4490j0 = new RectF();

    /* renamed from: k0 */
    public final PointF f4491k0 = new PointF();

    /* renamed from: l0 */
    public final Path f4492l0 = new Path();

    /* renamed from: m0 */
    public final C1266vk f4493m0;

    /* renamed from: n0 */
    public int f4494n0;

    /* renamed from: o0 */
    public int f4495o0;

    /* renamed from: p0 */
    public int f4496p0;

    /* renamed from: q0 */
    public int f4497q0;

    /* renamed from: r0 */
    public int f4498r0;

    /* renamed from: s0 */
    public int f4499s0;

    /* renamed from: t0 */
    public boolean f4500t0;

    /* renamed from: u0 */
    public int f4501u0;

    /* renamed from: v0 */
    public int f4502v0 = 255;

    /* renamed from: w0 */
    public ColorFilter f4503w0;

    /* renamed from: x0 */
    public PorterDuffColorFilter f4504x0;

    /* renamed from: y0 */
    public ColorStateList f4505y0;

    /* renamed from: z */
    public ColorStateList f4506z;

    /* renamed from: z0 */
    public PorterDuff.Mode f4507z0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ti$a */
    public interface C1171a {
        /* renamed from: a */
        void mo1992a();
    }

    public C1170ti(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C1217ul.m3398b(context, attributeSet, i, i2).mo4783a());
        this.f3979b.f4003b = new C0383dk(context);
        mo4309w();
        this.f4487g0 = context;
        C1266vk vkVar = new C1266vk(this);
        this.f4493m0 = vkVar;
        this.f4459G = "";
        vkVar.f4819a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4445I0;
        setState(iArr);
        mo4701c0(iArr);
        this.f4458F0 = true;
        if (C0643il.f2756a) {
            f4446J0.setTint(-1);
        }
    }

    /* renamed from: F */
    public static boolean m3289F(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: G */
    public static boolean m3290G(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void mo4674A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo4721p0()) {
            float f = this.f4486f0 + this.f4485e0;
            if (C1344x5.m3780y(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f4471Q;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f4471Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f4471Q;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: B */
    public final void mo4675B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo4721p0()) {
            float f = this.f4486f0 + this.f4485e0 + this.f4471Q + this.f4484d0 + this.f4483c0;
            if (C1344x5.m3780y(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: C */
    public float mo4676C() {
        if (mo4721p0()) {
            return this.f4484d0 + this.f4471Q + this.f4485e0;
        }
        return 0.0f;
    }

    /* renamed from: D */
    public float mo4677D() {
        return this.f4462H0 ? mo4293l() : this.f4451C;
    }

    /* renamed from: E */
    public Drawable mo4678E() {
        Drawable drawable = this.f4468N;
        if (drawable != null) {
            return C1344x5.m3762i0(drawable);
        }
        return null;
    }

    /* renamed from: H */
    public void mo4679H() {
        C1171a aVar = (C1171a) this.f4454D0.get();
        if (aVar != null) {
            aVar.mo1992a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0142  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4680I(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.f4506z
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.f4494n0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r8.f4494n0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r8.f4494n0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r8.f4447A
            if (r3 == 0) goto L_0x0024
            int r5 = r8.f4495o0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r8.f4495o0
            if (r5 == r3) goto L_0x002c
            r8.f4495o0 = r3
            r0 = 1
        L_0x002c:
            int r1 = p000.C0859n6.m2572a(r3, r1)
            int r3 = r8.f4496p0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            rl$b r5 = r8.f3979b
            android.content.res.ColorStateList r5 = r5.f4005d
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r8.f4496p0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.mo4300p(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r8.f4453D
            if (r1 == 0) goto L_0x0058
            int r3 = r8.f4497q0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r8.f4497q0
            if (r3 == r1) goto L_0x0060
            r8.f4497q0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r8.f4452C0
            if (r1 == 0) goto L_0x0073
            boolean r1 = p000.C0643il.m2053b(r9)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r8.f4452C0
            int r3 = r8.f4498r0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r8.f4498r0
            if (r3 == r1) goto L_0x007f
            r8.f4498r0 = r1
            boolean r1 = r8.f4450B0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            vk r1 = r8.f4493m0
            el r1 = r1.f4824f
            if (r1 == 0) goto L_0x0090
            android.content.res.ColorStateList r1 = r1.f2007b
            if (r1 == 0) goto L_0x0090
            int r3 = r8.f4499s0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            int r3 = r8.f4499s0
            if (r3 == r1) goto L_0x0098
            r8.f4499s0 = r1
            r0 = 1
        L_0x0098:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto L_0x00a3
        L_0x00a1:
            r1 = 0
            goto L_0x00b0
        L_0x00a3:
            int r5 = r1.length
            r6 = 0
        L_0x00a5:
            if (r6 >= r5) goto L_0x00a1
            r7 = r1[r6]
            if (r7 != r3) goto L_0x00ad
            r1 = 1
            goto L_0x00b0
        L_0x00ad:
            int r6 = r6 + 1
            goto L_0x00a5
        L_0x00b0:
            if (r1 == 0) goto L_0x00b8
            boolean r1 = r8.f4473S
            if (r1 == 0) goto L_0x00b8
            r1 = 1
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            boolean r3 = r8.f4500t0
            if (r3 == r1) goto L_0x00d3
            android.graphics.drawable.Drawable r3 = r8.f4475U
            if (r3 == 0) goto L_0x00d3
            float r0 = r8.mo4728z()
            r8.f4500t0 = r1
            float r1 = r8.mo4728z()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d2
            r0 = 1
            r1 = 1
            goto L_0x00d4
        L_0x00d2:
            r0 = 1
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            android.content.res.ColorStateList r3 = r8.f4505y0
            if (r3 == 0) goto L_0x00df
            int r5 = r8.f4501u0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            int r5 = r8.f4501u0
            if (r5 == r3) goto L_0x00f1
            r8.f4501u0 = r3
            android.content.res.ColorStateList r0 = r8.f4505y0
            android.graphics.PorterDuff$Mode r3 = r8.f4507z0
            android.graphics.PorterDuffColorFilter r0 = p000.C0728kh.m2284M(r8, r0, r3)
            r8.f4504x0 = r0
            goto L_0x00f2
        L_0x00f1:
            r4 = r0
        L_0x00f2:
            android.graphics.drawable.Drawable r0 = r8.f4463I
            boolean r0 = m3290G(r0)
            if (r0 == 0) goto L_0x0101
            android.graphics.drawable.Drawable r0 = r8.f4463I
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0101:
            android.graphics.drawable.Drawable r0 = r8.f4475U
            boolean r0 = m3290G(r0)
            if (r0 == 0) goto L_0x0110
            android.graphics.drawable.Drawable r0 = r8.f4475U
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0110:
            android.graphics.drawable.Drawable r0 = r8.f4468N
            boolean r0 = m3290G(r0)
            if (r0 == 0) goto L_0x012d
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.f4468N
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L_0x012d:
            boolean r9 = p000.C0643il.f2756a
            if (r9 == 0) goto L_0x0140
            android.graphics.drawable.Drawable r9 = r8.f4469O
            boolean r9 = m3290G(r9)
            if (r9 == 0) goto L_0x0140
            android.graphics.drawable.Drawable r9 = r8.f4469O
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0140:
            if (r4 == 0) goto L_0x0145
            r8.invalidateSelf()
        L_0x0145:
            if (r1 == 0) goto L_0x014a
            r8.mo4679H()
        L_0x014a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1170ti.mo4680I(int[], int[]):boolean");
    }

    /* renamed from: J */
    public void mo4681J(boolean z) {
        if (this.f4473S != z) {
            this.f4473S = z;
            float z2 = mo4728z();
            if (!z && this.f4500t0) {
                this.f4500t0 = false;
            }
            float z3 = mo4728z();
            invalidateSelf();
            if (z2 != z3) {
                mo4679H();
            }
        }
    }

    /* renamed from: K */
    public void mo4682K(Drawable drawable) {
        if (this.f4475U != drawable) {
            float z = mo4728z();
            this.f4475U = drawable;
            float z2 = mo4728z();
            mo4722q0(this.f4475U);
            mo4726x(this.f4475U);
            invalidateSelf();
            if (z != z2) {
                mo4679H();
            }
        }
    }

    /* renamed from: L */
    public void mo4683L(ColorStateList colorStateList) {
        if (this.f4476V != colorStateList) {
            this.f4476V = colorStateList;
            if (this.f4474T && this.f4475U != null && this.f4473S) {
                C1344x5.m3752d0(this.f4475U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public void mo4684M(boolean z) {
        if (this.f4474T != z) {
            boolean n0 = mo4717n0();
            this.f4474T = z;
            boolean n02 = mo4717n0();
            if (n0 != n02) {
                if (n02) {
                    mo4726x(this.f4475U);
                } else {
                    mo4722q0(this.f4475U);
                }
                invalidateSelf();
                mo4679H();
            }
        }
    }

    /* renamed from: N */
    public void mo4685N(ColorStateList colorStateList) {
        if (this.f4447A != colorStateList) {
            this.f4447A = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* renamed from: O */
    public void mo4686O(float f) {
        if (this.f4451C != f) {
            this.f4451C = f;
            this.f3979b.f4002a = this.f3979b.f4002a.mo4782e(f);
            invalidateSelf();
        }
    }

    /* renamed from: P */
    public void mo4687P(float f) {
        if (this.f4486f0 != f) {
            this.f4486f0 = f;
            invalidateSelf();
            mo4679H();
        }
    }

    /* renamed from: Q */
    public void mo4688Q(Drawable drawable) {
        Drawable drawable2 = this.f4463I;
        Drawable drawable3 = null;
        Drawable i0 = drawable2 != null ? C1344x5.m3762i0(drawable2) : null;
        if (i0 != drawable) {
            float z = mo4728z();
            if (drawable != null) {
                drawable3 = C1344x5.m3764j0(drawable).mutate();
            }
            this.f4463I = drawable3;
            float z2 = mo4728z();
            mo4722q0(i0);
            if (mo4718o0()) {
                mo4726x(this.f4463I);
            }
            invalidateSelf();
            if (z != z2) {
                mo4679H();
            }
        }
    }

    /* renamed from: R */
    public void mo4689R(float f) {
        if (this.f4465K != f) {
            float z = mo4728z();
            this.f4465K = f;
            float z2 = mo4728z();
            invalidateSelf();
            if (z != z2) {
                mo4679H();
            }
        }
    }

    /* renamed from: S */
    public void mo4690S(ColorStateList colorStateList) {
        this.f4466L = true;
        if (this.f4464J != colorStateList) {
            this.f4464J = colorStateList;
            if (mo4718o0()) {
                C1344x5.m3752d0(this.f4463I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: T */
    public void mo4691T(boolean z) {
        if (this.f4461H != z) {
            boolean o0 = mo4718o0();
            this.f4461H = z;
            boolean o02 = mo4718o0();
            if (o0 != o02) {
                if (o02) {
                    mo4726x(this.f4463I);
                } else {
                    mo4722q0(this.f4463I);
                }
                invalidateSelf();
                mo4679H();
            }
        }
    }

    /* renamed from: U */
    public void mo4692U(float f) {
        if (this.f4449B != f) {
            this.f4449B = f;
            invalidateSelf();
            mo4679H();
        }
    }

    /* renamed from: V */
    public void mo4693V(float f) {
        if (this.f4479Y != f) {
            this.f4479Y = f;
            invalidateSelf();
            mo4679H();
        }
    }

    /* renamed from: W */
    public void mo4694W(ColorStateList colorStateList) {
        if (this.f4453D != colorStateList) {
            this.f4453D = colorStateList;
            if (this.f4462H0) {
                mo4306t(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: X */
    public void mo4695X(float f) {
        if (this.f4455E != f) {
            this.f4455E = f;
            this.f4488h0.setStrokeWidth(f);
            if (this.f4462H0) {
                this.f3979b.f4013l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: Y */
    public void mo4696Y(Drawable drawable) {
        Drawable E = mo4678E();
        if (E != drawable) {
            float C = mo4676C();
            this.f4468N = drawable != null ? C1344x5.m3764j0(drawable).mutate() : null;
            if (C0643il.f2756a) {
                this.f4469O = new RippleDrawable(C0643il.m2052a(this.f4457F), this.f4468N, f4446J0);
            }
            float C2 = mo4676C();
            mo4722q0(E);
            if (mo4721p0()) {
                mo4726x(this.f4468N);
            }
            invalidateSelf();
            if (C != C2) {
                mo4679H();
            }
        }
    }

    /* renamed from: Z */
    public void mo4697Z(float f) {
        if (this.f4485e0 != f) {
            this.f4485e0 = f;
            invalidateSelf();
            if (mo4721p0()) {
                mo4679H();
            }
        }
    }

    /* renamed from: a */
    public void mo4698a() {
        mo4679H();
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void mo4699a0(float f) {
        if (this.f4471Q != f) {
            this.f4471Q = f;
            invalidateSelf();
            if (mo4721p0()) {
                mo4679H();
            }
        }
    }

    /* renamed from: b0 */
    public void mo4700b0(float f) {
        if (this.f4484d0 != f) {
            this.f4484d0 = f;
            invalidateSelf();
            if (mo4721p0()) {
                mo4679H();
            }
        }
    }

    /* renamed from: c0 */
    public boolean mo4701c0(int[] iArr) {
        if (Arrays.equals(this.f4448A0, iArr)) {
            return false;
        }
        this.f4448A0 = iArr;
        if (mo4721p0()) {
            return mo4680I(getState(), iArr);
        }
        return false;
    }

    /* renamed from: d0 */
    public void mo4702d0(ColorStateList colorStateList) {
        if (this.f4470P != colorStateList) {
            this.f4470P = colorStateList;
            if (mo4721p0()) {
                C1344x5.m3752d0(this.f4468N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Drawable drawable;
        int i7;
        float f;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f4502v0) != 0) {
            if (i < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                i2 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
            } else {
                i2 = 0;
            }
            if (!this.f4462H0) {
                this.f4488h0.setColor(this.f4494n0);
                this.f4488h0.setStyle(Paint.Style.FILL);
                this.f4490j0.set(bounds);
                canvas2.drawRoundRect(this.f4490j0, mo4677D(), mo4677D(), this.f4488h0);
            }
            if (!this.f4462H0) {
                this.f4488h0.setColor(this.f4495o0);
                this.f4488h0.setStyle(Paint.Style.FILL);
                Paint paint = this.f4488h0;
                ColorFilter colorFilter = this.f4503w0;
                if (colorFilter == null) {
                    colorFilter = this.f4504x0;
                }
                paint.setColorFilter(colorFilter);
                this.f4490j0.set(bounds);
                canvas2.drawRoundRect(this.f4490j0, mo4677D(), mo4677D(), this.f4488h0);
            }
            if (this.f4462H0) {
                super.draw(canvas);
            }
            if (this.f4455E > 0.0f && !this.f4462H0) {
                this.f4488h0.setColor(this.f4497q0);
                this.f4488h0.setStyle(Paint.Style.STROKE);
                if (!this.f4462H0) {
                    Paint paint2 = this.f4488h0;
                    ColorFilter colorFilter2 = this.f4503w0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f4504x0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f4490j0;
                float f6 = this.f4455E / 2.0f;
                rectF.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.f4451C - (this.f4455E / 2.0f);
                canvas2.drawRoundRect(this.f4490j0, f7, f7, this.f4488h0);
            }
            this.f4488h0.setColor(this.f4498r0);
            this.f4488h0.setStyle(Paint.Style.FILL);
            this.f4490j0.set(bounds);
            if (!this.f4462H0) {
                canvas2.drawRoundRect(this.f4490j0, mo4677D(), mo4677D(), this.f4488h0);
                i3 = 0;
            } else {
                mo4277c(new RectF(bounds), this.f4492l0);
                i3 = 0;
                mo4281g(canvas, this.f4488h0, this.f4492l0, this.f3979b.f4002a, mo4287h());
            }
            if (mo4718o0()) {
                mo4727y(bounds, this.f4490j0);
                RectF rectF2 = this.f4490j0;
                float f8 = rectF2.left;
                float f9 = rectF2.top;
                canvas2.translate(f8, f9);
                this.f4463I.setBounds(i3, i3, (int) this.f4490j0.width(), (int) this.f4490j0.height());
                this.f4463I.draw(canvas2);
                canvas2.translate(-f8, -f9);
            }
            if (mo4717n0()) {
                mo4727y(bounds, this.f4490j0);
                RectF rectF3 = this.f4490j0;
                float f10 = rectF3.left;
                float f11 = rectF3.top;
                canvas2.translate(f10, f11);
                this.f4475U.setBounds(i3, i3, (int) this.f4490j0.width(), (int) this.f4490j0.height());
                this.f4475U.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (!this.f4458F0 || this.f4459G == null) {
                i6 = i2;
                i5 = 255;
                i4 = 0;
            } else {
                PointF pointF = this.f4491k0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f4459G != null) {
                    float z = mo4728z() + this.f4479Y + this.f4482b0;
                    if (C1344x5.m3780y(this) == 0) {
                        pointF.x = ((float) bounds.left) + z;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - z;
                        align = Paint.Align.RIGHT;
                    }
                    this.f4493m0.f4819a.getFontMetrics(this.f4489i0);
                    Paint.FontMetrics fontMetrics = this.f4489i0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.f4490j0;
                rectF4.setEmpty();
                if (this.f4459G != null) {
                    float z2 = mo4728z() + this.f4479Y + this.f4482b0;
                    float C = mo4676C() + this.f4486f0 + this.f4483c0;
                    if (C1344x5.m3780y(this) == 0) {
                        rectF4.left = ((float) bounds.left) + z2;
                        f = ((float) bounds.right) - C;
                    } else {
                        rectF4.left = ((float) bounds.left) + C;
                        f = ((float) bounds.right) - z2;
                    }
                    rectF4.right = f;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                C1266vk vkVar = this.f4493m0;
                if (vkVar.f4824f != null) {
                    vkVar.f4819a.drawableState = getState();
                    C1266vk vkVar2 = this.f4493m0;
                    vkVar2.f4824f.mo2731c(this.f4487g0, vkVar2.f4819a, vkVar2.f4820b);
                }
                this.f4493m0.f4819a.setTextAlign(align);
                boolean z3 = Math.round(this.f4493m0.mo4917a(this.f4459G.toString())) > Math.round(this.f4490j0.width());
                if (z3) {
                    i7 = canvas.save();
                    canvas2.clipRect(this.f4490j0);
                } else {
                    i7 = 0;
                }
                CharSequence charSequence = this.f4459G;
                if (z3 && this.f4456E0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f4493m0.f4819a, this.f4490j0.width(), this.f4456E0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f4491k0;
                i4 = 0;
                float f12 = pointF2.x;
                i5 = 255;
                float f13 = pointF2.y;
                i6 = i2;
                canvas.drawText(charSequence2, 0, length, f12, f13, this.f4493m0.f4819a);
                if (z3) {
                    canvas2.restoreToCount(i7);
                }
            }
            if (mo4721p0()) {
                mo4674A(bounds, this.f4490j0);
                RectF rectF5 = this.f4490j0;
                float f14 = rectF5.left;
                float f15 = rectF5.top;
                canvas2.translate(f14, f15);
                this.f4468N.setBounds(i4, i4, (int) this.f4490j0.width(), (int) this.f4490j0.height());
                if (C0643il.f2756a) {
                    this.f4469O.setBounds(this.f4468N.getBounds());
                    this.f4469O.jumpToCurrentState();
                    drawable = this.f4469O;
                } else {
                    drawable = this.f4468N;
                }
                drawable.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.f4502v0 < i5) {
                canvas2.restoreToCount(i6);
            }
        }
    }

    /* renamed from: e0 */
    public void mo4703e0(boolean z) {
        if (this.f4467M != z) {
            boolean p0 = mo4721p0();
            this.f4467M = z;
            boolean p02 = mo4721p0();
            if (p0 != p02) {
                if (p02) {
                    mo4726x(this.f4468N);
                } else {
                    mo4722q0(this.f4468N);
                }
                invalidateSelf();
                mo4679H();
            }
        }
    }

    /* renamed from: f0 */
    public void mo4704f0(float f) {
        if (this.f4481a0 != f) {
            float z = mo4728z();
            this.f4481a0 = f;
            float z2 = mo4728z();
            invalidateSelf();
            if (z != z2) {
                mo4679H();
            }
        }
    }

    /* renamed from: g0 */
    public void mo4705g0(float f) {
        if (this.f4480Z != f) {
            float z = mo4728z();
            this.f4480Z = f;
            float z2 = mo4728z();
            invalidateSelf();
            if (z != z2) {
                mo4679H();
            }
        }
    }

    public int getAlpha() {
        return this.f4502v0;
    }

    public ColorFilter getColorFilter() {
        return this.f4503w0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f4449B;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(mo4676C() + this.f4493m0.mo4917a(this.f4459G.toString()) + mo4728z() + this.f4479Y + this.f4482b0 + this.f4483c0 + this.f4486f0), this.f4460G0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f4462H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f4451C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4449B, this.f4451C);
        }
        outline.setAlpha(((float) this.f4502v0) / 255.0f);
    }

    /* renamed from: h0 */
    public void mo4710h0(ColorStateList colorStateList) {
        if (this.f4457F != colorStateList) {
            this.f4457F = colorStateList;
            this.f4452C0 = this.f4450B0 ? C0643il.m2052a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: i0 */
    public void mo4711i0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f4459G, charSequence)) {
            this.f4459G = charSequence;
            this.f4493m0.f4822d = true;
            invalidateSelf();
            mo4679H();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f2007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f4506z
            boolean r0 = m3289F(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.f4447A
            boolean r0 = m3289F(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.f4453D
            boolean r0 = m3289F(r0)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.f4450B0
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.f4452C0
            boolean r0 = m3289F(r0)
            if (r0 != 0) goto L_0x0066
        L_0x0026:
            vk r0 = r3.f4493m0
            el r0 = r0.f4824f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f2007b
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.f4474T
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.f4475U
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.f4473S
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.f4463I
            boolean r0 = m3290G(r0)
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.f4475U
            boolean r0 = m3290G(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.f4505y0
            boolean r0 = m3289F(r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1170ti.isStateful():boolean");
    }

    /* renamed from: j0 */
    public void mo4713j0(C0427el elVar) {
        C1266vk vkVar = this.f4493m0;
        Context context = this.f4487g0;
        if (vkVar.f4824f != elVar) {
            vkVar.f4824f = elVar;
            if (elVar != null) {
                TextPaint textPaint = vkVar.f4819a;
                C0541gl glVar = vkVar.f4820b;
                elVar.mo2729a();
                elVar.mo2732d(textPaint, elVar.f2017l);
                elVar.mo2730b(context, new C0481fl(elVar, textPaint, glVar));
                C1266vk.C1268b bVar = (C1266vk.C1268b) vkVar.f4823e.get();
                if (bVar != null) {
                    vkVar.f4819a.drawableState = bVar.getState();
                }
                elVar.mo2731c(context, vkVar.f4819a, vkVar.f4820b);
                vkVar.f4822d = true;
            }
            C1266vk.C1268b bVar2 = (C1266vk.C1268b) vkVar.f4823e.get();
            if (bVar2 != null) {
                bVar2.mo4698a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: k0 */
    public void mo4714k0(float f) {
        if (this.f4483c0 != f) {
            this.f4483c0 = f;
            invalidateSelf();
            mo4679H();
        }
    }

    /* renamed from: l0 */
    public void mo4715l0(float f) {
        if (this.f4482b0 != f) {
            this.f4482b0 = f;
            invalidateSelf();
            mo4679H();
        }
    }

    /* renamed from: m0 */
    public void mo4716m0(boolean z) {
        if (this.f4450B0 != z) {
            this.f4450B0 = z;
            this.f4452C0 = z ? C0643il.m2052a(this.f4457F) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: n0 */
    public final boolean mo4717n0() {
        return this.f4474T && this.f4475U != null && this.f4500t0;
    }

    /* renamed from: o0 */
    public final boolean mo4718o0() {
        return this.f4461H && this.f4463I != null;
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo4718o0()) {
            onLayoutDirectionChanged |= C1344x5.m3742X(this.f4463I, i);
        }
        if (mo4717n0()) {
            onLayoutDirectionChanged |= C1344x5.m3742X(this.f4475U, i);
        }
        if (mo4721p0()) {
            onLayoutDirectionChanged |= C1344x5.m3742X(this.f4468N, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo4718o0()) {
            onLevelChange |= this.f4463I.setLevel(i);
        }
        if (mo4717n0()) {
            onLevelChange |= this.f4475U.setLevel(i);
        }
        if (mo4721p0()) {
            onLevelChange |= this.f4468N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f4462H0) {
            super.onStateChange(iArr);
        }
        return mo4680I(iArr, this.f4448A0);
    }

    /* renamed from: p0 */
    public final boolean mo4721p0() {
        return this.f4467M && this.f4468N != null;
    }

    /* renamed from: q0 */
    public final void mo4722q0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f4502v0 != i) {
            this.f4502v0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4503w0 != colorFilter) {
            this.f4503w0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f4505y0 != colorStateList) {
            this.f4505y0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f4507z0 != mode) {
            this.f4507z0 = mode;
            this.f4504x0 = C0728kh.m2284M(this, this.f4505y0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo4718o0()) {
            visible |= this.f4463I.setVisible(z, z2);
        }
        if (mo4717n0()) {
            visible |= this.f4475U.setVisible(z, z2);
        }
        if (mo4721p0()) {
            visible |= this.f4468N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: x */
    public final void mo4726x(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C1344x5.m3742X(drawable, C1344x5.m3780y(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f4468N) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f4448A0);
                }
                C1344x5.m3752d0(drawable, this.f4470P);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f4463I;
            if (drawable == drawable2 && this.f4466L) {
                C1344x5.m3752d0(drawable2, this.f4464J);
            }
        }
    }

    /* renamed from: y */
    public final void mo4727y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo4718o0() || mo4717n0()) {
            float f = this.f4479Y + this.f4480Z;
            if (C1344x5.m3780y(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f4465K;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f4465K;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f4465K;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: z */
    public float mo4728z() {
        if (mo4718o0() || mo4717n0()) {
            return this.f4480Z + this.f4465K + this.f4481a0;
        }
        return 0.0f;
    }
}
