package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: qh */
public class C1019qh extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f3827a = new Matrix();

    public C1019qh() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Object get(Object obj) {
        this.f3827a.set(((ImageView) obj).getImageMatrix());
        return this.f3827a;
    }

    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
