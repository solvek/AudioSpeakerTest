package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: z0 */
public class C1435z0 implements C0367d7 {

    /* renamed from: y */
    public static final int[] f5224y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f5225a;

    /* renamed from: b */
    public final Resources f5226b;

    /* renamed from: c */
    public boolean f5227c;

    /* renamed from: d */
    public boolean f5228d;

    /* renamed from: e */
    public C1436a f5229e;

    /* renamed from: f */
    public ArrayList<C0203b1> f5230f;

    /* renamed from: g */
    public ArrayList<C0203b1> f5231g;

    /* renamed from: h */
    public boolean f5232h;

    /* renamed from: i */
    public ArrayList<C0203b1> f5233i;

    /* renamed from: j */
    public ArrayList<C0203b1> f5234j;

    /* renamed from: k */
    public boolean f5235k;

    /* renamed from: l */
    public int f5236l = 0;

    /* renamed from: m */
    public CharSequence f5237m;

    /* renamed from: n */
    public Drawable f5238n;

    /* renamed from: o */
    public View f5239o;

    /* renamed from: p */
    public boolean f5240p = false;

    /* renamed from: q */
    public boolean f5241q = false;

    /* renamed from: r */
    public boolean f5242r = false;

    /* renamed from: s */
    public boolean f5243s = false;

    /* renamed from: t */
    public ArrayList<C0203b1> f5244t = new ArrayList<>();

    /* renamed from: u */
    public CopyOnWriteArrayList<WeakReference<C0449f1>> f5245u = new CopyOnWriteArrayList<>();

    /* renamed from: v */
    public C0203b1 f5246v;

    /* renamed from: w */
    public boolean f5247w = false;

    /* renamed from: x */
    public boolean f5248x;

    /* renamed from: z0$a */
    public interface C1436a {
        /* renamed from: a */
        void mo307a(C1435z0 z0Var);

        /* renamed from: b */
        boolean mo308b(C1435z0 z0Var, MenuItem menuItem);
    }

    /* renamed from: z0$b */
    public interface C1437b {
        /* renamed from: b */
        boolean mo165b(C0203b1 b1Var);
    }

    public C1435z0(Context context) {
        boolean z;
        boolean z2 = false;
        this.f5225a = context;
        Resources resources = context.getResources();
        this.f5226b = resources;
        this.f5230f = new ArrayList<>();
        this.f5231g = new ArrayList<>();
        this.f5232h = true;
        this.f5233i = new ArrayList<>();
        this.f5234j = new ArrayList<>();
        this.f5235k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C1007q8.f3781a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f5228d = z2;
    }

