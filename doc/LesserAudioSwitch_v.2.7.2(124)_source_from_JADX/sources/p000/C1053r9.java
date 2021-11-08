package p000;

import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000.C0614ia;
import p000.C1009qa;

/* renamed from: r9 */
public final class C1053r9 extends C1009qa implements C0614ia.C0619e {

    /* renamed from: q */
    public final C0614ia f3941q;

    /* renamed from: r */
    public boolean f3942r;

    /* renamed from: s */
    public int f3943s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1053r9(p000.C0614ia r3) {
        /*
            r2 = this;
            ea r0 = r3.mo3202K()
            fa<?> r1 = r3.f2653n
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f2101c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f3943s = r0
            r2.f3941q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1053r9.<init>(ia):void");
    }

    /* renamed from: n */
    public static boolean m2999n(C1009qa.C1010a aVar) {
        Fragment fragment = aVar.f3801b;
        if (fragment == null || !fragment.f703k || fragment.f680E == null || fragment.f718z || fragment.f717y) {
            return false;
        }
        Fragment.C0102a aVar2 = fragment.f683H;
        return false;
    }

    /* renamed from: a */
    public boolean mo3257a(ArrayList<C1053r9> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0614ia.m1934M(2)) {
            "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3790g) {
            return true;
        }
        C0614ia iaVar = this.f3941q;
        if (iaVar.f2643d == null) {
            iaVar.f2643d = new ArrayList<>();
        }
        iaVar.f2643d.add(this);
        return true;
    }

