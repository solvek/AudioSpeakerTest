package p000;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p000.C0821mb;

/* renamed from: qa */
public abstract class C1009qa {

    /* renamed from: a */
    public ArrayList<C1010a> f3784a = new ArrayList<>();

    /* renamed from: b */
    public int f3785b;

    /* renamed from: c */
    public int f3786c;

    /* renamed from: d */
    public int f3787d;

    /* renamed from: e */
    public int f3788e;

    /* renamed from: f */
    public int f3789f;

    /* renamed from: g */
    public boolean f3790g;

    /* renamed from: h */
    public boolean f3791h = true;

    /* renamed from: i */
    public String f3792i;

    /* renamed from: j */
    public int f3793j;

    /* renamed from: k */
    public CharSequence f3794k;

    /* renamed from: l */
    public int f3795l;

    /* renamed from: m */
    public CharSequence f3796m;

    /* renamed from: n */
    public ArrayList<String> f3797n;

    /* renamed from: o */
    public ArrayList<String> f3798o;

    /* renamed from: p */
    public boolean f3799p = false;

    /* renamed from: qa$a */
    public static final class C1010a {

        /* renamed from: a */
        public int f3800a;

        /* renamed from: b */
        public Fragment f3801b;

        /* renamed from: c */
        public int f3802c;

        /* renamed from: d */
        public int f3803d;

        /* renamed from: e */
        public int f3804e;

        /* renamed from: f */
        public int f3805f;

        /* renamed from: g */
        public C0821mb.C0823b f3806g;

        /* renamed from: h */
        public C0821mb.C0823b f3807h;

        public C1010a() {
        }

        public C1010a(int i, Fragment fragment) {
            this.f3800a = i;
            this.f3801b = fragment;
            C0821mb.C0823b bVar = C0821mb.C0823b.RESUMED;
            this.f3806g = bVar;
            this.f3807h = bVar;
        }
    }

    public C1009qa(C0412ea eaVar, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public void mo4067b(C1010a aVar) {
        this.f3784a.add(aVar);
        aVar.f3802c = this.f3785b;
        aVar.f3803d = this.f3786c;
        aVar.f3804e = this.f3787d;
        aVar.f3805f = this.f3788e;
    }

    /* renamed from: c */
    public C1009qa mo4068c(String str) {
        if (this.f3791h) {
            this.f3790g = true;
            this.f3792i = null;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: d */
    public abstract void mo4069d(int i, Fragment fragment, String str, int i2);

    /* renamed from: e */
    public C1009qa mo4070e(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo4069d(i, fragment, (String) null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
