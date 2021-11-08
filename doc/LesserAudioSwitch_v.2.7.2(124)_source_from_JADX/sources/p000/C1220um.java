package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.util.Locale;

/* renamed from: um */
public class C1220um extends C0950p1 {

    /* renamed from: e */
    public final C1189u2 f4671e;

    /* renamed from: f */
    public final AccessibilityManager f4672f;

    /* renamed from: g */
    public final Rect f4673g = new Rect();

    public C1220um(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray d = C1315wk.m3654d(context2, attributeSet, C0781lh.f3157i, R.attr.autoCompleteTextViewStyle, 2131755560, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f4672f = (AccessibilityManager) context2.getSystemService("accessibility");
        C1189u2 u2Var = new C1189u2(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f4671e = u2Var;
        u2Var.mo4751s(true);
        u2Var.f4563q = this;
        u2Var.f4547A.setInputMethodMode(2);
        u2Var.mo2898o(getAdapter());
        u2Var.f4564r = new C1177tm(this);
        d.recycle();
    }

    /* renamed from: a */
    public static void m3408a(C1220um umVar, Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            umVar.setText(umVar.convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = umVar.getAdapter();
        umVar.setAdapter((ListAdapter) null);
        umVar.setText(umVar.convertSelectionToString(obj));
        umVar.setAdapter(adapter);
    }

    /* renamed from: b */
    public final TextInputLayout mo4788b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b = mo4788b();
        return (b == null || !b.f1627B) ? super.getHint() : b.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = mo4788b();
        if (b != null && b.f1627B && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = mo4788b();
            int i3 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1189u2 u2Var = this.f4671e;
                int min = Math.min(adapter.getCount(), Math.max(0, !u2Var.mo3108a() ? -1 : u2Var.f4550d.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable n = this.f4671e.mo4748n();
                if (n != null) {
                    n.getPadding(this.f4673g);
                    Rect rect = this.f4673g;
                    i4 += rect.left + rect.right;
                }
                i3 = b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f4671e.mo2898o(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f4672f) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f4671e.mo3111i();
        }
    }
}
