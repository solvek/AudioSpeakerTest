package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import p000.C1067rl;
import p000.C1217ul;

/* renamed from: mm */
public class C0836mm extends C1070rm {

    /* renamed from: q */
    public static final boolean f3294q = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: d */
    public final TextWatcher f3295d = new C0837a();

    /* renamed from: e */
    public final View.OnFocusChangeListener f3296e = new C0839b();

    /* renamed from: f */
    public final TextInputLayout.C0329e f3297f = new C0840c(this.f4024a);

    /* renamed from: g */
    public final TextInputLayout.C0330f f3298g = new C0841d();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    public final TextInputLayout.C0331g f3299h = new C0842e();

    /* renamed from: i */
    public boolean f3300i = false;

    /* renamed from: j */
    public boolean f3301j = false;

    /* renamed from: k */
    public long f3302k = Long.MAX_VALUE;

    /* renamed from: l */
    public StateListDrawable f3303l;

    /* renamed from: m */
    public C1067rl f3304m;

    /* renamed from: n */
    public AccessibilityManager f3305n;

    /* renamed from: o */
    public ValueAnimator f3306o;

    /* renamed from: p */
    public ValueAnimator f3307p;

    /* renamed from: mm$a */
    public class C0837a implements TextWatcher {

        /* renamed from: mm$a$a */
        public class C0838a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f3309b;

            public C0838a(AutoCompleteTextView autoCompleteTextView) {
                this.f3309b = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f3309b.isPopupShowing();
                C0836mm.m2534f(C0836mm.this, isPopupShowing);
                C0836mm.this.f3300i = isPopupShowing;
            }
        }

        public C0837a() {
        }

