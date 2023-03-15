package p242mj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11840je;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: mj.c */
/* loaded from: classes2.dex */
public final class StoreListAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f19801e;

    /* renamed from: f */
    private Store f19802f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreListAdapter.kt */
    /* renamed from: mj.c$a */
    /* loaded from: classes2.dex */
    public static final class C7488a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C7488a f19803w = new C7488a();

        C7488a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(Store store, Store store2) {
            Intrinsics.isThisObjectNull(store, "old");
            Intrinsics.isThisObjectNull(store2, "new");
            return Boolean.valueOf(Intrinsics.equals(store, store2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StoreListAdapter.kt */
    /* renamed from: mj.c$b */
    /* loaded from: classes2.dex */
    public static final class C7489b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7489b(AbstractC11840je abstractC11840je) {
            super(abstractC11840je);
            Intrinsics.isThisObjectNull(abstractC11840je, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreListAdapter(InterfaceC6108l interfaceC6108l) {
        super(C7488a.f19803w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onClick");
        this.f19801e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m18381I(StoreListAdapter storeListAdapter, BindableViewHolder bindableViewHolder, View view) {
        m18376N(storeListAdapter, bindableViewHolder, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m18380J(StoreListAdapter storeListAdapter, Store store, View view) {
        m18375O(storeListAdapter, store, view);
    }

    /* renamed from: K */
    private final void m18379K(Store store) {
        this.f19802f = store;
        m36542k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m18376N(StoreListAdapter storeListAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(storeListAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        Store store = (Store) storeListAdapter.m22155D(bindableViewHolder.m36568j());
        if (store != null) {
            storeListAdapter.f19801e.mo9587d(store);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m18375O(StoreListAdapter storeListAdapter, Store store, View view) {
        Intrinsics.isThisObjectNull(storeListAdapter, "this$0");
        Intrinsics.isThisObjectNull(store, "$item");
        storeListAdapter.m18373Q(store);
    }

    /* renamed from: L */
    public final Store m18378L() {
        return this.f19802f;
    }

    /* renamed from: M */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        final Store store = (Store) m22155D(bindableViewHolder.m36568j());
        if (store != null) {
            ((AbstractC11840je) bindableViewHolder.m22151M()).mo4074T(store);
            AbstractC11840je abstractC11840je = (AbstractC11840je) bindableViewHolder.m22151M();
            Store store2 = this.f19802f;
            boolean z = false;
            if (store2 != null && store2.m13711f() == store.m13711f()) {
                z = true;
            }
            abstractC11840je.mo4075S(Boolean.valueOf(z));
            ((AbstractC11840je) bindableViewHolder.m22151M()).mo4073U(Integer.valueOf(store.m13701v() ? 2131951669 : 2131951668));
            ((AbstractC11840je) bindableViewHolder.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: mj.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoreListAdapter.m18376N(StoreListAdapter.this, bindableViewHolder, view);
                }
            });
            ((AbstractC11840je) bindableViewHolder.m22151M()).f30699C.setOnClickListener(new View.OnClickListener() { // from class: mj.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoreListAdapter.m18375O(StoreListAdapter.this, store, view);
                }
            });
        }
    }

    /* renamed from: P */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11840je m4137Q = AbstractC11840je.m4137Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4137Q, "inflate(\n               …      false\n            )");
        return new C7489b(m4137Q);
    }

    /* renamed from: Q */
    public final void m18373Q(Store store) {
        m18379K(store);
    }
}
