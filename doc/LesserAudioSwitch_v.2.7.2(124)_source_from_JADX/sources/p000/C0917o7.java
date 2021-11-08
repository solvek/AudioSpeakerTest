package p000;

import android.os.Handler;
import java.util.concurrent.Callable;
import p000.C0860n7;

/* renamed from: o7 */
public class C0917o7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Callable f3479b;

    /* renamed from: c */
    public final /* synthetic */ Handler f3480c;

    /* renamed from: d */
    public final /* synthetic */ C0860n7.C0863c f3481d;

    /* renamed from: o7$a */
    public class C0918a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f3482b;

        public C0918a(Object obj) {
            this.f3482b = obj;
        }

        public void run() {
            C0917o7.this.f3481d.mo3532a(this.f3482b);
        }
    }

    public C0917o7(C0860n7 n7Var, Callable callable, Handler handler, C0860n7.C0863c cVar) {
        this.f3479b = callable;
        this.f3480c = handler;
        this.f3481d = cVar;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f3479b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f3480c.post(new C0918a(obj));
    }
}
