package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C1173tk;

/* renamed from: ik */
public class C0634ik {

    /* renamed from: A */
    public static final int[] f2717A = {16842919, 16842910};

    /* renamed from: B */
    public static final int[] f2718B = {16843623, 16842908, 16842910};

    /* renamed from: C */
    public static final int[] f2719C = {16842908, 16842910};

    /* renamed from: D */
    public static final int[] f2720D = {16843623, 16842910};

    /* renamed from: E */
    public static final int[] f2721E = {16842910};

    /* renamed from: F */
    public static final int[] f2722F = new int[0];

    /* renamed from: z */
    public static final TimeInterpolator f2723z = C0831mh.f3288c;

    /* renamed from: a */
    public C1217ul f2724a;

    /* renamed from: b */
    public boolean f2725b;

    /* renamed from: c */
    public boolean f2726c = true;

    /* renamed from: d */
    public float f2727d;

    /* renamed from: e */
    public float f2728e;

    /* renamed from: f */
    public float f2729f;

    /* renamed from: g */
    public final C1173tk f2730g;

    /* renamed from: h */
    public C1121sh f2731h;

    /* renamed from: i */
    public C1121sh f2732i;

    /* renamed from: j */
    public Animator f2733j;

    /* renamed from: k */
    public C1121sh f2734k;

    /* renamed from: l */
    public C1121sh f2735l;

    /* renamed from: m */
    public float f2736m;

    /* renamed from: n */
    public float f2737n = 1.0f;

    /* renamed from: o */
    public int f2738o = 0;

    /* renamed from: p */
    public ArrayList<Animator.AnimatorListener> f2739p;

    /* renamed from: q */
    public ArrayList<Animator.AnimatorListener> f2740q;

    /* renamed from: r */
    public ArrayList<C0639e> f2741r;

    /* renamed from: s */
    public final FloatingActionButton f2742s;

    /* renamed from: t */
    public final C0732kl f2743t;

    /* renamed from: u */
    public final Rect f2744u = new Rect();

    /* renamed from: v */
    public final RectF f2745v = new RectF();

    /* renamed from: w */
    public final RectF f2746w = new RectF();

    /* renamed from: x */
    public final Matrix f2747x = new Matrix();

    /* renamed from: y */
    public ViewTreeObserver.OnPreDrawListener f2748y;

    /* renamed from: ik$a */
    public class C0635a extends C1062rh {
        public C0635a() {
        }

        public Object evaluate(float f, Object obj, Object obj2) {
            C0634ik.this.f2737n = f;
            ((Matrix) obj).getValues(this.f3960a);
            ((Matrix) obj2).getValues(this.f3961b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f3961b;
                float f2 = fArr[i];
                float[] fArr2 = this.f3960a;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f3962c.setValues(this.f3961b);
            return this.f3962c;
        }
    }

    /* renamed from: ik$b */
    public class C0636b extends C0642h {
        public C0636b(C0634ik ikVar) {
            super((C0540gk) null);
        }

        /* renamed from: a */
        public float mo3299a() {
            return 0.0f;
        }
    }

    /* renamed from: ik$c */
    public class C0637c extends C0642h {
        public C0637c() {
            super((C0540gk) null);
        }

        /* renamed from: a */
        public float mo3299a() {
            C0634ik ikVar = C0634ik.this;
            return ikVar.f2727d + ikVar.f2728e;
        }
    }

    /* renamed from: ik$d */
    public class C0638d extends C0642h {
        public C0638d() {
            super((C0540gk) null);
        }

        /* renamed from: a */
        public float mo3299a() {
            C0634ik ikVar = C0634ik.this;
            return ikVar.f2727d + ikVar.f2729f;
        }
    }

    /* renamed from: ik$e */
    public interface C0639e {
        /* renamed from: a */
        void mo2285a();

        /* renamed from: b */
        void mo2286b();
    }

    /* renamed from: ik$f */
    public interface C0640f {
    }

    /* renamed from: ik$g */
    public class C0641g extends C0642h {
        public C0641g() {
            super((C0540gk) null);
        }

        /* renamed from: a */
        public float mo3299a() {
            return C0634ik.this.f2727d;
        }
    }

    /* renamed from: ik$h */
    public abstract class C0642h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f2753a;

        /* renamed from: b */
        public float f2754b;

        public C0642h(C0540gk gkVar) {
        }

        /* renamed from: a */
        public abstract float mo3299a();

