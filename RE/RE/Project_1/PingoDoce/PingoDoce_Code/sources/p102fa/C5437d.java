package p102fa;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p102fa.InterfaceC5439f;
import p136ha.InterfaceC5882b;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.C6404t;
import p177j9.InterfaceC6381e;

/* renamed from: fa.d */
/* loaded from: classes.dex */
public class C5437d implements InterfaceC5439f {

    /* renamed from: c */
    private static final ThreadFactory f15320c = ThreadFactoryC5436c.f15319a;

    /* renamed from: a */
    private InterfaceC5882b<C5441g> f15321a;

    /* renamed from: b */
    private final Set<InterfaceC5438e> f15322b;

    private C5437d(final Context context, Set<InterfaceC5438e> set) {
        this(new C6404t(new InterfaceC5882b() { // from class: fa.a
            @Override // p136ha.InterfaceC5882b
            public final Object get() {
                C5441g m24358a;
                m24358a = C5441g.m24358a(context);
                return m24358a;
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f15320c));
    }

    /* renamed from: e */
    public static C6378d<InterfaceC5439f> m24363e() {
        return C6378d.m21119c(InterfaceC5439f.class).m21104b(C6401q.m21042j(Context.class)).m21104b(C6401q.m21041k(InterfaceC5438e.class)).m21100f(C5435b.f15318a).m21102d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC5439f m24362f(InterfaceC6381e interfaceC6381e) {
        return new C5437d((Context) interfaceC6381e.mo21096a(Context.class), interfaceC6381e.mo21095b(InterfaceC5438e.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Thread m24360h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // p102fa.InterfaceC5439f
    /* renamed from: a */
    public InterfaceC5439f.EnumC5440a mo24359a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean m24355d = this.f15321a.get().m24355d(str, currentTimeMillis);
        boolean m24356c = this.f15321a.get().m24356c(currentTimeMillis);
        if (m24355d && m24356c) {
            return InterfaceC5439f.EnumC5440a.COMBINED;
        }
        if (m24356c) {
            return InterfaceC5439f.EnumC5440a.GLOBAL;
        }
        if (m24355d) {
            return InterfaceC5439f.EnumC5440a.SDK;
        }
        return InterfaceC5439f.EnumC5440a.NONE;
    }

    C5437d(InterfaceC5882b<C5441g> interfaceC5882b, Set<InterfaceC5438e> set, Executor executor) {
        this.f15321a = interfaceC5882b;
        this.f15322b = set;
    }
}
