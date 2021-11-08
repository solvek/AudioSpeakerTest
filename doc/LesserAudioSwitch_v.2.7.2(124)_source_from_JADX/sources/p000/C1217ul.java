package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: ul */
public class C1217ul {

    /* renamed from: a */
    public C0933ol f4647a;

    /* renamed from: b */
    public C0933ol f4648b;

    /* renamed from: c */
    public C0933ol f4649c;

    /* renamed from: d */
    public C0933ol f4650d;

    /* renamed from: e */
    public C0890nl f4651e;

    /* renamed from: f */
    public C0890nl f4652f;

    /* renamed from: g */
    public C0890nl f4653g;

    /* renamed from: h */
    public C0890nl f4654h;

    /* renamed from: i */
    public C1025ql f4655i;

    /* renamed from: j */
    public C1025ql f4656j;

    /* renamed from: k */
    public C1025ql f4657k;

    /* renamed from: l */
    public C1025ql f4658l;

    public C1217ul() {
        this.f4647a = new C1176tl();
        this.f4648b = new C1176tl();
        this.f4649c = new C1176tl();
        this.f4650d = new C1176tl();
        this.f4651e = new C0785ll(0.0f);
        this.f4652f = new C0785ll(0.0f);
        this.f4653g = new C0785ll(0.0f);
        this.f4654h = new C0785ll(0.0f);
        this.f4655i = new C1025ql();
        this.f4656j = new C1025ql();
        this.f4657k = new C1025ql();
        this.f4658l = new C1025ql();
    }

