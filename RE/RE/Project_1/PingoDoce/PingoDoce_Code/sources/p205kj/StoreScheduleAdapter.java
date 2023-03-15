package p205kj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.C0955h;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p426wg.AbstractC12105xd;
import pt.pingodoce.app.data.local.models.stores.StoreSchedule;

/* renamed from: kj.f */
/* loaded from: classes2.dex */
public final class StoreScheduleAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f18008e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreScheduleAdapter.kt */
    /* renamed from: kj.f$a */
    /* loaded from: classes2.dex */
    public static final class C6685a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6685a f18009w = new C6685a();

        C6685a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(StoreSchedule storeSchedule, StoreSchedule storeSchedule2) {
            Intrinsics.isThisObjectNull(storeSchedule, "old");
            Intrinsics.isThisObjectNull(storeSchedule2, "new");
            return Boolean.valueOf(Intrinsics.equals(storeSchedule, storeSchedule2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StoreScheduleAdapter.kt */
    /* renamed from: kj.f$b */
    /* loaded from: classes2.dex */
    public static final class C6686b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6686b(AbstractC12105xd abstractC12105xd) {
            super(abstractC12105xd);
            Intrinsics.isThisObjectNull(abstractC12105xd, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreScheduleAdapter(InterfaceC6108l interfaceC6108l) {
        super(C6685a.f18009w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onClick");
        this.f18008e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m20287I(StoreScheduleAdapter storeScheduleAdapter, BindableViewHolder bindableViewHolder, View view) {
        m20285K(storeScheduleAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m20285K(StoreScheduleAdapter storeScheduleAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(storeScheduleAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        InterfaceC6108l interfaceC6108l = storeScheduleAdapter.f18008e;
        Object m22155D = storeScheduleAdapter.m22155D(bindableViewHolder.m36568j());
        Intrinsics.ifNullDoSomething(m22155D);
        interfaceC6108l.mo9587d(m22155D);
    }

    /* renamed from: J */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        StoreSchedule storeSchedule = (StoreSchedule) m22155D(bindableViewHolder.m36568j());
        if (storeSchedule != null) {
            ((AbstractC12105xd) bindableViewHolder.m22151M()).mo3597S(storeSchedule);
            TextView textView = ((AbstractC12105xd) bindableViewHolder.m22151M()).f31902y;
            ResourcesProvider resourcesProvider = new ResourcesProvider(bindableViewHolder.m22150N());
            int i2 = C2336R.font.open_sans_semibold;
            textView.setTypeface(C0955h.m38994g(resourcesProvider.m6899a(), i == 0 ? C2336R.font.open_sans_semibold : C2336R.font.open_sans));
            TextView textView2 = ((AbstractC12105xd) bindableViewHolder.m22151M()).f31901x;
            ResourcesProvider resourcesProvider2 = new ResourcesProvider(bindableViewHolder.m22150N());
            if (i != 0) {
                i2 = C2336R.font.open_sans;
            }
            textView2.setTypeface(C0955h.m38994g(resourcesProvider2.m6899a(), i2));
            ((AbstractC12105xd) bindableViewHolder.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: kj.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoreScheduleAdapter.m20285K(StoreScheduleAdapter.this, bindableViewHolder, view);
                }
            });
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC12105xd m3653Q = AbstractC12105xd.m3653Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3653Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C6686b(m3653Q);
    }
}
