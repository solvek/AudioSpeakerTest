package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: sf */
public class C1110sf extends C1060rf {

    /* renamed from: k */
    public static final PorterDuff.Mode f4187k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public C1118h f4188c;

    /* renamed from: d */
    public PorterDuffColorFilter f4189d;

    /* renamed from: e */
    public ColorFilter f4190e;

    /* renamed from: f */
    public boolean f4191f;

    /* renamed from: g */
    public boolean f4192g;

    /* renamed from: h */
    public final float[] f4193h;

    /* renamed from: i */
    public final Matrix f4194i;

    /* renamed from: j */
    public final Rect f4195j;

    /* renamed from: sf$b */
    public static class C1112b extends C1116f {
        public C1112b() {
        }

        public C1112b(C1112b bVar) {
            super(bVar);
        }

        /* renamed from: c */
        public boolean mo4457c() {
            return true;
        }
    }

    /* renamed from: sf$c */
    public static class C1113c extends C1116f {

        /* renamed from: e */
        public int[] f4196e;

        /* renamed from: f */
        public C0455f6 f4197f;

        /* renamed from: g */
        public float f4198g = 0.0f;

        /* renamed from: h */
        public C0455f6 f4199h;

        /* renamed from: i */
        public float f4200i = 1.0f;

        /* renamed from: j */
        public float f4201j = 1.0f;

        /* renamed from: k */
        public float f4202k = 0.0f;

        /* renamed from: l */
        public float f4203l = 1.0f;

        /* renamed from: m */
        public float f4204m = 0.0f;

        /* renamed from: n */
        public Paint.Cap f4205n = Paint.Cap.BUTT;

        /* renamed from: o */
        public Paint.Join f4206o = Paint.Join.MITER;

        /* renamed from: p */
        public float f4207p = 4.0f;

        public C1113c() {
        }

        public C1113c(C1113c cVar) {
            super(cVar);
            this.f4196e = cVar.f4196e;
            this.f4197f = cVar.f4197f;
            this.f4198g = cVar.f4198g;
            this.f4200i = cVar.f4200i;
            this.f4199h = cVar.f4199h;
            this.f4223c = cVar.f4223c;
            this.f4201j = cVar.f4201j;
            this.f4202k = cVar.f4202k;
            this.f4203l = cVar.f4203l;
            this.f4204m = cVar.f4204m;
            this.f4205n = cVar.f4205n;
            this.f4206o = cVar.f4206o;
            this.f4207p = cVar.f4207p;
        }

        /* renamed from: a */
        public boolean mo4458a() {
            return this.f4199h.mo2768c() || this.f4197f.mo2768c();
        }

        /* renamed from: b */
        public boolean mo4459b(int[] iArr) {
            return this.f4197f.mo2769d(iArr) | this.f4199h.mo2769d(iArr);
        }

        public float getFillAlpha() {
            return this.f4201j;
        }

        public int getFillColor() {
            return this.f4199h.f2099c;
        }

        public float getStrokeAlpha() {
            return this.f4200i;
        }

        public int getStrokeColor() {
            return this.f4197f.f2099c;
        }

        public float getStrokeWidth() {
            return this.f4198g;
        }

        public float getTrimPathEnd() {
            return this.f4203l;
        }

        public float getTrimPathOffset() {
            return this.f4204m;
        }

        public float getTrimPathStart() {
            return this.f4202k;
        }

        public void setFillAlpha(float f) {
            this.f4201j = f;
        }

        public void setFillColor(int i) {
            this.f4199h.f2099c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f4200i = f;
        }

        public void setStrokeColor(int i) {
            this.f4197f.f2099c = i;
        }

        public void setStrokeWidth(float f) {
            this.f4198g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f4203l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f4204m = f;
        }

        public void setTrimPathStart(float f) {
            this.f4202k = f;
        }
    }

    /* renamed from: sf$d */
    public static class C1114d extends C1115e {

        /* renamed from: a */
        public final Matrix f4208a;

        /* renamed from: b */
        public final ArrayList<C1115e> f4209b;

        /* renamed from: c */
        public float f4210c;

        /* renamed from: d */
        public float f4211d;

        /* renamed from: e */
        public float f4212e;

        /* renamed from: f */
        public float f4213f;

        /* renamed from: g */
        public float f4214g;

        /* renamed from: h */
        public float f4215h;

        /* renamed from: i */
        public float f4216i;

        /* renamed from: j */
        public final Matrix f4217j;

        /* renamed from: k */
        public int f4218k;

        /* renamed from: l */
        public int[] f4219l;

        /* renamed from: m */
        public String f4220m;

        public C1114d() {
            super((C1111a) null);
            this.f4208a = new Matrix();
            this.f4209b = new ArrayList<>();
            this.f4210c = 0.0f;
            this.f4211d = 0.0f;
            this.f4212e = 0.0f;
            this.f4213f = 1.0f;
            this.f4214g = 1.0f;
            this.f4215h = 0.0f;
            this.f4216i = 0.0f;
            this.f4217j = new Matrix();
            this.f4220m = null;
        }

