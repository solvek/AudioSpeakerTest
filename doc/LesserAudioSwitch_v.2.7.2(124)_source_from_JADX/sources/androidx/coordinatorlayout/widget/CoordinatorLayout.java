package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0457f8, C0523g8 {

    /* renamed from: v */
    public static final String f584v;

    /* renamed from: w */
    public static final Class<?>[] f585w = {Context.class, AttributeSet.class};

    /* renamed from: x */
    public static final ThreadLocal<Map<String, Constructor<C0088c>>> f586x = new ThreadLocal<>();

    /* renamed from: y */
    public static final Comparator<View> f587y;

    /* renamed from: z */
    public static final C1346x7<Rect> f588z = new C1401y7(12);

    /* renamed from: b */
    public final List<View> f589b = new ArrayList();

    /* renamed from: c */
    public final C0957p5<View> f590c = new C0957p5<>();

    /* renamed from: d */
    public final List<View> f591d = new ArrayList();

    /* renamed from: e */
    public final List<View> f592e = new ArrayList();

    /* renamed from: f */
    public Paint f593f;

    /* renamed from: g */
    public final int[] f594g = new int[2];

    /* renamed from: h */
    public final int[] f595h = new int[2];

    /* renamed from: i */
    public boolean f596i;

    /* renamed from: j */
    public boolean f597j;

    /* renamed from: k */
    public int[] f598k;

    /* renamed from: l */
    public View f599l;

    /* renamed from: m */
    public View f600m;

    /* renamed from: n */
    public C0092g f601n;

    /* renamed from: o */
    public boolean f602o;

    /* renamed from: p */
    public C1241v8 f603p;

    /* renamed from: q */
    public boolean f604q;

    /* renamed from: r */
    public Drawable f605r;

    /* renamed from: s */
    public ViewGroup.OnHierarchyChangeListener f606s;

    /* renamed from: t */
    public C0668j8 f607t;

    /* renamed from: u */
    public final C0611i8 f608u = new C0611i8();

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0086a implements C0668j8 {
        public C0086a() {
        }

        /* renamed from: a */
        public C1241v8 mo696a(View view, C1241v8 v8Var) {
            C0088c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!C1344x5.m3773r(coordinatorLayout.f603p, v8Var)) {
                coordinatorLayout.f603p = v8Var;
                boolean z = true;
                boolean z2 = v8Var.mo4844d() > 0;
                coordinatorLayout.f604q = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!v8Var.f4773a.mo4858i()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        if (C0813m8.m2476j(childAt) && (cVar = ((C0091f) childAt.getLayoutParams()).f611a) != null) {
                            v8Var = cVar.mo702e(v8Var);
                            if (v8Var.f4773a.mo4858i()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return v8Var;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0087b {
        C0088c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0088c<V extends View> {
        public C0088c() {
        }

        public C0088c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo112A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo698a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: b */
        public int mo699b() {
            return -16777216;
        }

        /* renamed from: c */
        public float mo700c() {
            return 0.0f;
        }

        /* renamed from: d */
        public boolean mo701d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: e */
        public C1241v8 mo702e(C1241v8 v8Var) {
            return v8Var;
        }

        /* renamed from: f */
        public void mo703f(C0091f fVar) {
        }

        /* renamed from: g */
        public boolean mo704g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: h */
        public void mo705h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: i */
        public void mo706i() {
        }

        /* renamed from: j */
        public boolean mo117j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: k */
        public boolean mo707k(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: l */
        public boolean mo708l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: m */
        public boolean mo709m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo710n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: o */
        public void mo711o() {
        }

        /* renamed from: p */
        public void mo712p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo711o();
            }
        }

        @Deprecated
        /* renamed from: q */
        public void mo713q() {
        }

        /* renamed from: r */
        public void mo714r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                mo713q();
            }
        }

        @Deprecated
        /* renamed from: s */
        public void mo715s() {
        }

        /* renamed from: t */
        public boolean mo716t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: u */
        public void mo717u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: v */
        public Parcelable mo718v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: w */
        public boolean mo719w() {
            return false;
        }

        /* renamed from: x */
        public boolean mo720x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo719w();
            }
            return false;
        }

        @Deprecated
        /* renamed from: y */
        public void mo721y() {
        }

        /* renamed from: z */
        public void mo722z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo721y();
            }
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0089d {
        Class<? extends C0088c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class C0090e implements ViewGroup.OnHierarchyChangeListener {
        public C0090e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f606s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo678q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f606s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0091f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0088c f611a;

        /* renamed from: b */
        public boolean f612b = false;

        /* renamed from: c */
        public int f613c = 0;

        /* renamed from: d */
        public int f614d = 0;

        /* renamed from: e */
        public int f615e = -1;

        /* renamed from: f */
        public int f616f = -1;

        /* renamed from: g */
        public int f617g = 0;

        /* renamed from: h */
        public int f618h = 0;

        /* renamed from: i */
        public int f619i;

        /* renamed from: j */
        public int f620j;

        /* renamed from: k */
        public View f621k;

        /* renamed from: l */
        public View f622l;

        /* renamed from: m */
        public boolean f623m;

        /* renamed from: n */
        public boolean f624n;

        /* renamed from: o */
        public boolean f625o;

        /* renamed from: p */
        public boolean f626p;

        /* renamed from: q */
        public final Rect f627q = new Rect();

        public C0091f(int i, int i2) {
            super(i, i2);
        }

        public C0091f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0088c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0915o5.f3473b);
            this.f613c = obtainStyledAttributes.getInteger(0, 0);
            this.f616f = obtainStyledAttributes.getResourceId(1, -1);
            this.f614d = obtainStyledAttributes.getInteger(2, 0);
            this.f615e = obtainStyledAttributes.getInteger(6, -1);
            this.f617g = obtainStyledAttributes.getInt(5, 0);
            this.f618h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f612b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f584v;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f584v;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<C0088c>>> threadLocal = CoordinatorLayout.f586x;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f585w);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (C0088c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e) {
                        throw new RuntimeException(C0279ch.m1120q("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f611a = cVar;
            }
            obtainStyledAttributes.recycle();
            C0088c cVar2 = this.f611a;
            if (cVar2 != null) {
                cVar2.mo703f(this);
            }
        }

        public C0091f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0091f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0091f(C0091f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public boolean mo726a(int i) {
            if (i == 0) {
                return this.f624n;
            }
            if (i != 1) {
                return false;
            }
            return this.f625o;
        }

        /* renamed from: b */
        public void mo727b(int i, boolean z) {
            if (i == 0) {
                this.f624n = z;
            } else if (i == 1) {
                this.f625o = z;
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class C0092g implements ViewTreeObserver.OnPreDrawListener {
        public C0092g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo678q(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0093h extends C0718k9 {
        public static final Parcelable.Creator<C0093h> CREATOR = new C0094a();

        /* renamed from: d */
        public SparseArray<Parcelable> f629d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class C0094a implements Parcelable.ClassLoaderCreator<C0093h> {
            public Object createFromParcel(Parcel parcel) {
                return new C0093h(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0093h[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0093h(parcel, classLoader);
            }
        }

        public C0093h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f629d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f629d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0093h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            SparseArray<Parcelable> sparseArray = this.f629d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f629d.keyAt(i2);
                parcelableArr[i2] = this.f629d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0095i implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            View view = (View) obj;
            View view2 = (View) obj2;
            Field field = C0813m8.f3234a;
            int i = Build.VERSION.SDK_INT;
            float f = 0.0f;
            float z = i >= 21 ? view.getZ() : 0.0f;
            if (i >= 21) {
                f = view2.getZ();
            }
            if (z > f) {
                return -1;
            }
            return z < f ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f584v = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f587y = r0
            goto L_0x0021
        L_0x001f:
            f587y = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f585w = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f586x = r0
            y7 r0 = new y7
            r1 = 12
            r0.<init>(r1)
            f588z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = C0915o5.f3472a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f598k = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f598k.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f598k;
                iArr2[i] = (int) (((float) iArr2[i]) * f);
            }
        }
        this.f605r = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        mo695y();
        super.setOnHierarchyChangeListener(new C0090e());
        if (C0813m8.m2477k(this) == 0) {
            C0813m8.m2462K(this, 1);
        }
    }

    /* renamed from: a */
    public static Rect m195a() {
        Rect a = f588z.mo5053a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: b */
    public final void mo648b(C0091f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: c */
    public void mo649c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo655f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0091f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public List<View> mo651d(View view) {
        C0957p5<View> p5Var = this.f590c;
        int i = p5Var.f3564b.f2827d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList k = p5Var.f3564b.mo3407k(i2);
            if (k != null && k.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(p5Var.f3564b.mo3402h(i2));
            }
        }
        this.f592e.clear();
        if (arrayList != null) {
            this.f592e.addAll(arrayList);
        }
        return this.f592e;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C0091f fVar = (C0091f) view.getLayoutParams();
        C0088c cVar = fVar.f611a;
        if (cVar != null) {
            float c = cVar.mo700c();
            if (c > 0.0f) {
                if (this.f593f == null) {
                    this.f593f = new Paint();
                }
                this.f593f.setColor(fVar.f611a.mo699b());
                Paint paint = this.f593f;
                int round = Math.round(c * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f593f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f605r;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public List<View> mo654e(View view) {
        List orDefault = this.f590c.f3564b.getOrDefault(view, null);
        this.f592e.clear();
        if (orDefault != null) {
            this.f592e.addAll(orDefault);
        }
        return this.f592e;
    }

    /* renamed from: f */
    public void mo655f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C1004q5.f3775a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C1004q5.f3775a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C1004q5.m2910a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C1004q5.f3776b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: g */
    public final void mo656g(int i, Rect rect, Rect rect2, C0091f fVar, int i2, int i3) {
        int i4 = fVar.f613c;
        if (i4 == 0) {
            i4 = 17;
        }
        int t = C1344x5.m3775t(i4, i);
        int i5 = fVar.f614d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int t2 = C1344x5.m3775t(i5, i);
        int i6 = t & 7;
        int i7 = t & 112;
        int i8 = t2 & 7;
        int i9 = t2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0091f(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0091f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        mo690u();
        return Collections.unmodifiableList(this.f589b);
    }

    public final C1241v8 getLastWindowInsets() {
        return this.f603p;
    }

    public int getNestedScrollAxes() {
        return this.f608u.mo3188a();
    }

    public Drawable getStatusBarBackground() {
        return this.f605r;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final int mo666h(int i) {
        StringBuilder sb;
        int[] iArr = this.f598k;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        sb.toString();
        return 0;
    }

    /* renamed from: i */
    public void mo240i(View view, View view2, int i, int i2) {
        C0088c cVar;
        C0611i8 i8Var = this.f608u;
        if (i2 == 1) {
            i8Var.f2635b = i;
        } else {
            i8Var.f2634a = i;
        }
        this.f600m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0091f fVar = (C0091f) getChildAt(i3).getLayoutParams();
            if (fVar.mo726a(i2) && (cVar = fVar.f611a) != null && i2 == 0) {
                cVar.mo715s();
            }
        }
    }

    /* renamed from: j */
    public C0091f mo667j(View view) {
        C0091f fVar = (C0091f) view.getLayoutParams();
        if (!fVar.f612b) {
            if (view instanceof C0087b) {
                C0088c behavior = ((C0087b) view).getBehavior();
                C0088c cVar = fVar.f611a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.mo706i();
                    }
                    fVar.f611a = behavior;
                    fVar.f612b = true;
                    if (behavior != null) {
                        behavior.mo703f(fVar);
                    }
                }
            } else {
                C0089d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0089d) cls.getAnnotation(C0089d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        C0088c cVar2 = (C0088c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        C0088c cVar3 = fVar.f611a;
                        if (cVar3 != cVar2) {
                            if (cVar3 != null) {
                                cVar3.mo706i();
                            }
                            fVar.f611a = cVar2;
                            fVar.f612b = true;
                            if (cVar2 != null) {
                                cVar2.mo703f(fVar);
                            }
                        }
                    } catch (Exception unused) {
                        dVar.value().getName();
                    }
                }
            }
            fVar.f612b = true;
        }
        return fVar;
    }

    /* renamed from: k */
    public void mo242k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0088c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0091f fVar = (C0091f) childAt.getLayoutParams();
                if (fVar.mo726a(i5) && (cVar = fVar.f611a) != null) {
                    int[] iArr2 = this.f594g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo714r(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f594g;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f594g[1]) : Math.min(i7, this.f594g[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo678q(1);
        }
    }

    /* renamed from: l */
    public void mo243l(View view, int i, int i2, int i3, int i4, int i5) {
        mo242k(view, i, i2, i3, i4, 0, this.f595h);
    }

    /* renamed from: m */
    public void mo244m(View view, int i) {
        C0611i8 i8Var = this.f608u;
        if (i == 1) {
            i8Var.f2635b = 0;
        } else {
            i8Var.f2634a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0091f fVar = (C0091f) childAt.getLayoutParams();
            if (fVar.mo726a(i)) {
                C0088c cVar = fVar.f611a;
                if (cVar != null) {
                    cVar.mo722z(this, childAt, view, i);
                }
                fVar.mo727b(i, false);
                fVar.f626p = false;
            }
        }
        this.f600m = null;
    }

    /* renamed from: n */
    public void mo245n(View view, int i, int i2, int[] iArr, int i3) {
        C0088c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0091f fVar = (C0091f) childAt.getLayoutParams();
                if (fVar.mo726a(i3) && (cVar = fVar.f611a) != null) {
                    int[] iArr2 = this.f594g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo712p(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f594g;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f594g;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo678q(1);
        }
    }

    /* renamed from: o */
    public boolean mo246o(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0091f fVar = (C0091f) childAt.getLayoutParams();
                C0088c cVar = fVar.f611a;
                if (cVar != null) {
                    boolean x = cVar.mo720x(this, childAt, view, view2, i, i2);
                    z |= x;
                    fVar.mo727b(i3, x);
                } else {
                    fVar.mo727b(i3, false);
                }
            }
            i4++;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo691v(false);
        if (this.f602o) {
            if (this.f601n == null) {
                this.f601n = new C0092g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f601n);
        }
        if (this.f603p == null && C0813m8.m2476j(this)) {
            C0813m8.m2455D(this);
        }
        this.f597j = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo691v(false);
        if (this.f602o && this.f601n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f601n);
        }
        View view = this.f600m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f597j = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f604q && this.f605r != null) {
            C1241v8 v8Var = this.f603p;
            int d = v8Var != null ? v8Var.mo4844d() : 0;
            if (d > 0) {
                this.f605r.setBounds(0, 0, getWidth(), d);
                this.f605r.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo691v(true);
        }
        boolean t = mo689t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo691v(true);
        }
        return t;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0088c cVar;
        int l = C0813m8.m2478l(this);
        int size = this.f589b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f589b.get(i5);
            if (view.getVisibility() != 8 && ((cVar = ((C0091f) view.getLayoutParams()).f611a) == null || !cVar.mo707k(this, view, l))) {
                mo679r(view, l);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017e, code lost:
        if (r0.mo708l(r30, r20, r8, r21, r23, 0) == false) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo690u()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r7.getChildAt(r1)
            p5<android.view.View> r4 = r7.f590c
            j4<T, java.util.ArrayList<T>> r5 = r4.f3564b
            int r5 = r5.f2827d
            r6 = 0
        L_0x0019:
            if (r6 >= r5) goto L_0x0030
            j4<T, java.util.ArrayList<T>> r9 = r4.f3564b
            java.lang.Object r9 = r9.mo3407k(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = 1
            goto L_0x0031
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = 0
        L_0x0039:
            boolean r1 = r7.f602o
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.f597j
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f601n
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r7.f601n = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f601n
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r7.f602o = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r7.f597j
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f601n
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f601n
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r7.f602o = r8
        L_0x006d:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = p000.C0813m8.m2478l(r30)
            if (r11 != r2) goto L_0x0085
            r12 = 1
            goto L_0x0086
        L_0x0085:
            r12 = 0
        L_0x0086:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            v8 r3 = r7.f603p
            if (r3 == 0) goto L_0x00af
            boolean r3 = p000.C0813m8.m2476j(r30)
            if (r3 == 0) goto L_0x00af
            r19 = 1
            goto L_0x00b1
        L_0x00af:
            r19 = 0
        L_0x00b1:
            java.util.List<android.view.View> r2 = r7.f589b
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x00bb:
            if (r3 >= r6) goto L_0x01d4
            java.util.List<android.view.View> r0 = r7.f589b
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00d7
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01cb
        L_0x00d7:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0091f) r1
            int r0 = r1.f615e
            if (r0 < 0) goto L_0x0121
            if (r13 == 0) goto L_0x0121
            int r0 = r7.mo666h(r0)
            int r8 = r1.f613c
            if (r8 != 0) goto L_0x00ef
            r8 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00ef:
            int r8 = p000.C1344x5.m3775t(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x00fc
            if (r12 == 0) goto L_0x0101
        L_0x00fc:
            r2 = 5
            if (r8 != r2) goto L_0x010d
            if (r12 == 0) goto L_0x010d
        L_0x0101:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L_0x0125
        L_0x010d:
            if (r8 != r2) goto L_0x0111
            if (r12 == 0) goto L_0x0116
        L_0x0111:
            r2 = 3
            if (r8 != r2) goto L_0x011f
            if (r12 == 0) goto L_0x011f
        L_0x0116:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x0125
        L_0x011f:
            r8 = 0
            goto L_0x0123
        L_0x0121:
            r22 = r2
        L_0x0123:
            r21 = 0
        L_0x0125:
            if (r19 == 0) goto L_0x0157
            boolean r0 = p000.C0813m8.m2476j(r20)
            if (r0 != 0) goto L_0x0157
            v8 r0 = r7.f603p
            int r0 = r0.mo4842b()
            v8 r2 = r7.f603p
            int r2 = r2.mo4843c()
            int r2 = r2 + r0
            v8 r0 = r7.f603p
            int r0 = r0.mo4844d()
            v8 r8 = r7.f603p
            int r8 = r8.mo4841a()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x015b
        L_0x0157:
            r8 = r31
            r23 = r32
        L_0x015b:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f611a
            if (r0 == 0) goto L_0x0181
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo708l(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x019b
            goto L_0x018e
        L_0x0181:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x018e:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x019b:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01cb:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00bb
        L_0x01d4:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0088c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0091f fVar = (C0091f) childAt.getLayoutParams();
                if (fVar.mo726a(0) && (cVar = fVar.f611a) != null) {
                    z2 |= cVar.mo709m();
                }
            }
        }
        if (z2) {
            mo678q(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0088c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0091f fVar = (C0091f) childAt.getLayoutParams();
                if (fVar.mo726a(0) && (cVar = fVar.f611a) != null) {
                    z |= cVar.mo710n(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo245n(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo242k(view, i, i2, i3, i4, 0, this.f595h);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo240i(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0093h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0093h hVar = (C0093h) parcelable;
        super.onRestoreInstanceState(hVar.f2988b);
        SparseArray<Parcelable> sparseArray = hVar.f629d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0088c cVar = mo667j(childAt).f611a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.mo717u(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable v;
        C0093h hVar = new C0093h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0088c cVar = ((C0091f) childAt.getLayoutParams()).f611a;
            if (!(id == -1 || cVar == null || (v = cVar.mo718v(this, childAt)) == null)) {
                sparseArray.append(id, v);
            }
        }
        hVar.f629d = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo246o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo244m(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f599l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo689t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f599l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0091f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f611a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f599l
            boolean r6 = r6.mo112A(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.f599l
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.mo691v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean mo677p(View view, int i, int i2) {
        Rect a = m195a();
        mo655f(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            a.setEmpty();
            f588z.mo5054b(a);
        }
    }

    /* renamed from: q */
    public final void mo678q(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        int i11;
        int i12;
        C0091f fVar;
        C0088c cVar;
        int i13 = i;
        int l = C0813m8.m2478l(this);
        int size = this.f589b.size();
        Rect a = m195a();
        Rect a2 = m195a();
        Rect a3 = m195a();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f589b.get(i14);
            C0091f fVar2 = (C0091f) view.getLayoutParams();
            if (i13 == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = a3;
                i2 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (fVar2.f622l == this.f589b.get(i15)) {
                        C0091f fVar3 = (C0091f) view.getLayoutParams();
                        if (fVar3.f621k != null) {
                            Rect a4 = m195a();
                            Rect a5 = m195a();
                            Rect a6 = m195a();
                            mo655f(fVar3.f621k, a4);
                            mo649c(view, false, a5);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i16 = measuredWidth;
                            Rect rect3 = a6;
                            i11 = i14;
                            Rect rect4 = a5;
                            Rect rect5 = a4;
                            C0091f fVar4 = fVar3;
                            i10 = i15;
                            rect2 = a3;
                            fVar = fVar2;
                            mo656g(l, a4, rect3, fVar3, i16, measuredHeight);
                            Rect rect6 = rect3;
                            boolean z4 = (rect6.left == rect4.left && rect6.top == rect4.top) ? false : true;
                            C0091f fVar5 = fVar4;
                            mo648b(fVar5, rect6, i16, measuredHeight);
                            int i17 = rect6.left - rect4.left;
                            int i18 = rect6.top - rect4.top;
                            if (i17 != 0) {
                                C0813m8.m2488v(view, i17);
                            }
                            if (i18 != 0) {
                                C0813m8.m2489w(view, i18);
                            }
                            if (z4 && (cVar = fVar5.f611a) != null) {
                                cVar.mo704g(this, view, fVar5.f621k);
                            }
                            rect5.setEmpty();
                            C1346x7<Rect> x7Var = f588z;
                            x7Var.mo5054b(rect5);
                            rect4.setEmpty();
                            x7Var.mo5054b(rect4);
                            rect6.setEmpty();
                            x7Var.mo5054b(rect6);
                            i15 = i10 + 1;
                            fVar2 = fVar;
                            size = i12;
                            i14 = i11;
                            a3 = rect2;
                        }
                    }
                    i10 = i15;
                    i12 = size;
                    rect2 = a3;
                    i11 = i14;
                    fVar = fVar2;
                    i15 = i10 + 1;
                    fVar2 = fVar;
                    size = i12;
                    i14 = i11;
                    a3 = rect2;
                }
                int i19 = size;
                Rect rect7 = a3;
                i2 = i14;
                C0091f fVar6 = fVar2;
                mo649c(view, true, a2);
                if (fVar6.f617g != 0 && !a2.isEmpty()) {
                    int t = C1344x5.m3775t(fVar6.f617g, l);
                    int i20 = t & 112;
                    if (i20 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i20 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i21 = t & 7;
                    if (i21 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i21 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar6.f618h != 0 && view.getVisibility() == 0 && C0813m8.m2486t(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0091f fVar7 = (C0091f) view.getLayoutParams();
                    C0088c cVar2 = fVar7.f611a;
                    Rect a7 = m195a();
                    Rect a8 = m195a();
                    a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (cVar2 == null || !cVar2.mo698a(this, view, a7)) {
                        a7.set(a8);
                    } else if (!a8.contains(a7)) {
                        StringBuilder c = C0279ch.m1106c("Rect should be within the child's bounds. Rect:");
                        c.append(a7.toShortString());
                        c.append(" | Bounds:");
                        c.append(a8.toShortString());
                        throw new IllegalArgumentException(c.toString());
                    }
                    a8.setEmpty();
                    C1346x7<Rect> x7Var2 = f588z;
                    x7Var2.mo5054b(a8);
                    if (!a7.isEmpty()) {
                        int t2 = C1344x5.m3775t(fVar7.f618h, l);
                        if ((t2 & 48) != 48 || (i8 = (a7.top - fVar7.topMargin) - fVar7.f620j) >= (i9 = a.top)) {
                            z2 = false;
                        } else {
                            mo694x(view, i9 - i8);
                            z2 = true;
                        }
                        if ((t2 & 80) == 80 && (height = ((getHeight() - a7.bottom) - fVar7.bottomMargin) + fVar7.f620j) < (i7 = a.bottom)) {
                            mo694x(view, height - i7);
                            z2 = true;
                        }
                        if (!z2) {
                            mo694x(view, 0);
                        }
                        if ((t2 & 3) != 3 || (i5 = (a7.left - fVar7.leftMargin) - fVar7.f619i) >= (i6 = a.left)) {
                            z3 = false;
                        } else {
                            mo693w(view, i6 - i5);
                            z3 = true;
                        }
                        if ((t2 & 5) == 5 && (width = ((getWidth() - a7.right) - fVar7.rightMargin) + fVar7.f619i) < (i4 = a.right)) {
                            mo693w(view, width - i4);
                            z3 = true;
                        }
                        if (!z3) {
                            mo693w(view, 0);
                        }
                    }
                    a7.setEmpty();
                    x7Var2.mo5054b(a7);
                }
                if (i13 != 2) {
                    rect = rect7;
                    rect.set(((C0091f) view.getLayoutParams()).f627q);
                    if (rect.equals(a2)) {
                        i3 = i19;
                    } else {
                        ((C0091f) view.getLayoutParams()).f627q.set(a2);
                    }
                } else {
                    rect = rect7;
                }
                i3 = i19;
                for (int i22 = i2 + 1; i22 < i3; i22++) {
                    View view2 = this.f589b.get(i22);
                    C0091f fVar8 = (C0091f) view2.getLayoutParams();
                    C0088c cVar3 = fVar8.f611a;
                    if (cVar3 != null && cVar3.mo701d(this, view2, view)) {
                        if (i13 != 0 || !fVar8.f626p) {
                            if (i13 != 2) {
                                z = cVar3.mo704g(this, view2, view);
                            } else {
                                cVar3.mo705h(this, view2, view);
                                z = true;
                            }
                            if (i13 == 1) {
                                fVar8.f626p = z;
                            }
                        } else {
                            fVar8.f626p = false;
                        }
                    }
                }
            }
            i14 = i2 + 1;
            size = i3;
            a3 = rect;
        }
        Rect rect8 = a3;
        a.setEmpty();
        C1346x7<Rect> x7Var3 = f588z;
        x7Var3.mo5054b(a);
        a2.setEmpty();
        x7Var3.mo5054b(a2);
        rect8.setEmpty();
        x7Var3.mo5054b(rect8);
    }

    /* renamed from: r */
    public void mo679r(View view, int i) {
        C0091f fVar = (C0091f) view.getLayoutParams();
        View view2 = fVar.f621k;
        int i2 = 0;
        if (view2 == null && fVar.f616f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a = m195a();
            Rect a2 = m195a();
            try {
                mo655f(view2, a);
                C0091f fVar2 = (C0091f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                mo656g(i, a, a2, fVar2, measuredWidth, measuredHeight);
                mo648b(fVar2, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                a.setEmpty();
                C1346x7<Rect> x7Var = f588z;
                x7Var.mo5054b(a);
                a2.setEmpty();
                x7Var.mo5054b(a2);
            }
        } else {
            int i3 = fVar.f615e;
            if (i3 >= 0) {
                C0091f fVar3 = (C0091f) view.getLayoutParams();
                int i4 = fVar3.f613c;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int t = C1344x5.m3775t(i4, i);
                int i5 = t & 7;
                int i6 = t & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int h = mo666h(i3) - measuredWidth2;
                if (i5 == 1) {
                    h += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    h += measuredWidth2;
                }
                if (i6 == 16) {
                    i2 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i2 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(h, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C0091f fVar4 = (C0091f) view.getLayoutParams();
            Rect a3 = m195a();
            a3.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
            if (this.f603p != null && C0813m8.m2476j(this) && !C0813m8.m2476j(view)) {
                a3.left = this.f603p.mo4842b() + a3.left;
                a3.top = this.f603p.mo4844d() + a3.top;
                a3.right -= this.f603p.mo4843c();
                a3.bottom -= this.f603p.mo4841a();
            }
            Rect a4 = m195a();
            int i7 = fVar4.f613c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            int i8 = i7;
            int measuredWidth3 = view.getMeasuredWidth();
            int measuredHeight3 = view.getMeasuredHeight();
            if (Build.VERSION.SDK_INT >= 17) {
                Gravity.apply(i8, measuredWidth3, measuredHeight3, a3, a4, i);
            } else {
                Gravity.apply(i8, measuredWidth3, measuredHeight3, a3, a4);
            }
            view.layout(a4.left, a4.top, a4.right, a4.bottom);
            a3.setEmpty();
            C1346x7<Rect> x7Var2 = f588z;
            x7Var2.mo5054b(a3);
            a4.setEmpty();
            x7Var2.mo5054b(a4);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0088c cVar = ((C0091f) view.getLayoutParams()).f611a;
        if (cVar == null || !cVar.mo716t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f596i) {
            mo691v(false);
            this.f596i = true;
        }
    }

    /* renamed from: s */
    public void mo682s(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo695y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f606s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f605r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f605r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f605r.setState(getDrawableState());
                }
                C1344x5.m3742X(this.f605r, C0813m8.m2478l(this));
                this.f605r.setVisible(getVisibility() == 0, false);
                this.f605r.setCallback(this);
            }
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0408e6.m1548b(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f605r;
        if (drawable != null && drawable.isVisible() != z) {
            this.f605r.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final boolean mo689t(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f591d;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f587y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            C0091f fVar = (C0091f) view.getLayoutParams();
            C0088c cVar = fVar.f611a;
            boolean z4 = true;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && cVar != null) {
                    if (i2 == 0) {
                        z2 = cVar.mo117j(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z2 = cVar.mo112A(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.f599l = view;
                    }
                }
                C0088c cVar2 = fVar.f611a;
                if (cVar2 == null) {
                    fVar.f623m = false;
                }
                boolean z5 = fVar.f623m;
                if (z5) {
                    z = true;
                } else {
                    z = (cVar2 != null && cVar2.mo700c() > 0.0f) | z5;
                    fVar.f623m = z;
                }
                if (!z || z5) {
                    z4 = false;
                }
                if (z && !z4) {
                    break;
                }
                z3 = z4;
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.mo117j(this, view, motionEvent3);
                } else if (i2 == 1) {
                    cVar.mo112A(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r5 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0160 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0106  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo690u() {
        /*
            r11 = this;
            java.util.List<android.view.View> r0 = r11.f589b
            r0.clear()
            p5<android.view.View> r0 = r11.f590c
            j4<T, java.util.ArrayList<T>> r1 = r0.f3564b
            int r1 = r1.f2827d
            r2 = 0
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x0024
            j4<T, java.util.ArrayList<T>> r4 = r0.f3564b
            java.lang.Object r4 = r4.mo3407k(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0021
            r4.clear()
            x7<java.util.ArrayList<T>> r5 = r0.f3563a
            r5.mo5054b(r4)
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0024:
            j4<T, java.util.ArrayList<T>> r0 = r0.f3564b
            r0.clear()
            int r0 = r11.getChildCount()
            r1 = 0
        L_0x002e:
            if (r1 >= r0) goto L_0x018d
            android.view.View r3 = r11.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r11.mo667j(r3)
            int r5 = r4.f616f
            r6 = -1
            r7 = 0
            if (r5 != r6) goto L_0x0044
            r4.f622l = r7
            r4.f621k = r7
            goto L_0x00c2
        L_0x0044:
            android.view.View r5 = r4.f621k
            if (r5 == 0) goto L_0x0075
            int r5 = r5.getId()
            int r6 = r4.f616f
            if (r5 == r6) goto L_0x0051
            goto L_0x006e
        L_0x0051:
            android.view.View r5 = r4.f621k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0057:
            if (r6 == r11) goto L_0x0070
            if (r6 == 0) goto L_0x006a
            if (r6 != r3) goto L_0x005e
            goto L_0x006a
        L_0x005e:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x0065
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0065:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0057
        L_0x006a:
            r4.f622l = r7
            r4.f621k = r7
        L_0x006e:
            r5 = 0
            goto L_0x0073
        L_0x0070:
            r4.f622l = r5
            r5 = 1
        L_0x0073:
            if (r5 != 0) goto L_0x00c2
        L_0x0075:
            int r5 = r4.f616f
            android.view.View r5 = r11.findViewById(r5)
            r4.f621k = r5
            if (r5 == 0) goto L_0x00b8
            if (r5 != r11) goto L_0x0090
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0088
            goto L_0x00be
        L_0x0088:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0090:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0094:
            if (r6 == r11) goto L_0x00b5
            if (r6 == 0) goto L_0x00b5
            if (r6 != r3) goto L_0x00a9
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x00a1
            goto L_0x00be
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x00b0
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b0:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0094
        L_0x00b5:
            r4.f622l = r5
            goto L_0x00c2
        L_0x00b8:
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0168
        L_0x00be:
            r4.f622l = r7
            r4.f621k = r7
        L_0x00c2:
            p5<android.view.View> r5 = r11.f590c
            r5.mo3971a(r3)
            r5 = 0
        L_0x00c8:
            if (r5 >= r0) goto L_0x0164
            if (r5 != r1) goto L_0x00ce
            goto L_0x0160
        L_0x00ce:
            android.view.View r6 = r11.getChildAt(r5)
            android.view.View r8 = r4.f622l
            if (r6 == r8) goto L_0x0103
            int r8 = p000.C0813m8.m2478l(r11)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0091f) r9
            int r9 = r9.f617g
            int r9 = p000.C1344x5.m3775t(r9, r8)
            if (r9 == 0) goto L_0x00f3
            int r10 = r4.f618h
            int r8 = p000.C1344x5.m3775t(r10, r8)
            r8 = r8 & r9
            if (r8 != r9) goto L_0x00f3
            r8 = 1
            goto L_0x00f4
        L_0x00f3:
            r8 = 0
        L_0x00f4:
            if (r8 != 0) goto L_0x0103
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r8 = r4.f611a
            if (r8 == 0) goto L_0x0101
            boolean r8 = r8.mo701d(r11, r3, r6)
            if (r8 == 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r8 = 0
            goto L_0x0104
        L_0x0103:
            r8 = 1
        L_0x0104:
            if (r8 == 0) goto L_0x0160
            p5<android.view.View> r8 = r11.f590c
            j4<T, java.util.ArrayList<T>> r8 = r8.f3564b
            int r8 = r8.mo3396e(r6)
            if (r8 < 0) goto L_0x0112
            r8 = 1
            goto L_0x0113
        L_0x0112:
            r8 = 0
        L_0x0113:
            if (r8 != 0) goto L_0x011a
            p5<android.view.View> r8 = r11.f590c
            r8.mo3971a(r6)
        L_0x011a:
            p5<android.view.View> r8 = r11.f590c
            j4<T, java.util.ArrayList<T>> r9 = r8.f3564b
            int r9 = r9.mo3396e(r6)
            if (r9 < 0) goto L_0x0126
            r9 = 1
            goto L_0x0127
        L_0x0126:
            r9 = 0
        L_0x0127:
            if (r9 == 0) goto L_0x0158
            j4<T, java.util.ArrayList<T>> r9 = r8.f3564b
            int r9 = r9.mo3396e(r3)
            if (r9 < 0) goto L_0x0133
            r9 = 1
            goto L_0x0134
        L_0x0133:
            r9 = 0
        L_0x0134:
            if (r9 == 0) goto L_0x0158
            j4<T, java.util.ArrayList<T>> r9 = r8.f3564b
            java.lang.Object r9 = r9.getOrDefault(r6, r7)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0154
            x7<java.util.ArrayList<T>> r9 = r8.f3563a
            java.lang.Object r9 = r9.mo5053a()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x014f
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x014f:
            j4<T, java.util.ArrayList<T>> r8 = r8.f3564b
            r8.put(r6, r9)
        L_0x0154:
            r9.add(r3)
            goto L_0x0160
        L_0x0158:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0160:
            int r5 = r5 + 1
            goto L_0x00c8
        L_0x0164:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0168:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = r4.f616f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018d:
            java.util.List<android.view.View> r0 = r11.f589b
            p5<android.view.View> r1 = r11.f590c
            java.util.ArrayList<T> r3 = r1.f3565c
            r3.clear()
            java.util.HashSet<T> r3 = r1.f3566d
            r3.clear()
            j4<T, java.util.ArrayList<T>> r3 = r1.f3564b
            int r3 = r3.f2827d
        L_0x019f:
            if (r2 >= r3) goto L_0x01b1
            j4<T, java.util.ArrayList<T>> r4 = r1.f3564b
            java.lang.Object r4 = r4.mo3402h(r2)
            java.util.ArrayList<T> r5 = r1.f3565c
            java.util.HashSet<T> r6 = r1.f3566d
            r1.mo3972b(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x019f
        L_0x01b1:
            java.util.ArrayList<T> r1 = r1.f3565c
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r11.f589b
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo690u():void");
    }

    /* renamed from: v */
    public final void mo691v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0088c cVar = ((C0091f) childAt.getLayoutParams()).f611a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.mo117j(this, childAt, obtain);
                } else {
                    cVar.mo112A(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0091f) getChildAt(i2).getLayoutParams()).f623m = false;
        }
        this.f599l = null;
        this.f596i = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f605r;
    }

    /* renamed from: w */
    public final void mo693w(View view, int i) {
        C0091f fVar = (C0091f) view.getLayoutParams();
        int i2 = fVar.f619i;
        if (i2 != i) {
            C0813m8.m2488v(view, i - i2);
            fVar.f619i = i;
        }
    }

    /* renamed from: x */
    public final void mo694x(View view, int i) {
        C0091f fVar = (C0091f) view.getLayoutParams();
        int i2 = fVar.f620j;
        if (i2 != i) {
            C0813m8.m2489w(view, i - i2);
            fVar.f620j = i;
        }
    }

    /* renamed from: y */
    public final void mo695y() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0813m8.m2476j(this)) {
                if (this.f607t == null) {
                    this.f607t = new C0086a();
                }
                C0813m8.m2463L(this, this.f607t);
                setSystemUiVisibility(1280);
                return;
            }
            C0813m8.m2463L(this, (C0668j8) null);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0091f) {
            return new C0091f((C0091f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0091f((ViewGroup.MarginLayoutParams) layoutParams) : new C0091f(layoutParams);
    }
}
