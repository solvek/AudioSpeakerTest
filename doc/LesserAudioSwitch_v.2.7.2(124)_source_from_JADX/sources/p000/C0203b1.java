package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import p000.C0011a8;

/* renamed from: b1 */
public final class C0203b1 implements C0409e7 {

    /* renamed from: A */
    public C0011a8 f1177A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f1178B;

    /* renamed from: C */
    public boolean f1179C = false;

    /* renamed from: D */
    public ContextMenu.ContextMenuInfo f1180D;

    /* renamed from: a */
    public final int f1181a;

    /* renamed from: b */
    public final int f1182b;

    /* renamed from: c */
    public final int f1183c;

    /* renamed from: d */
    public final int f1184d;

    /* renamed from: e */
    public CharSequence f1185e;

    /* renamed from: f */
    public CharSequence f1186f;

    /* renamed from: g */
    public Intent f1187g;

    /* renamed from: h */
    public char f1188h;

    /* renamed from: i */
    public int f1189i = 4096;

    /* renamed from: j */
    public char f1190j;

    /* renamed from: k */
    public int f1191k = 4096;

    /* renamed from: l */
    public Drawable f1192l;

    /* renamed from: m */
    public int f1193m = 0;

    /* renamed from: n */
    public C1435z0 f1194n;

    /* renamed from: o */
    public C0705k1 f1195o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f1196p;

    /* renamed from: q */
    public CharSequence f1197q;

    /* renamed from: r */
    public CharSequence f1198r;

    /* renamed from: s */
    public ColorStateList f1199s = null;

    /* renamed from: t */
    public PorterDuff.Mode f1200t = null;

    /* renamed from: u */
    public boolean f1201u = false;

    /* renamed from: v */
    public boolean f1202v = false;

    /* renamed from: w */
    public boolean f1203w = false;

    /* renamed from: x */
    public int f1204x = 16;

    /* renamed from: y */
    public int f1205y = 0;

    /* renamed from: z */
    public View f1206z;

    /* renamed from: b1$a */
    public class C0204a implements C0011a8.C0012a {
        public C0204a() {
        }
    }

    public C0203b1(C1435z0 z0Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1194n = z0Var;
        this.f1181a = i2;
        this.f1182b = i;
        this.f1183c = i3;
        this.f1184d = i4;
        this.f1185e = charSequence;
        this.f1205y = i5;
    }

    /* renamed from: c */
    public static void m972c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C0011a8 mo1475a() {
        return this.f1177A;
    }

    /* renamed from: b */
    public C0409e7 mo1476b(C0011a8 a8Var) {
        C0011a8 a8Var2 = this.f1177A;
        if (a8Var2 != null) {
            a8Var2.f54a = null;
        }
        this.f1206z = null;
        this.f1177A = a8Var;
        this.f1194n.mo5251q(true);
        C0011a8 a8Var3 = this.f1177A;
        if (a8Var3 != null) {
            a8Var3.mo90h(new C0204a());
        }
        return this;
    }

