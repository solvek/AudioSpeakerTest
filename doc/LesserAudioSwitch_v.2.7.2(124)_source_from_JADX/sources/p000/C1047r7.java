package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* renamed from: r7 */
public class C1047r7 implements Spannable {

    /* renamed from: r7$a */
    public static final class C1048a {

        /* renamed from: a */
        public final TextPaint f3929a;

        /* renamed from: b */
        public final TextDirectionHeuristic f3930b;

        /* renamed from: c */
        public final int f3931c;

        /* renamed from: d */
        public final int f3932d;

        public C1048a(PrecomputedText.Params params) {
            this.f3929a = params.getTextPaint();
            this.f3930b = params.getTextDirection();
            this.f3931c = params.getBreakStrategy();
            this.f3932d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        public C1048a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f3929a = textPaint;
            this.f3930b = textDirectionHeuristic;
            this.f3931c = i;
            this.f3932d = i2;
        }

        /* renamed from: a */
        public boolean mo4207a(C1048a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f3931c != aVar.f3931c || this.f3932d != aVar.f3932d)) || this.f3929a.getTextSize() != aVar.f3929a.getTextSize() || this.f3929a.getTextScaleX() != aVar.f3929a.getTextScaleX() || this.f3929a.getTextSkewX() != aVar.f3929a.getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f3929a.getLetterSpacing() != aVar.f3929a.getLetterSpacing() || !TextUtils.equals(this.f3929a.getFontFeatureSettings(), aVar.f3929a.getFontFeatureSettings()))) || this.f3929a.getFlags() != aVar.f3929a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f3929a.getTextLocales().equals(aVar.f3929a.getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f3929a.getTextLocale().equals(aVar.f3929a.getTextLocale())) {
                return false;
            }
            if (this.f3929a.getTypeface() == null) {
                if (aVar.f3929a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3929a.getTypeface().equals(aVar.f3929a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1048a)) {
                return false;
            }
            C1048a aVar = (C1048a) obj;
            if (!mo4207a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f3930b == aVar.f3930b;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C1344x5.m3724F(Float.valueOf(this.f3929a.getTextSize()), Float.valueOf(this.f3929a.getTextScaleX()), Float.valueOf(this.f3929a.getTextSkewX()), Float.valueOf(this.f3929a.getLetterSpacing()), Integer.valueOf(this.f3929a.getFlags()), this.f3929a.getTextLocales(), this.f3929a.getTypeface(), Boolean.valueOf(this.f3929a.isElegantTextHeight()), this.f3930b, Integer.valueOf(this.f3931c), Integer.valueOf(this.f3932d));
            } else if (i >= 21) {
                return C1344x5.m3724F(Float.valueOf(this.f3929a.getTextSize()), Float.valueOf(this.f3929a.getTextScaleX()), Float.valueOf(this.f3929a.getTextSkewX()), Float.valueOf(this.f3929a.getLetterSpacing()), Integer.valueOf(this.f3929a.getFlags()), this.f3929a.getTextLocale(), this.f3929a.getTypeface(), Boolean.valueOf(this.f3929a.isElegantTextHeight()), this.f3930b, Integer.valueOf(this.f3931c), Integer.valueOf(this.f3932d));
            } else if (i >= 18) {
                return C1344x5.m3724F(Float.valueOf(this.f3929a.getTextSize()), Float.valueOf(this.f3929a.getTextScaleX()), Float.valueOf(this.f3929a.getTextSkewX()), Integer.valueOf(this.f3929a.getFlags()), this.f3929a.getTextLocale(), this.f3929a.getTypeface(), this.f3930b, Integer.valueOf(this.f3931c), Integer.valueOf(this.f3932d));
            } else if (i >= 17) {
                return C1344x5.m3724F(Float.valueOf(this.f3929a.getTextSize()), Float.valueOf(this.f3929a.getTextScaleX()), Float.valueOf(this.f3929a.getTextSkewX()), Integer.valueOf(this.f3929a.getFlags()), this.f3929a.getTextLocale(), this.f3929a.getTypeface(), this.f3930b, Integer.valueOf(this.f3931c), Integer.valueOf(this.f3932d));
            } else {
                return C1344x5.m3724F(Float.valueOf(this.f3929a.getTextSize()), Float.valueOf(this.f3929a.getTextScaleX()), Float.valueOf(this.f3929a.getTextSkewX()), Integer.valueOf(this.f3929a.getFlags()), this.f3929a.getTypeface(), this.f3930b, Integer.valueOf(this.f3931c), Integer.valueOf(this.f3932d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00ca  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.String r1 = "textSize="
                java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
                android.text.TextPaint r2 = r4.f3929a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3929a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f3929a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x0087
                java.lang.String r2 = ", letterSpacing="
                java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
                android.text.TextPaint r3 = r4.f3929a
                float r3 = r3.getLetterSpacing()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", elegantTextHeight="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f3929a
                boolean r3 = r3.isElegantTextHeight()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
            L_0x0087:
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x0098
                java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r3)
                android.text.TextPaint r3 = r4.f3929a
                android.os.LocaleList r3 = r3.getTextLocales()
                goto L_0x00a6
            L_0x0098:
                r2 = 17
                if (r1 < r2) goto L_0x00b0
                java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r3)
                android.text.TextPaint r3 = r4.f3929a
                java.util.Locale r3 = r3.getTextLocale()
            L_0x00a6:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
            L_0x00b0:
                java.lang.String r2 = ", typeface="
                java.lang.StringBuilder r2 = p000.C0279ch.m1106c(r2)
                android.text.TextPaint r3 = r4.f3929a
                android.graphics.Typeface r3 = r3.getTypeface()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 26
                if (r1 < r2) goto L_0x00e0
                java.lang.String r1 = ", variationSettings="
                java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
                android.text.TextPaint r2 = r4.f3929a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00e0:
                java.lang.String r1 = ", textDir="
                java.lang.StringBuilder r1 = p000.C0279ch.m1106c(r1)
                android.text.TextDirectionHeuristic r2 = r4.f3930b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f3931c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f3932d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1047r7.C1048a.toString():java.lang.String");
        }
    }

    public char charAt(int i) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i4 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
