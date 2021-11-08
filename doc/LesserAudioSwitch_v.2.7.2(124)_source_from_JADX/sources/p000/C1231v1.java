package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.nordskog.LesserAudioSwitch.R;
import p000.C1334x2;

/* renamed from: v1 */
public final class C1231v1 {

    /* renamed from: b */
    public static final PorterDuff.Mode f4694b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C1231v1 f4695c;

    /* renamed from: a */
    public C1334x2 f4696a;

    /* renamed from: v1$a */
    public class C1232a implements C1334x2.C1339e {

        /* renamed from: a */
        public final int[] f4697a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f4698b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f4699c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        public final int[] f4700d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f4701e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f4702f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        /* renamed from: a */
        public final boolean mo4804a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final ColorStateList mo4805b(Context context, int i) {
            int c = C0253c3.m1049c(context, R.attr.colorControlHighlight);
            int b = C0253c3.m1048b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{C0253c3.f1331b, C0253c3.f1333d, C0253c3.f1332c, C0253c3.f1335f}, new int[]{b, C0859n6.m2572a(c, i), C0859n6.m2572a(c, i), i});
        }

        /* renamed from: c */
        public ColorStateList mo4806c(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return C0399e0.m1529a(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return C0399e0.m1529a(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d = C0253c3.m1050d(context, R.attr.colorSwitchThumbNormal);
                if (d == null || !d.isStateful()) {
                    iArr[0] = C0253c3.f1331b;
                    iArr2[0] = C0253c3.m1048b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = C0253c3.f1334e;
                    iArr2[1] = C0253c3.m1049c(context, R.attr.colorControlActivated);
                    iArr[2] = C0253c3.f1335f;
                    iArr2[2] = C0253c3.m1049c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = C0253c3.f1331b;
                    iArr2[0] = d.getColorForState(iArr[0], 0);
                    iArr[1] = C0253c3.f1334e;
                    iArr2[1] = C0253c3.m1049c(context, R.attr.colorControlActivated);
                    iArr[2] = C0253c3.f1335f;
                    iArr2[2] = d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return mo4805b(context, C0253c3.m1049c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return mo4805b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return mo4805b(context, C0253c3.m1049c(context, R.attr.colorAccent));
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    return C0399e0.m1529a(context, R.color.abc_tint_spinner);
                }
                if (mo4804a(this.f4698b, i)) {
                    return C0253c3.m1050d(context, R.attr.colorControlNormal);
                }
                if (mo4804a(this.f4701e, i)) {
                    return C0399e0.m1529a(context, R.color.abc_tint_default);
                }
                if (mo4804a(this.f4702f, i)) {
                    return C0399e0.m1529a(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return C0399e0.m1529a(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        /* renamed from: d */
        public final void mo4807d(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0912o2.m2664a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1231v1.f4694b;
            }
            drawable.setColorFilter(C1231v1.m3414c(i, mode));
        }
    }

    /* renamed from: a */
    public static synchronized C1231v1 m3413a() {
        C1231v1 v1Var;
        synchronized (C1231v1.class) {
            if (f4695c == null) {
                m3415e();
            }
            v1Var = f4695c;
        }
        return v1Var;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m3414c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (C1231v1.class) {
            h = C1334x2.m3687h(i, mode);
        }
        return h;
    }

    /* renamed from: e */
    public static synchronized void m3415e() {
        synchronized (C1231v1.class) {
            if (f4695c == null) {
                C1231v1 v1Var = new C1231v1();
                f4695c = v1Var;
                v1Var.f4696a = C1334x2.m3686d();
                C1334x2 x2Var = f4695c.f4696a;
                C1232a aVar = new C1232a();
                synchronized (x2Var) {
                    x2Var.f5011g = aVar;
                }
            }
        }
    }

    /* renamed from: f */
    public static void m3416f(Drawable drawable, C0452f3 f3Var, int[] iArr) {
        PorterDuff.Mode mode = C1334x2.f5002h;
        if (!C0912o2.m2664a(drawable) || drawable.mutate() == drawable) {
            boolean z = f3Var.f2092d;
            if (z || f3Var.f2091c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? f3Var.f2089a : null;
                PorterDuff.Mode mode2 = f3Var.f2091c ? f3Var.f2090b : C1334x2.f5002h;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = C1334x2.m3687h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: b */
    public synchronized Drawable mo4802b(Context context, int i) {
        return this.f4696a.mo5042f(context, i);
    }

    /* renamed from: d */
    public synchronized ColorStateList mo4803d(Context context, int i) {
        return this.f4696a.mo5044i(context, i);
    }
}
