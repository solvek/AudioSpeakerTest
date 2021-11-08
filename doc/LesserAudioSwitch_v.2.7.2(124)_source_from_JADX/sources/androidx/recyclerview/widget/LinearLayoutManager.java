package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.C0568hd;

public class LinearLayoutManager extends RecyclerView.C0160m implements RecyclerView.C0176w.C0178b {

    /* renamed from: A */
    public int f874A = Integer.MIN_VALUE;

    /* renamed from: B */
    public C0142d f875B = null;

    /* renamed from: C */
    public final C0139a f876C = new C0139a();

    /* renamed from: D */
    public final C0140b f877D = new C0140b();

    /* renamed from: E */
    public int f878E = 2;

    /* renamed from: F */
    public int[] f879F = new int[2];

    /* renamed from: r */
    public int f880r = 1;

    /* renamed from: s */
    public C0141c f881s;

    /* renamed from: t */
    public C0924od f882t;

    /* renamed from: u */
    public boolean f883u;

    /* renamed from: v */
    public boolean f884v = false;

    /* renamed from: w */
    public boolean f885w = false;

    /* renamed from: x */
    public boolean f886x = false;

    /* renamed from: y */
    public boolean f887y = true;

    /* renamed from: z */
    public int f888z = -1;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0139a {

        /* renamed from: a */
        public C0924od f889a;

        /* renamed from: b */
        public int f890b;

        /* renamed from: c */
        public int f891c;

        /* renamed from: d */
        public boolean f892d;

        /* renamed from: e */
        public boolean f893e;

        public C0139a() {
            mo1091d();
        }

        /* renamed from: a */
        public void mo1088a() {
            this.f891c = this.f892d ? this.f889a.mo3692g() : this.f889a.mo3696k();
        }

        /* renamed from: b */
        public void mo1089b(View view, int i) {
            if (this.f892d) {
                this.f891c = this.f889a.mo3843m() + this.f889a.mo3687b(view);
            } else {
                this.f891c = this.f889a.mo3690e(view);
            }
            this.f890b = i;
        }

        /* renamed from: c */
        public void mo1090c(View view, int i) {
            int i2;
            int m = this.f889a.mo3843m();
            if (m >= 0) {
                mo1089b(view, i);
                return;
            }
            this.f890b = i;
            if (this.f892d) {
                int g = (this.f889a.mo3692g() - m) - this.f889a.mo3687b(view);
                this.f891c = this.f889a.mo3692g() - g;
                if (g > 0) {
                    int c = this.f891c - this.f889a.mo3688c(view);
                    int k = this.f889a.mo3696k();
                    int min = c - (Math.min(this.f889a.mo3690e(view) - k, 0) + k);
                    if (min < 0) {
                        i2 = Math.min(g, -min) + this.f891c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e = this.f889a.mo3690e(view);
                int k2 = e - this.f889a.mo3696k();
                this.f891c = e;
                if (k2 > 0) {
                    int g2 = (this.f889a.mo3692g() - Math.min(0, (this.f889a.mo3692g() - m) - this.f889a.mo3687b(view))) - (this.f889a.mo3688c(view) + e);
                    if (g2 < 0) {
                        i2 = this.f891c - Math.min(k2, -g2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f891c = i2;
        }

        /* renamed from: d */
        public void mo1091d() {
            this.f890b = -1;
            this.f891c = Integer.MIN_VALUE;
            this.f892d = false;
            this.f893e = false;
        }

        public String toString() {
            StringBuilder c = C0279ch.m1106c("AnchorInfo{mPosition=");
            c.append(this.f890b);
            c.append(", mCoordinate=");
            c.append(this.f891c);
            c.append(", mLayoutFromEnd=");
            c.append(this.f892d);
            c.append(", mValid=");
            c.append(this.f893e);
            c.append('}');
            return c.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0140b {

        /* renamed from: a */
        public int f894a;

        /* renamed from: b */
        public boolean f895b;

        /* renamed from: c */
        public boolean f896c;

        /* renamed from: d */
        public boolean f897d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0141c {

        /* renamed from: a */
        public boolean f898a = true;

        /* renamed from: b */
        public int f899b;

        /* renamed from: c */
        public int f900c;

        /* renamed from: d */
        public int f901d;

        /* renamed from: e */
        public int f902e;

        /* renamed from: f */
        public int f903f;

        /* renamed from: g */
        public int f904g;

        /* renamed from: h */
        public int f905h = 0;

        /* renamed from: i */
        public int f906i = 0;

        /* renamed from: j */
        public int f907j;

        /* renamed from: k */
        public List<RecyclerView.C0145a0> f908k = null;

        /* renamed from: l */
        public boolean f909l;

        /* renamed from: a */
        public void mo1093a(View view) {
            int i;
            int a;
            int size = this.f908k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f908k.get(i3).f996a;
                RecyclerView.C0165n nVar = (RecyclerView.C0165n) view3.getLayoutParams();
                if (view3 != view && !nVar.mo1362c() && (a = (nVar.mo1360a() - this.f901d) * this.f902e) >= 0 && a < i2) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i2 = a;
                }
            }
            if (view2 == null) {
                i = -1;
            } else {
                i = ((RecyclerView.C0165n) view2.getLayoutParams()).mo1360a();
            }
            this.f901d = i;
        }

        /* renamed from: b */
        public boolean mo1094b(RecyclerView.C0179x xVar) {
            int i = this.f901d;
            return i >= 0 && i < xVar.mo1394b();
        }

        /* renamed from: c */
        public View mo1095c(RecyclerView.C0171s sVar) {
            List<RecyclerView.C0145a0> list = this.f908k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f908k.get(i).f996a;
                    RecyclerView.C0165n nVar = (RecyclerView.C0165n) view.getLayoutParams();
                    if (!nVar.mo1362c() && this.f901d == nVar.mo1360a()) {
                        mo1093a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = sVar.mo1380k(this.f901d, false, Long.MAX_VALUE).f996a;
            this.f901d += this.f902e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0142d implements Parcelable {
        public static final Parcelable.Creator<C0142d> CREATOR = new C0143a();

        /* renamed from: b */
        public int f910b;

        /* renamed from: c */
        public int f911c;

        /* renamed from: d */
        public boolean f912d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class C0143a implements Parcelable.Creator<C0142d> {
            public Object createFromParcel(Parcel parcel) {
                return new C0142d(parcel);
            }

            public Object[] newArray(int i) {
                return new C0142d[i];
            }
        }

        public C0142d() {
        }

        public C0142d(Parcel parcel) {
            this.f910b = parcel.readInt();
            this.f911c = parcel.readInt();
            this.f912d = parcel.readInt() != 1 ? false : true;
        }

        public C0142d(C0142d dVar) {
            this.f910b = dVar.f910b;
            this.f911c = dVar.f911c;
            this.f912d = dVar.f912d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: j */
        public boolean mo1097j() {
            return this.f910b >= 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f910b);
            parcel.writeInt(this.f911c);
            parcel.writeInt(this.f912d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        mo1043B1(i);
        mo1056d((String) null);
        if (z != this.f884v) {
            this.f884v = z;
            mo1315J0();
        }
    }

    /* renamed from: A1 */
    public int mo1042A1(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        if (mo1354y() == 0 || i == 0) {
            return 0;
        }
        mo1059e1();
        this.f881s.f898a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        mo1044D1(i2, abs, true, xVar);
        C0141c cVar = this.f881s;
        int f1 = mo1061f1(sVar, cVar, xVar, false) + cVar.f904g;
        if (f1 < 0) {
            return 0;
        }
        if (abs > f1) {
            i = i2 * f1;
        }
        this.f882t.mo3700p(-i);
        this.f881s.f907j = i;
        return i;
    }

    /* renamed from: B1 */
    public void mo1043B1(int i) {
        if (i == 0 || i == 1) {
            mo1056d((String) null);
            if (i != this.f880r || this.f882t == null) {
                C0924od a = C0924od.m2678a(this, i);
                this.f882t = a;
                this.f876C.f889a = a;
                this.f880r = i;
                mo1315J0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: C1 */
    public void mo1004C1(boolean z) {
        mo1056d((String) null);
        if (this.f886x != z) {
            this.f886x = z;
            mo1315J0();
        }
    }

    /* renamed from: D1 */
    public final void mo1044D1(int i, int i2, boolean z, RecyclerView.C0179x xVar) {
        int i3;
        this.f881s.f909l = mo1085y1();
        this.f881s.f903f = i;
        int[] iArr = this.f879F;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo1051Y0(xVar, iArr);
        int max = Math.max(0, this.f879F[0]);
        int max2 = Math.max(0, this.f879F[1]);
        if (i == 1) {
            z2 = true;
        }
        C0141c cVar = this.f881s;
        int i5 = z2 ? max2 : max;
        cVar.f905h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f906i = max;
        if (z2) {
            cVar.f905h = this.f882t.mo3693h() + i5;
            View r1 = mo1078r1();
            C0141c cVar2 = this.f881s;
            if (this.f885w) {
                i4 = -1;
            }
            cVar2.f902e = i4;
            int Q = mo1324Q(r1);
            C0141c cVar3 = this.f881s;
            cVar2.f901d = Q + cVar3.f902e;
            cVar3.f899b = this.f882t.mo3687b(r1);
            i3 = this.f882t.mo3687b(r1) - this.f882t.mo3692g();
        } else {
            View s1 = mo1079s1();
            C0141c cVar4 = this.f881s;
            cVar4.f905h = this.f882t.mo3696k() + cVar4.f905h;
            C0141c cVar5 = this.f881s;
            if (!this.f885w) {
                i4 = -1;
            }
            cVar5.f902e = i4;
            int Q2 = mo1324Q(s1);
            C0141c cVar6 = this.f881s;
            cVar5.f901d = Q2 + cVar6.f902e;
            cVar6.f899b = this.f882t.mo3690e(s1);
            i3 = (-this.f882t.mo3690e(s1)) + this.f882t.mo3696k();
        }
        C0141c cVar7 = this.f881s;
        cVar7.f900c = i2;
        if (z) {
            cVar7.f900c = i2 - i3;
        }
        cVar7.f904g = i3;
    }

    /* renamed from: E1 */
    public final void mo1045E1(int i, int i2) {
        this.f881s.f900c = this.f882t.mo3692g() - i2;
        C0141c cVar = this.f881s;
        cVar.f902e = this.f885w ? -1 : 1;
        cVar.f901d = i;
        cVar.f903f = 1;
        cVar.f899b = i2;
        cVar.f904g = Integer.MIN_VALUE;
    }

    /* renamed from: F1 */
    public final void mo1046F1(int i, int i2) {
        this.f881s.f900c = i2 - this.f882t.mo3696k();
        C0141c cVar = this.f881s;
        cVar.f901d = i;
        cVar.f902e = this.f885w ? 1 : -1;
        cVar.f903f = -1;
        cVar.f899b = i2;
        cVar.f904g = Integer.MIN_VALUE;
    }

    /* renamed from: K0 */
    public int mo1009K0(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        if (this.f880r == 1) {
            return 0;
        }
        return mo1042A1(i, sVar, xVar);
    }

    /* renamed from: L0 */
    public void mo1047L0(int i) {
        this.f888z = i;
        this.f874A = Integer.MIN_VALUE;
        C0142d dVar = this.f875B;
        if (dVar != null) {
            dVar.f910b = -1;
        }
        mo1315J0();
    }

    /* renamed from: M0 */
    public int mo1012M0(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        if (this.f880r == 0) {
            return 0;
        }
        return mo1042A1(i, sVar, xVar);
    }

    /* renamed from: T0 */
    public boolean mo1048T0() {
        boolean z;
        if (!(this.f1041o == 1073741824 || this.f1040n == 1073741824)) {
            int y = mo1354y();
            int i = 0;
            while (true) {
                if (i >= y) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = mo1352x(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    public boolean mo1049V() {
        return true;
    }

    /* renamed from: V0 */
    public void mo1050V0(RecyclerView recyclerView, RecyclerView.C0179x xVar, int i) {
        C0676jd jdVar = new C0676jd(recyclerView.getContext());
        jdVar.f1070a = i;
        mo1332W0(jdVar);
    }

    /* renamed from: X0 */
    public boolean mo1019X0() {
        return this.f875B == null && this.f883u == this.f886x;
    }

    /* renamed from: Y0 */
    public void mo1051Y0(RecyclerView.C0179x xVar, int[] iArr) {
        int i;
        int l = xVar.f1085a != -1 ? this.f882t.mo3697l() : 0;
        if (this.f881s.f903f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    /* renamed from: Z0 */
    public void mo1020Z0(RecyclerView.C0179x xVar, C0141c cVar, RecyclerView.C0160m.C0163c cVar2) {
        int i = cVar.f901d;
        if (i >= 0 && i < xVar.mo1394b()) {
            ((C0568hd.C0570b) cVar2).mo3077a(i, Math.max(0, cVar.f904g));
        }
    }

    /* renamed from: a */
    public PointF mo1052a(int i) {
        if (mo1354y() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo1324Q(mo1352x(0))) {
            z = true;
        }
        if (z != this.f885w) {
            i2 = -1;
        }
        return this.f880r == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: a1 */
    public final int mo1053a1(RecyclerView.C0179x xVar) {
        if (mo1354y() == 0) {
            return 0;
        }
        mo1059e1();
        C0924od odVar = this.f882t;
        View i1 = mo1067i1(!this.f887y, true);
        return C1107sc.m3163a(xVar, odVar, i1, mo1064h1(!this.f887y, true), this, this.f887y);
    }

    /* renamed from: b1 */
    public final int mo1054b1(RecyclerView.C0179x xVar) {
        if (mo1354y() == 0) {
            return 0;
        }
        mo1059e1();
        C0924od odVar = this.f882t;
        View i1 = mo1067i1(!this.f887y, true);
        return C1107sc.m3164b(xVar, odVar, i1, mo1064h1(!this.f887y, true), this, this.f887y, this.f885w);
    }

    /* renamed from: c1 */
    public final int mo1055c1(RecyclerView.C0179x xVar) {
        if (mo1354y() == 0) {
            return 0;
        }
        mo1059e1();
        C0924od odVar = this.f882t;
        View i1 = mo1067i1(!this.f887y, true);
        return C1107sc.m3165c(xVar, odVar, i1, mo1064h1(!this.f887y, true), this, this.f887y);
    }

    /* renamed from: d */
    public void mo1056d(String str) {
        RecyclerView recyclerView;
        if (this.f875B == null && (recyclerView = this.f1028b) != null) {
            recyclerView.mo1175i(str);
        }
    }

    /* renamed from: d1 */
    public int mo1057d1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f880r == 1) ? 1 : Integer.MIN_VALUE : this.f880r == 0 ? 1 : Integer.MIN_VALUE : this.f880r == 1 ? -1 : Integer.MIN_VALUE : this.f880r == 0 ? -1 : Integer.MIN_VALUE : (this.f880r != 1 && mo1081t1()) ? -1 : 1 : (this.f880r != 1 && mo1081t1()) ? 1 : -1;
    }

    /* renamed from: e */
    public boolean mo1058e() {
        return this.f880r == 0;
    }

    /* renamed from: e1 */
    public void mo1059e1() {
        if (this.f881s == null) {
            this.f881s = new C0141c();
        }
    }

    /* renamed from: f */
    public boolean mo1060f() {
        return this.f880r == 1;
    }

    /* renamed from: f1 */
    public int mo1061f1(RecyclerView.C0171s sVar, C0141c cVar, RecyclerView.C0179x xVar, boolean z) {
        int i = cVar.f900c;
        int i2 = cVar.f904g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f904g = i2 + i;
            }
            mo1082w1(sVar, cVar);
        }
        int i3 = cVar.f900c + cVar.f905h;
        C0140b bVar = this.f877D;
        while (true) {
            if ((!cVar.f909l && i3 <= 0) || !cVar.mo1094b(xVar)) {
                break;
            }
            bVar.f894a = 0;
            bVar.f895b = false;
            bVar.f896c = false;
            bVar.f897d = false;
            mo1037u1(sVar, xVar, cVar, bVar);
            if (!bVar.f895b) {
                int i4 = cVar.f899b;
                int i5 = bVar.f894a;
                cVar.f899b = (cVar.f903f * i5) + i4;
                if (!bVar.f896c || cVar.f908k != null || !xVar.f1091g) {
                    cVar.f900c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.f904g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.f904g = i7;
                    int i8 = cVar.f900c;
                    if (i8 < 0) {
                        cVar.f904g = i7 + i8;
                    }
                    mo1082w1(sVar, cVar);
                }
                if (z && bVar.f897d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f900c;
    }

    /* renamed from: g0 */
    public void mo1062g0(RecyclerView recyclerView, RecyclerView.C0171s sVar) {
        mo1342f0();
    }

    /* renamed from: g1 */
    public final View mo1063g1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        return mo1029o1(sVar, xVar, 0, mo1354y(), xVar.mo1394b());
    }

    /* renamed from: h0 */
    public View mo1022h0(View view, int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        int d1;
        View view2;
        mo1087z1();
        if (mo1354y() == 0 || (d1 = mo1057d1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo1059e1();
        mo1044D1(d1, (int) (((float) this.f882t.mo3697l()) * 0.33333334f), false, xVar);
        C0141c cVar = this.f881s;
        cVar.f904g = Integer.MIN_VALUE;
        cVar.f898a = false;
        mo1061f1(sVar, cVar, xVar, true);
        if (d1 == -1) {
            if (this.f885w) {
                view2 = mo1073m1(mo1354y() - 1, -1);
            } else {
                view2 = mo1073m1(0, mo1354y());
            }
        } else if (this.f885w) {
            view2 = mo1073m1(0, mo1354y());
        } else {
            view2 = mo1073m1(mo1354y() - 1, -1);
        }
        View s1 = d1 == -1 ? mo1079s1() : mo1078r1();
        if (!s1.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return s1;
    }

    /* renamed from: h1 */
    public View mo1064h1(boolean z, boolean z2) {
        int y;
        int i;
        if (this.f885w) {
            y = 0;
            i = mo1354y();
        } else {
            y = mo1354y() - 1;
            i = -1;
        }
        return mo1075n1(y, i, z, z2);
    }

    /* renamed from: i */
    public void mo1065i(int i, int i2, RecyclerView.C0179x xVar, RecyclerView.C0160m.C0163c cVar) {
        if (this.f880r != 0) {
            i = i2;
        }
        if (mo1354y() != 0 && i != 0) {
            mo1059e1();
            mo1044D1(i > 0 ? 1 : -1, Math.abs(i), true, xVar);
            mo1020Z0(xVar, this.f881s, cVar);
        }
    }

    /* renamed from: i0 */
    public void mo1066i0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0171s sVar = this.f1028b.f948c;
        mo1343j0(accessibilityEvent);
        if (mo1354y() > 0) {
            accessibilityEvent.setFromIndex(mo1069j1());
            accessibilityEvent.setToIndex(mo1072l1());
        }
    }

    /* renamed from: i1 */
    public View mo1067i1(boolean z, boolean z2) {
        int i;
        int y;
        if (this.f885w) {
            i = mo1354y() - 1;
            y = -1;
        } else {
            i = 0;
            y = mo1354y();
        }
        return mo1075n1(i, y, z, z2);
    }

    /* renamed from: j */
    public void mo1068j(int i, RecyclerView.C0160m.C0163c cVar) {
        boolean z;
        int i2;
        C0142d dVar = this.f875B;
        int i3 = -1;
        if (dVar == null || !dVar.mo1097j()) {
            mo1087z1();
            z = this.f885w;
            i2 = this.f888z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0142d dVar2 = this.f875B;
            z = dVar2.f912d;
            i2 = dVar2.f910b;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f878E && i2 >= 0 && i2 < i; i4++) {
            ((C0568hd.C0570b) cVar).mo3077a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: j1 */
    public int mo1069j1() {
        View n1 = mo1075n1(0, mo1354y(), false, true);
        if (n1 == null) {
            return -1;
        }
        return mo1324Q(n1);
    }

    /* renamed from: k */
    public int mo1070k(RecyclerView.C0179x xVar) {
        return mo1053a1(xVar);
    }

    /* renamed from: k1 */
    public final View mo1071k1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        return mo1029o1(sVar, xVar, mo1354y() - 1, -1, xVar.mo1394b());
    }

    /* renamed from: l */
    public int mo1023l(RecyclerView.C0179x xVar) {
        return mo1054b1(xVar);
    }

    /* renamed from: l1 */
    public int mo1072l1() {
        View n1 = mo1075n1(mo1354y() - 1, -1, false, true);
        if (n1 == null) {
            return -1;
        }
        return mo1324Q(n1);
    }

    /* renamed from: m */
    public int mo1025m(RecyclerView.C0179x xVar) {
        return mo1055c1(xVar);
    }

    /* renamed from: m1 */
    public View mo1073m1(int i, int i2) {
        int i3;
        int i4;
        mo1059e1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo1352x(i);
        }
        if (this.f882t.mo3690e(mo1352x(i)) < this.f882t.mo3696k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f880r == 0 ? this.f1031e : this.f1032f).mo4900a(i, i2, i4, i3);
    }

    /* renamed from: n */
    public int mo1074n(RecyclerView.C0179x xVar) {
        return mo1053a1(xVar);
    }

    /* renamed from: n1 */
    public View mo1075n1(int i, int i2, boolean z, boolean z2) {
        mo1059e1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f880r == 0 ? this.f1031e : this.f1032f).mo4900a(i, i2, i4, i3);
    }

    /* renamed from: o */
    public int mo1027o(RecyclerView.C0179x xVar) {
        return mo1054b1(xVar);
    }

    /* renamed from: o1 */
    public View mo1029o1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, int i, int i2, int i3) {
        mo1059e1();
        int k = this.f882t.mo3696k();
        int g = this.f882t.mo3692g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View x = mo1352x(i);
            int Q = mo1324Q(x);
            if (Q >= 0 && Q < i3) {
                if (((RecyclerView.C0165n) x.getLayoutParams()).mo1362c()) {
                    if (view2 == null) {
                        view2 = x;
                    }
                } else if (this.f882t.mo3690e(x) < g && this.f882t.mo3687b(x) >= k) {
                    return x;
                } else {
                    if (view == null) {
                        view = x;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: p */
    public int mo1030p(RecyclerView.C0179x xVar) {
        return mo1055c1(xVar);
    }

    /* renamed from: p1 */
    public final int mo1076p1(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, boolean z) {
        int g;
        int g2 = this.f882t.mo3692g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -mo1042A1(-g2, sVar, xVar);
        int i3 = i + i2;
        if (!z || (g = this.f882t.mo3692g() - i3) <= 0) {
            return i2;
        }
        this.f882t.mo3700p(g);
        return g + i2;
    }

    /* renamed from: q1 */
    public final int mo1077q1(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, boolean z) {
        int k;
        int k2 = i - this.f882t.mo3696k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -mo1042A1(k2, sVar, xVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.f882t.mo3696k()) <= 0) {
            return i2;
        }
        this.f882t.mo3700p(-k);
        return i2 - k;
    }

    /* renamed from: r1 */
    public final View mo1078r1() {
        return mo1352x(this.f885w ? 0 : mo1354y() - 1);
    }

    /* renamed from: s1 */
    public final View mo1079s1() {
        return mo1352x(this.f885w ? mo1354y() - 1 : 0);
    }

    /* renamed from: t */
    public View mo1080t(int i) {
        int y = mo1354y();
        if (y == 0) {
            return null;
        }
        int Q = i - mo1324Q(mo1352x(0));
        if (Q >= 0 && Q < y) {
            View x = mo1352x(Q);
            if (mo1324Q(x) == i) {
                return x;
            }
        }
        return super.mo1080t(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0175  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1034t0(androidx.recyclerview.widget.RecyclerView.C0171s r17, androidx.recyclerview.widget.RecyclerView.C0179x r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f875B
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f888z
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.mo1394b()
            if (r3 != 0) goto L_0x0019
            r16.mo1303D0(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f875B
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.mo1097j()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f875B
            int r3 = r3.f910b
            r0.f888z = r3
        L_0x0029:
            r16.mo1059e1()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            r5 = 0
            r3.f898a = r5
            r16.mo1087z1()
            android.view.View r3 = r16.mo1312I()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f876C
            boolean r7 = r6.f893e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            if (r7 == 0) goto L_0x0073
            int r7 = r0.f888z
            if (r7 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f875B
            if (r7 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0236
            od r6 = r0.f882t
            int r6 = r6.mo3690e(r3)
            od r7 = r0.f882t
            int r7 = r7.mo3692g()
            if (r6 >= r7) goto L_0x0068
            od r6 = r0.f882t
            int r6 = r6.mo3687b(r3)
            od r7 = r0.f882t
            int r7 = r7.mo3696k()
            if (r6 > r7) goto L_0x0236
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f876C
            int r7 = r0.mo1324Q(r3)
            r6.mo1090c(r3, r7)
            goto L_0x0236
        L_0x0073:
            r6.mo1091d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f876C
            boolean r6 = r0.f885w
            boolean r7 = r0.f886x
            r6 = r6 ^ r7
            r3.f892d = r6
            boolean r6 = r2.f1091g
            if (r6 != 0) goto L_0x0170
            int r6 = r0.f888z
            if (r6 != r4) goto L_0x0089
            goto L_0x0170
        L_0x0089:
            if (r6 < 0) goto L_0x016c
            int r7 = r18.mo1394b()
            if (r6 < r7) goto L_0x0093
            goto L_0x016c
        L_0x0093:
            int r6 = r0.f888z
            r3.f890b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f875B
            if (r6 == 0) goto L_0x00c1
            boolean r6 = r6.mo1097j()
            if (r6 == 0) goto L_0x00c1
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f875B
            boolean r6 = r6.f912d
            r3.f892d = r6
            if (r6 == 0) goto L_0x00b5
            od r6 = r0.f882t
            int r6 = r6.mo3692g()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f875B
            int r7 = r7.f911c
            goto L_0x015d
        L_0x00b5:
            od r6 = r0.f882t
            int r6 = r6.mo3696k()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f875B
            int r7 = r7.f911c
            goto L_0x0167
        L_0x00c1:
            int r6 = r0.f874A
            if (r6 != r8) goto L_0x014f
            int r6 = r0.f888z
            android.view.View r6 = r0.mo1080t(r6)
            if (r6 == 0) goto L_0x012d
            od r7 = r0.f882t
            int r7 = r7.mo3688c(r6)
            od r10 = r0.f882t
            int r10 = r10.mo3697l()
            if (r7 <= r10) goto L_0x00dd
            goto L_0x014b
        L_0x00dd:
            od r7 = r0.f882t
            int r7 = r7.mo3690e(r6)
            od r10 = r0.f882t
            int r10 = r10.mo3696k()
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x00f8
            od r6 = r0.f882t
            int r6 = r6.mo3696k()
            r3.f891c = r6
            r3.f892d = r5
            goto L_0x016a
        L_0x00f8:
            od r7 = r0.f882t
            int r7 = r7.mo3692g()
            od r10 = r0.f882t
            int r10 = r10.mo3687b(r6)
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x0112
            od r6 = r0.f882t
            int r6 = r6.mo3692g()
            r3.f891c = r6
            r3.f892d = r9
            goto L_0x016a
        L_0x0112:
            boolean r7 = r3.f892d
            if (r7 == 0) goto L_0x0124
            od r7 = r0.f882t
            int r6 = r7.mo3687b(r6)
            od r7 = r0.f882t
            int r7 = r7.mo3843m()
            int r7 = r7 + r6
            goto L_0x012a
        L_0x0124:
            od r7 = r0.f882t
            int r7 = r7.mo3690e(r6)
        L_0x012a:
            r3.f891c = r7
            goto L_0x016a
        L_0x012d:
            int r6 = r16.mo1354y()
            if (r6 <= 0) goto L_0x014b
            android.view.View r6 = r0.mo1352x(r5)
            int r6 = r0.mo1324Q(r6)
            int r7 = r0.f888z
            if (r7 >= r6) goto L_0x0141
            r6 = 1
            goto L_0x0142
        L_0x0141:
            r6 = 0
        L_0x0142:
            boolean r7 = r0.f885w
            if (r6 != r7) goto L_0x0148
            r6 = 1
            goto L_0x0149
        L_0x0148:
            r6 = 0
        L_0x0149:
            r3.f892d = r6
        L_0x014b:
            r3.mo1088a()
            goto L_0x016a
        L_0x014f:
            boolean r6 = r0.f885w
            r3.f892d = r6
            if (r6 == 0) goto L_0x015f
            od r6 = r0.f882t
            int r6 = r6.mo3692g()
            int r7 = r0.f874A
        L_0x015d:
            int r6 = r6 - r7
            goto L_0x0168
        L_0x015f:
            od r6 = r0.f882t
            int r6 = r6.mo3696k()
            int r7 = r0.f874A
        L_0x0167:
            int r6 = r6 + r7
        L_0x0168:
            r3.f891c = r6
        L_0x016a:
            r6 = 1
            goto L_0x0171
        L_0x016c:
            r0.f888z = r4
            r0.f874A = r8
        L_0x0170:
            r6 = 0
        L_0x0171:
            if (r6 == 0) goto L_0x0175
            goto L_0x0232
        L_0x0175:
            int r6 = r16.mo1354y()
            if (r6 != 0) goto L_0x017d
            goto L_0x021e
        L_0x017d:
            android.view.View r6 = r16.mo1312I()
            if (r6 == 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r7 = (androidx.recyclerview.widget.RecyclerView.C0165n) r7
            boolean r10 = r7.mo1362c()
            if (r10 != 0) goto L_0x01a1
            int r10 = r7.mo1360a()
            if (r10 < 0) goto L_0x01a1
            int r7 = r7.mo1360a()
            int r10 = r18.mo1394b()
            if (r7 >= r10) goto L_0x01a1
            r7 = 1
            goto L_0x01a2
        L_0x01a1:
            r7 = 0
        L_0x01a2:
            if (r7 == 0) goto L_0x01ad
            int r7 = r0.mo1324Q(r6)
            r3.mo1090c(r6, r7)
            goto L_0x021c
        L_0x01ad:
            boolean r6 = r0.f883u
            boolean r7 = r0.f886x
            if (r6 == r7) goto L_0x01b5
            goto L_0x021e
        L_0x01b5:
            boolean r6 = r3.f892d
            if (r6 == 0) goto L_0x01c7
            boolean r6 = r0.f885w
            if (r6 == 0) goto L_0x01c2
            android.view.View r6 = r16.mo1063g1(r17, r18)
            goto L_0x01d4
        L_0x01c2:
            android.view.View r6 = r16.mo1071k1(r17, r18)
            goto L_0x01d4
        L_0x01c7:
            boolean r6 = r0.f885w
            if (r6 == 0) goto L_0x01d0
            android.view.View r6 = r16.mo1071k1(r17, r18)
            goto L_0x01d4
        L_0x01d0:
            android.view.View r6 = r16.mo1063g1(r17, r18)
        L_0x01d4:
            if (r6 == 0) goto L_0x021e
            int r7 = r0.mo1324Q(r6)
            r3.mo1089b(r6, r7)
            boolean r7 = r2.f1091g
            if (r7 != 0) goto L_0x021c
            boolean r7 = r16.mo1019X0()
            if (r7 == 0) goto L_0x021c
            od r7 = r0.f882t
            int r7 = r7.mo3690e(r6)
            od r10 = r0.f882t
            int r10 = r10.mo3692g()
            if (r7 >= r10) goto L_0x0206
            od r7 = r0.f882t
            int r6 = r7.mo3687b(r6)
            od r7 = r0.f882t
            int r7 = r7.mo3696k()
            if (r6 >= r7) goto L_0x0204
            goto L_0x0206
        L_0x0204:
            r6 = 0
            goto L_0x0207
        L_0x0206:
            r6 = 1
        L_0x0207:
            if (r6 == 0) goto L_0x021c
            boolean r6 = r3.f892d
            if (r6 == 0) goto L_0x0214
            od r6 = r0.f882t
            int r6 = r6.mo3692g()
            goto L_0x021a
        L_0x0214:
            od r6 = r0.f882t
            int r6 = r6.mo3696k()
        L_0x021a:
            r3.f891c = r6
        L_0x021c:
            r6 = 1
            goto L_0x021f
        L_0x021e:
            r6 = 0
        L_0x021f:
            if (r6 == 0) goto L_0x0222
            goto L_0x0232
        L_0x0222:
            r3.mo1088a()
            boolean r6 = r0.f886x
            if (r6 == 0) goto L_0x022f
            int r6 = r18.mo1394b()
            int r6 = r6 + r4
            goto L_0x0230
        L_0x022f:
            r6 = 0
        L_0x0230:
            r3.f890b = r6
        L_0x0232:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f876C
            r3.f893e = r9
        L_0x0236:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            int r6 = r3.f907j
            if (r6 < 0) goto L_0x023e
            r6 = 1
            goto L_0x023f
        L_0x023e:
            r6 = -1
        L_0x023f:
            r3.f903f = r6
            int[] r3 = r0.f879F
            r3[r5] = r5
            r3[r9] = r5
            r0.mo1051Y0(r2, r3)
            int[] r3 = r0.f879F
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            od r6 = r0.f882t
            int r6 = r6.mo3696k()
            int r6 = r6 + r3
            int[] r3 = r0.f879F
            r3 = r3[r9]
            int r3 = java.lang.Math.max(r5, r3)
            od r7 = r0.f882t
            int r7 = r7.mo3693h()
            int r7 = r7 + r3
            boolean r3 = r2.f1091g
            if (r3 == 0) goto L_0x02a3
            int r3 = r0.f888z
            if (r3 == r4) goto L_0x02a3
            int r10 = r0.f874A
            if (r10 == r8) goto L_0x02a3
            android.view.View r3 = r0.mo1080t(r3)
            if (r3 == 0) goto L_0x02a3
            boolean r8 = r0.f885w
            if (r8 == 0) goto L_0x028e
            od r8 = r0.f882t
            int r8 = r8.mo3692g()
            od r10 = r0.f882t
            int r3 = r10.mo3687b(r3)
            int r8 = r8 - r3
            int r3 = r0.f874A
            goto L_0x029d
        L_0x028e:
            od r8 = r0.f882t
            int r3 = r8.mo3690e(r3)
            od r8 = r0.f882t
            int r8 = r8.mo3696k()
            int r3 = r3 - r8
            int r8 = r0.f874A
        L_0x029d:
            int r8 = r8 - r3
            if (r8 <= 0) goto L_0x02a2
            int r6 = r6 + r8
            goto L_0x02a3
        L_0x02a2:
            int r7 = r7 - r8
        L_0x02a3:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f876C
            boolean r8 = r3.f892d
            if (r8 == 0) goto L_0x02ae
            boolean r8 = r0.f885w
            if (r8 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02ae:
            boolean r8 = r0.f885w
            if (r8 == 0) goto L_0x02b4
        L_0x02b2:
            r8 = -1
            goto L_0x02b5
        L_0x02b4:
            r8 = 1
        L_0x02b5:
            r0.mo1039v1(r1, r2, r3, r8)
            r16.mo1346q(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            boolean r8 = r16.mo1085y1()
            r3.f909l = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            r3.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            r3.f906i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f876C
            boolean r8 = r3.f892d
            if (r8 == 0) goto L_0x0319
            int r8 = r3.f890b
            int r3 = r3.f891c
            r0.mo1046F1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            r3.f905h = r6
            r0.mo1061f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            int r6 = r3.f899b
            int r8 = r3.f901d
            int r3 = r3.f900c
            if (r3 <= 0) goto L_0x02eb
            int r7 = r7 + r3
        L_0x02eb:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f876C
            int r10 = r3.f890b
            int r3 = r3.f891c
            r0.mo1045E1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            r3.f905h = r7
            int r7 = r3.f901d
            int r10 = r3.f902e
            int r7 = r7 + r10
            r3.f901d = r7
            r0.mo1061f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            int r7 = r3.f899b
            int r3 = r3.f900c
            if (r3 <= 0) goto L_0x035f
            r0.mo1046F1(r8, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f881s
            r6.f905h = r3
            r0.mo1061f1(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            int r6 = r3.f899b
            goto L_0x035f
        L_0x0319:
            int r8 = r3.f890b
            int r3 = r3.f891c
            r0.mo1045E1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            r3.f905h = r7
            r0.mo1061f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            int r7 = r3.f899b
            int r8 = r3.f901d
            int r3 = r3.f900c
            if (r3 <= 0) goto L_0x0332
            int r6 = r6 + r3
        L_0x0332:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f876C
            int r10 = r3.f890b
            int r3 = r3.f891c
            r0.mo1046F1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            r3.f905h = r6
            int r6 = r3.f901d
            int r10 = r3.f902e
            int r6 = r6 + r10
            r3.f901d = r6
            r0.mo1061f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            int r6 = r3.f899b
            int r3 = r3.f900c
            if (r3 <= 0) goto L_0x035f
            r0.mo1045E1(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f881s
            r7.f905h = r3
            r0.mo1061f1(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f881s
            int r7 = r3.f899b
        L_0x035f:
            int r3 = r16.mo1354y()
            if (r3 <= 0) goto L_0x0383
            boolean r3 = r0.f885w
            boolean r8 = r0.f886x
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0377
            int r3 = r0.mo1076p1(r7, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.mo1077q1(r6, r1, r2, r5)
            goto L_0x0381
        L_0x0377:
            int r3 = r0.mo1077q1(r6, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.mo1076p1(r7, r1, r2, r5)
        L_0x0381:
            int r6 = r6 + r3
            int r7 = r7 + r3
        L_0x0383:
            boolean r3 = r2.f1095k
            if (r3 == 0) goto L_0x0419
            int r3 = r16.mo1354y()
            if (r3 == 0) goto L_0x0419
            boolean r3 = r2.f1091g
            if (r3 != 0) goto L_0x0419
            boolean r3 = r16.mo1019X0()
            if (r3 != 0) goto L_0x0399
            goto L_0x0419
        L_0x0399:
            java.util.List<androidx.recyclerview.widget.RecyclerView$a0> r3 = r1.f1063d
            int r8 = r3.size()
            android.view.View r10 = r0.mo1352x(r5)
            int r10 = r0.mo1324Q(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x03aa:
            if (r11 >= r8) goto L_0x03da
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$a0 r14 = (androidx.recyclerview.widget.RecyclerView.C0145a0) r14
            boolean r15 = r14.mo1258m()
            if (r15 == 0) goto L_0x03b9
            goto L_0x03d6
        L_0x03b9:
            int r15 = r14.mo1251f()
            if (r15 >= r10) goto L_0x03c1
            r15 = 1
            goto L_0x03c2
        L_0x03c1:
            r15 = 0
        L_0x03c2:
            boolean r9 = r0.f885w
            if (r15 == r9) goto L_0x03c8
            r9 = -1
            goto L_0x03c9
        L_0x03c8:
            r9 = 1
        L_0x03c9:
            od r15 = r0.f882t
            android.view.View r14 = r14.f996a
            int r14 = r15.mo3688c(r14)
            if (r9 != r4) goto L_0x03d5
            int r12 = r12 + r14
            goto L_0x03d6
        L_0x03d5:
            int r13 = r13 + r14
        L_0x03d6:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x03aa
        L_0x03da:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f881s
            r4.f908k = r3
            r3 = 0
            if (r12 <= 0) goto L_0x03fa
            android.view.View r4 = r16.mo1079s1()
            int r4 = r0.mo1324Q(r4)
            r0.mo1046F1(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f881s
            r4.f905h = r12
            r4.f900c = r5
            r4.mo1093a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f881s
            r0.mo1061f1(r1, r4, r2, r5)
        L_0x03fa:
            if (r13 <= 0) goto L_0x0415
            android.view.View r4 = r16.mo1078r1()
            int r4 = r0.mo1324Q(r4)
            r0.mo1045E1(r4, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f881s
            r4.f905h = r13
            r4.f900c = r5
            r4.mo1093a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f881s
            r0.mo1061f1(r1, r4, r2, r5)
        L_0x0415:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f881s
            r1.f908k = r3
        L_0x0419:
            boolean r1 = r2.f1091g
            if (r1 != 0) goto L_0x0426
            od r1 = r0.f882t
            int r2 = r1.mo3697l()
            r1.f3498b = r2
            goto L_0x042b
        L_0x0426:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f876C
            r1.mo1091d()
        L_0x042b:
            boolean r1 = r0.f886x
            r0.f883u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1034t0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    /* renamed from: t1 */
    public boolean mo1081t1() {
        return mo1314J() == 1;
    }

    /* renamed from: u */
    public RecyclerView.C0165n mo1035u() {
        return new RecyclerView.C0165n(-2, -2);
    }

    /* renamed from: u0 */
    public void mo1036u0(RecyclerView.C0179x xVar) {
        this.f875B = null;
        this.f888z = -1;
        this.f874A = Integer.MIN_VALUE;
        this.f876C.mo1091d();
    }

    /* renamed from: u1 */
    public void mo1037u1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, C0141c cVar, C0140b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View c = cVar.mo1095c(sVar);
        if (c == null) {
            bVar.f895b = true;
            return;
        }
        RecyclerView.C0165n nVar = (RecyclerView.C0165n) c.getLayoutParams();
        if (cVar.f908k == null) {
            if (this.f885w == (cVar.f903f == -1)) {
                mo1338c(c, -1, false);
            } else {
                mo1338c(c, 0, false);
            }
        } else {
            if (this.f885w == (cVar.f903f == -1)) {
                mo1338c(c, -1, true);
            } else {
                mo1338c(c, 0, true);
            }
        }
        RecyclerView.C0165n nVar2 = (RecyclerView.C0165n) c.getLayoutParams();
        Rect L = this.f1028b.mo1110L(c);
        int z = RecyclerView.C0160m.m719z(this.f1042p, this.f1040n, mo1321O() + mo1319N() + nVar2.leftMargin + nVar2.rightMargin + L.left + L.right + 0, nVar2.width, mo1058e());
        int z2 = RecyclerView.C0160m.m719z(this.f1043q, this.f1041o, mo1318M() + mo1323P() + nVar2.topMargin + nVar2.bottomMargin + L.top + L.bottom + 0, nVar2.height, mo1060f());
        if (mo1327S0(c, z, z2, nVar2)) {
            c.measure(z, z2);
        }
        bVar.f894a = this.f882t.mo3688c(c);
        if (this.f880r == 1) {
            if (mo1081t1()) {
                i5 = this.f1042p - mo1321O();
                i4 = i5 - this.f882t.mo3689d(c);
            } else {
                i4 = mo1319N();
                i5 = this.f882t.mo3689d(c) + i4;
            }
            int i6 = cVar.f903f;
            int i7 = cVar.f899b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f894a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f894a + i7;
            }
        } else {
            int P = mo1323P();
            int d = this.f882t.mo3689d(c) + P;
            int i8 = cVar.f903f;
            int i9 = cVar.f899b;
            if (i8 == -1) {
                i2 = i9;
                i3 = P;
                i = d;
                i4 = i9 - bVar.f894a;
            } else {
                i3 = P;
                i2 = bVar.f894a + i9;
                i = d;
                i4 = i9;
            }
        }
        mo1334Z(c, i4, i3, i2, i);
        if (nVar.mo1362c() || nVar.mo1361b()) {
            bVar.f896c = true;
        }
        bVar.f897d = c.hasFocusable();
    }

    /* renamed from: v1 */
    public void mo1039v1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, C0139a aVar, int i) {
    }

    /* renamed from: w1 */
    public final void mo1082w1(RecyclerView.C0171s sVar, C0141c cVar) {
        if (cVar.f898a && !cVar.f909l) {
            int i = cVar.f904g;
            int i2 = cVar.f906i;
            if (cVar.f903f == -1) {
                int y = mo1354y();
                if (i >= 0) {
                    int f = (this.f882t.mo3691f() - i) + i2;
                    if (this.f885w) {
                        for (int i3 = 0; i3 < y; i3++) {
                            View x = mo1352x(i3);
                            if (this.f882t.mo3690e(x) < f || this.f882t.mo3699o(x) < f) {
                                mo1083x1(sVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = y - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View x2 = mo1352x(i5);
                        if (this.f882t.mo3690e(x2) < f || this.f882t.mo3699o(x2) < f) {
                            mo1083x1(sVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int y2 = mo1354y();
                if (this.f885w) {
                    int i7 = y2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View x3 = mo1352x(i8);
                        if (this.f882t.mo3687b(x3) > i6 || this.f882t.mo3698n(x3) > i6) {
                            mo1083x1(sVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < y2; i9++) {
                    View x4 = mo1352x(i9);
                    if (this.f882t.mo3687b(x4) > i6 || this.f882t.mo3698n(x4) > i6) {
                        mo1083x1(sVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: x1 */
    public final void mo1083x1(RecyclerView.C0171s sVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo1309G0(i3, sVar);
                }
                return;
            }
            while (i > i2) {
                mo1309G0(i, sVar);
                i--;
            }
        }
    }

    /* renamed from: y0 */
    public void mo1084y0(Parcelable parcelable) {
        if (parcelable instanceof C0142d) {
            this.f875B = (C0142d) parcelable;
            mo1315J0();
        }
    }

    /* renamed from: y1 */
    public boolean mo1085y1() {
        return this.f882t.mo3694i() == 0 && this.f882t.mo3691f() == 0;
    }

    /* renamed from: z0 */
    public Parcelable mo1086z0() {
        C0142d dVar = this.f875B;
        if (dVar != null) {
            return new C0142d(dVar);
        }
        C0142d dVar2 = new C0142d();
        if (mo1354y() > 0) {
            mo1059e1();
            boolean z = this.f883u ^ this.f885w;
            dVar2.f912d = z;
            if (z) {
                View r1 = mo1078r1();
                dVar2.f911c = this.f882t.mo3692g() - this.f882t.mo3687b(r1);
                dVar2.f910b = mo1324Q(r1);
            } else {
                View s1 = mo1079s1();
                dVar2.f910b = mo1324Q(s1);
                dVar2.f911c = this.f882t.mo3690e(s1) - this.f882t.mo3696k();
            }
        } else {
            dVar2.f910b = -1;
        }
        return dVar2;
    }

    /* renamed from: z1 */
    public final void mo1087z1() {
        this.f885w = (this.f880r == 1 || !mo1081t1()) ? this.f884v : !this.f884v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0160m.C0164d R = RecyclerView.C0160m.m716R(context, attributeSet, i, i2);
        mo1043B1(R.f1046a);
        boolean z = R.f1048c;
        mo1056d((String) null);
        if (z != this.f884v) {
            this.f884v = z;
            mo1315J0();
        }
        mo1004C1(R.f1049d);
    }
}
