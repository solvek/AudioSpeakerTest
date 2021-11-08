package p000;

import java.io.Writer;

@Deprecated
/* renamed from: v7 */
public class C1240v7 extends Writer {

    /* renamed from: b */
    public final String f4770b;

    /* renamed from: c */
    public StringBuilder f4771c = new StringBuilder(128);

    public C1240v7(String str) {
        this.f4770b = str;
    }

    /* renamed from: a */
    public final void mo4837a() {
        if (this.f4771c.length() > 0) {
            this.f4771c.toString();
            StringBuilder sb = this.f4771c;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo4837a();
    }

    public void flush() {
        mo4837a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo4837a();
            } else {
                this.f4771c.append(c);
            }
        }
    }
}
