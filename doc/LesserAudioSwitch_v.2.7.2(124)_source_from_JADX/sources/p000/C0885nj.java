package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.nordskog.LesserAudioSwitch.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.C1459zi;

/* renamed from: nj */
public final class C0885nj<S> extends C1157t9 {

    /* renamed from: y0 */
    public static final /* synthetic */ int f3395y0 = 0;

    /* renamed from: h0 */
    public final LinkedHashSet<C0980pj<? super S>> f3396h0 = new LinkedHashSet<>();

    /* renamed from: i0 */
    public final LinkedHashSet<View.OnClickListener> f3397i0 = new LinkedHashSet<>();

    /* renamed from: j0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3398j0 = new LinkedHashSet<>();

    /* renamed from: k0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f3399k0 = new LinkedHashSet<>();

    /* renamed from: l0 */
    public int f3400l0;

    /* renamed from: m0 */
    public C0281cj<S> f3401m0;

    /* renamed from: n0 */
    public C1314wj<S> f3402n0;

    /* renamed from: o0 */
    public C1459zi f3403o0;

    /* renamed from: p0 */
    public C0473fj<S> f3404p0;

    /* renamed from: q0 */
    public int f3405q0;

    /* renamed from: r0 */
    public CharSequence f3406r0;

    /* renamed from: s0 */
    public boolean f3407s0;

    /* renamed from: t0 */
    public int f3408t0;

    /* renamed from: u0 */
    public TextView f3409u0;

    /* renamed from: v0 */
    public CheckableImageButton f3410v0;

    /* renamed from: w0 */
    public C1067rl f3411w0;

    /* renamed from: x0 */
    public Button f3412x0;

    /* renamed from: nj$a */
    public class C0886a implements View.OnClickListener {
        public C0886a() {
        }

        public void onClick(View view) {
            Iterator it = C0885nj.this.f3396h0.iterator();
            while (it.hasNext()) {
                ((C0980pj) it.next()).mo4027a(C0885nj.this.f3401m0.mo1767a());
            }
            C0885nj.this.mo4635w0(false, false);
        }
    }

    /* renamed from: nj$b */
    public class C0887b implements View.OnClickListener {
        public C0887b() {
        }

        public void onClick(View view) {
            Iterator it = C0885nj.this.f3397i0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C0885nj.this.mo4635w0(false, false);
        }
    }

    /* renamed from: nj$c */
    public class C0888c extends C1265vj<S> {
        public C0888c() {
        }

        /* renamed from: a */
        public void mo3803a(S s) {
            C0885nj njVar = C0885nj.this;
            int i = C0885nj.f3395y0;
            njVar.mo3798E0();
            C0885nj njVar2 = C0885nj.this;
            njVar2.f3412x0.setEnabled(njVar2.f3401m0.mo1768b());
        }
    }

