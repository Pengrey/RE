package p185ji;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11700bf;
import pt.pingodoce.app.data.local.models.clubs.FormFieldOption;
import pt.pingodoce.app.presentation.clubs.wine.EnumC9057i;

/* renamed from: ji.p */
/* loaded from: classes2.dex */
public final class WineClubListTypeAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final List f17624e;

    /* renamed from: f */
    private final InterfaceC6112p f17625f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubListTypeAdapter.kt */
    /* renamed from: ji.p$a */
    /* loaded from: classes2.dex */
    public static final class C6500a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6500a f17626w = new C6500a();

        C6500a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(FormFieldOption formFieldOption, FormFieldOption formFieldOption2) {
            Intrinsics.isThisObjectNull(formFieldOption, "old");
            Intrinsics.isThisObjectNull(formFieldOption2, "new");
            return Boolean.valueOf(Intrinsics.equals(formFieldOption, formFieldOption2));
        }
    }

    public /* synthetic */ WineClubListTypeAdapter(List list, InterfaceC6112p interfaceC6112p, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : interfaceC6112p);
    }

    /* renamed from: I */
    public static /* synthetic */ void m20804I(WineClubListTypeAdapter wineClubListTypeAdapter, FormFieldOption formFieldOption, CompoundButton compoundButton, boolean z) {
        m20802K(wineClubListTypeAdapter, formFieldOption, compoundButton, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m20802K(WineClubListTypeAdapter wineClubListTypeAdapter, FormFieldOption formFieldOption, CompoundButton compoundButton, boolean z) {
        Intrinsics.isThisObjectNull(wineClubListTypeAdapter, "this$0");
        Intrinsics.isThisObjectNull(formFieldOption, "$wineOption");
        if (z) {
            InterfaceC6112p interfaceC6112p = wineClubListTypeAdapter.f17625f;
            if (interfaceC6112p != null) {
                interfaceC6112p.mo39856d(formFieldOption, EnumC9057i.ADD);
                return;
            }
            return;
        }
        InterfaceC6112p interfaceC6112p2 = wineClubListTypeAdapter.f17625f;
        if (interfaceC6112p2 != null) {
            interfaceC6112p2.mo39856d(formFieldOption, EnumC9057i.REMOVE);
        }
    }

    /* renamed from: J */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        final FormFieldOption formFieldOption = (FormFieldOption) m22155D(bindableViewHolder.m36568j());
        if (formFieldOption != null) {
            ((AbstractC11700bf) bindableViewHolder.m22151M()).f29971y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ji.o
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    WineClubListTypeAdapter.m20802K(WineClubListTypeAdapter.this, formFieldOption, compoundButton, z);
                }
            });
            ((AbstractC11700bf) bindableViewHolder.m22151M()).f29971y.setText(formFieldOption.m14601b());
            MaterialCheckBox materialCheckBox = ((AbstractC11700bf) bindableViewHolder.m22151M()).f29971y;
            List list = this.f17624e;
            boolean z = true;
            if (list == null || !list.contains(formFieldOption.m14602a())) {
                z = false;
            }
            materialCheckBox.setChecked(z);
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11700bf m4454Q = AbstractC11700bf.m4454Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4454Q, "inflate(\n               …      false\n            )");
        return new C6501q(m4454Q);
    }

    public WineClubListTypeAdapter(List list, InterfaceC6112p interfaceC6112p) {
        super(C6500a.f17626w);
        this.f17624e = list;
        this.f17625f = interfaceC6112p;
    }
}
