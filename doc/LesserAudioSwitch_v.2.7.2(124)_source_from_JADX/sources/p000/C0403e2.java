package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: e2 */
public class C0403e2 extends C0004a2 {

    /* renamed from: d */
    public final SeekBar f1949d;

    /* renamed from: e */
    public Drawable f1950e;

    /* renamed from: f */
    public ColorStateList f1951f = null;

    /* renamed from: g */
    public PorterDuff.Mode f1952g = null;

    /* renamed from: h */
    public boolean f1953h = false;

    /* renamed from: i */
    public boolean f1954i = false;

    public C0403e2(SeekBar seekBar) {
        super(seekBar);
        this.f1949d = seekBar;
    }

    /* renamed from: a */
    public void mo15a(AttributeSet attributeSet, int i) {
        super.mo15a(attributeSet, i);
        Context context = this.f1949d.getContext();
        int[] iArr = C0440f.f2053g;
        C0555h3 q = C0555h3.m1825q(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1949d;
        C0813m8.m2456E(seekBar, seekBar.getContext(), iArr, attributeSet, q.f2425b, i, 0);
        Drawable h = q.mo3028h(0);
        if (h != null) {
            this.f1949d.setThumb(h);
        }
        Drawable g = q.mo3027g(1);
        Drawable drawable = this.f1950e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1950e = g;
        if (g != null) {
            g.setCallback(this.f1949d);
            C1344x5.m3742X(g, C0813m8.m2478l(this.f1949d));
            if (g.isStateful()) {
                g.setState(this.f1949d.getDrawableState());
            }
            mo2681c();
        }
        this.f1949d.invalidate();
        if (q.mo3035o(3)) {
            this.f1952g = C0912o2.m2667d(q.mo3030j(3, -1), this.f1952g);
            this.f1954i = true;
        }
        if (q.mo3035o(2)) {
            this.f1951f = q.mo3023c(2);
            this.f1953h = true;
        }
        q.f2425b.recycle();
        mo2681c();
    }

    /* renamed from: c */
    public final void mo2681c() {
        Drawable drawable = this.f1950e;
        if (drawable == null) {
            return;
        }
        if (this.f1953h || this.f1954i) {
            Drawable j0 = C1344x5.m3764j0(drawable.mutate());
            this.f1950e = j0;
            if (this.f1953h) {
                C1344x5.m3752d0(j0, this.f1951f);
            }
            if (this.f1954i) {
                C1344x5.m3754e0(this.f1950e, this.f1952g);
            }
            if (this.f1950e.isStateful()) {
                this.f1950e.setState(this.f1949d.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public void mo2682d(Canvas canvas) {
        if (this.f1950e != null) {
            int max = this.f1949d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1950e.getIntrinsicWidth();
                int intrinsicHeight = this.f1950e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1950e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1949d.getWidth() - this.f1949d.getPaddingLeft()) - this.f1949d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1949d.getPaddingLeft(), (float) (this.f1949d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1950e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
