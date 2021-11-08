package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: m6 */
public final class C0806m6 {

    /* renamed from: m6$a */
    public static class C0807a {

        /* renamed from: a */
        public static final Object f3217a = new Object();

        /* renamed from: b */
        public static Method f3218b;

        /* renamed from: c */
        public static boolean f3219c;
    }

    /* renamed from: a */
    public static int m2440a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: b */
    public static boolean m2441b(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: c */
    public static C0455f6 m2442c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        C0455f6 f6Var;
        if (m2447h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C0455f6((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                f6Var = C0455f6.m1656a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                f6Var = null;
            }
            if (f6Var != null) {
                return f6Var;
            }
        }
        return new C0455f6((Shader) null, (ColorStateList) null, i2);
    }

    /* renamed from: d */
    public static String m2443d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2447h(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: e */
    public static int m2444e(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: f */
    public static String m2445f(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: g */
    public static CharSequence[] m2446g(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: h */
    public static boolean m2447h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r9 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r9 != null) goto L_0x007a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2448i(android.content.Context r13, int r14, android.util.TypedValue r15, int r16, p000.C0757l6 r17, android.os.Handler r18, boolean r19) {
        /*
            r8 = r14
            r0 = r15
            r4 = r16
            r9 = r17
            r10 = r18
            android.content.res.Resources r2 = r13.getResources()
            r1 = 1
            r2.getValue(r14, r15, r1)
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r0.startsWith(r1)
            r11 = 0
            r12 = -3
            if (r1 != 0) goto L_0x0025
            if (r9 == 0) goto L_0x007d
            goto L_0x007a
        L_0x0025:
            h4<java.lang.String, android.graphics.Typeface> r1 = p000.C1005q6.f3778b
            java.lang.String r3 = p000.C1005q6.m2913c(r2, r14, r4)
            java.lang.Object r1 = r1.mo3036a(r3)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x003a
            if (r9 == 0) goto L_0x0038
            r9.mo3599b(r1, r10)
        L_0x0038:
            r11 = r1
            goto L_0x007d
        L_0x003a:
            java.lang.String r1 = r0.toLowerCase()     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            java.lang.String r3 = ".xml"
            boolean r1 = r1.endsWith(r3)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r0 = r2.getXml(r14)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            g6 r1 = p000.C1344x5.m3732N(r0, r2)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            if (r1 != 0) goto L_0x0056
            if (r9 == 0) goto L_0x007d
            r9.mo3598a(r12, r10)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            goto L_0x007d
        L_0x0056:
            r0 = r13
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            android.graphics.Typeface r11 = p000.C1005q6.m2911a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            goto L_0x007d
        L_0x0065:
            r1 = r13
            android.graphics.Typeface r0 = p000.C1005q6.m2912b(r13, r2, r14, r0, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo3599b(r0, r10)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
            goto L_0x0075
        L_0x0072:
            r9.mo3598a(r12, r10)     // Catch:{ IOException | XmlPullParserException -> 0x0077 }
        L_0x0075:
            r11 = r0
            goto L_0x007d
        L_0x0077:
            if (r9 == 0) goto L_0x007d
        L_0x007a:
            r9.mo3598a(r12, r10)
        L_0x007d:
            if (r11 != 0) goto L_0x009e
            if (r9 == 0) goto L_0x0082
            goto L_0x009e
        L_0x0082:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r14)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009e:
            return r11
        L_0x009f:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r3 = "Resource \""
            java.lang.StringBuilder r3 = p000.C0279ch.m1106c(r3)
            java.lang.String r2 = r2.getResourceName(r14)
            r3.append(r2)
            java.lang.String r2 = "\" ("
            r3.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r14)
            r3.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r3.append(r2)
            r3.append(r15)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0806m6.m2448i(android.content.Context, int, android.util.TypedValue, int, l6, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: j */
    public static TypedArray m2449j(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
