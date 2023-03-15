package p129h3;

import java.io.File;
import p129h3.AbstractC5840n;
import p181jd.Intrinsics;
import p356sf.C10200t;
import p356sf.FileSystem;
import p356sf.InterfaceC10187e;
import p356sf.Path;
import p396v3.C11098i;

/* renamed from: h3.q */
/* loaded from: classes.dex */
public final class C5844q extends AbstractC5840n {

    /* renamed from: A */
    private Path f16249A;

    /* renamed from: w */
    private final File f16250w;

    /* renamed from: x */
    private final AbstractC5840n.AbstractC5841a f16251x;

    /* renamed from: y */
    private boolean f16252y;

    /* renamed from: z */
    private InterfaceC10187e f16253z;

    public C5844q(InterfaceC10187e interfaceC10187e, File file, AbstractC5840n.AbstractC5841a abstractC5841a) {
        super(null);
        this.f16250w = file;
        this.f16251x = abstractC5841a;
        this.f16253z = interfaceC10187e;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
        }
    }

    /* renamed from: e */
    private final void m22946e() {
        if (!(!this.f16252y)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public AbstractC5840n.AbstractC5841a mo22955a() {
        return this.f16251x;
    }

    /* renamed from: c */
    public synchronized InterfaceC10187e mo22954c() {
        m22946e();
        InterfaceC10187e interfaceC10187e = this.f16253z;
        if (interfaceC10187e != null) {
            return interfaceC10187e;
        }
        FileSystem m22945h = m22945h();
        Path path = this.f16249A;
        Intrinsics.ifNullDoSomething(path);
        InterfaceC10187e m8565c = C10200t.m8565c(m22945h.m8653q(path));
        this.f16253z = m8565c;
        return m8565c;
    }

    public synchronized void close() {
        this.f16252y = true;
        InterfaceC10187e interfaceC10187e = this.f16253z;
        if (interfaceC10187e != null) {
            C11098i.m6152d(interfaceC10187e);
        }
        Path path = this.f16249A;
        if (path != null) {
            m22945h().m8662h(path);
        }
    }

    /* renamed from: h */
    public FileSystem m22945h() {
        return FileSystem.f26563b;
    }
}
