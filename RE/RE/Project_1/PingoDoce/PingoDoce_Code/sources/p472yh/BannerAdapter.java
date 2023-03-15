package p472yh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import id.InterfaceC6112p;
import id.InterfaceC6114r;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11732dc;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: yh.d */
/* loaded from: classes2.dex */
public final class BannerAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6114r f34182e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerAdapter.kt */
    /* renamed from: yh.d$a */
    /* loaded from: classes2.dex */
    public static final class C13442a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C13442a f34183w = new C13442a();

        C13442a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(Banner banner, Banner banner2) {
            Intrinsics.isThisObjectNull(banner, "old");
            Intrinsics.isThisObjectNull(banner2, "new");
            return Boolean.valueOf(Intrinsics.equals(banner, banner2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BannerAdapter.kt */
    /* renamed from: yh.d$b */
    /* loaded from: classes2.dex */
    public static final class C13443b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13443b(AbstractC11732dc abstractC11732dc) {
            super(abstractC11732dc);
            Intrinsics.isThisObjectNull(abstractC11732dc, "binding");
        }
    }

    public BannerAdapter(InterfaceC6114r interfaceC6114r) {
        super(C13442a.f34183w);
        this.f34182e = interfaceC6114r;
    }

    /* renamed from: I */
    public static /* synthetic */ void m1411I(BannerAdapter bannerAdapter, BindableViewHolder bindableViewHolder, View view) {
        m1408L(bannerAdapter, bindableViewHolder, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m1410J(BannerAdapter bannerAdapter, BindableViewHolder bindableViewHolder, View view) {
        m1407M(bannerAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m1408L(BannerAdapter bannerAdapter, BindableViewHolder bindableViewHolder, View view) {
        InterfaceC6114r interfaceC6114r;
        Intrinsics.isThisObjectNull(bannerAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        Banner banner = (Banner) bannerAdapter.m22155D(bindableViewHolder.m36568j());
        if (banner == null || (interfaceC6114r = bannerAdapter.f34182e) == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(bindableViewHolder.m36568j());
        EnumC13439a enumC13439a = EnumC13439a.DETAIL;
        ImageView imageView = ((AbstractC11732dc) bindableViewHolder.m22151M()).f30120z;
        Intrinsics.checkIfNull(imageView, "holder.binding.constBannerLogo");
        interfaceC6114r.mo22157a0(valueOf, banner, enumC13439a, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m1407M(BannerAdapter bannerAdapter, BindableViewHolder bindableViewHolder, View view) {
        InterfaceC6114r interfaceC6114r;
        Intrinsics.isThisObjectNull(bannerAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        Banner banner = (Banner) bannerAdapter.m22155D(bindableViewHolder.m36568j());
        if (banner == null || (interfaceC6114r = bannerAdapter.f34182e) == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(bindableViewHolder.m36568j());
        EnumC13439a enumC13439a = EnumC13439a.DELETE;
        ImageView imageView = ((AbstractC11732dc) bindableViewHolder.m22151M()).f30120z;
        Intrinsics.checkIfNull(imageView, "holder.binding.constBannerLogo");
        interfaceC6114r.mo22157a0(valueOf, banner, enumC13439a, imageView);
    }

    /* renamed from: K */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        Banner banner = (Banner) m22155D(bindableViewHolder.m36568j());
        if (banner != null) {
            ((AbstractC11732dc) bindableViewHolder.m22151M()).mo4359S(banner);
            ((AbstractC11732dc) bindableViewHolder.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: yh.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BannerAdapter.m1408L(BannerAdapter.this, bindableViewHolder, view);
                }
            });
            ((AbstractC11732dc) bindableViewHolder.m22151M()).f30119y.setOnClickListener(new View.OnClickListener() { // from class: yh.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BannerAdapter.m1407M(BannerAdapter.this, bindableViewHolder, view);
                }
            });
        }
    }

    /* renamed from: N */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11732dc m4404Q = AbstractC11732dc.m4404Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4404Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C13443b(m4404Q);
    }
}
