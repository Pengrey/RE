package p356sf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p181jd.Intrinsics;

/* renamed from: sf.m */
/* loaded from: classes2.dex */
public class ForwardingTimeout extends Timeout {

    /* renamed from: e */
    private Timeout f26575e;

    public ForwardingTimeout(Timeout timeout) {
        Intrinsics.isThisObjectNull(timeout, "delegate");
        this.f26575e = timeout;
    }

    /* renamed from: a */
    public Timeout m8613a() {
        return this.f26575e.m8652a();
    }

    /* renamed from: b */
    public Timeout m8612b() {
        return this.f26575e.m8651b();
    }

    /* renamed from: c */
    public long m8611c() {
        return this.f26575e.m8650c();
    }

    /* renamed from: d */
    public Timeout m8610d(long j) {
        return this.f26575e.m8649d(j);
    }

    /* renamed from: e */
    public boolean m8609e() {
        return this.f26575e.m8648e();
    }

    /* renamed from: f */
    public void m8608f() throws IOException {
        this.f26575e.m8647f();
    }

    /* renamed from: g */
    public Timeout m8607g(long j, TimeUnit timeUnit) {
        Intrinsics.isThisObjectNull(timeUnit, "unit");
        return this.f26575e.m8646g(j, timeUnit);
    }

    /* renamed from: i */
    public final Timeout m8606i() {
        return this.f26575e;
    }

    /* renamed from: j */
    public final ForwardingTimeout m8605j(Timeout timeout) {
        Intrinsics.isThisObjectNull(timeout, "delegate");
        this.f26575e = timeout;
        return this;
    }
}
