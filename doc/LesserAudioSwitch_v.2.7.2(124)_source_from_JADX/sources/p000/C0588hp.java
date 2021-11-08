package p000;

import android.content.Intent;
import android.service.quicksettings.TileService;
import com.nordskog.LesserAudioSwitch.p002ui.GenericUnlockActivity;

/* renamed from: hp */
public final /* synthetic */ class C0588hp implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TileService f2498b;

    public /* synthetic */ C0588hp(TileService tileService) {
        this.f2498b = tileService;
    }

    public final void run() {
        TileService tileService = this.f2498b;
        tileService.startActivityAndCollapse(new Intent(tileService, GenericUnlockActivity.class).addFlags(268435456));
    }
}
