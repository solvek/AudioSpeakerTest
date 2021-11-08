package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b6 */
public class C0211b6 {

    /* renamed from: a */
    public final Notification.Builder f1249a;

    /* renamed from: b */
    public final C0009a6 f1250b;

    /* renamed from: c */
    public RemoteViews f1251c;

    /* renamed from: d */
    public final List<Bundle> f1252d = new ArrayList();

    /* renamed from: e */
    public final Bundle f1253e = new Bundle();

    public C0211b6(C0009a6 a6Var) {
        Notification.Builder builder;
        ArrayList<String> arrayList;
        Notification.Action.Builder builder2;
        C0009a6 a6Var2 = a6Var;
        this.f1250b = a6Var2;
        int i = Build.VERSION.SDK_INT;
        Context context = a6Var2.f30a;
        if (i >= 26) {
            String str = a6Var2.f42m;
        } else {
            builder = new Notification.Builder(context);
        }
        this.f1249a = builder;
        Notification notification = a6Var2.f45p;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(a6Var2.f33d).setContentText(a6Var2.f34e).setContentInfo((CharSequence) null).setContentIntent(a6Var2.f35f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : true).setLargeIcon(a6Var2.f36g).setNumber(0).setProgress(0, 0, false);
        if (i < 21) {
            builder.setSound(notification.sound, notification.audioStreamType);
        }
        int i2 = 20;
        if (i >= 16) {
            builder.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(a6Var2.f37h);
            Iterator<C1442z5> it = a6Var2.f31b.iterator();
            while (it.hasNext()) {
                C1442z5 next = it.next();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= i2) {
                    IconCompat a = next.mo5271a();
                    if (i3 >= 23) {
                        builder2 = new Notification.Action.Builder(a != null ? a.mo742f() : null, next.f5270j, next.f5271k);
                    } else {
                        builder2 = new Notification.Action.Builder(a != null ? a.mo739c() : 0, next.f5270j, next.f5271k);
                    }
                    C0366d6[] d6VarArr = next.f5263c;
                    if (d6VarArr != null) {
                        int length = d6VarArr.length;
                        RemoteInput[] remoteInputArr = new RemoteInput[length];
                        if (d6VarArr.length <= 0) {
                            for (int i4 = 0; i4 < length; i4++) {
                                builder2.addRemoteInput(remoteInputArr[i4]);
                            }
                        } else {
                            C0366d6 d6Var = d6VarArr[0];
                            throw null;
                        }
                    }
                    Bundle bundle = next.f5261a != null ? new Bundle(next.f5261a) : new Bundle();
                    bundle.putBoolean("android.support.allowGeneratedReplies", next.f5265e);
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 24) {
                        builder2.setAllowGeneratedReplies(next.f5265e);
                    }
                    bundle.putInt("android.support.action.semanticAction", next.f5267g);
                    if (i5 >= 28) {
                        builder2.setSemanticAction(next.f5267g);
                    }
                    if (i5 >= 29) {
                        builder2.setContextual(next.f5268h);
                    }
                    bundle.putBoolean("android.support.action.showsUserInterface", next.f5266f);
                    builder2.addExtras(bundle);
                    this.f1249a.addAction(builder2.build());
                } else if (i3 >= 16) {
                    List<Bundle> list = this.f1252d;
                    Notification.Builder builder3 = this.f1249a;
                    Object obj = C0257c6.f1340a;
                    IconCompat a2 = next.mo5271a();
                    builder3.addAction(a2 != null ? a2.mo739c() : 0, next.f5270j, next.f5271k);
                    Bundle bundle2 = new Bundle(next.f5261a);
                    C0366d6[] d6VarArr2 = next.f5263c;
                    if (d6VarArr2 != null) {
                        bundle2.putParcelableArray("android.support.remoteInputs", C0257c6.m1063b(d6VarArr2));
                    }
                    C0366d6[] d6VarArr3 = next.f5264d;
                    if (d6VarArr3 != null) {
                        bundle2.putParcelableArray("android.support.dataRemoteInputs", C0257c6.m1063b(d6VarArr3));
                    }
                    bundle2.putBoolean("android.support.allowGeneratedReplies", next.f5265e);
                    list.add(bundle2);
                }
                i2 = 20;
            }
            Bundle bundle3 = a6Var2.f39j;
            if (bundle3 != null) {
                this.f1253e.putAll(bundle3);
            }
            this.f1251c = a6Var2.f41l;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 19) {
            this.f1249a.setShowWhen(a6Var2.f38i);
            if (i6 < 21 && (arrayList = a6Var2.f46q) != null && !arrayList.isEmpty()) {
                Bundle bundle4 = this.f1253e;
                ArrayList<String> arrayList2 = a6Var2.f46q;
                bundle4.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i6 >= 20) {
            this.f1249a.setLocalOnly(false).setGroup((String) null).setGroupSummary(false).setSortKey((String) null);
        }
        if (i6 >= 21) {
            this.f1249a.setCategory((String) null).setColor(0).setVisibility(a6Var2.f40k).setPublicVersion((Notification) null).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = a6Var2.f46q.iterator();
            while (it2.hasNext()) {
                this.f1249a.addPerson(it2.next());
            }
            if (a6Var2.f32c.size() > 0) {
                if (a6Var2.f39j == null) {
                    a6Var2.f39j = new Bundle();
                }
                Bundle bundle5 = a6Var2.f39j.getBundle("android.car.EXTENSIONS");
                bundle5 = bundle5 == null ? new Bundle() : bundle5;
                Bundle bundle6 = new Bundle();
                for (int i7 = 0; i7 < a6Var2.f32c.size(); i7++) {
                    String num = Integer.toString(i7);
                    C1442z5 z5Var = a6Var2.f32c.get(i7);
                    Object obj2 = C0257c6.f1340a;
                    Bundle bundle7 = new Bundle();
                    IconCompat a3 = z5Var.mo5271a();
                    bundle7.putInt("icon", a3 != null ? a3.mo739c() : 0);
                    bundle7.putCharSequence("title", z5Var.f5270j);
                    bundle7.putParcelable("actionIntent", z5Var.f5271k);
                    Bundle bundle8 = z5Var.f5261a != null ? new Bundle(z5Var.f5261a) : new Bundle();
                    bundle8.putBoolean("android.support.allowGeneratedReplies", z5Var.f5265e);
                    bundle7.putBundle("extras", bundle8);
                    bundle7.putParcelableArray("remoteInputs", C0257c6.m1063b(z5Var.f5263c));
                    bundle7.putBoolean("showsUserInterface", z5Var.f5266f);
                    bundle7.putInt("semanticAction", z5Var.f5267g);
                    bundle6.putBundle(num, bundle7);
                }
                bundle5.putBundle("invisible_actions", bundle6);
                if (a6Var2.f39j == null) {
                    a6Var2.f39j = new Bundle();
                }
                a6Var2.f39j.putBundle("android.car.EXTENSIONS", bundle5);
                this.f1253e.putBundle("android.car.EXTENSIONS", bundle5);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            this.f1249a.setExtras(a6Var2.f39j).setRemoteInputHistory((CharSequence[]) null);
            RemoteViews remoteViews = a6Var2.f41l;
            if (remoteViews != null) {
                this.f1249a.setCustomBigContentView(remoteViews);
            }
        }
        if (i8 >= 26) {
            this.f1249a.setBadgeIconType(a6Var2.f43n).setShortcutId((String) null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(a6Var2.f42m)) {
                this.f1249a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i8 >= 29) {
            this.f1249a.setAllowSystemGeneratedContextualActions(a6Var2.f44o);
            this.f1249a.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
    }
}
