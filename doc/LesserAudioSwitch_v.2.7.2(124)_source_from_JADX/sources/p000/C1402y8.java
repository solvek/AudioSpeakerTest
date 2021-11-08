package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: y8 */
public class C1402y8 {

    /* renamed from: a */
    public final Object f5164a;

    /* renamed from: y8$a */
    public static class C1403a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C1402y8 f5165a;

        public C1403a(C1402y8 y8Var) {
            this.f5165a = y8Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1347x8 a = this.f5165a.mo3614a(i);
            if (a == null) {
                return null;
            }
            return a.f5038a;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f5165a.getClass();
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f5165a.mo3616c(i, i2, bundle);
        }
    }

    /* renamed from: y8$b */
    public static class C1404b extends C1403a {
        public C1404b(C1402y8 y8Var) {
            super(y8Var);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C1347x8 b = this.f5165a.mo3615b(i);
            if (b == null) {
                return null;
            }
            return b.f5038a;
        }
    }

    public C1402y8() {
        int i = Build.VERSION.SDK_INT;
        this.f5164a = i >= 19 ? new C1404b(this) : i >= 16 ? new C1403a(this) : null;
    }

    public C1402y8(Object obj) {
        this.f5164a = obj;
    }

    /* renamed from: a */
    public C1347x8 mo3614a(int i) {
        return null;
    }

    /* renamed from: b */
    public C1347x8 mo3615b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo3616c(int i, int i2, Bundle bundle) {
        return false;
    }
}
