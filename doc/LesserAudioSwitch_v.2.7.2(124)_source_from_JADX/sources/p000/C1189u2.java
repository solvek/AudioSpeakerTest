package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: u2 */
public class C1189u2 implements C0597i1 {

    /* renamed from: B */
    public static Method f4544B;

    /* renamed from: C */
    public static Method f4545C;

    /* renamed from: D */
    public static Method f4546D;

    /* renamed from: A */
    public PopupWindow f4547A;

    /* renamed from: b */
    public Context f4548b;

    /* renamed from: c */
    public ListAdapter f4549c;

    /* renamed from: d */
    public C0951p2 f4550d;

    /* renamed from: e */
    public int f4551e = -2;

    /* renamed from: f */
    public int f4552f = -2;

    /* renamed from: g */
    public int f4553g;

    /* renamed from: h */
    public int f4554h;

    /* renamed from: i */
    public int f4555i = 1002;

    /* renamed from: j */
    public boolean f4556j;

    /* renamed from: k */
    public boolean f4557k;

    /* renamed from: l */
    public boolean f4558l;

    /* renamed from: m */
    public int f4559m = 0;

    /* renamed from: n */
    public int f4560n = Integer.MAX_VALUE;

    /* renamed from: o */
    public int f4561o = 0;

    /* renamed from: p */
    public DataSetObserver f4562p;

    /* renamed from: q */
    public View f4563q;

    /* renamed from: r */
    public AdapterView.OnItemClickListener f4564r;

    /* renamed from: s */
    public final C1194e f4565s = new C1194e();

    /* renamed from: t */
    public final C1193d f4566t = new C1193d();

    /* renamed from: u */
    public final C1192c f4567u = new C1192c();

    /* renamed from: v */
    public final C1190a f4568v = new C1190a();

    /* renamed from: w */
    public final Handler f4569w;

    /* renamed from: x */
    public final Rect f4570x = new Rect();

    /* renamed from: y */
    public Rect f4571y;

    /* renamed from: z */
    public boolean f4572z;

    /* renamed from: u2$a */
    public class C1190a implements Runnable {
        public C1190a() {
        }

        public void run() {
            C0951p2 p2Var = C1189u2.this.f4550d;
            if (p2Var != null) {
                p2Var.setListSelectionHidden(true);
                p2Var.requestLayout();
            }
        }
    }

    /* renamed from: u2$b */
    public class C1191b extends DataSetObserver {
        public C1191b() {
        }

        public void onChanged() {
            if (C1189u2.this.mo3108a()) {
                C1189u2.this.mo3111i();
            }
        }

        public void onInvalidated() {
            C1189u2.this.dismiss();
        }
    }

