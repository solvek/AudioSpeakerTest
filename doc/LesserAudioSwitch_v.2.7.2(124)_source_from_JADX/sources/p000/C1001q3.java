package p000;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q3 */
public class C1001q3 extends C1042r3 {

    /* renamed from: a */
    public final Object f3770a = new Object();

    /* renamed from: b */
    public final ExecutorService f3771b = Executors.newFixedThreadPool(4, new C1002a(this));

    /* renamed from: q3$a */
    public class C1002a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f3772a = new AtomicInteger(0);

        public C1002a(C1001q3 q3Var) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f3772a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public boolean mo3949a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
