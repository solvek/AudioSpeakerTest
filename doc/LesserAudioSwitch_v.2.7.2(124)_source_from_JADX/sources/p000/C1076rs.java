package p000;

import android.os.Bundle;
import androidx.preference.Preference;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: rs */
public class C1076rs extends C0769lc {

    /* renamed from: b0 */
    public static final /* synthetic */ int f4044b0 = 0;

    /* renamed from: a0 */
    public void mo849a0() {
        this.f678C = true;
        mo862i().setTitle(R.string.pref_title_advanced_button);
    }

    /* renamed from: x0 */
    public void mo2812x0(Bundle bundle, String str) {
        C0968pc pcVar = this.f3133U;
        pcVar.f3612f = "com.nordskog.LesserAudioSwitch_prefs";
        pcVar.f3609c = null;
        mo3622w0(R.xml.advanced_preferences);
        mo912b(mo868l().getResources().getString(R.string.pref_key_debug_button)).f798f = new C0349cq(this);
        Preference b = mo912b(mo868l().getResources().getString(R.string.pref_key_event_log_button));
        if (b != null) {
            b.f798f = new C0392dq(this);
        }
        Preference b2 = mo912b(mo868l().getResources().getString(R.string.pref_key_override_pie_version_addressable));
        if (b2 == null) {
            return;
        }
        if (C0728kh.m2305u()) {
            b2.f798f = new C0232bq(this);
        } else {
            b2.mo941F(false);
        }
    }
}
