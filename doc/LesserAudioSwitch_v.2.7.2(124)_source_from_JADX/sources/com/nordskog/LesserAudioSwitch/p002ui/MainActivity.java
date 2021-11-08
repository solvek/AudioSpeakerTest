package com.nordskog.LesserAudioSwitch.p002ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import java.nio.charset.StandardCharsets;
import p000.C0652iu;
import p000.C0735ko;
import p000.C0793lt;
import p000.C1426yp;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.MainActivity */
public class MainActivity extends C0947p implements C1426yp.C1427a {

    /* renamed from: E */
    public static final int[] f1762E = {R.id.speakerButtonLayout, R.id.headphonesButtonLayout, R.id.bluetoothButtonLayout, R.id.usbButtonLayout, R.id.castButtonLayout};

    /* renamed from: A */
    public View f1763A;

    /* renamed from: B */
    public View f1764B;

    /* renamed from: C */
    public EnabledModeView f1765C;

    /* renamed from: D */
    public long f1766D = 0;

    /* renamed from: o */
    public ViewGroup f1767o;

    /* renamed from: p */
    public ViewGroup f1768p;

    /* renamed from: q */
    public ViewGroup f1769q;

    /* renamed from: r */
    public ViewGroup f1770r;

    /* renamed from: s */
    public ViewGroup f1771s;

    /* renamed from: t */
    public ViewGroup f1772t;

    /* renamed from: u */
    public ViewGroup f1773u;

    /* renamed from: v */
    public View f1774v;

    /* renamed from: w */
    public ViewGroup f1775w;

    /* renamed from: x */
    public StatusView f1776x;

    /* renamed from: y */
    public SpeakerStatusView f1777y;

    /* renamed from: z */
    public View f1778z;

    /* renamed from: com.nordskog.LesserAudioSwitch.ui.MainActivity$a */
    public class C0342a extends C0793lt {

        /* renamed from: b */
        public final /* synthetic */ Context f1779b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0342a(Context context, C0793lt.C0795b bVar, Context context2) {
            super(context, bVar);
            this.f1779b = context2;
        }

        /* renamed from: a */
        public boolean mo2567a(Dialog dialog, C1129so soVar) {
            if (soVar == C1129so.DEFAULT) {
                C0697ju.m2177F(this.f1779b, false);
            } else {
                C0728kh.m2280I(this.f1779b, "on_boot_action", soVar);
                C0697ju.m2177F(this.f1779b, true);
            }
            MainActivity.this.mo2563w(false);
            MainActivity mainActivity = MainActivity.this;
            int[] iArr = MainActivity.f1762E;
            mainActivity.mo2556B();
            dialog.dismiss();
            if (!C0697ju.f2933a.mo3309a(MainActivity.this, false)) {
                C0697ju.f2933a.mo3310b(MainActivity.this, true);
                C0728kh.m2289e(MainActivity.this, R.string.first_enable_dialog_title, R.string.restore_on_boot_text_first_enable_warning, R.string.button_understood);
            }
            return true;
        }
    }

    /* renamed from: com.nordskog.LesserAudioSwitch.ui.MainActivity$b */
    public enum C0343b {
        f1781b,
        f1782c,
        f1783d
    }

    static {
        C0200av.m970a(-94509438686380L);
    }

