package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: el */
public class C0427el {

    /* renamed from: a */
    public final float f2006a;

    /* renamed from: b */
    public final ColorStateList f2007b;

    /* renamed from: c */
    public final int f2008c;

    /* renamed from: d */
    public final int f2009d;

    /* renamed from: e */
    public final String f2010e;

    /* renamed from: f */
    public final ColorStateList f2011f;

    /* renamed from: g */
    public final float f2012g;

    /* renamed from: h */
    public final float f2013h;

    /* renamed from: i */
    public final float f2014i;

    /* renamed from: j */
    public final int f2015j;

    /* renamed from: k */
    public boolean f2016k = false;

    /* renamed from: l */
    public Typeface f2017l;

    /* renamed from: el$a */
    public class C0428a extends C0757l6 {

        /* renamed from: a */
        public final /* synthetic */ C0541gl f2018a;

        public C0428a(C0541gl glVar) {
            this.f2018a = glVar;
        }

        /* renamed from: c */
        public void mo2733c(int i) {
            C0427el.this.f2016k = true;
            this.f2018a.mo2140a(i);
        }

        /* renamed from: d */
        public void mo2734d(Typeface typeface) {
            C0427el elVar = C0427el.this;
            elVar.f2017l = Typeface.create(typeface, elVar.f2008c);
            C0427el elVar2 = C0427el.this;
            elVar2.f2016k = true;
            this.f2018a.mo2141b(elVar2.f2017l, false);
        }
    }

    public C0427el(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0781lh.f3169u);
        this.f2006a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2007b = C0728kh.m2295k(context, obtainStyledAttributes, 3);
        C0728kh.m2295k(context, obtainStyledAttributes, 4);
        C0728kh.m2295k(context, obtainStyledAttributes, 5);
        this.f2008c = obtainStyledAttributes.getInt(2, 0);
        this.f2009d = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f2015j = obtainStyledAttributes.getResourceId(i2, 0);
        this.f2010e = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2011f = C0728kh.m2295k(context, obtainStyledAttributes, 6);
        this.f2012g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2013h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f2014i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo2729a() {
        String str;
        if (this.f2017l == null && (str = this.f2010e) != null) {
            this.f2017l = Typeface.create(str, this.f2008c);
        }
        if (this.f2017l == null) {
            int i = this.f2009d;
            this.f2017l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f2017l = Typeface.create(this.f2017l, this.f2008c);
        }
    }

    /* renamed from: b */
    public void mo2730b(Context context, C0541gl glVar) {
        mo2729a();
        int i = this.f2015j;
        if (i == 0) {
            this.f2016k = true;
        }
        if (this.f2016k) {
            glVar.mo2141b(this.f2017l, true);
            return;
        }
        try {
            C0428a aVar = new C0428a(glVar);
            if (context.isRestricted()) {
                aVar.mo3598a(-4, (Handler) null);
                return;
            }
            C0806m6.m2448i(context, i, new TypedValue(), 0, aVar, (Handler) null, false);
        } catch (Resources.NotFoundException unused) {
            this.f2016k = true;
            glVar.mo2140a(1);
        } catch (Exception unused2) {
            this.f2016k = true;
            glVar.mo2140a(-3);
        }
    }

    /* renamed from: c */
    public void mo2731c(Context context, TextPaint textPaint, C0541gl glVar) {
        mo2729a();
        mo2732d(textPaint, this.f2017l);
        mo2730b(context, new C0481fl(this, textPaint, glVar));
        ColorStateList colorStateList = this.f2007b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f2014i;
        float f2 = this.f2012g;
        float f3 = this.f2013h;
        ColorStateList colorStateList2 = this.f2011f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: d */
    public void mo2732d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f2008c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2006a);
    }
}