    /* renamed from: a */
    public MenuItem mo5225a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f5224y;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C0203b1 b1Var = new C0203b1(this, i, i2, i3, i6, charSequence, this.f5236l);
                ArrayList<C0203b1> arrayList = this.f5230f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f1184d <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, b1Var);
                mo5251q(true);
                return b1Var;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public MenuItem add(int i) {
        return mo5225a(0, 0, 0, this.f5226b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo5225a(i, i2, i3, this.f5226b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo5225a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo5225a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f5225a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.mo5225a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            b1 r4 = (p000.C0203b1) r4
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.setIntent(r3)
            if (r15 == 0) goto L_0x005b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x005b
            r15[r14] = r4
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1435z0.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f5226b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f5226b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0203b1 b1Var = (C0203b1) mo5225a(i, i2, i3, charSequence);
        C0705k1 k1Var = new C0705k1(this.f5225a, this, b1Var);
        b1Var.f1195o = k1Var;
        k1Var.setHeaderTitle(b1Var.f1185e);
        return k1Var;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo5235b(C0449f1 f1Var, Context context) {
        this.f5245u.add(new WeakReference(f1Var));
        f1Var.mo594j(context, this);
        this.f5235k = true;
    }

    /* renamed from: c */
    public final void mo5236c(boolean z) {
        if (!this.f5243s) {
            this.f5243s = true;
            Iterator<WeakReference<C0449f1>> it = this.f5245u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0449f1 f1Var = (C0449f1) next.get();
                if (f1Var == null) {
                    this.f5245u.remove(next);
                } else {
                    f1Var.mo589b(this, z);
                }
            }
            this.f5243s = false;
        }
    }

    public void clear() {
        C0203b1 b1Var = this.f5246v;
        if (b1Var != null) {
            mo3477d(b1Var);
        }
        this.f5230f.clear();
        mo5251q(true);
    }

    public void clearHeader() {
        this.f5238n = null;
        this.f5237m = null;
        this.f5239o = null;
        mo5251q(false);
    }

    public void close() {
        mo5236c(true);
    }

    /* renamed from: d */
    public boolean mo3477d(C0203b1 b1Var) {
        boolean z = false;
        if (!this.f5245u.isEmpty() && this.f5246v == b1Var) {
            mo5266z();
            Iterator<WeakReference<C0449f1>> it = this.f5245u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0449f1 f1Var = (C0449f1) next.get();
                if (f1Var == null) {
                    this.f5245u.remove(next);
                } else {
                    z = f1Var.mo595k(this, b1Var);
                    if (z) {
                        break;
                    }
                }
            }
            mo5265y();
            if (z) {
                this.f5246v = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo3478e(C1435z0 z0Var, MenuItem menuItem) {
        C1436a aVar = this.f5229e;
        return aVar != null && aVar.mo308b(z0Var, menuItem);
    }

    /* renamed from: f */
    public boolean mo3479f(C0203b1 b1Var) {
        boolean z = false;
        if (this.f5245u.isEmpty()) {
            return false;
        }
        mo5266z();
        Iterator<WeakReference<C0449f1>> it = this.f5245u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0449f1 f1Var = (C0449f1) next.get();
            if (f1Var == null) {
                this.f5245u.remove(next);
            } else {
                z = f1Var.mo590c(this, b1Var);
                if (z) {
                    break;
                }
            }
        }
        mo5265y();
        if (z) {
            this.f5246v = b1Var;
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0203b1 b1Var = this.f5230f.get(i2);
            if (b1Var.f1181a == i) {
                return b1Var;
            }
            if (b1Var.hasSubMenu() && (findItem = b1Var.f1195o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public C0203b1 mo5241g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0203b1> arrayList = this.f5244t;
        arrayList.clear();
        mo5243h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = mo3484n();
        for (int i2 = 0; i2 < size; i2++) {
            C0203b1 b1Var = arrayList.get(i2);
            if (n) {
                c = b1Var.f1190j;
            } else {
                c = b1Var.f1188h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == 8 && i == 67))) {
                return b1Var;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f5230f.get(i);
    }

    /* renamed from: h */
    public void mo5243h(List<C0203b1> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean n = mo3484n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f5230f.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0203b1 b1Var = this.f5230f.get(i3);
                if (b1Var.hasSubMenu()) {
                    b1Var.f1195o.mo5243h(list, i, keyEvent);
                }
                if (n) {
                    c = b1Var.f1190j;
                } else {
                    c = b1Var.f1188h;
                }
                if (n) {
                    i2 = b1Var.f1191k;
                } else {
                    i2 = b1Var.f1189i;
                }
                if (((modifiers & 69647) == (i2 & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == 8 && i == 67)) && b1Var.isEnabled()) {
                        list.add(b1Var);
                    }
                }
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f5248x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f5230f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo5245i() {
        ArrayList<C0203b1> l = mo5247l();
        if (this.f5235k) {
            Iterator<WeakReference<C0449f1>> it = this.f5245u.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0449f1 f1Var = (C0449f1) next.get();
                if (f1Var == null) {
                    this.f5245u.remove(next);
                } else {
                    z |= f1Var.mo592g();
                }
            }
            if (z) {
                this.f5233i.clear();
                this.f5234j.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    C0203b1 b1Var = l.get(i);
                    (b1Var.mo1482g() ? this.f5233i : this.f5234j).add(b1Var);
                }
            } else {
                this.f5233i.clear();
                this.f5234j.clear();
                this.f5234j.addAll(mo5247l());
            }
            this.f5235k = false;
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo5241g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo3481j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C1435z0 mo3482k() {
        return this;
    }

    /* renamed from: l */
    public ArrayList<C0203b1> mo5247l() {
        if (!this.f5232h) {
            return this.f5231g;
        }
        this.f5231g.clear();
        int size = this.f5230f.size();
        for (int i = 0; i < size; i++) {
            C0203b1 b1Var = this.f5230f.get(i);
            if (b1Var.isVisible()) {
                this.f5231g.add(b1Var);
            }
        }
        this.f5232h = false;
        this.f5235k = true;
        return this.f5231g;
    }

    /* renamed from: m */
    public boolean mo3483m() {
        return this.f5247w;
    }

    /* renamed from: n */
    public boolean mo3484n() {
        return this.f5227c;
    }

    /* renamed from: o */
    public boolean mo3485o() {
        return this.f5228d;
    }

    /* renamed from: p */
    public void mo5248p() {
        this.f5235k = true;
        mo5251q(true);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo5252r(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0203b1 g = mo5241g(i, keyEvent);
        boolean s = g != null ? mo5255s(g, (C0449f1) null, i2) : false;
        if ((i2 & 2) != 0) {
            mo5236c(true);
        }
        return s;
    }

    /* renamed from: q */
    public void mo5251q(boolean z) {
        if (!this.f5240p) {
            if (z) {
                this.f5232h = true;
                this.f5235k = true;
            }
            if (!this.f5245u.isEmpty()) {
                mo5266z();
                Iterator<WeakReference<C0449f1>> it = this.f5245u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    C0449f1 f1Var = (C0449f1) next.get();
                    if (f1Var == null) {
                        this.f5245u.remove(next);
                    } else {
                        f1Var.mo593h(z);
                    }
                }
                mo5265y();
                return;
            }
            return;
        }
        this.f5241q = true;
        if (z) {
            this.f5242r = true;
        }
    }

    /* renamed from: r */
    public boolean mo5252r(MenuItem menuItem, int i) {
        return mo5255s(menuItem, (C0449f1) null, i);
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f5230f.get(i2).f1182b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f5230f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f5230f.get(i2).f1182b != i) {
                    mo5251q(true);
                } else {
                    mo5260t(i2, false);
                    i3 = i4;
                }
            }
            mo5251q(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f5230f.get(i2).f1181a == i) {
                break;
            } else {
                i2++;
            }
        }
        mo5260t(i2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if (r1 != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        if ((r9 & 1) == 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bf, code lost:
        if (r1 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0058  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5255s(android.view.MenuItem r7, p000.C0449f1 r8, int r9) {
        /*
            r6 = this;
            b1 r7 = (p000.C0203b1) r7
            r0 = 0
            if (r7 == 0) goto L_0x00c5
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00c5
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f1196p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0039
        L_0x0019:
            z0 r1 = r7.f1194n
            boolean r1 = r1.mo3478e(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0039
        L_0x0022:
            android.content.Intent r1 = r7.f1187g
            if (r1 == 0) goto L_0x002f
            z0 r3 = r7.f1194n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f5225a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0039
        L_0x002e:
        L_0x002f:
            a8 r1 = r7.f1177A
            if (r1 == 0) goto L_0x003b
            boolean r1 = r1.mo87e()
            if (r1 == 0) goto L_0x003b
        L_0x0039:
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            a8 r3 = r7.f1177A
            if (r3 == 0) goto L_0x0048
            boolean r4 = r3.mo83a()
            if (r4 == 0) goto L_0x0048
            r4 = 1
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            boolean r5 = r7.mo1481f()
            if (r5 == 0) goto L_0x0058
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00c4
            goto L_0x00c1
        L_0x0058:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0066
            if (r4 == 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00c4
            goto L_0x00c1
        L_0x0066:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x006d
            r6.mo5236c(r0)
        L_0x006d:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0081
            k1 r9 = new k1
            android.content.Context r5 = r6.f5225a
            r9.<init>(r5, r6, r7)
            r7.f1195o = r9
            java.lang.CharSequence r5 = r7.f1185e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0081:
            k1 r7 = r7.f1195o
            if (r4 == 0) goto L_0x0088
            r3.mo88f(r7)
        L_0x0088:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<f1>> r9 = r6.f5245u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0091
            goto L_0x00be
        L_0x0091:
            if (r8 == 0) goto L_0x0097
            boolean r0 = r8.mo591f(r7)
        L_0x0097:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<f1>> r8 = r6.f5245u
            java.util.Iterator r8 = r8.iterator()
        L_0x009d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00be
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            f1 r3 = (p000.C0449f1) r3
            if (r3 != 0) goto L_0x00b7
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<f1>> r3 = r6.f5245u
            r3.remove(r9)
            goto L_0x009d
        L_0x00b7:
            if (r0 != 0) goto L_0x009d
            boolean r0 = r3.mo591f(r7)
            goto L_0x009d
        L_0x00be:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00c4
        L_0x00c1:
            r6.mo5236c(r2)
        L_0x00c4:
            return r1
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1435z0.mo5255s(android.view.MenuItem, f1, int):boolean");
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f5230f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0203b1 b1Var = this.f5230f.get(i2);
            if (b1Var.f1182b == i) {
                b1Var.f1204x = (b1Var.f1204x & -5) | (z2 ? 4 : 0);
                b1Var.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f5247w = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f5230f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0203b1 b1Var = this.f5230f.get(i2);
            if (b1Var.f1182b == i) {
                b1Var.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f5230f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0203b1 b1Var = this.f5230f.get(i2);
            if (b1Var.f1182b == i && b1Var.mo1512l(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo5251q(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f5227c = z;
        mo5251q(false);
    }

    public int size() {
        return this.f5230f.size();
    }

    /* renamed from: t */
    public final void mo5260t(int i, boolean z) {
        if (i >= 0 && i < this.f5230f.size()) {
            this.f5230f.remove(i);
            if (z) {
                mo5251q(true);
            }
        }
    }

    /* renamed from: u */
    public void mo5261u(C0449f1 f1Var) {
        Iterator<WeakReference<C0449f1>> it = this.f5245u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0449f1 f1Var2 = (C0449f1) next.get();
            if (f1Var2 == null || f1Var2 == f1Var) {
                this.f5245u.remove(next);
            }
        }
    }

    /* renamed from: v */
    public void mo5262v(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo3481j());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0705k1) item.getSubMenu()).mo5262v(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: w */
    public void mo5263w(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0705k1) item.getSubMenu()).mo5263w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3481j(), sparseArray);
        }
    }

    /* renamed from: x */
    public final void mo5264x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f5226b;
        if (view != null) {
            this.f5239o = view;
            this.f5237m = null;
            this.f5238n = null;
        } else {
            if (i > 0) {
                this.f5237m = resources.getText(i);
            } else if (charSequence != null) {
                this.f5237m = charSequence;
            }
            if (i2 > 0) {
                this.f5238n = C0408e6.m1548b(this.f5225a, i2);
            } else if (drawable != null) {
                this.f5238n = drawable;
            }
            this.f5239o = null;
        }
        mo5251q(false);
    }

    /* renamed from: y */
    public void mo5265y() {
        this.f5240p = false;
        if (this.f5241q) {
            this.f5241q = false;
            mo5251q(this.f5242r);
        }
    }

    /* renamed from: z */
    public void mo5266z() {
        if (!this.f5240p) {
            this.f5240p = true;
            this.f5241q = false;
            this.f5242r = false;
        }
    }
}
