package ie;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.C1601h;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import p181jd.Intrinsics;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10587w0;
import td.InterfaceC10524i0;

/* renamed from: ie.d */
/* loaded from: classes2.dex */
public abstract class DiffUtilAsyncBindableAdapter<T, ViewBinding extends ViewDataBinding> extends BindableAdapter {

    /* renamed from: d */
    private InterfaceC6112p f16804d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtilAsyncBindableAdapter.kt */
    @InterfaceC6759f(m20197c = "module.core.presentation.base.view.adapter.DiffUtilAsyncBindableAdapter$updateSuspended$2", m20196f = "DiffUtilAsyncBindableAdapter.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: ie.d$a */
    /* loaded from: classes2.dex */
    public static final class C6121a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f16805x;

        /* renamed from: y */
        final /* synthetic */ List f16806y;

        /* renamed from: z */
        final /* synthetic */ DiffUtilAsyncBindableAdapter f16807z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6121a(List list, DiffUtilAsyncBindableAdapter diffUtilAsyncBindableAdapter, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f16806y = list;
            this.f16807z = diffUtilAsyncBindableAdapter;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6121a(this.f16806y, this.f16807z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6121a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f16805x == 0) {
                C13186n.m1453b(obj);
                ArrayList arrayList = new ArrayList(this.f16806y);
                DiffUtilAsyncBindableAdapter diffUtilAsyncBindableAdapter = this.f16807z;
                List synchronizedList = Collections.synchronizedList(diffUtilAsyncBindableAdapter.m22154E());
                Intrinsics.checkIfNull(synchronizedList, "synchronizedList(items)");
                List synchronizedList2 = Collections.synchronizedList(this.f16806y);
                Intrinsics.checkIfNull(synchronizedList2, "synchronizedList(list)");
                C13182l c13182l = new C13182l(arrayList, C6122e.m22146a(diffUtilAsyncBindableAdapter, synchronizedList, synchronizedList2, DiffUtilAsyncBindableAdapter.m22149G(this.f16807z)));
                ((C1601h.C1604c) c13182l.m1461b()).m36041e(this.f16807z);
                this.f16807z.m22154E().clear();
                return C6755b.m20201a(this.f16807z.m22154E().addAll((ArrayList) c13182l.m1462a()));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DiffUtilAsyncBindableAdapter(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "compare");
        this.f16804d = interfaceC6112p;
    }

    /* renamed from: G */
    public static final /* synthetic */ InterfaceC6112p m22149G(DiffUtilAsyncBindableAdapter diffUtilAsyncBindableAdapter) {
        return diffUtilAsyncBindableAdapter.f16804d;
    }

    /* renamed from: H */
    public final Object m22148H(List list, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m20164g = C6769b.m20164g(C10587w0.m7619c(), new C6121a(list, this, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20164g == m34636d ? m20164g : C13195u.f34156a;
    }
}
