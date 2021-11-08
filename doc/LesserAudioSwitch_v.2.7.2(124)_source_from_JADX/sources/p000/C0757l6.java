package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: l6 */
public abstract class C0757l6 {

    /* renamed from: l6$a */
    public class C0758a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Typeface f3108b;

        public C0758a(Typeface typeface) {
            this.f3108b = typeface;
        }

        public void run() {
            C0757l6.this.mo2734d(this.f3108b);
        }
    }

    /* renamed from: l6$b */
    public class C0759b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f3110b;

        public C0759b(int i) {
            this.f3110b = i;
        }

        public void run() {
            C0757l6.this.mo2733c(this.f3110b);
        }
    }

    /* renamed from: a */
    public final void mo3598a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C0759b(i));
    }

    /* renamed from: b */
    public final void mo3599b(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C0758a(typeface));
    }

    /* renamed from: c */
    public abstract void mo2733c(int i);

    /* renamed from: d */
    public abstract void mo2734d(Typeface typeface);
}
