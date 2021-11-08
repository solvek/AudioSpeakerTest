package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import p000.C0504g1;
import p000.C0904o1;
import p000.C1435z0;

public class ActionMenuItemView extends C0660j2 implements C0504g1.C0505a, View.OnClickListener, ActionMenuView.C0050a {

    /* renamed from: f */
    public C0203b1 f211f;

    /* renamed from: g */
    public CharSequence f212g;

    /* renamed from: h */
    public Drawable f213h;

    /* renamed from: i */
    public C1435z0.C1437b f214i;

    /* renamed from: j */
    public C1039r2 f215j;

    /* renamed from: k */
    public C0043b f216k;

    /* renamed from: l */
    public boolean f217l = mo147e();

    /* renamed from: m */
    public boolean f218m;

    /* renamed from: n */
    public int f219n;

    /* renamed from: o */
    public int f220o;

    /* renamed from: p */
    public int f221p;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0042a extends C1039r2 {
        public C0042a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0597i1 mo163b() {
            C0904o1.C0905a aVar;
            C0043b bVar = ActionMenuItemView.this.f216k;
            if (bVar == null || (aVar = C0904o1.this.f3456v) == null) {
                return null;
            }
            return aVar.mo2674a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo163b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo164c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                z0$b r1 = r0.f214i
                r2 = 0
                if (r1 == 0) goto L_0x001c
                b1 r0 = r0.f211f
                boolean r0 = r1.mo165b(r0)
                if (r0 == 0) goto L_0x001c
                i1 r0 = r3.mo163b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo3108a()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0042a.mo164c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0043b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0440f.f2049c, 0, 0);
        this.f219n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f221p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f220o = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public boolean mo143a() {
        return mo145c() && this.f211f.getIcon() == null;
    }

    /* renamed from: b */
    public boolean mo144b() {
        return mo145c();
    }

    /* renamed from: c */
    public boolean mo145c() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: d */
    public void mo146d(C0203b1 b1Var, int i) {
        this.f211f = b1Var;
        setIcon(b1Var.getIcon());
        setTitle(b1Var.getTitleCondensed());
        setId(b1Var.f1181a);
        setVisibility(b1Var.isVisible() ? 0 : 8);
        setEnabled(b1Var.isEnabled());
        if (b1Var.hasSubMenu() && this.f215j == null) {
            this.f215j = new C0042a();
        }
    }

    /* renamed from: e */
    public final boolean mo147e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    public final void mo148f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f212g);
        if (this.f213h != null) {
            if (!((this.f211f.f1205y & 4) == 4) || (!this.f217l && !this.f218m)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f212g : null);
        CharSequence charSequence2 = this.f211f.f1197q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f211f.f1185e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f211f.f1198r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f211f.f1185e;
            }
            C0398e.m1527k(this, charSequence);
            return;
        }
        C0398e.m1527k(this, charSequence3);
    }

    public C0203b1 getItemData() {
        return this.f211f;
    }

    public void onClick(View view) {
        C1435z0.C1437b bVar = this.f214i;
        if (bVar != null) {
            bVar.mo165b(this.f211f);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f217l = mo147e();
        mo148f();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean c = mo145c();
        if (c && (i3 = this.f220o) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f219n) : this.f219n;
        if (mode != 1073741824 && this.f219n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!c && this.f213h != null) {
            super.setPadding((getMeasuredWidth() - this.f213h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1039r2 r2Var;
        if (!this.f211f.hasSubMenu() || (r2Var = this.f215j) == null || !r2Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f218m != z) {
            this.f218m = z;
            C0203b1 b1Var = this.f211f;
            if (b1Var != null) {
                b1Var.f1194n.mo5248p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f213h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f221p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo148f();
    }

    public void setItemInvoker(C1435z0.C1437b bVar) {
        this.f214i = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f220o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0043b bVar) {
        this.f216k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f212g = charSequence;
        mo148f();
    }
}
