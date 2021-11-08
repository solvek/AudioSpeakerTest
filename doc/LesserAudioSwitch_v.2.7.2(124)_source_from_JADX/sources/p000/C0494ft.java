package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.preference.Preference;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: ft */
public class C0494ft extends C0769lc implements SharedPreferences.OnSharedPreferenceChangeListener {
    /* renamed from: A0 */
    public final void mo2810A0() {
        Preference b = mo912b(mo868l().getResources().getString(R.string.pref_key_mute_speaker));
        Preference b2 = mo912b(mo868l().getResources().getString(R.string.pref_key_disable_earpiece));
        Preference b3 = mo912b(mo868l().getResources().getString(R.string.pref_key_display_mute_unmute_buttons));
        boolean b4 = C0728kh.m2286b(mo868l());
        b.mo941F(b4);
        b2.mo941F(b4);
        b3.mo941F(b4);
        Preference b5 = mo912b(mo868l().getResources().getString(R.string.pref_key_disable_internal_mic));
        if (b5 != null) {
            b5.mo938C(C0697ju.m2186i(mo868l()));
            b5.mo941F(b4);
        }
    }

    /* renamed from: W */
    public void mo845W() {
        Context l = mo868l();
        if (l != null) {
            C0697ju.m2198u(l).unregisterOnSharedPreferenceChangeListener(this);
        }
        this.f678C = true;
    }

    /* renamed from: a0 */
    public void mo849a0() {
        this.f678C = true;
        mo862i().setTitle(R.string.title_settings);
        mo2810A0();
        Context l = mo868l();
        if (l != null) {
            C0697ju.m2198u(l).registerOnSharedPreferenceChangeListener(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029 A[Catch:{ Exception -> 0x002d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r3, java.lang.String r4) {
        /*
            r2 = this;
            fa<?> r3 = r2.f711s
            r0 = 0
            if (r3 == 0) goto L_0x000b
            boolean r3 = r2.f703k
            if (r3 == 0) goto L_0x000b
            r3 = 1
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            if (r3 == 0) goto L_0x0038
            boolean r3 = r2.f704l
            if (r3 != 0) goto L_0x0038
            int r3 = r4.hashCode()     // Catch:{ Exception -> 0x002d }
            r1 = 1710260183(0x65f07fd7, float:1.4196577E23)
            if (r3 == r1) goto L_0x001c
            goto L_0x0025
        L_0x001c:
            java.lang.String r3 = "pref_force_mic"
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x002d }
            if (r3 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = -1
        L_0x0026:
            if (r0 == 0) goto L_0x0029
            goto L_0x0038
        L_0x0029:
            r2.mo2810A0()     // Catch:{ Exception -> 0x002d }
            goto L_0x0038
        L_0x002d:
            r3 = move-exception
            java.lang.String r4 = "LAS SettingsFragment"
            java.lang.String r0 = "Problem responding to pref change in fragment"
            p000.C0550gu.m1819a(r4, r0)
            p000.C0550gu.m1821c(r3)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0494ft.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    /* renamed from: x0 */
    public void mo2812x0(Bundle bundle, String str) {
        C0968pc pcVar = this.f3133U;
        pcVar.f3612f = "com.nordskog.LesserAudioSwitch_prefs";
        pcVar.f3609c = null;
        mo3622w0(R.xml.preferences);
        mo912b(mo868l().getResources().getString(R.string.pref_key_advanced_button)).f798f = new C0548gs(this);
        mo2813z0(R.string.pref_key_bluetooth_mode, R.drawable.switch_vector_boring_bluetooth);
        mo2813z0(R.string.pref_key_usb_mode, R.drawable.switch_vector_boring_usb);
        mo2813z0(R.string.pref_key_cast_mode, R.drawable.switch_vector_boring_cast);
        mo2813z0(R.string.pref_key_force_mic, R.drawable.microphone_vector);
        mo2813z0(R.string.pref_key_disable_internal_mic, R.drawable.switch_vector_boring_microphone_disable);
        mo2813z0(R.string.pref_key_mute_speaker, R.drawable.switch_vector_boring_mute);
        mo2813z0(R.string.pref_key_disable_earpiece, R.drawable.config_vector_boring_earpiece_mute);
    }

    /* renamed from: z0 */
    public final void mo2813z0(int i, int i2) {
        try {
            Preference b = mo912b(mo868l().getResources().getString(i));
            Drawable b2 = C0399e0.m1530b(mo868l(), i2);
            if (b.f803k != b2) {
                b.f803k = b2;
                b.f802j = 0;
                b.mo913l();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
