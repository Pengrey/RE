package presentation.debug;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p206kk.TermsAndConditionsActivity;
import p314qd.InterfaceC9717b;
import p320qj.DebugViewModel;
import p426wg.AbstractC11997s;
import p494zh.BaseActivity;
import presentation.debug.DebugActivity;
import pt.pingodoce.app.presentation.debug.cache.CacheActivity;

/* compiled from: DebugActivity.kt */
/* loaded from: classes2.dex */
public final class DebugActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f22359f0;

    /* compiled from: DebugActivity.kt */
    /* renamed from: presentation.debug.DebugActivity$a */
    /* loaded from: classes2.dex */
    static final class C8666a extends AbstractC6438m implements InterfaceC6097a {
        C8666a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(DebugActivity.this.m14804x1(), DebugActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m14838A1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10026b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m14837B1(AbstractC11997s abstractC11997s, String str) {
        Intrinsics.isThisObjectNull(abstractC11997s, "$binding");
        abstractC11997s.f31411y.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m14836C1(AbstractC11997s abstractC11997s, String str) {
        Intrinsics.isThisObjectNull(abstractC11997s, "$binding");
        abstractC11997s.f31408L.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m14835D1(AbstractC11997s abstractC11997s, String str) {
        Intrinsics.isThisObjectNull(abstractC11997s, "$binding");
        abstractC11997s.f31410x.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m14834E1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10024d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m14833F1(DebugActivity debugActivity, View view) {
        Intrinsics.isThisObjectNull(debugActivity, "this$0");
        debugActivity.startActivity(new Intent(debugActivity, CacheActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m14832G1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10027a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m14831H1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10030X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m14830I1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10028Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m14828J1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10025c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m14826K1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10029Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m14825L1(DebugActivity debugActivity, View view) {
        Intrinsics.isThisObjectNull(debugActivity, "this$0");
        TermsAndConditionsActivity.m20276b(debugActivity, "title", "https://poupamais.pt/pt/welcome/sale_conditions", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m14824M1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10035S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m14823N1(DebugViewModel debugViewModel, View view) {
        Intrinsics.isThisObjectNull(debugViewModel, "$viewModel");
        debugViewModel.m10034T();
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m14821i1(DebugActivity debugActivity, View view) {
        m14825L1(debugActivity, view);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m14820j1(DebugViewModel debugViewModel, View view) {
        m14830I1(debugViewModel, view);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m14819k1(DebugViewModel debugViewModel, View view) {
        m14828J1(debugViewModel, view);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m14818l1(AbstractC11997s abstractC11997s, String str) {
        m14835D1(abstractC11997s, str);
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m14817m1(AbstractC11997s abstractC11997s, String str) {
        m14836C1(abstractC11997s, str);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m14815n1(DebugViewModel debugViewModel, View view) {
        m14823N1(debugViewModel, view);
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m14814o1(DebugViewModel debugViewModel, View view) {
        m14831H1(debugViewModel, view);
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m14813p1(DebugViewModel debugViewModel, View view) {
        m14824M1(debugViewModel, view);
    }

    /* renamed from: q1 */
    public static /* synthetic */ void m14812q1(DebugActivity debugActivity, View view) {
        m14833F1(debugActivity, view);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m14811r1(DebugActivity debugActivity, View view) {
        m14802z1(debugActivity, view);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m14810s1(AbstractC11997s abstractC11997s, String str) {
        m14837B1(abstractC11997s, str);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m14809t1(DebugViewModel debugViewModel, View view) {
        m14838A1(debugViewModel, view);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m14808u1(DebugViewModel debugViewModel, View view) {
        m14834E1(debugViewModel, view);
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m14807v1(DebugViewModel debugViewModel, View view) {
        m14832G1(debugViewModel, view);
    }

    /* renamed from: w1 */
    public static /* synthetic */ void m14806w1(DebugViewModel debugViewModel, View view) {
        m14826K1(debugViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m14802z1(DebugActivity debugActivity, View view) {
        Intrinsics.isThisObjectNull(debugActivity, "this$0");
        debugActivity.finish();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m14829J0() {
        return C6450z.m20906b(DebugViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m14827K0() {
        return new C8666a();
    }

    /* renamed from: n */
    public boolean m14816n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_debug;
    }

    /* renamed from: x1 */
    public final ViewModelFactoryByInjection m14804x1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f22359f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y1 */
    public void m14822P0(final AbstractC11997s abstractC11997s, final DebugViewModel debugViewModel) {
        Intrinsics.isThisObjectNull(abstractC11997s, "binding");
        Intrinsics.isThisObjectNull(debugViewModel, "viewModel");
        abstractC11997s.f31400D.setOnClickListener(new View.OnClickListener() { // from class: zf.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14802z1(DebugActivity.this, view);
            }
        });
        abstractC11997s.f31406J.setOnClickListener(new View.OnClickListener() { // from class: zf.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14838A1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31407K.setOnClickListener(new View.OnClickListener() { // from class: zf.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14832G1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31404H.setOnClickListener(new View.OnClickListener() { // from class: zf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14831H1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31403G.setOnClickListener(new View.OnClickListener() { // from class: zf.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14830I1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31401E.setOnClickListener(new View.OnClickListener() { // from class: zf.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14828J1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31402F.setOnClickListener(new View.OnClickListener() { // from class: zf.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14826K1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31405I.setOnClickListener(new View.OnClickListener() { // from class: zf.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14825L1(DebugActivity.this, view);
            }
        });
        abstractC11997s.f31397A.setOnClickListener(new View.OnClickListener() { // from class: zf.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14824M1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31398B.setOnClickListener(new View.OnClickListener() { // from class: zf.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14823N1(DebugViewModel.this, view);
            }
        });
        debugViewModel.m10033U().mo171i(this, new InterfaceC1440f0() { // from class: zf.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                DebugActivity.m14837B1(AbstractC11997s.this, (String) obj);
            }
        });
        debugViewModel.m10031W().mo171i(this, new InterfaceC1440f0() { // from class: zf.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                DebugActivity.m14836C1(AbstractC11997s.this, (String) obj);
            }
        });
        debugViewModel.m10032V().mo171i(this, new InterfaceC1440f0() { // from class: zf.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                DebugActivity.m14835D1(AbstractC11997s.this, (String) obj);
            }
        });
        abstractC11997s.f31399C.setOnClickListener(new View.OnClickListener() { // from class: zf.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14834E1(DebugViewModel.this, view);
            }
        });
        abstractC11997s.f31412z.setOnClickListener(new View.OnClickListener() { // from class: zf.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugActivity.m14833F1(DebugActivity.this, view);
            }
        });
    }
}
