package ml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.Objects;
import je.TouchableViewHolder;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11699be;
import p426wg.AbstractC12070vc;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* renamed from: ml.j */
/* loaded from: classes2.dex */
public final class ShoppingListsAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final String f19848e;

    /* renamed from: f */
    private final InterfaceC6108l f19849f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsAdapter.kt */
    /* renamed from: ml.j$a */
    /* loaded from: classes2.dex */
    public static final class C7512a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C7512a f19850w = new C7512a();

        C7512a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(InterfaceC7504a interfaceC7504a, InterfaceC7504a interfaceC7504a2) {
            Intrinsics.isThisObjectNull(interfaceC7504a, "old");
            Intrinsics.isThisObjectNull(interfaceC7504a2, "new");
            boolean z = interfaceC7504a instanceof ShoppingList;
            String str = interfaceC7504a;
            String str2 = interfaceC7504a2;
            if (z) {
                boolean z2 = interfaceC7504a2 instanceof ShoppingList;
                str = interfaceC7504a;
                str2 = interfaceC7504a2;
                if (z2) {
                    str = ((ShoppingList) interfaceC7504a).m13737j();
                    str2 = ((ShoppingList) interfaceC7504a2).m13737j();
                }
            }
            return Boolean.valueOf(Intrinsics.equals(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShoppingListsAdapter.kt */
    /* renamed from: ml.j$b */
    /* loaded from: classes2.dex */
    public static final class C7513b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7513b(AbstractC12070vc abstractC12070vc) {
            super(abstractC12070vc);
            Intrinsics.isThisObjectNull(abstractC12070vc, "binding");
        }
    }

    /* compiled from: ShoppingListsAdapter.kt */
    /* renamed from: ml.j$c */
    /* loaded from: classes2.dex */
    public static final class C7514c extends TouchableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7514c(AbstractC11699be abstractC11699be) {
            super(abstractC11699be);
            Intrinsics.isThisObjectNull(abstractC11699be, "binding");
        }

        /* renamed from: O */
        public /* bridge */ /* synthetic */ View m18316O() {
            return (View) m18314S();
        }

        /* renamed from: P */
        public View m18315P() {
            View m37802s = ((AbstractC11699be) m22151M()).m37802s();
            Intrinsics.checkIfNull(m37802s, "binding.root");
            return m37802s;
        }

        /* renamed from: S */
        public Void m18314S() {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsAdapter(String str, InterfaceC6108l interfaceC6108l) {
        super(C7512a.f19850w);
        Intrinsics.isThisObjectNull(str, "userId");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onClick");
        this.f19848e = str;
        this.f19849f = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m18324I(ShoppingListsAdapter shoppingListsAdapter, BindableViewHolder bindableViewHolder, View view) {
        m18322K(shoppingListsAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m18322K(ShoppingListsAdapter shoppingListsAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(shoppingListsAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        InterfaceC6108l interfaceC6108l = shoppingListsAdapter.f19849f;
        Object m22155D = shoppingListsAdapter.m22155D(((C7514c) bindableViewHolder).m36568j());
        Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.ShoppingList");
        interfaceC6108l.mo9587d((ShoppingList) m22155D);
    }

    /* renamed from: J */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        InterfaceC7504a interfaceC7504a = (InterfaceC7504a) m22155D(i);
        if (interfaceC7504a != null) {
            if (interfaceC7504a instanceof ShoppingList) {
                C7514c c7514c = (C7514c) bindableViewHolder;
                ShoppingList shoppingList = (ShoppingList) interfaceC7504a;
                ((AbstractC11699be) c7514c.m22151M()).mo4414U(shoppingList);
                ((AbstractC11699be) c7514c.m22151M()).mo4416S(41);
                ((AbstractC11699be) c7514c.m22151M()).mo4415T(ug.ShoppingList.m6794a(shoppingList.m13745a(this.f19848e)));
                ((AbstractC11699be) c7514c.m22151M()).m37802s().setEnabled(!shoppingList.m13732s());
                c7514c.m20891R(((AbstractC11699be) c7514c.m22151M()).m37802s().isEnabled());
                ((AbstractC11699be) c7514c.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: ml.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShoppingListsAdapter.m18322K(ShoppingListsAdapter.this, bindableViewHolder, view);
                    }
                });
                return;
            }
            ((AbstractC12070vc) ((C7513b) bindableViewHolder).m22151M()).mo3661S(((ShoppingListsViewModel) interfaceC7504a).m18313a());
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        if (i == 0) {
            AbstractC11699be m4456Q = AbstractC11699be.m4456Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4456Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C7514c(m4456Q);
        }
        AbstractC12070vc m3699Q = AbstractC12070vc.m3699Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3699Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C7513b(m3699Q);
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return !(m22155D(i) instanceof ShoppingList) ? 1 : 0;
    }
}
