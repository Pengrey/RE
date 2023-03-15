package p185ji;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11769ff;
import pt.pingodoce.app.data.local.models.clubs.FormFieldOption;

/* renamed from: ji.t */
/* loaded from: classes2.dex */
public final class WineClubTypeAdapter extends DiffUtilAsyncBindableAdapter {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubTypeAdapter.kt */
    /* renamed from: ji.t$a */
    /* loaded from: classes2.dex */
    public static final class C6504a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6504a f17628w = new C6504a();

        C6504a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(FormFieldOption formFieldOption, FormFieldOption formFieldOption2) {
            Intrinsics.isThisObjectNull(formFieldOption, "old");
            Intrinsics.isThisObjectNull(formFieldOption2, "new");
            return Boolean.valueOf(Intrinsics.equals(formFieldOption, formFieldOption2));
        }
    }

    public WineClubTypeAdapter() {
        super(C6504a.f17628w);
    }

    /* renamed from: I */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        FormFieldOption formFieldOption = (FormFieldOption) m22155D(bindableViewHolder.m36568j());
        if (formFieldOption != null) {
            ((AbstractC11769ff) bindableViewHolder.m22151M()).f30345x.setText(formFieldOption.m14601b());
        }
    }

    /* renamed from: J */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11769ff m4302Q = AbstractC11769ff.m4302Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4302Q, "inflate(\n               …      false\n            )");
        return new C6505u(m4302Q);
    }
}
