package p140he;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.ViewModelProvider;
import ge.C5645b;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.io.InputStream;
import java.util.Objects;
import ke.CoreBaseViewModel;
import ne.EventObserver;
import p050d.C4519c;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p274oe.BooleanDialogEvent;
import p274oe.OkDialogEvent;
import p274oe.PhotoDialogEvent;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import pe.C8615b;
import vc.AbstractActivityC11204b;

/* renamed from: he.d */
/* loaded from: classes2.dex */
public abstract class CoreBaseActivity<ViewBinding extends ViewDataBinding, ViewModel extends CoreBaseViewModel> extends AbstractActivityC11204b {

    /* renamed from: P */
    public UiWidgets f16363P;

    /* renamed from: Q */
    private final InterfaceC13178g f16364Q;

    /* renamed from: R */
    private final InterfaceC13178g f16365R;

    /* renamed from: S */
    private AbstractC9725a f16366S;

    /* renamed from: T */
    private Toolbar f16367T;

    /* renamed from: U */
    private UiWidgets.InterfaceC7048e f16368U;

    /* renamed from: V */
    private final AbstractC0304b f16369V;

    /* renamed from: W */
    private final AbstractC0304b f16370W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$a */
    /* loaded from: classes2.dex */
    public static final class C5912a extends AbstractC6438m implements InterfaceC6097a {
        C5912a() {
            super(0);
        }

