package p109fh;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p067dh.AssociationsViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import si.PendingListFragment;

/* renamed from: fh.a */
/* loaded from: classes2.dex */
public final class C5518a extends PendingListFragment {

    /* renamed from: B0 */
    public static final C5519a f15669B0 = new C5519a(null);

    /* renamed from: A0 */
    public ViewModelFactoryByInjection f15670A0;

    /* compiled from: PendingRequestsListFragment.kt */
    /* renamed from: fh.a$a */
    /* loaded from: classes2.dex */
    public static final class C5519a {
        private C5519a() {
        }

        public /* synthetic */ C5519a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C5518a m23795a() {
            return new C5518a();
        }
    }

    /* compiled from: PendingRequestsListFragment.kt */
    /* renamed from: fh.a$b */
    /* loaded from: classes2.dex */
    static final class C5520b extends AbstractC6438m implements InterfaceC6097a {
        C5520b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(C5518a.this.m23796y2(), C5518a.this, null, 2, null);
        }
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m23798k2() {
        return C6450z.m20906b(AssociationsViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m23797l2() {
        return new C5520b();
    }

    /* renamed from: y2 */
    public final ViewModelFactoryByInjection m23796y2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f15670A0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
