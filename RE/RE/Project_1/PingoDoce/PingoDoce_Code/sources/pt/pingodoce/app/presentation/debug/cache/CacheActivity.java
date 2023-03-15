package pt.pingodoce.app.presentation.debug.cache;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p342rj.CacheViewModel;
import p426wg.AbstractC11918o;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import pt.pingodoce.app.presentation.debug.cache.CacheActivity;
import td.C10549n2;
import td.InterfaceC10524i0;

/* compiled from: CacheActivity.kt */
/* loaded from: classes2.dex */
public final class CacheActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24097f0;

    /* compiled from: CacheActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.debug.cache.CacheActivity$a */
    /* loaded from: classes2.dex */
    static final class C9145a extends AbstractC6438m implements InterfaceC6097a {
        C9145a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(CacheActivity.this.m12306l1(), CacheActivity.this, null, 2, null);
        }
    }

    /* compiled from: CacheActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.debug.cache.CacheActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9146b implements AdapterView.OnItemSelectedListener {

        /* renamed from: x */
        final /* synthetic */ CacheViewModel f24100x;

        /* compiled from: CacheActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.cache.CacheActivity$initViews$1$onItemSelected$1", m20196f = "CacheActivity.kt", m20195l = {40}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.debug.cache.CacheActivity$b$a */
        /* loaded from: classes2.dex */
        static final class C9147a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24101x;

            /* renamed from: y */
            final /* synthetic */ CacheViewModel f24102y;

            /* renamed from: z */
            final /* synthetic */ int f24103z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9147a(CacheViewModel cacheViewModel, int i, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24102y = cacheViewModel;
                this.f24103z = i;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9147a(this.f24102y, this.f24103z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9147a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24101x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    CacheViewModel cacheViewModel = this.f24102y;
                    int i2 = this.f24103z;
                    this.f24101x = 1;
                    if (cacheViewModel.m9706S(i2, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        C9146b(CacheViewModel cacheViewModel) {
            this.f24100x = cacheViewModel;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            C6772d.m20158d(LifecycleOwner.m36965a(CacheActivity.this), null, null, new C9147a(this.f24100x, i, null), 3, null);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.cache.CacheActivity$initViews$2$1", m20196f = "CacheActivity.kt", m20195l = {51}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.debug.cache.CacheActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9148c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24104x;

        /* renamed from: y */
        final /* synthetic */ CacheViewModel f24105y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9148c(CacheViewModel cacheViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24105y = cacheViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9148c(this.f24105y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9148c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24104x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CacheViewModel cacheViewModel = this.f24105y;
                this.f24104x = 1;
                if (cacheViewModel.m9709P(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.cache.CacheActivity$initViews$3$1", m20196f = "CacheActivity.kt", m20195l = {57}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.debug.cache.CacheActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9149d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24106x;

        /* renamed from: y */
        final /* synthetic */ CacheViewModel f24107y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9149d(CacheViewModel cacheViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24107y = cacheViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9149d(this.f24107y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9149d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24106x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CacheViewModel cacheViewModel = this.f24107y;
                this.f24106x = 1;
                if (cacheViewModel.m9712M(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12309i1(CacheActivity cacheActivity, CacheViewModel cacheViewModel, View view) {
        m12303n1(cacheActivity, cacheViewModel, view);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12308j1(CacheActivity cacheActivity, CacheViewModel cacheViewModel, View view) {
        m12302o1(cacheActivity, cacheViewModel, view);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m12307k1(AbstractC11918o abstractC11918o, String str) {
        m12301p1(abstractC11918o, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m12303n1(CacheActivity cacheActivity, CacheViewModel cacheViewModel, View view) {
        Intrinsics.isThisObjectNull(cacheActivity, "this$0");
        Intrinsics.isThisObjectNull(cacheViewModel, "$viewModel");
        C6772d.m20158d(LifecycleOwner.m36965a(cacheActivity), C10549n2.m7695b(null, 1, null), null, new C9148c(cacheViewModel, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m12302o1(CacheActivity cacheActivity, CacheViewModel cacheViewModel, View view) {
        Intrinsics.isThisObjectNull(cacheActivity, "this$0");
        Intrinsics.isThisObjectNull(cacheViewModel, "$viewModel");
        C6772d.m20158d(LifecycleOwner.m36965a(cacheActivity), C10549n2.m7695b(null, 1, null), null, new C9149d(cacheViewModel, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m12301p1(AbstractC11918o abstractC11918o, String str) {
        Intrinsics.isThisObjectNull(abstractC11918o, "$binding");
        abstractC11918o.f31078y.setText(str);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12312J0() {
        return C6450z.m20906b(CacheViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12311K0() {
        return new C9145a();
    }

    /* renamed from: l1 */
    public final ViewModelFactoryByInjection m12306l1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24097f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m1 */
    public void m12310P0(final AbstractC11918o abstractC11918o, final CacheViewModel cacheViewModel) {
        Intrinsics.isThisObjectNull(abstractC11918o, "binding");
        Intrinsics.isThisObjectNull(cacheViewModel, "viewModel");
        abstractC11918o.f31076A.setAdapter((SpinnerAdapter) new ArrayAdapter(getBaseContext(), (int) C2336R.layout.view_text_view, cacheViewModel.m9711N()));
        abstractC11918o.f31076A.setOnItemSelectedListener(new C9146b(cacheViewModel));
        abstractC11918o.f31079z.setOnClickListener(new View.OnClickListener() { // from class: rj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CacheActivity.m12303n1(CacheActivity.this, cacheViewModel, view);
            }
        });
        abstractC11918o.f31077x.setOnClickListener(new View.OnClickListener() { // from class: rj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CacheActivity.m12302o1(CacheActivity.this, cacheViewModel, view);
            }
        });
        cacheViewModel.m9710O().mo171i(this, new InterfaceC1440f0() { // from class: rj.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                CacheActivity.m12301p1(AbstractC11918o.this, (String) obj);
            }
        });
    }

    /* renamed from: n */
    public boolean m12304n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_cache;
    }
}