    /* renamed from: a */
    public static C1219b m3397a(Context context, int i, int i2, C0890nl nlVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0781lh.f3167s);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C0890nl c = m3399c(obtainStyledAttributes, 5, nlVar);
            C0890nl c2 = m3399c(obtainStyledAttributes, 8, c);
            C0890nl c3 = m3399c(obtainStyledAttributes, 9, c);
            C0890nl c4 = m3399c(obtainStyledAttributes, 7, c);
            C0890nl c5 = m3399c(obtainStyledAttributes, 6, c);
            C1219b bVar = new C1219b();
            C0933ol d = C0728kh.m2288d(i4);
            bVar.f4659a = d;
            C1219b.m3402b(d);
            bVar.f4663e = c2;
            C0933ol d2 = C0728kh.m2288d(i5);
            bVar.f4660b = d2;
            C1219b.m3402b(d2);
            bVar.f4664f = c3;
            C0933ol d3 = C0728kh.m2288d(i6);
            bVar.f4661c = d3;
            C1219b.m3402b(d3);
            bVar.f4665g = c4;
            C0933ol d4 = C0728kh.m2288d(i7);
            bVar.f4662d = d4;
            C1219b.m3402b(d4);
            bVar.f4666h = c5;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C1219b m3398b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0785ll llVar = new C0785ll((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0781lh.f3163o, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m3397a(context, resourceId, resourceId2, llVar);
    }

    /* renamed from: c */
    public static C0890nl m3399c(TypedArray typedArray, int i, C0890nl nlVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return nlVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C0785ll((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C1125sl(peekValue.getFraction(1.0f, 1.0f)) : nlVar;
    }

    /* renamed from: d */
    public boolean mo4781d(RectF rectF) {
        Class<C1025ql> cls = C1025ql.class;
        boolean z = this.f4658l.getClass().equals(cls) && this.f4656j.getClass().equals(cls) && this.f4655i.getClass().equals(cls) && this.f4657k.getClass().equals(cls);
        float a = this.f4651e.mo3635a(rectF);
        return z && ((this.f4652f.mo3635a(rectF) > a ? 1 : (this.f4652f.mo3635a(rectF) == a ? 0 : -1)) == 0 && (this.f4654h.mo3635a(rectF) > a ? 1 : (this.f4654h.mo3635a(rectF) == a ? 0 : -1)) == 0 && (this.f4653g.mo3635a(rectF) > a ? 1 : (this.f4653g.mo3635a(rectF) == a ? 0 : -1)) == 0) && ((this.f4648b instanceof C1176tl) && (this.f4647a instanceof C1176tl) && (this.f4649c instanceof C1176tl) && (this.f4650d instanceof C1176tl));
    }

    /* renamed from: e */
    public C1217ul mo4782e(float f) {
        C1219b bVar = new C1219b(this);
        bVar.f4663e = new C0785ll(f);
        bVar.f4664f = new C0785ll(f);
        bVar.f4665g = new C0785ll(f);
        bVar.f4666h = new C0785ll(f);
        return bVar.mo4783a();
    }

    /* renamed from: ul$b */
    public static final class C1219b {

        /* renamed from: a */
        public C0933ol f4659a = new C1176tl();

        /* renamed from: b */
        public C0933ol f4660b = new C1176tl();

        /* renamed from: c */
        public C0933ol f4661c = new C1176tl();

        /* renamed from: d */
        public C0933ol f4662d = new C1176tl();

        /* renamed from: e */
        public C0890nl f4663e = new C0785ll(0.0f);

        /* renamed from: f */
        public C0890nl f4664f = new C0785ll(0.0f);

        /* renamed from: g */
        public C0890nl f4665g = new C0785ll(0.0f);

        /* renamed from: h */
        public C0890nl f4666h = new C0785ll(0.0f);

        /* renamed from: i */
        public C1025ql f4667i = new C1025ql();

        /* renamed from: j */
        public C1025ql f4668j = new C1025ql();

        /* renamed from: k */
        public C1025ql f4669k = new C1025ql();

        /* renamed from: l */
        public C1025ql f4670l = new C1025ql();

        public C1219b() {
        }

        /* renamed from: b */
        public static float m3402b(C0933ol olVar) {
            Object obj;
            if (olVar instanceof C1176tl) {
                obj = (C1176tl) olVar;
            } else if (!(olVar instanceof C0982pl)) {
                return -1.0f;
            } else {
                obj = (C0982pl) olVar;
            }
            obj.getClass();
            return -1.0f;
        }

        /* renamed from: a */
        public C1217ul mo4783a() {
            return new C1217ul(this, (C1218a) null);
        }

        /* renamed from: c */
        public C1219b mo4784c(float f) {
            this.f4666h = new C0785ll(f);
            return this;
        }

        /* renamed from: d */
        public C1219b mo4785d(float f) {
            this.f4665g = new C0785ll(f);
            return this;
        }

        /* renamed from: e */
        public C1219b mo4786e(float f) {
            this.f4663e = new C0785ll(f);
            return this;
        }

        /* renamed from: f */
        public C1219b mo4787f(float f) {
            this.f4664f = new C0785ll(f);
            return this;
        }

        public C1219b(C1217ul ulVar) {
            this.f4659a = ulVar.f4647a;
            this.f4660b = ulVar.f4648b;
            this.f4661c = ulVar.f4649c;
            this.f4662d = ulVar.f4650d;
            this.f4663e = ulVar.f4651e;
            this.f4664f = ulVar.f4652f;
            this.f4665g = ulVar.f4653g;
            this.f4666h = ulVar.f4654h;
            this.f4667i = ulVar.f4655i;
            this.f4668j = ulVar.f4656j;
            this.f4669k = ulVar.f4657k;
            this.f4670l = ulVar.f4658l;
        }
    }

    public C1217ul(C1219b bVar, C1218a aVar) {
        this.f4647a = bVar.f4659a;
        this.f4648b = bVar.f4660b;
        this.f4649c = bVar.f4661c;
        this.f4650d = bVar.f4662d;
        this.f4651e = bVar.f4663e;
        this.f4652f = bVar.f4664f;
        this.f4653g = bVar.f4665g;
        this.f4654h = bVar.f4666h;
        this.f4655i = bVar.f4667i;
        this.f4656j = bVar.f4668j;
        this.f4657k = bVar.f4669k;
        this.f4658l = bVar.f4670l;
    }
}
