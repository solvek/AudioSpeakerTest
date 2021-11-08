package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.nordskog.LesserAudioSwitch.R;
import java.util.Iterator;

/* renamed from: zs */
public class C1476zs extends Fragment {

    /* renamed from: T */
    public ViewGroup f5364T;

    /* renamed from: U */
    public Button f5365U;

    /* renamed from: V */
    public Button f5366V;

    /* renamed from: W */
    public TextView f5367W;

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
    }

    /* renamed from: O */
    public View mo837O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.log_layout, viewGroup, false);
        this.f5364T = viewGroup2;
        this.f5365U = (Button) viewGroup2.findViewById(R.id.refresh_button);
        this.f5366V = (Button) this.f5364T.findViewById(R.id.clear_button);
        this.f5365U.setOnClickListener(new C1325wq(this));
        this.f5366V.setOnClickListener(new C1428yq(this));
        this.f5367W = (TextView) this.f5364T.findViewById(R.id.log_view);
        mo5321w0();
        return this.f5364T;
    }

    /* renamed from: W */
    public void mo845W() {
        C0438eu.f2044b.clear();
        this.f678C = true;
    }

    /* renamed from: a0 */
    public void mo849a0() {
        this.f678C = true;
        C1250v9 i = mo862i();
        if (i != null) {
            i.setTitle(R.string.title_event_log);
        }
        C0438eu.f2044b.add(new C1386xq(this));
    }

    /* renamed from: w0 */
    public final void mo5321w0() {
        TextView textView = this.f5367W;
        StringBuilder sb = new StringBuilder();
        synchronized (C0438eu.f2043a) {
            Iterator it = C0438eu.f2043a.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
        }
        textView.setText(sb.toString(), TextView.BufferType.SPANNABLE);
    }
}
