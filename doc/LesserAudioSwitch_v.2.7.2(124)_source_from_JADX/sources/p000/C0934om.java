package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: om */
public class C0934om implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f3504b;

    /* renamed from: c */
    public final /* synthetic */ C0836mm f3505c;

    public C0934om(C0836mm mmVar, AutoCompleteTextView autoCompleteTextView) {
        this.f3505c = mmVar;
        this.f3504b = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f3505c.mo3707i()) {
                this.f3505c.f3300i = false;
            }
            C0836mm.m2535g(this.f3505c, this.f3504b);
        }
        return false;
    }
}
