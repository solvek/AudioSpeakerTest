package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import p000.C0449f1;
import p000.C0904o1;
import p000.C1095s2;
import p000.C1435z0;

public class ActionMenuView extends C1095s2 implements C1435z0.C1437b, C0504g1 {

    /* renamed from: A */
    public int f299A;

    /* renamed from: B */
    public C0054e f300B;

    /* renamed from: q */
    public C1435z0 f301q;

    /* renamed from: r */
    public Context f302r;

    /* renamed from: s */
    public int f303s = 0;

    /* renamed from: t */
    public boolean f304t;

    /* renamed from: u */
    public C0904o1 f305u;

    /* renamed from: v */
    public C0449f1.C0450a f306v;

    /* renamed from: w */
    public C1435z0.C1436a f307w;

    /* renamed from: x */
    public boolean f308x;

    /* renamed from: y */
    public int f309y;

    /* renamed from: z */
    public int f310z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0050a {
        /* renamed from: a */
        boolean mo143a();

        /* renamed from: b */
        boolean mo144b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0051b implements C0449f1.C0450a {
        /* renamed from: b */
        public void mo10b(C1435z0 z0Var, boolean z) {
        }

        /* renamed from: c */
        public boolean mo11c(C1435z0 z0Var) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0052c extends C1095s2.C1096a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f311c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f312d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f313e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f314f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f315g;

        /* renamed from: h */
        public boolean f316h;

        public C0052c(int i, int i2) {
            super(i, i2);
            this.f311c = false;
        }

        public C0052c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0052c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0052c(C0052c cVar) {
            super(cVar);
            this.f311c = cVar.f311c;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0053d implements C1435z0.C1436a {
        public C0053d() {
        }

        /* renamed from: a */
        public void mo307a(C1435z0 z0Var) {
            C1435z0.C1436a aVar = ActionMenuView.this.f307w;
            if (aVar != null) {
                aVar.mo307a(z0Var);
            }
        }

        /* renamed from: b */
        public boolean mo308b(C1435z0 z0Var, MenuItem menuItem) {
            C0054e eVar = ActionMenuView.this.f300B;
            if (eVar == null) {
                return false;
            }
            Toolbar.C0080f fVar = Toolbar.this.f459H;
            return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0054e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f310z = (int) (56.0f * f);
        this.f299A = (int) (f * 4.0f);
        this.f302r = context;
    }

    /* renamed from: t */
    public static int m106t(View view, int i, int i2, int i3, int i4) {
        C0052c cVar = (C0052c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo145c();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!cVar.f311c && z2) {
            z = true;
        }
        cVar.f314f = z;
        cVar.f312d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: b */
    public boolean mo165b(C0203b1 b1Var) {
        return this.f301q.mo5255s(b1Var, (C0449f1) null, 0);
    }

    /* renamed from: c */
    public void mo166c(C1435z0 z0Var) {
        this.f301q = z0Var;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0052c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0052c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f301q == null) {
            Context context = getContext();
            C1435z0 z0Var = new C1435z0(context);
            this.f301q = z0Var;
            z0Var.f5229e = new C0053d();
            C0904o1 o1Var = new C0904o1(context);
            this.f305u = o1Var;
            o1Var.f3447m = true;
            o1Var.f3448n = true;
            C0449f1.C0450a aVar = this.f306v;
            if (aVar == null) {
                aVar = new C0051b();
            }
            o1Var.f4534f = aVar;
            this.f301q.mo5235b(o1Var, this.f302r);
            C0904o1 o1Var2 = this.f305u;
            o1Var2.f4537i = this;
            this.f301q = o1Var2.f4532d;
        }
        return this.f301q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0904o1 o1Var = this.f305u;
        C0904o1.C0908d dVar = o1Var.f3444j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (o1Var.f3446l) {
            return o1Var.f3445k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f303s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: i */
    public C1095s2.C1096a mo292i(AttributeSet attributeSet) {
        return new C0052c(getContext(), attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0904o1 o1Var = this.f305u;
        if (o1Var != null) {
            o1Var.mo593h(false);
            if (this.f305u.mo3824m()) {
                this.f305u.mo3822i();
                this.f305u.mo3825n();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0904o1 o1Var = this.f305u;
        if (o1Var != null) {
            o1Var.mo3820a();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f308x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0856n3.m2571a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0052c cVar = (C0052c) childAt.getLayoutParams();
                if (cVar.f311c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo300s(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo300s(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0052c cVar2 = (C0052c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f311c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0052c cVar3 = (C0052c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f311c) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i20;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        C1435z0 z0Var;
        boolean z4 = this.f308x;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f308x = z5;
        if (z4 != z5) {
            this.f309y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f308x || (z0Var = this.f301q) == null || size == this.f309y)) {
            this.f309y = size;
            z0Var.mo5251q(true);
        }
        int childCount = getChildCount();
        if (!this.f308x || childCount <= 0) {
            int i7 = i2;
            for (int i8 = 0; i8 < childCount; i8++) {
                C0052c cVar = (C0052c) getChildAt(i8).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f310z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z6 = false;
        long j = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z7) {
                    int i22 = this.f299A;
                    i6 = i21;
                    z3 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i6 = i21;
                    z3 = false;
                }
                C0052c cVar2 = (C0052c) childAt.getLayoutParams();
                cVar2.f316h = z3;
                cVar2.f313e = z3 ? 1 : 0;
                cVar2.f312d = z3;
                cVar2.f314f = z3;
                cVar2.leftMargin = z3;
                cVar2.rightMargin = z3;
                cVar2.f315g = z7 && ((ActionMenuItemView) childAt).mo145c();
                int t = m106t(childAt, i13, cVar2.f311c ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, t);
                if (cVar2.f314f) {
                    i17++;
                }
                if (cVar2.f311c) {
                    z6 = true;
                }
                i11 -= t;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (t == 1) {
                    j |= (long) (1 << i18);
                }
                i14 = i6;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 <= 0 || i11 <= 0) {
                i3 = i15;
                z = z9;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount2) {
                    int i28 = i15;
                    C0052c cVar3 = (C0052c) getChildAt(i26).getLayoutParams();
                    boolean z10 = z9;
                    if (cVar3.f314f) {
                        int i29 = cVar3.f312d;
                        if (i29 < i25) {
                            j2 = 1 << i26;
                            i25 = i29;
                            i27 = 1;
                        } else if (i29 == i25) {
                            i27++;
                            j2 |= 1 << i26;
                        }
                    }
                    i26++;
                    z9 = z10;
                    i15 = i28;
                }
                i3 = i15;
                z = z9;
                j |= j2;
                if (i27 > i11) {
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount2) {
                    View childAt2 = getChildAt(i31);
                    C0052c cVar4 = (C0052c) childAt2.getLayoutParams();
                    int i32 = i17;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar4.f312d == i30) {
                            j |= j3;
                        }
                        z2 = z8;
                    } else {
                        if (!z8 || !cVar4.f315g || i11 != 1) {
                            z2 = z8;
                        } else {
                            int i33 = this.f299A;
                            z2 = z8;
                            childAt2.setPadding(i33 + i13, 0, i33, 0);
                        }
                        cVar4.f312d++;
                        cVar4.f316h = true;
                        i11--;
                    }
                    i31++;
                    i17 = i32;
                    z8 = z2;
                }
                i15 = i3;
                z9 = true;
            }
        }
        i3 = i15;
        z = z9;
        boolean z11 = !z6 && i14 == 1;
        if (i11 > 0 && j != 0 && (i11 < i14 - 1 || z11 || i16 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((C0052c) getChildAt(0).getLayoutParams()).f315g) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j & ((long) (1 << i34))) != 0 && !((C0052c) getChildAt(i34).getLayoutParams()).f315g) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0052c cVar5 = (C0052c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f313e = i35;
                        cVar5.f316h = true;
                        if (i36 == 0 && !cVar5.f315g) {
                            cVar5.leftMargin = (-i35) / 2;
                        }
                    } else if (cVar5.f311c) {
                        cVar5.f313e = i35;
                        cVar5.f316h = true;
                        cVar5.rightMargin = (-i35) / 2;
                    } else {
                        if (i36 != 0) {
                            cVar5.leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            cVar5.rightMargin = i35 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C0052c cVar6 = (C0052c) childAt4.getLayoutParams();
                if (cVar6.f316h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f312d * i13) + cVar6.f313e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i23;
            i4 = i3;
        } else {
            i4 = i24;
            i5 = i23;
        }
        setMeasuredDimension(i5, i4);
    }

    /* renamed from: q */
    public C0052c mo291h() {
        C0052c cVar = new C0052c(-2, -2);
        cVar.f4155b = 16;
        return cVar;
    }

    /* renamed from: r */
    public C0052c mo293j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo291h();
        }
        C0052c cVar = layoutParams instanceof C0052c ? new C0052c((C0052c) layoutParams) : new C0052c(layoutParams);
        if (cVar.f4155b <= 0) {
            cVar.f4155b = 16;
        }
        return cVar;
    }

    /* renamed from: s */
    public boolean mo300s(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0050a)) {
            z = false | ((C0050a) childAt).mo144b();
        }
        return (i <= 0 || !(childAt2 instanceof C0050a)) ? z : z | ((C0050a) childAt2).mo143a();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f305u.f3452r = z;
    }

    public void setOnMenuItemClickListener(C0054e eVar) {
        this.f300B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0904o1 o1Var = this.f305u;
        C0904o1.C0908d dVar = o1Var.f3444j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        o1Var.f3446l = true;
        o1Var.f3445k = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f304t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f303s != i) {
            this.f303s = i;
            if (i == 0) {
                this.f302r = getContext();
            } else {
                this.f302r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0904o1 o1Var) {
        this.f305u = o1Var;
        o1Var.f4537i = this;
        this.f301q = o1Var.f4532d;
    }
}
