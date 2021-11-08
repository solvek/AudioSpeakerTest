package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;

/* renamed from: p2 */
public class C0951p2 extends ListView {

    /* renamed from: b */
    public final Rect f3530b = new Rect();

    /* renamed from: c */
    public int f3531c = 0;

    /* renamed from: d */
    public int f3532d = 0;

    /* renamed from: e */
    public int f3533e = 0;

    /* renamed from: f */
    public int f3534f = 0;

    /* renamed from: g */
    public int f3535g;

    /* renamed from: h */
    public Field f3536h;

    /* renamed from: i */
    public C0952a f3537i;

    /* renamed from: j */
    public boolean f3538j;

    /* renamed from: k */
    public boolean f3539k;

    /* renamed from: l */
    public boolean f3540l;

    /* renamed from: m */
    public C0261c9 f3541m;

    /* renamed from: n */
    public C0953b f3542n;

    /* renamed from: p2$a */
    public static class C0952a extends C0552h0 {

        /* renamed from: c */
        public boolean f3543c = true;

        public C0952a(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.f3543c) {
                this.f2420b.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f3543c) {
                C1344x5.m3739U(this.f2420b, f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3543c) {
                C1344x5.m3740V(this.f2420b, i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f3543c) {
                return this.f2420b.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3543c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: p2$b */
    public class C0953b implements Runnable {
        public C0953b() {
        }

        public void run() {
            C0951p2 p2Var = C0951p2.this;
            p2Var.f3542n = null;
            p2Var.drawableStateChanged();
        }
    }

    public C0951p2(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f3539k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3536h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0952a aVar = this.f3537i;
        if (aVar != null) {
            aVar.f3543c = z;
        }
    }

    /* renamed from: a */
    public int mo3934a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < count) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return (i3 < 0 || i5 <= i3 || i7 <= 0 || i4 == i2) ? i2 : i7;
            }
            if (i3 >= 0 && i5 >= i3) {
                i7 = i4;
            }
            i5++;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3935b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0016
            r0 = 2
            if (r3 == r0) goto L_0x0014
            r0 = 3
            if (r3 == r0) goto L_0x001d
            goto L_0x0129
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x012a
        L_0x0020:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0033
            goto L_0x012b
        L_0x0033:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f3540l = r5
            int r0 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r0 < r11) goto L_0x004a
            r1.drawableHotspotChanged(r7, r6)
        L_0x004a:
            boolean r12 = r16.isPressed()
            if (r12 != 0) goto L_0x0053
            r1.setPressed(r5)
        L_0x0053:
            r16.layoutChildren()
            int r12 = r1.f3535g
            if (r12 == r9) goto L_0x0070
            int r13 = r16.getFirstVisiblePosition()
            int r12 = r12 - r13
            android.view.View r12 = r1.getChildAt(r12)
            if (r12 == 0) goto L_0x0070
            if (r12 == r10) goto L_0x0070
            boolean r13 = r12.isPressed()
            if (r13 == 0) goto L_0x0070
            r12.setPressed(r4)
        L_0x0070:
            r1.f3535g = r8
            int r12 = r10.getLeft()
            float r12 = (float) r12
            float r12 = r7 - r12
            int r13 = r10.getTop()
            float r13 = (float) r13
            float r13 = r6 - r13
            if (r0 < r11) goto L_0x0085
            r10.drawableHotspotChanged(r12, r13)
        L_0x0085:
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x008e
            r10.setPressed(r5)
        L_0x008e:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0098
            if (r8 == r9) goto L_0x0098
            r12 = 1
            goto L_0x0099
        L_0x0098:
            r12 = 0
        L_0x0099:
            if (r12 == 0) goto L_0x009e
            r11.setVisible(r4, r4)
        L_0x009e:
            android.graphics.Rect r0 = r1.f3530b
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.f3531c
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f3532d
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f3533e
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f3534f
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f3536h     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r5 == r0) goto L_0x00f3
            java.lang.reflect.Field r5 = r1.f3536h     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r0 != 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r8 == r9) goto L_0x00f3
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f3:
            if (r12 == 0) goto L_0x010e
            android.graphics.Rect r0 = r1.f3530b
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0107
            r12 = 1
            goto L_0x0108
        L_0x0107:
            r12 = 0
        L_0x0108:
            r11.setVisible(r12, r4)
            p000.C1344x5.m3739U(r11, r5, r0)
        L_0x010e:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0119
            if (r8 == r9) goto L_0x0119
            p000.C1344x5.m3739U(r0, r7, r6)
        L_0x0119:
            r1.setSelectorEnabled(r4)
            r16.refreshDrawableState()
            r5 = 1
            if (r3 != r5) goto L_0x0129
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0129:
            r0 = 1
        L_0x012a:
            r5 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x012f
            if (r5 == 0) goto L_0x0147
        L_0x012f:
            r1.f3540l = r4
            r1.setPressed(r4)
            r16.drawableStateChanged()
            int r3 = r1.f3535g
            int r5 = r16.getFirstVisiblePosition()
            int r3 = r3 - r5
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0147
            r3.setPressed(r4)
        L_0x0147:
            if (r0 == 0) goto L_0x015f
            c9 r3 = r1.f3541m
            if (r3 != 0) goto L_0x0154
            c9 r3 = new c9
            r3.<init>(r1)
            r1.f3541m = r3
        L_0x0154:
            c9 r3 = r1.f3541m
            boolean r4 = r3.f71q
            r5 = 1
            r3.f71q = r5
            r3.onTouch(r1, r2)
            goto L_0x016c
        L_0x015f:
            c9 r2 = r1.f3541m
            if (r2 == 0) goto L_0x016c
            boolean r3 = r2.f71q
            if (r3 == 0) goto L_0x016a
            r2.mo93d()
        L_0x016a:
            r2.f71q = r4
        L_0x016c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0951p2.mo3935b(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: c */
    public final void mo3936c() {
        Drawable selector = getSelector();
        if (selector != null && this.f3540l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f3530b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f3530b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f3542n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            mo3936c();
        }
    }

    public boolean hasFocus() {
        return this.f3539k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f3539k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f3539k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f3539k && this.f3538j) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f3542n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3542n == null) {
            C0953b bVar = new C0953b();
            this.f3542n = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                mo3936c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3535g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0953b bVar = this.f3542n;
        if (bVar != null) {
            C0951p2 p2Var = C0951p2.this;
            p2Var.f3542n = null;
            p2Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f3538j = z;
    }

    public void setSelector(Drawable drawable) {
        C0952a aVar = drawable != null ? new C0952a(drawable) : null;
        this.f3537i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3531c = rect.left;
        this.f3532d = rect.top;
        this.f3533e = rect.right;
        this.f3534f = rect.bottom;
    }
}
