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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000.C0568hd;
import p000.C1347x8;

public class StaggeredGridLayoutManager extends RecyclerView.C0160m implements RecyclerView.C0176w.C0178b {

    /* renamed from: A */
    public BitSet f1106A;

    /* renamed from: B */
    public int f1107B;

    /* renamed from: C */
    public int f1108C;

    /* renamed from: D */
    public C0185d f1109D;

    /* renamed from: E */
    public int f1110E;

    /* renamed from: F */
    public boolean f1111F;

    /* renamed from: G */
    public boolean f1112G;

    /* renamed from: H */
    public C0188e f1113H;

    /* renamed from: I */
    public int f1114I;

    /* renamed from: J */
    public final Rect f1115J;

    /* renamed from: K */
    public final C0183b f1116K;

    /* renamed from: L */
    public boolean f1117L;

    /* renamed from: M */
    public int[] f1118M;

    /* renamed from: N */
    public final Runnable f1119N;

    /* renamed from: r */
    public int f1120r = -1;

    /* renamed from: s */
    public C0190f[] f1121s;

    /* renamed from: t */
    public C0924od f1122t;

    /* renamed from: u */
    public C0924od f1123u;

    /* renamed from: v */
    public int f1124v;

    /* renamed from: w */
    public int f1125w;

    /* renamed from: x */
    public final C0625id f1126x;

    /* renamed from: y */
    public boolean f1127y;

