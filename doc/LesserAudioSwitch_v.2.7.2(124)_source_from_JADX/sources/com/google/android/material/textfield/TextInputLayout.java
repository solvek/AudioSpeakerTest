package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    public CharSequence f1625A;

    /* renamed from: A0 */
    public int f1626A0;

    /* renamed from: B */
    public boolean f1627B;

    /* renamed from: B0 */
    public int f1628B0;

    /* renamed from: C */
    public C1067rl f1629C;

    /* renamed from: C0 */
    public int f1630C0;

    /* renamed from: D */
    public C1067rl f1631D;

    /* renamed from: D0 */
    public boolean f1632D0;

    /* renamed from: E */
    public C1217ul f1633E;

    /* renamed from: E0 */
    public final C0981pk f1634E0;

    /* renamed from: F */
    public final int f1635F;

    /* renamed from: F0 */
    public boolean f1636F0;

    /* renamed from: G */
    public int f1637G;

    /* renamed from: G0 */
    public ValueAnimator f1638G0;

    /* renamed from: H */
    public final int f1639H;

    /* renamed from: H0 */
    public boolean f1640H0;

    /* renamed from: I */
    public int f1641I;

    /* renamed from: I0 */
    public boolean f1642I0;

    /* renamed from: J */
    public int f1643J;

    /* renamed from: K */
    public int f1644K;

    /* renamed from: L */
    public int f1645L;

    /* renamed from: M */
    public int f1646M;

    /* renamed from: N */
    public final Rect f1647N = new Rect();

    /* renamed from: O */
    public final Rect f1648O = new Rect();

    /* renamed from: P */
    public final RectF f1649P = new RectF();

    /* renamed from: Q */
    public Typeface f1650Q;

    /* renamed from: R */
    public final CheckableImageButton f1651R;

    /* renamed from: S */
    public ColorStateList f1652S;

    /* renamed from: T */
    public boolean f1653T;

    /* renamed from: U */
    public PorterDuff.Mode f1654U;

    /* renamed from: V */
    public boolean f1655V;

    /* renamed from: W */
    public Drawable f1656W;

    /* renamed from: a0 */
    public int f1657a0;

    /* renamed from: b */
    public final FrameLayout f1658b;

    /* renamed from: b0 */
    public View.OnLongClickListener f1659b0;

    /* renamed from: c */
    public final LinearLayout f1660c;

    /* renamed from: c0 */
    public final LinkedHashSet<C0330f> f1661c0 = new LinkedHashSet<>();

    /* renamed from: d */
    public final LinearLayout f1662d;

    /* renamed from: d0 */
    public int f1663d0 = 0;

    /* renamed from: e */
    public final FrameLayout f1664e;

    /* renamed from: e0 */
    public final SparseArray<C1070rm> f1665e0;

    /* renamed from: f */
    public EditText f1666f;

    /* renamed from: f0 */
    public final CheckableImageButton f1667f0;

    /* renamed from: g */
    public CharSequence f1668g;

    /* renamed from: g0 */
    public final LinkedHashSet<C0331g> f1669g0;

    /* renamed from: h */
    public final C1126sm f1670h = new C1126sm(this);

    /* renamed from: h0 */
    public ColorStateList f1671h0;

    /* renamed from: i */
    public boolean f1672i;

    /* renamed from: i0 */
    public boolean f1673i0;

    /* renamed from: j */
    public int f1674j;

    /* renamed from: j0 */
    public PorterDuff.Mode f1675j0;

    /* renamed from: k */
    public boolean f1676k;

    /* renamed from: k0 */
    public boolean f1677k0;

    /* renamed from: l */
    public TextView f1678l;

    /* renamed from: l0 */
    public Drawable f1679l0;

    /* renamed from: m */
    public int f1680m;

    /* renamed from: m0 */
    public int f1681m0;

    /* renamed from: n */
    public int f1682n;

    /* renamed from: n0 */
    public Drawable f1683n0;

    /* renamed from: o */
    public CharSequence f1684o;

    /* renamed from: o0 */
    public View.OnLongClickListener f1685o0;

    /* renamed from: p */
    public boolean f1686p;

    /* renamed from: p0 */
    public View.OnLongClickListener f1687p0;

    /* renamed from: q */
    public TextView f1688q;

    /* renamed from: q0 */
    public final CheckableImageButton f1689q0;

    /* renamed from: r */
    public ColorStateList f1690r;

    /* renamed from: r0 */
    public ColorStateList f1691r0;

    /* renamed from: s */
    public int f1692s;

    /* renamed from: s0 */
    public ColorStateList f1693s0;

    /* renamed from: t */
    public ColorStateList f1694t;

    /* renamed from: t0 */
    public ColorStateList f1695t0;

    /* renamed from: u */
    public ColorStateList f1696u;

    /* renamed from: u0 */
    public int f1697u0;

    /* renamed from: v */
    public CharSequence f1698v;

    /* renamed from: v0 */
    public int f1699v0;

    /* renamed from: w */
    public final TextView f1700w;

    /* renamed from: w0 */
    public int f1701w0;

    /* renamed from: x */
    public CharSequence f1702x;

    /* renamed from: x0 */
    public ColorStateList f1703x0;

    /* renamed from: y */
    public final TextView f1704y;

    /* renamed from: y0 */
    public int f1705y0;

    /* renamed from: z */
    public boolean f1706z;

    /* renamed from: z0 */
    public int f1707z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C0325a implements TextWatcher {
        public C0325a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo2498z(!textInputLayout.f1642I0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f1672i) {
                textInputLayout2.mo2492t(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f1686p) {
                textInputLayout3.mo2333A(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C0326b implements Runnable {
        public C0326b() {
        }

        public void run() {
            TextInputLayout.this.f1667f0.performClick();
            TextInputLayout.this.f1667f0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C0327c implements Runnable {
        public C0327c() {
        }

        public void run() {
            TextInputLayout.this.f1666f.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C0328d implements ValueAnimator.AnimatorUpdateListener {
        public C0328d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f1634E0.mo4039o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C0329e extends C1444z7 {

        /* renamed from: d */
        public final TextInputLayout f1712d;

        public C0329e(TextInputLayout textInputLayout) {
            this.f1712d = textInputLayout;
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
            EditText editText = this.f1712d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f1712d.getHint();
            CharSequence helperText = this.f1712d.getHelperText();
            CharSequence error = this.f1712d.getError();
            int counterMaxLength = this.f1712d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f1712d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            StringBuilder c = C0279ch.m1106c(charSequence);
            c.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : "");
            StringBuilder c2 = C0279ch.m1106c(c.toString());
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = "";
            }
            c2.append(helperText);
            String sb = c2.toString();
            if (z) {
                x8Var.f5038a.setText(text);
            } else if (!TextUtils.isEmpty(sb)) {
                x8Var.f5038a.setText(sb);
            }
            if (!TextUtils.isEmpty(sb)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    x8Var.mo5065k(sb);
                } else {
                    if (z) {
                        sb = text + ", " + sb;
                    }
                    x8Var.f5038a.setText(sb);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    x8Var.f5038a.setShowingHintText(z6);
                } else {
                    x8Var.mo5061h(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                x8Var.f5038a.setMaxTextLength(counterMaxLength);
            }
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                if (i2 >= 21) {
                    x8Var.f5038a.setError(error);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C0330f {
        /* renamed from: a */
        void mo2505a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C0331g {
        /* renamed from: a */
        void mo2506a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C0332h extends C0718k9 {
        public static final Parcelable.Creator<C0332h> CREATOR = new C0333a();

        /* renamed from: d */
        public CharSequence f1713d;

        /* renamed from: e */
        public boolean f1714e;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public static class C0333a implements Parcelable.ClassLoaderCreator<C0332h> {
            public Object createFromParcel(Parcel parcel) {
                return new C0332h(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0332h[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0332h(parcel, classLoader);
            }
        }

        public C0332h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1713d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1714e = parcel.readInt() != 1 ? false : true;
        }

        public C0332h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder c = C0279ch.m1106c("TextInputLayout.SavedState{");
            c.append(Integer.toHexString(System.identityHashCode(this)));
            c.append(" error=");
            c.append(this.f1713d);
            c.append("}");
            return c.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            TextUtils.writeToParcel(this.f1713d, parcel, i);
            parcel.writeInt(this.f1714e ? 1 : 0);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0586  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r31, android.util.AttributeSet r32) {
        /*
            r30 = this;
            r0 = r30
            r7 = r32
            r8 = 2131755635(0x7f100273, float:1.9142155E38)
            r9 = 2130903743(0x7f0302bf, float:1.7414313E38)
            r1 = r31
            android.content.Context r1 = p000.C1382xm.m3838a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            sm r1 = new sm
            r1.<init>(r0)
            r0.f1670h = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f1647N = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f1648O = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f1649P = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f1661c0 = r1
            r10 = 0
            r0.f1663d0 = r10
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r0.f1665e0 = r11
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f1669g0 = r1
            pk r1 = new pk
            r1.<init>(r0)
            r0.f1634E0 = r1
            android.content.Context r12 = r30.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r12)
            r0.f1658b = r2
            r2.setAddStatesFromChildren(r13)
            r0.addView(r2)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r12)
            r0.f1660c = r14
            r14.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r15 = -2
            r6 = -1
            r3.<init>(r15, r6, r4)
            r14.setLayoutParams(r3)
            r2.addView(r14)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r12)
            r0.f1662d = r5
            r5.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r15, r6, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r12)
            r0.f1664e = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r15, r6)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = p000.C0831mh.f3286a
            r1.f3672J = r2
            r1.mo4036k()
            r1.f3671I = r2
            r1.mo4036k()
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo4038n(r2)
            int[] r3 = p000.C0781lh.f3171w
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {18, 16, 31, 35, 39} // fill-array
            p000.C1315wk.m3651a(r12, r7, r9, r8)
            r16 = 2131755635(0x7f100273, float:1.9142155E38)
            r17 = 2130903743(0x7f0302bf, float:1.7414313E38)
            r18 = r1
            r1 = r12
            r15 = 5
            r2 = r32
            r19 = r3
            r20 = r4
            r4 = r17
            r21 = r5
            r5 = r16
            r6 = r18
            p000.C1315wk.m3652b(r1, r2, r3, r4, r5, r6)
            h3 r1 = new h3
            r2 = r19
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r2, r9, r8)
            r1.<init>(r12, r2)
            r2 = 38
            boolean r2 = r1.mo3021a(r2, r13)
            r0.f1706z = r2
            r2 = 2
            java.lang.CharSequence r3 = r1.mo3034n(r2)
            r0.setHint(r3)
            r3 = 37
            boolean r3 = r1.mo3021a(r3, r13)
            r0.f1636F0 = r3
            ul$b r3 = p000.C1217ul.m3398b(r12, r7, r9, r8)
            ul r3 = r3.mo4783a()
            r0.f1633E = r3
            android.content.res.Resources r3 = r12.getResources()
            r4 = 2131099958(0x7f060136, float:1.7812284E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f1635F = r3
            int r3 = r1.mo3025e(r15, r10)
            r0.f1639H = r3
            r3 = 12
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131099959(0x7f060137, float:1.7812286E38)
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo3026f(r3, r4)
            r0.f1643J = r3
            r3 = 13
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131099960(0x7f060138, float:1.7812288E38)
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo3026f(r3, r4)
            r0.f1644K = r3
            int r3 = r0.f1643J
            r0.f1641I = r3
            r3 = 9
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.mo3024d(r3, r4)
            r5 = 8
            float r6 = r1.mo3024d(r5, r4)
            r7 = 6
            float r7 = r1.mo3024d(r7, r4)
            r8 = 7
            float r4 = r1.mo3024d(r8, r4)
            ul r8 = r0.f1633E
            r8.getClass()
            ul$b r9 = new ul$b
            r9.<init>(r8)
            r8 = 0
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x0176
            r9.mo4786e(r3)
        L_0x0176:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x017d
            r9.mo4787f(r6)
        L_0x017d:
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0184
            r9.mo4785d(r7)
        L_0x0184:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x018b
            r9.mo4784c(r4)
        L_0x018b:
            ul r3 = r9.mo4783a()
            r0.f1633E = r3
            r3 = 3
            android.content.res.ColorStateList r4 = p000.C0728kh.m2296l(r12, r1, r3)
            if (r4 == 0) goto L_0x01ed
            int r6 = r4.getDefaultColor()
            r0.f1705y0 = r6
            r0.f1646M = r6
            boolean r6 = r4.isStateful()
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r6 == 0) goto L_0x01c9
            int[] r6 = new int[r13]
            r6[r10] = r7
            r8 = -1
            int r6 = r4.getColorForState(r6, r8)
            r0.f1707z0 = r6
            int[] r6 = new int[r2]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r4.getColorForState(r6, r8)
            r0.f1626A0 = r6
            int[] r6 = new int[r2]
            r6 = {16843623, 16842910} // fill-array
            int r4 = r4.getColorForState(r6, r8)
            goto L_0x01ea
        L_0x01c9:
            r8 = -1
            int r4 = r0.f1705y0
            r0.f1626A0 = r4
            r4 = 2131034286(0x7f0500ae, float:1.7679085E38)
            android.content.res.ColorStateList r4 = p000.C0399e0.m1529a(r12, r4)
            int[] r6 = new int[r13]
            r6[r10] = r7
            int r6 = r4.getColorForState(r6, r8)
            r0.f1707z0 = r6
            int[] r6 = new int[r13]
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r6[r10] = r7
            int r4 = r4.getColorForState(r6, r8)
        L_0x01ea:
            r0.f1628B0 = r4
            goto L_0x01f8
        L_0x01ed:
            r8 = -1
            r0.f1646M = r10
            r0.f1705y0 = r10
            r0.f1707z0 = r10
            r0.f1626A0 = r10
            r0.f1628B0 = r10
        L_0x01f8:
            boolean r4 = r1.mo3035o(r13)
            if (r4 == 0) goto L_0x0206
            android.content.res.ColorStateList r4 = r1.mo3023c(r13)
            r0.f1695t0 = r4
            r0.f1693s0 = r4
        L_0x0206:
            r4 = 10
            android.content.res.ColorStateList r6 = p000.C0728kh.m2296l(r12, r1, r4)
            int r4 = r1.mo3022b(r4, r10)
            r0.f1701w0 = r4
            r4 = 2131034304(0x7f0500c0, float:1.7679122E38)
            int r4 = p000.C0408e6.m1547a(r12, r4)
            r0.f1697u0 = r4
            r4 = 2131034305(0x7f0500c1, float:1.7679124E38)
            int r4 = p000.C0408e6.m1547a(r12, r4)
            r0.f1630C0 = r4
            r4 = 2131034308(0x7f0500c4, float:1.767913E38)
            int r4 = p000.C0408e6.m1547a(r12, r4)
            r0.f1699v0 = r4
            if (r6 == 0) goto L_0x0232
            r0.setBoxStrokeColorStateList(r6)
        L_0x0232:
            r4 = 11
            boolean r6 = r1.mo3035o(r4)
            if (r6 == 0) goto L_0x0241
            android.content.res.ColorStateList r4 = p000.C0728kh.m2296l(r12, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x0241:
            r4 = 39
            int r6 = r1.mo3032l(r4, r8)
            if (r6 == r8) goto L_0x0250
            int r4 = r1.mo3032l(r4, r10)
            r0.setHintTextAppearance(r4)
        L_0x0250:
            r4 = 31
            int r4 = r1.mo3032l(r4, r10)
            r6 = 26
            java.lang.CharSequence r6 = r1.mo3034n(r6)
            r7 = 27
            boolean r7 = r1.mo3021a(r7, r10)
            android.content.Context r9 = r30.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r15 = 2131427384(0x7f0b0038, float:1.8476383E38)
            r3 = r21
            android.view.View r9 = r9.inflate(r15, r3, r10)
            com.google.android.material.internal.CheckableImageButton r9 = (com.google.android.material.internal.CheckableImageButton) r9
            r0.f1689q0 = r9
            r9.setVisibility(r5)
            r15 = 28
            boolean r17 = r1.mo3035o(r15)
            if (r17 == 0) goto L_0x0289
            android.graphics.drawable.Drawable r15 = r1.mo3027g(r15)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r15)
        L_0x0289:
            r15 = 29
            boolean r17 = r1.mo3035o(r15)
            if (r17 == 0) goto L_0x0298
            android.content.res.ColorStateList r15 = p000.C0728kh.m2296l(r12, r1, r15)
            r0.setErrorIconTintList(r15)
        L_0x0298:
            r15 = 30
            boolean r17 = r1.mo3035o(r15)
            r13 = 0
            if (r17 == 0) goto L_0x02ac
            int r15 = r1.mo3030j(r15, r8)
            android.graphics.PorterDuff$Mode r15 = p000.C0728kh.m2309y(r15, r13)
            r0.setErrorIconTintMode(r15)
        L_0x02ac:
            android.content.res.Resources r15 = r30.getResources()
            r13 = 2131689563(0x7f0f005b, float:1.9008145E38)
            java.lang.CharSequence r13 = r15.getText(r13)
            r9.setContentDescription(r13)
            p000.C0813m8.m2462K(r9, r2)
            r9.setClickable(r10)
            r9.setPressable(r10)
            r9.setFocusable(r10)
            r13 = 35
            int r13 = r1.mo3032l(r13, r10)
            r15 = 34
            boolean r15 = r1.mo3021a(r15, r10)
            r2 = 33
            java.lang.CharSequence r2 = r1.mo3034n(r2)
            r5 = 47
            int r5 = r1.mo3032l(r5, r10)
            r8 = 46
            java.lang.CharSequence r8 = r1.mo3034n(r8)
            r22 = r5
            r5 = 50
            int r5 = r1.mo3032l(r5, r10)
            r10 = 49
            java.lang.CharSequence r10 = r1.mo3034n(r10)
            r23 = r5
            r5 = 60
            r24 = r10
            r10 = 0
            int r5 = r1.mo3032l(r5, r10)
            r10 = 59
            java.lang.CharSequence r10 = r1.mo3034n(r10)
            r25 = r5
            r5 = 14
            r26 = r10
            r10 = 0
            boolean r5 = r1.mo3021a(r5, r10)
            r10 = 15
            r27 = r5
            r5 = -1
            int r10 = r1.mo3030j(r10, r5)
            r0.setCounterMaxLength(r10)
            r5 = 18
            r10 = 0
            int r5 = r1.mo3032l(r5, r10)
            r0.f1682n = r5
            r5 = 16
            int r5 = r1.mo3032l(r5, r10)
            r0.f1680m = r5
            android.content.Context r5 = r30.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r28 = r8
            r8 = 2131427385(0x7f0b0039, float:1.8476385E38)
            android.view.View r5 = r5.inflate(r8, r14, r10)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.f1651R = r5
            r8 = 8
            r5.setVisibility(r8)
            r8 = 0
            r0.setStartIconOnClickListener(r8)
            r0.setStartIconOnLongClickListener(r8)
            r8 = 56
            boolean r10 = r1.mo3035o(r8)
            if (r10 == 0) goto L_0x0374
            android.graphics.drawable.Drawable r8 = r1.mo3027g(r8)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r8)
            r8 = 55
            boolean r10 = r1.mo3035o(r8)
            if (r10 == 0) goto L_0x036a
            java.lang.CharSequence r8 = r1.mo3034n(r8)
            r0.setStartIconContentDescription((java.lang.CharSequence) r8)
        L_0x036a:
            r8 = 54
            r10 = 1
            boolean r8 = r1.mo3021a(r8, r10)
            r0.setStartIconCheckable(r8)
        L_0x0374:
            r8 = 57
            boolean r10 = r1.mo3035o(r8)
            if (r10 == 0) goto L_0x0383
            android.content.res.ColorStateList r8 = p000.C0728kh.m2296l(r12, r1, r8)
            r0.setStartIconTintList(r8)
        L_0x0383:
            r8 = 58
            boolean r10 = r1.mo3035o(r8)
            if (r10 == 0) goto L_0x0398
            r10 = -1
            int r8 = r1.mo3030j(r8, r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r8 = p000.C0728kh.m2309y(r8, r10)
            r0.setStartIconTintMode(r8)
        L_0x0398:
            r8 = 4
            r10 = 0
            int r8 = r1.mo3030j(r8, r10)
            r0.setBoxBackgroundMode(r8)
            android.content.Context r8 = r30.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r16 = r4
            r29 = r6
            r6 = r20
            r4 = 2131427384(0x7f0b0038, float:1.8476383E38)
            android.view.View r4 = r8.inflate(r4, r6, r10)
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.f1667f0 = r4
            r6.addView(r4)
            r8 = 8
            r4.setVisibility(r8)
            km r4 = new km
            r4.<init>(r0)
            r8 = -1
            r11.append(r8, r4)
            vm r4 = new vm
            r4.<init>(r0)
            r11.append(r10, r4)
            wm r4 = new wm
            r4.<init>(r0)
            r8 = 1
            r11.append(r8, r4)
            fm r4 = new fm
            r4.<init>(r0)
            r8 = 2
            r11.append(r8, r4)
            mm r4 = new mm
            r4.<init>(r0)
            r8 = 3
            r11.append(r8, r4)
            r4 = 23
            boolean r8 = r1.mo3035o(r4)
            r10 = 43
            if (r8 == 0) goto L_0x0429
            r8 = 0
            int r4 = r1.mo3030j(r4, r8)
            r0.setEndIconMode(r4)
            r4 = 22
            boolean r8 = r1.mo3035o(r4)
            if (r8 == 0) goto L_0x040f
            android.graphics.drawable.Drawable r4 = r1.mo3027g(r4)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r4)
        L_0x040f:
            r4 = 21
            boolean r8 = r1.mo3035o(r4)
            if (r8 == 0) goto L_0x041e
            java.lang.CharSequence r4 = r1.mo3034n(r4)
            r0.setEndIconContentDescription((java.lang.CharSequence) r4)
        L_0x041e:
            r4 = 20
            r8 = 1
            boolean r4 = r1.mo3021a(r4, r8)
            r0.setEndIconCheckable(r4)
            goto L_0x046d
        L_0x0429:
            boolean r4 = r1.mo3035o(r10)
            if (r4 == 0) goto L_0x046d
            r4 = 0
            boolean r8 = r1.mo3021a(r10, r4)
            r0.setEndIconMode(r8)
            r4 = 42
            android.graphics.drawable.Drawable r4 = r1.mo3027g(r4)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r4)
            r4 = 41
            java.lang.CharSequence r4 = r1.mo3034n(r4)
            r0.setEndIconContentDescription((java.lang.CharSequence) r4)
            r4 = 44
            boolean r8 = r1.mo3035o(r4)
            if (r8 == 0) goto L_0x0458
            android.content.res.ColorStateList r4 = p000.C0728kh.m2296l(r12, r1, r4)
            r0.setEndIconTintList(r4)
        L_0x0458:
            r4 = 45
            boolean r8 = r1.mo3035o(r4)
            if (r8 == 0) goto L_0x046d
            r8 = -1
            int r4 = r1.mo3030j(r4, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r4 = p000.C0728kh.m2309y(r4, r8)
            r0.setEndIconTintMode(r4)
        L_0x046d:
            boolean r4 = r1.mo3035o(r10)
            if (r4 != 0) goto L_0x0498
            r4 = 24
            boolean r8 = r1.mo3035o(r4)
            if (r8 == 0) goto L_0x0482
            android.content.res.ColorStateList r4 = p000.C0728kh.m2296l(r12, r1, r4)
            r0.setEndIconTintList(r4)
        L_0x0482:
            r4 = 25
            boolean r8 = r1.mo3035o(r4)
            if (r8 == 0) goto L_0x0498
            r8 = -1
            int r4 = r1.mo3030j(r4, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r4 = p000.C0728kh.m2309y(r4, r8)
            r0.setEndIconTintMode(r4)
            goto L_0x0499
        L_0x0498:
            r8 = 0
        L_0x0499:
            j2 r4 = new j2
            r4.<init>(r12, r8)
            r0.f1700w = r4
            r10 = 2131231146(0x7f0801aa, float:1.8078365E38)
            r4.setId(r10)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r11 = -2
            r10.<init>(r11, r11)
            r4.setLayoutParams(r10)
            r10 = 1
            p000.C0813m8.m2458G(r4, r10)
            r14.addView(r5)
            r14.addView(r4)
            j2 r4 = new j2
            r4.<init>(r12, r8)
            r0.f1704y = r4
            r5 = 2131231147(0x7f0801ab, float:1.8078367E38)
            r4.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r10 = -2
            r5.<init>(r10, r10, r8)
            r4.setLayoutParams(r5)
            r5 = 1
            p000.C0813m8.m2458G(r4, r5)
            r3.addView(r4)
            r3.addView(r9)
            r3.addView(r6)
            r0.setHelperTextEnabled(r15)
            r0.setHelperText(r2)
            r0.setHelperTextTextAppearance(r13)
            r0.setErrorEnabled(r7)
            r2 = r16
            r0.setErrorTextAppearance(r2)
            r2 = r29
            r0.setErrorContentDescription(r2)
            int r2 = r0.f1682n
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f1680m
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r28
            r0.setPlaceholderText(r2)
            r2 = r22
            r0.setPlaceholderTextAppearance(r2)
            r2 = r24
            r0.setPrefixText(r2)
            r2 = r23
            r0.setPrefixTextAppearance(r2)
            r2 = r26
            r0.setSuffixText(r2)
            r2 = r25
            r0.setSuffixTextAppearance(r2)
            r2 = 32
            boolean r3 = r1.mo3035o(r2)
            if (r3 == 0) goto L_0x052b
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setErrorTextColor(r2)
        L_0x052b:
            r2 = 36
            boolean r3 = r1.mo3035o(r2)
            if (r3 == 0) goto L_0x053a
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setHelperTextColor(r2)
        L_0x053a:
            r2 = 40
            boolean r2 = r1.mo3035o(r2)
            if (r2 == 0) goto L_0x054b
            r2 = 40
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setHintTextColor(r2)
        L_0x054b:
            r2 = 19
            boolean r2 = r1.mo3035o(r2)
            if (r2 == 0) goto L_0x055c
            r2 = 19
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setCounterTextColor(r2)
        L_0x055c:
            r2 = 17
            boolean r2 = r1.mo3035o(r2)
            if (r2 == 0) goto L_0x056d
            r2 = 17
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x056d:
            r2 = 48
            boolean r2 = r1.mo3035o(r2)
            if (r2 == 0) goto L_0x057e
            r2 = 48
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x057e:
            r2 = 51
            boolean r2 = r1.mo3035o(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 51
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setPrefixTextColor(r2)
        L_0x058f:
            r2 = 61
            boolean r2 = r1.mo3035o(r2)
            if (r2 == 0) goto L_0x05a0
            r2 = 61
            android.content.res.ColorStateList r2 = r1.mo3023c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05a0:
            r2 = r27
            r0.setCounterEnabled(r2)
            r2 = 1
            r3 = 0
            boolean r2 = r1.mo3021a(r3, r2)
            r0.setEnabled(r2)
            android.content.res.TypedArray r1 = r1.f2425b
            r1.recycle()
            r1 = 2
            p000.C0813m8.m2462K(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C1070rm getEndIconDelegate() {
        C1070rm rmVar = this.f1665e0.get(this.f1663d0);
        return rmVar != null ? rmVar : this.f1665e0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f1689q0.getVisibility() == 0) {
            return this.f1689q0;
        }
        if (!mo2402k() || !mo2403l()) {
            return null;
        }
        return this.f1667f0;
    }

    /* renamed from: p */
    public static void m1311p(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m1311p((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: q */
    public static void m1312q(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        Field field = C0813m8.f3234a;
        boolean z = false;
        boolean hasOnClickListeners = Build.VERSION.SDK_INT >= 15 ? checkableImageButton.hasOnClickListeners() : false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (hasOnClickListeners || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C0813m8.m2462K(checkableImageButton, i);
    }

    private void setEditText(EditText editText) {
        if (this.f1666f == null) {
            if (this.f1663d0 != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f1666f = editText;
            mo2405n();
            setTextInputAccessibilityDelegate(new C0329e(this));
            this.f1634E0.mo4041q(this.f1666f.getTypeface());
            C0981pk pkVar = this.f1634E0;
            float textSize = this.f1666f.getTextSize();
            if (pkVar.f3690i != textSize) {
                pkVar.f3690i = textSize;
                pkVar.mo4036k();
            }
            int gravity = this.f1666f.getGravity();
            this.f1634E0.mo4038n((gravity & -113) | 48);
            C0981pk pkVar2 = this.f1634E0;
            if (pkVar2.f3688g != gravity) {
                pkVar2.f3688g = gravity;
                pkVar2.mo4036k();
            }
            this.f1666f.addTextChangedListener(new C0325a());
            if (this.f1693s0 == null) {
                this.f1693s0 = this.f1666f.getHintTextColors();
            }
            if (this.f1706z) {
                if (TextUtils.isEmpty(this.f1625A)) {
                    CharSequence hint = this.f1666f.getHint();
                    this.f1668g = hint;
                    setHint(hint);
                    this.f1666f.setHint((CharSequence) null);
                }
                this.f1627B = true;
            }
            if (this.f1678l != null) {
                mo2492t(this.f1666f.getText().length());
            }
            mo2495w();
            this.f1670h.mo4538b();
            this.f1660c.bringToFront();
            this.f1662d.bringToFront();
            this.f1664e.bringToFront();
            this.f1689q0.bringToFront();
            Iterator it = this.f1661c0.iterator();
            while (it.hasNext()) {
                ((C0330f) it.next()).mo2505a(this);
            }
            mo2334B();
            mo2337E();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            mo2498z(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f1689q0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f1664e;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        mo2337E();
        if (!mo2402k()) {
            mo2494v();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f1625A)) {
            this.f1625A = charSequence;
            C0981pk pkVar = this.f1634E0;
            if (charSequence == null || !TextUtils.equals(pkVar.f3704w, charSequence)) {
                pkVar.f3704w = charSequence;
                pkVar.f3705x = null;
                Bitmap bitmap = pkVar.f3663A;
                if (bitmap != null) {
                    bitmap.recycle();
                    pkVar.f3663A = null;
                }
                pkVar.mo4036k();
            }
            if (!this.f1632D0) {
                mo2406o();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f1686p != z) {
            if (z) {
                C0660j2 j2Var = new C0660j2(getContext(), (AttributeSet) null);
                this.f1688q = j2Var;
                j2Var.setId(R.id.textinput_placeholder);
                C0813m8.m2458G(this.f1688q, 1);
                setPlaceholderTextAppearance(this.f1692s);
                setPlaceholderTextColor(this.f1690r);
                TextView textView = this.f1688q;
                if (textView != null) {
                    this.f1658b.addView(textView);
                    this.f1688q.setVisibility(0);
                }
            } else {
                TextView textView2 = this.f1688q;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.f1688q = null;
            }
            this.f1686p = z;
        }
    }

    /* renamed from: A */
    public final void mo2333A(int i) {
        if (i != 0 || this.f1632D0) {
            TextView textView = this.f1688q;
            if (textView != null && this.f1686p) {
                textView.setText((CharSequence) null);
                this.f1688q.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = this.f1688q;
        if (textView2 != null && this.f1686p) {
            textView2.setText(this.f1684o);
            this.f1688q.setVisibility(0);
            this.f1688q.bringToFront();
        }
    }

    /* renamed from: B */
    public final void mo2334B() {
        int i;
        if (this.f1666f != null) {
            if (this.f1651R.getVisibility() == 0) {
                i = 0;
            } else {
                i = C0813m8.m2482p(this.f1666f);
            }
            C0813m8.m2464M(this.f1700w, i, this.f1666f.getCompoundPaddingTop(), 0, this.f1666f.getCompoundPaddingBottom());
        }
    }

    /* renamed from: C */
    public final void mo2335C() {
        this.f1700w.setVisibility((this.f1698v == null || this.f1632D0) ? 8 : 0);
        mo2494v();
    }

    /* renamed from: D */
    public final void mo2336D(boolean z, boolean z2) {
        int defaultColor = this.f1703x0.getDefaultColor();
        int colorForState = this.f1703x0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f1703x0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f1645L = colorForState2;
        } else if (z2) {
            this.f1645L = colorForState;
        } else {
            this.f1645L = defaultColor;
        }
    }

    /* renamed from: E */
    public final void mo2337E() {
        int i;
        if (this.f1666f != null) {
            if (!mo2403l()) {
                if (!(this.f1689q0.getVisibility() == 0)) {
                    i = C0813m8.m2481o(this.f1666f);
                    C0813m8.m2464M(this.f1704y, 0, this.f1666f.getPaddingTop(), i, this.f1666f.getPaddingBottom());
                }
            }
            i = 0;
            C0813m8.m2464M(this.f1704y, 0, this.f1666f.getPaddingTop(), i, this.f1666f.getPaddingBottom());
        }
    }

    /* renamed from: F */
    public final void mo2338F() {
        int visibility = this.f1704y.getVisibility();
        int i = 0;
        boolean z = this.f1702x != null && !this.f1632D0;
        TextView textView = this.f1704y;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f1704y.getVisibility()) {
            getEndIconDelegate().mo2798c(z);
        }
        mo2494v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f1666f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e9  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2339G() {
        /*
            r6 = this;
            rl r0 = r6.f1629C
            if (r0 == 0) goto L_0x0106
            int r0 = r6.f1637G
            if (r0 != 0) goto L_0x000a
            goto L_0x0106
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f1666f
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f1666f
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f1630C0
        L_0x003c:
            r6.f1645L = r4
            goto L_0x0075
        L_0x003f:
            sm r4 = r6.f1670h
            boolean r4 = r4.mo4541e()
            if (r4 == 0) goto L_0x0056
            android.content.res.ColorStateList r4 = r6.f1703x0
            if (r4 == 0) goto L_0x004f
        L_0x004b:
            r6.mo2336D(r0, r3)
            goto L_0x0075
        L_0x004f:
            sm r4 = r6.f1670h
            int r4 = r4.mo4543g()
            goto L_0x003c
        L_0x0056:
            boolean r4 = r6.f1676k
            if (r4 == 0) goto L_0x0068
            android.widget.TextView r4 = r6.f1678l
            if (r4 == 0) goto L_0x0068
            android.content.res.ColorStateList r5 = r6.f1703x0
            if (r5 == 0) goto L_0x0063
            goto L_0x004b
        L_0x0063:
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            int r4 = r6.f1701w0
            goto L_0x003c
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            int r4 = r6.f1699v0
            goto L_0x003c
        L_0x0072:
            int r4 = r6.f1697u0
            goto L_0x003c
        L_0x0075:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0088
            sm r4 = r6.f1670h
            boolean r5 = r4.f4284l
            if (r5 == 0) goto L_0x0088
            boolean r4 = r4.mo4541e()
            if (r4 == 0) goto L_0x0088
            r1 = 1
        L_0x0088:
            r6.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f1689q0
            android.content.res.ColorStateList r4 = r6.f1691r0
            r6.mo2496x(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f1651R
            android.content.res.ColorStateList r4 = r6.f1652S
            r6.mo2496x(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f1667f0
            android.content.res.ColorStateList r4 = r6.f1671h0
            r6.mo2496x(r1, r4)
            rm r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo3705d()
            if (r1 == 0) goto L_0x00d6
            sm r1 = r6.f1670h
            boolean r1 = r1.mo4541e()
            if (r1 == 0) goto L_0x00d3
            android.graphics.drawable.Drawable r1 = r6.getEndIconDrawable()
            if (r1 == 0) goto L_0x00d3
            android.graphics.drawable.Drawable r1 = r6.getEndIconDrawable()
            android.graphics.drawable.Drawable r1 = p000.C1344x5.m3764j0(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            sm r4 = r6.f1670h
            int r4 = r4.mo4543g()
            p000.C1344x5.m3750c0(r1, r4)
            com.google.android.material.internal.CheckableImageButton r4 = r6.f1667f0
            r4.setImageDrawable(r1)
            goto L_0x00d6
        L_0x00d3:
            r6.mo2344d()
        L_0x00d6:
            if (r0 == 0) goto L_0x00e1
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00e1
            int r1 = r6.f1644K
            goto L_0x00e3
        L_0x00e1:
            int r1 = r6.f1643J
        L_0x00e3:
            r6.f1641I = r1
            int r1 = r6.f1637G
            if (r1 != r2) goto L_0x0103
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00f4
            int r0 = r6.f1707z0
        L_0x00f1:
            r6.f1646M = r0
            goto L_0x0103
        L_0x00f4:
            if (r3 == 0) goto L_0x00fb
            if (r0 != 0) goto L_0x00fb
            int r0 = r6.f1628B0
            goto L_0x00f1
        L_0x00fb:
            if (r0 == 0) goto L_0x0100
            int r0 = r6.f1626A0
            goto L_0x00f1
        L_0x0100:
            int r0 = r6.f1705y0
            goto L_0x00f1
        L_0x0103:
            r6.mo2343c()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2339G():void");
    }

    /* renamed from: a */
    public void mo2340a(C0330f fVar) {
        this.f1661c0.add(fVar);
        if (this.f1666f != null) {
            fVar.mo2505a(this);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f1658b.addView(view, layoutParams2);
            this.f1658b.setLayoutParams(layoutParams);
            mo2497y();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo2342b(float f) {
        if (this.f1634E0.f3684c != f) {
            if (this.f1638G0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f1638G0 = valueAnimator;
                valueAnimator.setInterpolator(C0831mh.f3287b);
                this.f1638G0.setDuration(167);
                this.f1638G0.addUpdateListener(new C0328d());
            }
            this.f1638G0.setFloatValues(new float[]{this.f1634E0.f3684c, f});
            this.f1638G0.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2343c() {
        /*
            r6 = this;
            rl r0 = r6.f1629C
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            ul r1 = r6.f1633E
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.f1637G
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0021
            int r0 = r6.f1641I
            if (r0 <= r2) goto L_0x001c
            int r0 = r6.f1645L
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            rl r0 = r6.f1629C
            int r1 = r6.f1641I
            float r1 = (float) r1
            int r5 = r6.f1645L
            r0.mo4302r(r1, r5)
        L_0x002e:
            int r0 = r6.f1646M
            int r1 = r6.f1637G
            if (r1 != r4) goto L_0x0045
            r0 = 2130903226(0x7f0300ba, float:1.7413264E38)
            android.content.Context r1 = r6.getContext()
            int r0 = p000.C0728kh.m2293i(r1, r0, r3)
            int r1 = r6.f1646M
            int r0 = p000.C0859n6.m2572a(r1, r0)
        L_0x0045:
            r6.f1646M = r0
            rl r1 = r6.f1629C
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.mo4300p(r0)
            int r0 = r6.f1663d0
            r1 = 3
            if (r0 != r1) goto L_0x005e
            android.widget.EditText r0 = r6.f1666f
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x005e:
            rl r0 = r6.f1631D
            if (r0 != 0) goto L_0x0063
            goto L_0x007a
        L_0x0063:
            int r1 = r6.f1641I
            if (r1 <= r2) goto L_0x006c
            int r1 = r6.f1645L
            if (r1 == 0) goto L_0x006c
            r3 = 1
        L_0x006c:
            if (r3 == 0) goto L_0x0077
            int r1 = r6.f1645L
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.mo4300p(r1)
        L_0x0077:
            r6.invalidate()
        L_0x007a:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2343c():void");
    }

    /* renamed from: d */
    public final void mo2344d() {
        mo2349e(this.f1667f0, this.f1673i0, this.f1671h0, this.f1677k0, this.f1675j0);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f1668g == null || (editText = this.f1666f) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f1627B;
        this.f1627B = false;
        CharSequence hint = editText.getHint();
        this.f1666f.setHint(this.f1668g);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f1666f.setHint(hint);
            this.f1627B = z;
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f1642I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1642I0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1706z) {
            C0981pk pkVar = this.f1634E0;
            pkVar.getClass();
            int save = canvas.save();
            if (pkVar.f3705x != null && pkVar.f3683b) {
                boolean z = false;
                pkVar.f3677O.getLineLeft(0);
                pkVar.f3669G.setTextSize(pkVar.f3666D);
                float f = pkVar.f3698q;
                float f2 = pkVar.f3699r;
                if (pkVar.f3707z && pkVar.f3663A != null) {
                    z = true;
                }
                float f3 = pkVar.f3665C;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (z) {
                    canvas.drawBitmap(pkVar.f3663A, f, f2, pkVar.f3664B);
                } else {
                    canvas.translate(f, f2);
                    pkVar.f3677O.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        C1067rl rlVar = this.f1631D;
        if (rlVar != null) {
            Rect bounds = rlVar.getBounds();
            bounds.top = bounds.bottom - this.f1641I;
            this.f1631D.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r2.f3692k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f1640H0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.f1640H0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            pk r2 = r4.f1634E0
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.f3667E = r1
            android.content.res.ColorStateList r1 = r2.f3693l
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.f3692k
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.mo4036k()
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.widget.EditText r2 = r4.f1666f
            if (r2 == 0) goto L_0x004d
            boolean r2 = p000.C0813m8.m2486t(r4)
            if (r2 == 0) goto L_0x0049
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r4.mo2498z(r0, r3)
        L_0x004d:
            r4.mo2495w()
            r4.mo2339G()
            if (r1 == 0) goto L_0x0058
            r4.invalidate()
        L_0x0058:
            r4.f1640H0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final void mo2349e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C1344x5.m3764j0(drawable).mutate();
            if (z) {
                C1344x5.m3752d0(drawable, colorStateList);
            }
            if (z2) {
                C1344x5.m3754e0(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: f */
    public final void mo2350f() {
        mo2349e(this.f1651R, this.f1653T, this.f1652S, this.f1655V, this.f1654U);
    }

    /* renamed from: g */
    public final int mo2351g() {
        float f;
        if (!this.f1706z) {
            return 0;
        }
        int i = this.f1637G;
        if (i == 0 || i == 1) {
            f = this.f1634E0.mo4032f();
        } else if (i != 2) {
            return 0;
        } else {
            f = this.f1634E0.mo4032f() / 2.0f;
        }
        return (int) f;
    }

    public int getBaseline() {
        EditText editText = this.f1666f;
        if (editText == null) {
            return super.getBaseline();
        }
        return mo2351g() + getPaddingTop() + editText.getBaseline();
    }

    public C1067rl getBoxBackground() {
        int i = this.f1637G;
        if (i == 1 || i == 2) {
            return this.f1629C;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1646M;
    }

    public int getBoxBackgroundMode() {
        return this.f1637G;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C1067rl rlVar = this.f1629C;
        return rlVar.f3979b.f4002a.f4654h.mo3635a(rlVar.mo4287h());
    }

    public float getBoxCornerRadiusBottomStart() {
        C1067rl rlVar = this.f1629C;
        return rlVar.f3979b.f4002a.f4653g.mo3635a(rlVar.mo4287h());
    }

    public float getBoxCornerRadiusTopEnd() {
        C1067rl rlVar = this.f1629C;
        return rlVar.f3979b.f4002a.f4652f.mo3635a(rlVar.mo4287h());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f1629C.mo4293l();
    }

    public int getBoxStrokeColor() {
        return this.f1701w0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1703x0;
    }

    public int getBoxStrokeWidth() {
        return this.f1643J;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1644K;
    }

    public int getCounterMaxLength() {
        return this.f1674j;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f1672i || !this.f1676k || (textView = this.f1678l) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1694t;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1694t;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1693s0;
    }

    public EditText getEditText() {
        return this.f1666f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1667f0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1667f0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f1663d0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1667f0;
    }

    public CharSequence getError() {
        C1126sm smVar = this.f1670h;
        if (smVar.f4284l) {
            return smVar.f4283k;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1670h.f4286n;
    }

    public int getErrorCurrentTextColors() {
        return this.f1670h.mo4543g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f1689q0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f1670h.mo4543g();
    }

    public CharSequence getHelperText() {
        C1126sm smVar = this.f1670h;
        if (smVar.f4290r) {
            return smVar.f4289q;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f1670h.f4291s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1706z) {
            return this.f1625A;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1634E0.mo4032f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f1634E0.mo4033g();
    }

    public ColorStateList getHintTextColor() {
        return this.f1695t0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1667f0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1667f0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1686p) {
            return this.f1684o;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1692s;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1690r;
    }

    public CharSequence getPrefixText() {
        return this.f1698v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1700w.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1700w;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1651R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1651R.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f1702x;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1704y.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1704y;
    }

    public Typeface getTypeface() {
        return this.f1650Q;
    }

    /* renamed from: h */
    public final boolean mo2399h() {
        return this.f1706z && !TextUtils.isEmpty(this.f1625A) && (this.f1629C instanceof C0786lm);
    }

    /* renamed from: i */
    public final int mo2400i(int i, boolean z) {
        int compoundPaddingLeft = this.f1666f.getCompoundPaddingLeft() + i;
        return (this.f1698v == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f1700w.getMeasuredWidth()) + this.f1700w.getPaddingLeft();
    }

    /* renamed from: j */
    public final int mo2401j(int i, boolean z) {
        int compoundPaddingRight = i - this.f1666f.getCompoundPaddingRight();
        return (this.f1698v == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f1700w.getMeasuredWidth() - this.f1700w.getPaddingRight());
    }

    /* renamed from: k */
    public final boolean mo2402k() {
        return this.f1663d0 != 0;
    }

    /* renamed from: l */
    public boolean mo2403l() {
        return this.f1664e.getVisibility() == 0 && this.f1667f0.getVisibility() == 0;
    }

    /* renamed from: m */
    public final boolean mo2404m() {
        return this.f1637G == 1 && (Build.VERSION.SDK_INT < 16 || this.f1666f.getMinLines() <= 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2405n() {
        /*
            r4 = this;
            int r0 = r4.f1637G
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 == r2) goto L_0x0040
            r3 = 2
            if (r0 != r3) goto L_0x0027
            boolean r0 = r4.f1706z
            if (r0 == 0) goto L_0x001d
            rl r0 = r4.f1629C
            boolean r0 = r0 instanceof p000.C0786lm
            if (r0 != 0) goto L_0x001d
            lm r0 = new lm
            ul r3 = r4.f1633E
            r0.<init>(r3)
            goto L_0x0024
        L_0x001d:
            rl r0 = new rl
            ul r3 = r4.f1633E
            r0.<init>((p000.C1217ul) r3)
        L_0x0024:
            r4.f1629C = r0
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.f1637G
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0040:
            rl r0 = new rl
            ul r1 = r4.f1633E
            r0.<init>((p000.C1217ul) r1)
            r4.f1629C = r0
            rl r0 = new rl
            r0.<init>()
            r4.f1631D = r0
            goto L_0x0055
        L_0x0051:
            r4.f1629C = r1
        L_0x0053:
            r4.f1631D = r1
        L_0x0055:
            android.widget.EditText r0 = r4.f1666f
            if (r0 == 0) goto L_0x0068
            rl r1 = r4.f1629C
            if (r1 == 0) goto L_0x0068
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L_0x0068
            int r0 = r4.f1637G
            if (r0 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            if (r2 == 0) goto L_0x0072
            android.widget.EditText r0 = r4.f1666f
            rl r1 = r4.f1629C
            p000.C0813m8.m2459H(r0, r1)
        L_0x0072:
            r4.mo2339G()
            int r0 = r4.f1637G
            if (r0 == 0) goto L_0x007c
            r4.mo2497y()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2405n():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2406o() {
        /*
            r12 = this;
            boolean r0 = r12.mo2399h()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.f1649P
            pk r1 = r12.f1634E0
            android.widget.EditText r2 = r12.f1666f
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r12.f1666f
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.f3704w
            boolean r4 = r1.mo4029c(r4)
            r1.f3706y = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 17
            r9 = 5
            if (r3 == r8) goto L_0x004d
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x004d
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x003b
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003b:
            if (r4 == 0) goto L_0x0043
        L_0x003d:
            android.graphics.Rect r4 = r1.f3686e
            int r4 = r4.left
            float r4 = (float) r4
            goto L_0x0055
        L_0x0043:
            android.graphics.Rect r4 = r1.f3686e
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.mo4028b()
            goto L_0x0054
        L_0x004d:
            float r4 = (float) r2
            float r4 = r4 / r7
            float r10 = r1.mo4028b()
            float r10 = r10 / r7
        L_0x0054:
            float r4 = r4 - r10
        L_0x0055:
            r0.left = r4
            android.graphics.Rect r10 = r1.f3686e
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r3 == r8) goto L_0x0081
            r8 = r3 & 7
            if (r8 != r6) goto L_0x0065
            goto L_0x0081
        L_0x0065:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x0073
            r2 = r3 & 5
            if (r2 != r9) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            boolean r2 = r1.f3706y
            if (r2 == 0) goto L_0x0077
            goto L_0x007d
        L_0x0073:
            boolean r2 = r1.f3706y
            if (r2 == 0) goto L_0x007d
        L_0x0077:
            float r2 = r1.mo4028b()
            float r2 = r2 + r4
            goto L_0x0089
        L_0x007d:
            int r2 = r10.right
            float r2 = (float) r2
            goto L_0x0089
        L_0x0081:
            float r2 = (float) r2
            float r2 = r2 / r7
            float r3 = r1.mo4028b()
            float r3 = r3 / r7
            float r2 = r2 + r3
        L_0x0089:
            r0.right = r2
            android.graphics.Rect r2 = r1.f3686e
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1.mo4032f()
            float r1 = r1 + r2
            r0.bottom = r1
            float r2 = r0.left
            int r3 = r12.f1635F
            float r3 = (float) r3
            float r2 = r2 - r3
            r0.left = r2
            float r2 = r0.top
            float r2 = r2 - r3
            r0.top = r2
            float r2 = r0.right
            float r2 = r2 + r3
            r0.right = r2
            float r1 = r1 + r3
            r0.bottom = r1
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r12.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            r0.offset(r1, r2)
            rl r1 = r12.f1629C
            lm r1 = (p000.C0786lm) r1
            r1.getClass()
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.mo3639x(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2406o():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            super.onLayout(r4, r5, r6, r7, r8)
            android.widget.EditText r4 = r3.f1666f
            if (r4 == 0) goto L_0x0166
            android.graphics.Rect r5 = r3.f1647N
            p000.C1024qk.m2942a(r3, r4, r5)
            rl r4 = r3.f1631D
            if (r4 == 0) goto L_0x001d
            int r6 = r5.bottom
            int r7 = r3.f1644K
            int r7 = r6 - r7
            int r8 = r5.left
            int r0 = r5.right
            r4.setBounds(r8, r7, r0, r6)
        L_0x001d:
            boolean r4 = r3.f1706z
            if (r4 == 0) goto L_0x0166
            pk r4 = r3.f1634E0
            android.widget.EditText r6 = r3.f1666f
            float r6 = r6.getTextSize()
            float r7 = r4.f3690i
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x0034
            r4.f3690i = r6
            r4.mo4036k()
        L_0x0034:
            android.widget.EditText r4 = r3.f1666f
            int r4 = r4.getGravity()
            pk r6 = r3.f1634E0
            r7 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r7 = r7 | 48
            r6.mo4038n(r7)
            pk r6 = r3.f1634E0
            int r7 = r6.f3688g
            if (r7 == r4) goto L_0x004e
            r6.f3688g = r4
            r6.mo4036k()
        L_0x004e:
            pk r4 = r3.f1634E0
            android.widget.EditText r6 = r3.f1666f
            if (r6 == 0) goto L_0x0160
            android.graphics.Rect r6 = r3.f1648O
            int r7 = p000.C0813m8.m2478l(r3)
            r8 = 1
            if (r7 != r8) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            int r0 = r5.bottom
            r6.bottom = r0
            int r0 = r3.f1637G
            if (r0 == r8) goto L_0x0096
            r1 = 2
            if (r0 == r1) goto L_0x0078
            int r0 = r5.left
            int r0 = r3.mo2400i(r0, r7)
            r6.left = r0
            int r0 = r3.getPaddingTop()
            goto L_0x00a3
        L_0x0078:
            int r7 = r5.left
            android.widget.EditText r0 = r3.f1666f
            int r0 = r0.getPaddingLeft()
            int r0 = r0 + r7
            r6.left = r0
            int r7 = r5.top
            int r0 = r3.mo2351g()
            int r7 = r7 - r0
            r6.top = r7
            int r7 = r5.right
            android.widget.EditText r0 = r3.f1666f
            int r0 = r0.getPaddingRight()
            int r7 = r7 - r0
            goto L_0x00ab
        L_0x0096:
            int r0 = r5.left
            int r0 = r3.mo2400i(r0, r7)
            r6.left = r0
            int r0 = r5.top
            int r1 = r3.f1639H
            int r0 = r0 + r1
        L_0x00a3:
            r6.top = r0
            int r0 = r5.right
            int r7 = r3.mo2401j(r0, r7)
        L_0x00ab:
            r6.right = r7
            r4.getClass()
            int r7 = r6.left
            int r0 = r6.top
            int r1 = r6.right
            int r6 = r6.bottom
            android.graphics.Rect r2 = r4.f3686e
            boolean r2 = p000.C0981pk.m2869l(r2, r7, r0, r1, r6)
            if (r2 != 0) goto L_0x00ca
            android.graphics.Rect r2 = r4.f3686e
            r2.set(r7, r0, r1, r6)
            r4.f3668F = r8
            r4.mo4035j()
        L_0x00ca:
            pk r4 = r3.f1634E0
            android.widget.EditText r6 = r3.f1666f
            if (r6 == 0) goto L_0x015a
            android.graphics.Rect r6 = r3.f1648O
            android.text.TextPaint r7 = r4.f3670H
            float r0 = r4.f3690i
            r7.setTextSize(r0)
            android.graphics.Typeface r0 = r4.f3701t
            r7.setTypeface(r0)
            android.text.TextPaint r7 = r4.f3670H
            float r7 = r7.ascent()
            float r7 = -r7
            int r0 = r5.left
            android.widget.EditText r1 = r3.f1666f
            int r1 = r1.getCompoundPaddingLeft()
            int r1 = r1 + r0
            r6.left = r1
            boolean r0 = r3.mo2404m()
            if (r0 == 0) goto L_0x0102
            int r0 = r5.centerY()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r7 / r1
            float r0 = r0 - r1
            int r0 = (int) r0
            goto L_0x010b
        L_0x0102:
            int r0 = r5.top
            android.widget.EditText r1 = r3.f1666f
            int r1 = r1.getCompoundPaddingTop()
            int r0 = r0 + r1
        L_0x010b:
            r6.top = r0
            int r0 = r5.right
            android.widget.EditText r1 = r3.f1666f
            int r1 = r1.getCompoundPaddingRight()
            int r0 = r0 - r1
            r6.right = r0
            boolean r0 = r3.mo2404m()
            if (r0 == 0) goto L_0x0124
            int r5 = r6.top
            float r5 = (float) r5
            float r5 = r5 + r7
            int r5 = (int) r5
            goto L_0x012d
        L_0x0124:
            int r5 = r5.bottom
            android.widget.EditText r7 = r3.f1666f
            int r7 = r7.getCompoundPaddingBottom()
            int r5 = r5 - r7
        L_0x012d:
            r6.bottom = r5
            int r7 = r6.left
            int r0 = r6.top
            int r6 = r6.right
            android.graphics.Rect r1 = r4.f3685d
            boolean r1 = p000.C0981pk.m2869l(r1, r7, r0, r6, r5)
            if (r1 != 0) goto L_0x0147
            android.graphics.Rect r1 = r4.f3685d
            r1.set(r7, r0, r6, r5)
            r4.f3668F = r8
            r4.mo4035j()
        L_0x0147:
            pk r4 = r3.f1634E0
            r4.mo4036k()
            boolean r4 = r3.mo2399h()
            if (r4 == 0) goto L_0x0166
            boolean r4 = r3.f1632D0
            if (r4 != 0) goto L_0x0166
            r3.mo2406o()
            goto L_0x0166
        L_0x015a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L_0x0160:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f1666f != null && this.f1666f.getMeasuredHeight() < (max = Math.max(this.f1662d.getMeasuredHeight(), this.f1660c.getMeasuredHeight()))) {
            this.f1666f.setMinimumHeight(max);
            z = true;
        }
        boolean v = mo2494v();
        if (z || v) {
            this.f1666f.post(new C0327c());
        }
        if (!(this.f1688q == null || (editText = this.f1666f) == null)) {
            this.f1688q.setGravity(editText.getGravity());
            this.f1688q.setPadding(this.f1666f.getCompoundPaddingLeft(), this.f1666f.getCompoundPaddingTop(), this.f1666f.getCompoundPaddingRight(), this.f1666f.getCompoundPaddingBottom());
        }
        mo2334B();
        mo2337E();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0332h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0332h hVar = (C0332h) parcelable;
        super.onRestoreInstanceState(hVar.f2988b);
        setError(hVar.f1713d);
        if (hVar.f1714e) {
            this.f1667f0.post(new C0326b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0332h hVar = new C0332h(super.onSaveInstanceState());
        if (this.f1670h.mo4541e()) {
            hVar.f1713d = getError();
        }
        hVar.f1714e = mo2402k() && this.f1667f0.isChecked();
        return hVar;
    }

    /* renamed from: r */
    public void mo2411r(TextView textView, int i) {
        boolean z = true;
        try {
            C1344x5.m3748b0(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C1344x5.m3748b0(textView, 2131755346);
            textView.setTextColor(C0408e6.m1547a(getContext(), R.color.design_error));
        }
    }

    /* renamed from: s */
    public final void mo2412s() {
        if (this.f1678l != null) {
            EditText editText = this.f1666f;
            mo2492t(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1646M != i) {
            this.f1646M = i;
            this.f1705y0 = i;
            this.f1626A0 = i;
            this.f1628B0 = i;
            mo2343c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0408e6.m1547a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1705y0 = defaultColor;
        this.f1646M = defaultColor;
        this.f1707z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1626A0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f1628B0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        mo2343c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f1637G) {
            this.f1637G = i;
            if (this.f1666f != null) {
                mo2405n();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1701w0 != i) {
            this.f1701w0 = i;
            mo2339G();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f1697u0 = colorStateList.getDefaultColor();
            this.f1630C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1699v0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f1701w0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            mo2339G();
        }
        this.f1701w0 = defaultColor;
        mo2339G();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1703x0 != colorStateList) {
            this.f1703x0 = colorStateList;
            mo2339G();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1643J = i;
        mo2339G();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1644K = i;
        mo2339G();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f1672i != z) {
            if (z) {
                C0660j2 j2Var = new C0660j2(getContext(), (AttributeSet) null);
                this.f1678l = j2Var;
                j2Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f1650Q;
                if (typeface != null) {
                    this.f1678l.setTypeface(typeface);
                }
                this.f1678l.setMaxLines(1);
                this.f1670h.mo4537a(this.f1678l, 2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1678l.getLayoutParams();
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start);
                if (Build.VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginStart(dimensionPixelOffset);
                } else {
                    marginLayoutParams.leftMargin = dimensionPixelOffset;
                }
                mo2493u();
                mo2412s();
            } else {
                this.f1670h.mo4545i(this.f1678l, 2);
                this.f1678l = null;
            }
            this.f1672i = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1674j != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f1674j = i;
            if (this.f1672i) {
                mo2412s();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1680m != i) {
            this.f1680m = i;
            mo2493u();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1696u != colorStateList) {
            this.f1696u = colorStateList;
            mo2493u();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1682n != i) {
            this.f1682n = i;
            mo2493u();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1694t != colorStateList) {
            this.f1694t = colorStateList;
            mo2493u();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1693s0 = colorStateList;
        this.f1695t0 = colorStateList;
        if (this.f1666f != null) {
            mo2498z(false, false);
        }
    }

    public void setEnabled(boolean z) {
        m1311p(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f1667f0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f1667f0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f1667f0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C0399e0.m1530b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f1667f0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f1663d0;
        this.f1663d0 = i;
        Iterator it = this.f1669g0.iterator();
        while (it.hasNext()) {
            ((C0331g) it.next()).mo2506a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo3704b(this.f1637G)) {
            getEndIconDelegate().mo2797a();
            mo2344d();
            return;
        }
        StringBuilder c = C0279ch.m1106c("The current box background mode ");
        c.append(this.f1637G);
        c.append(" is not supported by the end icon mode ");
        c.append(i);
        throw new IllegalStateException(c.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f1667f0;
        View.OnLongClickListener onLongClickListener = this.f1685o0;
        checkableImageButton.setOnClickListener(onClickListener);
        m1312q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1685o0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1667f0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1312q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f1671h0 != colorStateList) {
            this.f1671h0 = colorStateList;
            this.f1673i0 = true;
            mo2344d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f1675j0 != mode) {
            this.f1675j0 = mode;
            this.f1677k0 = true;
            mo2344d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo2403l() != z) {
            this.f1667f0.setVisibility(z ? 0 : 8);
            mo2337E();
            mo2494v();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f1670h.f4284l) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C1126sm smVar = this.f1670h;
            smVar.mo4539c();
            smVar.f4283k = charSequence;
            smVar.f4285m.setText(charSequence);
            int i = smVar.f4281i;
            if (i != 1) {
                smVar.f4282j = 1;
            }
            smVar.mo4547k(i, smVar.f4282j, smVar.mo4546j(smVar.f4285m, charSequence));
            return;
        }
        this.f1670h.mo4544h();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C1126sm smVar = this.f1670h;
        smVar.f4286n = charSequence;
        TextView textView = smVar.f4285m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C1126sm smVar = this.f1670h;
        if (smVar.f4284l != z) {
            smVar.mo4539c();
            if (z) {
                C0660j2 j2Var = new C0660j2(smVar.f4273a, (AttributeSet) null);
                smVar.f4285m = j2Var;
                j2Var.setId(R.id.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    smVar.f4285m.setTextAlignment(5);
                }
                Typeface typeface = smVar.f4294v;
                if (typeface != null) {
                    smVar.f4285m.setTypeface(typeface);
                }
                int i = smVar.f4287o;
                smVar.f4287o = i;
                TextView textView = smVar.f4285m;
                if (textView != null) {
                    smVar.f4274b.mo2411r(textView, i);
                }
                ColorStateList colorStateList = smVar.f4288p;
                smVar.f4288p = colorStateList;
                TextView textView2 = smVar.f4285m;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = smVar.f4286n;
                smVar.f4286n = charSequence;
                TextView textView3 = smVar.f4285m;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                smVar.f4285m.setVisibility(4);
                C0813m8.m2458G(smVar.f4285m, 1);
                smVar.mo4537a(smVar.f4285m, 0);
            } else {
                smVar.mo4544h();
                smVar.mo4545i(smVar.f4285m, 0);
                smVar.f4285m = null;
                smVar.f4274b.mo2495w();
                smVar.f4274b.mo2339G();
            }
            smVar.f4284l = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C0399e0.m1530b(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1689q0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f1670h.f4284l);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f1689q0;
        View.OnLongClickListener onLongClickListener = this.f1687p0;
        checkableImageButton.setOnClickListener(onClickListener);
        m1312q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1687p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1689q0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1312q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f1691r0 = colorStateList;
        Drawable drawable = this.f1689q0.getDrawable();
        if (drawable != null) {
            drawable = C1344x5.m3764j0(drawable).mutate();
            C1344x5.m3752d0(drawable, colorStateList);
        }
        if (this.f1689q0.getDrawable() != drawable) {
            this.f1689q0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1689q0.getDrawable();
        if (drawable != null) {
            drawable = C1344x5.m3764j0(drawable).mutate();
            C1344x5.m3754e0(drawable, mode);
        }
        if (this.f1689q0.getDrawable() != drawable) {
            this.f1689q0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C1126sm smVar = this.f1670h;
        smVar.f4287o = i;
        TextView textView = smVar.f4285m;
        if (textView != null) {
            smVar.f4274b.mo2411r(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C1126sm smVar = this.f1670h;
        smVar.f4288p = colorStateList;
        TextView textView = smVar.f4285m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f1670h.f4290r) {
                setHelperTextEnabled(true);
            }
            C1126sm smVar = this.f1670h;
            smVar.mo4539c();
            smVar.f4289q = charSequence;
            smVar.f4291s.setText(charSequence);
            int i = smVar.f4281i;
            if (i != 2) {
                smVar.f4282j = 2;
            }
            smVar.mo4547k(i, smVar.f4282j, smVar.mo4546j(smVar.f4291s, charSequence));
        } else if (this.f1670h.f4290r) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C1126sm smVar = this.f1670h;
        smVar.f4293u = colorStateList;
        TextView textView = smVar.f4291s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C1126sm smVar = this.f1670h;
        if (smVar.f4290r != z) {
            smVar.mo4539c();
            if (z) {
                C0660j2 j2Var = new C0660j2(smVar.f4273a, (AttributeSet) null);
                smVar.f4291s = j2Var;
                j2Var.setId(R.id.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    smVar.f4291s.setTextAlignment(5);
                }
                Typeface typeface = smVar.f4294v;
                if (typeface != null) {
                    smVar.f4291s.setTypeface(typeface);
                }
                smVar.f4291s.setVisibility(4);
                C0813m8.m2458G(smVar.f4291s, 1);
                int i = smVar.f4292t;
                smVar.f4292t = i;
                TextView textView = smVar.f4291s;
                if (textView != null) {
                    C1344x5.m3748b0(textView, i);
                }
                ColorStateList colorStateList = smVar.f4293u;
                smVar.f4293u = colorStateList;
                TextView textView2 = smVar.f4291s;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                smVar.mo4537a(smVar.f4291s, 1);
            } else {
                smVar.mo4539c();
                int i2 = smVar.f4281i;
                if (i2 == 2) {
                    smVar.f4282j = 0;
                }
                smVar.mo4547k(i2, smVar.f4282j, smVar.mo4546j(smVar.f4291s, (CharSequence) null));
                smVar.mo4545i(smVar.f4291s, 1);
                smVar.f4291s = null;
                smVar.f4274b.mo2495w();
                smVar.f4274b.mo2339G();
            }
            smVar.f4290r = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C1126sm smVar = this.f1670h;
        smVar.f4292t = i;
        TextView textView = smVar.f4291s;
        if (textView != null) {
            C1344x5.m3748b0(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1706z) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f1636F0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f1706z) {
            this.f1706z = z;
            if (!z) {
                this.f1627B = false;
                if (!TextUtils.isEmpty(this.f1625A) && TextUtils.isEmpty(this.f1666f.getHint())) {
                    this.f1666f.setHint(this.f1625A);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f1666f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1625A)) {
                        setHint(hint);
                    }
                    this.f1666f.setHint((CharSequence) null);
                }
                this.f1627B = true;
            }
            if (this.f1666f != null) {
                mo2497y();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0981pk pkVar = this.f1634E0;
        C0427el elVar = new C0427el(pkVar.f3682a.getContext(), i);
        ColorStateList colorStateList = elVar.f2007b;
        if (colorStateList != null) {
            pkVar.f3693l = colorStateList;
        }
        float f = elVar.f2006a;
        if (f != 0.0f) {
            pkVar.f3691j = f;
        }
        ColorStateList colorStateList2 = elVar.f2011f;
        if (colorStateList2 != null) {
            pkVar.f3676N = colorStateList2;
        }
        pkVar.f3674L = elVar.f2012g;
        pkVar.f3675M = elVar.f2013h;
        pkVar.f3673K = elVar.f2014i;
        C0384dl dlVar = pkVar.f3703v;
        if (dlVar != null) {
            dlVar.f1908c = true;
        }
        C0932ok okVar = new C0932ok(pkVar);
        elVar.mo2729a();
        pkVar.f3703v = new C0384dl(okVar, elVar.f2017l);
        elVar.mo2730b(pkVar.f3682a.getContext(), pkVar.f3703v);
        pkVar.mo4036k();
        this.f1695t0 = this.f1634E0.f3693l;
        if (this.f1666f != null) {
            mo2498z(false, false);
            mo2497y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1695t0 != colorStateList) {
            if (this.f1693s0 == null) {
                C0981pk pkVar = this.f1634E0;
                if (pkVar.f3693l != colorStateList) {
                    pkVar.f3693l = colorStateList;
                    pkVar.mo4036k();
                }
            }
            this.f1695t0 = colorStateList;
            if (this.f1666f != null) {
                mo2498z(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1667f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0399e0.m1530b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1667f0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f1663d0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f1671h0 = colorStateList;
        this.f1673i0 = true;
        mo2344d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f1675j0 = mode;
        this.f1677k0 = true;
        mo2344d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 0;
        if (!this.f1686p || !TextUtils.isEmpty(charSequence)) {
            if (!this.f1686p) {
                setPlaceholderTextEnabled(true);
            }
            this.f1684o = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.f1666f;
        if (editText != null) {
            i = editText.getText().length();
        }
        mo2333A(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1692s = i;
        TextView textView = this.f1688q;
        if (textView != null) {
            C1344x5.m3748b0(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1690r != colorStateList) {
            this.f1690r = colorStateList;
            TextView textView = this.f1688q;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f1698v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f1700w.setText(charSequence);
        mo2335C();
    }

    public void setPrefixTextAppearance(int i) {
        C1344x5.m3748b0(this.f1700w, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1700w.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f1651R.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f1651R.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0399e0.m1530b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1651R.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            mo2350f();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f1651R;
        View.OnLongClickListener onLongClickListener = this.f1659b0;
        checkableImageButton.setOnClickListener(onClickListener);
        m1312q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1659b0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1651R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1312q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f1652S != colorStateList) {
            this.f1652S = colorStateList;
            this.f1653T = true;
            mo2350f();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f1654U != mode) {
            this.f1654U = mode;
            this.f1655V = true;
            mo2350f();
        }
    }

    public void setStartIconVisible(boolean z) {
        int i = 0;
        if ((this.f1651R.getVisibility() == 0) != z) {
            CheckableImageButton checkableImageButton = this.f1651R;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo2334B();
            mo2494v();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f1702x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f1704y.setText(charSequence);
        mo2338F();
    }

    public void setSuffixTextAppearance(int i) {
        C1344x5.m3748b0(this.f1704y, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1704y.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0329e eVar) {
        EditText editText = this.f1666f;
        if (editText != null) {
            C0813m8.m2457F(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1650Q) {
            this.f1650Q = typeface;
            this.f1634E0.mo4041q(typeface);
            C1126sm smVar = this.f1670h;
            if (typeface != smVar.f4294v) {
                smVar.f4294v = typeface;
                TextView textView = smVar.f4285m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = smVar.f4291s;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f1678l;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public void mo2492t(int i) {
        boolean z = this.f1676k;
        int i2 = this.f1674j;
        String str = null;
        if (i2 == -1) {
            this.f1678l.setText(String.valueOf(i));
            this.f1678l.setContentDescription((CharSequence) null);
            this.f1676k = false;
        } else {
            this.f1676k = i > i2;
            Context context = getContext();
            this.f1678l.setContentDescription(context.getString(this.f1676k ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1674j)}));
            if (z != this.f1676k) {
                mo2493u();
            }
            C0959p7 c = C0959p7.m2783c();
            TextView textView = this.f1678l;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1674j)});
            C1101s7 s7Var = c.f3576c;
            if (string != null) {
                str = c.mo3973d(string, s7Var, true).toString();
            }
            textView.setText(str);
        }
        if (this.f1666f != null && z != this.f1676k) {
            mo2498z(false, false);
            mo2339G();
            mo2495w();
        }
    }

    /* renamed from: u */
    public final void mo2493u() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f1678l;
        if (textView != null) {
            mo2411r(textView, this.f1676k ? this.f1680m : this.f1682n);
            if (!this.f1676k && (colorStateList2 = this.f1694t) != null) {
                this.f1678l.setTextColor(colorStateList2);
            }
            if (this.f1676k && (colorStateList = this.f1696u) != null) {
                this.f1678l.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2494v() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f1666f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x0011
            java.lang.CharSequence r0 = r10.f1698v
            if (r0 == 0) goto L_0x001b
        L_0x0011:
            android.widget.LinearLayout r0 = r10.f1660c
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x005d
            android.widget.LinearLayout r0 = r10.f1660c
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f1666f
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f1656W
            if (r6 == 0) goto L_0x0036
            int r6 = r10.f1657a0
            if (r6 == r0) goto L_0x0042
        L_0x0036:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f1656W = r6
            r10.f1657a0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x0042:
            android.widget.EditText r0 = r10.f1666f
            android.graphics.drawable.Drawable[] r0 = p000.C1344x5.m3778w(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f1656W
            if (r6 == r7) goto L_0x005b
            android.widget.EditText r6 = r10.f1666f
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            p000.C1344x5.m3736R(r6, r7, r8, r9, r0)
        L_0x0059:
            r0 = 1
            goto L_0x0075
        L_0x005b:
            r0 = 0
            goto L_0x0075
        L_0x005d:
            android.graphics.drawable.Drawable r0 = r10.f1656W
            if (r0 == 0) goto L_0x005b
            android.widget.EditText r0 = r10.f1666f
            android.graphics.drawable.Drawable[] r0 = p000.C1344x5.m3778w(r0)
            android.widget.EditText r6 = r10.f1666f
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            p000.C1344x5.m3736R(r6, r3, r7, r8, r0)
            r10.f1656W = r3
            goto L_0x0059
        L_0x0075:
            com.google.android.material.internal.CheckableImageButton r6 = r10.f1689q0
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x008d
            boolean r6 = r10.mo2402k()
            if (r6 == 0) goto L_0x0089
            boolean r6 = r10.mo2403l()
            if (r6 != 0) goto L_0x008d
        L_0x0089:
            java.lang.CharSequence r6 = r10.f1702x
            if (r6 == 0) goto L_0x0097
        L_0x008d:
            android.widget.LinearLayout r6 = r10.f1662d
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x0097
            r6 = 1
            goto L_0x0098
        L_0x0097:
            r6 = 0
        L_0x0098:
            if (r6 == 0) goto L_0x0104
            android.widget.TextView r3 = r10.f1704y
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f1666f
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00bd
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = p000.C1344x5.m3781z(r3)
            int r3 = r3 + r7
        L_0x00bd:
            android.widget.EditText r6 = r10.f1666f
            android.graphics.drawable.Drawable[] r6 = p000.C1344x5.m3778w(r6)
            android.graphics.drawable.Drawable r7 = r10.f1679l0
            if (r7 == 0) goto L_0x00de
            int r8 = r10.f1681m0
            if (r8 == r3) goto L_0x00de
            r10.f1681m0 = r3
            r7.setBounds(r1, r1, r3, r2)
            android.widget.EditText r0 = r10.f1666f
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r5 = r10.f1679l0
            r4 = r6[r4]
            p000.C1344x5.m3736R(r0, r1, r3, r5, r4)
            goto L_0x0125
        L_0x00de:
            if (r7 != 0) goto L_0x00ec
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f1679l0 = r7
            r10.f1681m0 = r3
            r7.setBounds(r1, r1, r3, r2)
        L_0x00ec:
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f1679l0
            if (r3 == r7) goto L_0x0102
            r0 = r6[r5]
            r10.f1683n0 = r0
            android.widget.EditText r0 = r10.f1666f
            r1 = r6[r1]
            r3 = r6[r2]
            r4 = r6[r4]
            p000.C1344x5.m3736R(r0, r1, r3, r7, r4)
            goto L_0x0125
        L_0x0102:
            r2 = r0
            goto L_0x0125
        L_0x0104:
            android.graphics.drawable.Drawable r6 = r10.f1679l0
            if (r6 == 0) goto L_0x0126
            android.widget.EditText r6 = r10.f1666f
            android.graphics.drawable.Drawable[] r6 = p000.C1344x5.m3778w(r6)
            r5 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f1679l0
            if (r5 != r7) goto L_0x0122
            android.widget.EditText r0 = r10.f1666f
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f1683n0
            r4 = r6[r4]
            p000.C1344x5.m3736R(r0, r1, r5, r7, r4)
            goto L_0x0123
        L_0x0122:
            r2 = r0
        L_0x0123:
            r10.f1679l0 = r3
        L_0x0125:
            r0 = r2
        L_0x0126:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2494v():boolean");
    }

    /* renamed from: w */
    public void mo2495w() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f1666f;
        if (editText != null && this.f1637G == 0 && (background = editText.getBackground()) != null) {
            if (C0912o2.m2664a(background)) {
                background = background.mutate();
            }
            if (this.f1670h.mo4541e()) {
                currentTextColor = this.f1670h.mo4543g();
            } else if (!this.f1676k || (textView = this.f1678l) == null) {
                C1344x5.m3761i(background);
                this.f1666f.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C1231v1.m3414c(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* renamed from: x */
    public final void mo2496x(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C1344x5.m3764j0(drawable).mutate();
            C1344x5.m3752d0(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: y */
    public final void mo2497y() {
        if (this.f1637G != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1658b.getLayoutParams();
            int g = mo2351g();
            if (g != layoutParams.topMargin) {
                layoutParams.topMargin = g;
                this.f1658b.requestLayout();
            }
        }
    }

    /* renamed from: z */
    public final void mo2498z(boolean z, boolean z2) {
        C0981pk pkVar;
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1666f;
        int i = 0;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f1666f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean e = this.f1670h.mo4541e();
        ColorStateList colorStateList2 = this.f1693s0;
        if (colorStateList2 != null) {
            C0981pk pkVar2 = this.f1634E0;
            if (pkVar2.f3693l != colorStateList2) {
                pkVar2.f3693l = colorStateList2;
                pkVar2.mo4036k();
            }
            C0981pk pkVar3 = this.f1634E0;
            ColorStateList colorStateList3 = this.f1693s0;
            if (pkVar3.f3692k != colorStateList3) {
                pkVar3.f3692k = colorStateList3;
                pkVar3.mo4036k();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f1693s0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f1630C0) : this.f1630C0;
            this.f1634E0.mo4037m(ColorStateList.valueOf(colorForState));
            C0981pk pkVar4 = this.f1634E0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (pkVar4.f3692k != valueOf) {
                pkVar4.f3692k = valueOf;
                pkVar4.mo4036k();
            }
        } else if (e) {
            C0981pk pkVar5 = this.f1634E0;
            TextView textView2 = this.f1670h.f4285m;
            pkVar5.mo4037m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f1676k && (textView = this.f1678l) != null) {
                pkVar = this.f1634E0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f1695t0) != null) {
                pkVar = this.f1634E0;
            }
            pkVar.mo4037m(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || e))) {
            if (z2 || this.f1632D0) {
                ValueAnimator valueAnimator = this.f1638G0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1638G0.cancel();
                }
                if (!z || !this.f1636F0) {
                    this.f1634E0.mo4039o(1.0f);
                } else {
                    mo2342b(1.0f);
                }
                this.f1632D0 = false;
                if (mo2399h()) {
                    mo2406o();
                }
                EditText editText3 = this.f1666f;
                if (editText3 != null) {
                    i = editText3.getText().length();
                }
                mo2333A(i);
                mo2335C();
                mo2338F();
            }
        } else if (z2 || !this.f1632D0) {
            ValueAnimator valueAnimator2 = this.f1638G0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1638G0.cancel();
            }
            if (!z || !this.f1636F0) {
                this.f1634E0.mo4039o(0.0f);
            } else {
                mo2342b(0.0f);
            }
            if (mo2399h() && (!((C0786lm) this.f1629C).f3177A.isEmpty()) && mo2399h()) {
                ((C0786lm) this.f1629C).mo3639x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1632D0 = true;
            TextView textView3 = this.f1688q;
            if (textView3 != null && this.f1686p) {
                textView3.setText((CharSequence) null);
                this.f1688q.setVisibility(4);
            }
            mo2335C();
            mo2338F();
        }
    }
}