        public C1114d(C1114d dVar, C0254c4<String, Object> c4Var) {
            super((C1111a) null);
            C1116f fVar;
            this.f4208a = new Matrix();
            this.f4209b = new ArrayList<>();
            this.f4210c = 0.0f;
            this.f4211d = 0.0f;
            this.f4212e = 0.0f;
            this.f4213f = 1.0f;
            this.f4214g = 1.0f;
            this.f4215h = 0.0f;
            this.f4216i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4217j = matrix;
            this.f4220m = null;
            this.f4210c = dVar.f4210c;
            this.f4211d = dVar.f4211d;
            this.f4212e = dVar.f4212e;
            this.f4213f = dVar.f4213f;
            this.f4214g = dVar.f4214g;
            this.f4215h = dVar.f4215h;
            this.f4216i = dVar.f4216i;
            this.f4219l = dVar.f4219l;
            String str = dVar.f4220m;
            this.f4220m = str;
            this.f4218k = dVar.f4218k;
            if (str != null) {
                c4Var.put(str, this);
            }
            matrix.set(dVar.f4217j);
            ArrayList<C1115e> arrayList = dVar.f4209b;
            for (int i = 0; i < arrayList.size(); i++) {
                C1115e eVar = arrayList.get(i);
                if (eVar instanceof C1114d) {
                    this.f4209b.add(new C1114d((C1114d) eVar, c4Var));
                } else {
                    if (eVar instanceof C1113c) {
                        fVar = new C1113c((C1113c) eVar);
                    } else if (eVar instanceof C1112b) {
                        fVar = new C1112b((C1112b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4209b.add(fVar);
                    String str2 = fVar.f4222b;
                    if (str2 != null) {
                        c4Var.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo4458a() {
            for (int i = 0; i < this.f4209b.size(); i++) {
                if (this.f4209b.get(i).mo4458a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo4459b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f4209b.size(); i++) {
                z |= this.f4209b.get(i).mo4459b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public final void mo4476c() {
            this.f4217j.reset();
            this.f4217j.postTranslate(-this.f4211d, -this.f4212e);
            this.f4217j.postScale(this.f4213f, this.f4214g);
            this.f4217j.postRotate(this.f4210c, 0.0f, 0.0f);
            this.f4217j.postTranslate(this.f4215h + this.f4211d, this.f4216i + this.f4212e);
        }

        public String getGroupName() {
            return this.f4220m;
        }

        public Matrix getLocalMatrix() {
            return this.f4217j;
        }

        public float getPivotX() {
            return this.f4211d;
        }

        public float getPivotY() {
            return this.f4212e;
        }

        public float getRotation() {
            return this.f4210c;
        }

        public float getScaleX() {
            return this.f4213f;
        }

        public float getScaleY() {
            return this.f4214g;
        }

        public float getTranslateX() {
            return this.f4215h;
        }

        public float getTranslateY() {
            return this.f4216i;
        }

        public void setPivotX(float f) {
            if (f != this.f4211d) {
                this.f4211d = f;
                mo4476c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f4212e) {
                this.f4212e = f;
                mo4476c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f4210c) {
                this.f4210c = f;
                mo4476c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f4213f) {
                this.f4213f = f;
                mo4476c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f4214g) {
                this.f4214g = f;
                mo4476c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f4215h) {
                this.f4215h = f;
                mo4476c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f4216i) {
                this.f4216i = f;
                mo4476c();
            }
        }
    }

    /* renamed from: sf$e */
    public static abstract class C1115e {
        public C1115e() {
        }

        public C1115e(C1111a aVar) {
        }

        /* renamed from: a */
        public boolean mo4458a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo4459b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: sf$f */
    public static abstract class C1116f extends C1115e {

        /* renamed from: a */
        public C0958p6[] f4221a = null;

        /* renamed from: b */
        public String f4222b;

        /* renamed from: c */
        public int f4223c = 0;

        /* renamed from: d */
        public int f4224d;

        public C1116f() {
            super((C1111a) null);
        }

        public C1116f(C1116f fVar) {
            super((C1111a) null);
            this.f4222b = fVar.f4222b;
            this.f4224d = fVar.f4224d;
            this.f4221a = C1344x5.m3772q(fVar.f4221a);
        }

        /* renamed from: c */
        public boolean mo4457c() {
            return false;
        }

        public C0958p6[] getPathData() {
            return this.f4221a;
        }

        public String getPathName() {
            return this.f4222b;
        }

        public void setPathData(C0958p6[] p6VarArr) {
            if (!C1344x5.m3751d(this.f4221a, p6VarArr)) {
                this.f4221a = C1344x5.m3772q(p6VarArr);
                return;
            }
            C0958p6[] p6VarArr2 = this.f4221a;
            for (int i = 0; i < p6VarArr.length; i++) {
                p6VarArr2[i].f3567a = p6VarArr[i].f3567a;
                for (int i2 = 0; i2 < p6VarArr[i].f3568b.length; i2++) {
                    p6VarArr2[i].f3568b[i2] = p6VarArr[i].f3568b[i2];
                }
            }
        }
    }

    /* renamed from: sf$g */
    public static class C1117g {

        /* renamed from: q */
        public static final Matrix f4225q = new Matrix();

        /* renamed from: a */
        public final Path f4226a;

        /* renamed from: b */
        public final Path f4227b;

        /* renamed from: c */
        public final Matrix f4228c;

        /* renamed from: d */
        public Paint f4229d;

        /* renamed from: e */
        public Paint f4230e;

        /* renamed from: f */
        public PathMeasure f4231f;

        /* renamed from: g */
        public int f4232g;

        /* renamed from: h */
        public final C1114d f4233h;

        /* renamed from: i */
        public float f4234i;

        /* renamed from: j */
        public float f4235j;

        /* renamed from: k */
        public float f4236k;

        /* renamed from: l */
        public float f4237l;

        /* renamed from: m */
        public int f4238m;

        /* renamed from: n */
        public String f4239n;

        /* renamed from: o */
        public Boolean f4240o;

        /* renamed from: p */
        public final C0254c4<String, Object> f4241p;

        public C1117g() {
            this.f4228c = new Matrix();
            this.f4234i = 0.0f;
            this.f4235j = 0.0f;
            this.f4236k = 0.0f;
            this.f4237l = 0.0f;
            this.f4238m = 255;
            this.f4239n = null;
            this.f4240o = null;
            this.f4241p = new C0254c4<>();
            this.f4233h = new C1114d();
            this.f4226a = new Path();
            this.f4227b = new Path();
        }

        public C1117g(C1117g gVar) {
            this.f4228c = new Matrix();
            this.f4234i = 0.0f;
            this.f4235j = 0.0f;
            this.f4236k = 0.0f;
            this.f4237l = 0.0f;
            this.f4238m = 255;
            this.f4239n = null;
            this.f4240o = null;
            C0254c4<String, Object> c4Var = new C0254c4<>();
            this.f4241p = c4Var;
            this.f4233h = new C1114d(gVar.f4233h, c4Var);
            this.f4226a = new Path(gVar.f4226a);
            this.f4227b = new Path(gVar.f4227b);
            this.f4234i = gVar.f4234i;
            this.f4235j = gVar.f4235j;
            this.f4236k = gVar.f4236k;
            this.f4237l = gVar.f4237l;
            this.f4232g = gVar.f4232g;
            this.f4238m = gVar.f4238m;
            this.f4239n = gVar.f4239n;
            String str = gVar.f4239n;
            if (str != null) {
                c4Var.put(str, this);
            }
            this.f4240o = gVar.f4240o;
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        /* renamed from: a */
        public final void mo4496a(C1114d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            C1117g gVar;
            C1117g gVar2 = this;
            C1114d dVar2 = dVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            dVar2.f4208a.set(matrix);
            dVar2.f4208a.preConcat(dVar2.f4217j);
            canvas.save();
            ? r11 = 0;
            int i3 = 0;
            while (i3 < dVar2.f4209b.size()) {
                C1115e eVar = dVar2.f4209b.get(i3);
                if (eVar instanceof C1114d) {
                    mo4496a((C1114d) eVar, dVar2.f4208a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1116f) {
                    C1116f fVar = (C1116f) eVar;
                    float f = ((float) i) / gVar2.f4236k;
                    float f2 = ((float) i2) / gVar2.f4237l;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = dVar2.f4208a;
                    gVar2.f4228c.set(matrix2);
                    gVar2.f4228c.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f3 = min;
                    float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.f4226a;
                        fVar.getClass();
                        path.reset();
                        C0958p6[] p6VarArr = fVar.f4221a;
                        if (p6VarArr != null) {
                            C0958p6.m2780b(p6VarArr, path);
                        }
                        Path path2 = gVar.f4226a;
                        gVar.f4227b.reset();
                        if (fVar.mo4457c()) {
                            gVar.f4227b.setFillType(fVar.f4223c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            gVar.f4227b.addPath(path2, gVar.f4228c);
                            canvas2.clipPath(gVar.f4227b);
                        } else {
                            C1113c cVar = (C1113c) fVar;
                            float f5 = cVar.f4202k;
                            if (!(f5 == 0.0f && cVar.f4203l == 1.0f)) {
                                float f6 = cVar.f4204m;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (cVar.f4203l + f6) % 1.0f;
                                if (gVar.f4231f == null) {
                                    gVar.f4231f = new PathMeasure();
                                }
                                gVar.f4231f.setPath(gVar.f4226a, r11);
                                float length = gVar.f4231f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path2.reset();
                                if (f9 > f10) {
                                    gVar.f4231f.getSegment(f9, length, path2, true);
                                    gVar.f4231f.getSegment(0.0f, f10, path2, true);
                                } else {
                                    gVar.f4231f.getSegment(f9, f10, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            gVar.f4227b.addPath(path2, gVar.f4228c);
                            C0455f6 f6Var = cVar.f4199h;
                            if (f6Var.mo2767b() || f6Var.f2099c != 0) {
                                C0455f6 f6Var2 = cVar.f4199h;
                                if (gVar.f4230e == null) {
                                    Paint paint = new Paint(1);
                                    gVar.f4230e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = gVar.f4230e;
                                if (f6Var2.mo2767b()) {
                                    Shader shader = f6Var2.f2097a;
                                    shader.setLocalMatrix(gVar.f4228c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.f4201j * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i4 = f6Var2.f2099c;
                                    float f11 = cVar.f4201j;
                                    PorterDuff.Mode mode = C1110sf.f4187k;
                                    paint2.setColor((i4 & 16777215) | (((int) (((float) Color.alpha(i4)) * f11)) << 24));
                                }
                                paint2.setColorFilter(colorFilter2);
                                gVar.f4227b.setFillType(cVar.f4223c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(gVar.f4227b, paint2);
                            }
                            C0455f6 f6Var3 = cVar.f4197f;
                            if (f6Var3.mo2767b() || f6Var3.f2099c != 0) {
                                C0455f6 f6Var4 = cVar.f4197f;
                                if (gVar.f4229d == null) {
                                    Paint paint3 = new Paint(1);
                                    gVar.f4229d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = gVar.f4229d;
                                Paint.Join join = cVar.f4206o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.f4205n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.f4207p);
                                if (f6Var4.mo2767b()) {
                                    Shader shader2 = f6Var4.f2097a;
                                    shader2.setLocalMatrix(gVar.f4228c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.f4200i * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i5 = f6Var4.f2099c;
                                    float f12 = cVar.f4200i;
                                    PorterDuff.Mode mode2 = C1110sf.f4187k;
                                    paint4.setColor((i5 & 16777215) | (((int) (((float) Color.alpha(i5)) * f12)) << 24));
                                }
                                paint4.setColorFilter(colorFilter2);
                                paint4.setStrokeWidth(cVar.f4198g * abs * f3);
                                canvas2.drawPath(gVar.f4227b, paint4);
                            }
                        }
                    }
                    i3++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                int i6 = i;
                int i7 = i2;
                gVar = gVar2;
                i3++;
                gVar2 = gVar;
                r11 = 0;
            }
            C1117g gVar3 = gVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4238m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f4238m = i;
        }
    }

    /* renamed from: sf$h */
    public static class C1118h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f4242a;

        /* renamed from: b */
        public C1117g f4243b;

        /* renamed from: c */
        public ColorStateList f4244c;

        /* renamed from: d */
        public PorterDuff.Mode f4245d;

        /* renamed from: e */
        public boolean f4246e;

        /* renamed from: f */
        public Bitmap f4247f;

        /* renamed from: g */
        public ColorStateList f4248g;

        /* renamed from: h */
        public PorterDuff.Mode f4249h;

        /* renamed from: i */
        public int f4250i;

        /* renamed from: j */
        public boolean f4251j;

        /* renamed from: k */
        public boolean f4252k;

        /* renamed from: l */
        public Paint f4253l;

        public C1118h() {
            this.f4244c = null;
            this.f4245d = C1110sf.f4187k;
            this.f4243b = new C1117g();
        }

        public C1118h(C1118h hVar) {
            this.f4244c = null;
            this.f4245d = C1110sf.f4187k;
            if (hVar != null) {
                this.f4242a = hVar.f4242a;
                C1117g gVar = new C1117g(hVar.f4243b);
                this.f4243b = gVar;
                if (hVar.f4243b.f4230e != null) {
                    gVar.f4230e = new Paint(hVar.f4243b.f4230e);
                }
                if (hVar.f4243b.f4229d != null) {
                    this.f4243b.f4229d = new Paint(hVar.f4243b.f4229d);
                }
                this.f4244c = hVar.f4244c;
                this.f4245d = hVar.f4245d;
                this.f4246e = hVar.f4246e;
            }
        }

        /* renamed from: a */
        public boolean mo4501a() {
            C1117g gVar = this.f4243b;
            if (gVar.f4240o == null) {
                gVar.f4240o = Boolean.valueOf(gVar.f4233h.mo4458a());
            }
            return gVar.f4240o.booleanValue();
        }

        /* renamed from: b */
        public void mo4502b(int i, int i2) {
            this.f4247f.eraseColor(0);
            Canvas canvas = new Canvas(this.f4247f);
            C1117g gVar = this.f4243b;
            gVar.mo4496a(gVar.f4233h, C1117g.f4225q, canvas, i, i2, (ColorFilter) null);
        }

        public int getChangingConfigurations() {
            return this.f4242a;
        }

        public Drawable newDrawable() {
            return new C1110sf(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1110sf(this);
        }
    }

    /* renamed from: sf$i */
    public static class C1119i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f4254a;

        public C1119i(Drawable.ConstantState constantState) {
            this.f4254a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4254a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4254a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1110sf sfVar = new C1110sf();
            sfVar.f3957b = (VectorDrawable) this.f4254a.newDrawable();
            return sfVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1110sf sfVar = new C1110sf();
            sfVar.f3957b = (VectorDrawable) this.f4254a.newDrawable(resources);
            return sfVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1110sf sfVar = new C1110sf();
            sfVar.f3957b = (VectorDrawable) this.f4254a.newDrawable(resources, theme);
            return sfVar;
        }
    }

    public C1110sf() {
        this.f4192g = true;
        this.f4193h = new float[9];
        this.f4194i = new Matrix();
        this.f4195j = new Rect();
        this.f4188c = new C1118h();
    }

    public C1110sf(C1118h hVar) {
        this.f4192g = true;
        this.f4193h = new float[9];
        this.f4194i = new Matrix();
        this.f4195j = new Rect();
        this.f4188c = hVar;
        this.f4189d = mo4433b(hVar.f4244c, hVar.f4245d);
    }

    /* renamed from: a */
    public static C1110sf m3171a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1110sf sfVar = new C1110sf();
        sfVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return sfVar;
    }

    /* renamed from: b */
    public PorterDuffColorFilter mo4433b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3957b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f4247f.getHeight()) == false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f3957b
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.f4195j
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f4195j
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0171
            android.graphics.Rect r0 = r10.f4195j
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x0171
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.f4190e
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.f4189d
        L_0x0025:
            android.graphics.Matrix r1 = r10.f4194i
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f4194i
            float[] r2 = r10.f4193h
            r1.getValues(r2)
            float[] r1 = r10.f4193h
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f4193h
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f4193h
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f4193h
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0064
        L_0x0060:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0064:
            android.graphics.Rect r4 = r10.f4195j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f4195j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x0171
            if (r3 > 0) goto L_0x0088
            goto L_0x0171
        L_0x0088:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f4195j
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 17
            if (r6 < r9) goto L_0x00ab
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00ab
            int r6 = p000.C1344x5.m3780y(r10)
            if (r6 != r5) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            if (r6 == 0) goto L_0x00bd
            android.graphics.Rect r6 = r10.f4195j
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00bd:
            android.graphics.Rect r6 = r10.f4195j
            r6.offsetTo(r2, r2)
            sf$h r6 = r10.f4188c
            android.graphics.Bitmap r7 = r6.f4247f
            if (r7 == 0) goto L_0x00db
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00d8
            android.graphics.Bitmap r7 = r6.f4247f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00d8
            r7 = 1
            goto L_0x00d9
        L_0x00d8:
            r7 = 0
        L_0x00d9:
            if (r7 != 0) goto L_0x00e5
        L_0x00db:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f4247f = r7
            r6.f4252k = r5
        L_0x00e5:
            boolean r6 = r10.f4192g
            if (r6 != 0) goto L_0x00ef
            sf$h r6 = r10.f4188c
            r6.mo4502b(r1, r3)
            goto L_0x0133
        L_0x00ef:
            sf$h r6 = r10.f4188c
            boolean r7 = r6.f4252k
            if (r7 != 0) goto L_0x0113
            android.content.res.ColorStateList r7 = r6.f4248g
            android.content.res.ColorStateList r8 = r6.f4244c
            if (r7 != r8) goto L_0x0113
            android.graphics.PorterDuff$Mode r7 = r6.f4249h
            android.graphics.PorterDuff$Mode r8 = r6.f4245d
            if (r7 != r8) goto L_0x0113
            boolean r7 = r6.f4251j
            boolean r8 = r6.f4246e
            if (r7 != r8) goto L_0x0113
            int r7 = r6.f4250i
            sf$g r6 = r6.f4243b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x0113
            r6 = 1
            goto L_0x0114
        L_0x0113:
            r6 = 0
        L_0x0114:
            if (r6 != 0) goto L_0x0133
            sf$h r6 = r10.f4188c
            r6.mo4502b(r1, r3)
            sf$h r1 = r10.f4188c
            android.content.res.ColorStateList r3 = r1.f4244c
            r1.f4248g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f4245d
            r1.f4249h = r3
            sf$g r3 = r1.f4243b
            int r3 = r3.getRootAlpha()
            r1.f4250i = r3
            boolean r3 = r1.f4246e
            r1.f4251j = r3
            r1.f4252k = r2
        L_0x0133:
            sf$h r1 = r10.f4188c
            android.graphics.Rect r3 = r10.f4195j
            sf$g r6 = r1.f4243b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x0142
            r2 = 1
        L_0x0142:
            r6 = 0
            if (r2 != 0) goto L_0x0149
            if (r0 != 0) goto L_0x0149
            r0 = r6
            goto L_0x0169
        L_0x0149:
            android.graphics.Paint r2 = r1.f4253l
            if (r2 != 0) goto L_0x0157
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f4253l = r2
            r2.setFilterBitmap(r5)
        L_0x0157:
            android.graphics.Paint r2 = r1.f4253l
            sf$g r5 = r1.f4243b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f4253l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f4253l
        L_0x0169:
            android.graphics.Bitmap r1 = r1.f4247f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1110sf.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.f3957b;
        if (drawable == null) {
            return this.f4188c.f4243b.getRootAlpha();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4188c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3957b;
        if (drawable == null) {
            return this.f4190e;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3957b != null && Build.VERSION.SDK_INT >= 24) {
            return new C1119i(this.f3957b.getConstantState());
        }
        this.f4188c.f4242a = getChangingConfigurations();
        return this.f4188c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4188c.f4243b.f4235j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4188c.f4243b.f4234i;
    }

    public int getOpacity() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:201:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r27, org.xmlpull.v1.XmlPullParser r28, android.util.AttributeSet r29, android.content.res.Resources.Theme r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            android.graphics.drawable.Drawable r2 = r0.f3957b
            if (r2 == 0) goto L_0x001c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r3 < r4) goto L_0x0018
            r2.inflate(r1, r8, r9, r10)
            goto L_0x001b
        L_0x0018:
            r2.inflate(r1, r8, r9)
        L_0x001b:
            return
        L_0x001c:
            sf$h r11 = r0.f4188c
            sf$g r2 = new sf$g
            r2.<init>()
            r11.f4243b = r2
            int[] r2 = p000.C0829mf.f3273a
            android.content.res.TypedArray r2 = p000.C0806m6.m2449j(r1, r10, r9, r2)
            sf$h r3 = r0.f4188c
            sf$g r4 = r3.f4243b
            java.lang.String r5 = "tintMode"
            boolean r5 = p000.C0806m6.m2447h(r8, r5)
            r12 = 6
            r13 = -1
            if (r5 != 0) goto L_0x003b
            r5 = -1
            goto L_0x003f
        L_0x003b:
            int r5 = r2.getInt(r12, r13)
        L_0x003f:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r14 = 9
            r15 = 5
            r7 = 3
            if (r5 == r7) goto L_0x005b
            if (r5 == r15) goto L_0x005d
            if (r5 == r14) goto L_0x0058
            switch(r5) {
                case 14: goto L_0x0055;
                case 15: goto L_0x0052;
                case 16: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x005d
        L_0x004f:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x005d
        L_0x0052:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x005d
        L_0x0055:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x005d
        L_0x0058:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x005d
        L_0x005b:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x005d:
            r3.f4245d = r6
            java.lang.String r5 = "tint"
            boolean r5 = p000.C0806m6.m2447h(r8, r5)
            r12 = 0
            r14 = 1
            r13 = 2
            if (r5 == 0) goto L_0x00b5
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r2.getValue(r14, r5)
            int r6 = r5.type
            if (r6 == r13) goto L_0x0096
            r13 = 28
            if (r6 < r13) goto L_0x0085
            r13 = 31
            if (r6 > r13) goto L_0x0085
            int r5 = r5.data
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            goto L_0x00b6
        L_0x0085:
            android.content.res.Resources r5 = r2.getResources()
            int r6 = r2.getResourceId(r14, r12)
            android.content.res.XmlResourceParser r6 = r5.getXml(r6)     // Catch:{ Exception -> 0x00b5 }
            android.content.res.ColorStateList r5 = p000.C1344x5.m3768m(r5, r6, r10)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b6
        L_0x0096:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to resolve attribute at index "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00b5:
            r5 = 0
        L_0x00b6:
            if (r5 == 0) goto L_0x00ba
            r3.f4244c = r5
        L_0x00ba:
            boolean r5 = r3.f4246e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = p000.C0806m6.m2447h(r8, r6)
            if (r6 != 0) goto L_0x00c5
            goto L_0x00c9
        L_0x00c5:
            boolean r5 = r2.getBoolean(r15, r5)
        L_0x00c9:
            r3.f4246e = r5
            float r3 = r4.f4236k
            java.lang.String r5 = "viewportWidth"
            boolean r5 = p000.C0806m6.m2447h(r8, r5)
            r13 = 7
            if (r5 != 0) goto L_0x00d7
            goto L_0x00db
        L_0x00d7:
            float r3 = r2.getFloat(r13, r3)
        L_0x00db:
            r4.f4236k = r3
            float r3 = r4.f4237l
            java.lang.String r5 = "viewportHeight"
            boolean r5 = p000.C0806m6.m2447h(r8, r5)
            r6 = 8
            if (r5 != 0) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            float r3 = r2.getFloat(r6, r3)
        L_0x00ee:
            r4.f4237l = r3
            float r5 = r4.f4236k
            r19 = 0
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x04d4
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x04b8
            float r3 = r4.f4234i
            float r3 = r2.getDimension(r7, r3)
            r4.f4234i = r3
            float r3 = r4.f4235j
            r5 = 2
            float r3 = r2.getDimension(r5, r3)
            r4.f4235j = r3
            float r5 = r4.f4234i
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x049c
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0480
            float r3 = r4.getAlpha()
            java.lang.String r5 = "alpha"
            boolean r5 = p000.C0806m6.m2447h(r8, r5)
            r15 = 4
            if (r5 != 0) goto L_0x0125
            goto L_0x0129
        L_0x0125:
            float r3 = r2.getFloat(r15, r3)
        L_0x0129:
            r4.setAlpha(r3)
            java.lang.String r3 = r2.getString(r12)
            if (r3 == 0) goto L_0x0139
            r4.f4239n = r3
            c4<java.lang.String, java.lang.Object> r5 = r4.f4241p
            r5.put(r3, r4)
        L_0x0139:
            r2.recycle()
            int r2 = r26.getChangingConfigurations()
            r11.f4242a = r2
            r11.f4252k = r14
            sf$h r5 = r0.f4188c
            sf$g r4 = r5.f4243b
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            sf$d r2 = r4.f4233h
            r3.push(r2)
            int r2 = r28.getEventType()
            int r20 = r28.getDepth()
            int r13 = r20 + 1
            r20 = 1
        L_0x015e:
            if (r2 == r14) goto L_0x0467
            int r6 = r28.getDepth()
            if (r6 >= r13) goto L_0x0168
            if (r2 == r7) goto L_0x0467
        L_0x0168:
            java.lang.String r6 = "group"
            r7 = 2
            if (r2 != r7) goto L_0x0433
            java.lang.String r2 = r28.getName()
            java.lang.Object r7 = r3.peek()
            sf$d r7 = (p000.C1110sf.C1114d) r7
            java.lang.String r15 = "path"
            boolean r15 = r15.equals(r2)
            java.lang.String r14 = "fillType"
            java.lang.String r12 = "pathData"
            if (r15 == 0) goto L_0x0308
            sf$c r15 = new sf$c
            r15.<init>()
            int[] r2 = p000.C0829mf.f3275c
            android.content.res.TypedArray r6 = p000.C0806m6.m2449j(r1, r10, r9, r2)
            r2 = 0
            r15.f4196e = r2
            boolean r12 = p000.C0806m6.m2447h(r8, r12)
            if (r12 != 0) goto L_0x01a9
            r22 = r3
            r23 = r4
            r24 = r5
            r12 = r7
            r21 = r13
            r0 = 8
            r16 = 9
            r18 = -1
            r13 = r6
            goto L_0x02db
        L_0x01a9:
            r12 = 0
            java.lang.String r2 = r6.getString(r12)
            if (r2 == 0) goto L_0x01b2
            r15.f4222b = r2
        L_0x01b2:
            r2 = 2
            java.lang.String r12 = r6.getString(r2)
            if (r12 == 0) goto L_0x01bf
            p6[] r2 = p000.C1344x5.m3770o(r12)
            r15.f4221a = r2
        L_0x01bf:
            r12 = 1
            r20 = 0
            java.lang.String r21 = "fillColor"
            r18 = 0
            r2 = r6
            r22 = r3
            r3 = r28
            r23 = r4
            r4 = r30
            r24 = r5
            r5 = r21
            r21 = r13
            r0 = 8
            r13 = r6
            r6 = r12
            r12 = r7
            r7 = r20
            f6 r2 = p000.C0806m6.m2442c(r2, r3, r4, r5, r6, r7)
            r15.f4199h = r2
            r2 = 12
            float r3 = r15.f4201j
            java.lang.String r4 = "fillAlpha"
            boolean r4 = p000.C0806m6.m2447h(r8, r4)
            if (r4 != 0) goto L_0x01ef
            goto L_0x01f3
        L_0x01ef:
            float r3 = r13.getFloat(r2, r3)
        L_0x01f3:
            r15.f4201j = r3
            java.lang.String r2 = "strokeLineCap"
            boolean r2 = p000.C0806m6.m2447h(r8, r2)
            if (r2 != 0) goto L_0x01ff
            r2 = -1
            goto L_0x0205
        L_0x01ff:
            r2 = -1
            int r3 = r13.getInt(r0, r2)
            r2 = r3
        L_0x0205:
            android.graphics.Paint$Cap r3 = r15.f4205n
            if (r2 == 0) goto L_0x0216
            r4 = 1
            if (r2 == r4) goto L_0x0213
            r4 = 2
            if (r2 == r4) goto L_0x0210
            goto L_0x0218
        L_0x0210:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
            goto L_0x0218
        L_0x0213:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x0218
        L_0x0216:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
        L_0x0218:
            r15.f4205n = r3
            java.lang.String r2 = "strokeLineJoin"
            boolean r2 = p000.C0806m6.m2447h(r8, r2)
            if (r2 != 0) goto L_0x0227
            r2 = -1
            r6 = -1
            r7 = 9
            goto L_0x022e
        L_0x0227:
            r6 = -1
            r7 = 9
            int r2 = r13.getInt(r7, r6)
        L_0x022e:
            android.graphics.Paint$Join r3 = r15.f4206o
            if (r2 == 0) goto L_0x023f
            r4 = 1
            if (r2 == r4) goto L_0x023c
            r4 = 2
            if (r2 == r4) goto L_0x0239
            goto L_0x0241
        L_0x0239:
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.BEVEL
            goto L_0x0241
        L_0x023c:
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            goto L_0x0241
        L_0x023f:
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.MITER
        L_0x0241:
            r15.f4206o = r3
            r2 = 10
            float r3 = r15.f4207p
            java.lang.String r4 = "strokeMiterLimit"
            boolean r4 = p000.C0806m6.m2447h(r8, r4)
            if (r4 != 0) goto L_0x0250
            goto L_0x0254
        L_0x0250:
            float r3 = r13.getFloat(r2, r3)
        L_0x0254:
            r15.f4207p = r3
            r16 = 3
            r17 = 0
            java.lang.String r5 = "strokeColor"
            r2 = r13
            r3 = r28
            r4 = r30
            r18 = -1
            r6 = r16
            r16 = 9
            r7 = r17
            f6 r2 = p000.C0806m6.m2442c(r2, r3, r4, r5, r6, r7)
            r15.f4197f = r2
            r2 = 11
            float r3 = r15.f4200i
            java.lang.String r4 = "strokeAlpha"
            boolean r4 = p000.C0806m6.m2447h(r8, r4)
            if (r4 != 0) goto L_0x027c
            goto L_0x0280
        L_0x027c:
            float r3 = r13.getFloat(r2, r3)
        L_0x0280:
            r15.f4200i = r3
            float r2 = r15.f4198g
            java.lang.String r3 = "strokeWidth"
            boolean r3 = p000.C0806m6.m2447h(r8, r3)
            if (r3 != 0) goto L_0x028d
            goto L_0x0292
        L_0x028d:
            r3 = 4
            float r2 = r13.getFloat(r3, r2)
        L_0x0292:
            r15.f4198g = r2
            float r2 = r15.f4203l
            java.lang.String r3 = "trimPathEnd"
            boolean r3 = p000.C0806m6.m2447h(r8, r3)
            if (r3 != 0) goto L_0x029f
            goto L_0x02a4
        L_0x029f:
            r3 = 6
            float r2 = r13.getFloat(r3, r2)
        L_0x02a4:
            r15.f4203l = r2
            float r2 = r15.f4204m
            java.lang.String r3 = "trimPathOffset"
            boolean r3 = p000.C0806m6.m2447h(r8, r3)
            if (r3 != 0) goto L_0x02b1
            goto L_0x02b6
        L_0x02b1:
            r3 = 7
            float r2 = r13.getFloat(r3, r2)
        L_0x02b6:
            r15.f4204m = r2
            float r2 = r15.f4202k
            java.lang.String r3 = "trimPathStart"
            boolean r3 = p000.C0806m6.m2447h(r8, r3)
            if (r3 != 0) goto L_0x02c3
            goto L_0x02c8
        L_0x02c3:
            r3 = 5
            float r2 = r13.getFloat(r3, r2)
        L_0x02c8:
            r15.f4202k = r2
            r2 = 13
            int r3 = r15.f4223c
            boolean r4 = p000.C0806m6.m2447h(r8, r14)
            if (r4 != 0) goto L_0x02d5
            goto L_0x02d9
        L_0x02d5:
            int r3 = r13.getInt(r2, r3)
        L_0x02d9:
            r15.f4223c = r3
        L_0x02db:
            r13.recycle()
            java.util.ArrayList<sf$e> r2 = r12.f4209b
            r2.add(r15)
            java.lang.String r2 = r15.getPathName()
            r3 = r23
            if (r2 == 0) goto L_0x02f4
            c4<java.lang.String, java.lang.Object> r2 = r3.f4241p
            java.lang.String r4 = r15.getPathName()
            r2.put(r4, r15)
        L_0x02f4:
            r4 = r24
            int r2 = r4.f4242a
            int r5 = r15.f4224d
            r2 = r2 | r5
            r4.f4242a = r2
            r5 = r22
            r0 = 3
            r6 = 0
            r13 = 5
            r14 = 1
            r15 = 2
            r20 = 0
            goto L_0x0431
        L_0x0308:
            r22 = r3
            r3 = r4
            r4 = r5
            r21 = r13
            r0 = 8
            r16 = 9
            r18 = -1
            java.lang.String r5 = "clip-path"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0375
            sf$b r2 = new sf$b
            r2.<init>()
            boolean r5 = p000.C0806m6.m2447h(r8, r12)
            if (r5 != 0) goto L_0x0328
            goto L_0x0358
        L_0x0328:
            int[] r5 = p000.C0829mf.f3276d
            android.content.res.TypedArray r5 = p000.C0806m6.m2449j(r1, r10, r9, r5)
            r6 = 0
            java.lang.String r12 = r5.getString(r6)
            if (r12 == 0) goto L_0x0337
            r2.f4222b = r12
        L_0x0337:
            r6 = 1
            java.lang.String r12 = r5.getString(r6)
            if (r12 == 0) goto L_0x0344
            p6[] r6 = p000.C1344x5.m3770o(r12)
            r2.f4221a = r6
        L_0x0344:
            boolean r6 = p000.C0806m6.m2447h(r8, r14)
            if (r6 != 0) goto L_0x034c
            r12 = 0
            goto L_0x0353
        L_0x034c:
            r6 = 0
            r12 = 2
            int r13 = r5.getInt(r12, r6)
            r12 = r13
        L_0x0353:
            r2.f4223c = r12
            r5.recycle()
        L_0x0358:
            java.util.ArrayList<sf$e> r5 = r7.f4209b
            r5.add(r2)
            java.lang.String r5 = r2.getPathName()
            if (r5 == 0) goto L_0x036c
            c4<java.lang.String, java.lang.Object> r5 = r3.f4241p
            java.lang.String r6 = r2.getPathName()
            r5.put(r6, r2)
        L_0x036c:
            int r5 = r4.f4242a
            int r2 = r2.f4224d
            r2 = r2 | r5
            r4.f4242a = r2
            goto L_0x042a
        L_0x0375:
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x042a
            sf$d r2 = new sf$d
            r2.<init>()
            int[] r5 = p000.C0829mf.f3274b
            android.content.res.TypedArray r5 = p000.C0806m6.m2449j(r1, r10, r9, r5)
            r12 = 0
            r2.f4219l = r12
            float r6 = r2.f4210c
            java.lang.String r13 = "rotation"
            boolean r13 = p000.C0806m6.m2447h(r8, r13)
            if (r13 != 0) goto L_0x0395
            r13 = 5
            goto L_0x039a
        L_0x0395:
            r13 = 5
            float r6 = r5.getFloat(r13, r6)
        L_0x039a:
            r2.f4210c = r6
            float r6 = r2.f4211d
            r14 = 1
            float r6 = r5.getFloat(r14, r6)
            r2.f4211d = r6
            float r6 = r2.f4212e
            r15 = 2
            float r6 = r5.getFloat(r15, r6)
            r2.f4212e = r6
            float r6 = r2.f4213f
            java.lang.String r0 = "scaleX"
            boolean r0 = p000.C0806m6.m2447h(r8, r0)
            if (r0 != 0) goto L_0x03ba
            r0 = 3
            goto L_0x03bf
        L_0x03ba:
            r0 = 3
            float r6 = r5.getFloat(r0, r6)
        L_0x03bf:
            r2.f4213f = r6
            float r6 = r2.f4214g
            java.lang.String r12 = "scaleY"
            boolean r12 = p000.C0806m6.m2447h(r8, r12)
            if (r12 != 0) goto L_0x03cd
            r12 = 4
            goto L_0x03d2
        L_0x03cd:
            r12 = 4
            float r6 = r5.getFloat(r12, r6)
        L_0x03d2:
            r2.f4214g = r6
            float r6 = r2.f4215h
            java.lang.String r12 = "translateX"
            boolean r12 = p000.C0806m6.m2447h(r8, r12)
            if (r12 != 0) goto L_0x03e0
            r12 = 6
            goto L_0x03e5
        L_0x03e0:
            r12 = 6
            float r6 = r5.getFloat(r12, r6)
        L_0x03e5:
            r2.f4215h = r6
            float r6 = r2.f4216i
            java.lang.String r12 = "translateY"
            boolean r12 = p000.C0806m6.m2447h(r8, r12)
            if (r12 != 0) goto L_0x03f3
            r12 = 7
            goto L_0x03f8
        L_0x03f3:
            r12 = 7
            float r6 = r5.getFloat(r12, r6)
        L_0x03f8:
            r2.f4216i = r6
            r6 = 0
            java.lang.String r12 = r5.getString(r6)
            if (r12 == 0) goto L_0x0403
            r2.f4220m = r12
        L_0x0403:
            r2.mo4476c()
            r5.recycle()
            java.util.ArrayList<sf$e> r5 = r7.f4209b
            r5.add(r2)
            r5 = r22
            r5.push(r2)
            java.lang.String r7 = r2.getGroupName()
            if (r7 == 0) goto L_0x0422
            c4<java.lang.String, java.lang.Object> r7 = r3.f4241p
            java.lang.String r12 = r2.getGroupName()
            r7.put(r12, r2)
        L_0x0422:
            int r7 = r4.f4242a
            int r2 = r2.f4218k
            r2 = r2 | r7
            r4.f4242a = r2
            goto L_0x0431
        L_0x042a:
            r5 = r22
            r0 = 3
            r6 = 0
            r13 = 5
            r14 = 1
            r15 = 2
        L_0x0431:
            r7 = 0
            goto L_0x0452
        L_0x0433:
            r21 = r13
            r0 = 3
            r7 = 0
            r13 = 5
            r15 = 2
            r16 = 9
            r18 = -1
            r25 = r5
            r5 = r3
            r3 = r4
            r4 = r25
            if (r2 != r0) goto L_0x0452
            java.lang.String r2 = r28.getName()
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0452
            r5.pop()
        L_0x0452:
            int r2 = r28.next()
            r6 = 8
            r7 = 3
            r12 = 0
            r15 = 4
            r0 = r26
            r13 = r21
            r25 = r4
            r4 = r3
            r3 = r5
            r5 = r25
            goto L_0x015e
        L_0x0467:
            if (r20 != 0) goto L_0x0476
            android.content.res.ColorStateList r0 = r11.f4244c
            android.graphics.PorterDuff$Mode r1 = r11.f4245d
            r3 = r26
            android.graphics.PorterDuffColorFilter r0 = r3.mo4433b(r0, r1)
            r3.f4189d = r0
            return
        L_0x0476:
            r3 = r26
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x0480:
            r3 = r0
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<vector> tag requires height > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x049c:
            r3 = r0
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<vector> tag requires width > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04b8:
            r3 = r0
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<vector> tag requires viewportHeight > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04d4:
            r3 = r0
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = "<vector> tag requires viewportWidth > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x04f1
        L_0x04f0:
            throw r0
        L_0x04f1:
            goto L_0x04f0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1110sf.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3957b;
        return drawable != null ? C1344x5.m3725G(drawable) : this.f4188c.f4246e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f4188c.f4244c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f4188c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3957b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            sf$h r0 = r1.f4188c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo4501a()
            if (r0 != 0) goto L_0x0028
            sf$h r0 = r1.f4188c
            android.content.res.ColorStateList r0 = r0.f4244c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1110sf.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4191f && super.mutate() == this) {
            this.f4188c = new C1118h(this.f4188c);
            this.f4191f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1118h hVar = this.f4188c;
        ColorStateList colorStateList = hVar.f4244c;
        if (!(colorStateList == null || (mode = hVar.f4245d) == null)) {
            this.f4189d = mo4433b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.mo4501a()) {
            boolean b = hVar.f4243b.f4233h.mo4459b(iArr);
            hVar.f4252k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4188c.f4243b.getRootAlpha() != i) {
            this.f4188c.f4243b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3734P(drawable, z);
        } else {
            this.f4188c.f4246e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4190e = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3750c0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3752d0(drawable, colorStateList);
            return;
        }
        C1118h hVar = this.f4188c;
        if (hVar.f4244c != colorStateList) {
            hVar.f4244c = colorStateList;
            this.f4189d = mo4433b(colorStateList, hVar.f4245d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3754e0(drawable, mode);
            return;
        }
        C1118h hVar = this.f4188c;
        if (hVar.f4245d != mode) {
            hVar.f4245d = mode;
            this.f4189d = mo4433b(hVar.f4244c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
