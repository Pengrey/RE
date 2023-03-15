package nl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import kg.FriendImage;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p361t3.C10377a;
import p426wg.AbstractC11953pc;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;

/* renamed from: nl.g */
/* loaded from: classes2.dex */
public final class SharedWithAdapter extends DiffUtilAsyncBindableAdapter {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedWithAdapter.kt */
    /* renamed from: nl.g$a */
    /* loaded from: classes2.dex */
    public static final class C7938a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C7938a f20599w = new C7938a();

        C7938a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(Friend friend, Friend friend2) {
            Intrinsics.isThisObjectNull(friend, "old");
            Intrinsics.isThisObjectNull(friend2, "new");
            return Boolean.valueOf(Intrinsics.equals(friend, friend2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedWithAdapter.kt */
    /* renamed from: nl.g$b */
    /* loaded from: classes2.dex */
    public static final class C7939b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7939b(AbstractC11953pc abstractC11953pc) {
            super(abstractC11953pc);
            Intrinsics.isThisObjectNull(abstractC11953pc, "binding");
        }
    }

    public SharedWithAdapter() {
        super(C7938a.f20599w);
    }

    /* renamed from: I */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        Friend friend = (Friend) m22155D(i);
        if (friend != null) {
            ((AbstractC11953pc) bindableViewHolder.m22151M()).mo3841S(friend);
            ((AbstractC11953pc) bindableViewHolder.m22151M()).mo3840T(new FriendImage(friend.m14398e(), new C10377a(), false, 4, null));
        }
    }

    /* renamed from: J */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11953pc m3898Q = AbstractC11953pc.m3898Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3898Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C7939b(m3898Q);
    }
}
