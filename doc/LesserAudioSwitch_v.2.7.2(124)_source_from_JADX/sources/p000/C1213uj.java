package p000;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import p000.C0473fj;

/* renamed from: uj */
public class C1213uj extends RecyclerView.C0149e<C1214a> {

    /* renamed from: c */
    public final C1459zi f4629c;

    /* renamed from: d */
    public final C0281cj<?> f4630d;

    /* renamed from: e */
    public final C0473fj.C0479f f4631e;

    /* renamed from: f */
    public final int f4632f;

    /* renamed from: uj$a */
    public static class C1214a extends RecyclerView.C0145a0 {

        /* renamed from: t */
        public final TextView f4633t;

        /* renamed from: u */
        public final MaterialCalendarGridView f4634u;

        public C1214a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f4633t = textView;
            Field field = C0813m8.f3234a;
            C0961p8 p8Var = new C0961p8(R.id.tag_accessibility_heading, Boolean.class, 28);
            Boolean bool = Boolean.TRUE;
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i >= 28) {
                p8Var.mo3975d(textView, bool);
            } else {
                if ((i < 19 ? false : z2) && p8Var.mo3976e(p8Var.mo3669c(textView), bool)) {
                    C1444z7 e = C0813m8.m2471e(textView);
                    C0813m8.m2457F(textView, e == null ? new C1444z7() : e);
                    textView.setTag(p8Var.f3244a, bool);
                    C0813m8.m2487u(textView, 0);
                }
            }
            this.f4634u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C1213uj(Context context, C0281cj<?> cjVar, C1459zi ziVar, C0473fj.C0479f fVar) {
        C1064rj rjVar = ziVar.f5315b;
        C1064rj rjVar2 = ziVar.f5316c;
        C1064rj rjVar3 = ziVar.f5317d;
        if (rjVar.compareTo(rjVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (rjVar3.compareTo(rjVar2) <= 0) {
            int i = C1123sj.f4261f;
            int i2 = C0473fj.f2133e0;
            this.f4632f = (i * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + (C0885nj.m2605C0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.f4629c = ziVar;
            this.f4630d = cjVar;
            this.f4631e = fVar;
            mo1278f(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: a */
    public int mo1273a() {
        return this.f4629c.f5320g;
    }

    /* renamed from: b */
    public long mo1274b(int i) {
        return this.f4629c.f5315b.mo4264o(i).f3966b.getTimeInMillis();
    }

    /* renamed from: d */
    public void mo1276d(RecyclerView.C0145a0 a0Var, int i) {
        C1214a aVar = (C1214a) a0Var;
        C1064rj o = this.f4629c.f5315b.mo4264o(i);
        aVar.f4633t.setText(o.f3967c);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f4634u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o.equals(materialCalendarGridView.getAdapter().f4262b)) {
            C1123sj sjVar = new C1123sj(o, this.f4630d, this.f4629c);
            materialCalendarGridView.setNumColumns(o.f3970f);
            materialCalendarGridView.setAdapter((ListAdapter) sjVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C1172tj(this, materialCalendarGridView));
    }

    /* renamed from: e */
    public RecyclerView.C0145a0 mo1277e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0885nj.m2605C0(viewGroup.getContext())) {
            return new C1214a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0165n(-1, this.f4632f));
        return new C1214a(linearLayout, true);
    }

    /* renamed from: g */
    public C1064rj mo4778g(int i) {
        return this.f4629c.f5315b.mo4264o(i);
    }

    /* renamed from: h */
    public int mo4779h(C1064rj rjVar) {
        return this.f4629c.f5315b.mo4265p(rjVar);
    }
}
