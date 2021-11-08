package p000;

import com.nordskog.LesserAudioSwitch.R;

/* renamed from: ro */
public enum C1072ro {
    DEFAULT(R.string.status_input_internal_mic, R.string.status_input_medium_internal_mic, R.string.action_input_leave_alone, R.drawable.switch_vector_boring_internal),
    AUTO(R.string.status_input_internal_mic, R.string.status_input_medium_internal_mic, R.string.action_input_auto, R.drawable.switch_vector_boring_internal),
    INTERNAL_MIC(R.string.status_input_internal_mic, R.string.status_input_medium_internal_mic, R.string.action_input_internal_mic, R.drawable.switch_vector_boring_internal),
    WIRED_HEADSET(R.string.status_input_headset_mic, R.string.status_input_medium_headset_mic, R.string.action_input_headset_mic, R.drawable.switch_vector_boring_headphones),
    BLUETOOTH_FOR_COMS(R.string.status_input_bluetooth_for_comms, R.string.status_input_medium_bluetooth_for_comms, R.string.action_input_auto, R.drawable.switch_vector_boring_bluetooth),
    BLUETOOTH_FOR_RECORDING(R.string.status_input_bluetooth_for_recording, R.string.status_input_medium_bluetooth_for_recording, R.string.action_input_bluetooth_mic_record_with_bluetooth_output, R.drawable.switch_vector_boring_bluetooth),
    USB_MIC(R.string.status_input_usb_mic, R.string.status_input_medium_usb_mic, R.string.action_input_usb_mic, R.drawable.switch_vector_boring_usb);
    

    /* renamed from: b */
    public int f4037b;

    /* renamed from: c */
    public int f4038c;

    /* renamed from: d */
    public int f4039d;

    /* access modifiers changed from: public */
    C1072ro(int i, int i2, int i3, int i4) {
        this.f4037b = i;
        this.f4038c = i2;
        this.f4039d = i4;
    }
}
