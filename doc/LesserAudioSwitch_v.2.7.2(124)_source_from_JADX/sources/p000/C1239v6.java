package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import java.io.IOException;
import java.io.InputStream;
import p000.C0808m7;

/* renamed from: v6 */
public class C1239v6 extends C1295w6 {
    /* renamed from: a */
    public Typeface mo4193a(Context context, C0558h6 h6Var, Resources resources, int i) {
        C0609i6[] i6VarArr = h6Var.f2439a;
        int length = i6VarArr.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            C0609i6 i6Var = i6VarArr[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, i6Var.f2628f).setWeight(i6Var.f2624b);
                if (!i6Var.f2625c) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(i6Var.f2627e).setFontVariationSettings(i6Var.f2626d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4194b(android.content.Context r11, android.os.CancellationSignal r12, p000.C0808m7.C0811c[] r13, int r14) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            int r0 = r13.length
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
        L_0x0009:
            r5 = 1
            if (r3 >= r0) goto L_0x0052
            r6 = r13[r3]
            android.net.Uri r7 = r6.f3227a     // Catch:{ IOException -> 0x004f }
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch:{ IOException -> 0x004f }
            if (r7 != 0) goto L_0x001e
            if (r7 == 0) goto L_0x004f
        L_0x001a:
            r7.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x004f
        L_0x001e:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x004a }
            r8.<init>(r7)     // Catch:{ all -> 0x004a }
            int r9 = r6.f3229c     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch:{ all -> 0x004a }
            boolean r9 = r6.f3230d     // Catch:{ all -> 0x004a }
            if (r9 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch:{ all -> 0x004a }
            int r6 = r6.f3228b     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x004a }
            if (r4 != 0) goto L_0x0046
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x004a }
            r6.<init>(r5)     // Catch:{ all -> 0x004a }
            r4 = r6
            goto L_0x001a
        L_0x0046:
            r4.addFont(r5)     // Catch:{ all -> 0x004a }
            goto L_0x001a
        L_0x004a:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r5     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0052:
            if (r4 != 0) goto L_0x0055
            return r1
        L_0x0055:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle
            r12 = r14 & 1
            if (r12 == 0) goto L_0x005e
            r12 = 700(0x2bc, float:9.81E-43)
            goto L_0x0060
        L_0x005e:
            r12 = 400(0x190, float:5.6E-43)
        L_0x0060:
            r13 = r14 & 2
            if (r13 == 0) goto L_0x0065
            r2 = 1
        L_0x0065:
            r11.<init>(r12, r2)
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder
            android.graphics.fonts.FontFamily r13 = r4.build()
            r12.<init>(r13)
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)
            android.graphics.Typeface r11 = r11.build()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1239v6.mo4194b(android.content.Context, android.os.CancellationSignal, m7$c[], int):android.graphics.Typeface");
    }

    /* renamed from: c */
    public Typeface mo4835c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: d */
    public Typeface mo4622d(Context context, Resources resources, int i, String str, int i2) {
        try {
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(new Font.Builder(resources, i).build()).build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public C0808m7.C0811c mo4836f(C0808m7.C0811c[] cVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
