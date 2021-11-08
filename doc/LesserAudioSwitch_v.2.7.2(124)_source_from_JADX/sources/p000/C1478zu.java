package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import java.util.Set;

/* renamed from: zu */
public class C1478zu {

    /* renamed from: a */
    public static final int[] f5370a = {R.id.widget_mute_button, R.id.widget_speakers_button, R.id.widget_headphones_button, R.id.widget_bluetooth_button, R.id.widget_usb_button, R.id.widget_cast_button, R.id.widget_unmute_button};

    /* renamed from: b */
    public static final int[] f5371b = {32, 1, 2, 4, 8, 16, 64};

    /* renamed from: a */
    public static RemoteViews m3994a(Context context, Set<Integer> set, boolean z) {
        PendingIntent pendingIntent;
        RemoteViews remoteViews = z ? new RemoteViews(context.getPackageName(), R.layout.widget_layout_boring) : new RemoteViews(context.getPackageName(), R.layout.widget_layout);
        for (int i : f5370a) {
            if (!set.contains(Integer.valueOf(i))) {
                remoteViews.setViewVisibility(i, 8);
            } else {
                switch (i) {
                    case R.id.widget_bluetooth_button /*2131231183*/:
                        pendingIntent = SoundBroadcastReceiver.m1382b(context);
                        break;
                    case R.id.widget_cast_button /*2131231185*/:
                        pendingIntent = SoundBroadcastReceiver.m1383c(context);
                        break;
                    case R.id.widget_headphones_button /*2131231190*/:
                        pendingIntent = SoundBroadcastReceiver.m1384d(context);
                        break;
                    case R.id.widget_mute_button /*2131231191*/:
                        pendingIntent = SoundBroadcastReceiver.m1385e(context);
                        break;
                    case R.id.widget_unmute_button /*2131231194*/:
                        pendingIntent = SoundBroadcastReceiver.m1388h(context);
                        break;
                    case R.id.widget_usb_button /*2131231195*/:
                        pendingIntent = SoundBroadcastReceiver.m1389i(context);
                        break;
                    default:
                        pendingIntent = SoundBroadcastReceiver.m1387g(context);
                        break;
                }
                remoteViews.setOnClickPendingIntent(i, pendingIntent);
            }
        }
        return remoteViews;
    }
}
