package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: nf */
public class C0874nf extends C1060rf implements Animatable {

    /* renamed from: c */
    public C0876b f3374c;

    /* renamed from: d */
    public Context f3375d;

    /* renamed from: e */
    public ArgbEvaluator f3376e;

    /* renamed from: f */
    public final Drawable.Callback f3377f;

    /* renamed from: nf$a */
    public class C0875a implements Drawable.Callback {
        public C0875a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C0874nf.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0874nf.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0874nf.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: nf$b */
    public static class C0876b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f3379a;

        /* renamed from: b */
        public C1110sf f3380b;

        /* renamed from: c */
        public AnimatorSet f3381c;

        /* renamed from: d */
        public ArrayList<Animator> f3382d;

        /* renamed from: e */
        public C0254c4<Animator, String> f3383e;

        public C0876b(C0876b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f3379a = bVar.f3379a;
                C1110sf sfVar = bVar.f3380b;
                if (sfVar != null) {
                    Drawable.ConstantState constantState = sfVar.getConstantState();
                    C1110sf sfVar2 = (C1110sf) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f3380b = sfVar2;
                    sfVar2.mutate();
                    this.f3380b = sfVar2;
                    sfVar2.setCallback(callback);
                    this.f3380b.setBounds(bVar.f3380b.getBounds());
                    this.f3380b.f4192g = false;
                }
                ArrayList<Animator> arrayList = bVar.f3382d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3382d = new ArrayList<>(size);
                    this.f3383e = new C0254c4<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f3382d.get(i);
                        Animator clone = animator.clone();
                        String orDefault = bVar.f3383e.getOrDefault(animator, null);
                        clone.setTarget(this.f3380b.f4188c.f4243b.f4241p.getOrDefault(orDefault, null));
                        this.f3382d.add(clone);
                        this.f3383e.put(clone, orDefault);
                    }
                    if (this.f3381c == null) {
                        this.f3381c = new AnimatorSet();
                    }
                    this.f3381c.playTogether(this.f3382d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f3379a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C0874nf() {
        this((Context) null, (C0876b) null, (Resources) null);
    }

    public C0874nf(Context context, C0876b bVar, Resources resources) {
        this.f3376e = null;
        C0875a aVar = new C0875a();
        this.f3377f = aVar;
        this.f3375d = context;
        this.f3374c = new C0876b((C0876b) null, aVar, (Resources) null);
    }

    /* renamed from: a */
    public final void mo3747a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                mo3747a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3376e == null) {
                    this.f3376e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3376e);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3957b;
        if (drawable != null && Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3957b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3374c.f3380b.draw(canvas);
        if (this.f3374c.f3381c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3957b;
        if (drawable == null) {
            return this.f3374c.f3380b.getAlpha();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3374c.f3379a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3957b;
        if (drawable == null) {
            return this.f3374c.f3380b.getColorFilter();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3957b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0877c(this.f3957b.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3374c.f3380b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3374c.f3380b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.getOpacity() : this.f3374c.f3380b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ IOException | XmlPullParserException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x008c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            android.graphics.drawable.Drawable r5 = r1.f3957b
            r6 = 21
            if (r5 == 0) goto L_0x001c
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r6) goto L_0x0018
            r5.inflate(r0, r2, r3, r4)
            goto L_0x001b
        L_0x0018:
            r5.inflate(r0, r2, r3)
        L_0x001b:
            return
        L_0x001c:
            int r5 = r24.getEventType()
            int r7 = r24.getDepth()
            r8 = 1
            int r7 = r7 + r8
        L_0x0026:
            if (r5 == r8) goto L_0x019e
            int r9 = r24.getDepth()
            if (r9 >= r7) goto L_0x0031
            r9 = 3
            if (r5 == r9) goto L_0x019e
        L_0x0031:
            r9 = 2
            if (r5 != r9) goto L_0x0193
            java.lang.String r5 = r24.getName()
            java.lang.String r10 = "animated-vector"
            boolean r10 = r10.equals(r5)
            r11 = 24
            r12 = 0
            r13 = 0
            if (r10 == 0) goto L_0x00ae
            int[] r5 = p000.C0829mf.f3277e
            android.content.res.TypedArray r5 = p000.C0806m6.m2449j(r0, r4, r3, r5)
            int r10 = r5.getResourceId(r13, r13)
            if (r10 == 0) goto L_0x00a9
            android.graphics.PorterDuff$Mode r14 = p000.C1110sf.f4187k
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r11) goto L_0x0074
            sf r9 = new sf
            r9.<init>()
            if (r14 < r6) goto L_0x0062
            android.graphics.drawable.Drawable r10 = r0.getDrawable(r10, r4)
            goto L_0x0066
        L_0x0062:
            android.graphics.drawable.Drawable r10 = r0.getDrawable(r10)
        L_0x0066:
            r9.f3957b = r10
            sf$i r10 = new sf$i
            android.graphics.drawable.Drawable r11 = r9.f3957b
            android.graphics.drawable.Drawable$ConstantState r11 = r11.getConstantState()
            r10.<init>(r11)
            goto L_0x0095
        L_0x0074:
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0094 }
            android.util.AttributeSet r11 = android.util.Xml.asAttributeSet(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0094 }
        L_0x007c:
            int r14 = r10.next()     // Catch:{ IOException | XmlPullParserException -> 0x0094 }
            if (r14 == r9) goto L_0x0085
            if (r14 == r8) goto L_0x0085
            goto L_0x007c
        L_0x0085:
            if (r14 != r9) goto L_0x008c
            sf r9 = p000.C1110sf.m3171a(r0, r10, r11, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0094 }
            goto L_0x0095
        L_0x008c:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0094 }
            java.lang.String r10 = "No start tag found"
            r9.<init>(r10)     // Catch:{ IOException | XmlPullParserException -> 0x0094 }
            throw r9     // Catch:{ IOException | XmlPullParserException -> 0x0094 }
        L_0x0094:
            r9 = r12
        L_0x0095:
            r9.f4192g = r13
            android.graphics.drawable.Drawable$Callback r10 = r1.f3377f
            r9.setCallback(r10)
            nf$b r10 = r1.f3374c
            sf r10 = r10.f3380b
            if (r10 == 0) goto L_0x00a5
            r10.setCallback(r12)
        L_0x00a5:
            nf$b r10 = r1.f3374c
            r10.f3380b = r9
        L_0x00a9:
            r5.recycle()
            goto L_0x0193
        L_0x00ae:
            java.lang.String r9 = "target"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0193
            int[] r5 = p000.C0829mf.f3278f
            android.content.res.TypedArray r5 = r0.obtainAttributes(r3, r5)
            java.lang.String r9 = r5.getString(r13)
            int r10 = r5.getResourceId(r8, r13)
            if (r10 == 0) goto L_0x018d
            android.content.Context r13 = r1.f3375d
            if (r13 == 0) goto L_0x0182
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 < r11) goto L_0x00d4
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r13, r10)
            r6 = r15
            goto L_0x00f7
        L_0x00d4:
            android.content.res.Resources r14 = r13.getResources()
            android.content.res.Resources$Theme r11 = r13.getTheme()
            java.lang.String r8 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r21 = r14.getAnimation(r10)     // Catch:{ XmlPullParserException -> 0x015d, IOException -> 0x0140 }
            android.util.AttributeSet r17 = android.util.Xml.asAttributeSet(r21)     // Catch:{ XmlPullParserException -> 0x013a, IOException -> 0x0136, all -> 0x0134 }
            r18 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r6 = r15
            r15 = r11
            r16 = r21
            android.animation.Animator r10 = p000.C0926of.m2694a(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ XmlPullParserException -> 0x013a, IOException -> 0x0136, all -> 0x0134 }
            r21.close()
        L_0x00f7:
            nf$b r8 = r1.f3374c
            sf r8 = r8.f3380b
            sf$h r8 = r8.f4188c
            sf$g r8 = r8.f4243b
            c4<java.lang.String, java.lang.Object> r8 = r8.f4241p
            java.lang.Object r8 = r8.getOrDefault(r9, r12)
            r10.setTarget(r8)
            r8 = 21
            if (r6 >= r8) goto L_0x010f
            r1.mo3747a(r10)
        L_0x010f:
            nf$b r6 = r1.f3374c
            java.util.ArrayList<android.animation.Animator> r11 = r6.f3382d
            if (r11 != 0) goto L_0x0125
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r6.f3382d = r11
            nf$b r6 = r1.f3374c
            c4 r11 = new c4
            r11.<init>()
            r6.f3383e = r11
        L_0x0125:
            nf$b r6 = r1.f3374c
            java.util.ArrayList<android.animation.Animator> r6 = r6.f3382d
            r6.add(r10)
            nf$b r6 = r1.f3374c
            c4<android.animation.Animator, java.lang.String> r6 = r6.f3383e
            r6.put(r10, r9)
            goto L_0x018f
        L_0x0134:
            r0 = move-exception
            goto L_0x017c
        L_0x0136:
            r0 = move-exception
            r12 = r21
            goto L_0x0141
        L_0x013a:
            r0 = move-exception
            r12 = r21
            goto L_0x015e
        L_0x013e:
            r0 = move-exception
            goto L_0x017a
        L_0x0140:
            r0 = move-exception
        L_0x0141:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r3.<init>()     // Catch:{ all -> 0x013e }
            r3.append(r8)     // Catch:{ all -> 0x013e }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x013e }
            r3.append(r4)     // Catch:{ all -> 0x013e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x013e }
            r2.<init>(r3)     // Catch:{ all -> 0x013e }
            r2.initCause(r0)     // Catch:{ all -> 0x013e }
            throw r2     // Catch:{ all -> 0x013e }
        L_0x015d:
            r0 = move-exception
        L_0x015e:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r3.<init>()     // Catch:{ all -> 0x013e }
            r3.append(r8)     // Catch:{ all -> 0x013e }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x013e }
            r3.append(r4)     // Catch:{ all -> 0x013e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x013e }
            r2.<init>(r3)     // Catch:{ all -> 0x013e }
            r2.initCause(r0)     // Catch:{ all -> 0x013e }
            throw r2     // Catch:{ all -> 0x013e }
        L_0x017a:
            r21 = r12
        L_0x017c:
            if (r21 == 0) goto L_0x0181
            r21.close()
        L_0x0181:
            throw r0
        L_0x0182:
            r5.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x018d:
            r8 = 21
        L_0x018f:
            r5.recycle()
            goto L_0x0195
        L_0x0193:
            r8 = 21
        L_0x0195:
            int r5 = r24.next()
            r6 = 21
            r8 = 1
            goto L_0x0026
        L_0x019e:
            nf$b r0 = r1.f3374c
            android.animation.AnimatorSet r2 = r0.f3381c
            if (r2 != 0) goto L_0x01ab
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f3381c = r2
        L_0x01ab:
            android.animation.AnimatorSet r2 = r0.f3381c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f3382d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0874nf.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3957b;
        return drawable != null ? C1344x5.m3725G(drawable) : this.f3374c.f3380b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3957b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3374c.f3381c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.isStateful() : this.f3374c.f3380b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3374c.f3380b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.setLevel(i) : this.f3374c.f3380b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3957b;
        return drawable != null ? drawable.setState(iArr) : this.f3374c.f3380b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3374c.f3380b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3734P(drawable, z);
            return;
        }
        C1110sf sfVar = this.f3374c.f3380b;
        Drawable drawable2 = sfVar.f3957b;
        if (drawable2 != null) {
            C1344x5.m3734P(drawable2, z);
        } else {
            sfVar.f4188c.f4246e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C1110sf sfVar = this.f3374c.f3380b;
        Drawable drawable2 = sfVar.f3957b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        sfVar.f4190e = colorFilter;
        sfVar.invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3750c0(drawable, i);
        } else {
            this.f3374c.f3380b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3752d0(drawable, colorStateList);
        } else {
            this.f3374c.f3380b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            C1344x5.m3754e0(drawable, mode);
        } else {
            this.f3374c.f3380b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3374c.f3380b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3374c.f3381c.isStarted()) {
            this.f3374c.f3381c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3957b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3374c.f3381c.end();
        }
    }

    /* renamed from: nf$c */
    public static class C0877c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f3384a;

        public C0877c(Drawable.ConstantState constantState) {
            this.f3384a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3384a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3384a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0874nf nfVar = new C0874nf((Context) null, (C0876b) null, (Resources) null);
            Drawable newDrawable = this.f3384a.newDrawable();
            nfVar.f3957b = newDrawable;
            newDrawable.setCallback(nfVar.f3377f);
            return nfVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0874nf nfVar = new C0874nf((Context) null, (C0876b) null, (Resources) null);
            Drawable newDrawable = this.f3384a.newDrawable(resources);
            nfVar.f3957b = newDrawable;
            newDrawable.setCallback(nfVar.f3377f);
            return nfVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0874nf nfVar = new C0874nf((Context) null, (C0876b) null, (Resources) null);
            Drawable newDrawable = this.f3384a.newDrawable(resources, theme);
            nfVar.f3957b = newDrawable;
            newDrawable.setCallback(nfVar.f3377f);
            return nfVar;
        }
    }
}
