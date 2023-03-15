package kotlinx.coroutines.internal;

import id.InterfaceC6108l;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: kotlinx.coroutines.internal.p0 */
/* loaded from: classes2.dex */
final class C6892p0 extends AbstractC6868i {

    /* renamed from: a */
    public static final C6892p0 f18350a = new C6892p0();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f18351b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, InterfaceC6108l<Throwable, Throwable>> f18352c = new WeakHashMap<>();

    private C6892p0() {
    }

    @Override // kotlinx.coroutines.internal.AbstractC6868i
    /* renamed from: a */
    public InterfaceC6108l<Throwable, Throwable> mo19889a(Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f18351b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            InterfaceC6108l<Throwable, Throwable> interfaceC6108l = f18352c.get(cls);
            if (interfaceC6108l != null) {
                return interfaceC6108l;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, InterfaceC6108l<Throwable, Throwable>> weakHashMap = f18352c;
                InterfaceC6108l<Throwable, Throwable> interfaceC6108l2 = weakHashMap.get(cls);
                if (interfaceC6108l2 != null) {
                    return interfaceC6108l2;
                }
                InterfaceC6108l<Throwable, Throwable> m19936a = C6874l.m19936a(cls);
                weakHashMap.put(cls, m19936a);
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return m19936a;
            } finally {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
