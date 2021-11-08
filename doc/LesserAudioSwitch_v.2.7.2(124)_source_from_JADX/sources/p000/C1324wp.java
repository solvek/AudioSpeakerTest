package p000;

import android.content.Context;
import java.util.TimerTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wp */
public class C1324wp {

    /* renamed from: a */
    public final Context f4979a;

    /* renamed from: b */
    public ScheduledThreadPoolExecutor f4980b;

    /* renamed from: c */
    public TimerTask f4981c = null;

    /* renamed from: d */
    public boolean f4982d = false;

    /* renamed from: e */
    public boolean f4983e = false;

    /* renamed from: f */
    public boolean f4984f = false;

    public C1324wp(Context context) {
        this.f4979a = context;
    }

    /* renamed from: a */
    public void mo5017a() {
        this.f4983e = false;
        if (mo5018b()) {
            C0936oo.m2705k(this.f4979a, C0544go.f2352N, new C0894np(this));
        }
    }

    /* renamed from: b */
    public final boolean mo5018b() {
        if (!C0697ju.f2934b.mo3309a(this.f4979a, false) || this.f4982d || !C0697ju.m2194q(this.f4979a) || !C0728kh.m2286b(this.f4979a)) {
            return C0728kh.m2305u() && C0697ju.m2178a(this.f4979a);
        }
        return true;
    }

    /* renamed from: c */
    public void mo5019c() {
        if (mo5018b()) {
            synchronized (this.f4979a) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f4980b;
                if (scheduledThreadPoolExecutor != null) {
                    scheduledThreadPoolExecutor.shutdownNow();
                }
                C0550gu.m1820b("LAS ActiveStatusMonitor", "Starting active monitor loop");
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1);
                this.f4980b = scheduledThreadPoolExecutor2;
                TimerTask timerTask = this.f4981c;
                if (timerTask == null) {
                    timerTask = new C1274vp(this);
                    this.f4981c = timerTask;
                }
                scheduledThreadPoolExecutor2.scheduleAtFixedRate(timerTask, 5000, 5000, TimeUnit.MILLISECONDS);
                mo5017a();
            }
            return;
        }
        mo5020d();
    }

    /* renamed from: d */
    public void mo5020d() {
        synchronized (this.f4979a) {
            if (this.f4980b != null) {
                C0550gu.m1820b("LAS ActiveStatusMonitor", "Stopping active monitor loop");
                this.f4980b.shutdownNow();
                this.f4980b = null;
                this.f4983e = false;
            }
        }
    }
}
