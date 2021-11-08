package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: vs */
public class C1277vs extends Fragment {

    /* renamed from: a0 */
    public static final /* synthetic */ int f4842a0 = 0;

    /* renamed from: T */
    public ViewGroup f4843T;

    /* renamed from: U */
    public Button f4844U;

    /* renamed from: V */
    public Button f4845V;

    /* renamed from: W */
    public Button f4846W;

    /* renamed from: X */
    public Button f4847X;

    /* renamed from: Y */
    public Button f4848Y;

    /* renamed from: Z */
    public TextView f4849Z;

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
    }

    /* renamed from: O */
    public View mo837O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.debug_layout, viewGroup, false);
        this.f4843T = viewGroup2;
        this.f4844U = (Button) viewGroup2.findViewById(R.id.input_devices_button);
        this.f4845V = (Button) this.f4843T.findViewById(R.id.output_devices_button);
        this.f4846W = (Button) this.f4843T.findViewById(R.id.devices_button);
        this.f4847X = (Button) this.f4843T.findViewById(R.id.force_button);
        this.f4848Y = (Button) this.f4843T.findViewById(R.id.streams_button);
        this.f4849Z = (TextView) this.f4843T.findViewById(R.id.debug_results);
        this.f4844U.setOnClickListener(new C0648iq(this));
        this.f4845V.setOnClickListener(new C0847mq(this));
        this.f4846W.setOnClickListener(new C0790lq(this));
        this.f4847X.setOnClickListener(new C1183ts(this));
        this.f4848Y.setOnClickListener(new C1226us(this));
        return this.f4843T;
    }

    /* renamed from: a0 */
    public void mo849a0() {
        this.f678C = true;
        mo862i().setTitle(R.string.title_settings);
    }

    /* renamed from: w0 */
    public final void mo4925w0(C0985po[] poVarArr) {
        new Handler(Looper.getMainLooper()).post(new C0942oq(this, poVarArr));
    }
}
