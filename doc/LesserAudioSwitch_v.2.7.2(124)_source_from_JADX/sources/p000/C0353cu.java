package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: cu */
public class C0353cu {

    /* renamed from: a */
    public static Handler f1837a = new Handler(Looper.getMainLooper());

    /* renamed from: cu$a */
    public static class C0354a<T> implements Callable<T> {

        /* renamed from: a */
        public T f1838a = null;

        /* renamed from: b */
        public FutureTask<T> f1839b;

        public C0354a(T t) {
            this.f1838a = t;
            this.f1839b = new FutureTask<>(this);
        }

        /* renamed from: a */
        public void mo2596a(T t) {
            this.f1838a = t;
            this.f1839b.run();
        }

        /* renamed from: b */
        public T mo2597b(long j, TimeUnit timeUnit) {
            return this.f1839b.get(j, timeUnit);
        }

        public T call() {
            return this.f1838a;
        }
    }
}
