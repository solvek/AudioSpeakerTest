package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import p000.C0449f1;
import p000.C0504g1;
import p000.C1435z0;

/* renamed from: o1 */
public class C0904o1 extends C1187u0 {

    /* renamed from: j */
    public C0908d f3444j;

    /* renamed from: k */
    public Drawable f3445k;

    /* renamed from: l */
    public boolean f3446l;

    /* renamed from: m */
    public boolean f3447m;

    /* renamed from: n */
    public boolean f3448n;

    /* renamed from: o */
    public int f3449o;

    /* renamed from: p */
    public int f3450p;

    /* renamed from: q */
    public int f3451q;

    /* renamed from: r */
    public boolean f3452r;

    /* renamed from: s */
    public int f3453s;

    /* renamed from: t */
    public final SparseBooleanArray f3454t = new SparseBooleanArray();

    /* renamed from: u */
    public C0910e f3455u;

    /* renamed from: v */
    public C0905a f3456v;

    /* renamed from: w */
    public C0907c f3457w;

    /* renamed from: x */
    public C0906b f3458x;

    /* renamed from: y */
    public final C0911f f3459y = new C0911f();

    /* renamed from: o1$a */
    public class C0905a extends C0401e1 {
        public C0905a(Context context, C0705k1 k1Var, View view) {
            super(context, k1Var, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!k1Var.f2946A.mo1482g()) {
                View view2 = C0904o1.this.f3444j;
                this.f1941f = view2 == null ? (View) C0904o1.this.f4537i : view2;
            }
            mo2677d(C0904o1.this.f3459y);
        }

        /* renamed from: c */
        public void mo2676c() {
            C0904o1 o1Var = C0904o1.this;
            o1Var.f3456v = null;
            o1Var.getClass();
            super.mo2676c();
        }
    }

    /* renamed from: o1$b */
    public class C0906b extends ActionMenuItemView.C0043b {
        public C0906b() {
        }
    }

    /* renamed from: o1$c */
    public class C0907c implements Runnable {

        /* renamed from: b */
        public C0910e f3462b;

        public C0907c(C0910e eVar) {
            this.f3462b = eVar;
        }

        public void run() {
            C1435z0.C1436a aVar;
            C1435z0 z0Var = C0904o1.this.f4532d;
            if (!(z0Var == null || (aVar = z0Var.f5229e) == null)) {
                aVar.mo307a(z0Var);
            }
            View view = (View) C0904o1.this.f4537i;
            if (!(view == null || view.getWindowToken() == null || !this.f3462b.mo2679f())) {
                C0904o1.this.f3455u = this.f3462b;
            }
            C0904o1.this.f3457w = null;
        }
    }

    /* renamed from: o1$d */
    public class C0908d extends AppCompatImageView implements ActionMenuView.C0050a {

        /* renamed from: o1$d$a */
        public class C0909a extends C1039r2 {
            public C0909a(View view, C0904o1 o1Var) {
                super(view);
            }

            /* renamed from: b */
            public C0597i1 mo163b() {
                C0910e eVar = C0904o1.this.f3455u;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo2674a();
            }

            /* renamed from: c */
            public boolean mo164c() {
                C0904o1.this.mo3825n();
                return true;
            }

            /* renamed from: d */
            public boolean mo3829d() {
                C0904o1 o1Var = C0904o1.this;
                if (o1Var.f3457w != null) {
                    return false;
                }
                o1Var.mo3822i();
                return true;
            }
        }

        public C0908d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0398e.m1527k(this, getContentDescription());
            setOnTouchListener(new C0909a(this, C0904o1.this));
        }

