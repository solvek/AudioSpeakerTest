package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: qo */
public enum C1028qo {
    TYPE_UNKNOWN(0),
    TYPE_BUILTIN_EARPIECE(1),
    TYPE_BUILTIN_SPEAKER(2),
    TYPE_WIRED_HEADSET(3),
    TYPE_WIRED_HEADPHONES(4),
    TYPE_LINE_ANALOG(5),
    TYPE_LINE_DIGITAL(6),
    TYPE_BLUETOOTH_SCO(7),
    TYPE_BLUETOOTH_A2DP(8),
    TYPE_HDMI(9),
    TYPE_HDMI_ARC(10),
    TYPE_USB_DEVICE(11),
    TYPE_USB_ACCESSORY(12),
    TYPE_DOCK(13),
    TYPE_FM(14),
    TYPE_BUILTIN_MIC(15),
    TYPE_FM_TUNER(16),
    TYPE_TV_TUNER(17),
    TYPE_TELEPHONY(18),
    TYPE_AUX_LINE(19),
    TYPE_IP(20),
    TYPE_BUS(21),
    TYPE_USB_HEADSET(22),
    TYPE_HEARING_AID(23);
    

    /* renamed from: A */
    public static Map<Integer, C1028qo> f3842A;

    /* renamed from: b */
    public int f3868b;

    /* access modifiers changed from: public */
    static {
        f3842A = new HashMap();
        C1028qo[] values = values();
        for (int i = 0; i < 24; i++) {
            C1028qo qoVar = values[i];
            f3842A.put(Integer.valueOf(qoVar.f3868b), qoVar);
        }
    }

    /* access modifiers changed from: public */
    C1028qo(int i) {
        this.f3868b = i;
    }

    /* renamed from: a */
    public boolean mo4138a() {
        int ordinal = ordinal();
        return ordinal == 3 || ordinal == 4;
    }
}
