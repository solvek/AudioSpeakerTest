package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: lk */
public class C0784lk extends C0634ik {
    public C0784lk(FloatingActionButton floatingActionButton, C0732kl klVar) {
        super(floatingActionButton, klVar);
    }

    /* renamed from: c */
    public float mo3280c() {
        return this.f2742s.getElevation();
    }

    /* renamed from: d */
    public void mo3281d(Rect rect) {
        if (FloatingActionButton.this.f1593k) {
            super.mo3281d(rect);
            return;
        }
        int i = 0;
        if (!mo3295r()) {
            i = (0 - this.f2742s.getSizeDimension()) / 2;
        }
        rect.set(i, i, i, i);
    }

    /* renamed from: g */
    public void mo3284g() {
    }

    /* renamed from: h */
    public void mo3285h() {
        mo3297t();
        throw null;
    }

    /* renamed from: i */
    public void mo3286i(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f2742s.isEnabled()) {
                this.f2742s.setElevation(this.f2727d);
                if (this.f2742s.isPressed()) {
                    floatingActionButton = this.f2742s;
                    f = this.f2729f;
                } else if (this.f2742s.isFocused() || this.f2742s.isHovered()) {
                    floatingActionButton = this.f2742s;
                    f = this.f2728e;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f2742s.setElevation(0.0f);
            floatingActionButton = this.f2742s;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* renamed from: j */
    public void mo3287j(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f2742s.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C0634ik.f2717A, mo3634u(f, f3));
            stateListAnimator.addState(C0634ik.f2718B, mo3634u(f, f2));
            stateListAnimator.addState(C0634ik.f2719C, mo3634u(f, f2));
            stateListAnimator.addState(C0634ik.f2720D, mo3634u(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f2742s, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f2742s;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f2742s, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C0634ik.f2723z);
            stateListAnimator.addState(C0634ik.f2721E, animatorSet);
            stateListAnimator.addState(C0634ik.f2722F, mo3634u(0.0f, 0.0f));
            this.f2742s.setStateListAnimator(stateListAnimator);
        }
        if (mo3293p()) {
            mo3297t();
            throw null;
        }
    }

    /* renamed from: m */
    public boolean mo3290m() {
        return false;
    }

    /* renamed from: o */
    public void mo3292o(ColorStateList colorStateList) {
    }

    /* renamed from: p */
    public boolean mo3293p() {
        return FloatingActionButton.this.f1593k || !mo3295r();
    }

    /* renamed from: s */
    public void mo3296s() {
    }

    /* renamed from: u */
    public final Animator mo3634u(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f2742s, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f2742s, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C0634ik.f2723z);
        return animatorSet;
    }
}
