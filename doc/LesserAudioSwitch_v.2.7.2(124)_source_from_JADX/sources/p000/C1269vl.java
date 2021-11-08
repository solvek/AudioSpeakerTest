package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.BitSet;
import p000.C1067rl;
import p000.C1375xl;

/* renamed from: vl */
public class C1269vl {

    /* renamed from: a */
    public final C1375xl[] f4826a = new C1375xl[4];

    /* renamed from: b */
    public final Matrix[] f4827b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f4828c = new Matrix[4];

    /* renamed from: d */
    public final PointF f4829d = new PointF();

    /* renamed from: e */
    public final Path f4830e = new Path();

    /* renamed from: f */
    public final Path f4831f = new Path();

    /* renamed from: g */
    public final C1375xl f4832g = new C1375xl();

    /* renamed from: h */
    public final float[] f4833h = new float[2];

    /* renamed from: i */
    public final float[] f4834i = new float[2];

    /* renamed from: j */
    public boolean f4835j = true;

    /* renamed from: vl$a */
    public interface C1270a {
    }

    public C1269vl() {
        for (int i = 0; i < 4; i++) {
            this.f4826a[i] = new C1375xl();
            this.f4827b[i] = new Matrix();
            this.f4828c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public void mo4919a(C1217ul ulVar, float f, RectF rectF, C1270a aVar, Path path) {
        int i;
        float f2;
        float f3;
        C1025ql qlVar;
        Path path2;
        Matrix matrix;
        C1375xl xlVar;
        C0890nl nlVar;
        C0933ol olVar;
        float f4;
        float f5;
        C1217ul ulVar2 = ulVar;
        float f6 = f;
        RectF rectF2 = rectF;
        Path path3 = path;
        path.rewind();
        this.f4830e.rewind();
        this.f4831f.rewind();
        this.f4831f.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                nlVar = ulVar2.f4653g;
            } else if (i2 == 2) {
                nlVar = ulVar2.f4654h;
            } else if (i2 != 3) {
                nlVar = ulVar2.f4652f;
            } else {
                nlVar = ulVar2.f4651e;
            }
            if (i2 == 1) {
                olVar = ulVar2.f4649c;
            } else if (i2 == 2) {
                olVar = ulVar2.f4650d;
            } else if (i2 != 3) {
                olVar = ulVar2.f4648b;
            } else {
                olVar = ulVar2.f4647a;
            }
            C1375xl xlVar2 = this.f4826a[i2];
            olVar.getClass();
            olVar.mo3849a(xlVar2, 90.0f, f6, nlVar.mo3635a(rectF2));
            int i3 = i2 + 1;
            float f7 = (float) (i3 * 90);
            this.f4827b[i2].reset();
            PointF pointF = this.f4829d;
            if (i2 == 1) {
                f5 = rectF2.right;
            } else if (i2 != 2) {
                float f8 = i2 != 3 ? rectF2.right : rectF2.left;
                f4 = rectF2.top;
                pointF.set(f8, f4);
                Matrix matrix2 = this.f4827b[i2];
                PointF pointF2 = this.f4829d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f4827b[i2].preRotate(f7);
                float[] fArr = this.f4833h;
                C1375xl[] xlVarArr = this.f4826a;
                fArr[0] = xlVarArr[i2].f5093c;
                fArr[1] = xlVarArr[i2].f5094d;
                this.f4827b[i2].mapPoints(fArr);
                this.f4828c[i2].reset();
                Matrix matrix3 = this.f4828c[i2];
                float[] fArr2 = this.f4833h;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f4828c[i2].preRotate(f7);
                i2 = i3;
            } else {
                f5 = rectF2.left;
            }
            f4 = rectF2.bottom;
            pointF.set(f8, f4);
            Matrix matrix22 = this.f4827b[i2];
            PointF pointF22 = this.f4829d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f4827b[i2].preRotate(f7);
            float[] fArr3 = this.f4833h;
            C1375xl[] xlVarArr2 = this.f4826a;
            fArr3[0] = xlVarArr2[i2].f5093c;
            fArr3[1] = xlVarArr2[i2].f5094d;
            this.f4827b[i2].mapPoints(fArr3);
            this.f4828c[i2].reset();
            Matrix matrix32 = this.f4828c[i2];
            float[] fArr22 = this.f4833h;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f4828c[i2].preRotate(f7);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr4 = this.f4833h;
            C1375xl[] xlVarArr3 = this.f4826a;
            fArr4[0] = xlVarArr3[i4].f5091a;
            fArr4[1] = xlVarArr3[i4].f5092b;
            this.f4827b[i4].mapPoints(fArr4);
            float[] fArr5 = this.f4833h;
            if (i4 == 0) {
                path3.moveTo(fArr5[0], fArr5[1]);
            } else {
                path3.lineTo(fArr5[0], fArr5[1]);
            }
            this.f4826a[i4].mo5106c(this.f4827b[i4], path3);
            if (aVar != null) {
                C1375xl xlVar3 = this.f4826a[i4];
                Matrix matrix4 = this.f4827b[i4];
                C1067rl.C1068a aVar2 = (C1067rl.C1068a) aVar;
                BitSet bitSet = C1067rl.this.f3982e;
                xlVar3.getClass();
                bitSet.set(i4, false);
                C1375xl.C1381f[] fVarArr = C1067rl.this.f3980c;
                xlVar3.mo5105b(xlVar3.f5096f);
                fVarArr[i4] = new C1316wl(xlVar3, new ArrayList(xlVar3.f5098h), matrix4);
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f4833h;
            C1375xl[] xlVarArr4 = this.f4826a;
            fArr6[0] = xlVarArr4[i4].f5093c;
            fArr6[1] = xlVarArr4[i4].f5094d;
            this.f4827b[i4].mapPoints(fArr6);
            float[] fArr7 = this.f4834i;
            C1375xl[] xlVarArr5 = this.f4826a;
            fArr7[0] = xlVarArr5[i6].f5091a;
            fArr7[1] = xlVarArr5[i6].f5092b;
            this.f4827b[i6].mapPoints(fArr7);
            float[] fArr8 = this.f4833h;
            float f9 = fArr8[0];
            float[] fArr9 = this.f4834i;
            int i7 = i6;
            float max = Math.max(((float) Math.hypot((double) (f9 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f4833h;
            C1375xl[] xlVarArr6 = this.f4826a;
            fArr10[0] = xlVarArr6[i4].f5093c;
            fArr10[1] = xlVarArr6[i4].f5094d;
            this.f4827b[i4].mapPoints(fArr10);
            if (i4 == 1 || i4 == 3) {
                f3 = rectF.centerX();
                f2 = this.f4833h[0];
            } else {
                f3 = rectF.centerY();
                f2 = this.f4833h[1];
            }
            float abs = Math.abs(f3 - f2);
            this.f4832g.mo5108e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                qlVar = ulVar2.f4657k;
            } else if (i4 == 2) {
                qlVar = ulVar2.f4658l;
            } else if (i4 != 3) {
                qlVar = ulVar2.f4656j;
            } else {
                qlVar = ulVar2.f4655i;
            }
            qlVar.mo4135a(max, abs, f6, this.f4832g);
            Path path4 = new Path();
            this.f4832g.mo5106c(this.f4828c[i4], path4);
            if (!this.f4835j || Build.VERSION.SDK_INT < 19 || (!mo4920b(path4, i4) && !mo4920b(path4, i7))) {
                xlVar = this.f4832g;
                matrix = this.f4828c[i4];
                path2 = path3;
            } else {
                path4.op(path4, this.f4831f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f4833h;
                C1375xl xlVar4 = this.f4832g;
                fArr11[0] = xlVar4.f5091a;
                fArr11[1] = xlVar4.f5092b;
                this.f4828c[i4].mapPoints(fArr11);
                Path path5 = this.f4830e;
                float[] fArr12 = this.f4833h;
                path5.moveTo(fArr12[0], fArr12[1]);
                xlVar = this.f4832g;
                matrix = this.f4828c[i4];
                path2 = this.f4830e;
            }
            xlVar.mo5106c(matrix, path2);
            if (aVar != null) {
                C1375xl xlVar5 = this.f4832g;
                Matrix matrix5 = this.f4828c[i4];
                C1067rl.C1068a aVar3 = (C1067rl.C1068a) aVar;
                xlVar5.getClass();
                C1067rl.this.f3982e.set(i4 + 4, false);
                C1375xl.C1381f[] fVarArr2 = C1067rl.this.f3981d;
                xlVar5.mo5105b(xlVar5.f5096f);
                fVarArr2[i4] = new C1316wl(xlVar5, new ArrayList(xlVar5.f5098h), matrix5);
            }
            i4 = i5;
        }
        path.close();
        this.f4830e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f4830e.isEmpty()) {
            path3.op(this.f4830e, Path.Op.UNION);
        }
    }

    /* renamed from: b */
    public final boolean mo4920b(Path path, int i) {
        Path path2 = new Path();
        this.f4826a[i].mo5106c(this.f4827b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
