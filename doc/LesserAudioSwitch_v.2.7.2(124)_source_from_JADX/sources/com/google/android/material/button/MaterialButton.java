package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.C1067rl;

public class MaterialButton extends C1038r1 implements Checkable, C1422yl {

    /* renamed from: p */
    public static final int[] f1532p = {16842911};

    /* renamed from: q */
    public static final int[] f1533q = {16842912};

    /* renamed from: d */
    public final C0979pi f1534d;

    /* renamed from: e */
    public final LinkedHashSet<C0306a> f1535e = new LinkedHashSet<>();

    /* renamed from: f */
    public C0307b f1536f;

    /* renamed from: g */
    public PorterDuff.Mode f1537g;

    /* renamed from: h */
    public ColorStateList f1538h;

    /* renamed from: i */
    public Drawable f1539i;

    /* renamed from: j */
    public int f1540j;

    /* renamed from: k */
    public int f1541k;

    /* renamed from: l */
    public int f1542l;

    /* renamed from: m */
    public boolean f1543m = false;

    /* renamed from: n */
    public boolean f1544n = false;

    /* renamed from: o */
    public int f1545o;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C0306a {
        /* renamed from: a */
        void mo1987a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C0307b {
        /* renamed from: a */
        void mo1988a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C0308c extends C0718k9 {
        public static final Parcelable.Creator<C0308c> CREATOR = new C0309a();

        /* renamed from: d */
        public boolean f1546d;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        public static class C0309a implements Parcelable.ClassLoaderCreator<C0308c> {
            public Object createFromParcel(Parcel parcel) {
                return new C0308c(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0308c[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0308c(parcel, classLoader);
            }
        }

        public C0308c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C0308c.class.getClassLoader();
            }
            this.f1546d = parcel.readInt() != 1 ? false : true;
        }

        public C0308c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            parcel.writeInt(this.f1546d ? 1 : 0);
        }
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r23, android.util.AttributeSet r24) {
        /*
            r22 = this;
            r0 = r22
            r7 = r24
            r8 = 2131755656(0x7f100288, float:1.9142197E38)
            r9 = 2130903524(0x7f0301e4, float:1.7413868E38)
            r1 = r23
            android.content.Context r1 = p000.C1382xm.m3838a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f1535e = r1
            r10 = 0
            r0.f1543m = r10
            r0.f1544n = r10
            android.content.Context r11 = r22.getContext()
            int[] r3 = p000.C0781lh.f3158j
            int[] r6 = new int[r10]
            r5 = 2131755656(0x7f100288, float:1.9142197E38)
            r4 = 2130903524(0x7f0301e4, float:1.7413868E38)
            r1 = r11
            r2 = r24
            android.content.res.TypedArray r1 = p000.C1315wk.m3654d(r1, r2, r3, r4, r5, r6)
            r2 = 12
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r0.f1542l = r2
            r2 = 15
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = p000.C0728kh.m2309y(r2, r4)
            r0.f1537g = r2
            android.content.Context r2 = r22.getContext()
            r4 = 14
            android.content.res.ColorStateList r2 = p000.C0728kh.m2295k(r2, r1, r4)
            r0.f1538h = r2
            android.content.Context r2 = r22.getContext()
            r4 = 10
            android.graphics.drawable.Drawable r2 = p000.C0728kh.m2297m(r2, r1, r4)
            r0.f1539i = r2
            r2 = 11
            r4 = 1
            int r2 = r1.getInteger(r2, r4)
            r0.f1545o = r2
            r2 = 13
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r0.f1540j = r2
            ul$b r2 = p000.C1217ul.m3398b(r11, r7, r9, r8)
            ul r2 = r2.mo4783a()
            pi r5 = new pi
            r5.<init>(r0, r2)
            r0.f1534d = r5
            int r2 = r1.getDimensionPixelOffset(r4, r10)
            r5.f3646c = r2
            r2 = 2
            int r6 = r1.getDimensionPixelOffset(r2, r10)
            r5.f3647d = r6
            r6 = 3
            int r7 = r1.getDimensionPixelOffset(r6, r10)
            r5.f3648e = r7
            r7 = 4
            int r7 = r1.getDimensionPixelOffset(r7, r10)
            r5.f3649f = r7
            r7 = 8
            boolean r8 = r1.hasValue(r7)
            if (r8 == 0) goto L_0x00b8
            int r7 = r1.getDimensionPixelSize(r7, r3)
            r5.f3650g = r7
            ul r8 = r5.f3645b
            float r7 = (float) r7
            ul r7 = r8.mo4782e(r7)
            r5.mo4025e(r7)
            r5.f3659p = r4
        L_0x00b8:
            r7 = 20
            int r7 = r1.getDimensionPixelSize(r7, r10)
            r5.f3651h = r7
            r7 = 7
            int r7 = r1.getInt(r7, r3)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r7 = p000.C0728kh.m2309y(r7, r8)
            r5.f3652i = r7
            com.google.android.material.button.MaterialButton r7 = r5.f3644a
            android.content.Context r7 = r7.getContext()
            r8 = 6
            android.content.res.ColorStateList r7 = p000.C0728kh.m2295k(r7, r1, r8)
            r5.f3653j = r7
            com.google.android.material.button.MaterialButton r7 = r5.f3644a
            android.content.Context r7 = r7.getContext()
            r8 = 19
            android.content.res.ColorStateList r7 = p000.C0728kh.m2295k(r7, r1, r8)
            r5.f3654k = r7
            com.google.android.material.button.MaterialButton r7 = r5.f3644a
            android.content.Context r7 = r7.getContext()
            r8 = 16
            android.content.res.ColorStateList r7 = p000.C0728kh.m2295k(r7, r1, r8)
            r5.f3655l = r7
            r7 = 5
            boolean r7 = r1.getBoolean(r7, r10)
            r5.f3660q = r7
            r7 = 9
            int r7 = r1.getDimensionPixelSize(r7, r10)
            com.google.android.material.button.MaterialButton r8 = r5.f3644a
            int r8 = p000.C0813m8.m2482p(r8)
            com.google.android.material.button.MaterialButton r9 = r5.f3644a
            int r9 = r9.getPaddingTop()
            com.google.android.material.button.MaterialButton r11 = r5.f3644a
            int r11 = p000.C0813m8.m2481o(r11)
            com.google.android.material.button.MaterialButton r12 = r5.f3644a
            int r12 = r12.getPaddingBottom()
            boolean r13 = r1.hasValue(r10)
            if (r13 == 0) goto L_0x0135
            r5.f3658o = r4
            com.google.android.material.button.MaterialButton r2 = r5.f3644a
            android.content.res.ColorStateList r3 = r5.f3653j
            r2.setSupportBackgroundTintList(r3)
            com.google.android.material.button.MaterialButton r2 = r5.f3644a
            android.graphics.PorterDuff$Mode r3 = r5.f3652i
            r2.setSupportBackgroundTintMode(r3)
            r4 = 0
            r6 = 1
            goto L_0x020e
        L_0x0135:
            com.google.android.material.button.MaterialButton r13 = r5.f3644a
            rl r14 = new rl
            ul r15 = r5.f3645b
            r14.<init>((p000.C1217ul) r15)
            com.google.android.material.button.MaterialButton r15 = r5.f3644a
            android.content.Context r15 = r15.getContext()
            r14.mo4296n(r15)
            android.content.res.ColorStateList r15 = r5.f3653j
            p000.C1344x5.m3752d0(r14, r15)
            android.graphics.PorterDuff$Mode r15 = r5.f3652i
            if (r15 == 0) goto L_0x0153
            p000.C1344x5.m3754e0(r14, r15)
        L_0x0153:
            int r15 = r5.f3651h
            float r15 = (float) r15
            android.content.res.ColorStateList r6 = r5.f3654k
            r14.mo4303s(r15, r6)
            rl r6 = new rl
            ul r15 = r5.f3645b
            r6.<init>((p000.C1217ul) r15)
            r6.setTint(r10)
            int r15 = r5.f3651h
            float r15 = (float) r15
            boolean r4 = r5.f3657n
            if (r4 == 0) goto L_0x0176
            com.google.android.material.button.MaterialButton r4 = r5.f3644a
            r10 = 2130903226(0x7f0300ba, float:1.7413264E38)
            int r4 = p000.C0728kh.m2294j(r4, r10)
            goto L_0x0177
        L_0x0176:
            r4 = 0
        L_0x0177:
            r6.mo4302r(r15, r4)
            boolean r4 = p000.C0979pi.f3643s
            if (r4 == 0) goto L_0x01c2
            rl r4 = new rl
            ul r10 = r5.f3645b
            r4.<init>((p000.C1217ul) r10)
            r5.f3656m = r4
            p000.C1344x5.m3750c0(r4, r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r4 = r5.f3655l
            android.content.res.ColorStateList r4 = p000.C0643il.m2052a(r4)
            android.graphics.drawable.LayerDrawable r10 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r15 = 0
            r2[r15] = r6
            r6 = 1
            r2[r6] = r14
            r10.<init>(r2)
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            int r6 = r5.f3646c
            int r14 = r5.f3648e
            int r15 = r5.f3647d
            int r0 = r5.f3649f
            r16 = r2
            r17 = r10
            r18 = r6
            r19 = r14
            r20 = r15
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            android.graphics.drawable.Drawable r0 = r5.f3656m
            r3.<init>(r4, r2, r0)
            r5.f3661r = r3
            r4 = 0
            r6 = 1
            goto L_0x0201
        L_0x01c2:
            hl r0 = new hl
            ul r3 = r5.f3645b
            r0.<init>(r3)
            r5.f3656m = r0
            android.content.res.ColorStateList r3 = r5.f3655l
            android.content.res.ColorStateList r3 = p000.C0643il.m2052a(r3)
            p000.C1344x5.m3752d0(r0, r3)
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r3 = 3
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            r3[r6] = r14
            android.graphics.drawable.Drawable r10 = r5.f3656m
            r3[r2] = r10
            r0.<init>(r3)
            r5.f3661r = r0
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            int r2 = r5.f3646c
            int r10 = r5.f3648e
            int r14 = r5.f3647d
            int r15 = r5.f3649f
            r16 = r3
            r17 = r0
            r18 = r2
            r19 = r10
            r20 = r14
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x0201:
            r13.setInternalBackground(r3)
            rl r0 = r5.mo4022b()
            if (r0 == 0) goto L_0x020e
            float r2 = (float) r7
            r0.mo4297o(r2)
        L_0x020e:
            com.google.android.material.button.MaterialButton r0 = r5.f3644a
            int r2 = r5.f3646c
            int r8 = r8 + r2
            int r2 = r5.f3648e
            int r9 = r9 + r2
            int r2 = r5.f3647d
            int r11 = r11 + r2
            int r2 = r5.f3649f
            int r12 = r12 + r2
            p000.C0813m8.m2464M(r0, r8, r9, r11, r12)
            r1.recycle()
            r0 = r22
            int r1 = r0.f1542l
            r0.setCompoundDrawablePadding(r1)
            android.graphics.drawable.Drawable r1 = r0.f1539i
            if (r1 == 0) goto L_0x022f
            r10 = 1
            goto L_0x0230
        L_0x022f:
            r10 = 0
        L_0x0230:
            r0.mo1930c(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getA11yClassName() {
        return (mo1928a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo1928a() {
        C0979pi piVar = this.f1534d;
        return piVar != null && piVar.f3660q;
    }

    /* renamed from: b */
    public final boolean mo1929b() {
        C0979pi piVar = this.f1534d;
        return piVar != null && !piVar.f3658o;
    }

    /* renamed from: c */
    public final void mo1930c(boolean z) {
        Drawable drawable = this.f1539i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C1344x5.m3764j0(drawable).mutate();
            this.f1539i = mutate;
            C1344x5.m3752d0(mutate, this.f1538h);
            PorterDuff.Mode mode = this.f1537g;
            if (mode != null) {
                C1344x5.m3754e0(this.f1539i, mode);
            }
            int i = this.f1540j;
            if (i == 0) {
                i = this.f1539i.getIntrinsicWidth();
            }
            int i2 = this.f1540j;
            if (i2 == 0) {
                i2 = this.f1539i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1539i;
            int i3 = this.f1541k;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f1545o;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            Drawable drawable3 = this.f1539i;
            if (z3) {
                C1344x5.m3736R(this, drawable3, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                C1344x5.m3736R(this, (Drawable) null, (Drawable) null, drawable3, (Drawable) null);
            }
        } else {
            Drawable[] w = C1344x5.m3778w(this);
            Drawable drawable4 = w[0];
            Drawable drawable5 = w[2];
            if ((z3 && drawable4 != this.f1539i) || (!z3 && drawable5 != this.f1539i)) {
                z2 = true;
            }
            if (z2) {
                Drawable drawable6 = this.f1539i;
                if (z3) {
                    C1344x5.m3736R(this, drawable6, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    C1344x5.m3736R(this, (Drawable) null, (Drawable) null, drawable6, (Drawable) null);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo1931d() {
        if (this.f1539i != null && getLayout() != null) {
            int i = this.f1545o;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f1541k = 0;
                mo1930c(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f1540j;
            if (i2 == 0) {
                i2 = this.f1539i.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C0813m8.m2481o(this)) - i2) - this.f1542l) - C0813m8.m2482p(this)) / 2;
            boolean z2 = C0813m8.m2478l(this) == 1;
            if (this.f1545o != 4) {
                z = false;
            }
            if (z2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f1541k != measuredWidth) {
                this.f1541k = measuredWidth;
                mo1930c(false);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (mo1929b()) {
            return this.f1534d.f3650g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1539i;
    }

    public int getIconGravity() {
        return this.f1545o;
    }

    public int getIconPadding() {
        return this.f1542l;
    }

    public int getIconSize() {
        return this.f1540j;
    }

    public ColorStateList getIconTint() {
        return this.f1538h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1537g;
    }

    public ColorStateList getRippleColor() {
        if (mo1929b()) {
            return this.f1534d.f3655l;
        }
        return null;
    }

    public C1217ul getShapeAppearanceModel() {
        if (mo1929b()) {
            return this.f1534d.f3645b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo1929b()) {
            return this.f1534d.f3654k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (mo1929b()) {
            return this.f1534d.f3651h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (mo1929b()) {
            return this.f1534d.f3653j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (mo1929b()) {
            return this.f1534d.f3652i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f1543m;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo1929b()) {
            C0728kh.m2281J(this, this.f1534d.mo4022b());
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo1928a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f1532p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f1533q);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo1928a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0979pi piVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (piVar = this.f1534d) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = piVar.f3656m;
            if (drawable != null) {
                drawable.setBounds(piVar.f3646c, piVar.f3648e, i6 - piVar.f3647d, i5 - piVar.f3649f);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo1931d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0308c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0308c cVar = (C0308c) parcelable;
        super.onRestoreInstanceState(cVar.f2988b);
        setChecked(cVar.f1546d);
    }

    public Parcelable onSaveInstanceState() {
        C0308c cVar = new C0308c(super.onSaveInstanceState());
        cVar.f1546d = this.f1543m;
        return cVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo1931d();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            if (piVar.mo4022b() != null) {
                piVar.mo4022b().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (mo1929b()) {
            if (drawable != getBackground()) {
                C0979pi piVar = this.f1534d;
                piVar.f3658o = true;
                piVar.f3644a.setSupportBackgroundTintList(piVar.f3653j);
                piVar.f3644a.setSupportBackgroundTintMode(piVar.f3652i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0399e0.m1530b(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo1929b()) {
            this.f1534d.f3660q = z;
        }
    }

    public void setChecked(boolean z) {
        if (mo1928a() && isEnabled() && this.f1543m != z) {
            this.f1543m = z;
            refreshDrawableState();
            if (!this.f1544n) {
                this.f1544n = true;
                Iterator it = this.f1535e.iterator();
                while (it.hasNext()) {
                    ((C0306a) it.next()).mo1987a(this, this.f1543m);
                }
                this.f1544n = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            if (!piVar.f3659p || piVar.f3650g != i) {
                piVar.f3650g = i;
                piVar.f3659p = true;
                piVar.mo4025e(piVar.f3645b.mo4782e((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (mo1929b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (mo1929b()) {
            C1067rl b = this.f1534d.mo4022b();
            C1067rl.C1069b bVar = b.f3979b;
            if (bVar.f4016o != f) {
                bVar.f4016o = f;
                b.mo4309w();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1539i != drawable) {
            this.f1539i = drawable;
            mo1930c(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f1545o != i) {
            this.f1545o = i;
            mo1931d();
        }
    }

    public void setIconPadding(int i) {
        if (this.f1542l != i) {
            this.f1542l = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0399e0.m1530b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f1540j != i) {
            this.f1540j = i;
            mo1930c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1538h != colorStateList) {
            this.f1538h = colorStateList;
            mo1930c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1537g != mode) {
            this.f1537g = mode;
            mo1930c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0399e0.m1529a(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C0307b bVar) {
        this.f1536f = bVar;
    }

    public void setPressed(boolean z) {
        C0307b bVar = this.f1536f;
        if (bVar != null) {
            bVar.mo1988a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            if (piVar.f3655l != colorStateList) {
                piVar.f3655l = colorStateList;
                boolean z = C0979pi.f3643s;
                if (z && (piVar.f3644a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) piVar.f3644a.getBackground()).setColor(C0643il.m2052a(colorStateList));
                } else if (!z && (piVar.f3644a.getBackground() instanceof C0579hl)) {
                    ((C0579hl) piVar.f3644a.getBackground()).setTintList(C0643il.m2052a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (mo1929b()) {
            setRippleColor(C0399e0.m1529a(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C1217ul ulVar) {
        if (mo1929b()) {
            this.f1534d.mo4025e(ulVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            piVar.f3657n = z;
            piVar.mo4026f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            if (piVar.f3654k != colorStateList) {
                piVar.f3654k = colorStateList;
                piVar.mo4026f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (mo1929b()) {
            setStrokeColor(C0399e0.m1529a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            if (piVar.f3651h != i) {
                piVar.f3651h = i;
                piVar.mo4026f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (mo1929b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            if (piVar.f3653j != colorStateList) {
                piVar.f3653j = colorStateList;
                if (piVar.mo4022b() != null) {
                    C1344x5.m3752d0(piVar.mo4022b(), piVar.f3653j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (mo1929b()) {
            C0979pi piVar = this.f1534d;
            if (piVar.f3652i != mode) {
                piVar.f3652i = mode;
                if (piVar.mo4022b() != null && piVar.f3652i != null) {
                    C1344x5.m3754e0(piVar.mo4022b(), piVar.f3652i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void toggle() {
        setChecked(!this.f1543m);
    }
}
