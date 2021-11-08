package p000;

import android.content.Context;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: so */
public enum C1129so {
    DEFAULT(R.string.status_output_speaker, R.string.action_output_default, R.drawable.status_default, R.drawable.switch_vector_boring_speakers, R.drawable.notification_widget_boring_speakers, R.drawable.switch_vector_cute_default, R.drawable.small_icon_speakers, R.drawable.tile_speaker_active),
    SPEAKER(R.string.status_output_speaker, R.string.action_output_speaker, R.drawable.status_speakers, R.drawable.switch_vector_boring_speakers, R.drawable.notification_widget_boring_speakers, R.drawable.switch_vector_cute_default, R.drawable.small_icon_speakers, R.drawable.tile_speaker_active),
    EARPIECE(R.string.status_output_earpiece, R.string.action_output_earpiece, R.drawable.status_earpiece, R.drawable.switch_vector_boring_speakers, R.drawable.notification_widget_boring_speakers, R.drawable.switch_vector_cute_default, R.drawable.small_icon_speakers, R.drawable.tile_speaker_active),
    HEADPHONES(R.string.status_output_headphone, R.string.action_output_headphones, R.drawable.status_headphones, R.drawable.switch_vector_boring_headphones, R.drawable.notification_widget_boring_headphones, R.drawable.switch_vector_cute_headphones, R.drawable.small_icon_headphones, R.drawable.tile_speaker_active),
    HEADSET(R.string.status_output_headset, R.string.action_output_headset, R.drawable.status_headphones, R.drawable.switch_vector_boring_headphones, R.drawable.notification_widget_boring_headphones, R.drawable.switch_vector_cute_headphones, R.drawable.small_icon_headphones, R.drawable.tile_speaker_active),
    BLUETOOTH(R.string.status_output_bluetooth, R.string.action_output_bluetooth, R.drawable.status_bluetooth, R.drawable.switch_vector_boring_bluetooth, R.drawable.notification_widget_boring_bluetooth, R.drawable.switch_vector_cute_bluetooth, R.drawable.small_icon_headphones, R.drawable.tile_speaker_active),
    USB(R.string.status_output_usb, R.string.action_output_usb, R.drawable.status_usb, R.drawable.switch_vector_boring_usb, R.drawable.notification_widget_boring_usb, R.drawable.switch_vector_cute_usb, R.drawable.small_icon_headphones, R.drawable.tile_speaker_active),
    CAST(R.string.status_output_cast, R.string.action_output_cast, R.drawable.status_cast, R.drawable.switch_vector_boring_cast, R.drawable.notification_widget_boring_cast, R.drawable.switch_vector_cute_cast, R.drawable.small_icon_cast, R.drawable.tile_speaker_active),
    MUTE(R.string.status_output_muted, R.string.action_output_mute, R.drawable.status_muted, R.drawable.switch_vector_boring_mute, R.drawable.notification_widget_boring_mute, R.drawable.switch_vector_cute_mute, R.drawable.small_icon_muted, R.drawable.tile_speaker_active),
    UNMUTE(R.string.status_output_unmuted, R.string.action_output_unmute, R.drawable.status_default, R.drawable.switch_vector_boring_unmute, R.drawable.notification_widget_boring_unmute, R.drawable.switch_vector_cute_default, R.drawable.small_icon_speakers, R.drawable.tile_speaker_active),
    AUTO(R.string.status_output_speaker, R.string.action_output_speaker, R.drawable.status_default, R.drawable.switch_vector_boring_speakers, R.drawable.notification_widget_boring_speakers, R.drawable.switch_vector_cute_default, R.drawable.small_icon_speakers, R.drawable.tile_speaker_active);
    

    /* renamed from: b */
    public final int f4315b;

    /* renamed from: c */
    public final int f4316c;

    /* renamed from: d */
    public final int f4317d;

    /* renamed from: e */
    public final int f4318e;

    /* renamed from: f */
    public final int f4319f;

    /* renamed from: g */
    public final int f4320g;

    /* access modifiers changed from: public */
    C1129so(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f4315b = i;
        this.f4316c = i2;
        this.f4317d = i3;
        this.f4318e = i4;
        this.f4319f = i5;
        this.f4320g = i7;
    }

    /* renamed from: a */
    public boolean mo4551a(Context context) {
        int ordinal = ordinal();
        if (ordinal == 2) {
            return false;
        }
        switch (ordinal) {
            case 5:
                return C0697ju.m2179b(context);
            case 6:
                return C0697ju.m2200w(context);
            case 7:
                return C0697ju.m2181d(context);
            case 8:
            case 9:
                return C0697ju.m2184g(context);
            case 10:
                return false;
            default:
                return true;
        }
    }
}
