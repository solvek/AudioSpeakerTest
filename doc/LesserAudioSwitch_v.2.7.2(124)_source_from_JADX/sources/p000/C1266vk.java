package p000;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: vk */
public class C1266vk {

    /* renamed from: a */
    public final TextPaint f4819a = new TextPaint(1);

    /* renamed from: b */
    public final C0541gl f4820b = new C1267a();

    /* renamed from: c */
    public float f4821c;

    /* renamed from: d */
    public boolean f4822d = true;

    /* renamed from: e */
    public WeakReference<C1268b> f4823e = new WeakReference<>((Object) null);

    /* renamed from: f */
    public C0427el f4824f;

    /* renamed from: vk$a */
    public class C1267a extends C0541gl {
        public C1267a() {
        }

        /* renamed from: a */
        public void mo2140a(int i) {
            C1266vk vkVar = C1266vk.this;
            vkVar.f4822d = true;
            C1268b bVar = (C1268b) vkVar.f4823e.get();
            if (bVar != null) {
                bVar.mo4698a();
            }
        }

        /* renamed from: b */
        public void mo2141b(Typeface typeface, boolean z) {
            if (!z) {
                C1266vk vkVar = C1266vk.this;
                vkVar.f4822d = true;
                C1268b bVar = (C1268b) vkVar.f4823e.get();
                if (bVar != null) {
                    bVar.mo4698a();
                }
            }
        }
    }

    /* renamed from: vk$b */
    public interface C1268b {
        /* renamed from: a */
        void mo4698a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C1266vk(C1268b bVar) {
        this.f4823e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public float mo4917a(String str) {
        if (!this.f4822d) {
            return this.f4821c;
        }
        float measureText = str == null ? 0.0f : this.f4819a.measureText(str, 0, str.length());
        this.f4821c = measureText;
        this.f4822d = false;
        return measureText;
    }
}
