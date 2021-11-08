package p000;

import android.content.Context;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: dk */
public class C0383dk {

    /* renamed from: a */
    public final boolean f1902a;

    /* renamed from: b */
    public final int f1903b;

    /* renamed from: c */
    public final int f1904c;

    /* renamed from: d */
    public final float f1905d;

    public C0383dk(Context context) {
        this.f1902a = C0728kh.m2274C(context, R.attr.elevationOverlayEnabled, false);
        this.f1903b = C0728kh.m2293i(context, R.attr.elevationOverlayColor, 0);
        this.f1904c = C0728kh.m2293i(context, R.attr.colorSurface, 0);
        this.f1905d = context.getResources().getDisplayMetrics().density;
    }
}
