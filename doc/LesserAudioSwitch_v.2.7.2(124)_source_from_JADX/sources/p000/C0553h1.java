package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: h1 */
public class C0553h1 extends C1230v0 implements Menu {

    /* renamed from: d */
    public final C0367d7 f2421d;

    public C0553h1(Context context, C0367d7 d7Var) {
        super(context);
        if (d7Var != null) {
            this.f2421d = d7Var;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo4800c(this.f2421d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo4800c(this.f2421d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo4800c(this.f2421d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo4800c(this.f2421d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f2421d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo4800c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo4801d(this.f2421d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo4801d(this.f2421d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo4801d(this.f2421d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo4801d(this.f2421d.addSubMenu(charSequence));
    }

    public void clear() {
        C0663j4<C0409e7, MenuItem> j4Var = this.f4692b;
        if (j4Var != null) {
            j4Var.clear();
        }
        C0663j4<C0456f7, SubMenu> j4Var2 = this.f4693c;
        if (j4Var2 != null) {
            j4Var2.clear();
        }
        this.f2421d.clear();
    }

    public void close() {
        this.f2421d.close();
    }

    public MenuItem findItem(int i) {
        return mo4800c(this.f2421d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo4800c(this.f2421d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f2421d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f2421d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f2421d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f2421d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        if (this.f4692b != null) {
            int i2 = 0;
            while (true) {
                C0663j4<C0409e7, MenuItem> j4Var = this.f4692b;
                if (i2 >= j4Var.f2827d) {
                    break;
                }
                if (j4Var.mo3402h(i2).getGroupId() == i) {
                    this.f4692b.mo3404i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f2421d.removeGroup(i);
    }

    public void removeItem(int i) {
        if (this.f4692b != null) {
            int i2 = 0;
            while (true) {
                C0663j4<C0409e7, MenuItem> j4Var = this.f4692b;
                if (i2 >= j4Var.f2827d) {
                    break;
                } else if (j4Var.mo3402h(i2).getItemId() == i) {
                    this.f4692b.mo3404i(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f2421d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f2421d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f2421d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f2421d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f2421d.setQwertyMode(z);
    }

    public int size() {
        return this.f2421d.size();
    }
}
