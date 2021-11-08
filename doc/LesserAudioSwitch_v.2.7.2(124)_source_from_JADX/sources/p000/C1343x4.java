package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: x4 */
public class C1343x4 {

    /* renamed from: a */
    public List<C1236v4> f5014a;

    /* renamed from: b */
    public boolean f5015b = false;

    /* renamed from: c */
    public final int[] f5016c = {-1, -1};

    /* renamed from: d */
    public List<C1236v4> f5017d = new ArrayList();

    /* renamed from: e */
    public List<C1236v4> f5018e = new ArrayList();

    /* renamed from: f */
    public HashSet<C1236v4> f5019f = new HashSet<>();

    /* renamed from: g */
    public HashSet<C1236v4> f5020g = new HashSet<>();

    /* renamed from: h */
    public List<C1236v4> f5021h = new ArrayList();

    /* renamed from: i */
    public List<C1236v4> f5022i = new ArrayList();

    public C1343x4(List<C1236v4> list) {
        this.f5014a = list;
    }

    public C1343x4(List<C1236v4> list, boolean z) {
        this.f5014a = list;
        this.f5015b = z;
    }

    /* renamed from: a */
    public void mo5050a(C1236v4 v4Var, int i) {
        HashSet<C1236v4> hashSet;
        if (i == 0) {
            hashSet = this.f5019f;
        } else if (i == 1) {
            hashSet = this.f5020g;
        } else {
            return;
        }
        hashSet.add(v4Var);
    }

    /* renamed from: b */
    public final void mo5051b(ArrayList<C1236v4> arrayList, C1236v4 v4Var) {
        C1236v4 v4Var2;
        if (!v4Var.f4734c0) {
            arrayList.add(v4Var);
            v4Var.f4734c0 = true;
            if (!v4Var.mo4828q()) {
                if (v4Var instanceof C1441z4) {
                    C1441z4 z4Var = (C1441z4) v4Var;
                    int i = z4Var.f5260j0;
                    for (int i2 = 0; i2 < i; i2++) {
                        mo5051b(arrayList, z4Var.f5259i0[i2]);
                    }
                }
                for (C1196u4 u4Var : v4Var.f4703A) {
                    C1196u4 u4Var2 = u4Var.f4584d;
                    if (!(u4Var2 == null || (v4Var2 = u4Var2.f4582b) == v4Var.f4706D)) {
                        mo5051b(arrayList, v4Var2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5052c(p000.C1236v4 r7) {
        /*
            r6 = this;
            boolean r0 = r7.f4730a0
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r7.mo4828q()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            u4 r0 = r7.f4757u
            u4 r0 = r0.f4584d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            u4 r0 = r7.f4755s
            u4 r0 = r0.f4584d
        L_0x001d:
            if (r0 == 0) goto L_0x0041
            v4 r4 = r0.f4582b
            boolean r5 = r4.f4732b0
            if (r5 != 0) goto L_0x0028
            r6.mo5052c(r4)
        L_0x0028:
            u4$b r4 = r0.f4583c
            u4$b r5 = p000.C1196u4.C1198b.RIGHT
            if (r4 != r5) goto L_0x0038
            v4 r0 = r0.f4582b
            int r4 = r0.f4711I
            int r0 = r0.mo4825n()
            int r0 = r0 + r4
            goto L_0x0042
        L_0x0038:
            u4$b r5 = p000.C1196u4.C1198b.LEFT
            if (r4 != r5) goto L_0x0041
            v4 r0 = r0.f4582b
            int r0 = r0.f4711I
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r3 == 0) goto L_0x004c
            u4 r3 = r7.f4757u
            int r3 = r3.mo4768b()
            int r0 = r0 - r3
            goto L_0x0058
        L_0x004c:
            u4 r3 = r7.f4755s
            int r3 = r3.mo4768b()
            int r4 = r7.mo4825n()
            int r4 = r4 + r3
            int r0 = r0 + r4
        L_0x0058:
            int r3 = r7.mo4825n()
            int r3 = r0 - r3
            r7.mo4832x(r3, r0)
            u4 r3 = r7.f4759w
            u4 r3 = r3.f4584d
            if (r3 == 0) goto L_0x0083
            v4 r0 = r3.f4582b
            boolean r1 = r0.f4732b0
            if (r1 != 0) goto L_0x0070
            r6.mo5052c(r0)
        L_0x0070:
            v4 r0 = r3.f4582b
            int r1 = r0.f4712J
            int r0 = r0.f4719Q
            int r1 = r1 + r0
            int r0 = r7.f4719Q
            int r1 = r1 - r0
            int r0 = r7.f4708F
            int r0 = r0 + r1
            r7.mo4811A(r1, r0)
            r7.f4732b0 = r2
            return
        L_0x0083:
            u4 r3 = r7.f4758v
            u4 r3 = r3.f4584d
            if (r3 == 0) goto L_0x008a
            r1 = 1
        L_0x008a:
            if (r1 == 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            u4 r3 = r7.f4756t
            u4 r3 = r3.f4584d
        L_0x0091:
            if (r3 == 0) goto L_0x00b4
            v4 r4 = r3.f4582b
            boolean r5 = r4.f4732b0
            if (r5 != 0) goto L_0x009c
            r6.mo5052c(r4)
        L_0x009c:
            u4$b r4 = r3.f4583c
            u4$b r5 = p000.C1196u4.C1198b.BOTTOM
            if (r4 != r5) goto L_0x00ac
            v4 r0 = r3.f4582b
            int r3 = r0.f4712J
            int r0 = r0.mo4819h()
            int r0 = r0 + r3
            goto L_0x00b4
        L_0x00ac:
            u4$b r5 = p000.C1196u4.C1198b.TOP
            if (r4 != r5) goto L_0x00b4
            v4 r0 = r3.f4582b
            int r0 = r0.f4712J
        L_0x00b4:
            if (r1 == 0) goto L_0x00be
            u4 r1 = r7.f4758v
            int r1 = r1.mo4768b()
            int r0 = r0 - r1
            goto L_0x00ca
        L_0x00be:
            u4 r1 = r7.f4756t
            int r1 = r1.mo4768b()
            int r3 = r7.mo4819h()
            int r3 = r3 + r1
            int r0 = r0 + r3
        L_0x00ca:
            int r1 = r7.mo4819h()
            int r1 = r0 - r1
            r7.mo4811A(r1, r0)
            r7.f4732b0 = r2
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1343x4.mo5052c(v4):void");
    }
}
