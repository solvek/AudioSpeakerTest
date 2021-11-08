package com.nordskog.LesserAudioSwitch.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import android.widget.RemoteViews;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import com.nordskog.LesserAudioSwitch.p002ui.GenericUnlockActivity;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.Executors;
import p000.C1426yp;

public class HeadphonesMonitorService extends Service implements C1426yp.C1427a {

    /* renamed from: b */
    public static boolean f1746b = false;

    /* renamed from: c */
    public static boolean f1747c = true;

    /* renamed from: d */
    public static C0341b f1748d = null;

    /* renamed from: e */
    public static int f1749e = ((int) (System.currentTimeMillis() / 1000));

    /* renamed from: f */
    public static int f1750f = ((int) (System.currentTimeMillis() / 1002));

    /* renamed from: g */
    public static int f1751g = ((int) (System.currentTimeMillis() / 1003));

    /* renamed from: h */
    public static int f1752h = ((int) (System.currentTimeMillis() / 1004));

    /* renamed from: com.nordskog.LesserAudioSwitch.service.HeadphonesMonitorService$a */
    public class C0340a implements C0341b {
        public C0340a() {
        }
    }

    /* renamed from: com.nordskog.LesserAudioSwitch.service.HeadphonesMonitorService$b */
    public interface C0341b {
    }

    static {
        C0200av.m970a(-77153475843244L);
        C0200av.m970a(-77213605385388L);
        C0200av.m970a(-77359634273452L);
        C0200av.m970a(-77501368194220L);
    }

    public HeadphonesMonitorService() {
        new HashSet();
        new Timer();
        Executors.newFixedThreadPool(1);
    }

