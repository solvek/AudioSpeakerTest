package p000;

import android.text.Html;
import android.widget.TextView;
import java.util.List;
import p000.C0735ko;

/* renamed from: jq */
public final /* synthetic */ class C0693jq implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1277vs f2927b;

    /* renamed from: c */
    public final /* synthetic */ List f2928c;

    public /* synthetic */ C0693jq(C1277vs vsVar, List list) {
        this.f2927b = vsVar;
        this.f2928c = list;
    }

    public final void run() {
        C1277vs vsVar = this.f2927b;
        List<C0593hu> list = this.f2928c;
        vsVar.f4849Z.setText("", TextView.BufferType.SPANNABLE);
        for (C0593hu huVar : list) {
            StringBuilder c = C0279ch.m1106c("<font color='green'>");
            c.append(((C0735ko.C0741f) huVar.f2504a).toString());
            c.append(":</font> ");
            vsVar.f4849Z.append(Html.fromHtml(c.toString()));
            vsVar.f4849Z.append(((C0544go) huVar.f2505b).toString());
            vsVar.f4849Z.append("\n");
        }
    }
}
