package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: cl */
public class C0283cl extends C0205b2 {

    /* renamed from: g */
    public static final int[][] f1394g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f1395e;

    /* renamed from: f */
    public boolean f1396f;

    public C0283cl(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, R.attr.radioButtonStyle, 2131755676), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d = C1315wk.m3654d(context2, attributeSet, C0781lh.f3162n, R.attr.radioButtonStyle, 2131755676, new int[0]);
        if (d.hasValue(0)) {
            C1344x5.m3735Q(this, C0728kh.m2295k(context2, d, 0));
        }
        this.f1396f = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1395e == null) {
            int j = C0728kh.m2294j(this, R.attr.colorControlActivated);
            int j2 = C0728kh.m2294j(this, R.attr.colorOnSurface);
            int j3 = C0728kh.m2294j(this, R.attr.colorSurface);
            int[][] iArr = f1394g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C0728kh.m2306v(j3, j, 1.0f);
            iArr2[1] = C0728kh.m2306v(j3, j2, 0.54f);
            iArr2[2] = C0728kh.m2306v(j3, j2, 0.38f);
            iArr2[3] = C0728kh.m2306v(j3, j2, 0.38f);
            this.f1395e = new ColorStateList(iArr, iArr2);
        }
        return this.f1395e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1396f && C1344x5.m3777v(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1396f = z;
        C1344x5.m3735Q(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