        /* renamed from: a */
        public boolean mo143a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo144b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0904o1.this.mo3825n();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C1344x5.m3740V(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: o1$e */
    public class C0910e extends C0401e1 {
        public C0910e(Context context, C1435z0 z0Var, View view, boolean z) {
            super(context, z0Var, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.f1942g = 8388613;
            mo2677d(C0904o1.this.f3459y);
        }

        /* renamed from: c */
        public void mo2676c() {
            C1435z0 z0Var = C0904o1.this.f4532d;
            if (z0Var != null) {
                z0Var.mo5236c(true);
            }
            C0904o1.this.f3455u = null;
            super.mo2676c();
        }
    }

    /* renamed from: o1$f */
    public class C0911f implements C0449f1.C0450a {
        public C0911f() {
        }

        /* renamed from: b */
        public void mo10b(C1435z0 z0Var, boolean z) {
            if (z0Var instanceof C0705k1) {
                z0Var.mo3482k().mo5236c(false);
            }
            C0449f1.C0450a aVar = C0904o1.this.f4534f;
            if (aVar != null) {
                aVar.mo10b(z0Var, z);
            }
        }

        /* renamed from: c */
        public boolean mo11c(C1435z0 z0Var) {
            C0904o1 o1Var = C0904o1.this;
            if (z0Var == o1Var.f4532d) {
                return false;
            }
            int i = ((C0705k1) z0Var).f2946A.f1181a;
            C0449f1.C0450a aVar = o1Var.f4534f;
            if (aVar != null) {
                return aVar.mo11c(z0Var);
            }
            return false;
        }
    }

    public C0904o1(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public boolean mo3820a() {
        return mo3822i() | mo3823l();
    }

    /* renamed from: b */
    public void mo589b(C1435z0 z0Var, boolean z) {
        mo3820a();
        C0449f1.C0450a aVar = this.f4534f;
        if (aVar != null) {
            aVar.mo10b(z0Var, z);
        }
    }

    /* renamed from: e */
    public View mo3821e(C0203b1 b1Var, View view, ViewGroup viewGroup) {
        C0504g1.C0505a aVar;
        View actionView = b1Var.getActionView();
        int i = 0;
        if (actionView == null || b1Var.mo1481f()) {
            if (view instanceof C0504g1.C0505a) {
                aVar = (C0504g1.C0505a) view;
            } else {
                aVar = (C0504g1.C0505a) this.f4533e.inflate(this.f4536h, viewGroup, false);
            }
            aVar.mo146d(b1Var, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f4537i);
            if (this.f3458x == null) {
                this.f3458x = new C0906b();
            }
            actionMenuItemView.setPopupCallback(this.f3458x);
            actionView = (View) aVar;
        }
        if (b1Var.f1179C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo293j(layoutParams));
        }
        return actionView;
    }

    /* renamed from: f */
    public boolean mo591f(C0705k1 k1Var) {
        boolean z = false;
        if (!k1Var.hasVisibleItems()) {
            return false;
        }
        C0705k1 k1Var2 = k1Var;
        while (true) {
            C1435z0 z0Var = k1Var2.f2947z;
            if (z0Var == this.f4532d) {
                break;
            }
            k1Var2 = z0Var;
        }
        C0203b1 b1Var = k1Var2.f2946A;
        ViewGroup viewGroup = (ViewGroup) this.f4537i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C0504g1.C0505a) && ((C0504g1.C0505a) childAt).getItemData() == b1Var) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        int i2 = k1Var.f2946A.f1181a;
        int size = k1Var.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = k1Var.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        C0905a aVar = new C0905a(this.f4531c, k1Var, view);
        this.f3456v = aVar;
        aVar.f1943h = z;
        C0361d1 d1Var = aVar.f1945j;
        if (d1Var != null) {
            d1Var.mo2625p(z);
        }
        if (this.f3456v.mo2679f()) {
            C0449f1.C0450a aVar2 = this.f4534f;
            if (aVar2 != null) {
                aVar2.mo11c(k1Var);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: g */
    public boolean mo592g() {
        int i;
        ArrayList<C0203b1> arrayList;
        int i2;
        boolean z;
        C1435z0 z0Var = this.f4532d;
        if (z0Var != null) {
            arrayList = z0Var.mo5247l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.f3451q;
        int i4 = this.f3450p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f4537i;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C0203b1 b1Var = arrayList.get(i5);
            int i8 = b1Var.f1205y;
            if ((i8 & 2) == 2) {
                i7++;
            } else {
                if ((i8 & 1) == 1) {
                    i6++;
                } else {
                    z2 = true;
                }
            }
            if (this.f3452r && b1Var.f1179C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3447m && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.f3454t;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0203b1 b1Var2 = arrayList.get(i10);
            int i12 = b1Var2.f1205y;
            if ((i12 & 2) == i2) {
                View e = mo3821e(b1Var2, (View) null, viewGroup);
                e.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = e.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = b1Var2.f1182b;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                b1Var2.mo1511k(z);
            } else {
                if ((i12 & true) == z) {
                    int i14 = b1Var2.f1182b;
                    boolean z3 = sparseBooleanArray.get(i14);
                    boolean z4 = (i9 > 0 || z3) && i4 > 0;
                    if (z4) {
                        View e2 = mo3821e(b1Var2, (View) null, viewGroup);
                        e2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = e2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        z4 &= i4 + i11 > 0;
                    }
                    if (z4 && i14 != 0) {
                        sparseBooleanArray.put(i14, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i14, false);
                        for (int i15 = 0; i15 < i10; i15++) {
                            C0203b1 b1Var3 = arrayList.get(i15);
                            if (b1Var3.f1182b == i14) {
                                if (b1Var3.mo1482g()) {
                                    i9++;
                                }
                                b1Var3.mo1511k(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    b1Var2.mo1511k(z4);
                } else {
                    b1Var2.mo1511k(false);
                    i10++;
                    i2 = 2;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return true;
    }

    /* renamed from: h */
    public void mo593h(boolean z) {
        C0504g1 g1Var;
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f4537i;
        ArrayList<C0203b1> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C1435z0 z0Var = this.f4532d;
            if (z0Var != null) {
                z0Var.mo5245i();
                ArrayList<C0203b1> l = this.f4532d.mo5247l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0203b1 b1Var = l.get(i2);
                    if (b1Var.mo1482g()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0203b1 itemData = childAt instanceof C0504g1.C0505a ? ((C0504g1.C0505a) childAt).getItemData() : null;
                        View e = mo3821e(b1Var, childAt, viewGroup);
                        if (b1Var != itemData) {
                            e.setPressed(false);
                            e.jumpDrawablesToCurrentState();
                        }
                        if (e != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) e.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(e);
                            }
                            ((ViewGroup) this.f4537i).addView(e, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f3444j) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f4537i).requestLayout();
        C1435z0 z0Var2 = this.f4532d;
        if (z0Var2 != null) {
            z0Var2.mo5245i();
            ArrayList<C0203b1> arrayList2 = z0Var2.f5233i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C0011a8 a8Var = arrayList2.get(i3).f1177A;
            }
        }
        C1435z0 z0Var3 = this.f4532d;
        if (z0Var3 != null) {
            z0Var3.mo5245i();
            arrayList = z0Var3.f5234j;
        }
        if (this.f3447m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f1179C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        C0908d dVar = this.f3444j;
        if (z3) {
            if (dVar == null) {
                this.f3444j = new C0908d(this.f4530b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f3444j.getParent();
            if (viewGroup3 != this.f4537i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f3444j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4537i;
                C0908d dVar2 = this.f3444j;
                ActionMenuView.C0052c q = actionMenuView.mo291h();
                q.f311c = true;
                actionMenuView.addView(dVar2, q);
            }
        } else if (dVar != null && dVar.getParent() == (g1Var = this.f4537i)) {
            ((ViewGroup) g1Var).removeView(this.f3444j);
        }
        ((ActionMenuView) this.f4537i).setOverflowReserved(this.f3447m);
    }

    /* renamed from: i */
    public boolean mo3822i() {
        C0504g1 g1Var;
        C0907c cVar = this.f3457w;
        if (cVar == null || (g1Var = this.f4537i) == null) {
            C0910e eVar = this.f3455u;
            if (eVar == null) {
                return false;
            }
            if (eVar.mo2675b()) {
                eVar.f1945j.dismiss();
            }
            return true;
        }
        ((View) g1Var).removeCallbacks(cVar);
        this.f3457w = null;
        return true;
    }

    /* renamed from: j */
    public void mo594j(Context context, C1435z0 z0Var) {
        this.f4531c = context;
        LayoutInflater.from(context);
        this.f4532d = z0Var;
        Resources resources = context.getResources();
        if (!this.f3448n) {
            boolean z = true;
            if (Build.VERSION.SDK_INT < 19) {
                z = true ^ ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            this.f3447m = z;
        }
        int i = 2;
        this.f3449o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f3451q = i;
        int i4 = this.f3449o;
        if (this.f3447m) {
            if (this.f3444j == null) {
                C0908d dVar = new C0908d(this.f4530b);
                this.f3444j = dVar;
                if (this.f3446l) {
                    dVar.setImageDrawable(this.f3445k);
                    this.f3445k = null;
                    this.f3446l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3444j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f3444j.getMeasuredWidth();
        } else {
            this.f3444j = null;
        }
        this.f3450p = i4;
        this.f3453s = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: l */
    public boolean mo3823l() {
        C0905a aVar = this.f3456v;
        if (aVar == null) {
            return false;
        }
        if (!aVar.mo2675b()) {
            return true;
        }
        aVar.f1945j.dismiss();
        return true;
    }

    /* renamed from: m */
    public boolean mo3824m() {
        C0910e eVar = this.f3455u;
        return eVar != null && eVar.mo2675b();
    }

    /* renamed from: n */
    public boolean mo3825n() {
        C1435z0 z0Var;
        if (!this.f3447m || mo3824m() || (z0Var = this.f4532d) == null || this.f4537i == null || this.f3457w != null) {
            return false;
        }
        z0Var.mo5245i();
        if (z0Var.f5234j.isEmpty()) {
            return false;
        }
        C0907c cVar = new C0907c(new C0910e(this.f4531c, this.f4532d, this.f3444j, true));
        this.f3457w = cVar;
        ((View) this.f4537i).post(cVar);
        return true;
    }
}
