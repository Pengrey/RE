package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p233m4.GraphRequestBatch;
import p233m4.InterfaceC7129h;
import p233m4.RequestProgress;

/* renamed from: com.facebook.g */
/* loaded from: classes.dex */
public final class ProgressOutputStream extends FilterOutputStream implements InterfaceC7129h {

    /* renamed from: A */
    private final GraphRequestBatch f6676A;

    /* renamed from: B */
    private final Map f6677B;

    /* renamed from: C */
    private final long f6678C;

    /* renamed from: w */
    private final long f6679w;

    /* renamed from: x */
    private long f6680x;

    /* renamed from: y */
    private long f6681y;

    /* renamed from: z */
    private RequestProgress f6682z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressOutputStream.kt */
    /* renamed from: com.facebook.g$a */
    /* loaded from: classes.dex */
    public static final class RunnableC2306a implements Runnable {

        /* renamed from: x */
        final /* synthetic */ GraphRequestBatch.InterfaceC7124a f6684x;

        RunnableC2306a(GraphRequestBatch.InterfaceC7124a interfaceC7124a) {
            this.f6684x = interfaceC7124a;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                ((GraphRequestBatch.InterfaceC7126c) this.f6684x).m19126b(ProgressOutputStream.m34063c(ProgressOutputStream.this), ProgressOutputStream.this.m34061h(), ProgressOutputStream.this.m34060t());
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressOutputStream(OutputStream outputStream, GraphRequestBatch graphRequestBatch, Map map, long j) {
        super(outputStream);
        Intrinsics.isThisObjectNull(outputStream, "out");
        Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
        Intrinsics.isThisObjectNull(map, "progressMap");
        this.f6676A = graphRequestBatch;
        this.f6677B = map;
        this.f6678C = j;
        this.f6679w = C2290b.m34099p();
    }

    /* renamed from: c */
    public static final /* synthetic */ GraphRequestBatch m34063c(ProgressOutputStream progressOutputStream) {
        return progressOutputStream.f6676A;
    }

    /* renamed from: e */
    private final void m34062e(long j) {
        RequestProgress requestProgress = this.f6682z;
        if (requestProgress != null) {
            requestProgress.m19109a(j);
        }
        long j2 = this.f6680x + j;
        this.f6680x = j2;
        if (j2 >= this.f6681y + this.f6679w || j2 >= this.f6678C) {
            m34059v();
        }
    }

    /* renamed from: v */
    private final void m34059v() {
        if (this.f6680x > this.f6681y) {
            for (GraphRequestBatch.InterfaceC7124a interfaceC7124a : this.f6676A.m19129x()) {
                if (interfaceC7124a instanceof GraphRequestBatch.InterfaceC7126c) {
                    Handler m19130v = this.f6676A.m19130v();
                    if (m19130v != null) {
                        m19130v.post(new RunnableC2306a(interfaceC7124a));
                    } else {
                        ((GraphRequestBatch.InterfaceC7126c) interfaceC7124a).m19126b(this.f6676A, this.f6680x, this.f6678C);
                    }
                }
            }
            this.f6681y = this.f6680x;
        }
    }

    /* renamed from: a */
    public void mo19110a(GraphRequest graphRequest) {
        this.f6682z = graphRequest != null ? (RequestProgress) this.f6677B.get(graphRequest) : null;
    }

    public void close() throws IOException {
        super.close();
        for (RequestProgress requestProgress : this.f6677B.values()) {
            requestProgress.m19107c();
        }
        m34059v();
    }

    /* renamed from: h */
    public final long m34061h() {
        return this.f6680x;
    }

    /* renamed from: t */
    public final long m34060t() {
        return this.f6678C;
    }

    public void write(byte[] bArr) throws IOException {
        Intrinsics.isThisObjectNull(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        m34062e(bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        Intrinsics.isThisObjectNull(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        m34062e(i2);
    }

    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        m34062e(1L);
    }
}
