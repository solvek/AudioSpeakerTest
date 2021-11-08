package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: pi */
public class C0979pi {

    /* renamed from: s */
    public static final boolean f3643s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    public final MaterialButton f3644a;

    /* renamed from: b */
    public C1217ul f3645b;

    /* renamed from: c */
    public int f3646c;

    /* renamed from: d */
    public int f3647d;

    /* renamed from: e */
    public int f3648e;

    /* renamed from: f */
    public int f3649f;

    /* renamed from: g */
    public int f3650g;

    /* renamed from: h */
    public int f3651h;

    /* renamed from: i */
    public PorterDuff.Mode f3652i;

    /* renamed from: j */
    public ColorStateList f3653j;

    /* renamed from: k */
    public ColorStateList f3654k;

    /* renamed from: l */
    public ColorStateList f3655l;

    /* renamed from: m */
    public Drawable f3656m;

    /* renamed from: n */
    public boolean f3657n = false;

    /* renamed from: o */
    public boolean f3658o = false;

    /* renamed from: p */
    public boolean f3659p = false;

    /* renamed from: q */
    public boolean f3660q;

    /* renamed from: r */
    public LayerDrawable f3661r;

    public C0979pi(MaterialButton materialButton, C1217ul ulVar) {
        this.f3644a = materialButton;
        this.f3645b = ulVar;
    }

    /* renamed from: a */
    public C1422yl mo4021a() {
        LayerDrawable layerDrawable = this.f3661r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (C1422yl) (this.f3661r.getNumberOfLayers() > 2 ? this.f3661r.getDrawable(2) : this.f3661r.getDrawable(1));
    }

    /* renamed from: b */
    public C1067rl mo4022b() {
        return mo4023c(false);
    }

    /* renamed from: c */
    public final C1067rl mo4023c(boolean z) {
        LayerDrawable layerDrawable = this.f3661r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1067rl) (f3643s ? (LayerDrawable) ((InsetDrawable) this.f3661r.getDrawable(0)).getDrawable() : this.f3661r).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: d */
    public final C1067rl mo4024d() {
        return mo4023c(true);
    }

    /* renamed from: e */
    public void mo4025e(C1217ul ulVar) {
        this.f3645b = ulVar;
        if (mo4022b() != null) {
            C1067rl b = mo4022b();
            b.f3979b.f4002a = ulVar;
            b.invalidateSelf();
        }
        if (mo4024d() != null) {
            C1067rl d = mo4024d();
            d.f3979b.f4002a = ulVar;
            d.invalidateSelf();
        }
        if (mo4021a() != null) {
            mo4021a().setShapeAppearanceModel(ulVar);
        }
    }

    /* renamed from: f */
    public final void mo4026f() {
        C1067rl b = mo4022b();
        C1067rl d = mo4024d();
        if (b != null) {
            b.mo4303s((float) this.f3651h, this.f3654k);
            if (d != null) {
                d.mo4302r((float) this.f3651h, this.f3657n ? C0728kh.m2294j(this.f3644a, R.attr.colorSurface) : 0);
            }
        }
    }
}
