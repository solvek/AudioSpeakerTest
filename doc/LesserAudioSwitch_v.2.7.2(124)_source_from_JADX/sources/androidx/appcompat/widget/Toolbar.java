package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;
import p000.C0496g;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f452A;

    /* renamed from: B */
    public ColorStateList f453B;

    /* renamed from: C */
    public boolean f454C;

    /* renamed from: D */
    public boolean f455D;

    /* renamed from: E */
    public final ArrayList<View> f456E;

    /* renamed from: F */
    public final ArrayList<View> f457F;

    /* renamed from: G */
    public final int[] f458G;

    /* renamed from: H */
    public C0080f f459H;

    /* renamed from: I */
    public final ActionMenuView.C0054e f460I;

    /* renamed from: J */
    public C0661j3 f461J;

    /* renamed from: K */
    public C0904o1 f462K;

    /* renamed from: L */
    public C0078d f463L;

    /* renamed from: M */
    public boolean f464M;

    /* renamed from: N */
    public final Runnable f465N;

    /* renamed from: b */
    public ActionMenuView f466b;

    /* renamed from: c */
    public TextView f467c;

    /* renamed from: d */
    public TextView f468d;

    /* renamed from: e */
    public ImageButton f469e;

    /* renamed from: f */
    public ImageView f470f;

    /* renamed from: g */
    public Drawable f471g;

    /* renamed from: h */
    public CharSequence f472h;

    /* renamed from: i */
    public ImageButton f473i;

    /* renamed from: j */
    public View f474j;

    /* renamed from: k */
    public Context f475k;

    /* renamed from: l */
    public int f476l;

    /* renamed from: m */
    public int f477m;

    /* renamed from: n */
    public int f478n;

    /* renamed from: o */
    public int f479o;

    /* renamed from: p */
    public int f480p;

    /* renamed from: q */
    public int f481q;

    /* renamed from: r */
    public int f482r;

    /* renamed from: s */
    public int f483s;

    /* renamed from: t */
    public int f484t;

    /* renamed from: u */
    public C1439z2 f485u;

    /* renamed from: v */
    public int f486v;

    /* renamed from: w */
    public int f487w;

    /* renamed from: x */
    public int f488x;

    /* renamed from: y */
    public CharSequence f489y;

    /* renamed from: z */
    public CharSequence f490z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0075a implements ActionMenuView.C0054e {
        public C0075a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0076b implements Runnable {
        public C0076b() {
        }

        public void run() {
            Toolbar.this.mo586u();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0077c implements View.OnClickListener {
        public C0077c() {
        }

        public void onClick(View view) {
            C0078d dVar = Toolbar.this.f463L;
            C0203b1 b1Var = dVar == null ? null : dVar.f495c;
            if (b1Var != null) {
                b1Var.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0078d implements C0449f1 {

        /* renamed from: b */
        public C1435z0 f494b;

        /* renamed from: c */
        public C0203b1 f495c;

        public C0078d() {
        }

        /* renamed from: b */
        public void mo589b(C1435z0 z0Var, boolean z) {
        }

        /* renamed from: c */
        public boolean mo590c(C1435z0 z0Var, C0203b1 b1Var) {
            Toolbar.this.mo495c();
            ViewParent parent = Toolbar.this.f473i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f473i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f473i);
            }
            Toolbar.this.f474j = b1Var.getActionView();
            this.f495c = b1Var;
            ViewParent parent2 = Toolbar.this.f474j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f474j);
                }
                C0079e h = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h.f2184a = 8388611 | (toolbar4.f479o & 112);
                h.f497b = 2;
                toolbar4.f474j.setLayoutParams(h);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f474j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((C0079e) childAt.getLayoutParams()).f497b == 2 || childAt == toolbar6.f466b)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f457F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            b1Var.f1179C = true;
            b1Var.f1194n.mo5251q(false);
            View view = Toolbar.this.f474j;
            if (view instanceof C0799m0) {
                ((C0799m0) view).mo360a();
            }
            return true;
        }

        /* renamed from: f */
        public boolean mo591f(C0705k1 k1Var) {
            return false;
        }

        /* renamed from: g */
        public boolean mo592g() {
            return false;
        }

        /* renamed from: h */
        public void mo593h(boolean z) {
            if (this.f495c != null) {
                C1435z0 z0Var = this.f494b;
                boolean z2 = false;
                if (z0Var != null) {
                    int size = z0Var.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f494b.getItem(i) == this.f495c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo595k(this.f494b, this.f495c);
                }
            }
        }

        /* renamed from: j */
        public void mo594j(Context context, C1435z0 z0Var) {
            C0203b1 b1Var;
            C1435z0 z0Var2 = this.f494b;
            if (!(z0Var2 == null || (b1Var = this.f495c) == null)) {
                z0Var2.mo3477d(b1Var);
            }
            this.f494b = z0Var;
        }

        /* renamed from: k */
        public boolean mo595k(C1435z0 z0Var, C0203b1 b1Var) {
            View view = Toolbar.this.f474j;
            if (view instanceof C0799m0) {
                ((C0799m0) view).mo362e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f474j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f473i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f474j = null;
            int size = toolbar3.f457F.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.f457F.get(size));
                } else {
                    toolbar3.f457F.clear();
                    this.f495c = null;
                    Toolbar.this.requestLayout();
                    b1Var.f1179C = false;
                    b1Var.f1194n.mo5251q(false);
                    return true;
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0079e extends C0496g.C0497a {

        /* renamed from: b */
        public int f497b = 0;

        public C0079e(int i, int i2) {
            super(i, i2);
            this.f2184a = 8388627;
        }

        public C0079e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0079e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0079e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0079e(C0079e eVar) {
            super((C0496g.C0497a) eVar);
            this.f497b = eVar.f497b;
        }

        public C0079e(C0496g.C0497a aVar) {
            super(aVar);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0080f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0081g extends C0718k9 {
        public static final Parcelable.Creator<C0081g> CREATOR = new C0082a();

        /* renamed from: d */
        public int f498d;

        /* renamed from: e */
        public boolean f499e;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public class C0082a implements Parcelable.ClassLoaderCreator<C0081g> {
            public Object createFromParcel(Parcel parcel) {
                return new C0081g(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0081g[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0081g(parcel, classLoader);
            }
        }

        public C0081g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f498d = parcel.readInt();
            this.f499e = parcel.readInt() != 0;
        }

        public C0081g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            parcel.writeInt(this.f498d);
            parcel.writeInt(this.f499e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f488x = 8388627;
        this.f456E = new ArrayList<>();
        this.f457F = new ArrayList<>();
        this.f458G = new int[2];
        this.f460I = new C0075a();
        this.f465N = new C0076b();
        Context context2 = getContext();
        int[] iArr = C0440f.f2071y;
        C0555h3 q = C0555h3.m1825q(context2, attributeSet, iArr, i, 0);
        C0813m8.m2456E(this, context, iArr, attributeSet, q.f2425b, i, 0);
        this.f477m = q.mo3032l(28, 0);
        this.f478n = q.mo3032l(19, 0);
        this.f488x = q.f2425b.getInteger(0, this.f488x);
        this.f479o = q.f2425b.getInteger(2, 48);
        int e = q.mo3025e(22, 0);
        e = q.mo3035o(27) ? q.mo3025e(27, e) : e;
        this.f484t = e;
        this.f483s = e;
        this.f482r = e;
        this.f481q = e;
        int e2 = q.mo3025e(25, -1);
        if (e2 >= 0) {
            this.f481q = e2;
        }
        int e3 = q.mo3025e(24, -1);
        if (e3 >= 0) {
            this.f482r = e3;
        }
        int e4 = q.mo3025e(26, -1);
        if (e4 >= 0) {
            this.f483s = e4;
        }
        int e5 = q.mo3025e(23, -1);
        if (e5 >= 0) {
            this.f484t = e5;
        }
        this.f480p = q.mo3026f(13, -1);
        int e6 = q.mo3025e(9, Integer.MIN_VALUE);
        int e7 = q.mo3025e(5, Integer.MIN_VALUE);
        int f = q.mo3026f(7, 0);
        int f2 = q.mo3026f(8, 0);
        mo497d();
        C1439z2 z2Var = this.f485u;
        z2Var.f5258h = false;
        if (f != Integer.MIN_VALUE) {
            z2Var.f5255e = f;
            z2Var.f5251a = f;
        }
        if (f2 != Integer.MIN_VALUE) {
            z2Var.f5256f = f2;
            z2Var.f5252b = f2;
        }
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            z2Var.mo5270a(e6, e7);
        }
        this.f486v = q.mo3025e(10, Integer.MIN_VALUE);
        this.f487w = q.mo3025e(6, Integer.MIN_VALUE);
        this.f471g = q.mo3027g(4);
        this.f472h = q.mo3034n(3);
        CharSequence n = q.mo3034n(21);
        if (!TextUtils.isEmpty(n)) {
            setTitle(n);
        }
        CharSequence n2 = q.mo3034n(18);
        if (!TextUtils.isEmpty(n2)) {
            setSubtitle(n2);
        }
        this.f475k = getContext();
        setPopupTheme(q.mo3032l(17, 0));
        Drawable g = q.mo3027g(16);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence n3 = q.mo3034n(15);
        if (!TextUtils.isEmpty(n3)) {
            setNavigationContentDescription(n3);
        }
        Drawable g2 = q.mo3027g(11);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence n4 = q.mo3034n(12);
        if (!TextUtils.isEmpty(n4)) {
            setLogoDescription(n4);
        }
        if (q.mo3035o(29)) {
            setTitleTextColor(q.mo3023c(29));
        }
        if (q.mo3035o(20)) {
            setSubtitleTextColor(q.mo3023c(20));
        }
        if (q.mo3035o(14)) {
            getMenuInflater().inflate(q.mo3032l(14, 0), getMenu());
        }
        q.f2425b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C0995q0(getContext());
    }

    /* renamed from: a */
    public final void mo493a(List<View> list, int i) {
        boolean z = C0813m8.m2478l(this) == 1;
        int childCount = getChildCount();
        int t = C1344x5.m3775t(i, C0813m8.m2478l(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0079e eVar = (C0079e) childAt.getLayoutParams();
                if (eVar.f497b == 0 && mo585t(childAt) && mo536j(eVar.f2184a) == t) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0079e eVar2 = (C0079e) childAt2.getLayoutParams();
            if (eVar2.f497b == 0 && mo585t(childAt2) && mo536j(eVar2.f2184a) == t) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final void mo494b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0079e h = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0079e) layoutParams;
        h.f497b = 1;
        if (!z || this.f474j == null) {
            addView(view, h);
            return;
        }
        view.setLayoutParams(h);
        this.f457F.add(view);
    }

    /* renamed from: c */
    public void mo495c() {
        if (this.f473i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f473i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f471g);
            this.f473i.setContentDescription(this.f472h);
            C0079e h = generateDefaultLayoutParams();
            h.f2184a = 8388611 | (this.f479o & 112);
            h.f497b = 2;
            this.f473i.setLayoutParams(h);
            this.f473i.setOnClickListener(new C0077c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0079e);
    }

    /* renamed from: d */
    public final void mo497d() {
        if (this.f485u == null) {
            this.f485u = new C1439z2();
        }
    }

    /* renamed from: e */
    public final void mo498e() {
        mo499f();
        ActionMenuView actionMenuView = this.f466b;
        if (actionMenuView.f301q == null) {
            C1435z0 z0Var = (C1435z0) actionMenuView.getMenu();
            if (this.f463L == null) {
                this.f463L = new C0078d();
            }
            this.f466b.setExpandedActionViewsExclusive(true);
            z0Var.mo5235b(this.f463L, this.f475k);
        }
    }

    /* renamed from: f */
    public final void mo499f() {
        if (this.f466b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f466b = actionMenuView;
            actionMenuView.setPopupTheme(this.f476l);
            this.f466b.setOnMenuItemClickListener(this.f460I);
            ActionMenuView actionMenuView2 = this.f466b;
            actionMenuView2.f306v = null;
            actionMenuView2.f307w = null;
            C0079e h = generateDefaultLayoutParams();
            h.f2184a = 8388613 | (this.f479o & 112);
            this.f466b.setLayoutParams(h);
            mo494b(this.f466b, false);
        }
    }

    /* renamed from: g */
    public final void mo500g() {
        if (this.f469e == null) {
            this.f469e = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            C0079e h = generateDefaultLayoutParams();
            h.f2184a = 8388611 | (this.f479o & 112);
            this.f469e.setLayoutParams(h);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0079e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f473i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f473i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1439z2 z2Var = this.f485u;
        if (z2Var != null) {
            return z2Var.f5257g ? z2Var.f5251a : z2Var.f5252b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f487w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1439z2 z2Var = this.f485u;
        if (z2Var != null) {
            return z2Var.f5251a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1439z2 z2Var = this.f485u;
        if (z2Var != null) {
            return z2Var.f5252b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1439z2 z2Var = this.f485u;
        if (z2Var != null) {
            return z2Var.f5257g ? z2Var.f5252b : z2Var.f5251a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f486v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f301q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f466b
            r1 = 0
            if (r0 == 0) goto L_0x0011
            z0 r0 = r0.f301q
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f487w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0813m8.m2478l(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0813m8.m2478l(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f486v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f470f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f470f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo498e();
        return this.f466b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f469e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f469e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0904o1 getOuterActionMenuPresenter() {
        return this.f462K;
    }

    public Drawable getOverflowIcon() {
        mo498e();
        return this.f466b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f475k;
    }

    public int getPopupTheme() {
        return this.f476l;
    }

    public CharSequence getSubtitle() {
        return this.f490z;
    }

    public final TextView getSubtitleTextView() {
        return this.f468d;
    }

    public CharSequence getTitle() {
        return this.f489y;
    }

    public int getTitleMarginBottom() {
        return this.f484t;
    }

    public int getTitleMarginEnd() {
        return this.f482r;
    }

    public int getTitleMarginStart() {
        return this.f481q;
    }

    public int getTitleMarginTop() {
        return this.f483s;
    }

    public final TextView getTitleTextView() {
        return this.f467c;
    }

    public C0855n2 getWrapper() {
        if (this.f461J == null) {
            this.f461J = new C0661j3(this, true);
        }
        return this.f461J;
    }

    /* renamed from: h */
    public C0079e generateDefaultLayoutParams() {
        return new C0079e(-2, -2);
    }

    /* renamed from: i */
    public C0079e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0079e ? new C0079e((C0079e) layoutParams) : layoutParams instanceof C0496g.C0497a ? new C0079e((C0496g.C0497a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0079e((ViewGroup.MarginLayoutParams) layoutParams) : new C0079e(layoutParams);
    }

    /* renamed from: j */
    public final int mo536j(int i) {
        int l = C0813m8.m2478l(this);
        int t = C1344x5.m3775t(i, l) & 7;
        return (t == 1 || t == 3 || t == 5) ? t : l == 1 ? 5 : 3;
    }

    /* renamed from: k */
    public final int mo537k(View view, int i) {
        C0079e eVar = (C0079e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f2184a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f488x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = eVar.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = eVar.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: l */
    public final int mo538l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1344x5.m3781z(marginLayoutParams) + (Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin);
    }

    /* renamed from: m */
    public final int mo539m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: n */
    public final boolean mo540n(View view) {
        return view.getParent() == this || this.f457F.contains(view);
    }

    /* renamed from: o */
    public boolean mo541o() {
        ActionMenuView actionMenuView = this.f466b;
        if (actionMenuView != null) {
            C0904o1 o1Var = actionMenuView.f305u;
            if (o1Var != null && o1Var.mo3824m()) {
                return true;
            }
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f465N);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f455D = false;
        }
        if (!this.f455D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f455D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f455D = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02dc A[LOOP:2: B:112:0x02da->B:113:0x02dc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x032e A[LOOP:3: B:120:0x032c->B:121:0x032e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p000.C0813m8.m2478l(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f458G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p000.C0813m8.m2479m(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f469e
            boolean r13 = r0.mo585t(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f469e
            if (r1 == 0) goto L_0x004e
            int r13 = r0.mo551q(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.mo550p(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f473i
            boolean r15 = r0.mo585t(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f473i
            if (r1 == 0) goto L_0x0066
            int r14 = r0.mo551q(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.mo550p(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f466b
            boolean r15 = r0.mo585t(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f466b
            if (r1 == 0) goto L_0x007b
            int r13 = r0.mo550p(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.mo551q(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f474j
            boolean r13 = r0.mo585t(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f474j
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.mo551q(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.mo550p(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f470f
            boolean r13 = r0.mo585t(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f470f
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.mo551q(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.mo550p(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f467c
            boolean r13 = r0.mo585t(r13)
            android.widget.TextView r14 = r0.f468d
            boolean r14 = r0.mo585t(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f467c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0079e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f467c
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r7 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r3 = r0.f468d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0079e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f468d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0120
            if (r14 == 0) goto L_0x011a
            goto L_0x0120
        L_0x011a:
            r18 = r6
            r22 = r12
            goto L_0x0285
        L_0x0120:
            if (r13 == 0) goto L_0x0125
            android.widget.TextView r3 = r0.f467c
            goto L_0x0127
        L_0x0125:
            android.widget.TextView r3 = r0.f468d
        L_0x0127:
            if (r14 == 0) goto L_0x012c
            android.widget.TextView r4 = r0.f468d
            goto L_0x012e
        L_0x012c:
            android.widget.TextView r4 = r0.f467c
        L_0x012e:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0079e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0079e) r4
            if (r13 == 0) goto L_0x0144
            android.widget.TextView r15 = r0.f467c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014e
        L_0x0144:
            if (r14 == 0) goto L_0x0151
            android.widget.TextView r15 = r0.f468d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0151
        L_0x014e:
            r17 = 1
            goto L_0x0153
        L_0x0151:
            r17 = 0
        L_0x0153:
            int r15 = r0.f488x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019b
            r6 = 80
            if (r15 == r6) goto L_0x018d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.f483s
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0176
            int r6 = r15 + r12
            goto L_0x018b
        L_0x0176:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.f484t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018b
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018b:
            int r8 = r8 + r6
            goto L_0x01aa
        L_0x018d:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f484t
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01aa
        L_0x019b:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.f483s
            int r8 = r2 + r3
        L_0x01aa:
            if (r1 == 0) goto L_0x021b
            if (r17 == 0) goto L_0x01b1
            int r1 = r0.f481q
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01e9
            android.widget.TextView r1 = r0.f467c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0079e) r1
            android.widget.TextView r2 = r0.f467c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f467c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f467c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f482r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ea
        L_0x01e9:
            r2 = r10
        L_0x01ea:
            if (r14 == 0) goto L_0x0210
            android.widget.TextView r1 = r0.f468d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0079e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f468d
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f468d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f468d
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f482r
            int r1 = r10 - r1
            goto L_0x0211
        L_0x0210:
            r1 = r10
        L_0x0211:
            if (r17 == 0) goto L_0x0218
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0218:
            r2 = r24
            goto L_0x0285
        L_0x021b:
            if (r17 == 0) goto L_0x0220
            int r1 = r0.f481q
            goto L_0x0221
        L_0x0220:
            r1 = 0
        L_0x0221:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r24
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0257
            android.widget.TextView r1 = r0.f467c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0079e) r1
            android.widget.TextView r2 = r0.f467c
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f467c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f467c
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f482r
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0258
        L_0x0257:
            r2 = r3
        L_0x0258:
            if (r14 == 0) goto L_0x027c
            android.widget.TextView r1 = r0.f468d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0079e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f468d
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f468d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f468d
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f482r
            int r1 = r1 + r4
            goto L_0x027d
        L_0x027c:
            r1 = r3
        L_0x027d:
            if (r17 == 0) goto L_0x0284
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0285
        L_0x0284:
            r2 = r3
        L_0x0285:
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            r3 = 3
            r0.mo493a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0293:
            if (r2 >= r1) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.f456E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.mo550p(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            r2 = 5
            r0.mo493a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            int r1 = r1.size()
            r2 = 0
        L_0x02b5:
            if (r2 >= r1) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.f456E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo551q(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            r2 = 1
            r0.mo493a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02da:
            if (r5 >= r4) goto L_0x030d
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.C0079e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02da
        L_0x030d:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031d
            goto L_0x0324
        L_0x031d:
            if (r6 <= r10) goto L_0x0323
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0324
        L_0x0323:
            r3 = r4
        L_0x0324:
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L_0x032c:
            if (r3 >= r1) goto L_0x033d
            java.util.ArrayList<android.view.View> r4 = r0.f456E
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo550p(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x032c
        L_0x033d:
            java.util.ArrayList<android.view.View> r1 = r0.f456E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f458G;
        boolean z = true;
        int i10 = 0;
        if (C0856n3.m2571a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (mo585t(this.f469e)) {
            mo553s(this.f469e, i, 0, i2, 0, this.f480p);
            i5 = mo538l(this.f469e) + this.f469e.getMeasuredWidth();
            i4 = Math.max(0, mo539m(this.f469e) + this.f469e.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.f469e.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo585t(this.f473i)) {
            mo553s(this.f473i, i, 0, i2, 0, this.f480p);
            i5 = mo538l(this.f473i) + this.f473i.getMeasuredWidth();
            i4 = Math.max(i4, mo539m(this.f473i) + this.f473i.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f473i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (mo585t(this.f466b)) {
            mo553s(this.f466b, i, max, i2, 0, this.f480p);
            i6 = mo538l(this.f466b) + this.f466b.getMeasuredWidth();
            i4 = Math.max(i4, mo539m(this.f466b) + this.f466b.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f466b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo585t(this.f474j)) {
            max2 += mo552r(this.f474j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo539m(this.f474j) + this.f474j.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f474j.getMeasuredState());
        }
        if (mo585t(this.f470f)) {
            max2 += mo552r(this.f470f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo539m(this.f470f) + this.f470f.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f470f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0079e) childAt.getLayoutParams()).f497b == 0 && mo585t(childAt)) {
                View view = childAt;
                max2 += mo552r(childAt, i, max2, i2, 0, iArr);
                View view2 = view;
                i4 = Math.max(i4, mo539m(view2) + view.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
            }
        }
        int i12 = this.f483s + this.f484t;
        int i13 = this.f481q + this.f482r;
        if (mo585t(this.f467c)) {
            mo552r(this.f467c, i, max2 + i13, i2, i12, iArr);
            int l = mo538l(this.f467c) + this.f467c.getMeasuredWidth();
            i7 = mo539m(this.f467c) + this.f467c.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i3, this.f467c.getMeasuredState());
            i8 = l;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (mo585t(this.f468d)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, mo552r(this.f468d, i, max2 + i13, i2, i14, iArr));
            i7 = mo539m(this.f468d) + this.f468d.getMeasuredHeight() + i7;
            i9 = View.combineMeasuredStates(i9, this.f468d.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f464M) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if (mo585t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i16++;
            }
        }
        z = false;
        if (!z) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0081g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0081g gVar = (C0081g) parcelable;
        super.onRestoreInstanceState(gVar.f2988b);
        ActionMenuView actionMenuView = this.f466b;
        C1435z0 z0Var = actionMenuView != null ? actionMenuView.f301q : null;
        int i = gVar.f498d;
        if (!(i == 0 || this.f463L == null || z0Var == null || (findItem = z0Var.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f499e) {
            removeCallbacks(this.f465N);
            post(this.f465N);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x0009
            super.onRtlPropertiesChanged(r3)
        L_0x0009:
            r2.mo497d()
            z2 r0 = r2.f485u
            r1 = 1
            if (r3 != r1) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            boolean r3 = r0.f5257g
            if (r1 != r3) goto L_0x0018
            goto L_0x0046
        L_0x0018:
            r0.f5257g = r1
            boolean r3 = r0.f5258h
            if (r3 == 0) goto L_0x003e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0030
            int r1 = r0.f5254d
            if (r1 == r3) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            int r1 = r0.f5255e
        L_0x0029:
            r0.f5251a = r1
            int r1 = r0.f5253c
            if (r1 == r3) goto L_0x0042
            goto L_0x0044
        L_0x0030:
            int r1 = r0.f5253c
            if (r1 == r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            int r1 = r0.f5255e
        L_0x0037:
            r0.f5251a = r1
            int r1 = r0.f5254d
            if (r1 == r3) goto L_0x0042
            goto L_0x0044
        L_0x003e:
            int r3 = r0.f5255e
            r0.f5251a = r3
        L_0x0042:
            int r1 = r0.f5256f
        L_0x0044:
            r0.f5252b = r1
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        C0203b1 b1Var;
        C0081g gVar = new C0081g(super.onSaveInstanceState());
        C0078d dVar = this.f463L;
        if (!(dVar == null || (b1Var = dVar.f495c) == null)) {
            gVar.f498d = b1Var.f1181a;
        }
        gVar.f499e = mo541o();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f454C = false;
        }
        if (!this.f454C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f454C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f454C = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int mo550p(View view, int i, int[] iArr, int i2) {
        C0079e eVar = (C0079e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int k = mo537k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + eVar.rightMargin + max;
    }

    /* renamed from: q */
    public final int mo551q(View view, int i, int[] iArr, int i2) {
        C0079e eVar = (C0079e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int k = mo537k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: r */
    public final int mo552r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: s */
    public final void mo553s(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo495c();
        }
        ImageButton imageButton = this.f473i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0399e0.m1530b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo495c();
            this.f473i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f473i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f471g);
        }
    }

    public void setCollapsible(boolean z) {
        this.f464M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f487w) {
            this.f487w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f486v) {
            this.f486v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0399e0.m1530b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f470f == null) {
                this.f470f = new AppCompatImageView(getContext(), (AttributeSet) null);
            }
            if (!mo540n(this.f470f)) {
                mo494b(this.f470f, true);
            }
        } else {
            ImageView imageView = this.f470f;
            if (imageView != null && mo540n(imageView)) {
                removeView(this.f470f);
                this.f457F.remove(this.f470f);
            }
        }
        ImageView imageView2 = this.f470f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f470f == null) {
            this.f470f = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.f470f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo500g();
        }
        ImageButton imageButton = this.f469e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0399e0.m1530b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo500g();
            if (!mo540n(this.f469e)) {
                mo494b(this.f469e, true);
            }
        } else {
            ImageButton imageButton = this.f469e;
            if (imageButton != null && mo540n(imageButton)) {
                removeView(this.f469e);
                this.f457F.remove(this.f469e);
            }
        }
        ImageButton imageButton2 = this.f469e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo500g();
        this.f469e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0080f fVar) {
        this.f459H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        mo498e();
        this.f466b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f476l != i) {
            this.f476l = i;
            if (i == 0) {
                this.f475k = getContext();
            } else {
                this.f475k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f468d == null) {
                Context context = getContext();
                C0660j2 j2Var = new C0660j2(context, (AttributeSet) null);
                this.f468d = j2Var;
                j2Var.setSingleLine();
                this.f468d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f478n;
                if (i != 0) {
                    this.f468d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f453B;
                if (colorStateList != null) {
                    this.f468d.setTextColor(colorStateList);
                }
            }
            if (!mo540n(this.f468d)) {
                mo494b(this.f468d, true);
            }
        } else {
            TextView textView = this.f468d;
            if (textView != null && mo540n(textView)) {
                removeView(this.f468d);
                this.f457F.remove(this.f468d);
            }
        }
        TextView textView2 = this.f468d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f490z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f453B = colorStateList;
        TextView textView = this.f468d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f467c == null) {
                Context context = getContext();
                C0660j2 j2Var = new C0660j2(context, (AttributeSet) null);
                this.f467c = j2Var;
                j2Var.setSingleLine();
                this.f467c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f477m;
                if (i != 0) {
                    this.f467c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f452A;
                if (colorStateList != null) {
                    this.f467c.setTextColor(colorStateList);
                }
            }
            if (!mo540n(this.f467c)) {
                mo494b(this.f467c, true);
            }
        } else {
            TextView textView = this.f467c;
            if (textView != null && mo540n(textView)) {
                removeView(this.f467c);
                this.f457F.remove(this.f467c);
            }
        }
        TextView textView2 = this.f467c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f489y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f484t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f482r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f481q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f483s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f452A = colorStateList;
        TextView textView = this.f467c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final boolean mo585t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: u */
    public boolean mo586u() {
        ActionMenuView actionMenuView = this.f466b;
        if (actionMenuView != null) {
            C0904o1 o1Var = actionMenuView.f305u;
            if (o1Var != null && o1Var.mo3825n()) {
                return true;
            }
        }
        return false;
    }
}
