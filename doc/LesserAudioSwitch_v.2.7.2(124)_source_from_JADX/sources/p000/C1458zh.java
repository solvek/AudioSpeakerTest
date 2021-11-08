package p000;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p000.C1446z8;

/* renamed from: zh */
public class C1458zh implements C1446z8 {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f5313a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5314b;

    public C1458zh(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.f5313a = appBarLayout;
        this.f5314b = z;
    }

    /* renamed from: a */
    public boolean mo1921a(View view, C1446z8.C1447a aVar) {
        this.f5313a.setExpanded(this.f5314b);
        return true;
    }
}
