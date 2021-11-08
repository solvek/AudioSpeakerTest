package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Comparator;
import p000.C0860n7;

/* renamed from: m7 */
public class C0808m7 {

    /* renamed from: a */
    public static final C0556h4<String, Typeface> f3220a = new C0556h4<>(16);

    /* renamed from: b */
    public static final C0860n7 f3221b = new C0860n7("fonts", 10, 10000);

    /* renamed from: c */
    public static final Object f3222c = new Object();

    /* renamed from: d */
    public static final C0663j4<String, ArrayList<C0860n7.C0863c<C0812d>>> f3223d = new C0663j4<>();

    /* renamed from: e */
    public static final Comparator<byte[]> f3224e = new C0809a();

    /* renamed from: m7$a */
    public class C0809a implements Comparator<byte[]> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                byte[] r5 = (byte[]) r5
                byte[] r6 = (byte[]) r6
                int r0 = r5.length
                int r1 = r6.length
                r2 = 0
                if (r0 == r1) goto L_0x000c
                int r5 = r5.length
                int r6 = r6.length
                goto L_0x001a
            L_0x000c:
                r0 = 0
            L_0x000d:
                int r1 = r5.length
                if (r0 >= r1) goto L_0x0020
                byte r1 = r5[r0]
                byte r3 = r6[r0]
                if (r1 == r3) goto L_0x001d
                byte r5 = r5[r0]
                byte r6 = r6[r0]
            L_0x001a:
                int r2 = r5 - r6
                goto L_0x0020
            L_0x001d:
                int r0 = r0 + 1
                goto L_0x000d
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0808m7.C0809a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: m7$b */
    public static class C0810b {

        /* renamed from: a */
        public final int f3225a;

        /* renamed from: b */
        public final C0811c[] f3226b;

        public C0810b(int i, C0811c[] cVarArr) {
            this.f3225a = i;
            this.f3226b = cVarArr;
        }
    }

    /* renamed from: m7$c */
    public static class C0811c {

        /* renamed from: a */
        public final Uri f3227a;

        /* renamed from: b */
        public final int f3228b;

        /* renamed from: c */
        public final int f3229c;

        /* renamed from: d */
        public final boolean f3230d;

        /* renamed from: e */
        public final int f3231e;

        public C0811c(Uri uri, int i, int i2, boolean z, int i3) {
            uri.getClass();
            this.f3227a = uri;
            this.f3228b = i;
            this.f3229c = i2;
            this.f3230d = z;
            this.f3231e = i3;
        }
    }

    /* renamed from: m7$d */
    public static final class C0812d {

        /* renamed from: a */
        public final Typeface f3232a;

        /* renamed from: b */
        public final int f3233b;

