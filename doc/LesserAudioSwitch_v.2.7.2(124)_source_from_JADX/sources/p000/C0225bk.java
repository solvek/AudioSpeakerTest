package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nordskog.LesserAudioSwitch.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: bk */
public class C0225bk extends RecyclerView.C0149e<C0226a> {

    /* renamed from: c */
    public final C0473fj<?> f1284c;

    /* renamed from: bk$a */
    public static class C0226a extends RecyclerView.C0145a0 {

        /* renamed from: t */
        public final TextView f1285t;

        public C0226a(TextView textView) {
            super(textView);
            this.f1285t = textView;
        }
    }

    public C0225bk(C0473fj<?> fjVar) {
        this.f1284c = fjVar;
    }

    /* renamed from: a */
    public int mo1273a() {
        return this.f1284c.f2136W.f5319f;
    }

    /* renamed from: d */
    public void mo1276d(RecyclerView.C0145a0 a0Var, int i) {
        C0226a aVar = (C0226a) a0Var;
        int i2 = this.f1284c.f2136W.f5315b.f3969e + i;
        String string = aVar.f1285t.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f1285t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        aVar.f1285t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i2)}));
        C0224bj bjVar = this.f1284c.f2139Z;
        Calendar d = C1463zj.m3973d();
        C0028aj ajVar = d.get(1) == i2 ? bjVar.f1281f : bjVar.f1279d;
        for (Long longValue : this.f1284c.f2135V.mo1774h()) {
            d.setTimeInMillis(longValue.longValue());
            if (d.get(1) == i2) {
                ajVar = bjVar.f1280e;
            }
        }
        ajVar.mo119b(aVar.f1285t);
        aVar.f1285t.setOnClickListener(new C0029ak(this, i2));
    }

    /* renamed from: e */
    public RecyclerView.C0145a0 mo1277e(ViewGroup viewGroup, int i) {
        return new C0226a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: g */
    public int mo1604g(int i) {
        return i - this.f1284c.f2136W.f5315b.f3969e;
    }
}
