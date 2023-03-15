package p151i3;

import id.InterfaceC6108l;
import java.io.IOException;
import p356sf.Buffer;
import p356sf.ForwardingSink;
import p356sf.InterfaceC10189f0;
import p468yc.C13195u;

/* renamed from: i3.c */
/* loaded from: classes.dex */
public final class C6008c extends ForwardingSink {

    /* renamed from: x */
    private final InterfaceC6108l<IOException, C13195u> f16594x;

    /* renamed from: y */
    private boolean f16595y;

    /* JADX WARN: Multi-variable type inference failed */
    public C6008c(InterfaceC10189f0 interfaceC10189f0, InterfaceC6108l<? super IOException, C13195u> interfaceC6108l) {
        super(interfaceC10189f0);
        this.f16594x = interfaceC6108l;
    }

    @Override // p356sf.ForwardingSink, p356sf.InterfaceC10189f0
    /* renamed from: B */
    public void mo8688B(Buffer buffer, long j) {
        if (this.f16595y) {
            buffer.skip(j);
            return;
        }
        try {
            super.mo8688B(buffer, j);
        } catch (IOException e) {
            this.f16595y = true;
            this.f16594x.mo9587d(e);
        }
    }

    @Override // p356sf.ForwardingSink, p356sf.InterfaceC10189f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f16595y = true;
            this.f16594x.mo9587d(e);
        }
    }

    @Override // p356sf.ForwardingSink, p356sf.InterfaceC10189f0, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f16595y = true;
            this.f16594x.mo9587d(e);
        }
    }
}
