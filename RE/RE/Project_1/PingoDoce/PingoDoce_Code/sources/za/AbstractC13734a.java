package za;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p466ya.InterfaceC13143b;

/* renamed from: za.a */
/* loaded from: classes2.dex */
public abstract class AbstractC13734a<T extends InterfaceC13143b> implements InterfaceC13735b<T> {

    /* renamed from: a */
    private final ReadWriteLock f34843a = new ReentrantReadWriteLock();

    @Override // za.InterfaceC13735b
    /* renamed from: c */
    public void mo543c() {
        this.f34843a.writeLock().unlock();
    }

    @Override // za.InterfaceC13735b
    /* renamed from: d */
    public void mo542d() {
        this.f34843a.writeLock().lock();
    }
}
