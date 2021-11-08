package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* renamed from: oc */
public class C0923oc {

    /* renamed from: e */
    public static final Class<?>[] f3491e = {Context.class, AttributeSet.class};

    /* renamed from: f */
    public static final HashMap<String, Constructor> f3492f = new HashMap<>();

    /* renamed from: a */
    public final Context f3493a;

    /* renamed from: b */
    public final Object[] f3494b = new Object[2];

    /* renamed from: c */
    public C0968pc f3495c;

    /* renamed from: d */
    public String[] f3496d;

    public C0923oc(Context context, C0968pc pcVar) {
        this.f3493a = context;
        this.f3495c = pcVar;
        this.f3496d = new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0 = new android.view.InflateException(r13.getPositionDescription() + ": Error inflating class " + r11);
        r0.initCause(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[ExcHandler: Exception (r12v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.Preference mo3839a(java.lang.String r11, java.lang.String[] r12, android.util.AttributeSet r13) {
        /*
            r10 = this;
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor> r0 = f3492f
            java.lang.Object r0 = r0.get(r11)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.String r1 = ": Error inflating class "
            r2 = 1
            if (r0 != 0) goto L_0x006d
            android.content.Context r0 = r10.f3493a     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r3 = 0
            if (r12 == 0) goto L_0x005b
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            if (r4 != 0) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r5 = 0
            r7 = r5
            r6 = 0
        L_0x001e:
            if (r6 >= r4) goto L_0x003a
            r8 = r12[r6]     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r8)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r11)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.String r8 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.Class r5 = java.lang.Class.forName(r8, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003a:
            if (r5 != 0) goto L_0x005f
            if (r7 != 0) goto L_0x005a
            android.view.InflateException r12 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r2 = r13.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r11)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            throw r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005a:
            throw r7     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005b:
            java.lang.Class r5 = java.lang.Class.forName(r11, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005f:
            java.lang.Class<?>[] r12 = f3491e     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.reflect.Constructor r0 = r5.getConstructor(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor> r12 = f3492f     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.put(r11, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x006d:
            java.lang.Object[] r12 = r10.f3494b     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12[r2] = r13     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.Object r12 = r0.newInstance(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            androidx.preference.Preference r12 = (androidx.preference.Preference) r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            return r12
        L_0x0078:
            r12 = move-exception
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r2.append(r13)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            r0.initCause(r12)
            throw r0
        L_0x0098:
            r11 = move-exception
            goto L_0x009b
        L_0x009a:
            throw r11
        L_0x009b:
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0923oc.mo3839a(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    /* renamed from: b */
    public final Preference mo3840b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return mo3839a(str, this.f3496d, attributeSet);
            }
            return mo3839a(str, (String[]) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.preference.Preference mo3841c(org.xmlpull.v1.XmlPullParser r6, androidx.preference.PreferenceGroup r7) {
        /*
            r5 = this;
            java.lang.Object[] r0 = r5.f3494b
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ all -> 0x0082 }
            java.lang.Object[] r2 = r5.f3494b     // Catch:{ all -> 0x0082 }
            r3 = 0
            android.content.Context r4 = r5.f3493a     // Catch:{ all -> 0x0082 }
            r2[r3] = r4     // Catch:{ all -> 0x0082 }
        L_0x000e:
            int r2 = r6.next()     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            r3 = 2
            if (r2 == r3) goto L_0x0018
            r4 = 1
            if (r2 != r4) goto L_0x000e
        L_0x0018:
            if (r2 != r3) goto L_0x0031
            java.lang.String r2 = r6.getName()     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            androidx.preference.Preference r2 = r5.mo3840b(r2, r1)     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            if (r7 != 0) goto L_0x002c
            pc r7 = r5.f3495c     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            r2.mo956o(r7)     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            r7 = r2
        L_0x002c:
            r5.mo3842d(r6, r7, r1)     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r7
        L_0x0031:
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            r1.<init>()     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            java.lang.String r2 = r6.getPositionDescription()     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            r1.append(r2)     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            java.lang.String r2 = ": No start tag found!"
            r1.append(r2)     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            java.lang.String r1 = r1.toString()     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            r7.<init>(r1)     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
            throw r7     // Catch:{ InflateException -> 0x0080, XmlPullParserException -> 0x0072, IOException -> 0x004c }
        L_0x004c:
            r7 = move-exception
            android.view.InflateException r1 = new android.view.InflateException     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r2.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r6.getPositionDescription()     // Catch:{ all -> 0x0082 }
            r2.append(r6)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r7.getMessage()     // Catch:{ all -> 0x0082 }
            r2.append(r6)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0082 }
            r1.<init>(r6)     // Catch:{ all -> 0x0082 }
            r1.initCause(r7)     // Catch:{ all -> 0x0082 }
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0072:
            r6 = move-exception
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0082 }
            r7.<init>(r1)     // Catch:{ all -> 0x0082 }
            r7.initCause(r6)     // Catch:{ all -> 0x0082 }
            throw r7     // Catch:{ all -> 0x0082 }
        L_0x0080:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0086
        L_0x0085:
            throw r6
        L_0x0086:
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0923oc.mo3841c(org.xmlpull.v1.XmlPullParser, androidx.preference.PreferenceGroup):androidx.preference.Preference");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0134 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3842d(org.xmlpull.v1.XmlPullParser r12, androidx.preference.Preference r13, android.util.AttributeSet r14) {
        /*
            r11 = this;
            int r0 = r12.getDepth()
        L_0x0004:
            int r1 = r12.next()
            r2 = 3
            if (r1 != r2) goto L_0x0011
            int r3 = r12.getDepth()
            if (r3 <= r0) goto L_0x0146
        L_0x0011:
            r3 = 1
            if (r1 == r3) goto L_0x0146
            r4 = 2
            if (r1 == r4) goto L_0x0018
            goto L_0x0004
        L_0x0018:
            java.lang.String r1 = r12.getName()
            java.lang.String r4 = "intent"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x003d
            android.content.Context r1 = r11.f3493a     // Catch:{ IOException -> 0x0031 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ IOException -> 0x0031 }
            android.content.Intent r1 = android.content.Intent.parseIntent(r1, r12, r14)     // Catch:{ IOException -> 0x0031 }
            r13.f805m = r1
            goto L_0x0004
        L_0x0031:
            r12 = move-exception
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r14 = "Error parsing preference"
            r13.<init>(r14)
            r13.initCause(r12)
            throw r13
        L_0x003d:
            java.lang.String r4 = "extra"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x007c
            android.content.Context r1 = r11.f3493a
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r4 = "extra"
            android.os.Bundle r5 = r13.f807o
            if (r5 != 0) goto L_0x0058
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r13.f807o = r5
        L_0x0058:
            android.os.Bundle r5 = r13.f807o
            r1.parseBundleExtra(r4, r14, r5)
            int r1 = r12.getDepth()     // Catch:{ IOException -> 0x0070 }
        L_0x0061:
            int r4 = r12.next()     // Catch:{ IOException -> 0x0070 }
            if (r4 == r3) goto L_0x0004
            if (r4 != r2) goto L_0x0061
            int r4 = r12.getDepth()     // Catch:{ IOException -> 0x0070 }
            if (r4 > r1) goto L_0x0061
            goto L_0x0004
        L_0x0070:
            r12 = move-exception
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r14 = "Error parsing preference"
            r13.<init>(r14)
            r13.initCause(r12)
            throw r13
        L_0x007c:
            androidx.preference.Preference r1 = r11.mo3840b(r1, r14)
            r2 = r13
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            java.util.List<androidx.preference.Preference> r4 = r2.f822O
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L_0x008d
            goto L_0x012f
        L_0x008d:
            java.lang.String r4 = r1.f804l
            if (r4 == 0) goto L_0x009d
            r4 = r2
        L_0x0092:
            androidx.preference.PreferenceGroup r5 = r4.f789I
            if (r5 == 0) goto L_0x0098
            r4 = r5
            goto L_0x0092
        L_0x0098:
            java.lang.String r5 = r1.f804l
            r4.mo969I(r5)
        L_0x009d:
            int r4 = r1.f799g
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x00bc
            boolean r4 = r2.f823P
            if (r4 == 0) goto L_0x00b1
            int r4 = r2.f824Q
            int r5 = r4 + 1
            r2.f824Q = r5
            r1.mo940E(r4)
        L_0x00b1:
            boolean r4 = r1 instanceof androidx.preference.PreferenceGroup
            if (r4 == 0) goto L_0x00bc
            r4 = r1
            androidx.preference.PreferenceGroup r4 = (androidx.preference.PreferenceGroup) r4
            boolean r5 = r2.f823P
            r4.f823P = r5
        L_0x00bc:
            java.util.List<androidx.preference.Preference> r4 = r2.f822O
            int r4 = java.util.Collections.binarySearch(r4, r1)
            if (r4 >= 0) goto L_0x00c7
            int r4 = r4 * -1
            int r4 = r4 - r3
        L_0x00c7:
            boolean r5 = r2.mo916G()
            r1.mo961v(r5)
            monitor-enter(r2)
            java.util.List<androidx.preference.Preference> r5 = r2.f822O     // Catch:{ all -> 0x0143 }
            r5.add(r4, r1)     // Catch:{ all -> 0x0143 }
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            pc r4 = r2.f795c
            java.lang.String r5 = r1.f804l
            r6 = 0
            if (r5 == 0) goto L_0x00fc
            j4<java.lang.String, java.lang.Long> r7 = r2.f821N
            int r7 = r7.mo3396e(r5)
            if (r7 < 0) goto L_0x00e6
            r7 = 1
            goto L_0x00e7
        L_0x00e6:
            r7 = 0
        L_0x00e7:
            if (r7 == 0) goto L_0x00fc
            j4<java.lang.String, java.lang.Long> r7 = r2.f821N
            r8 = 0
            java.lang.Object r7 = r7.getOrDefault(r5, r8)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            j4<java.lang.String, java.lang.Long> r9 = r2.f821N
            r9.remove(r5)
            goto L_0x0105
        L_0x00fc:
            monitor-enter(r4)
            long r7 = r4.f3608b     // Catch:{ all -> 0x0140 }
            r9 = 1
            long r9 = r9 + r7
            r4.f3608b = r9     // Catch:{ all -> 0x0140 }
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
        L_0x0105:
            r1.f796d = r7
            r1.f797e = r3
            r1.mo956o(r4)     // Catch:{ all -> 0x013c }
            r1.f797e = r6
            androidx.preference.PreferenceGroup r3 = r1.f789I
            if (r3 != 0) goto L_0x0134
            r1.f789I = r2
            boolean r3 = r2.f825R
            if (r3 == 0) goto L_0x011b
            r1.mo955n()
        L_0x011b:
            androidx.preference.Preference$c r2 = r2.f787G
            if (r2 == 0) goto L_0x012f
            mc r2 = (p000.C0824mc) r2
            android.os.Handler r3 = r2.f3267g
            java.lang.Runnable r4 = r2.f3268h
            r3.removeCallbacks(r4)
            android.os.Handler r3 = r2.f3267g
            java.lang.Runnable r2 = r2.f3268h
            r3.post(r2)
        L_0x012f:
            r11.mo3842d(r12, r1, r14)
            goto L_0x0004
        L_0x0134:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "This preference already has a parent. You must remove the existing parent before assigning a new one."
            r12.<init>(r13)
            throw r12
        L_0x013c:
            r12 = move-exception
            r1.f797e = r6
            throw r12
        L_0x0140:
            r12 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
            throw r12
        L_0x0143:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            throw r12
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0923oc.mo3842d(org.xmlpull.v1.XmlPullParser, androidx.preference.Preference, android.util.AttributeSet):void");
    }
}
