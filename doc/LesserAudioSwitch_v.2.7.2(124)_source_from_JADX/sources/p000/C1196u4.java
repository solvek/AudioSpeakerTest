package p000;

import p000.C1043r4;

/* renamed from: u4 */
public class C1196u4 {

    /* renamed from: a */
    public C0210b5 f4581a = new C0210b5(this);

    /* renamed from: b */
    public final C1236v4 f4582b;

    /* renamed from: c */
    public final C1198b f4583c;

    /* renamed from: d */
    public C1196u4 f4584d;

    /* renamed from: e */
    public int f4585e = 0;

    /* renamed from: f */
    public int f4586f = -1;

    /* renamed from: g */
    public C1197a f4587g = C1197a.NONE;

    /* renamed from: h */
    public int f4588h = 0;

    /* renamed from: i */
    public C1043r4 f4589i;

    /* renamed from: u4$a */
    public enum C1197a {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: u4$b */
    public enum C1198b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C1196u4(C1236v4 v4Var, C1198b bVar) {
        this.f4582b = v4Var;
        this.f4583c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if ((r6.f4582b.f4719Q > 0) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r4 != r12) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        if (r4 != r12) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0085, code lost:
        if (r4 != r2) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4767a(p000.C1196u4 r7, int r8, int r9, p000.C1196u4.C1197a r10, int r11, boolean r12) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L_0x0014
            r7 = 0
            r6.f4584d = r7
            r6.f4585e = r0
            r7 = -1
            r6.f4586f = r7
            u4$a r7 = p000.C1196u4.C1197a.NONE
            r6.f4587g = r7
            r7 = 2
            r6.f4588h = r7
            return r1
        L_0x0014:
            if (r12 != 0) goto L_0x008b
            u4$b r12 = p000.C1196u4.C1198b.CENTER_Y
            u4$b r2 = p000.C1196u4.C1198b.CENTER_X
            u4$b r3 = p000.C1196u4.C1198b.BASELINE
            u4$b r4 = r7.f4583c
            u4$b r5 = r6.f4583c
            if (r4 != r5) goto L_0x003b
            if (r5 != r3) goto L_0x0054
            v4 r12 = r7.f4582b
            int r12 = r12.f4719Q
            if (r12 <= 0) goto L_0x002c
            r12 = 1
            goto L_0x002d
        L_0x002c:
            r12 = 0
        L_0x002d:
            if (r12 == 0) goto L_0x0056
            v4 r12 = r6.f4582b
            int r12 = r12.f4719Q
            if (r12 <= 0) goto L_0x0037
            r12 = 1
            goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            if (r12 != 0) goto L_0x0054
            goto L_0x0056
        L_0x003b:
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0071;
                case 2: goto L_0x0058;
                case 3: goto L_0x0071;
                case 4: goto L_0x0058;
                case 5: goto L_0x0056;
                case 6: goto L_0x004e;
                case 7: goto L_0x0056;
                case 8: goto L_0x0056;
                default: goto L_0x0042;
            }
        L_0x0042:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            u4$b r8 = r6.f4583c
            java.lang.String r8 = r8.name()
            r7.<init>(r8)
            throw r7
        L_0x004e:
            if (r4 == r3) goto L_0x0056
            if (r4 == r2) goto L_0x0056
            if (r4 == r12) goto L_0x0056
        L_0x0054:
            r12 = 1
            goto L_0x0088
        L_0x0056:
            r12 = 0
            goto L_0x0088
        L_0x0058:
            u4$b r2 = p000.C1196u4.C1198b.TOP
            if (r4 == r2) goto L_0x0063
            u4$b r2 = p000.C1196u4.C1198b.BOTTOM
            if (r4 != r2) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r2 = 0
            goto L_0x0064
        L_0x0063:
            r2 = 1
        L_0x0064:
            v4 r3 = r7.f4582b
            boolean r3 = r3 instanceof p000.C1398y4
            if (r3 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x0054
            if (r4 != r12) goto L_0x0056
            goto L_0x0054
        L_0x006f:
            r12 = r2
            goto L_0x0088
        L_0x0071:
            u4$b r12 = p000.C1196u4.C1198b.LEFT
            if (r4 == r12) goto L_0x007c
            u4$b r12 = p000.C1196u4.C1198b.RIGHT
            if (r4 != r12) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r12 = 0
            goto L_0x007d
        L_0x007c:
            r12 = 1
        L_0x007d:
            v4 r3 = r7.f4582b
            boolean r3 = r3 instanceof p000.C1398y4
            if (r3 == 0) goto L_0x0088
            if (r12 != 0) goto L_0x0054
            if (r4 != r2) goto L_0x0056
            goto L_0x0054
        L_0x0088:
            if (r12 != 0) goto L_0x008b
            return r0
        L_0x008b:
            r6.f4584d = r7
            if (r8 <= 0) goto L_0x0092
            r6.f4585e = r8
            goto L_0x0094
        L_0x0092:
            r6.f4585e = r0
        L_0x0094:
            r6.f4586f = r9
            r6.f4587g = r10
            r6.f4588h = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1196u4.mo4767a(u4, int, int, u4$a, int, boolean):boolean");
    }

    /* renamed from: b */
    public int mo4768b() {
        C1196u4 u4Var;
        if (this.f4582b.f4727Y == 8) {
            return 0;
        }
        int i = this.f4586f;
        if (i <= -1 || (u4Var = this.f4584d) == null || u4Var.f4582b.f4727Y != 8) {
            return this.f4585e;
        }
        return i;
    }

    /* renamed from: c */
    public boolean mo4769c() {
        return this.f4584d != null;
    }

    /* renamed from: d */
    public void mo4770d() {
        this.f4584d = null;
        this.f4585e = 0;
        this.f4586f = -1;
        this.f4587g = C1197a.STRONG;
        this.f4588h = 0;
        this.f4581a.mo1579i();
    }

    /* renamed from: e */
    public void mo4771e() {
        C1043r4 r4Var = this.f4589i;
        if (r4Var == null) {
            this.f4589i = new C1043r4(C1043r4.C1044a.UNRESTRICTED);
        } else {
            r4Var.mo4190c();
        }
    }

    public String toString() {
        return this.f4582b.f4728Z + ":" + this.f4583c.toString();
    }
}