        public C0812d(Typeface typeface, int i) {
            this.f3232a = typeface;
            this.f3233b = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0808m7.C0810b m2450a(android.content.Context r22, android.os.CancellationSignal r23, p000.C0610i7 r24) {
        /*
            r0 = r24
            android.content.pm.PackageManager r1 = r22.getPackageManager()
            android.content.res.Resources r2 = r22.getResources()
            java.lang.String r3 = r0.f2629a
            r4 = 0
            android.content.pm.ProviderInfo r5 = r1.resolveContentProvider(r3, r4)
            if (r5 == 0) goto L_0x020e
            java.lang.String r6 = r5.packageName
            java.lang.String r7 = r0.f2630b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01ed
            java.lang.String r3 = r5.packageName
            r6 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r6)
            android.content.pm.Signature[] r1 = r1.signatures
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 0
        L_0x002d:
            int r7 = r1.length
            if (r6 >= r7) goto L_0x003c
            r7 = r1[r6]
            byte[] r7 = r7.toByteArray()
            r3.add(r7)
            int r6 = r6 + 1
            goto L_0x002d
        L_0x003c:
            java.util.Comparator<byte[]> r1 = f3224e
            java.util.Collections.sort(r3, r1)
            java.util.List<java.util.List<byte[]>> r1 = r0.f2632d
            if (r1 == 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.util.List r1 = p000.C1344x5.m3733O(r2, r4)
        L_0x004a:
            r2 = 0
        L_0x004b:
            int r6 = r1.size()
            r7 = 0
            r8 = 1
            if (r2 >= r6) goto L_0x0093
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object r9 = r1.get(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            r6.<init>(r9)
            java.util.Comparator<byte[]> r9 = f3224e
            java.util.Collections.sort(r6, r9)
            int r9 = r3.size()
            int r10 = r6.size()
            if (r9 == r10) goto L_0x006e
            goto L_0x0087
        L_0x006e:
            r9 = 0
        L_0x006f:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x008c
            java.lang.Object r10 = r3.get(r9)
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r6.get(r9)
            byte[] r11 = (byte[]) r11
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 != 0) goto L_0x0089
        L_0x0087:
            r6 = 0
            goto L_0x008d
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x006f
        L_0x008c:
            r6 = 1
        L_0x008d:
            if (r6 == 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0093:
            r5 = r7
        L_0x0094:
            if (r5 != 0) goto L_0x009c
            m7$b r0 = new m7$b
            r0.<init>(r8, r7)
            return r0
        L_0x009c:
            java.lang.String r1 = r5.authority
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r5 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r5)
            android.net.Uri$Builder r3 = r3.authority(r1)
            android.net.Uri r3 = r3.build()
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            android.net.Uri$Builder r5 = r6.scheme(r5)
            android.net.Uri$Builder r1 = r5.authority(r1)
            java.lang.String r5 = "file"
            android.net.Uri$Builder r1 = r1.appendPath(r5)
            android.net.Uri r1 = r1.build()
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01e5 }
            r6 = 16
            java.lang.String r7 = "font_variation_settings"
            r9 = 7
            java.lang.String r15 = "result_code"
            java.lang.String r14 = "font_italic"
            java.lang.String r13 = "font_weight"
            java.lang.String r12 = "font_ttc_index"
            java.lang.String r11 = "file_id"
            java.lang.String r10 = "_id"
            r16 = 6
            r17 = 5
            r18 = 4
            r19 = 3
            r20 = 2
            if (r5 <= r6) goto L_0x0121
            android.content.ContentResolver r5 = r22.getContentResolver()     // Catch:{ all -> 0x01e5 }
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ all -> 0x01e5 }
            r6[r4] = r10     // Catch:{ all -> 0x01e5 }
            r6[r8] = r11     // Catch:{ all -> 0x01e5 }
            r6[r20] = r12     // Catch:{ all -> 0x01e5 }
            r6[r19] = r7     // Catch:{ all -> 0x01e5 }
            r6[r18] = r13     // Catch:{ all -> 0x01e5 }
            r6[r17] = r14     // Catch:{ all -> 0x01e5 }
            r6[r16] = r15     // Catch:{ all -> 0x01e5 }
            java.lang.String r7 = "query = ?"
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r0.f2631c     // Catch:{ all -> 0x01e5 }
            r8[r4] = r0     // Catch:{ all -> 0x01e5 }
            r0 = 0
            r4 = 0
            r9 = r5
            r5 = r10
            r10 = r3
            r21 = r11
            r11 = r6
            r6 = r12
            r12 = r7
            r7 = r13
            r13 = r8
            r8 = r14
            r14 = r0
            r0 = r15
            r15 = r4
            android.database.Cursor r4 = r9.query(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01e5 }
            r15 = r0
            r9 = r4
            r4 = r21
            goto L_0x0153
        L_0x0121:
            r5 = r10
            r21 = r11
            r6 = r12
            r8 = r14
            r14 = r13
            android.content.ContentResolver r10 = r22.getContentResolver()     // Catch:{ all -> 0x01e5 }
            java.lang.String[] r11 = new java.lang.String[r9]     // Catch:{ all -> 0x01e5 }
            r11[r4] = r5     // Catch:{ all -> 0x01e5 }
            r9 = 1
            r13 = r21
            r11[r9] = r13     // Catch:{ all -> 0x01e5 }
            r11[r20] = r6     // Catch:{ all -> 0x01e5 }
            r11[r19] = r7     // Catch:{ all -> 0x01e5 }
            r11[r18] = r14     // Catch:{ all -> 0x01e5 }
            r11[r17] = r8     // Catch:{ all -> 0x01e5 }
            r11[r16] = r15     // Catch:{ all -> 0x01e5 }
            java.lang.String r12 = "query = ?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r0.f2631c     // Catch:{ all -> 0x01e5 }
            r7[r4] = r0     // Catch:{ all -> 0x01e5 }
            r0 = 0
            r9 = r10
            r10 = r3
            r4 = r13
            r13 = r7
            r7 = r14
            r14 = r0
            android.database.Cursor r0 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01e5 }
            r9 = r0
        L_0x0153:
            if (r9 == 0) goto L_0x01d1
            int r0 = r9.getCount()     // Catch:{ all -> 0x01cf }
            if (r0 <= 0) goto L_0x01d1
            int r0 = r9.getColumnIndex(r15)     // Catch:{ all -> 0x01cf }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            int r5 = r9.getColumnIndex(r5)     // Catch:{ all -> 0x01cf }
            int r4 = r9.getColumnIndex(r4)     // Catch:{ all -> 0x01cf }
            int r6 = r9.getColumnIndex(r6)     // Catch:{ all -> 0x01cf }
            int r7 = r9.getColumnIndex(r7)     // Catch:{ all -> 0x01cf }
            int r8 = r9.getColumnIndex(r8)     // Catch:{ all -> 0x01cf }
        L_0x0178:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x01cf }
            if (r10 == 0) goto L_0x01d1
            r10 = -1
            if (r0 == r10) goto L_0x0188
            int r11 = r9.getInt(r0)     // Catch:{ all -> 0x01cf }
            r17 = r11
            goto L_0x018b
        L_0x0188:
            r11 = 0
            r17 = 0
        L_0x018b:
            if (r6 == r10) goto L_0x0193
            int r11 = r9.getInt(r6)     // Catch:{ all -> 0x01cf }
            r14 = r11
            goto L_0x0195
        L_0x0193:
            r11 = 0
            r14 = 0
        L_0x0195:
            if (r4 != r10) goto L_0x01a0
            long r11 = r9.getLong(r5)     // Catch:{ all -> 0x01cf }
            android.net.Uri r11 = android.content.ContentUris.withAppendedId(r3, r11)     // Catch:{ all -> 0x01cf }
            goto L_0x01a8
        L_0x01a0:
            long r11 = r9.getLong(r4)     // Catch:{ all -> 0x01cf }
            android.net.Uri r11 = android.content.ContentUris.withAppendedId(r1, r11)     // Catch:{ all -> 0x01cf }
        L_0x01a8:
            r13 = r11
            if (r7 == r10) goto L_0x01b1
            int r11 = r9.getInt(r7)     // Catch:{ all -> 0x01cf }
            r15 = r11
            goto L_0x01b5
        L_0x01b1:
            r11 = 400(0x190, float:5.6E-43)
            r15 = 400(0x190, float:5.6E-43)
        L_0x01b5:
            if (r8 == r10) goto L_0x01c2
            int r10 = r9.getInt(r8)     // Catch:{ all -> 0x01cf }
            r11 = 1
            if (r10 != r11) goto L_0x01c2
            r10 = 1
            r16 = 1
            goto L_0x01c5
        L_0x01c2:
            r10 = 0
            r16 = 0
        L_0x01c5:
            m7$c r10 = new m7$c     // Catch:{ all -> 0x01cf }
            r12 = r10
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01cf }
            r2.add(r10)     // Catch:{ all -> 0x01cf }
            goto L_0x0178
        L_0x01cf:
            r0 = move-exception
            goto L_0x01e7
        L_0x01d1:
            if (r9 == 0) goto L_0x01d6
            r9.close()
        L_0x01d6:
            r0 = 0
            m7$c[] r1 = new p000.C0808m7.C0811c[r0]
            java.lang.Object[] r1 = r2.toArray(r1)
            m7$c[] r1 = (p000.C0808m7.C0811c[]) r1
            m7$b r2 = new m7$b
            r2.<init>(r0, r1)
            return r2
        L_0x01e5:
            r0 = move-exception
            r9 = 0
        L_0x01e7:
            if (r9 == 0) goto L_0x01ec
            r9.close()
        L_0x01ec:
            throw r0
        L_0x01ed:
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Found content provider "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = ", but package was not "
            r2.append(r3)
            java.lang.String r0 = r0.f2630b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x020e:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r1 = "No package found for authority: "
            java.lang.String r1 = p000.C0279ch.m1120q(r1, r3)
            r0.<init>(r1)
            goto L_0x021b
        L_0x021a:
            throw r0
        L_0x021b:
            goto L_0x021a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0808m7.m2450a(android.content.Context, android.os.CancellationSignal, i7):m7$b");
    }

    /* renamed from: b */
    public static C0812d m2451b(Context context, C0610i7 i7Var, int i) {
        try {
            C0810b a = m2450a(context, (CancellationSignal) null, i7Var);
            int i2 = a.f3225a;
            int i3 = -3;
            if (i2 == 0) {
                Typeface b = C1005q6.f3777a.mo4194b(context, (CancellationSignal) null, a.f3226b, i);
                if (b != null) {
                    i3 = 0;
                }
                return new C0812d(b, i3);
            }
            if (i2 == 1) {
                i3 = -2;
            }
            return new C0812d((Typeface) null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0812d((Typeface) null, -1);
        }
    }
}
