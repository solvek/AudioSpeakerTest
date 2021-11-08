package p000;

import android.text.Html;
import android.text.SpannableStringBuilder;
import p000.C0584ho;

/* renamed from: po */
public class C0985po<T> {

    /* renamed from: a */
    public T f3710a;

    /* renamed from: po$a */
    public static class C0986a<T extends C1028qo> extends C0985po<C1028qo> {

        /* renamed from: b */
        public String f3711b;

        /* renamed from: c */
        public String f3712c;

        /* renamed from: d */
        public int f3713d = 0;

        /* renamed from: e */
        public C0584ho.C0585a f3714e;

        public C0986a(int i, String str, String str2, C0584ho.C0585a aVar) {
            super(C1028qo.TYPE_UNKNOWN);
            this.f3713d = i;
            this.f3711b = str2;
            this.f3712c = str;
            this.f3714e = aVar;
        }

        public C0986a(C1028qo qoVar, String str, String str2, C0584ho.C0585a aVar) {
            super(qoVar);
            this.f3711b = str2;
            this.f3712c = str;
            this.f3714e = aVar;
        }

        /* renamed from: a */
        public CharSequence mo4044a() {
            String str;
            StringBuilder sb;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f3714e.f2496b);
            spannableStringBuilder.append(" ");
            if (this.f3713d == 0) {
                sb = C0279ch.m1106c("Type: ");
                sb.append(Integer.toHexString(((C1028qo) this.f3710a).f3868b));
                sb.append("/");
                str = ((C1028qo) this.f3710a).toString();
            } else {
                sb = C0279ch.m1106c("Type: ");
                str = Integer.toHexString(this.f3713d);
            }
            sb.append(str);
            sb.append("   ");
            spannableStringBuilder.append(sb.toString());
            spannableStringBuilder.append("Name: " + this.f3712c + "   ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Addr: ");
            sb2.append(this.f3711b);
            spannableStringBuilder.append(sb2.toString());
            return spannableStringBuilder;
        }
    }

    /* renamed from: po$b */
    public static class C0987b<T extends C0544go> extends C0985po<C0544go> {

        /* renamed from: b */
        public boolean f3715b = false;

        public C0987b(C0544go goVar, Boolean bool) {
            super(goVar);
            this.f3715b = bool.booleanValue();
        }

        /* renamed from: a */
        public CharSequence mo4044a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder c = C0279ch.m1106c("Type: ");
            c.append(Integer.toHexString(((C0544go) this.f3710a).f2409b));
            c.append("   ");
            spannableStringBuilder.append(c.toString());
            spannableStringBuilder.append("Name: " + ((C0544go) this.f3710a).f2410c + "   ");
            spannableStringBuilder.append("Conn: ");
            spannableStringBuilder.append(Html.fromHtml(this.f3715b ? "<font color='green'>YES</font>" : "<font color='red'>NO</font>"));
            return spannableStringBuilder;
        }
    }

    public C0985po(T t) {
        this.f3710a = t;
    }

    /* renamed from: a */
    public CharSequence mo4044a() {
        throw null;
    }
}
