package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0806m6.m2440a(context, R.attr.preferenceCategoryStyle, 16842892), 0);
    }

    /* renamed from: G */
    public boolean mo916G() {
        return !super.mo953k();
    }

    /* renamed from: k */
    public boolean mo953k() {
        return false;
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        TextView textView;
        super.mo909p(rcVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            rcVar.f996a.setAccessibilityHeading(true);
        } else if (i < 21) {
            TypedValue typedValue = new TypedValue();
            if (this.f794b.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true) && (textView = (TextView) rcVar.mo4232w(16908310)) != null && textView.getCurrentTextColor() == C0408e6.m1547a(this.f794b, R.color.preference_fallback_accent_color)) {
                textView.setTextColor(typedValue.data);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2 = r12.f5038a.getCollectionItemInfo();
     */
    @java.lang.Deprecated
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo960u(p000.C1347x8 r12) {
        /*
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x006b
            r12.getClass()
            r1 = 19
            if (r0 < r1) goto L_0x001b
            android.view.accessibility.AccessibilityNodeInfo r2 = r12.f5038a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r2 = r2.getCollectionItemInfo()
            if (r2 == 0) goto L_0x001b
            x8$c r3 = new x8$c
            r3.<init>(r2)
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 != 0) goto L_0x001f
            return
        L_0x001f:
            r2 = 0
            if (r0 < r1) goto L_0x002c
            java.lang.Object r4 = r3.f5054a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r4 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r4
            int r4 = r4.getRowIndex()
            r5 = r4
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            if (r0 < r1) goto L_0x0039
            java.lang.Object r4 = r3.f5054a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r4 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r4
            int r4 = r4.getRowSpan()
            r6 = r4
            goto L_0x003a
        L_0x0039:
            r6 = 0
        L_0x003a:
            if (r0 < r1) goto L_0x0046
            java.lang.Object r4 = r3.f5054a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r4 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r4
            int r4 = r4.getColumnIndex()
            r7 = r4
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            if (r0 < r1) goto L_0x0053
            java.lang.Object r1 = r3.f5054a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r1
            int r1 = r1.getColumnSpan()
            r8 = r1
            goto L_0x0054
        L_0x0053:
            r8 = 0
        L_0x0054:
            r9 = 1
            r1 = 21
            if (r0 < r1) goto L_0x0063
            java.lang.Object r0 = r3.f5054a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
            boolean r2 = r0.isSelected()
            r10 = r2
            goto L_0x0064
        L_0x0063:
            r10 = 0
        L_0x0064:
            x8$c r0 = p000.C1347x8.C1350c.m3799a(r5, r6, r7, r8, r9, r10)
            r12.mo5064j(r0)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceCategory.mo960u(x8):void");
    }
}
