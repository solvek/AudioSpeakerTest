package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: g3 */
public class C0517g3 extends C1396y2 {

    /* renamed from: b */
    public final WeakReference<Context> f2261b;

    public C0517g3(Context context, Resources resources) {
        super(resources);
        this.f2261b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = this.f5156a.getDrawable(i);
        Context context = (Context) this.f2261b.get();
        if (!(drawable == null || context == null)) {
            C1334x2.m3686d().mo5047l(context, i, drawable);
        }
        return drawable;
    }
}
