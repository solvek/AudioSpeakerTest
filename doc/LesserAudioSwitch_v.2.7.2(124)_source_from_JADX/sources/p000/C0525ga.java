package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: ga */
public class C0525ga implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final C0614ia f2273b;

    public C0525ga(C0614ia iaVar) {
        this.f2273b = iaVar;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (C0262ca.class.getName().equals(str)) {
            return new C0262ca(context, attributeSet, this.f2273b);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1008q9.f3782a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            C0663j4<String, Class<?>> j4Var = C0412ea.f1985a;
            try {
                z = Fragment.class.isAssignableFrom(C0412ea.m1562b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    fragment = this.f2273b.mo3198G(resourceId);
                }
                if (fragment == null && string != null) {
                    fragment = this.f2273b.mo3199H(string);
                }
                if (fragment == null && i != -1) {
                    fragment = this.f2273b.mo3198G(i);
                }
                if (C0614ia.m1934M(2)) {
                    StringBuilder c = C0279ch.m1106c("onCreateView: id=0x");
                    c.append(Integer.toHexString(resourceId));
                    c.append(" fname=");
                    c.append(attributeValue);
                    c.append(" existing=");
                    c.append(fragment);
                    c.toString();
                }
                if (fragment == null) {
                    fragment = this.f2273b.mo3202K().mo2719a(context.getClassLoader(), attributeValue);
                    fragment.f705m = true;
                    fragment.f714v = resourceId != 0 ? resourceId : i;
                    fragment.f715w = i;
                    fragment.f716x = string;
                    fragment.f706n = true;
                    C0614ia iaVar = this.f2273b;
                    fragment.f710r = iaVar;
                    C0459fa<?> faVar = iaVar.f2653n;
                    fragment.f711s = faVar;
                    Context context2 = faVar.f2101c;
                    fragment.mo843U(attributeSet, fragment.f695c);
                    this.f2273b.mo3219b(fragment);
                    C0614ia iaVar2 = this.f2273b;
                    iaVar2.mo3210T(fragment, iaVar2.f2652m);
                } else if (!fragment.f706n) {
                    fragment.f706n = true;
                    C0459fa<?> faVar2 = this.f2273b.f2653n;
                    fragment.f711s = faVar2;
                    Context context3 = faVar2.f2101c;
                    fragment.mo843U(attributeSet, fragment.f695c);
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                C0614ia iaVar3 = this.f2273b;
                int i2 = iaVar3.f2652m;
                if (i2 >= 1 || !fragment.f705m) {
                    iaVar3.mo3210T(fragment, i2);
                } else {
                    iaVar3.mo3210T(fragment, 1);
                }
                View view2 = fragment.f680E;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.f680E.getTag() == null) {
                        fragment.f680E.setTag(string);
                    }
                    return fragment.f680E;
                }
                throw new IllegalStateException(C0279ch.m1121r("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
