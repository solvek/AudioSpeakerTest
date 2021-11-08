package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: k5 */
public class C0714k5 extends View {
    public C0714k5(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0084a aVar = (ConstraintLayout.C0084a) getLayoutParams();
        aVar.f546a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0084a aVar = (ConstraintLayout.C0084a) getLayoutParams();
        aVar.f548b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0084a aVar = (ConstraintLayout.C0084a) getLayoutParams();
        aVar.f550c = f;
        setLayoutParams(aVar);
    }

    public void setVisibility(int i) {
    }
}
