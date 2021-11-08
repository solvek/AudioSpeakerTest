package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C1446z8;

/* renamed from: x8 */
public class C1347x8 {

    /* renamed from: d */
    public static int f5037d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f5038a;

    /* renamed from: b */
    public int f5039b = -1;

    /* renamed from: c */
    public int f5040c = -1;

    /* renamed from: x8$a */
    public static class C1348a {

        /* renamed from: e */
        public static final C1348a f5041e = new C1348a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C1348a f5042f = new C1348a(4096, (CharSequence) null);

        /* renamed from: g */
        public static final C1348a f5043g = new C1348a(8192, (CharSequence) null);

        /* renamed from: h */
        public static final C1348a f5044h = new C1348a(262144, (CharSequence) null);

        /* renamed from: i */
        public static final C1348a f5045i = new C1348a(524288, (CharSequence) null);

        /* renamed from: j */
        public static final C1348a f5046j = new C1348a(1048576, (CharSequence) null);

        /* renamed from: k */
        public static final C1348a f5047k;

        /* renamed from: l */
        public static final C1348a f5048l;

        /* renamed from: a */
        public final Object f5049a;

        /* renamed from: b */
        public final int f5050b;

        /* renamed from: c */
        public final Class<? extends C1446z8.C1447a> f5051c;

        /* renamed from: d */
        public final C1446z8 f5052d;

        static {
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(1, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(4, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(8, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(32, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(64, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(128, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(256, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(512, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(1024, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2048, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(16384, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(32768, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(65536, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(131072, (CharSequence) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2097152, (CharSequence) null);
            }
            int i = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908342, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction2 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908343, (CharSequence) null);
            }
            f5047k = new C1348a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C1446z8) null, (Class<? extends C1446z8.C1447a>) null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction3 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908345, (CharSequence) null);
            }
            f5048l = new C1348a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C1446z8) null, (Class<? extends C1446z8.C1447a>) null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction4 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908347, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction5 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908358, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction6 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908359, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction7 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908360, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction8 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908361, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction9 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908348, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction10 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908349, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction11 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908354, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction12 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908356, (CharSequence) null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction13 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908357, (CharSequence) null);
            }
        }

        public C1348a(int i, CharSequence charSequence) {
            this((Object) null, i, (CharSequence) null, (C1446z8) null, (Class<? extends C1446z8.C1447a>) null);
        }

        public C1348a(Object obj, int i, CharSequence charSequence, C1446z8 z8Var, Class<? extends C1446z8.C1447a> cls) {
            this.f5050b = i;
            this.f5052d = z8Var;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f5049a = obj;
            this.f5051c = cls;
        }

        /* renamed from: a */
        public int mo5067a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f5049a).getId();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1348a)) {
                return false;
            }
            Object obj2 = this.f5049a;
            Object obj3 = ((C1348a) obj).f5049a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f5049a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: x8$b */
    public static class C1349b {

        /* renamed from: a */
        public final Object f5053a;

        public C1349b(Object obj) {
            this.f5053a = obj;
        }

        /* renamed from: a */
        public static C1349b m3798a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C1349b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C1349b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C1349b((Object) null);
        }
    }

    /* renamed from: x8$c */
    public static class C1350c {

        /* renamed from: a */
        public final Object f5054a;

        public C1350c(Object obj) {
            this.f5054a = obj;
        }

        /* renamed from: a */
        public static C1350c m3799a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C1350c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C1350c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C1350c((Object) null);
        }
    }

    public C1347x8(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5038a = accessibilityNodeInfo;
    }

    /* renamed from: c */
    public static String m3786c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: d */
    public static ClickableSpan[] m3787d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void mo5055a(C1348a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5038a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5049a);
        }
    }

    /* renamed from: b */
    public final List<Integer> mo5056b(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f5038a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f5038a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public CharSequence mo5057e() {
        return this.f5038a.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1347x8)) {
            return false;
        }
        C1347x8 x8Var = (C1347x8) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5038a;
        if (accessibilityNodeInfo == null) {
            if (x8Var.f5038a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(x8Var.f5038a)) {
            return false;
        }
        return this.f5040c == x8Var.f5040c && this.f5039b == x8Var.f5039b;
    }

    /* renamed from: f */
    public Bundle mo5059f() {
        return Build.VERSION.SDK_INT >= 19 ? this.f5038a.getExtras() : new Bundle();
    }

    /* renamed from: g */
    public CharSequence mo5060g() {
        if (!(!mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f5038a.getText();
        }
        List<Integer> b = mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> b2 = mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> b3 = mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> b4 = mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f5038a.getText(), 0, this.f5038a.getText().length()));
        for (int i = 0; i < b.size(); i++) {
            spannableString.setSpan(new C1299w8(b4.get(i).intValue(), this, mo5059f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b.get(i).intValue(), b2.get(i).intValue(), b3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: h */
    public final void mo5061h(int i, boolean z) {
        Bundle f = mo5059f();
        if (f != null) {
            int i2 = f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            f.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5038a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void mo5063i(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5038a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C1349b) obj).f5053a);
        }
    }

    /* renamed from: j */
    public void mo5064j(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5038a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C1350c) obj).f5054a);
        }
    }

    /* renamed from: k */
    public void mo5065k(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f5038a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f5038a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String toString() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f5038a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f5038a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f5038a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f5038a.getClassName());
        sb.append("; text: ");
        sb.append(mo5060g());
        sb.append("; contentDescription: ");
        sb.append(mo5057e());
        sb.append("; viewId: ");
        int i = Build.VERSION.SDK_INT;
        sb.append(i >= 18 ? this.f5038a.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(this.f5038a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f5038a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f5038a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f5038a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f5038a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f5038a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f5038a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f5038a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f5038a.isPassword());
        sb.append("; scrollable: " + this.f5038a.isScrollable());
        sb.append("; [");
        if (i >= 21) {
            List<AccessibilityNodeInfo.AccessibilityAction> actionList = i >= 21 ? this.f5038a.getActionList() : null;
            if (actionList != null) {
                ArrayList arrayList2 = new ArrayList();
                int size = actionList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C1348a aVar = r11;
                    C1348a aVar2 = new C1348a(actionList.get(i2), 0, (CharSequence) null, (C1446z8) null, (Class<? extends C1446z8.C1447a>) null);
                    arrayList2.add(aVar);
                }
                arrayList = arrayList2;
            } else {
                arrayList = Collections.emptyList();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                C1348a aVar3 = (C1348a) arrayList.get(i3);
                String c = m3786c(aVar3.mo5067a());
                if (c.equals("ACTION_UNKNOWN")) {
                    int i4 = Build.VERSION.SDK_INT;
                    if ((i4 >= 21 ? ((AccessibilityNodeInfo.AccessibilityAction) aVar3.f5049a).getLabel() : null) != null) {
                        c = (i4 >= 21 ? ((AccessibilityNodeInfo.AccessibilityAction) aVar3.f5049a).getLabel() : null).toString();
                    }
                }
                sb.append(c);
                if (i3 != arrayList.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = this.f5038a.getActions();
            while (actions != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                actions &= numberOfTrailingZeros ^ -1;
                sb.append(m3786c(numberOfTrailingZeros));
                if (actions != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
