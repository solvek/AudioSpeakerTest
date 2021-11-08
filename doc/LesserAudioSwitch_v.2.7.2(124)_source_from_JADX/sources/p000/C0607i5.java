package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000.C0664j5;

/* renamed from: i5 */
public class C0607i5 {

    /* renamed from: b */
    public static final int[] f2546b = {0, 4, 8};

    /* renamed from: c */
    public static SparseIntArray f2547c;

    /* renamed from: a */
    public HashMap<Integer, C0608a> f2548a = new HashMap<>();

    /* renamed from: i5$a */
    public static class C0608a {

        /* renamed from: A */
        public int f2549A = -1;

        /* renamed from: B */
        public int f2550B = -1;

        /* renamed from: C */
        public int f2551C = -1;

        /* renamed from: D */
        public int f2552D = -1;

        /* renamed from: E */
        public int f2553E = -1;

        /* renamed from: F */
        public int f2554F = -1;

        /* renamed from: G */
        public int f2555G = -1;

        /* renamed from: H */
        public int f2556H = -1;

        /* renamed from: I */
        public int f2557I = -1;

        /* renamed from: J */
        public int f2558J = 0;

        /* renamed from: K */
        public int f2559K = -1;

        /* renamed from: L */
        public int f2560L = -1;

        /* renamed from: M */
        public int f2561M = -1;

        /* renamed from: N */
        public int f2562N = -1;

        /* renamed from: O */
        public int f2563O = -1;

        /* renamed from: P */
        public int f2564P = -1;

        /* renamed from: Q */
        public float f2565Q = 0.0f;

        /* renamed from: R */
        public float f2566R = 0.0f;

        /* renamed from: S */
        public int f2567S = 0;

        /* renamed from: T */
        public int f2568T = 0;

        /* renamed from: U */
        public float f2569U = 1.0f;

        /* renamed from: V */
        public boolean f2570V = false;

        /* renamed from: W */
        public float f2571W = 0.0f;

        /* renamed from: X */
        public float f2572X = 0.0f;

        /* renamed from: Y */
        public float f2573Y = 0.0f;

        /* renamed from: Z */
        public float f2574Z = 0.0f;

        /* renamed from: a */
        public boolean f2575a = false;

        /* renamed from: a0 */
        public float f2576a0 = 1.0f;

        /* renamed from: b */
        public int f2577b;

        /* renamed from: b0 */
        public float f2578b0 = 1.0f;

        /* renamed from: c */
        public int f2579c;

        /* renamed from: c0 */
        public float f2580c0 = Float.NaN;

        /* renamed from: d */
        public int f2581d;

        /* renamed from: d0 */
        public float f2582d0 = Float.NaN;

        /* renamed from: e */
        public int f2583e = -1;

        /* renamed from: e0 */
        public float f2584e0 = 0.0f;

        /* renamed from: f */
        public int f2585f = -1;

        /* renamed from: f0 */
        public float f2586f0 = 0.0f;

        /* renamed from: g */
        public float f2587g = -1.0f;

        /* renamed from: g0 */
        public float f2588g0 = 0.0f;

        /* renamed from: h */
        public int f2589h = -1;

        /* renamed from: h0 */
        public boolean f2590h0 = false;

        /* renamed from: i */
        public int f2591i = -1;

        /* renamed from: i0 */
        public boolean f2592i0 = false;

        /* renamed from: j */
        public int f2593j = -1;

        /* renamed from: j0 */
        public int f2594j0 = 0;

        /* renamed from: k */
        public int f2595k = -1;

        /* renamed from: k0 */
        public int f2596k0 = 0;

        /* renamed from: l */
        public int f2597l = -1;

        /* renamed from: l0 */
        public int f2598l0 = -1;

        /* renamed from: m */
        public int f2599m = -1;

        /* renamed from: m0 */
        public int f2600m0 = -1;

        /* renamed from: n */
        public int f2601n = -1;

        /* renamed from: n0 */
        public int f2602n0 = -1;

