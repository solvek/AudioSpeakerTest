package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: d2 */
public class C0362d2 extends SeekBar {

    /* renamed from: b */
    public final C0403e2 f1876b;

    public C0362d2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C0253c3.m1047a(this, getContext());
        C0403e2 e2Var = new C0403e2(this);
        this.f1876b = e2Var;
        e2Var.mo15a(attributeSet, R.attr.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0403e2 e2Var = this.f1876b;
        Drawable drawable = e2Var.f1950e;
        if (drawable != null && drawable.isStateful() && drawable.setState(e2Var.f1949d.getDrawableState())) {
            e2Var.f1949d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1876b.f1950e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1876b.mo2682d(canvas);
    }
}
