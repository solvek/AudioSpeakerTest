package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: gd */
public class C0528gd extends RecyclerView.C0159l implements RecyclerView.C0167p {

    /* renamed from: D */
    public static final int[] f2277D = {16842919};

    /* renamed from: E */
    public static final int[] f2278E = new int[0];

    /* renamed from: A */
    public int f2279A;

    /* renamed from: B */
    public final Runnable f2280B;

    /* renamed from: C */
    public final RecyclerView.C0168q f2281C;

    /* renamed from: a */
    public final int f2282a;

    /* renamed from: b */
    public final int f2283b;

    /* renamed from: c */
    public final StateListDrawable f2284c;

    /* renamed from: d */
    public final Drawable f2285d;

    /* renamed from: e */
    public final int f2286e;

    /* renamed from: f */
    public final int f2287f;

    /* renamed from: g */
    public final StateListDrawable f2288g;

    /* renamed from: h */
    public final Drawable f2289h;

    /* renamed from: i */
    public final int f2290i;

    /* renamed from: j */
    public final int f2291j;

    /* renamed from: k */
    public int f2292k;

    /* renamed from: l */
    public int f2293l;

    /* renamed from: m */
    public float f2294m;

    /* renamed from: n */
    public int f2295n;

    /* renamed from: o */
    public int f2296o;

    /* renamed from: p */
    public float f2297p;

    /* renamed from: q */
    public int f2298q = 0;

    /* renamed from: r */
    public int f2299r = 0;

    /* renamed from: s */
    public RecyclerView f2300s;

    /* renamed from: t */
    public boolean f2301t = false;

    /* renamed from: u */
    public boolean f2302u = false;

    /* renamed from: v */
    public int f2303v = 0;

    /* renamed from: w */
    public int f2304w = 0;

    /* renamed from: x */
    public final int[] f2305x = new int[2];

    /* renamed from: y */
    public final int[] f2306y = new int[2];

    /* renamed from: z */
    public final ValueAnimator f2307z;

    /* renamed from: gd$a */
    public class C0529a implements Runnable {
        public C0529a() {
        }

        public void run() {
            C0528gd gdVar = C0528gd.this;
            int i = gdVar.f2279A;
            if (i == 1) {
                gdVar.f2307z.cancel();
            } else if (i != 2) {
                return;
            }
            gdVar.f2279A = 3;
            ValueAnimator valueAnimator = gdVar.f2307z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            gdVar.f2307z.setDuration((long) 500);
            gdVar.f2307z.start();
        }
    }

    /* renamed from: gd$b */
    public class C0530b extends RecyclerView.C0168q {
        public C0530b() {
        }

        /* renamed from: b */
        public void mo1367b(RecyclerView recyclerView, int i, int i2) {
            C0528gd gdVar = C0528gd.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = gdVar.f2300s.computeVerticalScrollRange();
            int i3 = gdVar.f2299r;
            gdVar.f2301t = computeVerticalScrollRange - i3 > 0 && i3 >= gdVar.f2282a;
            int computeHorizontalScrollRange = gdVar.f2300s.computeHorizontalScrollRange();
            int i4 = gdVar.f2298q;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= gdVar.f2282a;
            gdVar.f2302u = z;
            boolean z2 = gdVar.f2301t;
            if (z2 || z) {
                if (z2) {
                    float f = (float) i3;
                    gdVar.f2293l = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                    gdVar.f2292k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (gdVar.f2302u) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    gdVar.f2296o = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                    gdVar.f2295n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = gdVar.f2303v;
                if (i5 == 0 || i5 == 1) {
                    gdVar.mo2947k(1);
                }
            } else if (gdVar.f2303v != 0) {
                gdVar.mo2947k(0);
            }
        }
    }

    /* renamed from: gd$c */
    public class C0531c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2310a = false;

