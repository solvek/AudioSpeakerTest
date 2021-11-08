package p000;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: ej */
public class C0425ej extends BaseAdapter {

    /* renamed from: e */
    public static final int f2002e = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: b */
    public final Calendar f2003b;

    /* renamed from: c */
    public final int f2004c;

    /* renamed from: d */
    public final int f2005d;

    public C0425ej() {
        Calendar e = C1463zj.m3974e();
        this.f2003b = e;
        this.f2004c = e.getMaximum(7);
        this.f2005d = e.getFirstDayOfWeek();
    }

    public int getCount() {
        return this.f2004c;
    }

    public Object getItem(int i) {
        int i2 = this.f2004c;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f2005d;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131427403(0x7f0b004b, float:1.8476421E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            java.util.Calendar r7 = r5.f2003b
            int r2 = r5.f2005d
            int r6 = r6 + r2
            int r2 = r5.f2004c
            if (r6 <= r2) goto L_0x0022
            int r6 = r6 - r2
        L_0x0022:
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.f2003b
            int r7 = f2002e
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2131689640(0x7f0f00a8, float:1.9008301E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f2003b
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0425ej.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
