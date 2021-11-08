package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hc */
public final class C0567hc extends Preference {

    /* renamed from: N */
    public long f2453N;

    public C0567hc(Context context, List<Preference> list, long j) {
        super(context);
        this.f785E = R.layout.expand_button;
        Drawable b = C0399e0.m1530b(this.f794b, R.drawable.ic_arrow_down_24dp);
        if (this.f803k != b) {
            this.f803k = b;
            this.f802j = 0;
            mo913l();
        }
        this.f802j = R.drawable.ic_arrow_down_24dp;
        String string = this.f794b.getString(R.string.expand_button_title);
        if ((string == null && this.f800h != null) || (string != null && !string.equals(this.f800h))) {
            this.f800h = string;
            mo913l();
        }
        mo940E(999);
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference next : list) {
            CharSequence charSequence2 = next.f800h;
            boolean z = next instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) next);
            }
            if (arrayList.contains(next.f789I)) {
                if (z) {
                    arrayList.add((PreferenceGroup) next);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    charSequence = this.f794b.getString(R.string.summary_collapsed_preference_list, new Object[]{charSequence, charSequence2});
                }
            }
        }
        if (this.f792L == null) {
            if (!TextUtils.equals(this.f801i, charSequence)) {
                this.f801i = charSequence;
                mo913l();
            }
            this.f2453N = j + 1000000;
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    /* renamed from: c */
    public long mo945c() {
        return this.f2453N;
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        super.mo909p(rcVar);
        rcVar.f3948u = false;
    }
}
