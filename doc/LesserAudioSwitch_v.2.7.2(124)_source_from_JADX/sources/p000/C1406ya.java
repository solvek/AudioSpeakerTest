package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ya */
public class C1406ya extends C0263cb {

    /* renamed from: ya$a */
    public class C1407a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f5171a;

        public C1407a(C1406ya yaVar, Rect rect) {
            this.f5171a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f5171a;
        }
    }

    /* renamed from: ya$b */
    public class C1408b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f5172a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f5173b;

        public C1408b(C1406ya yaVar, View view, ArrayList arrayList) {
            this.f5172a = view;
            this.f5173b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f5172a.setVisibility(8);
            int size = this.f5173b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5173b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: ya$c */
    public class C1409c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f5174a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f5175b;

        /* renamed from: c */
        public final /* synthetic */ Object f5176c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f5177d;

        /* renamed from: e */
        public final /* synthetic */ Object f5178e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f5179f;

        public C1409c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5174a = obj;
            this.f5175b = arrayList;
            this.f5176c = obj2;
            this.f5177d = arrayList2;
            this.f5178e = obj3;
            this.f5179f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f5174a;
            if (obj != null) {
                C1406ya.this.mo1728n(obj, this.f5175b, (ArrayList<View>) null);
            }
            Object obj2 = this.f5176c;
            if (obj2 != null) {
                C1406ya.this.mo1728n(obj2, this.f5177d, (ArrayList<View>) null);
            }
            Object obj3 = this.f5178e;
            if (obj3 != null) {
                C1406ya.this.mo1728n(obj3, this.f5179f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: ya$d */
    public class C1410d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f5181a;

        public C1410d(C1406ya yaVar, Runnable runnable) {
            this.f5181a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f5181a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: ya$e */
    public class C1411e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f5182a;

        public C1411e(C1406ya yaVar, Rect rect) {
            this.f5182a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f5182a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5182a;
        }
    }

    /* renamed from: w */
    public static boolean m3867w(Transition transition) {
        return !C0263cb.m1070k(transition.getTargetIds()) || !C0263cb.m1070k(transition.getTargetNames()) || !C0263cb.m1070k(transition.getTargetTypes());
    }

    /* renamed from: a */
    public void mo1718a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo1719b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo1719b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m3867w(transition) && C0263cb.m1070k(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo1720c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo1721e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo1723g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: l */
    public Object mo1726l(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: m */
    public void mo1727m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: n */
    public void mo1728n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1728n(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m3867w(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: o */
    public void mo1729o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1408b(this, view, arrayList));
    }

    /* renamed from: p */
    public void mo1730p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1409c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: q */
    public void mo1731q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1411e(this, rect));
        }
    }

    /* renamed from: r */
    public void mo1732r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo1725j(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1407a(this, rect));
        }
    }

    /* renamed from: s */
    public void mo1733s(Fragment fragment, Object obj, C0521g7 g7Var, Runnable runnable) {
        ((Transition) obj).addListener(new C1410d(this, runnable));
    }

    /* renamed from: t */
    public void mo1734t(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0263cb.m1068d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1719b(transitionSet, arrayList);
    }

    /* renamed from: u */
    public void mo1735u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo1728n(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: v */
    public Object mo1736v(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
