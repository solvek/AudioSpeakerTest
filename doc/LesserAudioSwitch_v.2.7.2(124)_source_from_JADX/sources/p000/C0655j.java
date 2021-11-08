package p000;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* renamed from: j */
public class C0655j implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ View f2771a;

    /* renamed from: b */
    public final /* synthetic */ View f2772b;

    public C0655j(AlertController alertController, View view, View view2) {
        this.f2771a = view;
        this.f2772b = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m64c(absListView, this.f2771a, this.f2772b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