    @SuppressLint({"NewApi", "RestrictedApi"})
    /* renamed from: a */
    public final void mo2542a(C0788lo loVar) {
        C0009a6 a6Var;
        C0348cp cpVar;
        boolean z;
        RemoteViews remoteViews;
        int identifier;
        PendingIntent pendingIntent;
        String str;
        String str2;
        byte hashCode;
        NotificationChannel notificationChannel;
        C0788lo loVar2 = loVar;
        C0200av.m970a(-72948702860460L);
        C0200av.m970a(-73008832402604L);
        loVar.toString();
        C0200av.m970a(-73090436781228L);
        C0200av.m970a(-73150566323372L);
        if (C0728kh.m2277F(this)) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(C0200av.m970a(-73232170701996L));
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i < 26) {
                a6Var = new C0009a6(this, C0200av.m970a(-74550725661868L));
                a6Var.mo46f(true);
                a6Var.f45p.when = 0;
                a6Var.f37h = 0;
                a6Var.f43n = 0;
            } else if (C0697ju.m2195r(this)) {
                C0200av.m970a(-73288005276844L);
                C0200av.m970a(-73348134818988L);
                NotificationChannel notificationChannel2 = new NotificationChannel(C0200av.m970a(-73421149263020L), getResources().getString(R.string.notification_channel_default), 3);
                notificationChannel2.setShowBadge(false);
                notificationChannel2.setSound((Uri) null, (AudioAttributes) null);
                notificationManager.createNotificationChannel(notificationChannel2);
                a6Var = new C0009a6(this, C0200av.m970a(-73567178151084L));
                a6Var.mo46f(true);
                a6Var.f45p.when = 0;
                a6Var.f42m = C0200av.m970a(-73713207039148L);
            } else {
                C0200av.m970a(-73859235927212L);
                C0200av.m970a(-73919365469356L);
                if (i < 28) {
                    String a = C0200av.m970a(-73983789978796L);
                    String string = getResources().getString(R.string.notification_channel_low);
                } else {
                    notificationChannel = new NotificationChannel(C0200av.m970a(-74125523899564L), getResources().getString(R.string.notification_channel_low), 1);
                }
                notificationChannel.setLockscreenVisibility(-1);
                notificationChannel.setShowBadge(false);
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                notificationChannel.setLockscreenVisibility(-1);
                notificationManager.createNotificationChannel(notificationChannel);
                a6Var = new C0009a6(this, C0200av.m970a(-74267257820332L));
                a6Var.mo46f(true);
                a6Var.f45p.when = 0;
                if (i < 28) {
                    a6Var.f42m = C0200av.m970a(-74408991741100L);
                    a6Var.f37h = -1;
                    a6Var.f40k = -1;
                }
            }
            if (C0697ju.m2195r(this)) {
                a6Var.mo44d(getResources().getString(R.string.title_audio_status));
            }
            a6Var.f45p.icon = loVar2.f3182a.f4320g;
            if (C0697ju.m2195r(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append(getResources().getString(loVar2.f3182a.f4315b));
                sb.append(" | ");
                sb.append(getResources().getString(loVar2.f3183b.f4038c));
                if (C0697ju.m2194q(this)) {
                    sb.append(" | ");
                    sb.append(getResources().getString(loVar2.f3184c ? R.string.status_output_unmuted : R.string.status_output_muted));
                }
                a6Var.mo43c(sb.toString());
                a6Var.mo45e(BitmapFactory.decodeResource(getResources(), loVar2.f3182a.f4317d));
                if (i >= 16) {
                    ArrayList arrayList = new ArrayList();
                    String str3 = C1384xo.f5119a;
                    int i2 = C1425yo.f5206a;
                    String string2 = getSharedPreferences(C0200av.m970a(-37364898813100L), 0).getString(Integer.toHexString(str3.hashCode()), (String) null);
                    if (string2 == null || string2.isEmpty()) {
                        cpVar = new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g);
                    } else {
                        if (!string2.isEmpty()) {
                            byte[] decode = Base64.decode(string2, 0);
                            if (C0391dp.f1915a == null) {
                                C0391dp.f1915a = Settings.Secure.getString(getContentResolver(), C0200av.m970a(-70479096665260L));
                            }
                            if (C0391dp.f1915a == null) {
                                C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                            }
                            String str4 = C0391dp.f1915a;
                            byte b = 5;
                            if (!(str4 == null || str4.isEmpty() || (hashCode = (byte) str4.hashCode()) == 0)) {
                                b = hashCode;
                            }
                            byte b2 = (byte) (b * -1);
                            C0495fu.m1724a(decode);
                            byte[] bArr = new byte[decode.length];
                            for (int i3 = 0; i3 < decode.length; i3++) {
                                int i4 = decode[i3] + b2;
                                if (i4 > 127) {
                                    i4 -= 256;
                                } else if (i4 < -128) {
                                    i4 += 256;
                                }
                                bArr[i3] = (byte) i4;
                            }
                            C0495fu.m1724a(bArr);
                            string2 = Build.VERSION.SDK_INT >= 19 ? new String(bArr, StandardCharsets.UTF_8) : new String(bArr);
                        }
                        String[] split = string2.split(C0200av.m970a(-38004848940204L));
                        cpVar = split.length != 4 ? new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g) : new C0348cp(split[0], split[1], split[2], split[3], C0433ep.f2029a);
                    }
                    String str5 = C0391dp.f1915a;
                    String str6 = cpVar.f1827a;
                    if (!((str6 == null || str6.isEmpty() || (str = cpVar.f1828b) == null || str.isEmpty() || (str2 = cpVar.f1829c) == null || str2.isEmpty() || cpVar.f1831e == null) ? false : true)) {
                        C0544go goVar = C0433ep.f2030b;
                        String.valueOf(goVar);
                        cpVar.f1832f = goVar;
                        z = false;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cpVar.f1827a);
                        sb2.append(cpVar.f1828b);
                        boolean equals = C0279ch.m1122s(sb2, cpVar.f1829c).equals(cpVar.f1830d);
                        if (!equals) {
                            C0200av.m970a(-70015240197292L);
                            C0200av.m970a(-70036715033772L);
                        }
                        C0544go goVar2 = equals ? C0433ep.f2039k : C0433ep.f2031c;
                        String.valueOf(goVar2);
                        cpVar.f1832f = goVar2;
                        z = equals;
                    }
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        C1385xp.values();
                        if (i5 >= 7) {
                            break;
                        }
                        C1385xp xpVar = C1385xp.values()[i5];
                        if (!(xpVar == C1385xp.MUTE || xpVar == C1385xp.UNMUTE)) {
                            if (xpVar.f5135f.mo4551a(this)) {
                                if (z) {
                                    pendingIntent = SoundBroadcastReceiver.m1386f(this, xpVar.f5135f);
                                } else {
                                    int i7 = GenericUnlockActivity.f1761o;
                                    pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, GenericUnlockActivity.class), 134217728);
                                }
                                C1129so soVar = xpVar.f5135f;
                                arrayList.add(new C1442z5(soVar.f4320g, getString(soVar.f4316c), pendingIntent));
                                i6++;
                            }
                            if (i6 >= 3) {
                                break;
                            }
                        }
                        i5++;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a6Var.f31b.add((C1442z5) it.next());
                    }
                    try {
                        Notification a2 = a6Var.mo42a();
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 16) {
                            if (i8 >= 24) {
                                remoteViews = Notification.Builder.recoverBuilder(this, a2).createBigContentView();
                            } else {
                                remoteViews = a2.bigContentView;
                                if (remoteViews != null) {
                                }
                            }
                            identifier = getResources().getIdentifier(C0200av.m970a(-74696754549932L), C0200av.m970a(-74774063961260L), C0200av.m970a(-74786948863148L));
                            if (identifier < 1 && (identifier = getResources().getIdentifier(C0200av.m970a(-74821308601516L), C0200av.m970a(-74855668339884L), C0200av.m970a(-74868553241772L))) < 1) {
                                identifier = R.id.action_container;
                            }
                            RemoteViews g = C0728kh.m2291g(this);
                            remoteViews.removeAllViews(identifier);
                            remoteViews.addView(identifier, g);
                            a6Var.f31b.clear();
                            a6Var.f41l = remoteViews;
                        }
                        remoteViews = null;
                        identifier = getResources().getIdentifier(C0200av.m970a(-74696754549932L), C0200av.m970a(-74774063961260L), C0200av.m970a(-74786948863148L));
                        identifier = R.id.action_container;
                        RemoteViews g2 = C0728kh.m2291g(this);
                        remoteViews.removeAllViews(identifier);
                        remoteViews.addView(identifier, g2);
                        a6Var.f31b.clear();
                        a6Var.f41l = remoteViews;
                    } catch (Exception e) {
                        C0200av.m970a(-74902912980140L);
                        C0200av.m970a(-74963042522284L);
                        e.printStackTrace();
                    }
                }
            }
            a6Var.f35f = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 134217728);
            boolean z3 = f1747c;
            f1747c = C0697ju.m2195r(this);
            if (Build.VERSION.SDK_INT >= 28) {
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                int length = activeNotifications.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        z2 = false;
                        break;
                    } else if (activeNotifications[i9].getId() == f1749e) {
                        break;
                    } else {
                        i9++;
                    }
                }
                if (z2 && z3 == f1747c) {
                    notificationManager.notify(f1749e, a6Var.mo42a());
                    return;
                }
            }
            startForeground(f1749e, a6Var.mo42a());
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final void mo2543b() {
        C0009a6 a6Var;
        NotificationChannel notificationChannel;
        C0200av.m970a(-71290845484204L);
        C0200av.m970a(-71350975026348L);
        if (C0728kh.m2277F(this)) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(C0200av.m970a(-71484119012524L));
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                a6Var = new C0009a6(this, C0200av.m970a(-72802673972396L));
                a6Var.mo46f(true);
                a6Var.f45p.when = 0;
                a6Var.f37h = 0;
                a6Var.f43n = 0;
            } else if (C0697ju.m2195r(this)) {
                C0200av.m970a(-71539953587372L);
                C0200av.m970a(-71600083129516L);
                NotificationChannel notificationChannel2 = new NotificationChannel(C0200av.m970a(-71673097573548L), getResources().getString(R.string.notification_channel_default), 3);
                notificationChannel2.setShowBadge(false);
                notificationChannel2.setSound((Uri) null, (AudioAttributes) null);
                notificationManager.createNotificationChannel(notificationChannel2);
                a6Var = new C0009a6(this, C0200av.m970a(-71819126461612L));
                a6Var.mo46f(true);
                a6Var.f45p.when = 0;
                a6Var.f42m = C0200av.m970a(-71965155349676L);
            } else {
                C0200av.m970a(-72111184237740L);
                C0200av.m970a(-72171313779884L);
                if (i < 28) {
                    String a = C0200av.m970a(-72235738289324L);
                    String string = getResources().getString(R.string.notification_channel_low);
                } else {
                    notificationChannel = new NotificationChannel(C0200av.m970a(-72377472210092L), getResources().getString(R.string.notification_channel_low), 1);
                }
                notificationChannel.setLockscreenVisibility(-1);
                notificationChannel.setShowBadge(false);
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                notificationChannel.setLockscreenVisibility(-1);
                notificationManager.createNotificationChannel(notificationChannel);
                a6Var = new C0009a6(this, C0200av.m970a(-72519206130860L));
                a6Var.mo46f(true);
                a6Var.f45p.when = 0;
                if (i < 28) {
                    a6Var.f42m = C0200av.m970a(-72660940051628L);
                    a6Var.f37h = -1;
                    a6Var.f40k = -1;
                }
            }
            if (C0697ju.m2195r(this)) {
                a6Var.mo44d(getResources().getString(R.string.title_audio_status));
            }
            a6Var.f45p.icon = R.drawable.small_icon_speakers;
            a6Var.f35f = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 134217728);
            f1747c = C0697ju.m2195r(this);
            startForeground(f1749e, a6Var.mo42a());
        }
    }

    /* renamed from: c */
    public void mo2544c() {
        if (!C0728kh.m2277F(this)) {
            C0200av.m970a(-76749748917420L);
            C0200av.m970a(-76809878459564L);
            stopForeground(true);
        }
        boolean z = false;
        if (C0697ju.m2178a(this) || C0697ju.m2195r(this) || C0697ju.f2934b.mo3309a(this, false)) {
            z = true;
        }
        C1426yp b = C1426yp.m3890b(this);
        if (z) {
            b.mo5220e(this, true);
        } else {
            b.mo5221f(this);
        }
    }

    /* renamed from: i */
    public void mo2545i(C0788lo loVar) {
        if (f1746b && C0728kh.m2277F(this)) {
            mo2542a(loVar);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        C0200av.m970a(-70891413525676L);
        C0200av.m970a(-70951543067820L);
        f1746b = true;
        if (C0728kh.m2277F(this)) {
            mo2543b();
        }
        C0200av.m970a(-71024557511852L);
        C0200av.m970a(-71084687053996L);
        mo2544c();
        f1748d = new C0340a();
    }

    public void onDestroy() {
        C0200av.m970a(-71153406530732L);
        C0200av.m970a(-71213536072876L);
        C1426yp.m3890b(this).mo5221f(this);
        f1746b = false;
        f1748d = null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C0200av.m970a(-70732499735724L);
        C0200av.m970a(-70792629277868L);
        super.onStartCommand(intent, i, i2);
        if (C0728kh.m2277F(this)) {
            mo2543b();
        }
        mo2544c();
        return 1;
    }
}
