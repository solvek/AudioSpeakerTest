package p000;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: sc */
public final class C1107sc {
    /* renamed from: a */
    public static int m3163a(RecyclerView.C0179x xVar, C0924od odVar, View view, View view2, RecyclerView.C0160m mVar, boolean z) {
        if (mVar.mo1354y() == 0 || xVar.mo1394b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(mVar.mo1324Q(view) - mVar.mo1324Q(view2)) + 1;
        }
        return Math.min(odVar.mo3697l(), odVar.mo3687b(view2) - odVar.mo3690e(view));
    }

    /* renamed from: b */
    public static int m3164b(RecyclerView.C0179x xVar, C0924od odVar, View view, View view2, RecyclerView.C0160m mVar, boolean z, boolean z2) {
        if (mVar.mo1354y() == 0 || xVar.mo1394b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (xVar.mo1394b() - Math.max(mVar.mo1324Q(view), mVar.mo1324Q(view2))) - 1) : Math.max(0, Math.min(mVar.mo1324Q(view), mVar.mo1324Q(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(odVar.mo3687b(view2) - odVar.mo3690e(view))) / ((float) (Math.abs(mVar.mo1324Q(view) - mVar.mo1324Q(view2)) + 1)))) + ((float) (odVar.mo3696k() - odVar.mo3690e(view))));
    }

    /* renamed from: c */
    public static int m3165c(RecyclerView.C0179x xVar, C0924od odVar, View view, View view2, RecyclerView.C0160m mVar, boolean z) {
        if (mVar.mo1354y() == 0 || xVar.mo1394b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return xVar.mo1394b();
        }
        return (int) ((((float) (odVar.mo3687b(view2) - odVar.mo3690e(view))) / ((float) (Math.abs(mVar.mo1324Q(view) - mVar.mo1324Q(view2)) + 1))) * ((float) xVar.mo1394b()));
    }

    /* renamed from: d */
    public static Interpolator m3166d(Context context, XmlPullParser xmlPullParser) {
        Interpolator qfVar;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            qfVar = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            qfVar = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            qfVar = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            qfVar = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            qfVar = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            qfVar = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            qfVar = new C1017qf(context, asAttributeSet, xmlPullParser);
                        } else {
                            StringBuilder c = C0279ch.m1106c("Unknown interpolator name: ");
                            c.append(xmlPullParser.getName());
                            throw new RuntimeException(c.toString());
                        }
                        interpolator = qfVar;
                    }
                }
            }
        }
        return interpolator;
    }

    /* renamed from: e */
    public static Interpolator m3167e(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i == 17563663) {
            try {
                return new C0460fb();
            } catch (XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i == 17563661) {
            return new C0526gb();
        } else {
            if (i == 17563662) {
                return new C0566hb();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            context.getResources();
            context.getTheme();
            Interpolator d = m3166d(context, animation);
            animation.close();
            return d;
        }
    }

    /* renamed from: f */
    public static <T> ObjectAnimator m3168f(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C0533ge(property, path), new float[]{0.0f, 1.0f});
    }
}
