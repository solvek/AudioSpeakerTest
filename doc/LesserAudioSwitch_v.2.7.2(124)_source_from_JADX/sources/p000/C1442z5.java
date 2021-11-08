package p000;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: z5 */
public class C1442z5 {

    /* renamed from: a */
    public final Bundle f5261a;

    /* renamed from: b */
    public IconCompat f5262b;

    /* renamed from: c */
    public final C0366d6[] f5263c;

    /* renamed from: d */
    public final C0366d6[] f5264d;

    /* renamed from: e */
    public boolean f5265e;

    /* renamed from: f */
    public boolean f5266f;

    /* renamed from: g */
    public final int f5267g;

    /* renamed from: h */
    public final boolean f5268h;
    @Deprecated

    /* renamed from: i */
    public int f5269i;

    /* renamed from: j */
    public CharSequence f5270j;

    /* renamed from: k */
    public PendingIntent f5271k;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1442z5(int r10, java.lang.CharSequence r11, android.app.PendingIntent r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0005
            r10 = r0
            goto L_0x000b
        L_0x0005:
            java.lang.String r1 = ""
            androidx.core.graphics.drawable.IconCompat r10 = androidx.core.graphics.drawable.IconCompat.m253b(r0, r1, r10)
        L_0x000b:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r9.<init>()
            r2 = 1
            r9.f5266f = r2
            r9.f5262b = r10
            r3 = 0
            if (r10 == 0) goto L_0x0072
            int r4 = r10.f637a
            r5 = -1
            if (r4 != r5) goto L_0x0069
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r6 < r7) goto L_0x0069
            java.lang.Object r4 = r10.f638b
            android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
            r7 = 28
            if (r6 < r7) goto L_0x0033
            int r4 = r4.getType()
            goto L_0x0069
        L_0x0033:
            java.lang.Class r6 = r4.getClass()     // Catch:{ IllegalAccessException -> 0x0058, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x004c }
            java.lang.String r7 = "getType"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException -> 0x0058, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x004c }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch:{ IllegalAccessException -> 0x0058, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x004c }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0058, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x004c }
            java.lang.Object r6 = r6.invoke(r4, r7)     // Catch:{ IllegalAccessException -> 0x0058, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x004c }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ IllegalAccessException -> 0x0058, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x004c }
            int r4 = r6.intValue()     // Catch:{ IllegalAccessException -> 0x0058, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x004c }
            goto L_0x0069
        L_0x004c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            goto L_0x005d
        L_0x0052:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            goto L_0x005d
        L_0x0058:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L_0x005d:
            java.lang.String r7 = "Unable to get icon type "
            r6.append(r7)
            r6.append(r4)
            r6.toString()
            r4 = -1
        L_0x0069:
            r5 = 2
            if (r4 != r5) goto L_0x0072
            int r10 = r10.mo739c()
            r9.f5269i = r10
        L_0x0072:
            java.lang.CharSequence r10 = p000.C0009a6.m17b(r11)
            r9.f5270j = r10
            r9.f5271k = r12
            r9.f5261a = r1
            r9.f5263c = r0
            r9.f5264d = r0
            r9.f5265e = r2
            r9.f5267g = r3
            r9.f5266f = r2
            r9.f5268h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1442z5.<init>(int, java.lang.CharSequence, android.app.PendingIntent):void");
    }

    /* renamed from: a */
    public IconCompat mo5271a() {
        int i;
        if (this.f5262b == null && (i = this.f5269i) != 0) {
            this.f5262b = IconCompat.m253b((Resources) null, "", i);
        }
        return this.f5262b;
    }
}
