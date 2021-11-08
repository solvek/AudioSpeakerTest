package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;

/* renamed from: a6 */
public class C0009a6 {

    /* renamed from: a */
    public Context f30a;

    /* renamed from: b */
    public ArrayList<C1442z5> f31b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<C1442z5> f32c = new ArrayList<>();

    /* renamed from: d */
    public CharSequence f33d;

    /* renamed from: e */
    public CharSequence f34e;

    /* renamed from: f */
    public PendingIntent f35f;

    /* renamed from: g */
    public Bitmap f36g;

    /* renamed from: h */
    public int f37h;

    /* renamed from: i */
    public boolean f38i = true;

    /* renamed from: j */
    public Bundle f39j;

    /* renamed from: k */
    public int f40k = 0;

    /* renamed from: l */
    public RemoteViews f41l;

    /* renamed from: m */
    public String f42m;

    /* renamed from: n */
    public int f43n = 0;

    /* renamed from: o */
    public boolean f44o;

    /* renamed from: p */
    public Notification f45p;
    @Deprecated

    /* renamed from: q */
    public ArrayList<String> f46q;

    public C0009a6(Context context, String str) {
        Notification notification = new Notification();
        this.f45p = notification;
        this.f30a = context;
        this.f42m = str;
        notification.when = System.currentTimeMillis();
        this.f45p.audioStreamType = -1;
        this.f37h = 0;
        this.f46q = new ArrayList<>();
        this.f44o = true;
    }

    /* renamed from: b */
    public static CharSequence m17b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification mo42a() {
        /*
            r8 = this;
            b6 r0 = new b6
            r0.<init>(r8)
            a6 r1 = r0.f1250b
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 21
            r4 = 16
            if (r1 < r2) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            r2 = 24
            if (r1 < r2) goto L_0x0021
        L_0x0019:
            android.app.Notification$Builder r1 = r0.f1249a
            android.app.Notification r1 = r1.build()
            goto L_0x00c3
        L_0x0021:
            if (r1 < r3) goto L_0x0036
            android.app.Notification$Builder r1 = r0.f1249a
            android.os.Bundle r2 = r0.f1253e
            r1.setExtras(r2)
            android.app.Notification$Builder r1 = r0.f1249a
            android.app.Notification r1 = r1.build()
            android.widget.RemoteViews r2 = r0.f1251c
            if (r2 == 0) goto L_0x00c3
            goto L_0x00ba
        L_0x0036:
            r2 = 20
            if (r1 < r2) goto L_0x004c
            android.app.Notification$Builder r1 = r0.f1249a
            android.os.Bundle r2 = r0.f1253e
            r1.setExtras(r2)
            android.app.Notification$Builder r1 = r0.f1249a
            android.app.Notification r1 = r1.build()
            android.widget.RemoteViews r2 = r0.f1251c
            if (r2 == 0) goto L_0x00c3
            goto L_0x00ba
        L_0x004c:
            r2 = 19
            java.lang.String r3 = "android.support.actionExtras"
            if (r1 < r2) goto L_0x0071
            java.util.List<android.os.Bundle> r1 = r0.f1252d
            android.util.SparseArray r1 = p000.C0257c6.m1062a(r1)
            if (r1 == 0) goto L_0x005f
            android.os.Bundle r2 = r0.f1253e
            r2.putSparseParcelableArray(r3, r1)
        L_0x005f:
            android.app.Notification$Builder r1 = r0.f1249a
            android.os.Bundle r2 = r0.f1253e
            r1.setExtras(r2)
            android.app.Notification$Builder r1 = r0.f1249a
            android.app.Notification r1 = r1.build()
            android.widget.RemoteViews r2 = r0.f1251c
            if (r2 == 0) goto L_0x00c3
            goto L_0x00ba
        L_0x0071:
            if (r1 < r4) goto L_0x00bd
            android.app.Notification$Builder r1 = r0.f1249a
            android.app.Notification r1 = r1.build()
            android.os.Bundle r2 = p000.C1344x5.m3779x(r1)
            android.os.Bundle r4 = new android.os.Bundle
            android.os.Bundle r5 = r0.f1253e
            r4.<init>(r5)
            android.os.Bundle r5 = r0.f1253e
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x008e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00a4
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r2.containsKey(r6)
            if (r7 == 0) goto L_0x008e
            r4.remove(r6)
            goto L_0x008e
        L_0x00a4:
            r2.putAll(r4)
            java.util.List<android.os.Bundle> r2 = r0.f1252d
            android.util.SparseArray r2 = p000.C0257c6.m1062a(r2)
            if (r2 == 0) goto L_0x00b6
            android.os.Bundle r4 = p000.C1344x5.m3779x(r1)
            r4.putSparseParcelableArray(r3, r2)
        L_0x00b6:
            android.widget.RemoteViews r2 = r0.f1251c
            if (r2 == 0) goto L_0x00c3
        L_0x00ba:
            r1.bigContentView = r2
            goto L_0x00c3
        L_0x00bd:
            android.app.Notification$Builder r1 = r0.f1249a
            android.app.Notification r1 = r1.getNotification()
        L_0x00c3:
            a6 r0 = r0.f1250b
            r0.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0009a6.mo42a():android.app.Notification");
    }

    /* renamed from: c */
    public C0009a6 mo43c(CharSequence charSequence) {
        this.f34e = m17b(charSequence);
        return this;
    }

    /* renamed from: d */
    public C0009a6 mo44d(CharSequence charSequence) {
        this.f33d = m17b(charSequence);
        return this;
    }

    /* renamed from: e */
    public C0009a6 mo45e(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f30a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d = (double) dimensionPixelSize;
                double max = (double) Math.max(1, bitmap.getWidth());
                Double.isNaN(d);
                Double.isNaN(max);
                Double.isNaN(d);
                Double.isNaN(max);
                double d2 = d / max;
                double d3 = (double) dimensionPixelSize2;
                double max2 = (double) Math.max(1, bitmap.getHeight());
                Double.isNaN(d3);
                Double.isNaN(max2);
                Double.isNaN(d3);
                Double.isNaN(max2);
                double min = Math.min(d2, d3 / max2);
                double width = (double) bitmap.getWidth();
                Double.isNaN(width);
                Double.isNaN(width);
                double height = (double) bitmap.getHeight();
                Double.isNaN(height);
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
            }
        }
        this.f36g = bitmap;
        return this;
    }

    /* renamed from: f */
    public C0009a6 mo46f(boolean z) {
        Notification notification;
        int i;
        if (z) {
            notification = this.f45p;
            i = notification.flags | 2;
        } else {
            notification = this.f45p;
            i = notification.flags & -3;
        }
        notification.flags = i;
        return this;
    }
}
