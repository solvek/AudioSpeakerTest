package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: aa */
public class C0016aa extends AnimationSet implements Runnable {

    /* renamed from: b */
    public final ViewGroup f84b;

    /* renamed from: c */
    public final View f85c;

    /* renamed from: d */
    public boolean f86d;

    /* renamed from: e */
    public boolean f87e;

    /* renamed from: f */
    public boolean f88f = true;

    public C0016aa(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f84b = viewGroup;
        this.f85c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public boolean getTransformation(long j, Transformation transformation) {
        this.f88f = true;
        if (this.f86d) {
            return !this.f87e;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f86d = true;
            C0717k8.m2248a(this.f84b, this);
        }
        return true;
    }

    public boolean getTransformation(long j, Transformation transformation, float f) {
        this.f88f = true;
        if (this.f86d) {
            return !this.f87e;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f86d = true;
            C0717k8.m2248a(this.f84b, this);
        }
        return true;
    }

    public void run() {
        if (this.f86d || !this.f88f) {
            this.f84b.endViewTransition(this.f85c);
            this.f87e = true;
            return;
        }
        this.f88f = false;
        this.f84b.post(this);
    }
}
