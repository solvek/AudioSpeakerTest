package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: t0 */
public class C1138t0 implements C0409e7 {

    /* renamed from: a */
    public CharSequence f4330a;

    /* renamed from: b */
    public CharSequence f4331b;

    /* renamed from: c */
    public Intent f4332c;

    /* renamed from: d */
    public char f4333d;

    /* renamed from: e */
    public int f4334e = 4096;

    /* renamed from: f */
    public char f4335f;

    /* renamed from: g */
    public int f4336g = 4096;

    /* renamed from: h */
    public Drawable f4337h;

    /* renamed from: i */
    public Context f4338i;

    /* renamed from: j */
    public CharSequence f4339j;

    /* renamed from: k */
    public CharSequence f4340k;

    /* renamed from: l */
    public ColorStateList f4341l = null;

    /* renamed from: m */
    public PorterDuff.Mode f4342m = null;

    /* renamed from: n */
    public boolean f4343n = false;

    /* renamed from: o */
    public boolean f4344o = false;

    /* renamed from: p */
    public int f4345p = 16;

    public C1138t0(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.f4338i = context;
        this.f4330a = charSequence;
    }

    /* renamed from: a */
    public C0011a8 mo1475a() {
        return null;
    }

    /* renamed from: b */
    public C0409e7 mo1476b(C0011a8 a8Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo4561c() {
        Drawable drawable = this.f4337h;
        if (drawable == null) {
            return;
        }
        if (this.f4343n || this.f4344o) {
            Drawable j0 = C1344x5.m3764j0(drawable);
            this.f4337h = j0;
            Drawable mutate = j0.mutate();
            this.f4337h = mutate;
            if (this.f4343n) {
                C1344x5.m3752d0(mutate, this.f4341l);
            }
            if (this.f4344o) {
                C1344x5.m3754e0(this.f4337h, this.f4342m);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f4336g;
    }

    public char getAlphabeticShortcut() {
        return this.f4335f;
    }

    public CharSequence getContentDescription() {
        return this.f4339j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.f4337h;
    }

    public ColorStateList getIconTintList() {
        return this.f4341l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4342m;
    }

    public Intent getIntent() {
        return this.f4332c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f4334e;
    }

    public char getNumericShortcut() {
        return this.f4333d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f4330a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4331b;
        return charSequence != null ? charSequence : this.f4330a;
    }

    public CharSequence getTooltipText() {
        return this.f4340k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f4345p & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f4345p & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f4345p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f4345p & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f4335f = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4335f = Character.toLowerCase(c);
        this.f4336g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f4345p = z | (this.f4345p & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f4345p = (z ? 2 : 0) | (this.f4345p & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f4339j = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public C0409e7 m3999setContentDescription(CharSequence charSequence) {
        this.f4339j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f4345p = (z ? 16 : 0) | (this.f4345p & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f4337h = C0408e6.m1548b(this.f4338i, i);
        mo4561c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f4337h = drawable;
        mo4561c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4341l = colorStateList;
        this.f4343n = true;
        mo4561c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4342m = mode;
        this.f4344o = true;
        mo4561c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f4332c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f4333d = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f4333d = c;
        this.f4334e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f4333d = c;
        this.f4335f = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4333d = c;
        this.f4334e = KeyEvent.normalizeMetaState(i);
        this.f4335f = Character.toLowerCase(c2);
        this.f4336g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f4330a = this.f4338i.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f4330a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4331b = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f4340k = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public C0409e7 m4000setTooltipText(CharSequence charSequence) {
        this.f4340k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f4345p & 8;
        if (z) {
            i = 0;
        }
        this.f4345p = i2 | i;
        return this;
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
