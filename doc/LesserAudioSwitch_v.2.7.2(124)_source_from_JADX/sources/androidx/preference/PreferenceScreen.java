package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0769lc;
import p000.C0968pc;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: T */
    public boolean f828T = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0806m6.m2440a(context, R.attr.preferenceScreenStyle, 16842891), 0);
    }

    /* renamed from: L */
    public boolean mo972L() {
        return false;
    }

    /* renamed from: q */
    public void mo911q() {
        C0968pc.C0970b bVar;
        if (this.f805m == null && this.f806n == null && mo971K() != 0 && (bVar = this.f795c.f3616j) != null) {
            C0769lc lcVar = (C0769lc) bVar;
            if (lcVar.mo862i() instanceof C0769lc.C0775f) {
                ((C0769lc.C0775f) lcVar.mo862i()).mo3629a(lcVar, this);
            }
        }
    }
}
