package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: ri */
public class C1063ri extends C1094s1 {

    /* renamed from: g */
    public static final int[][] f3963g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f3964e;

    /* renamed from: f */
    public boolean f3965f;

    public C1063ri(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, R.attr.checkboxStyle, 2131755675), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d = C1315wk.m3654d(context2, attributeSet, C0781lh.f3161m, R.attr.checkboxStyle, 2131755675, new int[0]);
        if (d.hasValue(0)) {
            C1344x5.m3735Q(this, C0728kh.m2295k(context2, d, 0));
        }
        this.f3965f = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3964e == null) {
            int[][] iArr = f3963g;
            int[] iArr2 = new int[iArr.length];
            int j = C0728kh.m2294j(this, R.attr.colorControlActivated);
            int j2 = C0728kh.m2294j(this, R.attr.colorSurface);
            int j3 = C0728kh.m2294j(this, R.attr.colorOnSurface);
            iArr2[0] = C0728kh.m2306v(j2, j, 1.0f);
            iArr2[1] = C0728kh.m2306v(j2, j3, 0.54f);
            iArr2[2] = C0728kh.m2306v(j2, j3, 0.38f);
            iArr2[3] = C0728kh.m2306v(j2, j3, 0.38f);
            this.f3964e = new ColorStateList(iArr, iArr2);
        }
        return this.f3964e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3965f && C1344x5.m3777v(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3965f = z;
        C1344x5.m3735Q(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
