package p428wi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.Objects;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC12029tc;
import pt.pingodoce.app.data.remote.models.request.LoyaltyCardRequest;

/* renamed from: wi.k */
/* loaded from: classes2.dex */
public final class LoyaltyCardRequestsAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f32126e;

    /* renamed from: f */
    private final InterfaceC6108l f32127f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardRequestsAdapter.kt */
    /* renamed from: wi.k$a */
    /* loaded from: classes2.dex */
    public static final class C12167a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C12167a f32128w = new C12167a();

        C12167a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(LoyaltyCardRequest loyaltyCardRequest, LoyaltyCardRequest loyaltyCardRequest2) {
            Intrinsics.isThisObjectNull(loyaltyCardRequest, "old");
            Intrinsics.isThisObjectNull(loyaltyCardRequest2, "new");
            return Boolean.valueOf(Intrinsics.equals(loyaltyCardRequest.m14134b(), loyaltyCardRequest2.m14134b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoyaltyCardRequestsAdapter.kt */
    /* renamed from: wi.k$b */
    /* loaded from: classes2.dex */
    public static final class C12168b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12168b(AbstractC12029tc abstractC12029tc) {
            super(abstractC12029tc);
            Intrinsics.isThisObjectNull(abstractC12029tc, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyCardRequestsAdapter(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(C12167a.f32128w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onAccept");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "onDeny");
        this.f32126e = interfaceC6108l;
        this.f32127f = interfaceC6108l2;
    }

    /* renamed from: I */
    public static /* synthetic */ void m3501I(LoyaltyCardRequestsAdapter loyaltyCardRequestsAdapter, BindableViewHolder bindableViewHolder, View view) {
        m3497M(loyaltyCardRequestsAdapter, bindableViewHolder, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m3500J(LoyaltyCardRequestsAdapter loyaltyCardRequestsAdapter, BindableViewHolder bindableViewHolder, View view) {
        m3498L(loyaltyCardRequestsAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m3498L(LoyaltyCardRequestsAdapter loyaltyCardRequestsAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(loyaltyCardRequestsAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        InterfaceC6108l interfaceC6108l = loyaltyCardRequestsAdapter.f32126e;
        Object m22155D = loyaltyCardRequestsAdapter.m22155D(bindableViewHolder.m36568j());
        Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.request.LoyaltyCardRequest");
        interfaceC6108l.mo9587d(((LoyaltyCardRequest) m22155D).m14134b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m3497M(LoyaltyCardRequestsAdapter loyaltyCardRequestsAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(loyaltyCardRequestsAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        InterfaceC6108l interfaceC6108l = loyaltyCardRequestsAdapter.f32127f;
        Object m22155D = loyaltyCardRequestsAdapter.m22155D(bindableViewHolder.m36568j());
        Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.request.LoyaltyCardRequest");
        interfaceC6108l.mo9587d(((LoyaltyCardRequest) m22155D).m14134b());
    }

    /* renamed from: K */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        LoyaltyCardRequest loyaltyCardRequest = (LoyaltyCardRequest) m22155D(i);
        if (loyaltyCardRequest != null) {
            ((AbstractC12029tc) bindableViewHolder.m22151M()).mo3708S(loyaltyCardRequest);
            ((AbstractC12029tc) bindableViewHolder.m22151M()).f31552x.setOnClickListener(new View.OnClickListener() { // from class: wi.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoyaltyCardRequestsAdapter.m3498L(LoyaltyCardRequestsAdapter.this, bindableViewHolder, view);
                }
            });
            ((AbstractC12029tc) bindableViewHolder.m22151M()).f31550A.setOnClickListener(new View.OnClickListener() { // from class: wi.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoyaltyCardRequestsAdapter.m3497M(LoyaltyCardRequestsAdapter.this, bindableViewHolder, view);
                }
            });
        }
    }

    /* renamed from: N */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC12029tc m3769Q = AbstractC12029tc.m3769Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3769Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C12168b(m3769Q);
    }
}
