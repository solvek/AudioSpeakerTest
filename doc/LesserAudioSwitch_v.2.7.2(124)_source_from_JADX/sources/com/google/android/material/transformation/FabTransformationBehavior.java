package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;
import p000.C1366xi;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f1722c = new Rect();

    /* renamed from: d */
    public final RectF f1723d = new RectF();

    /* renamed from: e */
    public final RectF f1724e = new RectF();

    /* renamed from: f */
    public final int[] f1725f = new int[2];

    /* renamed from: g */
    public float f1726g;

    /* renamed from: h */
    public float f1727h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C0336a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f1728a;

        /* renamed from: b */
        public final /* synthetic */ View f1729b;

        /* renamed from: c */
        public final /* synthetic */ View f1730c;

        public C0336a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f1728a = z;
            this.f1729b = view;
            this.f1730c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1728a) {
                this.f1729b.setVisibility(4);
                this.f1730c.setAlpha(1.0f);
                this.f1730c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f1728a) {
                this.f1729b.setVisibility(0);
                this.f1730c.setAlpha(0.0f);
                this.f1730c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C0337b {

        /* renamed from: a */
        public C1121sh f1731a;

        /* renamed from: b */
        public C1211uh f1732b;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: D */
    public AnimatorSet mo2516D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList;
        C1366xi xiVar;
        ArrayList arrayList2;
        Animator animator;
        C1169th thVar;
        ObjectAnimator objectAnimator;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C0337b O = mo2528O(view2.getContext(), z3);
        if (z3) {
            this.f1726g = view.getTranslationX();
            this.f1727h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            mo2525L(view, view2, z, z2, O, arrayList3);
        }
        RectF rectF = this.f1723d;
        RectF rectF2 = rectF;
        mo2527N(view, view2, z, z2, O, arrayList3, rectF);
        float width = rectF2.width();
        float height = rectF2.height();
        float F = mo2519F(view3, view4, O.f1732b);
        float G = mo2520G(view3, view4, O.f1732b);
        Pair<C1169th, C1169th> E = mo2518E(F, G, z3, O);
        C1169th thVar2 = (C1169th) E.first;
        C1169th thVar3 = (C1169th) E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z3) {
            F = this.f1726g;
        }
        fArr[0] = F;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z3) {
            G = this.f1727h;
        }
        fArr2[0] = G;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, property2, fArr2);
        thVar2.mo4669a(ofFloat);
        thVar3.mo4669a(ofFloat2);
        arrayList3.add(ofFloat);
        arrayList3.add(ofFloat2);
        boolean z4 = view4 instanceof C1366xi;
        if (z4 && (view3 instanceof ImageView)) {
            C1366xi xiVar2 = (C1366xi) view4;
            Drawable drawable = ((ImageView) view3).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z3) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0978ph.f3641b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0978ph.f3641b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C1423ym(this, view4));
                O.f1731a.mo4512d("iconFade").mo4669a(objectAnimator);
                arrayList3.add(objectAnimator);
                arrayList4.add(new C1466zm(this, xiVar2, drawable));
            }
        }
        if (!z4) {
            arrayList = arrayList4;
        } else {
            C1366xi xiVar3 = (C1366xi) view4;
            C1211uh uhVar = O.f1732b;
            RectF rectF3 = this.f1723d;
            RectF rectF4 = this.f1724e;
            mo2522I(view3, rectF3);
            rectF3.offset(this.f1726g, this.f1727h);
            mo2522I(view4, rectF4);
            rectF4.offset(-mo2519F(view3, view4, uhVar), 0.0f);
            float centerX = rectF3.centerX() - rectF4.left;
            C1211uh uhVar2 = O.f1732b;
            RectF rectF5 = this.f1723d;
            RectF rectF6 = this.f1724e;
            mo2522I(view3, rectF5);
            rectF5.offset(this.f1726g, this.f1727h);
            mo2522I(view4, rectF6);
            rectF6.offset(0.0f, -mo2520G(view3, view4, uhVar2));
            float centerY = rectF5.centerY() - rectF6.top;
            ((FloatingActionButton) view3).mo2218g(this.f1722c);
            float width2 = ((float) this.f1722c.width()) / 2.0f;
            C1169th d = O.f1731a.mo4512d("expansion");
            if (z3) {
                if (!z2) {
                    xiVar3.setRevealInfo(new C1366xi.C1371e(centerX, centerY, width2));
                }
                if (z2) {
                    width2 = xiVar3.getRevealInfo().f5088c;
                }
                float f = C0728kh.m2290f(centerX, centerY, 0.0f, 0.0f);
                float f2 = C0728kh.m2290f(centerX, centerY, width, 0.0f);
                float f3 = C0728kh.m2290f(centerX, centerY, width, height);
                float f4 = C0728kh.m2290f(centerX, centerY, 0.0f, height);
                if (f <= f2 || f <= f3 || f <= f4) {
                    f = (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2;
                }
                Animator c = C0728kh.m2287c(xiVar3, centerX, centerY, f);
                c.addListener(new C0032an(this, xiVar3));
                animator = c;
                thVar = d;
                mo2526M(view2, d.f4440a, (int) centerX, (int) centerY, width2, arrayList3);
                arrayList2 = arrayList4;
                xiVar = xiVar3;
            } else {
                thVar = d;
                float f5 = xiVar3.getRevealInfo().f5088c;
                animator = C0728kh.m2287c(xiVar3, centerX, centerY, width2);
                int i = (int) centerX;
                int i2 = (int) centerY;
                float f6 = width2;
                mo2526M(view2, thVar.f4440a, i, i2, f5, arrayList3);
                long j = thVar.f4440a;
                long j2 = thVar.f4441b;
                C1121sh shVar = O.f1731a;
                int i3 = shVar.f4258a.f2827d;
                long j3 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i3;
                    C1169th k = shVar.f4258a.mo3407k(i4);
                    j3 = Math.max(j3, k.f4440a + k.f4441b);
                    i4++;
                    i3 = i5;
                    arrayList4 = arrayList4;
                    xiVar3 = xiVar3;
                    shVar = shVar;
                }
                arrayList2 = arrayList4;
                xiVar = xiVar3;
                if (Build.VERSION.SDK_INT >= 21) {
                    long j4 = j + j2;
                    if (j4 < j3) {
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view4, i, i2, f6, f6);
                        createCircularReveal.setStartDelay(j4);
                        createCircularReveal.setDuration(j3 - j4);
                        arrayList3.add(createCircularReveal);
                    }
                }
            }
            Animator animator2 = animator;
            thVar.mo4669a(animator2);
            arrayList3.add(animator2);
            arrayList = arrayList2;
            arrayList.add(new C1212ui(xiVar));
        }
        mo2524K(view, view2, z, z2, O, arrayList3);
        mo2523J(view2, z, z2, O, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        C0728kh.m2310z(animatorSet, arrayList3);
        animatorSet.addListener(new C0336a(this, z, view4, view));
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i6));
        }
        return animatorSet;
    }

    /* renamed from: E */
    public final Pair<C1169th, C1169th> mo2518E(float f, float f2, boolean z, C0337b bVar) {
        String str;
        C1121sh shVar;
        C1169th thVar;
        if (f == 0.0f || f2 == 0.0f) {
            thVar = bVar.f1731a.mo4512d("translationXLinear");
            shVar = bVar.f1731a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            thVar = bVar.f1731a.mo4512d("translationXCurveDownwards");
            shVar = bVar.f1731a;
            str = "translationYCurveDownwards";
        } else {
            thVar = bVar.f1731a.mo4512d("translationXCurveUpwards");
            shVar = bVar.f1731a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(thVar, shVar.mo4512d(str));
    }

    /* renamed from: F */
    public final float mo2519F(View view, View view2, C1211uh uhVar) {
        RectF rectF = this.f1723d;
        RectF rectF2 = this.f1724e;
        mo2522I(view, rectF);
        rectF.offset(this.f1726g, this.f1727h);
        mo2522I(view2, rectF2);
        uhVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: G */
    public final float mo2520G(View view, View view2, C1211uh uhVar) {
        RectF rectF = this.f1723d;
        RectF rectF2 = this.f1724e;
        mo2522I(view, rectF);
        rectF.offset(this.f1726g, this.f1727h);
        mo2522I(view2, rectF2);
        uhVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: H */
    public final float mo2521H(C0337b bVar, C1169th thVar, float f, float f2) {
        long j = thVar.f4440a;
        long j2 = thVar.f4441b;
        C1169th d = bVar.f1731a.mo4512d("expansion");
        float interpolation = thVar.mo4670b().getInterpolation(((float) (((d.f4440a + d.f4441b) + 17) - j)) / ((float) j2));
        TimeInterpolator timeInterpolator = C0831mh.f3286a;
        return ((f2 - f) * interpolation) + f;
    }

    /* renamed from: I */
    public final void mo2522I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f1725f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: J */
    public final void mo2523J(View view, boolean z, boolean z2, C0337b bVar, List list) {
        ViewGroup viewGroup;
        ObjectAnimator objectAnimator;
        if (view instanceof ViewGroup) {
            if (!(view instanceof C1366xi) || C1313wi.f4961a != 0) {
                View findViewById = view.findViewById(R.id.mtrl_child_content_container);
                if (findViewById != null) {
                    viewGroup = mo2529P(findViewById);
                } else {
                    if ((view instanceof C0286cn) || (view instanceof C0229bn)) {
                        view = ((ViewGroup) view).getChildAt(0);
                    }
                    viewGroup = mo2529P(view);
                }
                if (viewGroup != null) {
                    if (z) {
                        if (!z2) {
                            C0929oh.f3501a.set(viewGroup, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(viewGroup, C0929oh.f3501a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(viewGroup, C0929oh.f3501a, new float[]{0.0f});
                    }
                    bVar.f1731a.mo4512d("contentFade").mo4669a(objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo2524K(View view, View view2, boolean z, boolean z2, C0337b bVar, List list) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C1366xi) {
            C1366xi xiVar = (C1366xi) view2;
            ColorStateList g = C0813m8.m2473g(view);
            int colorForState = g != null ? g.getColorForState(view.getDrawableState(), g.getDefaultColor()) : 0;
            int i = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    xiVar.setCircularRevealScrimColor(colorForState);
                }
                objectAnimator = ObjectAnimator.ofInt(xiVar, C1366xi.C1370d.f5085a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(xiVar, C1366xi.C1370d.f5085a, new int[]{colorForState});
            }
            objectAnimator.setEvaluator(C0879nh.f3385a);
            bVar.f1731a.mo4512d("color").mo4669a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    @TargetApi(21)
    /* renamed from: L */
    public final void mo2525L(View view, View view2, boolean z, boolean z2, C0337b bVar, List list) {
        ObjectAnimator objectAnimator;
        float h = C0813m8.m2474h(view2) - C0813m8.m2474h(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-h);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-h});
        }
        bVar.f1731a.mo4512d("elevation").mo4669a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: M */
    public final void mo2526M(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: N */
    public final void mo2527N(View view, View view2, boolean z, boolean z2, C0337b bVar, List list, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float F = mo2519F(view, view2, bVar.f1732b);
        float G = mo2520G(view, view2, bVar.f1732b);
        Pair<C1169th, C1169th> E = mo2518E(F, G, z, bVar);
        C1169th thVar = (C1169th) E.first;
        C1169th thVar2 = (C1169th) E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-F);
                view2.setTranslationY(-G);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f});
            float H = mo2521H(bVar, thVar, -F, 0.0f);
            float H2 = mo2521H(bVar, thVar2, -G, 0.0f);
            Rect rect = this.f1722c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f1723d;
            rectF2.set(rect);
            RectF rectF3 = this.f1724e;
            mo2522I(view2, rectF3);
            rectF3.offset(H, H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{-F});
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{-G});
        }
        thVar.mo4669a(objectAnimator2);
        thVar2.mo4669a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    /* renamed from: O */
    public abstract C0337b mo2528O(Context context, boolean z);

    /* renamed from: P */
    public final ViewGroup mo2529P(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo701d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* renamed from: f */
    public void mo703f(CoordinatorLayout.C0091f fVar) {
        if (fVar.f618h == 0) {
            fVar.f618h = 80;
        }
    }
}
