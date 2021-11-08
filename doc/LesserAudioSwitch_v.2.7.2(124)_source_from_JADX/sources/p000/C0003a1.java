package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p000.C0449f1;
import p000.C1331x0;

/* renamed from: a1 */
public class C0003a1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0449f1.C0450a {

    /* renamed from: b */
    public C1435z0 f9b;

    /* renamed from: c */
    public C0901o f10c;

    /* renamed from: d */
    public C1331x0 f11d;

    public C0003a1(C1435z0 z0Var) {
        this.f9b = z0Var;
    }

    /* renamed from: b */
    public void mo10b(C1435z0 z0Var, boolean z) {
        C0901o oVar;
        if ((z || z0Var == this.f9b) && (oVar = this.f10c) != null) {
            oVar.dismiss();
        }
    }

    /* renamed from: c */
    public boolean mo11c(C1435z0 z0Var) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f9b.mo5252r(((C1331x0.C1332a) this.f11d.mo5023a()).getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C1331x0 x0Var = this.f11d;
        C1435z0 z0Var = this.f9b;
        C0449f1.C0450a aVar = x0Var.f4995f;
        if (aVar != null) {
            aVar.mo10b(z0Var, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f10c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f10c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f9b.mo5236c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f9b.performShortcut(i, keyEvent, 0);
    }
}
