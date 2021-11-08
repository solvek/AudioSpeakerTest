package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.C1196u4;
import p000.C1236v4;

/* renamed from: w4 */
public class C1292w4 extends C0454f5 {

    /* renamed from: j0 */
    public boolean f4899j0 = false;

    /* renamed from: k0 */
    public C0955p4 f4900k0 = new C0955p4();

    /* renamed from: l0 */
    public C0406e5 f4901l0;

    /* renamed from: m0 */
    public int f4902m0 = 0;

    /* renamed from: n0 */
    public int f4903n0 = 0;

    /* renamed from: o0 */
    public C1148t4[] f4904o0 = new C1148t4[4];

    /* renamed from: p0 */
    public C1148t4[] f4905p0 = new C1148t4[4];

    /* renamed from: q0 */
    public List<C1343x4> f4906q0 = new ArrayList();

    /* renamed from: r0 */
    public boolean f4907r0 = false;

    /* renamed from: s0 */
    public boolean f4908s0 = false;

    /* renamed from: t0 */
    public boolean f4909t0 = false;

    /* renamed from: u0 */
    public int f4910u0 = 0;

    /* renamed from: v0 */
    public int f4911v0 = 0;

    /* renamed from: w0 */
    public int f4912w0 = 7;

    /* renamed from: x0 */
    public boolean f4913x0 = false;

    /* renamed from: y0 */
    public boolean f4914y0 = false;

