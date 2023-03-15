package p263o3;

import coil.memory.MemoryCache;
import p396v3.C11091c;

/* renamed from: o3.d */
/* loaded from: classes.dex */
public final class C8005d implements MemoryCache {

    /* renamed from: a */
    private final InterfaceC8012g f20727a;

    /* renamed from: b */
    private final InterfaceC8013h f20728b;

    public C8005d(InterfaceC8012g interfaceC8012g, InterfaceC8013h interfaceC8013h) {
        this.f20727a = interfaceC8012g;
        this.f20728b = interfaceC8013h;
    }

    @Override // coil.memory.MemoryCache
    /* renamed from: a */
    public MemoryCache.C2187b mo17196a(MemoryCache.Key key) {
        MemoryCache.C2187b mo17178a = this.f20727a.mo17178a(key);
        return mo17178a == null ? this.f20728b.mo17175a(key) : mo17178a;
    }

    @Override // coil.memory.MemoryCache
    /* renamed from: b */
    public void mo17195b(int i) {
        this.f20727a.mo17177b(i);
        this.f20728b.mo17174b(i);
    }

    @Override // coil.memory.MemoryCache
    /* renamed from: c */
    public void mo17194c(MemoryCache.Key key, MemoryCache.C2187b c2187b) {
        this.f20727a.mo17176c(MemoryCache.Key.m34486b(key, null, C11091c.m6169b(key.m34485c()), 1, null), c2187b.m34481a(), C11091c.m6169b(c2187b.m34480b()));
    }
}
