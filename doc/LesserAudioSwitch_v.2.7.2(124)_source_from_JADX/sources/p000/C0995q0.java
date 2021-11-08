package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: q0 */
public class C0995q0 extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f3723e;

    /* renamed from: f */
    public static final Class<?>[] f3724f;

    /* renamed from: a */
    public final Object[] f3725a;

    /* renamed from: b */
    public final Object[] f3726b;

    /* renamed from: c */
    public Context f3727c;

    /* renamed from: d */
    public Object f3728d;

    /* renamed from: q0$a */
    public static class C0996a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public static final Class<?>[] f3729d = {MenuItem.class};

        /* renamed from: b */
        public Object f3730b;

        /* renamed from: c */
        public Method f3731c;

        public C0996a(Object obj, String str) {
            this.f3730b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f3731c = cls.getMethod(str, f3729d);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3731c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3731c.invoke(this.f3730b, new Object[]{menuItem})).booleanValue();
                }
                this.f3731c.invoke(this.f3730b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: q0$b */
    public class C0997b {

        /* renamed from: A */
        public C0011a8 f3732A;

        /* renamed from: B */
        public CharSequence f3733B;

        /* renamed from: C */
        public CharSequence f3734C;

        /* renamed from: D */
        public ColorStateList f3735D = null;

        /* renamed from: E */
        public PorterDuff.Mode f3736E = null;

        /* renamed from: a */
        public Menu f3738a;

        /* renamed from: b */
        public int f3739b;

        /* renamed from: c */
        public int f3740c;

        /* renamed from: d */
        public int f3741d;

        /* renamed from: e */
        public int f3742e;

        /* renamed from: f */
        public boolean f3743f;

        /* renamed from: g */
        public boolean f3744g;

        /* renamed from: h */
        public boolean f3745h;

        /* renamed from: i */
        public int f3746i;

        /* renamed from: j */
        public int f3747j;

        /* renamed from: k */
        public CharSequence f3748k;

        /* renamed from: l */
        public CharSequence f3749l;

        /* renamed from: m */
        public int f3750m;

        /* renamed from: n */
        public char f3751n;

        /* renamed from: o */
        public int f3752o;

        /* renamed from: p */
        public char f3753p;

        /* renamed from: q */
        public int f3754q;

        /* renamed from: r */
        public int f3755r;

        /* renamed from: s */
        public boolean f3756s;

        /* renamed from: t */
        public boolean f3757t;

        /* renamed from: u */
        public boolean f3758u;

        /* renamed from: v */
        public int f3759v;

        /* renamed from: w */
        public int f3760w;

        /* renamed from: x */
        public String f3761x;

        /* renamed from: y */
        public String f3762y;

        /* renamed from: z */
        public String f3763z;

        public C0997b(Menu menu) {
            this.f3738a = menu;
            this.f3739b = 0;
            this.f3740c = 0;
            this.f3741d = 0;
            this.f3742e = 0;
            this.f3743f = true;
            this.f3744g = true;
        }

        /* renamed from: a */
        public SubMenu mo4052a() {
            this.f3745h = true;
            SubMenu addSubMenu = this.f3738a.addSubMenu(this.f3739b, this.f3746i, this.f3747j, this.f3748k);
            mo4054c(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: b */
        public final <T> T mo4053b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0995q0.this.f3727c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final void mo4054c(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f3756s).setVisible(this.f3757t).setEnabled(this.f3758u).setCheckable(this.f3755r >= 1).setTitleCondensed(this.f3749l).setIcon(this.f3750m);
            int i = this.f3759v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f3763z != null) {
                if (!C0995q0.this.f3727c.isRestricted()) {
                    C0995q0 q0Var = C0995q0.this;
                    if (q0Var.f3728d == null) {
                        q0Var.f3728d = q0Var.mo4048a(q0Var.f3727c);
                    }
                    menuItem.setOnMenuItemClickListener(new C0996a(q0Var.f3728d, this.f3763z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f3755r >= 2) {
                if (menuItem instanceof C0203b1) {
                    C0203b1 b1Var = (C0203b1) menuItem;
                    b1Var.f1204x = (b1Var.f1204x & -5) | 4;
                } else if (menuItem instanceof C0246c1) {
                    C0246c1 c1Var = (C0246c1) menuItem;
                    try {
                        if (c1Var.f1320e == null) {
                            c1Var.f1320e = c1Var.f1319d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        c1Var.f1320e.invoke(c1Var.f1319d, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f3761x;
            if (str != null) {
                menuItem.setActionView((View) mo4053b(str, C0995q0.f3723e, C0995q0.this.f3725a));
                z = true;
            }
            int i2 = this.f3760w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            C0011a8 a8Var = this.f3732A;
            if (a8Var != null && (menuItem instanceof C0409e7)) {
                ((C0409e7) menuItem).mo1476b(a8Var);
            }
            CharSequence charSequence = this.f3733B;
            boolean z2 = menuItem instanceof C0409e7;
            if (z2) {
                ((C0409e7) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f3734C;
            if (z2) {
                ((C0409e7) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f3751n;
            int i3 = this.f3752o;
            if (z2) {
                ((C0409e7) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.f3753p;
            int i4 = this.f3754q;
            if (z2) {
                ((C0409e7) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.f3736E;
            if (mode != null) {
                if (z2) {
                    ((C0409e7) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f3735D;
            if (colorStateList == null) {
                return;
            }
            if (z2) {
                ((C0409e7) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f3723e = r0
            f3724f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0995q0.<clinit>():void");
    }

    public C0995q0(Context context) {
        super(context);
        this.f3727c = context;
        Object[] objArr = {context};
        this.f3725a = objArr;
        this.f3726b = objArr;
    }

    /* renamed from: a */
    public final Object mo4048a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? mo4048a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public final void mo4049b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c;
        char c2;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        C0997b bVar = new C0997b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(C0279ch.m1120q("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.f3739b = 0;
                            bVar.f3740c = 0;
                            bVar.f3741d = 0;
                            bVar.f3742e = 0;
                            bVar.f3743f = true;
                            bVar.f3744g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f3745h) {
                                C0011a8 a8Var = bVar.f3732A;
                                if (a8Var == null || !a8Var.mo83a()) {
                                    bVar.f3745h = true;
                                    bVar.mo4054c(bVar.f3738a.add(bVar.f3739b, bVar.f3746i, bVar.f3747j, bVar.f3748k));
                                } else {
                                    bVar.mo4052a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = C0995q0.this.f3727c.obtainStyledAttributes(attributeSet2, C0440f.f2062p);
                        bVar.f3739b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f3740c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f3741d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f3742e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f3743f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f3744g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        C0555h3 p = C0555h3.m1824p(C0995q0.this.f3727c, attributeSet2, C0440f.f2063q);
                        bVar.f3746i = p.mo3032l(2, 0);
                        bVar.f3747j = (p.mo3030j(5, bVar.f3740c) & -65536) | (p.mo3030j(6, bVar.f3741d) & 65535);
                        bVar.f3748k = p.mo3034n(7);
                        bVar.f3749l = p.mo3034n(8);
                        bVar.f3750m = p.mo3032l(0, 0);
                        String m = p.mo3033m(9);
                        if (m == null) {
                            c = 0;
                        } else {
                            c = m.charAt(0);
                        }
                        bVar.f3751n = c;
                        bVar.f3752o = p.mo3030j(16, 4096);
                        String m2 = p.mo3033m(10);
                        if (m2 == null) {
                            c2 = 0;
                        } else {
                            c2 = m2.charAt(0);
                        }
                        bVar.f3753p = c2;
                        bVar.f3754q = p.mo3030j(20, 4096);
                        bVar.f3755r = p.mo3035o(11) ? p.mo3021a(11, false) : bVar.f3742e;
                        bVar.f3756s = p.mo3021a(3, false);
                        bVar.f3757t = p.mo3021a(4, bVar.f3743f);
                        bVar.f3758u = p.mo3021a(1, bVar.f3744g);
                        bVar.f3759v = p.mo3030j(21, -1);
                        bVar.f3763z = p.mo3033m(12);
                        bVar.f3760w = p.mo3032l(13, 0);
                        bVar.f3761x = p.mo3033m(15);
                        String m3 = p.mo3033m(14);
                        bVar.f3762y = m3;
                        bVar.f3732A = ((m3 != null) && bVar.f3760w == 0 && bVar.f3761x == null) ? (C0011a8) bVar.mo4053b(m3, f3724f, C0995q0.this.f3726b) : null;
                        bVar.f3733B = p.mo3034n(17);
                        bVar.f3734C = p.mo3034n(22);
                        if (p.mo3035o(19)) {
                            bVar.f3736E = C0912o2.m2667d(p.mo3030j(19, -1), bVar.f3736E);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.f3736E = null;
                        }
                        if (p.mo3035o(18)) {
                            colorStateList = p.mo3023c(18);
                        }
                        bVar.f3735D = colorStateList;
                        p.f2425b.recycle();
                        bVar.f3745h = false;
                    } else {
                        if (name3.equals("menu")) {
                            mo4049b(xmlPullParser, attributeSet2, bVar.mo4052a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            z2 = true;
                            str = name3;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C0367d7)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f3727c.getResources().getLayout(i);
            mo4049b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
