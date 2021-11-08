package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: bj */
public final class C0224bj {

    /* renamed from: a */
    public final C0028aj f1276a;

    /* renamed from: b */
    public final C0028aj f1277b;

    /* renamed from: c */
    public final C0028aj f1278c;

    /* renamed from: d */
    public final C0028aj f1279d;

    /* renamed from: e */
    public final C0028aj f1280e;

    /* renamed from: f */
    public final C0028aj f1281f;

    /* renamed from: g */
    public final C0028aj f1282g;

    /* renamed from: h */
    public final Paint f1283h;

    public C0224bj(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0728kh.m2275D(context, R.attr.materialCalendarStyle, C0473fj.class.getCanonicalName()), C0781lh.f3159k);
        this.f1276a = C0028aj.m51a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f1282g = C0028aj.m51a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f1277b = C0028aj.m51a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f1278c = C0028aj.m51a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList k = C0728kh.m2295k(context, obtainStyledAttributes, 5);
        this.f1279d = C0028aj.m51a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f1280e = C0028aj.m51a(context, obtainStyledAttributes.getResourceId(6, 0));
        this.f1281f = C0028aj.m51a(context, obtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.f1283h = paint;
        paint.setColor(k.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
