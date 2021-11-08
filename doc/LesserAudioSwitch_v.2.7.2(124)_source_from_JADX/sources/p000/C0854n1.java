package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: n1 */
public class C0854n1 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f3334a;

    public C0854n1(ActionBarContainer actionBarContainer) {
        this.f3334a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3334a;
        if (actionBarContainer.f249i) {
            Drawable drawable = actionBarContainer.f248h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f246f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f3334a;
        Drawable drawable3 = actionBarContainer2.f247g;
        if (drawable3 != null && actionBarContainer2.f250j) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f3334a;
        if (actionBarContainer.f249i) {
            drawable = actionBarContainer.f248h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f246f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
