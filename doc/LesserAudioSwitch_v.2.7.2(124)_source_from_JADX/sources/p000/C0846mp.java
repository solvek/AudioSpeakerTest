package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;
import com.nordskog.LesserAudioSwitch.service.HeadphonesMonitorService;
import p000.C0936oo;

/* renamed from: mp */
public final /* synthetic */ class C0846mp implements C0936oo.C0940d {

    /* renamed from: a */
    public final /* synthetic */ C1274vp f3320a;

    public /* synthetic */ C0846mp(C1274vp vpVar) {
        this.f3320a = vpVar;
    }

    /* renamed from: a */
    public final void mo3305a(boolean z) {
        C0009a6 a6Var;
        C1274vp vpVar = this.f3320a;
        vpVar.getClass();
        if (z) {
            C0550gu.m1819a("LAS ActiveStatusMonitor", "Unable to re-disable speaker, displaying warning.");
            C1324wp wpVar = vpVar.f4839b;
            wpVar.f4982d = true;
            if (wpVar.f4979a != null) {
                Handler handler = new Handler(Looper.getMainLooper());
                Context context = wpVar.f4979a;
                boolean z2 = HeadphonesMonitorService.f1746b;
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(C0200av.m970a(-76247237743788L));
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel(C0200av.m970a(-76303072318636L), context.getResources().getString(R.string.notification_channel_error), 4);
                    notificationChannel.setShowBadge(false);
                    notificationManager.createNotificationChannel(notificationChannel);
                    a6Var = new C0009a6(context, C0200av.m970a(-76414741468332L));
                    a6Var.f42m = C0200av.m970a(-76526410618028L);
                } else {
                    a6Var = new C0009a6(context, C0200av.m970a(-76638079767724L));
                    a6Var.f37h = 0;
                    a6Var.f43n = 0;
                }
                Notification notification = a6Var.f45p;
                notification.defaults = 2;
                notification.icon = R.drawable.small_icon_error;
                a6Var.mo44d(context.getResources().getString(R.string.speaker_unexpectedly_unmuted_notification_warning_title));
                a6Var.mo43c(context.getResources().getString(R.string.speaker_unexpectedly_unmuted_notification_warning_content));
                a6Var.mo45e(BitmapFactory.decodeResource(context.getResources(), R.drawable.status_error));
                a6Var.f35f = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 134217728);
                notificationManager.notify(HeadphonesMonitorService.f1751g, a6Var.mo42a());
                handler.post(new C0988pp(context));
                handler.postDelayed(new C0941op(context), 5000);
            }
            vpVar.f4839b.mo5019c();
            return;
        }
        C0550gu.m1820b("LAS ActiveStatusMonitor", "Speaker successfully re-disabled");
    }
}