    public boolean collapseActionView() {
        if ((this.f1205y & 8) == 0) {
            return false;
        }
        if (this.f1206z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1178B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1194n.mo3477d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable mo1478d(Drawable drawable) {
        if (drawable != null && this.f1203w && (this.f1201u || this.f1202v)) {
            drawable = C1344x5.m3764j0(drawable).mutate();
            if (this.f1201u) {
                C1344x5.m3752d0(drawable, this.f1199s);
            }
            if (this.f1202v) {
                C1344x5.m3754e0(drawable, this.f1200t);
            }
            this.f1203w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public char mo1479e() {
        return this.f1194n.mo3484n() ? this.f1190j : this.f1188h;
    }

    public boolean expandActionView() {
        if (!mo1481f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1178B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1194n.mo3479f(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo1481f() {
        C0011a8 a8Var;
        if ((this.f1205y & 8) == 0) {
            return false;
        }
        if (this.f1206z == null && (a8Var = this.f1177A) != null) {
            this.f1206z = a8Var.mo86d(this);
        }
        return this.f1206z != null;
    }

    /* renamed from: g */
    public boolean mo1482g() {
        return (this.f1204x & 32) == 32;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1206z;
        if (view != null) {
            return view;
        }
        C0011a8 a8Var = this.f1177A;
        if (a8Var == null) {
            return null;
        }
        View d = a8Var.mo86d(this);
        this.f1206z = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f1191k;
    }

    public char getAlphabeticShortcut() {
        return this.f1190j;
    }

    public CharSequence getContentDescription() {
        return this.f1197q;
    }

    public int getGroupId() {
        return this.f1182b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1192l;
        if (drawable != null) {
            return mo1478d(drawable);
        }
        int i = this.f1193m;
        if (i == 0) {
            return null;
        }
        Drawable b = C0399e0.m1530b(this.f1194n.f5225a, i);
        this.f1193m = 0;
        this.f1192l = b;
        return mo1478d(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1199s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1200t;
    }

    public Intent getIntent() {
        return this.f1187g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1181a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1180D;
    }

    public int getNumericModifiers() {
        return this.f1189i;
    }

    public char getNumericShortcut() {
        return this.f1188h;
    }

    public int getOrder() {
        return this.f1183c;
    }

    public SubMenu getSubMenu() {
        return this.f1195o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1185e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1186f;
        if (charSequence == null) {
            charSequence = this.f1185e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1198r;
    }

    /* renamed from: h */
    public boolean mo1502h() {
        return (this.f1204x & 4) != 0;
    }

    public boolean hasSubMenu() {
        return this.f1195o != null;
    }

    /* renamed from: i */
    public C0409e7 mo1504i(View view) {
        int i;
        this.f1206z = view;
        this.f1177A = null;
        if (view != null && view.getId() == -1 && (i = this.f1181a) > 0) {
            view.setId(i);
        }
        this.f1194n.mo5248p();
        return this;
    }

    public boolean isActionViewExpanded() {
        return this.f1179C;
    }

    public boolean isCheckable() {
        return (this.f1204x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1204x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1204x & 16) != 0;
    }

    public boolean isVisible() {
        C0011a8 a8Var = this.f1177A;
        return (a8Var == null || !a8Var.mo89g()) ? (this.f1204x & 8) == 0 : (this.f1204x & 8) == 0 && this.f1177A.mo84b();
    }

    /* renamed from: j */
    public void mo1510j(boolean z) {
        int i = this.f1204x;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f1204x = i2;
        if (i != i2) {
            this.f1194n.mo5251q(false);
        }
    }

    /* renamed from: k */
    public void mo1511k(boolean z) {
        this.f1204x = z ? this.f1204x | 32 : this.f1204x & -33;
    }

    /* renamed from: l */
    public boolean mo1512l(boolean z) {
        int i = this.f1204x;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f1204x = i2;
        return i != i2;
    }

    /* renamed from: m */
    public boolean mo1513m() {
        return this.f1194n.mo3485o() && mo1479e() != 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setActionView(int i) {
        Context context = this.f1194n.f5225a;
        mo1504i(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo1504i(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1190j == c) {
            return this;
        }
        this.f1190j = Character.toLowerCase(c);
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1190j == c && this.f1191k == i) {
            return this;
        }
        this.f1190j = Character.toLowerCase(c);
        this.f1191k = KeyEvent.normalizeMetaState(i);
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1204x;
        boolean z2 = z | (i & true);
        this.f1204x = z2 ? 1 : 0;
        if (i != z2) {
            this.f1194n.mo5251q(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1204x & 4) != 0) {
            C1435z0 z0Var = this.f1194n;
            z0Var.getClass();
            int groupId = getGroupId();
            int size = z0Var.f5230f.size();
            z0Var.mo5266z();
            for (int i = 0; i < size; i++) {
                C0203b1 b1Var = z0Var.f5230f.get(i);
                if (b1Var.f1182b == groupId && b1Var.mo1502h() && b1Var.isCheckable()) {
                    b1Var.mo1510j(b1Var == this);
                }
            }
            z0Var.mo5265y();
        } else {
            mo1510j(z);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1197q = charSequence;
        this.f1194n.mo5251q(false);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public C0409e7 m3995setContentDescription(CharSequence charSequence) {
        this.f1197q = charSequence;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1204x = z ? this.f1204x | 16 : this.f1204x & -17;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1192l = null;
        this.f1193m = i;
        this.f1203w = true;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1193m = 0;
        this.f1192l = drawable;
        this.f1203w = true;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1199s = colorStateList;
        this.f1201u = true;
        this.f1203w = true;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1200t = mode;
        this.f1202v = true;
        this.f1203w = true;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1187g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1188h == c) {
            return this;
        }
        this.f1188h = c;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1188h == c && this.f1189i == i) {
            return this;
        }
        this.f1188h = c;
        this.f1189i = KeyEvent.normalizeMetaState(i);
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1178B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1196p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1188h = c;
        this.f1190j = Character.toLowerCase(c2);
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1188h = c;
        this.f1189i = KeyEvent.normalizeMetaState(i);
        this.f1190j = Character.toLowerCase(c2);
        this.f1191k = KeyEvent.normalizeMetaState(i2);
        this.f1194n.mo5251q(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1205y = i;
            this.f1194n.mo5248p();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f1194n.f5225a.getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1185e = charSequence;
        this.f1194n.mo5251q(false);
        C0705k1 k1Var = this.f1195o;
        if (k1Var != null) {
            k1Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1186f = charSequence;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1198r = charSequence;
        this.f1194n.mo5251q(false);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public C0409e7 m3996setTooltipText(CharSequence charSequence) {
        this.f1198r = charSequence;
        this.f1194n.mo5251q(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1512l(z)) {
            C1435z0 z0Var = this.f1194n;
            z0Var.f5232h = true;
            z0Var.mo5251q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1185e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
