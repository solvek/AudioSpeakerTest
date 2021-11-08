package p000;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;
import p000.C0808m7;

/* renamed from: j7 */
public class C0667j7 implements Callable<C0808m7.C0812d> {

    /* renamed from: a */
    public final /* synthetic */ Context f2844a;

    /* renamed from: b */
    public final /* synthetic */ C0610i7 f2845b;

    /* renamed from: c */
    public final /* synthetic */ int f2846c;

    /* renamed from: d */
    public final /* synthetic */ String f2847d;

    public C0667j7(Context context, C0610i7 i7Var, int i, String str) {
        this.f2844a = context;
        this.f2845b = i7Var;
        this.f2846c = i;
        this.f2847d = str;
    }

    public Object call() {
        C0808m7.C0812d b = C0808m7.m2451b(this.f2844a, this.f2845b, this.f2846c);
        Typeface typeface = b.f3232a;
        if (typeface != null) {
            C0808m7.f3220a.mo3037b(this.f2847d, typeface);
        }
        return b;
    }
}
