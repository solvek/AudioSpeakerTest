package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: jd */
public class C0676jd extends RecyclerView.C0176w {

    /* renamed from: i */
    public final LinearInterpolator f2866i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f2867j = new DecelerateInterpolator();

    /* renamed from: k */
    public PointF f2868k;

    /* renamed from: l */
    public final DisplayMetrics f2869l;

    /* renamed from: m */
    public boolean f2870m = false;

    /* renamed from: n */
    public float f2871n;

    /* renamed from: o */
    public int f2872o = 0;

    /* renamed from: p */
    public int f2873p = 0;

    public C0676jd(Context context) {
        this.f2869l = context.getResources().getDisplayMetrics();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1389b(android.view.View r11, androidx.recyclerview.widget.RecyclerView.C0179x r12, androidx.recyclerview.widget.RecyclerView.C0176w.C0177a r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.f2868k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L_0x0017
            float r12 = r12.x
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x0015
            r9 = 1
            goto L_0x0018
        L_0x0015:
            r9 = -1
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView$m r12 = r10.f1072c
            if (r12 == 0) goto L_0x0049
            boolean r4 = r12.mo1058e()
            if (r4 != 0) goto L_0x0023
            goto L_0x0049
        L_0x0023:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r4 = (androidx.recyclerview.widget.RecyclerView.C0165n) r4
            int r5 = r12.mo1302D(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.mo1308G(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.mo1319N()
            int r4 = r12.f1042p
            int r12 = r12.mo1321O()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.mo3429d(r5, r6, r7, r8, r9)
            goto L_0x004a
        L_0x0049:
            r12 = 0
        L_0x004a:
            android.graphics.PointF r4 = r10.f2868k
            if (r4 == 0) goto L_0x005d
            float r4 = r4.y
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x005b
            r9 = 1
            goto L_0x005e
        L_0x005b:
            r9 = -1
            goto L_0x005e
        L_0x005d:
            r9 = 0
        L_0x005e:
            androidx.recyclerview.widget.RecyclerView$m r0 = r10.f1072c
            if (r0 == 0) goto L_0x0090
            boolean r1 = r0.mo1060f()
            if (r1 != 0) goto L_0x0069
            goto L_0x0090
        L_0x0069:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r1 = (androidx.recyclerview.widget.RecyclerView.C0165n) r1
            int r2 = r0.mo1310H(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.mo1298B(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.mo1323P()
            int r11 = r0.f1043q
            int r0 = r0.mo1318M()
            int r8 = r11 - r0
            r4 = r10
            int r2 = r4.mo3429d(r5, r6, r7, r8, r9)
        L_0x0090:
            int r11 = r12 * r12
            int r0 = r2 * r2
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.mo3431f(r11)
            double r0 = (double) r11
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            double r0 = r0 / r3
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
            if (r11 <= 0) goto L_0x00bd
            int r12 = -r12
            int r0 = -r2
            android.view.animation.DecelerateInterpolator r1 = r10.f2867j
            r13.mo1392b(r12, r0, r11, r1)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0676jd.mo1389b(android.view.View, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$w$a):void");
    }

    /* renamed from: d */
    public int mo3429d(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: e */
    public float mo3430e(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: f */
    public int mo3431f(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f2870m) {
            this.f2871n = mo3430e(this.f2869l);
            this.f2870m = true;
        }
        return (int) Math.ceil((double) (abs * this.f2871n));
    }
}
