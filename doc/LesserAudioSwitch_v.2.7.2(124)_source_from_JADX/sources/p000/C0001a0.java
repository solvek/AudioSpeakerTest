package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a0 */
public class C0001a0 {

    /* renamed from: b */
    public static final Class<?>[] f0b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f1c = {16843375};

    /* renamed from: d */
    public static final String[] f2d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    public static final C0663j4<String, Constructor<? extends View>> f3e = new C0663j4<>();

    /* renamed from: a */
    public final Object[] f4a = new Object[2];

    /* renamed from: a0$a */
    public static class C0002a implements View.OnClickListener {

        /* renamed from: b */
        public final View f5b;

        /* renamed from: c */
        public final String f6c;

        /* renamed from: d */
        public Method f7d;

        /* renamed from: e */
        public Context f8e;

        public C0002a(View view, String str) {
            this.f5b = view;
            this.f6c = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f7d == null) {
                for (Context context = this.f5b.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f6c, new Class[]{View.class})) != null) {
                            this.f7d = method;
                            this.f8e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.f5b.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder c = C0279ch.m1106c(" with id '");
                    c.append(this.f5b.getContext().getResources().getResourceEntryName(id));
                    c.append("'");
                    str = c.toString();
                }
                StringBuilder c2 = C0279ch.m1106c("Could not find method ");
                c2.append(this.f6c);
                c2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                c2.append(this.f5b.getClass());
                c2.append(str);
                throw new IllegalStateException(c2.toString());
            }
            try {
                this.f7d.invoke(this.f8e, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    public C0950p1 mo1a(Context context, AttributeSet attributeSet) {
        return new C0950p1(context, attributeSet);
    }

    /* renamed from: b */
    public C1038r1 mo2b(Context context, AttributeSet attributeSet) {
        return new C1038r1(context, attributeSet);
    }

    /* renamed from: c */
    public C1094s1 mo3c(Context context, AttributeSet attributeSet) {
        return new C1094s1(context, attributeSet);
    }

    /* renamed from: d */
    public C0205b2 mo4d(Context context, AttributeSet attributeSet) {
        return new C0205b2(context, attributeSet, R.attr.radioButtonStyle);
    }

    /* renamed from: e */
    public C0660j2 mo5e(Context context, AttributeSet attributeSet) {
        return new C0660j2(context, attributeSet);
    }

    /* renamed from: f */
    public View mo6f() {
        return null;
    }

    /* renamed from: g */
    public final View mo7g(Context context, String str, String str2) {
        String str3;
        C0663j4<String, Constructor<? extends View>> j4Var = f3e;
        Constructor<? extends U> orDefault = j4Var.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f0b);
            j4Var.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f4a);
    }

    /* renamed from: h */
    public final void mo8h(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
