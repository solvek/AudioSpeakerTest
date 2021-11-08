package p000;

import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C1196u4;
import p000.C1236v4;

/* renamed from: e */
public final class C0398e {

    /* renamed from: a */
    public static Field f1923a;

    /* renamed from: b */
    public static boolean f1924b;

    /* renamed from: c */
    public static Class<?> f1925c;

    /* renamed from: d */
    public static boolean f1926d;

    /* renamed from: e */
    public static Field f1927e;

    /* renamed from: f */
    public static boolean f1928f;

    /* renamed from: g */
    public static Field f1929g;

    /* renamed from: h */
    public static boolean f1930h;

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0237, code lost:
        if (r9[r8].f4584d.f4582b == r15) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r0[r5] != 2) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f6, code lost:
        if (r5[r13].f4584d.f4582b == r4) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0477 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0248 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1517a(p000.C1292w4 r30, p000.C0955p4 r31, int r32) {
        /*
            r0 = r30
            r1 = r31
            r2 = r32
            v4$a r3 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            r4 = 2
            if (r2 != 0) goto L_0x0011
            int r6 = r0.f4902m0
            t4[] r7 = r0.f4905p0
            r8 = 0
            goto L_0x0016
        L_0x0011:
            int r6 = r0.f4903n0
            t4[] r7 = r0.f4904o0
            r8 = 2
        L_0x0016:
            r10 = r0
            r11 = r1
            r9 = 0
        L_0x0019:
            if (r9 >= r6) goto L_0x0485
            r12 = r7[r9]
            boolean r13 = r12.f4378q
            r14 = 0
            r16 = 0
            r5 = 1
            if (r13 != 0) goto L_0x0133
            int r13 = r12.f4373l
            int r13 = r13 * 2
            v4 r4 = r12.f4362a
            r18 = r4
            r19 = 0
        L_0x002f:
            if (r19 != 0) goto L_0x010e
            int r15 = r12.f4370i
            int r15 = r15 + r5
            r12.f4370i = r15
            v4[] r15 = r4.f4744h0
            int r5 = r12.f4373l
            r15[r5] = r14
            v4[] r15 = r4.f4742g0
            r15[r5] = r14
            int r15 = r4.f4727Y
            r14 = 8
            if (r15 == r14) goto L_0x00cd
            v4 r14 = r12.f4363b
            if (r14 != 0) goto L_0x004c
            r12.f4363b = r4
        L_0x004c:
            r12.f4365d = r4
            v4$a[] r14 = r4.f4705C
            r0 = r14[r5]
            if (r0 != r3) goto L_0x00cd
            int[] r0 = r4.f4741g
            r22 = r0[r5]
            r23 = r6
            r6 = 3
            if (r22 == 0) goto L_0x006d
            r22 = r7
            r7 = r0[r5]
            if (r7 == r6) goto L_0x006f
            r7 = r0[r5]
            r6 = 2
            if (r7 != r6) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            r25 = r11
            goto L_0x00d2
        L_0x006d:
            r22 = r7
        L_0x006f:
            int r6 = r12.f4371j
            r7 = 1
            int r6 = r6 + r7
            r12.f4371j = r6
            float[] r6 = r4.f4740f0
            r7 = r6[r5]
            int r25 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r25 <= 0) goto L_0x0087
            r25 = r11
            float r11 = r12.f4372k
            r6 = r6[r5]
            float r11 = r11 + r6
            r12.f4372k = r11
            goto L_0x0089
        L_0x0087:
            r25 = r11
        L_0x0089:
            r6 = 8
            if (r15 == r6) goto L_0x009c
            r6 = r14[r5]
            if (r6 != r3) goto L_0x009c
            r6 = r0[r5]
            if (r6 == 0) goto L_0x009a
            r0 = r0[r5]
            r5 = 3
            if (r0 != r5) goto L_0x009c
        L_0x009a:
            r0 = 1
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r0 == 0) goto L_0x00ba
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a7
            r0 = 1
            r12.f4375n = r0
            goto L_0x00aa
        L_0x00a7:
            r0 = 1
            r12.f4376o = r0
        L_0x00aa:
            java.util.ArrayList<v4> r0 = r12.f4369h
            if (r0 != 0) goto L_0x00b5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f4369h = r0
        L_0x00b5:
            java.util.ArrayList<v4> r0 = r12.f4369h
            r0.add(r4)
        L_0x00ba:
            v4 r0 = r12.f4367f
            if (r0 != 0) goto L_0x00c0
            r12.f4367f = r4
        L_0x00c0:
            v4 r0 = r12.f4368g
            if (r0 == 0) goto L_0x00ca
            v4[] r0 = r0.f4742g0
            int r5 = r12.f4373l
            r0[r5] = r4
        L_0x00ca:
            r12.f4368g = r4
            goto L_0x00d2
        L_0x00cd:
            r23 = r6
            r22 = r7
            goto L_0x0069
        L_0x00d2:
            r0 = r18
            if (r0 == r4) goto L_0x00dc
            v4[] r0 = r0.f4744h0
            int r5 = r12.f4373l
            r0[r5] = r4
        L_0x00dc:
            u4[] r0 = r4.f4703A
            int r5 = r13 + 1
            r0 = r0[r5]
            u4 r0 = r0.f4584d
            if (r0 == 0) goto L_0x00f8
            v4 r0 = r0.f4582b
            u4[] r5 = r0.f4703A
            r6 = r5[r13]
            u4 r6 = r6.f4584d
            if (r6 == 0) goto L_0x00f8
            r5 = r5[r13]
            u4 r5 = r5.f4584d
            v4 r5 = r5.f4582b
            if (r5 == r4) goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            if (r0 == 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r0 = r4
            r19 = 1
        L_0x00ff:
            r18 = r4
            r7 = r22
            r6 = r23
            r11 = r25
            r5 = 1
            r14 = 0
            r4 = r0
            r0 = r30
            goto L_0x002f
        L_0x010e:
            r23 = r6
            r22 = r7
            r25 = r11
            r12.f4364c = r4
            int r0 = r12.f4373l
            if (r0 != 0) goto L_0x0121
            boolean r0 = r12.f4374m
            if (r0 == 0) goto L_0x0121
            r12.f4366e = r4
            goto L_0x0125
        L_0x0121:
            v4 r0 = r12.f4362a
            r12.f4366e = r0
        L_0x0125:
            boolean r0 = r12.f4376o
            if (r0 == 0) goto L_0x012f
            boolean r0 = r12.f4375n
            if (r0 == 0) goto L_0x012f
            r0 = 1
            goto L_0x0130
        L_0x012f:
            r0 = 0
        L_0x0130:
            r12.f4377p = r0
            goto L_0x0139
        L_0x0133:
            r23 = r6
            r22 = r7
            r25 = r11
        L_0x0139:
            r0 = 1
            r12.f4378q = r0
            r0 = 4
            boolean r0 = r10.mo4960I(r0)
            if (r0 == 0) goto L_0x046c
            v4$a r0 = p000.C1236v4.C1237a.WRAP_CONTENT
            v4 r4 = r12.f4362a
            v4 r5 = r12.f4364c
            v4 r6 = r12.f4363b
            v4 r7 = r12.f4365d
            v4 r11 = r12.f4366e
            float r13 = r12.f4372k
            v4$a[] r10 = r10.f4705C
            r10 = r10[r2]
            if (r2 != 0) goto L_0x016f
            int r10 = r11.f4736d0
            r14 = 1
            if (r10 != 0) goto L_0x015f
            r20 = 1
            goto L_0x0161
        L_0x015f:
            r20 = 0
        L_0x0161:
            if (r10 != r14) goto L_0x0165
            r11 = 1
            goto L_0x0166
        L_0x0165:
            r11 = 0
        L_0x0166:
            r15 = 2
            if (r10 != r15) goto L_0x016c
            r10 = r20
            goto L_0x0181
        L_0x016c:
            r10 = r20
            goto L_0x0185
        L_0x016f:
            r14 = 1
            r15 = 2
            int r10 = r11.f4738e0
            if (r10 != 0) goto L_0x0177
            r11 = 1
            goto L_0x0178
        L_0x0177:
            r11 = 0
        L_0x0178:
            if (r10 != r14) goto L_0x017c
            r14 = 1
            goto L_0x017d
        L_0x017c:
            r14 = 0
        L_0x017d:
            if (r10 != r15) goto L_0x0183
            r10 = r11
            r11 = r14
        L_0x0181:
            r14 = 1
            goto L_0x0186
        L_0x0183:
            r10 = r11
            r11 = r14
        L_0x0185:
            r14 = 0
        L_0x0186:
            r15 = r4
            r19 = r9
            r26 = r12
            r9 = 0
            r12 = 0
            r17 = 0
            r24 = 0
            r25 = 0
        L_0x0193:
            if (r17 != 0) goto L_0x0248
            int r1 = r15.f4727Y
            r27 = r13
            r13 = 8
            if (r1 == r13) goto L_0x01e1
            int r9 = r9 + 1
            if (r2 != 0) goto L_0x01a6
            int r1 = r15.mo4825n()
            goto L_0x01aa
        L_0x01a6:
            int r1 = r15.mo4819h()
        L_0x01aa:
            float r1 = (float) r1
            float r24 = r24 + r1
            if (r15 == r6) goto L_0x01ba
            u4[] r1 = r15.f4703A
            r1 = r1[r8]
            int r1 = r1.mo4768b()
            float r1 = (float) r1
            float r24 = r24 + r1
        L_0x01ba:
            if (r15 == r7) goto L_0x01c9
            u4[] r1 = r15.f4703A
            int r13 = r8 + 1
            r1 = r1[r13]
            int r1 = r1.mo4768b()
            float r1 = (float) r1
            float r24 = r24 + r1
        L_0x01c9:
            u4[] r1 = r15.f4703A
            r1 = r1[r8]
            int r1 = r1.mo4768b()
            float r1 = (float) r1
            float r25 = r25 + r1
            u4[] r1 = r15.f4703A
            int r13 = r8 + 1
            r1 = r1[r13]
            int r1 = r1.mo4768b()
            float r1 = (float) r1
            float r25 = r25 + r1
        L_0x01e1:
            u4[] r1 = r15.f4703A
            r13 = r1[r8]
            int r13 = r15.f4727Y
            r28 = r9
            r9 = 8
            if (r13 == r9) goto L_0x021f
            v4$a[] r9 = r15.f4705C
            r9 = r9[r2]
            if (r9 != r3) goto L_0x021f
            int r12 = r12 + 1
            if (r2 != 0) goto L_0x0205
            int r9 = r15.f4737e
            if (r9 == 0) goto L_0x01fc
            goto L_0x0219
        L_0x01fc:
            int r9 = r15.f4743h
            if (r9 != 0) goto L_0x0219
            int r9 = r15.f4745i
            if (r9 == 0) goto L_0x0213
            goto L_0x0219
        L_0x0205:
            int r9 = r15.f4739f
            if (r9 == 0) goto L_0x020a
            goto L_0x0219
        L_0x020a:
            int r9 = r15.f4747k
            if (r9 != 0) goto L_0x0219
            int r9 = r15.f4748l
            if (r9 == 0) goto L_0x0213
            goto L_0x0219
        L_0x0213:
            float r9 = r15.f4709G
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x021f
        L_0x0219:
            r15 = r31
            r21 = r3
            goto L_0x0463
        L_0x021f:
            int r9 = r8 + 1
            r1 = r1[r9]
            u4 r1 = r1.f4584d
            if (r1 == 0) goto L_0x0239
            v4 r1 = r1.f4582b
            u4[] r9 = r1.f4703A
            r13 = r9[r8]
            u4 r13 = r13.f4584d
            if (r13 == 0) goto L_0x0239
            r9 = r9[r8]
            u4 r9 = r9.f4584d
            v4 r9 = r9.f4582b
            if (r9 == r15) goto L_0x023a
        L_0x0239:
            r1 = 0
        L_0x023a:
            if (r1 == 0) goto L_0x023e
            r15 = r1
            goto L_0x0240
        L_0x023e:
            r17 = 1
        L_0x0240:
            r1 = r31
            r13 = r27
            r9 = r28
            goto L_0x0193
        L_0x0248:
            r27 = r13
            u4[] r1 = r4.f4703A
            r1 = r1[r8]
            b5 r1 = r1.f4581a
            u4[] r13 = r5.f4703A
            int r17 = r8 + 1
            r13 = r13[r17]
            b5 r13 = r13.f4581a
            r21 = r3
            b5 r3 = r1.f1239d
            if (r3 == 0) goto L_0x0461
            r28 = r4
            b5 r4 = r13.f1239d
            if (r4 != 0) goto L_0x0266
            goto L_0x0461
        L_0x0266:
            int r3 = r3.f1879b
            r29 = r5
            r5 = 1
            if (r3 != r5) goto L_0x0461
            int r3 = r4.f1879b
            if (r3 == r5) goto L_0x0273
            goto L_0x0461
        L_0x0273:
            if (r12 <= 0) goto L_0x0279
            if (r12 == r9) goto L_0x0279
            goto L_0x0461
        L_0x0279:
            if (r14 != 0) goto L_0x0282
            if (r10 != 0) goto L_0x0282
            if (r11 == 0) goto L_0x0280
            goto L_0x0282
        L_0x0280:
            r3 = 0
            goto L_0x029b
        L_0x0282:
            if (r6 == 0) goto L_0x028e
            u4[] r3 = r6.f4703A
            r3 = r3[r8]
            int r3 = r3.mo4768b()
            float r3 = (float) r3
            goto L_0x028f
        L_0x028e:
            r3 = 0
        L_0x028f:
            if (r7 == 0) goto L_0x029b
            u4[] r4 = r7.f4703A
            r4 = r4[r17]
            int r4 = r4.mo4768b()
            float r4 = (float) r4
            float r3 = r3 + r4
        L_0x029b:
            b5 r4 = r1.f1239d
            float r4 = r4.f1242g
            b5 r5 = r13.f1239d
            float r5 = r5.f1242g
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x02a9
            float r5 = r5 - r4
            goto L_0x02ab
        L_0x02a9:
            float r5 = r4 - r5
        L_0x02ab:
            float r5 = r5 - r24
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 <= 0) goto L_0x033b
            if (r12 != r9) goto L_0x033b
            v4 r3 = r15.f4706D
            if (r3 == 0) goto L_0x02bf
            v4$a[] r3 = r3.f4705C
            r3 = r3[r2]
            if (r3 != r0) goto L_0x02bf
            goto L_0x0461
        L_0x02bf:
            float r5 = r5 + r24
            float r5 = r5 - r25
            r0 = r4
            r4 = r28
        L_0x02c6:
            if (r4 == 0) goto L_0x0337
            v4[] r3 = r4.f4744h0
            r3 = r3[r2]
            r13 = r29
            if (r3 != 0) goto L_0x02d6
            if (r4 != r13) goto L_0x02d3
            goto L_0x02d6
        L_0x02d3:
            r15 = r31
            goto L_0x0333
        L_0x02d6:
            float r6 = (float) r12
            float r6 = r5 / r6
            int r9 = (r27 > r16 ? 1 : (r27 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x02ed
            float[] r6 = r4.f4740f0
            r9 = r6[r2]
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x02e7
            r6 = 0
            goto L_0x02ed
        L_0x02e7:
            r6 = r6[r2]
            float r6 = r6 * r5
            float r6 = r6 / r27
        L_0x02ed:
            int r9 = r4.f4727Y
            r10 = 8
            if (r9 != r10) goto L_0x02f4
            r6 = 0
        L_0x02f4:
            u4[] r9 = r4.f4703A
            r9 = r9[r8]
            int r9 = r9.mo4768b()
            float r9 = (float) r9
            float r0 = r0 + r9
            u4[] r9 = r4.f4703A
            r9 = r9[r8]
            b5 r9 = r9.f4581a
            b5 r10 = r1.f1241f
            r9.mo1580j(r10, r0)
            u4[] r9 = r4.f4703A
            r9 = r9[r17]
            b5 r9 = r9.f4581a
            b5 r10 = r1.f1241f
            float r0 = r0 + r6
            r9.mo1580j(r10, r0)
            u4[] r6 = r4.f4703A
            r6 = r6[r8]
            b5 r6 = r6.f4581a
            r15 = r31
            r6.mo1575e(r15)
            u4[] r6 = r4.f4703A
            r6 = r6[r17]
            b5 r6 = r6.f4581a
            r6.mo1575e(r15)
            u4[] r4 = r4.f4703A
            r4 = r4[r17]
            int r4 = r4.mo4768b()
            float r4 = (float) r4
            float r0 = r0 + r4
        L_0x0333:
            r4 = r3
            r29 = r13
            goto L_0x02c6
        L_0x0337:
            r15 = r31
            goto L_0x03b6
        L_0x033b:
            r15 = r31
            r13 = r29
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0346
            r10 = 0
            r11 = 0
            r14 = 1
        L_0x0346:
            if (r14 == 0) goto L_0x03af
            float r5 = r5 - r3
            if (r2 != 0) goto L_0x0350
            r0 = r28
            float r7 = r0.f4724V
            goto L_0x0357
        L_0x0350:
            r0 = r28
            r3 = 1
            if (r2 != r3) goto L_0x0357
            float r7 = r0.f4725W
        L_0x0357:
            float r5 = r5 * r7
            float r5 = r5 + r4
        L_0x035a:
            r4 = r0
            if (r4 == 0) goto L_0x03b6
            v4[] r0 = r4.f4744h0
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0365
            if (r4 != r13) goto L_0x035a
        L_0x0365:
            if (r2 != 0) goto L_0x036c
            int r3 = r4.mo4825n()
            goto L_0x0370
        L_0x036c:
            int r3 = r4.mo4819h()
        L_0x0370:
            float r3 = (float) r3
            u4[] r6 = r4.f4703A
            r6 = r6[r8]
            int r6 = r6.mo4768b()
            float r6 = (float) r6
            float r5 = r5 + r6
            u4[] r6 = r4.f4703A
            r6 = r6[r8]
            b5 r6 = r6.f4581a
            b5 r7 = r1.f1241f
            r6.mo1580j(r7, r5)
            u4[] r6 = r4.f4703A
            r6 = r6[r17]
            b5 r6 = r6.f4581a
            b5 r7 = r1.f1241f
            float r5 = r5 + r3
            r6.mo1580j(r7, r5)
            u4[] r3 = r4.f4703A
            r3 = r3[r8]
            b5 r3 = r3.f4581a
            r3.mo1575e(r15)
            u4[] r3 = r4.f4703A
            r3 = r3[r17]
            b5 r3 = r3.f4581a
            r3.mo1575e(r15)
            u4[] r3 = r4.f4703A
            r3 = r3[r17]
            int r3 = r3.mo4768b()
            float r3 = (float) r3
            float r5 = r5 + r3
            goto L_0x035a
        L_0x03af:
            r0 = r28
            if (r10 != 0) goto L_0x03b9
            if (r11 == 0) goto L_0x03b6
            goto L_0x03b9
        L_0x03b6:
            r7 = 1
            goto L_0x045f
        L_0x03b9:
            if (r10 == 0) goto L_0x03bc
            goto L_0x03be
        L_0x03bc:
            if (r11 == 0) goto L_0x03bf
        L_0x03be:
            float r5 = r5 - r3
        L_0x03bf:
            int r3 = r9 + 1
            float r3 = (float) r3
            float r3 = r5 / r3
            if (r11 == 0) goto L_0x03d1
            r7 = 1
            if (r9 <= r7) goto L_0x03cd
            int r3 = r9 + -1
            float r3 = (float) r3
            goto L_0x03cf
        L_0x03cd:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03cf:
            float r3 = r5 / r3
        L_0x03d1:
            int r5 = r0.f4727Y
            r7 = 8
            if (r5 == r7) goto L_0x03da
            float r5 = r4 + r3
            goto L_0x03db
        L_0x03da:
            r5 = r4
        L_0x03db:
            r7 = 1
            if (r11 == 0) goto L_0x03ea
            if (r9 <= r7) goto L_0x03ea
            u4[] r5 = r6.f4703A
            r5 = r5[r8]
            int r5 = r5.mo4768b()
            float r5 = (float) r5
            float r5 = r5 + r4
        L_0x03ea:
            if (r10 == 0) goto L_0x03f8
            if (r6 == 0) goto L_0x03f8
            u4[] r4 = r6.f4703A
            r4 = r4[r8]
            int r4 = r4.mo4768b()
            float r4 = (float) r4
            float r5 = r5 + r4
        L_0x03f8:
            r4 = r0
        L_0x03f9:
            if (r4 == 0) goto L_0x045f
            v4[] r0 = r4.f4744h0
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0403
            if (r4 != r13) goto L_0x03f8
        L_0x0403:
            if (r2 != 0) goto L_0x040a
            int r9 = r4.mo4825n()
            goto L_0x040e
        L_0x040a:
            int r9 = r4.mo4819h()
        L_0x040e:
            float r9 = (float) r9
            if (r4 == r6) goto L_0x041b
            u4[] r10 = r4.f4703A
            r10 = r10[r8]
            int r10 = r10.mo4768b()
            float r10 = (float) r10
            float r5 = r5 + r10
        L_0x041b:
            u4[] r10 = r4.f4703A
            r10 = r10[r8]
            b5 r10 = r10.f4581a
            b5 r11 = r1.f1241f
            r10.mo1580j(r11, r5)
            u4[] r10 = r4.f4703A
            r10 = r10[r17]
            b5 r10 = r10.f4581a
            b5 r11 = r1.f1241f
            float r12 = r5 + r9
            r10.mo1580j(r11, r12)
            u4[] r10 = r4.f4703A
            r10 = r10[r8]
            b5 r10 = r10.f4581a
            r10.mo1575e(r15)
            u4[] r10 = r4.f4703A
            r10 = r10[r17]
            b5 r10 = r10.f4581a
            r10.mo1575e(r15)
            u4[] r4 = r4.f4703A
            r4 = r4[r17]
            int r4 = r4.mo4768b()
            float r4 = (float) r4
            float r9 = r9 + r4
            float r9 = r9 + r5
            if (r0 == 0) goto L_0x045a
            int r4 = r0.f4727Y
            r5 = 8
            if (r4 == r5) goto L_0x045c
            float r9 = r9 + r3
            goto L_0x045c
        L_0x045a:
            r5 = 8
        L_0x045c:
            r4 = r0
            r5 = r9
            goto L_0x03f9
        L_0x045f:
            r5 = 1
            goto L_0x0464
        L_0x0461:
            r15 = r31
        L_0x0463:
            r5 = 0
        L_0x0464:
            r10 = r30
            r11 = r15
            if (r5 != 0) goto L_0x0477
            r0 = r26
            goto L_0x0474
        L_0x046c:
            r15 = r1
            r21 = r3
            r19 = r9
            r0 = r12
            r11 = r25
        L_0x0474:
            m1518b(r10, r11, r2, r8, r0)
        L_0x0477:
            int r9 = r19 + 1
            r0 = r30
            r1 = r15
            r3 = r21
            r7 = r22
            r6 = r23
            r4 = 2
            goto L_0x0019
        L_0x0485:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0398e.m1517a(w4, p4, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: v4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: r4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: r4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: v4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: r4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: v4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: r4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: v4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: v4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: r4} */
    /* JADX WARNING: type inference failed for: r5v10, types: [r4] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x03c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1518b(p000.C1292w4 r33, p000.C0955p4 r34, int r35, int r36, p000.C1148t4 r37) {
        /*
            r0 = r33
            r9 = r34
            r1 = r37
            v4 r10 = r1.f4362a
            v4 r11 = r1.f4364c
            v4 r12 = r1.f4363b
            v4 r13 = r1.f4365d
            v4 r2 = r1.f4366e
            float r3 = r1.f4372k
            v4$a[] r4 = r0.f4705C
            r4 = r4[r35]
            v4$a r5 = p000.C1236v4.C1237a.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r35 != 0) goto L_0x0030
            int r8 = r2.f4736d0
            if (r8 != 0) goto L_0x0027
            r14 = 1
            goto L_0x0028
        L_0x0027:
            r14 = 0
        L_0x0028:
            if (r8 != r7) goto L_0x002c
            r15 = 1
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r8 != r5) goto L_0x0040
            goto L_0x003e
        L_0x0030:
            int r8 = r2.f4738e0
            if (r8 != 0) goto L_0x0036
            r14 = 1
            goto L_0x0037
        L_0x0036:
            r14 = 0
        L_0x0037:
            if (r8 != r7) goto L_0x003b
            r15 = 1
            goto L_0x003c
        L_0x003b:
            r15 = 0
        L_0x003c:
            if (r8 != r5) goto L_0x0040
        L_0x003e:
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r7 = r10
            r8 = 0
        L_0x0043:
            r17 = 0
            if (r8 != 0) goto L_0x0116
            u4[] r6 = r7.f4703A
            r6 = r6[r36]
            if (r4 != 0) goto L_0x0053
            if (r5 == 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r23 = 4
            goto L_0x0055
        L_0x0053:
            r23 = 1
        L_0x0055:
            int r24 = r6.mo4768b()
            r25 = r3
            u4 r3 = r6.f4584d
            if (r3 == 0) goto L_0x0067
            if (r7 == r10) goto L_0x0067
            int r3 = r3.mo4768b()
            int r24 = r3 + r24
        L_0x0067:
            r3 = r24
            if (r5 == 0) goto L_0x0075
            if (r7 == r10) goto L_0x0075
            if (r7 == r12) goto L_0x0075
            r24 = r8
            r23 = r15
            r8 = 6
            goto L_0x0085
        L_0x0075:
            if (r14 == 0) goto L_0x007f
            if (r4 == 0) goto L_0x007f
            r24 = r8
            r23 = r15
            r8 = 4
            goto L_0x0085
        L_0x007f:
            r24 = r8
            r8 = r23
            r23 = r15
        L_0x0085:
            u4 r15 = r6.f4584d
            if (r15 == 0) goto L_0x00ae
            if (r7 != r12) goto L_0x0098
            r26 = r14
            r4 r14 = r6.f4589i
            r4 r15 = r15.f4589i
            r27 = r2
            r2 = 5
            r9.mo3955f(r14, r15, r3, r2)
            goto L_0x00a4
        L_0x0098:
            r27 = r2
            r26 = r14
            r4 r2 = r6.f4589i
            r4 r14 = r15.f4589i
            r15 = 6
            r9.mo3955f(r2, r14, r3, r15)
        L_0x00a4:
            r4 r2 = r6.f4589i
            u4 r6 = r6.f4584d
            r4 r6 = r6.f4589i
            r9.mo3953d(r2, r6, r3, r8)
            goto L_0x00b2
        L_0x00ae:
            r27 = r2
            r26 = r14
        L_0x00b2:
            if (r4 == 0) goto L_0x00e5
            int r2 = r7.f4727Y
            r3 = 8
            if (r2 == r3) goto L_0x00d4
            v4$a[] r2 = r7.f4705C
            r2 = r2[r35]
            v4$a r3 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00d4
            u4[] r2 = r7.f4703A
            int r3 = r36 + 1
            r3 = r2[r3]
            r4 r3 = r3.f4589i
            r2 = r2[r36]
            r4 r2 = r2.f4589i
            r6 = 5
            r8 = 0
            r9.mo3955f(r3, r2, r8, r6)
            goto L_0x00d5
        L_0x00d4:
            r8 = 0
        L_0x00d5:
            u4[] r2 = r7.f4703A
            r2 = r2[r36]
            r4 r2 = r2.f4589i
            u4[] r3 = r0.f4703A
            r3 = r3[r36]
            r4 r3 = r3.f4589i
            r6 = 6
            r9.mo3955f(r2, r3, r8, r6)
        L_0x00e5:
            u4[] r2 = r7.f4703A
            int r3 = r36 + 1
            r2 = r2[r3]
            u4 r2 = r2.f4584d
            if (r2 == 0) goto L_0x0104
            v4 r2 = r2.f4582b
            u4[] r3 = r2.f4703A
            r6 = r3[r36]
            u4 r6 = r6.f4584d
            if (r6 == 0) goto L_0x0104
            r3 = r3[r36]
            u4 r3 = r3.f4584d
            v4 r3 = r3.f4582b
            if (r3 == r7) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r17 = r2
        L_0x0104:
            if (r17 == 0) goto L_0x010b
            r7 = r17
            r8 = r24
            goto L_0x010c
        L_0x010b:
            r8 = 1
        L_0x010c:
            r15 = r23
            r3 = r25
            r14 = r26
            r2 = r27
            goto L_0x0043
        L_0x0116:
            r27 = r2
            r25 = r3
            r26 = r14
            r23 = r15
            if (r13 == 0) goto L_0x0140
            u4[] r2 = r11.f4703A
            int r3 = r36 + 1
            r6 = r2[r3]
            u4 r6 = r6.f4584d
            if (r6 == 0) goto L_0x0140
            u4[] r6 = r13.f4703A
            r6 = r6[r3]
            r4 r7 = r6.f4589i
            r2 = r2[r3]
            u4 r2 = r2.f4584d
            r4 r2 = r2.f4589i
            int r3 = r6.mo4768b()
            int r3 = -r3
            r6 = 5
            r9.mo3956g(r7, r2, r3, r6)
            goto L_0x0141
        L_0x0140:
            r6 = 5
        L_0x0141:
            if (r4 == 0) goto L_0x015b
            u4[] r0 = r0.f4703A
            int r2 = r36 + 1
            r0 = r0[r2]
            r4 r0 = r0.f4589i
            u4[] r3 = r11.f4703A
            r4 = r3[r2]
            r4 r4 = r4.f4589i
            r2 = r3[r2]
            int r2 = r2.mo4768b()
            r3 = 6
            r9.mo3955f(r0, r4, r2, r3)
        L_0x015b:
            java.util.ArrayList<v4> r0 = r1.f4369h
            if (r0 == 0) goto L_0x026f
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x026f
            boolean r4 = r1.f4375n
            if (r4 == 0) goto L_0x0172
            boolean r4 = r1.f4377p
            if (r4 != 0) goto L_0x0172
            int r4 = r1.f4371j
            float r4 = (float) r4
            goto L_0x0174
        L_0x0172:
            r4 = r25
        L_0x0174:
            r7 = 0
            r14 = r17
            r8 = 0
            r15 = 0
        L_0x0179:
            if (r8 >= r2) goto L_0x026f
            java.lang.Object r16 = r0.get(r8)
            r3 = r16
            v4 r3 = (p000.C1236v4) r3
            float[] r6 = r3.f4740f0
            r6 = r6[r35]
            r24 = r0
            int r25 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r25 >= 0) goto L_0x01a6
            boolean r6 = r1.f4377p
            if (r6 == 0) goto L_0x01a4
            u4[] r0 = r3.f4703A
            int r3 = r36 + 1
            r3 = r0[r3]
            r4 r3 = r3.f4589i
            r0 = r0[r36]
            r4 r0 = r0.f4589i
            r6 = 4
            r7 = 0
            r9.mo3953d(r3, r0, r7, r6)
            r6 = 6
            goto L_0x01be
        L_0x01a4:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x01a6:
            r7 = 4
            r20 = 0
            int r25 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r25 != 0) goto L_0x01c6
            u4[] r0 = r3.f4703A
            int r3 = r36 + 1
            r3 = r0[r3]
            r4 r3 = r3.f4589i
            r0 = r0[r36]
            r4 r0 = r0.f4589i
            r6 = 6
            r7 = 0
            r9.mo3953d(r3, r0, r7, r6)
        L_0x01be:
            r29 = r2
            r30 = r11
            r18 = 6
            goto L_0x0260
        L_0x01c6:
            r7 = 0
            r18 = 6
            if (r14 == 0) goto L_0x0257
            u4[] r14 = r14.f4703A
            r7 = r14[r36]
            r4 r7 = r7.f4589i
            int r25 = r36 + 1
            r14 = r14[r25]
            r4 r14 = r14.f4589i
            u4[] r0 = r3.f4703A
            r29 = r2
            r2 = r0[r36]
            r4 r2 = r2.f4589i
            r0 = r0[r25]
            r4 r0 = r0.f4589i
            r25 = r3
            m4 r3 = r34.mo3962m()
            r1 = 0
            r3.f3214b = r1
            r30 = r11
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r31 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r31 == 0) goto L_0x0239
            int r31 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r31 != 0) goto L_0x01f9
            goto L_0x0239
        L_0x01f9:
            int r31 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r31 != 0) goto L_0x020a
            l4 r0 = r3.f3215c
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mo3589h(r7, r2)
            l4 r0 = r3.f3215c
            r0.mo3589h(r14, r11)
            goto L_0x0253
        L_0x020a:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r28 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r28 != 0) goto L_0x021d
            l4 r7 = r3.f3215c
            r7.mo3589h(r2, r11)
            l4 r2 = r3.f3215c
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mo3589h(r0, r7)
            goto L_0x0253
        L_0x021d:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r15 = r15 / r4
            float r28 = r6 / r4
            float r15 = r15 / r28
            l4 r1 = r3.f3215c
            r1.mo3589h(r7, r11)
            l4 r1 = r3.f3215c
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mo3589h(r14, r7)
            l4 r1 = r3.f3215c
            r1.mo3589h(r0, r15)
            l4 r0 = r3.f3215c
            float r11 = -r15
            goto L_0x0250
        L_0x0239:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            l4 r15 = r3.f3215c
            r15.mo3589h(r7, r11)
            l4 r7 = r3.f3215c
            r7.mo3589h(r14, r1)
            l4 r7 = r3.f3215c
            r7.mo3589h(r0, r11)
            l4 r0 = r3.f3215c
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0250:
            r0.mo3589h(r2, r11)
        L_0x0253:
            r9.mo3952c(r3)
            goto L_0x025d
        L_0x0257:
            r29 = r2
            r25 = r3
            r30 = r11
        L_0x025d:
            r15 = r6
            r14 = r25
        L_0x0260:
            int r8 = r8 + 1
            r1 = r37
            r0 = r24
            r2 = r29
            r11 = r30
            r3 = 1
            r6 = 5
            r7 = 0
            goto L_0x0179
        L_0x026f:
            r30 = r11
            r18 = 6
            if (r12 == 0) goto L_0x02d5
            if (r12 == r13) goto L_0x0279
            if (r5 == 0) goto L_0x02d5
        L_0x0279:
            u4[] r0 = r10.f4703A
            r1 = r0[r36]
            r11 = r30
            u4[] r2 = r11.f4703A
            int r3 = r36 + 1
            r4 = r2[r3]
            r5 = r0[r36]
            u4 r5 = r5.f4584d
            if (r5 == 0) goto L_0x0293
            r0 = r0[r36]
            u4 r0 = r0.f4584d
            r4 r0 = r0.f4589i
            r5 = r0
            goto L_0x0295
        L_0x0293:
            r5 = r17
        L_0x0295:
            r0 = r2[r3]
            u4 r0 = r0.f4584d
            if (r0 == 0) goto L_0x02a3
            r0 = r2[r3]
            u4 r0 = r0.f4584d
            r4 r0 = r0.f4589i
            r6 = r0
            goto L_0x02a5
        L_0x02a3:
            r6 = r17
        L_0x02a5:
            if (r12 != r13) goto L_0x02ad
            u4[] r0 = r12.f4703A
            r1 = r0[r36]
            r4 = r0[r3]
        L_0x02ad:
            if (r5 == 0) goto L_0x04fa
            if (r6 == 0) goto L_0x04fa
            r0 = r27
            if (r35 != 0) goto L_0x02b8
            float r0 = r0.f4724V
            goto L_0x02ba
        L_0x02b8:
            float r0 = r0.f4725W
        L_0x02ba:
            r7 = r0
            int r3 = r1.mo4768b()
            int r8 = r4.mo4768b()
            r4 r1 = r1.f4589i
            r4 r10 = r4.f4589i
            r14 = 5
            r0 = r34
            r2 = r5
            r4 = r7
            r5 = r6
            r6 = r10
            r7 = r8
            r8 = r14
            r0.mo3951b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04fa
        L_0x02d5:
            r11 = r30
            if (r26 == 0) goto L_0x03cd
            if (r12 == 0) goto L_0x03cd
            r0 = r37
            int r1 = r0.f4371j
            if (r1 <= 0) goto L_0x02e8
            int r0 = r0.f4370i
            if (r0 != r1) goto L_0x02e8
            r21 = 1
            goto L_0x02ea
        L_0x02e8:
            r21 = 0
        L_0x02ea:
            r14 = r12
            r15 = r14
        L_0x02ec:
            if (r14 == 0) goto L_0x04fa
            v4[] r0 = r14.f4744h0
            r0 = r0[r35]
            r8 = r0
        L_0x02f3:
            if (r8 == 0) goto L_0x0300
            int r0 = r8.f4727Y
            r6 = 8
            if (r0 != r6) goto L_0x0302
            v4[] r0 = r8.f4744h0
            r8 = r0[r35]
            goto L_0x02f3
        L_0x0300:
            r6 = 8
        L_0x0302:
            if (r8 != 0) goto L_0x030f
            if (r14 != r13) goto L_0x0307
            goto L_0x030f
        L_0x0307:
            r16 = r8
            r18 = 4
            r19 = 6
            goto L_0x03c0
        L_0x030f:
            u4[] r0 = r14.f4703A
            r0 = r0[r36]
            r4 r1 = r0.f4589i
            u4 r2 = r0.f4584d
            if (r2 == 0) goto L_0x031c
            r4 r2 = r2.f4589i
            goto L_0x031e
        L_0x031c:
            r2 = r17
        L_0x031e:
            if (r15 == r14) goto L_0x0327
            u4[] r2 = r15.f4703A
            int r3 = r36 + 1
            r2 = r2[r3]
            goto L_0x0337
        L_0x0327:
            if (r14 != r12) goto L_0x033c
            if (r15 != r14) goto L_0x033c
            u4[] r2 = r10.f4703A
            r3 = r2[r36]
            u4 r3 = r3.f4584d
            if (r3 == 0) goto L_0x033a
            r2 = r2[r36]
            u4 r2 = r2.f4584d
        L_0x0337:
            r4 r2 = r2.f4589i
            goto L_0x033c
        L_0x033a:
            r2 = r17
        L_0x033c:
            int r0 = r0.mo4768b()
            u4[] r3 = r14.f4703A
            int r4 = r36 + 1
            r3 = r3[r4]
            int r3 = r3.mo4768b()
            if (r8 == 0) goto L_0x035e
            u4[] r5 = r8.f4703A
            r5 = r5[r36]
            r4 r7 = r5.f4589i
            u4[] r6 = r14.f4703A
            r6 = r6[r4]
            r4 r6 = r6.f4589i
            r32 = r7
            r7 = r6
            r6 = r32
            goto L_0x0371
        L_0x035e:
            u4[] r5 = r11.f4703A
            r5 = r5[r4]
            u4 r5 = r5.f4584d
            if (r5 == 0) goto L_0x0369
            r4 r6 = r5.f4589i
            goto L_0x036b
        L_0x0369:
            r6 = r17
        L_0x036b:
            u4[] r7 = r14.f4703A
            r7 = r7[r4]
            r4 r7 = r7.f4589i
        L_0x0371:
            if (r5 == 0) goto L_0x0378
            int r5 = r5.mo4768b()
            int r3 = r3 + r5
        L_0x0378:
            if (r15 == 0) goto L_0x0383
            u4[] r5 = r15.f4703A
            r5 = r5[r4]
            int r5 = r5.mo4768b()
            int r0 = r0 + r5
        L_0x0383:
            if (r1 == 0) goto L_0x0307
            if (r2 == 0) goto L_0x0307
            if (r6 == 0) goto L_0x0307
            if (r7 == 0) goto L_0x0307
            if (r14 != r12) goto L_0x0395
            u4[] r0 = r12.f4703A
            r0 = r0[r36]
            int r0 = r0.mo4768b()
        L_0x0395:
            r5 = r0
            if (r14 != r13) goto L_0x03a3
            u4[] r0 = r13.f4703A
            r0 = r0[r4]
            int r0 = r0.mo4768b()
            r16 = r0
            goto L_0x03a5
        L_0x03a3:
            r16 = r3
        L_0x03a5:
            if (r21 == 0) goto L_0x03aa
            r22 = 6
            goto L_0x03ac
        L_0x03aa:
            r22 = 4
        L_0x03ac:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r34
            r3 = r5
            r5 = r6
            r18 = 4
            r19 = 6
            r6 = r7
            r7 = r16
            r16 = r8
            r8 = r22
            r0.mo3951b(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x03c0:
            int r0 = r14.f4727Y
            r8 = 8
            if (r0 == r8) goto L_0x03c7
            r15 = r14
        L_0x03c7:
            r14 = r16
            r18 = 6
            goto L_0x02ec
        L_0x03cd:
            r0 = r37
            r8 = 8
            r18 = 4
            r19 = 6
            if (r23 == 0) goto L_0x04fa
            if (r12 == 0) goto L_0x04fa
            int r1 = r0.f4371j
            if (r1 <= 0) goto L_0x03e4
            int r0 = r0.f4370i
            if (r0 != r1) goto L_0x03e4
            r21 = 1
            goto L_0x03e6
        L_0x03e4:
            r21 = 0
        L_0x03e6:
            r14 = r12
            r15 = r14
        L_0x03e8:
            if (r14 == 0) goto L_0x049c
            v4[] r0 = r14.f4744h0
            r0 = r0[r35]
        L_0x03ee:
            if (r0 == 0) goto L_0x03f9
            int r1 = r0.f4727Y
            if (r1 != r8) goto L_0x03f9
            v4[] r0 = r0.f4744h0
            r0 = r0[r35]
            goto L_0x03ee
        L_0x03f9:
            if (r14 == r12) goto L_0x048b
            if (r14 == r13) goto L_0x048b
            if (r0 == 0) goto L_0x048b
            if (r0 != r13) goto L_0x0404
            r7 = r17
            goto L_0x0405
        L_0x0404:
            r7 = r0
        L_0x0405:
            u4[] r0 = r14.f4703A
            r0 = r0[r36]
            r4 r1 = r0.f4589i
            u4 r2 = r0.f4584d
            u4[] r2 = r15.f4703A
            int r3 = r36 + 1
            r2 = r2[r3]
            r4 r2 = r2.f4589i
            int r0 = r0.mo4768b()
            u4[] r4 = r14.f4703A
            r4 = r4[r3]
            int r4 = r4.mo4768b()
            if (r7 == 0) goto L_0x0433
            u4[] r5 = r7.f4703A
            r5 = r5[r36]
            r4 r6 = r5.f4589i
            u4 r8 = r5.f4584d
            if (r8 == 0) goto L_0x0430
            r4 r8 = r8.f4589i
            goto L_0x044a
        L_0x0430:
            r8 = r17
            goto L_0x044a
        L_0x0433:
            u4[] r5 = r14.f4703A
            r6 = r5[r3]
            u4 r6 = r6.f4584d
            if (r6 == 0) goto L_0x043e
            r4 r8 = r6.f4589i
            goto L_0x0440
        L_0x043e:
            r8 = r17
        L_0x0440:
            r5 = r5[r3]
            r4 r5 = r5.f4589i
            r32 = r8
            r8 = r5
            r5 = r6
            r6 = r32
        L_0x044a:
            if (r5 == 0) goto L_0x0454
            int r5 = r5.mo4768b()
            int r5 = r5 + r4
            r20 = r5
            goto L_0x0456
        L_0x0454:
            r20 = r4
        L_0x0456:
            u4[] r4 = r15.f4703A
            r3 = r4[r3]
            int r3 = r3.mo4768b()
            int r3 = r3 + r0
            if (r21 == 0) goto L_0x0464
            r22 = 6
            goto L_0x0466
        L_0x0464:
            r22 = 4
        L_0x0466:
            if (r1 == 0) goto L_0x0482
            if (r2 == 0) goto L_0x0482
            if (r6 == 0) goto L_0x0482
            if (r8 == 0) goto L_0x0482
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r34
            r5 = r6
            r6 = r8
            r16 = r7
            r7 = r20
            r20 = r15
            r15 = 8
            r8 = r22
            r0.mo3951b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0488
        L_0x0482:
            r16 = r7
            r20 = r15
            r15 = 8
        L_0x0488:
            r0 = r16
            goto L_0x048f
        L_0x048b:
            r20 = r15
            r15 = 8
        L_0x048f:
            int r1 = r14.f4727Y
            if (r1 == r15) goto L_0x0494
            goto L_0x0496
        L_0x0494:
            r14 = r20
        L_0x0496:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x03e8
        L_0x049c:
            u4[] r0 = r12.f4703A
            r0 = r0[r36]
            u4[] r1 = r10.f4703A
            r1 = r1[r36]
            u4 r1 = r1.f4584d
            u4[] r2 = r13.f4703A
            int r3 = r36 + 1
            r10 = r2[r3]
            u4[] r2 = r11.f4703A
            r2 = r2[r3]
            u4 r14 = r2.f4584d
            if (r1 == 0) goto L_0x04e9
            if (r12 == r13) goto L_0x04c3
            r4 r2 = r0.f4589i
            r4 r1 = r1.f4589i
            int r0 = r0.mo4768b()
            r15 = 5
            r9.mo3953d(r2, r1, r0, r15)
            goto L_0x04ea
        L_0x04c3:
            r15 = 5
            if (r14 == 0) goto L_0x04ea
            r4 r2 = r0.f4589i
            r4 r3 = r1.f4589i
            int r4 = r0.mo4768b()
            r5 = 1056964608(0x3f000000, float:0.5)
            r4 r6 = r10.f4589i
            r4 r7 = r14.f4589i
            int r8 = r10.mo4768b()
            r16 = 5
            r0 = r34
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.mo3951b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04ea
        L_0x04e9:
            r15 = 5
        L_0x04ea:
            if (r14 == 0) goto L_0x04fa
            if (r12 == r13) goto L_0x04fa
            r4 r0 = r10.f4589i
            r4 r1 = r14.f4589i
            int r2 = r10.mo4768b()
            int r2 = -r2
            r9.mo3953d(r0, r1, r2, r15)
        L_0x04fa:
            if (r26 != 0) goto L_0x04fe
            if (r23 == 0) goto L_0x0554
        L_0x04fe:
            if (r12 == 0) goto L_0x0554
            u4[] r0 = r12.f4703A
            r1 = r0[r36]
            u4[] r2 = r13.f4703A
            int r3 = r36 + 1
            r2 = r2[r3]
            u4 r4 = r1.f4584d
            if (r4 == 0) goto L_0x0511
            r4 r4 = r4.f4589i
            goto L_0x0513
        L_0x0511:
            r4 = r17
        L_0x0513:
            u4 r5 = r2.f4584d
            if (r5 == 0) goto L_0x051a
            r4 r5 = r5.f4589i
            goto L_0x051c
        L_0x051a:
            r5 = r17
        L_0x051c:
            if (r11 == r13) goto L_0x052c
            u4[] r5 = r11.f4703A
            r5 = r5[r3]
            u4 r5 = r5.f4584d
            if (r5 == 0) goto L_0x052a
            r4 r5 = r5.f4589i
            r17 = r5
        L_0x052a:
            r5 = r17
        L_0x052c:
            if (r12 != r13) goto L_0x0532
            r1 = r0[r36]
            r2 = r0[r3]
        L_0x0532:
            if (r4 == 0) goto L_0x0554
            if (r5 == 0) goto L_0x0554
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.mo4768b()
            u4[] r0 = r13.f4703A
            r0 = r0[r3]
            int r8 = r0.mo4768b()
            r4 r1 = r1.f4589i
            r4 r10 = r2.f4589i
            r11 = 5
            r0 = r34
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.mo3951b(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0554:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0398e.m1518b(w4, p4, int, int, t4):void");
    }

    /* renamed from: c */
    public static void m1519c(C1292w4 w4Var) {
        C1236v4.C1237a aVar = C1236v4.C1237a.FIXED;
        if ((w4Var.f4912w0 & 32) != 32) {
            w4Var.f4906q0.clear();
            w4Var.f4906q0.add(0, new C1343x4(w4Var.f2096i0));
            return;
        }
        w4Var.f4913x0 = true;
        w4Var.f4907r0 = false;
        w4Var.f4908s0 = false;
        w4Var.f4909t0 = false;
        ArrayList<C1236v4> arrayList = w4Var.f2096i0;
        List<C1343x4> list = w4Var.f4906q0;
        C1236v4.C1237a i = w4Var.mo4820i();
        C1236v4.C1237a aVar2 = C1236v4.C1237a.WRAP_CONTENT;
        boolean z = i == aVar2;
        boolean z2 = w4Var.mo4824m() == aVar2;
        boolean z3 = z || z2;
        list.clear();
        for (C1236v4 next : arrayList) {
            next.f4752p = null;
            next.f4734c0 = false;
            next.mo4426s();
        }
        for (C1236v4 next2 : arrayList) {
            if (next2.f4752p == null) {
                C1343x4 x4Var = new C1343x4(new ArrayList(), true);
                list.add(x4Var);
                if (!m1528l(next2, x4Var, list, z3)) {
                    w4Var.f4906q0.clear();
                    w4Var.f4906q0.add(0, new C1343x4(w4Var.f2096i0));
                    w4Var.f4913x0 = false;
                    return;
                }
            }
        }
        int i2 = 0;
        int i3 = 0;
        for (C1343x4 next3 : list) {
            i2 = Math.max(i2, m1521e(next3, 0));
            i3 = Math.max(i3, m1521e(next3, 1));
        }
        if (z) {
            w4Var.mo4833y(aVar);
            w4Var.mo4813C(i2);
            w4Var.f4907r0 = true;
            w4Var.f4908s0 = true;
            w4Var.f4910u0 = i2;
        }
        if (z2) {
            w4Var.mo4812B(aVar);
            w4Var.mo4831w(i3);
            w4Var.f4907r0 = true;
            w4Var.f4909t0 = true;
            w4Var.f4911v0 = i3;
        }
        m1526j(list, 0, w4Var.mo4825n());
        m1526j(list, 1, w4Var.mo4819h());
    }

    /* renamed from: d */
    public static void m1520d(Object obj) {
        if (!f1926d) {
            try {
                f1925c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f1926d = true;
        }
        Class<?> cls = f1925c;
        if (cls != null) {
            if (!f1928f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f1927e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f1928f = true;
            }
            Field field = f1927e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: e */
    public static int m1521e(C1343x4 x4Var, int i) {
        int i2 = i * 2;
        x4Var.getClass();
        List<C1236v4> list = i == 0 ? x4Var.f5017d : i == 1 ? x4Var.f5018e : null;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C1236v4 v4Var = list.get(i4);
            C1196u4[] u4VarArr = v4Var.f4703A;
            int i5 = i2 + 1;
            i3 = Math.max(i3, m1522f(v4Var, i, u4VarArr[i5].f4584d == null || !(u4VarArr[i2].f4584d == null || u4VarArr[i5].f4584d == null), 0));
        }
        x4Var.f5016c[i] = i3;
        return i3;
    }

    /* renamed from: f */
    public static int m1522f(C1236v4 v4Var, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int n;
        int i8;
        int i9;
        C1236v4 v4Var2;
        C1236v4 v4Var3 = v4Var;
        int i10 = i;
        boolean z2 = z;
        int i11 = 0;
        if (!v4Var3.f4730a0) {
            return 0;
        }
        boolean z3 = v4Var3.f4759w.f4584d != null && i10 == 1;
        if (z2) {
            i6 = v4Var3.f4719Q;
            i5 = v4Var.mo4819h() - v4Var3.f4719Q;
            i4 = i10 * 2;
            i3 = i4 + 1;
        } else {
            int h = v4Var.mo4819h();
            i5 = v4Var3.f4719Q;
            i6 = h - i5;
            i3 = i10 * 2;
            i4 = i3 + 1;
        }
        C1196u4[] u4VarArr = v4Var3.f4703A;
        if (u4VarArr[i3].f4584d == null || u4VarArr[i4].f4584d != null) {
            i7 = 1;
        } else {
            i7 = -1;
            int i12 = i3;
            i3 = i4;
            i4 = i12;
        }
        int i13 = z3 ? i2 - i6 : i2;
        int g = m1523g(v4Var, i) + (u4VarArr[i4].mo4768b() * i7);
        int i14 = i13 + g;
        int n2 = (i10 == 0 ? v4Var.mo4825n() : v4Var.mo4819h()) * i7;
        Iterator<C0365d5> it = v4Var3.f4703A[i4].f4581a.f1878a.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, m1522f(((C0210b5) it.next()).f1238c.f4582b, i10, z2, i14));
        }
        int i15 = 0;
        for (Iterator<C0365d5> it2 = v4Var3.f4703A[i3].f4581a.f1878a.iterator(); it2.hasNext(); it2 = it2) {
            i15 = Math.max(i15, m1522f(((C0210b5) it2.next()).f1238c.f4582b, i10, z2, n2 + i14));
        }
        if (z3) {
            i11 -= i6;
            n = i15 + i5;
        } else {
            n = i15 + ((i10 == 0 ? v4Var.mo4825n() : v4Var.mo4819h()) * i7);
        }
        if (i10 == 1) {
            Iterator<C0365d5> it3 = v4Var3.f4759w.f4581a.f1878a.iterator();
            int i16 = 0;
            while (it3.hasNext()) {
                Iterator<C0365d5> it4 = it3;
                int i17 = i3;
                i16 = Math.max(i16, m1522f(((C0210b5) it3.next()).f1238c.f4582b, i10, z2, i7 == 1 ? i6 + i14 : (i5 * i7) + i14));
                it3 = it4;
                i3 = i17;
            }
            i8 = i3;
            i9 = (v4Var3.f4759w.f4581a.f1878a.size() <= 0 || z3) ? i16 : i7 == 1 ? i16 + i6 : i16 - i5;
        } else {
            i8 = i3;
            i9 = 0;
        }
        int max = Math.max(i11, Math.max(n, i9)) + g;
        int i18 = n2 + i14;
        if (i7 == -1) {
            int i19 = i14;
            i14 = i18;
            i18 = i19;
        }
        if (z2) {
            C0008a5.m16b(v4Var3, i10, i14);
            v4Var3.mo4830v(i14, i18, i10);
        } else {
            v4Var3.f4752p.mo5050a(v4Var3, i10);
            if (i10 == 0) {
                v4Var3.f4713K = i14;
            } else if (i10 == 1) {
                v4Var3.f4714L = i14;
            }
        }
        if (v4Var.mo4818g(i) == C1236v4.C1237a.MATCH_CONSTRAINT && v4Var3.f4709G != 0.0f) {
            v4Var3.f4752p.mo5050a(v4Var3, i10);
        }
        C1196u4[] u4VarArr2 = v4Var3.f4703A;
        if (u4VarArr2[i4].f4584d != null && u4VarArr2[i8].f4584d != null && u4VarArr2[i4].f4584d.f4582b == (v4Var2 = v4Var3.f4706D) && u4VarArr2[i8].f4584d.f4582b == v4Var2) {
            v4Var3.f4752p.mo5050a(v4Var3, i10);
        }
        return max;
    }

    /* renamed from: g */
    public static int m1523g(C1236v4 v4Var, int i) {
        C1236v4 v4Var2;
        C1196u4 u4Var;
        int i2 = i * 2;
        C1196u4[] u4VarArr = v4Var.f4703A;
        C1196u4 u4Var2 = u4VarArr[i2];
        C1196u4 u4Var3 = u4VarArr[i2 + 1];
        C1196u4 u4Var4 = u4Var2.f4584d;
        if (u4Var4 == null || u4Var4.f4582b != (v4Var2 = v4Var.f4706D) || (u4Var = u4Var3.f4584d) == null || u4Var.f4582b != v4Var2) {
            return 0;
        }
        return (int) (((float) (((v4Var2.mo4821j(i) - u4Var2.mo4768b()) - u4Var3.mo4768b()) - v4Var.mo4821j(i))) * (i == 0 ? v4Var.f4724V : v4Var.f4725W));
    }

    /* renamed from: h */
    public static InputConnection m1524h(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof C0913o3) {
                    editorInfo.hintText = ((C0913o3) parent).mo3830a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    /* renamed from: i */
    public static int m1525i(C1236v4 v4Var) {
        C1236v4.C1237a i = v4Var.mo4820i();
        C1236v4.C1237a aVar = C1236v4.C1237a.MATCH_CONSTRAINT;
        if (i == aVar) {
            int h = (int) (v4Var.f4710H == 0 ? ((float) v4Var.mo4819h()) * v4Var.f4709G : ((float) v4Var.mo4819h()) / v4Var.f4709G);
            v4Var.mo4813C(h);
            return h;
        } else if (v4Var.mo4824m() != aVar) {
            return -1;
        } else {
            int n = (int) (v4Var.f4710H == 1 ? ((float) v4Var.mo4825n()) * v4Var.f4709G : ((float) v4Var.mo4825n()) / v4Var.f4709G);
            v4Var.mo4831w(n);
            return n;
        }
    }

    /* renamed from: j */
    public static void m1526j(List<C1343x4> list, int i, int i2) {
        int j;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1343x4 x4Var = list.get(i3);
            x4Var.getClass();
            for (C1236v4 next : i == 0 ? x4Var.f5019f : i == 1 ? x4Var.f5020g : null) {
                if (next.f4730a0) {
                    int i4 = i * 2;
                    C1196u4[] u4VarArr = next.f4703A;
                    C1196u4 u4Var = u4VarArr[i4];
                    C1196u4 u4Var2 = u4VarArr[i4 + 1];
                    if ((u4Var.f4584d == null || u4Var2.f4584d == null) ? false : true) {
                        j = u4Var.mo4768b() + m1523g(next, i);
                    } else if (next.f4709G == 0.0f || next.mo4818g(i) != C1236v4.C1237a.MATCH_CONSTRAINT) {
                        int i5 = i2 - (i == 0 ? next.f4713K : i == 1 ? next.f4714L : 0);
                        j = i5 - next.mo4821j(i);
                        next.mo4830v(j, i5, i);
                    } else {
                        int i6 = m1525i(next);
                        int i7 = (int) next.f4703A[i4].f4581a.f1242g;
                        C0210b5 b5Var = u4Var2.f4581a;
                        b5Var.f1241f = u4Var.f4581a;
                        b5Var.f1242g = (float) i6;
                        b5Var.f1879b = 1;
                        next.mo4830v(i7, i7 + i6, i);
                    }
                    C0008a5.m16b(next, i, j);
                }
            }
        }
    }

    /* renamed from: k */
    public static void m1527k(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C0710k3 k3Var = C0710k3.f2962k;
        if (k3Var != null && k3Var.f2964b == view) {
            C0710k3.m2233c((C0710k3) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0710k3 k3Var2 = C0710k3.f2963l;
            if (k3Var2 != null && k3Var2.f2964b == view) {
                k3Var2.mo3506b();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0710k3(view, charSequence);
    }

    /* renamed from: l */
    public static boolean m1528l(C1236v4 v4Var, C1343x4 x4Var, List<C1343x4> list, boolean z) {
        C1196u4 u4Var;
        C1236v4 v4Var2;
        C1196u4 u4Var2;
        C1236v4 v4Var3;
        if (v4Var == null) {
            return true;
        }
        v4Var.f4732b0 = false;
        C1292w4 w4Var = (C1292w4) v4Var.f4706D;
        C1343x4 x4Var2 = v4Var.f4752p;
        if (x4Var2 == null) {
            v4Var.f4730a0 = true;
            x4Var.f5014a.add(v4Var);
            v4Var.f4752p = x4Var;
            if (v4Var.f4755s.f4584d == null && v4Var.f4757u.f4584d == null && v4Var.f4756t.f4584d == null && v4Var.f4758v.f4584d == null && v4Var.f4759w.f4584d == null && v4Var.f4762z.f4584d == null) {
                x4Var.f5015b = false;
                w4Var.f4913x0 = false;
                v4Var.f4730a0 = false;
                if (z) {
                    return false;
                }
            }
            if (!(v4Var.f4756t.f4584d == null || v4Var.f4758v.f4584d == null)) {
                w4Var.mo4824m();
                if (!z) {
                    C1236v4 v4Var4 = v4Var.f4756t.f4584d.f4582b;
                    C1236v4 v4Var5 = v4Var.f4706D;
                    if (!(v4Var4 == v4Var5 && v4Var.f4758v.f4584d.f4582b == v4Var5)) {
                        x4Var.f5015b = false;
                        w4Var.f4913x0 = false;
                        v4Var.f4730a0 = false;
                    }
                }
                x4Var.f5015b = false;
                w4Var.f4913x0 = false;
                v4Var.f4730a0 = false;
                return false;
            }
            if (!(v4Var.f4755s.f4584d == null || v4Var.f4757u.f4584d == null)) {
                w4Var.mo4820i();
                if (!z) {
                    C1236v4 v4Var6 = v4Var.f4755s.f4584d.f4582b;
                    C1236v4 v4Var7 = v4Var.f4706D;
                    if (!(v4Var6 == v4Var7 && v4Var.f4757u.f4584d.f4582b == v4Var7)) {
                        x4Var.f5015b = false;
                        w4Var.f4913x0 = false;
                        v4Var.f4730a0 = false;
                    }
                }
                x4Var.f5015b = false;
                w4Var.f4913x0 = false;
                v4Var.f4730a0 = false;
                return false;
            }
            C1236v4.C1237a i = v4Var.mo4820i();
            C1236v4.C1237a aVar = C1236v4.C1237a.MATCH_CONSTRAINT;
            if (((i == aVar) ^ (v4Var.mo4824m() == aVar)) && v4Var.f4709G != 0.0f) {
                m1525i(v4Var);
            } else if (v4Var.mo4820i() == aVar || v4Var.mo4824m() == aVar) {
                x4Var.f5015b = false;
                w4Var.f4913x0 = false;
                v4Var.f4730a0 = false;
                if (z) {
                    return false;
                }
            }
            C1196u4 u4Var3 = v4Var.f4755s.f4584d;
            if (((u4Var3 == null && v4Var.f4757u.f4584d == null) || ((u4Var3 != null && u4Var3.f4582b == v4Var.f4706D && v4Var.f4757u.f4584d == null) || (((u4Var2 = v4Var.f4757u.f4584d) != null && u4Var2.f4582b == v4Var.f4706D && u4Var3 == null) || (u4Var3 != null && u4Var3.f4582b == (v4Var3 = v4Var.f4706D) && u4Var2 != null && u4Var2.f4582b == v4Var3)))) && v4Var.f4762z.f4584d == null && !(v4Var instanceof C1398y4) && !(v4Var instanceof C1441z4)) {
                x4Var.f5017d.add(v4Var);
            }
            C1196u4 u4Var4 = v4Var.f4756t.f4584d;
            if (((u4Var4 == null && v4Var.f4758v.f4584d == null) || ((u4Var4 != null && u4Var4.f4582b == v4Var.f4706D && v4Var.f4758v.f4584d == null) || (((u4Var = v4Var.f4758v.f4584d) != null && u4Var.f4582b == v4Var.f4706D && u4Var4 == null) || (u4Var4 != null && u4Var4.f4582b == (v4Var2 = v4Var.f4706D) && u4Var != null && u4Var.f4582b == v4Var2)))) && v4Var.f4762z.f4584d == null && v4Var.f4759w.f4584d == null && !(v4Var instanceof C1398y4) && !(v4Var instanceof C1441z4)) {
                x4Var.f5018e.add(v4Var);
            }
            if (v4Var instanceof C1441z4) {
                x4Var.f5015b = false;
                w4Var.f4913x0 = false;
                v4Var.f4730a0 = false;
                if (z) {
                    return false;
                }
                C1441z4 z4Var = (C1441z4) v4Var;
                for (int i2 = 0; i2 < z4Var.f5260j0; i2++) {
                    if (!m1528l(z4Var.f5259i0[i2], x4Var, list, z)) {
                        return false;
                    }
                }
            }
            for (C1196u4 u4Var5 : v4Var.f4703A) {
                C1196u4 u4Var6 = u4Var5.f4584d;
                if (!(u4Var6 == null || u4Var6.f4582b == v4Var.f4706D)) {
                    if (u4Var5.f4583c == C1196u4.C1198b.CENTER) {
                        x4Var.f5015b = false;
                        w4Var.f4913x0 = false;
                        v4Var.f4730a0 = false;
                        if (z) {
                            return false;
                        }
                    } else {
                        C0210b5 b5Var = u4Var5.f4581a;
                        if (u4Var6.f4584d != u4Var5) {
                            u4Var6.f4581a.f1878a.add(b5Var);
                        }
                    }
                    if (!m1528l(u4Var5.f4584d.f4582b, x4Var, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (x4Var2 != x4Var) {
            x4Var.f5014a.addAll(x4Var2.f5014a);
            x4Var.f5017d.addAll(v4Var.f4752p.f5017d);
            x4Var.f5018e.addAll(v4Var.f4752p.f5018e);
            C1343x4 x4Var3 = v4Var.f4752p;
            if (!x4Var3.f5015b) {
                x4Var.f5015b = false;
            }
            list.remove(x4Var3);
            for (C1236v4 v4Var8 : v4Var.f4752p.f5014a) {
                v4Var8.f4752p = x4Var;
            }
        }
        return true;
    }
}