    /* renamed from: d */
    public void mo4069d(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder c = C0279ch.m1106c("Fragment ");
            c.append(cls.getCanonicalName());
            c.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(c.toString());
        }
        if (str != null) {
            String str2 = fragment.f716x;
            if (str2 == null || str.equals(str2)) {
                fragment.f716x = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f716x + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f714v;
                if (i3 == 0 || i3 == i) {
                    fragment.f714v = i;
                    fragment.f715w = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f714v + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo4067b(new C1009qa.C1010a(i2, fragment));
        fragment.f710r = this.f3941q;
    }

    /* renamed from: f */
    public void mo4222f(int i) {
        if (this.f3790g) {
            if (C0614ia.m1934M(2)) {
                "Bump nesting in " + this + " by " + i;
            }
            int size = this.f3784a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1009qa.C1010a aVar = this.f3784a.get(i2);
                Fragment fragment = aVar.f3801b;
                if (fragment != null) {
                    fragment.f709q += i;
                    if (C0614ia.m1934M(2)) {
                        StringBuilder c = C0279ch.m1106c("Bump nesting of ");
                        c.append(aVar.f3801b);
                        c.append(" to ");
                        c.append(aVar.f3801b.f709q);
                        c.toString();
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public int mo4223g() {
        return mo4224h(false);
    }

    /* renamed from: h */
    public int mo4224h(boolean z) {
        if (!this.f3942r) {
            if (C0614ia.m1934M(2)) {
                "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new C1240v7("FragmentManager"));
                mo4225i("  ", printWriter, true);
                printWriter.close();
            }
            this.f3942r = true;
            this.f3943s = this.f3790g ? this.f3941q.f2648i.getAndIncrement() : -1;
            this.f3941q.mo3253z(this, z);
            return this.f3943s;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: i */
    public void mo4225i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3792i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3943s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3942r);
            if (this.f3789f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3789f));
            }
            if (!(this.f3785b == 0 && this.f3786c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3785b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3786c));
            }
            if (!(this.f3787d == 0 && this.f3788e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3787d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3788e));
            }
            if (!(this.f3793j == 0 && this.f3794k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3793j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3794k);
            }
            if (!(this.f3795l == 0 && this.f3796m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3795l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3796m);
            }
        }
        if (!this.f3784a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3784a.size();
            for (int i = 0; i < size; i++) {
                C1009qa.C1010a aVar = this.f3784a.get(i);
                switch (aVar.f3800a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder c = C0279ch.m1106c("cmd=");
                        c.append(aVar.f3800a);
                        str2 = c.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3801b);
                if (z) {
                    if (!(aVar.f3802c == 0 && aVar.f3803d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3802c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3803d));
                    }
                    if (aVar.f3804e != 0 || aVar.f3805f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3804e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3805f));
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public void mo4226j() {
        int size = this.f3784a.size();
        for (int i = 0; i < size; i++) {
            C1009qa.C1010a aVar = this.f3784a.get(i);
            Fragment fragment = aVar.f3801b;
            if (fragment != null) {
                int i2 = this.f3789f;
                if (!(fragment.f683H == null && i2 == 0)) {
                    fragment.mo857g();
                    fragment.f683H.f724e = i2;
                }
            }
            switch (aVar.f3800a) {
                case 1:
                    fragment.mo886s0(aVar.f3802c);
                    this.f3941q.mo3224d0(fragment, false);
                    this.f3941q.mo3219b(fragment);
                    break;
                case 3:
                    fragment.mo886s0(aVar.f3803d);
                    this.f3941q.mo3214X(fragment);
                    break;
                case 4:
                    fragment.mo886s0(aVar.f3803d);
                    this.f3941q.mo3203L(fragment);
                    break;
                case 5:
                    fragment.mo886s0(aVar.f3802c);
                    this.f3941q.mo3224d0(fragment, false);
                    this.f3941q.mo3232h0(fragment);
                    break;
                case 6:
                    fragment.mo886s0(aVar.f3803d);
                    this.f3941q.mo3233i(fragment);
                    break;
                case 7:
                    fragment.mo886s0(aVar.f3802c);
                    this.f3941q.mo3224d0(fragment, false);
                    this.f3941q.mo3223d(fragment);
                    break;
                case 8:
                    this.f3941q.mo3228f0(fragment);
                    break;
                case 9:
                    this.f3941q.mo3228f0((Fragment) null);
                    break;
                case 10:
                    this.f3941q.mo3226e0(fragment, aVar.f3807h);
                    break;
                default:
                    StringBuilder c = C0279ch.m1106c("Unknown cmd: ");
                    c.append(aVar.f3800a);
                    throw new IllegalArgumentException(c.toString());
            }
            if (!(this.f3799p || aVar.f3800a == 1 || fragment == null)) {
                this.f3941q.mo3208R(fragment);
            }
        }
        if (!this.f3799p) {
            C0614ia iaVar = this.f3941q;
            iaVar.mo3209S(iaVar.f2652m, true);
        }
    }

    /* renamed from: k */
    public void mo4227k(boolean z) {
        for (int size = this.f3784a.size() - 1; size >= 0; size--) {
            C1009qa.C1010a aVar = this.f3784a.get(size);
            Fragment fragment = aVar.f3801b;
            if (fragment != null) {
                int i = this.f3789f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                if (!(fragment.f683H == null && i2 == 0)) {
                    fragment.mo857g();
                    fragment.f683H.f724e = i2;
                }
            }
            switch (aVar.f3800a) {
                case 1:
                    fragment.mo886s0(aVar.f3805f);
                    this.f3941q.mo3224d0(fragment, true);
                    this.f3941q.mo3214X(fragment);
                    break;
                case 3:
                    fragment.mo886s0(aVar.f3804e);
                    this.f3941q.mo3219b(fragment);
                    break;
                case 4:
                    fragment.mo886s0(aVar.f3804e);
                    this.f3941q.mo3232h0(fragment);
                    break;
                case 5:
                    fragment.mo886s0(aVar.f3805f);
                    this.f3941q.mo3224d0(fragment, true);
                    this.f3941q.mo3203L(fragment);
                    break;
                case 6:
                    fragment.mo886s0(aVar.f3804e);
                    this.f3941q.mo3223d(fragment);
                    break;
                case 7:
                    fragment.mo886s0(aVar.f3805f);
                    this.f3941q.mo3224d0(fragment, true);
                    this.f3941q.mo3233i(fragment);
                    break;
                case 8:
                    this.f3941q.mo3228f0((Fragment) null);
                    break;
                case 9:
                    this.f3941q.mo3228f0(fragment);
                    break;
                case 10:
                    this.f3941q.mo3226e0(fragment, aVar.f3806g);
                    break;
                default:
                    StringBuilder c = C0279ch.m1106c("Unknown cmd: ");
                    c.append(aVar.f3800a);
                    throw new IllegalArgumentException(c.toString());
            }
            if (!(this.f3799p || aVar.f3800a == 3 || fragment == null)) {
                this.f3941q.mo3208R(fragment);
            }
        }
        if (!this.f3799p && z) {
            C0614ia iaVar = this.f3941q;
            iaVar.mo3209S(iaVar.f2652m, true);
        }
    }

    /* renamed from: l */
    public boolean mo4228l(int i) {
        int size = this.f3784a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f3784a.get(i2).f3801b;
            int i3 = fragment != null ? fragment.f715w : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo4229m(ArrayList<C1053r9> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3784a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f3784a.get(i4).f3801b;
            int i5 = fragment != null ? fragment.f715w : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1053r9 r9Var = arrayList.get(i6);
                    int size2 = r9Var.f3784a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = r9Var.f3784a.get(i7).f3801b;
                        if ((fragment2 != null ? fragment2.f715w : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3943s >= 0) {
            sb.append(" #");
            sb.append(this.f3943s);
        }
        if (this.f3792i != null) {
            sb.append(" ");
            sb.append(this.f3792i);
        }
        sb.append("}");
        return sb.toString();
    }
}
