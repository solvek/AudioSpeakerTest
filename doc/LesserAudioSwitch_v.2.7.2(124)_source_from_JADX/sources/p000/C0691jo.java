package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import p000.C0353cu;

/* renamed from: jo */
public class C0691jo implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f2923a;

    /* renamed from: b */
    public final /* synthetic */ C0353cu.C0354a f2924b;

    public C0691jo(C0735ko koVar, boolean z, C0353cu.C0354a aVar) {
        this.f2923a = z;
        this.f2924b = aVar;
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        boolean z = false;
        try {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
            if (this.f2923a) {
                z = ((Boolean) BluetoothHeadset.class.getMethod(C0200av.m970a(-24866543981740L), new Class[0]).invoke(bluetoothHeadset, new Object[0])).booleanValue();
            } else {
                try {
                    z = ((Boolean) BluetoothHeadset.class.getMethod(C0200av.m970a(-24922378556588L), new Class[0]).invoke(bluetoothHeadset, new Object[0])).booleanValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        C0200av.m970a(-15885767365804L);
        C0200av.m970a(-15915832136876L);
        BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothProfile);
        this.f2924b.mo2596a(Boolean.valueOf(z));
    }

    public void onServiceDisconnected(int i) {
    }
}
