package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import p000.C1347x8;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0087b {

    /* renamed from: b */
    public int f1418b;

    /* renamed from: c */
    public int f1419c;

    /* renamed from: d */
    public int f1420d;

    /* renamed from: e */
    public int f1421e;

    /* renamed from: f */
    public boolean f1422f;

    /* renamed from: g */
    public int f1423g;

    /* renamed from: h */
    public boolean f1424h;

    /* renamed from: i */
    public boolean f1425i;

    /* renamed from: j */
    public boolean f1426j;

    /* renamed from: k */
    public int f1427k;

    /* renamed from: l */
    public WeakReference<View> f1428l;

    /* renamed from: m */
    public ValueAnimator f1429m;

    /* renamed from: n */
    public int[] f1430n;

    /* renamed from: o */
    public Drawable f1431o;

    public static class BaseBehavior<T extends AppBarLayout> extends C0026ai<T> {

        /* renamed from: j */
        public int f1432j;

        /* renamed from: k */
        public int f1433k;

        /* renamed from: l */
        public ValueAnimator f1434l;

        /* renamed from: m */
        public int f1435m = -1;

        /* renamed from: n */
        public boolean f1436n;

        /* renamed from: o */
        public float f1437o;

        /* renamed from: p */
        public WeakReference<View> f1438p;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C0290a extends C0718k9 {
            public static final Parcelable.Creator<C0290a> CREATOR = new C0291a();

            /* renamed from: d */
            public int f1439d;

            /* renamed from: e */
            public float f1440e;

            /* renamed from: f */
            public boolean f1441f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public static class C0291a implements Parcelable.ClassLoaderCreator<C0290a> {
                public Object createFromParcel(Parcel parcel) {
                    return new C0290a(parcel, (ClassLoader) null);
                }

                public Object[] newArray(int i) {
                    return new C0290a[i];
                }

                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0290a(parcel, classLoader);
                }
            }

            public C0290a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1439d = parcel.readInt();
                this.f1440e = parcel.readFloat();
                this.f1441f = parcel.readByte() != 0;
            }

            public C0290a(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f2988b, i);
                parcel.writeInt(this.f1439d);
                parcel.writeFloat(this.f1440e);
                parcel.writeByte(this.f1441f ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: J */
        public static boolean m1149J(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: E */
        public int mo113E() {
            return mo1765B() + this.f1432j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
        /* renamed from: H */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo116H(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.mo113E()
                r1 = 0
                if (r11 == 0) goto L_0x00dd
                if (r0 < r11) goto L_0x00dd
                if (r0 > r12) goto L_0x00dd
                int r3 = p000.C1344x5.m3759h(r10, r11, r12)
                if (r0 == r3) goto L_0x00df
                boolean r10 = r9.f1422f
                if (r10 == 0) goto L_0x0086
                int r10 = java.lang.Math.abs(r3)
                int r11 = r9.getChildCount()
                r12 = 0
            L_0x0020:
                if (r12 >= r11) goto L_0x0086
                android.view.View r2 = r9.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.C0292a) r4
                android.view.animation.Interpolator r5 = r4.f1443b
                int r6 = r2.getTop()
                if (r10 < r6) goto L_0x0083
                int r6 = r2.getBottom()
                if (r10 > r6) goto L_0x0083
                if (r5 == 0) goto L_0x0086
                int r11 = r4.f1442a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0057
                int r12 = r2.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r12 = r12 + r1
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0058
                int r11 = p000.C0813m8.m2479m(r2)
                int r12 = r12 - r11
                goto L_0x0058
            L_0x0057:
                r12 = 0
            L_0x0058:
                boolean r11 = p000.C0813m8.m2476j(r2)
                if (r11 == 0) goto L_0x0063
                int r11 = r9.getTopInset()
                int r12 = r12 - r11
            L_0x0063:
                if (r12 <= 0) goto L_0x0086
                int r11 = r2.getTop()
                int r10 = r10 - r11
                float r11 = (float) r12
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r10 = r10 * r11
                int r10 = java.lang.Math.round(r10)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r2.getTop()
                int r12 = r12 + r10
                int r12 = r12 * r11
                goto L_0x0087
            L_0x0083:
                int r12 = r12 + 1
                goto L_0x0020
            L_0x0086:
                r12 = r3
            L_0x0087:
                boolean r10 = r7.mo1766D(r12)
                int r11 = r0 - r3
                int r12 = r3 - r12
                r7.f1432j = r12
                if (r10 != 0) goto L_0x00c6
                boolean r10 = r9.f1422f
                if (r10 == 0) goto L_0x00c6
                p5<android.view.View> r10 = r8.f590c
                j4<T, java.util.ArrayList<T>> r10 = r10.f3564b
                r12 = 0
                java.lang.Object r10 = r10.getOrDefault(r9, r12)
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L_0x00c6
                boolean r12 = r10.isEmpty()
                if (r12 != 0) goto L_0x00c6
            L_0x00aa:
                int r12 = r10.size()
                if (r1 >= r12) goto L_0x00c6
                java.lang.Object r12 = r10.get(r1)
                android.view.View r12 = (android.view.View) r12
                android.view.ViewGroup$LayoutParams r2 = r12.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0091f) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f611a
                if (r2 == 0) goto L_0x00c3
                r2.mo704g(r8, r12, r9)
            L_0x00c3:
                int r1 = r1 + 1
                goto L_0x00aa
            L_0x00c6:
                int r10 = r7.mo1765B()
                r9.mo1810b(r10)
                if (r3 >= r0) goto L_0x00d2
                r10 = -1
                r4 = -1
                goto L_0x00d4
            L_0x00d2:
                r10 = 1
                r4 = 1
            L_0x00d4:
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r0.mo1854Q(r1, r2, r3, r4, r5)
                r1 = r11
                goto L_0x00df
            L_0x00dd:
                r7.f1432j = r1
            L_0x00df:
                r7.mo1853P(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo116H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: I */
        public final void mo1847I(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo113E() - i);
            float abs2 = Math.abs(f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            int E = mo113E();
            if (E == i) {
                ValueAnimator valueAnimator = this.f1434l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1434l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f1434l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f1434l = valueAnimator3;
                valueAnimator3.setInterpolator(C0831mh.f3290e);
                this.f1434l.addUpdateListener(new C1365xh(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f1434l.setDuration((long) Math.min(round, 600));
            this.f1434l.setIntValues(new int[]{E, i});
            this.f1434l.start();
        }

        /* renamed from: K */
        public final View mo1848K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C0368d8) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: L */
        public void mo1849L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.getTotalScrollRange();
                    i3 = i4;
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = mo114F(coordinatorLayout, appBarLayout, i, i3, i2);
                }
            }
            if (appBarLayout.f1426j) {
                appBarLayout.mo1813d(appBarLayout.mo1816e(view));
            }
        }

        /* renamed from: M */
        public void mo1850M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                iArr[1] = mo114F(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i == 0) {
                mo1853P(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L_0x002b;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1851N(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L_0x002a
                boolean r6 = r4.f1426j
                if (r6 != 0) goto L_0x002b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L_0x0012
                r6 = 1
                goto L_0x0013
            L_0x0012:
                r6 = 0
            L_0x0013:
                if (r6 == 0) goto L_0x0026
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L_0x0026
                r3 = 1
                goto L_0x0027
            L_0x0026:
                r3 = 0
            L_0x0027:
                if (r3 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r0 = 0
            L_0x002b:
                if (r0 == 0) goto L_0x0034
                android.animation.ValueAnimator r3 = r2.f1434l
                if (r3 == 0) goto L_0x0034
                r3.cancel()
            L_0x0034:
                r3 = 0
                r2.f1438p = r3
                r2.f1433k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1851N(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        /* renamed from: O */
        public final void mo1852O(CoordinatorLayout coordinatorLayout, T t) {
            int E = mo113E();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0292a aVar = (C0292a) childAt.getLayoutParams();
                if (m1149J(aVar.f1442a, 32)) {
                    top -= aVar.topMargin;
                    bottom += aVar.bottomMargin;
                }
                int i2 = -E;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                C0292a aVar2 = (C0292a) childAt2.getLayoutParams();
                int i3 = aVar2.f1442a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if (m1149J(i3, 2)) {
                        i5 += C0813m8.m2479m(childAt2);
                    } else if (m1149J(i3, 5)) {
                        int m = C0813m8.m2479m(childAt2) + i5;
                        if (E < m) {
                            i4 = m;
                        } else {
                            i5 = m;
                        }
                    }
                    if (m1149J(i3, 32)) {
                        i4 += aVar2.topMargin;
                        i5 -= aVar2.bottomMargin;
                    }
                    if (E < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    mo1847I(coordinatorLayout, t, C1344x5.m3759h(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: P */
        public final void mo1853P(CoordinatorLayout coordinatorLayout, T t) {
            C1347x8.C1348a aVar = C1347x8.C1348a.f5042f;
            C0813m8.m2452A(coordinatorLayout, aVar.mo5067a());
            C1347x8.C1348a aVar2 = C1347x8.C1348a.f5043g;
            C0813m8.m2452A(coordinatorLayout, aVar2.mo5067a());
            View K = mo1848K(coordinatorLayout);
            if (K != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0091f) K.getLayoutParams()).f611a instanceof ScrollingViewBehavior)) {
                if (mo113E() != (-t.getTotalScrollRange()) && K.canScrollVertically(1)) {
                    C0813m8.m2454C(coordinatorLayout, aVar, (CharSequence) null, new C1458zh(this, t, false));
                }
                if (mo113E() == 0) {
                    return;
                }
                if (K.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C0813m8.m2454C(coordinatorLayout, aVar2, (CharSequence) null, new C1418yh(this, coordinatorLayout, t, K, i));
                        return;
                    }
                    return;
                }
                C0813m8.m2454C(coordinatorLayout, aVar2, (CharSequence) null, new C1458zh(this, t, true));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1854Q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x009d
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.C0292a) r0
                int r0 = r0.f1442a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005b
                int r1 = p000.C0813m8.m2479m(r4)
                if (r10 <= 0) goto L_0x0048
                r10 = r0 & 12
                if (r10 == 0) goto L_0x0048
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005b
                goto L_0x0059
            L_0x0048:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x005b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005b
            L_0x0059:
                r9 = 1
                goto L_0x005c
            L_0x005b:
                r9 = 0
            L_0x005c:
                boolean r10 = r8.f1426j
                if (r10 == 0) goto L_0x0068
                android.view.View r9 = r6.mo1848K(r7)
                boolean r9 = r8.mo1816e(r9)
            L_0x0068:
                boolean r9 = r8.mo1813d(r9)
                if (r11 != 0) goto L_0x009a
                if (r9 == 0) goto L_0x009d
                java.util.List r7 = r7.mo654e(r8)
                int r9 = r7.size()
                r10 = 0
            L_0x0079:
                if (r10 >= r9) goto L_0x0098
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0091f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f611a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x0095
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f1275f
                if (r7 == 0) goto L_0x0098
                r2 = 1
                goto L_0x0098
            L_0x0095:
                int r10 = r10 + 1
                goto L_0x0079
            L_0x0098:
                if (r2 == 0) goto L_0x009d
            L_0x009a:
                r8.jumpDrawablesToCurrentState()
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1854Q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: k */
        public boolean mo707k(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo707k(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f1435m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                mo115G(coordinatorLayout, appBarLayout, this.f1436n ? appBarLayout.getTopInset() + C0813m8.m2479m(childAt) + i3 : Math.round(((float) childAt.getHeight()) * this.f1437o) + i3);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        mo1847I(coordinatorLayout, appBarLayout, i4, 0.0f);
                    } else {
                        mo115G(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        mo1847I(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        mo115G(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f1423g = 0;
            this.f1435m = -1;
            mo1766D(C1344x5.m3759h(mo1765B(), -appBarLayout.getTotalScrollRange(), 0));
            mo1854Q(coordinatorLayout, appBarLayout, mo1765B(), 0, true);
            appBarLayout.mo1810b(mo1765B());
            mo1853P(coordinatorLayout, appBarLayout);
            return true;
        }

        /* renamed from: l */
        public boolean mo708l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.C0091f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.mo682s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: p */
        public /* bridge */ /* synthetic */ void mo712p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            mo1849L(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        /* renamed from: r */
        public /* bridge */ /* synthetic */ void mo714r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            mo1850M(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        /* renamed from: u */
        public void mo717u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof C0290a) {
                C0290a aVar = (C0290a) parcelable;
                this.f1435m = aVar.f1439d;
                this.f1437o = aVar.f1440e;
                this.f1436n = aVar.f1441f;
                return;
            }
            this.f1435m = -1;
        }

        /* renamed from: v */
        public Parcelable mo718v(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int B = mo1765B();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + B;
                if (childAt.getTop() + B > 0 || bottom < 0) {
                    i++;
                } else {
                    C0290a aVar = new C0290a(absSavedState);
                    aVar.f1439d = i;
                    if (bottom == appBarLayout.getTopInset() + C0813m8.m2479m(childAt)) {
                        z = true;
                    }
                    aVar.f1441f = z;
                    aVar.f1440e = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* renamed from: x */
        public /* bridge */ /* synthetic */ boolean mo720x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return mo1851N(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        /* renamed from: z */
        public void mo722z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1433k == 0 || i == 1) {
                mo1852O(coordinatorLayout, appBarLayout);
                if (appBarLayout.f1426j) {
                    appBarLayout.mo1813d(appBarLayout.mo1816e(view2));
                }
            }
            this.f1438p = new WeakReference<>(view2);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C0223bi {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0781lh.f3166r);
            this.f1275f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: F */
        public AppBarLayout mo1858F(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public boolean mo701d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: g */
        public boolean mo704g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.C0088c cVar = ((CoordinatorLayout.C0091f) view2.getLayoutParams()).f611a;
            if (cVar instanceof BaseBehavior) {
                C0813m8.m2489w(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f1432j) + this.f1274e) - mo1603E(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f1426j) {
                return false;
            }
            appBarLayout.mo1813d(appBarLayout.mo1816e(view));
            return false;
        }

        /* renamed from: h */
        public void mo705h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0813m8.m2452A(coordinatorLayout, C1347x8.C1348a.f5042f.mo5067a());
                C0813m8.m2452A(coordinatorLayout, C1347x8.C1348a.f5043g.mo5067a());
            }
        }

        /* renamed from: t */
        public boolean mo716t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout F = mo1858F(coordinatorLayout.mo651d(view));
            if (F != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f1272c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    F.mo1811c(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static class C0292a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f1442a = 1;

        /* renamed from: b */
        public Interpolator f1443b;

        public C0292a(int i, int i2) {
            super(i, i2);
        }

        public C0292a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0781lh.f3149a);
            this.f1442a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f1443b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0292a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0292a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0292a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: a */
    public C0292a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0292a((ViewGroup.MarginLayoutParams) layoutParams) : new C0292a(layoutParams) : new C0292a((LinearLayout.LayoutParams) layoutParams);
    }

    /* renamed from: b */
    public void mo1810b(int i) {
        this.f1418b = i;
        if (!willNotDraw()) {
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    /* renamed from: c */
    public void mo1811c(boolean z, boolean z2) {
        this.f1423g = (z ? 1 : 2) | (z2 ? 4 : 0) | 8;
        requestLayout();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0292a;
    }

    /* renamed from: d */
    public boolean mo1813d(boolean z) {
        if (this.f1425i == z) {
            return false;
        }
        this.f1425i = z;
        refreshDrawableState();
        if (this.f1426j && (getBackground() instanceof C1067rl)) {
            C1067rl rlVar = (C1067rl) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f1429m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.f1429m = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f1429m.setInterpolator(C0831mh.f3286a);
            this.f1429m.addUpdateListener(new C1312wh(this, rlVar));
            this.f1429m.start();
        }
        return true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1431o != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f1418b));
            this.f1431o.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1431o;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1816e(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f1428l
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0031
            int r0 = r4.f1427k
            if (r0 == r2) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.f1427k
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f1428l = r3
        L_0x0031:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f1428l
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.canScrollVertically(r2)
            if (r0 != 0) goto L_0x004e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L_0x0050
        L_0x004e:
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.mo1816e(android.view.View):boolean");
    }

    /* renamed from: f */
    public final boolean mo1817f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C0813m8.m2476j(childAt);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0292a(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0292a(getContext(), attributeSet);
    }

    public CoordinatorLayout.C0088c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int m;
        int i2 = this.f1420d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0292a aVar = (C0292a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f1442a;
            if ((i4 & 5) == 5) {
                int i5 = aVar.topMargin + aVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    m = C0813m8.m2479m(childAt);
                } else if ((i4 & 2) != 0) {
                    m = measuredHeight - C0813m8.m2479m(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C0813m8.m2476j(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = m + i5;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f1420d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f1421e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0292a aVar = (C0292a) childAt.getLayoutParams();
            int measuredHeight = aVar.topMargin + aVar.bottomMargin + childAt.getMeasuredHeight();
            int i4 = aVar.f1442a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0813m8.m2479m(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f1421e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f1427k;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m = C0813m8.m2479m(this);
        if (m == 0) {
            int childCount = getChildCount();
            m = childCount >= 1 ? C0813m8.m2479m(getChildAt(childCount - 1)) : 0;
            if (m == 0) {
                return getHeight() / 3;
            }
        }
        return (m * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f1423g;
    }

    public Drawable getStatusBarForeground() {
        return this.f1431o;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f1419c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0292a aVar = (C0292a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f1442a;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + aVar.topMargin + aVar.bottomMargin + i3;
            if (i2 == 0 && C0813m8.m2476j(childAt)) {
                i5 -= getTopInset();
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                i3 -= C0813m8.m2479m(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f1419c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1067rl) {
            C0728kh.m2281J(this, (C1067rl) background);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f1430n == null) {
            this.f1430n = new int[4];
        }
        int[] iArr = this.f1430n;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f1424h;
        iArr[0] = z ? R.attr.state_liftable : -2130903662;
        iArr[1] = (!z || !this.f1425i) ? -2130903663 : R.attr.state_lifted;
        iArr[2] = z ? R.attr.state_collapsible : -2130903660;
        iArr[3] = (!z || !this.f1425i) ? -2130903659 : R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f1428l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1428l = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = true;
        if (C0813m8.m2476j(this) && mo1817f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0813m8.m2489w(getChildAt(childCount), topInset);
            }
        }
        this.f1419c = -1;
        this.f1420d = -1;
        this.f1421e = -1;
        this.f1422f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C0292a) getChildAt(i5).getLayoutParams()).f1443b != null) {
                this.f1422f = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f1431o;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f1426j) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C0292a) getChildAt(i6).getLayoutParams()).f1442a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f1424h != z3) {
            this.f1424h = z3;
            refreshDrawableState();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C0813m8.m2476j(this) && mo1817f()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C1344x5.m3759h(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.f1419c = -1;
        this.f1420d = -1;
        this.f1421e = -1;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C0728kh.m2279H(this, f);
    }

    public void setExpanded(boolean z) {
        mo1811c(z, C0813m8.m2486t(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f1426j = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f1427k = i;
        WeakReference<View> weakReference = this.f1428l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1428l = null;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f1431o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1431o = drawable3;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1431o.setState(getDrawableState());
                }
                C1344x5.m3742X(this.f1431o, C0813m8.m2478l(this));
                this.f1431o.setVisible(getVisibility() == 0, false);
                this.f1431o.setCallback(this);
            }
            if (this.f1431o != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0399e0.m1530b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
            StateListAnimator stateListAnimator = new StateListAnimator();
            long j = (long) integer;
            stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130903663}, ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(j));
            stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, "elevation", new float[]{f}).setDuration(j));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(0));
            setStateListAnimator(stateListAnimator);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1431o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1431o;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m3997generateDefaultLayoutParams() {
        return new C0292a(-1, -2);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m3998generateLayoutParams(AttributeSet attributeSet) {
        return new C0292a(getContext(), attributeSet);
    }
}