    /* renamed from: B0 */
    public static int m2604B0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = C1064rj.m3029m().f3970f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i;
        return ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: C0 */
    public static boolean m2605C0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0728kh.m2275D(context, R.attr.materialCalendarStyle, C0473fj.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: D0 */
    public final void mo3797D0() {
        C1314wj<S> wjVar;
        C0281cj<S> cjVar = this.f3401m0;
        Context l0 = mo869l0();
        int i = this.f3400l0;
        if (i == 0) {
            i = this.f3401m0.mo1772f(l0);
        }
        C1459zi ziVar = this.f3403o0;
        C0473fj<S> fjVar = new C0473fj<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", cjVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", ziVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", ziVar.f5317d);
        fjVar.mo882q0(bundle);
        this.f3404p0 = fjVar;
        if (this.f3410v0.isChecked()) {
            C0281cj<S> cjVar2 = this.f3401m0;
            C1459zi ziVar2 = this.f3403o0;
            wjVar = new C1022qj<>();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", cjVar2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", ziVar2);
            wjVar.mo882q0(bundle2);
        } else {
            wjVar = this.f3404p0;
        }
        this.f3402n0 = wjVar;
        mo3798E0();
        C1053r9 r9Var = new C1053r9(mo866k());
        r9Var.mo4070e(R.id.mtrl_calendar_frame, this.f3402n0, (String) null);
        if (!r9Var.f3790g) {
            r9Var.f3791h = false;
            r9Var.f3941q.mo3194C(r9Var, false);
            C1314wj<S> wjVar2 = this.f3402n0;
            wjVar2.f4962T.add(new C0888c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: E0 */
    public final void mo3798E0() {
        String d = this.f3401m0.mo1770d(mo868l());
        this.f3409u0.setContentDescription(String.format(mo897z(R.string.mtrl_picker_announce_current_selection), new Object[]{d}));
        this.f3409u0.setText(d);
    }

    /* renamed from: F0 */
    public final void mo3799F0(CheckableImageButton checkableImageButton) {
        this.f3410v0.setContentDescription(checkableImageButton.getContext().getString(this.f3410v0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    /* renamed from: L */
    public final void mo834L(Bundle bundle) {
        super.mo834L(bundle);
        if (bundle == null) {
            bundle = this.f698f;
        }
        this.f3400l0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f3401m0 = (C0281cj) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3403o0 = (C1459zi) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3405q0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3406r0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3408t0 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: O */
    public final View mo837O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f3407s0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f3407s0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m2604B0(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m2604B0(context), -1));
            Resources resources = mo869l0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i = C1123sj.f4261f;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f3409u0 = textView;
        C0813m8.m2458G(textView, 1);
        this.f3410v0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f3406r0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f3405q0);
        }
        this.f3410v0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f3410v0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0399e0.m1530b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0399e0.m1530b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f3410v0.setChecked(this.f3408t0 != 0);
        C0813m8.m2457F(this.f3410v0, (C1444z7) null);
        mo3799F0(this.f3410v0);
        this.f3410v0.setOnClickListener(new C0931oj(this));
        this.f3412x0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.f3401m0.mo1768b()) {
            this.f3412x0.setEnabled(true);
        } else {
            this.f3412x0.setEnabled(false);
        }
        this.f3412x0.setTag("CONFIRM_BUTTON_TAG");
        this.f3412x0.setOnClickListener(new C0886a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new C0887b());
        return inflate;
    }

    /* renamed from: b0 */
    public final void mo850b0(Bundle bundle) {
        super.mo850b0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3400l0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3401m0);
        C1459zi.C1461b bVar = new C1459zi.C1461b(this.f3403o0);
        C1064rj rjVar = this.f3404p0.f2137X;
        if (rjVar != null) {
            bVar.f5325c = Long.valueOf(rjVar.f3972h);
        }
        if (bVar.f5325c == null) {
            long j = C1064rj.m3029m().f3972h;
            long j2 = bVar.f5323a;
            if (j2 > j || j > bVar.f5324b) {
                j = j2;
            }
            bVar.f5325c = Long.valueOf(j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f5326d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C1459zi(C1064rj.m3028l(bVar.f5323a), C1064rj.m3028l(bVar.f5324b), C1064rj.m3028l(bVar.f5325c.longValue()), (C1459zi.C1462c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (C1459zi.C1460a) null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3405q0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3406r0);
    }

    /* renamed from: c0 */
    public void mo851c0() {
        super.mo851c0();
        Window window = mo4636y0().getWindow();
        if (this.f3407s0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f3411w0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo890u().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f3411w0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C0282ck(mo4636y0(), rect));
        }
        mo3797D0();
    }

    /* renamed from: d0 */
    public void mo852d0() {
        this.f3402n0.f4962T.clear();
        super.mo852d0();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3398j0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3399k0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f680E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: x0 */
    public final Dialog mo1615x0(Bundle bundle) {
        Context l0 = mo869l0();
        Context l02 = mo869l0();
        int i = this.f3400l0;
        if (i == 0) {
            i = this.f3401m0.mo1772f(l02);
        }
        Dialog dialog = new Dialog(l0, i);
        Context context = dialog.getContext();
        this.f3407s0 = m2605C0(context);
        int D = C0728kh.m2275D(context, R.attr.colorSurface, C0885nj.class.getCanonicalName());
        C1067rl rlVar = new C1067rl(C1217ul.m3398b(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131755683).mo4783a());
        this.f3411w0 = rlVar;
        rlVar.f3979b.f4003b = new C0383dk(context);
        rlVar.mo4309w();
        this.f3411w0.mo4300p(ColorStateList.valueOf(D));
        this.f3411w0.mo4297o(C0813m8.m2474h(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
