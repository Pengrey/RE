package p129h3;

import java.io.Closeable;
import p129h3.AbstractC5840n;
import p356sf.C10200t;
import p356sf.FileSystem;
import p356sf.InterfaceC10187e;
import p356sf.Path;
import p396v3.C11098i;

/* renamed from: h3.m */
/* loaded from: classes.dex */
public final class C5839m extends AbstractC5840n {

    /* renamed from: A */
    private final AbstractC5840n.AbstractC5841a f16241A;

    /* renamed from: B */
    private boolean f16242B;

    /* renamed from: C */
    private InterfaceC10187e f16243C;

    /* renamed from: w */
    private final Path f16244w;

    /* renamed from: x */
    private final FileSystem f16245x;

    /* renamed from: y */
    private final String f16246y;

    /* renamed from: z */
    private final Closeable f16247z;

    public C5839m(Path path, FileSystem fileSystem, String str, Closeable closeable, AbstractC5840n.AbstractC5841a abstractC5841a) {
        super(null);
        this.f16244w = path;
        this.f16245x = fileSystem;
        this.f16246y = str;
        this.f16247z = closeable;
        this.f16241A = abstractC5841a;
    }

    /* renamed from: e */
    private final void m22958e() {
        if (!(!this.f16242B)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // p129h3.AbstractC5840n
    /* renamed from: a */
    public AbstractC5840n.AbstractC5841a mo22955a() {
        return this.f16241A;
    }

    @Override // p129h3.AbstractC5840n
    /* renamed from: c */
    public synchronized InterfaceC10187e mo22954c() {
        m22958e();
        InterfaceC10187e interfaceC10187e = this.f16243C;
        if (interfaceC10187e != null) {
            return interfaceC10187e;
        }
        InterfaceC10187e m8565c = C10200t.m8565c(m22956t().m8653q(this.f16244w));
        this.f16243C = m8565c;
        return m8565c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f16242B = true;
        InterfaceC10187e interfaceC10187e = this.f16243C;
        if (interfaceC10187e != null) {
            C11098i.m6152d(interfaceC10187e);
        }
        Closeable closeable = this.f16247z;
        if (closeable != null) {
            C11098i.m6152d(closeable);
        }
    }

    /* renamed from: h */
    public final String m22957h() {
        return this.f16246y;
    }

    /* renamed from: t */
    public FileSystem m22956t() {
        return this.f16245x;
    }
}
