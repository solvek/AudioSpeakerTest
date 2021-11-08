package p000;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* renamed from: nc */
public class C0869nc implements Preference.C0123d {

    /* renamed from: a */
    public final /* synthetic */ PreferenceGroup f3365a;

    /* renamed from: b */
    public final /* synthetic */ C0824mc f3366b;

    public C0869nc(C0824mc mcVar, PreferenceGroup preferenceGroup) {
        this.f3366b = mcVar;
        this.f3365a = preferenceGroup;
    }

    /* renamed from: a */
    public boolean mo966a(Preference preference) {
        this.f3365a.f826S = Integer.MAX_VALUE;
        C0824mc mcVar = this.f3366b;
        mcVar.f3267g.removeCallbacks(mcVar.f3268h);
        mcVar.f3267g.post(mcVar.f3268h);
        this.f3365a.getClass();
        return true;
    }
}
