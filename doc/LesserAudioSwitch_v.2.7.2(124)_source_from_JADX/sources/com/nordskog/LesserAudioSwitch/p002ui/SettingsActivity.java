package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0901o;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.SettingsActivity */
public class SettingsActivity extends C0947p implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: com.nordskog.LesserAudioSwitch.ui.SettingsActivity$a */
    public class C0345a implements DialogInterface.OnClickListener {
        public C0345a(SettingsActivity settingsActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.settings_activity_layout);
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent == null || !"intent_action_settings_debug_screen".equals(intent.getAction())) {
                C0494ft ftVar = new C0494ft();
                C1053r9 r9Var = new C1053r9(mo4865l());
                r9Var.mo4069d(R.id.settings_activity_fragment_container, ftVar, (String) null, 1);
                r9Var.mo4223g();
                return;
            }
            C1053r9 r9Var2 = new C1053r9(mo4865l());
            r9Var2.mo4069d(R.id.settings_activity_fragment_container, new C1277vs(), (String) null, 1);
            r9Var2.mo4223g();
        }
    }

    public void onPause() {
        C0690jn.f2922a = false;
        super.onPause();
        C0697ju.m2198u(this).unregisterOnSharedPreferenceChangeListener(this);
    }

    public void onResume() {
        C0690jn.f2922a = true;
        super.onResume();
        C0697ju.m2198u(this).registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r5, java.lang.String r6) {
        /*
            r4 = this;
            so r5 = p000.C1129so.UNMUTE
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 1
            switch(r0) {
                case -1669820880: goto L_0x0078;
                case -917486054: goto L_0x006d;
                case -713955477: goto L_0x0062;
                case -565431860: goto L_0x0057;
                case 346248257: goto L_0x004c;
                case 708342360: goto L_0x0041;
                case 1243400309: goto L_0x0036;
                case 1282225031: goto L_0x002b;
                case 1710260183: goto L_0x001d;
                case 1852944731: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0083
        L_0x000f:
            java.lang.String r0 = "pref_notification_bar"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0019
            goto L_0x0083
        L_0x0019:
            r6 = 9
            goto L_0x0084
        L_0x001d:
            java.lang.String r0 = "pref_force_mic"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0027
            goto L_0x0083
        L_0x0027:
            r6 = 8
            goto L_0x0084
        L_0x002b:
            java.lang.String r0 = "pref_cast_mode"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            r6 = 7
            goto L_0x0084
        L_0x0036:
            java.lang.String r0 = "pref_mute_speaker"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0083
        L_0x003f:
            r6 = 6
            goto L_0x0084
        L_0x0041:
            java.lang.String r0 = "pref_disable_internal_mic"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004a
            goto L_0x0083
        L_0x004a:
            r6 = 5
            goto L_0x0084
        L_0x004c:
            java.lang.String r0 = "pref_display_mute_unmute_buttons"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0055
            goto L_0x0083
        L_0x0055:
            r6 = 4
            goto L_0x0084
        L_0x0057:
            java.lang.String r0 = "pref_monitor_speaker_mute_state"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            r6 = 3
            goto L_0x0084
        L_0x0062:
            java.lang.String r0 = "pref_disable_earpiece"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x006b
            goto L_0x0083
        L_0x006b:
            r6 = 2
            goto L_0x0084
        L_0x006d:
            java.lang.String r0 = "pref_usb_mode"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0076
            goto L_0x0083
        L_0x0076:
            r6 = 1
            goto L_0x0084
        L_0x0078:
            java.lang.String r0 = "pref_bluetooth_mode"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r6 = 0
            goto L_0x0084
        L_0x0083:
            r6 = -1
        L_0x0084:
            r0 = 2131689784(0x7f0f0138, float:1.9008593E38)
            r2 = 0
            r3 = 2131689783(0x7f0f0137, float:1.9008591E38)
            switch(r6) {
                case 0: goto L_0x012d;
                case 1: goto L_0x012d;
                case 2: goto L_0x0121;
                case 3: goto L_0x011d;
                case 4: goto L_0x00f0;
                case 5: goto L_0x0121;
                case 6: goto L_0x00bb;
                case 7: goto L_0x0090;
                case 8: goto L_0x0121;
                case 9: goto L_0x011d;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x0130
        L_0x0090:
            boolean r5 = p000.C0697ju.m2181d(r4)
            if (r5 == 0) goto L_0x012d
            o$a r5 = new o$a
            r5.<init>(r4)
            r6 = 2131689562(0x7f0f005a, float:1.9008143E38)
            r5.mo3819d(r6)
            r6 = 2131689775(0x7f0f012f, float:1.9008575E38)
            r5.mo3817b(r6)
            et r6 = new et
            r6.<init>(r4)
            r0 = 2131689538(0x7f0f0042, float:1.9008094E38)
            r5.mo3818c(r0, r6)
            o r5 = r5.mo3816a()
            r5.show()
            goto L_0x012d
        L_0x00bb:
            boolean r6 = p000.C0697ju.m2194q(r4)
            if (r6 == 0) goto L_0x00d4
            boolean r6 = p000.C0697ju.m2184g(r4)
            if (r6 != 0) goto L_0x00d4
            boolean r6 = p000.C0728kh.m2302r(r4)
            if (r6 == 0) goto L_0x00ce
            goto L_0x00d1
        L_0x00ce:
            r0 = 2131689783(0x7f0f0137, float:1.9008591E38)
        L_0x00d1:
            r4.mo2577u(r0)
        L_0x00d4:
            boolean r6 = p000.C0697ju.m2194q(r4)
            if (r6 != 0) goto L_0x00e8
            boolean r6 = p000.C0697ju.m2184g(r4)
            if (r6 != 0) goto L_0x00e8
            android.content.Context r6 = r4.getApplicationContext()
            p000.C0936oo.m2711v(r6, r5, r2)
            goto L_0x0130
        L_0x00e8:
            android.content.Context r5 = r4.getApplicationContext()
            p000.C0728kh.m2283L(r5)
            goto L_0x0130
        L_0x00f0:
            boolean r6 = p000.C0697ju.m2194q(r4)
            if (r6 != 0) goto L_0x0109
            boolean r6 = p000.C0697ju.m2184g(r4)
            if (r6 == 0) goto L_0x0109
            boolean r6 = p000.C0728kh.m2302r(r4)
            if (r6 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r0 = 2131689783(0x7f0f0137, float:1.9008591E38)
        L_0x0106:
            r4.mo2577u(r0)
        L_0x0109:
            boolean r6 = p000.C0697ju.m2194q(r4)
            if (r6 != 0) goto L_0x012d
            boolean r6 = p000.C0697ju.m2184g(r4)
            if (r6 != 0) goto L_0x012d
            android.content.Context r6 = r4.getApplicationContext()
            p000.C0936oo.m2711v(r6, r5, r2)
            goto L_0x012d
        L_0x011d:
            p000.C0728kh.m2282K(r4, r1)
            goto L_0x0130
        L_0x0121:
            nu r5 = p000.C0936oo.f3508c
            so r5 = p000.C0697ju.m2193p(r4)
            if (r5 == 0) goto L_0x0130
            p000.C0936oo.m2711v(r4, r5, r2)
            goto L_0x0130
        L_0x012d:
            p000.C0728kh.m2283L(r4)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.p002ui.SettingsActivity.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    /* renamed from: u */
    public void mo2577u(int i) {
        C0901o.C0902a aVar = new C0901o.C0902a(this);
        aVar.mo3819d(R.string.dialog_title_warning);
        AlertController.C0039b bVar = aVar.f3436a;
        bVar.f195f = bVar.f190a.getText(i);
        aVar.mo3818c(R.string.button_understood, new C0345a(this));
        aVar.mo3816a().show();
    }
}
