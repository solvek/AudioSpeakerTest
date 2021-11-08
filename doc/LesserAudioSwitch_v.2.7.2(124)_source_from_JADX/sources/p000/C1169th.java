package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: th */
public class C1169th {

    /* renamed from: a */
    public long f4440a = 0;

    /* renamed from: b */
    public long f4441b = 300;

    /* renamed from: c */
    public TimeInterpolator f4442c = null;

    /* renamed from: d */
    public int f4443d = 0;

    /* renamed from: e */
    public int f4444e = 1;

    public C1169th(long j, long j2) {
        this.f4440a = j;
        this.f4441b = j2;
    }

    public C1169th(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f4440a = j;
        this.f4441b = j2;
        this.f4442c = timeInterpolator;
    }

    /* renamed from: a */
    public void mo4669a(Animator animator) {
        animator.setStartDelay(this.f4440a);
        animator.setDuration(this.f4441b);
        animator.setInterpolator(mo4670b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4443d);
            valueAnimator.setRepeatMode(this.f4444e);
        }
    }

    /* renamed from: b */
    public TimeInterpolator mo4670b() {
        TimeInterpolator timeInterpolator = this.f4442c;
        return timeInterpolator != null ? timeInterpolator : C0831mh.f3287b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169th)) {
            return false;
        }
        C1169th thVar = (C1169th) obj;
        if (this.f4440a == thVar.f4440a && this.f4441b == thVar.f4441b && this.f4443d == thVar.f4443d && this.f4444e == thVar.f4444e) {
            return mo4670b().getClass().equals(thVar.mo4670b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4440a;
        long j2 = this.f4441b;
        return ((((mo4670b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.f4443d) * 31) + this.f4444e;
    }

    public String toString() {
        return 10 + C1169th.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4440a + " duration: " + this.f4441b + " interpolator: " + mo4670b().getClass() + " repeatCount: " + this.f4443d + " repeatMode: " + this.f4444e + "}\n";
    }
}
