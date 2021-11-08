package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;
import p000.C0793lt;

/* renamed from: kt */
public abstract class C0746kt extends RecyclerView.C0149e<C0747a> {

    /* renamed from: c */
    public List<C1129so> f3079c = new ArrayList();

    /* renamed from: kt$a */
    public class C0747a extends RecyclerView.C0145a0 {

        /* renamed from: t */
        public C1129so f3080t;

        public C0747a(C0746kt ktVar, View view) {
            super(view);
        }
    }

    public C0746kt(Context context, C0793lt.C0795b bVar) {
        C1129so soVar = C1129so.CAST;
        C1129so soVar2 = C1129so.USB;
        C1129so soVar3 = C1129so.BLUETOOTH;
        C1129so soVar4 = C1129so.HEADPHONES;
        C1129so soVar5 = C1129so.SPEAKER;
        C1129so soVar6 = C1129so.DEFAULT;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f3079c.add(soVar6);
            if (C0728kh.m2286b(context)) {
                this.f3079c.add(C1129so.MUTE);
                this.f3079c.add(C1129so.UNMUTE);
            }
            this.f3079c.add(soVar5);
            this.f3079c.add(soVar4);
            if (C0697ju.m2179b(context)) {
                this.f3079c.add(soVar3);
            }
            if (C0697ju.m2200w(context)) {
                this.f3079c.add(soVar2);
            }
            if (!C0697ju.m2181d(context)) {
                return;
            }
        } else if (ordinal == 1) {
            this.f3079c.add(soVar6);
            this.f3079c.add(soVar5);
            this.f3079c.add(soVar4);
            if (C0697ju.m2179b(context)) {
                this.f3079c.add(soVar3);
            }
            if (C0697ju.m2200w(context)) {
                this.f3079c.add(soVar2);
            }
            if (!C0697ju.m2181d(context)) {
                return;
            }
        } else {
            return;
        }
        this.f3079c.add(soVar);
    }

    /* renamed from: a */
    public int mo1273a() {
        return this.f3079c.size();
    }

    /* renamed from: d */
    public void mo1276d(RecyclerView.C0145a0 a0Var, int i) {
        C0747a aVar = (C0747a) a0Var;
        C1129so soVar = this.f3079c.get(i);
        aVar.f3080t = soVar;
        ImageView imageView = (ImageView) aVar.f996a.findViewById(R.id.auto_config_action_icon);
        TextView textView = (TextView) aVar.f996a.findViewById(R.id.auto_config_action_title);
        imageView.setImageResource(soVar.f4318e);
        imageView.setAlpha(soVar == C1129so.DEFAULT ? 0.25f : 1.0f);
        textView.setText(soVar.f4316c);
    }

    /* renamed from: e */
    public RecyclerView.C0145a0 mo1277e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auto_mode_action_view, viewGroup, false);
        C0747a aVar = new C0747a(this, inflate);
        inflate.setOnClickListener(new C0696jt(this, aVar));
        return aVar;
    }
}
