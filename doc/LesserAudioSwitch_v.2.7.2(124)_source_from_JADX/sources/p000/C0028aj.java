package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: aj */
public final class C0028aj {

    /* renamed from: a */
    public final Rect f109a;

    /* renamed from: b */
    public final ColorStateList f110b;

    /* renamed from: c */
    public final ColorStateList f111c;

    /* renamed from: d */
    public final ColorStateList f112d;

    /* renamed from: e */
    public final int f113e;

    /* renamed from: f */
    public final C1217ul f114f;

    public C0028aj(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1217ul ulVar, Rect rect) {
        C1344x5.m3753e(rect.left);
        C1344x5.m3753e(rect.top);
        C1344x5.m3753e(rect.right);
        C1344x5.m3753e(rect.bottom);
        this.f109a = rect;
        this.f110b = colorStateList2;
        this.f111c = colorStateList;
        this.f112d = colorStateList3;
        this.f113e = i;
        this.f114f = ulVar;
    }

    /* renamed from: a */
    public static C0028aj m51a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0781lh.f3160l);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList k = C0728kh.m2295k(context, obtainStyledAttributes, 4);
            ColorStateList k2 = C0728kh.m2295k(context, obtainStyledAttributes, 9);
            ColorStateList k3 = C0728kh.m2295k(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            C1217ul a = C1217ul.m3397a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0785ll((float) 0)).mo4783a();
            obtainStyledAttributes.recycle();
            return new C0028aj(k, k2, k3, dimensionPixelSize, a, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* renamed from: b */
    public void mo119b(TextView textView) {
        C1067rl rlVar = new C1067rl();
        C1067rl rlVar2 = new C1067rl();
        rlVar.setShapeAppearanceModel(this.f114f);
        rlVar2.setShapeAppearanceModel(this.f114f);
        rlVar.mo4300p(this.f111c);
        rlVar.mo4303s((float) this.f113e, this.f112d);
        textView.setTextColor(this.f110b);
        int i = Build.VERSION.SDK_INT;
        Drawable rippleDrawable = i >= 21 ? new RippleDrawable(this.f110b.withAlpha(30), rlVar, rlVar2) : rlVar;
        Rect rect = this.f109a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        Field field = C0813m8.f3234a;
        if (i >= 16) {
            textView.setBackground(insetDrawable);
        } else {
            textView.setBackgroundDrawable(insetDrawable);
        }
    }
}
