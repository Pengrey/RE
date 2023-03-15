package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.util.C1076h;
import androidx.core.view.C1112b0;
import androidx.fragment.app.AbstractC1382r;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p301q.C9552b;
import p301q.C9556e;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC1535g<C1736a> implements InterfaceC1737b {

    /* renamed from: c */
    final AbstractC1469p f5324c;

    /* renamed from: d */
    final FragmentManager f5325d;

    /* renamed from: h */
    private FragmentMaxLifecycleEnforcer f5326h;

    /* renamed from: e */
    final C9556e<Fragment> f5327e = new C9556e<>();

    /* renamed from: f */
    private final C9556e<Fragment.SavedState> f5328f = new C9556e<>();

    /* renamed from: g */
    private final C9556e<Integer> f5329g = new C9556e<>();

    /* renamed from: i */
    boolean f5330i = false;

    /* renamed from: j */
    private boolean f5331j = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        private ViewPager2.AbstractC1747i f5336a;

        /* renamed from: b */
        private RecyclerView.AbstractC1537i f5337b;

        /* renamed from: c */
        private InterfaceC1485s f5338c;

        /* renamed from: d */
        private ViewPager2 f5339d;

        /* renamed from: e */
        private long f5340e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        /* loaded from: classes.dex */
        public class C1730a extends ViewPager2.AbstractC1747i {
            C1730a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
            /* renamed from: a */
            public void mo29096a(int i) {
                FragmentMaxLifecycleEnforcer.this.m35504d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
            /* renamed from: c */
            public void mo29094c(int i) {
                FragmentMaxLifecycleEnforcer.this.m35504d(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        /* loaded from: classes.dex */
        public class C1731b extends AbstractC1735d {
            C1731b() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
            /* renamed from: a */
            public void mo29102a() {
                FragmentMaxLifecycleEnforcer.this.m35504d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        /* renamed from: a */
        private ViewPager2 m35507a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        void m35506b(RecyclerView recyclerView) {
            this.f5339d = m35507a(recyclerView);
            C1730a c1730a = new C1730a();
            this.f5336a = c1730a;
            this.f5339d.m35492g(c1730a);
            C1731b c1731b = new C1731b();
            this.f5337b = c1731b;
            FragmentStateAdapter.this.m36550A(c1731b);
            InterfaceC1485s interfaceC1485s = new InterfaceC1485s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                    FragmentMaxLifecycleEnforcer.this.m35504d(false);
                }
            };
            this.f5338c = interfaceC1485s;
            FragmentStateAdapter.this.f5324c.mo10402a(interfaceC1485s);
        }

        /* renamed from: c */
        void m35505c(RecyclerView recyclerView) {
            m35507a(recyclerView).m35485n(this.f5336a);
            FragmentStateAdapter.this.m36548C(this.f5337b);
            FragmentStateAdapter.this.f5324c.mo10400c(this.f5338c);
            this.f5339d = null;
        }

        /* renamed from: d */
        void m35504d(boolean z) {
            int currentItem;
            Fragment m10644f;
            if (FragmentStateAdapter.this.m35513W() || this.f5339d.getScrollState() != 0 || FragmentStateAdapter.this.f5327e.m10641j() || FragmentStateAdapter.this.mo29834f() == 0 || (currentItem = this.f5339d.getCurrentItem()) >= FragmentStateAdapter.this.mo29834f()) {
                return;
            }
            long mo29862g = FragmentStateAdapter.this.mo29862g(currentItem);
            if ((mo29862g != this.f5340e || z) && (m10644f = FragmentStateAdapter.this.f5327e.m10644f(mo29862g)) != null && m10644f.m37573n0()) {
                this.f5340e = mo29862g;
                AbstractC1382r m37447m = FragmentStateAdapter.this.f5325d.m37447m();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.f5327e.m10636o(); i++) {
                    long m10640k = FragmentStateAdapter.this.f5327e.m10640k(i);
                    Fragment m10635p = FragmentStateAdapter.this.f5327e.m10635p(i);
                    if (m10635p.m37573n0()) {
                        if (m10640k != this.f5340e) {
                            m37447m.mo37174p(m10635p, AbstractC1469p.EnumC1472c.STARTED);
                        } else {
                            fragment = m10635p;
                        }
                        m10635p.m37615U1(m10640k == this.f5340e);
                    }
                }
                if (fragment != null) {
                    m37447m.mo37174p(fragment, AbstractC1469p.EnumC1472c.RESUMED);
                }
                if (m37447m.mo37178l()) {
                    return;
                }
                m37447m.mo37182h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC1732a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f5345a;

        /* renamed from: b */
        final /* synthetic */ C1736a f5346b;

        View$OnLayoutChangeListenerC1732a(FrameLayout frameLayout, C1736a c1736a) {
            this.f5345a = frameLayout;
            this.f5346b = c1736a;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f5345a.getParent() != null) {
                this.f5345a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.m35517S(this.f5346b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    /* loaded from: classes.dex */
    public class C1733b extends FragmentManager.AbstractC1324l {

        /* renamed from: a */
        final /* synthetic */ Fragment f5348a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f5349b;

        C1733b(Fragment fragment, FrameLayout frameLayout) {
            this.f5348a = fragment;
            this.f5349b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC1324l
        /* renamed from: m */
        public void mo35503m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f5348a) {
                fragmentManager.m37418v1(this);
                FragmentStateAdapter.this.m35532D(view, this.f5349b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    /* loaded from: classes.dex */
    public class RunnableC1734c implements Runnable {
        RunnableC1734c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f5330i = false;
            fragmentStateAdapter.m35527I();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    /* loaded from: classes.dex */
    private static abstract class AbstractC1735d extends RecyclerView.AbstractC1537i {
        private AbstractC1735d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: b */
        public final void mo29101b(int i, int i2) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: c */
        public final void mo29100c(int i, int i2, Object obj) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: d */
        public final void mo29099d(int i, int i2) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: e */
        public final void mo29098e(int i, int i2, int i3) {
            mo29102a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: f */
        public final void mo29097f(int i, int i2) {
            mo29102a();
        }

        /* synthetic */ AbstractC1735d(View$OnLayoutChangeListenerC1732a view$OnLayoutChangeListenerC1732a) {
            this();
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p) {
        this.f5325d = fragmentManager;
        this.f5324c = abstractC1469p;
        super.m36549B(true);
    }

    /* renamed from: G */
    private static String m35529G(String str, long j) {
        return str + j;
    }

    /* renamed from: H */
    private void m35528H(int i) {
        long mo29862g = mo29862g(i);
        if (this.f5327e.m10646d(mo29862g)) {
            return;
        }
        Fragment mo35530F = mo35530F(i);
        mo35530F.m37618T1(this.f5328f.m10644f(mo29862g));
        this.f5327e.m10639l(mo29862g, mo35530F);
    }

    /* renamed from: J */
    private boolean m35526J(long j) {
        View m37584h0;
        if (this.f5329g.m10646d(j)) {
            return true;
        }
        Fragment m10644f = this.f5327e.m10644f(j);
        return (m10644f == null || (m37584h0 = m10644f.m37584h0()) == null || m37584h0.getParent() == null) ? false : true;
    }

    /* renamed from: K */
    private static boolean m35525K(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: L */
    private Long m35524L(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f5329g.m10636o(); i2++) {
            if (this.f5329g.m10635p(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f5329g.m10640k(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: R */
    private static long m35518R(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: T */
    private void m35516T(long j) {
        ViewParent parent;
        Fragment m10644f = this.f5327e.m10644f(j);
        if (m10644f == null) {
            return;
        }
        if (m10644f.m37584h0() != null && (parent = m10644f.m37584h0().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!m35531E(j)) {
            this.f5328f.m10638m(j);
        }
        if (!m10644f.m37573n0()) {
            this.f5327e.m10638m(j);
        } else if (m35513W()) {
            this.f5331j = true;
        } else {
            if (m10644f.m37573n0() && m35531E(j)) {
                this.f5328f.m10639l(j, this.f5325d.m37445m1(m10644f));
            }
            this.f5325d.m37447m().mo37177m(m10644f).mo37182h();
            this.f5327e.m10638m(j);
        }
    }

    /* renamed from: U */
    private void m35515U() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final RunnableC1734c runnableC1734c = new RunnableC1734c();
        this.f5324c.mo10402a(new InterfaceC1485s(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.InterfaceC1485s
            /* renamed from: n */
            public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY) {
                    handler.removeCallbacks(runnableC1734c);
                    interfaceC1491v.mo137b().mo10400c(this);
                }
            }
        });
        handler.postDelayed(runnableC1734c, 10000L);
    }

    /* renamed from: V */
    private void m35514V(Fragment fragment, FrameLayout frameLayout) {
        this.f5325d.m37472d1(new C1733b(fragment, frameLayout), false);
    }

    /* renamed from: D */
    void m35532D(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* renamed from: E */
    public boolean m35531E(long j) {
        return j >= 0 && j < ((long) mo29834f());
    }

    /* renamed from: F */
    public abstract Fragment mo35530F(int i);

    /* renamed from: I */
    void m35527I() {
        if (!this.f5331j || m35513W()) {
            return;
        }
        C9552b<Long> c9552b = new C9552b();
        for (int i = 0; i < this.f5327e.m10636o(); i++) {
            long m10640k = this.f5327e.m10640k(i);
            if (!m35531E(m10640k)) {
                c9552b.add(Long.valueOf(m10640k));
                this.f5329g.m10638m(m10640k);
            }
        }
        if (!this.f5330i) {
            this.f5331j = false;
            for (int i2 = 0; i2 < this.f5327e.m10636o(); i2++) {
                long m10640k2 = this.f5327e.m10640k(i2);
                if (!m35526J(m10640k2)) {
                    c9552b.add(Long.valueOf(m10640k2));
                }
            }
        }
        for (Long l : c9552b) {
            m35516T(l.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: M */
    public final void mo35523M(C1736a c1736a, int i) {
        long m36567k = c1736a.m36567k();
        int id2 = c1736a.m35501N().getId();
        Long m35524L = m35524L(id2);
        if (m35524L != null && m35524L.longValue() != m36567k) {
            m35516T(m35524L.longValue());
            this.f5329g.m10638m(m35524L.longValue());
        }
        this.f5329g.m10639l(m36567k, Integer.valueOf(id2));
        m35528H(i);
        FrameLayout m35501N = c1736a.m35501N();
        if (C1112b0.m38447V(m35501N)) {
            if (m35501N.getParent() == null) {
                m35501N.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC1732a(m35501N, c1736a));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        m35527I();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: N */
    public final C1736a mo42215u(ViewGroup viewGroup, int i) {
        return C1736a.m35502M(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: O */
    public final boolean mo35521O(C1736a c1736a) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: P */
    public final void mo35520P(C1736a c1736a) {
        m35517S(c1736a);
        m35527I();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: Q */
    public final void mo35519Q(C1736a c1736a) {
        Long m35524L = m35524L(c1736a.m35501N().getId());
        if (m35524L != null) {
            m35516T(m35524L.longValue());
            this.f5329g.m10638m(m35524L.longValue());
        }
    }

    /* renamed from: S */
    void m35517S(final C1736a c1736a) {
        Fragment m10644f = this.f5327e.m10644f(c1736a.m36567k());
        if (m10644f != null) {
            FrameLayout m35501N = c1736a.m35501N();
            View m37584h0 = m10644f.m37584h0();
            if (!m10644f.m37573n0() && m37584h0 != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (m10644f.m37573n0() && m37584h0 == null) {
                m35514V(m10644f, m35501N);
                return;
            } else if (m10644f.m37573n0() && m37584h0.getParent() != null) {
                if (m37584h0.getParent() != m35501N) {
                    m35532D(m37584h0, m35501N);
                    return;
                }
                return;
            } else if (m10644f.m37573n0()) {
                m35532D(m37584h0, m35501N);
                return;
            } else if (!m35513W()) {
                m35514V(m10644f, m35501N);
                AbstractC1382r m37447m = this.f5325d.m37447m();
                m37447m.m37186d(m10644f, "f" + c1736a.m36567k()).mo37174p(m10644f, AbstractC1469p.EnumC1472c.STARTED).mo37182h();
                this.f5326h.m35504d(false);
                return;
            } else if (this.f5325d.m37522G0()) {
                return;
            } else {
                this.f5324c.mo10402a(new InterfaceC1485s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.InterfaceC1485s
                    /* renamed from: n */
                    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                        if (FragmentStateAdapter.this.m35513W()) {
                            return;
                        }
                        interfaceC1491v.mo137b().mo10400c(this);
                        if (C1112b0.m38447V(c1736a.m35501N())) {
                            FragmentStateAdapter.this.m35517S(c1736a);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* renamed from: W */
    boolean m35513W() {
        return this.f5325d.m37510M0();
    }

    @Override // androidx.viewpager2.adapter.InterfaceC1737b
    /* renamed from: a */
    public final Parcelable mo35500a() {
        Bundle bundle = new Bundle(this.f5327e.m10636o() + this.f5328f.m10636o());
        for (int i = 0; i < this.f5327e.m10636o(); i++) {
            long m10640k = this.f5327e.m10640k(i);
            Fragment m10644f = this.f5327e.m10644f(m10640k);
            if (m10644f != null && m10644f.m37573n0()) {
                this.f5325d.m37475c1(bundle, m35529G("f#", m10640k), m10644f);
            }
        }
        for (int i2 = 0; i2 < this.f5328f.m10636o(); i2++) {
            long m10640k2 = this.f5328f.m10640k(i2);
            if (m35531E(m10640k2)) {
                bundle.putParcelable(m35529G("s#", m10640k2), this.f5328f.m10644f(m10640k2));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.InterfaceC1737b
    /* renamed from: b */
    public final void mo35499b(Parcelable parcelable) {
        if (this.f5328f.m10641j() && this.f5327e.m10641j()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (m35525K(str, "f#")) {
                    this.f5327e.m10639l(m35518R(str, "f#"), this.f5325d.m37434q0(bundle, str));
                } else if (m35525K(str, "s#")) {
                    long m35518R = m35518R(str, "s#");
                    Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                    if (m35531E(m35518R)) {
                        this.f5328f.m10639l(m35518R, savedState);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (this.f5327e.m10641j()) {
                return;
            }
            this.f5331j = true;
            this.f5330i = true;
            m35527I();
            m35515U();
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: g */
    public long mo29862g(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: r */
    public void mo35512r(RecyclerView recyclerView) {
        C1076h.m38624a(this.f5326h == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f5326h = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.m35506b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: v */
    public void mo35511v(RecyclerView recyclerView) {
        this.f5326h.m35505c(recyclerView);
        this.f5326h = null;
    }
}
