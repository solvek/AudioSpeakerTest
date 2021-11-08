package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kd */
public class C0724kd extends C1164td {

    /* renamed from: d */
    public C0924od f2997d;

    /* renamed from: e */
    public C0924od f2998e;

    /* renamed from: a */
    public int[] mo3550a(RecyclerView.C0160m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.mo1058e()) {
            iArr[0] = mo3552d(view, mo3555g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.mo1060f()) {
            iArr[1] = mo3552d(view, mo3556h(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: b */
    public View mo3551b(RecyclerView.C0160m mVar) {
        C0924od odVar;
        if (mVar.mo1060f()) {
            odVar = mo3556h(mVar);
        } else if (!mVar.mo1058e()) {
            return null;
        } else {
            odVar = mo3555g(mVar);
        }
        return mo3554f(mVar, odVar);
    }

    /* renamed from: d */
    public final int mo3552d(View view, C0924od odVar) {
        return ((odVar.mo3688c(view) / 2) + odVar.mo3690e(view)) - ((odVar.mo3697l() / 2) + odVar.mo3696k());
    }

    /* renamed from: e */
    public final int mo3553e(RecyclerView.C0160m mVar, C0924od odVar, int i, int i2) {
        int max;
        this.f4429b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f4429b.getFinalX(), this.f4429b.getFinalY()};
        int y = mVar.mo1354y();
        float f = 1.0f;
        if (y != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 = 0; i5 < y; i5++) {
                View x = mVar.mo1352x(i5);
                int Q = mVar.mo1324Q(x);
                if (Q != -1) {
                    if (Q < i3) {
                        view = x;
                        i3 = Q;
                    }
                    if (Q > i4) {
                        view2 = x;
                        i4 = Q;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(odVar.mo3687b(view), odVar.mo3687b(view2)) - Math.min(odVar.mo3690e(view), odVar.mo3690e(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i4 - i3) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f);
    }

    /* renamed from: f */
    public final View mo3554f(RecyclerView.C0160m mVar, C0924od odVar) {
        int y = mVar.mo1354y();
        View view = null;
        if (y == 0) {
            return null;
        }
        int l = (odVar.mo3697l() / 2) + odVar.mo3696k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < y; i2++) {
            View x = mVar.mo1352x(i2);
            int abs = Math.abs(((odVar.mo3688c(x) / 2) + odVar.mo3690e(x)) - l);
            if (abs < i) {
                view = x;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: g */
    public final C0924od mo3555g(RecyclerView.C0160m mVar) {
        C0924od odVar = this.f2998e;
        if (odVar == null || odVar.f3497a != mVar) {
            this.f2998e = new C0827md(mVar);
        }
        return this.f2998e;
    }

    /* renamed from: h */
    public final C0924od mo3556h(RecyclerView.C0160m mVar) {
        C0924od odVar = this.f2997d;
        if (odVar == null || odVar.f3497a != mVar) {
            this.f2997d = new C0870nd(mVar);
        }
        return this.f2997d;
    }
}
