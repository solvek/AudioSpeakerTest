package p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import p000.C0821mb;

/* renamed from: oa */
public class C0921oa {

    /* renamed from: a */
    public final C0564ha f3488a;

    /* renamed from: b */
    public final Fragment f3489b;

    /* renamed from: c */
    public int f3490c = -1;

    public C0921oa(C0564ha haVar, Fragment fragment) {
        this.f3488a = haVar;
        this.f3489b = fragment;
    }

    public C0921oa(C0564ha haVar, Fragment fragment, C0866na naVar) {
        this.f3488a = haVar;
        this.f3489b = fragment;
        fragment.f696d = null;
        fragment.f709q = 0;
        fragment.f706n = false;
        fragment.f703k = false;
        Fragment fragment2 = fragment.f699g;
        fragment.f700h = fragment2 != null ? fragment2.f697e : null;
        fragment.f699g = null;
        Bundle bundle = naVar.f3364n;
        fragment.f695c = bundle == null ? new Bundle() : bundle;
    }

    public C0921oa(C0564ha haVar, ClassLoader classLoader, C0412ea eaVar, C0866na naVar) {
        this.f3488a = haVar;
        Fragment a = eaVar.mo2719a(classLoader, naVar.f3352b);
        this.f3489b = a;
        Bundle bundle = naVar.f3361k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo882q0(naVar.f3361k);
        a.f697e = naVar.f3353c;
        a.f705m = naVar.f3354d;
        a.f707o = true;
        a.f714v = naVar.f3355e;
        a.f715w = naVar.f3356f;
        a.f716x = naVar.f3357g;
        a.f676A = naVar.f3358h;
        a.f704l = naVar.f3359i;
        a.f718z = naVar.f3360j;
        a.f717y = naVar.f3362l;
        a.f689N = C0821mb.C0823b.values()[naVar.f3363m];
        Bundle bundle2 = naVar.f3364n;
        a.f695c = bundle2 == null ? new Bundle() : bundle2;
        if (C0614ia.m1934M(2)) {
            "Instantiated fragment " + a;
        }
    }

    /* renamed from: a */
    public void mo3837a(ClassLoader classLoader) {
        Bundle bundle = this.f3489b.f695c;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3489b;
            fragment.f696d = fragment.f695c.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3489b;
            fragment2.f700h = fragment2.f695c.getString("android:target_state");
            Fragment fragment3 = this.f3489b;
            if (fragment3.f700h != null) {
                fragment3.f701i = fragment3.f695c.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f3489b;
            fragment4.getClass();
            fragment4.f682G = fragment4.f695c.getBoolean("android:user_visible_hint", true);
            Fragment fragment5 = this.f3489b;
            if (!fragment5.f682G) {
                fragment5.f681F = true;
            }
        }
    }

    /* renamed from: b */
    public void mo3838b() {
        if (this.f3489b.f680E != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3489b.f680E.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3489b.f696d = sparseArray;
            }
        }
    }
}
