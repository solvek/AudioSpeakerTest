package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000.C0011a8;

/* renamed from: c1 */
public class C0246c1 extends C1230v0 implements MenuItem {

    /* renamed from: d */
    public final C0409e7 f1319d;

    /* renamed from: e */
    public Method f1320e;

    /* renamed from: c1$a */
    public class C0247a extends C0011a8 {

        /* renamed from: b */
        public final ActionProvider f1321b;

        public C0247a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1321b = actionProvider;
        }

        /* renamed from: a */
        public boolean mo83a() {
            return this.f1321b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo85c() {
            return this.f1321b.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo87e() {
            return this.f1321b.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo88f(SubMenu subMenu) {
            this.f1321b.onPrepareSubMenu(C0246c1.this.mo4801d(subMenu));
        }
    }

    /* renamed from: c1$b */
    public class C0248b extends C0247a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public C0011a8.C0012a f1323d;

        public C0248b(C0246c1 c1Var, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo84b() {
            return this.f1321b.isVisible();
        }

        /* renamed from: d */
        public View mo86d(MenuItem menuItem) {
            return this.f1321b.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo89g() {
            return this.f1321b.overridesItemVisibility();
        }

        /* renamed from: h */
        public void mo90h(C0011a8.C0012a aVar) {
            this.f1323d = aVar;
            this.f1321b.setVisibilityListener(this);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0011a8.C0012a aVar = this.f1323d;
            if (aVar != null) {
                C1435z0 z0Var = C0203b1.this.f1194n;
                z0Var.f5232h = true;
                z0Var.mo5251q(true);
            }
        }
    }

    /* renamed from: c1$c */
    public static class C0249c extends FrameLayout implements C0799m0 {

        /* renamed from: b */
        public final CollapsibleActionView f1324b;

        public C0249c(View view) {
            super(view.getContext());
            this.f1324b = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo360a() {
            this.f1324b.onActionViewExpanded();
        }

        /* renamed from: e */
        public void mo362e() {
            this.f1324b.onActionViewCollapsed();
        }
    }

    /* renamed from: c1$d */
    public class C0250d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f1325a;

        public C0250d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1325a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1325a.onMenuItemActionCollapse(C0246c1.this.mo4800c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1325a.onMenuItemActionExpand(C0246c1.this.mo4800c(menuItem));
        }
    }

    /* renamed from: c1$e */
    public class C0251e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final MenuItem.OnMenuItemClickListener f1327b;

        public C0251e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1327b = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1327b.onMenuItemClick(C0246c1.this.mo4800c(menuItem));
        }
    }

    public C0246c1(Context context, C0409e7 e7Var) {
        super(context);
        if (e7Var != null) {
            this.f1319d = e7Var;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1319d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1319d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0011a8 a = this.f1319d.mo1475a();
        if (a instanceof C0247a) {
            return ((C0247a) a).f1321b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1319d.getActionView();
        return actionView instanceof C0249c ? (View) ((C0249c) actionView).f1324b : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1319d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1319d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1319d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1319d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1319d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1319d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1319d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1319d.getIntent();
    }

    public int getItemId() {
        return this.f1319d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1319d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1319d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1319d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1319d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo4801d(this.f1319d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1319d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1319d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1319d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f1319d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1319d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1319d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1319d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1319d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1319d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0011a8 bVar = Build.VERSION.SDK_INT >= 16 ? new C0248b(this, this.f4691a, actionProvider) : new C0247a(this.f4691a, actionProvider);
        C0409e7 e7Var = this.f1319d;
        if (actionProvider == null) {
            bVar = null;
        }
        e7Var.mo1476b(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1319d.setActionView(i);
        View actionView = this.f1319d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1319d.setActionView((View) new C0249c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0249c(view);
        }
        this.f1319d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1319d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1319d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1319d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1319d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1319d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1319d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1319d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1319d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1319d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1319d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1319d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1319d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1319d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1319d.setOnActionExpandListener(onActionExpandListener != null ? new C0250d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1319d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0251e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1319d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1319d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1319d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1319d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1319d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1319d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1319d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1319d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1319d.setVisible(z);
    }
}
