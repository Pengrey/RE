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
import p426wg.AbstractC12141ze;
import pt.pingodoce.app.data.local.models.clubs.FormFieldOption;
import pt.pingodoce.app.presentation.clubs.wine.EnumC9056h;

/* renamed from: ji.m */
/* loaded from: classes2.dex */
public final class WineClubListRegionAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final List f17619e;

    /* renamed from: f */
    private final InterfaceC6112p f17620f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubListRegionAdapter.kt */
    /* renamed from: ji.m$a */
    /* loaded from: classes2.dex */
    public static final class C6497a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6497a f17621w = new C6497a();

        C6497a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(FormFieldOption formFieldOption, FormFieldOption formFieldOption2) {
            Intrinsics.isThisObjectNull(formFieldOption, "old");
            Intrinsics.isThisObjectNull(formFieldOption2, "new");
            return Boolean.valueOf(Intrinsics.equals(formFieldOption, formFieldOption2));
        }
    }

    public /* synthetic */ WineClubListRegionAdapter(List list, InterfaceC6112p interfaceC6112p, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : interfaceC6112p);
    }

    /* renamed from: I */
    public static /* synthetic */ void m20811I(WineClubListRegionAdapter wineClubListRegionAdapter, FormFieldOption formFieldOption, CompoundButton compoundButton, boolean z) {
        m20809K(wineClubListRegionAdapter, formFieldOption, compoundButton, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m20809K(WineClubListRegionAdapter wineClubListRegionAdapter, FormFieldOption formFieldOption, CompoundButton compoundButton, boolean z) {
        Intrinsics.isThisObjectNull(wineClubListRegionAdapter, "this$0");
        Intrinsics.isThisObjectNull(formFieldOption, "$wineOption");
        if (z) {
            InterfaceC6112p interfaceC6112p = wineClubListRegionAdapter.f17620f;
            if (interfaceC6112p != null) {
                interfaceC6112p.mo39856d(formFieldOption, EnumC9056h.ADD);
                return;
            }
            return;
        }
        InterfaceC6112p interfaceC6112p2 = wineClubListRegionAdapter.f17620f;
        if (interfaceC6112p2 != null) {
            interfaceC6112p2.mo39856d(formFieldOption, EnumC9056h.REMOVE);
        }
    }

    /* renamed from: J */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        final FormFieldOption formFieldOption = (FormFieldOption) m22155D(bindableViewHolder.m36568j());
        if (formFieldOption != null) {
            ((AbstractC12141ze) bindableViewHolder.m22151M()).f32068y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ji.l
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    WineClubListRegionAdapter.m20809K(WineClubListRegionAdapter.this, formFieldOption, compoundButton, z);
                }
            });
            ((AbstractC12141ze) bindableViewHolder.m22151M()).f32068y.setText(formFieldOption.m14601b());
            MaterialCheckBox materialCheckBox = ((AbstractC12141ze) bindableViewHolder.m22151M()).f32068y;
            List list = this.f17619e;
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
        AbstractC12141ze m3559Q = AbstractC12141ze.m3559Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3559Q, "inflate(\n               …      false\n            )");
        return new C6498n(m3559Q);
    }

    public WineClubListRegionAdapter(List list, InterfaceC6112p interfaceC6112p) {
        super(C6497a.f17621w);
        this.f17619e = list;
        this.f17620f = interfaceC6112p;
    }
}
