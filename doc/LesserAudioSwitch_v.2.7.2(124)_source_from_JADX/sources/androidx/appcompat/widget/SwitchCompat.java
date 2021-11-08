package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton {

    /* renamed from: O */
    public static final Property<SwitchCompat, Float> f411O = new C0074a(Float.class, "thumbPos");

    /* renamed from: P */
    public static final int[] f412P = {16842912};

    /* renamed from: A */
    public int f413A;

    /* renamed from: B */
    public int f414B;

    /* renamed from: C */
    public int f415C;

    /* renamed from: D */
    public int f416D;

    /* renamed from: E */
    public int f417E;

    /* renamed from: F */
    public int f418F;

    /* renamed from: G */
    public final TextPaint f419G;

    /* renamed from: H */
    public ColorStateList f420H;

    /* renamed from: I */
    public Layout f421I;

    /* renamed from: J */
    public Layout f422J;

    /* renamed from: K */
    public TransformationMethod f423K;

    /* renamed from: L */
    public ObjectAnimator f424L;

    /* renamed from: M */
    public final C0598i2 f425M;

    /* renamed from: N */
    public final Rect f426N = new Rect();

    /* renamed from: b */
    public Drawable f427b;

    /* renamed from: c */
    public ColorStateList f428c = null;

    /* renamed from: d */
    public PorterDuff.Mode f429d = null;

    /* renamed from: e */
    public boolean f430e = false;

    /* renamed from: f */
    public boolean f431f = false;

    /* renamed from: g */
    public Drawable f432g;

    /* renamed from: h */
    public ColorStateList f433h = null;

    /* renamed from: i */
    public PorterDuff.Mode f434i = null;

    /* renamed from: j */
    public boolean f435j = false;

    /* renamed from: k */
    public boolean f436k = false;

    /* renamed from: l */
    public int f437l;

    /* renamed from: m */
    public int f438m;

    /* renamed from: n */
    public int f439n;

    /* renamed from: o */
    public boolean f440o;

    /* renamed from: p */
    public CharSequence f441p;

    /* renamed from: q */
    public CharSequence f442q;

    /* renamed from: r */
    public boolean f443r;

    /* renamed from: s */
    public int f444s;

    /* renamed from: t */
    public int f445t;

    /* renamed from: u */
    public float f446u;

    /* renamed from: v */
    public float f447v;

    /* renamed from: w */
    public VelocityTracker f448w = VelocityTracker.obtain();

    /* renamed from: x */
    public int f449x;

    /* renamed from: y */
    public float f450y;

    /* renamed from: z */
    public int f451z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0074a extends Property<SwitchCompat, Float> {
        public C0074a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).f450y);
        }

        public void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010a, code lost:
        r10 = p000.C0399e0.m1529a(r14, (r10 = r8.getResourceId(3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r13 = this;
            r0 = 2130903686(0x7f030286, float:1.7414197E38)
            r13.<init>(r14, r15, r0)
            r1 = 0
            r13.f428c = r1
            r13.f429d = r1
            r2 = 0
            r13.f430e = r2
            r13.f431f = r2
            r13.f433h = r1
            r13.f434i = r1
            r13.f435j = r2
            r13.f436k = r2
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r13.f448w = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r13.f426N = r3
            android.content.Context r3 = r13.getContext()
            p000.C0253c3.m1047a(r13, r3)
            android.text.TextPaint r3 = new android.text.TextPaint
            r4 = 1
            r3.<init>(r4)
            r13.f419G = r3
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r3.density = r5
            int[] r8 = p000.C0440f.f2069w
            h3 r5 = new h3
            android.content.res.TypedArray r10 = r14.obtainStyledAttributes(r15, r8, r0, r2)
            r5.<init>(r14, r10)
            r12 = 0
            r11 = 2130903686(0x7f030286, float:1.7414197E38)
            r6 = r13
            r7 = r14
            r9 = r15
            p000.C0813m8.m2456E(r6, r7, r8, r9, r10, r11, r12)
            r6 = 2
            android.graphics.drawable.Drawable r7 = r5.mo3027g(r6)
            r13.f427b = r7
            if (r7 == 0) goto L_0x0061
            r7.setCallback(r13)
        L_0x0061:
            r7 = 11
            android.graphics.drawable.Drawable r7 = r5.mo3027g(r7)
            r13.f432g = r7
            if (r7 == 0) goto L_0x006e
            r7.setCallback(r13)
        L_0x006e:
            java.lang.CharSequence r7 = r5.mo3034n(r2)
            r13.f441p = r7
            java.lang.CharSequence r7 = r5.mo3034n(r4)
            r13.f442q = r7
            r7 = 3
            boolean r8 = r5.mo3021a(r7, r4)
            r13.f443r = r8
            r8 = 8
            int r8 = r5.mo3026f(r8, r2)
            r13.f437l = r8
            r8 = 5
            int r8 = r5.mo3026f(r8, r2)
            r13.f438m = r8
            r8 = 6
            int r8 = r5.mo3026f(r8, r2)
            r13.f439n = r8
            r8 = 4
            boolean r8 = r5.mo3021a(r8, r2)
            r13.f440o = r8
            r8 = 9
            android.content.res.ColorStateList r8 = r5.mo3023c(r8)
            if (r8 == 0) goto L_0x00aa
            r13.f428c = r8
            r13.f430e = r4
        L_0x00aa:
            r8 = 10
            r9 = -1
            int r8 = r5.mo3030j(r8, r9)
            android.graphics.PorterDuff$Mode r8 = p000.C0912o2.m2667d(r8, r1)
            android.graphics.PorterDuff$Mode r10 = r13.f429d
            if (r10 == r8) goto L_0x00bd
            r13.f429d = r8
            r13.f431f = r4
        L_0x00bd:
            boolean r8 = r13.f430e
            if (r8 != 0) goto L_0x00c5
            boolean r8 = r13.f431f
            if (r8 == 0) goto L_0x00c8
        L_0x00c5:
            r13.mo440a()
        L_0x00c8:
            r8 = 12
            android.content.res.ColorStateList r8 = r5.mo3023c(r8)
            if (r8 == 0) goto L_0x00d4
            r13.f433h = r8
            r13.f435j = r4
        L_0x00d4:
            r8 = 13
            int r8 = r5.mo3030j(r8, r9)
            android.graphics.PorterDuff$Mode r8 = p000.C0912o2.m2667d(r8, r1)
            android.graphics.PorterDuff$Mode r10 = r13.f434i
            if (r10 == r8) goto L_0x00e6
            r13.f434i = r8
            r13.f436k = r4
        L_0x00e6:
            boolean r8 = r13.f435j
            if (r8 != 0) goto L_0x00ee
            boolean r8 = r13.f436k
            if (r8 == 0) goto L_0x00f1
        L_0x00ee:
            r13.mo441b()
        L_0x00f1:
            r8 = 7
            int r8 = r5.mo3032l(r8, r2)
            if (r8 == 0) goto L_0x0198
            int[] r10 = p000.C0440f.f2070x
            android.content.res.TypedArray r8 = r14.obtainStyledAttributes(r8, r10)
            boolean r10 = r8.hasValue(r7)
            if (r10 == 0) goto L_0x0111
            int r10 = r8.getResourceId(r7, r2)
            if (r10 == 0) goto L_0x0111
            android.content.res.ColorStateList r10 = p000.C0399e0.m1529a(r14, r10)
            if (r10 == 0) goto L_0x0111
            goto L_0x0115
        L_0x0111:
            android.content.res.ColorStateList r10 = r8.getColorStateList(r7)
        L_0x0115:
            if (r10 == 0) goto L_0x0118
            goto L_0x011c
        L_0x0118:
            android.content.res.ColorStateList r10 = r13.getTextColors()
        L_0x011c:
            r13.f420H = r10
            int r10 = r8.getDimensionPixelSize(r2, r2)
            if (r10 == 0) goto L_0x0133
            float r10 = (float) r10
            float r11 = r3.getTextSize()
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0133
            r3.setTextSize(r10)
            r13.requestLayout()
        L_0x0133:
            int r10 = r8.getInt(r4, r9)
            int r11 = r8.getInt(r6, r9)
            if (r10 == r4) goto L_0x0149
            if (r10 == r6) goto L_0x0146
            if (r10 == r7) goto L_0x0143
            r7 = r1
            goto L_0x014b
        L_0x0143:
            android.graphics.Typeface r7 = android.graphics.Typeface.MONOSPACE
            goto L_0x014b
        L_0x0146:
            android.graphics.Typeface r7 = android.graphics.Typeface.SERIF
            goto L_0x014b
        L_0x0149:
            android.graphics.Typeface r7 = android.graphics.Typeface.SANS_SERIF
        L_0x014b:
            r10 = 0
            if (r11 <= 0) goto L_0x0179
            if (r7 != 0) goto L_0x0155
            android.graphics.Typeface r7 = android.graphics.Typeface.defaultFromStyle(r11)
            goto L_0x0159
        L_0x0155:
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r11)
        L_0x0159:
            r13.setSwitchTypeface(r7)
            if (r7 == 0) goto L_0x0163
            int r7 = r7.getStyle()
            goto L_0x0164
        L_0x0163:
            r7 = 0
        L_0x0164:
            r7 = r7 ^ r9
            r7 = r7 & r11
            r9 = r7 & 1
            if (r9 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r4 = 0
        L_0x016c:
            r3.setFakeBoldText(r4)
            r4 = r7 & 2
            if (r4 == 0) goto L_0x0175
            r10 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0175:
            r3.setTextSkewX(r10)
            goto L_0x0182
        L_0x0179:
            r3.setFakeBoldText(r2)
            r3.setTextSkewX(r10)
            r13.setSwitchTypeface(r7)
        L_0x0182:
            r3 = 14
            boolean r2 = r8.getBoolean(r3, r2)
            if (r2 == 0) goto L_0x0193
            k0 r1 = new k0
            android.content.Context r2 = r13.getContext()
            r1.<init>(r2)
        L_0x0193:
            r13.f423K = r1
            r8.recycle()
        L_0x0198:
            i2 r1 = new i2
            r1.<init>(r13)
            r13.f425M = r1
            r1.mo3115e(r15, r0)
            android.content.res.TypedArray r15 = r5.f2425b
            r15.recycle()
            android.view.ViewConfiguration r14 = android.view.ViewConfiguration.get(r14)
            int r15 = r14.getScaledTouchSlop()
            r13.f445t = r15
            int r14 = r14.getScaledMinimumFlingVelocity()
            r13.f449x = r14
            r13.refreshDrawableState()
            boolean r14 = r13.isChecked()
            r13.setChecked(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private boolean getTargetCheckedState() {
        return this.f450y > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0856n3.m2571a(this) ? 1.0f - this.f450y : this.f450y) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f432g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f426N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f427b;
        Rect c = drawable2 != null ? C0912o2.m2666c(drawable2) : C0912o2.f3470c;
        return ((((this.f451z - this.f414B) - rect.left) - rect.right) - c.left) - c.right;
    }

    /* renamed from: a */
    public final void mo440a() {
        Drawable drawable = this.f427b;
        if (drawable == null) {
            return;
        }
        if (this.f430e || this.f431f) {
            Drawable mutate = C1344x5.m3764j0(drawable).mutate();
            this.f427b = mutate;
            if (this.f430e) {
                C1344x5.m3752d0(mutate, this.f428c);
            }
            if (this.f431f) {
                C1344x5.m3754e0(this.f427b, this.f429d);
            }
            if (this.f427b.isStateful()) {
                this.f427b.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo441b() {
        Drawable drawable = this.f432g;
        if (drawable == null) {
            return;
        }
        if (this.f435j || this.f436k) {
            Drawable mutate = C1344x5.m3764j0(drawable).mutate();
            this.f432g = mutate;
            if (this.f435j) {
                C1344x5.m3752d0(mutate, this.f433h);
            }
            if (this.f436k) {
                C1344x5.m3754e0(this.f432g, this.f434i);
            }
            if (this.f432g.isStateful()) {
                this.f432g.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public final Layout mo442c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f423K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f419G;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f426N;
        int i3 = this.f415C;
        int i4 = this.f416D;
        int i5 = this.f417E;
        int i6 = this.f418F;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f427b;
        Rect c = drawable != null ? C0912o2.m2666c(drawable) : C0912o2.f3470c;
        Drawable drawable2 = this.f432g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (c != null) {
                int i8 = c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = c.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = c.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = c.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f432g.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f432g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f427b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f414B + rect.right;
            this.f427b.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1344x5.m3740V(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f427b;
        if (drawable != null) {
            C1344x5.m3739U(drawable, f, f2);
        }
        Drawable drawable2 = this.f432g;
        if (drawable2 != null) {
            C1344x5.m3739U(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f427b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f432g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0856n3.m2571a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f451z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f439n : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0856n3.m2571a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f451z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f439n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f443r;
    }

    public boolean getSplitTrack() {
        return this.f440o;
    }

    public int getSwitchMinWidth() {
        return this.f438m;
    }

    public int getSwitchPadding() {
        return this.f439n;
    }

    public CharSequence getTextOff() {
        return this.f442q;
    }

    public CharSequence getTextOn() {
        return this.f441p;
    }

    public Drawable getThumbDrawable() {
        return this.f427b;
    }

    public int getThumbTextPadding() {
        return this.f437l;
    }

    public ColorStateList getThumbTintList() {
        return this.f428c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f429d;
    }

    public Drawable getTrackDrawable() {
        return this.f432g;
    }

    public ColorStateList getTrackTintList() {
        return this.f433h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f434i;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f427b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f432g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f424L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f424L.end();
            this.f424L = null;
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f412P);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f426N;
        Drawable drawable = this.f432g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f416D;
        int i3 = this.f418F;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f427b;
        if (drawable != null) {
            if (!this.f440o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c = C0912o2.m2666c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c.left;
                rect.right -= c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f421I : this.f422J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f420H;
            if (colorStateList != null) {
                this.f419G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f419G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f441p : this.f442q;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f427b != null) {
            Rect rect = this.f426N;
            Drawable drawable = this.f432g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c = C0912o2.m2666c(this.f427b);
            i5 = Math.max(0, c.left - rect.left);
            i10 = Math.max(0, c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0856n3.m2571a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f451z + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.f451z) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i11 = this.f413A;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);
            int i12 = height;
            i8 = i11 + height;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f413A + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f413A;
        }
        this.f415C = i7;
        this.f416D = i9;
        this.f418F = i8;
        this.f417E = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f443r) {
            if (this.f421I == null) {
                this.f421I = mo442c(this.f441p);
            }
            if (this.f422J == null) {
                this.f422J = mo442c(this.f442q);
            }
        }
        Rect rect = this.f426N;
        Drawable drawable = this.f427b;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f427b.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f427b.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f443r) {
            i5 = (this.f437l * 2) + Math.max(this.f421I.getWidth(), this.f422J.getWidth());
        } else {
            i5 = 0;
        }
        this.f414B = Math.max(i5, i4);
        Drawable drawable2 = this.f432g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f432g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f427b;
        if (drawable3 != null) {
            Rect c = C0912o2.m2666c(drawable3);
            i7 = Math.max(i7, c.left);
            i8 = Math.max(i8, c.right);
        }
        int max = Math.max(this.f438m, (this.f414B * 2) + i7 + i8);
        int max2 = Math.max(i6, i3);
        this.f451z = max;
        this.f413A = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f441p : this.f442q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0153;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.f448w
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0100
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L_0x0093
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0093
            goto L_0x0153
        L_0x0018:
            int r0 = r10.f444s
            if (r0 == r2) goto L_0x005f
            if (r0 == r5) goto L_0x0020
            goto L_0x0153
        L_0x0020:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.f446u
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003e
        L_0x0033:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003e
        L_0x003a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003e:
            boolean r0 = p000.C0856n3.m2571a(r10)
            if (r0 == 0) goto L_0x0045
            float r1 = -r1
        L_0x0045:
            float r0 = r10.f450y
            float r1 = r1 + r0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0054
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0055
        L_0x0054:
            r4 = r1
        L_0x0055:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            r10.f446u = r11
            r10.setThumbPosition(r4)
        L_0x005e:
            return r2
        L_0x005f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.f446u
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f445t
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0085
            float r3 = r10.f447v
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f445t
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0153
        L_0x0085:
            r10.f444s = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.f446u = r0
            r10.f447v = r1
            return r2
        L_0x0093:
            int r0 = r10.f444s
            if (r0 != r5) goto L_0x00f8
            r10.f444s = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto L_0x00a7
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto L_0x00de
            android.view.VelocityTracker r0 = r10.f448w
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.f448w
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.f449x
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d9
            boolean r6 = p000.C0856n3.m2571a(r10)
            if (r6 == 0) goto L_0x00d1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
            goto L_0x00d5
        L_0x00d1:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
        L_0x00d5:
            r0 = 1
            goto L_0x00df
        L_0x00d7:
            r0 = 0
            goto L_0x00df
        L_0x00d9:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00df
        L_0x00de:
            r0 = r5
        L_0x00df:
            if (r0 == r5) goto L_0x00e4
            r10.playSoundEffect(r1)
        L_0x00e4:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        L_0x00f8:
            r10.f444s = r1
            android.view.VelocityTracker r0 = r10.f448w
            r0.clear()
            goto L_0x0153
        L_0x0100:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L_0x0153
            android.graphics.drawable.Drawable r4 = r10.f427b
            if (r4 != 0) goto L_0x0113
            goto L_0x014b
        L_0x0113:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.f427b
            android.graphics.Rect r6 = r10.f426N
            r5.getPadding(r6)
            int r5 = r10.f416D
            int r6 = r10.f445t
            int r5 = r5 - r6
            int r7 = r10.f415C
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.f414B
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.f426N
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.f418F
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x014b
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014b
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x014b
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014b
            r1 = 1
        L_0x014b:
            if (r1 == 0) goto L_0x0153
            r10.f444s = r2
            r10.f446u = r0
            r10.f447v = r3
        L_0x0153:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 1.0f;
        if (getWindowToken() == null || !C0813m8.m2486t(this)) {
            ObjectAnimator objectAnimator = this.f424L;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!isChecked) {
                f = 0.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (!isChecked) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f411O, new float[]{f});
        this.f424L = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f424L.setAutoCancel(true);
        }
        this.f424L.start();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1344x5.m3766k0(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f443r != z) {
            this.f443r = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f440o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f438m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f439n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f419G.getTypeface() != null && !this.f419G.getTypeface().equals(typeface)) || (this.f419G.getTypeface() == null && typeface != null)) {
            this.f419G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f442q = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f441p = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f427b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f427b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f450y = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0399e0.m1530b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f437l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f428c = colorStateList;
        this.f430e = true;
        mo440a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f429d = mode;
        this.f431f = true;
        mo440a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f432g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f432g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0399e0.m1530b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f433h = colorStateList;
        this.f435j = true;
        mo441b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f434i = mode;
        this.f436k = true;
        mo441b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f427b || drawable == this.f432g;
    }
}
