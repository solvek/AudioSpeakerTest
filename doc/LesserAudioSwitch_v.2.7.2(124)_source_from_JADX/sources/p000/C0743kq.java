package p000;

import android.text.Html;
import android.widget.TextView;
import java.util.List;
import p000.C0735ko;

/* renamed from: kq */
public final /* synthetic */ class C0743kq implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1277vs f3075b;

    /* renamed from: c */
    public final /* synthetic */ List f3076c;

    public /* synthetic */ C0743kq(C1277vs vsVar, List list) {
        this.f3075b = vsVar;
        this.f3076c = list;
    }

    public final void run() {
        C1277vs vsVar = this.f3075b;
        List<C0593hu> list = this.f3076c;
        vsVar.f4849Z.setText("", TextView.BufferType.SPANNABLE);
        for (C0593hu huVar : list) {
            StringBuilder c = C0279ch.m1106c("<font color='green'>");
            c.append(huVar.f2504a);
            c.append(":</font> ");
            vsVar.f4849Z.append(Html.fromHtml(c.toString()));
            vsVar.f4849Z.append(((C0735ko.C0739d) huVar.f2505b).toString());
            vsVar.f4849Z.append("\n");
        }
    }
}
