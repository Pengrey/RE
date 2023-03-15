package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.e */
/* loaded from: classes.dex */
public final class C3737e {

    /* renamed from: a */
    private final TabLayout f10572a;

    /* renamed from: b */
    private final ViewPager2 f10573b;

    /* renamed from: c */
    private final boolean f10574c;

    /* renamed from: d */
    private final boolean f10575d;

    /* renamed from: e */
    private final InterfaceC3739b f10576e;

    /* renamed from: f */
    private RecyclerView.AbstractC1535g<?> f10577f;

    /* renamed from: g */
    private boolean f10578g;

    /* renamed from: h */
    private C3740c f10579h;

    /* renamed from: i */
    private TabLayout.InterfaceC3724d f10580i;

    /* renamed from: j */
    private RecyclerView.AbstractC1537i f10581j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.e$a */
    /* loaded from: classes.dex */
    public class C3738a extends RecyclerView.AbstractC1537i {
        C3738a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: a */
        public void mo29102a() {
            C3737e.this.m29103b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: b */
        public void mo29101b(int i, int i2) {
            C3737e.this.m29103b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: c */
        public void mo29100c(int i, int i2, Object obj) {
            C3737e.this.m29103b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: d */
        public void mo29099d(int i, int i2) {
            C3737e.this.m29103b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: e */
        public void mo29098e(int i, int i2, int i3) {
            C3737e.this.m29103b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: f */
        public void mo29097f(int i, int i2) {
            C3737e.this.m29103b();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3739b {
        /* renamed from: a */
        void mo8459a(TabLayout.C3728f c3728f, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.e$c */
    /* loaded from: classes.dex */
    public static class C3740c extends ViewPager2.AbstractC1747i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f10583a;

        /* renamed from: b */
        private int f10584b;

        /* renamed from: c */
        private int f10585c;

        C3740c(TabLayout tabLayout) {
            this.f10583a = new WeakReference<>(tabLayout);
            m29093d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
        /* renamed from: a */
        public void mo29096a(int i) {
            this.f10584b = this.f10585c;
            this.f10585c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
        /* renamed from: b */
        public void mo29095b(int i, float f, int i2) {
            TabLayout tabLayout = this.f10583a.get();
            if (tabLayout != null) {
                int i3 = this.f10585c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f10584b == 1;
                if (i3 != 2 || this.f10584b != 0) {
                    z = true;
                }
                tabLayout.m29199K(i, f, z2, z);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
        /* renamed from: c */
        public void mo29094c(int i) {
            TabLayout tabLayout = this.f10583a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f10585c;
            tabLayout.m29202H(tabLayout.m29170x(i), i2 == 0 || (i2 == 2 && this.f10584b == 0));
        }

        /* renamed from: d */
        void m29093d() {
            this.f10585c = 0;
            this.f10584b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.e$d */
    /* loaded from: classes.dex */
    public static class C3741d implements TabLayout.InterfaceC3724d {

        /* renamed from: a */
        private final ViewPager2 f10586a;

        /* renamed from: b */
        private final boolean f10587b;

        C3741d(ViewPager2 viewPager2, boolean z) {
            this.f10586a = viewPager2;
            this.f10587b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3723c
        /* renamed from: a */
        public void mo29092a(TabLayout.C3728f c3728f) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3723c
        /* renamed from: b */
        public void mo29091b(TabLayout.C3728f c3728f) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3723c
        /* renamed from: c */
        public void mo29090c(TabLayout.C3728f c3728f) {
            this.f10586a.m35489j(c3728f.m29150g(), this.f10587b);
        }
    }

    public C3737e(TabLayout tabLayout, ViewPager2 viewPager2, InterfaceC3739b interfaceC3739b) {
        this(tabLayout, viewPager2, true, interfaceC3739b);
    }

    /* renamed from: a */
    public void m29104a() {
        if (!this.f10578g) {
            RecyclerView.AbstractC1535g<?> adapter = this.f10573b.getAdapter();
            this.f10577f = adapter;
            if (adapter != null) {
                this.f10578g = true;
                C3740c c3740c = new C3740c(this.f10572a);
                this.f10579h = c3740c;
                this.f10573b.m35492g(c3740c);
                C3741d c3741d = new C3741d(this.f10573b, this.f10575d);
                this.f10580i = c3741d;
                this.f10572a.m29190d(c3741d);
                if (this.f10574c) {
                    C3738a c3738a = new C3738a();
                    this.f10581j = c3738a;
                    this.f10577f.m36550A(c3738a);
                }
                m29103b();
                this.f10572a.m29200J(this.f10573b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: b */
    void m29103b() {
        this.f10572a.m29206D();
        RecyclerView.AbstractC1535g<?> abstractC1535g = this.f10577f;
        if (abstractC1535g != null) {
            int mo29834f = abstractC1535g.mo29834f();
            for (int i = 0; i < mo29834f; i++) {
                TabLayout.C3728f m29209A = this.f10572a.m29209A();
                this.f10576e.mo8459a(m29209A, i);
                this.f10572a.m29187g(m29209A, false);
            }
            if (mo29834f > 0) {
                int min = Math.min(this.f10573b.getCurrentItem(), this.f10572a.getTabCount() - 1);
                if (min != this.f10572a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f10572a;
                    tabLayout.m29203G(tabLayout.m29170x(min));
                }
            }
        }
    }

    public C3737e(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, InterfaceC3739b interfaceC3739b) {
        this(tabLayout, viewPager2, z, true, interfaceC3739b);
    }

    public C3737e(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, InterfaceC3739b interfaceC3739b) {
        this.f10572a = tabLayout;
        this.f10573b = viewPager2;
        this.f10574c = z;
        this.f10575d = z2;
        this.f10576e = interfaceC3739b;
    }
}
