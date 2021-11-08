package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: ue */
public class C1208ue implements C1260ve {

    /* renamed from: a */
    public final ViewGroupOverlay f4618a;

    public C1208ue(ViewGroup viewGroup) {
        this.f4618a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo4643a(View view) {
        this.f4618a.remove(view);
    }

    /* renamed from: b */
    public void mo4644b(View view) {
        this.f4618a.add(view);
    }
}
