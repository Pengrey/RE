package p085eh;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p067dh.AssociationsViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p341ri.ApprovedListFragment;

/* renamed from: eh.a */
/* loaded from: classes2.dex */
public final class C5076a extends ApprovedListFragment {

    /* renamed from: B0 */
    public static final C5077a f14094B0 = new C5077a(null);

    /* renamed from: A0 */
    public ViewModelFactoryByInjection f14095A0;

    /* compiled from: ApprovedRequestsListFragment.kt */
    /* renamed from: eh.a$a */
    /* loaded from: classes2.dex */
    public static final class C5077a {
        private C5077a() {
        }

        public /* synthetic */ C5077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C5076a m25729a() {
            return new C5076a();
        }
    }

    /* compiled from: ApprovedRequestsListFragment.kt */
    /* renamed from: eh.a$b */
    /* loaded from: classes2.dex */
    static final class C5078b extends AbstractC6438m implements InterfaceC6097a {
        C5078b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(C5076a.this.m25730w2(), C5076a.this, null, 2, null);
        }
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m25732k2() {
        return C6450z.m20906b(AssociationsViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m25731l2() {
        return new C5078b();
    }

    /* renamed from: w2 */
    public final ViewModelFactoryByInjection m25730w2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f14095A0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
