package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: l5 */
public class C0756l5 extends View {

    /* renamed from: b */
    public int f3105b;

    /* renamed from: c */
    public View f3106c;

    /* renamed from: d */
    public int f3107d;

    /* renamed from: a */
    public void mo3592a() {
        if (this.f3106c != null) {
            ConstraintLayout.C0084a aVar = (ConstraintLayout.C0084a) getLayoutParams();
            ConstraintLayout.C0084a aVar2 = (ConstraintLayout.C0084a) this.f3106c.getLayoutParams();
            C1236v4 v4Var = aVar2.f567k0;
            v4Var.f4727Y = 0;
            aVar.f567k0.mo4813C(v4Var.mo4825n());
            aVar.f567k0.mo4831w(aVar2.f567k0.mo4819h());
            aVar2.f567k0.f4727Y = 8;
        }
    }

    public View getContent() {
        return this.f3106c;
    }

    public int getEmptyVisibility() {
        return this.f3107d;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f3105b != i) {
            View view = this.f3106c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0084a) this.f3106c.getLayoutParams()).f545Z = false;
                this.f3106c = null;
            }
            this.f3105b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f3107d = i;
    }
}
