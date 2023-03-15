package p494zh;

import ai.C0158f;
import ai.C0160h;
import ai.C0172m;
import ai.InterfaceC0159g;
import ai.InterfaceC0161i;
import ai.InterfaceC0173n;
import ai.InterfaceC0174o;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.C0903i;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.AbstractC1511p;
import androidx.lifecycle.C1536x;
import androidx.lifecycle.InterfaceC1533v;
import com.github.aachartmodel.aainfographics.C2433R;
import com.google.android.play.core.review.InterfaceC4051c;
import fk.C5797m;
import gm.C5964a;
import hm.C6258b;
import id.InterfaceC6392a;
import id.InterfaceC6403l;
import im.C6519b;
import jm.C6906a;
import mg.C7646c;
import mg.C7677e;
import ne.C8196c;
import p124gk.C5947a;
import p140he.AbstractActivityC6175d;
import p165ij.C6492a;
import p181jd.AbstractC6787m;
import p181jd.Intrinsics;
import p221le.C7434a;
import p279oj.C8624c;
import p468yc.C14124i;
import p468yc.C14139u;
import p468yc.InterfaceC14122g;
import p494zh.AbstractC14875o;

/* compiled from: BaseActivity.kt */
/* renamed from: zh.l */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC14854l<ViewBinding extends ViewDataBinding, ViewModel extends AbstractC14875o> extends AbstractActivityC6175d<ViewBinding, ViewModel> implements InterfaceC0174o {

    /* renamed from: X */
    public C6258b f34968X;

    /* renamed from: Y */
    public C7677e f34969Y;

    /* renamed from: Z */
    public C7646c f34970Z;

    /* renamed from: a0 */
    public InterfaceC4051c f34971a0;

    /* renamed from: b0 */
    private final InterfaceC14122g f34972b0;

    /* renamed from: c0 */
    private final InterfaceC14122g f34973c0;

    /* renamed from: d0 */
    private final InterfaceC14122g f34974d0;

    /* renamed from: e0 */
    private C14855a f34975e0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$a */
    /* loaded from: classes2.dex */
    public static final class C14855a implements InterfaceC1533v {

        /* renamed from: w */
        private C1536x f34976w = new C1536x(this);

        /* renamed from: a */
        public final void m138a() {
            this.f34976w.m36960h(AbstractC1511p.EnumC1513b.ON_START);
        }

        @Override // androidx.lifecycle.InterfaceC1533v
        /* renamed from: b */
        public AbstractC1511p mo137b() {
            return this.f34976w;
        }

        /* renamed from: c */
        public final void m136c() {
            this.f34976w.m36960h(AbstractC1511p.EnumC1513b.ON_DESTROY);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$b */
    /* loaded from: classes2.dex */
    public static final class C14856b extends AbstractC6787m implements InterfaceC6392a<C0158f> {

        /* renamed from: w */
        final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34977w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14856b(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l) {
            super(0);
            this.f34977w = abstractActivityC14854l;
        }

        @Override // id.InterfaceC6392a
        /* renamed from: a */
        public final C0158f mo42214q() {
            AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l = this.f34977w;
            return new C0158f(abstractActivityC14854l, abstractActivityC14854l.m142e1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$c */
    /* loaded from: classes2.dex */
    public static final class C14857c extends AbstractC6787m implements InterfaceC6392a<C0160h> {

        /* renamed from: w */
        final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34978w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14857c(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l) {
            super(0);
            this.f34978w = abstractActivityC14854l;
        }

        @Override // id.InterfaceC6392a
        /* renamed from: a */
        public final C0160h mo42214q() {
            return new C0160h(this.f34978w.m146a1(), this.f34978w.m147Z0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$d */
    /* loaded from: classes2.dex */
    public static final class C14858d extends AbstractC6787m implements InterfaceC6403l<C6519b, C14139u> {

        /* renamed from: w */
        final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34979w;

        /* renamed from: x */
        final /* synthetic */ View f34980x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14858d(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l, View view) {
            super(1);
            this.f34979w = abstractActivityC14854l;
            this.f34980x = view;
        }

        /* renamed from: a */
        public final void m133a(C6519b c6519b) {
            Intrinsics.isThisObjectNull(c6519b, "snackBarObject");
            this.f34979w.m141f1().m22546b(this.f34980x, c6519b.m21905c(), c6519b.m21904d(), c6519b.m21906b(), c6519b.m21907a());
        }

        @Override // id.InterfaceC6403l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C14139u mo9587d(C6519b c6519b) {
            m133a(c6519b);
            return C14139u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$e */
    /* loaded from: classes2.dex */
    public static final class C14859e extends AbstractC6787m implements InterfaceC6392a<C0172m> {

        /* renamed from: w */
        final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34981w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BaseActivity.kt */
        /* renamed from: zh.l$e$a */
        /* loaded from: classes2.dex */
        public static final class C14860a extends AbstractC6787m implements InterfaceC6392a<C14139u> {

            /* renamed from: w */
            final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34982w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14860a(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l) {
                super(0);
                this.f34982w = abstractActivityC14854l;
            }

            /* renamed from: a */
            public final void m131a() {
                this.f34982w.m144c1().m18870z();
            }

            @Override // id.InterfaceC6392a
            /* renamed from: q */
            public /* bridge */ /* synthetic */ C14139u mo42214q() {
                m131a();
                return C14139u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14859e(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l) {
            super(0);
            this.f34981w = abstractActivityC14854l;
        }

        @Override // id.InterfaceC6392a
        /* renamed from: a */
        public final C0172m mo42214q() {
            AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l = this.f34981w;
            return new C0172m(abstractActivityC14854l, new C14860a(abstractActivityC14854l));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$f */
    /* loaded from: classes2.dex */
    public static final class C14861f extends AbstractC6787m implements InterfaceC6403l<Boolean, C14139u> {

        /* renamed from: w */
        final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34983w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14861f(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l) {
            super(1);
            this.f34983w = abstractActivityC14854l;
        }

        /* renamed from: a */
        public final void m129a(boolean z) {
            if (this.f34983w.m144c1().m18877s() || !z) {
                return;
            }
            C5797m.m23738b(this.f34983w, null, 1, null);
        }

        @Override // id.InterfaceC6403l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C14139u mo9587d(Boolean bool) {
            m129a(bool.booleanValue());
            return C14139u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$g */
    /* loaded from: classes2.dex */
    public static final class C14862g extends AbstractC6787m implements InterfaceC6403l<C14139u, C14139u> {

        /* renamed from: w */
        final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34984w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14862g(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l) {
            super(1);
            this.f34984w = abstractActivityC14854l;
        }

        /* renamed from: a */
        public final void m128a(C14139u c14139u) {
            Intrinsics.isThisObjectNull(c14139u, "it");
            C5947a.m23306c(this.f34984w);
        }

        @Override // id.InterfaceC6403l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C14139u mo9587d(C14139u c14139u) {
            m128a(c14139u);
            return C14139u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseActivity.kt */
    /* renamed from: zh.l$h */
    /* loaded from: classes2.dex */
    public static final class C14863h extends AbstractC6787m implements InterfaceC6403l<C14139u, C14139u> {

        /* renamed from: w */
        final /* synthetic */ AbstractActivityC14854l<ViewBinding, ViewModel> f34985w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14863h(AbstractActivityC14854l<ViewBinding, ViewModel> abstractActivityC14854l) {
            super(1);
            this.f34985w = abstractActivityC14854l;
        }

        /* renamed from: a */
        public final void m127a(C14139u c14139u) {
            Intrinsics.isThisObjectNull(c14139u, "it");
            C8624c.m16918b(this.f34985w);
        }

        @Override // id.InterfaceC6403l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C14139u mo9587d(C14139u c14139u) {
            m127a(c14139u);
            return C14139u.f34156a;
        }
    }

    public AbstractActivityC14854l() {
        InterfaceC14122g m1464a;
        InterfaceC14122g m1464a2;
        InterfaceC14122g m1464a3;
        m1464a = C14124i.m1464a(new C14856b(this));
        this.f34972b0 = m1464a;
        m1464a2 = C14124i.m1464a(new C14857c(this));
        this.f34973c0 = m1464a2;
        m1464a3 = C14124i.m1464a(new C14859e(this));
        this.f34974d0 = m1464a3;
        this.f34975e0 = new C14855a();
    }

    /* renamed from: U0 */
    private final void m152U0(View view) {
        C6492a.f16957a.m21970a().mo171i(this, new C8196c(new C14858d(this, view)));
    }

    /* renamed from: d1 */
    private final InterfaceC0173n m143d1() {
        return (InterfaceC0173n) this.f34974d0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p140he.AbstractActivityC6175d
    /* renamed from: D0 */
    public int mo11827D0() {
        return C2433R.C2434drawable.ic_arrow_back;
    }

    @Override // p140he.AbstractActivityC6175d
    /* renamed from: E0 */
    protected Integer mo154E0() {
        return Integer.valueOf((int) C2433R.C2435id.toolbar);
    }

    @Override // p140he.AbstractActivityC6175d
    /* renamed from: L0 */
    protected int mo153L0() {
        return C0903i.f2778I0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V0 */
    public final boolean m151V0() {
        if (((AbstractC14875o) m22758I0()).m100z()) {
            ((AbstractC14875o) m22758I0()).m115G();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W0 */
    public final void m150W0() {
        m144c1().m18878r();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X0 */
    public final boolean m149X0() {
        return m143d1().mo41738b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y0 */
    public final void m148Y0(View view) {
        Intrinsics.isThisObjectNull(view, "view");
        getWindow().setSoftInputMode(5);
        view.requestFocus();
    }

    /* renamed from: Z0 */
    protected final InterfaceC0159g m147Z0() {
        return (InterfaceC0159g) this.f34972b0.getValue();
    }

    /* renamed from: a1 */
    public final C7646c m146a1() {
        C7646c c7646c = this.f34970Z;
        if (c7646c != null) {
            return c7646c;
        }
        Intrinsics.throwUninitPropException("appRatingManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b1 */
    public final InterfaceC0161i m145b1() {
        return (InterfaceC0161i) this.f34973c0.getValue();
    }

    /* renamed from: c1 */
    public final C7677e m144c1() {
        C7677e c7677e = this.f34969Y;
        if (c7677e != null) {
            return c7677e;
        }
        Intrinsics.throwUninitPropException("authManager");
        return null;
    }

    /* renamed from: e1 */
    public final InterfaceC4051c m142e1() {
        InterfaceC4051c interfaceC4051c = this.f34971a0;
        if (interfaceC4051c != null) {
            return interfaceC4051c;
        }
        Intrinsics.throwUninitPropException("reviewManager");
        return null;
    }

    /* renamed from: f1 */
    public final C6258b m141f1() {
        C6258b c6258b = this.f34968X;
        if (c6258b != null) {
            return c6258b;
        }
        Intrinsics.throwUninitPropException("snackBarWidget");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g1 */
    public final C14855a m140g1() {
        return this.f34975e0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h1 */
    public final boolean m139h1() {
        return ((AbstractC14875o) m22758I0()).m100z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p140he.AbstractActivityC6175d, vc.AbstractActivityC12036b, androidx.fragment.app.ActivityC1390d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0939g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String simpleName = getClass().getSimpleName();
        C6906a.m20678a("Creating: " + simpleName, new Object[0]);
        this.f34975e0.m138a();
        View m37802s = m22738w0().m37802s();
        Intrinsics.checkIfNull(m37802s, "binding.root");
        m152U0(m37802s);
        if (((AbstractC14875o) m22758I0()).m121A() && returnFalse()) {
            C5964a.f15980a.m23281a().mo171i(this.f34975e0, new C8196c(new C14861f(this)));
        }
        C7434a c7434a = C7434a.f18671a;
        c7434a.m19527c().mo171i(this, new C8196c(new C14862g(this)));
        c7434a.m19522h().mo171i(this, new C8196c(new C14863h(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0350c, androidx.fragment.app.ActivityC1390d, android.app.Activity
    public void onDestroy() {
        this.f34975e0.m136c();
        if (((AbstractC14875o) m22758I0()).m121A() && returnFalse()) {
            C5964a.f15980a.m23281a().mo167o(this.f34975e0);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC1390d, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m144c1().m18881o()) {
            return;
        }
        m143d1().mo41739a();
    }
}
