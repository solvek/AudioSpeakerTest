package p000;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.os.Build;
import android.view.ViewGroup;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: we */
public class C1309we {

    /* renamed from: a */
    public static boolean f4956a = true;

    /* renamed from: a */
    public static C1260ve m3649a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C1208ue(viewGroup) : (C1166te) C1453ze.m3960c(viewGroup);
    }

    /* renamed from: b */
    public static void m3650b(ViewGroup viewGroup, boolean z) {
        LayoutTransition layoutTransition;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
            return;
        }
        boolean z2 = false;
        if (i < 18) {
            if (C1415ye.f5188a == null) {
                C1362xe xeVar = new C1362xe();
                C1415ye.f5188a = xeVar;
                xeVar.setAnimator(2, (Animator) null);
                C1415ye.f5188a.setAnimator(0, (Animator) null);
                C1415ye.f5188a.setAnimator(1, (Animator) null);
                C1415ye.f5188a.setAnimator(3, (Animator) null);
                C1415ye.f5188a.setAnimator(4, (Animator) null);
            }
            if (z) {
                LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
                if (layoutTransition2 != null) {
                    if (layoutTransition2.isRunning()) {
                        if (!C1415ye.f5192e) {
                            try {
                                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                                C1415ye.f5191d = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException unused) {
                            }
                            C1415ye.f5192e = true;
                        }
                        Method method = C1415ye.f5191d;
                        if (method != null) {
                            try {
                                method.invoke(layoutTransition2, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    }
                    if (layoutTransition2 != C1415ye.f5188a) {
                        viewGroup.setTag(R.id.transition_layout_save, layoutTransition2);
                    }
                }
                layoutTransition = C1415ye.f5188a;
            } else {
                viewGroup.setLayoutTransition((LayoutTransition) null);
                if (!C1415ye.f5190c) {
                    try {
                        Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                        C1415ye.f5189b = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    C1415ye.f5190c = true;
                }
                Field field = C1415ye.f5189b;
                if (field != null) {
                    try {
                        boolean z3 = field.getBoolean(viewGroup);
                        if (z3) {
                            try {
                                C1415ye.f5189b.setBoolean(viewGroup, false);
                            } catch (IllegalAccessException unused4) {
                            }
                        }
                        z2 = z3;
                    } catch (IllegalAccessException unused5) {
                    }
                }
                if (z2) {
                    viewGroup.requestLayout();
                }
                layoutTransition = (LayoutTransition) viewGroup.getTag(R.id.transition_layout_save);
                if (layoutTransition != null) {
                    viewGroup.setTag(R.id.transition_layout_save, (Object) null);
                } else {
                    return;
                }
            }
            viewGroup.setLayoutTransition(layoutTransition);
        } else if (f4956a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused6) {
                f4956a = false;
            }
        }
    }
}
