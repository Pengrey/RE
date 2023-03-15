package p356sf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: sf.i0 */
/* loaded from: classes2.dex */
public class Timeout {

    /* renamed from: d */
    public static final Timeout f26564d;

    /* renamed from: a */
    private boolean f26565a;

    /* renamed from: b */
    private long f26566b;

    /* renamed from: c */
    private long f26567c;

    /* compiled from: Timeout.kt */
    /* renamed from: sf.i0$a */
    /* loaded from: classes2.dex */
    public static final class C10193a extends Timeout {
        C10193a() {
        }

        /* renamed from: d */
        public Timeout m8644d(long j) {
            return this;
        }

        /* renamed from: f */
        public void m8643f() {
        }

        /* renamed from: g */
        public Timeout m8642g(long j, TimeUnit timeUnit) {
            Intrinsics.isThisObjectNull(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    /* renamed from: sf.i0$b */
    /* loaded from: classes2.dex */
    public static final class C10194b {
        private C10194b() {
        }

        public /* synthetic */ C10194b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10194b(null);
        f26564d = new C10193a();
    }

    /* renamed from: a */
    public Timeout m8652a() {
        this.f26565a = false;
        return this;
    }

    /* renamed from: b */
    public Timeout m8651b() {
        this.f26567c = 0L;
        return this;
    }

    /* renamed from: c */
    public long m8650c() {
        if (this.f26565a) {
            return this.f26566b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public Timeout m8649d(long j) {
        this.f26565a = true;
        this.f26566b = j;
        return this;
    }

    /* renamed from: e */
    public boolean m8648e() {
        return this.f26565a;
    }

    /* renamed from: f */
    public void m8647f() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f26565a && this.f26566b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    /* renamed from: g */
    public Timeout m8646g(long j, TimeUnit timeUnit) {
        Intrinsics.isThisObjectNull(timeUnit, "unit");
        if (j >= 0) {
            this.f26567c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    /* renamed from: h */
    public long m8645h() {
        return this.f26567c;
    }
}
