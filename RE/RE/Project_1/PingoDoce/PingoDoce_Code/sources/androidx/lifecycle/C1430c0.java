package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p243n.C7547b;

/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes.dex */
public class C1430c0<T> extends C1436e0<T> {

    /* renamed from: l */
    private C7547b<LiveData<?>, C1431a<?>> f4280l = new C7547b<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediatorLiveData.java */
    /* renamed from: androidx.lifecycle.c0$a */
    /* loaded from: classes.dex */
    public static class C1431a<V> implements InterfaceC1440f0<V> {

        /* renamed from: a */
        final LiveData<V> f4281a;

        /* renamed from: b */
        final InterfaceC1440f0<? super V> f4282b;

        /* renamed from: c */
        int f4283c = -1;

        C1431a(LiveData<V> liveData, InterfaceC1440f0<? super V> interfaceC1440f0) {
            this.f4281a = liveData;
            this.f4282b = interfaceC1440f0;
        }

        /* renamed from: a */
        void m37054a() {
            this.f4281a.mo170j(this);
        }

        /* renamed from: b */
        void m37053b() {
            this.f4281a.mo168n(this);
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: c */
        public void mo37325a(V v) {
            if (this.f4283c != this.f4281a.m37079g()) {
                this.f4283c = this.f4281a.m37079g();
                this.f4282b.mo37325a(v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: k */
    public void mo36938k() {
        Iterator<Map.Entry<LiveData<?>, C1431a<?>>> it = this.f4280l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m37054a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: l */
    public void mo36937l() {
        Iterator<Map.Entry<LiveData<?>, C1431a<?>>> it = this.f4280l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m37053b();
        }
    }

    /* renamed from: q */
    public <S> void m37055q(LiveData<S> liveData, InterfaceC1440f0<? super S> interfaceC1440f0) {
        C1431a<?> c1431a = new C1431a<>(liveData, interfaceC1440f0);
        C1431a<?> mo18162o = this.f4280l.mo18162o(liveData, c1431a);
        if (mo18162o != null && mo18162o.f4282b != interfaceC1440f0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (mo18162o == null && m37078h()) {
            c1431a.m37054a();
        }
    }
}
