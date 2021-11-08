package p000;

import android.util.Log;
import java.util.concurrent.Future;

/* renamed from: ah */
public final class C0025ah implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Future f97b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f98c;

    public C0025ah(Future future, Runnable runnable) {
        this.f97b = future;
        this.f98c = runnable;
    }

    public final void run() {
        if (!this.f97b.isDone() && !this.f97b.isCancelled()) {
            this.f97b.cancel(true);
            int i = C0423eh.f2000a;
            Log.isLoggable("BillingClient", 5);
            Runnable runnable = this.f98c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
