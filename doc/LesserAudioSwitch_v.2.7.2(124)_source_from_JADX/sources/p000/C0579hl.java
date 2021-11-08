package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: hl */
public class C0579hl extends Drawable implements C1422yl, C1400y6 {

    /* renamed from: b */
    public C0581b f2484b;

    /* renamed from: hl$b */
    public static final class C0581b extends Drawable.ConstantState {

        /* renamed from: a */
        public C1067rl f2485a;

        /* renamed from: b */
        public boolean f2486b;

        public C0581b(C0581b bVar) {
            this.f2485a = (C1067rl) bVar.f2485a.f3979b.newDrawable();
            this.f2486b = bVar.f2486b;
        }

        public C0581b(C1067rl rlVar) {
            this.f2485a = rlVar;
            this.f2486b = false;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C0579hl(new C0581b(this), (C0580a) null);
        }
    }

    public C0579hl(C0581b bVar, C0580a aVar) {
        this.f2484b = bVar;
    }

    public void draw(Canvas canvas) {
        C0581b bVar = this.f2484b;
        if (bVar.f2486b) {
            bVar.f2485a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f2484b;
    }

    public int getOpacity() {
        return this.f2484b.f2485a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        this.f2484b = new C0581b(this.f2484b);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2484b.f2485a.setBounds(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f2484b.f2485a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = C0643il.m2053b(iArr);
        C0581b bVar = this.f2484b;
        if (bVar.f2486b == b) {
            return onStateChange;
        }
        bVar.f2486b = b;
        return true;
    }

    public void setAlpha(int i) {
        this.f2484b.f2485a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2484b.f2485a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C1217ul ulVar) {
        C1067rl rlVar = this.f2484b.f2485a;
        rlVar.f3979b.f4002a = ulVar;
        rlVar.invalidateSelf();
    }

    public void setTint(int i) {
        this.f2484b.f2485a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2484b.f2485a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2484b.f2485a.setTintMode(mode);
    }

    public C0579hl(C1217ul ulVar) {
        this.f2484b = new C0581b(new C1067rl(ulVar));
    }
}
