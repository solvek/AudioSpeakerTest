package p000;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ck */
public class C0282ck implements View.OnTouchListener {

    /* renamed from: b */
    public final Dialog f1390b;

    /* renamed from: c */
    public final int f1391c;

    /* renamed from: d */
    public final int f1392d;

    /* renamed from: e */
    public final int f1393e;

    public C0282ck(Dialog dialog, Rect rect) {
        this.f1390b = dialog;
        this.f1391c = rect.left;
        this.f1392d = rect.top;
        this.f1393e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f1391c;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f1392d;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f1393e;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f1390b.onTouchEvent(obtain);
    }
}
