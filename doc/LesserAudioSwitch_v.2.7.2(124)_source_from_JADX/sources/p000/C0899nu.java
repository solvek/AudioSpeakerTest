package p000;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;
import com.nordskog.LesserAudioSwitch.service.HeadphonesMonitorService;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: nu */
public class C0899nu {

    /* renamed from: a */
    public final Set<Future> f3427a = new HashSet();

    /* renamed from: b */
    public ExecutorService f3428b = Executors.newFixedThreadPool(1);

    /* renamed from: c */
    public Timer f3429c = new Timer();

    /* renamed from: d */
    public long f3430d;

    /* renamed from: e */
    public Context f3431e;

    /* renamed from: f */
    public boolean f3432f = false;

    /* renamed from: nu$a */
    public class C0900a extends TimerTask {

        /* renamed from: b */
        public final /* synthetic */ Future f3433b;

        public C0900a(Future future) {
            this.f3433b = future;
        }

        public void run() {
            synchronized (C0899nu.this.f3427a) {
                C0899nu.this.f3427a.remove(this.f3433b);
            }
            if (!this.f3433b.isCancelled() && !this.f3433b.isDone()) {
                synchronized (C0899nu.this.f3427a) {
                    C0899nu nuVar = C0899nu.this;
                    ExecutorService executorService = nuVar.f3428b;
                    nuVar.f3428b = Executors.newFixedThreadPool(1);
                    C0899nu.m2621a(C0899nu.this);
                    C0550gu.m1819a("TimeoutThreadPool", "Cancelling timed out task");
                    C0899nu.this.f3432f = false;
                    this.f3433b.cancel(true);
                    executorService.shutdownNow();
                    for (Future cancel : C0899nu.this.f3427a) {
                        cancel.cancel(true);
                    }
                    C0899nu.this.f3427a.clear();
                }
            }
        }
    }

    public C0899nu(long j) {
        this.f3430d = j;
    }

    /* renamed from: a */
    public static void m2621a(C0899nu nuVar) {
        C0009a6 a6Var;
        if (nuVar.f3431e != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            Context context = nuVar.f3431e;
            boolean z = HeadphonesMonitorService.f1746b;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(C0200av.m970a(-75242215396524L));
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(C0200av.m970a(-75298049971372L), context.getResources().getString(R.string.notification_channel_error), 4);
                notificationChannel.setShowBadge(false);
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                notificationManager.createNotificationChannel(notificationChannel);
                a6Var = new C0009a6(context, C0200av.m970a(-75409719121068L));
                a6Var.f42m = C0200av.m970a(-75521388270764L);
            } else {
                a6Var = new C0009a6(context, C0200av.m970a(-75633057420460L));
                a6Var.f37h = 0;
                a6Var.f43n = 0;
            }
            a6Var.f45p.icon = R.drawable.small_icon_error;
            a6Var.mo44d(context.getResources().getString(R.string.threadpool_unresponsive_warning_notification_title));
            a6Var.mo43c(context.getResources().getString(R.string.threadpool_unresponsive_warning_notification_content));
            a6Var.mo45e(BitmapFactory.decodeResource(context.getResources(), R.drawable.status_error));
            a6Var.f35f = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 134217728);
            notificationManager.notify(HeadphonesMonitorService.f1750f, a6Var.mo42a());
            handler.post(new C1432yt(context));
            handler.postDelayed(new C0199au(context), 5000);
        }
    }

    /* renamed from: b */
    public void mo3811b(Context context, Runnable runnable) {
        if (context != null) {
            this.f3431e = context.getApplicationContext();
        }
        synchronized (this.f3427a) {
            Future<?> submit = this.f3428b.submit(new C1477zt(this, runnable));
            this.f3427a.add(submit);
            this.f3429c.schedule(new C0900a(submit), this.f3430d);
        }
    }
}
