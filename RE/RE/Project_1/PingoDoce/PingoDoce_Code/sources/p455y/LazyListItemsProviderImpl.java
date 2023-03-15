package p455y;

import androidx.compose.foundation.lazy.C0643i;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import java.util.Map;
import p169j1.C6267j0;
import p181jd.Intrinsics;
import p297pd.C8611f;

/* renamed from: y.l */
/* loaded from: classes.dex */
public final class LazyListItemsProviderImpl implements InterfaceC13023k {

    /* renamed from: a */
    private final C6267j0 f33802a;

    /* renamed from: b */
    private final InterfaceC13017c f33803b;

    /* renamed from: c */
    private final List f33804c;

    /* renamed from: d */
    private final Map f33805d;

    public LazyListItemsProviderImpl(C6267j0 c6267j0, InterfaceC13017c interfaceC13017c, List list, C8611f c8611f) {
        Intrinsics.isThisObjectNull(c6267j0, "itemScope");
        Intrinsics.isThisObjectNull(interfaceC13017c, "list");
        Intrinsics.isThisObjectNull(list, "headerIndexes");
        Intrinsics.isThisObjectNull(c8611f, "nearestItemsRange");
        this.f33802a = c6267j0;
        this.f33803b = interfaceC13017c;
        this.f33804c = list;
        this.f33805d = C13024m.m1878c(c8611f, interfaceC13017c);
    }

    /* renamed from: a */
    public Map mo3323a() {
        return this.f33805d;
    }

    /* renamed from: b */
    public InterfaceC6112p mo3322b(int i) {
        C13016b m1908b = IntervalList.m1908b(this.f33803b, i);
        int m1910c = i - m1908b.m1910c();
        InterfaceC6112p m1899a = ((LazyListScopeImpl) m1908b.m1912a()).m1899a();
        Object m21595a = this.f33802a.m21595a();
        Intrinsics.ifNullDoSomething(m21595a);
        return (InterfaceC6112p) m1899a.mo39856d(m21595a, Integer.valueOf(m1910c));
    }

    /* renamed from: c */
    public int mo3321c() {
        return this.f33803b.mo1782b();
    }

    /* renamed from: d */
    public List mo1885d() {
        return this.f33804c;
    }

    public Object getKey(int i) {
        C13016b m1908b = IntervalList.m1908b(this.f33803b, i);
        int m1910c = i - m1908b.m1910c();
        InterfaceC6108l m1898b = ((LazyListScopeImpl) m1908b.m1912a()).m1898b();
        Object mo9587d = m1898b == null ? null : m1898b.mo9587d(Integer.valueOf(m1910c));
        return mo9587d == null ? C0643i.m40003a(i) : mo9587d;
    }
}
