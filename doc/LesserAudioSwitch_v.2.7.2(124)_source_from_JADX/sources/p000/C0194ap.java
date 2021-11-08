package p000;

import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: ap */
public class C0194ap {
    static {
        C0200av.m970a(-66549201589420L);
        C0200av.m970a(-66583561327788L);
        C0200av.m970a(-66600741196972L);
        C0200av.m970a(-66652280804524L);
        C0200av.m970a(-68267188507820L);
    }

    /* renamed from: a */
    public static PrivateKey m964a(String str) {
        try {
            return KeyFactory.getInstance(C0200av.m970a(-65771812508844L)).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            C0200av.m970a(-65788992378028L);
            C0200av.m970a(-65823352116396L);
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: b */
    public static Object m965b(String str, String str2) {
        try {
            return KeyFactory.getInstance(C0200av.m970a(-65436805059756L)).generatePublic(new X509EncodedKeySpec(Base64.decode(str + str2, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            C0200av.m970a(-65453984928940L);
            C0200av.m970a(-65488344667308L);
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: c */
    public static boolean m966c(String str) {
        long j;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            C0200av.m970a(-61373765997740L);
            j = -61408125736108L;
        } else {
            PublicKey publicKey = (PublicKey) m965b(C0728kh.m2300p(), C0728kh.m2301q());
            if (m967d(publicKey, C0200av.m970a(-61601399264428L), str)) {
                C0200av.m970a(-65247826498732L);
                j = -65282186237100L;
            } else if (m967d(publicKey, C0200av.m970a(-61953586582700L), C0200av.m970a(-63568494285996L))) {
                return false;
            } else {
                C0200av.m970a(-65050258003116L);
                j = -65084617741484L;
            }
        }
        C0200av.m970a(j);
        return true;
    }

    /* renamed from: d */
    public static boolean m967d(PublicKey publicKey, String str, String str2) {
        long j;
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature instance = Signature.getInstance(C0200av.m970a(-66076755186860L));
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                return instance.verify(decode);
            } catch (NoSuchAlgorithmException unused) {
                C0200av.m970a(-66128294794412L);
                j = -66162654532780L;
                C0200av.m970a(j);
                return false;
            } catch (InvalidKeyException unused2) {
                C0200av.m970a(-66274323682476L);
                j = -66308683420844L;
                C0200av.m970a(j);
                return false;
            } catch (SignatureException unused3) {
                C0200av.m970a(-66424647537836L);
                j = -66459007276204L;
                C0200av.m970a(j);
                return false;
            }
        } catch (IllegalArgumentException unused4) {
            C0200av.m970a(-65939316233388L);
            C0200av.m970a(-65973675971756L);
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m968e(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return m967d((PublicKey) m965b(C0728kh.m2300p(), C0728kh.m2301q()), str2, str3);
        }
        C0200av.m970a(-59488275354796L);
        C0200av.m970a(-59522635093164L);
        return false;
    }
}
