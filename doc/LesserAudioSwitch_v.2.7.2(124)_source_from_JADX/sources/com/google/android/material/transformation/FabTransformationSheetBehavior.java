package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.nordskog.LesserAudioSwitch.R;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f1737i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: C */
    public boolean mo2514C(View view, View view2, boolean z, boolean z2) {
        int i;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f1737i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0091f) && (((CoordinatorLayout.C0091f) childAt.getLayoutParams()).f611a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f1737i;
                        if (map != null && map.containsKey(childAt)) {
                            i = this.f1737i.get(childAt).intValue();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f1737i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i = 4;
                    }
                    C0813m8.m2462K(childAt, i);
                }
            }
            if (!z) {
                this.f1737i = null;
            }
        }
        super.mo2514C(view, view2, z, z2);
        return true;
    }

    /* renamed from: O */
    public FabTransformationBehavior.C0337b mo2528O(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C0337b bVar = new FabTransformationBehavior.C0337b();
        bVar.f1731a = C1121sh.m3186b(context, i);
        bVar.f1732b = new C1211uh(17, 0.0f, 0.0f);
        return bVar;
    }
}
