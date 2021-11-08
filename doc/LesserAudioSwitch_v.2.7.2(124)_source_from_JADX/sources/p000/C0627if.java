package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p000.C0677je;

/* renamed from: if */
public abstract class C0627if extends C0677je {

    /* renamed from: z */
    public static final String[] f2691z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y */
    public int f2692y = 3;

    /* renamed from: if$a */
    public static class C0628a extends AnimatorListenerAdapter implements C0677je.C0681d, C0020ae {

        /* renamed from: a */
        public final View f2693a;

        /* renamed from: b */
        public final int f2694b;

        /* renamed from: c */
        public final ViewGroup f2695c;

        /* renamed from: d */
        public final boolean f2696d;

        /* renamed from: e */
        public boolean f2697e;

        /* renamed from: f */
        public boolean f2698f = false;

        public C0628a(View view, int i, boolean z) {
            this.f2693a = view;
            this.f2694b = i;
            this.f2695c = (ViewGroup) view.getParent();
            this.f2696d = z;
            mo3267g(true);
        }

        /* renamed from: a */
        public void mo2723a(C0677je jeVar) {
        }

        /* renamed from: b */
        public void mo1758b(C0677je jeVar) {
        }

        /* renamed from: c */
        public void mo1759c(C0677je jeVar) {
            mo3266f();
            jeVar.mo3454v(this);
        }

        /* renamed from: d */
        public void mo1760d(C0677je jeVar) {
            mo3267g(false);
        }

        /* renamed from: e */
        public void mo1761e(C0677je jeVar) {
            mo3267g(true);
        }

