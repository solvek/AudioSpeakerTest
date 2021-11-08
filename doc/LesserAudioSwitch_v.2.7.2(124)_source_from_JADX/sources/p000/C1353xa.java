package p000;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: xa */
public class C1353xa {

    /* renamed from: a */
    public static final int[] f5060a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final C0263cb f5061b = (Build.VERSION.SDK_INT >= 21 ? new C1406ya() : null);

    /* renamed from: c */
    public static final C0263cb f5062c;

    /* renamed from: xa$a */
    public interface C1354a {
    }

    /* renamed from: xa$b */
    public static class C1355b {

        /* renamed from: a */
        public Fragment f5063a;

        /* renamed from: b */
        public boolean f5064b;

        /* renamed from: c */
        public C1053r9 f5065c;

        /* renamed from: d */
        public Fragment f5066d;

        /* renamed from: e */
        public boolean f5067e;

        /* renamed from: f */
        public C1053r9 f5068f;
    }

    static {
        C0263cb cbVar = null;
        try {
            cbVar = (C0263cb) Class.forName("ee").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f5062c = cbVar;
    }

    /* renamed from: a */
    public static void m3800a(ArrayList<View> arrayList, C0254c4<String, View> c4Var, Collection<String> collection) {
        for (int i = c4Var.f2827d - 1; i >= 0; i--) {
            View k = c4Var.mo3407k(i);
            if (collection.contains(C0813m8.m2483q(k))) {
                arrayList.add(k);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r0.f703k != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0074, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0086, code lost:
        if (r0.f717y == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3801b(p000.C1053r9 r8, p000.C1009qa.C1010a r9, android.util.SparseArray<p000.C1353xa.C1355b> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3801b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f715w
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f5060a
            int r9 = r9.f3800a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3800a
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L_0x007b
            r4 = 3
            if (r9 == r4) goto L_0x0056
            r4 = 4
            if (r9 == r4) goto L_0x003e
            r4 = 5
            if (r9 == r4) goto L_0x002c
            r4 = 6
            if (r9 == r4) goto L_0x0056
            r4 = 7
            if (r9 == r4) goto L_0x007b
            r9 = 0
            r4 = 0
            goto L_0x008c
        L_0x002c:
            if (r12 == 0) goto L_0x003b
            boolean r9 = r0.f685J
            if (r9 == 0) goto L_0x008a
            boolean r9 = r0.f717y
            if (r9 != 0) goto L_0x008a
            boolean r9 = r0.f703k
            if (r9 == 0) goto L_0x008a
            goto L_0x0088
        L_0x003b:
            boolean r9 = r0.f717y
            goto L_0x008b
        L_0x003e:
            if (r12 == 0) goto L_0x004d
            boolean r9 = r0.f685J
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f703k
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f717y
            if (r9 == 0) goto L_0x0076
            goto L_0x0074
        L_0x004d:
            boolean r9 = r0.f703k
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f717y
            if (r9 != 0) goto L_0x0076
            goto L_0x0074
        L_0x0056:
            boolean r9 = r0.f703k
            if (r12 == 0) goto L_0x006e
            if (r9 != 0) goto L_0x0076
            android.view.View r9 = r0.f680E
            if (r9 == 0) goto L_0x0076
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0076
            float r9 = r0.f686K
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0076
            goto L_0x0074
        L_0x006e:
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f717y
            if (r9 != 0) goto L_0x0076
        L_0x0074:
            r9 = 1
            goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            r5 = r9
            r9 = 1
            r4 = 0
            goto L_0x008f
        L_0x007b:
            if (r12 == 0) goto L_0x0080
            boolean r9 = r0.f684I
            goto L_0x008b
        L_0x0080:
            boolean r9 = r0.f703k
            if (r9 != 0) goto L_0x008a
            boolean r9 = r0.f717y
            if (r9 != 0) goto L_0x008a
        L_0x0088:
            r9 = 1
            goto L_0x008b
        L_0x008a:
            r9 = 0
        L_0x008b:
            r4 = 1
        L_0x008c:
            r3 = r9
            r9 = 0
            r5 = 0
        L_0x008f:
            java.lang.Object r6 = r10.get(r1)
            xa$b r6 = (p000.C1353xa.C1355b) r6
            if (r3 == 0) goto L_0x00a8
            if (r6 != 0) goto L_0x00a2
            xa$b r3 = new xa$b
            r3.<init>()
            r10.put(r1, r3)
            r6 = r3
        L_0x00a2:
            r6.f5063a = r0
            r6.f5064b = r11
            r6.f5065c = r8
        L_0x00a8:
            r3 = 0
            if (r12 != 0) goto L_0x00c9
            if (r4 == 0) goto L_0x00c9
            if (r6 == 0) goto L_0x00b5
            androidx.fragment.app.Fragment r4 = r6.f5066d
            if (r4 != r0) goto L_0x00b5
            r6.f5066d = r3
        L_0x00b5:
            ia r4 = r8.f3941q
            int r7 = r0.f694b
            if (r7 >= r2) goto L_0x00c9
            int r7 = r4.f2652m
            if (r7 < r2) goto L_0x00c9
            boolean r7 = r8.f3799p
            if (r7 != 0) goto L_0x00c9
            r4.mo3207Q(r0)
            r4.mo3210T(r0, r2)
        L_0x00c9:
            if (r5 == 0) goto L_0x00e2
            if (r6 == 0) goto L_0x00d1
            androidx.fragment.app.Fragment r2 = r6.f5066d
            if (r2 != 0) goto L_0x00e2
        L_0x00d1:
            if (r6 != 0) goto L_0x00dc
            xa$b r2 = new xa$b
            r2.<init>()
            r10.put(r1, r2)
            r6 = r2
        L_0x00dc:
            r6.f5066d = r0
            r6.f5067e = r11
            r6.f5068f = r8
        L_0x00e2:
            if (r12 != 0) goto L_0x00ee
            if (r9 == 0) goto L_0x00ee
            if (r6 == 0) goto L_0x00ee
            androidx.fragment.app.Fragment r8 = r6.f5063a
            if (r8 != r0) goto L_0x00ee
            r6.f5063a = r3
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1353xa.m3801b(r9, qa$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m3802c(Fragment fragment, Fragment fragment2, boolean z, C0254c4<String, View> c4Var, boolean z2) {
        if (z) {
            fragment2.mo872n();
        } else {
            fragment.mo872n();
        }
    }

    /* renamed from: d */
    public static boolean m3803d(C0263cb cbVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!cbVar.mo1721e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C0254c4<String, View> m3804e(C0263cb cbVar, C0254c4<String, String> c4Var, Object obj, C1355b bVar) {
        ArrayList<String> arrayList;
        Fragment fragment = bVar.f5063a;
        View view = fragment.f680E;
        if (c4Var.isEmpty() || obj == null || view == null) {
            c4Var.clear();
            return null;
        }
        C0254c4<String, View> c4Var2 = new C0254c4<>();
        cbVar.mo1724i(c4Var2, view);
        C1053r9 r9Var = bVar.f5065c;
        if (bVar.f5064b) {
            fragment.mo879p();
            arrayList = r9Var.f3797n;
        } else {
            fragment.mo872n();
            arrayList = r9Var.f3798o;
        }
        if (arrayList != null) {
            C0601i4.m1916k(c4Var2, arrayList);
            C0601i4.m1916k(c4Var2, c4Var.values());
        }
        int i = c4Var.f2827d;
        while (true) {
            i--;
            if (i < 0) {
                return c4Var2;
            }
            if (!c4Var2.containsKey(c4Var.mo3407k(i))) {
                c4Var.mo3404i(i);
            }
        }
    }

    /* renamed from: f */
    public static C0254c4<String, View> m3805f(C0263cb cbVar, C0254c4<String, String> c4Var, Object obj, C1355b bVar) {
        ArrayList<String> arrayList;
        if (c4Var.isEmpty() || obj == null) {
            c4Var.clear();
            return null;
        }
        Fragment fragment = bVar.f5066d;
        C0254c4<String, View> c4Var2 = new C0254c4<>();
        cbVar.mo1724i(c4Var2, fragment.mo871m0());
        C1053r9 r9Var = bVar.f5068f;
        if (bVar.f5067e) {
            fragment.mo872n();
            arrayList = r9Var.f3798o;
        } else {
            fragment.mo879p();
            arrayList = r9Var.f3797n;
        }
        if (arrayList != null) {
            C0601i4.m1916k(c4Var2, arrayList);
        }
        C0601i4.m1916k(c4Var, c4Var2.keySet());
        return c4Var2;
    }

    /* renamed from: g */
    public static C0263cb m3806g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.mo874o();
            Object v = fragment.mo892v();
            if (v != null) {
                arrayList.add(v);
            }
            Object x = fragment.mo895x();
            if (x != null) {
                arrayList.add(x);
            }
        }
        if (fragment2 != null) {
            fragment2.mo870m();
            Object t = fragment2.mo887t();
            if (t != null) {
                arrayList.add(t);
            }
            fragment2.mo894w();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0263cb cbVar = f5061b;
        if (cbVar != null && m3803d(cbVar, arrayList)) {
            return cbVar;
        }
        C0263cb cbVar2 = f5062c;
        if (cbVar2 != null && m3803d(cbVar2, arrayList)) {
            return cbVar2;
        }
        if (cbVar == null && cbVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: h */
    public static ArrayList<View> m3807h(C0263cb cbVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.f680E;
        if (view2 != null) {
            cbVar.mo1722f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        cbVar.mo1719b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: i */
    public static Object m3808i(C0263cb cbVar, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo887t();
        } else {
            fragment.mo870m();
        }
        return cbVar.mo1723g(obj);
    }

    /* renamed from: j */
    public static Object m3809j(C0263cb cbVar, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo892v();
        } else {
            fragment.mo874o();
        }
        return cbVar.mo1723g(obj);
    }

    /* renamed from: k */
    public static View m3810k(C0254c4<String, View> c4Var, C1355b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C1053r9 r9Var = bVar.f5065c;
        if (obj == null || c4Var == null || (arrayList = r9Var.f3797n) == null || arrayList.isEmpty()) {
            return null;
        }
        return c4Var.get((z ? r9Var.f3797n : r9Var.f3798o).get(0));
    }

    /* renamed from: l */
    public static Object m3811l(C0263cb cbVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (z) {
            obj = fragment2.mo895x();
        } else {
            fragment.mo894w();
            obj = null;
        }
        return cbVar.mo1736v(cbVar.mo1723g(obj));
    }

    /* renamed from: m */
    public static void m3812m(C0263cb cbVar, Object obj, Object obj2, C0254c4<String, View> c4Var, boolean z, C1053r9 r9Var) {
        ArrayList<String> arrayList = r9Var.f3797n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = c4Var.get((z ? r9Var.f3798o : r9Var.f3797n).get(0));
            cbVar.mo1732r(obj, view);
            if (obj2 != null) {
                cbVar.mo1732r(obj2, view);
            }
        }
    }

    /* renamed from: n */
    public static void m3813n(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0478 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0234 A[ADDED_TO_REGION] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3814o(p000.C0614ia r38, java.util.ArrayList<p000.C1053r9> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, p000.C1353xa.C1354a r44) {
        /*
            r0 = r38
            r1 = r39
            r2 = r40
            r3 = r42
            r4 = r43
            int r5 = r0.f2652m
            r6 = 1
            if (r5 >= r6) goto L_0x0010
            return
        L_0x0010:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r7 = r41
        L_0x0017:
            r8 = 0
            if (r7 >= r3) goto L_0x0068
            java.lang.Object r9 = r1.get(r7)
            r9 r9 = (p000.C1053r9) r9
            java.lang.Object r10 = r2.get(r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x004e
            ia r8 = r9.f3941q
            ba r8 = r8.f2654o
            boolean r8 = r8.mo1592f()
            if (r8 != 0) goto L_0x0037
            goto L_0x0065
        L_0x0037:
            java.util.ArrayList<qa$a> r8 = r9.f3784a
            int r8 = r8.size()
            int r8 = r8 - r6
        L_0x003e:
            if (r8 < 0) goto L_0x0065
            java.util.ArrayList<qa$a> r10 = r9.f3784a
            java.lang.Object r10 = r10.get(r8)
            qa$a r10 = (p000.C1009qa.C1010a) r10
            m3801b(r9, r10, r5, r6, r4)
            int r8 = r8 + -1
            goto L_0x003e
        L_0x004e:
            java.util.ArrayList<qa$a> r10 = r9.f3784a
            int r10 = r10.size()
            r11 = 0
        L_0x0055:
            if (r11 >= r10) goto L_0x0065
            java.util.ArrayList<qa$a> r12 = r9.f3784a
            java.lang.Object r12 = r12.get(r11)
            qa$a r12 = (p000.C1009qa.C1010a) r12
            m3801b(r9, r12, r5, r8, r4)
            int r11 = r11 + 1
            goto L_0x0055
        L_0x0065:
            int r7 = r7 + 1
            goto L_0x0017
        L_0x0068:
            int r7 = r5.size()
            if (r7 == 0) goto L_0x048c
            android.view.View r7 = new android.view.View
            fa<?> r9 = r0.f2653n
            android.content.Context r9 = r9.f2101c
            r7.<init>(r9)
            int r15 = r5.size()
            r14 = 0
        L_0x007c:
            if (r14 >= r15) goto L_0x048c
            int r9 = r5.keyAt(r14)
            c4 r13 = new c4
            r13.<init>()
            int r10 = r3 + -1
            r12 = r41
        L_0x008b:
            if (r10 < r12) goto L_0x00f2
            java.lang.Object r11 = r1.get(r10)
            r9 r11 = (p000.C1053r9) r11
            boolean r16 = r11.mo4228l(r9)
            if (r16 != 0) goto L_0x009a
            goto L_0x00e7
        L_0x009a:
            java.lang.Object r16 = r2.get(r10)
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            java.util.ArrayList<java.lang.String> r6 = r11.f3797n
            if (r6 == 0) goto L_0x00e7
            int r6 = r6.size()
            java.util.ArrayList<java.lang.String> r8 = r11.f3797n
            java.util.ArrayList<java.lang.String> r11 = r11.f3798o
            if (r16 == 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            r37 = r11
            r11 = r8
            r8 = r37
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            if (r1 >= r6) goto L_0x00e7
            java.lang.Object r16 = r11.get(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r16 = r8.get(r1)
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r16 = r13.remove(r3)
            r17 = r6
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00db
            r13.put(r2, r6)
            goto L_0x00de
        L_0x00db:
            r13.put(r2, r3)
        L_0x00de:
            int r1 = r1 + 1
            r2 = r40
            r3 = r42
            r6 = r17
            goto L_0x00b9
        L_0x00e7:
            int r10 = r10 + -1
            r1 = r39
            r2 = r40
            r3 = r42
            r6 = 1
            r8 = 0
            goto L_0x008b
        L_0x00f2:
            java.lang.Object r1 = r5.valueAt(r14)
            xa$b r1 = (p000.C1353xa.C1355b) r1
            if (r4 == 0) goto L_0x02f7
            ba r3 = r0.f2654o
            boolean r3 = r3.mo1592f()
            if (r3 == 0) goto L_0x010b
            ba r3 = r0.f2654o
            android.view.View r3 = r3.mo1591b(r9)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            if (r3 != 0) goto L_0x010f
            goto L_0x0119
        L_0x010f:
            androidx.fragment.app.Fragment r6 = r1.f5063a
            androidx.fragment.app.Fragment r8 = r1.f5066d
            cb r9 = m3806g(r8, r6)
            if (r9 != 0) goto L_0x0122
        L_0x0119:
            r31 = r5
            r32 = r14
            r33 = r15
        L_0x011f:
            r0 = 0
            goto L_0x02f4
        L_0x0122:
            boolean r10 = r1.f5064b
            boolean r11 = r1.f5067e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r10 = m3808i(r9, r6, r10)
            java.lang.Object r11 = m3809j(r9, r8, r11)
            r31 = r5
            androidx.fragment.app.Fragment r5 = r1.f5063a
            androidx.fragment.app.Fragment r12 = r1.f5066d
            r32 = r14
            if (r5 == 0) goto L_0x014d
            android.view.View r14 = r5.mo871m0()
            r33 = r15
            r15 = 0
            r14.setVisibility(r15)
            goto L_0x014f
        L_0x014d:
            r33 = r15
        L_0x014f:
            if (r5 == 0) goto L_0x01eb
            if (r12 != 0) goto L_0x0155
            goto L_0x01eb
        L_0x0155:
            boolean r14 = r1.f5064b
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L_0x015f
            r15 = 0
            goto L_0x0163
        L_0x015f:
            java.lang.Object r15 = m3811l(r9, r5, r12, r14)
        L_0x0163:
            c4 r0 = m3805f(r9, r13, r15, r1)
            r34 = r6
            c4 r6 = m3804e(r9, r13, r15, r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x017f
            if (r0 == 0) goto L_0x0178
            r0.clear()
        L_0x0178:
            if (r6 == 0) goto L_0x017d
            r6.clear()
        L_0x017d:
            r15 = 0
            goto L_0x0191
        L_0x017f:
            r16 = r15
            java.util.Set r15 = r13.keySet()
            m3800a(r4, r0, r15)
            java.util.Collection r15 = r13.values()
            m3800a(r2, r6, r15)
            r15 = r16
        L_0x0191:
            if (r10 != 0) goto L_0x019a
            if (r11 != 0) goto L_0x019a
            if (r15 != 0) goto L_0x019a
            r36 = r2
            goto L_0x01ef
        L_0x019a:
            r35 = r13
            r13 = 1
            m3802c(r5, r12, r14, r0, r13)
            if (r15 == 0) goto L_0x01d0
            r2.add(r7)
            r9.mo1734t(r15, r7, r4)
            boolean r13 = r1.f5067e
            r36 = r2
            r9 r2 = r1.f5068f
            r16 = r9
            r17 = r15
            r18 = r11
            r19 = r0
            r20 = r13
            r21 = r2
            m3812m(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = m3810k(r6, r1, r10, r14)
            if (r1 == 0) goto L_0x01cb
            r9.mo1731q(r10, r0)
        L_0x01cb:
            r29 = r0
            r27 = r1
            goto L_0x01d6
        L_0x01d0:
            r36 = r2
            r27 = 0
            r29 = 0
        L_0x01d6:
            va r0 = new va
            r22 = r0
            r23 = r5
            r24 = r12
            r25 = r14
            r26 = r6
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            p000.C0717k8.m2248a(r3, r0)
            goto L_0x01f2
        L_0x01eb:
            r36 = r2
            r34 = r6
        L_0x01ef:
            r35 = r13
            r15 = 0
        L_0x01f2:
            if (r10 != 0) goto L_0x01fa
            if (r15 != 0) goto L_0x01fa
            if (r11 != 0) goto L_0x01fa
            goto L_0x011f
        L_0x01fa:
            java.util.ArrayList r0 = m3807h(r9, r11, r8, r4, r7)
            r1 = r34
            r2 = r36
            java.util.ArrayList r1 = m3807h(r9, r10, r1, r2, r7)
            r5 = 4
            m3813n(r1, r5)
            java.lang.Object r5 = r9.mo1726l(r11, r10, r15)
            if (r8 == 0) goto L_0x0232
            if (r0 == 0) goto L_0x0232
            int r6 = r0.size()
            if (r6 > 0) goto L_0x021e
            int r6 = r4.size()
            if (r6 <= 0) goto L_0x0232
        L_0x021e:
            g7 r6 = new g7
            r6.<init>()
            r12 = r44
            ia$b r12 = (p000.C0614ia.C0616b) r12
            r12.mo3255b(r8, r6)
            ra r13 = new ra
            r13.<init>(r12, r8, r6)
            r9.mo1733s(r8, r5, r6, r13)
        L_0x0232:
            if (r5 == 0) goto L_0x011f
            if (r8 == 0) goto L_0x0257
            if (r11 == 0) goto L_0x0257
            boolean r6 = r8.f703k
            if (r6 == 0) goto L_0x0257
            boolean r6 = r8.f717y
            if (r6 == 0) goto L_0x0257
            boolean r6 = r8.f685J
            if (r6 == 0) goto L_0x0257
            r6 = 1
            r8.mo884r0(r6)
            android.view.View r6 = r8.f680E
            r9.mo1729o(r11, r6, r0)
            android.view.ViewGroup r6 = r8.f679D
            sa r8 = new sa
            r8.<init>(r0)
            p000.C0717k8.m2248a(r6, r8)
        L_0x0257:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r8 = r2.size()
            r12 = 0
        L_0x0261:
            if (r12 >= r8) goto L_0x0277
            java.lang.Object r13 = r2.get(r12)
            android.view.View r13 = (android.view.View) r13
            java.lang.String r14 = p000.C0813m8.m2483q(r13)
            r6.add(r14)
            r14 = 0
            p000.C0813m8.m2465N(r13, r14)
            int r12 = r12 + 1
            goto L_0x0261
        L_0x0277:
            r22 = r9
            r23 = r5
            r24 = r10
            r25 = r1
            r26 = r11
            r27 = r0
            r28 = r15
            r29 = r2
            r22.mo1730p(r23, r24, r25, r26, r27, r28, r29)
            r9.mo1720c(r3, r5)
            int r0 = r2.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = 0
        L_0x0297:
            if (r8 >= r0) goto L_0x02d7
            java.lang.Object r10 = r4.get(r8)
            android.view.View r10 = (android.view.View) r10
            java.lang.String r11 = p000.C0813m8.m2483q(r10)
            r5.add(r11)
            if (r11 != 0) goto L_0x02ab
            r13 = r35
            goto L_0x02d2
        L_0x02ab:
            r14 = 0
            p000.C0813m8.m2465N(r10, r14)
            r13 = r35
            java.lang.Object r10 = r13.getOrDefault(r11, r14)
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
        L_0x02b8:
            if (r12 >= r0) goto L_0x02d2
            java.lang.Object r14 = r6.get(r12)
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x02ce
            java.lang.Object r10 = r2.get(r12)
            android.view.View r10 = (android.view.View) r10
            p000.C0813m8.m2465N(r10, r11)
            goto L_0x02d2
        L_0x02ce:
            int r12 = r12 + 1
            r14 = 0
            goto L_0x02b8
        L_0x02d2:
            int r8 = r8 + 1
            r35 = r13
            goto L_0x0297
        L_0x02d7:
            za r8 = new za
            r22 = r8
            r23 = r9
            r24 = r0
            r25 = r2
            r26 = r6
            r27 = r4
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            p000.C0717k8.m2248a(r3, r8)
            r0 = 0
            m3813n(r1, r0)
            r9.mo1735u(r15, r4, r2)
        L_0x02f4:
            r2 = r38
            goto L_0x0320
        L_0x02f7:
            r2 = r0
            r31 = r5
            r32 = r14
            r33 = r15
            r0 = 0
            ba r3 = r2.f2654o
            boolean r3 = r3.mo1592f()
            if (r3 == 0) goto L_0x0312
            ba r3 = r2.f2654o
            android.view.View r3 = r3.mo1591b(r9)
            r14 = r3
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r3 = r14
            goto L_0x0313
        L_0x0312:
            r3 = 0
        L_0x0313:
            if (r3 != 0) goto L_0x0316
            goto L_0x0320
        L_0x0316:
            androidx.fragment.app.Fragment r4 = r1.f5063a
            androidx.fragment.app.Fragment r5 = r1.f5066d
            cb r6 = m3806g(r5, r4)
            if (r6 != 0) goto L_0x0326
        L_0x0320:
            r1 = r32
            r29 = r33
            goto L_0x0478
        L_0x0326:
            boolean r8 = r1.f5064b
            boolean r9 = r1.f5067e
            java.lang.Object r8 = m3808i(r6, r4, r8)
            java.lang.Object r12 = m3809j(r6, r5, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            androidx.fragment.app.Fragment r9 = r1.f5063a
            androidx.fragment.app.Fragment r15 = r1.f5066d
            if (r9 == 0) goto L_0x03de
            if (r15 != 0) goto L_0x0346
            goto L_0x03de
        L_0x0346:
            boolean r14 = r1.f5064b
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0350
            r0 = 0
            goto L_0x0356
        L_0x0350:
            java.lang.Object r16 = m3811l(r6, r9, r15, r14)
            r0 = r16
        L_0x0356:
            c4 r2 = m3805f(r6, r13, r0, r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0362
            r0 = 0
            goto L_0x036d
        L_0x0362:
            r16 = r0
            java.util.Collection r0 = r2.values()
            r11.addAll(r0)
            r0 = r16
        L_0x036d:
            if (r8 != 0) goto L_0x0375
            if (r12 != 0) goto L_0x0375
            if (r0 != 0) goto L_0x0375
            goto L_0x03de
        L_0x0375:
            r22 = r4
            r4 = 1
            m3802c(r9, r15, r14, r2, r4)
            if (r0 == 0) goto L_0x03a4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r6.mo1734t(r0, r7, r11)
            r20 = r9
            boolean r9 = r1.f5067e
            r21 = r10
            r9 r10 = r1.f5068f
            r23 = r14
            r14 = r6
            r24 = r15
            r15 = r0
            r16 = r12
            r17 = r2
            r18 = r9
            r19 = r10
            m3812m(r14, r15, r16, r17, r18, r19)
            if (r8 == 0) goto L_0x03ad
            r6.mo1731q(r8, r4)
            goto L_0x03ad
        L_0x03a4:
            r20 = r9
            r21 = r10
            r23 = r14
            r24 = r15
            r4 = 0
        L_0x03ad:
            wa r2 = new wa
            r16 = r20
            r9 = r2
            r15 = r21
            r10 = r6
            r14 = r11
            r11 = r13
            r25 = r5
            r5 = r12
            r12 = r0
            r26 = r0
            r0 = r13
            r13 = r1
            r27 = r14
            r1 = r32
            r28 = 0
            r14 = r15
            r30 = r15
            r29 = r33
            r15 = r7
            r17 = r24
            r18 = r23
            r19 = r27
            r20 = r8
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            p000.C0717k8.m2248a(r3, r2)
            r2 = r26
            goto L_0x03f0
        L_0x03de:
            r22 = r4
            r25 = r5
            r30 = r10
            r27 = r11
            r5 = r12
            r0 = r13
            r1 = r32
            r29 = r33
            r28 = 0
            r2 = r28
        L_0x03f0:
            if (r8 != 0) goto L_0x03f8
            if (r2 != 0) goto L_0x03f8
            if (r5 != 0) goto L_0x03f8
            goto L_0x0478
        L_0x03f8:
            r4 = r25
            r9 = r27
            java.util.ArrayList r23 = m3807h(r6, r5, r4, r9, r7)
            if (r23 == 0) goto L_0x0408
            boolean r10 = r23.isEmpty()
            if (r10 == 0) goto L_0x040a
        L_0x0408:
            r5 = r28
        L_0x040a:
            r6.mo1718a(r8, r7)
            java.lang.Object r13 = r6.mo1726l(r5, r8, r2)
            if (r4 == 0) goto L_0x0435
            if (r23 == 0) goto L_0x0435
            int r10 = r23.size()
            if (r10 > 0) goto L_0x0421
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0435
        L_0x0421:
            g7 r9 = new g7
            r9.<init>()
            r10 = r44
            ia$b r10 = (p000.C0614ia.C0616b) r10
            r10.mo3255b(r4, r9)
            ta r11 = new ta
            r11.<init>(r10, r4, r9)
            r6.mo1733s(r4, r13, r9, r11)
        L_0x0435:
            if (r13 == 0) goto L_0x0478
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r14 = r6
            r15 = r13
            r16 = r8
            r17 = r4
            r18 = r5
            r19 = r23
            r20 = r2
            r21 = r30
            r14.mo1730p(r15, r16, r17, r18, r19, r20, r21)
            ua r2 = new ua
            r9 = r2
            r10 = r8
            r11 = r6
            r12 = r7
            r8 = r13
            r13 = r22
            r14 = r30
            r15 = r4
            r16 = r23
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            p000.C0717k8.m2248a(r3, r2)
            ab r2 = new ab
            r4 = r30
            r2.<init>(r6, r4, r0)
            p000.C0717k8.m2248a(r3, r2)
            r6.mo1720c(r3, r8)
            bb r2 = new bb
            r2.<init>(r6, r4, r0)
            p000.C0717k8.m2248a(r3, r2)
        L_0x0478:
            int r14 = r1 + 1
            r0 = r38
            r1 = r39
            r2 = r40
            r3 = r42
            r4 = r43
            r15 = r29
            r5 = r31
            r6 = 1
            r8 = 0
            goto L_0x007c
        L_0x048c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1353xa.m3814o(ia, java.util.ArrayList, java.util.ArrayList, int, int, boolean, xa$a):void");
    }
}
