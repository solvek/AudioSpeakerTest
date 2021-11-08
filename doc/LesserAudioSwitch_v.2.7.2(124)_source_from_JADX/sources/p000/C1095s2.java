package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: s2 */
public class C1095s2 extends ViewGroup {

    /* renamed from: b */
    public boolean f4139b;

    /* renamed from: c */
    public int f4140c;

    /* renamed from: d */
    public int f4141d;

    /* renamed from: e */
    public int f4142e;

    /* renamed from: f */
    public int f4143f;

    /* renamed from: g */
    public int f4144g;

    /* renamed from: h */
    public float f4145h;

    /* renamed from: i */
    public boolean f4146i;

    /* renamed from: j */
    public int[] f4147j;

    /* renamed from: k */
    public int[] f4148k;

    /* renamed from: l */
    public Drawable f4149l;

    /* renamed from: m */
    public int f4150m;

    /* renamed from: n */
    public int f4151n;

    /* renamed from: o */
    public int f4152o;

    /* renamed from: p */
    public int f4153p;

    /* renamed from: s2$a */
    public static class C1096a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f4154a;

        /* renamed from: b */
        public int f4155b;

        public C1096a(int i, int i2) {
            super(i, i2);
            this.f4155b = -1;
            this.f4154a = 0.0f;
        }

