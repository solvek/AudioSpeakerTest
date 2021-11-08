package com.example.audiospeakertest.hack;

import android.os.Build;

/* renamed from: kh */
public final class C0728kh {
    /* renamed from: E */
    public static short m2276E(short s, int i) {
        return (short) ((s >>> (32 - i)) | (s << i));
    }

    /* renamed from: a */
    public static boolean m2285a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: f */
    public static float m2290f(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: h */
    public static long m2292h(int i, String[] strArr, long j) {
        return (((long) strArr[i / 8191].charAt(i % 8191)) << 32) ^ m2308x(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = r2.getColor(r3, -1);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m2295k(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p000.C0399e0.m1529a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 15
            if (r1 > r0) goto L_0x0026
            r1 = -1
            int r0 = r2.getColor(r3, r1)
            if (r0 == r1) goto L_0x0026
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            return r1
        L_0x0026:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0728kh.m2295k(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p000.C0399e0.m1530b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m2297m(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = p000.C0399e0.m1530b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0728kh.m2297m(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: p */
    public static String m2300p() {
        return C0200av.m970a(-57796058240172L);
    }

    /* renamed from: q */
    public static String m2301q() {
        return C0200av.m970a(-58779605750956L);
    }

    /* renamed from: u */
    public static boolean m2305u() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: w */
    public static float m2307w(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* renamed from: x */
    public static long m2308x(long j) {
        short s = (short) ((int) (j & 65535));
        short s2 = (short) ((int) ((j >>> 16) & 65535));
        short s3 = (short) (s2 ^ s);
        return ((((long) m2276E(s3, 10)) | (((long) ((short) (m2276E((short) (s + s2), 9) + s))) << 16)) << 16) | ((long) ((short) (((short) (m2276E(s, 13) ^ s3)) ^ (s3 << 5))));
    }
}