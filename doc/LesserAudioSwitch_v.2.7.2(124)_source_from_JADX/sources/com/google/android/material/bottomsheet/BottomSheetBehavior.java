package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.C0962p9;
import p000.C1347x8;
import p000.C1446z8;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0088c<V> {

    /* renamed from: A */
    public int f1478A;

    /* renamed from: B */
    public boolean f1479B;

    /* renamed from: C */
    public int f1480C;

    /* renamed from: D */
    public int f1481D;

    /* renamed from: E */
    public WeakReference<V> f1482E;

    /* renamed from: F */
    public WeakReference<View> f1483F;

    /* renamed from: G */
    public final ArrayList<C0302d> f1484G = new ArrayList<>();

    /* renamed from: H */
    public VelocityTracker f1485H;

    /* renamed from: I */
    public int f1486I;

    /* renamed from: J */
    public int f1487J;

    /* renamed from: K */
    public boolean f1488K;

    /* renamed from: L */
    public Map<View, Integer> f1489L;

    /* renamed from: M */
    public final C0962p9.C0965c f1490M = new C0300b();

    /* renamed from: a */
    public int f1491a = 0;

    /* renamed from: b */
    public boolean f1492b = true;

    /* renamed from: c */
    public float f1493c;

    /* renamed from: d */
    public int f1494d;

    /* renamed from: e */
    public boolean f1495e;

    /* renamed from: f */
    public int f1496f;

    /* renamed from: g */
    public boolean f1497g;

    /* renamed from: h */
    public C1067rl f1498h;

    /* renamed from: i */
    public int f1499i;

    /* renamed from: j */
    public boolean f1500j;

    /* renamed from: k */
    public C1217ul f1501k;

    /* renamed from: l */
    public boolean f1502l;

    /* renamed from: m */
    public BottomSheetBehavior<V>.C0440f f1503m = null;

    /* renamed from: n */
    public ValueAnimator f1504n;

    /* renamed from: o */
    public int f1505o;

    /* renamed from: p */
    public int f1506p;

    /* renamed from: q */
    public int f1507q;

    /* renamed from: r */
    public float f1508r = 0.5f;

    /* renamed from: s */
    public int f1509s;

    /* renamed from: t */
    public float f1510t = -1.0f;

    /* renamed from: u */
    public boolean f1511u;

    /* renamed from: v */
    public boolean f1512v;

    /* renamed from: w */
    public boolean f1513w = true;

    /* renamed from: x */
    public int f1514x = 4;

    /* renamed from: y */
    public C0962p9 f1515y;

    /* renamed from: z */
    public boolean f1516z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C0299a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f1517b;

        /* renamed from: c */
        public final /* synthetic */ int f1518c;

        public C0299a(View view, int i) {
            this.f1517b = view;
            this.f1518c = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo1911N(this.f1517b, this.f1518c);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C0300b extends C0962p9.C0965c {
        public C0300b() {
        }

        /* renamed from: a */
        public int mo1864a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo1865b(View view, int i, int i2) {
            int I = BottomSheetBehavior.this.mo1906I();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C1344x5.m3759h(i, I, bottomSheetBehavior.f1511u ? bottomSheetBehavior.f1481D : bottomSheetBehavior.f1509s);
        }

        /* renamed from: d */
        public int mo1920d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f1511u ? bottomSheetBehavior.f1481D : bottomSheetBehavior.f1509s;
        }

        /* renamed from: f */
        public void mo1868f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f1513w) {
                    bottomSheetBehavior.mo1910M(1);
                }
            }
        }

        /* renamed from: g */
        public void mo1869g(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo1904F(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f1520a.f1505o) < java.lang.Math.abs(r8.getTop() - r7.f1520a.f1507q)) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
            if (java.lang.Math.abs(r9 - r7.f1520a.f1507q) < java.lang.Math.abs(r9 - r7.f1520a.f1509s)) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f0, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.f1509s)) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.f1520a.f1509s)) goto L_0x00ba;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1870h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0024
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.f1492b
                if (r10 == 0) goto L_0x0014
            L_0x000f:
                int r9 = r9.f1506p
            L_0x0011:
                r2 = 3
                goto L_0x0105
            L_0x0014:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r10.f1507q
                if (r9 <= r1) goto L_0x0021
                r9 = r1
                goto L_0x00be
            L_0x0021:
                int r9 = r10.f1505o
                goto L_0x0011
            L_0x0024:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r5.f1511u
                if (r6 == 0) goto L_0x0087
                boolean r5 = r5.mo1913P(r8, r10)
                if (r5 == 0) goto L_0x0087
                float r9 = java.lang.Math.abs(r9)
                float r1 = java.lang.Math.abs(r10)
                int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r9 >= 0) goto L_0x0042
                r9 = 1140457472(0x43fa0000, float:500.0)
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0058
            L_0x0042:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r10.f1481D
                int r10 = r10.mo1906I()
                int r10 = r10 + r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L_0x0055
                r9 = 1
                goto L_0x0056
            L_0x0055:
                r9 = 0
            L_0x0056:
                if (r9 == 0) goto L_0x005f
            L_0x0058:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f1481D
                r2 = 5
                goto L_0x0105
            L_0x005f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.f1492b
                if (r10 == 0) goto L_0x0066
                goto L_0x000f
            L_0x0066:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f1505o
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f1507q
                int r10 = r10 - r1
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00ba
            L_0x0082:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f1505o
                goto L_0x0011
            L_0x0087:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x00c3
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0098
                goto L_0x00c3
            L_0x0098:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.f1492b
                if (r10 == 0) goto L_0x00a1
            L_0x009e:
                int r9 = r9.f1509s
                goto L_0x0105
            L_0x00a1:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f1507q
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f1509s
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c0
            L_0x00ba:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f1507q
            L_0x00be:
                r2 = 6
                goto L_0x0105
            L_0x00c0:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                goto L_0x009e
            L_0x00c3:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r1 = r10.f1492b
                if (r1 == 0) goto L_0x00e4
                int r10 = r10.f1506p
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f1509s
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c0
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                goto L_0x000f
            L_0x00e4:
                int r1 = r10.f1507q
                if (r9 >= r1) goto L_0x00f3
                int r10 = r10.f1509s
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00ba
                goto L_0x0082
            L_0x00f3:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.f1509s
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c0
                goto L_0x00ba
            L_0x0105:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10.mo1914Q(r8, r2, r9, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C0300b.mo1870h(android.view.View, float, float):void");
        }

        /* renamed from: i */
        public boolean mo1871i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f1514x;
            if (i2 == 1 || bottomSheetBehavior.f1488K) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f1486I == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f1483F;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f1482E;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C0301c implements C1446z8 {

        /* renamed from: a */
        public final /* synthetic */ int f1521a;

        public C0301c(int i) {
            this.f1521a = i;
        }

        /* renamed from: a */
        public boolean mo1921a(View view, C1446z8.C1447a aVar) {
            BottomSheetBehavior.this.mo1909L(this.f1521a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static abstract class C0302d {
        /* renamed from: a */
        public abstract void mo1922a(View view, float f);

        /* renamed from: b */
        public abstract void mo1923b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static class C0303e extends C0718k9 {
        public static final Parcelable.Creator<C0303e> CREATOR = new C0304a();

        /* renamed from: d */
        public final int f1523d;

        /* renamed from: e */
        public int f1524e;

        /* renamed from: f */
        public boolean f1525f;

        /* renamed from: g */
        public boolean f1526g;

        /* renamed from: h */
        public boolean f1527h;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public static class C0304a implements Parcelable.ClassLoaderCreator<C0303e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0303e(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0303e[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0303e(parcel, classLoader);
            }
        }

        public C0303e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1523d = parcel.readInt();
            this.f1524e = parcel.readInt();
            boolean z = false;
            this.f1525f = parcel.readInt() == 1;
            this.f1526g = parcel.readInt() == 1;
            this.f1527h = parcel.readInt() == 1 ? true : z;
        }

        public C0303e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f1523d = bottomSheetBehavior.f1514x;
            this.f1524e = bottomSheetBehavior.f1494d;
            this.f1525f = bottomSheetBehavior.f1492b;
            this.f1526g = bottomSheetBehavior.f1511u;
            this.f1527h = bottomSheetBehavior.f1512v;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            parcel.writeInt(this.f1523d);
            parcel.writeInt(this.f1524e);
            parcel.writeInt(this.f1525f ? 1 : 0);
            parcel.writeInt(this.f1526g ? 1 : 0);
            parcel.writeInt(this.f1527h ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class C0305f implements Runnable {

        /* renamed from: b */
        public final View f1528b;

        /* renamed from: c */
        public boolean f1529c;

        /* renamed from: d */
        public int f1530d;

        public C0305f(View view, int i) {
            this.f1528b = view;
            this.f1530d = i;
        }

        public void run() {
            C0962p9 p9Var = BottomSheetBehavior.this.f1515y;
            if (p9Var == null || !p9Var.mo3985i(true)) {
                BottomSheetBehavior.this.mo1910M(this.f1530d);
            } else {
                C0813m8.m2491y(this.f1528b, this);
            }
            this.f1529c = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0781lh.f3150b);
        this.f1497g = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            mo1903E(context, attributeSet, hasValue, C0728kh.m2295k(context, obtainStyledAttributes, 1));
        } else {
            mo1903E(context, attributeSet, hasValue, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f1504n = ofFloat;
        ofFloat.setDuration(500);
        this.f1504n.addUpdateListener(new C0782li(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1510t = obtainStyledAttributes.getDimension(0, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            mo1908K(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            mo1908K(i2);
        }
        mo1907J(obtainStyledAttributes.getBoolean(6, false));
        this.f1500j = obtainStyledAttributes.getBoolean(10, false);
        boolean z = obtainStyledAttributes.getBoolean(4, true);
        if (this.f1492b != z) {
            this.f1492b = z;
            if (this.f1482E != null) {
                mo1901C();
            }
            mo1910M((!this.f1492b || this.f1514x != 6) ? this.f1514x : 3);
            mo1915R();
        }
        this.f1512v = obtainStyledAttributes.getBoolean(9, false);
        this.f1513w = obtainStyledAttributes.getBoolean(2, true);
        this.f1491a = obtainStyledAttributes.getInt(8, 0);
        float f = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f1508r = f;
        if (this.f1482E != null) {
            this.f1507q = (int) ((1.0f - f) * ((float) this.f1481D));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            i = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            if (i < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            i = peekValue2.data;
            if (i < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f1505o = i;
        obtainStyledAttributes.recycle();
        this.f1493c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: H */
    public static <V extends View> BottomSheetBehavior<V> m1200H(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0091f) {
            CoordinatorLayout.C0088c cVar = ((CoordinatorLayout.C0091f) layoutParams).f611a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A */
    public boolean mo112A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1514x == 1 && actionMasked == 0) {
            return true;
        }
        C0962p9 p9Var = this.f1515y;
        if (p9Var != null) {
            p9Var.mo3990n(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1486I = -1;
            VelocityTracker velocityTracker = this.f1485H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1485H = null;
            }
        }
        if (this.f1485H == null) {
            this.f1485H = VelocityTracker.obtain();
        }
        this.f1485H.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f1516z) {
            float abs = Math.abs(((float) this.f1487J) - motionEvent.getY());
            C0962p9 p9Var2 = this.f1515y;
            if (abs > ((float) p9Var2.f3584b)) {
                p9Var2.mo3978b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1516z;
    }

    /* renamed from: B */
    public final void mo1900B(V v, C1347x8.C1348a aVar, int i) {
        C0813m8.m2454C(v, aVar, (CharSequence) null, new C0301c(i));
    }

    /* renamed from: C */
    public final void mo1901C() {
        int D = mo1902D();
        if (this.f1492b) {
            this.f1509s = Math.max(this.f1481D - D, this.f1506p);
        } else {
            this.f1509s = this.f1481D - D;
        }
    }

    /* renamed from: D */
    public final int mo1902D() {
        if (this.f1495e) {
            return Math.max(this.f1496f, this.f1481D - ((this.f1480C * 9) / 16));
        }
        return this.f1494d + (this.f1500j ? 0 : this.f1499i);
    }

    /* renamed from: E */
    public final void mo1903E(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f1497g) {
            this.f1501k = C1217ul.m3398b(context, attributeSet, R.attr.bottomSheetStyle, 2131755627).mo4783a();
            C1067rl rlVar = new C1067rl(this.f1501k);
            this.f1498h = rlVar;
            rlVar.f3979b.f4003b = new C0383dk(context);
            rlVar.mo4309w();
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f1498h.setTint(typedValue.data);
                return;
            }
            this.f1498h.mo4300p(colorStateList);
        }
    }

    /* renamed from: F */
    public void mo1904F(int i) {
        float f;
        float f2;
        View view = (View) this.f1482E.get();
        if (view != null && !this.f1484G.isEmpty()) {
            int i2 = this.f1509s;
            if (i > i2 || i2 == mo1906I()) {
                int i3 = this.f1509s;
                f = (float) (i3 - i);
                f2 = (float) (this.f1481D - i3);
            } else {
                int i4 = this.f1509s;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo1906I());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f1484G.size(); i5++) {
                this.f1484G.get(i5).mo1922a(view, f3);
            }
        }
    }

    /* renamed from: G */
    public View mo1905G(View view) {
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT >= 21 ? view.isNestedScrollingEnabled() : view instanceof C0368d8 ? ((C0368d8) view).isNestedScrollingEnabled() : false) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View G = mo1905G(viewGroup.getChildAt(i));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    /* renamed from: I */
    public int mo1906I() {
        return this.f1492b ? this.f1506p : this.f1505o;
    }

    /* renamed from: J */
    public void mo1907J(boolean z) {
        if (this.f1511u != z) {
            this.f1511u = z;
            if (!z && this.f1514x == 5) {
                mo1909L(4);
            }
            mo1915R();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1908K(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f1495e
            if (r4 != 0) goto L_0x0015
            r3.f1495e = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f1495e
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f1494d
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f1495e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f1494d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.mo1918U(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1908K(int):void");
    }

    /* renamed from: L */
    public void mo1909L(int i) {
        if (i != this.f1514x) {
            if (this.f1482E != null) {
                mo1912O(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f1511u && i == 5)) {
                this.f1514x = i;
            }
        }
    }

    /* renamed from: M */
    public void mo1910M(int i) {
        View view;
        if (this.f1514x != i) {
            this.f1514x = i;
            WeakReference<V> weakReference = this.f1482E;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    mo1917T(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    mo1917T(false);
                }
                mo1916S(i);
                for (int i2 = 0; i2 < this.f1484G.size(); i2++) {
                    this.f1484G.get(i2).mo1923b(view, i);
                }
                mo1915R();
            }
        }
    }

    /* renamed from: N */
    public void mo1911N(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f1509s;
        } else if (i == 6) {
            int i4 = this.f1507q;
            if (!this.f1492b || i4 > (i3 = this.f1506p)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo1906I();
        } else if (!this.f1511u || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f1481D;
        }
        mo1914Q(view, i, i2, false);
    }

    /* renamed from: O */
    public final void mo1912O(int i) {
        View view = (View) this.f1482E.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0813m8.m2485s(view)) {
                mo1911N(view, i);
            } else {
                view.post(new C0299a(view, i));
            }
        }
    }

    /* renamed from: P */
    public boolean mo1913P(View view, float f) {
        if (this.f1512v) {
            return true;
        }
        if (view.getTop() < this.f1509s) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f1509s)) / ((float) mo1902D()) > 0.5f;
    }

    /* renamed from: Q */
    public void mo1914Q(View view, int i, int i2, boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f1515y.mo3996t(view.getLeft(), i2);
        } else {
            C0962p9 p9Var = this.f1515y;
            int left = view.getLeft();
            p9Var.f3600r = view;
            p9Var.f3585c = -1;
            z2 = p9Var.mo3988l(left, i2, 0, 0);
            if (!z2 && p9Var.f3583a == 0 && p9Var.f3600r != null) {
                p9Var.f3600r = null;
            }
        }
        if (z2) {
            mo1910M(2);
            mo1916S(i);
            if (this.f1503m == null) {
                this.f1503m = new C0305f(view, i);
            }
            BottomSheetBehavior<V>.C0440f fVar = this.f1503m;
            boolean z3 = fVar.f1529c;
            fVar.f1530d = i;
            if (!z3) {
                C0813m8.m2491y(view, fVar);
                this.f1503m.f1529c = true;
                return;
            }
            return;
        }
        mo1910M(i);
    }

    /* renamed from: R */
    public final void mo1915R() {
        View view;
        C1347x8.C1348a aVar;
        WeakReference<V> weakReference = this.f1482E;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C0813m8.m2452A(view, 524288);
            C0813m8.m2452A(view, 262144);
            C0813m8.m2452A(view, 1048576);
            if (this.f1511u && this.f1514x != 5) {
                mo1900B(view, C1347x8.C1348a.f5046j, 5);
            }
            int i = this.f1514x;
            int i2 = 6;
            if (i == 3) {
                if (this.f1492b) {
                    i2 = 4;
                }
                aVar = C1347x8.C1348a.f5045i;
            } else if (i == 4) {
                if (this.f1492b) {
                    i2 = 3;
                }
                aVar = C1347x8.C1348a.f5044h;
            } else if (i == 6) {
                mo1900B(view, C1347x8.C1348a.f5045i, 4);
                mo1900B(view, C1347x8.C1348a.f5044h, 3);
                return;
            } else {
                return;
            }
            mo1900B(view, aVar, i2);
        }
    }

    /* renamed from: S */
    public final void mo1916S(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f1502l != z) {
                this.f1502l = z;
                if (this.f1498h != null && (valueAnimator = this.f1504n) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f1504n.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f1504n.setFloatValues(new float[]{1.0f - f, f});
                    this.f1504n.start();
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo1917T(boolean z) {
        WeakReference<V> weakReference = this.f1482E;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f1489L == null) {
                        this.f1489L = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f1482E.get() && z && Build.VERSION.SDK_INT >= 16) {
                        this.f1489L.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.f1489L = null;
                }
            }
        }
    }

    /* renamed from: U */
    public final void mo1918U(boolean z) {
        View view;
        if (this.f1482E != null) {
            mo1901C();
            if (this.f1514x == 4 && (view = (View) this.f1482E.get()) != null) {
                if (z) {
                    mo1912O(this.f1514x);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: f */
    public void mo703f(CoordinatorLayout.C0091f fVar) {
        this.f1482E = null;
        this.f1515y = null;
    }

    /* renamed from: i */
    public void mo706i() {
        this.f1482E = null;
        this.f1515y = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117j(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r9.f1513w
            if (r0 != 0) goto L_0x000e
            goto L_0x00d8
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0021
            r9.f1486I = r4
            android.view.VelocityTracker r5 = r9.f1485H
            if (r5 == 0) goto L_0x0021
            r5.recycle()
            r9.f1485H = r3
        L_0x0021:
            android.view.VelocityTracker r5 = r9.f1485H
            if (r5 != 0) goto L_0x002b
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.f1485H = r5
        L_0x002b:
            android.view.VelocityTracker r5 = r9.f1485H
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0044
            if (r0 == r2) goto L_0x0039
            r11 = 3
            if (r0 == r11) goto L_0x0039
            goto L_0x0087
        L_0x0039:
            r9.f1488K = r1
            r9.f1486I = r4
            boolean r11 = r9.f1516z
            if (r11 == 0) goto L_0x0087
            r9.f1516z = r1
            return r1
        L_0x0044:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f1487J = r7
            int r7 = r9.f1514x
            if (r7 == r5) goto L_0x0076
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f1483F
            if (r7 == 0) goto L_0x005f
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            if (r7 == 0) goto L_0x0076
            int r8 = r9.f1487J
            boolean r7 = r10.mo677p(r7, r6, r8)
            if (r7 == 0) goto L_0x0076
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f1486I = r7
            r9.f1488K = r2
        L_0x0076:
            int r7 = r9.f1486I
            if (r7 != r4) goto L_0x0084
            int r4 = r9.f1487J
            boolean r11 = r10.mo677p(r11, r6, r4)
            if (r11 != 0) goto L_0x0084
            r11 = 1
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            r9.f1516z = r11
        L_0x0087:
            boolean r11 = r9.f1516z
            if (r11 != 0) goto L_0x0096
            p9 r11 = r9.f1515y
            if (r11 == 0) goto L_0x0096
            boolean r11 = r11.mo3997u(r12)
            if (r11 == 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f1483F
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a1:
            if (r0 != r5) goto L_0x00d7
            if (r3 == 0) goto L_0x00d7
            boolean r11 = r9.f1516z
            if (r11 != 0) goto L_0x00d7
            int r11 = r9.f1514x
            if (r11 == r2) goto L_0x00d7
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo677p(r3, r11, r0)
            if (r10 != 0) goto L_0x00d7
            p9 r10 = r9.f1515y
            if (r10 == 0) goto L_0x00d7
            int r10 = r9.f1487J
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            p9 r11 = r9.f1515y
            int r11 = r11.f3584b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d7
            r1 = 1
        L_0x00d7:
            return r1
        L_0x00d8:
            r9.f1516z = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo117j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: k */
    public boolean mo707k(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C1067rl rlVar;
        if (C0813m8.m2476j(coordinatorLayout) && !C0813m8.m2476j(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f1482E == null) {
            this.f1496f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && !this.f1500j && !this.f1495e) {
                C0813m8.m2463L(v, new C1374xk(new C0832mi(this), new C0030al(C0813m8.m2482p(v), v.getPaddingTop(), C0813m8.m2481o(v), v.getPaddingBottom())));
                if (C0813m8.m2485s(v)) {
                    C0813m8.m2455D(v);
                } else {
                    v.addOnAttachStateChangeListener(new C1421yk());
                }
            }
            this.f1482E = new WeakReference<>(v);
            if (this.f1497g && (rlVar = this.f1498h) != null) {
                if (i3 >= 16) {
                    v.setBackground(rlVar);
                } else {
                    v.setBackgroundDrawable(rlVar);
                }
            }
            C1067rl rlVar2 = this.f1498h;
            if (rlVar2 != null) {
                float f = this.f1510t;
                if (f == -1.0f) {
                    f = C0813m8.m2474h(v);
                }
                rlVar2.mo4297o(f);
                boolean z = this.f1514x == 3;
                this.f1502l = z;
                this.f1498h.mo4301q(z ? 0.0f : 1.0f);
            }
            mo1915R();
            if (C0813m8.m2477k(v) == 0) {
                C0813m8.m2462K(v, 1);
            }
        }
        if (this.f1515y == null) {
            this.f1515y = new C0962p9(coordinatorLayout.getContext(), coordinatorLayout, this.f1490M);
        }
        int top = v.getTop();
        coordinatorLayout.mo679r(v, i);
        this.f1480C = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f1481D = height;
        this.f1506p = Math.max(0, height - v.getHeight());
        this.f1507q = (int) ((1.0f - this.f1508r) * ((float) this.f1481D));
        mo1901C();
        int i4 = this.f1514x;
        if (i4 == 3) {
            i2 = mo1906I();
        } else if (i4 == 6) {
            i2 = this.f1507q;
        } else if (this.f1511u && i4 == 5) {
            i2 = this.f1481D;
        } else if (i4 == 4) {
            i2 = this.f1509s;
        } else {
            if (i4 == 1 || i4 == 2) {
                C0813m8.m2489w(v, top - v.getTop());
            }
            this.f1483F = new WeakReference<>(mo1905G(v));
            return true;
        }
        C0813m8.m2489w(v, i2);
        this.f1483F = new WeakReference<>(mo1905G(v));
        return true;
    }

    /* renamed from: n */
    public boolean mo710n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f1483F;
        return (weakReference == null || view != weakReference.get() || this.f1514x == 3) ? false : true;
    }

    /* renamed from: p */
    public void mo712p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f1483F;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f1509s;
                        if (i5 > i6 && !this.f1511u) {
                            iArr[1] = top - i6;
                            C0813m8.m2489w(v, -iArr[1]);
                            i4 = 4;
                        } else if (this.f1513w) {
                            iArr[1] = i2;
                            C0813m8.m2489w(v, -i2);
                            mo1910M(1);
                        } else {
                            return;
                        }
                    }
                    mo1904F(v.getTop());
                    this.f1478A = i2;
                    this.f1479B = true;
                } else if (i5 < mo1906I()) {
                    iArr[1] = top - mo1906I();
                    C0813m8.m2489w(v, -iArr[1]);
                    i4 = 3;
                } else if (this.f1513w) {
                    iArr[1] = i2;
                    C0813m8.m2489w(v, -i2);
                    mo1910M(1);
                    mo1904F(v.getTop());
                    this.f1478A = i2;
                    this.f1479B = true;
                } else {
                    return;
                }
                mo1910M(i4);
                mo1904F(v.getTop());
                this.f1478A = i2;
                this.f1479B = true;
            }
        }
    }

    /* renamed from: r */
    public void mo714r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: u */
    public void mo717u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0303e eVar = (C0303e) parcelable;
        int i = this.f1491a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1494d = eVar.f1524e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1492b = eVar.f1525f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1511u = eVar.f1526g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1512v = eVar.f1527h;
            }
        }
        int i2 = eVar.f1523d;
        if (i2 == 1 || i2 == 2) {
            this.f1514x = 4;
        } else {
            this.f1514x = i2;
        }
    }

    /* renamed from: v */
    public Parcelable mo718v(CoordinatorLayout coordinatorLayout, V v) {
        return new C0303e((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    /* renamed from: x */
    public boolean mo720x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f1478A = 0;
        this.f1479B = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 > r4) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (java.lang.Math.abs(r2 - r1.f1506p) < java.lang.Math.abs(r2 - r1.f1509s)) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.f1509s)) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        r2 = r1.f1505o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.f1509s)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        if (java.lang.Math.abs(r2 - r1.f1507q) < java.lang.Math.abs(r2 - r1.f1509s)) goto L_0x00b0;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo722z(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.mo1906I()
            r0 = 3
            if (r2 != r5) goto L_0x000f
            r1.mo1910M(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.f1483F
            if (r2 == 0) goto L_0x00be
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto L_0x00be
            boolean r2 = r1.f1479B
            if (r2 != 0) goto L_0x001f
            goto L_0x00be
        L_0x001f:
            int r2 = r1.f1478A
            if (r2 <= 0) goto L_0x0032
            boolean r2 = r1.f1492b
            if (r2 == 0) goto L_0x0028
            goto L_0x0072
        L_0x0028:
            int r2 = r3.getTop()
            int r4 = r1.f1507q
            if (r2 <= r4) goto L_0x0083
            goto L_0x00b2
        L_0x0032:
            boolean r2 = r1.f1511u
            if (r2 == 0) goto L_0x0055
            android.view.VelocityTracker r2 = r1.f1485H
            if (r2 != 0) goto L_0x003c
            r2 = 0
            goto L_0x004b
        L_0x003c:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f1493c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.f1485H
            int r4 = r1.f1486I
            float r2 = r2.getYVelocity(r4)
        L_0x004b:
            boolean r2 = r1.mo1913P(r3, r2)
            if (r2 == 0) goto L_0x0055
            int r2 = r1.f1481D
            r0 = 5
            goto L_0x00b8
        L_0x0055:
            int r2 = r1.f1478A
            if (r2 != 0) goto L_0x0096
            int r2 = r3.getTop()
            boolean r4 = r1.f1492b
            if (r4 == 0) goto L_0x0075
            int r4 = r1.f1506p
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f1509s
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00b5
        L_0x0072:
            int r2 = r1.f1506p
            goto L_0x00b8
        L_0x0075:
            int r4 = r1.f1507q
            if (r2 >= r4) goto L_0x0086
            int r4 = r1.f1509s
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto L_0x00b0
        L_0x0083:
            int r2 = r1.f1505o
            goto L_0x00b8
        L_0x0086:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f1509s
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00b5
            goto L_0x00b0
        L_0x0096:
            boolean r2 = r1.f1492b
            if (r2 == 0) goto L_0x009b
            goto L_0x00b5
        L_0x009b:
            int r2 = r3.getTop()
            int r4 = r1.f1507q
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f1509s
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00b5
        L_0x00b0:
            int r4 = r1.f1507q
        L_0x00b2:
            r0 = 6
            r2 = r4
            goto L_0x00b8
        L_0x00b5:
            int r2 = r1.f1509s
            r0 = 4
        L_0x00b8:
            r4 = 0
            r1.mo1914Q(r3, r0, r2, r4)
            r1.f1479B = r4
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo722z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }
}
