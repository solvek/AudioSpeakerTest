package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: n7 */
public class C0860n7 {

    /* renamed from: a */
    public final Object f3341a = new Object();

    /* renamed from: b */
    public HandlerThread f3342b;

    /* renamed from: c */
    public Handler f3343c;

    /* renamed from: d */
    public int f3344d = 0;

    /* renamed from: e */
    public Handler.Callback f3345e = new C0861a();

    /* renamed from: n7$a */
    public class C0861a implements Handler.Callback {
        public C0861a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0860n7 n7Var = C0860n7.this;
                synchronized (n7Var.f3341a) {
                    if (!n7Var.f3343c.hasMessages(1)) {
                        n7Var.f3342b.quit();
                        n7Var.f3342b = null;
                        n7Var.f3343c = null;
                    }
                }
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0860n7 n7Var2 = C0860n7.this;
                n7Var2.getClass();
                ((Runnable) message.obj).run();
                synchronized (n7Var2.f3341a) {
                    n7Var2.f3343c.removeMessages(0);
                    Handler handler = n7Var2.f3343c;
                    handler.sendMessageDelayed(handler.obtainMessage(0), (long) 10000);
                }
                return true;
            }
        }
    }

    /* renamed from: n7$b */
    public class C0862b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f3347b;

        /* renamed from: c */
        public final /* synthetic */ Callable f3348c;

        /* renamed from: d */
        public final /* synthetic */ ReentrantLock f3349d;

        /* renamed from: e */
        public final /* synthetic */ AtomicBoolean f3350e;

        /* renamed from: f */
        public final /* synthetic */ Condition f3351f;

        public C0862b(C0860n7 n7Var, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f3347b = atomicReference;
            this.f3348c = callable;
            this.f3349d = reentrantLock;
            this.f3350e = atomicBoolean;
            this.f3351f = condition;
        }

        public void run() {
            try {
                this.f3347b.set(this.f3348c.call());
            } catch (Exception unused) {
            }
            this.f3349d.lock();
            try {
                this.f3350e.set(false);
                this.f3351f.signal();
            } finally {
                this.f3349d.unlock();
            }
        }
    }

    /* renamed from: n7$c */
    public interface C0863c<T> {
        /* renamed from: a */
        void mo3532a(T t);
    }

    public C0860n7(String str, int i, int i2) {
    }

    /* renamed from: a */
    public final void mo3735a(Runnable runnable) {
        synchronized (this.f3341a) {
            if (this.f3342b == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.f3342b = handlerThread;
                handlerThread.start();
                this.f3343c = new Handler(this.f3342b.getLooper(), this.f3345e);
                this.f3344d++;
            }
            this.f3343c.removeMessages(0);
            Handler handler = this.f3343c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo3736b(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            n7$b r11 = new n7$b
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.mo3735a(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            goto L_0x0062
        L_0x0061:
            throw r13
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0860n7.mo3736b(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
