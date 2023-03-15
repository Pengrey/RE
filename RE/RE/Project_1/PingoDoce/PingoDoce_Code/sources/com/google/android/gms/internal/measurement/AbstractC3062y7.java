package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.y7 */
/* loaded from: classes.dex */
public abstract class AbstractC3062y7 extends C2795h7 {

    /* renamed from: b */
    private static final Logger f8101b = Logger.getLogger(AbstractC3062y7.class.getName());

    /* renamed from: c */
    private static final boolean f8102c = C2703bb.m32859C();

    /* renamed from: a */
    C3077z7 f8103a;

    private AbstractC3062y7() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC3062y7(C3032w7 c3032w7) {
    }

    /* renamed from: A */
    public static int m31802A(C3078z8 c3078z8) {
        int m31652a = c3078z8.m31652a();
        return m31798a(m31652a) + m31652a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static int m31801B(InterfaceC2973s9 interfaceC2973s9, InterfaceC2734da interfaceC2734da) {
        AbstractC2699b7 abstractC2699b7 = (AbstractC2699b7) interfaceC2973s9;
        int mo32191g = abstractC2699b7.mo32191g();
        if (mo32191g == -1) {
            mo32191g = interfaceC2734da.mo31901e(abstractC2699b7);
            abstractC2699b7.mo32190j(mo32191g);
        }
        return m31798a(mo32191g) + mo32191g;
    }

    /* renamed from: C */
    public static int m31800C(String str) {
        int length;
        try {
            length = C2783gb.m32613c(str);
        } catch (C2767fb unused) {
            length = str.getBytes(C3048x8.f8089a).length;
        }
        return m31798a(length) + length;
    }

    /* renamed from: D */
    public static int m31799D(int i) {
        return m31798a(i << 3);
    }

    /* renamed from: a */
    public static int m31798a(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m31797b(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: c */
    public static AbstractC3062y7 m31796c(byte[] bArr) {
        return new C3047x7(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m31775x(AbstractC2955r7 abstractC2955r7) {
        int mo32153g = abstractC2955r7.mo32153g();
        return m31798a(mo32153g) + mo32153g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: y */
    public static int m31774y(int i, InterfaceC2973s9 interfaceC2973s9, InterfaceC2734da interfaceC2734da) {
        int m31798a = m31798a(i << 3);
        int i2 = m31798a + m31798a;
        AbstractC2699b7 abstractC2699b7 = (AbstractC2699b7) interfaceC2973s9;
        int mo32191g = abstractC2699b7.mo32191g();
        if (mo32191g == -1) {
            mo32191g = interfaceC2734da.mo31901e(abstractC2699b7);
            abstractC2699b7.mo32190j(mo32191g);
        }
        return i2 + mo32191g;
    }

    /* renamed from: z */
    public static int m31773z(int i) {
        if (i >= 0) {
            return m31798a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void m31795d() {
        if (mo31792g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m31794e(String str, C2767fb c2767fb) throws IOException {
        f8101b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2767fb);
        byte[] bytes = str.getBytes(C3048x8.f8089a);
        try {
            int length = bytes.length;
            mo31778u(length);
            mo31782q(bytes, 0, length);
        } catch (zzjd e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(e2);
        }
    }

    /* renamed from: g */
    public abstract int mo31792g();

    /* renamed from: h */
    public abstract void mo31791h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo31790i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo31789j(int i, AbstractC2955r7 abstractC2955r7) throws IOException;

    /* renamed from: k */
    public abstract void mo31788k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo31787l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo31786m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo31785n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo31784o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo31783p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo31782q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo31781r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo31780s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo31779t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo31778u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo31777v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo31776w(long j) throws IOException;
}
