package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    public SparseArray<View> f505b = new SparseArray<>();

    /* renamed from: c */
    public ArrayList<C0557h5> f506c = new ArrayList<>(4);

    /* renamed from: d */
    public final ArrayList<C1236v4> f507d = new ArrayList<>(100);

    /* renamed from: e */
    public C1292w4 f508e = new C1292w4();

    /* renamed from: f */
    public int f509f = 0;

    /* renamed from: g */
    public int f510g = 0;

    /* renamed from: h */
    public int f511h = Integer.MAX_VALUE;

    /* renamed from: i */
    public int f512i = Integer.MAX_VALUE;

    /* renamed from: j */
    public boolean f513j = true;

    /* renamed from: k */
    public int f514k = 7;

    /* renamed from: l */
    public C0607i5 f515l = null;

    /* renamed from: m */
    public int f516m = -1;

    /* renamed from: n */
    public HashMap<String, Integer> f517n = new HashMap<>();

    /* renamed from: o */
    public int f518o = -1;

    /* renamed from: p */
    public int f519p = -1;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0084a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f520A = 0.5f;

        /* renamed from: B */
        public String f521B = null;

        /* renamed from: C */
        public int f522C = 1;

        /* renamed from: D */
        public float f523D = -1.0f;

        /* renamed from: E */
        public float f524E = -1.0f;

        /* renamed from: F */
        public int f525F = 0;

        /* renamed from: G */
        public int f526G = 0;

        /* renamed from: H */
        public int f527H = 0;

        /* renamed from: I */
        public int f528I = 0;

        /* renamed from: J */
        public int f529J = 0;

        /* renamed from: K */
        public int f530K = 0;

        /* renamed from: L */
        public int f531L = 0;

        /* renamed from: M */
        public int f532M = 0;

        /* renamed from: N */
        public float f533N = 1.0f;

        /* renamed from: O */
        public float f534O = 1.0f;

        /* renamed from: P */
        public int f535P = -1;

        /* renamed from: Q */
        public int f536Q = -1;

        /* renamed from: R */
        public int f537R = -1;

        /* renamed from: S */
        public boolean f538S = false;

        /* renamed from: T */
        public boolean f539T = false;

        /* renamed from: U */
        public boolean f540U = true;

        /* renamed from: V */
        public boolean f541V = true;

        /* renamed from: W */
        public boolean f542W = false;

        /* renamed from: X */
        public boolean f543X = false;

        /* renamed from: Y */
        public boolean f544Y = false;

        /* renamed from: Z */
        public boolean f545Z = false;

        /* renamed from: a */
        public int f546a = -1;

        /* renamed from: a0 */
        public int f547a0 = -1;

        /* renamed from: b */
        public int f548b = -1;

        /* renamed from: b0 */
        public int f549b0 = -1;

        /* renamed from: c */
        public float f550c = -1.0f;

        /* renamed from: c0 */
        public int f551c0 = -1;

        /* renamed from: d */
        public int f552d = -1;

        /* renamed from: d0 */
        public int f553d0 = -1;

        /* renamed from: e */
        public int f554e = -1;

        /* renamed from: e0 */
        public int f555e0 = -1;

        /* renamed from: f */
        public int f556f = -1;

        /* renamed from: f0 */
        public int f557f0 = -1;

        /* renamed from: g */
        public int f558g = -1;

        /* renamed from: g0 */
        public float f559g0 = 0.5f;

        /* renamed from: h */
        public int f560h = -1;

        /* renamed from: h0 */
        public int f561h0;

        /* renamed from: i */
        public int f562i = -1;

        /* renamed from: i0 */
        public int f563i0;

        /* renamed from: j */
        public int f564j = -1;

        /* renamed from: j0 */
        public float f565j0;

        /* renamed from: k */
        public int f566k = -1;

        /* renamed from: k0 */
        public C1236v4 f567k0 = new C1236v4();

        /* renamed from: l */
        public int f568l = -1;

        /* renamed from: m */
        public int f569m = -1;

        /* renamed from: n */
        public int f570n = 0;

        /* renamed from: o */
        public float f571o = 0.0f;

        /* renamed from: p */
        public int f572p = -1;

        /* renamed from: q */
        public int f573q = -1;

        /* renamed from: r */
        public int f574r = -1;

        /* renamed from: s */
        public int f575s = -1;

        /* renamed from: t */
        public int f576t = -1;

        /* renamed from: u */
        public int f577u = -1;

        /* renamed from: v */
        public int f578v = -1;

        /* renamed from: w */
        public int f579w = -1;

        /* renamed from: x */
        public int f580x = -1;

        /* renamed from: y */
        public int f581y = -1;

        /* renamed from: z */
        public float f582z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class C0085a {

            /* renamed from: a */
            public static final SparseIntArray f583a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f583a = sparseIntArray;
                sparseIntArray.append(34, 8);
                sparseIntArray.append(35, 9);
                sparseIntArray.append(37, 10);
                sparseIntArray.append(38, 11);
                sparseIntArray.append(43, 12);
                sparseIntArray.append(42, 13);
                sparseIntArray.append(16, 14);
                sparseIntArray.append(15, 15);
                sparseIntArray.append(13, 16);
                sparseIntArray.append(17, 2);
                sparseIntArray.append(19, 3);
                sparseIntArray.append(18, 4);
                sparseIntArray.append(51, 49);
                sparseIntArray.append(52, 50);
                sparseIntArray.append(23, 5);
                sparseIntArray.append(24, 6);
                sparseIntArray.append(25, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(39, 17);
                sparseIntArray.append(40, 18);
                sparseIntArray.append(22, 19);
                sparseIntArray.append(21, 20);
                sparseIntArray.append(55, 21);
                sparseIntArray.append(58, 22);
                sparseIntArray.append(56, 23);
                sparseIntArray.append(53, 24);
                sparseIntArray.append(57, 25);
                sparseIntArray.append(54, 26);
                sparseIntArray.append(30, 29);
                sparseIntArray.append(44, 30);
                sparseIntArray.append(20, 44);
                sparseIntArray.append(32, 45);
                sparseIntArray.append(46, 46);
                sparseIntArray.append(31, 47);
                sparseIntArray.append(45, 48);
                sparseIntArray.append(11, 27);
                sparseIntArray.append(10, 28);
                sparseIntArray.append(47, 31);
                sparseIntArray.append(26, 32);
                sparseIntArray.append(49, 33);
                sparseIntArray.append(48, 34);
                sparseIntArray.append(50, 35);
                sparseIntArray.append(28, 36);
                sparseIntArray.append(27, 37);
                sparseIntArray.append(29, 38);
                sparseIntArray.append(33, 39);
                sparseIntArray.append(41, 40);
                sparseIntArray.append(36, 41);
                sparseIntArray.append(14, 42);
                sparseIntArray.append(12, 43);
            }
        }

        public C0084a(int i, int i2) {
            super(i, i2);
        }

        public C0084a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858n5.f3339a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0085a.f583a.get(index);
                switch (i3) {
                    case 1:
                        this.f537R = obtainStyledAttributes.getInt(index, this.f537R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f569m);
                        this.f569m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f569m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f570n = obtainStyledAttributes.getDimensionPixelSize(index, this.f570n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f571o) % 360.0f;
                        this.f571o = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f571o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f546a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f546a);
                        break;
                    case 6:
                        this.f548b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f548b);
                        break;
                    case 7:
                        this.f550c = obtainStyledAttributes.getFloat(index, this.f550c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f552d);
                        this.f552d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f552d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f554e);
                        this.f554e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f554e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f556f);
                        this.f556f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f556f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f558g);
                        this.f558g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f558g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f560h);
                        this.f560h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f560h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f562i);
                        this.f562i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f562i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f564j);
                        this.f564j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f564j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f566k);
                        this.f566k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f566k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f568l);
                        this.f568l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f568l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f572p);
                        this.f572p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f572p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f573q);
                        this.f573q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f573q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f574r);
                        this.f574r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f574r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f575s);
                        this.f575s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f575s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f576t = obtainStyledAttributes.getDimensionPixelSize(index, this.f576t);
                        break;
                    case 22:
                        this.f577u = obtainStyledAttributes.getDimensionPixelSize(index, this.f577u);
                        break;
                    case 23:
                        this.f578v = obtainStyledAttributes.getDimensionPixelSize(index, this.f578v);
                        break;
                    case 24:
                        this.f579w = obtainStyledAttributes.getDimensionPixelSize(index, this.f579w);
                        break;
                    case 25:
                        this.f580x = obtainStyledAttributes.getDimensionPixelSize(index, this.f580x);
                        break;
                    case 26:
                        this.f581y = obtainStyledAttributes.getDimensionPixelSize(index, this.f581y);
                        break;
                    case 27:
                        this.f538S = obtainStyledAttributes.getBoolean(index, this.f538S);
                        break;
                    case 28:
                        this.f539T = obtainStyledAttributes.getBoolean(index, this.f539T);
                        break;
                    case 29:
                        this.f582z = obtainStyledAttributes.getFloat(index, this.f582z);
                        break;
                    case 30:
                        this.f520A = obtainStyledAttributes.getFloat(index, this.f520A);
                        break;
                    case 31:
                        this.f527H = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f528I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f529J = obtainStyledAttributes.getDimensionPixelSize(index, this.f529J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f529J) != -2) {
                                break;
                            } else {
                                this.f529J = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f531L = obtainStyledAttributes.getDimensionPixelSize(index, this.f531L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f531L) != -2) {
                                break;
                            } else {
                                this.f531L = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f533N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f533N));
                        break;
                    case 36:
                        try {
                            this.f530K = obtainStyledAttributes.getDimensionPixelSize(index, this.f530K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f530K) != -2) {
                                break;
                            } else {
                                this.f530K = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f532M = obtainStyledAttributes.getDimensionPixelSize(index, this.f532M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f532M) != -2) {
                                break;
                            } else {
                                this.f532M = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f534O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f534O));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f521B = string;
                                this.f522C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.f521B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f521B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f522C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f522C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f521B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f521B.substring(i, indexOf2);
                                        String substring3 = this.f521B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f522C != 1) {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f521B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f523D = obtainStyledAttributes.getFloat(index, this.f523D);
                                break;
                            case 46:
                                this.f524E = obtainStyledAttributes.getFloat(index, this.f524E);
                                break;
                            case 47:
                                this.f525F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f526G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f535P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f535P);
                                break;
                            case 50:
                                this.f536Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f536Q);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo646a();
        }

        public C0084a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo646a() {
            this.f543X = false;
            this.f540U = true;
            this.f541V = true;
            int i = this.width;
            if (i == -2 && this.f538S) {
                this.f540U = false;
                this.f527H = 1;
            }
            int i2 = this.height;
            if (i2 == -2 && this.f539T) {
                this.f541V = false;
                this.f528I = 1;
            }
            if (i == 0 || i == -1) {
                this.f540U = false;
                if (i == 0 && this.f527H == 1) {
                    this.width = -2;
                    this.f538S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f541V = false;
                if (i2 == 0 && this.f528I == 1) {
                    this.height = -2;
                    this.f539T = true;
                }
            }
            if (this.f550c != -1.0f || this.f546a != -1 || this.f548b != -1) {
                this.f543X = true;
                this.f540U = true;
                this.f541V = true;
                if (!(this.f567k0 instanceof C1398y4)) {
                    this.f567k0 = new C1398y4();
                }
                ((C1398y4) this.f567k0).mo5183F(this.f537R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.f551c0 = r7
                r6.f553d0 = r7
                r6.f547a0 = r7
                r6.f549b0 = r7
                r6.f555e0 = r7
                r6.f557f0 = r7
                int r2 = r6.f576t
                r6.f555e0 = r2
                int r2 = r6.f578v
                r6.f557f0 = r2
                float r2 = r6.f582z
                r6.f559g0 = r2
                int r2 = r6.f546a
                r6.f561h0 = r2
                int r2 = r6.f548b
                r6.f563i0 = r2
                float r2 = r6.f550c
                r6.f565j0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x0098
                int r2 = r6.f572p
                if (r2 == r7) goto L_0x0041
                r6.f551c0 = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.f573q
                if (r2 == r7) goto L_0x0048
                r6.f553d0 = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.f574r
                if (r2 == r7) goto L_0x004f
                r6.f549b0 = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.f575s
                if (r2 == r7) goto L_0x0056
                r6.f547a0 = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.f580x
                if (r2 == r7) goto L_0x005c
                r6.f557f0 = r2
            L_0x005c:
                int r2 = r6.f581y
                if (r2 == r7) goto L_0x0062
                r6.f555e0 = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.f582z
                float r3 = r2 - r3
                r6.f559g0 = r3
            L_0x006c:
                boolean r3 = r6.f543X
                if (r3 == 0) goto L_0x00bc
                int r3 = r6.f537R
                if (r3 != r4) goto L_0x00bc
                float r3 = r6.f550c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.f565j0 = r2
                r6.f561h0 = r7
                r6.f563i0 = r7
                goto L_0x00bc
            L_0x0084:
                int r2 = r6.f546a
                if (r2 == r7) goto L_0x008f
                r6.f563i0 = r2
                r6.f561h0 = r7
            L_0x008c:
                r6.f565j0 = r4
                goto L_0x00bc
            L_0x008f:
                int r2 = r6.f548b
                if (r2 == r7) goto L_0x00bc
                r6.f561h0 = r2
                r6.f563i0 = r7
                goto L_0x008c
            L_0x0098:
                int r2 = r6.f572p
                if (r2 == r7) goto L_0x009e
                r6.f549b0 = r2
            L_0x009e:
                int r2 = r6.f573q
                if (r2 == r7) goto L_0x00a4
                r6.f547a0 = r2
            L_0x00a4:
                int r2 = r6.f574r
                if (r2 == r7) goto L_0x00aa
                r6.f551c0 = r2
            L_0x00aa:
                int r2 = r6.f575s
                if (r2 == r7) goto L_0x00b0
                r6.f553d0 = r2
            L_0x00b0:
                int r2 = r6.f580x
                if (r2 == r7) goto L_0x00b6
                r6.f555e0 = r2
            L_0x00b6:
                int r2 = r6.f581y
                if (r2 == r7) goto L_0x00bc
                r6.f557f0 = r2
            L_0x00bc:
                int r2 = r6.f574r
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f575s
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f573q
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f572p
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f556f
                if (r2 == r7) goto L_0x00db
                r6.f551c0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
            L_0x00d8:
                r6.rightMargin = r1
                goto L_0x00e8
            L_0x00db:
                int r2 = r6.f558g
                if (r2 == r7) goto L_0x00e8
                r6.f553d0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
                goto L_0x00d8
            L_0x00e8:
                int r1 = r6.f552d
                if (r1 == r7) goto L_0x00f7
                r6.f547a0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
            L_0x00f4:
                r6.leftMargin = r0
                goto L_0x0104
            L_0x00f7:
                int r1 = r6.f554e
                if (r1 == r7) goto L_0x0104
                r6.f549b0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                goto L_0x00f4
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0084a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f508e.f4726X = this;
        this.f505b.put(getId(), this);
        this.f515l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0858n5.f3339a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f509f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f509f);
                } else if (index == 4) {
                    this.f510g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f510g);
                } else if (index == 1) {
                    this.f511h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f511h);
                } else if (index == 2) {
                    this.f512i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f512i);
                } else if (index == 59) {
                    this.f514k = obtainStyledAttributes.getInt(index, this.f514k);
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0607i5 i5Var = new C0607i5();
                        this.f515l = i5Var;
                        i5Var.mo3183c(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f515l = null;
                    }
                    this.f516m = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f508e.f4912w0 = this.f514k;
    }

    /* renamed from: a */
    public C0084a generateDefaultLayoutParams() {
        return new C0084a(-2, -2);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public Object mo615b(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f517n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f517n.get(str);
    }

    /* renamed from: c */
    public final C1236v4 mo616c(int i) {
        if (i == 0) {
            return this.f508e;
        }
        View view = this.f505b.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f508e;
        }
        if (view == null) {
            return null;
        }
        return ((C0084a) view.getLayoutParams()).f567k0;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0084a;
    }

    /* renamed from: d */
    public final C1236v4 mo618d(View view) {
        if (view == this) {
            return this.f508e;
        }
        if (view == null) {
            return null;
        }
        return ((C0084a) view.getLayoutParams()).f567k0;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i2;
                        float f2 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i3;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        r5 = r9.f541V;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo620e(int r20, int r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            int r2 = r19.getPaddingTop()
            int r3 = r19.getPaddingBottom()
            int r3 = r3 + r2
            int r2 = r19.getPaddingLeft()
            int r4 = r19.getPaddingRight()
            int r4 = r4 + r2
            int r2 = r19.getChildCount()
            r6 = 0
        L_0x001b:
            r7 = r19
            if (r6 >= r2) goto L_0x00d5
            android.view.View r8 = r7.getChildAt(r6)
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x002d
            goto L_0x00d1
        L_0x002d:
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r9 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r9
            v4 r10 = r9.f567k0
            boolean r11 = r9.f543X
            if (r11 != 0) goto L_0x00d1
            boolean r11 = r9.f544Y
            if (r11 == 0) goto L_0x003f
            goto L_0x00d1
        L_0x003f:
            int r11 = r8.getVisibility()
            r10.f4727Y = r11
            int r11 = r9.width
            int r12 = r9.height
            boolean r13 = r9.f540U
            r14 = -1
            r15 = 1
            if (r13 != 0) goto L_0x0066
            boolean r5 = r9.f541V
            if (r5 != 0) goto L_0x0066
            if (r13 != 0) goto L_0x0059
            int r13 = r9.f527H
            if (r13 == r15) goto L_0x0066
        L_0x0059:
            if (r11 == r14) goto L_0x0066
            if (r5 != 0) goto L_0x0064
            int r5 = r9.f528I
            if (r5 == r15) goto L_0x0066
            if (r12 != r14) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r5 = 0
            goto L_0x0067
        L_0x0066:
            r5 = 1
        L_0x0067:
            if (r5 == 0) goto L_0x00b3
            r5 = -2
            if (r11 != 0) goto L_0x0073
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r0, r4, r5)
            r16 = 1
            goto L_0x008b
        L_0x0073:
            if (r11 != r14) goto L_0x007c
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r0, r4, r14)
            r16 = 0
            goto L_0x008b
        L_0x007c:
            if (r11 != r5) goto L_0x0080
            r13 = 1
            goto L_0x0081
        L_0x0080:
            r13 = 0
        L_0x0081:
            int r16 = android.view.ViewGroup.getChildMeasureSpec(r0, r4, r11)
            r18 = r16
            r16 = r13
            r13 = r18
        L_0x008b:
            if (r12 != 0) goto L_0x0094
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r1, r3, r5)
        L_0x0091:
            r14 = r17
            goto L_0x00a7
        L_0x0094:
            if (r12 != r14) goto L_0x009e
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r1, r3, r14)
            r14 = r17
            r15 = 0
            goto L_0x00a7
        L_0x009e:
            if (r12 != r5) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r15 = 0
        L_0x00a2:
            int r17 = android.view.ViewGroup.getChildMeasureSpec(r1, r3, r12)
            goto L_0x0091
        L_0x00a7:
            r8.measure(r13, r14)
            int r11 = r8.getMeasuredWidth()
            int r12 = r8.getMeasuredHeight()
            goto L_0x00b6
        L_0x00b3:
            r15 = 0
            r16 = 0
        L_0x00b6:
            r10.mo4813C(r11)
            r10.mo4831w(r12)
            if (r16 == 0) goto L_0x00c0
            r10.f4722T = r11
        L_0x00c0:
            if (r15 == 0) goto L_0x00c4
            r10.f4723U = r12
        L_0x00c4:
            boolean r5 = r9.f542W
            if (r5 == 0) goto L_0x00d1
            int r5 = r8.getBaseline()
            r8 = -1
            if (r5 == r8) goto L_0x00d1
            r10.f4719Q = r5
        L_0x00d1:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo620e(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02a8  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo621f(int r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            v4$a r3 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            int r4 = r25.getPaddingTop()
            int r5 = r25.getPaddingBottom()
            int r5 = r5 + r4
            int r4 = r25.getPaddingLeft()
            int r6 = r25.getPaddingRight()
            int r6 = r6 + r4
            int r4 = r25.getChildCount()
            r8 = 0
        L_0x001f:
            r9 = 8
            r10 = -1
            r11 = -2
            if (r8 >= r4) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = r13.getVisibility()
            if (r14 != r9) goto L_0x0031
            goto L_0x00b2
        L_0x0031:
            android.view.ViewGroup$LayoutParams r9 = r13.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r9 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r9
            v4 r14 = r9.f567k0
            boolean r15 = r9.f543X
            if (r15 != 0) goto L_0x00b2
            boolean r15 = r9.f544Y
            if (r15 == 0) goto L_0x0043
            goto L_0x00b2
        L_0x0043:
            int r15 = r13.getVisibility()
            r14.f4727Y = r15
            int r15 = r9.width
            int r12 = r9.height
            if (r15 == 0) goto L_0x00a4
            if (r12 != 0) goto L_0x0052
            goto L_0x00a4
        L_0x0052:
            if (r15 != r11) goto L_0x0057
            r17 = 1
            goto L_0x0059
        L_0x0057:
            r17 = 0
        L_0x0059:
            int r15 = android.view.ViewGroup.getChildMeasureSpec(r1, r6, r15)
            if (r12 != r11) goto L_0x0062
            r16 = 1
            goto L_0x0064
        L_0x0062:
            r16 = 0
        L_0x0064:
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r12)
            r13.measure(r15, r11)
            int r11 = r13.getMeasuredWidth()
            int r12 = r13.getMeasuredHeight()
            r14.mo4813C(r11)
            r14.mo4831w(r12)
            if (r17 == 0) goto L_0x007d
            r14.f4722T = r11
        L_0x007d:
            if (r16 == 0) goto L_0x0081
            r14.f4723U = r12
        L_0x0081:
            boolean r15 = r9.f542W
            if (r15 == 0) goto L_0x008d
            int r13 = r13.getBaseline()
            if (r13 == r10) goto L_0x008d
            r14.f4719Q = r13
        L_0x008d:
            boolean r10 = r9.f540U
            if (r10 == 0) goto L_0x00b2
            boolean r9 = r9.f541V
            if (r9 == 0) goto L_0x00b2
            c5 r9 = r14.mo4823l()
            r9.mo1696e(r11)
            c5 r9 = r14.mo4822k()
            r9.mo1696e(r12)
            goto L_0x00b2
        L_0x00a4:
            c5 r9 = r14.mo4823l()
            r9.mo2637b()
            c5 r9 = r14.mo4822k()
            r9.mo2637b()
        L_0x00b2:
            int r8 = r8 + 1
            goto L_0x001f
        L_0x00b6:
            w4 r8 = r0.f508e
            r8.mo4963L()
            r8 = 0
        L_0x00bc:
            if (r8 >= r4) goto L_0x02c5
            android.view.View r12 = r0.getChildAt(r8)
            int r13 = r12.getVisibility()
            if (r13 != r9) goto L_0x00ca
            goto L_0x02aa
        L_0x00ca:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r13
            v4 r14 = r13.f567k0
            boolean r15 = r13.f543X
            if (r15 != 0) goto L_0x02aa
            boolean r15 = r13.f544Y
            if (r15 == 0) goto L_0x00dc
            goto L_0x02aa
        L_0x00dc:
            int r15 = r12.getVisibility()
            r14.f4727Y = r15
            int r15 = r13.width
            int r9 = r13.height
            if (r15 == 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00ec
            goto L_0x02aa
        L_0x00ec:
            u4$b r10 = p000.C1196u4.C1198b.LEFT
            u4 r11 = r14.mo4817f(r10)
            b5 r11 = r11.f4581a
            u4$b r7 = p000.C1196u4.C1198b.RIGHT
            r19 = r4
            u4 r4 = r14.mo4817f(r7)
            b5 r4 = r4.f4581a
            u4 r10 = r14.mo4817f(r10)
            u4 r10 = r10.f4584d
            if (r10 == 0) goto L_0x0110
            u4 r7 = r14.mo4817f(r7)
            u4 r7 = r7.f4584d
            if (r7 == 0) goto L_0x0110
            r7 = 1
            goto L_0x0111
        L_0x0110:
            r7 = 0
        L_0x0111:
            u4$b r10 = p000.C1196u4.C1198b.TOP
            r20 = r8
            u4 r8 = r14.mo4817f(r10)
            b5 r8 = r8.f4581a
            r21 = r13
            u4$b r13 = p000.C1196u4.C1198b.BOTTOM
            r22 = r12
            u4 r12 = r14.mo4817f(r13)
            b5 r12 = r12.f4581a
            u4 r10 = r14.mo4817f(r10)
            u4 r10 = r10.f4584d
            if (r10 == 0) goto L_0x0139
            u4 r10 = r14.mo4817f(r13)
            u4 r10 = r10.f4584d
            if (r10 == 0) goto L_0x0139
            r10 = 1
            goto L_0x013a
        L_0x0139:
            r10 = 0
        L_0x013a:
            if (r15 != 0) goto L_0x014b
            if (r9 != 0) goto L_0x014b
            if (r7 == 0) goto L_0x014b
            if (r10 == 0) goto L_0x014b
            r8 = r2
            r10 = r5
            r4 = -1
            r5 = -2
            r11 = 1
            r18 = 0
            goto L_0x02b5
        L_0x014b:
            w4 r13 = r0.f508e
            v4$a r13 = r13.mo4820i()
            v4$a r2 = p000.C1236v4.C1237a.WRAP_CONTENT
            r23 = r5
            if (r13 == r2) goto L_0x0159
            r13 = 1
            goto L_0x015a
        L_0x0159:
            r13 = 0
        L_0x015a:
            w4 r5 = r0.f508e
            v4$a r5 = r5.mo4824m()
            if (r5 == r2) goto L_0x0164
            r2 = 1
            goto L_0x0165
        L_0x0164:
            r2 = 0
        L_0x0165:
            if (r13 != 0) goto L_0x016e
            c5 r5 = r14.mo4823l()
            r5.mo2637b()
        L_0x016e:
            if (r2 != 0) goto L_0x0177
            c5 r5 = r14.mo4822k()
            r5.mo2637b()
        L_0x0177:
            r5 = 0
            if (r15 != 0) goto L_0x01c9
            if (r13 == 0) goto L_0x01bf
            int r15 = r14.f4737e
            if (r15 != 0) goto L_0x0198
            float r15 = r14.f4709G
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x0198
            int r15 = r14.f4743h
            if (r15 != 0) goto L_0x0198
            int r15 = r14.f4745i
            if (r15 != 0) goto L_0x0198
            v4$a[] r15 = r14.f4705C
            r18 = 0
            r15 = r15[r18]
            if (r15 != r3) goto L_0x019a
            r15 = 1
            goto L_0x019b
        L_0x0198:
            r18 = 0
        L_0x019a:
            r15 = 0
        L_0x019b:
            if (r15 == 0) goto L_0x01c1
            if (r7 == 0) goto L_0x01c1
            boolean r7 = r11.mo2638c()
            if (r7 == 0) goto L_0x01c1
            boolean r7 = r4.mo2638c()
            if (r7 == 0) goto L_0x01c1
            float r4 = r4.f1242g
            float r7 = r11.f1242g
            float r4 = r4 - r7
            int r4 = (int) r4
            c5 r7 = r14.mo4823l()
            r7.mo1696e(r4)
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r1, r6, r4)
            r11 = r4
            r4 = -2
            goto L_0x01d3
        L_0x01bf:
            r18 = 0
        L_0x01c1:
            r4 = -2
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r1, r6, r4)
            r4 = 1
            r13 = 0
            goto L_0x01df
        L_0x01c9:
            r4 = -2
            r7 = -1
            r18 = 0
            if (r15 != r7) goto L_0x01d6
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r6, r7)
        L_0x01d3:
            r7 = r11
            r4 = 0
            goto L_0x01df
        L_0x01d6:
            if (r15 != r4) goto L_0x01da
            r4 = 1
            goto L_0x01db
        L_0x01da:
            r4 = 0
        L_0x01db:
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r1, r6, r15)
        L_0x01df:
            if (r9 != 0) goto L_0x023c
            if (r2 == 0) goto L_0x022d
            int r9 = r14.f4739f
            if (r9 != 0) goto L_0x01fe
            float r9 = r14.f4709G
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01fe
            int r5 = r14.f4747k
            if (r5 != 0) goto L_0x01fe
            int r5 = r14.f4748l
            if (r5 != 0) goto L_0x01fe
            v4$a[] r5 = r14.f4705C
            r11 = 1
            r5 = r5[r11]
            if (r5 != r3) goto L_0x01ff
            r5 = 1
            goto L_0x0200
        L_0x01fe:
            r11 = 1
        L_0x01ff:
            r5 = 0
        L_0x0200:
            if (r5 == 0) goto L_0x0228
            if (r10 == 0) goto L_0x0228
            boolean r5 = r8.mo2638c()
            if (r5 == 0) goto L_0x0228
            boolean r5 = r12.mo2638c()
            if (r5 == 0) goto L_0x0228
            float r5 = r12.f1242g
            float r8 = r8.f1242g
            float r5 = r5 - r8
            int r5 = (int) r5
            c5 r8 = r14.mo4822k()
            r8.mo1696e(r5)
            r8 = r27
            r10 = r23
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r8, r10, r5)
            r9 = r5
            r5 = -2
            goto L_0x0249
        L_0x0228:
            r8 = r27
            r10 = r23
            goto L_0x0232
        L_0x022d:
            r8 = r27
            r10 = r23
            r11 = 1
        L_0x0232:
            r5 = -2
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r8, r10, r5)
            r15 = r22
            r9 = 0
            r12 = 1
            goto L_0x025e
        L_0x023c:
            r8 = r27
            r10 = r23
            r5 = -2
            r11 = 1
            r12 = -1
            if (r9 != r12) goto L_0x0252
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r8, r10, r12)
        L_0x0249:
            r15 = r22
            r12 = 0
        L_0x024c:
            r24 = r9
            r9 = r2
            r2 = r24
            goto L_0x025e
        L_0x0252:
            if (r9 != r5) goto L_0x0256
            r12 = 1
            goto L_0x0257
        L_0x0256:
            r12 = 0
        L_0x0257:
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r8, r10, r9)
            r15 = r22
            goto L_0x024c
        L_0x025e:
            r15.measure(r7, r2)
            int r2 = r15.getMeasuredWidth()
            int r7 = r15.getMeasuredHeight()
            r14.mo4813C(r2)
            r14.mo4831w(r7)
            if (r4 == 0) goto L_0x0273
            r14.f4722T = r2
        L_0x0273:
            if (r12 == 0) goto L_0x0277
            r14.f4723U = r7
        L_0x0277:
            r4 = 2
            if (r13 == 0) goto L_0x0282
            c5 r12 = r14.mo4823l()
            r12.mo1696e(r2)
            goto L_0x0288
        L_0x0282:
            c5 r2 = r14.mo4823l()
            r2.f1879b = r4
        L_0x0288:
            if (r9 == 0) goto L_0x0292
            c5 r2 = r14.mo4822k()
            r2.mo1696e(r7)
            goto L_0x0298
        L_0x0292:
            c5 r2 = r14.mo4822k()
            r2.f1879b = r4
        L_0x0298:
            r13 = r21
            boolean r2 = r13.f542W
            if (r2 == 0) goto L_0x02a8
            int r2 = r15.getBaseline()
            r4 = -1
            if (r2 == r4) goto L_0x02b5
            r14.f4719Q = r2
            goto L_0x02b5
        L_0x02a8:
            r4 = -1
            goto L_0x02b5
        L_0x02aa:
            r19 = r4
            r10 = r5
            r20 = r8
            r4 = -1
            r5 = -2
            r11 = 1
            r18 = 0
            r8 = r2
        L_0x02b5:
            int r2 = r20 + 1
            r5 = r10
            r4 = r19
            r9 = 8
            r10 = -1
            r11 = -2
            r24 = r8
            r8 = r2
            r2 = r24
            goto L_0x00bc
        L_0x02c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo621f(int, int):void");
    }

    /* renamed from: g */
    public void mo622g(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f517n == null) {
                this.f517n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f517n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0084a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0084a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f512i;
    }

    public int getMaxWidth() {
        return this.f511h;
    }

    public int getMinHeight() {
        return this.f510g;
    }

    public int getMinWidth() {
        return this.f509f;
    }

    public int getOptimizationLevel() {
        return this.f508e.f4912w0;
    }

    /* renamed from: h */
    public void mo631h() {
        this.f508e.mo2763F();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0084a aVar = (C0084a) childAt.getLayoutParams();
            C1236v4 v4Var = aVar.f567k0;
            if ((childAt.getVisibility() != 8 || aVar.f543X || aVar.f544Y || isInEditMode) && !aVar.f545Z) {
                int i6 = v4Var.f4715M + v4Var.f4717O;
                int i7 = v4Var.f4716N + v4Var.f4718P;
                int n = v4Var.mo4825n() + i6;
                int h = v4Var.mo4819h() + i7;
                childAt.layout(i6, i7, n, h);
                if ((childAt instanceof C0756l5) && (content = ((C0756l5) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(i6, i7, n, h);
                }
            }
        }
        int size = this.f506c.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f506c.get(i8).mo3041c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:253:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x06ca  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x06ec  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x07b4  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0923  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0973  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x097b  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0992  */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0b8d  */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x0bc6  */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0bcb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r51, int r52) {
        /*
            r50 = this;
            r0 = r50
            r1 = r51
            r2 = r52
            u4$b r9 = p000.C1196u4.C1198b.BOTTOM
            u4$b r10 = p000.C1196u4.C1198b.RIGHT
            v4$a r11 = p000.C1236v4.C1237a.WRAP_CONTENT
            v4$a r12 = p000.C1236v4.C1237a.FIXED
            java.lang.System.currentTimeMillis()
            int r13 = android.view.View.MeasureSpec.getMode(r51)
            int r14 = android.view.View.MeasureSpec.getSize(r51)
            int r15 = android.view.View.MeasureSpec.getMode(r52)
            int r8 = android.view.View.MeasureSpec.getSize(r52)
            int r7 = r50.getPaddingLeft()
            int r6 = r50.getPaddingTop()
            w4 r3 = r0.f508e
            r3.f4711I = r7
            r3.f4712J = r6
            int r4 = r0.f511h
            int[] r5 = r3.f4753q
            r2 = 0
            r5[r2] = r4
            int r4 = r0.f512i
            r2 = 1
            r5[r2] = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x004c
            int r4 = r50.getLayoutDirection()
            if (r4 != r2) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            r3.f4899j0 = r4
        L_0x004c:
            int r3 = android.view.View.MeasureSpec.getMode(r51)
            int r4 = android.view.View.MeasureSpec.getSize(r51)
            int r5 = android.view.View.MeasureSpec.getMode(r52)
            int r2 = android.view.View.MeasureSpec.getSize(r52)
            int r17 = r50.getPaddingTop()
            int r18 = r50.getPaddingBottom()
            int r18 = r18 + r17
            int r17 = r50.getPaddingLeft()
            int r19 = r50.getPaddingRight()
            int r19 = r19 + r17
            r50.getLayoutParams()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = r15
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x008f
            if (r3 == 0) goto L_0x008c
            if (r3 == r15) goto L_0x0081
            r3 = r12
            goto L_0x008d
        L_0x0081:
            int r3 = r0.f511h
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = r3 - r19
            r4 = r3
            r3 = r12
            goto L_0x0090
        L_0x008c:
            r3 = r11
        L_0x008d:
            r4 = 0
            goto L_0x0090
        L_0x008f:
            r3 = r11
        L_0x0090:
            if (r5 == r1) goto L_0x00a6
            if (r5 == 0) goto L_0x00a3
            if (r5 == r15) goto L_0x0098
            r2 = r12
            goto L_0x00a4
        L_0x0098:
            int r5 = r0.f512i
            int r2 = java.lang.Math.min(r5, r2)
            int r2 = r2 - r18
            r5 = r2
            r2 = r12
            goto L_0x00a8
        L_0x00a3:
            r2 = r11
        L_0x00a4:
            r5 = 0
            goto L_0x00a8
        L_0x00a6:
            r5 = r2
            r2 = r11
        L_0x00a8:
            w4 r15 = r0.f508e
            r1 = 0
            r15.f4720R = r1
            r15.f4721S = r1
            r15.mo4833y(r3)
            w4 r1 = r0.f508e
            r1.mo4813C(r4)
            w4 r1 = r0.f508e
            r1.mo4812B(r2)
            w4 r1 = r0.f508e
            r1.mo4831w(r5)
            w4 r1 = r0.f508e
            int r2 = r0.f509f
            int r3 = r50.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r50.getPaddingRight()
            int r2 = r2 - r3
            if (r2 >= 0) goto L_0x00d2
            r2 = 0
        L_0x00d2:
            r1.f4720R = r2
            w4 r1 = r0.f508e
            int r2 = r0.f510g
            int r3 = r50.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r50.getPaddingBottom()
            int r2 = r2 - r3
            if (r2 >= 0) goto L_0x00e5
            r2 = 0
        L_0x00e5:
            r1.f4721S = r2
            w4 r1 = r0.f508e
            int r1 = r1.mo4825n()
            w4 r2 = r0.f508e
            int r2 = r2.mo4819h()
            boolean r3 = r0.f513j
            if (r3 == 0) goto L_0x0833
            r3 = 0
            r0.f513j = r3
            int r3 = r50.getChildCount()
            r4 = 0
        L_0x00ff:
            if (r4 >= r3) goto L_0x0110
            android.view.View r20 = r0.getChildAt(r4)
            boolean r20 = r20.isLayoutRequested()
            if (r20 == 0) goto L_0x010d
            r3 = 1
            goto L_0x0111
        L_0x010d:
            int r4 = r4 + 1
            goto L_0x00ff
        L_0x0110:
            r3 = 0
        L_0x0111:
            if (r3 == 0) goto L_0x081f
            java.util.ArrayList<v4> r3 = r0.f507d
            r3.clear()
            v4$a r4 = p000.C1236v4.C1237a.MATCH_PARENT
            v4$a r3 = p000.C1236v4.C1237a.MATCH_CONSTRAINT
            u4$b r15 = p000.C1196u4.C1198b.LEFT
            u4$b r5 = p000.C1196u4.C1198b.TOP
            boolean r27 = r50.isInEditMode()
            r28 = r14
            int r14 = r50.getChildCount()
            r29 = r3
            if (r27 == 0) goto L_0x017a
            r3 = 0
        L_0x012f:
            if (r3 >= r14) goto L_0x017a
            android.view.View r20 = r0.getChildAt(r3)
            r30 = r4
            android.content.res.Resources r4 = r50.getResources()     // Catch:{ NotFoundException -> 0x016d }
            r31 = r5
            int r5 = r20.getId()     // Catch:{ NotFoundException -> 0x016f }
            java.lang.String r4 = r4.getResourceName(r5)     // Catch:{ NotFoundException -> 0x016f }
            int r5 = r20.getId()     // Catch:{ NotFoundException -> 0x016f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x016f }
            r32 = r6
            r6 = 0
            r0.mo622g(r6, r4, r5)     // Catch:{ NotFoundException -> 0x0171 }
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch:{ NotFoundException -> 0x0171 }
            r6 = -1
            if (r5 == r6) goto L_0x0162
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch:{ NotFoundException -> 0x0171 }
        L_0x0162:
            int r5 = r20.getId()     // Catch:{ NotFoundException -> 0x0171 }
            v4 r5 = r0.mo616c(r5)     // Catch:{ NotFoundException -> 0x0171 }
            r5.f4728Z = r4     // Catch:{ NotFoundException -> 0x0171 }
            goto L_0x0171
        L_0x016d:
            r31 = r5
        L_0x016f:
            r32 = r6
        L_0x0171:
            int r3 = r3 + 1
            r4 = r30
            r5 = r31
            r6 = r32
            goto L_0x012f
        L_0x017a:
            r30 = r4
            r31 = r5
            r32 = r6
            r3 = 0
        L_0x0181:
            if (r3 >= r14) goto L_0x0194
            android.view.View r4 = r0.getChildAt(r3)
            v4 r4 = r0.mo618d(r4)
            if (r4 != 0) goto L_0x018e
            goto L_0x0191
        L_0x018e:
            r4.mo2764r()
        L_0x0191:
            int r3 = r3 + 1
            goto L_0x0181
        L_0x0194:
            int r3 = r0.f516m
            r4 = -1
            if (r3 == r4) goto L_0x01b7
            r3 = 0
        L_0x019a:
            if (r3 >= r14) goto L_0x01b7
            android.view.View r4 = r0.getChildAt(r3)
            int r5 = r4.getId()
            int r6 = r0.f516m
            if (r5 != r6) goto L_0x01b4
            boolean r5 = r4 instanceof p000.C0664j5
            if (r5 == 0) goto L_0x01b4
            j5 r4 = (p000.C0664j5) r4
            i5 r4 = r4.getConstraintSet()
            r0.f515l = r4
        L_0x01b4:
            int r3 = r3 + 1
            goto L_0x019a
        L_0x01b7:
            i5 r3 = r0.f515l
            if (r3 == 0) goto L_0x0342
            int r4 = r50.getChildCount()
            java.util.HashSet r5 = new java.util.HashSet
            java.util.HashMap<java.lang.Integer, i5$a> r6 = r3.f2548a
            java.util.Set r6 = r6.keySet()
            r5.<init>(r6)
            r6 = 0
        L_0x01cb:
            if (r6 >= r4) goto L_0x02c1
            r20 = r4
            android.view.View r4 = r0.getChildAt(r6)
            r33 = r7
            int r7 = r4.getId()
            r34 = r8
            r8 = -1
            if (r7 == r8) goto L_0x02b9
            java.util.HashMap<java.lang.Integer, i5$a> r8 = r3.f2548a
            r35 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r8 = r8.containsKey(r13)
            if (r8 == 0) goto L_0x02a5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.remove(r8)
            java.util.HashMap<java.lang.Integer, i5$a> r8 = r3.f2548a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r8.get(r13)
            i5$a r8 = (p000.C0607i5.C0608a) r8
            boolean r13 = r4 instanceof p000.C0519g5
            if (r13 == 0) goto L_0x0207
            r13 = 1
            r8.f2614t0 = r13
            goto L_0x0208
        L_0x0207:
            r13 = 1
        L_0x0208:
            r36 = r2
            int r2 = r8.f2614t0
            r37 = r1
            r1 = -1
            if (r2 == r1) goto L_0x0239
            if (r2 == r13) goto L_0x0214
            goto L_0x0239
        L_0x0214:
            r1 = r4
            g5 r1 = (p000.C0519g5) r1
            r1.setId(r7)
            int r2 = r8.f2612s0
            r1.setType(r2)
            boolean r2 = r8.f2610r0
            r1.setAllowsGoneWidget(r2)
            int[] r2 = r8.f2616u0
            if (r2 == 0) goto L_0x022c
            r1.setReferencedIds(r2)
            goto L_0x0239
        L_0x022c:
            java.lang.String r2 = r8.f2618v0
            if (r2 == 0) goto L_0x0239
            int[] r2 = r3.mo3181a(r1, r2)
            r8.f2616u0 = r2
            r1.setReferencedIds(r2)
        L_0x0239:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r1
            r8.mo3184a(r1)
            r4.setLayoutParams(r1)
            int r1 = r8.f2558J
            r4.setVisibility(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x02a9
            float r2 = r8.f2569U
            r4.setAlpha(r2)
            float r2 = r8.f2572X
            r4.setRotation(r2)
            float r2 = r8.f2573Y
            r4.setRotationX(r2)
            float r2 = r8.f2574Z
            r4.setRotationY(r2)
            float r2 = r8.f2576a0
            r4.setScaleX(r2)
            float r2 = r8.f2578b0
            r4.setScaleY(r2)
            float r2 = r8.f2580c0
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L_0x027b
            float r2 = r8.f2580c0
            r4.setPivotX(r2)
        L_0x027b:
            float r2 = r8.f2582d0
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L_0x0288
            float r2 = r8.f2582d0
            r4.setPivotY(r2)
        L_0x0288:
            float r2 = r8.f2584e0
            r4.setTranslationX(r2)
            float r2 = r8.f2586f0
            r4.setTranslationY(r2)
            r2 = 21
            if (r1 < r2) goto L_0x02a9
            float r1 = r8.f2588g0
            r4.setTranslationZ(r1)
            boolean r1 = r8.f2570V
            if (r1 == 0) goto L_0x02a9
            float r1 = r8.f2571W
            r4.setElevation(r1)
            goto L_0x02a9
        L_0x02a5:
            r37 = r1
            r36 = r2
        L_0x02a9:
            int r6 = r6 + 1
            r4 = r20
            r7 = r33
            r8 = r34
            r13 = r35
            r2 = r36
            r1 = r37
            goto L_0x01cb
        L_0x02b9:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r1.<init>(r2)
            throw r1
        L_0x02c1:
            r37 = r1
            r36 = r2
            r33 = r7
            r34 = r8
            r35 = r13
            java.util.Iterator r1 = r5.iterator()
        L_0x02cf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x034c
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.HashMap<java.lang.Integer, i5$a> r4 = r3.f2548a
            java.lang.Object r4 = r4.get(r2)
            i5$a r4 = (p000.C0607i5.C0608a) r4
            int r5 = r4.f2614t0
            r6 = -1
            if (r5 == r6) goto L_0x0323
            r6 = 1
            if (r5 == r6) goto L_0x02ec
            goto L_0x0323
        L_0x02ec:
            g5 r5 = new g5
            android.content.Context r6 = r50.getContext()
            r5.<init>(r6)
            int r6 = r2.intValue()
            r5.setId(r6)
            int[] r6 = r4.f2616u0
            if (r6 == 0) goto L_0x0304
            r5.setReferencedIds(r6)
            goto L_0x0311
        L_0x0304:
            java.lang.String r6 = r4.f2618v0
            if (r6 == 0) goto L_0x0311
            int[] r6 = r3.mo3181a(r5, r6)
            r4.f2616u0 = r6
            r5.setReferencedIds(r6)
        L_0x0311:
            int r6 = r4.f2612s0
            r5.setType(r6)
            androidx.constraintlayout.widget.ConstraintLayout$a r6 = r50.generateDefaultLayoutParams()
            r5.mo3044f()
            r4.mo3184a(r6)
            r0.addView(r5, r6)
        L_0x0323:
            boolean r5 = r4.f2575a
            if (r5 == 0) goto L_0x02cf
            k5 r5 = new k5
            android.content.Context r6 = r50.getContext()
            r5.<init>(r6)
            int r2 = r2.intValue()
            r5.setId(r2)
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = r50.generateDefaultLayoutParams()
            r4.mo3184a(r2)
            r0.addView(r5, r2)
            goto L_0x02cf
        L_0x0342:
            r37 = r1
            r36 = r2
            r33 = r7
            r34 = r8
            r35 = r13
        L_0x034c:
            w4 r1 = r0.f508e
            java.util.ArrayList<v4> r1 = r1.f2096i0
            r1.clear()
            java.util.ArrayList<h5> r1 = r0.f506c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x036c
            r2 = 0
        L_0x035c:
            if (r2 >= r1) goto L_0x036c
            java.util.ArrayList<h5> r3 = r0.f506c
            java.lang.Object r3 = r3.get(r2)
            h5 r3 = (p000.C0557h5) r3
            r3.mo3043e(r0)
            int r2 = r2 + 1
            goto L_0x035c
        L_0x036c:
            r1 = 0
        L_0x036d:
            if (r1 >= r14) goto L_0x03a8
            android.view.View r2 = r0.getChildAt(r1)
            boolean r3 = r2 instanceof p000.C0756l5
            if (r3 == 0) goto L_0x03a5
            l5 r2 = (p000.C0756l5) r2
            int r3 = r2.f3105b
            r4 = -1
            if (r3 != r4) goto L_0x0389
            boolean r3 = r2.isInEditMode()
            if (r3 != 0) goto L_0x0389
            int r3 = r2.f3107d
            r2.setVisibility(r3)
        L_0x0389:
            int r3 = r2.f3105b
            android.view.View r3 = r0.findViewById(r3)
            r2.f3106c = r3
            if (r3 == 0) goto L_0x03a5
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r3
            r4 = 1
            r3.f545Z = r4
            android.view.View r3 = r2.f3106c
            r4 = 0
            r3.setVisibility(r4)
            r2.setVisibility(r4)
        L_0x03a5:
            int r1 = r1 + 1
            goto L_0x036d
        L_0x03a8:
            r1 = 0
        L_0x03a9:
            if (r1 >= r14) goto L_0x0815
            android.view.View r2 = r0.getChildAt(r1)
            v4 r13 = r0.mo618d(r2)
            if (r13 != 0) goto L_0x03b7
            goto L_0x04b3
        L_0x03b7:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r8 = r3
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r8
            r8.mo646a()
            if (r27 == 0) goto L_0x03f3
            android.content.res.Resources r3 = r50.getResources()     // Catch:{ NotFoundException -> 0x03f2 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x03f2 }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x03f2 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x03f2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x03f2 }
            r5 = 0
            r0.mo622g(r5, r3, r4)     // Catch:{ NotFoundException -> 0x03f2 }
            java.lang.String r4 = "id/"
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x03f2 }
            int r4 = r4 + 3
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x03f2 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x03f2 }
            v4 r4 = r0.mo616c(r4)     // Catch:{ NotFoundException -> 0x03f2 }
            r4.f4728Z = r3     // Catch:{ NotFoundException -> 0x03f2 }
            goto L_0x03f3
        L_0x03f2:
        L_0x03f3:
            int r3 = r2.getVisibility()
            r13.f4727Y = r3
            boolean r3 = r8.f545Z
            if (r3 == 0) goto L_0x0401
            r3 = 8
            r13.f4727Y = r3
        L_0x0401:
            r13.f4726X = r2
            w4 r2 = r0.f508e
            java.util.ArrayList<v4> r3 = r2.f2096i0
            r3.add(r13)
            v4 r3 = r13.f4706D
            if (r3 == 0) goto L_0x0418
            f5 r3 = (p000.C0454f5) r3
            java.util.ArrayList<v4> r3 = r3.f2096i0
            r3.remove(r13)
            r3 = 0
            r13.f4706D = r3
        L_0x0418:
            r13.f4706D = r2
            boolean r2 = r8.f541V
            if (r2 == 0) goto L_0x0422
            boolean r2 = r8.f540U
            if (r2 != 0) goto L_0x0427
        L_0x0422:
            java.util.ArrayList<v4> r2 = r0.f507d
            r2.add(r13)
        L_0x0427:
            boolean r2 = r8.f543X
            if (r2 == 0) goto L_0x0469
            y4 r13 = (p000.C1398y4) r13
            int r2 = r8.f561h0
            int r3 = r8.f563i0
            float r4 = r8.f565j0
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 >= r6) goto L_0x043f
            int r2 = r8.f546a
            int r3 = r8.f548b
            float r4 = r8.f550c
        L_0x043f:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x0452
            int r2 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x04b3
            r13.f5157i0 = r4
            r4 = -1
            r13.f5158j0 = r4
            r13.f5159k0 = r4
            goto L_0x04b3
        L_0x0452:
            r4 = -1
            if (r2 == r4) goto L_0x045e
            if (r2 <= r4) goto L_0x04b3
            r13.f5157i0 = r5
            r13.f5158j0 = r2
            r13.f5159k0 = r4
            goto L_0x04b3
        L_0x045e:
            if (r3 == r4) goto L_0x04b3
            if (r3 <= r4) goto L_0x04b3
            r13.f5157i0 = r5
            r13.f5158j0 = r4
            r13.f5159k0 = r3
            goto L_0x04b3
        L_0x0469:
            r4 = -1
            int r2 = r8.f552d
            if (r2 != r4) goto L_0x04cd
            int r3 = r8.f554e
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f556f
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f558g
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f573q
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f572p
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f574r
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f575s
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f560h
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f562i
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f564j
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f566k
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f568l
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f535P
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f536Q
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.f569m
            if (r3 != r4) goto L_0x04cd
            int r3 = r8.width
            if (r3 == r4) goto L_0x04cd
            int r3 = r8.height
            if (r3 != r4) goto L_0x04b3
            goto L_0x04cd
        L_0x04b3:
            r39 = r11
            r4 = r12
            r38 = r14
            r2 = r30
            r3 = r31
            r26 = r32
            r32 = r33
            r41 = r34
            r12 = -1
            r16 = 17
            r49 = r29
            r29 = r1
            r1 = r49
            goto L_0x07ff
        L_0x04cd:
            int r3 = r8.f547a0
            int r4 = r8.f549b0
            int r5 = r8.f551c0
            int r6 = r8.f553d0
            int r7 = r8.f555e0
            r20 = r3
            int r3 = r8.f557f0
            r21 = r3
            float r3 = r8.f559g0
            r22 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r38 = r14
            r14 = 17
            if (r3 >= r14) goto L_0x052f
            int r3 = r8.f554e
            int r5 = r8.f556f
            int r4 = r8.f558g
            int r7 = r8.f576t
            int r6 = r8.f578v
            float r14 = r8.f582z
            r20 = r6
            r6 = -1
            if (r2 != r6) goto L_0x0509
            if (r3 != r6) goto L_0x0509
            r23 = r2
            int r2 = r8.f573q
            if (r2 == r6) goto L_0x0503
            goto L_0x050d
        L_0x0503:
            int r2 = r8.f572p
            if (r2 == r6) goto L_0x050b
            r3 = r2
            goto L_0x050b
        L_0x0509:
            r23 = r2
        L_0x050b:
            r2 = r23
        L_0x050d:
            if (r5 != r6) goto L_0x0526
            if (r4 != r6) goto L_0x0526
            r21 = r2
            int r2 = r8.f574r
            if (r2 == r6) goto L_0x0520
            r5 = r2
            r25 = r7
            r7 = r14
            r14 = r20
            r2 = r21
            goto L_0x053b
        L_0x0520:
            int r2 = r8.f575s
            if (r2 == r6) goto L_0x0528
            r6 = r2
            goto L_0x0529
        L_0x0526:
            r21 = r2
        L_0x0528:
            r6 = r4
        L_0x0529:
            r4 = r3
            r3 = r20
            r20 = r21
            goto L_0x0533
        L_0x052f:
            r3 = r21
            r14 = r22
        L_0x0533:
            r25 = r7
            r7 = r14
            r2 = r20
            r14 = r3
            r3 = r4
            r4 = r6
        L_0x053b:
            int r6 = r8.f569m
            r39 = r11
            r11 = -1
            if (r6 == r11) goto L_0x0572
            v4 r5 = r0.mo616c(r6)
            if (r5 == 0) goto L_0x0559
            float r2 = r8.f571o
            int r7 = r8.f570n
            u4$b r6 = p000.C1196u4.C1198b.CENTER
            r11 = 0
            r3 = r13
            r4 = r6
            r14 = r8
            r8 = r11
            r3.mo4826o(r4, r5, r6, r7, r8)
            r13.f4754r = r2
            goto L_0x055a
        L_0x0559:
            r14 = r8
        L_0x055a:
            r11 = r14
            r2 = r30
            r3 = r31
            r26 = r32
            r32 = r33
            r41 = r34
            r16 = 17
            r30 = r12
            r12 = -1
            r49 = r29
            r29 = r1
            r1 = r49
            goto L_0x06b6
        L_0x0572:
            r11 = r8
            r6 = -1
            if (r2 == r6) goto L_0x0585
            v4 r2 = r0.mo616c(r2)
            if (r2 == 0) goto L_0x059c
            int r3 = r11.leftMargin
            r22 = r2
            r24 = r3
            r23 = r15
            goto L_0x0595
        L_0x0585:
            if (r3 == r6) goto L_0x059c
            v4 r2 = r0.mo616c(r3)
            if (r2 == 0) goto L_0x059c
            int r3 = r11.leftMargin
            r22 = r2
            r24 = r3
            r23 = r10
        L_0x0595:
            r20 = r13
            r21 = r15
            r20.mo4826o(r21, r22, r23, r24, r25)
        L_0x059c:
            r2 = -1
            if (r5 == r2) goto L_0x05ab
            v4 r3 = r0.mo616c(r5)
            if (r3 == 0) goto L_0x05d4
            int r4 = r11.rightMargin
            r5 = r3
            r8 = r4
            r6 = r15
            goto L_0x05b8
        L_0x05ab:
            if (r4 == r2) goto L_0x05d4
            v4 r3 = r0.mo616c(r4)
            if (r3 == 0) goto L_0x05d4
            int r4 = r11.rightMargin
            r5 = r3
            r8 = r4
            r6 = r10
        L_0x05b8:
            r4 = r29
            r3 = r13
            r29 = r1
            r1 = r4
            r2 = r30
            r4 = r10
            r30 = r12
            r12 = -1
            r16 = 17
            r26 = r32
            r40 = r7
            r32 = r33
            r7 = r8
            r41 = r34
            r8 = r14
            r3.mo4826o(r4, r5, r6, r7, r8)
            goto L_0x05e9
        L_0x05d4:
            r40 = r7
            r2 = r30
            r26 = r32
            r32 = r33
            r41 = r34
            r16 = 17
            r30 = r12
            r12 = -1
            r49 = r29
            r29 = r1
            r1 = r49
        L_0x05e9:
            int r3 = r11.f560h
            if (r3 == r12) goto L_0x0600
            v4 r3 = r0.mo616c(r3)
            if (r3 == 0) goto L_0x061d
            int r4 = r11.topMargin
            int r5 = r11.f577u
            r22 = r3
            r24 = r4
            r25 = r5
            r23 = r31
            goto L_0x0616
        L_0x0600:
            int r3 = r11.f562i
            if (r3 == r12) goto L_0x061d
            v4 r3 = r0.mo616c(r3)
            if (r3 == 0) goto L_0x061d
            int r4 = r11.topMargin
            int r5 = r11.f577u
            r22 = r3
            r24 = r4
            r25 = r5
            r23 = r9
        L_0x0616:
            r20 = r13
            r21 = r31
            r20.mo4826o(r21, r22, r23, r24, r25)
        L_0x061d:
            int r3 = r11.f564j
            if (r3 == r12) goto L_0x0631
            v4 r3 = r0.mo616c(r3)
            if (r3 == 0) goto L_0x0648
            int r4 = r11.bottomMargin
            int r5 = r11.f579w
            r7 = r4
            r8 = r5
            r6 = r31
        L_0x062f:
            r5 = r3
            goto L_0x0643
        L_0x0631:
            int r3 = r11.f566k
            if (r3 == r12) goto L_0x0648
            v4 r3 = r0.mo616c(r3)
            if (r3 == 0) goto L_0x0648
            int r4 = r11.bottomMargin
            int r5 = r11.f579w
            r7 = r4
            r8 = r5
            r6 = r9
            goto L_0x062f
        L_0x0643:
            r3 = r13
            r4 = r9
            r3.mo4826o(r4, r5, r6, r7, r8)
        L_0x0648:
            int r3 = r11.f568l
            if (r3 == r12) goto L_0x0699
            android.util.SparseArray<android.view.View> r4 = r0.f505b
            java.lang.Object r3 = r4.get(r3)
            android.view.View r3 = (android.view.View) r3
            int r4 = r11.f568l
            v4 r4 = r0.mo616c(r4)
            if (r4 == 0) goto L_0x0699
            if (r3 == 0) goto L_0x0699
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            boolean r5 = r5 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0084a
            if (r5 == 0) goto L_0x0699
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r3
            r5 = 1
            r11.f542W = r5
            r3.f542W = r5
            u4$b r3 = p000.C1196u4.C1198b.BASELINE
            u4 r42 = r13.mo4817f(r3)
            u4 r43 = r4.mo4817f(r3)
            r44 = 0
            r45 = -1
            u4$a r46 = p000.C1196u4.C1197a.STRONG
            r47 = 0
            r48 = 1
            r42.mo4767a(r43, r44, r45, r46, r47, r48)
            r3 = r31
            u4 r4 = r13.mo4817f(r3)
            r4.mo4770d()
            u4 r4 = r13.mo4817f(r9)
            r4.mo4770d()
            goto L_0x069b
        L_0x0699:
            r3 = r31
        L_0x069b:
            r4 = 1056964608(0x3f000000, float:0.5)
            r14 = r40
            r5 = 0
            int r6 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x06aa
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x06aa
            r13.f4724V = r14
        L_0x06aa:
            float r6 = r11.f520A
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x06b6
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x06b6
            r13.f4725W = r6
        L_0x06b6:
            if (r27 == 0) goto L_0x06c6
            int r4 = r11.f535P
            if (r4 != r12) goto L_0x06c0
            int r5 = r11.f536Q
            if (r5 == r12) goto L_0x06c6
        L_0x06c0:
            int r5 = r11.f536Q
            r13.f4711I = r4
            r13.f4712J = r5
        L_0x06c6:
            boolean r4 = r11.f540U
            if (r4 != 0) goto L_0x06ec
            int r4 = r11.width
            if (r4 != r12) goto L_0x06e2
            r13.mo4833y(r2)
            u4 r4 = r13.mo4817f(r15)
            int r5 = r11.leftMargin
            r4.f4585e = r5
            u4 r4 = r13.mo4817f(r10)
            int r5 = r11.rightMargin
            r4.f4585e = r5
            goto L_0x06e9
        L_0x06e2:
            r13.mo4833y(r1)
            r4 = 0
            r13.mo4813C(r4)
        L_0x06e9:
            r4 = r30
            goto L_0x06f6
        L_0x06ec:
            r4 = r30
            r13.mo4833y(r4)
            int r5 = r11.width
            r13.mo4813C(r5)
        L_0x06f6:
            boolean r5 = r11.f541V
            if (r5 != 0) goto L_0x0717
            int r5 = r11.height
            if (r5 != r12) goto L_0x0712
            r13.mo4812B(r2)
            u4 r5 = r13.mo4817f(r3)
            int r6 = r11.topMargin
            r5.f4585e = r6
            u4 r5 = r13.mo4817f(r9)
            int r6 = r11.bottomMargin
            r5.f4585e = r6
            goto L_0x071f
        L_0x0712:
            r13.mo4812B(r1)
            r5 = 0
            goto L_0x071c
        L_0x0717:
            r13.mo4812B(r4)
            int r5 = r11.height
        L_0x071c:
            r13.mo4831w(r5)
        L_0x071f:
            java.lang.String r5 = r11.f521B
            if (r5 == 0) goto L_0x07b8
            int r6 = r5.length()
            if (r6 != 0) goto L_0x072e
            r6 = 0
            r13.f4709G = r6
            goto L_0x07b8
        L_0x072e:
            int r6 = r5.length()
            r7 = 44
            int r7 = r5.indexOf(r7)
            if (r7 <= 0) goto L_0x075b
            int r8 = r6 + -1
            if (r7 >= r8) goto L_0x075b
            r8 = 0
            java.lang.String r14 = r5.substring(r8, r7)
            java.lang.String r8 = "W"
            boolean r8 = r14.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x074d
            r8 = 0
            goto L_0x0758
        L_0x074d:
            java.lang.String r8 = "H"
            boolean r8 = r14.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0757
            r8 = 1
            goto L_0x0758
        L_0x0757:
            r8 = -1
        L_0x0758:
            int r7 = r7 + 1
            goto L_0x075d
        L_0x075b:
            r7 = 0
            r8 = -1
        L_0x075d:
            r14 = 58
            int r14 = r5.indexOf(r14)
            if (r14 < 0) goto L_0x079f
            int r6 = r6 + -1
            if (r14 >= r6) goto L_0x079f
            java.lang.String r6 = r5.substring(r7, r14)
            int r14 = r14 + 1
            java.lang.String r5 = r5.substring(r14)
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x07ae
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x07ae
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x07ae }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x07ae }
            r7 = 0
            int r14 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x07ae
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x07ae
            r7 = 1
            if (r8 != r7) goto L_0x0799
            float r5 = r5 / r6
            float r5 = java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x07ae }
            goto L_0x07af
        L_0x0799:
            float r6 = r6 / r5
            float r5 = java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x07ae }
            goto L_0x07af
        L_0x079f:
            java.lang.String r5 = r5.substring(r7)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x07ae
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x07ae }
            goto L_0x07af
        L_0x07ae:
            r5 = 0
        L_0x07af:
            r6 = 0
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x07b8
            r13.f4709G = r5
            r13.f4710H = r8
        L_0x07b8:
            float r5 = r11.f523D
            float[] r6 = r13.f4740f0
            r7 = 0
            r6[r7] = r5
            float r5 = r11.f524E
            r7 = 1
            r6[r7] = r5
            int r5 = r11.f525F
            r13.f4736d0 = r5
            int r5 = r11.f526G
            r13.f4738e0 = r5
            int r5 = r11.f527H
            int r6 = r11.f529J
            int r7 = r11.f531L
            float r8 = r11.f533N
            r13.f4737e = r5
            r13.f4743h = r6
            r13.f4745i = r7
            r13.f4746j = r8
            r6 = 2
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x07e7
            if (r5 != 0) goto L_0x07e7
            r13.f4737e = r6
        L_0x07e7:
            int r5 = r11.f528I
            int r8 = r11.f530K
            int r14 = r11.f532M
            float r11 = r11.f534O
            r13.f4739f = r5
            r13.f4747k = r8
            r13.f4748l = r14
            r13.f4749m = r11
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x07ff
            if (r5 != 0) goto L_0x07ff
            r13.f4739f = r6
        L_0x07ff:
            int r5 = r29 + 1
            r29 = r1
            r30 = r2
            r31 = r3
            r12 = r4
            r1 = r5
            r33 = r32
            r14 = r38
            r11 = r39
            r34 = r41
            r32 = r26
            goto L_0x03a9
        L_0x0815:
            r39 = r11
            r4 = r12
            r26 = r32
            r32 = r33
            r41 = r34
            goto L_0x0830
        L_0x081f:
            r37 = r1
            r36 = r2
            r26 = r6
            r32 = r7
            r41 = r8
            r39 = r11
            r4 = r12
            r35 = r13
            r28 = r14
        L_0x0830:
            r12 = -1
            r1 = 1
            goto L_0x0846
        L_0x0833:
            r37 = r1
            r36 = r2
            r26 = r6
            r32 = r7
            r41 = r8
            r39 = r11
            r4 = r12
            r35 = r13
            r28 = r14
            r12 = -1
            r1 = 0
        L_0x0846:
            int r2 = r0.f514k
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L_0x084f
            r2 = 1
            goto L_0x0850
        L_0x084f:
            r2 = 0
        L_0x0850:
            if (r2 == 0) goto L_0x088a
            w4 r3 = r0.f508e
            r3.mo4961J()
            int r5 = r3.f4912w0
            r3.mo4425c(r5)
            w4 r3 = r0.f508e
            v4$a[] r5 = r3.f4705C
            r6 = 0
            r5 = r5[r6]
            r6 = r39
            if (r5 == r6) goto L_0x0871
            c5 r5 = r3.f4733c
            if (r5 == 0) goto L_0x0871
            r7 = r37
            r5.mo1696e(r7)
            goto L_0x0873
        L_0x0871:
            r7 = r37
        L_0x0873:
            v4$a[] r5 = r3.f4705C
            r8 = 1
            r5 = r5[r8]
            if (r5 == r6) goto L_0x0884
            c5 r3 = r3.f4735d
            if (r3 == 0) goto L_0x0884
            r5 = r36
            r3.mo1696e(r5)
            goto L_0x0886
        L_0x0884:
            r5 = r36
        L_0x0886:
            r50.mo621f(r51, r52)
            goto L_0x0893
        L_0x088a:
            r5 = r36
            r7 = r37
            r6 = r39
            r50.mo620e(r51, r52)
        L_0x0893:
            int r3 = r50.getChildCount()
            r8 = 0
        L_0x0898:
            if (r8 >= r3) goto L_0x08aa
            android.view.View r11 = r0.getChildAt(r8)
            boolean r13 = r11 instanceof p000.C0756l5
            if (r13 == 0) goto L_0x08a7
            l5 r11 = (p000.C0756l5) r11
            r11.mo3592a()
        L_0x08a7:
            int r8 = r8 + 1
            goto L_0x0898
        L_0x08aa:
            java.util.ArrayList<h5> r3 = r0.f506c
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x08c3
            r8 = 0
        L_0x08b3:
            if (r8 >= r3) goto L_0x08c3
            java.util.ArrayList<h5> r11 = r0.f506c
            java.lang.Object r11 = r11.get(r8)
            h5 r11 = (p000.C0557h5) r11
            r11.mo3042d()
            int r8 = r8 + 1
            goto L_0x08b3
        L_0x08c3:
            int r3 = r50.getChildCount()
            if (r3 <= 0) goto L_0x08d0
            if (r1 == 0) goto L_0x08d0
            w4 r1 = r0.f508e
            p000.C0398e.m1519c(r1)
        L_0x08d0:
            w4 r1 = r0.f508e
            boolean r3 = r1.f4907r0
            if (r3 == 0) goto L_0x0914
            boolean r3 = r1.f4908s0
            if (r3 == 0) goto L_0x08f2
            r3 = r35
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r8) goto L_0x08ef
            int r8 = r1.f4910u0
            r11 = r28
            if (r8 >= r11) goto L_0x08e9
            r1.mo4813C(r8)
        L_0x08e9:
            w4 r1 = r0.f508e
            r1.mo4833y(r4)
            goto L_0x08f6
        L_0x08ef:
            r11 = r28
            goto L_0x08f6
        L_0x08f2:
            r11 = r28
            r3 = r35
        L_0x08f6:
            w4 r1 = r0.f508e
            boolean r8 = r1.f4909t0
            if (r8 == 0) goto L_0x0911
            r8 = r17
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r13) goto L_0x091a
            int r13 = r1.f4911v0
            r14 = r41
            if (r13 >= r14) goto L_0x090b
            r1.mo4831w(r13)
        L_0x090b:
            w4 r1 = r0.f508e
            r1.mo4812B(r4)
            goto L_0x091c
        L_0x0911:
            r8 = r17
            goto L_0x091a
        L_0x0914:
            r8 = r17
            r11 = r28
            r3 = r35
        L_0x091a:
            r14 = r41
        L_0x091c:
            int r1 = r0.f514k
            r4 = 32
            r1 = r1 & r4
            if (r1 != r4) goto L_0x0973
            w4 r1 = r0.f508e
            int r1 = r1.mo4825n()
            w4 r4 = r0.f508e
            int r4 = r4.mo4819h()
            int r13 = r0.f518o
            if (r13 == r1) goto L_0x0940
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 != r13) goto L_0x0942
            w4 r3 = r0.f508e
            java.util.List<x4> r3 = r3.f4906q0
            r15 = 0
            p000.C0398e.m1526j(r3, r15, r1)
            goto L_0x0942
        L_0x0940:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x0942:
            int r1 = r0.f519p
            if (r1 == r4) goto L_0x0950
            if (r8 != r13) goto L_0x0950
            w4 r1 = r0.f508e
            java.util.List<x4> r1 = r1.f4906q0
            r3 = 1
            p000.C0398e.m1526j(r1, r3, r4)
        L_0x0950:
            w4 r1 = r0.f508e
            boolean r3 = r1.f4908s0
            if (r3 == 0) goto L_0x0961
            int r3 = r1.f4910u0
            if (r3 <= r11) goto L_0x0961
            java.util.List<x4> r1 = r1.f4906q0
            r3 = 0
            p000.C0398e.m1526j(r1, r3, r11)
            goto L_0x0962
        L_0x0961:
            r3 = 0
        L_0x0962:
            w4 r1 = r0.f508e
            boolean r4 = r1.f4909t0
            if (r4 == 0) goto L_0x0974
            int r4 = r1.f4911v0
            if (r4 <= r14) goto L_0x0974
            java.util.List<x4> r1 = r1.f4906q0
            r4 = 1
            p000.C0398e.m1526j(r1, r4, r14)
            goto L_0x0975
        L_0x0973:
            r3 = 0
        L_0x0974:
            r4 = 1
        L_0x0975:
            int r1 = r50.getChildCount()
            if (r1 <= 0) goto L_0x097e
            r50.mo631h()
        L_0x097e:
            java.util.ArrayList<v4> r1 = r0.f507d
            int r1 = r1.size()
            int r8 = r50.getPaddingBottom()
            int r8 = r8 + r26
            int r11 = r50.getPaddingRight()
            int r11 = r11 + r32
            if (r1 <= 0) goto L_0x0b8d
            w4 r13 = r0.f508e
            v4$a r13 = r13.mo4820i()
            if (r13 != r6) goto L_0x099c
            r13 = 1
            goto L_0x099d
        L_0x099c:
            r13 = 0
        L_0x099d:
            w4 r14 = r0.f508e
            v4$a r14 = r14.mo4824m()
            if (r14 != r6) goto L_0x09a7
            r6 = 1
            goto L_0x09a8
        L_0x09a7:
            r6 = 0
        L_0x09a8:
            w4 r14 = r0.f508e
            int r14 = r14.mo4825n()
            int r15 = r0.f509f
            int r14 = java.lang.Math.max(r14, r15)
            w4 r15 = r0.f508e
            int r15 = r15.mo4819h()
            int r3 = r0.f510g
            int r3 = java.lang.Math.max(r15, r3)
            r4 = r3
            r12 = r14
            r3 = 0
            r14 = 0
            r15 = 0
        L_0x09c5:
            r16 = r1
            if (r3 >= r1) goto L_0x0af8
            java.util.ArrayList<v4> r1 = r0.f507d
            java.lang.Object r1 = r1.get(r3)
            v4 r1 = (p000.C1236v4) r1
            r36 = r5
            java.lang.Object r5 = r1.f4726X
            android.view.View r5 = (android.view.View) r5
            if (r5 != 0) goto L_0x09dd
            r37 = r7
            goto L_0x0ade
        L_0x09dd:
            android.view.ViewGroup$LayoutParams r17 = r5.getLayoutParams()
            r37 = r7
            r7 = r17
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.C0084a) r7
            boolean r0 = r7.f544Y
            if (r0 != 0) goto L_0x0ade
            boolean r0 = r7.f543X
            if (r0 == 0) goto L_0x09f1
            goto L_0x0ade
        L_0x09f1:
            int r0 = r5.getVisibility()
            r17 = r14
            r14 = 8
            if (r0 != r14) goto L_0x09fc
            goto L_0x0a12
        L_0x09fc:
            if (r2 == 0) goto L_0x0a19
            c5 r0 = r1.mo4823l()
            boolean r0 = r0.mo2638c()
            if (r0 == 0) goto L_0x0a19
            c5 r0 = r1.mo4822k()
            boolean r0 = r0.mo2638c()
            if (r0 == 0) goto L_0x0a19
        L_0x0a12:
            r20 = r11
            r19 = r13
        L_0x0a16:
            r7 = -1
            goto L_0x0ae6
        L_0x0a19:
            int r0 = r7.width
            r14 = -2
            if (r0 != r14) goto L_0x0a29
            boolean r14 = r7.f540U
            if (r14 == 0) goto L_0x0a29
            r14 = r51
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r14, r11, r0)
            goto L_0x0a35
        L_0x0a29:
            r14 = r51
            int r0 = r1.mo4825n()
            r14 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r14)
        L_0x0a35:
            int r14 = r7.height
            r20 = r11
            r11 = -2
            if (r14 != r11) goto L_0x0a47
            boolean r11 = r7.f541V
            if (r11 == 0) goto L_0x0a47
            r11 = r52
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r11, r8, r14)
            goto L_0x0a53
        L_0x0a47:
            r11 = r52
            int r14 = r1.mo4819h()
            r11 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r11)
        L_0x0a53:
            r5.measure(r0, r14)
            int r0 = r5.getMeasuredWidth()
            int r11 = r5.getMeasuredHeight()
            int r14 = r1.mo4825n()
            if (r0 == r14) goto L_0x0a8f
            r1.mo4813C(r0)
            if (r2 == 0) goto L_0x0a70
            c5 r14 = r1.mo4823l()
            r14.mo1696e(r0)
        L_0x0a70:
            if (r13 == 0) goto L_0x0a8b
            int r0 = r1.f4711I
            int r14 = r1.f4707E
            r19 = r13
            int r13 = r0 + r14
            if (r13 <= r12) goto L_0x0a8d
            int r0 = r0 + r14
            u4 r13 = r1.mo4817f(r10)
            int r13 = r13.mo4768b()
            int r13 = r13 + r0
            int r12 = java.lang.Math.max(r12, r13)
            goto L_0x0a8d
        L_0x0a8b:
            r19 = r13
        L_0x0a8d:
            r13 = 1
            goto L_0x0a93
        L_0x0a8f:
            r19 = r13
            r13 = r17
        L_0x0a93:
            int r0 = r1.mo4819h()
            if (r11 == r0) goto L_0x0abf
            r1.mo4831w(r11)
            if (r2 == 0) goto L_0x0aa5
            c5 r0 = r1.mo4822k()
            r0.mo1696e(r11)
        L_0x0aa5:
            if (r6 == 0) goto L_0x0abe
            int r0 = r1.f4712J
            int r11 = r1.f4708F
            int r13 = r0 + r11
            if (r13 <= r4) goto L_0x0abe
            int r0 = r0 + r11
            u4 r11 = r1.mo4817f(r9)
            int r11 = r11.mo4768b()
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r4, r11)
            r4 = r0
        L_0x0abe:
            r13 = 1
        L_0x0abf:
            boolean r0 = r7.f542W
            if (r0 == 0) goto L_0x0ad2
            int r0 = r5.getBaseline()
            r7 = -1
            if (r0 == r7) goto L_0x0ad3
            int r11 = r1.f4719Q
            if (r0 == r11) goto L_0x0ad3
            r1.f4719Q = r0
            r13 = 1
            goto L_0x0ad3
        L_0x0ad2:
            r7 = -1
        L_0x0ad3:
            int r0 = r5.getMeasuredState()
            int r0 = android.view.ViewGroup.combineMeasuredStates(r15, r0)
            r15 = r0
            r14 = r13
            goto L_0x0ae8
        L_0x0ade:
            r20 = r11
            r19 = r13
            r17 = r14
            goto L_0x0a16
        L_0x0ae6:
            r14 = r17
        L_0x0ae8:
            int r3 = r3 + 1
            r0 = r50
            r1 = r16
            r13 = r19
            r11 = r20
            r5 = r36
            r7 = r37
            goto L_0x09c5
        L_0x0af8:
            r36 = r5
            r37 = r7
            r20 = r11
            r17 = r14
            r0 = r50
            if (r17 == 0) goto L_0x0b3f
            w4 r1 = r0.f508e
            r3 = r37
            r1.mo4813C(r3)
            w4 r1 = r0.f508e
            r3 = r36
            r1.mo4831w(r3)
            if (r2 == 0) goto L_0x0b19
            w4 r1 = r0.f508e
            r1.mo4963L()
        L_0x0b19:
            r50.mo631h()
            w4 r1 = r0.f508e
            int r1 = r1.mo4825n()
            if (r1 >= r12) goto L_0x0b2b
            w4 r1 = r0.f508e
            r1.mo4813C(r12)
            r2 = 1
            goto L_0x0b2c
        L_0x0b2b:
            r2 = 0
        L_0x0b2c:
            w4 r1 = r0.f508e
            int r1 = r1.mo4819h()
            if (r1 >= r4) goto L_0x0b3a
            w4 r1 = r0.f508e
            r1.mo4831w(r4)
            r2 = 1
        L_0x0b3a:
            if (r2 == 0) goto L_0x0b3f
            r50.mo631h()
        L_0x0b3f:
            r1 = r16
            r2 = 0
        L_0x0b42:
            if (r2 >= r1) goto L_0x0b8b
            java.util.ArrayList<v4> r3 = r0.f507d
            java.lang.Object r3 = r3.get(r2)
            v4 r3 = (p000.C1236v4) r3
            java.lang.Object r4 = r3.f4726X
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0b53
            goto L_0x0b68
        L_0x0b53:
            int r5 = r4.getMeasuredWidth()
            int r6 = r3.mo4825n()
            if (r5 != r6) goto L_0x0b6d
            int r5 = r4.getMeasuredHeight()
            int r6 = r3.mo4819h()
            if (r5 == r6) goto L_0x0b68
            goto L_0x0b6d
        L_0x0b68:
            r6 = 8
        L_0x0b6a:
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0b88
        L_0x0b6d:
            int r5 = r3.f4727Y
            r6 = 8
            if (r5 == r6) goto L_0x0b6a
            int r5 = r3.mo4825n()
            r7 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            int r3 = r3.mo4819h()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            r4.measure(r5, r3)
        L_0x0b88:
            int r2 = r2 + 1
            goto L_0x0b42
        L_0x0b8b:
            r2 = r15
            goto L_0x0b90
        L_0x0b8d:
            r20 = r11
            r2 = 0
        L_0x0b90:
            w4 r1 = r0.f508e
            int r1 = r1.mo4825n()
            int r1 = r1 + r20
            w4 r3 = r0.f508e
            int r3 = r3.mo4819h()
            int r3 = r3 + r8
            r4 = r51
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r4, r2)
            int r2 = r2 << 16
            r4 = r52
            int r2 = android.view.ViewGroup.resolveSizeAndState(r3, r4, r2)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f511h
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f512i
            int r2 = java.lang.Math.min(r3, r2)
            w4 r3 = r0.f508e
            boolean r4 = r3.f4914y0
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == 0) goto L_0x0bc7
            r1 = r1 | r5
        L_0x0bc7:
            boolean r3 = r3.f4915z0
            if (r3 == 0) goto L_0x0bcc
            r2 = r2 | r5
        L_0x0bcc:
            r0.setMeasuredDimension(r1, r2)
            r0.f518o = r1
            r0.f519p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1236v4 d = mo618d(view);
        if ((view instanceof C0714k5) && !(d instanceof C1398y4)) {
            C0084a aVar = (C0084a) view.getLayoutParams();
            C1398y4 y4Var = new C1398y4();
            aVar.f567k0 = y4Var;
            aVar.f543X = true;
            y4Var.mo5183F(aVar.f537R);
        }
        if (view instanceof C0557h5) {
            C0557h5 h5Var = (C0557h5) view;
            h5Var.mo3044f();
            ((C0084a) view.getLayoutParams()).f544Y = true;
            if (!this.f506c.contains(h5Var)) {
                this.f506c.add(h5Var);
            }
        }
        this.f505b.put(view.getId(), view);
        this.f513j = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f505b.remove(view.getId());
        C1236v4 d = mo618d(view);
        this.f508e.f2096i0.remove(d);
        d.f4706D = null;
        this.f506c.remove(view);
        this.f507d.remove(d);
        this.f513j = true;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        this.f513j = true;
        this.f518o = -1;
        this.f519p = -1;
    }

    public void setConstraintSet(C0607i5 i5Var) {
        this.f515l = i5Var;
    }

    public void setId(int i) {
        this.f505b.remove(getId());
        super.setId(i);
        this.f505b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f512i) {
            this.f512i = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f511h) {
            this.f511h = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f510g) {
            this.f510g = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f509f) {
            this.f509f = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f508e.f4912w0 = i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
