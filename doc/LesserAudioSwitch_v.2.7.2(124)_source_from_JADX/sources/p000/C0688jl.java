package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: jl */
public class C0688jl {

    /* renamed from: i */
    public static final int[] f2909i = new int[3];

    /* renamed from: j */
    public static final float[] f2910j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f2911k = new int[4];

    /* renamed from: l */
    public static final float[] f2912l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f2913a = new Paint();

    /* renamed from: b */
    public final Paint f2914b;

    /* renamed from: c */
    public final Paint f2915c;

    /* renamed from: d */
    public int f2916d;

    /* renamed from: e */
    public int f2917e;

    /* renamed from: f */
    public int f2918f;

    /* renamed from: g */
    public final Path f2919g = new Path();

    /* renamed from: h */
    public Paint f2920h = new Paint();

    public C0688jl() {
        mo3465a(-16777216);
        this.f2920h.setColor(0);
        Paint paint = new Paint(4);
        this.f2914b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2915c = new Paint(paint);
    }

    /* renamed from: a */
    public void mo3465a(int i) {
        this.f2916d = C0859n6.m2574c(i, 68);
        this.f2917e = C0859n6.m2574c(i, 20);
        this.f2918f = C0859n6.m2574c(i, 0);
        this.f2913a.setColor(this.f2916d);
    }
}
