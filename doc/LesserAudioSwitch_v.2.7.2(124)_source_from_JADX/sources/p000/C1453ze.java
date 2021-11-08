package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: ze */
public class C1453ze {

    /* renamed from: a */
    public C1454a f5285a;

    /* renamed from: ze$a */
    public static class C1454a extends ViewGroup {

        /* renamed from: b */
        public ViewGroup f5286b;

        /* renamed from: c */
        public View f5287c;

        /* renamed from: d */
        public ArrayList<Drawable> f5288d = null;

        /* renamed from: e */
        public C1453ze f5289e;

        /* renamed from: f */
        public boolean f5290f;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public C1454a(Context context, ViewGroup viewGroup, View view, C1453ze zeVar) {
            super(context);
            this.f5286b = viewGroup;
            this.f5287c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f5289e = zeVar;
        }

        /* renamed from: a */
        public final void mo5283a() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f5288d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f5290f = true;
                    this.f5286b.removeView(this);
                }
            }
        }

        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f5286b.getLocationOnScreen(iArr);
            this.f5287c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f5287c.getWidth(), this.f5287c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f5288d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5288d.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f5286b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f5286b;
            if (viewGroup instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                int[] iArr3 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                this.f5287c.getLocationOnScreen(iArr3);
                int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                rect.offset(iArr4[0], iArr4[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f5288d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f5288d
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1453ze.C1454a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public C1453ze(Context context, ViewGroup viewGroup, View view) {
        this.f5285a = new C1454a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    public static C1453ze m3960c(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        while (true) {
            if (view2 != null) {
                if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) view2;
                    break;
                } else if (view2.getParent() instanceof ViewGroup) {
                    view2 = (ViewGroup) view2.getParent();
                }
            } else {
                viewGroup = null;
                break;
            }
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C1454a) {
                return ((C1454a) childAt).f5289e;
            }
        }
        return new C1166te(viewGroup.getContext(), viewGroup, view);
    }
}
