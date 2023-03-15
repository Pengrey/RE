package p185ji;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11735df;
import pt.pingodoce.app.data.local.models.clubs.FormFieldOption;

/* renamed from: ji.r */
/* loaded from: classes2.dex */
public final class WineClubRegionAdapter extends DiffUtilAsyncBindableAdapter {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubRegionAdapter.kt */
    /* renamed from: ji.r$a */
    /* loaded from: classes2.dex */
    public static final class C6502a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6502a f17627w = new C6502a();

        C6502a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(FormFieldOption formFieldOption, FormFieldOption formFieldOption2) {
            Intrinsics.isThisObjectNull(formFieldOption, "old");
            Intrinsics.isThisObjectNull(formFieldOption2, "new");
            return Boolean.valueOf(Intrinsics.equals(formFieldOption, formFieldOption2));
        }
    }

    public WineClubRegionAdapter() {
        super(C6502a.f17627w);
    }

    /* renamed from: I */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        FormFieldOption formFieldOption = (FormFieldOption) m22155D(bindableViewHolder.m36568j());
        if (formFieldOption != null) {
            ((AbstractC11735df) bindableViewHolder.m22151M()).f30157x.setText(formFieldOption.m14601b());
        }
    }

    /* renamed from: J */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11735df m4398Q = AbstractC11735df.m4398Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4398Q, "inflate(\n               …      false\n            )");
        return new C6503s(m4398Q);
    }
}