        /* renamed from: o */
        public int f2603o = -1;

        /* renamed from: o0 */
        public int f2604o0 = -1;

        /* renamed from: p */
        public int f2605p = -1;

        /* renamed from: p0 */
        public float f2606p0 = 1.0f;

        /* renamed from: q */
        public int f2607q = -1;

        /* renamed from: q0 */
        public float f2608q0 = 1.0f;

        /* renamed from: r */
        public int f2609r = -1;

        /* renamed from: r0 */
        public boolean f2610r0 = false;

        /* renamed from: s */
        public int f2611s = -1;

        /* renamed from: s0 */
        public int f2612s0 = -1;

        /* renamed from: t */
        public int f2613t = -1;

        /* renamed from: t0 */
        public int f2614t0 = -1;

        /* renamed from: u */
        public float f2615u = 0.5f;

        /* renamed from: u0 */
        public int[] f2616u0;

        /* renamed from: v */
        public float f2617v = 0.5f;

        /* renamed from: v0 */
        public String f2618v0;

        /* renamed from: w */
        public String f2619w = null;

        /* renamed from: x */
        public int f2620x = -1;

        /* renamed from: y */
        public int f2621y = 0;

        /* renamed from: z */
        public float f2622z = 0.0f;

        /* renamed from: a */
        public void mo3184a(ConstraintLayout.C0084a aVar) {
            aVar.f552d = this.f2589h;
            aVar.f554e = this.f2591i;
            aVar.f556f = this.f2593j;
            aVar.f558g = this.f2595k;
            aVar.f560h = this.f2597l;
            aVar.f562i = this.f2599m;
            aVar.f564j = this.f2601n;
            aVar.f566k = this.f2603o;
            aVar.f568l = this.f2605p;
            aVar.f572p = this.f2607q;
            aVar.f573q = this.f2609r;
            aVar.f574r = this.f2611s;
            aVar.f575s = this.f2613t;
            aVar.leftMargin = this.f2552D;
            aVar.rightMargin = this.f2553E;
            aVar.topMargin = this.f2554F;
            aVar.bottomMargin = this.f2555G;
            aVar.f580x = this.f2564P;
            aVar.f581y = this.f2563O;
            aVar.f582z = this.f2615u;
            aVar.f520A = this.f2617v;
            aVar.f569m = this.f2620x;
            aVar.f570n = this.f2621y;
            aVar.f571o = this.f2622z;
            aVar.f521B = this.f2619w;
            aVar.f535P = this.f2549A;
            aVar.f536Q = this.f2550B;
            aVar.f524E = this.f2565Q;
            aVar.f523D = this.f2566R;
            aVar.f526G = this.f2568T;
            aVar.f525F = this.f2567S;
            aVar.f538S = this.f2590h0;
            aVar.f539T = this.f2592i0;
            aVar.f527H = this.f2594j0;
            aVar.f528I = this.f2596k0;
            aVar.f531L = this.f2598l0;
            aVar.f532M = this.f2600m0;
            aVar.f529J = this.f2602n0;
            aVar.f530K = this.f2604o0;
            aVar.f533N = this.f2606p0;
            aVar.f534O = this.f2608q0;
            aVar.f537R = this.f2551C;
            aVar.f550c = this.f2587g;
            aVar.f546a = this.f2583e;
            aVar.f548b = this.f2585f;
            aVar.width = this.f2577b;
            aVar.height = this.f2579c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f2557I);
                aVar.setMarginEnd(this.f2556H);
            }
            aVar.mo646a();
        }

        /* renamed from: b */
        public final void mo3185b(int i, C0664j5.C0665a aVar) {
            this.f2581d = i;
            this.f2589h = aVar.f552d;
            this.f2591i = aVar.f554e;
            this.f2593j = aVar.f556f;
            this.f2595k = aVar.f558g;
            this.f2597l = aVar.f560h;
            this.f2599m = aVar.f562i;
            this.f2601n = aVar.f564j;
            this.f2603o = aVar.f566k;
            this.f2605p = aVar.f568l;
            this.f2607q = aVar.f572p;
            this.f2609r = aVar.f573q;
            this.f2611s = aVar.f574r;
            this.f2613t = aVar.f575s;
            this.f2615u = aVar.f582z;
            this.f2617v = aVar.f520A;
            this.f2619w = aVar.f521B;
            this.f2620x = aVar.f569m;
            this.f2621y = aVar.f570n;
            this.f2622z = aVar.f571o;
            this.f2549A = aVar.f535P;
            this.f2550B = aVar.f536Q;
            this.f2551C = aVar.f537R;
            this.f2587g = aVar.f550c;
            this.f2583e = aVar.f546a;
            this.f2585f = aVar.f548b;
            this.f2577b = aVar.width;
            this.f2579c = aVar.height;
            this.f2552D = aVar.leftMargin;
            this.f2553E = aVar.rightMargin;
            this.f2554F = aVar.topMargin;
            this.f2555G = aVar.bottomMargin;
            this.f2565Q = aVar.f524E;
            this.f2566R = aVar.f523D;
            this.f2568T = aVar.f526G;
            this.f2567S = aVar.f525F;
            boolean z = aVar.f538S;
            this.f2590h0 = z;
            this.f2592i0 = aVar.f539T;
            this.f2594j0 = aVar.f527H;
            this.f2596k0 = aVar.f528I;
            this.f2590h0 = z;
            this.f2598l0 = aVar.f531L;
            this.f2600m0 = aVar.f532M;
            this.f2602n0 = aVar.f529J;
            this.f2604o0 = aVar.f530K;
            this.f2606p0 = aVar.f533N;
            this.f2608q0 = aVar.f534O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f2556H = aVar.getMarginEnd();
                this.f2557I = aVar.getMarginStart();
            }
            this.f2569U = aVar.f2829l0;
            this.f2572X = aVar.f2832o0;
            this.f2573Y = aVar.f2833p0;
            this.f2574Z = aVar.f2834q0;
            this.f2576a0 = aVar.f2835r0;
            this.f2578b0 = aVar.f2836s0;
            this.f2580c0 = aVar.f2837t0;
            this.f2582d0 = aVar.f2838u0;
            this.f2584e0 = aVar.f2839v0;
            this.f2586f0 = aVar.f2840w0;
            this.f2588g0 = 0.0f;
            this.f2571W = aVar.f2831n0;
            this.f2570V = aVar.f2830m0;
        }

        public Object clone() {
            C0608a aVar = new C0608a();
            aVar.f2575a = this.f2575a;
            aVar.f2577b = this.f2577b;
            aVar.f2579c = this.f2579c;
            aVar.f2583e = this.f2583e;
            aVar.f2585f = this.f2585f;
            aVar.f2587g = this.f2587g;
            aVar.f2589h = this.f2589h;
            aVar.f2591i = this.f2591i;
            aVar.f2593j = this.f2593j;
            aVar.f2595k = this.f2595k;
            aVar.f2597l = this.f2597l;
            aVar.f2599m = this.f2599m;
            aVar.f2601n = this.f2601n;
            aVar.f2603o = this.f2603o;
            aVar.f2605p = this.f2605p;
            aVar.f2607q = this.f2607q;
            aVar.f2609r = this.f2609r;
            aVar.f2611s = this.f2611s;
            aVar.f2613t = this.f2613t;
            aVar.f2615u = this.f2615u;
            aVar.f2617v = this.f2617v;
            aVar.f2619w = this.f2619w;
            aVar.f2549A = this.f2549A;
            aVar.f2550B = this.f2550B;
            aVar.f2615u = this.f2615u;
            aVar.f2615u = this.f2615u;
            aVar.f2615u = this.f2615u;
            aVar.f2615u = this.f2615u;
            aVar.f2615u = this.f2615u;
            aVar.f2551C = this.f2551C;
            aVar.f2552D = this.f2552D;
            aVar.f2553E = this.f2553E;
            aVar.f2554F = this.f2554F;
            aVar.f2555G = this.f2555G;
            aVar.f2556H = this.f2556H;
            aVar.f2557I = this.f2557I;
            aVar.f2558J = this.f2558J;
            aVar.f2559K = this.f2559K;
            aVar.f2560L = this.f2560L;
            aVar.f2561M = this.f2561M;
            aVar.f2562N = this.f2562N;
            aVar.f2563O = this.f2563O;
            aVar.f2564P = this.f2564P;
            aVar.f2565Q = this.f2565Q;
            aVar.f2566R = this.f2566R;
            aVar.f2567S = this.f2567S;
            aVar.f2568T = this.f2568T;
            aVar.f2569U = this.f2569U;
            aVar.f2570V = this.f2570V;
            aVar.f2571W = this.f2571W;
            aVar.f2572X = this.f2572X;
            aVar.f2573Y = this.f2573Y;
            aVar.f2574Z = this.f2574Z;
            aVar.f2576a0 = this.f2576a0;
            aVar.f2578b0 = this.f2578b0;
            aVar.f2580c0 = this.f2580c0;
            aVar.f2582d0 = this.f2582d0;
            aVar.f2584e0 = this.f2584e0;
            aVar.f2586f0 = this.f2586f0;
            aVar.f2588g0 = this.f2588g0;
            aVar.f2590h0 = this.f2590h0;
            aVar.f2592i0 = this.f2592i0;
            aVar.f2594j0 = this.f2594j0;
            aVar.f2596k0 = this.f2596k0;
            aVar.f2598l0 = this.f2598l0;
            aVar.f2600m0 = this.f2600m0;
            aVar.f2602n0 = this.f2602n0;
            aVar.f2604o0 = this.f2604o0;
            aVar.f2606p0 = this.f2606p0;
            aVar.f2608q0 = this.f2608q0;
            aVar.f2612s0 = this.f2612s0;
            aVar.f2614t0 = this.f2614t0;
            int[] iArr = this.f2616u0;
            if (iArr != null) {
                aVar.f2616u0 = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.f2620x = this.f2620x;
            aVar.f2621y = this.f2621y;
            aVar.f2622z = this.f2622z;
            aVar.f2610r0 = this.f2610r0;
            return aVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2547c = sparseIntArray;
        sparseIntArray.append(55, 25);
        f2547c.append(56, 26);
        f2547c.append(58, 29);
        f2547c.append(59, 30);
        f2547c.append(64, 36);
        f2547c.append(63, 35);
        f2547c.append(37, 4);
        f2547c.append(36, 3);
        f2547c.append(34, 1);
        f2547c.append(72, 6);
        f2547c.append(73, 7);
        f2547c.append(44, 17);
        f2547c.append(45, 18);
        f2547c.append(46, 19);
        f2547c.append(0, 27);
        f2547c.append(60, 32);
        f2547c.append(61, 33);
        f2547c.append(43, 10);
        f2547c.append(42, 9);
        f2547c.append(76, 13);
        f2547c.append(79, 16);
        f2547c.append(77, 14);
        f2547c.append(74, 11);
        f2547c.append(78, 15);
        f2547c.append(75, 12);
        f2547c.append(67, 40);
        f2547c.append(53, 39);
        f2547c.append(52, 41);
        f2547c.append(66, 42);
        f2547c.append(51, 20);
        f2547c.append(65, 37);
        f2547c.append(41, 5);
        f2547c.append(54, 75);
        f2547c.append(62, 75);
        f2547c.append(57, 75);
        f2547c.append(35, 75);
        f2547c.append(33, 75);
        f2547c.append(5, 24);
        f2547c.append(7, 28);
        f2547c.append(23, 31);
        f2547c.append(24, 8);
        f2547c.append(6, 34);
        f2547c.append(8, 2);
        f2547c.append(3, 23);
        f2547c.append(4, 21);
        f2547c.append(2, 22);
        f2547c.append(13, 43);
        f2547c.append(26, 44);
        f2547c.append(21, 45);
        f2547c.append(22, 46);
        f2547c.append(20, 60);
        f2547c.append(18, 47);
        f2547c.append(19, 48);
        f2547c.append(14, 49);
        f2547c.append(15, 50);
        f2547c.append(16, 51);
        f2547c.append(17, 52);
        f2547c.append(25, 53);
        f2547c.append(68, 54);
        f2547c.append(47, 55);
        f2547c.append(69, 56);
        f2547c.append(48, 57);
        f2547c.append(70, 58);
        f2547c.append(49, 59);
        f2547c.append(38, 61);
        f2547c.append(40, 62);
        f2547c.append(39, 63);
        f2547c.append(1, 38);
        f2547c.append(71, 69);
        f2547c.append(50, 70);
        f2547c.append(29, 71);
        f2547c.append(28, 72);
        f2547c.append(30, 73);
        f2547c.append(27, 74);
    }

    /* renamed from: a */
    public final int[] mo3181a(View view, String str) {
        int i;
        Object b;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0805m5.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (b = ((ConstraintLayout) view.getParent()).mo615b(0, trim)) != null && (b instanceof Integer)) {
                i = ((Integer) b).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: b */
    public final C0608a mo3182b(Context context, AttributeSet attributeSet) {
        C0608a aVar = new C0608a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858n5.f3340b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = f2547c.get(index);
            switch (i2) {
                case 1:
                    int resourceId = obtainStyledAttributes.getResourceId(index, aVar.f2605p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2605p = resourceId;
                    break;
                case 2:
                    aVar.f2555G = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2555G);
                    break;
                case 3:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, aVar.f2603o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2603o = resourceId2;
                    break;
                case 4:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, aVar.f2601n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2601n = resourceId3;
                    break;
                case 5:
                    aVar.f2619w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    aVar.f2549A = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2549A);
                    break;
                case 7:
                    aVar.f2550B = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2550B);
                    break;
                case 8:
                    aVar.f2556H = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2556H);
                    break;
                case 9:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, aVar.f2613t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2613t = resourceId4;
                    break;
                case 10:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, aVar.f2611s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2611s = resourceId5;
                    break;
                case 11:
                    aVar.f2562N = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2562N);
                    break;
                case 12:
                    aVar.f2563O = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2563O);
                    break;
                case 13:
                    aVar.f2559K = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2559K);
                    break;
                case 14:
                    aVar.f2561M = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2561M);
                    break;
                case 15:
                    aVar.f2564P = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2564P);
                    break;
                case 16:
                    aVar.f2560L = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2560L);
                    break;
                case 17:
                    aVar.f2583e = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2583e);
                    break;
                case 18:
                    aVar.f2585f = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2585f);
                    break;
                case 19:
                    aVar.f2587g = obtainStyledAttributes.getFloat(index, aVar.f2587g);
                    break;
                case 20:
                    aVar.f2615u = obtainStyledAttributes.getFloat(index, aVar.f2615u);
                    break;
                case 21:
                    aVar.f2579c = obtainStyledAttributes.getLayoutDimension(index, aVar.f2579c);
                    break;
                case 22:
                    int i3 = obtainStyledAttributes.getInt(index, aVar.f2558J);
                    aVar.f2558J = i3;
                    aVar.f2558J = f2546b[i3];
                    break;
                case 23:
                    aVar.f2577b = obtainStyledAttributes.getLayoutDimension(index, aVar.f2577b);
                    break;
                case 24:
                    aVar.f2552D = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2552D);
                    break;
                case 25:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, aVar.f2589h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2589h = resourceId6;
                    break;
                case 26:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, aVar.f2591i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2591i = resourceId7;
                    break;
                case 27:
                    aVar.f2551C = obtainStyledAttributes.getInt(index, aVar.f2551C);
                    break;
                case 28:
                    aVar.f2553E = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2553E);
                    break;
                case 29:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, aVar.f2593j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2593j = resourceId8;
                    break;
                case 30:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, aVar.f2595k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2595k = resourceId9;
                    break;
                case 31:
                    aVar.f2557I = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2557I);
                    break;
                case 32:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, aVar.f2607q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2607q = resourceId10;
                    break;
                case 33:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, aVar.f2609r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2609r = resourceId11;
                    break;
                case 34:
                    aVar.f2554F = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2554F);
                    break;
                case 35:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, aVar.f2599m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2599m = resourceId12;
                    break;
                case 36:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, aVar.f2597l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2597l = resourceId13;
                    break;
                case 37:
                    aVar.f2617v = obtainStyledAttributes.getFloat(index, aVar.f2617v);
                    break;
                case 38:
                    aVar.f2581d = obtainStyledAttributes.getResourceId(index, aVar.f2581d);
                    break;
                case 39:
                    aVar.f2566R = obtainStyledAttributes.getFloat(index, aVar.f2566R);
                    break;
                case 40:
                    aVar.f2565Q = obtainStyledAttributes.getFloat(index, aVar.f2565Q);
                    break;
                case 41:
                    aVar.f2567S = obtainStyledAttributes.getInt(index, aVar.f2567S);
                    break;
                case 42:
                    aVar.f2568T = obtainStyledAttributes.getInt(index, aVar.f2568T);
                    break;
                case 43:
                    aVar.f2569U = obtainStyledAttributes.getFloat(index, aVar.f2569U);
                    break;
                case 44:
                    aVar.f2570V = true;
                    aVar.f2571W = obtainStyledAttributes.getDimension(index, aVar.f2571W);
                    break;
                case 45:
                    aVar.f2573Y = obtainStyledAttributes.getFloat(index, aVar.f2573Y);
                    break;
                case 46:
                    aVar.f2574Z = obtainStyledAttributes.getFloat(index, aVar.f2574Z);
                    break;
                case 47:
                    aVar.f2576a0 = obtainStyledAttributes.getFloat(index, aVar.f2576a0);
                    break;
                case 48:
                    aVar.f2578b0 = obtainStyledAttributes.getFloat(index, aVar.f2578b0);
                    break;
                case 49:
                    aVar.f2580c0 = obtainStyledAttributes.getFloat(index, aVar.f2580c0);
                    break;
                case 50:
                    aVar.f2582d0 = obtainStyledAttributes.getFloat(index, aVar.f2582d0);
                    break;
                case 51:
                    aVar.f2584e0 = obtainStyledAttributes.getDimension(index, aVar.f2584e0);
                    break;
                case 52:
                    aVar.f2586f0 = obtainStyledAttributes.getDimension(index, aVar.f2586f0);
                    break;
                case 53:
                    aVar.f2588g0 = obtainStyledAttributes.getDimension(index, aVar.f2588g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.f2572X = obtainStyledAttributes.getFloat(index, aVar.f2572X);
                            break;
                        case 61:
                            int resourceId14 = obtainStyledAttributes.getResourceId(index, aVar.f2620x);
                            if (resourceId14 == -1) {
                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                            }
                            aVar.f2620x = resourceId14;
                            break;
                        case 62:
                            aVar.f2621y = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f2621y);
                            break;
                        case 63:
                            aVar.f2622z = obtainStyledAttributes.getFloat(index, aVar.f2622z);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    aVar.f2606p0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    aVar.f2608q0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    aVar.f2612s0 = obtainStyledAttributes.getInt(index, aVar.f2612s0);
                                    break;
                                case 73:
                                    aVar.f2618v0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 74:
                                    aVar.f2610r0 = obtainStyledAttributes.getBoolean(index, aVar.f2610r0);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    f2547c.get(index);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: c */
    public void mo3183c(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0608a b = mo3182b(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        b.f2575a = true;
                    }
                    this.f2548a.put(Integer.valueOf(b.f2581d), b);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
