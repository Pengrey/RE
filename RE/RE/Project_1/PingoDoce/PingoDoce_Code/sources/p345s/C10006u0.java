package p345s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p297pd.C8611f;
import p297pd._Ranges;
import p489zc.AbstractC13762g0;
import p489zc.Iterables;

/* renamed from: s.u0 */
/* loaded from: classes.dex */
public final class C10006u0 {

    /* compiled from: VectorizedAnimationSpec.kt */
    /* renamed from: s.u0$a */
    /* loaded from: classes.dex */
    public static final class C10007a implements InterfaceC9979q {

        /* renamed from: a */
        private final List<C9943d0> f26189a;

        /* renamed from: b */
        final /* synthetic */ AbstractC9976o f26190b;

        /* renamed from: c */
        final /* synthetic */ float f26191c;

        /* renamed from: d */
        final /* synthetic */ float f26192d;

        C10007a(AbstractC9976o abstractC9976o, float f, float f2) {
            C8611f m14992q;
            int m186r;
            this.f26190b = abstractC9976o;
            this.f26191c = f;
            this.f26192d = f2;
            m14992q = _Ranges.m14992q(0, abstractC9976o.mo9485b());
            m186r = Iterables.m186r(m14992q, 10);
            ArrayList arrayList = new ArrayList(m186r);
            Iterator<Integer> it = m14992q.iterator();
            while (it.hasNext()) {
                arrayList.add(new C9943d0(f, f2, abstractC9976o.mo9486a(((AbstractC13762g0) it).mo404a())));
            }
            this.f26189a = arrayList;
        }

        @Override // p345s.InterfaceC9979q
        /* renamed from: a */
        public C9943d0 mo42224get(int i) {
            return this.f26189a.get(i);
        }
    }

    /* compiled from: VectorizedAnimationSpec.kt */
    /* renamed from: s.u0$b */
    /* loaded from: classes.dex */
    public static final class C10008b implements InterfaceC9979q {

        /* renamed from: a */
        private final C9943d0 f26193a;

        /* renamed from: b */
        final /* synthetic */ float f26194b;

        /* renamed from: c */
        final /* synthetic */ float f26195c;

        C10008b(float f, float f2) {
            this.f26194b = f;
            this.f26195c = f2;
            this.f26193a = new C9943d0(f, f2, 0.0f, 4, null);
        }

        @Override // p345s.InterfaceC9979q
        /* renamed from: a */
        public C9943d0 mo42224get(int i) {
            return this.f26193a;
        }
    }

    /* renamed from: b */
    public static final <V extends AbstractC9976o> InterfaceC9979q m9412b(V v, float f, float f2) {
        if (v != null) {
            return new C10007a(v, f, f2);
        }
        return new C10008b(f, f2);
    }
}