        public void onAnimationEnd(Animator animator) {
            C0634ik.this.getClass();
            this.f2753a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f2753a) {
                C0634ik.this.getClass();
                this.f2754b = mo3299a();
                this.f2753a = true;
            }
            C0634ik ikVar = C0634ik.this;
            valueAnimator.getAnimatedFraction();
            ikVar.getClass();
        }
    }

    public C0634ik(FloatingActionButton floatingActionButton, C0732kl klVar) {
        this.f2742s = floatingActionButton;
        this.f2743t = klVar;
        C1173tk tkVar = new C1173tk();
        this.f2730g = tkVar;
        tkVar.mo4730a(f2717A, mo3279b(new C0638d()));
        tkVar.mo4730a(f2718B, mo3279b(new C0637c()));
        tkVar.mo4730a(f2719C, mo3279b(new C0637c()));
        tkVar.mo4730a(f2720D, mo3279b(new C0637c()));
        tkVar.mo4730a(f2721E, mo3279b(new C0641g()));
        tkVar.mo4730a(f2722F, mo3279b(new C0636b(this)));
        this.f2736m = floatingActionButton.getRotation();
    }

    /* renamed from: a */
    public final AnimatorSet mo3278a(C1121sh shVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f2742s, View.ALPHA, new float[]{f});
        shVar.mo4512d("opacity").mo4669a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f2742s, View.SCALE_X, new float[]{f2});
        shVar.mo4512d("scale").mo4669a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C0687jk(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f2742s, View.SCALE_Y, new float[]{f2});
        shVar.mo4512d("scale").mo4669a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C0687jk(this));
        }
        arrayList.add(ofFloat3);
        this.f2747x.reset();
        this.f2742s.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f2742s, new C1019qh(), new C0635a(), new Matrix[]{new Matrix(this.f2747x)});
        shVar.mo4512d("iconScale").mo4669a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0728kh.m2310z(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: b */
    public final ValueAnimator mo3279b(C0642h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f2723z);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: c */
    public float mo3280c() {
        return this.f2727d;
    }

    /* renamed from: d */
    public void mo3281d(Rect rect) {
        int i = 0;
        if (this.f2725b) {
            i = (0 - this.f2742s.getSizeDimension()) / 2;
        }
        float c = this.f2726c ? mo3280c() + this.f2729f : 0.0f;
        int max = Math.max(i, (int) Math.ceil((double) c));
        int max2 = Math.max(i, (int) Math.ceil((double) (c * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: e */
    public boolean mo3282e() {
        return this.f2742s.getVisibility() == 0 ? this.f2738o == 1 : this.f2738o != 2;
    }

    /* renamed from: f */
    public boolean mo3283f() {
        return this.f2742s.getVisibility() != 0 ? this.f2738o == 2 : this.f2738o != 1;
    }

    /* renamed from: g */
    public void mo3284g() {
        C1173tk tkVar = this.f2730g;
        ValueAnimator valueAnimator = tkVar.f4512c;
        if (valueAnimator != null) {
            valueAnimator.end();
            tkVar.f4512c = null;
        }
    }

    /* renamed from: h */
    public void mo3285h() {
    }

    /* renamed from: i */
    public void mo3286i(int[] iArr) {
        C1173tk.C1175b bVar;
        ValueAnimator valueAnimator;
        C1173tk tkVar = this.f2730g;
        int size = tkVar.f4510a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = tkVar.f4510a.get(i);
            if (StateSet.stateSetMatches(bVar.f4515a, iArr)) {
                break;
            }
            i++;
        }
        C1173tk.C1175b bVar2 = tkVar.f4511b;
        if (bVar != bVar2) {
            if (!(bVar2 == null || (valueAnimator = tkVar.f4512c) == null)) {
                valueAnimator.cancel();
                tkVar.f4512c = null;
            }
            tkVar.f4511b = bVar;
            if (bVar != null) {
                ValueAnimator valueAnimator2 = bVar.f4516b;
                tkVar.f4512c = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }

    /* renamed from: j */
    public void mo3287j(float f, float f2, float f3) {
        mo3297t();
        throw null;
    }

    /* renamed from: k */
    public void mo3288k() {
        ArrayList<C0639e> arrayList = this.f2741r;
        if (arrayList != null) {
            Iterator<C0639e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2285a();
            }
        }
    }

    /* renamed from: l */
    public void mo3289l() {
        ArrayList<C0639e> arrayList = this.f2741r;
        if (arrayList != null) {
            Iterator<C0639e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2286b();
            }
        }
    }

    /* renamed from: m */
    public boolean mo3290m() {
        return true;
    }

    /* renamed from: n */
    public final void mo3291n(float f) {
        this.f2737n = f;
        Matrix matrix = this.f2747x;
        matrix.reset();
        this.f2742s.getDrawable();
        this.f2742s.setImageMatrix(matrix);
    }

    /* renamed from: o */
    public void mo3292o(ColorStateList colorStateList) {
    }

    /* renamed from: p */
    public boolean mo3293p() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo3294q() {
        return C0813m8.m2486t(this.f2742s) && !this.f2742s.isInEditMode();
    }

    /* renamed from: r */
    public final boolean mo3295r() {
        return !this.f2725b || this.f2742s.getSizeDimension() >= 0;
    }

    /* renamed from: s */
    public void mo3296s() {
        int i;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f2736m % 90.0f != 0.0f) {
                i = 1;
                if (this.f2742s.getLayerType() != 1) {
                    floatingActionButton = this.f2742s;
                } else {
                    return;
                }
            } else if (this.f2742s.getLayerType() != 0) {
                floatingActionButton = this.f2742s;
                i = 0;
            } else {
                return;
            }
            floatingActionButton.setLayerType(i, (Paint) null);
        }
    }

    /* renamed from: t */
    public final void mo3297t() {
        Rect rect = this.f2744u;
        mo3281d(rect);
        C1344x5.m3755f(null, "Didn't initialize content background");
        if (mo3293p()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.C0320b bVar = (FloatingActionButton.C0320b) this.f2743t;
            bVar.getClass();
            C0634ik.super.setBackgroundDrawable(insetDrawable);
        } else {
            ((FloatingActionButton.C0320b) this.f2743t).getClass();
        }
        C0732kl klVar = this.f2743t;
        int i = rect.left;
        FloatingActionButton.this.getClass();
        throw null;
    }
}
