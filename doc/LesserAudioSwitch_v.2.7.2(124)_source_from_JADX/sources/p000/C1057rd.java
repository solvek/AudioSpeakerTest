package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p000.C1347x8;

/* renamed from: rd */
public class C1057rd extends C1444z7 {

    /* renamed from: d */
    public final RecyclerView f3950d;

    /* renamed from: e */
    public final C1058a f3951e;

    /* renamed from: rd$a */
    public static class C1058a extends C1444z7 {

        /* renamed from: d */
        public final C1057rd f3952d;

        /* renamed from: e */
        public Map<View, C1444z7> f3953e = new WeakHashMap();

        public C1058a(C1057rd rdVar) {
            this.f3952d = rdVar;
        }

        /* renamed from: a */
        public boolean mo4234a(View view, AccessibilityEvent accessibilityEvent) {
            C1444z7 z7Var = this.f3953e.get(view);
            return z7Var != null ? z7Var.mo4234a(view, accessibilityEvent) : this.f5273a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C1402y8 mo3603b(View view) {
            C1444z7 z7Var = this.f3953e.get(view);
            return z7Var != null ? z7Var.mo3603b(view) : super.mo3603b(view);
        }

        /* renamed from: c */
        public void mo816c(View view, AccessibilityEvent accessibilityEvent) {
            C1444z7 z7Var = this.f3953e.get(view);
            if (z7Var != null) {
                z7Var.mo816c(view, accessibilityEvent);
            } else {
                this.f5273a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            if (!this.f3952d.mo4233k() && this.f3952d.f3950d.getLayoutManager() != null) {
                this.f3952d.f3950d.getLayoutManager().mo1344k0(view, x8Var);
                C1444z7 z7Var = this.f3953e.get(view);
                if (z7Var != null) {
                    z7Var.mo817d(view, x8Var);
                    return;
                }
            }
            this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
        }

        /* renamed from: e */
        public void mo3713e(View view, AccessibilityEvent accessibilityEvent) {
            C1444z7 z7Var = this.f3953e.get(view);
            if (z7Var != null) {
                z7Var.mo3713e(view, accessibilityEvent);
            } else {
                this.f5273a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        /* renamed from: f */
        public boolean mo4235f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1444z7 z7Var = this.f3953e.get(viewGroup);
            return z7Var != null ? z7Var.mo4235f(viewGroup, view, accessibilityEvent) : this.f5273a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: g */
        public boolean mo818g(View view, int i, Bundle bundle) {
            if (this.f3952d.mo4233k() || this.f3952d.f3950d.getLayoutManager() == null) {
                return super.mo818g(view, i, bundle);
            }
            C1444z7 z7Var = this.f3953e.get(view);
            if (z7Var != null) {
                if (z7Var.mo818g(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo818g(view, i, bundle)) {
                return true;
            }
            RecyclerView.C0160m layoutManager = this.f3952d.f3950d.getLayoutManager();
            RecyclerView.C0171s sVar = layoutManager.f1028b.f948c;
            return layoutManager.mo1301C0();
        }

        /* renamed from: h */
        public void mo4236h(View view, int i) {
            C1444z7 z7Var = this.f3953e.get(view);
            if (z7Var != null) {
                z7Var.mo4236h(view, i);
            } else {
                this.f5273a.sendAccessibilityEvent(view, i);
            }
        }

        /* renamed from: i */
        public void mo4237i(View view, AccessibilityEvent accessibilityEvent) {
            C1444z7 z7Var = this.f3953e.get(view);
            if (z7Var != null) {
                z7Var.mo4237i(view, accessibilityEvent);
            } else {
                this.f5273a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C1057rd(RecyclerView recyclerView) {
        this.f3950d = recyclerView;
        C1444z7 j = mo4077j();
        this.f3951e = (j == null || !(j instanceof C1058a)) ? new C1058a(this) : (C1058a) j;
    }

    /* renamed from: c */
    public void mo816c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5273a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo4233k()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo1066i0(accessibilityEvent);
            }
        }
    }

    /* renamed from: d */
    public void mo817d(View view, C1347x8 x8Var) {
        this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
        if (!mo4233k() && this.f3950d.getLayoutManager() != null) {
            RecyclerView.C0160m layoutManager = this.f3950d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f1028b;
            RecyclerView.C0171s sVar = recyclerView.f948c;
            RecyclerView.C0179x xVar = recyclerView.f959h0;
            if (recyclerView.canScrollVertically(-1) || layoutManager.f1028b.canScrollHorizontally(-1)) {
                x8Var.f5038a.addAction(8192);
                x8Var.f5038a.setScrollable(true);
            }
            if (layoutManager.f1028b.canScrollVertically(1) || layoutManager.f1028b.canScrollHorizontally(1)) {
                x8Var.f5038a.addAction(4096);
                x8Var.f5038a.setScrollable(true);
            }
            x8Var.mo5063i(C1347x8.C1349b.m3798a(layoutManager.mo1018S(sVar, xVar), layoutManager.mo1003A(sVar, xVar), layoutManager.mo1331W(), layoutManager.mo1328T()));
        }
    }

    /* renamed from: g */
    public boolean mo818g(View view, int i, Bundle bundle) {
        if (super.mo818g(view, i, bundle)) {
            return true;
        }
        if (mo4233k() || this.f3950d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.C0160m layoutManager = this.f3950d.getLayoutManager();
        RecyclerView.C0171s sVar = layoutManager.f1028b.f948c;
        return layoutManager.mo1299B0(i);
    }

    /* renamed from: j */
    public C1444z7 mo4077j() {
        return this.f3951e;
    }

    /* renamed from: k */
    public boolean mo4233k() {
        return this.f3950d.mo1111M();
    }
}
