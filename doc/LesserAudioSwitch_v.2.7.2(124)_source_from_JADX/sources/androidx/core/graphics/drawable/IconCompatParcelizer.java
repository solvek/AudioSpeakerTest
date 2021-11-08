package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(p000.C1167tf r4) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f637a
            r2 = 1
            int r1 = r4.mo4655k(r1, r2)
            r0.f637a = r1
            byte[] r1 = r0.f639c
            r2 = 2
            boolean r2 = r4.mo4653i(r2)
            if (r2 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            byte[] r1 = r4.mo4651g()
        L_0x001c:
            r0.f639c = r1
            android.os.Parcelable r1 = r0.f640d
            r2 = 3
            android.os.Parcelable r1 = r4.mo4657m(r1, r2)
            r0.f640d = r1
            int r1 = r0.f641e
            r3 = 4
            int r1 = r4.mo4655k(r1, r3)
            r0.f641e = r1
            int r1 = r0.f642f
            r3 = 5
            int r1 = r4.mo4655k(r1, r3)
            r0.f642f = r1
            android.content.res.ColorStateList r1 = r0.f643g
            r3 = 6
            android.os.Parcelable r1 = r4.mo4657m(r1, r3)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f643g = r1
            java.lang.String r1 = r0.f645i
            r3 = 7
            boolean r3 = r4.mo4653i(r3)
            if (r3 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.lang.String r1 = r4.mo4658n()
        L_0x0052:
            r0.f645i = r1
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.valueOf(r1)
            r0.f644h = r4
            int r4 = r0.f637a
            switch(r4) {
                case -1: goto L_0x0087;
                case 0: goto L_0x005f;
                case 1: goto L_0x0075;
                case 2: goto L_0x0065;
                case 3: goto L_0x0060;
                case 4: goto L_0x0065;
                case 5: goto L_0x0075;
                case 6: goto L_0x0065;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0096
        L_0x0060:
            byte[] r4 = r0.f639c
            r0.f638b = r4
            goto L_0x0096
        L_0x0065:
            java.lang.String r4 = new java.lang.String
            byte[] r1 = r0.f639c
            java.lang.String r2 = "UTF-16"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r4.<init>(r1, r2)
            r0.f638b = r4
            goto L_0x0096
        L_0x0075:
            android.os.Parcelable r4 = r0.f640d
            if (r4 == 0) goto L_0x007a
            goto L_0x008b
        L_0x007a:
            byte[] r4 = r0.f639c
            r0.f638b = r4
            r0.f637a = r2
            r1 = 0
            r0.f641e = r1
            int r4 = r4.length
            r0.f642f = r4
            goto L_0x0096
        L_0x0087:
            android.os.Parcelable r4 = r0.f640d
            if (r4 == 0) goto L_0x008e
        L_0x008b:
            r0.f638b = r4
            goto L_0x0096
        L_0x008e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r4.<init>(r0)
            throw r4
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(tf):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, C1167tf tfVar) {
        tfVar.getClass();
        iconCompat.f645i = iconCompat.f644h.name();
        switch (iconCompat.f637a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f640d = (Parcelable) iconCompat.f638b;
                break;
            case 2:
                iconCompat.f639c = ((String) iconCompat.f638b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f639c = (byte[]) iconCompat.f638b;
                break;
            case 4:
            case 6:
                iconCompat.f639c = iconCompat.f638b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f637a;
        if (-1 != i) {
            tfVar.mo4660p(1);
            tfVar.mo4664t(i);
        }
        byte[] bArr = iconCompat.f639c;
        if (bArr != null) {
            tfVar.mo4660p(2);
            tfVar.mo4662r(bArr);
        }
        Parcelable parcelable = iconCompat.f640d;
        if (parcelable != null) {
            tfVar.mo4660p(3);
            tfVar.mo4665u(parcelable);
        }
        int i2 = iconCompat.f641e;
        if (i2 != 0) {
            tfVar.mo4660p(4);
            tfVar.mo4664t(i2);
        }
        int i3 = iconCompat.f642f;
        if (i3 != 0) {
            tfVar.mo4660p(5);
            tfVar.mo4664t(i3);
        }
        ColorStateList colorStateList = iconCompat.f643g;
        if (colorStateList != null) {
            tfVar.mo4660p(6);
            tfVar.mo4665u(colorStateList);
        }
        String str = iconCompat.f645i;
        if (str != null) {
            tfVar.mo4660p(7);
            tfVar.mo4666v(str);
        }
    }
}
