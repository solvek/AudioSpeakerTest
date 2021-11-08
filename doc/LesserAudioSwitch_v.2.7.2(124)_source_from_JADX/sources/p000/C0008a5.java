package p000;

/* renamed from: a5 */
public class C0008a5 {

    /* renamed from: a */
    public static boolean[] f29a = new boolean[3];

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15a(p000.C1236v4 r5, int r6) {
        /*
            v4$a[] r0 = r5.f4705C
            r1 = r0[r6]
            v4$a r2 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.f4709G
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0019
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            return r3
        L_0x0019:
            if (r6 != 0) goto L_0x0029
            int r6 = r5.f4737e
            if (r6 == 0) goto L_0x0020
            return r3
        L_0x0020:
            int r6 = r5.f4743h
            if (r6 != 0) goto L_0x0028
            int r5 = r5.f4745i
            if (r5 == 0) goto L_0x0037
        L_0x0028:
            return r3
        L_0x0029:
            int r6 = r5.f4739f
            if (r6 == 0) goto L_0x002e
            return r3
        L_0x002e:
            int r6 = r5.f4747k
            if (r6 != 0) goto L_0x0038
            int r5 = r5.f4748l
            if (r5 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return r4
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0008a5.m15a(v4, int):boolean");
    }

    /* renamed from: b */
    public static void m16b(C1236v4 v4Var, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        C1196u4[] u4VarArr = v4Var.f4703A;
        u4VarArr[i3].f4581a.f1241f = v4Var.f4706D.f4755s.f4581a;
        u4VarArr[i3].f4581a.f1242g = (float) i2;
        u4VarArr[i3].f4581a.f1879b = 1;
        u4VarArr[i4].f4581a.f1241f = u4VarArr[i3].f4581a;
        u4VarArr[i4].f4581a.f1242g = (float) v4Var.mo4821j(i);
        v4Var.f4703A[i4].f4581a.f1879b = 1;
    }
}
