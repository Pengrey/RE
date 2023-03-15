package p177j9;

import p136ha.InterfaceC5880a;
import p136ha.InterfaceC5882b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j9.y */
/* loaded from: classes.dex */
public class C6409y<T> implements InterfaceC5882b<T>, InterfaceC5880a<T> {

    /* renamed from: c */
    private static final InterfaceC5880a.InterfaceC5881a<Object> f17476c = C6407w.f17474a;

    /* renamed from: d */
    private static final InterfaceC5882b<Object> f17477d = C6408x.f17475a;

    /* renamed from: a */
    private InterfaceC5880a.InterfaceC5881a<T> f17478a;

    /* renamed from: b */
    private volatile InterfaceC5882b<T> f17479b;

    private C6409y(InterfaceC5880a.InterfaceC5881a<T> interfaceC5881a, InterfaceC5882b<T> interfaceC5882b) {
        this.f17478a = interfaceC5881a;
        this.f17479b = interfaceC5882b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T> C6409y<T> m21025e() {
        return new C6409y<>(f17476c, f17477d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m21024f(InterfaceC5882b interfaceC5882b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m21023g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m21022h(InterfaceC5880a.InterfaceC5881a interfaceC5881a, InterfaceC5880a.InterfaceC5881a interfaceC5881a2, InterfaceC5882b interfaceC5882b) {
        interfaceC5881a.mo19633a(interfaceC5882b);
        interfaceC5881a2.mo19633a(interfaceC5882b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <T> C6409y<T> m21021i(InterfaceC5882b<T> interfaceC5882b) {
        return new C6409y<>(null, interfaceC5882b);
    }

    @Override // p136ha.InterfaceC5880a
    /* renamed from: a */
    public void mo21029a(final InterfaceC5880a.InterfaceC5881a<T> interfaceC5881a) {
        InterfaceC5882b<T> interfaceC5882b;
        InterfaceC5882b<T> interfaceC5882b2 = this.f17479b;
        InterfaceC5882b<Object> interfaceC5882b3 = f17477d;
        if (interfaceC5882b2 != interfaceC5882b3) {
            interfaceC5881a.mo19633a(interfaceC5882b2);
            return;
        }
        InterfaceC5882b<T> interfaceC5882b4 = null;
        synchronized (this) {
            interfaceC5882b = this.f17479b;
            if (interfaceC5882b != interfaceC5882b3) {
                interfaceC5882b4 = interfaceC5882b;
            } else {
                final InterfaceC5880a.InterfaceC5881a<T> interfaceC5881a2 = this.f17478a;
                this.f17478a = new InterfaceC5880a.InterfaceC5881a() { // from class: j9.v
                    @Override // p136ha.InterfaceC5880a.InterfaceC5881a
                    /* renamed from: a */
                    public final void mo19633a(InterfaceC5882b interfaceC5882b5) {
                        C6409y.m21022h(InterfaceC5880a.InterfaceC5881a.this, interfaceC5881a, interfaceC5882b5);
                    }
                };
            }
        }
        if (interfaceC5882b4 != null) {
            interfaceC5881a.mo19633a(interfaceC5882b);
        }
    }

    @Override // p136ha.InterfaceC5882b
    public T get() {
        return this.f17479b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m21020j(InterfaceC5882b<T> interfaceC5882b) {
        InterfaceC5880a.InterfaceC5881a<T> interfaceC5881a;
        if (this.f17479b == f17477d) {
            synchronized (this) {
                interfaceC5881a = this.f17478a;
                this.f17478a = null;
                this.f17479b = interfaceC5882b;
            }
            interfaceC5881a.mo19633a(interfaceC5882b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
