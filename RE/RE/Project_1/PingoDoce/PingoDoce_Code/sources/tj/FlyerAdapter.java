package tj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11834j8;
import pt.pingodoce.app.data.remote.models.response.Flyer;

/* renamed from: tj.b */
/* loaded from: classes2.dex */
public final class FlyerAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f27388e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlyerAdapter.kt */
    /* renamed from: tj.b$a */
    /* loaded from: classes2.dex */
    public static final class C10633a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C10633a f27389w = new C10633a();

        C10633a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(Flyer flyer, Flyer flyer2) {
            Intrinsics.isThisObjectNull(flyer, "old");
            Intrinsics.isThisObjectNull(flyer2, "new");
            return Boolean.valueOf(Intrinsics.equals(flyer, flyer2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FlyerAdapter.kt */
    /* renamed from: tj.b$b */
    /* loaded from: classes2.dex */
    public static final class C10634b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10634b(AbstractC11834j8 abstractC11834j8) {
            super(abstractC11834j8);
            Intrinsics.isThisObjectNull(abstractC11834j8, "binding");
        }
    }

    public FlyerAdapter(InterfaceC6108l interfaceC6108l) {
        super(C10633a.f27389w);
        this.f27388e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m7458I(FlyerAdapter flyerAdapter, BindableViewHolder bindableViewHolder, View view) {
        m7456K(flyerAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m7456K(FlyerAdapter flyerAdapter, BindableViewHolder bindableViewHolder, View view) {
        InterfaceC6108l interfaceC6108l;
        Intrinsics.isThisObjectNull(flyerAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        Flyer flyer = (Flyer) flyerAdapter.m22155D(bindableViewHolder.m36568j());
        if (flyer == null || (interfaceC6108l = flyerAdapter.f27388e) == null) {
            return;
        }
        interfaceC6108l.mo9587d(flyer);
    }

    /* renamed from: J */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        Flyer flyer = (Flyer) m22155D(bindableViewHolder.m36568j());
        if (flyer != null) {
            ((AbstractC11834j8) bindableViewHolder.m22151M()).mo4084S(flyer);
            ((AbstractC11834j8) bindableViewHolder.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: tj.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FlyerAdapter.m7456K(FlyerAdapter.this, bindableViewHolder, view);
                }
            });
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11834j8 m4143Q = AbstractC11834j8.m4143Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4143Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C10634b(m4143Q);
    }
}
