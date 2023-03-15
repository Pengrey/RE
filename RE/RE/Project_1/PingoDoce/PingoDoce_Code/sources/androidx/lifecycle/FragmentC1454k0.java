package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1469p;

/* renamed from: androidx.lifecycle.k0 */
/* loaded from: classes.dex */
public class FragmentC1454k0 extends Fragment {

    /* renamed from: w */
    private InterfaceC1455a f4323w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReportFragment.java */
    /* renamed from: androidx.lifecycle.k0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1455a {
        /* renamed from: k */
        void mo37011k();

        /* renamed from: l */
        void mo37010l();

        /* renamed from: m */
        void mo37009m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReportFragment.java */
    /* renamed from: androidx.lifecycle.k0$b */
    /* loaded from: classes.dex */
    public static class C1456b implements Application.ActivityLifecycleCallbacks {
        C1456b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1456b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC1454k0.m37019a(activity, AbstractC1469p.EnumC1471b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC1454k0.m37019a(activity, AbstractC1469p.EnumC1471b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC1454k0.m37019a(activity, AbstractC1469p.EnumC1471b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC1454k0.m37019a(activity, AbstractC1469p.EnumC1471b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC1454k0.m37019a(activity, AbstractC1469p.EnumC1471b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC1454k0.m37019a(activity, AbstractC1469p.EnumC1471b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m37019a(Activity activity, AbstractC1469p.EnumC1471b enumC1471b) {
        if (activity instanceof InterfaceC1495y) {
            ((InterfaceC1495y) activity).mo137b().m36960h(enumC1471b);
        } else if (activity instanceof InterfaceC1491v) {
            AbstractC1469p mo137b = ((InterfaceC1491v) activity).mo137b();
            if (mo137b instanceof C1493x) {
                ((C1493x) mo137b).m36960h(enumC1471b);
            }
        }
    }

    /* renamed from: b */
    private void m37018b(AbstractC1469p.EnumC1471b enumC1471b) {
        if (Build.VERSION.SDK_INT < 29) {
            m37019a(getActivity(), enumC1471b);
        }
    }

    /* renamed from: c */
    private void m37017c(InterfaceC1455a interfaceC1455a) {
        if (interfaceC1455a != null) {
            interfaceC1455a.mo37010l();
        }
    }

    /* renamed from: d */
    private void m37016d(InterfaceC1455a interfaceC1455a) {
        if (interfaceC1455a != null) {
            interfaceC1455a.mo37011k();
        }
    }

    /* renamed from: e */
    private void m37015e(InterfaceC1455a interfaceC1455a) {
        if (interfaceC1455a != null) {
            interfaceC1455a.mo37009m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static FragmentC1454k0 m37014f(Activity activity) {
        return (FragmentC1454k0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m37013g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1456b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1454k0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m37012h(InterfaceC1455a interfaceC1455a) {
        this.f4323w = interfaceC1455a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m37017c(this.f4323w);
        m37018b(AbstractC1469p.EnumC1471b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m37018b(AbstractC1469p.EnumC1471b.ON_DESTROY);
        this.f4323w = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m37018b(AbstractC1469p.EnumC1471b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m37016d(this.f4323w);
        m37018b(AbstractC1469p.EnumC1471b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m37015e(this.f4323w);
        m37018b(AbstractC1469p.EnumC1471b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m37018b(AbstractC1469p.EnumC1471b.ON_STOP);
    }
}
