package p000;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: v8 */
public class C1241v8 {

    /* renamed from: b */
    public static final C1241v8 f4772b;

    /* renamed from: a */
    public final C1249h f4773a;

    /* renamed from: v8$a */
    public static class C1242a extends C1244c {

        /* renamed from: c */
        public static Field f4774c = null;

        /* renamed from: d */
        public static boolean f4775d = false;

        /* renamed from: e */
        public static Constructor<WindowInsets> f4776e = null;

        /* renamed from: f */
        public static boolean f4777f = false;

        /* renamed from: b */
        public WindowInsets f4778b;

        public C1242a() {
            this.f4778b = m3471d();
        }

        public C1242a(C1241v8 v8Var) {
            this.f4778b = v8Var.mo4847g();
        }

        /* renamed from: d */
        public static WindowInsets m3471d() {
            if (!f4775d) {
                try {
                    f4774c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f4775d = true;
            }
            Field field = f4774c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f4777f) {
                try {
                    f4776e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f4777f = true;
            }
            Constructor<WindowInsets> constructor = f4776e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        /* renamed from: a */
        public C1241v8 mo4849a() {
            return C1241v8.m3464h(this.f4778b);
        }

        /* renamed from: c */
        public void mo4850c(C0916o6 o6Var) {
            WindowInsets windowInsets = this.f4778b;
            if (windowInsets != null) {
                this.f4778b = windowInsets.replaceSystemWindowInsets(o6Var.f3475a, o6Var.f3476b, o6Var.f3477c, o6Var.f3478d);
            }
        }
    }

    /* renamed from: v8$b */
    public static class C1243b extends C1244c {

        /* renamed from: b */
        public final WindowInsets.Builder f4779b;

        public C1243b() {
            this.f4779b = new WindowInsets.Builder();
        }

        public C1243b(C1241v8 v8Var) {
            WindowInsets.Builder builder;
            WindowInsets g = v8Var.mo4847g();
            if (g == null) {
                builder = new WindowInsets.Builder();
            }
            this.f4779b = builder;
        }

        /* renamed from: a */
        public C1241v8 mo4849a() {
            return C1241v8.m3464h(this.f4779b.build());
        }

        /* renamed from: b */
        public void mo4851b(C0916o6 o6Var) {
            this.f4779b.setStableInsets(Insets.of(o6Var.f3475a, o6Var.f3476b, o6Var.f3477c, o6Var.f3478d));
        }

        /* renamed from: c */
        public void mo4850c(C0916o6 o6Var) {
            this.f4779b.setSystemWindowInsets(Insets.of(o6Var.f3475a, o6Var.f3476b, o6Var.f3477c, o6Var.f3478d));
        }
    }

    /* renamed from: v8$c */
    public static class C1244c {

        /* renamed from: a */
        public final C1241v8 f4780a;

        public C1244c() {
            this.f4780a = new C1241v8((C1241v8) null);
        }

        public C1244c(C1241v8 v8Var) {
            this.f4780a = v8Var;
        }

        /* renamed from: a */
        public C1241v8 mo4849a() {
            return this.f4780a;
        }

        /* renamed from: b */
        public void mo4851b(C0916o6 o6Var) {
        }

        /* renamed from: c */
        public void mo4850c(C0916o6 o6Var) {
        }
    }

    /* renamed from: v8$d */
    public static class C1245d extends C1249h {

        /* renamed from: b */
        public final WindowInsets f4781b;

        /* renamed from: c */
        public C0916o6 f4782c = null;

        public C1245d(C1241v8 v8Var, WindowInsets windowInsets) {
            super(v8Var);
            this.f4781b = windowInsets;
        }

        /* renamed from: g */
        public final C0916o6 mo4852g() {
            if (this.f4782c == null) {
                this.f4782c = C0916o6.m2670a(this.f4781b.getSystemWindowInsetLeft(), this.f4781b.getSystemWindowInsetTop(), this.f4781b.getSystemWindowInsetRight(), this.f4781b.getSystemWindowInsetBottom());
            }
            return this.f4782c;
        }

        /* renamed from: h */
        public C1241v8 mo4853h(int i, int i2, int i3, int i4) {
            C1241v8 h = C1241v8.m3464h(this.f4781b);
            int i5 = Build.VERSION.SDK_INT;
            C1244c bVar = i5 >= 29 ? new C1243b(h) : i5 >= 20 ? new C1242a(h) : new C1244c(h);
            bVar.mo4850c(C1241v8.m3463f(mo4852g(), i, i2, i3, i4));
            bVar.mo4851b(C1241v8.m3463f(mo4857f(), i, i2, i3, i4));
            return bVar.mo4849a();
        }

        /* renamed from: j */
        public boolean mo4854j() {
            return this.f4781b.isRound();
        }
    }

    /* renamed from: v8$e */
    public static class C1246e extends C1245d {

        /* renamed from: d */
        public C0916o6 f4783d = null;

        public C1246e(C1241v8 v8Var, WindowInsets windowInsets) {
            super(v8Var, windowInsets);
        }

        /* renamed from: b */
        public C1241v8 mo4855b() {
            return C1241v8.m3464h(this.f4781b.consumeStableInsets());
        }

        /* renamed from: c */
        public C1241v8 mo4856c() {
            return C1241v8.m3464h(this.f4781b.consumeSystemWindowInsets());
        }

        /* renamed from: f */
        public final C0916o6 mo4857f() {
            if (this.f4783d == null) {
                this.f4783d = C0916o6.m2670a(this.f4781b.getStableInsetLeft(), this.f4781b.getStableInsetTop(), this.f4781b.getStableInsetRight(), this.f4781b.getStableInsetBottom());
            }
            return this.f4783d;
        }

        /* renamed from: i */
        public boolean mo4858i() {
            return this.f4781b.isConsumed();
        }
    }

    /* renamed from: v8$f */
    public static class C1247f extends C1246e {
        public C1247f(C1241v8 v8Var, WindowInsets windowInsets) {
            super(v8Var, windowInsets);
        }

        /* renamed from: a */
        public C1241v8 mo4859a() {
            return C1241v8.m3464h(this.f4781b.consumeDisplayCutout());
        }

        /* renamed from: d */
        public C0213b8 mo4860d() {
            DisplayCutout displayCutout = this.f4781b.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C0213b8(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1247f)) {
                return false;
            }
            return C0000a.m0a(this.f4781b, ((C1247f) obj).f4781b);
        }

        public int hashCode() {
            return this.f4781b.hashCode();
        }
    }

