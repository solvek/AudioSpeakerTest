package p000;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: u3 */
public class C1195u3 extends FrameLayout {

    /* renamed from: d */
    public static final C1440z3 f4578d;

    /* renamed from: b */
    public boolean f4579b;

    /* renamed from: c */
    public boolean f4580c;

    static {
        int i = Build.VERSION.SDK_INT;
        C1440z3 w3Var = i >= 21 ? new C1291w3() : i >= 17 ? new C1234v3() : new C1341x3();
        f4578d = w3Var;
        w3Var.mo4810l();
    }

    public ColorStateList getCardBackgroundColor() {
        return f4578d.mo4953i((C1397y3) null);
    }

    public float getCardElevation() {
        return f4578d.mo4950f((C1397y3) null);
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        return f4578d.mo4945a((C1397y3) null);
    }

    public boolean getPreventCornerOverlap() {
        return this.f4580c;
    }

    public float getRadius() {
        return f4578d.mo4946b((C1397y3) null);
    }

    public boolean getUseCompatPadding() {
        return this.f4579b;
    }

    public void onMeasure(int i, int i2) {
        C1440z3 z3Var = f4578d;
        if (!(z3Var instanceof C1291w3)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) z3Var.mo4951g((C1397y3) null)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) z3Var.mo4949e((C1397y3) null)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f4578d.mo4948d((C1397y3) null, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f4578d.mo4948d((C1397y3) null, colorStateList);
    }

    public void setCardElevation(float f) {
        f4578d.mo4954j((C1397y3) null, f);
    }

    public void setMaxCardElevation(float f) {
        f4578d.mo4955k((C1397y3) null, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4580c) {
            this.f4580c = z;
            f4578d.mo4947c((C1397y3) null);
        }
    }

    public void setRadius(float f) {
        f4578d.mo4956m((C1397y3) null, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4579b != z) {
            this.f4579b = z;
            f4578d.mo4952h((C1397y3) null);
        }
    }
}
