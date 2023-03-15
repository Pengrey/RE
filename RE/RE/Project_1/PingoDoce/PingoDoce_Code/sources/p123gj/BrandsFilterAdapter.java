package p123gj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p426wg.AbstractC11838jc;
import p489zc.C13780s;
import p489zc.Iterables;
import pt.pingodoce.app.presentation.common.search.models.Brand;

/* renamed from: gj.b */
/* loaded from: classes2.dex */
public final class BrandsFilterAdapter extends BindableAdapter {

    /* compiled from: BrandsFilterAdapter.kt */
    /* renamed from: gj.b$a */
    /* loaded from: classes2.dex */
    public static final class C5694a {
        private C5694a() {
        }

        public /* synthetic */ C5694a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5694a(null);
    }

    /* renamed from: G */
    public static /* synthetic */ void m23335G(Brand brand, BindableViewHolder bindableViewHolder, BrandsFilterAdapter brandsFilterAdapter, View view) {
        m23330L(brand, bindableViewHolder, brandsFilterAdapter, view);
    }

    /* renamed from: I */
    private final boolean m23333I() {
        return ((Brand) m22154E().get(0)).m12339e();
    }

    /* renamed from: J */
    private final void m23332J(Brand brand) {
        int m186r;
        if (brand.m12340d() == 0) {
            List m22154E = m22154E();
            ArrayList<Brand> arrayList = new ArrayList();
            for (Object obj : m22154E) {
                if (((Brand) obj).m12340d() != 0) {
                    arrayList.add(obj);
                }
            }
            m186r = Iterables.m186r(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m186r);
            for (Brand brand2 : arrayList) {
                arrayList2.add(Brand.m12342b(brand2, 0, null, brand.m12339e(), 3, null));
            }
            m23328N(arrayList2);
        } else if (m23333I() && !brand.m12339e()) {
            m23327O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m23330L(Brand brand, BindableViewHolder bindableViewHolder, BrandsFilterAdapter brandsFilterAdapter, View view) {
        Intrinsics.isThisObjectNull(brand, "$item");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        Intrinsics.isThisObjectNull(brandsFilterAdapter, "this$0");
        Brand m12342b = Brand.m12342b(brand, ((C5695c) bindableViewHolder).m36568j(), null, !brand.m12339e(), 2, null);
        brandsFilterAdapter.m23326P(m12342b.m12340d(), m12342b);
        brandsFilterAdapter.m23332J(m12342b);
    }

    /* renamed from: N */
    private final void m23328N(List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C13780s.m187q();
            }
            m23326P(i2, (Brand) obj);
            i = i2;
        }
    }

    /* renamed from: O */
    private final void m23327O() {
        List m22154E = m22154E();
        m22154E.set(0, Brand.m12342b((Brand) m22154E().get(0), 0, null, false, 3, null));
        m36540m(0, m22154E.get(0));
    }

    /* renamed from: P */
    private final void m23326P(int i, Brand brand) {
        m22154E().set(i, brand);
        m36540m(i, brand);
    }

    /* renamed from: H */
    public final List m23334H() {
        return m22154E();
    }

    /* renamed from: K */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        final Brand brand = (Brand) m22155D(bindableViewHolder.m36568j());
        if (brand != null) {
            ((AbstractC11838jc) ((C5695c) bindableViewHolder).m22151M()).mo4077S(brand);
            ((AbstractC11838jc) bindableViewHolder.m22151M()).f30694y.setVisibility(brand.m12341c().m13908e() ? 0 : 8);
            ((AbstractC11838jc) bindableViewHolder.m22151M()).f30693x.setOnClickListener(new View.OnClickListener() { // from class: gj.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BrandsFilterAdapter.m23330L(Brand.this, bindableViewHolder, this, view);
                }
            });
        }
    }

    /* renamed from: M */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11838jc m4139Q = AbstractC11838jc.m4139Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4139Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5695c(m4139Q);
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return i;
    }
}
