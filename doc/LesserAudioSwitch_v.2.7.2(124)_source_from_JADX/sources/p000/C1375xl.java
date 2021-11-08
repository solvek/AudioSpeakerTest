package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xl */
public class C1375xl {
    @Deprecated

    /* renamed from: a */
    public float f5091a;
    @Deprecated

    /* renamed from: b */
    public float f5092b;
    @Deprecated

    /* renamed from: c */
    public float f5093c;
    @Deprecated

    /* renamed from: d */
    public float f5094d;
    @Deprecated

    /* renamed from: e */
    public float f5095e;
    @Deprecated

    /* renamed from: f */
    public float f5096f;

    /* renamed from: g */
    public final List<C1380e> f5097g = new ArrayList();

    /* renamed from: h */
    public final List<C1381f> f5098h = new ArrayList();

    /* renamed from: xl$a */
    public static class C1376a extends C1381f {

        /* renamed from: b */
        public final C1378c f5099b;

        public C1376a(C1378c cVar) {
            this.f5099b = cVar;
        }

        /* renamed from: a */
        public void mo5011a(Matrix matrix, C0688jl jlVar, int i, Canvas canvas) {
            C0688jl jlVar2 = jlVar;
            int i2 = i;
            Canvas canvas2 = canvas;
            C1378c cVar = this.f5099b;
            float f = cVar.f5108f;
            float f2 = cVar.f5109g;
            C1378c cVar2 = this.f5099b;
            RectF rectF = new RectF(cVar2.f5104b, cVar2.f5105c, cVar2.f5106d, cVar2.f5107e);
            boolean z = f2 < 0.0f;
            Path path = jlVar2.f2919g;
            if (z) {
                int[] iArr = C0688jl.f2911k;
                iArr[0] = 0;
                iArr[1] = jlVar2.f2918f;
                iArr[2] = jlVar2.f2917e;
                iArr[3] = jlVar2.f2916d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = (float) (-i2);
                rectF.inset(f3, f3);
                int[] iArr2 = C0688jl.f2911k;
                iArr2[0] = 0;
                iArr2[1] = jlVar2.f2916d;
                iArr2[2] = jlVar2.f2917e;
                iArr2[3] = jlVar2.f2918f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f4 = 1.0f - (((float) i2) / width);
                float[] fArr = C0688jl.f2912l;
                fArr[1] = f4;
                fArr[2] = ((1.0f - f4) / 2.0f) + f4;
                jlVar2.f2914b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, C0688jl.f2911k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, jlVar2.f2920h);
                }
                canvas.drawArc(rectF, f, f2, true, jlVar2.f2914b);
                canvas.restore();
            }
        }
    }

    /* renamed from: xl$b */
    public static class C1377b extends C1381f {

        /* renamed from: b */
        public final C1379d f5100b;

        /* renamed from: c */
        public final float f5101c;

        /* renamed from: d */
        public final float f5102d;

        public C1377b(C1379d dVar, float f, float f2) {
            this.f5100b = dVar;
            this.f5101c = f;
            this.f5102d = f2;
        }

        /* renamed from: a */
        public void mo5011a(Matrix matrix, C0688jl jlVar, int i, Canvas canvas) {
            C1379d dVar = this.f5100b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f5111c - this.f5102d), (double) (dVar.f5110b - this.f5101c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f5101c, this.f5102d);
            matrix2.preRotate(mo5109b());
            jlVar.getClass();
            rectF.bottom += (float) i;
            rectF.offset(0.0f, (float) (-i));
            int[] iArr = C0688jl.f2909i;
            iArr[0] = jlVar.f2918f;
            iArr[1] = jlVar.f2917e;
            iArr[2] = jlVar.f2916d;
            Paint paint = jlVar.f2915c;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C0688jl.f2910j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, jlVar.f2915c);
            canvas.restore();
        }

        /* renamed from: b */
        public float mo5109b() {
            C1379d dVar = this.f5100b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f5111c - this.f5102d) / (dVar.f5110b - this.f5101c))));
        }
    }

    /* renamed from: xl$c */
    public static class C1378c extends C1380e {

        /* renamed from: h */
        public static final RectF f5103h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f5104b;
        @Deprecated

        /* renamed from: c */
        public float f5105c;
        @Deprecated

        /* renamed from: d */
        public float f5106d;
        @Deprecated

        /* renamed from: e */
        public float f5107e;
        @Deprecated

        /* renamed from: f */
        public float f5108f;
        @Deprecated

        /* renamed from: g */
        public float f5109g;

        public C1378c(float f, float f2, float f3, float f4) {
            this.f5104b = f;
            this.f5105c = f2;
            this.f5106d = f3;
            this.f5107e = f4;
        }

        /* renamed from: a */
        public void mo5110a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5112a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f5103h;
            rectF.set(this.f5104b, this.f5105c, this.f5106d, this.f5107e);
            path.arcTo(rectF, this.f5108f, this.f5109g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: xl$d */
    public static class C1379d extends C1380e {

        /* renamed from: b */
        public float f5110b;

        /* renamed from: c */
        public float f5111c;

        /* renamed from: a */
        public void mo5110a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5112a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f5110b, this.f5111c);
            path.transform(matrix);
        }
    }

    /* renamed from: xl$e */
    public static abstract class C1380e {

        /* renamed from: a */
        public final Matrix f5112a = new Matrix();

        /* renamed from: a */
        public abstract void mo5110a(Matrix matrix, Path path);
    }

    /* renamed from: xl$f */
    public static abstract class C1381f {

        /* renamed from: a */
        public static final Matrix f5113a = new Matrix();

        /* renamed from: a */
        public abstract void mo5011a(Matrix matrix, C0688jl jlVar, int i, Canvas canvas);
    }

    public C1375xl() {
        mo5108e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo5104a(float f, float f2, float f3, float f4, float f5, float f6) {
        C1378c cVar = new C1378c(f, f2, f3, f4);
        cVar.f5108f = f5;
        cVar.f5109g = f6;
        this.f5097g.add(cVar);
        C1376a aVar = new C1376a(cVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        mo5105b(f5);
        this.f5098h.add(aVar);
        this.f5095e = f8;
        double d = (double) f7;
        this.f5093c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f5094d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* renamed from: b */
    public final void mo5105b(float f) {
        float f2 = this.f5095e;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f5093c;
                float f5 = this.f5094d;
                C1378c cVar = new C1378c(f4, f5, f4, f5);
                cVar.f5108f = this.f5095e;
                cVar.f5109g = f3;
                this.f5098h.add(new C1376a(cVar));
                this.f5095e = f;
            }
        }
    }

    /* renamed from: c */
    public void mo5106c(Matrix matrix, Path path) {
        int size = this.f5097g.size();
        for (int i = 0; i < size; i++) {
            this.f5097g.get(i).mo5110a(matrix, path);
        }
    }

    /* renamed from: d */
    public void mo5107d(float f, float f2) {
        C1379d dVar = new C1379d();
        dVar.f5110b = f;
        dVar.f5111c = f2;
        this.f5097g.add(dVar);
        C1377b bVar = new C1377b(dVar, this.f5093c, this.f5094d);
        mo5105b(bVar.mo5109b() + 270.0f);
        this.f5098h.add(bVar);
        this.f5095e = bVar.mo5109b() + 270.0f;
        this.f5093c = f;
        this.f5094d = f2;
    }

    /* renamed from: e */
    public void mo5108e(float f, float f2, float f3, float f4) {
        this.f5091a = f;
        this.f5092b = f2;
        this.f5093c = f;
        this.f5094d = f2;
        this.f5095e = f3;
        this.f5096f = (f3 + f4) % 360.0f;
        this.f5097g.clear();
        this.f5098h.clear();
    }
}
