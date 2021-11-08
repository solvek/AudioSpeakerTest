package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: d1 */
public abstract class C0361d1 implements C0597i1, C0449f1, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f1875b;

    /* renamed from: n */
    public static int m1463n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C1394y0 y0Var = (C1394y0) listAdapter;
        int count = y0Var.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = y0Var.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = y0Var.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public static boolean m1464v(C1435z0 z0Var) {
        int size = z0Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = z0Var.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo590c(C1435z0 z0Var, C0203b1 b1Var) {
        return false;
    }

    /* renamed from: j */
    public void mo594j(Context context, C1435z0 z0Var) {
    }

    /* renamed from: k */
    public boolean mo595k(C1435z0 z0Var, C0203b1 b1Var) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo2621l(C1435z0 z0Var);

    /* renamed from: m */
    public boolean mo2622m() {
        return true;
    }

    /* renamed from: o */
    public abstract void mo2623o(View view);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1394y0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1394y0) listAdapter).f5147b.mo5255s((MenuItem) listAdapter.getItem(i), this, mo2622m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo2625p(boolean z);

    /* renamed from: q */
    public abstract void mo2626q(int i);

    /* renamed from: r */
    public abstract void mo2627r(int i);

    /* renamed from: s */
    public abstract void mo2628s(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: t */
    public abstract void mo2629t(boolean z);

    /* renamed from: u */
    public abstract void mo2630u(int i);
}
