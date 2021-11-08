package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import p000.C1067rl;
import p000.C1170ti;
import p000.C1347x8;

public class Chip extends C1094s1 implements C1170ti.C1171a, C1422yl {

    /* renamed from: u */
    public static final Rect f1547u = new Rect();

    /* renamed from: v */
    public static final int[] f1548v = {16842913};

    /* renamed from: w */
    public static final int[] f1549w = {16842911};

    /* renamed from: e */
    public C1170ti f1550e;

    /* renamed from: f */
    public InsetDrawable f1551f;

    /* renamed from: g */
    public RippleDrawable f1552g;

    /* renamed from: h */
    public View.OnClickListener f1553h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f1554i;

    /* renamed from: j */
    public boolean f1555j;

    /* renamed from: k */
    public boolean f1556k;

    /* renamed from: l */
    public boolean f1557l;

    /* renamed from: m */
    public boolean f1558m;

    /* renamed from: n */
    public boolean f1559n;

    /* renamed from: o */
    public int f1560o;

    /* renamed from: p */
    public int f1561p;

    /* renamed from: q */
    public final C0311b f1562q;

    /* renamed from: r */
    public final Rect f1563r = new Rect();

    /* renamed from: s */
    public final RectF f1564s = new RectF();

    /* renamed from: t */
    public final C0541gl f1565t = new C0310a();

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C0310a extends C0541gl {
        public C0310a() {
        }

        /* renamed from: a */
        public void mo2140a(int i) {
        }

        /* renamed from: b */
        public void mo2141b(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            C1170ti tiVar = chip.f1550e;
            if (tiVar.f4458F0) {
                charSequence = tiVar.f4459G;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C0311b extends C0762l9 {
        public C0311b(Chip chip) {
            super(chip);
        }

        /* renamed from: n */
        public int mo2142n(float f, float f2) {
            Chip chip = Chip.this;
            Rect rect = Chip.f1547u;
            return (!chip.mo1997e() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* renamed from: o */
        public void mo2143o(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f1547u;
            if (chip.mo1997e()) {
                Chip chip2 = Chip.this;
                C1170ti tiVar = chip2.f1550e;
                if (tiVar != null && tiVar.f4467M) {
                    z = true;
                }
                if (z && chip2.f1553h != null) {
                    list.add(1);
                }
            }
        }

        /* renamed from: r */
        public boolean mo2144r(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f1553h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.f1562q.mo3611w(1, 1);
                }
            }
            return z;
        }

        /* renamed from: s */
        public void mo2145s(C1347x8 x8Var) {
            x8Var.f5038a.setCheckable(Chip.this.mo1998f());
            x8Var.f5038a.setClickable(Chip.this.isClickable());
            if (Chip.this.mo1998f() || Chip.this.isClickable()) {
                x8Var.f5038a.setClassName(Chip.this.mo1998f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                x8Var.f5038a.setClassName("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                x8Var.f5038a.setText(text);
            } else {
                x8Var.f5038a.setContentDescription(text);
            }
        }

        /* renamed from: t */
        public void mo2146t(int i, C1347x8 x8Var) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                x8Var.f5038a.setContentDescription(closeIconContentDescription);
                x8Var.f5038a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                x8Var.mo5055a(C1347x8.C1348a.f5041e);
                x8Var.f5038a.setEnabled(Chip.this.isEnabled());
                return;
            }
            x8Var.f5038a.setContentDescription(charSequence);
            x8Var.f5038a.setBoundsInParent(Chip.f1547u);
        }

        /* renamed from: u */
        public void mo2147u(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f1558m = z;
                chip.refreshDrawableState();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010a, code lost:
        r4 = r1.getResourceId(0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x032a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = 2131755670(0x7f100296, float:1.9142226E38)
            r9 = 2130903192(0x7f030098, float:1.7413195E38)
            r1 = r17
            android.content.Context r1 = p000.C1382xm.m3838a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f1563r = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f1564s = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.f1565t = r1
            android.content.Context r10 = r16.getContext()
            r11 = 1
            r12 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0033
            goto L_0x0081
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            r7.getAttributeValue(r1, r2)
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0352
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x034a
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0344
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x033e
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x0336
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0336
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0336
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0336
            java.lang.String r2 = "gravity"
            r7.getAttributeIntValue(r1, r2, r12)
        L_0x0081:
            ti r13 = new ti
            r13.<init>(r10, r7, r9, r8)
            android.content.Context r1 = r13.f4487g0
            int[] r14 = p000.C0781lh.f3151c
            r15 = 0
            int[] r6 = new int[r15]
            r5 = 2131755670(0x7f100296, float:1.9142226E38)
            r4 = 2130903192(0x7f030098, float:1.7413195E38)
            r2 = r18
            r3 = r14
            android.content.res.TypedArray r1 = p000.C1315wk.m3654d(r1, r2, r3, r4, r5, r6)
            r6 = 36
            boolean r2 = r1.hasValue(r6)
            r13.f4462H0 = r2
            android.content.Context r2 = r13.f4487g0
            r5 = 23
            android.content.res.ColorStateList r2 = p000.C0728kh.m2295k(r2, r1, r5)
            android.content.res.ColorStateList r3 = r13.f4506z
            if (r3 == r2) goto L_0x00b7
            r13.f4506z = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00b7:
            android.content.Context r2 = r13.f4487g0
            r3 = 10
            android.content.res.ColorStateList r2 = p000.C0728kh.m2295k(r2, r1, r3)
            r13.mo4685N(r2)
            r2 = 18
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r13.mo4692U(r2)
            r2 = 11
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00db
            float r2 = r1.getDimension(r2, r3)
            r13.mo4686O(r2)
        L_0x00db:
            android.content.Context r2 = r13.f4487g0
            r4 = 21
            android.content.res.ColorStateList r2 = p000.C0728kh.m2295k(r2, r1, r4)
            r13.mo4694W(r2)
            r2 = 22
            float r2 = r1.getDimension(r2, r3)
            r13.mo4695X(r2)
            android.content.Context r2 = r13.f4487g0
            r4 = 35
            android.content.res.ColorStateList r2 = p000.C0728kh.m2295k(r2, r1, r4)
            r13.mo4710h0(r2)
            r2 = 4
            java.lang.CharSequence r2 = r1.getText(r2)
            r13.mo4711i0(r2)
            android.content.Context r2 = r13.f4487g0
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L_0x0116
            int r4 = r1.getResourceId(r15, r15)
            if (r4 == 0) goto L_0x0116
            el r5 = new el
            r5.<init>(r2, r4)
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            r13.mo4713j0(r5)
            r2 = 2
            int r4 = r1.getInt(r2, r15)
            r5 = 3
            if (r4 == r11) goto L_0x012d
            if (r4 == r2) goto L_0x012a
            if (r4 == r5) goto L_0x0127
            goto L_0x0131
        L_0x0127:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L_0x012f
        L_0x012a:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x012f
        L_0x012d:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L_0x012f:
            r13.f4456E0 = r2
        L_0x0131:
            r2 = 17
            boolean r2 = r1.getBoolean(r2, r15)
            r13.mo4691T(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0157
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x0157
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x0157
            r4 = 14
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo4691T(r4)
        L_0x0157:
            android.content.Context r4 = r13.f4487g0
            r6 = 13
            android.graphics.drawable.Drawable r4 = p000.C0728kh.m2297m(r4, r1, r6)
            r13.mo4688Q(r4)
            r4 = 16
            boolean r6 = r1.hasValue(r4)
            if (r6 == 0) goto L_0x0173
            android.content.Context r6 = r13.f4487g0
            android.content.res.ColorStateList r4 = p000.C0728kh.m2295k(r6, r1, r4)
            r13.mo4690S(r4)
        L_0x0173:
            r4 = 15
            float r4 = r1.getDimension(r4, r3)
            r13.mo4689R(r4)
            r4 = 30
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo4703e0(r4)
            if (r7 == 0) goto L_0x01a0
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01a0
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01a0
            r4 = 25
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo4703e0(r4)
        L_0x01a0:
            android.content.Context r4 = r13.f4487g0
            r6 = 24
            android.graphics.drawable.Drawable r4 = p000.C0728kh.m2297m(r4, r1, r6)
            r13.mo4696Y(r4)
            android.content.Context r4 = r13.f4487g0
            r6 = 29
            android.content.res.ColorStateList r4 = p000.C0728kh.m2295k(r4, r1, r6)
            r13.mo4702d0(r4)
            r4 = 27
            float r4 = r1.getDimension(r4, r3)
            r13.mo4699a0(r4)
            r4 = 5
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo4681J(r4)
            r4 = 9
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo4684M(r4)
            if (r7 == 0) goto L_0x01ea
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01ea
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x01ea
            r2 = 7
            boolean r2 = r1.getBoolean(r2, r15)
            r13.mo4684M(r2)
        L_0x01ea:
            android.content.Context r2 = r13.f4487g0
            r4 = 6
            android.graphics.drawable.Drawable r2 = p000.C0728kh.m2297m(r2, r1, r4)
            r13.mo4682K(r2)
            r2 = 8
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0205
            android.content.Context r4 = r13.f4487g0
            android.content.res.ColorStateList r2 = p000.C0728kh.m2295k(r4, r1, r2)
            r13.mo4683L(r2)
        L_0x0205:
            android.content.Context r2 = r13.f4487g0
            r4 = 38
            sh r2 = p000.C1121sh.m3185a(r2, r1, r4)
            r13.f4477W = r2
            android.content.Context r2 = r13.f4487g0
            r4 = 32
            sh r2 = p000.C1121sh.m3185a(r2, r1, r4)
            r13.f4478X = r2
            r2 = 20
            float r2 = r1.getDimension(r2, r3)
            r13.mo4693V(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r3)
            r13.mo4705g0(r2)
            r2 = 33
            float r2 = r1.getDimension(r2, r3)
            r13.mo4704f0(r2)
            r2 = 40
            float r2 = r1.getDimension(r2, r3)
            r13.mo4715l0(r2)
            r2 = 39
            float r2 = r1.getDimension(r2, r3)
            r13.mo4714k0(r2)
            r2 = 28
            float r2 = r1.getDimension(r2, r3)
            r13.mo4700b0(r2)
            r2 = 26
            float r2 = r1.getDimension(r2, r3)
            r13.mo4697Z(r2)
            r2 = 12
            float r2 = r1.getDimension(r2, r3)
            r13.mo4687P(r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r5, r2)
            r13.f4460G0 = r2
            r1.recycle()
            int[] r6 = new int[r15]
            p000.C1315wk.m3651a(r10, r7, r9, r8)
            r5 = 2131755670(0x7f100296, float:1.9142226E38)
            r4 = 2130903192(0x7f030098, float:1.7413195E38)
            r1 = r10
            r2 = r18
            r3 = r14
            r12 = 21
            r12 = 23
            p000.C1315wk.m3652b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            r2 = 31
            boolean r2 = r1.getBoolean(r2, r15)
            r0.f1559n = r2
            android.content.Context r2 = r16.getContext()
            r3 = 48
            android.content.res.Resources r2 = r2.getResources()
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r11, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 19
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f1561p = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            float r1 = p000.C0813m8.m2474h(r16)
            r13.mo4297o(r1)
            int[] r6 = new int[r15]
            p000.C1315wk.m3651a(r10, r7, r9, r8)
            r1 = r10
            r2 = r18
            r3 = r14
            p000.C1315wk.m3652b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 >= r12) goto L_0x02de
            android.content.res.ColorStateList r3 = p000.C0728kh.m2295k(r10, r1, r11)
            r0.setTextColor(r3)
        L_0x02de:
            r3 = 36
            boolean r3 = r1.hasValue(r3)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.f1562q = r1
            r16.mo2031h()
            if (r3 != 0) goto L_0x02ff
            r1 = 21
            if (r2 < r1) goto L_0x02ff
            si r1 = new si
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x02ff:
            boolean r1 = r0.f1555j
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.f4459G
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.f4456E0
            r0.setEllipsize(r1)
            r16.mo2035l()
            ti r1 = r0.f1550e
            boolean r1 = r1.f4458F0
            if (r1 != 0) goto L_0x031d
            r0.setLines(r11)
            r0.setHorizontallyScrolling(r11)
        L_0x031d:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r16.mo2034k()
            boolean r1 = r0.f1559n
            if (r1 == 0) goto L_0x032f
            int r1 = r0.f1561p
            r0.setMinHeight(r1)
        L_0x032f:
            int r1 = p000.C0813m8.m2478l(r16)
            r0.f1560o = r1
            return
        L_0x0336:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x033e:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x0344:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x034a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x0352:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f1564s.setEmpty();
        if (mo1997e()) {
            C1170ti tiVar = this.f1550e;
            tiVar.mo4675B(tiVar.getBounds(), this.f1564s);
        }
        return this.f1564s;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f1563r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f1563r;
    }

    private C0427el getTextAppearance() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4493m0.f4824f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f1557l != z) {
            this.f1557l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f1556k != z) {
            this.f1556k = z;
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    public void mo1992a() {
        mo1993d(this.f1561p);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        if (getMinWidth() != r10) goto L_0x0084;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1993d(int r10) {
        /*
            r9 = this;
            r9.f1561p = r10
            boolean r0 = r9.f1559n
            r1 = 0
            if (r0 != 0) goto L_0x0013
            android.graphics.drawable.InsetDrawable r10 = r9.f1551f
            if (r10 == 0) goto L_0x000f
            r9.mo1999g()
            goto L_0x0012
        L_0x000f:
            r9.mo2032i()
        L_0x0012:
            return r1
        L_0x0013:
            ti r0 = r9.f1550e
            float r0 = r0.f4449B
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            ti r2 = r9.f1550e
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x003a
            if (r0 > 0) goto L_0x003a
            android.graphics.drawable.InsetDrawable r10 = r9.f1551f
            if (r10 == 0) goto L_0x0036
            r9.mo1999g()
            goto L_0x0039
        L_0x0036:
            r9.mo2032i()
        L_0x0039:
            return r1
        L_0x003a:
            if (r2 <= 0) goto L_0x0040
            int r2 = r2 / 2
            r7 = r2
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            if (r0 <= 0) goto L_0x0047
            int r1 = r0 / 2
            r8 = r1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            android.graphics.drawable.InsetDrawable r0 = r9.f1551f
            r1 = 1
            if (r0 == 0) goto L_0x006b
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f1551f
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L_0x006b
            int r2 = r0.bottom
            if (r2 != r8) goto L_0x006b
            int r2 = r0.left
            if (r2 != r7) goto L_0x006b
            int r0 = r0.right
            if (r0 != r7) goto L_0x006b
            r9.mo2032i()
            return r1
        L_0x006b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x0081
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L_0x007a
            r9.setMinHeight(r10)
        L_0x007a:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L_0x0087
            goto L_0x0084
        L_0x0081:
            r9.setMinHeight(r10)
        L_0x0084:
            r9.setMinWidth(r10)
        L_0x0087:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            ti r4 = r9.f1550e
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f1551f = r10
            r9.mo2032i()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo1993d(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.Class<l9> r0 = p000.C0762l9.class
            int r1 = r8.getAction()
            r2 = 10
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0043
            java.lang.String r1 = "m"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r1.setAccessible(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            com.google.android.material.chip.Chip$b r2 = r7.f1562q     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0043
            java.lang.String r1 = "x"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r5[r4] = r6     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r5)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0.setAccessible(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            com.google.android.material.chip.Chip$b r1 = r7.f1562q     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r5[r4] = r2     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0.invoke(r1, r5)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 != 0) goto L_0x0056
            com.google.android.material.chip.Chip$b r0 = r7.f1562q
            boolean r0 = r0.mo3607m(r8)
            if (r0 != 0) goto L_0x0056
            boolean r8 = super.dispatchHoverEvent(r8)
            if (r8 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0311b bVar = this.f1562q;
        bVar.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && bVar.mo3608p(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = bVar.f3124l;
                    if (i4 != Integer.MIN_VALUE) {
                        bVar.mo2144r(i4, 16, (Bundle) null);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = bVar.mo3608p(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = bVar.mo3608p(1, (Rect) null);
            }
        }
        if (i == 0 || this.f1562q.f3124l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1170ti tiVar = this.f1550e;
        int i = 0;
        if (tiVar != null && C1170ti.m3290G(tiVar.f4468N)) {
            C1170ti tiVar2 = this.f1550e;
            int isEnabled = isEnabled();
            if (this.f1558m) {
                isEnabled++;
            }
            if (this.f1557l) {
                isEnabled++;
            }
            if (this.f1556k) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f1558m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1557l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1556k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            i = tiVar2.mo4701c0(iArr);
        }
        if (i != 0) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean mo1997e() {
        C1170ti tiVar = this.f1550e;
        return (tiVar == null || tiVar.mo4678E() == null) ? false : true;
    }

    /* renamed from: f */
    public boolean mo1998f() {
        C1170ti tiVar = this.f1550e;
        return tiVar != null && tiVar.f4473S;
    }

    /* renamed from: g */
    public final void mo1999g() {
        if (this.f1551f != null) {
            this.f1551f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            mo2032i();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1551f;
        return insetDrawable == null ? this.f1550e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4475U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4476V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4447A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return Math.max(0.0f, tiVar.mo4677D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1550e;
    }

    public float getChipEndPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4486f0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C1170ti tiVar = this.f1550e;
        if (tiVar == null || (drawable = tiVar.f4463I) == null) {
            return null;
        }
        return C1344x5.m3762i0(drawable);
    }

    public float getChipIconSize() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4465K;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4464J;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4449B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4479Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4453D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4455E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.mo4678E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4472R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4485e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4471Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4484d0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4470P;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4456E0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        C0311b bVar = this.f1562q;
        if (bVar.f3124l == 1 || bVar.f3123k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1121sh getHideMotionSpec() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4478X;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4481a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4480Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4457F;
        }
        return null;
    }

    public C1217ul getShapeAppearanceModel() {
        return this.f1550e.f3979b.f4002a;
    }

    public C1121sh getShowMotionSpec() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4477W;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4483c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            return tiVar.f4482b0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void mo2031h() {
        C0311b bVar;
        if (mo1997e()) {
            C1170ti tiVar = this.f1550e;
            if ((tiVar != null && tiVar.f4467M) && this.f1553h != null) {
                bVar = this.f1562q;
                C0813m8.m2457F(this, bVar);
            }
        }
        bVar = null;
        C0813m8.m2457F(this, bVar);
    }

    /* renamed from: i */
    public final void mo2032i() {
        if (C0643il.f2756a) {
            mo2033j();
            return;
        }
        this.f1550e.mo4716m0(true);
        Drawable backgroundDrawable = getBackgroundDrawable();
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(backgroundDrawable);
        } else {
            setBackgroundDrawable(backgroundDrawable);
        }
        mo2034k();
        if (getBackgroundDrawable() == this.f1551f && this.f1550e.getCallback() == null) {
            this.f1550e.setCallback(this.f1551f);
        }
    }

    /* renamed from: j */
    public final void mo2033j() {
        this.f1552g = new RippleDrawable(C0643il.m2052a(this.f1550e.f4457F), getBackgroundDrawable(), (Drawable) null);
        this.f1550e.mo4716m0(false);
        RippleDrawable rippleDrawable = this.f1552g;
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(rippleDrawable);
        } else {
            setBackgroundDrawable(rippleDrawable);
        }
        mo2034k();
    }

    /* renamed from: k */
    public final void mo2034k() {
        C1170ti tiVar;
        if (!TextUtils.isEmpty(getText()) && (tiVar = this.f1550e) != null) {
            int C = (int) (tiVar.mo4676C() + tiVar.f4486f0 + tiVar.f4483c0);
            C1170ti tiVar2 = this.f1550e;
            int z = (int) (tiVar2.mo4728z() + tiVar2.f4479Y + tiVar2.f4482b0);
            if (this.f1551f != null) {
                Rect rect = new Rect();
                this.f1551f.getPadding(rect);
                z += rect.left;
                C += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 17) {
                setPaddingRelative(z, paddingTop, C, paddingBottom);
            } else {
                setPadding(z, paddingTop, C, paddingBottom);
            }
        }
    }

    /* renamed from: l */
    public final void mo2035l() {
        TextPaint paint = getPaint();
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            paint.drawableState = tiVar.getState();
        }
        C0427el textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo2731c(getContext(), paint, this.f1565t);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0728kh.m2281J(this, this.f1550e);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f1548v);
        }
        if (mo1998f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f1549w);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0311b bVar = this.f1562q;
        int i2 = bVar.f3124l;
        if (i2 != Integer.MIN_VALUE) {
            bVar.mo3605k(i2);
        }
        if (z) {
            bVar.mo3608p(i, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((mo1998f() || isClickable()) ? mo1998f() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(mo1998f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f3975d) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            C1347x8.C1350c a = C1347x8.C1350c.m3799a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i, 1, false, isChecked());
            if (Build.VERSION.SDK_INT >= 19) {
                accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) a.f5054a);
            }
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f1560o != i) {
            this.f1560o = i;
            mo2034k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.f1556k
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r2)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.f1556k
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f1553h
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.f1562q
            r0.mo3611w(r3, r3)
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r5.setCloseIconPressed(r2)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r3)
        L_0x004a:
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 != 0) goto L_0x0055
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1552g) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1552g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4681J(z);
        }
    }

    public void setCheckableResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4681J(tiVar.f4487g0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C1170ti tiVar = this.f1550e;
        if (tiVar == null) {
            this.f1555j = z;
        } else if (tiVar.f4473S) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f1554i) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4682K(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4682K(C0399e0.m1530b(tiVar.f4487g0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4683L(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4683L(C0399e0.m1529a(tiVar.f4487g0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4684M(tiVar.f4487g0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4684M(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null && tiVar.f4447A != colorStateList) {
            tiVar.f4447A = colorStateList;
            tiVar.onStateChange(tiVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4685N(C0399e0.m1529a(tiVar.f4487g0, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4686O(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4686O(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C1170ti tiVar) {
        C1170ti tiVar2 = this.f1550e;
        if (tiVar2 != tiVar) {
            if (tiVar2 != null) {
                tiVar2.f4454D0 = new WeakReference<>((Object) null);
            }
            this.f1550e = tiVar;
            tiVar.f4458F0 = false;
            tiVar.getClass();
            tiVar.f4454D0 = new WeakReference<>(this);
            mo1993d(this.f1561p);
        }
    }

    public void setChipEndPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null && tiVar.f4486f0 != f) {
            tiVar.f4486f0 = f;
            tiVar.invalidateSelf();
            tiVar.mo4679H();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4687P(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4688Q(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4688Q(C0399e0.m1530b(tiVar.f4487g0, i));
        }
    }

    public void setChipIconSize(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4689R(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4689R(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4690S(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4690S(C0399e0.m1529a(tiVar.f4487g0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4691T(tiVar.f4487g0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4691T(z);
        }
    }

    public void setChipMinHeight(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null && tiVar.f4449B != f) {
            tiVar.f4449B = f;
            tiVar.invalidateSelf();
            tiVar.mo4679H();
        }
    }

    public void setChipMinHeightResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4692U(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null && tiVar.f4479Y != f) {
            tiVar.f4479Y = f;
            tiVar.invalidateSelf();
            tiVar.mo4679H();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4693V(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4694W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4694W(C0399e0.m1529a(tiVar.f4487g0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4695X(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4695X(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4696Y(drawable);
        }
        mo2031h();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null && tiVar.f4472R != charSequence) {
            C0959p7 c = C0959p7.m2783c();
            tiVar.f4472R = c.mo3973d(charSequence, c.f3576c, true);
            tiVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4697Z(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4697Z(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4696Y(C0399e0.m1530b(tiVar.f4487g0, i));
        }
        mo2031h();
    }

    public void setCloseIconSize(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4699a0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4699a0(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4700b0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4700b0(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4702d0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4702d0(C0399e0.m1529a(tiVar.f4487g0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4703e0(z);
        }
        mo2031h();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            C1067rl.C1069b bVar = tiVar.f3979b;
            if (bVar.f4016o != f) {
                bVar.f4016o = f;
                tiVar.mo4309w();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1550e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C1170ti tiVar = this.f1550e;
                if (tiVar != null) {
                    tiVar.f4456E0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f1559n = z;
        mo1993d(this.f1561p);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1121sh shVar) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.f4478X = shVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.f4478X = C1121sh.m3186b(tiVar.f4487g0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4704f0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4704f0(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4705g0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4705g0(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f1550e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.f4460G0 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1554i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1553h = onClickListener;
        mo2031h();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4710h0(colorStateList);
        }
        if (!this.f1550e.f4450B0) {
            mo2033j();
        }
    }

    public void setRippleColorResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4710h0(C0399e0.m1529a(tiVar.f4487g0, i));
            if (!this.f1550e.f4450B0) {
                mo2033j();
            }
        }
    }

    public void setShapeAppearanceModel(C1217ul ulVar) {
        C1170ti tiVar = this.f1550e;
        tiVar.f3979b.f4002a = ulVar;
        tiVar.invalidateSelf();
    }

    public void setShowMotionSpec(C1121sh shVar) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.f4477W = shVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.f4477W = C1121sh.m3186b(tiVar.f4487g0, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(tiVar.f4458F0 ? null : charSequence, bufferType);
            C1170ti tiVar2 = this.f1550e;
            if (tiVar2 != null) {
                tiVar2.mo4711i0(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4713j0(new C0427el(tiVar.f4487g0, i));
        }
        mo2035l();
    }

    public void setTextAppearance(C0427el elVar) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4713j0(elVar);
        }
        mo2035l();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null && tiVar.f4483c0 != f) {
            tiVar.f4483c0 = f;
            tiVar.invalidateSelf();
            tiVar.mo4679H();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4714k0(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null && tiVar.f4482b0 != f) {
            tiVar.f4482b0 = f;
            tiVar.invalidateSelf();
            tiVar.mo4679H();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4715l0(tiVar.f4487g0.getResources().getDimension(i));
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1170ti tiVar = this.f1550e;
        if (tiVar != null) {
            tiVar.mo4713j0(new C0427el(tiVar.f4487g0, i));
        }
        mo2035l();
    }
}
