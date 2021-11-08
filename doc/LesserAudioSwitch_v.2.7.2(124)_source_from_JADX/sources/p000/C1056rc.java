package p000;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: rc */
public class C1056rc extends RecyclerView.C0145a0 {

    /* renamed from: t */
    public final SparseArray<View> f3947t;

    /* renamed from: u */
    public boolean f3948u;

    /* renamed from: v */
    public boolean f3949v;

    public C1056rc(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f3947t = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
    }

    /* renamed from: w */
    public View mo4232w(int i) {
        View view = this.f3947t.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f996a.findViewById(i);
        if (findViewById != null) {
            this.f3947t.put(i, findViewById);
        }
        return findViewById;
    }
}
