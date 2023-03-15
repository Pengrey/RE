package p193k3;

import bd.InterfaceC1886d;
import java.nio.ByteBuffer;
import p095f3.InterfaceC5359e;
import p129h3.C5842o;
import p129h3.EnumC5826d;
import p193k3.InterfaceC6580h;
import p305q3.C9635k;
import p356sf.Buffer;

/* renamed from: k3.c */
/* loaded from: classes.dex */
public final class C6572c implements InterfaceC6580h {

    /* renamed from: a */
    private final ByteBuffer f17806a;

    /* renamed from: b */
    private final C9635k f17807b;

    /* compiled from: ByteBufferFetcher.kt */
    /* renamed from: k3.c$a */
    /* loaded from: classes.dex */
    public static final class C6573a implements InterfaceC6580h.InterfaceC6581a<ByteBuffer> {
        @Override // p193k3.InterfaceC6580h.InterfaceC6581a
        /* renamed from: b */
        public InterfaceC6580h mo20560b(ByteBuffer byteBuffer, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            return new C6572c(byteBuffer, c9635k);
        }
    }

    public C6572c(ByteBuffer byteBuffer, C9635k c9635k) {
        this.f17806a = byteBuffer;
        this.f17807b = c9635k;
    }

    @Override // p193k3.InterfaceC6580h
    /* renamed from: a */
    public Object mo20548a(InterfaceC1886d<? super AbstractC6579g> interfaceC1886d) {
        try {
            Buffer buffer = new Buffer();
            buffer.write(this.f17806a);
            this.f17806a.position(0);
            return new C6592l(C5842o.m22953a(buffer, this.f17807b.m10324g()), null, EnumC5826d.MEMORY);
        } catch (Throwable th2) {
            this.f17806a.position(0);
            throw th2;
        }
    }
}
