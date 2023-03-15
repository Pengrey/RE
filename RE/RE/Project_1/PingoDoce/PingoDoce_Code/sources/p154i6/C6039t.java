package p154i6;

import java.util.concurrent.Executor;
import p007a6.AbstractC0056o;
import p174j6.InterfaceC6313d;
import p196k6.InterfaceC6601a;

/* renamed from: i6.t */
/* loaded from: classes.dex */
public class C6039t {

    /* renamed from: a */
    private final Executor f16682a;

    /* renamed from: b */
    private final InterfaceC6313d f16683b;

    /* renamed from: c */
    private final InterfaceC6041v f16684c;

    /* renamed from: d */
    private final InterfaceC6601a f16685d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6039t(Executor executor, InterfaceC6313d interfaceC6313d, InterfaceC6041v interfaceC6041v, InterfaceC6601a interfaceC6601a) {
        this.f16682a = executor;
        this.f16683b = interfaceC6313d;
        this.f16684c = interfaceC6041v;
        this.f16685d = interfaceC6601a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m22315d() {
        for (AbstractC0056o abstractC0056o : this.f16683b.mo21205Y()) {
            this.f16684c.mo22310a(abstractC0056o, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m22314e() {
        this.f16685d.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.s
            @Override // p196k6.InterfaceC6601a.InterfaceC6602a
            public final Object execute() {
                Object m22315d;
                m22315d = C6039t.this.m22315d();
                return m22315d;
            }
        });
    }

    /* renamed from: c */
    public void m22316c() {
        this.f16682a.execute(new Runnable() { // from class: i6.r
            @Override // java.lang.Runnable
            public final void run() {
                C6039t.this.m22314e();
            }
        });
    }
}
