package p000;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: fl */
public class C0481fl extends C0541gl {

    /* renamed from: a */
    public final /* synthetic */ TextPaint f2154a;

    /* renamed from: b */
    public final /* synthetic */ C0541gl f2155b;

    /* renamed from: c */
    public final /* synthetic */ C0427el f2156c;

    public C0481fl(C0427el elVar, TextPaint textPaint, C0541gl glVar) {
        this.f2156c = elVar;
        this.f2154a = textPaint;
        this.f2155b = glVar;
    }

    /* renamed from: a */
    public void mo2140a(int i) {
        this.f2155b.mo2140a(i);
    }

    /* renamed from: b */
    public void mo2141b(Typeface typeface, boolean z) {
        this.f2156c.mo2732d(this.f2154a, typeface);
        this.f2155b.mo2141b(typeface, z);
    }
}
