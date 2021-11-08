package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.nordskog.LesserAudioSwitch.R;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C1047r7;

/* renamed from: x5 */
public final class C1344x5 {

    /* renamed from: a */
    public static Method f5023a;

    /* renamed from: b */
    public static boolean f5024b;

    /* renamed from: c */
    public static Method f5025c;

    /* renamed from: d */
    public static boolean f5026d;

    /* renamed from: e */
    public static Field f5027e;

    /* renamed from: f */
    public static boolean f5028f;

    /* renamed from: g */
    public static Field f5029g;

    /* renamed from: h */
    public static boolean f5030h;

    /* renamed from: i */
    public static Method f5031i;

    /* renamed from: j */
    public static boolean f5032j;

    /* renamed from: k */
    public static Field f5033k;

    /* renamed from: l */
    public static boolean f5034l;

    /* renamed from: A */
    public static Intent m3719A(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        try {
            String C = m3721C(activity, activity.getComponentName());
            if (C == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, C);
            try {
                return m3721C(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: B */
    public static Intent m3720B(Context context, ComponentName componentName) {
        String C = m3721C(context, componentName);
        if (C == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), C);
        return m3721C(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: C */
    public static String m3721C(Context context, ComponentName componentName) {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        if (i >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: D */
    public static File m3722D(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder c = C0279ch.m1106c(".font");
        c.append(Process.myPid());
        c.append("-");
        c.append(Process.myTid());
        c.append("-");
        String sb = c.toString();
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, sb + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r10 != 2) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r4 != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r10 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r10 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C1047r7.C1048a m3723E(android.widget.TextView r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            r7$a r0 = new r7$a
            android.text.PrecomputedText$Params r10 = r10.getTextMetricsParams()
            r0.<init>(r10)
            return r0
        L_0x0010:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r10.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 23
            r6 = 1
            if (r3 < r5) goto L_0x0024
            r7 = 1
            r8 = 1
            goto L_0x0026
        L_0x0024:
            r7 = 0
            r8 = 0
        L_0x0026:
            r9 = 18
            if (r3 < r9) goto L_0x002d
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r0 < r5) goto L_0x0038
            int r7 = r10.getBreakStrategy()
            int r8 = r10.getHyphenationFrequency()
        L_0x0038:
            if (r0 < r9) goto L_0x008c
            android.text.method.TransformationMethod r3 = r10.getTransformationMethod()
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod
            if (r3 == 0) goto L_0x0046
        L_0x0042:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.LTR
        L_0x0044:
            r3 = r10
            goto L_0x008c
        L_0x0046:
            if (r0 < r1) goto L_0x006d
            int r0 = r10.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x006d
            java.util.Locale r10 = r10.getTextLocale()
            android.icu.text.DecimalFormatSymbols r10 = android.icu.text.DecimalFormatSymbols.getInstance(r10)
            java.lang.String[] r10 = r10.getDigitStrings()
            r10 = r10[r4]
            int r10 = r10.codePointAt(r4)
            byte r10 = java.lang.Character.getDirectionality(r10)
            if (r10 == r6) goto L_0x0086
            r0 = 2
            if (r10 != r0) goto L_0x0042
            goto L_0x0086
        L_0x006d:
            int r0 = r10.getLayoutDirection()
            if (r0 != r6) goto L_0x0074
            r4 = 1
        L_0x0074:
            int r10 = r10.getTextDirection()
            switch(r10) {
                case 2: goto L_0x0089;
                case 3: goto L_0x0042;
                case 4: goto L_0x0086;
                case 5: goto L_0x0083;
                case 6: goto L_0x0080;
                case 7: goto L_0x007d;
                default: goto L_0x007b;
            }
        L_0x007b:
            if (r4 == 0) goto L_0x0080
        L_0x007d:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0044
        L_0x0080:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x0044
        L_0x0083:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0044
        L_0x0086:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0044
        L_0x0089:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0044
        L_0x008c:
            r7$a r10 = new r7$a
            r10.<init>(r2, r3, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3723E(android.widget.TextView):r7$a");
    }

    /* renamed from: F */
    public static int m3724F(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: G */
    public static boolean m3725G(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m3726H(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: I */
    public static C1448z9 m3727I(Context context, C0215ba baVar, Fragment fragment, boolean z) {
        Fragment.C0102a aVar = fragment.f683H;
        boolean z2 = false;
        int i = aVar == null ? 0 : aVar.f724e;
        int r = fragment.mo883r();
        fragment.mo886s0(0);
        View b = baVar.mo1591b(fragment.f715w);
        if (!(b == null || b.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
            b.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup = fragment.f679D;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation M = fragment.mo835M();
        if (M != null) {
            return new C1448z9(M);
        }
        Animator N = fragment.mo836N();
        if (N != null) {
            return new C1448z9(N);
        }
        if (r != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(r));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, r);
                    if (loadAnimation != null) {
                        return new C1448z9(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, r);
                    if (loadAnimator != null) {
                        return new C1448z9(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, r);
                        if (loadAnimation2 != null) {
                            return new C1448z9(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int i2 = i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? R.anim.fragment_close_enter : R.anim.fragment_close_exit : z ? R.anim.fragment_fade_enter : R.anim.fragment_fade_exit : z ? R.anim.fragment_open_enter : R.anim.fragment_open_exit;
        if (i2 < 0) {
            return null;
        }
        return new C1448z9(AnimationUtils.loadAnimation(context, i2));
    }

    /* renamed from: J */
    public static int m3728J(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i2);
    }

    /* renamed from: K */
    public static int m3729K(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        int i4;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i3 = (rect.width() / 2) + rect.left;
            i4 = rect2.left;
            i2 = rect2.width();
            return Math.abs(i3 - ((i2 / 2) + i4));
        }
        i3 = (rect.height() / 2) + rect.top;
        i4 = rect2.top;
        i2 = rect2.height();
        return Math.abs(i3 - ((i2 / 2) + i4));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003c */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m3730L(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch:{ IOException -> 0x003d }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x003d }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x0038 }
            r8.<init>(r9)     // Catch:{ all -> 0x0038 }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0033 }
            long r5 = r1.size()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            r8.close()     // Catch:{ all -> 0x0038 }
            r7.close()     // Catch:{ IOException -> 0x003d }
            return r9
        L_0x0033:
            r9 = move-exception
            r8.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r9     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r8 = move-exception
            r7.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r8     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3730L(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: M */
    public static void m3731M(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: N */
    public static C0520g6 m3732N(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1045r5.f3920b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1045r5.f3921c);
                                int i = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i = 1;
                                }
                                int i2 = obtainAttributes2.getInt(i, 400);
                                int i3 = 6;
                                if (!obtainAttributes2.hasValue(6)) {
                                    i3 = 2;
                                }
                                boolean z = 1 == obtainAttributes2.getInt(i3, 0);
                                int i4 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i4 = 3;
                                }
                                int i5 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i5 = 4;
                                }
                                String string4 = obtainAttributes2.getString(i5);
                                int i6 = obtainAttributes2.getInt(i4, 0);
                                int i7 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                                String string5 = obtainAttributes2.getString(i7);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    m3758g0(xmlPullParser);
                                }
                                arrayList.add(new C0609i6(string5, i2, z, string4, i6, resourceId2));
                            } else {
                                m3758g0(xmlPullParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new C0558h6((C0609i6[]) arrayList.toArray(new C0609i6[arrayList.size()]));
                }
                while (xmlPullParser.next() != 3) {
                    m3758g0(xmlPullParser);
                }
                return new C0666j6(new C0610i7(string, string2, string3, m3733O(resources2, resourceId)), integer, integer2);
            }
            m3758g0(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: O */
    public static List<List<byte[]>> m3733O(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3760h0(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3760h0(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: P */
    public static void m3734P(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: Q */
    public static void m3735Q(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0411e9) {
            ((C0411e9) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: R */
    public static void m3736R(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: S */
    public static void m3737S(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m3774s(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m3774s(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: T */
    public static void m3738T(TextView textView, int i) {
        m3753e(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = (i2 < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: U */
    public static void m3739U(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: V */
    public static void m3740V(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: W */
    public static void m3741W(TextView textView, int i) {
        m3753e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: X */
    public static boolean m3742X(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f5024b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f5023a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f5024b = true;
            }
            Method method = f5023a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception unused2) {
                    f5023a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: Y */
    public static void m3743Y(TextView textView, int i) {
        m3753e(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: Z */
    public static void m3744Z(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!f5034l) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f5033k = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f5034l = true;
            }
            Field field = f5033k;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3745a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m3747b(r9, r10, r11)
            boolean r1 = m3747b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = 1
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = m3728J(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = 1
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3745a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: a0 */
    public static void m3746a0(TextView textView, C1047r7 r7Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            r7Var.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        C1047r7.C1048a E = m3723E(textView);
        r7Var.getClass();
        if (E.mo4207a((C1047r7.C1048a) null)) {
            textView.setText(r7Var);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    /* renamed from: b */
    public static boolean m3747b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: b0 */
    public static void m3748b0(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = r2.getClass().getName();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3749c(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x0039
        L_0x0005:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x0029
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x0029
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x0029:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
        L_0x0039:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3749c(java.lang.Object, java.lang.StringBuilder):void");
    }

    /* renamed from: c0 */
    public static void m3750c0(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C1400y6) {
            ((C1400y6) drawable).setTint(i);
        }
    }

    /* renamed from: d */
    public static boolean m3751d(C0958p6[] p6VarArr, C0958p6[] p6VarArr2) {
        if (p6VarArr == null || p6VarArr2 == null || p6VarArr.length != p6VarArr2.length) {
            return false;
        }
        for (int i = 0; i < p6VarArr.length; i++) {
            if (p6VarArr[i].f3567a != p6VarArr2[i].f3567a || p6VarArr[i].f3568b.length != p6VarArr2[i].f3568b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d0 */
    public static void m3752d0(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C1400y6) {
            ((C1400y6) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static int m3753e(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e0 */
    public static void m3754e0(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C1400y6) {
            ((C1400y6) drawable).setTintMode(mode);
        }
    }

    /* renamed from: f */
    public static <T> T m3755f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: f0 */
    public static void m3756f0(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f5032j) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f5031i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f5032j = true;
        }
        Method method = f5031i;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: g */
    public static int m3757g(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i = Build.VERSION.SDK_INT;
            String permissionToOp = i >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            if ((i >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) : 1) != 0) {
                return -2;
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: g0 */
    public static void m3758g0(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    public static int m3759h(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: h0 */
    public static List<byte[]> m3760h0(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m3761i(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable a;
        int i = Build.VERSION.SDK_INT;
        if (i < 23 && i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                a = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof C1443z6) {
                a = ((C1443z6) drawable).mo47a();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        m3761i(child);
                    }
                }
                return;
            } else {
                return;
            }
            m3761i(a);
            return;
        }
        drawable.clearColorFilter();
    }

    /* renamed from: i0 */
    public static <T extends Drawable> T m3762i0(Drawable drawable) {
        return drawable instanceof C1443z6 ? ((C1443z6) drawable).mo47a() : drawable;
    }

    /* renamed from: j */
    public static float[] m3763j(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j0 */
    public static Drawable m3764j0(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof C1400y6) ? new C0212b7(drawable) : drawable : !(drawable instanceof C1400y6) ? new C0010a7(drawable) : drawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[SYNTHETIC, Splitter:B:13:0x0014] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3765k(java.io.File r0, android.content.res.Resources r1, int r2) {
        /*
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ all -> 0x0010 }
            boolean r0 = m3767l(r0, r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()     // Catch:{ IOException -> 0x000d }
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3765k(java.io.File, android.content.res.Resources, int):boolean");
    }

    /* renamed from: k0 */
    public static ActionMode.Callback m3766k0(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0369d9)) ? callback : new C0369d9(callback, textView);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0030 A[SYNTHETIC, Splitter:B:24:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0039 A[SYNTHETIC, Splitter:B:30:0x0039] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3767l(java.io.File r5, java.io.InputStream r6) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002a }
            r3.<init>(r5, r1)     // Catch:{ IOException -> 0x002a }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r2 = r6.read(r5)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r4 = -1
            if (r2 == r4) goto L_0x001a
            r3.write(r5, r1, r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r5 = 1
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L_0x0022:
            r5 = move-exception
            r2 = r3
            goto L_0x0037
        L_0x0025:
            r5 = move-exception
            r2 = r3
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            goto L_0x0037
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            r5.getMessage()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            android.os.StrictMode.setThreadPolicy(r0)
            goto L_0x0041
        L_0x0040:
            throw r5
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3767l(java.io.File, java.io.InputStream):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m3768m(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m3769n(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            goto L_0x001f
        L_0x001e:
            throw r4
        L_0x001f:
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3768m(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m3769n(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = r18.getName()
            java.lang.String r3 = "selector"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0102
            int r2 = r18.getDepth()
            r3 = 1
            int r2 = r2 + r3
            r4 = 20
            int[][] r5 = new int[r4][]
            int[] r4 = new int[r4]
            r6 = 0
            r7 = 0
        L_0x001e:
            int r8 = r18.next()
            if (r8 == r3) goto L_0x00f2
            int r9 = r18.getDepth()
            if (r9 >= r2) goto L_0x002d
            r10 = 3
            if (r8 == r10) goto L_0x00f2
        L_0x002d:
            r10 = 2
            if (r8 != r10) goto L_0x00ed
            if (r9 > r2) goto L_0x00ed
            java.lang.String r8 = r18.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0040
            goto L_0x00ed
        L_0x0040:
            int[] r8 = p000.C1045r5.f3919a
            if (r1 != 0) goto L_0x004b
            r9 = r17
            android.content.res.TypedArray r8 = r9.obtainAttributes(r0, r8)
            goto L_0x0051
        L_0x004b:
            r9 = r17
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r0, r8, r6, r6)
        L_0x0051:
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r11 = r8.getColor(r6, r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            boolean r13 = r8.hasValue(r3)
            if (r13 == 0) goto L_0x0065
            float r12 = r8.getFloat(r3, r12)
            goto L_0x006f
        L_0x0065:
            boolean r13 = r8.hasValue(r10)
            if (r13 == 0) goto L_0x006f
            float r12 = r8.getFloat(r10, r12)
        L_0x006f:
            r8.recycle()
            int r8 = r19.getAttributeCount()
            int[] r10 = new int[r8]
            r13 = 0
            r14 = 0
        L_0x007a:
            if (r13 >= r8) goto L_0x00a0
            int r15 = r0.getAttributeNameResource(r13)
            r3 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r3) goto L_0x009c
            r3 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r3) goto L_0x009c
            r3 = 2130903084(0x7f03002c, float:1.7412976E38)
            if (r15 == r3) goto L_0x009c
            int r3 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r6)
            if (r16 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            int r15 = -r15
        L_0x0099:
            r10[r14] = r15
            r14 = r3
        L_0x009c:
            int r13 = r13 + 1
            r3 = 1
            goto L_0x007a
        L_0x00a0:
            int[] r3 = android.util.StateSet.trimStateSet(r10, r14)
            int r8 = android.graphics.Color.alpha(r11)
            float r8 = (float) r8
            float r8 = r8 * r12
            int r8 = java.lang.Math.round(r8)
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r8 = r8 << 24
            r8 = r8 | r10
            int r10 = r7 + 1
            int r11 = r4.length
            r12 = 4
            r13 = 8
            if (r10 <= r11) goto L_0x00cb
            if (r7 > r12) goto L_0x00c3
            r11 = 8
            goto L_0x00c5
        L_0x00c3:
            int r11 = r7 * 2
        L_0x00c5:
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r4, r6, r11, r6, r7)
            r4 = r11
        L_0x00cb:
            r4[r7] = r8
            int r8 = r5.length
            if (r10 <= r8) goto L_0x00e7
            java.lang.Class r8 = r5.getClass()
            java.lang.Class r8 = r8.getComponentType()
            if (r7 > r12) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            int r13 = r7 * 2
        L_0x00dd:
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r13)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.System.arraycopy(r5, r6, r8, r6, r7)
            r5 = r8
        L_0x00e7:
            r5[r7] = r3
            int[][] r5 = (int[][]) r5
            r7 = r10
            goto L_0x00ef
        L_0x00ed:
            r9 = r17
        L_0x00ef:
            r3 = 1
            goto L_0x001e
        L_0x00f2:
            int[] r0 = new int[r7]
            int[][] r1 = new int[r7][]
            java.lang.System.arraycopy(r4, r6, r0, r6, r7)
            java.lang.System.arraycopy(r5, r6, r1, r6, r7)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0102:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r18.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0121
        L_0x0120:
            throw r0
        L_0x0121:
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3769n(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r13 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[Catch:{ NumberFormatException -> 0x00ba }, LOOP:3: B:25:0x006d->B:45:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0097 A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0958p6[] m3770o(java.lang.String r16) {
        /*
            r0 = r16
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = 0
        L_0x000e:
            int r5 = r16.length()
            if (r3 >= r5) goto L_0x00df
        L_0x0014:
            int r5 = r16.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r3 >= r5) goto L_0x003a
            char r5 = r0.charAt(r3)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0032
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0037
        L_0x0032:
            if (r5 == r7) goto L_0x0037
            if (r5 == r6) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0014
        L_0x003a:
            java.lang.String r4 = r0.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00d7
            char r5 = r4.charAt(r2)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00c9
            char r5 = r4.charAt(r2)
            r8 = 90
            if (r5 != r8) goto L_0x005a
            goto L_0x00c9
        L_0x005a:
            int r5 = r4.length()     // Catch:{ NumberFormatException -> 0x00ba }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00ba }
            int r8 = r4.length()     // Catch:{ NumberFormatException -> 0x00ba }
            r9 = 1
            r10 = 0
        L_0x0066:
            if (r9 >= r8) goto L_0x00b2
            r2 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r9
        L_0x006d:
            int r15 = r4.length()     // Catch:{ NumberFormatException -> 0x00ba }
            if (r14 >= r15) goto L_0x009b
            char r15 = r4.charAt(r14)     // Catch:{ NumberFormatException -> 0x00ba }
            r7 = 32
            if (r15 == r7) goto L_0x0091
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008f
            if (r15 == r7) goto L_0x008f
            switch(r15) {
                case 44: goto L_0x0093;
                case 45: goto L_0x0089;
                case 46: goto L_0x0085;
                default: goto L_0x0084;
            }     // Catch:{ NumberFormatException -> 0x00ba }
        L_0x0084:
            goto L_0x0094
        L_0x0085:
            if (r12 != 0) goto L_0x008d
            r12 = 1
            goto L_0x0094
        L_0x0089:
            if (r14 == r9) goto L_0x0094
            if (r13 != 0) goto L_0x0094
        L_0x008d:
            r11 = 1
            goto L_0x0093
        L_0x008f:
            r13 = 1
            goto L_0x0095
        L_0x0091:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0093:
            r2 = 1
        L_0x0094:
            r13 = 0
        L_0x0095:
            if (r2 == 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            int r14 = r14 + 1
            goto L_0x006d
        L_0x009b:
            if (r9 >= r14) goto L_0x00aa
            int r2 = r10 + 1
            java.lang.String r9 = r4.substring(r9, r14)     // Catch:{ NumberFormatException -> 0x00ba }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x00ba }
            r5[r10] = r9     // Catch:{ NumberFormatException -> 0x00ba }
            r10 = r2
        L_0x00aa:
            if (r11 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            int r14 = r14 + 1
        L_0x00af:
            r9 = r14
            r2 = 0
            goto L_0x0066
        L_0x00b2:
            float[] r2 = m3763j(r5, r2, r10)     // Catch:{ NumberFormatException -> 0x00ba }
            r5 = 0
            r5 = r2
            r2 = 0
            goto L_0x00cb
        L_0x00ba:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = p000.C0279ch.m1121r(r2, r4, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00c9:
            float[] r5 = new float[r2]
        L_0x00cb:
            char r2 = r4.charAt(r2)
            p6 r4 = new p6
            r4.<init>(r2, r5)
            r1.add(r4)
        L_0x00d7:
            int r2 = r3 + 1
            r4 = 0
            r4 = r3
            r3 = r2
            r2 = 0
            goto L_0x000e
        L_0x00df:
            int r3 = r3 - r4
            r2 = 1
            if (r3 != r2) goto L_0x00f8
            int r2 = r16.length()
            if (r4 >= r2) goto L_0x00f8
            char r0 = r0.charAt(r4)
            r2 = 0
            float[] r2 = new float[r2]
            p6 r3 = new p6
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00f8:
            int r0 = r1.size()
            p6[] r0 = new p000.C0958p6[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            p6[] r0 = (p000.C0958p6[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3770o(java.lang.String):p6[]");
    }

    /* renamed from: p */
    public static Path m3771p(String str) {
        Path path = new Path();
        C0958p6[] o = m3770o(str);
        if (o == null) {
            return null;
        }
        try {
            C0958p6.m2780b(o, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(C0279ch.m1120q("Error in parsing ", str), e);
        }
    }

    /* renamed from: q */
    public static C0958p6[] m3772q(C0958p6[] p6VarArr) {
        if (p6VarArr == null) {
            return null;
        }
        C0958p6[] p6VarArr2 = new C0958p6[p6VarArr.length];
        for (int i = 0; i < p6VarArr.length; i++) {
            p6VarArr2[i] = new C0958p6(p6VarArr[i]);
        }
        return p6VarArr2;
    }

    /* renamed from: r */
    public static boolean m3773r(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? C0000a.m0a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: s */
    public static void m3774s(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f5028f) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f5027e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Class<LayoutInflater> cls = LayoutInflater.class;
            }
            f5028f = true;
        }
        Field field = f5027e;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.";
            }
        }
    }

    /* renamed from: t */
    public static int m3775t(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }

    /* renamed from: u */
    public static Drawable m3776u(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f5030h) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f5029g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5030h = true;
        }
        Field field = f5029g;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f5029g = null;
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ColorStateList m3777v(CompoundButton compoundButton) {
        return Build.VERSION.SDK_INT >= 21 ? compoundButton.getButtonTintList() : ((C0411e9) compoundButton).getSupportButtonTintList();
    }

    /* renamed from: w */
    public static Drawable[] m3778w(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        p000.C0257c6.f1342c = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004e */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m3779x(android.app.Notification r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0009
            android.os.Bundle r6 = r6.extras
            return r6
        L_0x0009:
            r1 = 16
            r2 = 0
            if (r0 < r1) goto L_0x0055
            java.lang.Object r0 = p000.C0257c6.f1340a
            monitor-enter(r0)
            boolean r1 = p000.C0257c6.f1342c     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0017
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0051
        L_0x0017:
            r1 = 1
            java.lang.reflect.Field r3 = p000.C0257c6.f1341b     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            if (r3 != 0) goto L_0x0038
            java.lang.Class<android.app.Notification> r3 = android.app.Notification.class
            java.lang.String r4 = "extras"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            java.lang.Class r5 = r3.getType()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            boolean r4 = r4.isAssignableFrom(r5)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            if (r4 != 0) goto L_0x0033
            p000.C0257c6.f1342c = r1     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            goto L_0x0015
        L_0x0033:
            r3.setAccessible(r1)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            p000.C0257c6.f1341b = r3     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
        L_0x0038:
            java.lang.reflect.Field r3 = p000.C0257c6.f1341b     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            if (r3 != 0) goto L_0x004c
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            r3.<init>()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            java.lang.reflect.Field r4 = p000.C0257c6.f1341b     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
            r4.set(r6, r3)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x004e }
        L_0x004c:
            r2 = r3
            goto L_0x0015
        L_0x004e:
            p000.C0257c6.f1342c = r1     // Catch:{ all -> 0x0052 }
            goto L_0x0015
        L_0x0051:
            return r2
        L_0x0052:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r6
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1344x5.m3779x(android.app.Notification):android.os.Bundle");
    }

    /* renamed from: y */
    public static int m3780y(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f5026d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f5025c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f5026d = true;
            }
            Method method = f5025c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    f5025c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: z */
    public static int m3781z(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }
}