    /* renamed from: A */
    public final void mo2555A(ViewGroup viewGroup, C1129so soVar) {
        View.OnClickListener onClickListener;
        Button button = (Button) viewGroup.findViewById(R.id.modeSetButton);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.modeConfigButton);
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.switchConfigButton);
        button.setOnClickListener(new C0896nr(this, soVar));
        button.setText(soVar.f4315b);
        ((ImageView) viewGroup.findViewById(R.id.modeSetIcon)).setImageResource(soVar.f4318e);
        if (soVar != C1129so.CAST) {
            imageButton.setOnClickListener(new C0350cr(soVar));
        } else {
            imageButton.setVisibility(4);
        }
        if (soVar == C1129so.HEADPHONES) {
            imageButton2.setVisibility(0);
            onClickListener = C0943or.f3515b;
        } else if (soVar == C1129so.SPEAKER) {
            imageButton2.setVisibility(0);
            onClickListener = C1276vr.f4841b;
        } else {
            imageButton2.setVisibility(4);
            return;
        }
        imageButton2.setOnClickListener(onClickListener);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2556B() {
        /*
            r8 = this;
            android.view.View r0 = r8.f1778z
            if (r0 == 0) goto L_0x0096
            android.view.View r0 = r8.f1763A
            if (r0 == 0) goto L_0x0096
            android.view.View r0 = r8.f1764B
            if (r0 != 0) goto L_0x000e
            goto L_0x0096
        L_0x000e:
            boolean r0 = p000.C0697ju.m2178a(r8)
            boolean r1 = p000.C0697ju.m2199v(r8)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0020
            if (r1 == 0) goto L_0x0020
            p000.C0697ju.m2177F(r8, r3)
            goto L_0x0022
        L_0x0020:
            if (r0 == 0) goto L_0x0032
        L_0x0022:
            android.view.View r0 = r8.f1778z
            r0.setSelected(r3)
            android.view.View r0 = r8.f1763A
            r0.setSelected(r3)
            android.view.View r0 = r8.f1764B
            r0.setSelected(r2)
            goto L_0x004c
        L_0x0032:
            android.view.View r0 = r8.f1778z
            if (r1 == 0) goto L_0x003f
            r0.setSelected(r3)
            android.view.View r0 = r8.f1763A
            r0.setSelected(r2)
            goto L_0x0047
        L_0x003f:
            r0.setSelected(r2)
            android.view.View r0 = r8.f1763A
            r0.setSelected(r3)
        L_0x0047:
            android.view.View r0 = r8.f1764B
            r0.setSelected(r3)
        L_0x004c:
            so r0 = p000.C1129so.DEFAULT
            java.lang.String r1 = "on_boot_action"
            java.lang.Enum r0 = p000.C0728kh.m2298n(r8, r1, r0)
            so r0 = (p000.C1129so) r0
            boolean r1 = p000.C0697ju.m2199v(r8)
            int[] r2 = f1762E
            int r4 = r2.length
        L_0x005d:
            if (r3 >= r4) goto L_0x0096
            r5 = r2[r3]
            android.view.View r6 = r8.findViewById(r5)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r6 == 0) goto L_0x0093
            r7 = 2131230928(0x7f0800d0, float:1.8077923E38)
            android.view.View r6 = r6.findViewById(r7)
            if (r6 == 0) goto L_0x0093
            if (r1 == 0) goto L_0x008d
            switch(r5) {
                case 2131230811: goto L_0x0085;
                case 2131230817: goto L_0x0082;
                case 2131230896: goto L_0x007f;
                case 2131231089: goto L_0x007c;
                case 2131231172: goto L_0x0079;
                default: goto L_0x0077;
            }
        L_0x0077:
            r5 = 0
            goto L_0x0087
        L_0x0079:
            so r5 = p000.C1129so.USB
            goto L_0x0087
        L_0x007c:
            so r5 = p000.C1129so.SPEAKER
            goto L_0x0087
        L_0x007f:
            so r5 = p000.C1129so.HEADPHONES
            goto L_0x0087
        L_0x0082:
            so r5 = p000.C1129so.CAST
            goto L_0x0087
        L_0x0085:
            so r5 = p000.C1129so.BLUETOOTH
        L_0x0087:
            if (r0 != r5) goto L_0x008d
            r5 = 2131165361(0x7f0700b1, float:1.7944937E38)
            goto L_0x0090
        L_0x008d:
            r5 = 2131165360(0x7f0700b0, float:1.7944935E38)
        L_0x0090:
            r6.setBackgroundResource(r5)
        L_0x0093:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.p002ui.MainActivity.mo2556B():void");
    }

    /* renamed from: C */
    public final void mo2557C() {
        int i = 0;
        this.f1772t.setVisibility(C0697ju.f2938f.mo3309a(this, false) ? 8 : 0);
        ViewGroup viewGroup = this.f1773u;
        if (C0697ju.f2939g.mo3309a(this, false)) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    /* renamed from: D */
    public final void mo2558D() {
        ViewGroup viewGroup = this.f1775w;
        if (viewGroup != null) {
            viewGroup.setVisibility((!C0728kh.m2286b(this) || !C0697ju.m2184g(this)) ? 8 : 0);
        }
    }

    /* renamed from: i */
    public void mo2545i(C0788lo loVar) {
        this.f1776x.setStatus(loVar);
        this.f1777y.setStatus(loVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        C0652iu.C0653a aVar = C0697ju.f2933a;
        C0697ju.m2174C(applicationContext, C0200av.m970a(-106964843844780L), 5);
        SoundBroadcastReceiver.m1381a((SoundBroadcastReceiver) null, getApplicationContext());
        setContentView((int) R.layout.activity_main);
        this.f1765C = (EnabledModeView) findViewById(R.id.enable_modes_view);
        View findViewById = findViewById(R.id.themeButton);
        this.f1774v = findViewById;
        findViewById.setOnClickListener(new C0694jr(this));
        this.f1767o = (ViewGroup) findViewById(R.id.speakerButtonLayout);
        this.f1768p = (ViewGroup) findViewById(R.id.headphonesButtonLayout);
        this.f1770r = (ViewGroup) findViewById(R.id.usbButtonLayout);
        this.f1769q = (ViewGroup) findViewById(R.id.bluetoothButtonLayout);
        this.f1771s = (ViewGroup) findViewById(R.id.castButtonLayout);
        mo2555A(this.f1767o, C1129so.SPEAKER);
        mo2555A(this.f1768p, C1129so.HEADPHONES);
        mo2555A(this.f1770r, C1129so.USB);
        mo2555A(this.f1769q, C1129so.BLUETOOTH);
        mo2555A(this.f1771s, C1129so.CAST);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.muteUnmuteLayout);
        this.f1775w = viewGroup;
        ((Button) viewGroup.findViewById(R.id.muteButton)).setOnClickListener(new C0744kr(this));
        ((Button) this.f1775w.findViewById(R.id.unmuteButton)).setOnClickListener(new C0848mr(this));
        ((ImageButton) this.f1775w.findViewById(R.id.mute_unmute_help_button)).setOnClickListener(new C1132sr(this));
        this.f1778z = findViewById(R.id.auto_mode_manual_button);
        this.f1763A = findViewById(R.id.auto_mode_restore_on_boot_button);
        this.f1764B = findViewById(R.id.auto_mode_auto_button);
        this.f1778z.setOnClickListener(new C0393dr(this));
        this.f1763A.setOnClickListener(new C0233br(this));
        this.f1764B.setOnClickListener(new C0590hr(this));
        ((ImageButton) findViewById(R.id.auto_mode_auto_config_button)).setOnClickListener(new C0198at(this));
        View findViewById2 = findViewById(R.id.debug_shortcut);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.compatibilityAlertLayout);
        this.f1772t = viewGroup2;
        viewGroup2.findViewById(R.id.warningButton).setOnClickListener(C0791lr.f3187b);
        this.f1772t.findViewById(R.id.warningButtonRemove).setOnClickListener(new C0492fr(this));
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.androidRCompatibilityWarning);
        this.f1773u = viewGroup3;
        viewGroup3.findViewById(R.id.warningButton).setOnClickListener(C1225ur.f4682b);
        this.f1773u.findViewById(R.id.warningButtonRemove).setOnClickListener(new C1474zq(this));
        this.f1776x = (StatusView) findViewById(R.id.status_view);
        this.f1777y = (SpeakerStatusView) findViewById(R.id.status_speaker_view);
        Context applicationContext2 = getApplicationContext();
        C0936oo.f3508c.mo3811b(applicationContext2, new C0193ao(applicationContext2, new C0649ir(this)));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        } else if (itemId != R.id.reset) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C0728kh.m2289e(this, R.string.reset_dialog_title, R.string.reset_dialog_content, R.string.button_understood);
            return true;
        }
    }

    public void onPause() {
        C0690jn.f2922a = false;
        C1468zo.m3977e(this, C0200av.m970a(-93890963395756L)).mo5307b(C0200av.m970a(-93929618101420L));
        C1468zo.m3978k(C0200av.m970a(-93968272807084L));
        C1426yp.m3890b(this).mo5221f(this);
        super.onPause();
    }

    public void onResume() {
        C0200av.m970a(-93216653530284L);
        C0200av.m970a(-93255308235948L);
        C0690jn.f2922a = true;
        super.onResume();
        C1468zo e = C1468zo.m3977e(this, C0200av.m970a(-93328322679980L));
        e.f5350n.mo3647c(C0200av.m970a(-93366977385644L), new C0990pr(this), false);
        mo2561u();
        e.mo5312i();
        ViewGroup viewGroup = this.f1769q;
        if (viewGroup != null) {
            viewGroup.setVisibility(C0697ju.m2179b(this) ? 0 : 8);
        }
        ViewGroup viewGroup2 = this.f1770r;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(C0697ju.m2200w(this) ? 0 : 8);
        }
        ViewGroup viewGroup3 = this.f1771s;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(C0697ju.m2181d(this) ? 0 : 8);
        }
        ViewGroup viewGroup4 = this.f1775w;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(C0728kh.m2286b(this) ? 0 : 8);
        }
        mo2558D();
        mo2556B();
        mo2566z();
        EnabledModeView enabledModeView = this.f1765C;
        enabledModeView.f1758d.setVisibility(C0697ju.m2179b(enabledModeView.getContext()) ? 8 : 0);
        enabledModeView.f1759e.setVisibility(C0697ju.m2200w(enabledModeView.getContext()) ? 8 : 0);
        enabledModeView.f1760f.setVisibility(C0697ju.m2181d(enabledModeView.getContext()) ? 8 : 0);
        if (!C0697ju.m2179b(enabledModeView.getContext()) || !C0697ju.m2200w(enabledModeView.getContext()) || !C0697ju.m2181d(enabledModeView.getContext())) {
            enabledModeView.setVisibility(0);
        } else {
            enabledModeView.setVisibility(8);
        }
        C1426yp.m3890b(this).mo5220e(this, false);
        this.f1776x.mo2582b();
        this.f1777y.mo2579a();
        mo2557C();
        if (!C0697ju.f2940h.mo3309a(this, false)) {
            C0697ju.f2940h.mo3310b(this, true);
            new C1133ss(this).mo4555a();
        }
        C0728kh.m2282K(this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016a  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2561u() {
        /*
            r31 = this;
            r1 = r31
            r31.mo2566z()
            boolean r0 = p000.C0697ju.m2178a(r31)
            if (r0 != 0) goto L_0x0011
            boolean r0 = p000.C0697ju.m2199v(r31)
            if (r0 == 0) goto L_0x0493
        L_0x0011:
            java.lang.String r0 = p000.C1384xo.f5119a
            int r2 = p000.C1425yo.f5206a
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            r3 = 0
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r3)
            r4 = 0
            java.lang.String r0 = r2.getString(r0, r4)
            r2 = 2
            r4 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r6 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r8 = 1
            if (r0 == 0) goto L_0x00ec
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0046
            goto L_0x00ec
        L_0x0046:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x004e
            goto L_0x00bb
        L_0x004e:
            byte[] r0 = android.util.Base64.decode(r0, r3)
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x0064
            android.content.ContentResolver r9 = r31.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r6)
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r10)
            p000.C0391dp.f1915a = r9
        L_0x0064:
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x006e
            java.lang.String r9 = p000.C0200av.m970a(r4)
            p000.C0391dp.f1915a = r9
        L_0x006e:
            java.lang.String r9 = p000.C0391dp.f1915a
            r10 = 5
            if (r9 == 0) goto L_0x0082
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x0082
            int r9 = r9.hashCode()
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r10 = r9
        L_0x0082:
            int r10 = r10 * -1
            byte r9 = (byte) r10
            p000.C0495fu.m1724a(r0)
            int r10 = r0.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x008c:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x00a5
            byte r12 = r0[r11]
            int r12 = r12 + r9
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x0099
            int r12 = r12 + -256
            goto L_0x009f
        L_0x0099:
            r13 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r13) goto L_0x009f
            int r12 = r12 + 256
        L_0x009f:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x008c
        L_0x00a5:
            p000.C0495fu.m1724a(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r9 = 19
            if (r0 < r9) goto L_0x00b6
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r10, r9)
            goto L_0x00bb
        L_0x00b6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x00bb:
            r9 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            r10 = 4
            if (r9 == r10) goto L_0x00d9
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00f8
        L_0x00d9:
            cp r9 = new cp
            r18 = r0[r3]
            r19 = r0[r8]
            r20 = r0[r2]
            r10 = 3
            r21 = r0[r10]
            go r22 = p000.C0433ep.f2029a
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00f9
        L_0x00ec:
            cp r0 = new cp
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            go r15 = p000.C0433ep.f2035g
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x00f8:
            r9 = r0
        L_0x00f9:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x0123
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0106
            goto L_0x0123
        L_0x0106:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x0123
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0111
            goto L_0x0123
        L_0x0111:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x0123
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011c
            goto L_0x0123
        L_0x011c:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r0 = 1
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            r10 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x0139
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x0168
        L_0x0139:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r9.f1827a
            r0.append(r14)
            java.lang.String r14 = r9.f1828b
            r0.append(r14)
            java.lang.String r14 = r9.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r14)
            java.lang.String r14 = r9.f1830d
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x015c
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x015c:
            if (r0 == 0) goto L_0x0161
            go r14 = p000.C0433ep.f2039k
            goto L_0x0163
        L_0x0161:
            go r14 = p000.C0433ep.f2031c
        L_0x0163:
            java.lang.String.valueOf(r14)
            r9.f1832f = r14
        L_0x0168:
            if (r0 == 0) goto L_0x0467
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x0196
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0179
            goto L_0x0196
        L_0x0179:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x0196
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0184
            goto L_0x0196
        L_0x0184:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x0196
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018f
            goto L_0x0196
        L_0x018f:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x0194
            goto L_0x0196
        L_0x0194:
            r0 = 1
            goto L_0x0197
        L_0x0196:
            r0 = 0
        L_0x0197:
            if (r0 != 0) goto L_0x01a2
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x01d1
        L_0x01a2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = r9.f1827a
            r0.append(r8)
            java.lang.String r8 = r9.f1828b
            r0.append(r8)
            java.lang.String r8 = r9.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r8)
            java.lang.String r8 = r9.f1830d
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x01c5
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x01c5:
            if (r0 == 0) goto L_0x01ca
            go r8 = p000.C0433ep.f2039k
            goto L_0x01cc
        L_0x01ca:
            go r8 = p000.C0433ep.f2031c
        L_0x01cc:
            java.lang.String.valueOf(r8)
            r9.f1832f = r8
        L_0x01d1:
            if (r0 != 0) goto L_0x01d8
            go r0 = r9.f1832f
        L_0x01d5:
            r12 = 0
            goto L_0x0458
        L_0x01d8:
            java.lang.String r0 = r9.f1829c
            java.lang.String r8 = p000.C0391dp.f1915a
            if (r8 != 0) goto L_0x01ec
            android.content.ContentResolver r8 = r31.getContentResolver()
            java.lang.String r6 = p000.C0200av.m970a(r6)
            java.lang.String r6 = android.provider.Settings.Secure.getString(r8, r6)
            p000.C0391dp.f1915a = r6
        L_0x01ec:
            java.lang.String r6 = p000.C0391dp.f1915a
            if (r6 != 0) goto L_0x01f6
            java.lang.String r4 = p000.C0200av.m970a(r4)
            p000.C0391dp.f1915a = r4
        L_0x01f6:
            java.lang.String r4 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0218
            r4 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            r4 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r4)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x01d5
        L_0x0218:
            java.lang.String r0 = r9.f1828b
            java.lang.Class r4 = p000.C1228uu.f4686b
            byte[] r4 = new byte[r3]
            java.lang.reflect.Method r5 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x0234 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0234 }
            r2[r3] = r0     // Catch:{ Exception -> 0x0234 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0234 }
            r6 = 1
            r2[r6] = r0     // Catch:{ Exception -> 0x0234 }
            r0 = 0
            java.lang.Object r0 = r5.invoke(r0, r2)     // Catch:{ Exception -> 0x0234 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0234 }
            r4 = r0
            goto L_0x024b
        L_0x0234:
            r0 = move-exception
            r5 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r5, r0, r2)
        L_0x024b:
            if (r4 == 0) goto L_0x043e
            int r0 = r4.length
            if (r0 != 0) goto L_0x0252
            goto L_0x043e
        L_0x0252:
            int r0 = p000.C1136su.f4328a
            r5 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r4)
            r17 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r19 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r21 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r25 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r27 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r29 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0329 }
            java.lang.ClassLoader r6 = r14.getClassLoader()     // Catch:{ Exception -> 0x0329 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r8, r6)     // Catch:{ Exception -> 0x0329 }
            java.lang.String r7 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x0329 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0329 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0329 }
            java.lang.String r8 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0329 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0329 }
            r11[r3] = r14     // Catch:{ Exception -> 0x0329 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0329 }
            java.lang.String r11 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0329 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0329 }
            r12[r3] = r7     // Catch:{ Exception -> 0x0329 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0329 }
            r11 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0329 }
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0329 }
            r11[r3] = r15     // Catch:{ Exception -> 0x0329 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r13, r11)     // Catch:{ Exception -> 0x0329 }
            r12 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0329 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0329 }
            r13 = 0
            r12[r13] = r15     // Catch:{ Exception -> 0x0329 }
            java.lang.reflect.Method r3 = r6.getDeclaredMethod(r3, r12)     // Catch:{ Exception -> 0x0329 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0329 }
            r23 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x0329 }
            r6[r13] = r12     // Catch:{ Exception -> 0x0329 }
            r12 = 0
            java.lang.Object r6 = r8.invoke(r12, r6)     // Catch:{ Exception -> 0x0329 }
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0329 }
            java.lang.Object r12 = r9.f1831e     // Catch:{ Exception -> 0x0329 }
            r8[r13] = r12     // Catch:{ Exception -> 0x0329 }
            r7.invoke(r6, r8)     // Catch:{ Exception -> 0x0329 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0329 }
            r7[r13] = r0     // Catch:{ Exception -> 0x0329 }
            r11.invoke(r6, r7)     // Catch:{ Exception -> 0x0329 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0329 }
            r0[r13] = r4     // Catch:{ Exception -> 0x0329 }
            java.lang.Object r0 = r3.invoke(r6, r0)     // Catch:{ Exception -> 0x0329 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0329 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0329 }
            if (r0 != 0) goto L_0x0318
            r0 = 1
            goto L_0x0319
        L_0x0318:
            r0 = 0
        L_0x0319:
            r6 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ Exception -> 0x0329 }
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x0329 }
            if (r0 == 0) goto L_0x0327
            r2 = r5
        L_0x0327:
            r5 = r2
            goto L_0x033b
        L_0x0329:
            r0 = move-exception
            java.lang.String r2 = p000.C0200av.m970a(r25)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r3, r0, r2)
        L_0x033b:
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L_0x035c
            r2 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x01d5
        L_0x035c:
            java.lang.String r0 = r9.f1827a
            byte[] r0 = r0.getBytes()
            go r2 = p000.C0433ep.f2034f
            go r3 = p000.C0433ep.f2036h
            go r5 = p000.C0433ep.f2038j
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r4)
            java.lang.String r6 = p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0410 }
            java.lang.ClassLoader r7 = r14.getClassLoader()     // Catch:{ Exception -> 0x0410 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r6, r7)     // Catch:{ Exception -> 0x0410 }
            java.lang.String r7 = p000.C0200av.m970a(r21)     // Catch:{ Exception -> 0x0410 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0410 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0410 }
            java.lang.String r8 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0410 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0410 }
            r12 = 0
            r11[r12] = r14     // Catch:{ Exception -> 0x040e }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x040e }
            java.lang.String r11 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x040e }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x040e }
            r13[r12] = r7     // Catch:{ Exception -> 0x040e }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x040e }
            r13 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x040e }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x040e }
            r13[r12] = r15     // Catch:{ Exception -> 0x040e }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x040e }
            r13 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x040e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x040e }
            r14[r12] = r15     // Catch:{ Exception -> 0x040e }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x040e }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x040e }
            r14 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x040e }
            r13[r12] = r14     // Catch:{ Exception -> 0x040e }
            r14 = 0
            java.lang.Object r8 = r8.invoke(r14, r13)     // Catch:{ Exception -> 0x040e }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x040e }
            java.lang.Object r14 = r9.f1831e     // Catch:{ Exception -> 0x040e }
            r13[r12] = r14     // Catch:{ Exception -> 0x040e }
            r7.invoke(r8, r13)     // Catch:{ Exception -> 0x040e }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x040e }
            r7[r12] = r0     // Catch:{ Exception -> 0x040e }
            r11.invoke(r8, r7)     // Catch:{ Exception -> 0x040e }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x040e }
            r0[r12] = r4     // Catch:{ Exception -> 0x040e }
            java.lang.Object r0 = r6.invoke(r8, r0)     // Catch:{ Exception -> 0x040e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x040e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x040e }
            if (r0 != 0) goto L_0x03fd
            r0 = 1
            goto L_0x03fe
        L_0x03fd:
            r0 = 0
        L_0x03fe:
            r6 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            p000.C0200av.m970a(r6)     // Catch:{ Exception -> 0x040e }
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x040e }
            if (r0 == 0) goto L_0x040c
            r2 = r3
        L_0x040c:
            r0 = r2
            goto L_0x0424
        L_0x040e:
            r0 = move-exception
            goto L_0x0412
        L_0x0410:
            r0 = move-exception
            r12 = 0
        L_0x0412:
            java.lang.String r2 = p000.C0200av.m970a(r25)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r3, r0, r2)
            r0 = r5
        L_0x0424:
            go r2 = p000.C0433ep.f2036h
            if (r0 != r2) goto L_0x0438
            r2 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
        L_0x0438:
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            goto L_0x0458
        L_0x043e:
            r12 = 0
            r2 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0458:
            go r2 = p000.C0433ep.f2034f
            if (r0 == r2) goto L_0x0463
            go r2 = p000.C0433ep.f2029a
            if (r0 != r2) goto L_0x0461
            goto L_0x0463
        L_0x0461:
            r3 = 0
            goto L_0x0464
        L_0x0463:
            r3 = 1
        L_0x0464:
            if (r3 == 0) goto L_0x0467
            goto L_0x0493
        L_0x0467:
            boolean r0 = p000.C0851mu.m2546a(r31)
            if (r0 == 0) goto L_0x047e
            r2 = -93405632091308(0xffffab0c4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -93444286796972(0xffffab034e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            goto L_0x0493
        L_0x047e:
            r2 = -93637560325292(0xffffaad64e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -93676215030956(0xffffaacd4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            com.nordskog.LesserAudioSwitch.ui.MainActivity$b r0 = com.nordskog.LesserAudioSwitch.p002ui.MainActivity.C0343b.f1781b
            r1.mo2564x(r0)
        L_0x0493:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.p002ui.MainActivity.mo2561u():void");
    }

    /* renamed from: v */
    public final void mo2562v() {
        if (System.currentTimeMillis() - this.f1766D >= 500) {
            this.f1766D = System.currentTimeMillis();
            C1468zo.m3977e(this, C0200av.m970a(-94006927512748L)).f5348l.mo3649e();
            new C0235bt().mo4634A0(mo4865l(), C0200av.m970a(-94045582218412L));
        }
    }

    /* renamed from: w */
    public void mo2563w(boolean z) {
        C0652iu.C0653a aVar = C0697ju.f2933a;
        C0200av.m970a(-109417270170796L);
        C0200av.m970a(-109460219843756L);
        C0697ju.m2202y(this, C0200av.m970a(-109520349385900L), z);
        C1426yp b = C1426yp.m3890b(this);
        if (b.f5211c) {
            b.mo5222h();
            b.mo5219c();
        }
        C0728kh.m2282K(this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x045b, code lost:
        if ((r0 == p000.C0433ep.f2034f || r0 == p000.C0433ep.f2029a) == false) goto L_0x04ac;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0165  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2564x(com.nordskog.LesserAudioSwitch.p002ui.MainActivity.C0343b r34) {
        /*
            r33 = this;
            r1 = r33
            int r0 = r34.ordinal()
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L_0x000f
            if (r0 == r2) goto L_0x000f
            goto L_0x045e
        L_0x000f:
            java.lang.String r0 = p000.C1384xo.f5119a
            int r5 = p000.C1425yo.f5206a
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)
            android.content.SharedPreferences r5 = r1.getSharedPreferences(r5, r4)
            r6 = 0
            java.lang.String r0 = r5.getString(r0, r6)
            r5 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r7 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            if (r0 == 0) goto L_0x00e7
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0041
            goto L_0x00e7
        L_0x0041:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x0049
            goto L_0x00b6
        L_0x0049:
            byte[] r0 = android.util.Base64.decode(r0, r4)
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x005f
            android.content.ContentResolver r9 = r33.getContentResolver()
            java.lang.String r10 = p000.C0200av.m970a(r7)
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r10)
            p000.C0391dp.f1915a = r9
        L_0x005f:
            java.lang.String r9 = p000.C0391dp.f1915a
            if (r9 != 0) goto L_0x0069
            java.lang.String r9 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r9
        L_0x0069:
            java.lang.String r9 = p000.C0391dp.f1915a
            r10 = 5
            if (r9 == 0) goto L_0x007d
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x007d
            int r9 = r9.hashCode()
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r10 = r9
        L_0x007d:
            int r10 = r10 * -1
            byte r9 = (byte) r10
            p000.C0495fu.m1724a(r0)
            int r10 = r0.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x0087:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x00a0
            byte r12 = r0[r11]
            int r12 = r12 + r9
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x0094
            int r12 = r12 + -256
            goto L_0x009a
        L_0x0094:
            r13 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r13) goto L_0x009a
            int r12 = r12 + 256
        L_0x009a:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0087
        L_0x00a0:
            p000.C0495fu.m1724a(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r9 = 19
            if (r0 < r9) goto L_0x00b1
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r10, r9)
            goto L_0x00b6
        L_0x00b1:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x00b6:
            r9 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            r10 = 4
            if (r9 == r10) goto L_0x00d4
            cp r0 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00f3
        L_0x00d4:
            cp r9 = new cp
            r18 = r0[r4]
            r19 = r0[r3]
            r20 = r0[r2]
            r10 = 3
            r21 = r0[r10]
            go r22 = p000.C0433ep.f2029a
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00f4
        L_0x00e7:
            cp r0 = new cp
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            go r15 = p000.C0433ep.f2035g
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x00f3:
            r9 = r0
        L_0x00f4:
            java.lang.String r0 = p000.C0391dp.f1915a
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0101
            goto L_0x011e
        L_0x0101:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010c
            goto L_0x011e
        L_0x010c:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0117
            goto L_0x011e
        L_0x0117:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r0 = 1
            goto L_0x011f
        L_0x011e:
            r0 = 0
        L_0x011f:
            r10 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r12 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r0 != 0) goto L_0x0134
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x0163
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r9.f1827a
            r0.append(r14)
            java.lang.String r14 = r9.f1828b
            r0.append(r14)
            java.lang.String r14 = r9.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r14)
            java.lang.String r14 = r9.f1830d
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x0157
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x0157:
            if (r0 == 0) goto L_0x015c
            go r14 = p000.C0433ep.f2039k
            goto L_0x015e
        L_0x015c:
            go r14 = p000.C0433ep.f2031c
        L_0x015e:
            java.lang.String.valueOf(r14)
            r9.f1832f = r14
        L_0x0163:
            if (r0 == 0) goto L_0x04ac
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.String r0 = r9.f1827a
            if (r0 == 0) goto L_0x0191
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0174
            goto L_0x0191
        L_0x0174:
            java.lang.String r0 = r9.f1828b
            if (r0 == 0) goto L_0x0191
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017f
            goto L_0x0191
        L_0x017f:
            java.lang.String r0 = r9.f1829c
            if (r0 == 0) goto L_0x0191
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018a
            goto L_0x0191
        L_0x018a:
            java.lang.Object r0 = r9.f1831e
            if (r0 != 0) goto L_0x018f
            goto L_0x0191
        L_0x018f:
            r0 = 1
            goto L_0x0192
        L_0x0191:
            r0 = 0
        L_0x0192:
            if (r0 != 0) goto L_0x019d
            go r0 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            r0 = 0
            goto L_0x01cc
        L_0x019d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r9.f1827a
            r0.append(r3)
            java.lang.String r3 = r9.f1828b
            r0.append(r3)
            java.lang.String r3 = r9.f1829c
            java.lang.String r0 = p000.C0279ch.m1122s(r0, r3)
            java.lang.String r3 = r9.f1830d
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01c0
            p000.C0200av.m970a(r12)
            p000.C0200av.m970a(r10)
        L_0x01c0:
            if (r0 == 0) goto L_0x01c5
            go r3 = p000.C0433ep.f2039k
            goto L_0x01c7
        L_0x01c5:
            go r3 = p000.C0433ep.f2031c
        L_0x01c7:
            java.lang.String.valueOf(r3)
            r9.f1832f = r3
        L_0x01cc:
            if (r0 != 0) goto L_0x01d2
            go r0 = r9.f1832f
            goto L_0x044f
        L_0x01d2:
            java.lang.String r0 = r9.f1829c
            java.lang.String r3 = p000.C0391dp.f1915a
            if (r3 != 0) goto L_0x01e6
            android.content.ContentResolver r3 = r33.getContentResolver()
            java.lang.String r7 = p000.C0200av.m970a(r7)
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r7)
            p000.C0391dp.f1915a = r3
        L_0x01e6:
            java.lang.String r3 = p000.C0391dp.f1915a
            if (r3 != 0) goto L_0x01f0
            java.lang.String r3 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r3
        L_0x01f0:
            java.lang.String r3 = p000.C0391dp.f1915a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0213
            r2 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x044f
        L_0x0213:
            java.lang.String r0 = r9.f1828b
            java.lang.Class r3 = p000.C1228uu.f4686b
            byte[] r3 = new byte[r4]
            java.lang.reflect.Method r5 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x022f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x022f }
            r2[r4] = r0     // Catch:{ Exception -> 0x022f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x022f }
            r6 = 1
            r2[r6] = r0     // Catch:{ Exception -> 0x022f }
            r0 = 0
            java.lang.Object r0 = r5.invoke(r0, r2)     // Catch:{ Exception -> 0x022f }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x022f }
            r3 = r0
            goto L_0x0246
        L_0x022f:
            r0 = move-exception
            r5 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r5, r0, r2)
        L_0x0246:
            if (r3 == 0) goto L_0x0436
            int r0 = r3.length
            if (r0 != 0) goto L_0x024d
            goto L_0x0436
        L_0x024d:
            int r0 = p000.C1136su.f4328a
            r5 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r3)
            r12 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r17 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r19 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r23 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r25 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r27 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            r29 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x0324 }
            java.lang.ClassLoader r6 = r14.getClassLoader()     // Catch:{ Exception -> 0x0324 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r8, r6)     // Catch:{ Exception -> 0x0324 }
            java.lang.String r7 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0324 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0324 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0324 }
            java.lang.String r8 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0324 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0324 }
            r11[r4] = r14     // Catch:{ Exception -> 0x0324 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0324 }
            java.lang.String r11 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0324 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0324 }
            r12[r4] = r7     // Catch:{ Exception -> 0x0324 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0324 }
            r11 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0324 }
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0324 }
            r11[r4] = r15     // Catch:{ Exception -> 0x0324 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r13, r11)     // Catch:{ Exception -> 0x0324 }
            r12 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r12)     // Catch:{ Exception -> 0x0324 }
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0324 }
            r13 = 0
            r12[r13] = r15     // Catch:{ Exception -> 0x0324 }
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r4, r12)     // Catch:{ Exception -> 0x0324 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0324 }
            r31 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r12 = p000.C0200av.m970a(r31)     // Catch:{ Exception -> 0x0324 }
            r6[r13] = r12     // Catch:{ Exception -> 0x0324 }
            r12 = 0
            java.lang.Object r6 = r8.invoke(r12, r6)     // Catch:{ Exception -> 0x0324 }
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0324 }
            java.lang.Object r12 = r9.f1831e     // Catch:{ Exception -> 0x0324 }
            r8[r13] = r12     // Catch:{ Exception -> 0x0324 }
            r7.invoke(r6, r8)     // Catch:{ Exception -> 0x0324 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0324 }
            r7[r13] = r0     // Catch:{ Exception -> 0x0324 }
            r11.invoke(r6, r7)     // Catch:{ Exception -> 0x0324 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0324 }
            r0[r13] = r3     // Catch:{ Exception -> 0x0324 }
            java.lang.Object r0 = r4.invoke(r6, r0)     // Catch:{ Exception -> 0x0324 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0324 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0324 }
            if (r0 != 0) goto L_0x0318
            r0 = 1
            goto L_0x0319
        L_0x0318:
            r0 = 0
        L_0x0319:
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x0324 }
            p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0324 }
            if (r0 == 0) goto L_0x0322
            r2 = r5
        L_0x0322:
            r5 = r2
            goto L_0x0336
        L_0x0324:
            r0 = move-exception
            java.lang.String r2 = p000.C0200av.m970a(r23)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r4, r0, r2)
        L_0x0336:
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L_0x0357
            r2 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2032d
            goto L_0x044f
        L_0x0357:
            java.lang.String r0 = r9.f1827a
            byte[] r0 = r0.getBytes()
            go r2 = p000.C0433ep.f2034f
            go r4 = p000.C0433ep.f2036h
            go r5 = p000.C0433ep.f2038j
            r6 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r10 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r6, r10, r3)
            java.lang.String r6 = p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x0409 }
            java.lang.ClassLoader r7 = r14.getClassLoader()     // Catch:{ Exception -> 0x0409 }
            java.lang.Class r6 = p000.C0389dn.m1512a(r6, r7)     // Catch:{ Exception -> 0x0409 }
            java.lang.String r7 = p000.C0200av.m970a(r19)     // Catch:{ Exception -> 0x0409 }
            java.lang.ClassLoader r8 = r14.getClassLoader()     // Catch:{ Exception -> 0x0409 }
            java.lang.Class r7 = p000.C0389dn.m1512a(r7, r8)     // Catch:{ Exception -> 0x0409 }
            java.lang.String r8 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0409 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0409 }
            r12 = 0
            r11[r12] = r14     // Catch:{ Exception -> 0x0409 }
            java.lang.reflect.Method r8 = r6.getDeclaredMethod(r8, r11)     // Catch:{ Exception -> 0x0409 }
            r13 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0409 }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0409 }
            r13[r12] = r7     // Catch:{ Exception -> 0x0409 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0409 }
            r13 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0409 }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0409 }
            r13[r12] = r15     // Catch:{ Exception -> 0x0409 }
            java.lang.reflect.Method r11 = r6.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0409 }
            r13 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x0409 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0409 }
            r14[r12] = r15     // Catch:{ Exception -> 0x0409 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x0409 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0409 }
            r14 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x0409 }
            r13[r12] = r14     // Catch:{ Exception -> 0x0409 }
            r14 = 0
            java.lang.Object r8 = r8.invoke(r14, r13)     // Catch:{ Exception -> 0x0409 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0409 }
            java.lang.Object r14 = r9.f1831e     // Catch:{ Exception -> 0x0409 }
            r13[r12] = r14     // Catch:{ Exception -> 0x0409 }
            r7.invoke(r8, r13)     // Catch:{ Exception -> 0x0409 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0409 }
            r7[r12] = r0     // Catch:{ Exception -> 0x0409 }
            r11.invoke(r8, r7)     // Catch:{ Exception -> 0x0409 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0409 }
            r0[r12] = r3     // Catch:{ Exception -> 0x0409 }
            java.lang.Object r0 = r6.invoke(r8, r0)     // Catch:{ Exception -> 0x0409 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0409 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0409 }
            if (r0 != 0) goto L_0x03fd
            r0 = 1
            goto L_0x03fe
        L_0x03fd:
            r0 = 0
        L_0x03fe:
            p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x0409 }
            p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0409 }
            if (r0 == 0) goto L_0x0407
            r2 = r4
        L_0x0407:
            r0 = r2
            goto L_0x041c
        L_0x0409:
            r0 = move-exception
            java.lang.String r2 = p000.C0200av.m970a(r23)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r6, r3, r0, r2)
            r0 = r5
        L_0x041c:
            go r2 = p000.C0433ep.f2036h
            if (r0 != r2) goto L_0x0430
            r2 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
        L_0x0430:
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            goto L_0x044f
        L_0x0436:
            r2 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r9.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x044f:
            go r2 = p000.C0433ep.f2034f
            if (r0 == r2) goto L_0x045a
            go r2 = p000.C0433ep.f2029a
            if (r0 != r2) goto L_0x0458
            goto L_0x045a
        L_0x0458:
            r0 = 0
            goto L_0x045b
        L_0x045a:
            r0 = 1
        L_0x045b:
            if (r0 != 0) goto L_0x045e
            goto L_0x04ac
        L_0x045e:
            int r0 = r34.ordinal()
            if (r0 == 0) goto L_0x049c
            r2 = 1
            if (r0 == r2) goto L_0x0484
            r3 = 2
            if (r0 == r3) goto L_0x046b
            goto L_0x04a8
        L_0x046b:
            iu$a r0 = p000.C0697ju.f2933a
            r3 = 0
            r0.mo3310b(r1, r3)
            p000.C0697ju.m2177F(r1, r3)
            r1.mo2563w(r2)
            r0 = 2131689570(0x7f0f0062, float:1.900816E38)
            r2 = 2131689528(0x7f0f0038, float:1.9008074E38)
            r3 = 2131689538(0x7f0f0042, float:1.9008094E38)
            p000.C0728kh.m2289e(r1, r0, r2, r3)
            goto L_0x04a8
        L_0x0484:
            r3 = 0
            p000.C0697ju.m2177F(r1, r3)
            r1.mo2563w(r3)
            android.content.Context r0 = r33.getApplicationContext()
            com.nordskog.LesserAudioSwitch.ui.MainActivity$a r2 = new com.nordskog.LesserAudioSwitch.ui.MainActivity$a
            lt$b r3 = p000.C0793lt.C0795b.RESTORE_ON_BOOT
            r2.<init>(r1, r3, r0)
            android.app.AlertDialog r0 = r2.f3189a
            r0.show()
            goto L_0x04a8
        L_0x049c:
            r3 = 0
            iu$a r0 = p000.C0697ju.f2933a
            r0.mo3310b(r1, r3)
            p000.C0697ju.m2177F(r1, r3)
            r1.mo2563w(r3)
        L_0x04a8:
            r33.mo2556B()
            return
        L_0x04ac:
            r33.mo2562v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nordskog.LesserAudioSwitch.p002ui.MainActivity.mo2564x(com.nordskog.LesserAudioSwitch.ui.MainActivity$b):void");
    }

    /* renamed from: y */
    public final void mo2565y(C1129so soVar) {
        C0936oo.m2711v(this, soVar, (C0735ko.C0740e) null);
    }

    /* renamed from: z */
    public final void mo2566z() {
        C0348cp cpVar;
        boolean z;
        String str;
        String str2;
        byte hashCode;
        String str3 = C1384xo.f5119a;
        int i = C1425yo.f5206a;
        int i2 = 0;
        String string = getSharedPreferences(C0200av.m970a(-37364898813100L), 0).getString(Integer.toHexString(str3.hashCode()), (String) null);
        if (string == null || string.isEmpty()) {
            cpVar = new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g);
        } else {
            if (!string.isEmpty()) {
                byte[] decode = Base64.decode(string, 0);
                if (C0391dp.f1915a == null) {
                    C0391dp.f1915a = Settings.Secure.getString(getContentResolver(), C0200av.m970a(-70479096665260L));
                }
                if (C0391dp.f1915a == null) {
                    C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                }
                String str4 = C0391dp.f1915a;
                byte b = 5;
                if (!(str4 == null || str4.isEmpty() || (hashCode = (byte) str4.hashCode()) == 0)) {
                    b = hashCode;
                }
                byte b2 = (byte) (b * -1);
                C0495fu.m1724a(decode);
                byte[] bArr = new byte[decode.length];
                for (int i3 = 0; i3 < decode.length; i3++) {
                    int i4 = decode[i3] + b2;
                    if (i4 > 127) {
                        i4 -= 256;
                    } else if (i4 < -128) {
                        i4 += 256;
                    }
                    bArr[i3] = (byte) i4;
                }
                C0495fu.m1724a(bArr);
                string = Build.VERSION.SDK_INT >= 19 ? new String(bArr, StandardCharsets.UTF_8) : new String(bArr);
            }
            String[] split = string.split(C0200av.m970a(-38004848940204L));
            cpVar = split.length != 4 ? new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g) : new C0348cp(split[0], split[1], split[2], split[3], C0433ep.f2029a);
        }
        String str5 = C0391dp.f1915a;
        String str6 = cpVar.f1827a;
        if (!((str6 == null || str6.isEmpty() || (str = cpVar.f1828b) == null || str.isEmpty() || (str2 = cpVar.f1829c) == null || str2.isEmpty() || cpVar.f1831e == null) ? false : true)) {
            C0544go goVar = C0433ep.f2030b;
            String.valueOf(goVar);
            cpVar.f1832f = goVar;
            z = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(cpVar.f1827a);
            sb.append(cpVar.f1828b);
            boolean equals = C0279ch.m1122s(sb, cpVar.f1829c).equals(cpVar.f1830d);
            if (!equals) {
                C0200av.m970a(-70015240197292L);
                C0200av.m970a(-70036715033772L);
            }
            C0544go goVar2 = equals ? C0433ep.f2039k : C0433ep.f2031c;
            String.valueOf(goVar2);
            cpVar.f1832f = goVar2;
            z = equals;
        }
        boolean z2 = !z;
        View view = this.f1774v;
        if (view != null) {
            if (!z2) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }
}