    /* renamed from: z0 */
    public boolean f4915z0 = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: w4} */
    /* JADX WARNING: type inference failed for: r5v16, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* JADX WARNING: type inference failed for: r15v19 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r15v15, types: [boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03ad  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2763F() {
        /*
            r29 = this;
            r1 = r29
            v4$a r2 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            v4$a r3 = p000.C1236v4.C1237a.WRAP_CONTENT
            v4$a r4 = p000.C1236v4.C1237a.FIXED
            int r5 = r1.f4711I
            int r6 = r1.f4712J
            int r0 = r29.mo4825n()
            r7 = 0
            int r8 = java.lang.Math.max(r7, r0)
            int r0 = r29.mo4819h()
            int r9 = java.lang.Math.max(r7, r0)
            r1.f4914y0 = r7
            r1.f4915z0 = r7
            v4 r0 = r1.f4706D
            if (r0 == 0) goto L_0x00b5
            e5 r0 = r1.f4901l0
            if (r0 != 0) goto L_0x0030
            e5 r0 = new e5
            r0.<init>(r1)
            r1.f4901l0 = r0
        L_0x0030:
            e5 r0 = r1.f4901l0
            r0.getClass()
            int r10 = r1.f4711I
            r0.f1968a = r10
            int r10 = r1.f4712J
            r0.f1969b = r10
            int r10 = r29.mo4825n()
            r0.f1970c = r10
            int r10 = r29.mo4819h()
            r0.f1971d = r10
            java.util.ArrayList<e5$a> r10 = r0.f1972e
            int r10 = r10.size()
            r11 = 0
        L_0x0050:
            if (r11 >= r10) goto L_0x0088
            java.util.ArrayList<e5$a> r12 = r0.f1972e
            java.lang.Object r12 = r12.get(r11)
            e5$a r12 = (p000.C0406e5.C0407a) r12
            u4 r13 = r12.f1973a
            u4$b r13 = r13.f4583c
            u4 r13 = r1.mo4817f(r13)
            r12.f1973a = r13
            if (r13 == 0) goto L_0x0079
            u4 r14 = r13.f4584d
            r12.f1974b = r14
            int r13 = r13.mo4768b()
            r12.f1975c = r13
            u4 r13 = r12.f1973a
            u4$a r14 = r13.f4587g
            r12.f1976d = r14
            int r13 = r13.f4588h
            goto L_0x0083
        L_0x0079:
            r13 = 0
            r12.f1974b = r13
            r12.f1975c = r7
            u4$a r13 = p000.C1196u4.C1197a.STRONG
            r12.f1976d = r13
            r13 = 0
        L_0x0083:
            r12.f1977e = r13
            int r11 = r11 + 1
            goto L_0x0050
        L_0x0088:
            r1.f4711I = r7
            r1.f4712J = r7
            v4 r0 = r1.f4706D
            if (r0 == 0) goto L_0x0096
            boolean r10 = r0 instanceof p000.C1292w4
            if (r10 == 0) goto L_0x0096
            w4 r0 = (p000.C1292w4) r0
        L_0x0096:
            java.util.ArrayList<u4> r0 = r1.f4704B
            int r0 = r0.size()
            r10 = 0
        L_0x009d:
            if (r10 >= r0) goto L_0x00ad
            java.util.ArrayList<u4> r11 = r1.f4704B
            java.lang.Object r11 = r11.get(r10)
            u4 r11 = (p000.C1196u4) r11
            r11.mo4770d()
            int r10 = r10 + 1
            goto L_0x009d
        L_0x00ad:
            p4 r0 = r1.f4900k0
            n4 r0 = r0.f3559k
            r1.mo2765t(r0)
            goto L_0x00b9
        L_0x00b5:
            r1.f4711I = r7
            r1.f4712J = r7
        L_0x00b9:
            int r0 = r1.f4912w0
            r10 = 8
            r11 = 32
            r12 = 1
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r1.mo4960I(r10)
            if (r0 != 0) goto L_0x00cb
            r29.mo4961J()
        L_0x00cb:
            boolean r0 = r1.mo4960I(r11)
            if (r0 != 0) goto L_0x00df
            boolean r0 = r1.mo4960I(r10)
            if (r0 != 0) goto L_0x00dc
            int r0 = r1.f4912w0
            r1.mo4425c(r0)
        L_0x00dc:
            r29.mo4963L()
        L_0x00df:
            p4 r0 = r1.f4900k0
            r0.f3554f = r12
            goto L_0x00e8
        L_0x00e4:
            p4 r0 = r1.f4900k0
            r0.f3554f = r7
        L_0x00e8:
            v4$a[] r0 = r1.f4705C
            r13 = r0[r12]
            r14 = r0[r7]
            r29.mo4962K()
            java.util.List<x4> r0 = r1.f4906q0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x010a
            java.util.List<x4> r0 = r1.f4906q0
            r0.clear()
            java.util.List<x4> r0 = r1.f4906q0
            x4 r15 = new x4
            java.util.ArrayList<v4> r10 = r1.f2096i0
            r15.<init>(r10)
            r0.add(r7, r15)
        L_0x010a:
            java.util.List<x4> r0 = r1.f4906q0
            int r10 = r0.size()
            java.util.ArrayList<v4> r15 = r1.f2096i0
            v4$a r0 = r29.mo4820i()
            if (r0 == r3) goto L_0x0122
            v4$a r0 = r29.mo4824m()
            if (r0 != r3) goto L_0x011f
            goto L_0x0122
        L_0x011f:
            r16 = 0
            goto L_0x0124
        L_0x0122:
            r16 = 1
        L_0x0124:
            r0 = 0
        L_0x0125:
            if (r7 >= r10) goto L_0x0427
            boolean r12 = r1.f4913x0
            if (r12 != 0) goto L_0x0427
            java.util.List<x4> r12 = r1.f4906q0
            java.lang.Object r12 = r12.get(r7)
            x4 r12 = (p000.C1343x4) r12
            boolean r12 = r12.f5015b
            if (r12 == 0) goto L_0x0141
            r22 = r5
            r21 = r6
            r18 = r10
            r25 = r15
            goto L_0x0418
        L_0x0141:
            boolean r12 = r1.mo4960I(r11)
            if (r12 == 0) goto L_0x01c2
            v4$a r12 = r29.mo4820i()
            if (r12 != r4) goto L_0x01af
            v4$a r12 = r29.mo4824m()
            if (r12 != r4) goto L_0x01af
            java.util.List<x4> r12 = r1.f4906q0
            java.lang.Object r12 = r12.get(r7)
            x4 r12 = (p000.C1343x4) r12
            java.util.List<v4> r11 = r12.f5021h
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x016a
            java.util.List<v4> r11 = r12.f5021h
            r20 = r0
            r18 = r10
            goto L_0x01aa
        L_0x016a:
            java.util.List<v4> r11 = r12.f5014a
            int r11 = r11.size()
            r18 = r10
            r10 = 0
        L_0x0173:
            if (r10 >= r11) goto L_0x0193
            r19 = r11
            java.util.List<v4> r11 = r12.f5014a
            java.lang.Object r11 = r11.get(r10)
            v4 r11 = (p000.C1236v4) r11
            r20 = r0
            boolean r0 = r11.f4730a0
            if (r0 != 0) goto L_0x018c
            java.util.List<v4> r0 = r12.f5021h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r12.mo5051b(r0, r11)
        L_0x018c:
            int r10 = r10 + 1
            r11 = r19
            r0 = r20
            goto L_0x0173
        L_0x0193:
            r20 = r0
            java.util.List<v4> r0 = r12.f5022i
            r0.clear()
            java.util.List<v4> r0 = r12.f5022i
            java.util.List<v4> r10 = r12.f5014a
            r0.addAll(r10)
            java.util.List<v4> r0 = r12.f5022i
            java.util.List<v4> r10 = r12.f5021h
            r0.removeAll(r10)
            java.util.List<v4> r11 = r12.f5021h
        L_0x01aa:
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r1.f2096i0 = r11
            goto L_0x01c6
        L_0x01af:
            r20 = r0
            r18 = r10
            java.util.List<x4> r0 = r1.f4906q0
            java.lang.Object r0 = r0.get(r7)
            x4 r0 = (p000.C1343x4) r0
            java.util.List<v4> r0 = r0.f5014a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1.f2096i0 = r0
            goto L_0x01c6
        L_0x01c2:
            r20 = r0
            r18 = r10
        L_0x01c6:
            r29.mo4962K()
            java.util.ArrayList<v4> r0 = r1.f2096i0
            int r10 = r0.size()
            r0 = 0
        L_0x01d0:
            if (r0 >= r10) goto L_0x01e6
            java.util.ArrayList<v4> r11 = r1.f2096i0
            java.lang.Object r11 = r11.get(r0)
            v4 r11 = (p000.C1236v4) r11
            boolean r12 = r11 instanceof p000.C0454f5
            if (r12 == 0) goto L_0x01e3
            f5 r11 = (p000.C0454f5) r11
            r11.mo2763F()
        L_0x01e3:
            int r0 = r0 + 1
            goto L_0x01d0
        L_0x01e6:
            r0 = 0
            r11 = 1
        L_0x01e8:
            if (r11 == 0) goto L_0x03f1
            r19 = r11
            r12 = 1
            int r11 = r0 + 1
            p4 r0 = r1.f4900k0     // Catch:{ Exception -> 0x024a }
            r0.mo3969t()     // Catch:{ Exception -> 0x024a }
            r29.mo4962K()     // Catch:{ Exception -> 0x024a }
            p4 r0 = r1.f4900k0     // Catch:{ Exception -> 0x024a }
            r1.mo4816e(r0)     // Catch:{ Exception -> 0x024a }
            r0 = 0
        L_0x01fd:
            if (r0 >= r10) goto L_0x0213
            java.util.ArrayList<v4> r12 = r1.f2096i0     // Catch:{ Exception -> 0x024a }
            java.lang.Object r12 = r12.get(r0)     // Catch:{ Exception -> 0x024a }
            v4 r12 = (p000.C1236v4) r12     // Catch:{ Exception -> 0x024a }
            r21 = r6
            p4 r6 = r1.f4900k0     // Catch:{ Exception -> 0x0248 }
            r12.mo4816e(r6)     // Catch:{ Exception -> 0x0248 }
            int r0 = r0 + 1
            r6 = r21
            goto L_0x01fd
        L_0x0213:
            r21 = r6
            p4 r0 = r1.f4900k0     // Catch:{ Exception -> 0x0248 }
            r1.mo4959H(r0)     // Catch:{ Exception -> 0x0248 }
            p4 r0 = r1.f4900k0     // Catch:{ Exception -> 0x0244 }
            boolean r6 = r0.f3554f     // Catch:{ Exception -> 0x0244 }
            if (r6 == 0) goto L_0x023a
            r6 = 0
        L_0x0221:
            int r12 = r0.f3557i     // Catch:{ Exception -> 0x0244 }
            if (r6 >= r12) goto L_0x0232
            m4[] r12 = r0.f3553e     // Catch:{ Exception -> 0x0244 }
            r12 = r12[r6]     // Catch:{ Exception -> 0x0244 }
            boolean r12 = r12.f3216d     // Catch:{ Exception -> 0x0244 }
            if (r12 != 0) goto L_0x022f
            r6 = 0
            goto L_0x0233
        L_0x022f:
            int r6 = r6 + 1
            goto L_0x0221
        L_0x0232:
            r6 = 1
        L_0x0233:
            if (r6 != 0) goto L_0x0236
            goto L_0x023a
        L_0x0236:
            r0.mo3959j()     // Catch:{ Exception -> 0x0244 }
            goto L_0x023f
        L_0x023a:
            p4$a r6 = r0.f3550b     // Catch:{ Exception -> 0x0244 }
            r0.mo3966q(r6)     // Catch:{ Exception -> 0x0244 }
        L_0x023f:
            r22 = r5
            r19 = 1
            goto L_0x0268
        L_0x0244:
            r0 = move-exception
            r19 = 1
            goto L_0x024d
        L_0x0248:
            r0 = move-exception
            goto L_0x024d
        L_0x024a:
            r0 = move-exception
            r21 = r6
        L_0x024d:
            r0.printStackTrace()
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r22 = r5
            java.lang.String r5 = "EXCEPTION : "
            r12.append(r5)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r6.println(r0)
        L_0x0268:
            r0 = 2
            if (r19 == 0) goto L_0x02c6
            p4 r5 = r1.f4900k0
            boolean[] r6 = p000.C0008a5.f29a
            r17 = 0
            r6[r0] = r17
            r1.mo4814E(r5)
            java.util.ArrayList<v4> r12 = r1.f2096i0
            int r12 = r12.size()
            r0 = 0
        L_0x027d:
            if (r0 >= r12) goto L_0x02c3
            r23 = r12
            java.util.ArrayList<v4> r12 = r1.f2096i0
            java.lang.Object r12 = r12.get(r0)
            v4 r12 = (p000.C1236v4) r12
            r12.mo4814E(r5)
            r24 = r5
            v4$a[] r5 = r12.f4705C
            r5 = r5[r17]
            if (r5 != r2) goto L_0x02a3
            int r5 = r12.mo4825n()
            r25 = r15
            int r15 = r12.f4722T
            if (r5 >= r15) goto L_0x02a5
            r5 = 2
            r15 = 1
            r6[r5] = r15
            goto L_0x02a7
        L_0x02a3:
            r25 = r15
        L_0x02a5:
            r5 = 2
            r15 = 1
        L_0x02a7:
            v4$a[] r5 = r12.f4705C
            r5 = r5[r15]
            if (r5 != r2) goto L_0x02b8
            int r5 = r12.mo4819h()
            int r12 = r12.f4723U
            if (r5 >= r12) goto L_0x02b8
            r5 = 2
            r6[r5] = r15
        L_0x02b8:
            int r0 = r0 + 1
            r12 = r23
            r5 = r24
            r15 = r25
            r17 = 0
            goto L_0x027d
        L_0x02c3:
            r25 = r15
            goto L_0x0306
        L_0x02c6:
            r25 = r15
            p4 r0 = r1.f4900k0
            r1.mo4814E(r0)
            r0 = 0
        L_0x02ce:
            if (r0 >= r10) goto L_0x0306
            java.util.ArrayList<v4> r5 = r1.f2096i0
            java.lang.Object r5 = r5.get(r0)
            v4 r5 = (p000.C1236v4) r5
            v4$a[] r6 = r5.f4705C
            r12 = 0
            r6 = r6[r12]
            if (r6 != r2) goto L_0x02ee
            int r6 = r5.mo4825n()
            int r12 = r5.f4722T
            if (r6 >= r12) goto L_0x02ee
            boolean[] r0 = p000.C0008a5.f29a
            r6 = 2
            r12 = 1
            r0[r6] = r12
            goto L_0x0306
        L_0x02ee:
            r6 = 2
            r12 = 1
            v4$a[] r15 = r5.f4705C
            r15 = r15[r12]
            if (r15 != r2) goto L_0x0303
            int r15 = r5.mo4819h()
            int r5 = r5.f4723U
            if (r15 >= r5) goto L_0x0303
            boolean[] r0 = p000.C0008a5.f29a
            r0[r6] = r12
            goto L_0x0306
        L_0x0303:
            int r0 = r0 + 1
            goto L_0x02ce
        L_0x0306:
            if (r16 == 0) goto L_0x0371
            r5 = 8
            if (r11 >= r5) goto L_0x0371
            boolean[] r0 = p000.C0008a5.f29a
            r6 = 2
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0371
            r0 = 0
            r6 = 0
            r12 = 0
        L_0x0316:
            if (r0 >= r10) goto L_0x033c
            java.util.ArrayList<v4> r15 = r1.f2096i0
            java.lang.Object r15 = r15.get(r0)
            v4 r15 = (p000.C1236v4) r15
            int r5 = r15.f4711I
            int r19 = r15.mo4825n()
            int r5 = r19 + r5
            int r6 = java.lang.Math.max(r6, r5)
            int r5 = r15.f4712J
            int r15 = r15.mo4819h()
            int r15 = r15 + r5
            int r12 = java.lang.Math.max(r12, r15)
            int r0 = r0 + 1
            r5 = 8
            goto L_0x0316
        L_0x033c:
            int r0 = r1.f4720R
            int r0 = java.lang.Math.max(r0, r6)
            int r5 = r1.f4721S
            int r5 = java.lang.Math.max(r5, r12)
            if (r14 != r3) goto L_0x035c
            int r6 = r29.mo4825n()
            if (r6 >= r0) goto L_0x035c
            r1.mo4813C(r0)
            v4$a[] r0 = r1.f4705C
            r6 = 0
            r0[r6] = r3
            r0 = 1
            r20 = 1
            goto L_0x035d
        L_0x035c:
            r0 = 0
        L_0x035d:
            if (r13 != r3) goto L_0x0372
            int r6 = r29.mo4819h()
            if (r6 >= r5) goto L_0x0372
            r1.mo4831w(r5)
            v4$a[] r0 = r1.f4705C
            r5 = 1
            r0[r5] = r3
            r0 = 1
            r20 = 1
            goto L_0x0372
        L_0x0371:
            r0 = 0
        L_0x0372:
            int r5 = r1.f4720R
            int r6 = r29.mo4825n()
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r29.mo4825n()
            if (r5 <= r6) goto L_0x038d
            r1.mo4813C(r5)
            v4$a[] r0 = r1.f4705C
            r5 = 0
            r0[r5] = r4
            r0 = 1
            r20 = 1
        L_0x038d:
            int r5 = r1.f4721S
            int r6 = r29.mo4819h()
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r29.mo4819h()
            if (r5 <= r6) goto L_0x03a8
            r1.mo4831w(r5)
            v4$a[] r0 = r1.f4705C
            r5 = 1
            r0[r5] = r4
            r0 = 1
            r12 = 1
            goto L_0x03ab
        L_0x03a8:
            r5 = 1
            r12 = r20
        L_0x03ab:
            if (r12 != 0) goto L_0x03e2
            v4$a[] r6 = r1.f4705C
            r15 = 0
            r6 = r6[r15]
            if (r6 != r3) goto L_0x03c7
            if (r8 <= 0) goto L_0x03c7
            int r6 = r29.mo4825n()
            if (r6 <= r8) goto L_0x03c7
            r1.f4914y0 = r5
            v4$a[] r0 = r1.f4705C
            r0[r15] = r4
            r1.mo4813C(r8)
            r0 = 1
            r12 = 1
        L_0x03c7:
            v4$a[] r6 = r1.f4705C
            r6 = r6[r5]
            if (r6 != r3) goto L_0x03e2
            if (r9 <= 0) goto L_0x03e2
            int r6 = r29.mo4819h()
            if (r6 <= r9) goto L_0x03e2
            r1.f4915z0 = r5
            v4$a[] r0 = r1.f4705C
            r0[r5] = r4
            r1.mo4831w(r9)
            r0 = 1
            r20 = 1
            goto L_0x03e4
        L_0x03e2:
            r20 = r12
        L_0x03e4:
            r6 = r21
            r5 = r22
            r15 = r25
            r28 = r11
            r11 = r0
            r0 = r28
            goto L_0x01e8
        L_0x03f1:
            r22 = r5
            r21 = r6
            r25 = r15
            java.util.List<x4> r0 = r1.f4906q0
            java.lang.Object r0 = r0.get(r7)
            x4 r0 = (p000.C1343x4) r0
            java.util.List<v4> r5 = r0.f5022i
            int r5 = r5.size()
            r6 = 0
        L_0x0406:
            if (r6 >= r5) goto L_0x0416
            java.util.List<v4> r10 = r0.f5022i
            java.lang.Object r10 = r10.get(r6)
            v4 r10 = (p000.C1236v4) r10
            r0.mo5052c(r10)
            int r6 = r6 + 1
            goto L_0x0406
        L_0x0416:
            r0 = r20
        L_0x0418:
            int r7 = r7 + 1
            r10 = r18
            r6 = r21
            r5 = r22
            r15 = r25
            r11 = 32
            r12 = 1
            goto L_0x0125
        L_0x0427:
            r20 = r0
            r22 = r5
            r21 = r6
            r2 = r15
            r1.f2096i0 = r2
            v4 r0 = r1.f4706D
            if (r0 == 0) goto L_0x049b
            int r0 = r1.f4720R
            int r2 = r29.mo4825n()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.f4721S
            int r3 = r29.mo4819h()
            int r2 = java.lang.Math.max(r2, r3)
            e5 r3 = r1.f4901l0
            int r4 = r3.f1968a
            r1.f4711I = r4
            int r4 = r3.f1969b
            r1.f4712J = r4
            int r4 = r3.f1970c
            r1.mo4813C(r4)
            int r4 = r3.f1971d
            r1.mo4831w(r4)
            java.util.ArrayList<e5$a> r4 = r3.f1972e
            int r4 = r4.size()
            r5 = 0
        L_0x0463:
            if (r5 >= r4) goto L_0x048f
            java.util.ArrayList<e5$a> r6 = r3.f1972e
            java.lang.Object r6 = r6.get(r5)
            e5$a r6 = (p000.C0406e5.C0407a) r6
            u4 r7 = r6.f1973a
            u4$b r7 = r7.f4583c
            u4 r21 = r1.mo4817f(r7)
            u4 r7 = r6.f1974b
            int r8 = r6.f1975c
            u4$a r9 = r6.f1976d
            int r6 = r6.f1977e
            r24 = -1
            r27 = 0
            r22 = r7
            r23 = r8
            r25 = r9
            r26 = r6
            r21.mo4767a(r22, r23, r24, r25, r26, r27)
            int r5 = r5 + 1
            goto L_0x0463
        L_0x048f:
            r5 = 0
            int r0 = r0 + r5
            int r0 = r0 + r5
            r1.mo4813C(r0)
            int r2 = r2 + r5
            int r2 = r2 + r5
            r1.mo4831w(r2)
            goto L_0x04a4
        L_0x049b:
            r2 = r22
            r5 = 0
            r1.f4711I = r2
            r2 = r21
            r1.f4712J = r2
        L_0x04a4:
            if (r20 == 0) goto L_0x04ad
            v4$a[] r0 = r1.f4705C
            r0[r5] = r14
            r2 = 1
            r0[r2] = r13
        L_0x04ad:
            p4 r0 = r1.f4900k0
            n4 r0 = r0.f3559k
            r1.mo2765t(r0)
            v4 r0 = r1.f4706D
            r2 = r1
        L_0x04b7:
            if (r0 == 0) goto L_0x04c4
            v4 r3 = r0.f4706D
            boolean r4 = r0 instanceof p000.C1292w4
            if (r4 == 0) goto L_0x04c2
            r2 = r0
            w4 r2 = (p000.C1292w4) r2
        L_0x04c2:
            r0 = r3
            goto L_0x04b7
        L_0x04c4:
            if (r1 != r2) goto L_0x04c9
            r29.mo2762D()
        L_0x04c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1292w4.mo2763F():void");
    }

    /* renamed from: G */
    public void mo4958G(C1236v4 v4Var, int i) {
        if (i == 0) {
            int i2 = this.f4902m0 + 1;
            C1148t4[] t4VarArr = this.f4905p0;
            if (i2 >= t4VarArr.length) {
                this.f4905p0 = (C1148t4[]) Arrays.copyOf(t4VarArr, t4VarArr.length * 2);
            }
            C1148t4[] t4VarArr2 = this.f4905p0;
            int i3 = this.f4902m0;
            t4VarArr2[i3] = new C1148t4(v4Var, 0, this.f4899j0);
            this.f4902m0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f4903n0 + 1;
            C1148t4[] t4VarArr3 = this.f4904o0;
            if (i4 >= t4VarArr3.length) {
                this.f4904o0 = (C1148t4[]) Arrays.copyOf(t4VarArr3, t4VarArr3.length * 2);
            }
            C1148t4[] t4VarArr4 = this.f4904o0;
            int i5 = this.f4903n0;
            t4VarArr4[i5] = new C1148t4(v4Var, 1, this.f4899j0);
            this.f4903n0 = i5 + 1;
        }
    }

    /* renamed from: H */
    public boolean mo4959H(C0955p4 p4Var) {
        C1236v4.C1237a aVar = C1236v4.C1237a.FIXED;
        C1236v4.C1237a aVar2 = C1236v4.C1237a.WRAP_CONTENT;
        mo4423a(p4Var);
        int size = this.f2096i0.size();
        for (int i = 0; i < size; i++) {
            C1236v4 v4Var = this.f2096i0.get(i);
            if (v4Var instanceof C1292w4) {
                C1236v4.C1237a[] aVarArr = v4Var.f4705C;
                C1236v4.C1237a aVar3 = aVarArr[0];
                C1236v4.C1237a aVar4 = aVarArr[1];
                if (aVar3 == aVar2) {
                    v4Var.mo4833y(aVar);
                }
                if (aVar4 == aVar2) {
                    v4Var.mo4812B(aVar);
                }
                v4Var.mo4423a(p4Var);
                if (aVar3 == aVar2) {
                    v4Var.mo4833y(aVar3);
                }
                if (aVar4 == aVar2) {
                    v4Var.mo4812B(aVar4);
                }
            } else {
                C1236v4.C1237a aVar5 = C1236v4.C1237a.MATCH_PARENT;
                if (this.f4705C[0] != aVar2 && v4Var.f4705C[0] == aVar5) {
                    int i2 = v4Var.f4755s.f4585e;
                    int n = mo4825n() - v4Var.f4757u.f4585e;
                    C1196u4 u4Var = v4Var.f4755s;
                    u4Var.f4589i = p4Var.mo3961l(u4Var);
                    C1196u4 u4Var2 = v4Var.f4757u;
                    u4Var2.f4589i = p4Var.mo3961l(u4Var2);
                    p4Var.mo3954e(v4Var.f4755s.f4589i, i2);
                    p4Var.mo3954e(v4Var.f4757u.f4589i, n);
                    v4Var.f4729a = 2;
                    v4Var.mo4832x(i2, n);
                }
                if (this.f4705C[1] != aVar2 && v4Var.f4705C[1] == aVar5) {
                    int i3 = v4Var.f4756t.f4585e;
                    int h = mo4819h() - v4Var.f4758v.f4585e;
                    C1196u4 u4Var3 = v4Var.f4756t;
                    u4Var3.f4589i = p4Var.mo3961l(u4Var3);
                    C1196u4 u4Var4 = v4Var.f4758v;
                    u4Var4.f4589i = p4Var.mo3961l(u4Var4);
                    p4Var.mo3954e(v4Var.f4756t.f4589i, i3);
                    p4Var.mo3954e(v4Var.f4758v.f4589i, h);
                    if (v4Var.f4719Q > 0 || v4Var.f4727Y == 8) {
                        C1196u4 u4Var5 = v4Var.f4759w;
                        u4Var5.f4589i = p4Var.mo3961l(u4Var5);
                        p4Var.mo3954e(v4Var.f4759w.f4589i, v4Var.f4719Q + i3);
                    }
                    v4Var.f4731b = 2;
                    v4Var.mo4811A(i3, h);
                }
                v4Var.mo4423a(p4Var);
            }
        }
        if (this.f4902m0 > 0) {
            C0398e.m1517a(this, p4Var, 0);
        }
        if (this.f4903n0 > 0) {
            C0398e.m1517a(this, p4Var, 1);
        }
        return true;
    }

    /* renamed from: I */
    public boolean mo4960I(int i) {
        return (this.f4912w0 & i) == i;
    }

    /* renamed from: J */
    public void mo4961J() {
        int size = this.f2096i0.size();
        mo4426s();
        for (int i = 0; i < size; i++) {
            this.f2096i0.get(i).mo4426s();
        }
    }

    /* renamed from: K */
    public final void mo4962K() {
        this.f4902m0 = 0;
        this.f4903n0 = 0;
    }

    /* renamed from: L */
    public void mo4963L() {
        C0210b5 b5Var = mo4817f(C1196u4.C1198b.LEFT).f4581a;
        C0210b5 b5Var2 = mo4817f(C1196u4.C1198b.TOP).f4581a;
        b5Var.mo1580j((C0210b5) null, 0.0f);
        b5Var2.mo1580j((C0210b5) null, 0.0f);
    }

    /* renamed from: c */
    public void mo4425c(int i) {
        super.mo4425c(i);
        int size = this.f2096i0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2096i0.get(i2).mo4425c(i);
        }
    }

    /* renamed from: r */
    public void mo2764r() {
        this.f4900k0.mo3969t();
        this.f4906q0.clear();
        this.f4913x0 = false;
        super.mo2764r();
    }
}
