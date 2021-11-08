package p000;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: g5 */
public class C0519g5 extends C0557h5 {

    /* renamed from: g */
    public int f2267g;

    /* renamed from: h */
    public int f2268h;

    /* renamed from: i */
    public C1098s4 f2269i;

    public C0519g5(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: b */
    public void mo2933b(AttributeSet attributeSet) {
        super.mo2933b((AttributeSet) null);
        C1098s4 s4Var = new C1098s4();
        this.f2269i = s4Var;
        this.f2437e = s4Var;
        mo3044f();
    }

    public int getType() {
        return this.f2267g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2269i.f4159m0 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r7 == 6) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r7 == 6) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.f2267g = r7
            r6.f2268h = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L_0x0018
            if (r7 != r2) goto L_0x0013
        L_0x0010:
            r6.f2268h = r3
            goto L_0x003b
        L_0x0013:
            if (r7 != r1) goto L_0x003b
        L_0x0015:
            r6.f2268h = r4
            goto L_0x003b
        L_0x0018:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L_0x0028
            r7 = 1
            goto L_0x0029
        L_0x0028:
            r7 = 0
        L_0x0029:
            if (r7 == 0) goto L_0x0033
            int r7 = r6.f2267g
            if (r7 != r2) goto L_0x0030
            goto L_0x0015
        L_0x0030:
            if (r7 != r1) goto L_0x003b
            goto L_0x0010
        L_0x0033:
            int r7 = r6.f2267g
            if (r7 != r2) goto L_0x0038
            goto L_0x0010
        L_0x0038:
            if (r7 != r1) goto L_0x003b
            goto L_0x0015
        L_0x003b:
            s4 r7 = r6.f2269i
            int r0 = r6.f2268h
            r7.f4157k0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0519g5.setType(int):void");
    }
}
