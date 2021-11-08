package p000;

import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: ij */
public class C0633ij extends RecyclerView.C0168q {

    /* renamed from: a */
    public final /* synthetic */ C1213uj f2714a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f2715b;

    /* renamed from: c */
    public final /* synthetic */ C0473fj f2716c;

    public C0633ij(C0473fj fjVar, C1213uj ujVar, MaterialButton materialButton) {
        this.f2716c = fjVar;
        this.f2714a = ujVar;
        this.f2715b = materialButton;
    }

    /* renamed from: a */
    public void mo1366a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            CharSequence text = this.f2715b.getText();
            if (Build.VERSION.SDK_INT >= 16) {
                recyclerView.announceForAccessibility(text);
            } else {
                recyclerView.sendAccessibilityEvent(2048);
            }
        }
    }

    /* renamed from: b */
    public void mo1367b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager w0 = this.f2716c.mo2792w0();
        int j1 = i < 0 ? w0.mo1069j1() : w0.mo1072l1();
        this.f2716c.f2137X = this.f2714a.mo4778g(j1);
        this.f2715b.setText(this.f2714a.f4629c.f5315b.mo4264o(j1).f3967c);
    }
}