        public C0531c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f2310a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2310a) {
                this.f2310a = false;
            } else if (((Float) C0528gd.this.f2307z.getAnimatedValue()).floatValue() == 0.0f) {
                C0528gd gdVar = C0528gd.this;
                gdVar.f2279A = 0;
                gdVar.mo2947k(0);
            } else {
                C0528gd gdVar2 = C0528gd.this;
                gdVar2.f2279A = 2;
                gdVar2.f2300s.invalidate();
            }
        }
    }

    /* renamed from: gd$d */
    public class C0532d implements ValueAnimator.AnimatorUpdateListener {
        public C0532d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0528gd.this.f2284c.setAlpha(floatValue);
            C0528gd.this.f2285d.setAlpha(floatValue);
            C0528gd.this.f2300s.invalidate();
        }
    }

    public C0528gd(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        boolean z = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2307z = ofFloat;
        this.f2279A = 0;
        this.f2280B = new C0529a();
        C0530b bVar = new C0530b();
        this.f2281C = bVar;
        this.f2284c = stateListDrawable;
        this.f2285d = drawable;
        this.f2288g = stateListDrawable2;
        this.f2289h = drawable2;
        this.f2286e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2287f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2290i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2291j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2282a = i2;
        this.f2283b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0531c());
        ofFloat.addUpdateListener(new C0532d());
        RecyclerView recyclerView2 = this.f2300s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.C0160m mVar = recyclerView2.f970n;
                if (mVar != null) {
                    mVar.mo1056d("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f974p.remove(this);
                if (recyclerView2.f974p.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z);
                }
                recyclerView2.mo1116R();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f2300s;
                recyclerView3.f976q.remove(this);
                if (recyclerView3.f978r == this) {
                    recyclerView3.f978r = null;
                }
                List<RecyclerView.C0168q> list = this.f2300s.f963j0;
                if (list != null) {
                    list.remove(bVar);
                }
                mo2943g();
            }
            this.f2300s = recyclerView;
            recyclerView.mo1150g(this);
            this.f2300s.f976q.add(this);
            this.f2300s.mo1172h(bVar);
        }
    }

    /* renamed from: a */
    public void mo1363a(boolean z) {
    }

    /* renamed from: b */
    public boolean mo1364b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2303v;
        if (i == 1) {
            boolean i2 = mo2945i(motionEvent.getX(), motionEvent.getY());
            boolean h = mo2944h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (i2 || h)) {
                if (h) {
                    this.f2304w = 1;
                    this.f2297p = (float) ((int) motionEvent.getX());
                } else if (i2) {
                    this.f2304w = 2;
                    this.f2294m = (float) ((int) motionEvent.getY());
                }
                mo2947k(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo1365c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2303v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean i = mo2945i(motionEvent.getX(), motionEvent.getY());
                boolean h = mo2944h(motionEvent.getX(), motionEvent.getY());
                if (i || h) {
                    if (h) {
                        this.f2304w = 1;
                        this.f2297p = (float) ((int) motionEvent.getX());
                    } else if (i) {
                        this.f2304w = 2;
                        this.f2294m = (float) ((int) motionEvent.getY());
                    }
                    mo2947k(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f2303v == 2) {
                this.f2294m = 0.0f;
                this.f2297p = 0.0f;
                mo2947k(1);
                this.f2304w = 0;
            } else if (motionEvent.getAction() == 2 && this.f2303v == 2) {
                mo2948l();
                if (this.f2304w == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.f2306y;
                    int i2 = this.f2283b;
                    iArr[0] = i2;
                    iArr[1] = this.f2298q - i2;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f2296o) - max) >= 2.0f) {
                        int j = mo2946j(this.f2297p, max, iArr, this.f2300s.computeHorizontalScrollRange(), this.f2300s.computeHorizontalScrollOffset(), this.f2298q);
                        if (j != 0) {
                            this.f2300s.scrollBy(j, 0);
                        }
                        this.f2297p = max;
                    }
                }
                if (this.f2304w == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.f2305x;
                    int i3 = this.f2283b;
                    iArr2[0] = i3;
                    iArr2[1] = this.f2299r - i3;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.f2293l) - max2) >= 2.0f) {
                        int j2 = mo2946j(this.f2294m, max2, iArr2, this.f2300s.computeVerticalScrollRange(), this.f2300s.computeVerticalScrollOffset(), this.f2299r);
                        if (j2 != 0) {
                            this.f2300s.scrollBy(0, j2);
                        }
                        this.f2294m = max2;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void mo1296f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0179x xVar) {
        if (this.f2298q != this.f2300s.getWidth() || this.f2299r != this.f2300s.getHeight()) {
            this.f2298q = this.f2300s.getWidth();
            this.f2299r = this.f2300s.getHeight();
            mo2947k(0);
        } else if (this.f2279A != 0) {
            if (this.f2301t) {
                int i = this.f2298q;
                int i2 = this.f2286e;
                int i3 = i - i2;
                int i4 = this.f2293l;
                int i5 = this.f2292k;
                int i6 = i4 - (i5 / 2);
                this.f2284c.setBounds(0, 0, i2, i5);
                this.f2285d.setBounds(0, 0, this.f2287f, this.f2299r);
                boolean z = true;
                if (C0813m8.m2478l(this.f2300s) != 1) {
                    z = false;
                }
                if (z) {
                    this.f2285d.draw(canvas);
                    canvas.translate((float) this.f2286e, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2284c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i3 = this.f2286e;
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f2285d.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f2284c.draw(canvas);
                }
                canvas.translate((float) (-i3), (float) (-i6));
            }
            if (this.f2302u) {
                int i7 = this.f2299r;
                int i8 = this.f2290i;
                int i9 = i7 - i8;
                int i10 = this.f2296o;
                int i11 = this.f2295n;
                int i12 = i10 - (i11 / 2);
                this.f2288g.setBounds(0, 0, i11, i8);
                this.f2289h.setBounds(0, 0, this.f2298q, this.f2291j);
                canvas.translate(0.0f, (float) i9);
                this.f2289h.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f2288g.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    /* renamed from: g */
    public final void mo2943g() {
        this.f2300s.removeCallbacks(this.f2280B);
    }

    /* renamed from: h */
    public boolean mo2944h(float f, float f2) {
        if (f2 >= ((float) (this.f2299r - this.f2290i))) {
            int i = this.f2296o;
            int i2 = this.f2295n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
        }
    }

    /* renamed from: i */
    public boolean mo2945i(float f, float f2) {
        if (C0813m8.m2478l(this.f2300s) == 1) {
            if (f > ((float) (this.f2286e / 2))) {
                return false;
            }
        } else if (f < ((float) (this.f2298q - this.f2286e))) {
            return false;
        }
        int i = this.f2293l;
        int i2 = this.f2292k / 2;
        if (f2 < ((float) (i - i2)) || f2 > ((float) (i2 + i))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final int mo2946j(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: k */
    public void mo2947k(int i) {
        int i2;
        if (i == 2 && this.f2303v != 2) {
            this.f2284c.setState(f2277D);
            mo2943g();
        }
        if (i == 0) {
            this.f2300s.invalidate();
        } else {
            mo2948l();
        }
        if (this.f2303v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f2303v = i;
        }
        this.f2284c.setState(f2278E);
        i2 = 1200;
        mo2943g();
        this.f2300s.postDelayed(this.f2280B, (long) i2);
        this.f2303v = i;
    }

    /* renamed from: l */
    public void mo2948l() {
        int i = this.f2279A;
        if (i != 0) {
            if (i == 3) {
                this.f2307z.cancel();
            } else {
                return;
            }
        }
        this.f2279A = 1;
        ValueAnimator valueAnimator = this.f2307z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2307z.setDuration(500);
        this.f2307z.setStartDelay(0);
        this.f2307z.start();
    }
}
