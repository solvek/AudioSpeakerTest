package p000;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: xi */
public interface C1366xi {

    /* renamed from: xi$b */
    public static class C1368b implements TypeEvaluator<C1371e> {

        /* renamed from: b */
        public static final TypeEvaluator<C1371e> f5082b = new C1368b();

        /* renamed from: a */
        public final C1371e f5083a = new C1371e((C1367a) null);

        public Object evaluate(float f, Object obj, Object obj2) {
            C1371e eVar = (C1371e) obj;
            C1371e eVar2 = (C1371e) obj2;
            C1371e eVar3 = this.f5083a;
            float w = C0728kh.m2307w(eVar.f5086a, eVar2.f5086a, f);
            float w2 = C0728kh.m2307w(eVar.f5087b, eVar2.f5087b, f);
            float w3 = C0728kh.m2307w(eVar.f5088c, eVar2.f5088c, f);
            eVar3.f5086a = w;
            eVar3.f5087b = w2;
            eVar3.f5088c = w3;
            return this.f5083a;
        }
    }

    /* renamed from: xi$c */
    public static class C1369c extends Property<C1366xi, C1371e> {

        /* renamed from: a */
        public static final Property<C1366xi, C1371e> f5084a = new C1369c("circularReveal");

        public C1369c(String str) {
            super(C1371e.class, str);
        }

        public Object get(Object obj) {
            return ((C1366xi) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((C1366xi) obj).setRevealInfo((C1371e) obj2);
        }
    }

    /* renamed from: xi$d */
    public static class C1370d extends Property<C1366xi, Integer> {

        /* renamed from: a */
        public static final Property<C1366xi, Integer> f5085a = new C1370d("circularRevealScrimColor");

        public C1370d(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((C1366xi) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((C1366xi) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: xi$e */
    public static class C1371e {

        /* renamed from: a */
        public float f5086a;

        /* renamed from: b */
        public float f5087b;

        /* renamed from: c */
        public float f5088c;

        public C1371e() {
        }

        public C1371e(float f, float f2, float f3) {
            this.f5086a = f;
            this.f5087b = f2;
            this.f5088c = f3;
        }

        public C1371e(C1367a aVar) {
        }
    }

    /* renamed from: a */
    void mo4907a();

    /* renamed from: b */
    void mo4908b();

    int getCircularRevealScrimColor();

    C1371e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C1371e eVar);
}