        /* renamed from: f */
        public final void mo3266f() {
            if (!this.f2698f) {
                C0021af.f95a.mo2724f(this.f2693a, this.f2694b);
                ViewGroup viewGroup = this.f2695c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo3267g(false);
        }

        /* renamed from: g */
        public final void mo3267g(boolean z) {
            ViewGroup viewGroup;
            if (this.f2696d && this.f2697e != z && (viewGroup = this.f2695c) != null) {
                this.f2697e = z;
                C1309we.m3650b(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f2698f = true;
        }

        public void onAnimationEnd(Animator animator) {
            mo3266f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f2698f) {
                C0021af.f95a.mo2724f(this.f2693a, this.f2694b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f2698f) {
                C0021af.f95a.mo2724f(this.f2693a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: if$b */
    public static class C0629b {

        /* renamed from: a */
        public boolean f2699a;

        /* renamed from: b */
        public boolean f2700b;

        /* renamed from: c */
        public int f2701c;

        /* renamed from: d */
        public int f2702d;

        /* renamed from: e */
        public ViewGroup f2703e;

        /* renamed from: f */
        public ViewGroup f2704f;
    }

    /* renamed from: H */
    public final void mo3263H(C1059re reVar) {
        reVar.f3954a.put("android:visibility:visibility", Integer.valueOf(reVar.f3955b.getVisibility()));
        reVar.f3954a.put("android:visibility:parent", reVar.f3955b.getParent());
        int[] iArr = new int[2];
        reVar.f3955b.getLocationOnScreen(iArr);
        reVar.f3954a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f2703e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f2701c == 0) goto L_0x0093;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0627if.C0629b mo3264I(p000.C1059re r8, p000.C1059re r9) {
        /*
            r7 = this;
            if$b r0 = new if$b
            r0.<init>()
            r1 = 0
            r0.f2699a = r1
            r0.f2700b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3954a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3954a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f2701c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3954a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2703e = r6
            goto L_0x0037
        L_0x0033:
            r0.f2701c = r4
            r0.f2703e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f3954a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f3954a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2702d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f3954a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2704f = r2
            goto L_0x005e
        L_0x005a:
            r0.f2702d = r4
            r0.f2704f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f2701c
            int r9 = r0.f2702d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f2703e
            android.view.ViewGroup r4 = r0.f2704f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f2704f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f2703e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f2702d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f2700b = r2
        L_0x008a:
            r0.f2699a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f2701c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f2700b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0627if.mo3264I(re, re):if$b");
    }

    /* renamed from: J */
    public abstract Animator mo2646J(ViewGroup viewGroup, View view, C1059re reVar, C1059re reVar2);

    /* renamed from: d */
    public void mo1742d(C1059re reVar) {
        mo3263H(reVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: android.widget.ImageView} */
    /* JADX WARNING: type inference failed for: r16v7, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (mo3264I(mo3449n(r1, false), mo3450q(r1, false)).f2699a != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r2 = (java.lang.Float) r2.f3954a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ed  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo1744k(android.view.ViewGroup r22, p000.C1059re r23, p000.C1059re r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            if$b r4 = r0.mo3264I(r2, r3)
            boolean r5 = r4.f2699a
            if (r5 == 0) goto L_0x02b0
            android.view.ViewGroup r5 = r4.f2703e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f2704f
            if (r5 == 0) goto L_0x02b0
        L_0x0018:
            boolean r5 = r4.f2700b
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x006a
            int r1 = r0.f2692y
            r1 = r1 & r9
            if (r1 != r9) goto L_0x0068
            if (r3 != 0) goto L_0x0029
            goto L_0x0068
        L_0x0029:
            if (r2 != 0) goto L_0x0044
            android.view.View r1 = r3.f3955b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            re r4 = r0.mo3449n(r1, r10)
            re r1 = r0.mo3450q(r1, r10)
            if$b r1 = r0.mo3264I(r4, r1)
            boolean r1 = r1.f2699a
            if (r1 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            android.view.View r1 = r3.f3955b
            r3 = r0
            de r3 = (p000.C0374de) r3
            if (r2 == 0) goto L_0x005c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f3954a
            java.lang.String r4 = "android:fade:transitionAlpha"
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x005c
            float r2 = r2.floatValue()
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r8 = r2
        L_0x0063:
            android.animation.Animator r6 = r3.mo2647K(r1, r8, r7)
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            return r6
        L_0x006a:
            int r4 = r4.f2702d
            int r5 = r0.f2692y
            r11 = 2
            r5 = r5 & r11
            if (r5 == r11) goto L_0x0076
        L_0x0072:
            r2 = r0
        L_0x0073:
            r6 = 0
            goto L_0x02af
        L_0x0076:
            if (r2 != 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            android.view.View r5 = r2.f3955b
            if (r3 == 0) goto L_0x0080
            android.view.View r12 = r3.f3955b
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            r13 = 2131231053(0x7f08014d, float:1.8078176E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0091
            r19 = r4
            r12 = 0
            goto L_0x0223
        L_0x0091:
            if (r12 == 0) goto L_0x00a2
            android.view.ViewParent r14 = r12.getParent()
            if (r14 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            r14 = 4
            if (r4 != r14) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            if (r5 != r12) goto L_0x00a8
        L_0x00a0:
            r14 = 0
            goto L_0x00a6
        L_0x00a2:
            if (r12 == 0) goto L_0x00a8
            r14 = r12
            r12 = 0
        L_0x00a6:
            r15 = 0
            goto L_0x00ab
        L_0x00a8:
            r12 = 0
            r14 = 0
            r15 = 1
        L_0x00ab:
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00b9
            r19 = r4
            r14 = r5
        L_0x00b6:
            r9 = 0
            goto L_0x0223
        L_0x00b9:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            re r6 = r0.mo3450q(r15, r9)
            re r13 = r0.mo3449n(r15, r9)
            if$b r6 = r0.mo3264I(r6, r13)
            boolean r6 = r6.f2699a
            if (r6 != 0) goto L_0x0206
            boolean r6 = p000.C1016qe.f3822a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            gf r13 = p000.C0021af.f95a
            r13.mo1762g(r5, r6)
            r13.mo1763h(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r8, r8, r14, r15)
            r6.mapRect(r13)
            float r8 = r13.left
            int r8 = java.lang.Math.round(r8)
            float r14 = r13.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.right
            int r15 = java.lang.Math.round(r15)
            float r11 = r13.bottom
            int r11 = java.lang.Math.round(r11)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r7 = r5.getContext()
            r10.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r7)
            boolean r7 = p000.C1016qe.f3822a
            if (r7 == 0) goto L_0x013e
            boolean r7 = r5.isAttachedToWindow()
            r7 = r7 ^ r9
            if (r1 != 0) goto L_0x0139
            goto L_0x013f
        L_0x0139:
            boolean r16 = r22.isAttachedToWindow()
            goto L_0x0141
        L_0x013e:
            r7 = 0
        L_0x013f:
            r16 = 0
        L_0x0141:
            boolean r17 = p000.C1016qe.f3823b
            if (r17 == 0) goto L_0x016e
            if (r7 == 0) goto L_0x016e
            if (r16 != 0) goto L_0x0150
            r19 = r4
            r16 = r12
            r0 = 0
            goto L_0x01eb
        L_0x0150:
            android.view.ViewParent r16 = r5.getParent()
            r9 = r16
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r16 = r9.indexOfChild(r5)
            r18 = r9
            android.view.ViewGroupOverlay r9 = r22.getOverlay()
            r9.add(r5)
            r9 = r18
            r20 = r16
            r16 = r12
            r12 = r20
            goto L_0x0172
        L_0x016e:
            r16 = r12
            r9 = 0
            r12 = 0
        L_0x0172:
            float r18 = r13.width()
            r19 = r4
            int r4 = java.lang.Math.round(r18)
            float r18 = r13.height()
            int r0 = java.lang.Math.round(r18)
            if (r4 <= 0) goto L_0x01dc
            if (r0 <= 0) goto L_0x01dc
            r18 = 1233125376(0x49800000, float:1048576.0)
            int r3 = r4 * r0
            float r3 = (float) r3
            float r3 = r18 / r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = (float) r4
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r4 = r13.left
            float r4 = -r4
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r4, r13)
            r6.postScale(r2, r2)
            boolean r2 = p000.C1016qe.f3824c
            if (r2 == 0) goto L_0x01ca
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r0 = r2.beginRecording(r3, r0)
            r0.concat(r6)
            r5.draw(r0)
            r2.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2)
            goto L_0x01dd
        L_0x01ca:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r0, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L_0x01dd
        L_0x01dc:
            r0 = 0
        L_0x01dd:
            if (r17 == 0) goto L_0x01eb
            if (r7 == 0) goto L_0x01eb
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.remove(r5)
            r9.addView(r5, r12)
        L_0x01eb:
            if (r0 == 0) goto L_0x01f0
            r10.setImageBitmap(r0)
        L_0x01f0:
            int r0 = r15 - r8
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r11 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            r10.layout(r8, r14, r15, r11)
            r14 = r10
            goto L_0x021f
        L_0x0206:
            r19 = r4
            r16 = r12
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x021f
            r2 = -1
            if (r0 == r2) goto L_0x021f
            r1.findViewById(r0)
            goto L_0x021f
        L_0x021b:
            r19 = r4
            r16 = r12
        L_0x021f:
            r12 = r16
            goto L_0x00b6
        L_0x0223:
            if (r14 == 0) goto L_0x027f
            r0 = r23
            if (r9 != 0) goto L_0x025c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f3954a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r7 = 2
            int[] r7 = new int[r7]
            r1.getLocationOnScreen(r7)
            r3 = r7[r3]
            int r4 = r4 - r3
            int r3 = r14.getLeft()
            int r4 = r4 - r3
            r14.offsetLeftAndRight(r4)
            r3 = r7[r6]
            int r2 = r2 - r3
            int r3 = r14.getTop()
            int r2 = r2 - r3
            r14.offsetTopAndBottom(r2)
            ve r2 = p000.C1309we.m3649a(r22)
            r2.mo4644b(r14)
        L_0x025c:
            r2 = r21
            r3 = r24
            android.animation.Animator r6 = r2.mo2646J(r1, r14, r0, r3)
            if (r9 != 0) goto L_0x02af
            if (r6 != 0) goto L_0x0270
            ve r0 = p000.C1309we.m3649a(r22)
            r0.mo4643a(r14)
            goto L_0x02af
        L_0x0270:
            r0 = 2131231053(0x7f08014d, float:1.8078176E38)
            r5.setTag(r0, r14)
            hf r0 = new hf
            r0.<init>(r2, r1, r14, r5)
        L_0x027b:
            r2.mo3439a(r0)
            goto L_0x02af
        L_0x027f:
            r2 = r21
            r0 = r23
            r3 = r24
            if (r12 == 0) goto L_0x0073
            int r4 = r12.getVisibility()
            gf r5 = p000.C0021af.f95a
            r6 = 0
            r5.mo2724f(r12, r6)
            android.animation.Animator r6 = r2.mo2646J(r1, r12, r0, r3)
            if (r6 == 0) goto L_0x02ac
            if$a r0 = new if$a
            r1 = r19
            r3 = 1
            r0.<init>(r12, r1, r3)
            r6.addListener(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r1 < r3) goto L_0x027b
            r6.addPauseListener(r0)
            goto L_0x027b
        L_0x02ac:
            r5.mo2724f(r12, r4)
        L_0x02af:
            return r6
        L_0x02b0:
            r2 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0627if.mo1744k(android.view.ViewGroup, re, re):android.animation.Animator");
    }

    /* renamed from: p */
    public String[] mo1745p() {
        return f2691z;
    }

    /* renamed from: r */
    public boolean mo3265r(C1059re reVar, C1059re reVar2) {
        if (reVar == null && reVar2 == null) {
            return false;
        }
        if (reVar != null && reVar2 != null && reVar2.f3954a.containsKey("android:visibility:visibility") != reVar.f3954a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0629b I = mo3264I(reVar, reVar2);
        if (I.f2699a) {
            return I.f2701c == 0 || I.f2702d == 0;
        }
        return false;
    }
}
