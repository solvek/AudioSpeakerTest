package p000;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* renamed from: k */
public class C0703k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f2942b;

    /* renamed from: c */
    public final /* synthetic */ View f2943c;

    /* renamed from: d */
    public final /* synthetic */ AlertController f2944d;

    public C0703k(AlertController alertController, View view, View view2) {
        this.f2944d = alertController;
        this.f2942b = view;
        this.f2943c = view2;
    }

    public void run() {
        AlertController.m64c(this.f2944d.f167g, this.f2942b, this.f2943c);
    }
}
