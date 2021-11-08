package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C1347x8;
import p000.C1446z8;

/* renamed from: z7 */
public class C1444z7 {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f5272c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f5273a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f5274b;

    /* renamed from: z7$a */
    public static final class C1445a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C1444z7 f5275a;

        public C1445a(C1444z7 z7Var) {
            this.f5275a = z7Var;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5275a.mo4234a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1402y8 b = this.f5275a.mo3603b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.f5164a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5275a.mo816c(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            View view2 = view;
            Class<Boolean> cls = Boolean.class;
            C1347x8 x8Var = new C1347x8(accessibilityNodeInfo);
            Field field = C0813m8.f3234a;
            Boolean bool = (Boolean) new C0864n8(R.id.tag_screen_reader_focusable, cls, 28).mo3669c(view2);
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                x8Var.f5038a.setScreenReaderFocusable(booleanValue);
            } else {
                x8Var.mo5061h(1, booleanValue);
            }
            Boolean bool2 = (Boolean) new C0961p8(R.id.tag_accessibility_heading, cls, 28).mo3669c(view2);
            boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
            if (i2 >= 28) {
                x8Var.f5038a.setHeading(booleanValue2);
            } else {
                x8Var.mo5061h(2, booleanValue2);
            }
            CharSequence charSequence = (CharSequence) new C0919o8(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).mo3669c(view2);
            if (i2 >= 28) {
                x8Var.f5038a.setPaneTitle(charSequence);
            } else if (i2 >= 19) {
                x8Var.f5038a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            this.f5275a.mo817d(view2, x8Var);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i2 >= 19 && i2 < 26) {
                if (i2 >= 19) {
                    x8Var.f5038a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                    x8Var.f5038a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                    x8Var.f5038a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                    x8Var.f5038a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                }
                SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                    }
                }
                ClickableSpan[] d = C1347x8.m3787d(text);
                if (d != null && d.length > 0) {
                    x8Var.mo5059f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i5 = 0; i5 < d.length; i5++) {
                        ClickableSpan clickableSpan = d[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= sparseArray2.size()) {
                                i = C1347x8.f5037d;
                                C1347x8.f5037d = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                                i = sparseArray2.keyAt(i6);
                                break;
                            } else {
                                i6++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(d[i5]));
                        ClickableSpan clickableSpan2 = d[i5];
                        Spanned spanned = (Spanned) text;
                        x8Var.mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        x8Var.mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        x8Var.mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        x8Var.mo5056b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view2.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i7 = 0; i7 < list.size(); i7++) {
                x8Var.mo5055a((C1347x8.C1348a) list.get(i7));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5275a.mo3713e(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5275a.mo4235f(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f5275a.mo818g(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f5275a.mo4236h(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5275a.mo4237i(view, accessibilityEvent);
        }
    }

    public C1444z7() {
        this.f5273a = f5272c;
        this.f5274b = new C1445a(this);
    }

    public C1444z7(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5273a = accessibilityDelegate;
        this.f5274b = new C1445a(this);
    }

    /* renamed from: a */
    public boolean mo4234a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5273a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1402y8 mo3603b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f5273a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C1402y8(accessibilityNodeProvider);
    }

    /* renamed from: c */
    public void mo816c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5273a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo817d(View view, C1347x8 x8Var) {
        this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
    }

    /* renamed from: e */
    public void mo3713e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5273a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo4235f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5273a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo818g(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C1347x8.C1348a aVar = (C1347x8.C1348a) list.get(i2);
            if (aVar.mo5067a() != i) {
                i2++;
            } else if (aVar.f5052d != null) {
                C1446z8.C1447a aVar2 = null;
                Class<? extends C1446z8.C1447a> cls = aVar.f5051c;
                if (cls != null) {
                    try {
                        C1446z8.C1447a aVar3 = (C1446z8.C1447a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            aVar3.getClass();
                        } catch (Exception unused) {
                        }
                        aVar2 = aVar3;
                    } catch (Exception unused2) {
                    }
                }
                z = aVar.f5052d.mo1921a(view, aVar2);
            }
        }
        z = false;
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f5273a.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] d = C1347x8.m3787d(view.createAccessibilityNodeInfo().getText());
                int i4 = 0;
                while (true) {
                    if (d == null || i4 >= d.length) {
                        break;
                    } else if (clickableSpan.equals(d[i4])) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            z2 = false;
            if (z2) {
                clickableSpan.onClick(view);
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: h */
    public void mo4236h(View view, int i) {
        this.f5273a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo4237i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5273a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
