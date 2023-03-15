package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0293e;
import androidx.activity.InterfaceC0294f;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0303a;
import androidx.activity.result.InterfaceC0305c;
import androidx.core.p020os.C1008b;
import androidx.fragment.app.AbstractC1382r;
import androidx.fragment.app.C1358e;
import androidx.fragment.app.C1384s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p050d.ActivityResultContract;
import p050d.ActivityResultContracts;
import p050d.C4519c;
import p301q.C9552b;
import p326r2.C9793b;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: O */
    private static boolean f3895O = false;

    /* renamed from: P */
    static boolean f3896P = true;

    /* renamed from: A */
    private AbstractC0304b<IntentSenderRequest> f3897A;

    /* renamed from: B */
    private AbstractC0304b<String[]> f3898B;

    /* renamed from: D */
    private boolean f3899D;

    /* renamed from: E */
    private boolean f3900E;

    /* renamed from: F */
    private boolean f3901F;

    /* renamed from: G */
    private boolean f3902G;

    /* renamed from: H */
    private boolean f3903H;

    /* renamed from: I */
    private ArrayList<C1331a> f3904I;

    /* renamed from: J */
    private ArrayList<Boolean> f3905J;

    /* renamed from: K */
    private ArrayList<Fragment> f3906K;

    /* renamed from: L */
    private ArrayList<C1328p> f3907L;

    /* renamed from: M */
    private C1374m f3908M;

    /* renamed from: b */
    private boolean f3909b;

    /* renamed from: d */
    ArrayList<C1331a> f3910d;

    /* renamed from: e */
    private ArrayList<Fragment> f3911e;

    /* renamed from: g */
    private OnBackPressedDispatcher f3912g;

    /* renamed from: l */
    private ArrayList<InterfaceC1325m> f3913l;

    /* renamed from: r */
    private AbstractC1368i<?> f3914r;

    /* renamed from: s */
    private AbstractC1365f f3915s;

    /* renamed from: t */
    private Fragment f3916t;

    /* renamed from: u */
    Fragment f3917u;

    /* renamed from: z */
    private AbstractC0304b<Intent> f3918z;

    /* renamed from: a */
    private final ArrayList<InterfaceC1326n> f3919a = new ArrayList<>();

    /* renamed from: c */
    private final C1381q f3920c = new C1381q();

    /* renamed from: f */
    private final LayoutInflater$Factory2C1369j f3921f = new LayoutInflater$Factory2C1369j(this);

    /* renamed from: h */
    private final AbstractC0293e f3922h = new C1315c(false);

    /* renamed from: i */
    private final AtomicInteger f3923i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, Bundle> f3924j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Object> f3925k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map<Fragment, HashSet<C1008b>> f3926m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C1384s.InterfaceC1391g f3927n = new C1316d();

    /* renamed from: o */
    private final C1371k f3928o = new C1371k(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<InterfaceC1376n> f3929p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f3930q = -1;

    /* renamed from: v */
    private C1367h f3931v = null;

    /* renamed from: w */
    private C1367h f3932w = new C1317e();

    /* renamed from: x */
    private InterfaceC1415z f3933x = null;

    /* renamed from: y */
    private InterfaceC1415z f3934y = new C1318f(this);

    /* renamed from: C */
    ArrayDeque<LaunchedFragmentInfo> f3935C = new ArrayDeque<>();

    /* renamed from: N */
    private Runnable f3936N = new RunnableC1319g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    /* loaded from: classes.dex */
    class C13116 implements InterfaceC1485s {

        /* renamed from: w */
        final /* synthetic */ String f3937w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC1377o f3938x;

        /* renamed from: y */
        final /* synthetic */ AbstractC1469p f3939y;

        /* renamed from: z */
        final /* synthetic */ FragmentManager f3940z;

        @Override // androidx.lifecycle.InterfaceC1485s
        /* renamed from: n */
        public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
            Bundle bundle;
            if (enumC1471b == AbstractC1469p.EnumC1471b.ON_START && (bundle = (Bundle) this.f3940z.f3924j.get(this.f3937w)) != null) {
                this.f3938x.m37236a(this.f3937w, bundle);
                this.f3940z.m37432r(this.f3937w);
            }
            if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY) {
                this.f3939y.mo10400c(this);
                this.f3940z.f3925k.remove(this.f3937w);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: classes.dex */
    class C1313a implements InterfaceC0303a<ActivityResult> {
        C1313a() {
        }

        @Override // androidx.activity.result.InterfaceC0303a
        /* renamed from: b */
        public void mo37406b(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3935C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3941w;
            int i = pollFirst.f3942x;
            Fragment m37204i = FragmentManager.this.f3920c.m37204i(str);
            if (m37204i == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            m37204i.mo33453y0(i, activityResult.m41351b(), activityResult.m41352a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: classes.dex */
    class C1314b implements InterfaceC0303a<Map<String, Boolean>> {
        C1314b() {
        }

        @Override // androidx.activity.result.InterfaceC0303a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo37406b(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3935C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3941w;
            int i2 = pollFirst.f3942x;
            Fragment m37204i = FragmentManager.this.f3920c.m37204i(str);
            if (m37204i == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            m37204i.mo37607X0(i2, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes.dex */
    class C1315c extends AbstractC0293e {
        C1315c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC0293e
        /* renamed from: b */
        public void mo37404b() {
            FragmentManager.this.m37528D0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: classes.dex */
    class C1316d implements C1384s.InterfaceC1391g {
        C1316d() {
        }

        @Override // androidx.fragment.app.C1384s.InterfaceC1391g
        /* renamed from: a */
        public void mo37144a(Fragment fragment, C1008b c1008b) {
            if (c1008b.m38758c()) {
                return;
            }
            FragmentManager.this.m37469e1(fragment, c1008b);
        }

        @Override // androidx.fragment.app.C1384s.InterfaceC1391g
        /* renamed from: b */
        public void mo37143b(Fragment fragment, C1008b c1008b) {
            FragmentManager.this.m37468f(fragment, c1008b);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: classes.dex */
    class C1317e extends C1367h {
        C1317e() {
        }

        @Override // androidx.fragment.app.C1367h
        /* renamed from: a */
        public Fragment mo37281a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m37419v0().m37306c(FragmentManager.this.m37419v0().m37274g(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: classes.dex */
    class C1318f implements InterfaceC1415z {
        C1318f(FragmentManager fragmentManager) {
        }

        @Override // androidx.fragment.app.InterfaceC1415z
        /* renamed from: a */
        public AbstractC1406y mo37089a(ViewGroup viewGroup) {
            return new C1333b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: classes.dex */
    class RunnableC1319g implements Runnable {
        RunnableC1319g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m37479b0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: classes.dex */
    public class C1320h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3949a;

        /* renamed from: b */
        final /* synthetic */ View f3950b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3951c;

        C1320h(FragmentManager fragmentManager, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3949a = viewGroup;
            this.f3950b = view;
            this.f3951c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3949a.endViewTransition(this.f3950b);
            animator.removeListener(this);
            Fragment fragment = this.f3951c;
            View view = fragment.f3826d0;
            if (view == null || !fragment.f3819V) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: classes.dex */
    class C1321i implements InterfaceC1376n {

        /* renamed from: w */
        final /* synthetic */ Fragment f3952w;

        C1321i(FragmentManager fragmentManager, Fragment fragment) {
            this.f3952w = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC1376n
        /* renamed from: a */
        public void mo37237a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3952w.m37667B0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: classes.dex */
    class C1322j implements InterfaceC0303a<ActivityResult> {
        C1322j() {
        }

        @Override // androidx.activity.result.InterfaceC0303a
        /* renamed from: b */
        public void mo37406b(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3935C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3941w;
            int i = pollFirst.f3942x;
            Fragment m37204i = FragmentManager.this.f3920c.m37204i(str);
            if (m37204i == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            m37204i.mo33453y0(i, activityResult.m41351b(), activityResult.m41352a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: classes.dex */
    static class C1323k extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        C1323k() {
        }

        @Override // p050d.ActivityResultContract
        /* renamed from: d */
        public Intent mo37402d(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m41333a = intentSenderRequest.m41333a();
            if (m41333a != null && (bundleExtra = m41333a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m41333a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m41333a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0302b(intentSenderRequest.m41330d()).m41326b(null).m41325c(intentSenderRequest.m41331c(), intentSenderRequest.m41332b()).m41327a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p050d.ActivityResultContract
        /* renamed from: e */
        public ActivityResult mo37401e(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1324l {
        @Deprecated
        /* renamed from: a */
        public void m37400a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void m37399b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void m37398c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m37397d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: e */
        public void m37396e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void m37395f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void m37394g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void m37393h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void m37392i(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: j */
        public void m37391j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void m37390k(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: l */
        public void m37389l(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: m */
        public abstract void mo35503m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle);

        /* renamed from: n */
        public void m37388n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: classes.dex */
    public interface InterfaceC1325m {
        /* renamed from: a */
        void m37387a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: classes.dex */
    public interface InterfaceC1326n {
        /* renamed from: a */
        boolean mo37371a(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: classes.dex */
    private class C1327o implements InterfaceC1326n {

        /* renamed from: a */
        final String f3954a;

        /* renamed from: b */
        final int f3955b;

        /* renamed from: c */
        final int f3956c;

        C1327o(String str, int i, int i2) {
            this.f3954a = str;
            this.f3955b = i;
            this.f3956c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC1326n
        /* renamed from: a */
        public boolean mo37371a(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3917u;
            if (fragment == null || this.f3955b >= 0 || this.f3954a != null || !fragment.m37657F().m37486Y0()) {
                return FragmentManager.this.m37481a1(arrayList, arrayList2, this.f3954a, this.f3955b, this.f3956c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$p */
    /* loaded from: classes.dex */
    public static class C1328p implements Fragment.InterfaceC1310j {

        /* renamed from: a */
        final boolean f3958a;

        /* renamed from: b */
        final C1331a f3959b;

        /* renamed from: c */
        private int f3960c;

        C1328p(C1331a c1331a, boolean z) {
            this.f3958a = z;
            this.f3959b = c1331a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC1310j
        /* renamed from: a */
        public void mo37386a() {
            int i = this.f3960c - 1;
            this.f3960c = i;
            if (i != 0) {
                return;
            }
            this.f3959b.f3982q.m37442n1();
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC1310j
        /* renamed from: b */
        public void mo37385b() {
            this.f3960c++;
        }

        /* renamed from: c */
        void m37384c() {
            C1331a c1331a = this.f3959b;
            c1331a.f3982q.m37423u(c1331a, this.f3958a, false, false);
        }

        /* renamed from: d */
        void m37383d() {
            boolean z = this.f3960c > 0;
            for (Fragment fragment : this.f3959b.f3982q.m37422u0()) {
                fragment.m37609W1(null);
                if (z && fragment.m37562s0()) {
                    fragment.m37587f2();
                }
            }
            C1331a c1331a = this.f3959b;
            c1331a.f3982q.m37423u(c1331a, this.f3958a, !z, true);
        }

        /* renamed from: e */
        public boolean m37382e() {
            return this.f3960c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public static Fragment m37532B0(View view) {
        Object tag = view.getTag(C9793b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public static boolean m37520H0(int i) {
        return f3895O || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: I0 */
    private boolean m37518I0(Fragment fragment) {
        return (fragment.f3823Z && fragment.f3851a0) || fragment.f3850Q.m37441o();
    }

    /* renamed from: M */
    private void m37511M(Fragment fragment) {
        if (fragment == null || !fragment.equals(m37461h0(fragment.f3847B))) {
            return;
        }
        fragment.m37551w1();
    }

    /* renamed from: P0 */
    private void m37504P0(C9552b<Fragment> c9552b) {
        int size = c9552b.size();
        for (int i = 0; i < size; i++) {
            Fragment m10658q = c9552b.m10658q(i);
            if (!m10658q.f3806H) {
                View m37648I1 = m10658q.m37648I1();
                m10658q.f3831j0 = m37648I1.getAlpha();
                m37648I1.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: T */
    private void m37497T(int i) {
        try {
            this.f3909b = true;
            this.f3920c.m37209d(i);
            m37500R0(i, false);
            if (f3896P) {
                for (AbstractC1406y abstractC1406y : m37429s()) {
                    abstractC1406y.m37111j();
                }
            }
            this.f3909b = false;
            m37479b0(true);
        } catch (Throwable th2) {
            this.f3909b = false;
            throw th2;
        }
    }

    /* renamed from: W */
    private void m37491W() {
        if (this.f3903H) {
            this.f3903H = false;
            m37424t1();
        }
    }

    /* renamed from: Y */
    private void m37487Y() {
        if (f3896P) {
            for (AbstractC1406y abstractC1406y : m37429s()) {
                abstractC1406y.m37111j();
            }
        } else if (!this.f3926m.isEmpty()) {
            for (Fragment fragment : this.f3926m.keySet()) {
                m37444n(fragment);
                m37498S0(fragment);
            }
        }
    }

    /* renamed from: Z0 */
    private boolean m37484Z0(String str, int i, int i2) {
        m37479b0(false);
        m37482a0(true);
        Fragment fragment = this.f3917u;
        if (fragment == null || i >= 0 || str != null || !fragment.m37657F().m37486Y0()) {
            boolean m37481a1 = m37481a1(this.f3904I, this.f3905J, str, i, i2);
            if (m37481a1) {
                this.f3909b = true;
                try {
                    m37463g1(this.f3904I, this.f3905J);
                } finally {
                    m37435q();
                }
            }
            m37415w1();
            m37491W();
            this.f3920c.m37211b();
            return m37481a1;
        }
        return true;
    }

    /* renamed from: a0 */
    private void m37482a0(boolean z) {
        if (!this.f3909b) {
            if (this.f3914r == null) {
                if (this.f3902G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f3914r.m37273j().getLooper()) {
                if (!z) {
                    m37438p();
                }
                if (this.f3904I == null) {
                    this.f3904I = new ArrayList<>();
                    this.f3905J = new ArrayList<>();
                }
                this.f3909b = true;
                try {
                    m37464g0(null, null);
                    return;
                } finally {
                    this.f3909b = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: b1 */
    private int m37478b1(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C9552b<Fragment> c9552b) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C1331a c1331a = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (c1331a.m37375C() && !c1331a.m37377A(arrayList, i4 + 1, i2)) {
                if (this.f3907L == null) {
                    this.f3907L = new ArrayList<>();
                }
                C1328p c1328p = new C1328p(c1331a, booleanValue);
                this.f3907L.add(c1328p);
                c1331a.m37373E(c1328p);
                if (booleanValue) {
                    c1331a.m37366v();
                } else {
                    c1331a.m37365w(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c1331a);
                }
                m37474d(c9552b);
            }
        }
        return i3;
    }

    /* renamed from: d */
    private void m37474d(C9552b<Fragment> c9552b) {
        int i = this.f3930q;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 5);
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment.f3846w < min) {
                m37496T0(fragment, min);
                if (fragment.f3826d0 != null && !fragment.f3819V && fragment.f3829h0) {
                    c9552b.add(fragment);
                }
            }
        }
    }

    /* renamed from: d0 */
    private static void m37473d0(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1331a c1331a = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c1331a.m37370r(-1);
                c1331a.m37365w(i == i2 + (-1));
            } else {
                c1331a.m37370r(1);
                c1331a.m37366v();
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int, boolean] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m37470e0(java.util.ArrayList<androidx.fragment.app.C1331a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m37470e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: g0 */
    private void m37464g0(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C1328p> arrayList3 = this.f3907L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C1328p c1328p = this.f3907L.get(i);
            if (arrayList != null && !c1328p.f3958a && (indexOf2 = arrayList.indexOf(c1328p.f3959b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f3907L.remove(i);
                i--;
                size--;
                c1328p.m37384c();
            } else if (c1328p.m37382e() || (arrayList != null && c1328p.f3959b.m37377A(arrayList, 0, arrayList.size()))) {
                this.f3907L.remove(i);
                i--;
                size--;
                if (arrayList != null && !c1328p.f3958a && (indexOf = arrayList.indexOf(c1328p.f3959b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                    c1328p.m37384c();
                } else {
                    c1328p.m37383d();
                }
            }
            i++;
        }
    }

    /* renamed from: g1 */
    private void m37463g1(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            m37464g0(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f4113o) {
                    if (i2 != i) {
                        m37470e0(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f4113o) {
                            i2++;
                        }
                    }
                    m37470e0(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m37470e0(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* renamed from: i1 */
    private void m37457i1() {
        if (this.f3913l != null) {
            for (int i = 0; i < this.f3913l.size(); i++) {
                this.f3913l.get(i).m37387a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public static int m37451k1(int i) {
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    /* renamed from: l0 */
    private void m37449l0() {
        if (f3896P) {
            for (AbstractC1406y abstractC1406y : m37429s()) {
                abstractC1406y.m37110k();
            }
        } else if (this.f3907L != null) {
            while (!this.f3907L.isEmpty()) {
                this.f3907L.remove(0).m37383d();
            }
        }
    }

    /* renamed from: m0 */
    private boolean m37446m0(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3919a) {
            if (this.f3919a.isEmpty()) {
                return false;
            }
            int size = this.f3919a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f3919a.get(i).mo37371a(arrayList, arrayList2);
            }
            this.f3919a.clear();
            this.f3914r.m37273j().removeCallbacks(this.f3936N);
            return z;
        }
    }

    /* renamed from: n */
    private void m37444n(Fragment fragment) {
        HashSet<C1008b> hashSet = this.f3926m.get(fragment);
        if (hashSet != null) {
            Iterator<C1008b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m38760a();
            }
            hashSet.clear();
            m37414x(fragment);
            this.f3926m.remove(fragment);
        }
    }

    /* renamed from: o0 */
    private C1374m m37440o0(Fragment fragment) {
        return this.f3908M.m37245j(fragment);
    }

    /* renamed from: p */
    private void m37438p() {
        if (m37510M0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q */
    private void m37435q() {
        this.f3909b = false;
        this.f3905J.clear();
        this.f3904I.clear();
    }

    /* renamed from: r0 */
    private ViewGroup m37431r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f3825c0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3817T > 0 && this.f3915s.mo37276e()) {
            View mo37277d = this.f3915s.mo37277d(fragment.f3817T);
            if (mo37277d instanceof ViewGroup) {
                return (ViewGroup) mo37277d;
            }
        }
        return null;
    }

    /* renamed from: r1 */
    private void m37430r1(Fragment fragment) {
        ViewGroup m37431r0 = m37431r0(fragment);
        if (m37431r0 == null || fragment.m37651H() + fragment.m37644K() + fragment.m37614V() + fragment.m37611W() <= 0) {
            return;
        }
        int i = C9793b.visible_removing_fragment_view_tag;
        if (m37431r0.getTag(i) == null) {
            m37431r0.setTag(i, fragment);
        }
        ((Fragment) m37431r0.getTag(i)).m37606X1(fragment.m37617U());
    }

    /* renamed from: s */
    private Set<AbstractC1406y> m37429s() {
        HashSet hashSet = new HashSet();
        for (C1378p c1378p : this.f3920c.m37202k()) {
            ViewGroup viewGroup = c1378p.m37225k().f3825c0;
            if (viewGroup != null) {
                hashSet.add(AbstractC1406y.m37106o(viewGroup, m37534A0()));
            }
        }
        return hashSet;
    }

    /* renamed from: t */
    private Set<AbstractC1406y> m37426t(ArrayList<C1331a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC1382r.C1383a> it = arrayList.get(i).f4112a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4115b;
                if (fragment != null && (viewGroup = fragment.f3825c0) != null) {
                    hashSet.add(AbstractC1406y.m37107n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: t1 */
    private void m37424t1() {
        for (C1378p c1378p : this.f3920c.m37202k()) {
            m37490W0(c1378p);
        }
    }

    /* renamed from: u1 */
    private void m37421u1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1405x("FragmentManager"));
        AbstractC1368i<?> abstractC1368i = this.f3914r;
        if (abstractC1368i != null) {
            try {
                abstractC1368i.mo37272k("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m37489X("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: v */
    private void m37420v(Fragment fragment) {
        Animator animator;
        if (fragment.f3826d0 != null) {
            C1358e.C1363d m37308c = C1358e.m37308c(this.f3914r.m37274g(), fragment, !fragment.f3819V, fragment.m37617U());
            if (m37308c != null && (animator = m37308c.f4061b) != null) {
                animator.setTarget(fragment.f3826d0);
                if (fragment.f3819V) {
                    if (fragment.m37569p0()) {
                        fragment.m37621S1(false);
                    } else {
                        ViewGroup viewGroup = fragment.f3825c0;
                        View view = fragment.f3826d0;
                        viewGroup.startViewTransition(view);
                        m37308c.f4061b.addListener(new C1320h(this, viewGroup, view, fragment));
                    }
                } else {
                    fragment.f3826d0.setVisibility(0);
                }
                m37308c.f4061b.start();
            } else {
                if (m37308c != null) {
                    fragment.f3826d0.startAnimation(m37308c.f4060a);
                    m37308c.f4060a.start();
                }
                fragment.f3826d0.setVisibility((!fragment.f3819V || fragment.m37569p0()) ? 0 : 8);
                if (fragment.m37569p0()) {
                    fragment.m37621S1(false);
                }
            }
        }
        m37524F0(fragment);
        fragment.f3830i0 = false;
        fragment.m37637N0(fragment.f3819V);
    }

    /* renamed from: w1 */
    private void m37415w1() {
        synchronized (this.f3919a) {
            boolean z = true;
            if (!this.f3919a.isEmpty()) {
                this.f3922h.m41353f(true);
            } else {
                this.f3922h.m41353f((m37443n0() <= 0 || !m37514K0(this.f3916t)) ? false : false);
            }
        }
    }

    /* renamed from: x */
    private void m37414x(Fragment fragment) {
        fragment.m37574m1();
        this.f3928o.m37251n(fragment, false);
        fragment.f3825c0 = null;
        fragment.f3826d0 = null;
        fragment.f3836o0 = null;
        fragment.f3837p0.mo166p(null);
        fragment.f3809K = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m37535A() {
        this.f3900E = false;
        this.f3901F = false;
        this.f3908M.m37239p(false);
        m37497T(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public InterfaceC1415z m37534A0() {
        InterfaceC1415z interfaceC1415z = this.f3933x;
        if (interfaceC1415z != null) {
            return interfaceC1415z;
        }
        Fragment fragment = this.f3916t;
        if (fragment != null) {
            return fragment.f3813O.m37534A0();
        }
        return this.f3934y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m37533B(Configuration configuration) {
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null) {
                fragment.m37585g1(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m37531C(MenuItem menuItem) {
        if (this.f3930q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null && fragment.m37583h1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public C1486s0 m37530C0(Fragment fragment) {
        return this.f3908M.m37242m(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m37529D() {
        this.f3900E = false;
        this.f3901F = false;
        this.f3908M.m37239p(false);
        m37497T(1);
    }

    /* renamed from: D0 */
    void m37528D0() {
        m37479b0(true);
        if (this.f3922h.m41356c()) {
            m37486Y0();
        } else {
            this.f3912g.m41358c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean m37527E(Menu menu, MenuInflater menuInflater) {
        if (this.f3930q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null && m37516J0(fragment) && fragment.m37579j1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f3911e != null) {
            for (int i = 0; i < this.f3911e.size(); i++) {
                Fragment fragment2 = this.f3911e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m37646J0();
                }
            }
        }
        this.f3911e = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m37526E0(Fragment fragment) {
        if (m37520H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f3819V) {
            return;
        }
        fragment.f3819V = true;
        fragment.f3830i0 = true ^ fragment.f3830i0;
        m37430r1(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m37525F() {
        this.f3902G = true;
        m37479b0(true);
        m37487Y();
        m37497T(-1);
        this.f3914r = null;
        this.f3915s = null;
        this.f3916t = null;
        if (this.f3912g != null) {
            this.f3922h.m41355d();
            this.f3912g = null;
        }
        AbstractC0304b<Intent> abstractC0304b = this.f3918z;
        if (abstractC0304b != null) {
            abstractC0304b.mo37538c();
            this.f3897A.mo37538c();
            this.f3898B.mo37538c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void m37524F0(Fragment fragment) {
        if (fragment.f3806H && m37518I0(fragment)) {
            this.f3899D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m37523G() {
        m37497T(1);
    }

    /* renamed from: G0 */
    public boolean m37522G0() {
        return this.f3902G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m37521H() {
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null) {
                fragment.m37568p1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m37519I(boolean z) {
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null) {
                fragment.m37566q1(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m37517J(Fragment fragment) {
        Iterator<InterfaceC1376n> it = this.f3929p.iterator();
        while (it.hasNext()) {
            it.next().mo37237a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean m37516J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.m37565r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean m37515K(MenuItem menuItem) {
        if (this.f3930q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null && fragment.m37564r1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean m37514K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f3813O;
        return fragment.equals(fragmentManager.m37409z0()) && m37514K0(fragmentManager.f3916t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m37513L(Menu menu) {
        if (this.f3930q < 1) {
            return;
        }
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null) {
                fragment.m37561s1(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean m37512L0(int i) {
        return this.f3930q >= i;
    }

    /* renamed from: M0 */
    public boolean m37510M0() {
        return this.f3900E || this.f3901F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m37509N() {
        m37497T(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m37508N0(Fragment fragment, String[] strArr, int i) {
        if (this.f3898B != null) {
            this.f3935C.addLast(new LaunchedFragmentInfo(fragment.f3847B, i));
            this.f3898B.m41324a(strArr);
            return;
        }
        this.f3914r.m37269n(fragment, strArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m37507O(boolean z) {
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null) {
                fragment.m37557u1(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m37506O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f3918z != null) {
            this.f3935C.addLast(new LaunchedFragmentInfo(fragment.f3847B, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3918z.m41324a(intent);
            return;
        }
        this.f3914r.m37266q(fragment, intent, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean m37505P(Menu menu) {
        boolean z = false;
        if (this.f3930q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null && m37516J0(fragment) && fragment.m37554v1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m37503Q() {
        m37415w1();
        m37511M(this.f3917u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void m37502Q0(Fragment fragment) {
        if (!this.f3920c.m37210c(fragment.f3847B)) {
            if (m37520H0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3930q + "since it is not added to " + this);
                return;
            }
            return;
        }
        m37498S0(fragment);
        View view = fragment.f3826d0;
        if (view != null && fragment.f3829h0 && fragment.f3825c0 != null) {
            float f = fragment.f3831j0;
            if (f > 0.0f) {
                view.setAlpha(f);
            }
            fragment.f3831j0 = 0.0f;
            fragment.f3829h0 = false;
            C1358e.C1363d m37308c = C1358e.m37308c(this.f3914r.m37274g(), fragment, true, fragment.m37617U());
            if (m37308c != null) {
                Animation animation = m37308c.f4060a;
                if (animation != null) {
                    fragment.f3826d0.startAnimation(animation);
                } else {
                    m37308c.f4061b.setTarget(fragment.f3826d0);
                    m37308c.f4061b.start();
                }
            }
        }
        if (fragment.f3830i0) {
            m37420v(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m37501R() {
        this.f3900E = false;
        this.f3901F = false;
        this.f3908M.m37239p(false);
        m37497T(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void m37500R0(int i, boolean z) {
        AbstractC1368i<?> abstractC1368i;
        if (this.f3914r == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f3930q) {
            this.f3930q = i;
            if (f3896P) {
                this.f3920c.m37195r();
            } else {
                for (Fragment fragment : this.f3920c.m37199n()) {
                    m37502Q0(fragment);
                }
                for (C1378p c1378p : this.f3920c.m37202k()) {
                    Fragment m37225k = c1378p.m37225k();
                    if (!m37225k.f3829h0) {
                        m37502Q0(m37225k);
                    }
                    if (m37225k.f3807I && !m37225k.m37567q0()) {
                        this.f3920c.m37196q(c1378p);
                    }
                }
            }
            m37424t1();
            if (this.f3899D && (abstractC1368i = this.f3914r) != null && this.f3930q == 7) {
                abstractC1368i.mo37265r();
                this.f3899D = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m37499S() {
        this.f3900E = false;
        this.f3901F = false;
        this.f3908M.m37239p(false);
        m37497T(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void m37498S0(Fragment fragment) {
        m37496T0(fragment, this.f3930q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m37496T0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m37496T0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m37495U() {
        this.f3901F = true;
        this.f3908M.m37239p(true);
        m37497T(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m37494U0() {
        if (this.f3914r == null) {
            return;
        }
        this.f3900E = false;
        this.f3901F = false;
        this.f3908M.m37239p(false);
        for (Fragment fragment : this.f3920c.m37199n()) {
            if (fragment != null) {
                fragment.m37552w0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m37493V() {
        m37497T(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void m37492V0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C1378p c1378p : this.f3920c.m37202k()) {
            Fragment m37225k = c1378p.m37225k();
            if (m37225k.f3817T == fragmentContainerView.getId() && (view = m37225k.f3826d0) != null && view.getParent() == null) {
                m37225k.f3825c0 = fragmentContainerView;
                c1378p.m37234b();
            }
        }
    }

    /* renamed from: W0 */
    void m37490W0(C1378p c1378p) {
        Fragment m37225k = c1378p.m37225k();
        if (m37225k.f3827e0) {
            if (this.f3909b) {
                this.f3903H = true;
                return;
            }
            m37225k.f3827e0 = false;
            if (f3896P) {
                c1378p.m37223m();
            } else {
                m37498S0(m37225k);
            }
        }
    }

    /* renamed from: X */
    public void m37489X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3920c.m37208e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3911e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3911e.get(i).toString());
            }
        }
        ArrayList<C1331a> arrayList2 = this.f3910d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1331a c1331a = this.f3910d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c1331a.toString());
                c1331a.m37368t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3923i.get());
        synchronized (this.f3919a) {
            int size3 = this.f3919a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3919a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3914r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3915s);
        if (this.f3916t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3916t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3930q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3900E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3901F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3902G);
        if (this.f3899D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3899D);
        }
    }

    /* renamed from: X0 */
    public void m37488X0(int i, int i2) {
        if (i >= 0) {
            m37485Z(new C1327o(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: Y0 */
    public boolean m37486Y0() {
        return m37484Z0(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m37485Z(InterfaceC1326n interfaceC1326n, boolean z) {
        if (!z) {
            if (this.f3914r == null) {
                if (this.f3902G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m37438p();
        }
        synchronized (this.f3919a) {
            if (this.f3914r == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f3919a.add(interfaceC1326n);
            m37442n1();
        }
    }

    /* renamed from: a1 */
    boolean m37481a1(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C1331a> arrayList3 = this.f3910d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3910d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1331a c1331a = this.f3910d.get(size2);
                    if ((str != null && str.equals(c1331a.m37363y())) || (i >= 0 && i == c1331a.f3984s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1331a c1331a2 = this.f3910d.get(size2);
                        if (str == null || !str.equals(c1331a2.m37363y())) {
                            if (i < 0 || i != c1331a2.f3984s) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f3910d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3910d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f3910d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean m37479b0(boolean z) {
        m37482a0(z);
        boolean z2 = false;
        while (m37446m0(this.f3904I, this.f3905J)) {
            this.f3909b = true;
            try {
                m37463g1(this.f3904I, this.f3905J);
                m37435q();
                z2 = true;
            } catch (Throwable th2) {
                m37435q();
                throw th2;
            }
        }
        m37415w1();
        m37491W();
        this.f3920c.m37211b();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m37476c0(InterfaceC1326n interfaceC1326n, boolean z) {
        if (z && (this.f3914r == null || this.f3902G)) {
            return;
        }
        m37482a0(z);
        if (interfaceC1326n.mo37371a(this.f3904I, this.f3905J)) {
            this.f3909b = true;
            try {
                m37463g1(this.f3904I, this.f3905J);
            } finally {
                m37435q();
            }
        }
        m37415w1();
        m37491W();
        this.f3920c.m37211b();
    }

    /* renamed from: c1 */
    public void m37475c1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f3813O != this) {
            m37421u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f3847B);
    }

    /* renamed from: d1 */
    public void m37472d1(AbstractC1324l abstractC1324l, boolean z) {
        this.f3928o.m37250o(abstractC1324l, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37471e(C1331a c1331a) {
        if (this.f3910d == null) {
            this.f3910d = new ArrayList<>();
        }
        this.f3910d.add(c1331a);
    }

    /* renamed from: e1 */
    void m37469e1(Fragment fragment, C1008b c1008b) {
        HashSet<C1008b> hashSet = this.f3926m.get(fragment);
        if (hashSet != null && hashSet.remove(c1008b) && hashSet.isEmpty()) {
            this.f3926m.remove(fragment);
            if (fragment.f3846w < 5) {
                m37414x(fragment);
                m37498S0(fragment);
            }
        }
    }

    /* renamed from: f */
    void m37468f(Fragment fragment, C1008b c1008b) {
        if (this.f3926m.get(fragment) == null) {
            this.f3926m.put(fragment, new HashSet<>());
        }
        this.f3926m.get(fragment).add(c1008b);
    }

    /* renamed from: f0 */
    public boolean m37467f0() {
        boolean m37479b0 = m37479b0(true);
        m37449l0();
        return m37479b0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void m37466f1(Fragment fragment) {
        if (m37520H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3812N);
        }
        boolean z = !fragment.m37567q0();
        if (!fragment.f3820W || z) {
            this.f3920c.m37194s(fragment);
            if (m37518I0(fragment)) {
                this.f3899D = true;
            }
            fragment.f3807I = true;
            m37430r1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C1378p m37465g(Fragment fragment) {
        if (m37520H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1378p m37417w = m37417w(fragment);
        fragment.f3813O = this;
        this.f3920c.m37197p(m37417w);
        if (!fragment.f3820W) {
            this.f3920c.m37212a(fragment);
            fragment.f3807I = false;
            if (fragment.f3826d0 == null) {
                fragment.f3830i0 = false;
            }
            if (m37518I0(fragment)) {
                this.f3899D = true;
            }
        }
        return m37417w;
    }

    /* renamed from: h */
    public void m37462h(InterfaceC1376n interfaceC1376n) {
        this.f3929p.add(interfaceC1376n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public Fragment m37461h0(String str) {
        return this.f3920c.m37207f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void m37460h1(Fragment fragment) {
        this.f3908M.m37240o(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m37459i(Fragment fragment) {
        this.f3908M.m37248g(fragment);
    }

    /* renamed from: i0 */
    public Fragment m37458i0(int i) {
        return this.f3920c.m37206g(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m37456j() {
        return this.f3923i.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment m37455j0(String str) {
        return this.f3920c.m37205h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void m37454j1(Parcelable parcelable) {
        C1378p c1378p;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f3965w == null) {
            return;
        }
        this.f3920c.m37193t();
        Iterator<FragmentState> it = fragmentManagerState.f3965w.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment m37246i = this.f3908M.m37246i(next.f3979x);
                if (m37246i != null) {
                    if (m37520H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m37246i);
                    }
                    c1378p = new C1378p(this.f3928o, this.f3920c, m37246i, next);
                } else {
                    c1378p = new C1378p(this.f3928o, this.f3920c, this.f3914r.m37274g().getClassLoader(), m37428s0(), next);
                }
                Fragment m37225k = c1378p.m37225k();
                m37225k.f3813O = this;
                if (m37520H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m37225k.f3847B + "): " + m37225k);
                }
                c1378p.m37221o(this.f3914r.m37274g().getClassLoader());
                this.f3920c.m37197p(c1378p);
                c1378p.m37215u(this.f3930q);
            }
        }
        for (Fragment fragment : this.f3908M.m37243l()) {
            if (!this.f3920c.m37210c(fragment.f3847B)) {
                if (m37520H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3965w);
                }
                this.f3908M.m37240o(fragment);
                fragment.f3813O = this;
                C1378p c1378p2 = new C1378p(this.f3928o, this.f3920c, fragment);
                c1378p2.m37215u(1);
                c1378p2.m37223m();
                fragment.f3807I = true;
                c1378p2.m37223m();
            }
        }
        this.f3920c.m37192u(fragmentManagerState.f3966x);
        if (fragmentManagerState.f3967y != null) {
            this.f3910d = new ArrayList<>(fragmentManagerState.f3967y.length);
            int i = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f3967y;
                if (i >= backStackStateArr.length) {
                    break;
                }
                C1331a m37673a = backStackStateArr[i].m37673a(this);
                if (m37520H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + m37673a.f3984s + "): " + m37673a);
                    PrintWriter printWriter = new PrintWriter(new C1405x("FragmentManager"));
                    m37673a.m37367u("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3910d.add(m37673a);
                i++;
            }
        } else {
            this.f3910d = null;
        }
        this.f3923i.set(fragmentManagerState.f3968z);
        String str = fragmentManagerState.f3961A;
        if (str != null) {
            Fragment m37461h0 = m37461h0(str);
            this.f3917u = m37461h0;
            m37511M(m37461h0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f3962B;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Bundle bundle = fragmentManagerState.f3963C.get(i2);
                bundle.setClassLoader(this.f3914r.m37274g().getClassLoader());
                this.f3924j.put(arrayList.get(i2), bundle);
            }
        }
        this.f3935C = new ArrayDeque<>(fragmentManagerState.f3964D);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    public void m37453k(AbstractC1368i<?> abstractC1368i, AbstractC1365f abstractC1365f, Fragment fragment) {
        String str;
        if (this.f3914r == null) {
            this.f3914r = abstractC1368i;
            this.f3915s = abstractC1365f;
            this.f3916t = fragment;
            if (fragment != null) {
                m37462h(new C1321i(this, fragment));
            } else if (abstractC1368i instanceof InterfaceC1376n) {
                m37462h((InterfaceC1376n) abstractC1368i);
            }
            if (this.f3916t != null) {
                m37415w1();
            }
            if (abstractC1368i instanceof InterfaceC0294f) {
                InterfaceC0294f interfaceC0294f = (InterfaceC0294f) abstractC1368i;
                OnBackPressedDispatcher mo37313h = interfaceC0294f.mo37313h();
                this.f3912g = mo37313h;
                InterfaceC1491v interfaceC1491v = interfaceC0294f;
                if (fragment != null) {
                    interfaceC1491v = fragment;
                }
                mo37313h.m41360a(interfaceC1491v, this.f3922h);
            }
            if (fragment != null) {
                this.f3908M = fragment.f3813O.m37440o0(fragment);
            } else if (abstractC1368i instanceof InterfaceC1488t0) {
                this.f3908M = C1374m.m37244k(((InterfaceC1488t0) abstractC1368i).mo36970z());
            } else {
                this.f3908M = new C1374m(false);
            }
            this.f3908M.m37239p(m37510M0());
            this.f3920c.m37189x(this.f3908M);
            AbstractC1368i<?> abstractC1368i2 = this.f3914r;
            if (abstractC1368i2 instanceof InterfaceC0305c) {
                ActivityResultRegistry mo37311u = ((InterfaceC0305c) abstractC1368i2).mo37311u();
                if (fragment != null) {
                    str = fragment.f3847B + ":";
                } else {
                    str = BuildConfig.VERSION_NAME;
                }
                String str2 = "FragmentManager:" + str;
                this.f3918z = mo37311u.m41338j(str2 + "StartActivityForResult", new C4519c(), new C1322j());
                this.f3897A = mo37311u.m41338j(str2 + "StartIntentSenderForResult", new C1323k(), new C1313a());
                this.f3898B = mo37311u.m41338j(str2 + "RequestPermissions", new ActivityResultContracts(), new C1314b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public Fragment m37452k0(String str) {
        return this.f3920c.m37204i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m37450l(Fragment fragment) {
        if (m37520H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f3820W) {
            fragment.f3820W = false;
            if (fragment.f3806H) {
                return;
            }
            this.f3920c.m37212a(fragment);
            if (m37520H0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m37518I0(fragment)) {
                this.f3899D = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1 */
    public Parcelable m37448l1() {
        int size;
        m37449l0();
        m37487Y();
        m37479b0(true);
        this.f3900E = true;
        this.f3908M.m37239p(true);
        ArrayList<FragmentState> m37191v = this.f3920c.m37191v();
        BackStackState[] backStackStateArr = null;
        if (m37191v.isEmpty()) {
            if (m37520H0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> m37190w = this.f3920c.m37190w();
        ArrayList<C1331a> arrayList = this.f3910d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.f3910d.get(i));
                if (m37520H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3910d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3965w = m37191v;
        fragmentManagerState.f3966x = m37190w;
        fragmentManagerState.f3967y = backStackStateArr;
        fragmentManagerState.f3968z = this.f3923i.get();
        Fragment fragment = this.f3917u;
        if (fragment != null) {
            fragmentManagerState.f3961A = fragment.f3847B;
        }
        fragmentManagerState.f3962B.addAll(this.f3924j.keySet());
        fragmentManagerState.f3963C.addAll(this.f3924j.values());
        fragmentManagerState.f3964D = new ArrayList<>(this.f3935C);
        return fragmentManagerState;
    }

    /* renamed from: m */
    public AbstractC1382r m37447m() {
        return new C1331a(this);
    }

    /* renamed from: m1 */
    public Fragment.SavedState m37445m1(Fragment fragment) {
        C1378p m37200m = this.f3920c.m37200m(fragment.f3847B);
        if (m37200m == null || !m37200m.m37225k().equals(fragment)) {
            m37421u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m37200m.m37218r();
    }

    /* renamed from: n0 */
    public int m37443n0() {
        ArrayList<C1331a> arrayList = this.f3910d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: n1 */
    void m37442n1() {
        synchronized (this.f3919a) {
            ArrayList<C1328p> arrayList = this.f3907L;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f3919a.size() == 1;
            if (z || z2) {
                this.f3914r.m37273j().removeCallbacks(this.f3936N);
                this.f3914r.m37273j().post(this.f3936N);
                m37415w1();
            }
        }
    }

    /* renamed from: o */
    boolean m37441o() {
        boolean z = false;
        for (Fragment fragment : this.f3920c.m37201l()) {
            if (fragment != null) {
                z = m37518I0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void m37439o1(Fragment fragment, boolean z) {
        ViewGroup m37431r0 = m37431r0(fragment);
        if (m37431r0 == null || !(m37431r0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m37431r0).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public AbstractC1365f m37437p0() {
        return this.f3915s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void m37436p1(Fragment fragment, AbstractC1469p.EnumC1472c enumC1472c) {
        if (fragment.equals(m37461h0(fragment.f3847B)) && (fragment.f3814P == null || fragment.f3813O == this)) {
            fragment.f3834m0 = enumC1472c;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: q0 */
    public Fragment m37434q0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m37461h0 = m37461h0(string);
        if (m37461h0 == null) {
            m37421u1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return m37461h0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void m37433q1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(m37461h0(fragment.f3847B)) || (fragment.f3814P != null && fragment.f3813O != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f3917u;
        this.f3917u = fragment;
        m37511M(fragment2);
        m37511M(this.f3917u);
    }

    /* renamed from: r */
    public final void m37432r(String str) {
        this.f3924j.remove(str);
    }

    /* renamed from: s0 */
    public C1367h m37428s0() {
        C1367h c1367h = this.f3931v;
        if (c1367h != null) {
            return c1367h;
        }
        Fragment fragment = this.f3916t;
        if (fragment != null) {
            return fragment.f3813O.m37428s0();
        }
        return this.f3932w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void m37427s1(Fragment fragment) {
        if (m37520H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3819V) {
            fragment.f3819V = false;
            fragment.f3830i0 = !fragment.f3830i0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public C1381q m37425t0() {
        return this.f3920c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f3916t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f3916t)));
            sb2.append("}");
        } else {
            AbstractC1368i<?> abstractC1368i = this.f3914r;
            if (abstractC1368i != null) {
                sb2.append(abstractC1368i.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f3914r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u */
    void m37423u(C1331a c1331a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c1331a.m37365w(z3);
        } else {
            c1331a.m37366v();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1331a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f3930q >= 1) {
            C1384s.m37171B(this.f3914r.m37274g(), this.f3915s, arrayList, arrayList2, 0, 1, true, this.f3927n);
        }
        if (z3) {
            m37500R0(this.f3930q, true);
        }
        for (Fragment fragment : this.f3920c.m37201l()) {
            if (fragment != null && fragment.f3826d0 != null && fragment.f3829h0 && c1331a.m37362z(fragment.f3817T)) {
                float f = fragment.f3831j0;
                if (f > 0.0f) {
                    fragment.f3826d0.setAlpha(f);
                }
                if (z3) {
                    fragment.f3831j0 = 0.0f;
                } else {
                    fragment.f3831j0 = -1.0f;
                    fragment.f3829h0 = false;
                }
            }
        }
    }

    /* renamed from: u0 */
    public List<Fragment> m37422u0() {
        return this.f3920c.m37199n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public AbstractC1368i<?> m37419v0() {
        return this.f3914r;
    }

    /* renamed from: v1 */
    public void m37418v1(AbstractC1324l abstractC1324l) {
        this.f3928o.m37249p(abstractC1324l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C1378p m37417w(Fragment fragment) {
        C1378p m37200m = this.f3920c.m37200m(fragment.f3847B);
        if (m37200m != null) {
            return m37200m;
        }
        C1378p c1378p = new C1378p(this.f3928o, this.f3920c, fragment);
        c1378p.m37221o(this.f3914r.m37274g().getClassLoader());
        c1378p.m37215u(this.f3930q);
        return c1378p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public LayoutInflater.Factory2 m37416w0() {
        return this.f3921f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C1371k m37413x0() {
        return this.f3928o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m37412y(Fragment fragment) {
        if (m37520H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f3820W) {
            return;
        }
        fragment.f3820W = true;
        if (fragment.f3806H) {
            if (m37520H0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3920c.m37194s(fragment);
            if (m37518I0(fragment)) {
                this.f3899D = true;
            }
            m37430r1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public Fragment m37411y0() {
        return this.f3916t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m37410z() {
        this.f3900E = false;
        this.f3901F = false;
        this.f3908M.m37239p(false);
        m37497T(4);
    }

    /* renamed from: z0 */
    public Fragment m37409z0() {
        return this.f3917u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C1312a();

        /* renamed from: w */
        String f3941w;

        /* renamed from: x */
        int f3942x;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        /* loaded from: classes.dex */
        class C1312a implements Parcelable.Creator<LaunchedFragmentInfo> {
            C1312a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo mo37408a(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] mo37407b(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        LaunchedFragmentInfo(String str, int i) {
            this.f3941w = str;
            this.f3942x = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3941w);
            parcel.writeInt(this.f3942x);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f3941w = parcel.readString();
            this.f3942x = parcel.readInt();
        }
    }
}
