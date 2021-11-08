package p000;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: ph */
public class C0978ph extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f3641b = new C0978ph();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f3642a = new WeakHashMap<>();

    public C0978ph() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public Object get(Object obj) {
        int i;
        Drawable drawable = (Drawable) obj;
        if (Build.VERSION.SDK_INT >= 19) {
            i = drawable.getAlpha();
        } else if (this.f3642a.containsKey(drawable)) {
            return this.f3642a.get(drawable);
        } else {
            i = 255;
        }
        return Integer.valueOf(i);
    }

    public void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (Build.VERSION.SDK_INT < 19) {
            this.f3642a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