    /* renamed from: u2$c */
    public class C1192c implements AbsListView.OnScrollListener {
        public C1192c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (C1189u2.this.f4547A.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && C1189u2.this.f4547A.getContentView() != null) {
                    C1189u2 u2Var = C1189u2.this;
                    u2Var.f4569w.removeCallbacks(u2Var.f4565s);
                    C1189u2.this.f4565s.run();
                }
            }
        }
    }

    /* renamed from: u2$d */
    public class C1193d implements View.OnTouchListener {
        public C1193d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C1189u2.this.f4547A) != null && popupWindow.isShowing() && x >= 0 && x < C1189u2.this.f4547A.getWidth() && y >= 0 && y < C1189u2.this.f4547A.getHeight()) {
                C1189u2 u2Var = C1189u2.this;
                u2Var.f4569w.postDelayed(u2Var.f4565s, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C1189u2 u2Var2 = C1189u2.this;
                u2Var2.f4569w.removeCallbacks(u2Var2.f4565s);
                return false;
            }
        }
    }

    /* renamed from: u2$e */
    public class C1194e implements Runnable {
        public C1194e() {
        }

        public void run() {
            C0951p2 p2Var = C1189u2.this.f4550d;
            if (p2Var != null && C0813m8.m2485s(p2Var) && C1189u2.this.f4550d.getCount() > C1189u2.this.f4550d.getChildCount()) {
                int childCount = C1189u2.this.f4550d.getChildCount();
                C1189u2 u2Var = C1189u2.this;
                if (childCount <= u2Var.f4560n) {
                    u2Var.f4547A.setInputMethodMode(2);
                    C1189u2.this.mo3111i();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f4544B = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f4546D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f4545C = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C1189u2(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4548b = context;
        this.f4569w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0440f.f2061o, i, i2);
        this.f4553g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4554h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4556j = true;
        }
        obtainStyledAttributes.recycle();
        C1438z1 z1Var = new C1438z1(context, attributeSet, i, i2);
        this.f4547A = z1Var;
        z1Var.setInputMethodMode(1);
    }

    /* renamed from: a */
    public boolean mo3108a() {
        return this.f4547A.isShowing();
    }

    /* renamed from: c */
    public void mo4743c(int i) {
        this.f4553g = i;
    }

    /* renamed from: d */
    public int mo4744d() {
        return this.f4553g;
    }

    public void dismiss() {
        this.f4547A.dismiss();
        this.f4547A.setContentView((View) null);
        this.f4550d = null;
        this.f4569w.removeCallbacks(this.f4565s);
    }

    /* renamed from: e */
    public ListView mo3110e() {
        return this.f4550d;
    }

    /* renamed from: i */
    public void mo3111i() {
        int i;
        int i2;
        int i3;
        C0951p2 p2Var;
        int i4;
        if (this.f4550d == null) {
            C0951p2 q = mo4749q(this.f4548b, !this.f4572z);
            this.f4550d = q;
            q.setAdapter(this.f4549c);
            this.f4550d.setOnItemClickListener(this.f4564r);
            this.f4550d.setFocusable(true);
            this.f4550d.setFocusableInTouchMode(true);
            this.f4550d.setOnItemSelectedListener(new C1140t2(this));
            this.f4550d.setOnScrollListener(this.f4567u);
            this.f4547A.setContentView(this.f4550d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f4547A.getContentView();
        }
        Drawable background = this.f4547A.getBackground();
        int i5 = 0;
        if (background != null) {
            background.getPadding(this.f4570x);
            Rect rect = this.f4570x;
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.f4556j) {
                this.f4554h = -i6;
            }
        } else {
            this.f4570x.setEmpty();
            i = 0;
        }
        boolean z = this.f4547A.getInputMethodMode() == 2;
        View view = this.f4563q;
        int i7 = this.f4554h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f4545C;
            if (method != null) {
                try {
                    i2 = ((Integer) method.invoke(this.f4547A, new Object[]{view, Integer.valueOf(i7), Boolean.valueOf(z)})).intValue();
                } catch (Exception unused) {
                }
            }
            i2 = this.f4547A.getMaxAvailableHeight(view, i7);
        } else {
            i2 = this.f4547A.getMaxAvailableHeight(view, i7, z);
        }
        if (this.f4551e == -1) {
            i3 = i2 + i;
        } else {
            int i8 = this.f4552f;
            if (i8 != -2) {
                i4 = 1073741824;
                if (i8 == -1) {
                    int i9 = this.f4548b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f4570x;
                    i8 = i9 - (rect2.left + rect2.right);
                }
            } else {
                int i10 = this.f4548b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f4570x;
                i8 = i10 - (rect3.left + rect3.right);
                i4 = Integer.MIN_VALUE;
            }
            int a = this.f4550d.mo3934a(View.MeasureSpec.makeMeasureSpec(i8, i4), i2 - 0, -1);
            i3 = a + (a > 0 ? this.f4550d.getPaddingBottom() + this.f4550d.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.f4547A.getInputMethodMode() == 2;
        C1344x5.m3756f0(this.f4547A, this.f4555i);
        if (!this.f4547A.isShowing()) {
            int i11 = this.f4552f;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.f4563q.getWidth();
            }
            int i12 = this.f4551e;
            if (i12 == -1) {
                i3 = -1;
            } else if (i12 != -2) {
                i3 = i12;
            }
            this.f4547A.setWidth(i11);
            this.f4547A.setHeight(i3);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = f4544B;
                if (method2 != null) {
                    try {
                        method2.invoke(this.f4547A, new Object[]{Boolean.TRUE});
                    } catch (Exception unused2) {
                    }
                }
            } else {
                this.f4547A.setIsClippedToScreen(true);
            }
            this.f4547A.setOutsideTouchable(true);
            this.f4547A.setTouchInterceptor(this.f4566t);
            if (this.f4558l) {
                C1344x5.m3744Z(this.f4547A, this.f4557k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method3 = f4546D;
                if (method3 != null) {
                    try {
                        method3.invoke(this.f4547A, new Object[]{this.f4571y});
                    } catch (Exception unused3) {
                    }
                }
            } else {
                this.f4547A.setEpicenterBounds(this.f4571y);
            }
            PopupWindow popupWindow = this.f4547A;
            View view2 = this.f4563q;
            int i13 = this.f4553g;
            int i14 = this.f4554h;
            int i15 = this.f4559m;
            if (Build.VERSION.SDK_INT >= 19) {
                popupWindow.showAsDropDown(view2, i13, i14, i15);
            } else {
                if ((C1344x5.m3775t(i15, C0813m8.m2478l(view2)) & 7) == 5) {
                    i13 -= popupWindow.getWidth() - view2.getWidth();
                }
                popupWindow.showAsDropDown(view2, i13, i14);
            }
            this.f4550d.setSelection(-1);
            if ((!this.f4572z || this.f4550d.isInTouchMode()) && (p2Var = this.f4550d) != null) {
                p2Var.setListSelectionHidden(true);
                p2Var.requestLayout();
            }
            if (!this.f4572z) {
                this.f4569w.post(this.f4568v);
            }
        } else if (C0813m8.m2485s(this.f4563q)) {
            int i16 = this.f4552f;
            if (i16 == -1) {
                i16 = -1;
            } else if (i16 == -2) {
                i16 = this.f4563q.getWidth();
            }
            int i17 = this.f4551e;
            if (i17 == -1) {
                if (!z2) {
                    i3 = -1;
                }
                if (z2) {
                    this.f4547A.setWidth(this.f4552f == -1 ? -1 : 0);
                    this.f4547A.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.f4547A;
                    if (this.f4552f == -1) {
                        i5 = -1;
                    }
                    popupWindow2.setWidth(i5);
                    this.f4547A.setHeight(-1);
                }
            } else if (i17 != -2) {
                i3 = i17;
            }
            this.f4547A.setOutsideTouchable(true);
            this.f4547A.update(this.f4563q, this.f4553g, this.f4554h, i16 < 0 ? -1 : i16, i3 < 0 ? -1 : i3);
        }
    }

    /* renamed from: j */
    public int mo4745j() {
        if (!this.f4556j) {
            return 0;
        }
        return this.f4554h;
    }

    /* renamed from: l */
    public void mo4746l(Drawable drawable) {
        this.f4547A.setBackgroundDrawable(drawable);
    }

    /* renamed from: m */
    public void mo4747m(int i) {
        this.f4554h = i;
        this.f4556j = true;
    }

    /* renamed from: n */
    public Drawable mo4748n() {
        return this.f4547A.getBackground();
    }

    /* renamed from: o */
    public void mo2898o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f4562p;
        if (dataSetObserver == null) {
            this.f4562p = new C1191b();
        } else {
            ListAdapter listAdapter2 = this.f4549c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f4549c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4562p);
        }
        C0951p2 p2Var = this.f4550d;
        if (p2Var != null) {
            p2Var.setAdapter(this.f4549c);
        }
    }

    /* renamed from: q */
    public C0951p2 mo4749q(Context context, boolean z) {
        return new C0951p2(context, z);
    }

    /* renamed from: r */
    public void mo4750r(int i) {
        Drawable background = this.f4547A.getBackground();
        if (background != null) {
            background.getPadding(this.f4570x);
            Rect rect = this.f4570x;
            this.f4552f = rect.left + rect.right + i;
            return;
        }
        this.f4552f = i;
    }

    /* renamed from: s */
    public void mo4751s(boolean z) {
        this.f4572z = z;
        this.f4547A.setFocusable(z);
    }
}
