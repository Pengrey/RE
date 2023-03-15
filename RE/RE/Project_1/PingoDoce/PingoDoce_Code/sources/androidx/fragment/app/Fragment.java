package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0303a;
import androidx.activity.result.InterfaceC0305c;
import androidx.core.app.AbstractC0925o;
import androidx.core.app.C0890c;
import androidx.core.view.C1165h;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1463m0;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.C1492v0;
import androidx.lifecycle.C1493x;
import androidx.lifecycle.InterfaceC1467o;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC1497a;
import androidx.savedstate.C1662b;
import androidx.savedstate.C1664d;
import androidx.savedstate.InterfaceC1663c;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p050d.ActivityResultContract;
import p259o.InterfaceC7946a;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1491v, InterfaceC1488t0, InterfaceC1467o, InterfaceC1663c {

    /* renamed from: v0 */
    static final Object f3801v0 = new Object();

    /* renamed from: A */
    Boolean f3802A;

    /* renamed from: C */
    Bundle f3803C;

    /* renamed from: D */
    Fragment f3804D;

    /* renamed from: F */
    int f3805F;

    /* renamed from: H */
    boolean f3806H;

    /* renamed from: I */
    boolean f3807I;

    /* renamed from: J */
    boolean f3808J;

    /* renamed from: K */
    boolean f3809K;

    /* renamed from: L */
    boolean f3810L;

    /* renamed from: M */
    boolean f3811M;

    /* renamed from: N */
    int f3812N;

    /* renamed from: O */
    FragmentManager f3813O;

    /* renamed from: P */
    AbstractC1368i<?> f3814P;

    /* renamed from: R */
    Fragment f3815R;

    /* renamed from: S */
    int f3816S;

    /* renamed from: T */
    int f3817T;

    /* renamed from: U */
    String f3818U;

    /* renamed from: V */
    boolean f3819V;

    /* renamed from: W */
    boolean f3820W;

    /* renamed from: X */
    boolean f3821X;

    /* renamed from: Y */
    boolean f3822Y;

    /* renamed from: Z */
    boolean f3823Z;

    /* renamed from: b0 */
    private boolean f3824b0;

    /* renamed from: c0 */
    ViewGroup f3825c0;

    /* renamed from: d0 */
    View f3826d0;

    /* renamed from: e0 */
    boolean f3827e0;

    /* renamed from: g0 */
    C1308h f3828g0;

    /* renamed from: h0 */
    boolean f3829h0;

    /* renamed from: i0 */
    boolean f3830i0;

    /* renamed from: j0 */
    float f3831j0;

    /* renamed from: k0 */
    LayoutInflater f3832k0;

    /* renamed from: l0 */
    boolean f3833l0;

    /* renamed from: m0 */
    AbstractC1469p.EnumC1472c f3834m0;

    /* renamed from: n0 */
    C1493x f3835n0;

    /* renamed from: o0 */
    C1403v f3836o0;

    /* renamed from: p0 */
    C1436e0<InterfaceC1491v> f3837p0;

    /* renamed from: q0 */
    C1479r0.InterfaceC1481b f3838q0;

    /* renamed from: r0 */
    C1662b f3839r0;

    /* renamed from: s0 */
    private int f3840s0;

    /* renamed from: t0 */
    private final AtomicInteger f3841t0;

    /* renamed from: u0 */
    private final ArrayList<AbstractC1309i> f3842u0;

    /* renamed from: x */
    Bundle f3843x;

    /* renamed from: y */
    SparseArray<Parcelable> f3844y;

    /* renamed from: z */
    Bundle f3845z;

    /* renamed from: w */
    int f3846w = -1;

    /* renamed from: B */
    String f3847B = UUID.randomUUID().toString();

    /* renamed from: E */
    String f3848E = null;

    /* renamed from: G */
    private Boolean f3849G = null;

    /* renamed from: Q */
    FragmentManager f3850Q = new C1373l();

    /* renamed from: a0 */
    boolean f3851a0 = true;

    /* renamed from: f0 */
    boolean f3852f0 = true;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    class RunnableC1301a implements Runnable {
        RunnableC1301a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m37587f2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    public class RunnableC1302b implements Runnable {
        RunnableC1302b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m37563s(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    public class RunnableC1303c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ AbstractC1406y f3857w;

        RunnableC1303c(Fragment fragment, AbstractC1406y abstractC1406y) {
            this.f3857w = abstractC1406y;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3857w.m37114g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public class C1304d extends AbstractC1365f {
        C1304d() {
        }

        @Override // androidx.fragment.app.AbstractC1365f
        /* renamed from: d */
        public View mo37277d(int i) {
            View view = Fragment.this.f3826d0;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1365f
        /* renamed from: e */
        public boolean mo37276e() {
            return Fragment.this.f3826d0 != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    class C1305e implements InterfaceC7946a<Void, ActivityResultRegistry> {
        C1305e() {
        }

        @Override // p259o.InterfaceC7946a
        /* renamed from: b */
        public ActivityResultRegistry mo37540b(Void r3) {
            Fragment fragment = Fragment.this;
            AbstractC1368i<?> abstractC1368i = fragment.f3814P;
            if (abstractC1368i instanceof InterfaceC0305c) {
                return ((InterfaceC0305c) abstractC1368i).mo37311u();
            }
            return fragment.m37652G1().mo37311u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes.dex */
    public class C1306f extends AbstractC1309i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7946a f3860a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f3861b;

        /* renamed from: c */
        final /* synthetic */ ActivityResultContract f3862c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC0303a f3863d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1306f(InterfaceC7946a interfaceC7946a, AtomicReference atomicReference, ActivityResultContract activityResultContract, InterfaceC0303a interfaceC0303a) {
            super(null);
            this.f3860a = interfaceC7946a;
            this.f3861b = atomicReference;
            this.f3862c = activityResultContract;
            this.f3863d = interfaceC0303a;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC1309i
        /* renamed from: a */
        void mo37537a() {
            this.f3861b.set(((ActivityResultRegistry) this.f3860a.mo37540b(null)).m41339i(Fragment.this.m37550x(), Fragment.this, this.f3862c, this.f3863d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: classes.dex */
    public class C1307g extends AbstractC0304b<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f3865a;

        C1307g(Fragment fragment, AtomicReference atomicReference, ActivityResultContract activityResultContract) {
            this.f3865a = atomicReference;
        }

        @Override // androidx.activity.result.AbstractC0304b
        /* renamed from: b */
        public void mo37539b(I i, C0890c c0890c) {
            AbstractC0304b abstractC0304b = (AbstractC0304b) this.f3865a.get();
            if (abstractC0304b != null) {
                abstractC0304b.mo37539b(i, c0890c);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.AbstractC0304b
        /* renamed from: c */
        public void mo37538c() {
            AbstractC0304b abstractC0304b = (AbstractC0304b) this.f3865a.getAndSet(null);
            if (abstractC0304b != null) {
                abstractC0304b.mo37538c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: classes.dex */
    public static class C1308h {

        /* renamed from: a */
        View f3866a;

        /* renamed from: b */
        Animator f3867b;

        /* renamed from: c */
        boolean f3868c;

        /* renamed from: d */
        int f3869d;

        /* renamed from: e */
        int f3870e;

        /* renamed from: f */
        int f3871f;

        /* renamed from: g */
        int f3872g;

        /* renamed from: h */
        int f3873h;

        /* renamed from: i */
        ArrayList<String> f3874i;

        /* renamed from: j */
        ArrayList<String> f3875j;

        /* renamed from: k */
        Object f3876k = null;

        /* renamed from: l */
        Object f3877l;

        /* renamed from: m */
        Object f3878m;

        /* renamed from: n */
        Object f3879n;

        /* renamed from: o */
        Object f3880o;

        /* renamed from: p */
        Object f3881p;

        /* renamed from: q */
        Boolean f3882q;

        /* renamed from: r */
        Boolean f3883r;

        /* renamed from: s */
        AbstractC0925o f3884s;

        /* renamed from: t */
        AbstractC0925o f3885t;

        /* renamed from: u */
        float f3886u;

        /* renamed from: v */
        View f3887v;

        /* renamed from: w */
        boolean f3888w;

        /* renamed from: x */
        InterfaceC1310j f3889x;

        /* renamed from: y */
        boolean f3890y;

        C1308h() {
            Object obj = Fragment.f3801v0;
            this.f3877l = obj;
            this.f3878m = null;
            this.f3879n = obj;
            this.f3880o = null;
            this.f3881p = obj;
            this.f3886u = 1.0f;
            this.f3887v = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.Fragment$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1309i {
        private AbstractC1309i() {
        }

        /* renamed from: a */
        abstract void mo37537a();

        /* synthetic */ AbstractC1309i(RunnableC1301a runnableC1301a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$j */
    /* loaded from: classes.dex */
    public interface InterfaceC1310j {
        /* renamed from: a */
        void mo37386a();

        /* renamed from: b */
        void mo37385b();
    }

    public Fragment() {
        new RunnableC1301a();
        this.f3834m0 = AbstractC1469p.EnumC1472c.RESUMED;
        this.f3837p0 = new C1436e0<>();
        this.f3841t0 = new AtomicInteger();
        this.f3842u0 = new ArrayList<>();
        m37578k0();
    }

    /* renamed from: C1 */
    private <I, O> AbstractC0304b<I> m37663C1(ActivityResultContract<I, O> activityResultContract, InterfaceC7946a<Void, ActivityResultRegistry> interfaceC7946a, InterfaceC0303a<O> interfaceC0303a) {
        if (this.f3846w <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            m37658E1(new C1306f(interfaceC7946a, atomicReference, activityResultContract, interfaceC0303a));
            return new C1307g(this, atomicReference, activityResultContract);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* renamed from: E1 */
    private void m37658E1(AbstractC1309i abstractC1309i) {
        if (this.f3846w >= 0) {
            abstractC1309i.mo37537a();
        } else {
            this.f3842u0.add(abstractC1309i);
        }
    }

    /* renamed from: K1 */
    private void m37643K1() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3826d0 != null) {
            m37641L1(this.f3843x);
        }
        this.f3843x = null;
    }

    /* renamed from: Q */
    private int m37629Q() {
        AbstractC1469p.EnumC1472c enumC1472c = this.f3834m0;
        if (enumC1472c != AbstractC1469p.EnumC1472c.INITIALIZED && this.f3815R != null) {
            return Math.min(enumC1472c.ordinal(), this.f3815R.m37629Q());
        }
        return enumC1472c.ordinal();
    }

    /* renamed from: k0 */
    private void m37578k0() {
        this.f3835n0 = new C1493x(this);
        this.f3839r0 = C1662b.m35788a(this);
        this.f3838q0 = null;
    }

    @Deprecated
    /* renamed from: m0 */
    public static Fragment m37575m0(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C1367h.m37278d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.m37630P1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (java.lang.InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: v */
    private C1308h m37556v() {
        if (this.f3828g0 == null) {
            this.f3828g0 = new C1308h();
        }
        return this.f3828g0;
    }

    /* renamed from: A */
    public boolean m37670A() {
        Boolean bool;
        C1308h c1308h = this.f3828g0;
        if (c1308h == null || (bool = c1308h.f3883r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: A0 */
    public void mo5750A0(Context context) {
        this.f3824b0 = true;
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        Activity m37275f = abstractC1368i == null ? null : abstractC1368i.m37275f();
        if (m37275f != null) {
            this.f3824b0 = false;
            m37545z0(m37275f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void m37669A1() {
        this.f3850Q.m37495U();
        if (this.f3826d0 != null) {
            this.f3836o0.m37129a(AbstractC1469p.EnumC1471b.ON_STOP);
        }
        this.f3835n0.m36960h(AbstractC1469p.EnumC1471b.ON_STOP);
        this.f3846w = 4;
        this.f3824b0 = false;
        mo29890b1();
        if (this.f3824b0) {
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: B */
    public boolean m37668B() {
        Boolean bool;
        C1308h c1308h = this.f3828g0;
        if (c1308h == null || (bool = c1308h.f3882q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    /* renamed from: B0 */
    public void m37667B0(Fragment fragment) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void m37666B1() {
        mo37596c1(this.f3826d0, this.f3843x);
        this.f3850Q.m37493V();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public View m37665C() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3866a;
    }

    /* renamed from: C0 */
    public boolean m37664C0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public Animator m37662D() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3867b;
    }

    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        this.f3824b0 = true;
        m37645J1(bundle);
        if (this.f3850Q.m37512L0(1)) {
            return;
        }
        this.f3850Q.m37529D();
    }

    /* renamed from: D1 */
    public final <I, O> AbstractC0304b<I> m37661D1(ActivityResultContract<I, O> activityResultContract, InterfaceC0303a<O> interfaceC0303a) {
        return m37663C1(activityResultContract, new C1305e(), interfaceC0303a);
    }

    /* renamed from: E */
    public final Bundle m37660E() {
        return this.f3803C;
    }

    /* renamed from: E0 */
    public Animation m37659E0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: F */
    public final FragmentManager m37657F() {
        if (this.f3814P != null) {
            return this.f3850Q;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: F0 */
    public Animator m37656F0(int i, boolean z, int i2) {
        return null;
    }

    @Deprecated
    /* renamed from: F1 */
    public final void m37655F1(String[] strArr, int i) {
        if (this.f3814P != null) {
            m37620T().m37508N0(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: G */
    public Context m37654G() {
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        if (abstractC1368i == null) {
            return null;
        }
        return abstractC1368i.m37274g();
    }

    /* renamed from: G0 */
    public void m37653G0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: G1 */
    public final ActivityC1354d m37652G1() {
        ActivityC1354d m37547y = m37547y();
        if (m37547y != null) {
            return m37547y;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public int m37651H() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return 0;
        }
        return c1308h.f3869d;
    }

    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f3840s0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: H1 */
    public final Context m37650H1() {
        Context m37654G = m37654G();
        if (m37654G != null) {
            return m37654G;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: I */
    public Object m37649I() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3876k;
    }

    /* renamed from: I0 */
    public void mo33459I0() {
        this.f3824b0 = true;
    }

    /* renamed from: I1 */
    public final View m37648I1() {
        View m37584h0 = m37584h0();
        if (m37584h0 != null) {
            return m37584h0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public AbstractC0925o m37647J() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3884s;
    }

    /* renamed from: J0 */
    public void m37646J0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J1 */
    public void m37645J1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f3850Q.m37454j1(parcelable);
        this.f3850Q.m37529D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public int m37644K() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return 0;
        }
        return c1308h.f3870e;
    }

    /* renamed from: K0 */
    public void mo37344K0() {
        this.f3824b0 = true;
    }

    /* renamed from: L */
    public Object m37642L() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3878m;
    }

    /* renamed from: L0 */
    public void mo37343L0() {
        this.f3824b0 = true;
    }

    /* renamed from: L1 */
    final void m37641L1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3844y;
        if (sparseArray != null) {
            this.f3826d0.restoreHierarchyState(sparseArray);
            this.f3844y = null;
        }
        if (this.f3826d0 != null) {
            this.f3836o0.m37126e(this.f3845z);
            this.f3845z = null;
        }
        this.f3824b0 = false;
        mo37341d1(bundle);
        if (this.f3824b0) {
            if (this.f3826d0 != null) {
                this.f3836o0.m37129a(AbstractC1469p.EnumC1471b.ON_CREATE);
                return;
            }
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public AbstractC0925o m37640M() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3885t;
    }

    /* renamed from: M0 */
    public LayoutInflater mo37342M0(Bundle bundle) {
        return m37632P(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M1 */
    public void m37639M1(View view) {
        m37556v().f3866a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public View m37638N() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3887v;
    }

    /* renamed from: N0 */
    public void m37637N0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void m37636N1(int i, int i2, int i3, int i4) {
        if (this.f3828g0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m37556v().f3869d = i;
        m37556v().f3870e = i2;
        m37556v().f3871f = i3;
        m37556v().f3872g = i4;
    }

    /* renamed from: O */
    public final Object m37635O() {
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        if (abstractC1368i == null) {
            return null;
        }
        return abstractC1368i.mo37312s();
    }

    @Deprecated
    /* renamed from: O0 */
    public void m37634O0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f3824b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void m37633O1(Animator animator) {
        m37556v().f3867b = animator;
    }

    @Deprecated
    /* renamed from: P */
    public LayoutInflater m37632P(Bundle bundle) {
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        if (abstractC1368i != null) {
            LayoutInflater mo37270m = abstractC1368i.mo37270m();
            C1165h.m38172b(mo37270m, this.f3850Q.m37416w0());
            return mo37270m;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: P0 */
    public void m37631P0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f3824b0 = true;
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        Activity m37275f = abstractC1368i == null ? null : abstractC1368i.m37275f();
        if (m37275f != null) {
            this.f3824b0 = false;
            m37634O0(m37275f, attributeSet, bundle);
        }
    }

    /* renamed from: P1 */
    public void m37630P1(Bundle bundle) {
        if (this.f3813O != null && m37555v0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3803C = bundle;
    }

    /* renamed from: Q0 */
    public void m37628Q0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public void m37627Q1(View view) {
        m37556v().f3887v = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public int m37626R() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return 0;
        }
        return c1308h.f3873h;
    }

    /* renamed from: R0 */
    public boolean m37625R0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: R1 */
    public void m37624R1(boolean z) {
        if (this.f3823Z != z) {
            this.f3823Z = z;
            if (!m37573n0() || m37571o0()) {
                return;
            }
            this.f3814P.mo37265r();
        }
    }

    /* renamed from: S */
    public final Fragment m37623S() {
        return this.f3815R;
    }

    /* renamed from: S0 */
    public void m37622S0(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S1 */
    public void m37621S1(boolean z) {
        m37556v().f3890y = z;
    }

    /* renamed from: T */
    public final FragmentManager m37620T() {
        FragmentManager fragmentManager = this.f3813O;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: T0 */
    public void mo37619T0() {
        this.f3824b0 = true;
    }

    /* renamed from: T1 */
    public void m37618T1(SavedState savedState) {
        if (this.f3813O == null) {
            this.f3843x = (savedState == null || (r2 = savedState.f3854w) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public boolean m37617U() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return false;
        }
        return c1308h.f3868c;
    }

    /* renamed from: U0 */
    public void m37616U0(boolean z) {
    }

    /* renamed from: U1 */
    public void m37615U1(boolean z) {
        if (this.f3851a0 != z) {
            this.f3851a0 = z;
            if (this.f3823Z && m37573n0() && !m37571o0()) {
                this.f3814P.mo37265r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public int m37614V() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return 0;
        }
        return c1308h.f3871f;
    }

    /* renamed from: V0 */
    public void m37613V0(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V1 */
    public void m37612V1(int i) {
        if (this.f3828g0 == null && i == 0) {
            return;
        }
        m37556v();
        this.f3828g0.f3873h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public int m37611W() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return 0;
        }
        return c1308h.f3872g;
    }

    /* renamed from: W0 */
    public void m37610W0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W1 */
    public void m37609W1(InterfaceC1310j interfaceC1310j) {
        m37556v();
        C1308h c1308h = this.f3828g0;
        InterfaceC1310j interfaceC1310j2 = c1308h.f3889x;
        if (interfaceC1310j == interfaceC1310j2) {
            return;
        }
        if (interfaceC1310j != null && interfaceC1310j2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c1308h.f3888w) {
            c1308h.f3889x = interfaceC1310j;
        }
        if (interfaceC1310j != null) {
            interfaceC1310j.mo37385b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public float m37608X() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return 1.0f;
        }
        return c1308h.f3886u;
    }

    @Deprecated
    /* renamed from: X0 */
    public void mo37607X0(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X1 */
    public void m37606X1(boolean z) {
        if (this.f3828g0 == null) {
            return;
        }
        m37556v().f3868c = z;
    }

    /* renamed from: Y */
    public Object m37605Y() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        Object obj = c1308h.f3879n;
        return obj == f3801v0 ? m37642L() : obj;
    }

    /* renamed from: Y0 */
    public void mo33458Y0() {
        this.f3824b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public void m37604Y1(float f) {
        m37556v().f3886u = f;
    }

    /* renamed from: Z */
    public final Resources m37603Z() {
        return m37650H1().getResources();
    }

    /* renamed from: Z0 */
    public void mo29884Z0(Bundle bundle) {
    }

    @Deprecated
    /* renamed from: Z1 */
    public void m37602Z1(boolean z) {
        this.f3821X = z;
        FragmentManager fragmentManager = this.f3813O;
        if (fragmentManager == null) {
            this.f3822Y = true;
        } else if (z) {
            fragmentManager.m37459i(this);
        } else {
            fragmentManager.m37460h1(this);
        }
    }

    /* renamed from: a0 */
    public Object m37601a0() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        Object obj = c1308h.f3877l;
        return obj == f3801v0 ? m37649I() : obj;
    }

    /* renamed from: a1 */
    public void mo29891a1() {
        this.f3824b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2 */
    public void m37600a2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m37556v();
        C1308h c1308h = this.f3828g0;
        c1308h.f3874i = arrayList;
        c1308h.f3875j = arrayList2;
    }

    @Override // androidx.lifecycle.InterfaceC1491v
    /* renamed from: b */
    public AbstractC1469p mo137b() {
        return this.f3835n0;
    }

    /* renamed from: b0 */
    public Object m37599b0() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        return c1308h.f3880o;
    }

    /* renamed from: b1 */
    public void mo29890b1() {
        this.f3824b0 = true;
    }

    /* renamed from: b2 */
    public boolean m37598b2(String str) {
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        if (abstractC1368i != null) {
            return abstractC1368i.mo37267p(str);
        }
        return false;
    }

    /* renamed from: c0 */
    public Object m37597c0() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return null;
        }
        Object obj = c1308h.f3881p;
        return obj == f3801v0 ? m37599b0() : obj;
    }

    /* renamed from: c1 */
    public void mo37596c1(View view, Bundle bundle) {
    }

    /* renamed from: c2 */
    public void m37595c2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        m37593d2(intent, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public ArrayList<String> m37594d0() {
        ArrayList<String> arrayList;
        C1308h c1308h = this.f3828g0;
        return (c1308h == null || (arrayList = c1308h.f3874i) == null) ? new ArrayList<>() : arrayList;
    }

    /* renamed from: d1 */
    public void mo37341d1(Bundle bundle) {
        this.f3824b0 = true;
    }

    /* renamed from: d2 */
    public void m37593d2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        if (abstractC1368i != null) {
            abstractC1368i.m37266q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public ArrayList<String> m37592e0() {
        ArrayList<String> arrayList;
        C1308h c1308h = this.f3828g0;
        return (c1308h == null || (arrayList = c1308h.f3875j) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void m37591e1(Bundle bundle) {
        this.f3850Q.m37494U0();
        this.f3846w = 3;
        this.f3824b0 = false;
        m37549x0(bundle);
        if (this.f3824b0) {
            m37643K1();
            this.f3850Q.m37410z();
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    @Deprecated
    /* renamed from: e2 */
    public void m37590e2(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f3814P != null) {
            m37620T().m37506O0(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public final String m37589f0(int i) {
        return m37603Z().getString(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void m37588f1() {
        Iterator<AbstractC1309i> it = this.f3842u0.iterator();
        while (it.hasNext()) {
            it.next().mo37537a();
        }
        this.f3842u0.clear();
        this.f3850Q.m37453k(this.f3814P, mo37329t(), this);
        this.f3846w = 0;
        this.f3824b0 = false;
        mo5750A0(this.f3814P.m37274g());
        if (this.f3824b0) {
            this.f3813O.m37517J(this);
            this.f3850Q.m37535A();
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* renamed from: f2 */
    public void m37587f2() {
        if (this.f3828g0 == null || !m37556v().f3888w) {
            return;
        }
        if (this.f3814P == null) {
            m37556v().f3888w = false;
        } else if (Looper.myLooper() != this.f3814P.m37273j().getLooper()) {
            this.f3814P.m37273j().postAtFrontOfQueue(new RunnableC1302b());
        } else {
            m37563s(true);
        }
    }

    @Deprecated
    /* renamed from: g0 */
    public final Fragment m37586g0() {
        String str;
        Fragment fragment = this.f3804D;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f3813O;
        if (fragmentManager == null || (str = this.f3848E) == null) {
            return null;
        }
        return fragmentManager.m37461h0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void m37585g1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3850Q.m37533B(configuration);
    }

    /* renamed from: h0 */
    public View m37584h0() {
        return this.f3826d0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1 */
    public boolean m37583h1(MenuItem menuItem) {
        if (this.f3819V) {
            return false;
        }
        if (m37664C0(menuItem)) {
            return true;
        }
        return this.f3850Q.m37531C(menuItem);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.savedstate.InterfaceC1663c
    /* renamed from: i */
    public final SavedStateRegistry mo35784i() {
        return this.f3839r0.m35787b();
    }

    /* renamed from: i0 */
    public InterfaceC1491v m37582i0() {
        C1403v c1403v = this.f3836o0;
        if (c1403v != null) {
            return c1403v;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void m37581i1(Bundle bundle) {
        this.f3850Q.m37494U0();
        this.f3846w = 1;
        this.f3824b0 = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3835n0.mo10402a(new InterfaceC1485s() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                    View view;
                    if (enumC1471b != AbstractC1469p.EnumC1471b.ON_STOP || (view = Fragment.this.f3826d0) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
        this.f3839r0.m35786c(bundle);
        mo29886D0(bundle);
        this.f3833l0 = true;
        if (this.f3824b0) {
            this.f3835n0.m36960h(AbstractC1469p.EnumC1471b.ON_CREATE);
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: j0 */
    public LiveData<InterfaceC1491v> m37580j0() {
        return this.f3837p0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public boolean m37579j1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f3819V) {
            return false;
        }
        if (this.f3823Z && this.f3851a0) {
            z = true;
            m37653G0(menu, menuInflater);
        }
        return z | this.f3850Q.m37527E(menu, menuInflater);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo37337k1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3850Q.m37494U0();
        this.f3811M = true;
        this.f3836o0 = new C1403v(this, mo36970z());
        View mo29885H0 = mo29885H0(layoutInflater, viewGroup, bundle);
        this.f3826d0 = mo29885H0;
        if (mo29885H0 != null) {
            this.f3836o0.m37128c();
            C1490u0.m36968b(this.f3826d0, this.f3836o0);
            C1492v0.m36966b(this.f3826d0, this.f3836o0);
            C1664d.m35782b(this.f3826d0, this.f3836o0);
            this.f3837p0.mo166p(this.f3836o0);
        } else if (!this.f3836o0.m37127d()) {
            this.f3836o0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void m37577l0() {
        m37578k0();
        this.f3847B = UUID.randomUUID().toString();
        this.f3806H = false;
        this.f3807I = false;
        this.f3808J = false;
        this.f3809K = false;
        this.f3810L = false;
        this.f3812N = 0;
        this.f3813O = null;
        this.f3850Q = new C1373l();
        this.f3814P = null;
        this.f3816S = 0;
        this.f3817T = 0;
        this.f3818U = null;
        this.f3819V = false;
        this.f3820W = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void m37576l1() {
        this.f3850Q.m37525F();
        this.f3835n0.m36960h(AbstractC1469p.EnumC1471b.ON_DESTROY);
        this.f3846w = 0;
        this.f3824b0 = false;
        this.f3833l0 = false;
        mo33459I0();
        if (this.f3824b0) {
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void m37574m1() {
        this.f3850Q.m37523G();
        if (this.f3826d0 != null && this.f3836o0.mo137b().mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.CREATED)) {
            this.f3836o0.m37129a(AbstractC1469p.EnumC1471b.ON_DESTROY);
        }
        this.f3846w = 1;
        this.f3824b0 = false;
        mo37344K0();
        if (this.f3824b0) {
            AbstractC1497a.m36943b(this).mo36940d();
            this.f3811M = false;
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: n0 */
    public final boolean m37573n0() {
        return this.f3814P != null && this.f3806H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void m37572n1() {
        this.f3846w = -1;
        this.f3824b0 = false;
        mo37343L0();
        this.f3832k0 = null;
        if (this.f3824b0) {
            if (this.f3850Q.m37522G0()) {
                return;
            }
            this.f3850Q.m37525F();
            this.f3850Q = new C1373l();
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* renamed from: o0 */
    public final boolean m37571o0() {
        return this.f3819V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1 */
    public LayoutInflater m37570o1(Bundle bundle) {
        LayoutInflater mo37342M0 = mo37342M0(bundle);
        this.f3832k0 = mo37342M0;
        return mo37342M0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f3824b0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m37652G1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3824b0 = true;
    }

    @Override // androidx.lifecycle.InterfaceC1467o
    /* renamed from: p */
    public C1479r0.InterfaceC1481b mo36992p() {
        if (this.f3813O != null) {
            if (this.f3838q0 == null) {
                Application application = null;
                Context applicationContext = m37650H1().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m37520H0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + m37650H1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f3838q0 = new C1463m0(application, this, m37660E());
            }
            return this.f3838q0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public boolean m37569p0() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return false;
        }
        return c1308h.f3890y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void m37568p1() {
        onLowMemory();
        this.f3850Q.m37521H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public final boolean m37567q0() {
        return this.f3812N > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void m37566q1(boolean z) {
        m37628Q0(z);
        this.f3850Q.m37519I(z);
    }

    /* renamed from: r0 */
    public final boolean m37565r0() {
        FragmentManager fragmentManager;
        return this.f3851a0 && ((fragmentManager = this.f3813O) == null || fragmentManager.m37516J0(this.f3815R));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1 */
    public boolean m37564r1(MenuItem menuItem) {
        if (this.f3819V) {
            return false;
        }
        if (this.f3823Z && this.f3851a0 && m37625R0(menuItem)) {
            return true;
        }
        return this.f3850Q.m37515K(menuItem);
    }

    /* renamed from: s */
    void m37563s(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C1308h c1308h = this.f3828g0;
        InterfaceC1310j interfaceC1310j = null;
        if (c1308h != null) {
            c1308h.f3888w = false;
            InterfaceC1310j interfaceC1310j2 = c1308h.f3889x;
            c1308h.f3889x = null;
            interfaceC1310j = interfaceC1310j2;
        }
        if (interfaceC1310j != null) {
            interfaceC1310j.mo37386a();
        } else if (!FragmentManager.f3896P || this.f3826d0 == null || (viewGroup = this.f3825c0) == null || (fragmentManager = this.f3813O) == null) {
        } else {
            AbstractC1406y m37107n = AbstractC1406y.m37107n(viewGroup, fragmentManager);
            m37107n.m37105p();
            if (z) {
                this.f3814P.m37273j().post(new RunnableC1303c(this, m37107n));
            } else {
                m37107n.m37114g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean m37562s0() {
        C1308h c1308h = this.f3828g0;
        if (c1308h == null) {
            return false;
        }
        return c1308h.f3888w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void m37561s1(Menu menu) {
        if (this.f3819V) {
            return;
        }
        if (this.f3823Z && this.f3851a0) {
            m37622S0(menu);
        }
        this.f3850Q.m37513L(menu);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        m37590e2(intent, i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public AbstractC1365f mo37329t() {
        return new C1304d();
    }

    /* renamed from: t0 */
    public final boolean m37560t0() {
        return this.f3807I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void m37559t1() {
        this.f3850Q.m37509N();
        if (this.f3826d0 != null) {
            this.f3836o0.m37129a(AbstractC1469p.EnumC1471b.ON_PAUSE);
        }
        this.f3835n0.m36960h(AbstractC1469p.EnumC1471b.ON_PAUSE);
        this.f3846w = 6;
        this.f3824b0 = false;
        mo37619T0();
        if (this.f3824b0) {
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onPause()");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f3847B);
        if (this.f3816S != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3816S));
        }
        if (this.f3818U != null) {
            sb2.append(" tag=");
            sb2.append(this.f3818U);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public void mo33454u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3816S));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3817T));
        printWriter.print(" mTag=");
        printWriter.println(this.f3818U);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3846w);
        printWriter.print(" mWho=");
        printWriter.print(this.f3847B);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3812N);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3806H);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3807I);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3808J);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3809K);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3819V);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3820W);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3851a0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3823Z);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3821X);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3852f0);
        if (this.f3813O != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3813O);
        }
        if (this.f3814P != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3814P);
        }
        if (this.f3815R != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3815R);
        }
        if (this.f3803C != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3803C);
        }
        if (this.f3843x != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3843x);
        }
        if (this.f3844y != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3844y);
        }
        if (this.f3845z != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3845z);
        }
        Fragment m37586g0 = m37586g0();
        if (m37586g0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m37586g0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3805F);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m37617U());
        if (m37651H() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m37651H());
        }
        if (m37644K() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m37644K());
        }
        if (m37614V() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m37614V());
        }
        if (m37611W() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m37611W());
        }
        if (this.f3825c0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3825c0);
        }
        if (this.f3826d0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3826d0);
        }
        if (m37665C() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m37665C());
        }
        if (m37654G() != null) {
            AbstractC1497a.m36943b(this).mo36942a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3850Q + ":");
        FragmentManager fragmentManager = this.f3850Q;
        fragmentManager.m37489X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final boolean m37558u0() {
        Fragment m37623S = m37623S();
        return m37623S != null && (m37623S.m37560t0() || m37623S.m37558u0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void m37557u1(boolean z) {
        m37616U0(z);
        this.f3850Q.m37507O(z);
    }

    /* renamed from: v0 */
    public final boolean m37555v0() {
        FragmentManager fragmentManager = this.f3813O;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m37510M0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v1 */
    public boolean m37554v1(Menu menu) {
        boolean z = false;
        if (this.f3819V) {
            return false;
        }
        if (this.f3823Z && this.f3851a0) {
            z = true;
            m37613V0(menu);
        }
        return z | this.f3850Q.m37505P(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public Fragment m37553w(String str) {
        return str.equals(this.f3847B) ? this : this.f3850Q.m37452k0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void m37552w0() {
        this.f3850Q.m37494U0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1 */
    public void m37551w1() {
        boolean m37514K0 = this.f3813O.m37514K0(this);
        Boolean bool = this.f3849G;
        if (bool == null || bool.booleanValue() != m37514K0) {
            this.f3849G = Boolean.valueOf(m37514K0);
            m37610W0(m37514K0);
            this.f3850Q.m37503Q();
        }
    }

    /* renamed from: x */
    String m37550x() {
        return "fragment_" + this.f3847B + "_rq#" + this.f3841t0.getAndIncrement();
    }

    @Deprecated
    /* renamed from: x0 */
    public void m37549x0(Bundle bundle) {
        this.f3824b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void m37548x1() {
        this.f3850Q.m37494U0();
        this.f3850Q.m37479b0(true);
        this.f3846w = 7;
        this.f3824b0 = false;
        mo33458Y0();
        if (this.f3824b0) {
            C1493x c1493x = this.f3835n0;
            AbstractC1469p.EnumC1471b enumC1471b = AbstractC1469p.EnumC1471b.ON_RESUME;
            c1493x.m36960h(enumC1471b);
            if (this.f3826d0 != null) {
                this.f3836o0.m37129a(enumC1471b);
            }
            this.f3850Q.m37501R();
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: y */
    public final ActivityC1354d m37547y() {
        AbstractC1368i<?> abstractC1368i = this.f3814P;
        if (abstractC1368i == null) {
            return null;
        }
        return (ActivityC1354d) abstractC1368i.m37275f();
    }

    @Deprecated
    /* renamed from: y0 */
    public void mo33453y0(int i, int i2, Intent intent) {
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void m37546y1(Bundle bundle) {
        mo29884Z0(bundle);
        this.f3839r0.m35785d(bundle);
        Parcelable m37448l1 = this.f3850Q.m37448l1();
        if (m37448l1 != null) {
            bundle.putParcelable("android:support:fragments", m37448l1);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1488t0
    /* renamed from: z */
    public C1486s0 mo36970z() {
        if (this.f3813O != null) {
            if (m37629Q() != AbstractC1469p.EnumC1472c.INITIALIZED.ordinal()) {
                return this.f3813O.m37530C0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Deprecated
    /* renamed from: z0 */
    public void m37545z0(Activity activity) {
        this.f3824b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void m37544z1() {
        this.f3850Q.m37494U0();
        this.f3850Q.m37479b0(true);
        this.f3846w = 5;
        this.f3824b0 = false;
        mo29891a1();
        if (this.f3824b0) {
            C1493x c1493x = this.f3835n0;
            AbstractC1469p.EnumC1471b enumC1471b = AbstractC1469p.EnumC1471b.ON_START;
            c1493x.m36960h(enumC1471b);
            if (this.f3826d0 != null) {
                this.f3836o0.m37129a(enumC1471b);
            }
            this.f3850Q.m37499S();
            return;
        }
        throw new C1332a0("Fragment " + this + " did not call through to super.onStart()");
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1300a();

        /* renamed from: w */
        final Bundle f3854w;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        /* loaded from: classes.dex */
        class C1300a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1300a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo37543a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo37542b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo37541c(int i) {
                return new SavedState[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Bundle bundle) {
            this.f3854w = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f3854w);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3854w = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }
}
