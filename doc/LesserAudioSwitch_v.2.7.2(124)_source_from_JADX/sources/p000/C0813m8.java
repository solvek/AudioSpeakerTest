package p000;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C1347x8;
import p000.C1444z7;

/* renamed from: m8 */
public class C0813m8 {

    /* renamed from: a */
    public static Field f3234a;

    /* renamed from: b */
    public static boolean f3235b;

    /* renamed from: c */
    public static Field f3236c;

    /* renamed from: d */
    public static boolean f3237d;

    /* renamed from: e */
    public static WeakHashMap<View, String> f3238e;

    /* renamed from: f */
    public static WeakHashMap<View, C1049r8> f3239f = null;

    /* renamed from: g */
    public static Field f3240g;

    /* renamed from: h */
    public static boolean f3241h = false;

    /* renamed from: i */
    public static ThreadLocal<Rect> f3242i;

    /* renamed from: m8$a */
    public class C0814a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ C0668j8 f3243a;

        public C0814a(C0668j8 j8Var) {
            this.f3243a = j8Var;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            windowInsets.getClass();
            return this.f3243a.mo696a(view, new C1241v8(windowInsets)).mo4847g();
        }
    }

    /* renamed from: m8$b */
    public static abstract class C0815b<T> {

        /* renamed from: a */
        public final int f3244a;

        /* renamed from: b */
        public final Class<T> f3245b;

        /* renamed from: c */
        public final int f3246c;

        public C0815b(int i, Class<T> cls, int i2) {
            this.f3244a = i;
            this.f3245b = cls;
            this.f3246c = i2;
        }

        public C0815b(int i, Class<T> cls, int i2, int i3) {
            this.f3244a = i;
            this.f3245b = cls;
            this.f3246c = i3;
        }

        /* renamed from: a */
        public boolean mo3667a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* renamed from: b */
        public abstract T mo3668b(View view);

        /* renamed from: c */
        public T mo3669c(View view) {
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            if (i >= this.f3246c) {
                return mo3668b(view);
            }
            if (i >= 19) {
                z = true;
            }
            if (!z) {
                return null;
            }
            T tag = view.getTag(this.f3244a);
            if (this.f3245b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    /* renamed from: m8$c */
    public interface C0816c {
        /* renamed from: a */
        boolean mo3670a(View view, KeyEvent keyEvent);
    }

    /* renamed from: m8$d */
    public static class C0817d {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f3247d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f3248a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f3249b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f3250c = null;

        /* renamed from: a */
        public final View mo3671a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3248a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a = mo3671a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a != null) {
                            return a;
                        }
                    }
                }
                if (mo3672b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo3672b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0816c) arrayList.get(size)).mo3670a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    /* renamed from: A */
    public static void m2452A(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2453B(i, view);
            m2487u(view, 0);
        }
    }

    /* renamed from: B */
    public static void m2453B(int i, View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((C1347x8.C1348a) arrayList.get(i2)).mo5067a() == i) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    /* renamed from: C */
    public static void m2454C(View view, C1347x8.C1348a aVar, CharSequence charSequence, C1446z8 z8Var) {
        C1347x8.C1348a aVar2 = new C1347x8.C1348a((Object) null, aVar.f5050b, (CharSequence) null, z8Var, aVar.f5051c);
        if (Build.VERSION.SDK_INT >= 21) {
            C1444z7 e = m2471e(view);
            if (e == null) {
                e = new C1444z7();
            }
            m2457F(view, e);
            m2453B(aVar2.mo5067a(), view);
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
            if (arrayList == null) {
                arrayList = new ArrayList();
                view.setTag(R.id.tag_accessibility_actions, arrayList);
            }
            arrayList.add(aVar2);
            m2487u(view, 0);
        }
    }

    /* renamed from: D */
    public static void m2455D(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: E */
    public static void m2456E(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: F */
    public static void m2457F(View view, C1444z7 z7Var) {
        if (z7Var == null && (m2472f(view) instanceof C1444z7.C1445a)) {
            z7Var = new C1444z7();
        }
        view.setAccessibilityDelegate(z7Var == null ? null : z7Var.f5274b);
    }

    /* renamed from: G */
    public static void m2458G(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: H */
    public static void m2459H(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: I */
    public static void m2460I(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: J */
    public static void m2461J(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: K */
    public static void m2462K(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: L */
    public static void m2463L(View view, C0668j8 j8Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (j8Var == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new C0814a(j8Var));
        }
    }

    /* renamed from: M */
    public static void m2464M(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: N */
    public static void m2465N(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3238e == null) {
            f3238e = new WeakHashMap<>();
        }
        f3238e.put(view, str);
    }

    /* renamed from: O */
    public static void m2466O(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static C1049r8 m2467a(View view) {
        if (f3239f == null) {
            f3239f = new WeakHashMap<>();
        }
        C1049r8 r8Var = f3239f.get(view);
        if (r8Var != null) {
            return r8Var;
        }
        C1049r8 r8Var2 = new C1049r8(view);
        f3239f.put(view, r8Var2);
        return r8Var2;
    }

    /* renamed from: b */
    public static void m2468b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2466O((View) parent);
            }
        }
    }

    /* renamed from: c */
    public static void m2469c(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2466O((View) parent);
            }
        }
    }

    /* renamed from: d */
    public static boolean m2470d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C0817d.f3247d;
        C0817d dVar = (C0817d) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (dVar == null) {
            dVar = new C0817d();
            view.setTag(R.id.tag_unhandled_key_event_manager, dVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = dVar.f3248a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = C0817d.f3247d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (dVar.f3248a == null) {
                        dVar.f3248a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = C0817d.f3247d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            dVar.f3248a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                dVar.f3248a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a = dVar.mo3671a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (dVar.f3249b == null) {
                    dVar.f3249b = new SparseArray<>();
                }
                dVar.f3249b.put(keyCode, new WeakReference(a));
            }
        }
        if (a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static C1444z7 m2471e(View view) {
        View.AccessibilityDelegate f = m2472f(view);
        if (f == null) {
            return null;
        }
        return f instanceof C1444z7.C1445a ? ((C1444z7.C1445a) f).f5275a : new C1444z7(f);
    }

    /* renamed from: f */
    public static View.AccessibilityDelegate m2472f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f3241h) {
            return null;
        }
        if (f3240g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3240g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3241h = true;
                return null;
            }
        }
        Object obj = f3240g.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    /* renamed from: g */
    public static ColorStateList m2473g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C0761l8) {
            return ((C0761l8) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: h */
    public static float m2474h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: i */
    public static Rect m2475i() {
        if (f3242i == null) {
            f3242i = new ThreadLocal<>();
        }
        Rect rect = f3242i.get();
        if (rect == null) {
            rect = new Rect();
            f3242i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: j */
    public static boolean m2476j(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: k */
    public static int m2477k(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: l */
    public static int m2478l(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: m */
    public static int m2479m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f3237d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3236c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3237d = true;
        }
        Field field = f3236c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: n */
    public static int m2480n(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f3235b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3234a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3235b = true;
        }
        Field field = f3234a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: o */
    public static int m2481o(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: p */
    public static int m2482p(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: q */
    public static String m2483q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f3238e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: r */
    public static int m2484r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: s */
    public static boolean m2485s(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: t */
    public static boolean m2486t(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: u */
    public static void m2487u(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            int i2 = 0;
            boolean z = ((CharSequence) new C0919o8(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).mo3669c(view)) != null;
            if (Build.VERSION.SDK_INT >= 19) {
                i2 = view.getAccessibilityLiveRegion();
            }
            if (i2 != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass().getSimpleName();
                }
            }
        }
    }

    /* renamed from: v */
    public static void m2488v(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect i3 = m2475i();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                i3.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !i3.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2468b(view, i);
            if (z && i3.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(i3);
            }
        } else {
            m2468b(view, i);
        }
    }

    /* renamed from: w */
    public static void m2489w(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect i3 = m2475i();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                i3.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !i3.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2469c(view, i);
            if (z && i3.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(i3);
            }
        } else {
            m2469c(view, i);
        }
    }

    /* renamed from: x */
    public static void m2490x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: y */
    public static void m2491y(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: z */
    public static void m2492z(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }
}