        public C1096a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4155b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0440f.f2060n);
            this.f4154a = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f4155b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public C1096a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4155b = -1;
        }
    }

    public C1095s2(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1095s2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        r14 = r3.getResourceId(5, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1095s2(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.f4139b = r0
            r1 = -1
            r11.f4140c = r1
            r2 = 0
            r11.f4141d = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.f4143f = r3
            int[] r6 = p000.C0440f.f2059m
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r6, r14, r2)
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r3
            r9 = r14
            p000.C0813m8.m2456E(r4, r5, r6, r7, r8, r9, r10)
            int r13 = r3.getInt(r0, r1)
            if (r13 < 0) goto L_0x0029
            r11.setOrientation(r13)
        L_0x0029:
            int r13 = r3.getInt(r2, r1)
            if (r13 < 0) goto L_0x0032
            r11.setGravity(r13)
        L_0x0032:
            r13 = 2
            boolean r13 = r3.getBoolean(r13, r0)
            if (r13 != 0) goto L_0x003c
            r11.setBaselineAligned(r13)
        L_0x003c:
            r13 = 4
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r3.getFloat(r13, r14)
            r11.f4145h = r13
            r13 = 3
            int r13 = r3.getInt(r13, r1)
            r11.f4140c = r13
            r13 = 7
            boolean r13 = r3.getBoolean(r13, r2)
            r11.f4146i = r13
            r13 = 5
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L_0x0065
            int r14 = r3.getResourceId(r13, r2)
            if (r14 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r12 = p000.C0399e0.m1530b(r12, r14)
            goto L_0x0069
        L_0x0065:
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r13)
        L_0x0069:
            r11.setDividerDrawable(r12)
            r12 = 8
            int r12 = r3.getInt(r12, r2)
            r11.f4152o = r12
            r12 = 6
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.f4153p = r12
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1095s2.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1096a;
    }

    /* renamed from: f */
    public void mo4386f(Canvas canvas, int i) {
        this.f4149l.setBounds(getPaddingLeft() + this.f4153p, i, (getWidth() - getPaddingRight()) - this.f4153p, this.f4151n + i);
        this.f4149l.draw(canvas);
    }

    /* renamed from: g */
    public void mo4387g(Canvas canvas, int i) {
        this.f4149l.setBounds(i, getPaddingTop() + this.f4153p, this.f4150m + i, (getHeight() - getPaddingBottom()) - this.f4153p);
        this.f4149l.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.f4140c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f4140c;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f4141d;
                if (this.f4142e == 1 && (i = this.f4143f & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4144g) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4144g;
                    }
                }
                return i3 + ((C1096a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f4140c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4140c;
    }

    public Drawable getDividerDrawable() {
        return this.f4149l;
    }

    public int getDividerPadding() {
        return this.f4153p;
    }

    public int getDividerWidth() {
        return this.f4150m;
    }

    public int getGravity() {
        return this.f4143f;
    }

    public int getOrientation() {
        return this.f4142e;
    }

    public int getShowDividers() {
        return this.f4152o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4145h;
    }

    /* renamed from: h */
    public C1096a generateDefaultLayoutParams() {
        int i = this.f4142e;
        if (i == 0) {
            return new C1096a(-2, -2);
        }
        if (i == 1) {
            return new C1096a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public C1096a generateLayoutParams(AttributeSet attributeSet) {
        return new C1096a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public C1096a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1096a(layoutParams);
    }

    /* renamed from: k */
    public int mo4398k() {
        return 0;
    }

    /* renamed from: l */
    public int mo4399l() {
        return 0;
    }

    /* renamed from: m */
    public int mo4400m() {
        return 0;
    }

    /* renamed from: n */
    public boolean mo4401n(int i) {
        if (i == 0) {
            return (this.f4152o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f4152o & 4) != 0;
        }
        if ((this.f4152o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo4402o(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.f4149l != null) {
            int i4 = 0;
            if (this.f4142e == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo4401n(i4))) {
                        mo4386f(canvas, (childAt.getTop() - ((C1096a) childAt.getLayoutParams()).topMargin) - this.f4151n);
                    }
                    i4++;
                }
                if (mo4401n(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    mo4386f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4151n : childAt2.getBottom() + ((C1096a) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = C0856n3.m2571a(this);
            while (i4 < virtualChildCount2) {
                View childAt3 = getChildAt(i4);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo4401n(i4))) {
                    C1096a aVar = (C1096a) childAt3.getLayoutParams();
                    mo4387g(canvas, a ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.f4150m);
                }
                i4++;
            }
            if (mo4401n(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C1096a aVar2 = (C1096a) childAt4.getLayoutParams();
                    if (a) {
                        i3 = childAt4.getLeft();
                        i2 = aVar2.leftMargin;
                    } else {
                        i = childAt4.getRight() + aVar2.rightMargin;
                        mo4387g(canvas, i);
                    }
                } else if (a) {
                    i = getPaddingLeft();
                    mo4387g(canvas, i);
                } else {
                    i3 = getWidth();
                    i2 = getPaddingRight();
                }
                i = (i3 - i2) - this.f4150m;
                mo4387g(canvas, i);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f4142e
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00c2
            int r1 = r23.getPaddingLeft()
            int r10 = r27 - r25
            int r11 = r23.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r23.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r23.getVirtualChildCount()
            int r13 = r0.f4143f
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r23.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r23.getPaddingTop()
            int r2 = r2 + r28
            int r2 = r2 - r26
            int r3 = r0.f4144g
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r23.getPaddingTop()
            int r3 = r28 - r26
            int r13 = r0.f4144g
            int r3 = r3 - r13
            int r3 = r3 / r8
            int r2 = r2 + r3
        L_0x004d:
            r7 = 0
        L_0x004e:
            if (r7 >= r12) goto L_0x01e5
            android.view.View r3 = r0.getChildAt(r7)
            if (r3 != 0) goto L_0x005c
            int r3 = r23.mo4406p()
            int r3 = r3 + r2
            goto L_0x00bb
        L_0x005c:
            int r13 = r3.getVisibility()
            if (r13 == r4) goto L_0x00bc
            int r13 = r3.getMeasuredWidth()
            int r14 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r3.getLayoutParams()
            s2$a r15 = (p000.C1095s2.C1096a) r15
            int r4 = r15.f4155b
            if (r4 >= 0) goto L_0x0075
            r4 = r6
        L_0x0075:
            int r8 = p000.C0813m8.m2478l(r23)
            int r4 = p000.C1344x5.m3775t(r4, r8)
            r4 = r4 & 7
            if (r4 == r9) goto L_0x008a
            if (r4 == r5) goto L_0x0087
            int r4 = r15.leftMargin
            int r4 = r4 + r1
            goto L_0x0095
        L_0x0087:
            int r4 = r11 - r13
            goto L_0x0092
        L_0x008a:
            int r4 = r10 - r13
            r8 = 2
            int r4 = r4 / r8
            int r4 = r4 + r1
            int r8 = r15.leftMargin
            int r4 = r4 + r8
        L_0x0092:
            int r8 = r15.rightMargin
            int r4 = r4 - r8
        L_0x0095:
            boolean r8 = r0.mo4401n(r7)
            if (r8 == 0) goto L_0x009e
            int r8 = r0.f4151n
            int r2 = r2 + r8
        L_0x009e:
            int r8 = r15.topMargin
            int r2 = r2 + r8
            int r8 = r23.mo4399l()
            int r8 = r8 + r2
            int r13 = r13 + r4
            int r5 = r14 + r8
            r3.layout(r4, r8, r13, r5)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r3 = r23.mo4400m()
            int r3 = r3 + r14
            int r3 = r3 + r2
            int r2 = r23.mo4398k()
            int r2 = r2 + r7
            r7 = r2
        L_0x00bb:
            r2 = r3
        L_0x00bc:
            int r7 = r7 + r9
            r4 = 8
            r5 = 5
            r8 = 2
            goto L_0x004e
        L_0x00c2:
            boolean r1 = p000.C0856n3.m2571a(r23)
            int r4 = r23.getPaddingTop()
            int r5 = r28 - r26
            int r8 = r23.getPaddingBottom()
            int r8 = r5 - r8
            int r5 = r5 - r4
            int r10 = r23.getPaddingBottom()
            int r5 = r5 - r10
            int r10 = r23.getVirtualChildCount()
            int r11 = r0.f4143f
            r6 = r6 & r11
            r11 = r11 & 112(0x70, float:1.57E-43)
            boolean r12 = r0.f4139b
            int[] r13 = r0.f4147j
            int[] r14 = r0.f4148k
            int r15 = p000.C0813m8.m2478l(r23)
            int r6 = p000.C1344x5.m3775t(r6, r15)
            if (r6 == r9) goto L_0x0105
            r15 = 5
            if (r6 == r15) goto L_0x00f9
            int r6 = r23.getPaddingLeft()
            goto L_0x0111
        L_0x00f9:
            int r6 = r23.getPaddingLeft()
            int r6 = r6 + r27
            int r6 = r6 - r25
            int r15 = r0.f4144g
            int r6 = r6 - r15
            goto L_0x0111
        L_0x0105:
            int r6 = r23.getPaddingLeft()
            int r15 = r27 - r25
            int r7 = r0.f4144g
            int r15 = r15 - r7
            r7 = 2
            int r15 = r15 / r7
            int r6 = r6 + r15
        L_0x0111:
            if (r1 == 0) goto L_0x011a
            int r1 = r10 + -1
            r16 = r1
            r1 = 0
            r15 = -1
            goto L_0x011e
        L_0x011a:
            r1 = 0
            r15 = 1
            r16 = 0
        L_0x011e:
            if (r1 >= r10) goto L_0x01e5
            int r17 = r15 * r1
            int r9 = r17 + r16
            android.view.View r2 = r0.getChildAt(r9)
            if (r2 != 0) goto L_0x0139
            int r2 = r23.mo4406p()
            int r2 = r2 + r6
            r6 = r2
        L_0x0130:
            r26 = r10
            r28 = r11
            r20 = r12
        L_0x0136:
            r2 = 1
            goto L_0x01d7
        L_0x0139:
            int r3 = r2.getVisibility()
            r7 = 8
            if (r3 == r7) goto L_0x0130
            int r3 = r2.getMeasuredWidth()
            int r19 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r20 = r2.getLayoutParams()
            r7 = r20
            s2$a r7 = (p000.C1095s2.C1096a) r7
            r26 = r10
            if (r12 == 0) goto L_0x0161
            int r10 = r7.height
            r28 = r11
            r11 = -1
            if (r10 == r11) goto L_0x0163
            int r11 = r2.getBaseline()
            goto L_0x0164
        L_0x0161:
            r28 = r11
        L_0x0163:
            r11 = -1
        L_0x0164:
            int r10 = r7.f4155b
            if (r10 >= 0) goto L_0x016a
            r10 = r28
        L_0x016a:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r12
            r12 = 16
            if (r10 == r12) goto L_0x01a2
            r12 = 48
            if (r10 == r12) goto L_0x0193
            r12 = 80
            if (r10 == r12) goto L_0x017d
            r10 = r4
            r12 = -1
            goto L_0x01ae
        L_0x017d:
            int r10 = r8 - r19
            int r12 = r7.bottomMargin
            int r10 = r10 - r12
            r12 = -1
            if (r11 == r12) goto L_0x01ae
            int r21 = r2.getMeasuredHeight()
            int r21 = r21 - r11
            r11 = 2
            r22 = r14[r11]
            int r22 = r22 - r21
            int r10 = r10 - r22
            goto L_0x01ae
        L_0x0193:
            r12 = -1
            int r10 = r7.topMargin
            int r10 = r10 + r4
            if (r11 == r12) goto L_0x01ae
            r18 = 1
            r21 = r13[r18]
            int r21 = r21 - r11
            int r10 = r21 + r10
            goto L_0x01ae
        L_0x01a2:
            r12 = -1
            int r10 = r5 - r19
            r11 = 2
            int r10 = r10 / r11
            int r10 = r10 + r4
            int r11 = r7.topMargin
            int r10 = r10 + r11
            int r11 = r7.bottomMargin
            int r10 = r10 - r11
        L_0x01ae:
            boolean r9 = r0.mo4401n(r9)
            if (r9 == 0) goto L_0x01b7
            int r9 = r0.f4150m
            int r6 = r6 + r9
        L_0x01b7:
            int r9 = r7.leftMargin
            int r6 = r6 + r9
            int r9 = r23.mo4399l()
            int r9 = r9 + r6
            int r11 = r3 + r9
            int r12 = r19 + r10
            r2.layout(r9, r10, r11, r12)
            int r2 = r7.rightMargin
            int r3 = r3 + r2
            int r2 = r23.mo4400m()
            int r2 = r2 + r3
            int r6 = r6 + r2
            int r2 = r23.mo4398k()
            int r2 = r2 + r1
            r1 = r2
            goto L_0x0136
        L_0x01d7:
            int r1 = r1 + r2
            r10 = r26
            r11 = r28
            r12 = r20
            r2 = 80
            r3 = 16
            r9 = 1
            goto L_0x011e
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1095s2.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c8, code lost:
        if (r13 < 0) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x075a, code lost:
        if (r7 < 0) goto L_0x075c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07e8  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0854  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08ad  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f4142e
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x03a4
            r6.f4144g = r4
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.f4140c
            boolean r9 = r6.f4146i
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x0039:
            if (r14 >= r3) goto L_0x0186
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x004c
            int r4 = r6.f4144g
            int r26 = r38.mo4406p()
            int r4 = r26 + r4
            r6.f4144g = r4
            goto L_0x0057
        L_0x004c:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x0063
            int r4 = r38.mo4398k()
            int r14 = r14 + r4
        L_0x0057:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r4 = r20
            r27 = 1
            goto L_0x0170
        L_0x0063:
            boolean r4 = r6.mo4401n(r14)
            if (r4 == 0) goto L_0x0070
            int r4 = r6.f4144g
            int r5 = r6.f4151n
            int r4 = r4 + r5
            r6.f4144g = r4
        L_0x0070:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            s2$a r5 = (p000.C1095s2.C1096a) r5
            float r4 = r5.f4154a
            float r21 = r21 + r4
            if (r1 != r15) goto L_0x009f
            int r12 = r5.height
            if (r12 != 0) goto L_0x009f
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x009f
            int r4 = r6.f4144g
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.f4144g = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto L_0x00f5
        L_0x009f:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00ab
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ab
            r5.height = r10
            r12 = 0
            goto L_0x00ad
        L_0x00ab:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ad:
            r4 = 0
            int r15 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00b6
            int r15 = r6.f4144g
            r10 = r0
            goto L_0x00b8
        L_0x00b6:
            r10 = r0
            r15 = 0
        L_0x00b8:
            r0 = r38
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r39
            r31 = r3
            r3 = r4
            r4 = r40
            r13 = r5
            r27 = 1
            r5 = r15
            r0.mo4402o(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00d2
            r13.height = r12
        L_0x00d2:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f4144g
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            int r3 = r38.mo4400m()
            int r3 = r3 + r2
            int r1 = java.lang.Math.max(r1, r3)
            r6.f4144g = r1
            r4 = r18
            if (r9 == 0) goto L_0x00f3
            int r18 = java.lang.Math.max(r0, r4)
        L_0x00f3:
            r5 = r22
        L_0x00f5:
            if (r10 < 0) goto L_0x00ff
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00ff
            int r0 = r6.f4144g
            r6.f4141d = r0
        L_0x00ff:
            if (r14 >= r10) goto L_0x0111
            float r0 = r13.f4154a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0109
            goto L_0x0111
        L_0x0109:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0111:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0120
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x0120
            r1 = 1
            r25 = 1
            goto L_0x0121
        L_0x0120:
            r1 = 0
        L_0x0121:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r20
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r23
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r24 == 0) goto L_0x0144
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L_0x0144
            r11 = 1
            goto L_0x0145
        L_0x0144:
            r11 = 0
        L_0x0145:
            float r13 = r13.f4154a
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x0157
            if (r1 == 0) goto L_0x014f
            goto L_0x0150
        L_0x014f:
            r2 = r3
        L_0x0150:
            r13 = r17
            int r17 = java.lang.Math.max(r13, r2)
            goto L_0x0165
        L_0x0157:
            r13 = r17
            if (r1 == 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r2 = r3
        L_0x015d:
            r1 = r19
            int r19 = java.lang.Math.max(r1, r2)
            r17 = r13
        L_0x0165:
            int r1 = r38.mo4398k()
            int r14 = r14 + r1
            r22 = r5
            r24 = r11
            r23 = r12
        L_0x0170:
            int r14 = r14 + 1
            r2 = r0
            r20 = r4
            r0 = r10
            r1 = r29
            r3 = r31
            r4 = 0
            r5 = 1
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x0186:
            r29 = r1
            r0 = r2
            r31 = r3
            r13 = r17
            r4 = r18
            r1 = r19
            r12 = r20
            r15 = r23
            r27 = 1
            int r2 = r6.f4144g
            r10 = r31
            if (r2 <= 0) goto L_0x01aa
            boolean r2 = r6.mo4401n(r10)
            if (r2 == 0) goto L_0x01aa
            int r2 = r6.f4144g
            int r3 = r6.f4151n
            int r2 = r2 + r3
            r6.f4144g = r2
        L_0x01aa:
            r2 = r29
            if (r9 == 0) goto L_0x01fa
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01b4
            if (r2 != 0) goto L_0x01fa
        L_0x01b4:
            r11 = 0
            r6.f4144g = r11
            r3 = 0
        L_0x01b8:
            if (r3 >= r10) goto L_0x01fa
            android.view.View r5 = r6.getChildAt(r3)
            if (r5 != 0) goto L_0x01ca
            int r5 = r6.f4144g
            int r14 = r38.mo4406p()
            int r14 = r14 + r5
            r6.f4144g = r14
            goto L_0x01f6
        L_0x01ca:
            int r14 = r5.getVisibility()
            r11 = 8
            if (r14 != r11) goto L_0x01d8
            int r5 = r38.mo4398k()
            int r3 = r3 + r5
            goto L_0x01f6
        L_0x01d8:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            s2$a r5 = (p000.C1095s2.C1096a) r5
            int r11 = r6.f4144g
            int r18 = r11 + r4
            int r14 = r5.topMargin
            int r18 = r18 + r14
            int r5 = r5.bottomMargin
            int r18 = r18 + r5
            int r5 = r38.mo4400m()
            int r5 = r5 + r18
            int r5 = java.lang.Math.max(r11, r5)
            r6.f4144g = r5
        L_0x01f6:
            int r3 = r3 + 1
            r11 = 0
            goto L_0x01b8
        L_0x01fa:
            int r3 = r6.f4144g
            int r5 = r38.getPaddingTop()
            int r11 = r38.getPaddingBottom()
            int r11 = r11 + r5
            int r11 = r11 + r3
            r6.f4144g = r11
            int r3 = r38.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r11, r3)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r11 = r6.f4144g
            int r5 = r5 - r11
            if (r22 != 0) goto L_0x0267
            if (r5 == 0) goto L_0x0226
            r11 = 0
            int r14 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x0226
            goto L_0x0267
        L_0x0226:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L_0x0263
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x0263
            r2 = 0
        L_0x0231:
            if (r2 >= r10) goto L_0x0263
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x0260
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0242
            goto L_0x0260
        L_0x0242:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            s2$a r9 = (p000.C1095s2.C1096a) r9
            float r9 = r9.f4154a
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0260
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r5.measure(r9, r13)
        L_0x0260:
            int r2 = r2 + 1
            goto L_0x0231
        L_0x0263:
            r20 = r12
            goto L_0x0344
        L_0x0267:
            float r4 = r6.f4145h
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0270
            r21 = r4
        L_0x0270:
            r4 = 0
            r6.f4144g = r4
            r4 = 0
        L_0x0274:
            if (r4 >= r10) goto L_0x0334
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x0286
            r29 = r2
            goto L_0x032e
        L_0x0286:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            s2$a r11 = (p000.C1095s2.C1096a) r11
            float r13 = r11.f4154a
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02e0
            float r14 = (float) r5
            float r14 = r14 * r13
            float r14 = r14 / r21
            int r14 = (int) r14
            float r21 = r21 - r13
            int r5 = r5 - r14
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r5
            int r5 = r11.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r5)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02c3
            r13 = 1073741824(0x40000000, float:2.0)
            if (r2 == r13) goto L_0x02bf
            goto L_0x02c3
        L_0x02bf:
            if (r14 <= 0) goto L_0x02ca
            r13 = r14
            goto L_0x02cb
        L_0x02c3:
            int r13 = r9.getMeasuredHeight()
            int r13 = r13 + r14
            if (r13 >= 0) goto L_0x02cb
        L_0x02ca:
            r13 = 0
        L_0x02cb:
            r14 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r9.measure(r5, r13)
            int r5 = r9.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r5)
            r5 = r16
        L_0x02e0:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r29 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x02fd
            int r2 = r11.width
            r16 = r5
            r5 = -1
            if (r2 != r5) goto L_0x0300
            r2 = 1
            goto L_0x0301
        L_0x02fd:
            r16 = r5
            r5 = -1
        L_0x0300:
            r2 = 0
        L_0x0301:
            if (r2 == 0) goto L_0x0304
            goto L_0x0305
        L_0x0304:
            r13 = r14
        L_0x0305:
            int r1 = java.lang.Math.max(r1, r13)
            if (r24 == 0) goto L_0x0311
            int r2 = r11.width
            if (r2 != r5) goto L_0x0311
            r5 = 1
            goto L_0x0312
        L_0x0311:
            r5 = 0
        L_0x0312:
            int r2 = r6.f4144g
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r2
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            int r11 = r38.mo4400m()
            int r11 = r11 + r9
            int r2 = java.lang.Math.max(r2, r11)
            r6.f4144g = r2
            r24 = r5
            r5 = r16
        L_0x032e:
            int r4 = r4 + 1
            r2 = r29
            goto L_0x0274
        L_0x0334:
            int r2 = r6.f4144g
            int r4 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r5 = r5 + r4
            int r5 = r5 + r2
            r6.f4144g = r5
            goto L_0x0263
        L_0x0344:
            if (r24 != 0) goto L_0x034b
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x034b
            goto L_0x034d
        L_0x034b:
            r1 = r20
        L_0x034d:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r3)
            if (r25 == 0) goto L_0x08ed
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0373:
            if (r9 >= r10) goto L_0x08ed
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x03a1
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            s2$a r11 = (p000.C1095s2.C1096a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x03a1
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x03a1:
            int r9 = r9 + 1
            goto L_0x0373
        L_0x03a4:
            r27 = 1
            r0 = 0
            r6.f4144g = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.f4147j
            r12 = 4
            if (r0 == 0) goto L_0x03be
            int[] r0 = r6.f4148k
            if (r0 != 0) goto L_0x03c6
        L_0x03be:
            int[] r0 = new int[r12]
            r6.f4147j = r0
            int[] r0 = new int[r12]
            r6.f4148k = r0
        L_0x03c6:
            int[] r13 = r6.f4147j
            int[] r14 = r6.f4148k
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f4139b
            boolean r4 = r6.f4146i
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03ea
            r18 = 1
            goto L_0x03ec
        L_0x03ea:
            r18 = 0
        L_0x03ec:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 1
            r24 = 0
        L_0x03f9:
            if (r3 >= r9) goto L_0x05ae
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x0410
            int r7 = r6.f4144g
            int r25 = r38.mo4406p()
            int r7 = r25 + r7
            r6.f4144g = r7
            r25 = r0
            r26 = r2
            goto L_0x0421
        L_0x0410:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x042b
            int r0 = r38.mo4398k()
            int r3 = r3 + r0
        L_0x0421:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x05a4
        L_0x042b:
            boolean r0 = r6.mo4401n(r3)
            if (r0 == 0) goto L_0x0438
            int r0 = r6.f4144g
            int r2 = r6.f4150m
            int r0 = r0 + r2
            r6.f4144g = r0
        L_0x0438:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            s2$a r2 = (p000.C1095s2.C1096a) r2
            float r0 = r2.f4154a
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0496
            int r1 = r2.width
            if (r1 != 0) goto L_0x0496
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x0496
            if (r18 == 0) goto L_0x045f
            int r0 = r6.f4144g
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f4144g = r1
            goto L_0x046f
        L_0x045f:
            r30 = r3
            int r0 = r6.f4144g
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f4144g = r0
        L_0x046f:
            if (r5 == 0) goto L_0x0486
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x0511
        L_0x0486:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r5 = 1
            goto L_0x0515
        L_0x0496:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x04a6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a7
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x04a9
        L_0x04a6:
            r1 = 0
        L_0x04a7:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04a9:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04b2
            int r0 = r6.f4144g
            r31 = r0
            goto L_0x04b4
        L_0x04b2:
            r31 = 0
        L_0x04b4:
            r32 = 0
            r1 = r25
            r0 = r38
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r39
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r40
            r30 = r5
            r5 = r32
            r0.mo4402o(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04df
            r1 = r35
            r1.width = r0
            goto L_0x04e1
        L_0x04df:
            r1 = r35
        L_0x04e1:
            int r0 = r7.getMeasuredWidth()
            int r2 = r6.f4144g
            if (r18 == 0) goto L_0x04f8
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r38.mo4400m()
            int r4 = r4 + r3
            int r4 = r4 + r2
            r6.f4144g = r4
            goto L_0x050b
        L_0x04f8:
            int r3 = r2 + r0
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r38.mo4400m()
            int r4 = r4 + r3
            int r2 = java.lang.Math.max(r2, r4)
            r6.f4144g = r2
        L_0x050b:
            if (r26 == 0) goto L_0x0511
            int r8 = java.lang.Math.max(r0, r8)
        L_0x0511:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0515:
            if (r11 == r0) goto L_0x0520
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x0520
            r0 = 1
            r24 = 1
            goto L_0x0521
        L_0x0520:
            r0 = 0
        L_0x0521:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r30 == 0) goto L_0x0563
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L_0x0563
            int r12 = r1.f4155b
            if (r12 >= 0) goto L_0x0542
            int r12 = r6.f4143f
        L_0x0542:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & -2
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L_0x0565
        L_0x0563:
            r22 = r2
        L_0x0565:
            int r2 = java.lang.Math.max(r15, r3)
            if (r23 == 0) goto L_0x0572
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L_0x0572
            r7 = 1
            goto L_0x0573
        L_0x0572:
            r7 = 0
        L_0x0573:
            float r1 = r1.f4154a
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0585
            if (r0 == 0) goto L_0x057e
            r3 = r22
        L_0x057e:
            r1 = r33
            int r0 = java.lang.Math.max(r1, r3)
            goto L_0x0594
        L_0x0585:
            r1 = r33
            if (r0 == 0) goto L_0x058b
            r3 = r22
        L_0x058b:
            r0 = r34
            int r0 = java.lang.Math.max(r0, r3)
            r34 = r0
            r0 = r1
        L_0x0594:
            int r1 = r38.mo4398k()
            int r3 = r1 + r25
            r15 = r2
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r29
            r2 = r34
        L_0x05a4:
            int r3 = r3 + 1
            r7 = r39
            r4 = r26
            r5 = r30
            goto L_0x03f9
        L_0x05ae:
            r26 = r4
            r30 = r5
            r37 = r2
            r2 = r0
            r0 = r37
            int r3 = r6.f4144g
            if (r3 <= 0) goto L_0x05c8
            boolean r3 = r6.mo4401n(r9)
            if (r3 == 0) goto L_0x05c8
            int r3 = r6.f4144g
            int r4 = r6.f4150m
            int r3 = r3 + r4
            r6.f4144g = r3
        L_0x05c8:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L_0x05df
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L_0x05df
            r3 = r13[r17]
            if (r3 != r4) goto L_0x05df
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L_0x05dc
            goto L_0x05e0
        L_0x05dc:
            r25 = r12
            goto L_0x0612
        L_0x05df:
            r3 = 3
        L_0x05e0:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r17]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r17]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r15 = java.lang.Math.max(r15, r4)
        L_0x0612:
            if (r26 == 0) goto L_0x066b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x061a
            if (r10 != 0) goto L_0x066b
        L_0x061a:
            r3 = 0
            r6.f4144g = r3
            r4 = 0
        L_0x061e:
            if (r4 >= r9) goto L_0x066b
            android.view.View r3 = r6.getChildAt(r4)
            if (r3 != 0) goto L_0x0630
            int r3 = r6.f4144g
            int r5 = r38.mo4406p()
            int r5 = r5 + r3
            r6.f4144g = r5
            goto L_0x0668
        L_0x0630:
            int r5 = r3.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x063e
            int r3 = r38.mo4398k()
            int r4 = r4 + r3
            goto L_0x0668
        L_0x063e:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            s2$a r3 = (p000.C1095s2.C1096a) r3
            int r5 = r6.f4144g
            if (r18 == 0) goto L_0x0655
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = r38.mo4400m()
            int r3 = r3 + r7
            int r3 = r3 + r5
            goto L_0x0666
        L_0x0655:
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = r38.mo4400m()
            int r3 = r3 + r7
            int r3 = java.lang.Math.max(r5, r3)
        L_0x0666:
            r6.f4144g = r3
        L_0x0668:
            int r4 = r4 + 1
            goto L_0x061e
        L_0x066b:
            int r3 = r6.f4144g
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f4144g = r5
            int r3 = r38.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r39
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f4144g
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x06df
            if (r4 == 0) goto L_0x0699
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0699
            goto L_0x06df
        L_0x0699:
            int r0 = java.lang.Math.max(r0, r2)
            if (r26 == 0) goto L_0x06d6
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06d6
            r4 = 0
        L_0x06a4:
            if (r4 >= r9) goto L_0x06d6
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x06d3
            int r2 = r1.getVisibility()
            r10 = 8
            if (r2 != r10) goto L_0x06b5
            goto L_0x06d3
        L_0x06b5:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            s2$a r2 = (p000.C1095s2.C1096a) r2
            float r2 = r2.f4154a
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x06d3
            r2 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            int r12 = r1.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            r1.measure(r10, r12)
        L_0x06d3:
            int r4 = r4 + 1
            goto L_0x06a4
        L_0x06d6:
            r8 = r40
            r22 = r9
            r12 = r25
        L_0x06dc:
            r5 = 0
            goto L_0x0884
        L_0x06df:
            float r2 = r6.f4145h
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x06e7
            r1 = r2
        L_0x06e7:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r17] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r17] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.f4144g = r12
            r8 = r4
            r12 = r25
            r2 = -1
            r4 = 0
        L_0x0701:
            if (r4 >= r9) goto L_0x082b
            android.view.View r15 = r6.getChildAt(r4)
            if (r15 == 0) goto L_0x0817
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x0713
            goto L_0x0817
        L_0x0713:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            s2$a r5 = (p000.C1095s2.C1096a) r5
            float r7 = r5.f4154a
            r20 = 0
            int r22 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x0776
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r8 = r8 - r9
            int r7 = r38.getPaddingTop()
            int r25 = r38.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r8
            r8 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0755
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x0751
            goto L_0x0755
        L_0x0751:
            if (r9 <= 0) goto L_0x075c
            r7 = r9
            goto L_0x075d
        L_0x0755:
            int r7 = r15.getMeasuredWidth()
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x075d
        L_0x075c:
            r7 = 0
        L_0x075d:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r15.measure(r7, r1)
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x077b
        L_0x0776:
            r7 = r8
            r22 = r9
            r8 = r40
        L_0x077b:
            if (r18 == 0) goto L_0x0797
            int r9 = r6.f4144g
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            int r1 = r38.mo4400m()
            int r1 = r1 + r25
            int r1 = r1 + r9
            r25 = r7
            goto L_0x07b1
        L_0x0797:
            r26 = r1
            int r1 = r6.f4144g
            int r9 = r15.getMeasuredWidth()
            int r9 = r9 + r1
            r25 = r7
            int r7 = r5.leftMargin
            int r9 = r9 + r7
            int r7 = r5.rightMargin
            int r9 = r9 + r7
            int r7 = r38.mo4400m()
            int r7 = r7 + r9
            int r1 = java.lang.Math.max(r1, r7)
        L_0x07b1:
            r6.f4144g = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x07be
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07be
            r1 = 1
            goto L_0x07bf
        L_0x07be:
            r1 = 0
        L_0x07bf:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x07d0
            goto L_0x07d1
        L_0x07d0:
            r7 = r9
        L_0x07d1:
            int r0 = java.lang.Math.max(r0, r7)
            if (r23 == 0) goto L_0x07de
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07df
            r1 = 1
            goto L_0x07e0
        L_0x07de:
            r7 = -1
        L_0x07df:
            r1 = 0
        L_0x07e0:
            if (r30 == 0) goto L_0x080c
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x080c
            int r5 = r5.f4155b
            if (r5 >= 0) goto L_0x07ee
            int r5 = r6.f4143f
        L_0x07ee:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r28 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x0810
        L_0x080c:
            r21 = 4
            r28 = -2
        L_0x0810:
            r23 = r1
            r7 = r25
            r1 = r26
            goto L_0x0822
        L_0x0817:
            r7 = r8
            r22 = r9
            r20 = 0
            r21 = 4
            r28 = -2
            r8 = r40
        L_0x0822:
            int r4 = r4 + 1
            r8 = r7
            r9 = r22
            r7 = r39
            goto L_0x0701
        L_0x082b:
            r8 = r40
            r22 = r9
            int r1 = r6.f4144g
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.f4144g = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x0854
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L_0x0854
            r1 = r13[r17]
            if (r1 != r4) goto L_0x0854
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L_0x0851
            goto L_0x0855
        L_0x0851:
            r15 = r2
            goto L_0x06dc
        L_0x0854:
            r1 = 3
        L_0x0855:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r7 = r14[r5]
            r9 = r14[r27]
            r10 = r14[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r15 = r1
        L_0x0884:
            if (r23 != 0) goto L_0x088b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x088b
            goto L_0x088c
        L_0x088b:
            r0 = r15
        L_0x088c:
            int r1 = r38.getPaddingTop()
            int r2 = r38.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x08ed
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r22
            r8 = 0
        L_0x08ba:
            if (r8 >= r9) goto L_0x08ed
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08e9
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            s2$a r11 = (p000.C1095s2.C1096a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08ea
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08ea
        L_0x08e9:
            r12 = -1
        L_0x08ea:
            int r8 = r8 + 1
            goto L_0x08ba
        L_0x08ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1095s2.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public int mo4406p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.f4139b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder c = C0279ch.m1106c("base aligned child index out of range (0, ");
            c.append(getChildCount());
            c.append(")");
            throw new IllegalArgumentException(c.toString());
        }
        this.f4140c = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f4149l) {
            this.f4149l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f4150m = drawable.getIntrinsicWidth();
                this.f4151n = drawable.getIntrinsicHeight();
            } else {
                this.f4150m = 0;
                this.f4151n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f4153p = i;
    }

    public void setGravity(int i) {
        if (this.f4143f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4143f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f4143f;
        if ((8388615 & i3) != i2) {
            this.f4143f = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f4146i = z;
    }

    public void setOrientation(int i) {
        if (this.f4142e != i) {
            this.f4142e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4152o) {
            requestLayout();
        }
        this.f4152o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f4143f;
        if ((i3 & 112) != i2) {
            this.f4143f = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f4145h = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
