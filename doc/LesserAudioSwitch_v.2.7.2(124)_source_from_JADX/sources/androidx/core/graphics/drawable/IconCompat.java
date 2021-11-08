package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    public static final PorterDuff.Mode f636j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f637a = -1;

    /* renamed from: b */
    public Object f638b;

    /* renamed from: c */
    public byte[] f639c = null;

    /* renamed from: d */
    public Parcelable f640d = null;

    /* renamed from: e */
    public int f641e = 0;

    /* renamed from: f */
    public int f642f = 0;

    /* renamed from: g */
    public ColorStateList f643g = null;

    /* renamed from: h */
    public PorterDuff.Mode f644h = f636j;

    /* renamed from: i */
    public String f645i = null;

    public IconCompat() {
    }

    public IconCompat(int i) {
        this.f637a = i;
    }

    /* renamed from: a */
    public static Bitmap m252a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m253b(Resources resources, String str, int i) {
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f641e = i;
            iconCompat.f638b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: c */
    public int mo739c() {
        int i;
        int i2 = this.f637a;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f638b;
            if (i >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } else if (i2 == 2) {
            return this.f641e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    /* renamed from: d */
    public String mo740d() {
        int i;
        int i2 = this.f637a;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f638b;
            if (i >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        } else if (i2 == 2) {
            return ((String) this.f638b).split(":", -1)[0];
        } else {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
    }

    /* renamed from: e */
    public Uri mo741e() {
        int i;
        int i2 = this.f637a;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f638b;
            if (i >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        } else if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f638b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @java.lang.Deprecated
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon mo742f() {
        /*
            r3 = this;
            int r0 = r3.f637a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x0077;
                case 0: goto L_0x0008;
                case 1: goto L_0x005e;
                case 2: goto L_0x0053;
                case 3: goto L_0x0046;
                case 4: goto L_0x003d;
                case 5: goto L_0x0027;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown type"
            r0.<init>(r1)
            throw r0
        L_0x0010:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
            android.net.Uri r2 = r3.mo741e()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0027:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x0034
            java.lang.Object r0 = r3.f638b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
            goto L_0x0066
        L_0x0034:
            java.lang.Object r0 = r3.f638b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = m252a(r0, r1)
            goto L_0x0062
        L_0x003d:
            java.lang.Object r0 = r3.f638b
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L_0x0066
        L_0x0046:
            java.lang.Object r0 = r3.f638b
            byte[] r0 = (byte[]) r0
            int r1 = r3.f641e
            int r2 = r3.f642f
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r1, r2)
            goto L_0x0066
        L_0x0053:
            java.lang.String r0 = r3.mo740d()
            int r1 = r3.f641e
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r1)
            goto L_0x0066
        L_0x005e:
            java.lang.Object r0 = r3.f638b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x0062:
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L_0x0066:
            android.content.res.ColorStateList r1 = r3.f643g
            if (r1 == 0) goto L_0x006d
            r0.setTintList(r1)
        L_0x006d:
            android.graphics.PorterDuff$Mode r1 = r3.f644h
            android.graphics.PorterDuff$Mode r2 = f636j
            if (r1 == r2) goto L_0x007b
            r0.setTintMode(r1)
            goto L_0x007b
        L_0x0077:
            java.lang.Object r0 = r3.f638b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo742f():android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f637a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f638b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f637a
            switch(r1) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r1 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "BITMAP"
        L_0x002c:
            r0.append(r1)
            int r1 = r4.f637a
            switch(r1) {
                case 1: goto L_0x007f;
                case 2: goto L_0x0056;
                case 3: goto L_0x0040;
                case 4: goto L_0x0035;
                case 5: goto L_0x007f;
                case 6: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x009f
        L_0x0035:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f638b
            r0.append(r1)
            goto L_0x009f
        L_0x0040:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f641e
            r0.append(r1)
            int r1 = r4.f642f
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f642f
            goto L_0x009c
        L_0x0056:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo740d()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.mo739c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009f
        L_0x007f:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f638b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f638b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x009c:
            r0.append(r1)
        L_0x009f:
            android.content.res.ColorStateList r1 = r4.f643g
            if (r1 == 0) goto L_0x00ad
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f643g
            r0.append(r1)
        L_0x00ad:
            android.graphics.PorterDuff$Mode r1 = r4.f644h
            android.graphics.PorterDuff$Mode r2 = f636j
            if (r1 == r2) goto L_0x00bd
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f644h
            r0.append(r1)
        L_0x00bd:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
