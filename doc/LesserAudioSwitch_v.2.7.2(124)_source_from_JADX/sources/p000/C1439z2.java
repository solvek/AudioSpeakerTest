package p000;

/* renamed from: z2 */
public class C1439z2 {

    /* renamed from: a */
    public int f5251a = 0;

    /* renamed from: b */
    public int f5252b = 0;

    /* renamed from: c */
    public int f5253c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f5254d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f5255e = 0;

    /* renamed from: f */
    public int f5256f = 0;

    /* renamed from: g */
    public boolean f5257g = false;

    /* renamed from: h */
    public boolean f5258h = false;

    /* renamed from: a */
    public void mo5270a(int i, int i2) {
        this.f5253c = i;
        this.f5254d = i2;
        this.f5258h = true;
        if (this.f5257g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f5251a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f5252b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f5251a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5252b = i2;
        }
    }
}
