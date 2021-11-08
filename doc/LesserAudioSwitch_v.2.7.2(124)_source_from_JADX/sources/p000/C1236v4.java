package p000;

import java.util.ArrayList;
import p000.C1196u4;

/* renamed from: v4 */
public class C1236v4 {

    /* renamed from: A */
    public C1196u4[] f4703A;

    /* renamed from: B */
    public ArrayList<C1196u4> f4704B;

    /* renamed from: C */
    public C1237a[] f4705C;

    /* renamed from: D */
    public C1236v4 f4706D;

    /* renamed from: E */
    public int f4707E;

    /* renamed from: F */
    public int f4708F;

    /* renamed from: G */
    public float f4709G;

    /* renamed from: H */
    public int f4710H;

    /* renamed from: I */
    public int f4711I;

    /* renamed from: J */
    public int f4712J;

    /* renamed from: K */
    public int f4713K;

    /* renamed from: L */
    public int f4714L;

    /* renamed from: M */
    public int f4715M;

    /* renamed from: N */
    public int f4716N;

    /* renamed from: O */
    public int f4717O;

    /* renamed from: P */
    public int f4718P;

    /* renamed from: Q */
    public int f4719Q;

    /* renamed from: R */
    public int f4720R;

    /* renamed from: S */
    public int f4721S;

    /* renamed from: T */
    public int f4722T;

    /* renamed from: U */
    public int f4723U;

    /* renamed from: V */
    public float f4724V;

    /* renamed from: W */
    public float f4725W;

    /* renamed from: X */
    public Object f4726X;

    /* renamed from: Y */
    public int f4727Y;

    /* renamed from: Z */
    public String f4728Z;

    /* renamed from: a */
    public int f4729a = -1;

    /* renamed from: a0 */
    public boolean f4730a0;

    /* renamed from: b */
    public int f4731b = -1;

    /* renamed from: b0 */
    public boolean f4732b0;

    /* renamed from: c */
    public C0256c5 f4733c;

    /* renamed from: c0 */
    public boolean f4734c0;

    /* renamed from: d */
    public C0256c5 f4735d;

    /* renamed from: d0 */
    public int f4736d0;

    /* renamed from: e */
    public int f4737e = 0;

    /* renamed from: e0 */
    public int f4738e0;

    /* renamed from: f */
    public int f4739f = 0;

    /* renamed from: f0 */
    public float[] f4740f0;

    /* renamed from: g */
    public int[] f4741g = new int[2];

    /* renamed from: g0 */
    public C1236v4[] f4742g0;

    /* renamed from: h */
    public int f4743h = 0;

    /* renamed from: h0 */
    public C1236v4[] f4744h0;

    /* renamed from: i */
    public int f4745i = 0;

    /* renamed from: j */
    public float f4746j = 1.0f;

    /* renamed from: k */
    public int f4747k = 0;

    /* renamed from: l */
    public int f4748l = 0;

    /* renamed from: m */
    public float f4749m = 1.0f;

    /* renamed from: n */
    public int f4750n = -1;

    /* renamed from: o */
    public float f4751o = 1.0f;

    /* renamed from: p */
    public C1343x4 f4752p = null;

    /* renamed from: q */
    public int[] f4753q = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: r */
    public float f4754r = 0.0f;

    /* renamed from: s */
    public C1196u4 f4755s = new C1196u4(this, C1196u4.C1198b.LEFT);

    /* renamed from: t */
    public C1196u4 f4756t = new C1196u4(this, C1196u4.C1198b.TOP);

    /* renamed from: u */
    public C1196u4 f4757u = new C1196u4(this, C1196u4.C1198b.RIGHT);

    /* renamed from: v */
    public C1196u4 f4758v = new C1196u4(this, C1196u4.C1198b.BOTTOM);

    /* renamed from: w */
    public C1196u4 f4759w = new C1196u4(this, C1196u4.C1198b.BASELINE);

    /* renamed from: x */
    public C1196u4 f4760x = new C1196u4(this, C1196u4.C1198b.CENTER_X);

    /* renamed from: y */
    public C1196u4 f4761y = new C1196u4(this, C1196u4.C1198b.CENTER_Y);

    /* renamed from: z */
    public C1196u4 f4762z;

    /* renamed from: v4$a */
    public enum C1237a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C1236v4() {
        C1196u4 u4Var = new C1196u4(this, C1196u4.C1198b.CENTER);
        this.f4762z = u4Var;
        this.f4703A = new C1196u4[]{this.f4755s, this.f4757u, this.f4756t, this.f4758v, this.f4759w, u4Var};
        ArrayList<C1196u4> arrayList = new ArrayList<>();
        this.f4704B = arrayList;
        C1237a aVar = C1237a.FIXED;
        this.f4705C = new C1237a[]{aVar, aVar};
        this.f4706D = null;
        this.f4707E = 0;
        this.f4708F = 0;
        this.f4709G = 0.0f;
        this.f4710H = -1;
        this.f4711I = 0;
        this.f4712J = 0;
        this.f4713K = 0;
        this.f4714L = 0;
        this.f4715M = 0;
        this.f4716N = 0;
        this.f4717O = 0;
        this.f4718P = 0;
        this.f4719Q = 0;
        this.f4724V = 0.5f;
        this.f4725W = 0.5f;
        this.f4727Y = 0;
        this.f4728Z = null;
        this.f4730a0 = false;
        this.f4732b0 = false;
        this.f4734c0 = false;
        this.f4736d0 = 0;
        this.f4738e0 = 0;
        this.f4740f0 = new float[]{-1.0f, -1.0f};
        this.f4742g0 = new C1236v4[]{null, null};
        this.f4744h0 = new C1236v4[]{null, null};
        arrayList.add(this.f4755s);
        this.f4704B.add(this.f4756t);
        this.f4704B.add(this.f4757u);
        this.f4704B.add(this.f4758v);
        this.f4704B.add(this.f4760x);
        this.f4704B.add(this.f4761y);
        this.f4704B.add(this.f4762z);
        this.f4704B.add(this.f4759w);
    }

    /* renamed from: A */
    public void mo4811A(int i, int i2) {
        this.f4712J = i;
        int i3 = i2 - i;
        this.f4708F = i3;
        int i4 = this.f4721S;
        if (i3 < i4) {
            this.f4708F = i4;
        }
    }

    /* renamed from: B */
    public void mo4812B(C1237a aVar) {
        this.f4705C[1] = aVar;
        if (aVar == C1237a.WRAP_CONTENT) {
            mo4831w(this.f4723U);
        }
    }

    /* renamed from: C */
    public void mo4813C(int i) {
        this.f4707E = i;
        int i2 = this.f4720R;
        if (i < i2) {
            this.f4707E = i2;
        }
    }

    /* renamed from: D */
    public void mo2762D() {
        int i = this.f4711I;
        int i2 = this.f4712J;
        this.f4715M = i;
        this.f4716N = i2;
    }

