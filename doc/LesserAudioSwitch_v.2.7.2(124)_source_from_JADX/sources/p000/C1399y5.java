package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p000.C0259c8;
import p000.C0821mb;

/* renamed from: y5 */
public class C1399y5 extends Activity implements C0967pb, C0259c8.C0260a {

    /* renamed from: b */
    public C1011qb f5162b = new C1011qb(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0259c8.m1064a(decorView, keyEvent)) {
            return C0259c8.m1065b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0259c8.m1064a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo1700h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1356xb.m3816c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f5162b.mo4073f(C0821mb.C0823b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
