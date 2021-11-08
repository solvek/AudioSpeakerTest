package p000;

/* renamed from: dn */
public class C0389dn {

    /* renamed from: a */
    public static final String f1913a = "dn";

    /* renamed from: a */
    public static Class m1512a(String str, ClassLoader classLoader) {
        Class<?> cls;
        try {
            cls = classLoader.loadClass(str);
        } catch (Exception unused) {
            cls = null;
        }
        if (cls != null) {
            return cls;
        }
        int length = str.length() - str.replace(".", "").length();
        StringBuffer stringBuffer = new StringBuffer(str);
        int i = 0;
        while (i < length) {
            int lastIndexOf = stringBuffer.lastIndexOf(".");
            stringBuffer.deleteCharAt(lastIndexOf);
            stringBuffer.insert(lastIndexOf, "$");
            try {
                return classLoader.loadClass(stringBuffer.toString());
            } catch (Exception unused2) {
                i++;
            }
        }
        return cls;
    }
}
