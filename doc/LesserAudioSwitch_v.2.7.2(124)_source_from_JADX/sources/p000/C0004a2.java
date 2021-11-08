package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: a2 */
public class C0004a2 {

    /* renamed from: c */
    public static final int[] f12c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f13a;

    /* renamed from: b */
    public Bitmap f14b;

    public C0004a2(ProgressBar progressBar) {
        this.f13a = progressBar;
    }

    /* renamed from: a */
    public void mo15a(AttributeSet attributeSet, int i) {
        C0555h3 q = C0555h3.m1825q(this.f13a.getContext(), attributeSet, f12c, i, 0);
        Drawable h = q.mo3028h(0);
        if (h != null) {
            ProgressBar progressBar = this.f13a;
            if (h instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) h;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable b = mo16b(animationDrawable.getFrame(i2), true);
                    b.setLevel(10000);
                    animationDrawable2.addFrame(b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                h = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(h);
        }
        Drawable h2 = q.mo3028h(1);
        if (h2 != null) {
            this.f13a.setProgressDrawable(mo16b(h2, false));
        }
        q.f2425b.recycle();
    }

    /* renamed from: b */
    public final Drawable mo16b(Drawable drawable, boolean z) {
        if (drawable instanceof C1443z6) {
            C1443z6 z6Var = (C1443z6) drawable;
            Drawable a = z6Var.mo47a();
            if (a != null) {
                z6Var.mo48b(mo16b(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = mo16b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f14b == null) {
                this.f14b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
