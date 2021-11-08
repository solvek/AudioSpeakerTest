package com.nordskog.LesserAudioSwitch.p002ui.auto;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0793lt;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.auto.AutoActivity */
public class AutoActivity extends C0947p {

    /* renamed from: s */
    public static final /* synthetic */ int f1813s = 0;

    /* renamed from: o */
    public View f1814o;

    /* renamed from: p */
    public View f1815p;

    /* renamed from: q */
    public View f1816q;

    /* renamed from: r */
    public boolean f1817r = false;

    /* renamed from: com.nordskog.LesserAudioSwitch.ui.auto.AutoActivity$a */
    public class C0346a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C1129so f1818b;

        /* renamed from: c */
        public final /* synthetic */ C0489fo f1819c;

        /* renamed from: d */
        public final /* synthetic */ boolean f1820d;

        /* renamed from: e */
        public final /* synthetic */ View f1821e;

        /* renamed from: com.nordskog.LesserAudioSwitch.ui.auto.AutoActivity$a$a */
        public class C0347a extends C0793lt {

            /* renamed from: b */
            public final /* synthetic */ View f1823b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0347a(Context context, C0793lt.C0795b bVar, View view) {
                super(context, bVar);
                this.f1823b = view;
            }

            /* renamed from: a */
            public boolean mo2567a(Dialog dialog, C1129so soVar) {
                C0346a aVar = C0346a.this;
                if (aVar.f1818b != soVar) {
                    AutoActivity.this.f1817r = true;
                }
                Context context = this.f1823b.getContext();
                C0346a aVar2 = C0346a.this;
                C0489fo foVar = aVar2.f1819c;
                String str = aVar2.f1820d ? "_onConnect" : "_onDisconnect";
                C0728kh.m2280I(context, foVar.toString() + str, soVar);
                C0346a aVar3 = C0346a.this;
                AutoActivity autoActivity = AutoActivity.this;
                View view = aVar3.f1821e;
                int i = AutoActivity.f1813s;
                autoActivity.mo2586u(view, soVar);
                dialog.dismiss();
                return true;
            }
        }

        public C0346a(C1129so soVar, C0489fo foVar, boolean z, View view) {
            this.f1818b = soVar;
            this.f1819c = foVar;
            this.f1820d = z;
            this.f1821e = view;
        }

        public void onClick(View view) {
            new C0347a(AutoActivity.this, C0793lt.C0795b.AUTO_SWITCH, view).f3189a.show();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_auto);
    }

    public void onPause() {
        super.onPause();
        C0690jn.f2922a = false;
    }

    public void onResume() {
        C0690jn.f2922a = true;
        super.onResume();
        setTitle(R.string.auto_config_activity_title);
        this.f1814o = findViewById(R.id.auto_config_event_headphones_container);
        this.f1815p = findViewById(R.id.auto_config_event_bluetooth_container);
        this.f1816q = findViewById(R.id.auto_config_event_usb_container);
        mo2588w(this.f1814o, C0489fo.WIRED_HEADPHONE);
        mo2588w(this.f1815p, C0489fo.BLUETOOTH);
        mo2588w(this.f1816q, C0489fo.USB);
        findViewById(R.id.auto_done_button).setOnClickListener(new C0850mt(this));
    }

    /* renamed from: u */
    public final void mo2586u(View view, C1129so soVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.auto_config_action_icon);
        TextView textView = (TextView) view.findViewById(R.id.auto_config_action_title);
        imageView.setAlpha(soVar == C1129so.DEFAULT ? 0.25f : 1.0f);
        imageView.setImageResource(soVar.f4318e);
        textView.setText(soVar.f4316c);
    }

    /* renamed from: v */
    public final void mo2587v(View view, C0489fo foVar, boolean z) {
        View findViewById = view.findViewById(R.id.auto_config_connect_button);
        ((TextView) view.findViewById(R.id.auto_config_event_button_title)).setText(z ? R.string.auto_text_on_connect : R.string.auto_text_on_disconnect);
        C1129so o = C0728kh.m2299o(view.getContext(), foVar, z);
        mo2586u(view, o);
        findViewById.setOnClickListener(new C0346a(o, foVar, z, view));
    }

    /* renamed from: w */
    public final void mo2588w(View view, C0489fo foVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.auto_config_event_icon);
        TextView textView = (TextView) view.findViewById(R.id.auto_config_event_title);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.auto_config_not_enabled_cover);
        Button button = (Button) view.findViewById(R.id.open_settings_button);
        int ordinal = foVar.ordinal();
        imageView.setImageResource(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 0 : R.drawable.switch_vector_boring_usb : R.drawable.switch_vector_boring_bluetooth : R.drawable.switch_vector_boring_headphones);
        int ordinal2 = foVar.ordinal();
        textView.setText(ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? 0 : R.string.status_output_usb : R.string.status_output_bluetooth : R.string.status_output_headphone);
        int ordinal3 = foVar.ordinal();
        frameLayout.setVisibility(ordinal3 != 2 ? ordinal3 != 3 ? true : C0697ju.m2200w(this) : C0697ju.m2179b(this) ? 8 : 0);
        button.setOnClickListener(new C0651it(this));
        mo2587v((ViewGroup) view.findViewById(R.id.auto_config_connect_button), foVar, true);
        mo2587v((ViewGroup) view.findViewById(R.id.auto_config_disconnect_button), foVar, false);
    }
}
