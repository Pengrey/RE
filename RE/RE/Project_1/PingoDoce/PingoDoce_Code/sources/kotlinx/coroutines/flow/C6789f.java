package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6789f {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.f$a */
    /* loaded from: classes2.dex */
    public static final class C6790a implements InterfaceC6785c<T> {

        /* renamed from: w */
        final /* synthetic */ Object f18167w;

        public C6790a(Object obj) {
            this.f18167w = obj;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            Object m34636d;
            Object mo4529a = interfaceC6787d.mo4529a(this.f18167w, interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo4529a == m34636d ? mo4529a : C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC6785c<T> m20122a(InterfaceC6112p<? super InterfaceC6787d<? super T>, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6112p) {
        return new C6836s(interfaceC6112p);
    }

    /* renamed from: b */
    public static final <T> InterfaceC6785c<T> m20121b(T t) {
        return new C6790a(t);
    }
}
