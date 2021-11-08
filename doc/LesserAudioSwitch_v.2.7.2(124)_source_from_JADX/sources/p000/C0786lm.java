package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: lm */
public class C0786lm extends C1067rl {

    /* renamed from: A */
    public final RectF f3177A;

    /* renamed from: B */
    public int f3178B;

    /* renamed from: z */
    public final Paint f3179z;

    public C0786lm() {
        this((C1217ul) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0786lm(C1217ul ulVar) {
        super(ulVar == null ? new C1217ul() : ulVar);
        Paint paint = new Paint(1);
        this.f3179z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f3177A = new RectF();
    }

    public void draw(Canvas canvas) {
        int i;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            } else {
                i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
            }
            this.f3178B = i;
        }
        super.draw(canvas);
        canvas.drawRect(this.f3177A, this.f3179z);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f3178B);
        }
    }

    /* renamed from: x */
    public void mo3639x(float f, float f2, float f3, float f4) {
        RectF rectF = this.f3177A;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
