package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: cb */
public abstract class C0263cb {
    /* renamed from: d */
    public static void m1068d(List<View> list, View view) {
        int size = list.size();
        if (!m1069h(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m1069h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m1069h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m1070k(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo1718a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo1719b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo1720c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo1721e(Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1722f(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
        /*
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x004f
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x004c
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x0018
            boolean r0 = r5.isTransitionGroup()
            goto L_0x0039
        L_0x0018:
            r0 = 2131231127(0x7f080197, float:1.8078326E38)
            java.lang.Object r0 = r5.getTag(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0038
        L_0x0029:
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = p000.C0813m8.m2483q(r5)
            if (r0 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x003c
            goto L_0x004c
        L_0x003c:
            int r0 = r5.getChildCount()
        L_0x0040:
            if (r2 >= r0) goto L_0x004f
            android.view.View r1 = r5.getChildAt(r2)
            r3.mo1722f(r4, r1)
            int r2 = r2 + 1
            goto L_0x0040
        L_0x004c:
            r4.add(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0263cb.mo1722f(java.util.ArrayList, android.view.View):void");
    }

    /* renamed from: g */
    public abstract Object mo1723g(Object obj);

    /* renamed from: i */
    public void mo1724i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String q = C0813m8.m2483q(view);
            if (q != null) {
                map.put(q, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo1724i(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: j */
    public void mo1725j(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    /* renamed from: l */
    public abstract Object mo1726l(Object obj, Object obj2, Object obj3);

    /* renamed from: m */
    public abstract void mo1727m(Object obj, View view);

    /* renamed from: n */
    public abstract void mo1728n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: o */
    public abstract void mo1729o(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: p */
    public abstract void mo1730p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: q */
    public abstract void mo1731q(Object obj, Rect rect);

    /* renamed from: r */
    public abstract void mo1732r(Object obj, View view);

    /* renamed from: s */
    public void mo1733s(Fragment fragment, Object obj, C0521g7 g7Var, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: t */
    public abstract void mo1734t(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: u */
    public abstract void mo1735u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: v */
    public abstract Object mo1736v(Object obj);
}
