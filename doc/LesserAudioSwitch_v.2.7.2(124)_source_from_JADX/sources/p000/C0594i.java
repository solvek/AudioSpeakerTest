package p000;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* renamed from: i */
public class C0594i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f2506b;

    /* renamed from: c */
    public final /* synthetic */ View f2507c;

    /* renamed from: d */
    public final /* synthetic */ AlertController f2508d;

    public C0594i(AlertController alertController, View view, View view2) {
        this.f2508d = alertController;
        this.f2506b = view;
        this.f2507c = view2;
    }

    public void run() {
        AlertController.m64c(this.f2508d.f143A, this.f2506b, this.f2507c);
    }
}
