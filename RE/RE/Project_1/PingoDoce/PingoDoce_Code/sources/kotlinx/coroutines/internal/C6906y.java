package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.ExceptionsH;
import p468yc.C13195u;
import td.AbstractC10492c2;
import td.AbstractC10505e0;
import td.InterfaceC10529j;
import td.InterfaceC10560q0;
import td.InterfaceC10595y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.y */
/* loaded from: classes2.dex */
public final class C6906y extends AbstractC10492c2 implements InterfaceC10560q0 {

    /* renamed from: y */
    private final Throwable f18373y;

    /* renamed from: z */
    private final String f18374z;

    public C6906y(Throwable th2, String str) {
        this.f18373y = th2;
        this.f18374z = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void m19838K0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f18373y
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f18374z
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f18373y
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.C6905x.m19841d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6906y.m19838K0():java.lang.Void");
    }

    @Override // td.AbstractC10505e0
    /* renamed from: F0 */
    public boolean mo7627F0(CoroutineContext coroutineContext) {
        m19838K0();
        throw new ExceptionsH();
    }

    @Override // td.AbstractC10492c2, td.AbstractC10505e0
    /* renamed from: G0 */
    public AbstractC10505e0 mo7626G0(int i) {
        m19838K0();
        throw new ExceptionsH();
    }

    @Override // td.AbstractC10492c2
    /* renamed from: H0 */
    public AbstractC10492c2 mo7830H0() {
        return this;
    }

    @Override // td.AbstractC10505e0
    /* renamed from: J0 */
    public Void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        m19838K0();
        throw new ExceptionsH();
    }

    @Override // td.InterfaceC10560q0
    /* renamed from: L0 */
    public Void mo7680y(long j, InterfaceC10529j<? super C13195u> interfaceC10529j) {
        m19838K0();
        throw new ExceptionsH();
    }

    @Override // td.InterfaceC10560q0
    /* renamed from: t0 */
    public InterfaceC10595y0 mo6812t0(long j, Runnable runnable, CoroutineContext coroutineContext) {
        m19838K0();
        throw new ExceptionsH();
    }

    @Override // td.AbstractC10492c2, td.AbstractC10505e0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f18373y != null) {
            str = ", cause=" + this.f18373y;
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