    /* renamed from: z */
    public boolean f1128z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C0182a implements Runnable {
        public C0182a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo1404Z0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0183b {

        /* renamed from: a */
        public int f1130a;

        /* renamed from: b */
        public int f1131b;

        /* renamed from: c */
        public boolean f1132c;

        /* renamed from: d */
        public boolean f1133d;

        /* renamed from: e */
        public boolean f1134e;

        /* renamed from: f */
        public int[] f1135f;

        public C0183b() {
            mo1433b();
        }

        /* renamed from: a */
        public void mo1432a() {
            this.f1131b = this.f1132c ? StaggeredGridLayoutManager.this.f1122t.mo3692g() : StaggeredGridLayoutManager.this.f1122t.mo3696k();
        }

        /* renamed from: b */
        public void mo1433b() {
            this.f1130a = -1;
            this.f1131b = Integer.MIN_VALUE;
            this.f1132c = false;
            this.f1133d = false;
            this.f1134e = false;
            int[] iArr = this.f1135f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0184c extends RecyclerView.C0165n {

        /* renamed from: e */
        public C0190f f1137e;

        public C0184c(int i, int i2) {
            super(i, i2);
        }

        public C0184c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0184c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0184c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0185d {

        /* renamed from: a */
        public int[] f1138a;

        /* renamed from: b */
        public List<C0186a> f1139b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class C0186a implements Parcelable {
            public static final Parcelable.Creator<C0186a> CREATOR = new C0187a();

            /* renamed from: b */
            public int f1140b;

            /* renamed from: c */
            public int f1141c;

            /* renamed from: d */
            public int[] f1142d;

            /* renamed from: e */
            public boolean f1143e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            public static class C0187a implements Parcelable.Creator<C0186a> {
                public Object createFromParcel(Parcel parcel) {
                    return new C0186a(parcel);
                }

                public Object[] newArray(int i) {
                    return new C0186a[i];
                }
            }

            public C0186a() {
            }

            public C0186a(Parcel parcel) {
                this.f1140b = parcel.readInt();
                this.f1141c = parcel.readInt();
                this.f1143e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1142d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder c = C0279ch.m1106c("FullSpanItem{mPosition=");
                c.append(this.f1140b);
                c.append(", mGapDir=");
                c.append(this.f1141c);
                c.append(", mHasUnwantedGapAfter=");
                c.append(this.f1143e);
                c.append(", mGapPerSpan=");
                c.append(Arrays.toString(this.f1142d));
                c.append('}');
                return c.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1140b);
                parcel.writeInt(this.f1141c);
                parcel.writeInt(this.f1143e ? 1 : 0);
                int[] iArr = this.f1142d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1142d);
            }
        }

        /* renamed from: a */
        public void mo1434a() {
            int[] iArr = this.f1138a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1139b = null;
        }

        /* renamed from: b */
        public void mo1435b(int i) {
            int[] iArr = this.f1138a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f1138a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1138a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1138a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public C0186a mo1436c(int i) {
            List<C0186a> list = this.f1139b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0186a aVar = this.f1139b.get(size);
                if (aVar.f1140b == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1437d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f1138a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1139b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.mo1436c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f1139b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1139b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f1139b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0185d.C0186a) r3
                int r3 = r3.f1140b
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = -1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1139b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0185d.C0186a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f1139b
                r3.remove(r2)
                int r0 = r0.f1140b
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f1138a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f1138a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.f1138a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C0185d.mo1437d(int):int");
        }

        /* renamed from: e */
        public void mo1438e(int i, int i2) {
            int[] iArr = this.f1138a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo1435b(i3);
                int[] iArr2 = this.f1138a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f1138a, i, i3, -1);
                List<C0186a> list = this.f1139b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0186a aVar = this.f1139b.get(size);
                        int i4 = aVar.f1140b;
                        if (i4 >= i) {
                            aVar.f1140b = i4 + i2;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo1439f(int i, int i2) {
            int[] iArr = this.f1138a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo1435b(i3);
                int[] iArr2 = this.f1138a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f1138a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<C0186a> list = this.f1139b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0186a aVar = this.f1139b.get(size);
                        int i4 = aVar.f1140b;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f1139b.remove(size);
                            } else {
                                aVar.f1140b = i4 - i2;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0188e implements Parcelable {
        public static final Parcelable.Creator<C0188e> CREATOR = new C0189a();

        /* renamed from: b */
        public int f1144b;

        /* renamed from: c */
        public int f1145c;

        /* renamed from: d */
        public int f1146d;

        /* renamed from: e */
        public int[] f1147e;

        /* renamed from: f */
        public int f1148f;

        /* renamed from: g */
        public int[] f1149g;

        /* renamed from: h */
        public List<C0185d.C0186a> f1150h;

        /* renamed from: i */
        public boolean f1151i;

        /* renamed from: j */
        public boolean f1152j;

        /* renamed from: k */
        public boolean f1153k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class C0189a implements Parcelable.Creator<C0188e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0188e(parcel);
            }

            public Object[] newArray(int i) {
                return new C0188e[i];
            }
        }

        public C0188e() {
        }

        public C0188e(Parcel parcel) {
            this.f1144b = parcel.readInt();
            this.f1145c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1146d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1147e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1148f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1149g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f1151i = parcel.readInt() == 1;
            this.f1152j = parcel.readInt() == 1;
            this.f1153k = parcel.readInt() == 1 ? true : z;
            this.f1150h = parcel.readArrayList(C0185d.C0186a.class.getClassLoader());
        }

        public C0188e(C0188e eVar) {
            this.f1146d = eVar.f1146d;
            this.f1144b = eVar.f1144b;
            this.f1145c = eVar.f1145c;
            this.f1147e = eVar.f1147e;
            this.f1148f = eVar.f1148f;
            this.f1149g = eVar.f1149g;
            this.f1151i = eVar.f1151i;
            this.f1152j = eVar.f1152j;
            this.f1153k = eVar.f1153k;
            this.f1150h = eVar.f1150h;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1144b);
            parcel.writeInt(this.f1145c);
            parcel.writeInt(this.f1146d);
            if (this.f1146d > 0) {
                parcel.writeIntArray(this.f1147e);
            }
            parcel.writeInt(this.f1148f);
            if (this.f1148f > 0) {
                parcel.writeIntArray(this.f1149g);
            }
            parcel.writeInt(this.f1151i ? 1 : 0);
            parcel.writeInt(this.f1152j ? 1 : 0);
            parcel.writeInt(this.f1153k ? 1 : 0);
            parcel.writeList(this.f1150h);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0190f {

        /* renamed from: a */
        public ArrayList<View> f1154a = new ArrayList<>();

        /* renamed from: b */
        public int f1155b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f1156c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f1157d = 0;

        /* renamed from: e */
        public final int f1158e;

        public C0190f(int i) {
            this.f1158e = i;
        }

        /* renamed from: a */
        public void mo1449a(View view) {
            C0184c j = mo1458j(view);
            j.f1137e = this;
            this.f1154a.add(view);
            this.f1156c = Integer.MIN_VALUE;
            if (this.f1154a.size() == 1) {
                this.f1155b = Integer.MIN_VALUE;
            }
            if (j.mo1362c() || j.mo1361b()) {
                this.f1157d = StaggeredGridLayoutManager.this.f1122t.mo3688c(view) + this.f1157d;
            }
        }

        /* renamed from: b */
        public void mo1450b() {
            ArrayList<View> arrayList = this.f1154a;
            View view = arrayList.get(arrayList.size() - 1);
            C0184c j = mo1458j(view);
            this.f1156c = StaggeredGridLayoutManager.this.f1122t.mo3687b(view);
            j.getClass();
        }

        /* renamed from: c */
        public void mo1451c() {
            View view = this.f1154a.get(0);
            C0184c j = mo1458j(view);
            this.f1155b = StaggeredGridLayoutManager.this.f1122t.mo3690e(view);
            j.getClass();
        }

        /* renamed from: d */
        public void mo1452d() {
            this.f1154a.clear();
            this.f1155b = Integer.MIN_VALUE;
            this.f1156c = Integer.MIN_VALUE;
            this.f1157d = 0;
        }

        /* renamed from: e */
        public int mo1453e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f1127y) {
                i2 = this.f1154a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f1154a.size();
            }
            return mo1455g(i2, i, true);
        }

        /* renamed from: f */
        public int mo1454f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f1127y) {
                i2 = 0;
                i = this.f1154a.size();
            } else {
                i2 = this.f1154a.size() - 1;
                i = -1;
            }
            return mo1455g(i2, i, true);
        }

        /* renamed from: g */
        public int mo1455g(int i, int i2, boolean z) {
            int k = StaggeredGridLayoutManager.this.f1122t.mo3696k();
            int g = StaggeredGridLayoutManager.this.f1122t.mo3692g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1154a.get(i);
                int e = StaggeredGridLayoutManager.this.f1122t.mo3690e(view);
                int b = StaggeredGridLayoutManager.this.f1122t.mo3687b(view);
                boolean z2 = false;
                boolean z3 = !z ? e < g : e <= g;
                if (!z ? b > k : b >= k) {
                    z2 = true;
                }
                if (z3 && z2 && (e < k || b > g)) {
                    return StaggeredGridLayoutManager.this.mo1324Q(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: h */
        public int mo1456h(int i) {
            int i2 = this.f1156c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1154a.size() == 0) {
                return i;
            }
            mo1450b();
            return this.f1156c;
        }

        /* renamed from: i */
        public View mo1457i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1154a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1154a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f1127y && staggeredGridLayoutManager.mo1324Q(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f1127y && staggeredGridLayoutManager2.mo1324Q(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1154a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1154a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f1127y && staggeredGridLayoutManager3.mo1324Q(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f1127y && staggeredGridLayoutManager4.mo1324Q(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: j */
        public C0184c mo1458j(View view) {
            return (C0184c) view.getLayoutParams();
        }

        /* renamed from: k */
        public int mo1459k(int i) {
            int i2 = this.f1155b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1154a.size() == 0) {
                return i;
            }
            mo1451c();
            return this.f1155b;
        }

        /* renamed from: l */
        public void mo1460l() {
            int size = this.f1154a.size();
            View remove = this.f1154a.remove(size - 1);
            C0184c j = mo1458j(remove);
            j.f1137e = null;
            if (j.mo1362c() || j.mo1361b()) {
                this.f1157d -= StaggeredGridLayoutManager.this.f1122t.mo3688c(remove);
            }
            if (size == 1) {
                this.f1155b = Integer.MIN_VALUE;
            }
            this.f1156c = Integer.MIN_VALUE;
        }

        /* renamed from: m */
        public void mo1461m() {
            View remove = this.f1154a.remove(0);
            C0184c j = mo1458j(remove);
            j.f1137e = null;
            if (this.f1154a.size() == 0) {
                this.f1156c = Integer.MIN_VALUE;
            }
            if (j.mo1362c() || j.mo1361b()) {
                this.f1157d -= StaggeredGridLayoutManager.this.f1122t.mo3688c(remove);
            }
            this.f1155b = Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public void mo1462n(View view) {
            C0184c j = mo1458j(view);
            j.f1137e = this;
            this.f1154a.add(0, view);
            this.f1155b = Integer.MIN_VALUE;
            if (this.f1154a.size() == 1) {
                this.f1156c = Integer.MIN_VALUE;
            }
            if (j.mo1362c() || j.mo1361b()) {
                this.f1157d = StaggeredGridLayoutManager.this.f1122t.mo3688c(view) + this.f1157d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1127y = false;
        this.f1128z = false;
        this.f1107B = -1;
        this.f1108C = Integer.MIN_VALUE;
        this.f1109D = new C0185d();
        this.f1110E = 2;
        this.f1115J = new Rect();
        this.f1116K = new C0183b();
        this.f1117L = true;
        this.f1119N = new C0182a();
        RecyclerView.C0160m.C0164d R = RecyclerView.C0160m.m716R(context, attributeSet, i, i2);
        int i3 = R.f1046a;
        if (i3 == 0 || i3 == 1) {
            mo1056d((String) null);
            if (i3 != this.f1124v) {
                this.f1124v = i3;
                C0924od odVar = this.f1122t;
                this.f1122t = this.f1123u;
                this.f1123u = odVar;
                mo1315J0();
            }
            int i4 = R.f1047b;
            mo1056d((String) null);
            if (i4 != this.f1120r) {
                this.f1109D.mo1434a();
                mo1315J0();
                this.f1120r = i4;
                this.f1106A = new BitSet(this.f1120r);
                this.f1121s = new C0190f[this.f1120r];
                for (int i5 = 0; i5 < this.f1120r; i5++) {
                    this.f1121s[i5] = new C0190f(i5);
                }
                mo1315J0();
            }
            boolean z = R.f1048c;
            mo1056d((String) null);
            C0188e eVar = this.f1113H;
            if (!(eVar == null || eVar.f1151i == z)) {
                eVar.f1151i = z;
            }
            this.f1127y = z;
            mo1315J0();
            this.f1126x = new C0625id();
            this.f1122t = C0924od.m2678a(this, this.f1124v);
            this.f1123u = C0924od.m2678a(this, 1 - this.f1124v);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: A */
    public int mo1003A(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        return this.f1124v == 1 ? this.f1120r : super.mo1003A(sVar, xVar);
    }

    /* renamed from: A0 */
    public void mo1297A0(int i) {
        if (i == 0) {
            mo1404Z0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* renamed from: A1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1400A1(int r5, androidx.recyclerview.widget.RecyclerView.C0179x r6) {
        /*
            r4 = this;
            id r0 = r4.f1126x
            r1 = 0
            r0.f2683b = r1
            r0.f2684c = r5
            androidx.recyclerview.widget.RecyclerView$w r0 = r4.f1033g
            r2 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f1074e
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0033
            int r6 = r6.f1085a
            r0 = -1
            if (r6 == r0) goto L_0x0033
            boolean r0 = r4.f1128z
            if (r6 >= r5) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r0 != r5) goto L_0x002a
            od r5 = r4.f1122t
            int r5 = r5.mo3697l()
            goto L_0x0034
        L_0x002a:
            od r5 = r4.f1122t
            int r5 = r5.mo3697l()
            r6 = r5
            r5 = 0
            goto L_0x0035
        L_0x0033:
            r5 = 0
        L_0x0034:
            r6 = 0
        L_0x0035:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1028b
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.f958h
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0059
            id r0 = r4.f1126x
            od r3 = r4.f1122t
            int r3 = r3.mo3696k()
            int r3 = r3 - r6
            r0.f2687f = r3
            id r6 = r4.f1126x
            od r0 = r4.f1122t
            int r0 = r0.mo3692g()
            int r0 = r0 + r5
            r6.f2688g = r0
            goto L_0x0069
        L_0x0059:
            id r0 = r4.f1126x
            od r3 = r4.f1122t
            int r3 = r3.mo3691f()
            int r3 = r3 + r5
            r0.f2688g = r3
            id r5 = r4.f1126x
            int r6 = -r6
            r5.f2687f = r6
        L_0x0069:
            id r5 = r4.f1126x
            r5.f2689h = r1
            r5.f2682a = r2
            od r6 = r4.f1122t
            int r6 = r6.mo3694i()
            if (r6 != 0) goto L_0x0080
            od r6 = r4.f1122t
            int r6 = r6.mo3691f()
            if (r6 != 0) goto L_0x0080
            r1 = 1
        L_0x0080:
            r5.f2690i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1400A1(int, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    /* renamed from: B1 */
    public final void mo1401B1(C0190f fVar, int i, int i2) {
        int i3 = fVar.f1157d;
        if (i == -1) {
            int i4 = fVar.f1155b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.mo1451c();
                i4 = fVar.f1155b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f1156c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.mo1450b();
                i5 = fVar.f1156c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f1106A.set(fVar.f1158e, false);
    }

    /* renamed from: C1 */
    public final int mo1402C1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: K0 */
    public int mo1009K0(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        return mo1428x1(i, sVar, xVar);
    }

    /* renamed from: L0 */
    public void mo1047L0(int i) {
        C0188e eVar = this.f1113H;
        if (!(eVar == null || eVar.f1144b == i)) {
            eVar.f1147e = null;
            eVar.f1146d = 0;
            eVar.f1144b = -1;
            eVar.f1145c = -1;
        }
        this.f1107B = i;
        this.f1108C = Integer.MIN_VALUE;
        mo1315J0();
    }

    /* renamed from: M0 */
    public int mo1012M0(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        return mo1428x1(i, sVar, xVar);
    }

    /* renamed from: P0 */
    public void mo1016P0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int O = mo1321O() + mo1319N();
        int M = mo1318M() + mo1323P();
        if (this.f1124v == 1) {
            i4 = RecyclerView.C0160m.m718h(i2, rect.height() + M, mo1316K());
            i3 = RecyclerView.C0160m.m718h(i, (this.f1125w * this.f1120r) + O, mo1317L());
        } else {
            i3 = RecyclerView.C0160m.m718h(i, rect.width() + O, mo1317L());
            i4 = RecyclerView.C0160m.m718h(i2, (this.f1125w * this.f1120r) + M, mo1316K());
        }
        this.f1028b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: S */
    public int mo1018S(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        return this.f1124v == 0 ? this.f1120r : super.mo1018S(sVar, xVar);
    }

    /* renamed from: V */
    public boolean mo1049V() {
        return this.f1110E != 0;
    }

    /* renamed from: V0 */
    public void mo1050V0(RecyclerView recyclerView, RecyclerView.C0179x xVar, int i) {
        C0676jd jdVar = new C0676jd(recyclerView.getContext());
        jdVar.f1070a = i;
        mo1332W0(jdVar);
    }

    /* renamed from: X0 */
    public boolean mo1019X0() {
        return this.f1113H == null;
    }

    /* renamed from: Y0 */
    public final int mo1403Y0(int i) {
        if (mo1354y() == 0) {
            return this.f1128z ? 1 : -1;
        }
        return (i < mo1413i1()) != this.f1128z ? -1 : 1;
    }

    /* renamed from: Z0 */
    public boolean mo1404Z0() {
        int i;
        if (!(mo1354y() == 0 || this.f1110E == 0 || !this.f1035i)) {
            if (this.f1128z) {
                i = mo1414j1();
                mo1413i1();
            } else {
                i = mo1413i1();
                mo1414j1();
            }
            if (i == 0 && mo1418n1() != null) {
                this.f1109D.mo1434a();
                this.f1034h = true;
                mo1315J0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public PointF mo1052a(int i) {
        int Y0 = mo1403Y0(i);
        PointF pointF = new PointF();
        if (Y0 == 0) {
            return null;
        }
        if (this.f1124v == 0) {
            pointF.x = (float) Y0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) Y0;
        }
        return pointF;
    }

    /* renamed from: a0 */
    public void mo1335a0(int i) {
        super.mo1335a0(i);
        for (int i2 = 0; i2 < this.f1120r; i2++) {
            C0190f fVar = this.f1121s[i2];
            int i3 = fVar.f1155b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f1155b = i3 + i;
            }
            int i4 = fVar.f1156c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f1156c = i4 + i;
            }
        }
    }

    /* renamed from: a1 */
    public final int mo1405a1(RecyclerView.C0179x xVar) {
        if (mo1354y() == 0) {
            return 0;
        }
        return C1107sc.m3163a(xVar, this.f1122t, mo1410f1(!this.f1117L), mo1409e1(!this.f1117L), this, this.f1117L);
    }

    /* renamed from: b0 */
    public void mo1337b0(int i) {
        super.mo1337b0(i);
        for (int i2 = 0; i2 < this.f1120r; i2++) {
            C0190f fVar = this.f1121s[i2];
            int i3 = fVar.f1155b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f1155b = i3 + i;
            }
            int i4 = fVar.f1156c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f1156c = i4 + i;
            }
        }
    }

    /* renamed from: b1 */
    public final int mo1406b1(RecyclerView.C0179x xVar) {
        if (mo1354y() == 0) {
            return 0;
        }
        return C1107sc.m3164b(xVar, this.f1122t, mo1410f1(!this.f1117L), mo1409e1(!this.f1117L), this, this.f1117L, this.f1128z);
    }

    /* renamed from: c1 */
    public final int mo1407c1(RecyclerView.C0179x xVar) {
        if (mo1354y() == 0) {
            return 0;
        }
        return C1107sc.m3165c(xVar, this.f1122t, mo1410f1(!this.f1117L), mo1409e1(!this.f1117L), this, this.f1117L);
    }

    /* renamed from: d */
    public void mo1056d(String str) {
        RecyclerView recyclerView;
        if (this.f1113H == null && (recyclerView = this.f1028b) != null) {
            recyclerView.mo1175i(str);
        }
    }

    /* renamed from: d1 */
    public final int mo1408d1(RecyclerView.C0171s sVar, C0625id idVar, RecyclerView.C0179x xVar) {
        int i;
        C0190f fVar;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView.C0171s sVar2 = sVar;
        C0625id idVar2 = idVar;
        boolean z3 = false;
        this.f1106A.set(0, this.f1120r, true);
        if (this.f1126x.f2690i) {
            i = idVar2.f2686e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = idVar2.f2686e == 1 ? idVar2.f2688g + idVar2.f2683b : idVar2.f2687f - idVar2.f2683b;
        }
        mo1430z1(idVar2.f2686e, i);
        int g = this.f1128z ? this.f1122t.mo3692g() : this.f1122t.mo3696k();
        boolean z4 = false;
        while (true) {
            int i14 = idVar2.f2684c;
            if ((i14 >= 0 && i14 < xVar.mo1394b()) && (this.f1126x.f2690i || !this.f1106A.isEmpty())) {
                View view = sVar2.mo1380k(idVar2.f2684c, z3, Long.MAX_VALUE).f996a;
                idVar2.f2684c += idVar2.f2685d;
                C0184c cVar = (C0184c) view.getLayoutParams();
                int a = cVar.mo1360a();
                int[] iArr = this.f1109D.f1138a;
                int i15 = (iArr == null || a >= iArr.length) ? -1 : iArr[a];
                if (i15 == -1) {
                    if (mo1422r1(idVar2.f2686e)) {
                        i13 = this.f1120r - 1;
                        i12 = -1;
                        i11 = -1;
                    } else {
                        i12 = this.f1120r;
                        i13 = 0;
                        i11 = 1;
                    }
                    C0190f fVar2 = null;
                    if (idVar2.f2686e == 1) {
                        int k = this.f1122t.mo3696k();
                        int i16 = Integer.MAX_VALUE;
                        while (i13 != i12) {
                            C0190f fVar3 = this.f1121s[i13];
                            int h = fVar3.mo1456h(k);
                            if (h < i16) {
                                fVar2 = fVar3;
                                i16 = h;
                            }
                            i13 += i11;
                        }
                    } else {
                        int g2 = this.f1122t.mo3692g();
                        int i17 = Integer.MIN_VALUE;
                        while (i13 != i12) {
                            C0190f fVar4 = this.f1121s[i13];
                            int k2 = fVar4.mo1459k(g2);
                            if (k2 > i17) {
                                fVar2 = fVar4;
                                i17 = k2;
                            }
                            i13 += i11;
                        }
                    }
                    fVar = fVar2;
                    C0185d dVar = this.f1109D;
                    dVar.mo1435b(a);
                    dVar.f1138a[a] = fVar.f1158e;
                } else {
                    fVar = this.f1121s[i15];
                }
                C0190f fVar5 = fVar;
                cVar.f1137e = fVar5;
                if (idVar2.f2686e == 1) {
                    z = false;
                    mo1338c(view, -1, false);
                } else {
                    z = false;
                    mo1338c(view, 0, false);
                }
                if (this.f1124v == 1) {
                    i3 = RecyclerView.C0160m.m719z(this.f1125w, this.f1040n, z ? 1 : 0, cVar.width, z);
                    i2 = RecyclerView.C0160m.m719z(this.f1043q, this.f1041o, mo1318M() + mo1323P(), cVar.height, true);
                    z2 = false;
                } else {
                    i3 = RecyclerView.C0160m.m719z(this.f1042p, this.f1040n, mo1321O() + mo1319N(), cVar.width, true);
                    z2 = false;
                    i2 = RecyclerView.C0160m.m719z(this.f1125w, this.f1041o, 0, cVar.height, false);
                }
                mo1420p1(view, i3, i2, z2);
                if (idVar2.f2686e == 1) {
                    i5 = fVar5.mo1456h(g);
                    i4 = this.f1122t.mo3688c(view) + i5;
                } else {
                    i4 = fVar5.mo1459k(g);
                    i5 = i4 - this.f1122t.mo3688c(view);
                }
                int i18 = idVar2.f2686e;
                C0190f fVar6 = cVar.f1137e;
                if (i18 == 1) {
                    fVar6.mo1449a(view);
                } else {
                    fVar6.mo1462n(view);
                }
                if (!mo1419o1() || this.f1124v != 1) {
                    i6 = this.f1123u.mo3696k() + (fVar5.f1158e * this.f1125w);
                    i7 = this.f1123u.mo3688c(view) + i6;
                } else {
                    i7 = this.f1123u.mo3692g() - (((this.f1120r - 1) - fVar5.f1158e) * this.f1125w);
                    i6 = i7 - this.f1123u.mo3688c(view);
                }
                if (this.f1124v == 1) {
                    i9 = i7;
                    i8 = i4;
                    i10 = i6;
                    i6 = i5;
                } else {
                    i8 = i7;
                    i9 = i4;
                    i10 = i5;
                }
                mo1334Z(view, i10, i6, i9, i8);
                mo1401B1(fVar5, this.f1126x.f2686e, i);
                mo1424t1(sVar2, this.f1126x);
                if (this.f1126x.f2689h && view.hasFocusable()) {
                    this.f1106A.set(fVar5.f1158e, false);
                }
                z4 = true;
                z3 = false;
            }
        }
        if (!z4) {
            mo1424t1(sVar2, this.f1126x);
        }
        int k3 = this.f1126x.f2686e == -1 ? this.f1122t.mo3696k() - mo1416l1(this.f1122t.mo3696k()) : mo1415k1(this.f1122t.mo3692g()) - this.f1122t.mo3692g();
        if (k3 > 0) {
            return Math.min(idVar2.f2683b, k3);
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo1058e() {
        return this.f1124v == 0;
    }

    /* renamed from: e1 */
    public View mo1409e1(boolean z) {
        int k = this.f1122t.mo3696k();
        int g = this.f1122t.mo3692g();
        View view = null;
        for (int y = mo1354y() - 1; y >= 0; y--) {
            View x = mo1352x(y);
            int e = this.f1122t.mo3690e(x);
            int b = this.f1122t.mo3687b(x);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    /* renamed from: f */
    public boolean mo1060f() {
        return this.f1124v == 1;
    }

    /* renamed from: f1 */
    public View mo1410f1(boolean z) {
        int k = this.f1122t.mo3696k();
        int g = this.f1122t.mo3692g();
        int y = mo1354y();
        View view = null;
        for (int i = 0; i < y; i++) {
            View x = mo1352x(i);
            int e = this.f1122t.mo3690e(x);
            if (this.f1122t.mo3687b(x) > k && e < g) {
                if (e >= k || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    /* renamed from: g */
    public boolean mo1021g(RecyclerView.C0165n nVar) {
        return nVar instanceof C0184c;
    }

    /* renamed from: g0 */
    public void mo1062g0(RecyclerView recyclerView, RecyclerView.C0171s sVar) {
        mo1342f0();
        Runnable runnable = this.f1119N;
        RecyclerView recyclerView2 = this.f1028b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f1120r; i++) {
            this.f1121s[i].mo1452d();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: g1 */
    public final void mo1411g1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, boolean z) {
        int g;
        int k1 = mo1415k1(Integer.MIN_VALUE);
        if (k1 != Integer.MIN_VALUE && (g = this.f1122t.mo3692g() - k1) > 0) {
            int i = g - (-mo1428x1(-g, sVar, xVar));
            if (z && i > 0) {
                this.f1122t.mo3700p(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.f1124v == 1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.f1124v == 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (mo1419o1() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        if (mo1419o1() == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1022h0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C0171s r11, androidx.recyclerview.widget.RecyclerView.C0179x r12) {
        /*
            r8 = this;
            int r0 = r8.mo1354y()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.mo1349s(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.mo1427w1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L_0x004f
            r4 = 2
            if (r10 == r4) goto L_0x0043
            r4 = 17
            if (r10 == r4) goto L_0x003b
            r4 = 33
            if (r10 == r4) goto L_0x0036
            r4 = 66
            if (r10 == r4) goto L_0x0031
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            int r10 = r8.f1124v
            if (r10 != r3) goto L_0x0040
            goto L_0x005a
        L_0x0031:
            int r10 = r8.f1124v
            if (r10 != 0) goto L_0x0040
            goto L_0x005a
        L_0x0036:
            int r10 = r8.f1124v
            if (r10 != r3) goto L_0x0040
            goto L_0x005c
        L_0x003b:
            int r10 = r8.f1124v
            if (r10 != 0) goto L_0x0040
            goto L_0x005c
        L_0x0040:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005d
        L_0x0043:
            int r10 = r8.f1124v
            if (r10 != r3) goto L_0x0048
            goto L_0x005a
        L_0x0048:
            boolean r10 = r8.mo1419o1()
            if (r10 == 0) goto L_0x005a
            goto L_0x005c
        L_0x004f:
            int r10 = r8.f1124v
            if (r10 != r3) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            boolean r10 = r8.mo1419o1()
            if (r10 == 0) goto L_0x005c
        L_0x005a:
            r10 = 1
            goto L_0x005d
        L_0x005c:
            r10 = -1
        L_0x005d:
            if (r10 != r0) goto L_0x0060
            return r1
        L_0x0060:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0184c) r0
            r0.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f1137e
            if (r10 != r3) goto L_0x0072
            int r4 = r8.mo1414j1()
            goto L_0x0076
        L_0x0072:
            int r4 = r8.mo1413i1()
        L_0x0076:
            r8.mo1400A1(r4, r12)
            r8.mo1429y1(r10)
            id r5 = r8.f1126x
            int r6 = r5.f2685d
            int r6 = r6 + r4
            r5.f2684c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            od r7 = r8.f1122t
            int r7 = r7.mo3697l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f2683b = r6
            id r5 = r8.f1126x
            r5.f2689h = r3
            r6 = 0
            r5.f2682a = r6
            r8.mo1408d1(r11, r5, r12)
            boolean r11 = r8.f1128z
            r8.f1111F = r11
            android.view.View r11 = r0.mo1457i(r4, r10)
            if (r11 == 0) goto L_0x00a9
            if (r11 == r9) goto L_0x00a9
            return r11
        L_0x00a9:
            boolean r11 = r8.mo1422r1(r10)
            if (r11 == 0) goto L_0x00c4
            int r11 = r8.f1120r
            int r11 = r11 - r3
        L_0x00b2:
            if (r11 < 0) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1121s
            r12 = r12[r11]
            android.view.View r12 = r12.mo1457i(r4, r10)
            if (r12 == 0) goto L_0x00c1
            if (r12 == r9) goto L_0x00c1
            return r12
        L_0x00c1:
            int r11 = r11 + -1
            goto L_0x00b2
        L_0x00c4:
            r11 = 0
        L_0x00c5:
            int r12 = r8.f1120r
            if (r11 >= r12) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1121s
            r12 = r12[r11]
            android.view.View r12 = r12.mo1457i(r4, r10)
            if (r12 == 0) goto L_0x00d6
            if (r12 == r9) goto L_0x00d6
            return r12
        L_0x00d6:
            int r11 = r11 + 1
            goto L_0x00c5
        L_0x00d9:
            boolean r11 = r8.f1127y
            r11 = r11 ^ r3
            if (r10 != r2) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            if (r11 != r12) goto L_0x00e5
            r11 = 1
            goto L_0x00e6
        L_0x00e5:
            r11 = 0
        L_0x00e6:
            if (r11 == 0) goto L_0x00ed
            int r12 = r0.mo1453e()
            goto L_0x00f1
        L_0x00ed:
            int r12 = r0.mo1454f()
        L_0x00f1:
            android.view.View r12 = r8.mo1080t(r12)
            if (r12 == 0) goto L_0x00fa
            if (r12 == r9) goto L_0x00fa
            return r12
        L_0x00fa:
            boolean r10 = r8.mo1422r1(r10)
            if (r10 == 0) goto L_0x0127
            int r10 = r8.f1120r
            int r10 = r10 - r3
        L_0x0103:
            if (r10 < 0) goto L_0x0148
            int r12 = r0.f1158e
            if (r10 != r12) goto L_0x010a
            goto L_0x0124
        L_0x010a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1121s
            if (r11 == 0) goto L_0x0115
            r12 = r12[r10]
            int r12 = r12.mo1453e()
            goto L_0x011b
        L_0x0115:
            r12 = r12[r10]
            int r12 = r12.mo1454f()
        L_0x011b:
            android.view.View r12 = r8.mo1080t(r12)
            if (r12 == 0) goto L_0x0124
            if (r12 == r9) goto L_0x0124
            return r12
        L_0x0124:
            int r10 = r10 + -1
            goto L_0x0103
        L_0x0127:
            int r10 = r8.f1120r
            if (r6 >= r10) goto L_0x0148
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f1121s
            if (r11 == 0) goto L_0x0136
            r10 = r10[r6]
            int r10 = r10.mo1453e()
            goto L_0x013c
        L_0x0136:
            r10 = r10[r6]
            int r10 = r10.mo1454f()
        L_0x013c:
            android.view.View r10 = r8.mo1080t(r10)
            if (r10 == 0) goto L_0x0145
            if (r10 == r9) goto L_0x0145
            return r10
        L_0x0145:
            int r6 = r6 + 1
            goto L_0x0127
        L_0x0148:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1022h0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    /* renamed from: h1 */
    public final void mo1412h1(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, boolean z) {
        int k;
        int l1 = mo1416l1(Integer.MAX_VALUE);
        if (l1 != Integer.MAX_VALUE && (k = l1 - this.f1122t.mo3696k()) > 0) {
            int x1 = k - mo1428x1(k, sVar, xVar);
            if (z && x1 > 0) {
                this.f1122t.mo3700p(-x1);
            }
        }
    }

    /* renamed from: i */
    public void mo1065i(int i, int i2, RecyclerView.C0179x xVar, RecyclerView.C0160m.C0163c cVar) {
        int i3;
        int i4;
        if (this.f1124v != 0) {
            i = i2;
        }
        if (mo1354y() != 0 && i != 0) {
            mo1423s1(i, xVar);
            int[] iArr = this.f1118M;
            if (iArr == null || iArr.length < this.f1120r) {
                this.f1118M = new int[this.f1120r];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f1120r; i6++) {
                C0625id idVar = this.f1126x;
                if (idVar.f2685d == -1) {
                    i4 = idVar.f2687f;
                    i3 = this.f1121s[i6].mo1459k(i4);
                } else {
                    i4 = this.f1121s[i6].mo1456h(idVar.f2688g);
                    i3 = this.f1126x.f2688g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f1118M[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f1118M, 0, i5);
            int i8 = 0;
            while (i8 < i5) {
                int i9 = this.f1126x.f2684c;
                if (i9 >= 0 && i9 < xVar.mo1394b()) {
                    ((C0568hd.C0570b) cVar).mo3077a(this.f1126x.f2684c, this.f1118M[i8]);
                    C0625id idVar2 = this.f1126x;
                    idVar2.f2684c += idVar2.f2685d;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i0 */
    public void mo1066i0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0171s sVar = this.f1028b.f948c;
        mo1343j0(accessibilityEvent);
        if (mo1354y() > 0) {
            View f1 = mo1410f1(false);
            View e1 = mo1409e1(false);
            if (f1 != null && e1 != null) {
                int Q = mo1324Q(f1);
                int Q2 = mo1324Q(e1);
                if (Q < Q2) {
                    accessibilityEvent.setFromIndex(Q);
                    accessibilityEvent.setToIndex(Q2);
                    return;
                }
                accessibilityEvent.setFromIndex(Q2);
                accessibilityEvent.setToIndex(Q);
            }
        }
    }

    /* renamed from: i1 */
    public int mo1413i1() {
        if (mo1354y() == 0) {
            return 0;
        }
        return mo1324Q(mo1352x(0));
    }

    /* renamed from: j1 */
    public int mo1414j1() {
        int y = mo1354y();
        if (y == 0) {
            return 0;
        }
        return mo1324Q(mo1352x(y - 1));
    }

    /* renamed from: k */
    public int mo1070k(RecyclerView.C0179x xVar) {
        return mo1405a1(xVar);
    }

    /* renamed from: k1 */
    public final int mo1415k1(int i) {
        int h = this.f1121s[0].mo1456h(i);
        for (int i2 = 1; i2 < this.f1120r; i2++) {
            int h2 = this.f1121s[i2].mo1456h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    /* renamed from: l */
    public int mo1023l(RecyclerView.C0179x xVar) {
        return mo1406b1(xVar);
    }

    /* renamed from: l0 */
    public void mo1024l0(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar, View view, C1347x8 x8Var) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0184c)) {
            mo1344k0(view, x8Var);
            return;
        }
        C0184c cVar = (C0184c) layoutParams;
        if (this.f1124v == 0) {
            C0190f fVar = cVar.f1137e;
            i4 = fVar == null ? -1 : fVar.f1158e;
            i3 = 1;
            i2 = -1;
            i = -1;
        } else {
            C0190f fVar2 = cVar.f1137e;
            i2 = fVar2 == null ? -1 : fVar2.f1158e;
            i4 = -1;
            i3 = -1;
            i = 1;
        }
        x8Var.mo5064j(C1347x8.C1350c.m3799a(i4, i3, i2, i, false, false));
    }

    /* renamed from: l1 */
    public final int mo1416l1(int i) {
        int k = this.f1121s[0].mo1459k(i);
        for (int i2 = 1; i2 < this.f1120r; i2++) {
            int k2 = this.f1121s[i2].mo1459k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* renamed from: m */
    public int mo1025m(RecyclerView.C0179x xVar) {
        return mo1407c1(xVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1417m1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f1128z
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo1414j1()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo1413i1()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f1109D
            r4.mo1437d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f1109D
            r9.mo1439f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f1109D
            r7.mo1438e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f1109D
            r9.mo1439f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f1109D
            r9.mo1438e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f1128z
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo1413i1()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo1414j1()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo1315J0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1417m1(int, int, int):void");
    }

    /* renamed from: n */
    public int mo1074n(RecyclerView.C0179x xVar) {
        return mo1405a1(xVar);
    }

    /* renamed from: n0 */
    public void mo1026n0(RecyclerView recyclerView, int i, int i2) {
        mo1417m1(i, i2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0090 A[SYNTHETIC] */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1418n1() {
        /*
            r12 = this;
            int r0 = r12.mo1354y()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f1120r
            r2.<init>(r3)
            int r3 = r12.f1120r
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f1124v
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo1419o1()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f1128z
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00eb
            android.view.View r7 = r12.mo1352x(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0184c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1137e
            int r9 = r9.f1158e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0098
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1137e
            boolean r10 = r12.f1128z
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f1156c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.mo1450b()
            int r10 = r9.f1156c
        L_0x0056:
            od r11 = r12.f1122t
            int r11 = r11.mo3692g()
            if (r10 >= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f1154a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0082
        L_0x006a:
            int r10 = r9.f1155b
            if (r10 == r11) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r9.mo1451c()
            int r10 = r9.f1155b
        L_0x0074:
            od r11 = r12.f1122t
            int r11 = r11.mo3696k()
            if (r10 <= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f1154a
            java.lang.Object r10 = r10.get(r4)
        L_0x0082:
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.mo1458j(r10)
            r9.getClass()
            r9 = 1
            goto L_0x008e
        L_0x008d:
            r9 = 0
        L_0x008e:
            if (r9 == 0) goto L_0x0091
            return r7
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1137e
            int r9 = r9.f1158e
            r2.clear(r9)
        L_0x0098:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00e8
            android.view.View r9 = r12.mo1352x(r9)
            boolean r10 = r12.f1128z
            if (r10 == 0) goto L_0x00b6
            od r10 = r12.f1122t
            int r10 = r10.mo3687b(r7)
            od r11 = r12.f1122t
            int r11 = r11.mo3687b(r9)
            if (r10 >= r11) goto L_0x00b3
            return r7
        L_0x00b3:
            if (r10 != r11) goto L_0x00c9
            goto L_0x00c7
        L_0x00b6:
            od r10 = r12.f1122t
            int r10 = r10.mo3690e(r7)
            od r11 = r12.f1122t
            int r11 = r11.mo3690e(r9)
            if (r10 <= r11) goto L_0x00c5
            return r7
        L_0x00c5:
            if (r10 != r11) goto L_0x00c9
        L_0x00c7:
            r10 = 1
            goto L_0x00ca
        L_0x00c9:
            r10 = 0
        L_0x00ca:
            if (r10 == 0) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0184c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f1137e
            int r8 = r8.f1158e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f1137e
            int r9 = r9.f1158e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00df
            r8 = 1
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r3 >= 0) goto L_0x00e4
            r9 = 1
            goto L_0x00e5
        L_0x00e4:
            r9 = 0
        L_0x00e5:
            if (r8 == r9) goto L_0x00e8
            return r7
        L_0x00e8:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00eb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1418n1():android.view.View");
    }

    /* renamed from: o */
    public int mo1027o(RecyclerView.C0179x xVar) {
        return mo1406b1(xVar);
    }

    /* renamed from: o0 */
    public void mo1028o0(RecyclerView recyclerView) {
        this.f1109D.mo1434a();
        mo1315J0();
    }

    /* renamed from: o1 */
    public boolean mo1419o1() {
        return mo1314J() == 1;
    }

    /* renamed from: p */
    public int mo1030p(RecyclerView.C0179x xVar) {
        return mo1407c1(xVar);
    }

    /* renamed from: p0 */
    public void mo1031p0(RecyclerView recyclerView, int i, int i2, int i3) {
        mo1417m1(i, i2, 8);
    }

    /* renamed from: p1 */
    public final void mo1420p1(View view, int i, int i2, boolean z) {
        Rect rect = this.f1115J;
        RecyclerView recyclerView = this.f1028b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.mo1110L(view));
        }
        C0184c cVar = (C0184c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect2 = this.f1115J;
        int C1 = mo1402C1(i, i3 + rect2.left, cVar.rightMargin + rect2.right);
        int i4 = cVar.topMargin;
        Rect rect3 = this.f1115J;
        int C12 = mo1402C1(i2, i4 + rect3.top, cVar.bottomMargin + rect3.bottom);
        if (z ? mo1330U0(view, C1, C12, cVar) : mo1327S0(view, C1, C12, cVar)) {
            view.measure(C1, C12);
        }
    }

    /* renamed from: q0 */
    public void mo1032q0(RecyclerView recyclerView, int i, int i2) {
        mo1417m1(i, i2, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f9, code lost:
        if (mo1404Z0() != false) goto L_0x03fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ac  */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1421q1(androidx.recyclerview.widget.RecyclerView.C0171s r12, androidx.recyclerview.widget.RecyclerView.C0179x r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.f1116K
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f1113H
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f1107B
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.mo1394b()
            if (r1 != 0) goto L_0x0018
            r11.mo1303D0(r12)
            r0.mo1433b()
            return
        L_0x0018:
            boolean r1 = r0.f1134e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f1107B
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f1113H
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01e7
            r0.mo1433b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f1113H
            if (r6 == 0) goto L_0x00b8
            int r7 = r6.f1146d
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f1120r
            if (r7 != r9) goto L_0x006f
            r6 = 0
        L_0x003f:
            int r7 = r11.f1120r
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f1121s
            r7 = r7[r6]
            r7.mo1452d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f1113H
            int[] r9 = r7.f1147e
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f1152j
            if (r7 == 0) goto L_0x005d
            od r7 = r11.f1122t
            int r7 = r7.mo3692g()
            goto L_0x0063
        L_0x005d:
            od r7 = r11.f1122t
            int r7 = r7.mo3696k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f1121s
            r7 = r7[r6]
            r7.f1155b = r9
            r7.f1156c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f1147e = r8
            r6.f1146d = r4
            r6.f1148f = r4
            r6.f1149g = r8
            r6.f1150h = r8
            int r7 = r6.f1145c
            r6.f1144b = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f1113H
            boolean r7 = r6.f1153k
            r11.f1112G = r7
            boolean r6 = r6.f1151i
            r11.mo1056d(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f1113H
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f1151i
            if (r8 == r6) goto L_0x0092
            r7.f1151i = r6
        L_0x0092:
            r11.f1127y = r6
            r11.mo1315J0()
            r11.mo1427w1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f1113H
            int r7 = r6.f1144b
            if (r7 == r2) goto L_0x00a5
            r11.f1107B = r7
            boolean r7 = r6.f1152j
            goto L_0x00a7
        L_0x00a5:
            boolean r7 = r11.f1128z
        L_0x00a7:
            r0.f1132c = r7
            int r7 = r6.f1148f
            if (r7 <= r3) goto L_0x00bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.f1109D
            int[] r8 = r6.f1149g
            r7.f1138a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r6 = r6.f1150h
            r7.f1139b = r6
            goto L_0x00bf
        L_0x00b8:
            r11.mo1427w1()
            boolean r6 = r11.f1128z
            r0.f1132c = r6
        L_0x00bf:
            boolean r6 = r13.f1091g
            if (r6 != 0) goto L_0x01a8
            int r6 = r11.f1107B
            if (r6 != r2) goto L_0x00c9
            goto L_0x01a8
        L_0x00c9:
            if (r6 < 0) goto L_0x01a4
            int r7 = r13.mo1394b()
            if (r6 < r7) goto L_0x00d3
            goto L_0x01a4
        L_0x00d3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f1113H
            if (r6 == 0) goto L_0x00e8
            int r7 = r6.f1144b
            if (r7 == r2) goto L_0x00e8
            int r6 = r6.f1146d
            if (r6 >= r3) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            r0.f1131b = r5
            int r6 = r11.f1107B
            r0.f1130a = r6
            goto L_0x01a2
        L_0x00e8:
            int r6 = r11.f1107B
            android.view.View r6 = r11.mo1080t(r6)
            if (r6 == 0) goto L_0x0170
            boolean r7 = r11.f1128z
            if (r7 == 0) goto L_0x00f9
            int r7 = r11.mo1414j1()
            goto L_0x00fd
        L_0x00f9:
            int r7 = r11.mo1413i1()
        L_0x00fd:
            r0.f1130a = r7
            int r7 = r11.f1108C
            if (r7 == r5) goto L_0x0128
            boolean r7 = r0.f1132c
            if (r7 == 0) goto L_0x0117
            od r7 = r11.f1122t
            int r7 = r7.mo3692g()
            int r8 = r11.f1108C
            int r7 = r7 - r8
            od r8 = r11.f1122t
            int r6 = r8.mo3687b(r6)
            goto L_0x0126
        L_0x0117:
            od r7 = r11.f1122t
            int r7 = r7.mo3696k()
            int r8 = r11.f1108C
            int r7 = r7 + r8
            od r8 = r11.f1122t
            int r6 = r8.mo3690e(r6)
        L_0x0126:
            int r7 = r7 - r6
            goto L_0x016a
        L_0x0128:
            od r7 = r11.f1122t
            int r7 = r7.mo3688c(r6)
            od r8 = r11.f1122t
            int r8 = r8.mo3697l()
            if (r7 <= r8) goto L_0x0148
            boolean r6 = r0.f1132c
            if (r6 == 0) goto L_0x0141
            od r6 = r11.f1122t
            int r6 = r6.mo3692g()
            goto L_0x0158
        L_0x0141:
            od r6 = r11.f1122t
            int r6 = r6.mo3696k()
            goto L_0x0158
        L_0x0148:
            od r7 = r11.f1122t
            int r7 = r7.mo3690e(r6)
            od r8 = r11.f1122t
            int r8 = r8.mo3696k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x015b
            int r6 = -r7
        L_0x0158:
            r0.f1131b = r6
            goto L_0x01a2
        L_0x015b:
            od r7 = r11.f1122t
            int r7 = r7.mo3692g()
            od r8 = r11.f1122t
            int r6 = r8.mo3687b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x016d
        L_0x016a:
            r0.f1131b = r7
            goto L_0x01a2
        L_0x016d:
            r0.f1131b = r5
            goto L_0x01a2
        L_0x0170:
            int r6 = r11.f1107B
            r0.f1130a = r6
            int r7 = r11.f1108C
            if (r7 != r5) goto L_0x0187
            int r6 = r11.mo1403Y0(r6)
            if (r6 != r3) goto L_0x0180
            r6 = 1
            goto L_0x0181
        L_0x0180:
            r6 = 0
        L_0x0181:
            r0.f1132c = r6
            r0.mo1432a()
            goto L_0x01a0
        L_0x0187:
            boolean r6 = r0.f1132c
            if (r6 == 0) goto L_0x0195
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            od r6 = r6.f1122t
            int r6 = r6.mo3692g()
            int r6 = r6 - r7
            goto L_0x019e
        L_0x0195:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            od r6 = r6.f1122t
            int r6 = r6.mo3696k()
            int r6 = r6 + r7
        L_0x019e:
            r0.f1131b = r6
        L_0x01a0:
            r0.f1133d = r3
        L_0x01a2:
            r6 = 1
            goto L_0x01a9
        L_0x01a4:
            r11.f1107B = r2
            r11.f1108C = r5
        L_0x01a8:
            r6 = 0
        L_0x01a9:
            if (r6 == 0) goto L_0x01ac
            goto L_0x01e5
        L_0x01ac:
            boolean r6 = r11.f1111F
            int r7 = r13.mo1394b()
            if (r6 == 0) goto L_0x01c8
            int r6 = r11.mo1354y()
        L_0x01b8:
            int r6 = r6 + r2
            if (r6 < 0) goto L_0x01e0
            android.view.View r8 = r11.mo1352x(r6)
            int r8 = r11.mo1324Q(r8)
            if (r8 < 0) goto L_0x01b8
            if (r8 >= r7) goto L_0x01b8
            goto L_0x01e1
        L_0x01c8:
            int r6 = r11.mo1354y()
            r8 = 0
        L_0x01cd:
            if (r8 >= r6) goto L_0x01e0
            android.view.View r9 = r11.mo1352x(r8)
            int r9 = r11.mo1324Q(r9)
            if (r9 < 0) goto L_0x01dd
            if (r9 >= r7) goto L_0x01dd
            r8 = r9
            goto L_0x01e1
        L_0x01dd:
            int r8 = r8 + 1
            goto L_0x01cd
        L_0x01e0:
            r8 = 0
        L_0x01e1:
            r0.f1130a = r8
            r0.f1131b = r5
        L_0x01e5:
            r0.f1134e = r3
        L_0x01e7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f1113H
            if (r6 != 0) goto L_0x0204
            int r6 = r11.f1107B
            if (r6 != r2) goto L_0x0204
            boolean r6 = r0.f1132c
            boolean r7 = r11.f1111F
            if (r6 != r7) goto L_0x01fd
            boolean r6 = r11.mo1419o1()
            boolean r7 = r11.f1112G
            if (r6 == r7) goto L_0x0204
        L_0x01fd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r11.f1109D
            r6.mo1434a()
            r0.f1133d = r3
        L_0x0204:
            int r6 = r11.mo1354y()
            if (r6 <= 0) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f1113H
            if (r6 == 0) goto L_0x0212
            int r6 = r6.f1146d
            if (r6 >= r3) goto L_0x02bc
        L_0x0212:
            boolean r6 = r0.f1133d
            if (r6 == 0) goto L_0x0231
            r1 = 0
        L_0x0217:
            int r6 = r11.f1120r
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1121s
            r6 = r6[r1]
            r6.mo1452d()
            int r6 = r0.f1131b
            if (r6 == r5) goto L_0x022e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f1121s
            r7 = r7[r1]
            r7.f1155b = r6
            r7.f1156c = r6
        L_0x022e:
            int r1 = r1 + 1
            goto L_0x0217
        L_0x0231:
            if (r1 != 0) goto L_0x0253
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f1116K
            int[] r1 = r1.f1135f
            if (r1 != 0) goto L_0x023a
            goto L_0x0253
        L_0x023a:
            r1 = 0
        L_0x023b:
            int r6 = r11.f1120r
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1121s
            r6 = r6[r1]
            r6.mo1452d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.f1116K
            int[] r7 = r7.f1135f
            r7 = r7[r1]
            r6.f1155b = r7
            r6.f1156c = r7
            int r1 = r1 + 1
            goto L_0x023b
        L_0x0253:
            r1 = 0
        L_0x0254:
            int r6 = r11.f1120r
            if (r1 >= r6) goto L_0x0294
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1121s
            r6 = r6[r1]
            boolean r7 = r11.f1128z
            int r8 = r0.f1131b
            if (r7 == 0) goto L_0x0267
            int r9 = r6.mo1456h(r5)
            goto L_0x026b
        L_0x0267:
            int r9 = r6.mo1459k(r5)
        L_0x026b:
            r6.mo1452d()
            if (r9 != r5) goto L_0x0271
            goto L_0x0291
        L_0x0271:
            if (r7 == 0) goto L_0x027d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            od r10 = r10.f1122t
            int r10 = r10.mo3692g()
            if (r9 < r10) goto L_0x0291
        L_0x027d:
            if (r7 != 0) goto L_0x028a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            od r7 = r7.f1122t
            int r7 = r7.mo3696k()
            if (r9 <= r7) goto L_0x028a
            goto L_0x0291
        L_0x028a:
            if (r8 == r5) goto L_0x028d
            int r9 = r9 + r8
        L_0x028d:
            r6.f1156c = r9
            r6.f1155b = r9
        L_0x0291:
            int r1 = r1 + 1
            goto L_0x0254
        L_0x0294:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f1116K
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1121s
            r1.getClass()
            int r7 = r6.length
            int[] r8 = r1.f1135f
            if (r8 == 0) goto L_0x02a3
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02ac
        L_0x02a3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f1121s
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f1135f = r8
        L_0x02ac:
            r8 = 0
        L_0x02ad:
            if (r8 >= r7) goto L_0x02bc
            int[] r9 = r1.f1135f
            r10 = r6[r8]
            int r10 = r10.mo1459k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02ad
        L_0x02bc:
            r11.mo1346q(r12)
            id r1 = r11.f1126x
            r1.f2682a = r4
            od r1 = r11.f1123u
            int r1 = r1.mo3697l()
            int r6 = r11.f1120r
            int r6 = r1 / r6
            r11.f1125w = r6
            od r6 = r11.f1123u
            int r6 = r6.mo3694i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r11.f1114I = r1
            int r1 = r0.f1130a
            r11.mo1400A1(r1, r13)
            boolean r1 = r0.f1132c
            if (r1 == 0) goto L_0x02f0
            r11.mo1429y1(r2)
            id r1 = r11.f1126x
            r11.mo1408d1(r12, r1, r13)
            r11.mo1429y1(r3)
            goto L_0x02fb
        L_0x02f0:
            r11.mo1429y1(r3)
            id r1 = r11.f1126x
            r11.mo1408d1(r12, r1, r13)
            r11.mo1429y1(r2)
        L_0x02fb:
            id r1 = r11.f1126x
            int r2 = r0.f1130a
            int r6 = r1.f2685d
            int r2 = r2 + r6
            r1.f2684c = r2
            r11.mo1408d1(r12, r1, r13)
            od r1 = r11.f1123u
            int r1 = r1.mo3694i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0313
            goto L_0x03ba
        L_0x0313:
            r1 = 0
            int r2 = r11.mo1354y()
            r6 = 0
        L_0x0319:
            if (r6 >= r2) goto L_0x033b
            android.view.View r7 = r11.mo1352x(r6)
            od r8 = r11.f1123u
            int r8 = r8.mo3688c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x032b
            goto L_0x0338
        L_0x032b:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0184c) r7
            r7.getClass()
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0338:
            int r6 = r6 + 1
            goto L_0x0319
        L_0x033b:
            int r6 = r11.f1125w
            int r7 = r11.f1120r
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            od r7 = r11.f1123u
            int r7 = r7.mo3694i()
            if (r7 != r5) goto L_0x0358
            od r5 = r11.f1123u
            int r5 = r5.mo3697l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0358:
            int r5 = r11.f1120r
            int r5 = r1 / r5
            r11.f1125w = r5
            od r5 = r11.f1123u
            int r5 = r5.mo3694i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r11.f1114I = r1
            int r1 = r11.f1125w
            if (r1 != r6) goto L_0x036f
            goto L_0x03ba
        L_0x036f:
            r1 = 0
        L_0x0370:
            if (r1 >= r2) goto L_0x03ba
            android.view.View r5 = r11.mo1352x(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0184c) r7
            r7.getClass()
            boolean r8 = r11.mo1419o1()
            if (r8 == 0) goto L_0x03a1
            int r8 = r11.f1124v
            if (r8 != r3) goto L_0x03a1
            int r8 = r11.f1120r
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f1137e
            int r7 = r7.f1158e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f1125w
            int r9 = r9 * r10
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03b7
        L_0x03a1:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f1137e
            int r7 = r7.f1158e
            int r8 = r11.f1125w
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f1124v
            int r8 = r8 - r7
            if (r9 != r3) goto L_0x03b4
            r5.offsetLeftAndRight(r8)
            goto L_0x03b7
        L_0x03b4:
            r5.offsetTopAndBottom(r8)
        L_0x03b7:
            int r1 = r1 + 1
            goto L_0x0370
        L_0x03ba:
            int r1 = r11.mo1354y()
            if (r1 <= 0) goto L_0x03d1
            boolean r1 = r11.f1128z
            if (r1 == 0) goto L_0x03cb
            r11.mo1411g1(r12, r13, r3)
            r11.mo1412h1(r12, r13, r4)
            goto L_0x03d1
        L_0x03cb:
            r11.mo1412h1(r12, r13, r3)
            r11.mo1411g1(r12, r13, r4)
        L_0x03d1:
            if (r14 == 0) goto L_0x03fc
            boolean r14 = r13.f1091g
            if (r14 != 0) goto L_0x03fc
            int r14 = r11.f1110E
            if (r14 == 0) goto L_0x03e9
            int r14 = r11.mo1354y()
            if (r14 <= 0) goto L_0x03e9
            android.view.View r14 = r11.mo1418n1()
            if (r14 == 0) goto L_0x03e9
            r14 = 1
            goto L_0x03ea
        L_0x03e9:
            r14 = 0
        L_0x03ea:
            if (r14 == 0) goto L_0x03fc
            java.lang.Runnable r14 = r11.f1119N
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1028b
            if (r1 == 0) goto L_0x03f5
            r1.removeCallbacks(r14)
        L_0x03f5:
            boolean r14 = r11.mo1404Z0()
            if (r14 == 0) goto L_0x03fc
            goto L_0x03fd
        L_0x03fc:
            r3 = 0
        L_0x03fd:
            boolean r14 = r13.f1091g
            if (r14 == 0) goto L_0x0406
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f1116K
            r14.mo1433b()
        L_0x0406:
            boolean r14 = r0.f1132c
            r11.f1111F = r14
            boolean r14 = r11.mo1419o1()
            r11.f1112G = r14
            if (r3 == 0) goto L_0x041a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f1116K
            r14.mo1433b()
            r11.mo1421q1(r12, r13, r4)
        L_0x041a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1421q1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    /* renamed from: r1 */
    public final boolean mo1422r1(int i) {
        if (this.f1124v == 0) {
            return (i == -1) != this.f1128z;
        }
        return ((i == -1) == this.f1128z) == mo1419o1();
    }

    /* renamed from: s0 */
    public void mo1033s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo1417m1(i, i2, 4);
    }

    /* renamed from: s1 */
    public void mo1423s1(int i, RecyclerView.C0179x xVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo1414j1();
            i2 = 1;
        } else {
            i3 = mo1413i1();
            i2 = -1;
        }
        this.f1126x.f2682a = true;
        mo1400A1(i3, xVar);
        mo1429y1(i2);
        C0625id idVar = this.f1126x;
        idVar.f2684c = i3 + idVar.f2685d;
        idVar.f2683b = Math.abs(i);
    }

    /* renamed from: t0 */
    public void mo1034t0(RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        mo1421q1(sVar, xVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f2686e == -1) goto L_0x0013;
     */
    /* renamed from: t1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1424t1(androidx.recyclerview.widget.RecyclerView.C0171s r5, p000.C0625id r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2682a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f2690i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f2683b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f2686e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f2688g
        L_0x0015:
            r4.mo1425u1(r5, r6)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f2687f
        L_0x001b:
            r4.mo1426v1(r5, r6)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f2686e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f2687f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1121s
            r1 = r1[r2]
            int r1 = r1.mo1459k(r0)
        L_0x002f:
            int r2 = r4.f1120r
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1121s
            r2 = r2[r3]
            int r2 = r2.mo1459k(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f2688g
            int r6 = r6.f2683b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f2688g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1121s
            r1 = r1[r2]
            int r1 = r1.mo1456h(r0)
        L_0x005a:
            int r2 = r4.f1120r
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1121s
            r2 = r2[r3]
            int r2 = r2.mo1456h(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f2688g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f2687f
            int r6 = r6.f2683b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1424t1(androidx.recyclerview.widget.RecyclerView$s, id):void");
    }

    /* renamed from: u */
    public RecyclerView.C0165n mo1035u() {
        return this.f1124v == 0 ? new C0184c(-2, -1) : new C0184c(-1, -2);
    }

    /* renamed from: u0 */
    public void mo1036u0(RecyclerView.C0179x xVar) {
        this.f1107B = -1;
        this.f1108C = Integer.MIN_VALUE;
        this.f1113H = null;
        this.f1116K.mo1433b();
    }

    /* renamed from: u1 */
    public final void mo1425u1(RecyclerView.C0171s sVar, int i) {
        int y = mo1354y() - 1;
        while (y >= 0) {
            View x = mo1352x(y);
            if (this.f1122t.mo3690e(x) >= i && this.f1122t.mo3699o(x) >= i) {
                C0184c cVar = (C0184c) x.getLayoutParams();
                cVar.getClass();
                if (cVar.f1137e.f1154a.size() != 1) {
                    cVar.f1137e.mo1460l();
                    mo1307F0(x, sVar);
                    y--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: v */
    public RecyclerView.C0165n mo1038v(Context context, AttributeSet attributeSet) {
        return new C0184c(context, attributeSet);
    }

    /* renamed from: v1 */
    public final void mo1426v1(RecyclerView.C0171s sVar, int i) {
        while (mo1354y() > 0) {
            View x = mo1352x(0);
            if (this.f1122t.mo3687b(x) <= i && this.f1122t.mo3698n(x) <= i) {
                C0184c cVar = (C0184c) x.getLayoutParams();
                cVar.getClass();
                if (cVar.f1137e.f1154a.size() != 1) {
                    cVar.f1137e.mo1461m();
                    mo1307F0(x, sVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    public RecyclerView.C0165n mo1040w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0184c((ViewGroup.MarginLayoutParams) layoutParams) : new C0184c(layoutParams);
    }

    /* renamed from: w1 */
    public final void mo1427w1() {
        this.f1128z = (this.f1124v == 1 || !mo1419o1()) ? this.f1127y : !this.f1127y;
    }

    /* renamed from: x1 */
    public int mo1428x1(int i, RecyclerView.C0171s sVar, RecyclerView.C0179x xVar) {
        if (mo1354y() == 0 || i == 0) {
            return 0;
        }
        mo1423s1(i, xVar);
        int d1 = mo1408d1(sVar, this.f1126x, xVar);
        if (this.f1126x.f2683b >= d1) {
            i = i < 0 ? -d1 : d1;
        }
        this.f1122t.mo3700p(-i);
        this.f1111F = this.f1128z;
        C0625id idVar = this.f1126x;
        idVar.f2683b = 0;
        mo1424t1(sVar, idVar);
        return i;
    }

    /* renamed from: y0 */
    public void mo1084y0(Parcelable parcelable) {
        if (parcelable instanceof C0188e) {
            this.f1113H = (C0188e) parcelable;
            mo1315J0();
        }
    }

    /* renamed from: y1 */
    public final void mo1429y1(int i) {
        C0625id idVar = this.f1126x;
        idVar.f2686e = i;
        int i2 = 1;
        if (this.f1128z != (i == -1)) {
            i2 = -1;
        }
        idVar.f2685d = i2;
    }

    /* renamed from: z0 */
    public Parcelable mo1086z0() {
        int i;
        int i2;
        int[] iArr;
        C0188e eVar = this.f1113H;
        if (eVar != null) {
            return new C0188e(eVar);
        }
        C0188e eVar2 = new C0188e();
        eVar2.f1151i = this.f1127y;
        eVar2.f1152j = this.f1111F;
        eVar2.f1153k = this.f1112G;
        C0185d dVar = this.f1109D;
        if (dVar == null || (iArr = dVar.f1138a) == null) {
            eVar2.f1148f = 0;
        } else {
            eVar2.f1149g = iArr;
            eVar2.f1148f = iArr.length;
            eVar2.f1150h = dVar.f1139b;
        }
        int i3 = -1;
        if (mo1354y() > 0) {
            eVar2.f1144b = this.f1111F ? mo1414j1() : mo1413i1();
            View e1 = this.f1128z ? mo1409e1(true) : mo1410f1(true);
            if (e1 != null) {
                i3 = mo1324Q(e1);
            }
            eVar2.f1145c = i3;
            int i4 = this.f1120r;
            eVar2.f1146d = i4;
            eVar2.f1147e = new int[i4];
            for (int i5 = 0; i5 < this.f1120r; i5++) {
                if (this.f1111F) {
                    i = this.f1121s[i5].mo1456h(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f1122t.mo3692g();
                    } else {
                        eVar2.f1147e[i5] = i;
                    }
                } else {
                    i = this.f1121s[i5].mo1459k(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f1122t.mo3696k();
                    } else {
                        eVar2.f1147e[i5] = i;
                    }
                }
                i -= i2;
                eVar2.f1147e[i5] = i;
            }
        } else {
            eVar2.f1144b = -1;
            eVar2.f1145c = -1;
            eVar2.f1146d = 0;
        }
        return eVar2;
    }

    /* renamed from: z1 */
    public final void mo1430z1(int i, int i2) {
        for (int i3 = 0; i3 < this.f1120r; i3++) {
            if (!this.f1121s[i3].f1154a.isEmpty()) {
                mo1401B1(this.f1121s[i3], i, i2);
            }
        }
    }
}