    /* renamed from: E */
    public void mo4814E(C0955p4 p4Var) {
        int i;
        int i2;
        int o = p4Var.mo3964o(this.f4755s);
        int o2 = p4Var.mo3964o(this.f4756t);
        int o3 = p4Var.mo3964o(this.f4757u);
        int o4 = p4Var.mo3964o(this.f4758v);
        int i3 = o4 - o2;
        if (o3 - o < 0 || i3 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o4 = 0;
            o = 0;
            o2 = 0;
            o3 = 0;
        }
        int i4 = o3 - o;
        int i5 = o4 - o2;
        this.f4711I = o;
        this.f4712J = o2;
        if (this.f4727Y == 8) {
            this.f4707E = 0;
            this.f4708F = 0;
            return;
        }
        C1237a[] aVarArr = this.f4705C;
        C1237a aVar = aVarArr[0];
        C1237a aVar2 = C1237a.FIXED;
        if (aVar == aVar2 && i4 < (i2 = this.f4707E)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.f4708F)) {
            i5 = i;
        }
        this.f4707E = i4;
        this.f4708F = i5;
        int i6 = this.f4721S;
        if (i5 < i6) {
            this.f4708F = i6;
        }
        int i7 = this.f4720R;
        if (i4 < i7) {
            this.f4707E = i7;
        }
        this.f4732b0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0334 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4423a(p000.C0955p4 r42) {
        /*
            r41 = this;
            r15 = r41
            r14 = r42
            v4$a r10 = p000.C1236v4.C1237a.WRAP_CONTENT
            u4 r0 = r15.f4755s
            r4 r21 = r14.mo3961l(r0)
            u4 r0 = r15.f4757u
            r4 r6 = r14.mo3961l(r0)
            u4 r0 = r15.f4756t
            r4 r4 = r14.mo3961l(r0)
            u4 r0 = r15.f4758v
            r4 r3 = r14.mo3961l(r0)
            u4 r0 = r15.f4759w
            r4 r2 = r14.mo3961l(r0)
            v4 r0 = r15.f4706D
            r1 = 8
            r13 = 1
            r12 = 0
            if (r0 == 0) goto L_0x00d3
            if (r0 == 0) goto L_0x0036
            v4$a[] r5 = r0.f4705C
            r5 = r5[r12]
            if (r5 != r10) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x0041
            v4$a[] r0 = r0.f4705C
            r0 = r0[r13]
            if (r0 != r10) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            boolean r7 = r15.mo4827p(r12)
            if (r7 == 0) goto L_0x0051
            v4 r7 = r15.f4706D
            w4 r7 = (p000.C1292w4) r7
            r7.mo4958G(r15, r12)
        L_0x004f:
            r7 = 1
            goto L_0x0067
        L_0x0051:
            u4 r7 = r15.f4755s
            u4 r8 = r7.f4584d
            if (r8 == 0) goto L_0x005b
            u4 r8 = r8.f4584d
            if (r8 == r7) goto L_0x004f
        L_0x005b:
            u4 r7 = r15.f4757u
            u4 r8 = r7.f4584d
            if (r8 == 0) goto L_0x0066
            u4 r8 = r8.f4584d
            if (r8 != r7) goto L_0x0066
            goto L_0x004f
        L_0x0066:
            r7 = 0
        L_0x0067:
            boolean r8 = r15.mo4827p(r13)
            if (r8 == 0) goto L_0x0076
            v4 r8 = r15.f4706D
            w4 r8 = (p000.C1292w4) r8
            r8.mo4958G(r15, r13)
        L_0x0074:
            r8 = 1
            goto L_0x008c
        L_0x0076:
            u4 r8 = r15.f4756t
            u4 r9 = r8.f4584d
            if (r9 == 0) goto L_0x0080
            u4 r9 = r9.f4584d
            if (r9 == r8) goto L_0x0074
        L_0x0080:
            u4 r8 = r15.f4758v
            u4 r9 = r8.f4584d
            if (r9 == 0) goto L_0x008b
            u4 r9 = r9.f4584d
            if (r9 != r8) goto L_0x008b
            goto L_0x0074
        L_0x008b:
            r8 = 0
        L_0x008c:
            if (r5 == 0) goto L_0x00a9
            int r9 = r15.f4727Y
            if (r9 == r1) goto L_0x00a9
            u4 r9 = r15.f4755s
            u4 r9 = r9.f4584d
            if (r9 != 0) goto L_0x00a9
            u4 r9 = r15.f4757u
            u4 r9 = r9.f4584d
            if (r9 != 0) goto L_0x00a9
            v4 r9 = r15.f4706D
            u4 r9 = r9.f4757u
            r4 r9 = r14.mo3961l(r9)
            r14.mo3955f(r9, r6, r12, r13)
        L_0x00a9:
            if (r0 == 0) goto L_0x00ca
            int r9 = r15.f4727Y
            if (r9 == r1) goto L_0x00ca
            u4 r9 = r15.f4756t
            u4 r9 = r9.f4584d
            if (r9 != 0) goto L_0x00ca
            u4 r9 = r15.f4758v
            u4 r9 = r9.f4584d
            if (r9 != 0) goto L_0x00ca
            u4 r9 = r15.f4759w
            if (r9 != 0) goto L_0x00ca
            v4 r9 = r15.f4706D
            u4 r9 = r9.f4758v
            r4 r9 = r14.mo3961l(r9)
            r14.mo3955f(r9, r3, r12, r13)
        L_0x00ca:
            r22 = r0
            r16 = r5
            r20 = r7
            r23 = r8
            goto L_0x00db
        L_0x00d3:
            r16 = 0
            r20 = 0
            r22 = 0
            r23 = 0
        L_0x00db:
            int r0 = r15.f4707E
            int r5 = r15.f4720R
            if (r0 >= r5) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r5 = r0
        L_0x00e3:
            int r7 = r15.f4708F
            int r8 = r15.f4721S
            if (r7 >= r8) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r8 = r7
        L_0x00eb:
            v4$a[] r9 = r15.f4705C
            r11 = r9[r12]
            v4$a r12 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            if (r11 == r12) goto L_0x00f5
            r11 = 1
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            r1 = r9[r13]
            if (r1 == r12) goto L_0x00fc
            r1 = 1
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            int r13 = r15.f4710H
            r15.f4750n = r13
            r24 = r2
            float r2 = r15.f4709G
            r15.f4751o = r2
            r25 = r3
            int r3 = r15.f4737e
            r26 = r4
            int r4 = r15.f4739f
            r27 = 0
            r28 = 4
            r29 = r6
            int r27 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r27 <= 0) goto L_0x0283
            int r6 = r15.f4727Y
            r30 = r5
            r5 = 8
            if (r6 == r5) goto L_0x0285
            r5 = 0
            r6 = r9[r5]
            if (r6 != r12) goto L_0x0129
            if (r3 != 0) goto L_0x0129
            r3 = 3
        L_0x0129:
            r6 = 1
            r5 = r9[r6]
            if (r5 != r12) goto L_0x0131
            if (r4 != 0) goto L_0x0131
            r4 = 3
        L_0x0131:
            r5 = 0
            r6 = r9[r5]
            r31 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r12) goto L_0x0226
            r6 = 1
            r5 = r9[r6]
            if (r5 != r12) goto L_0x0226
            r5 = 3
            if (r3 != r5) goto L_0x0226
            if (r4 != r5) goto L_0x0226
            r0 = -1
            if (r13 != r0) goto L_0x015a
            if (r11 == 0) goto L_0x014d
            if (r1 != 0) goto L_0x014d
            r5 = 0
            r15.f4750n = r5
            goto L_0x015a
        L_0x014d:
            if (r11 != 0) goto L_0x015a
            if (r1 == 0) goto L_0x015a
            r1 = 1
            r15.f4750n = r1
            if (r13 != r0) goto L_0x015a
            float r0 = r31 / r2
            r15.f4751o = r0
        L_0x015a:
            int r0 = r15.f4750n
            if (r0 != 0) goto L_0x0172
            u4 r0 = r15.f4756t
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x016e
            u4 r0 = r15.f4758v
            boolean r0 = r0.mo4769c()
            if (r0 != 0) goto L_0x0172
        L_0x016e:
            r0 = 1
        L_0x016f:
            r15.f4750n = r0
            goto L_0x0189
        L_0x0172:
            r0 = 1
            int r1 = r15.f4750n
            if (r1 != r0) goto L_0x0189
            u4 r0 = r15.f4755s
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x0187
            u4 r0 = r15.f4757u
            boolean r0 = r0.mo4769c()
            if (r0 != 0) goto L_0x0189
        L_0x0187:
            r0 = 0
            goto L_0x016f
        L_0x0189:
            int r0 = r15.f4750n
            r1 = -1
            if (r0 != r1) goto L_0x01da
            u4 r0 = r15.f4756t
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x01ae
            u4 r0 = r15.f4758v
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x01ae
            u4 r0 = r15.f4755s
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x01ae
            u4 r0 = r15.f4757u
            boolean r0 = r0.mo4769c()
            if (r0 != 0) goto L_0x01da
        L_0x01ae:
            u4 r0 = r15.f4756t
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x01c2
            u4 r0 = r15.f4758v
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x01c2
            r0 = 0
        L_0x01bf:
            r15.f4750n = r0
            goto L_0x01da
        L_0x01c2:
            u4 r0 = r15.f4755s
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x01da
            u4 r0 = r15.f4757u
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x01da
            float r0 = r15.f4751o
            float r0 = r31 / r0
            r15.f4751o = r0
            r0 = 1
            goto L_0x01bf
        L_0x01da:
            int r0 = r15.f4750n
            r1 = -1
            if (r0 != r1) goto L_0x01f3
            if (r16 == 0) goto L_0x01e7
            if (r22 != 0) goto L_0x01e7
            r0 = 0
        L_0x01e4:
            r15.f4750n = r0
            goto L_0x01f3
        L_0x01e7:
            if (r16 != 0) goto L_0x01f3
            if (r22 == 0) goto L_0x01f3
            float r0 = r15.f4751o
            float r0 = r31 / r0
            r15.f4751o = r0
            r0 = 1
            goto L_0x01e4
        L_0x01f3:
            int r0 = r15.f4750n
            r1 = -1
            if (r0 != r1) goto L_0x0213
            int r0 = r15.f4743h
            if (r0 <= 0) goto L_0x0204
            int r1 = r15.f4747k
            if (r1 != 0) goto L_0x0204
            r1 = 0
            r15.f4750n = r1
            goto L_0x0213
        L_0x0204:
            if (r0 != 0) goto L_0x0213
            int r0 = r15.f4747k
            if (r0 <= 0) goto L_0x0213
            float r0 = r15.f4751o
            float r0 = r31 / r0
            r15.f4751o = r0
            r0 = 1
            r15.f4750n = r0
        L_0x0213:
            int r0 = r15.f4750n
            r1 = -1
            if (r0 != r1) goto L_0x0278
            if (r16 == 0) goto L_0x0278
            if (r22 == 0) goto L_0x0278
            float r0 = r15.f4751o
            float r0 = r31 / r0
            r15.f4751o = r0
            r0 = 1
            r15.f4750n = r0
            goto L_0x0278
        L_0x0226:
            r1 = 0
            r5 = r9[r1]
            if (r5 != r12) goto L_0x024f
            r5 = 3
            if (r3 != r5) goto L_0x024f
            r15.f4750n = r1
            float r0 = (float) r7
            float r2 = r2 * r0
            int r0 = (int) r2
            r1 = 1
            r2 = r9[r1]
            r30 = r0
            if (r2 == r12) goto L_0x0246
            r33 = r4
            r31 = r8
            r17 = 0
            r28 = 0
            r32 = 4
            goto L_0x028f
        L_0x0246:
            r32 = r3
            r33 = r4
            r31 = r8
            r17 = 0
            goto L_0x0280
        L_0x024f:
            r1 = 1
            r5 = r9[r1]
            if (r5 != r12) goto L_0x0278
            r5 = 3
            if (r4 != r5) goto L_0x0278
            r15.f4750n = r1
            r1 = -1
            if (r13 != r1) goto L_0x0260
            float r1 = r31 / r2
            r15.f4751o = r1
        L_0x0260:
            float r1 = r15.f4751o
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            r17 = 0
            r1 = r9[r17]
            r31 = r0
            r32 = r3
            if (r1 == r12) goto L_0x0275
            r28 = 0
            r33 = 4
            goto L_0x028f
        L_0x0275:
            r33 = r4
            goto L_0x0280
        L_0x0278:
            r17 = 0
            r32 = r3
            r33 = r4
            r31 = r8
        L_0x0280:
            r28 = 1
            goto L_0x028f
        L_0x0283:
            r30 = r5
        L_0x0285:
            r17 = 0
            r32 = r3
            r33 = r4
            r31 = r8
            r28 = 0
        L_0x028f:
            int[] r0 = r15.f4741g
            r0[r17] = r32
            r1 = 1
            r0[r1] = r33
            if (r28 == 0) goto L_0x02a2
            int r0 = r15.f4750n
            r6 = -1
            if (r0 == 0) goto L_0x029f
            if (r0 != r6) goto L_0x02a3
        L_0x029f:
            r27 = 1
            goto L_0x02a5
        L_0x02a2:
            r6 = -1
        L_0x02a3:
            r27 = 0
        L_0x02a5:
            v4$a[] r0 = r15.f4705C
            r1 = 0
            r0 = r0[r1]
            if (r0 != r10) goto L_0x02b3
            boolean r0 = r15 instanceof p000.C1292w4
            if (r0 == 0) goto L_0x02b3
            r34 = 1
            goto L_0x02b5
        L_0x02b3:
            r34 = 0
        L_0x02b5:
            u4 r0 = r15.f4762z
            boolean r0 = r0.mo4769c()
            r1 = 1
            r35 = r0 ^ 1
            int r0 = r15.f4729a
            r4 = 2
            r36 = 0
            if (r0 == r4) goto L_0x0323
            v4 r0 = r15.f4706D
            if (r0 == 0) goto L_0x02d2
            u4 r0 = r0.f4757u
            r4 r0 = r14.mo3961l(r0)
            r37 = r0
            goto L_0x02d4
        L_0x02d2:
            r37 = r36
        L_0x02d4:
            v4 r0 = r15.f4706D
            if (r0 == 0) goto L_0x02e0
            u4 r0 = r0.f4755s
            r4 r0 = r14.mo3961l(r0)
            r3 = r0
            goto L_0x02e2
        L_0x02e0:
            r3 = r36
        L_0x02e2:
            v4$a[] r0 = r15.f4705C
            r2 = 0
            r5 = r0[r2]
            u4 r7 = r15.f4755s
            u4 r8 = r15.f4757u
            int r9 = r15.f4711I
            int r11 = r15.f4720R
            int[] r0 = r15.f4753q
            r12 = r0[r2]
            float r13 = r15.f4724V
            int r0 = r15.f4743h
            r17 = r0
            int r0 = r15.f4745i
            r18 = r0
            float r0 = r15.f4746j
            r19 = r0
            r0 = r41
            r1 = r42
            r38 = r24
            r2 = r16
            r24 = r25
            r39 = r26
            r4 = r37
            r25 = r29
            r6 = r34
            r40 = r10
            r10 = r30
            r14 = r27
            r15 = r20
            r16 = r32
            r20 = r35
            r0.mo4815d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x032d
        L_0x0323:
            r40 = r10
            r38 = r24
            r24 = r25
            r39 = r26
            r25 = r29
        L_0x032d:
            r15 = r41
            int r0 = r15.f4731b
            r1 = 2
            if (r0 != r1) goto L_0x0335
            return
        L_0x0335:
            v4$a[] r0 = r15.f4705C
            r14 = 1
            r0 = r0[r14]
            r1 = r40
            if (r0 != r1) goto L_0x0344
            boolean r0 = r15 instanceof p000.C1292w4
            if (r0 == 0) goto L_0x0344
            r6 = 1
            goto L_0x0345
        L_0x0344:
            r6 = 0
        L_0x0345:
            if (r28 == 0) goto L_0x0351
            int r0 = r15.f4750n
            if (r0 == r14) goto L_0x034e
            r1 = -1
            if (r0 != r1) goto L_0x0351
        L_0x034e:
            r16 = 1
            goto L_0x0353
        L_0x0351:
            r16 = 0
        L_0x0353:
            int r0 = r15.f4719Q
            if (r0 <= 0) goto L_0x037e
            u4 r1 = r15.f4759w
            b5 r1 = r1.f4581a
            int r2 = r1.f1879b
            r10 = r42
            if (r2 != r14) goto L_0x0365
            r1.mo1575e(r10)
            goto L_0x0380
        L_0x0365:
            r1 = 6
            r2 = r38
            r4 = r39
            r10.mo3953d(r2, r4, r0, r1)
            u4 r0 = r15.f4759w
            u4 r0 = r0.f4584d
            if (r0 == 0) goto L_0x0382
            r4 r0 = r10.mo3961l(r0)
            r3 = 0
            r10.mo3953d(r2, r0, r3, r1)
            r20 = 0
            goto L_0x0384
        L_0x037e:
            r10 = r42
        L_0x0380:
            r4 = r39
        L_0x0382:
            r20 = r35
        L_0x0384:
            v4 r0 = r15.f4706D
            if (r0 == 0) goto L_0x0391
            u4 r0 = r0.f4758v
            r4 r0 = r10.mo3961l(r0)
            r26 = r0
            goto L_0x0393
        L_0x0391:
            r26 = r36
        L_0x0393:
            v4 r0 = r15.f4706D
            if (r0 == 0) goto L_0x039f
            u4 r0 = r0.f4756t
            r4 r0 = r10.mo3961l(r0)
            r3 = r0
            goto L_0x03a1
        L_0x039f:
            r3 = r36
        L_0x03a1:
            v4$a[] r0 = r15.f4705C
            r5 = r0[r14]
            u4 r7 = r15.f4756t
            u4 r8 = r15.f4758v
            int r9 = r15.f4712J
            int r11 = r15.f4721S
            int[] r0 = r15.f4753q
            r12 = r0[r14]
            float r13 = r15.f4725W
            int r0 = r15.f4747k
            r17 = r0
            int r0 = r15.f4748l
            r18 = r0
            float r0 = r15.f4749m
            r19 = r0
            r0 = r41
            r1 = r42
            r2 = r22
            r22 = r4
            r4 = r26
            r10 = r31
            r14 = r16
            r15 = r23
            r16 = r33
            r0.mo4815d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r28 == 0) goto L_0x03fa
            r6 = 6
            r7 = r41
            int r0 = r7.f4750n
            r1 = 1
            float r5 = r7.f4751o
            if (r0 != r1) goto L_0x03eb
            r0 = r42
            r1 = r24
            r2 = r22
            r3 = r25
            r4 = r21
            goto L_0x03f6
        L_0x03eb:
            r6 = 6
            r0 = r42
            r1 = r25
            r2 = r21
            r3 = r24
            r4 = r22
        L_0x03f6:
            r0.mo3957h(r1, r2, r3, r4, r5, r6)
            goto L_0x03fc
        L_0x03fa:
            r7 = r41
        L_0x03fc:
            u4 r0 = r7.f4762z
            boolean r0 = r0.mo4769c()
            if (r0 == 0) goto L_0x04a1
            u4 r0 = r7.f4762z
            u4 r0 = r0.f4584d
            v4 r0 = r0.f4582b
            float r1 = r7.f4754r
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            u4 r2 = r7.f4762z
            int r2 = r2.mo4768b()
            u4$b r3 = p000.C1196u4.C1198b.LEFT
            u4 r4 = r7.mo4817f(r3)
            r5 = r42
            r4 r9 = r5.mo3961l(r4)
            u4$b r4 = p000.C1196u4.C1198b.TOP
            u4 r6 = r7.mo4817f(r4)
            r4 r11 = r5.mo3961l(r6)
            u4$b r6 = p000.C1196u4.C1198b.RIGHT
            u4 r8 = r7.mo4817f(r6)
            r4 r16 = r5.mo3961l(r8)
            u4$b r8 = p000.C1196u4.C1198b.BOTTOM
            u4 r10 = r7.mo4817f(r8)
            r4 r12 = r5.mo3961l(r10)
            u4 r3 = r0.mo4817f(r3)
            r4 r3 = r5.mo3961l(r3)
            u4 r4 = r0.mo4817f(r4)
            r4 r13 = r5.mo3961l(r4)
            u4 r4 = r0.mo4817f(r6)
            r4 r4 = r5.mo3961l(r4)
            u4 r0 = r0.mo4817f(r8)
            r4 r14 = r5.mo3961l(r0)
            m4 r0 = r42.mo3962m()
            double r6 = (double) r1
            double r17 = java.lang.Math.sin(r6)
            double r1 = (double) r2
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            r19 = r3
            r20 = r4
            double r3 = r17 * r1
            float r15 = (float) r3
            r10 = r0
            r10.mo3662f(r11, r12, r13, r14, r15)
            r5.mo3952c(r0)
            m4 r0 = r42.mo3962m()
            double r3 = java.lang.Math.cos(r6)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            double r3 = r3 * r1
            float r13 = (float) r3
            r8 = r0
            r10 = r16
            r11 = r19
            r12 = r20
            r8.mo3662f(r9, r10, r11, r12, r13)
            r5.mo3952c(r0)
        L_0x04a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1236v4.mo4423a(p4):void");
    }

    /* renamed from: b */
    public boolean mo4424b() {
        return this.f4727Y != 8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d2, code lost:
        if (r9 != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01dd, code lost:
        if (r9 != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e8, code lost:
        r7.f1239d = r4;
        r7.f1240e = (float) r1;
        r4.f1878a.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r9 != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        if (r9 != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fe, code lost:
        if (r9 != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        if (r9 != false) goto L_0x010f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4425c(int r18) {
        /*
            r17 = this;
            r0 = r17
            v4$a r1 = p000.C1236v4.C1237a.FIXED
            r2 = 0
            r3 = 0
        L_0x0006:
            r4 = 6
            r5 = 4
            if (r3 >= r4) goto L_0x003a
            u4[] r4 = r0.f4703A
            r4 = r4[r3]
            b5 r4 = r4.f4581a
            u4 r6 = r4.f1238c
            u4 r7 = r6.f4584d
            if (r7 != 0) goto L_0x0017
            goto L_0x0037
        L_0x0017:
            u4 r8 = r7.f4584d
            if (r8 != r6) goto L_0x0021
            r4.f1243h = r5
            b5 r8 = r7.f4581a
            r8.f1243h = r5
        L_0x0021:
            int r5 = r6.mo4768b()
            u4 r6 = r4.f1238c
            u4$b r6 = r6.f4583c
            u4$b r8 = p000.C1196u4.C1198b.RIGHT
            if (r6 == r8) goto L_0x0031
            u4$b r8 = p000.C1196u4.C1198b.BOTTOM
            if (r6 != r8) goto L_0x0032
        L_0x0031:
            int r5 = -r5
        L_0x0032:
            b5 r6 = r7.f4581a
            r4.mo1577g(r6, r5)
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x003a:
            u4 r3 = r0.f4755s
            b5 r3 = r3.f4581a
            u4 r4 = r0.f4756t
            b5 r4 = r4.f4581a
            u4 r6 = r0.f4757u
            b5 r6 = r6.f4581a
            u4 r7 = r0.f4758v
            b5 r7 = r7.f4581a
            r8 = 8
            r9 = r18 & 8
            r10 = 1
            if (r9 != r8) goto L_0x0053
            r9 = 1
            goto L_0x0054
        L_0x0053:
            r9 = 0
        L_0x0054:
            v4$a[] r11 = r0.f4705C
            r11 = r11[r2]
            v4$a r12 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0064
            boolean r11 = p000.C0008a5.m15a(r0, r2)
            if (r11 == 0) goto L_0x0064
            r11 = 1
            goto L_0x0065
        L_0x0064:
            r11 = 0
        L_0x0065:
            int r13 = r3.f1243h
            r15 = 2
            r14 = 3
            r16 = 0
            if (r13 == r5) goto L_0x0197
            int r13 = r6.f1243h
            if (r13 == r5) goto L_0x0197
            v4$a[] r13 = r0.f4705C
            r13 = r13[r2]
            if (r13 == r1) goto L_0x00ee
            if (r11 == 0) goto L_0x007f
            int r13 = r0.f4727Y
            if (r13 != r8) goto L_0x007f
            goto L_0x00ee
        L_0x007f:
            if (r11 == 0) goto L_0x0197
            int r11 = r17.mo4825n()
            r3.f1243h = r10
            r6.f1243h = r10
            u4 r13 = r0.f4755s
            u4 r13 = r13.f4584d
            if (r13 != 0) goto L_0x0099
            u4 r2 = r0.f4757u
            u4 r2 = r2.f4584d
            if (r2 != 0) goto L_0x0099
            if (r9 == 0) goto L_0x00a5
            goto L_0x010f
        L_0x0099:
            if (r13 == 0) goto L_0x00aa
            u4 r2 = r0.f4757u
            u4 r2 = r2.f4584d
            if (r2 != 0) goto L_0x00aa
            if (r9 == 0) goto L_0x00a5
            goto L_0x010f
        L_0x00a5:
            r6.f1239d = r3
            float r2 = (float) r11
            goto L_0x011f
        L_0x00aa:
            if (r13 != 0) goto L_0x00b9
            u4 r2 = r0.f4757u
            u4 r2 = r2.f4584d
            if (r2 == 0) goto L_0x00b9
            if (r9 == 0) goto L_0x00b6
            goto L_0x0144
        L_0x00b6:
            int r2 = -r11
            goto L_0x0152
        L_0x00b9:
            if (r13 == 0) goto L_0x0197
            u4 r2 = r0.f4757u
            u4 r2 = r2.f4584d
            if (r2 == 0) goto L_0x0197
            if (r9 == 0) goto L_0x00d5
            c5 r2 = r17.mo4823l()
            java.util.HashSet<d5> r2 = r2.f1878a
            r2.add(r3)
            c5 r2 = r17.mo4823l()
            java.util.HashSet<d5> r2 = r2.f1878a
            r2.add(r6)
        L_0x00d5:
            float r2 = r0.f4709G
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00e1
            r3.f1243h = r14
            r6.f1243h = r14
            goto L_0x0193
        L_0x00e1:
            r3.f1243h = r15
            r6.f1243h = r15
            r3.f1244i = r6
            r6.f1244i = r3
            r0.mo4813C(r11)
            goto L_0x0197
        L_0x00ee:
            u4 r2 = r0.f4755s
            u4 r2 = r2.f4584d
            if (r2 != 0) goto L_0x0101
            u4 r11 = r0.f4757u
            u4 r11 = r11.f4584d
            if (r11 != 0) goto L_0x0101
            r3.f1243h = r10
            r6.f1243h = r10
            if (r9 == 0) goto L_0x0118
            goto L_0x010f
        L_0x0101:
            if (r2 == 0) goto L_0x0127
            u4 r11 = r0.f4757u
            u4 r11 = r11.f4584d
            if (r11 != 0) goto L_0x0127
            r3.f1243h = r10
            r6.f1243h = r10
            if (r9 == 0) goto L_0x0118
        L_0x010f:
            c5 r2 = r17.mo4823l()
            r6.mo1578h(r3, r10, r2)
            goto L_0x0197
        L_0x0118:
            int r2 = r17.mo4825n()
            r6.f1239d = r3
            float r2 = (float) r2
        L_0x011f:
            r6.f1240e = r2
            java.util.HashSet<d5> r2 = r3.f1878a
            r2.add(r6)
            goto L_0x0197
        L_0x0127:
            if (r2 != 0) goto L_0x015d
            u4 r11 = r0.f4757u
            u4 r11 = r11.f4584d
            if (r11 == 0) goto L_0x015d
            r3.f1243h = r10
            r6.f1243h = r10
            int r2 = r17.mo4825n()
            int r2 = -r2
            r3.f1239d = r6
            float r2 = (float) r2
            r3.f1240e = r2
            java.util.HashSet<d5> r2 = r6.f1878a
            r2.add(r3)
            if (r9 == 0) goto L_0x014d
        L_0x0144:
            c5 r2 = r17.mo4823l()
            r11 = -1
            r3.mo1578h(r6, r11, r2)
            goto L_0x0197
        L_0x014d:
            int r2 = r17.mo4825n()
            int r2 = -r2
        L_0x0152:
            r3.f1239d = r6
            float r2 = (float) r2
            r3.f1240e = r2
            java.util.HashSet<d5> r2 = r6.f1878a
            r2.add(r3)
            goto L_0x0197
        L_0x015d:
            if (r2 == 0) goto L_0x0197
            u4 r2 = r0.f4757u
            u4 r2 = r2.f4584d
            if (r2 == 0) goto L_0x0197
            r3.f1243h = r15
            r6.f1243h = r15
            if (r9 == 0) goto L_0x0193
            c5 r2 = r17.mo4823l()
            java.util.HashSet<d5> r2 = r2.f1878a
            r2.add(r3)
            c5 r2 = r17.mo4823l()
            java.util.HashSet<d5> r2 = r2.f1878a
            r2.add(r6)
            c5 r2 = r17.mo4823l()
            r3.f1244i = r6
            r3.f1247l = r2
            r2 = -1
            r3.f1248m = r2
            c5 r2 = r17.mo4823l()
            r6.f1244i = r3
            r6.f1247l = r2
            r6.f1248m = r10
            goto L_0x0197
        L_0x0193:
            r3.f1244i = r6
            r6.f1244i = r3
        L_0x0197:
            v4$a[] r2 = r0.f4705C
            r2 = r2[r10]
            if (r2 != r12) goto L_0x01a5
            boolean r2 = p000.C0008a5.m15a(r0, r10)
            if (r2 == 0) goto L_0x01a5
            r2 = 1
            goto L_0x01a6
        L_0x01a5:
            r2 = 0
        L_0x01a6:
            int r3 = r4.f1243h
            if (r3 == r5) goto L_0x0325
            int r3 = r7.f1243h
            if (r3 == r5) goto L_0x0325
            v4$a[] r3 = r0.f4705C
            r3 = r3[r10]
            if (r3 == r1) goto L_0x0251
            if (r2 == 0) goto L_0x01bc
            int r1 = r0.f4727Y
            if (r1 != r8) goto L_0x01bc
            goto L_0x0251
        L_0x01bc:
            if (r2 == 0) goto L_0x0325
            int r1 = r17.mo4819h()
            r4.f1243h = r10
            r7.f1243h = r10
            u4 r2 = r0.f4756t
            u4 r2 = r2.f4584d
            if (r2 != 0) goto L_0x01d5
            u4 r3 = r0.f4758v
            u4 r3 = r3.f4584d
            if (r3 != 0) goto L_0x01d5
            if (r9 == 0) goto L_0x01e8
            goto L_0x01df
        L_0x01d5:
            if (r2 == 0) goto L_0x01f4
            u4 r3 = r0.f4758v
            u4 r3 = r3.f4584d
            if (r3 != 0) goto L_0x01f4
            if (r9 == 0) goto L_0x01e8
        L_0x01df:
            c5 r1 = r17.mo4822k()
            r7.mo1578h(r4, r10, r1)
            goto L_0x0325
        L_0x01e8:
            r7.f1239d = r4
            float r1 = (float) r1
            r7.f1240e = r1
            java.util.HashSet<d5> r1 = r4.f1878a
            r1.add(r7)
            goto L_0x0325
        L_0x01f4:
            if (r2 != 0) goto L_0x0215
            u4 r3 = r0.f4758v
            u4 r3 = r3.f4584d
            if (r3 == 0) goto L_0x0215
            if (r9 == 0) goto L_0x0208
            c5 r1 = r17.mo4822k()
            r2 = -1
            r4.mo1578h(r7, r2, r1)
            goto L_0x0325
        L_0x0208:
            int r1 = -r1
            r4.f1239d = r7
            float r1 = (float) r1
            r4.f1240e = r1
            java.util.HashSet<d5> r1 = r7.f1878a
            r1.add(r4)
            goto L_0x0325
        L_0x0215:
            if (r2 == 0) goto L_0x0325
            u4 r2 = r0.f4758v
            u4 r2 = r2.f4584d
            if (r2 == 0) goto L_0x0325
            if (r9 == 0) goto L_0x0231
            c5 r2 = r17.mo4822k()
            java.util.HashSet<d5> r2 = r2.f1878a
            r2.add(r4)
            c5 r2 = r17.mo4823l()
            java.util.HashSet<d5> r2 = r2.f1878a
            r2.add(r7)
        L_0x0231:
            float r2 = r0.f4709G
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0241
            r4.f1243h = r14
            r7.f1243h = r14
            r4.f1244i = r7
            r7.f1244i = r4
            goto L_0x0325
        L_0x0241:
            r4.f1243h = r15
            r7.f1243h = r15
            r4.f1244i = r7
            r7.f1244i = r4
            r0.mo4831w(r1)
            int r1 = r0.f4719Q
            if (r1 <= 0) goto L_0x0325
            goto L_0x02b3
        L_0x0251:
            u4 r1 = r0.f4756t
            u4 r1 = r1.f4584d
            if (r1 != 0) goto L_0x028b
            u4 r2 = r0.f4758v
            u4 r2 = r2.f4584d
            if (r2 != 0) goto L_0x028b
            r4.f1243h = r10
            r7.f1243h = r10
            if (r9 == 0) goto L_0x026b
            c5 r1 = r17.mo4822k()
            r7.mo1578h(r4, r10, r1)
            goto L_0x0279
        L_0x026b:
            int r1 = r17.mo4819h()
            r7.f1239d = r4
            float r1 = (float) r1
            r7.f1240e = r1
            java.util.HashSet<d5> r1 = r4.f1878a
            r1.add(r7)
        L_0x0279:
            u4 r1 = r0.f4759w
            u4 r2 = r1.f4584d
            if (r2 == 0) goto L_0x0325
            b5 r1 = r1.f4581a
            r1.f1243h = r10
            int r2 = r0.f4719Q
            int r2 = -r2
            r4.mo1576f(r10, r1, r2)
            goto L_0x0325
        L_0x028b:
            if (r1 == 0) goto L_0x02b6
            u4 r2 = r0.f4758v
            u4 r2 = r2.f4584d
            if (r2 != 0) goto L_0x02b6
            r4.f1243h = r10
            r7.f1243h = r10
            if (r9 == 0) goto L_0x02a1
            c5 r1 = r17.mo4822k()
            r7.mo1578h(r4, r10, r1)
            goto L_0x02af
        L_0x02a1:
            int r1 = r17.mo4819h()
            r7.f1239d = r4
            float r1 = (float) r1
            r7.f1240e = r1
            java.util.HashSet<d5> r1 = r4.f1878a
            r1.add(r7)
        L_0x02af:
            int r1 = r0.f4719Q
            if (r1 <= 0) goto L_0x0325
        L_0x02b3:
            u4 r2 = r0.f4759w
            goto L_0x0320
        L_0x02b6:
            if (r1 != 0) goto L_0x02e1
            u4 r2 = r0.f4758v
            u4 r2 = r2.f4584d
            if (r2 == 0) goto L_0x02e1
            r4.f1243h = r10
            r7.f1243h = r10
            if (r9 == 0) goto L_0x02cd
            c5 r1 = r17.mo4822k()
            r2 = -1
            r4.mo1578h(r7, r2, r1)
            goto L_0x02dc
        L_0x02cd:
            int r1 = r17.mo4819h()
            int r1 = -r1
            r4.f1239d = r7
            float r1 = (float) r1
            r4.f1240e = r1
            java.util.HashSet<d5> r1 = r7.f1878a
            r1.add(r4)
        L_0x02dc:
            int r1 = r0.f4719Q
            if (r1 <= 0) goto L_0x0325
            goto L_0x02b3
        L_0x02e1:
            if (r1 == 0) goto L_0x0325
            u4 r1 = r0.f4758v
            u4 r1 = r1.f4584d
            if (r1 == 0) goto L_0x0325
            r4.f1243h = r15
            r7.f1243h = r15
            if (r9 == 0) goto L_0x0317
            c5 r1 = r17.mo4822k()
            r4.f1244i = r7
            r4.f1247l = r1
            r1 = -1
            r4.f1248m = r1
            c5 r1 = r17.mo4822k()
            r7.f1244i = r4
            r7.f1247l = r1
            r7.f1248m = r10
            c5 r1 = r17.mo4822k()
            java.util.HashSet<d5> r1 = r1.f1878a
            r1.add(r4)
            c5 r1 = r17.mo4823l()
            java.util.HashSet<d5> r1 = r1.f1878a
            r1.add(r7)
            goto L_0x031b
        L_0x0317:
            r4.f1244i = r7
            r7.f1244i = r4
        L_0x031b:
            int r1 = r0.f4719Q
            if (r1 <= 0) goto L_0x0325
            goto L_0x02b3
        L_0x0320:
            b5 r2 = r2.f4581a
            r2.mo1576f(r10, r4, r1)
        L_0x0325:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1236v4.mo4425c(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a1, code lost:
        if (r25 != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019a, code lost:
        if (r25 != false) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018f A[ADDED_TO_REGION] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4815d(p000.C0955p4 r24, boolean r25, p000.C1043r4 r26, p000.C1043r4 r27, p000.C1236v4.C1237a r28, boolean r29, p000.C1196u4 r30, p000.C1196u4 r31, int r32, int r33, int r34, int r35, float r36, boolean r37, boolean r38, int r39, int r40, int r41, float r42, boolean r43) {
        /*
            r23 = this;
            r0 = r23
            r10 = r24
            r11 = r26
            r12 = r27
            r13 = r30
            r14 = r31
            r1 = r34
            r2 = r35
            u4$b r3 = p000.C1196u4.C1198b.BOTTOM
            r4 r15 = r10.mo3961l(r13)
            r4 r9 = r10.mo3961l(r14)
            u4 r4 = r13.f4584d
            r4 r8 = r10.mo3961l(r4)
            u4 r4 = r14.f4584d
            r4 r7 = r10.mo3961l(r4)
            boolean r4 = r10.f3554f
            r5 = 1
            if (r4 == 0) goto L_0x0049
            b5 r4 = r13.f4581a
            int r6 = r4.f1879b
            if (r6 != r5) goto L_0x0049
            b5 r6 = r14.f4581a
            int r6 = r6.f1879b
            if (r6 != r5) goto L_0x0049
            r4.mo1575e(r10)
            b5 r1 = r14.f4581a
            r1.mo1575e(r10)
            if (r38 != 0) goto L_0x0048
            if (r25 == 0) goto L_0x0048
            r1 = 0
            r2 = 6
            r10.mo3955f(r12, r9, r1, r2)
        L_0x0048:
            return
        L_0x0049:
            boolean r17 = r30.mo4769c()
            boolean r18 = r31.mo4769c()
            u4 r4 = r0.f4762z
            boolean r19 = r4.mo4769c()
            if (r18 == 0) goto L_0x005c
            int r4 = r17 + 1
            goto L_0x005e
        L_0x005c:
            r4 = r17
        L_0x005e:
            if (r19 == 0) goto L_0x0062
            int r4 = r4 + 1
        L_0x0062:
            r6 = r4
            if (r37 == 0) goto L_0x0067
            r4 = 3
            goto L_0x0069
        L_0x0067:
            r4 = r39
        L_0x0069:
            int r5 = r28.ordinal()
            r14 = 2
            r20 = r6
            if (r5 == 0) goto L_0x007e
            r6 = 1
            if (r5 == r6) goto L_0x007e
            if (r5 == r14) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            r6 = 4
            if (r4 != r6) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            r5 = 1
            goto L_0x0080
        L_0x007e:
            r6 = 4
        L_0x007f:
            r5 = 0
        L_0x0080:
            int r6 = r0.f4727Y
            r14 = 8
            if (r6 != r14) goto L_0x0089
            r5 = 0
            r6 = 0
            goto L_0x008c
        L_0x0089:
            r6 = r5
            r5 = r33
        L_0x008c:
            if (r43 == 0) goto L_0x00a9
            if (r17 != 0) goto L_0x009a
            if (r18 != 0) goto L_0x009a
            if (r19 != 0) goto L_0x009a
            r14 = r32
            r10.mo3954e(r15, r14)
            goto L_0x00a9
        L_0x009a:
            if (r17 == 0) goto L_0x00a9
            if (r18 != 0) goto L_0x00a9
            int r14 = r30.mo4768b()
            r21 = r7
            r7 = 6
            r10.mo3953d(r15, r8, r14, r7)
            goto L_0x00ac
        L_0x00a9:
            r21 = r7
            r7 = 6
        L_0x00ac:
            if (r6 != 0) goto L_0x00d8
            r3 = 0
            r14 = 3
            if (r29 == 0) goto L_0x00c3
            r10.mo3953d(r9, r15, r3, r14)
            if (r1 <= 0) goto L_0x00ba
            r10.mo3955f(r9, r15, r1, r7)
        L_0x00ba:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r5) goto L_0x00c6
            r10.mo3956g(r9, r15, r2, r7)
            goto L_0x00c6
        L_0x00c3:
            r10.mo3953d(r9, r15, r5, r7)
        L_0x00c6:
            r14 = r40
            r2 = r41
            r29 = r4
            r0 = r6
            r22 = r8
            r3 = r9
            r13 = r20
            r11 = r21
            r20 = 4
            goto L_0x018d
        L_0x00d8:
            r14 = 3
            r2 = -2
            r14 = r40
            r7 = r41
            if (r14 != r2) goto L_0x00e1
            r14 = r5
        L_0x00e1:
            if (r7 != r2) goto L_0x00e5
            r2 = r5
            goto L_0x00e6
        L_0x00e5:
            r2 = r7
        L_0x00e6:
            r7 = 6
            if (r14 <= 0) goto L_0x00f0
            r10.mo3955f(r9, r15, r14, r7)
            int r5 = java.lang.Math.max(r5, r14)
        L_0x00f0:
            if (r2 <= 0) goto L_0x00f9
            r10.mo3956g(r9, r15, r2, r7)
            int r5 = java.lang.Math.min(r5, r2)
        L_0x00f9:
            r7 = 1
            if (r4 != r7) goto L_0x010a
            r3 = 6
            if (r25 == 0) goto L_0x0104
        L_0x00ff:
            r10.mo3953d(r9, r15, r5, r3)
            goto L_0x0169
        L_0x0104:
            if (r38 == 0) goto L_0x0108
            r3 = 4
            goto L_0x00ff
        L_0x0108:
            r3 = 1
            goto L_0x00ff
        L_0x010a:
            r7 = 2
            r16 = 6
            if (r4 != r7) goto L_0x0169
            u4$b r6 = r13.f4583c
            u4$b r7 = p000.C1196u4.C1198b.TOP
            if (r6 == r7) goto L_0x0132
            if (r6 != r3) goto L_0x0118
            goto L_0x0132
        L_0x0118:
            v4 r3 = r0.f4706D
            u4$b r6 = p000.C1196u4.C1198b.LEFT
            u4 r3 = r3.mo4817f(r6)
            r4 r3 = r10.mo3961l(r3)
            v4 r6 = r0.f4706D
            u4$b r7 = p000.C1196u4.C1198b.RIGHT
            u4 r6 = r6.mo4817f(r7)
            r4 r6 = r10.mo3961l(r6)
            r7 = r6
            goto L_0x0148
        L_0x0132:
            v4 r6 = r0.f4706D
            u4 r6 = r6.mo4817f(r7)
            r4 r6 = r10.mo3961l(r6)
            v4 r7 = r0.f4706D
            u4 r3 = r7.mo4817f(r3)
            r4 r3 = r10.mo3961l(r3)
            r7 = r3
            r3 = r6
        L_0x0148:
            m4 r6 = r24.mo3962m()
            r13 = r4
            r0 = 3
            r4 = r6
            r0 = r5
            r5 = r9
            r1 = r6
            r29 = r13
            r13 = r20
            r20 = 4
            r6 = r15
            r11 = r21
            r22 = r8
            r8 = r3
            r3 = r9
            r9 = r42
            r4.mo3659c(r5, r6, r7, r8, r9)
            r10.mo3952c(r1)
            r6 = 0
            goto L_0x0175
        L_0x0169:
            r29 = r4
            r0 = r5
            r22 = r8
            r3 = r9
            r13 = r20
            r11 = r21
            r20 = 4
        L_0x0175:
            if (r6 == 0) goto L_0x018c
            r1 = 2
            if (r13 == r1) goto L_0x018c
            if (r37 != 0) goto L_0x018c
            int r0 = java.lang.Math.max(r14, r0)
            if (r2 <= 0) goto L_0x0186
            int r0 = java.lang.Math.min(r2, r0)
        L_0x0186:
            r1 = 6
            r10.mo3953d(r3, r15, r0, r1)
            r0 = 0
            goto L_0x018d
        L_0x018c:
            r0 = r6
        L_0x018d:
            if (r43 == 0) goto L_0x02c2
            if (r38 == 0) goto L_0x0193
            goto L_0x02c2
        L_0x0193:
            r13 = 5
            if (r17 != 0) goto L_0x019d
            if (r18 != 0) goto L_0x019d
            if (r19 != 0) goto L_0x019d
            if (r25 == 0) goto L_0x02b9
            goto L_0x01a3
        L_0x019d:
            if (r17 == 0) goto L_0x01a9
            if (r18 != 0) goto L_0x01a9
            if (r25 == 0) goto L_0x02b9
        L_0x01a3:
            r1 = 0
            r10.mo3955f(r12, r3, r1, r13)
            goto L_0x02b9
        L_0x01a9:
            r1 = 0
            if (r17 != 0) goto L_0x01c0
            if (r18 == 0) goto L_0x01c0
            int r0 = r31.mo4768b()
            int r0 = -r0
            r2 = 6
            r10.mo3953d(r3, r11, r0, r2)
            if (r25 == 0) goto L_0x02b9
            r11 = r26
            r10.mo3955f(r15, r11, r1, r13)
            goto L_0x02b9
        L_0x01c0:
            r9 = r11
            r11 = r26
            if (r17 == 0) goto L_0x02b9
            if (r18 == 0) goto L_0x02b9
            if (r0 == 0) goto L_0x0231
            if (r25 == 0) goto L_0x01d1
            if (r34 != 0) goto L_0x01d1
            r4 = 6
            r10.mo3955f(r3, r15, r1, r4)
        L_0x01d1:
            if (r29 != 0) goto L_0x01fd
            if (r2 > 0) goto L_0x01db
            if (r14 <= 0) goto L_0x01d8
            goto L_0x01db
        L_0x01d8:
            r1 = 0
            r6 = 6
            goto L_0x01dd
        L_0x01db:
            r1 = 1
            r6 = 4
        L_0x01dd:
            int r4 = r30.mo4768b()
            r8 = r22
            r10.mo3953d(r15, r8, r4, r6)
            int r4 = r31.mo4768b()
            int r4 = -r4
            r10.mo3953d(r3, r9, r4, r6)
            if (r2 > 0) goto L_0x01f5
            if (r14 <= 0) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            r6 = 0
            goto L_0x01f6
        L_0x01f5:
            r6 = 1
        L_0x01f6:
            r7 = r23
            r17 = r1
            r5 = r6
            r14 = 1
            goto L_0x023b
        L_0x01fd:
            r4 = r29
            r8 = r22
            r14 = 1
            if (r4 != r14) goto L_0x020c
            r5 = 1
            r17 = 1
            r18 = 6
            r7 = r23
            goto L_0x023d
        L_0x020c:
            r1 = 3
            r7 = r23
            if (r4 != r1) goto L_0x022f
            if (r37 != 0) goto L_0x021c
            int r1 = r7.f4750n
            r4 = -1
            if (r1 == r4) goto L_0x021c
            if (r2 > 0) goto L_0x021c
            r6 = 6
            goto L_0x021d
        L_0x021c:
            r6 = 4
        L_0x021d:
            int r1 = r30.mo4768b()
            r10.mo3953d(r15, r8, r1, r6)
            int r1 = r31.mo4768b()
            int r1 = -r1
            r10.mo3953d(r3, r9, r1, r6)
            r5 = 1
            r6 = 1
            goto L_0x0239
        L_0x022f:
            r6 = 0
            goto L_0x0237
        L_0x0231:
            r7 = r23
            r8 = r22
            r14 = 1
            r6 = 1
        L_0x0237:
            r5 = r6
            r6 = 0
        L_0x0239:
            r17 = r6
        L_0x023b:
            r18 = 5
        L_0x023d:
            if (r5 == 0) goto L_0x027d
            int r4 = r30.mo4768b()
            int r19 = r31.mo4768b()
            r1 = r24
            r2 = r15
            r6 = r3
            r3 = r8
            r5 = r36
            r28 = r6
            r6 = r9
            r7 = r28
            r13 = r8
            r8 = r19
            r14 = r9
            r9 = r18
            r1.mo3951b(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r30
            u4 r2 = r1.f4584d
            v4 r2 = r2.f4582b
            boolean r2 = r2 instanceof p000.C1098s4
            r3 = r31
            u4 r4 = r3.f4584d
            v4 r4 = r4.f4582b
            boolean r4 = r4 instanceof p000.C1098s4
            if (r2 == 0) goto L_0x0273
            if (r4 != 0) goto L_0x0273
            r5 = 1
            r6 = 6
            goto L_0x0288
        L_0x0273:
            if (r2 != 0) goto L_0x0285
            if (r4 == 0) goto L_0x0285
            r2 = r25
            r4 = 5
            r5 = 1
            r6 = 6
            goto L_0x028d
        L_0x027d:
            r1 = r30
            r28 = r3
            r13 = r8
            r14 = r9
            r3 = r31
        L_0x0285:
            r5 = r25
            r6 = 5
        L_0x0288:
            r2 = r5
            r4 = r6
            r6 = 5
            r5 = r25
        L_0x028d:
            if (r17 == 0) goto L_0x0291
            r4 = 6
            r6 = 6
        L_0x0291:
            if (r0 != 0) goto L_0x0295
            if (r5 != 0) goto L_0x0297
        L_0x0295:
            if (r17 == 0) goto L_0x029e
        L_0x0297:
            int r1 = r30.mo4768b()
            r10.mo3955f(r15, r13, r1, r6)
        L_0x029e:
            if (r0 != 0) goto L_0x02a2
            if (r2 != 0) goto L_0x02a4
        L_0x02a2:
            if (r17 == 0) goto L_0x02af
        L_0x02a4:
            int r0 = r31.mo4768b()
            int r0 = -r0
            r1 = r28
            r10.mo3956g(r1, r14, r0, r4)
            goto L_0x02b1
        L_0x02af:
            r1 = r28
        L_0x02b1:
            r0 = 0
            r2 = 6
            if (r25 == 0) goto L_0x02bc
            r10.mo3955f(r15, r11, r0, r2)
            goto L_0x02bc
        L_0x02b9:
            r1 = r3
            r0 = 0
            r2 = 6
        L_0x02bc:
            if (r25 == 0) goto L_0x02c1
            r10.mo3955f(r12, r1, r0, r2)
        L_0x02c1:
            return
        L_0x02c2:
            r11 = r26
            r1 = r3
            r0 = 0
            r2 = 6
            r3 = 2
            if (r13 >= r3) goto L_0x02d2
            if (r25 == 0) goto L_0x02d2
            r10.mo3955f(r15, r11, r0, r2)
            r10.mo3955f(r12, r1, r0, r2)
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1236v4.mo4815d(p4, boolean, r4, r4, v4$a, boolean, u4, u4, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: e */
    public void mo4816e(C0955p4 p4Var) {
        p4Var.mo3961l(this.f4755s);
        p4Var.mo3961l(this.f4756t);
        p4Var.mo3961l(this.f4757u);
        p4Var.mo3961l(this.f4758v);
        if (this.f4719Q > 0) {
            p4Var.mo3961l(this.f4759w);
        }
    }

    /* renamed from: f */
    public C1196u4 mo4817f(C1196u4.C1198b bVar) {
        switch (bVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f4755s;
            case 2:
                return this.f4756t;
            case 3:
                return this.f4757u;
            case 4:
                return this.f4758v;
            case 5:
                return this.f4759w;
            case 6:
                return this.f4762z;
            case 7:
                return this.f4760x;
            case 8:
                return this.f4761y;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: g */
    public C1237a mo4818g(int i) {
        if (i == 0) {
            return mo4820i();
        }
        if (i == 1) {
            return mo4824m();
        }
        return null;
    }

    /* renamed from: h */
    public int mo4819h() {
        if (this.f4727Y == 8) {
            return 0;
        }
        return this.f4708F;
    }

    /* renamed from: i */
    public C1237a mo4820i() {
        return this.f4705C[0];
    }

    /* renamed from: j */
    public int mo4821j(int i) {
        if (i == 0) {
            return mo4825n();
        }
        if (i == 1) {
            return mo4819h();
        }
        return 0;
    }

    /* renamed from: k */
    public C0256c5 mo4822k() {
        if (this.f4735d == null) {
            this.f4735d = new C0256c5();
        }
        return this.f4735d;
    }

    /* renamed from: l */
    public C0256c5 mo4823l() {
        if (this.f4733c == null) {
            this.f4733c = new C0256c5();
        }
        return this.f4733c;
    }

    /* renamed from: m */
    public C1237a mo4824m() {
        return this.f4705C[1];
    }

    /* renamed from: n */
    public int mo4825n() {
        if (this.f4727Y == 8) {
            return 0;
        }
        return this.f4707E;
    }

    /* renamed from: o */
    public void mo4826o(C1196u4.C1198b bVar, C1236v4 v4Var, C1196u4.C1198b bVar2, int i, int i2) {
        mo4817f(bVar).mo4767a(v4Var.mo4817f(bVar2), i, i2, C1196u4.C1197a.STRONG, 0, true);
    }

    /* renamed from: p */
    public final boolean mo4827p(int i) {
        int i2 = i * 2;
        C1196u4[] u4VarArr = this.f4703A;
        if (!(u4VarArr[i2].f4584d == null || u4VarArr[i2].f4584d.f4584d == u4VarArr[i2])) {
            int i3 = i2 + 1;
            return u4VarArr[i3].f4584d != null && u4VarArr[i3].f4584d.f4584d == u4VarArr[i3];
        }
    }

    /* renamed from: q */
    public boolean mo4828q() {
        if (this.f4755s.f4581a.f1879b == 1 && this.f4757u.f4581a.f1879b == 1 && this.f4756t.f4581a.f1879b == 1 && this.f4758v.f4581a.f1879b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo2764r() {
        this.f4755s.mo4770d();
        this.f4756t.mo4770d();
        this.f4757u.mo4770d();
        this.f4758v.mo4770d();
        this.f4759w.mo4770d();
        this.f4760x.mo4770d();
        this.f4761y.mo4770d();
        this.f4762z.mo4770d();
        this.f4706D = null;
        this.f4754r = 0.0f;
        this.f4707E = 0;
        this.f4708F = 0;
        this.f4709G = 0.0f;
        this.f4710H = -1;
        this.f4711I = 0;
        this.f4712J = 0;
        this.f4715M = 0;
        this.f4716N = 0;
        this.f4717O = 0;
        this.f4718P = 0;
        this.f4719Q = 0;
        this.f4720R = 0;
        this.f4721S = 0;
        this.f4722T = 0;
        this.f4723U = 0;
        this.f4724V = 0.5f;
        this.f4725W = 0.5f;
        C1237a[] aVarArr = this.f4705C;
        C1237a aVar = C1237a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f4726X = null;
        this.f4727Y = 0;
        this.f4736d0 = 0;
        this.f4738e0 = 0;
        float[] fArr = this.f4740f0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4729a = -1;
        this.f4731b = -1;
        int[] iArr = this.f4753q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4737e = 0;
        this.f4739f = 0;
        this.f4746j = 1.0f;
        this.f4749m = 1.0f;
        this.f4745i = Integer.MAX_VALUE;
        this.f4748l = Integer.MAX_VALUE;
        this.f4743h = 0;
        this.f4747k = 0;
        this.f4750n = -1;
        this.f4751o = 1.0f;
        C0256c5 c5Var = this.f4733c;
        if (c5Var != null) {
            c5Var.f1879b = 0;
            c5Var.f1878a.clear();
            c5Var.f1339c = 0.0f;
        }
        C0256c5 c5Var2 = this.f4735d;
        if (c5Var2 != null) {
            c5Var2.f1879b = 0;
            c5Var2.f1878a.clear();
            c5Var2.f1339c = 0.0f;
        }
        this.f4752p = null;
        this.f4730a0 = false;
        this.f4732b0 = false;
        this.f4734c0 = false;
    }

    /* renamed from: s */
    public void mo4426s() {
        for (int i = 0; i < 6; i++) {
            this.f4703A[i].f4581a.mo1579i();
        }
    }

    /* renamed from: t */
    public void mo2765t(C0857n4 n4Var) {
        this.f4755s.mo4771e();
        this.f4756t.mo4771e();
        this.f4757u.mo4771e();
        this.f4758v.mo4771e();
        this.f4759w.mo4771e();
        this.f4762z.mo4771e();
        this.f4760x.mo4771e();
        this.f4761y.mo4771e();
    }

    public String toString() {
        String str = "";
        StringBuilder c = C0279ch.m1106c(str);
        if (this.f4728Z != null) {
            StringBuilder c2 = C0279ch.m1106c("id: ");
            c2.append(this.f4728Z);
            c2.append(" ");
            str = c2.toString();
        }
        c.append(str);
        c.append("(");
        c.append(this.f4711I);
        c.append(", ");
        c.append(this.f4712J);
        c.append(") - (");
        c.append(this.f4707E);
        c.append(" x ");
        c.append(this.f4708F);
        c.append(") wrap: (");
        c.append(this.f4722T);
        c.append(" x ");
        c.append(this.f4723U);
        c.append(")");
        return c.toString();
    }

    /* renamed from: u */
    public void mo4427u() {
    }

    /* renamed from: v */
    public void mo4830v(int i, int i2, int i3) {
        if (i3 == 0) {
            this.f4711I = i;
            int i4 = i2 - i;
            this.f4707E = i4;
            int i5 = this.f4720R;
            if (i4 < i5) {
                this.f4707E = i5;
            }
        } else if (i3 == 1) {
            this.f4712J = i;
            int i6 = i2 - i;
            this.f4708F = i6;
            int i7 = this.f4721S;
            if (i6 < i7) {
                this.f4708F = i7;
            }
        }
        this.f4732b0 = true;
    }

    /* renamed from: w */
    public void mo4831w(int i) {
        this.f4708F = i;
        int i2 = this.f4721S;
        if (i < i2) {
            this.f4708F = i2;
        }
    }

    /* renamed from: x */
    public void mo4832x(int i, int i2) {
        this.f4711I = i;
        int i3 = i2 - i;
        this.f4707E = i3;
        int i4 = this.f4720R;
        if (i3 < i4) {
            this.f4707E = i4;
        }
    }

    /* renamed from: y */
    public void mo4833y(C1237a aVar) {
        this.f4705C[0] = aVar;
        if (aVar == C1237a.WRAP_CONTENT) {
            mo4813C(this.f4722T);
        }
    }

    /* renamed from: z */
    public void mo2766z(int i, int i2) {
        this.f4717O = i;
        this.f4718P = i2;
    }
}