        /* renamed from: a */
        public final ViewDataBinding mo42214q() {
            CoreBaseActivity coreBaseActivity = CoreBaseActivity.this;
            return C1275f.m37762g(coreBaseActivity, coreBaseActivity.mo21966x0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$b */
    /* loaded from: classes2.dex */
    public static final class C5913b extends AbstractC6438m implements InterfaceC6108l {
        C5913b() {
            super(1);
        }

        /* renamed from: a */
        public final void m22734a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            CoreBaseActivity.this.setResult(((Number) c13182l.m1460c()).intValue(), (Intent) c13182l.m1459d());
            CoreBaseActivity.this.finish();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22734a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$c */
    /* loaded from: classes2.dex */
    public static final class C5914c extends AbstractC6438m implements InterfaceC6108l {
        C5914c() {
            super(1);
        }

        /* renamed from: a */
        public final void m22733a(String str) {
            Intrinsics.isThisObjectNull(str, "message");
            CoreBaseActivity.this.m22759H0().m19484y(str);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22733a((String) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$d */
    /* loaded from: classes2.dex */
    public static final class C5915d extends AbstractC6438m implements InterfaceC6108l {
        C5915d() {
            super(1);
        }

        /* renamed from: a */
        public final void m22732a(BooleanDialogEvent booleanDialogEvent) {
            Intrinsics.isThisObjectNull(booleanDialogEvent, "dialog");
            UiWidgets.InterfaceC7044a interfaceC7044a = (UiWidgets.InterfaceC7044a) booleanDialogEvent.m17013e().get();
            if (interfaceC7044a != null) {
                CoreBaseActivity.this.m22759H0().m19497l(booleanDialogEvent.m17672d(), booleanDialogEvent.m17673c(), booleanDialogEvent.m17011g(), booleanDialogEvent.m17012f(), interfaceC7044a);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22732a((BooleanDialogEvent) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$e */
    /* loaded from: classes2.dex */
    public static final class C5916e extends AbstractC6438m implements InterfaceC6108l {
        C5916e() {
            super(1);
        }

        /* renamed from: a */
        public final void m22731a(OkDialogEvent okDialogEvent) {
            Intrinsics.isThisObjectNull(okDialogEvent, "dialog");
            CoreBaseActivity.this.m22759H0().m19489t(okDialogEvent.m17672d(), okDialogEvent.m17673c(), (UiWidgets.InterfaceC7047d) okDialogEvent.m17008e().get());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22731a((OkDialogEvent) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$f */
    /* loaded from: classes2.dex */
    public static final class C5917f extends AbstractC6438m implements InterfaceC6108l {
        C5917f() {
            super(1);
        }

        /* renamed from: a */
        public final void m22730a(PhotoDialogEvent photoDialogEvent) {
            Intrinsics.isThisObjectNull(photoDialogEvent, "dialog");
            UiWidgets.InterfaceC7048e interfaceC7048e = (UiWidgets.InterfaceC7048e) photoDialogEvent.m17005e().get();
            if (interfaceC7048e != null) {
                CoreBaseActivity coreBaseActivity = CoreBaseActivity.this;
                CoreBaseActivity.m22744p0(coreBaseActivity, interfaceC7048e);
                coreBaseActivity.m22759H0().m19487v(CoreBaseActivity.m22747m0(coreBaseActivity), CoreBaseActivity.m22746n0(coreBaseActivity));
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22730a((PhotoDialogEvent) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$g */
    /* loaded from: classes2.dex */
    public static final class C5918g extends AbstractC6438m implements InterfaceC6097a {
        C5918g() {
            super(0);
        }

        /* renamed from: a */
        public final CoreBaseViewModel mo42214q() {
            return CoreBaseActivity.m22745o0(CoreBaseActivity.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$h */
    /* loaded from: classes2.dex */
    public static final class C5919h extends AbstractC6438m implements InterfaceC6097a {
        C5919h() {
            super(0);
        }

        /* renamed from: a */
        public final C1486s0 mo42214q() {
            C1486s0 mo36970z = CoreBaseActivity.this.mo36970z();
            Intrinsics.checkIfNull(mo36970z, "viewModelStore");
            return mo36970z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseActivity.kt */
    /* renamed from: he.d$i */
    /* loaded from: classes2.dex */
    public static final class C5920i extends AbstractC6438m implements InterfaceC6097a {
        C5920i() {
            super(0);
        }

        /* renamed from: a */
        public final C1479r0.InterfaceC1481b mo42214q() {
            C1479r0.InterfaceC1481b mo36992p = CoreBaseActivity.this.mo36992p();
            Intrinsics.checkIfNull(mo36992p, "defaultViewModelProviderFactory");
            return mo36992p;
        }
    }

    public CoreBaseActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        m1464a = LazyJVM.m1464a(new C5918g());
        this.f16364Q = m1464a;
        m1464a2 = LazyJVM.m1464a(new C5912a());
        this.f16365R = m1464a2;
        AbstractC0304b<I> m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: he.c
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                CoreBaseActivity.m22743q0(CoreBaseActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…Bitmap })\n        }\n    }");
        this.f16369V = m41364M;
        AbstractC0304b<I> m41364M2 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: he.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                CoreBaseActivity.m22739u0(CoreBaseActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…       })\n        }\n    }");
        this.f16370W = m41364M2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m22762C0(CoreBaseActivity coreBaseActivity, View view) {
        Intrinsics.isThisObjectNull(coreBaseActivity, "this$0");
        coreBaseActivity.onBackPressed();
    }

    /* renamed from: N0 */
    private final CoreBaseViewModel m22756N0() {
        return m22755O0(m22751T0(mo11861J0(), mo11860K0()));
    }

    /* renamed from: O0 */
    private static final CoreBaseViewModel m22755O0(InterfaceC13178g interfaceC13178g) {
        return (CoreBaseViewModel) interfaceC13178g.getValue();
    }

    /* renamed from: Q0 */
    private final void m22754Q0() {
        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
        uiEventsLiveData.m19528b().mo171i(this, new EventObserver(new C5913b()));
        uiEventsLiveData.m19523g().mo171i(this, new EventObserver(new C5914c()));
        uiEventsLiveData.m19529a().mo171i(this, new EventObserver(new C5915d()));
        uiEventsLiveData.m19525e().mo171i(this, new EventObserver(new C5916e()));
        uiEventsLiveData.m19524f().mo171i(this, new EventObserver(new C5917f()));
    }

    /* renamed from: R0 */
    private final void m22753R0(Toolbar toolbar) {
        if (toolbar != null) {
            this.f16367T = toolbar;
            toolbar.setContentInsetStartWithNavigation(0);
            m22741s0(m22752S0());
            Toolbar toolbar2 = null;
            if (m22760G0() > 0) {
                Toolbar toolbar3 = this.f16367T;
                if (toolbar3 == null) {
                    Intrinsics.throwUninitPropException("toolbar");
                    toolbar3 = null;
                }
                toolbar3.setTitle(m22760G0());
            }
            if (m22761F0() > 0) {
                Toolbar toolbar4 = this.f16367T;
                if (toolbar4 == null) {
                    Intrinsics.throwUninitPropException("toolbar");
                    toolbar4 = null;
                }
                toolbar4.setSubtitle(m22761F0());
            }
            if (m22764A0() > 0) {
                Toolbar toolbar5 = this.f16367T;
                if (toolbar5 == null) {
                    Intrinsics.throwUninitPropException("toolbar");
                    toolbar5 = null;
                }
                toolbar5.m40698x(m22764A0());
            }
            if (m22736z0() != null) {
                Toolbar toolbar6 = this.f16367T;
                if (toolbar6 == null) {
                    Intrinsics.throwUninitPropException("toolbar");
                } else {
                    toolbar2 = toolbar6;
                }
                toolbar2.setOnMenuItemClickListener(m22736z0());
            }
        }
    }

    /* renamed from: T0 */
    private final InterfaceC13178g m22751T0(InterfaceC9717b interfaceC9717b, InterfaceC6097a interfaceC6097a) {
        C5919h c5919h = new C5919h();
        if (interfaceC6097a == null) {
            interfaceC6097a = new C5920i();
        }
        return new ViewModelProvider(interfaceC9717b, c5919h, interfaceC6097a);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m22750j0(CoreBaseActivity coreBaseActivity, ActivityResult activityResult) {
        m22739u0(coreBaseActivity, activityResult);
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m22749k0(CoreBaseActivity coreBaseActivity, View view) {
        m22762C0(coreBaseActivity, view);
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m22748l0(CoreBaseActivity coreBaseActivity, ActivityResult activityResult) {
        m22743q0(coreBaseActivity, activityResult);
    }

    /* renamed from: m0 */
    public static final /* synthetic */ AbstractC0304b m22747m0(CoreBaseActivity coreBaseActivity) {
        return coreBaseActivity.f16369V;
    }

    /* renamed from: n0 */
    public static final /* synthetic */ AbstractC0304b m22746n0(CoreBaseActivity coreBaseActivity) {
        return coreBaseActivity.f16370W;
    }

    /* renamed from: o0 */
    public static final /* synthetic */ CoreBaseViewModel m22745o0(CoreBaseActivity coreBaseActivity) {
        return coreBaseActivity.m22756N0();
    }

    /* renamed from: p0 */
    public static final /* synthetic */ void m22744p0(CoreBaseActivity coreBaseActivity, UiWidgets.InterfaceC7048e interfaceC7048e) {
        coreBaseActivity.f16368U = interfaceC7048e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public static final void m22743q0(CoreBaseActivity coreBaseActivity, ActivityResult activityResult) {
        UiWidgets.InterfaceC7048e interfaceC7048e;
        Bitmap bitmap;
        Bundle extras;
        Intrinsics.isThisObjectNull(coreBaseActivity, "this$0");
        if (activityResult.m41351b() != -1 || (interfaceC7048e = coreBaseActivity.f16368U) == null) {
            return;
        }
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null) {
            bitmap = null;
        } else {
            Object obj = extras.get("data");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
            bitmap = (Bitmap) obj;
        }
        interfaceC7048e.m19481a(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m22739u0(CoreBaseActivity coreBaseActivity, ActivityResult activityResult) {
        UiWidgets.InterfaceC7048e interfaceC7048e;
        Uri data;
        InputStream openInputStream;
        Intrinsics.isThisObjectNull(coreBaseActivity, "this$0");
        if (activityResult.m41351b() != -1 || (interfaceC7048e = coreBaseActivity.f16368U) == null) {
            return;
        }
        Intent m41352a = activityResult.m41352a();
        Bitmap bitmap = null;
        if (m41352a != null && (data = m41352a.getData()) != null && (openInputStream = coreBaseActivity.getContentResolver().openInputStream(data)) != null) {
            bitmap = BitmapFactory.decodeStream(openInputStream, null, null);
        }
        interfaceC7048e.m19481a(bitmap);
    }

    /* renamed from: A0 */
    protected int m22764A0() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B0 */
    public View.OnClickListener m22763B0() {
        return new View.OnClickListener() { // from class: he.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreBaseActivity.m22762C0(CoreBaseActivity.this, view);
            }
        };
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C5645b.ic_arrow_back;
    }

    /* renamed from: E0 */
    protected abstract Integer mo154E0();

    /* renamed from: F0 */
    protected int m22761F0() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public int m22760G0() {
        return -1;
    }

    /* renamed from: H0 */
    public final UiWidgets m22759H0() {
        UiWidgets uiWidgets = this.f16363P;
        if (uiWidgets != null) {
            return uiWidgets;
        }
        Intrinsics.throwUninitPropException("uiWidgets");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I0 */
    public final CoreBaseViewModel m22758I0() {
        return (CoreBaseViewModel) this.f16364Q.getValue();
    }

    /* renamed from: J0 */
    protected abstract InterfaceC9717b mo11861J0();

    /* renamed from: K0 */
    protected InterfaceC6097a mo11860K0() {
        return null;
    }

    /* renamed from: L0 */
    protected abstract int mo153L0();

    /* renamed from: M0 */
    protected boolean m22757M0() {
        return false;
    }

    /* renamed from: P0 */
    protected abstract void mo11851p1(ViewDataBinding viewDataBinding, CoreBaseViewModel coreBaseViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S0 */
    public boolean m22752S0() {
        return true;
    }

    public void finish() {
        super.finish();
        C13195u c13195u = C13195u.f34156a;
        AbstractC9725a abstractC9725a = this.f16366S;
        AbstractC9725a abstractC9725a2 = null;
        if (abstractC9725a == null) {
            Intrinsics.throwUninitPropException("activityTransition");
            abstractC9725a = null;
        }
        int m10117a = abstractC9725a.m10117a();
        AbstractC9725a abstractC9725a3 = this.f16366S;
        if (abstractC9725a3 == null) {
            Intrinsics.throwUninitPropException("activityTransition");
        } else {
            abstractC9725a2 = abstractC9725a3;
        }
        overridePendingTransition(m10117a, abstractC9725a2.m10116b());
    }

    public void onBackPressed() {
        if (m22757M0() || m22758I0().m20387j().mo172f() == null || Intrinsics.equals(m22758I0().m20387j().mo172f(), Boolean.FALSE)) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getWindow().setSoftInputMode(3);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.excludeTarget(16908335, true);
        autoTransition.excludeTarget(16908336, true);
        getWindow().setEnterTransition(autoTransition);
        getWindow().setExitTransition(autoTransition);
        AbstractC9725a mo42216v0 = mo42216v0();
        this.f16366S = mo42216v0;
        if (mo42216v0 == null) {
            Intrinsics.throwUninitPropException("activityTransition");
            mo42216v0 = null;
        }
        int m10115c = mo42216v0.m10115c();
        AbstractC9725a abstractC9725a = this.f16366S;
        if (abstractC9725a == null) {
            Intrinsics.throwUninitPropException("activityTransition");
            abstractC9725a = null;
        }
        overridePendingTransition(m10115c, abstractC9725a.m10114d());
        super.onCreate(bundle);
        m22738w0().mo3594K(this);
        m22738w0().mo3593M(mo153L0(), m22758I0());
        m22754Q0();
        View m37802s = m22738w0().m37802s();
        Integer mo154E0 = mo154E0();
        View findViewById = m37802s.findViewById(mo154E0 != null ? mo154E0.intValue() : -1);
        m22753R0(findViewById instanceof Toolbar ? (Toolbar) findViewById : null);
        mo11851p1(m22738w0(), m22758I0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r0 */
    public final void m22742r0(int i) {
        if (m22752S0()) {
            Toolbar toolbar = this.f16367T;
            if (toolbar == null) {
                Intrinsics.throwUninitPropException("toolbar");
                toolbar = null;
            }
            toolbar.setNavigationIcon(i);
        }
    }

    /* renamed from: s0 */
    protected final void m22741s0(boolean z) {
        Toolbar toolbar = null;
        if (z) {
            Toolbar toolbar2 = this.f16367T;
            if (toolbar2 == null) {
                Intrinsics.throwUninitPropException("toolbar");
                toolbar2 = null;
            }
            toolbar2.setNavigationIcon(mo11827D0());
        } else {
            Toolbar toolbar3 = this.f16367T;
            if (toolbar3 == null) {
                Intrinsics.throwUninitPropException("toolbar");
                toolbar3 = null;
            }
            toolbar3.setNavigationIcon((Drawable) null);
        }
        Toolbar toolbar4 = this.f16367T;
        if (toolbar4 == null) {
            Intrinsics.throwUninitPropException("toolbar");
        } else {
            toolbar = toolbar4;
        }
        toolbar.setNavigationOnClickListener(m22763B0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t0 */
    public final void m22740t0(String str) {
        Intrinsics.isThisObjectNull(str, "title");
        Toolbar toolbar = this.f16367T;
        if (toolbar == null) {
            Intrinsics.throwUninitPropException("toolbar");
            toolbar = null;
        }
        toolbar.setTitle(str);
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8615b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w0 */
    public final ViewDataBinding m22738w0() {
        Object value = this.f16365R.getValue();
        Intrinsics.checkIfNull(value, "<get-binding>(...)");
        return (ViewDataBinding) value;
    }

    /* renamed from: x0 */
    protected abstract int mo21966x0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y0 */
    public final Toolbar m22737y0() {
        Toolbar toolbar = this.f16367T;
        if (toolbar == null) {
            Intrinsics.throwUninitPropException("toolbar");
            return null;
        }
        return toolbar;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m22736z0() {
        return null;
    }
}
