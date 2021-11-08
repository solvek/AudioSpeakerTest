package p000;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: gi */
public class C0537gi extends FloatingActionButton.C0319a {

    /* renamed from: a */
    public final /* synthetic */ int f2327a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f2328b;

    /* renamed from: gi$a */
    public class C0538a extends FloatingActionButton.C0319a {
        public C0538a() {
        }

        /* renamed from: b */
        public void mo2284b(FloatingActionButton floatingActionButton) {
            BottomAppBar.m1190v(C0537gi.this.f2328b);
        }
    }

    public C0537gi(BottomAppBar bottomAppBar, int i) {
        this.f2328b = bottomAppBar;
        this.f2327a = i;
    }

    /* renamed from: a */
    public void mo2283a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f2328b;
        int i = this.f2327a;
        int i2 = BottomAppBar.f1462W;
        floatingActionButton.setTranslationX(bottomAppBar.mo1873A(i));
        floatingActionButton.mo2241m(new C0538a(), true);
    }
}
