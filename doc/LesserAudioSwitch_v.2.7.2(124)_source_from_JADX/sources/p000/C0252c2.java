package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: c2 */
public class C0252c2 extends RatingBar {

    /* renamed from: b */
    public final C0004a2 f1329b;

    public C0252c2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C0253c3.m1047a(this, getContext());
        C0004a2 a2Var = new C0004a2(this);
        this.f1329b = a2Var;
        a2Var.mo15a(attributeSet, R.attr.ratingBarStyle);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1329b.f14b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
