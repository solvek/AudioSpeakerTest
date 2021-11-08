package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: xm */
public class C1382xm {

    /* renamed from: a */
    public static final int[] f5114a = {16842752, R.attr.theme};

    /* renamed from: b */
    public static final int[] f5115b = {R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m3838a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5115b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof C0853n0) && ((C0853n0) context).f3329a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0853n0 n0Var = new C0853n0(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5114a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            n0Var.getTheme().applyStyle(resourceId2, true);
        }
        return n0Var;
    }
}
