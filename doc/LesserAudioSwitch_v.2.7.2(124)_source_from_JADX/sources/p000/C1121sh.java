package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sh */
public class C1121sh {

    /* renamed from: a */
    public final C0663j4<String, C1169th> f4258a = new C0663j4<>();

    /* renamed from: b */
    public final C0663j4<String, PropertyValuesHolder[]> f4259b = new C0663j4<>();

    /* renamed from: a */
    public static C1121sh m3185a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m3186b(context, resourceId);
    }

    /* renamed from: b */
    public static C1121sh m3186b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m3187c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m3187c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: c */
    public static C1121sh m3187c(List<Animator> list) {
        C1121sh shVar = new C1121sh();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                shVar.f4259b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C0831mh.f3287b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C0831mh.f3288c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C0831mh.f3289d;
                }
                C1169th thVar = new C1169th(startDelay, duration, interpolator);
                thVar.f4443d = objectAnimator.getRepeatCount();
                thVar.f4444e = objectAnimator.getRepeatMode();
                shVar.f4258a.put(propertyName, thVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return shVar;
    }

    /* renamed from: d */
    public C1169th mo4512d(String str) {
        if (this.f4258a.getOrDefault(str, null) != null) {
            return this.f4258a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1121sh)) {
            return false;
        }
        return this.f4258a.equals(((C1121sh) obj).f4258a);
    }

    public int hashCode() {
        return this.f4258a.hashCode();
    }

    public String toString() {
        return 10 + C1121sh.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4258a + "}\n";
    }
}
