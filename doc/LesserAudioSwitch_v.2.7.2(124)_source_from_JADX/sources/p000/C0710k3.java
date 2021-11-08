package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Method;

/* renamed from: k3 */
public class C0710k3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static C0710k3 f2962k;

    /* renamed from: l */
    public static C0710k3 f2963l;

    /* renamed from: b */
    public final View f2964b;

    /* renamed from: c */
    public final CharSequence f2965c;

    /* renamed from: d */
    public final int f2966d;

    /* renamed from: e */
    public final Runnable f2967e = new C0711a();

    /* renamed from: f */
    public final Runnable f2968f = new C0712b();

    /* renamed from: g */
    public int f2969g;

    /* renamed from: h */
    public int f2970h;

    /* renamed from: i */
    public C0754l3 f2971i;

    /* renamed from: j */
    public boolean f2972j;

    /* renamed from: k3$a */
    public class C0711a implements Runnable {
        public C0711a() {
        }

        public void run() {
            C0710k3.this.mo3507d(false);
        }
    }

    /* renamed from: k3$b */
    public class C0712b implements Runnable {
        public C0712b() {
        }

        public void run() {
            C0710k3.this.mo3506b();
        }
    }

    public C0710k3(View view, CharSequence charSequence) {
        this.f2964b = view;
        this.f2965c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C1007q8.f3781a;
        this.f2966d = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        mo3505a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: c */
    public static void m2233c(C0710k3 k3Var) {
        C0710k3 k3Var2 = f2962k;
        if (k3Var2 != null) {
            k3Var2.f2964b.removeCallbacks(k3Var2.f2967e);
        }
        f2962k = k3Var;
        if (k3Var != null) {
            k3Var.f2964b.postDelayed(k3Var.f2967e, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void mo3505a() {
        this.f2969g = Integer.MAX_VALUE;
        this.f2970h = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public void mo3506b() {
        if (f2963l == this) {
            f2963l = null;
            C0754l3 l3Var = this.f2971i;
            if (l3Var != null) {
                l3Var.mo3581a();
                this.f2971i = null;
                mo3505a();
                this.f2964b.removeOnAttachStateChangeListener(this);
            }
        }
        if (f2962k == this) {
            m2233c((C0710k3) null);
        }
        this.f2964b.removeCallbacks(this.f2968f);
    }

    /* renamed from: d */
    public void mo3507d(boolean z) {
        int i;
        int i2;
        long j;
        if (C0813m8.m2485s(this.f2964b)) {
            m2233c((C0710k3) null);
            C0710k3 k3Var = f2963l;
            if (k3Var != null) {
                k3Var.mo3506b();
            }
            f2963l = this;
            this.f2972j = z;
            C0754l3 l3Var = new C0754l3(this.f2964b.getContext());
            this.f2971i = l3Var;
            View view = this.f2964b;
            int i3 = this.f2969g;
            int i4 = this.f2970h;
            boolean z2 = this.f2972j;
            CharSequence charSequence = this.f2965c;
            if (l3Var.f3089b.getParent() != null) {
                l3Var.mo3581a();
            }
            l3Var.f3090c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = l3Var.f3091d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = l3Var.f3088a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i3 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = l3Var.f3088a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = l3Var.f3088a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(l3Var.f3092e);
                Rect rect = l3Var.f3092e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = l3Var.f3088a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    l3Var.f3092e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(l3Var.f3094g);
                view.getLocationOnScreen(l3Var.f3093f);
                int[] iArr = l3Var.f3093f;
                int i5 = iArr[0];
                int[] iArr2 = l3Var.f3094g;
                iArr[0] = i5 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                l3Var.f3089b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = l3Var.f3089b.getMeasuredHeight();
                int[] iArr3 = l3Var.f3093f;
                int i6 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = iArr3[1] + i + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i7 > l3Var.f3092e.height() : i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) l3Var.f3088a.getSystemService("window")).addView(l3Var.f3089b, l3Var.f3091d);
            this.f2964b.addOnAttachStateChangeListener(this);
            if (this.f2972j) {
                j = 2500;
            } else {
                j = ((C0813m8.m2484r(this.f2964b) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f2964b.removeCallbacks(this.f2968f);
            this.f2964b.postDelayed(this.f2968f, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f2971i != null && this.f2972j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2964b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                mo3505a();
                mo3506b();
            }
        } else if (this.f2964b.isEnabled() && this.f2971i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f2969g) > this.f2966d || Math.abs(y - this.f2970h) > this.f2966d) {
                this.f2969g = x;
                this.f2970h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m2233c(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2969g = view.getWidth() / 2;
        this.f2970h = view.getHeight() / 2;
        mo3507d(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo3506b();
    }
}