        public void afterTextChanged(Editable editable) {
            C0836mm mmVar = C0836mm.this;
            AutoCompleteTextView e = C0836mm.m2533e(mmVar, mmVar.f4024a.getEditText());
            e.post(new C0838a(e));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: mm$b */
    public class C0839b implements View.OnFocusChangeListener {
        public C0839b() {
        }

        public void onFocusChange(View view, boolean z) {
            C0836mm.this.f4024a.setEndIconActivated(z);
            if (!z) {
                C0836mm.m2534f(C0836mm.this, false);
                C0836mm.this.f3300i = false;
            }
        }
    }

    /* renamed from: mm$c */
    public class C0840c extends TextInputLayout.C0329e {
        public C0840c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            boolean z;
            super.mo817d(view, x8Var);
            if (C0836mm.this.f4024a.getEditText().getKeyListener() == null) {
                x8Var.f5038a.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z = x8Var.f5038a.isShowingHintText();
            } else {
                Bundle f = x8Var.mo5059f();
                z = f != null && (f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                x8Var.mo5065k((CharSequence) null);
            }
        }

        /* renamed from: e */
        public void mo3713e(View view, AccessibilityEvent accessibilityEvent) {
            this.f5273a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            C0836mm mmVar = C0836mm.this;
            AutoCompleteTextView e = C0836mm.m2533e(mmVar, mmVar.f4024a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C0836mm.this.f3305n.isTouchExplorationEnabled()) {
                C0836mm.m2535g(C0836mm.this, e);
            }
        }
    }

    /* renamed from: mm$d */
    public class C0841d implements TextInputLayout.C0330f {
        public C0841d() {
        }

        /* renamed from: a */
        public void mo2505a(TextInputLayout textInputLayout) {
            LayerDrawable layerDrawable;
            Drawable drawable;
            AutoCompleteTextView e = C0836mm.m2533e(C0836mm.this, textInputLayout.getEditText());
            C0836mm mmVar = C0836mm.this;
            mmVar.getClass();
            boolean z = C0836mm.f3294q;
            if (z) {
                int boxBackgroundMode = mmVar.f4024a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    drawable = mmVar.f3304m;
                } else if (boxBackgroundMode == 1) {
                    drawable = mmVar.f3303l;
                }
                e.setDropDownBackgroundDrawable(drawable);
            }
            C0836mm mmVar2 = C0836mm.this;
            mmVar2.getClass();
            if (e.getKeyListener() == null) {
                int boxBackgroundMode2 = mmVar2.f4024a.getBoxBackgroundMode();
                C1067rl boxBackground = mmVar2.f4024a.getBoxBackground();
                int j = C0728kh.m2294j(e, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{16842919}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int j2 = C0728kh.m2294j(e, R.attr.colorSurface);
                    C1067rl rlVar = new C1067rl(boxBackground.f3979b.f4002a);
                    int v = C0728kh.m2306v(j, j2, 0.1f);
                    rlVar.mo4300p(new ColorStateList(iArr, new int[]{v, 0}));
                    if (z) {
                        rlVar.setTint(j2);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{v, j2});
                        C1067rl rlVar2 = new C1067rl(boxBackground.f3979b.f4002a);
                        rlVar2.setTint(-1);
                        layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, rlVar, rlVar2), boxBackground});
                    } else {
                        layerDrawable = new LayerDrawable(new Drawable[]{rlVar, boxBackground});
                    }
                    Field field = C0813m8.f3234a;
                    if (Build.VERSION.SDK_INT >= 16) {
                        e.setBackground(layerDrawable);
                    } else {
                        e.setBackgroundDrawable(layerDrawable);
                    }
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = mmVar2.f4024a.getBoxBackgroundColor();
                    int[] iArr2 = {C0728kh.m2306v(j, boxBackgroundColor, 0.1f), boxBackgroundColor};
                    if (z) {
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                        Field field2 = C0813m8.f3234a;
                        if (Build.VERSION.SDK_INT >= 16) {
                            e.setBackground(rippleDrawable);
                        } else {
                            e.setBackgroundDrawable(rippleDrawable);
                        }
                    } else {
                        C1067rl rlVar3 = new C1067rl(boxBackground.f3979b.f4002a);
                        rlVar3.mo4300p(new ColorStateList(iArr, iArr2));
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, rlVar3});
                        int p = C0813m8.m2482p(e);
                        int paddingTop = e.getPaddingTop();
                        int o = C0813m8.m2481o(e);
                        int paddingBottom = e.getPaddingBottom();
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 16) {
                            e.setBackground(layerDrawable2);
                        } else {
                            e.setBackgroundDrawable(layerDrawable2);
                        }
                        if (i >= 17) {
                            e.setPaddingRelative(p, paddingTop, o, paddingBottom);
                        } else {
                            e.setPadding(p, paddingTop, o, paddingBottom);
                        }
                    }
                }
            }
            C0836mm mmVar3 = C0836mm.this;
            mmVar3.getClass();
            e.setOnTouchListener(new C0934om(mmVar3, e));
            e.setOnFocusChangeListener(mmVar3.f3296e);
            if (z) {
                e.setOnDismissListener(new C0983pm(mmVar3));
            }
            e.setThreshold(0);
            e.removeTextChangedListener(C0836mm.this.f3295d);
            e.addTextChangedListener(C0836mm.this.f3295d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C0836mm.this.f3297f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: mm$e */
    public class C0842e implements TextInputLayout.C0331g {
        public C0842e() {
        }

        /* renamed from: a */
        public void mo2506a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.removeTextChangedListener(C0836mm.this.f3295d);
                if (autoCompleteTextView.getOnFocusChangeListener() == C0836mm.this.f3296e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (C0836mm.f3294q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    /* renamed from: mm$f */
    public class C0843f implements View.OnClickListener {
        public C0843f() {
        }

        public void onClick(View view) {
            C0836mm.m2535g(C0836mm.this, (AutoCompleteTextView) C0836mm.this.f4024a.getEditText());
        }
    }

    public C0836mm(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: e */
    public static AutoCompleteTextView m2533e(C0836mm mmVar, EditText editText) {
        mmVar.getClass();
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: f */
    public static void m2534f(C0836mm mmVar, boolean z) {
        if (mmVar.f3301j != z) {
            mmVar.f3301j = z;
            mmVar.f3307p.cancel();
            mmVar.f3306o.start();
        }
    }

    /* renamed from: g */
    public static void m2535g(C0836mm mmVar, AutoCompleteTextView autoCompleteTextView) {
        mmVar.getClass();
        if (autoCompleteTextView != null) {
            if (mmVar.mo3707i()) {
                mmVar.f3300i = false;
            }
            if (!mmVar.f3300i) {
                if (f3294q) {
                    boolean z = mmVar.f3301j;
                    boolean z2 = !z;
                    if (z != z2) {
                        mmVar.f3301j = z2;
                        mmVar.f3307p.cancel();
                        mmVar.f3306o.start();
                    }
                } else {
                    mmVar.f3301j = !mmVar.f3301j;
                    mmVar.f4026c.toggle();
                }
                if (mmVar.f3301j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            mmVar.f3300i = false;
        }
    }

    /* renamed from: a */
    public void mo2797a() {
        float dimensionPixelOffset = (float) this.f4025b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f4025b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f4025b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1067rl h = mo3706h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1067rl h2 = mo3706h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f3304m = h;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f3303l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, h);
        this.f3303l.addState(new int[0], h2);
        this.f4024a.setEndIconDrawable(C0399e0.m1530b(this.f4025b, f3294q ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f4024a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f4024a.setEndIconOnClickListener(new C0843f());
        this.f4024a.mo2340a(this.f3298g);
        this.f4024a.f1669g0.add(this.f3299h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = C0831mh.f3286a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new C0891nm(this));
        this.f3307p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new C0891nm(this));
        this.f3306o = ofFloat2;
        ofFloat2.addListener(new C1026qm(this));
        C0813m8.m2462K(this.f4026c, 2);
        this.f3305n = (AccessibilityManager) this.f4025b.getSystemService("accessibility");
    }

    /* renamed from: b */
    public boolean mo3704b(int i) {
        return i != 0;
    }

    /* renamed from: d */
    public boolean mo3705d() {
        return true;
    }

    /* renamed from: h */
    public final C1067rl mo3706h(float f, float f2, float f3, int i) {
        C1217ul.C1219b bVar = new C1217ul.C1219b();
        bVar.f4663e = new C0785ll(f);
        bVar.f4664f = new C0785ll(f);
        bVar.f4666h = new C0785ll(f2);
        bVar.f4665g = new C0785ll(f2);
        C1217ul a = bVar.mo4783a();
        Context context = this.f4025b;
        String str = C1067rl.f3977x;
        int D = C0728kh.m2275D(context, R.attr.colorSurface, C1067rl.class.getSimpleName());
        C1067rl rlVar = new C1067rl();
        rlVar.f3979b.f4003b = new C0383dk(context);
        rlVar.mo4309w();
        rlVar.mo4300p(ColorStateList.valueOf(D));
        C1067rl.C1069b bVar2 = rlVar.f3979b;
        if (bVar2.f4016o != f3) {
            bVar2.f4016o = f3;
            rlVar.mo4309w();
        }
        rlVar.f3979b.f4002a = a;
        rlVar.invalidateSelf();
        C1067rl.C1069b bVar3 = rlVar.f3979b;
        if (bVar3.f4010i == null) {
            bVar3.f4010i = new Rect();
        }
        rlVar.f3979b.f4010i.set(0, i, 0, i);
        rlVar.invalidateSelf();
        return rlVar;
    }

    /* renamed from: i */
    public final boolean mo3707i() {
        long currentTimeMillis = System.currentTimeMillis() - this.f3302k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
