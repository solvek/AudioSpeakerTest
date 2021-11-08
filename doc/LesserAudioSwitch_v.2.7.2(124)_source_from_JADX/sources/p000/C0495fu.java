package p000;

/* renamed from: fu */
public class C0495fu {

    /* renamed from: a */
    public static final char[] f2183a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m1724a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f2183a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
