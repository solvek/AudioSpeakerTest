package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p000.C1446z8;

/* renamed from: yh */
public class C1418yh implements C1446z8 {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f5196a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f5197b;

    /* renamed from: c */
    public final /* synthetic */ View f5198c;

    /* renamed from: d */
    public final /* synthetic */ int f5199d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5200e;

    public C1418yh(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f5200e = baseBehavior;
        this.f5196a = coordinatorLayout;
        this.f5197b = appBarLayout;
        this.f5198c = view;
        this.f5199d = i;
    }

    /* renamed from: a */
    public boolean mo1921a(View view, C1446z8.C1447a aVar) {
        this.f5200e.mo1849L(this.f5196a, this.f5197b, this.f5198c, this.f5199d, new int[]{0, 0});
        return true;
    }
}