    /* renamed from: v8$g */
    public static class C1248g extends C1247f {

        /* renamed from: e */
        public C0916o6 f4784e = null;

        public C1248g(C1241v8 v8Var, WindowInsets windowInsets) {
            super(v8Var, windowInsets);
        }

        /* renamed from: e */
        public C0916o6 mo4863e() {
            if (this.f4784e == null) {
                Insets mandatorySystemGestureInsets = this.f4781b.getMandatorySystemGestureInsets();
                this.f4784e = C0916o6.m2670a(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
            }
            return this.f4784e;
        }

        /* renamed from: h */
        public C1241v8 mo4853h(int i, int i2, int i3, int i4) {
            return C1241v8.m3464h(this.f4781b.inset(i, i2, i3, i4));
        }
    }

    /* renamed from: v8$h */
    public static class C1249h {

        /* renamed from: a */
        public final C1241v8 f4785a;

        public C1249h(C1241v8 v8Var) {
            this.f4785a = v8Var;
        }

        /* renamed from: a */
        public C1241v8 mo4859a() {
            return this.f4785a;
        }

        /* renamed from: b */
        public C1241v8 mo4855b() {
            return this.f4785a;
        }

        /* renamed from: c */
        public C1241v8 mo4856c() {
            return this.f4785a;
        }

        /* renamed from: d */
        public C0213b8 mo4860d() {
            return null;
        }

        /* renamed from: e */
        public C0916o6 mo4863e() {
            return mo4852g();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1249h)) {
                return false;
            }
            C1249h hVar = (C1249h) obj;
            return mo4854j() == hVar.mo4854j() && mo4858i() == hVar.mo4858i() && C1344x5.m3773r(mo4852g(), hVar.mo4852g()) && C1344x5.m3773r(mo4857f(), hVar.mo4857f()) && C1344x5.m3773r(mo4860d(), hVar.mo4860d());
        }

        /* renamed from: f */
        public C0916o6 mo4857f() {
            return C0916o6.f3474e;
        }

        /* renamed from: g */
        public C0916o6 mo4852g() {
            return C0916o6.f3474e;
        }

        /* renamed from: h */
        public C1241v8 mo4853h(int i, int i2, int i3, int i4) {
            return C1241v8.f4772b;
        }

        public int hashCode() {
            return C1344x5.m3724F(Boolean.valueOf(mo4854j()), Boolean.valueOf(mo4858i()), mo4852g(), mo4857f(), mo4860d());
        }

        /* renamed from: i */
        public boolean mo4858i() {
            return false;
        }

        /* renamed from: j */
        public boolean mo4854j() {
            return false;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f4772b = (i >= 29 ? new C1243b() : i >= 20 ? new C1242a() : new C1244c()).mo4849a().f4773a.mo4859a().f4773a.mo4855b().f4773a.mo4856c();
    }

    public C1241v8(WindowInsets windowInsets) {
        C1249h hVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            hVar = new C1248g(this, windowInsets);
        } else if (i >= 28) {
            hVar = new C1247f(this, windowInsets);
        } else if (i >= 21) {
            hVar = new C1246e(this, windowInsets);
        } else if (i >= 20) {
            hVar = new C1245d(this, windowInsets);
        } else {
            this.f4773a = new C1249h(this);
            return;
        }
        this.f4773a = hVar;
    }

    public C1241v8(C1241v8 v8Var) {
        this.f4773a = new C1249h(this);
    }

    /* renamed from: f */
    public static C0916o6 m3463f(C0916o6 o6Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, o6Var.f3475a - i);
        int max2 = Math.max(0, o6Var.f3476b - i2);
        int max3 = Math.max(0, o6Var.f3477c - i3);
        int max4 = Math.max(0, o6Var.f3478d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? o6Var : C0916o6.m2670a(max, max2, max3, max4);
    }

    /* renamed from: h */
    public static C1241v8 m3464h(WindowInsets windowInsets) {
        windowInsets.getClass();
        return new C1241v8(windowInsets);
    }

    /* renamed from: a */
    public int mo4841a() {
        return mo4845e().f3478d;
    }

    /* renamed from: b */
    public int mo4842b() {
        return mo4845e().f3475a;
    }

    /* renamed from: c */
    public int mo4843c() {
        return mo4845e().f3477c;
    }

    /* renamed from: d */
    public int mo4844d() {
        return mo4845e().f3476b;
    }

    /* renamed from: e */
    public C0916o6 mo4845e() {
        return this.f4773a.mo4852g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241v8)) {
            return false;
        }
        return C1344x5.m3773r(this.f4773a, ((C1241v8) obj).f4773a);
    }

    /* renamed from: g */
    public WindowInsets mo4847g() {
        C1249h hVar = this.f4773a;
        if (hVar instanceof C1245d) {
            return ((C1245d) hVar).f4781b;
        }
        return null;
    }

    public int hashCode() {
        C1249h hVar = this.f4773a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
