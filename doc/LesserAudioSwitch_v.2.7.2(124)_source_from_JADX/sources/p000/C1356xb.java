package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import p000.C0821mb;

/* renamed from: xb */
public class C1356xb extends Fragment {

    /* renamed from: xb$a */
    public static class C1357a implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C1356xb.m3815a(activity, C0821mb.C0822a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C1356xb.m3815a(activity, C0821mb.C0822a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C1356xb.m3815a(activity, C0821mb.C0822a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C1356xb.m3815a(activity, C0821mb.C0822a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C1356xb.m3815a(activity, C0821mb.C0822a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C1356xb.m3815a(activity, C0821mb.C0822a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m3815a(Activity activity, C0821mb.C0822a aVar) {
        if (activity instanceof C1055rb) {
            ((C1055rb) activity).mo124a().mo4072d(aVar);
        } else if (activity instanceof C0967pb) {
            C0821mb a = ((C0967pb) activity).mo124a();
            if (a instanceof C1011qb) {
                ((C1011qb) a).mo4072d(aVar);
            }
        }
    }

    /* renamed from: c */
    public static void m3816c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C1357a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C1356xb(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo5074b(C0821mb.C0822a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m3815a(getActivity(), aVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo5074b(C0821mb.C0822a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        mo5074b(C0821mb.C0822a.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        mo5074b(C0821mb.C0822a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        mo5074b(C0821mb.C0822a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        mo5074b(C0821mb.C0822a.ON_START);
    }

    public void onStop() {
        super.onStop();
        mo5074b(C0821mb.C0822a.ON_STOP);
    }
}
