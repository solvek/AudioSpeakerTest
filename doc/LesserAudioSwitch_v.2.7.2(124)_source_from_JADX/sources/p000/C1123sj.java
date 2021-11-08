package p000;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: sj */
public class C1123sj extends BaseAdapter {

    /* renamed from: f */
    public static final int f4261f = C1463zj.m3974e().getMaximum(4);

    /* renamed from: b */
    public final C1064rj f4262b;

    /* renamed from: c */
    public final C0281cj<?> f4263c;

    /* renamed from: d */
    public C0224bj f4264d;

    /* renamed from: e */
    public final C1459zi f4265e;

    public C1123sj(C1064rj rjVar, C0281cj<?> cjVar, C1459zi ziVar) {
        this.f4262b = rjVar;
        this.f4263c = cjVar;
        this.f4265e = ziVar;
    }

    /* renamed from: a */
    public int mo4517a() {
        return this.f4262b.mo4263n();
    }

    /* renamed from: b */
    public Long getItem(int i) {
        if (i < this.f4262b.mo4263n() || i > mo4519c()) {
            return null;
        }
        C1064rj rjVar = this.f4262b;
        Calendar b = C1463zj.m3971b(rjVar.f3966b);
        b.set(5, (i - rjVar.mo4263n()) + 1);
        return Long.valueOf(b.getTimeInMillis());
    }

    /* renamed from: c */
    public int mo4519c() {
        return (this.f4262b.mo4263n() + this.f4262b.f3971g) - 1;
    }

    public int getCount() {
        return mo4517a() + this.f4262b.f3971g;
    }

    public long getItemId(int i) {
        return (long) (i / this.f4262b.f3970f);
    }

    /* JADX WARNING: type inference failed for: r9v28, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            android.content.Context r0 = r10.getContext()
            bj r1 = r7.f4264d
            if (r1 != 0) goto L_0x000f
            bj r1 = new bj
            r1.<init>(r0)
            r7.f4264d = r1
        L_0x000f:
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r9 != 0) goto L_0x0027
            android.content.Context r9 = r10.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r0 = 2131427402(0x7f0b004a, float:1.847642E38)
            android.view.View r9 = r9.inflate(r0, r10, r1)
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r9 = r7.mo4517a()
            int r9 = r8 - r9
            r10 = 1
            if (r9 < 0) goto L_0x00dc
            rj r2 = r7.f4262b
            int r3 = r2.f3971g
            if (r9 < r3) goto L_0x0038
            goto L_0x00dc
        L_0x0038:
            int r9 = r9 + r10
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r0.setText(r2)
            rj r2 = r7.f4262b
            java.util.Calendar r2 = r2.f3966b
            java.util.Calendar r2 = p000.C1463zj.m3971b(r2)
            r3 = 5
            r2.set(r3, r9)
            long r2 = r2.getTimeInMillis()
            rj r9 = r7.f4262b
            int r9 = r9.f3969e
            rj r4 = p000.C1064rj.m3029m()
            int r4 = r4.f3969e
            java.lang.String r5 = "UTC"
            r6 = 24
            if (r9 != r4) goto L_0x009b
            java.util.Locale r9 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x0084
            java.util.concurrent.atomic.AtomicReference<yj> r4 = p000.C1463zj.f5327a
            java.lang.String r4 = "MMMEd"
            android.icu.text.DateFormat r9 = android.icu.text.DateFormat.getInstanceForSkeleton(r4, r9)
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getTimeZone(r5)
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x00d2
        L_0x0084:
            java.util.concurrent.atomic.AtomicReference<yj> r4 = p000.C1463zj.f5327a
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r1, r9)
            java.util.TimeZone r4 = p000.C1463zj.m3972c()
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x00d2
        L_0x009b:
            java.util.Locale r9 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x00bc
            java.util.concurrent.atomic.AtomicReference<yj> r4 = p000.C1463zj.f5327a
            java.lang.String r4 = "yMMMEd"
            android.icu.text.DateFormat r9 = android.icu.text.DateFormat.getInstanceForSkeleton(r4, r9)
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getTimeZone(r5)
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x00d2
        L_0x00bc:
            java.util.concurrent.atomic.AtomicReference<yj> r4 = p000.C1463zj.f5327a
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r1, r9)
            java.util.TimeZone r4 = p000.C1463zj.m3972c()
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
        L_0x00d2:
            r0.setContentDescription(r9)
            r0.setVisibility(r1)
            r0.setEnabled(r10)
            goto L_0x00e4
        L_0x00dc:
            r9 = 8
            r0.setVisibility(r9)
            r0.setEnabled(r1)
        L_0x00e4:
            java.lang.Long r8 = r7.getItem(r8)
            if (r8 != 0) goto L_0x00eb
            goto L_0x014f
        L_0x00eb:
            zi r9 = r7.f4265e
            zi$c r9 = r9.f5318e
            long r2 = r8.longValue()
            boolean r9 = r9.mo2664i(r2)
            if (r9 == 0) goto L_0x0145
            r0.setEnabled(r10)
            cj<?> r9 = r7.f4263c
            java.util.Collection r9 = r9.mo1774h()
            java.util.Iterator r9 = r9.iterator()
        L_0x0106:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x012b
            java.lang.Object r10 = r9.next()
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            long r3 = r8.longValue()
            long r3 = p000.C1463zj.m3970a(r3)
            long r1 = p000.C1463zj.m3970a(r1)
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 != 0) goto L_0x0106
            bj r8 = r7.f4264d
            aj r8 = r8.f1277b
            goto L_0x014c
        L_0x012b:
            java.util.Calendar r9 = p000.C1463zj.m3973d()
            long r9 = r9.getTimeInMillis()
            long r1 = r8.longValue()
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x0140
            bj r8 = r7.f4264d
            aj r8 = r8.f1278c
            goto L_0x014c
        L_0x0140:
            bj r8 = r7.f4264d
            aj r8 = r8.f1276a
            goto L_0x014c
        L_0x0145:
            r0.setEnabled(r1)
            bj r8 = r7.f4264d
            aj r8 = r8.f1282g
        L_0x014c:
            r8.mo119b(r0)
        L_0x014f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1123sj.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }
}
