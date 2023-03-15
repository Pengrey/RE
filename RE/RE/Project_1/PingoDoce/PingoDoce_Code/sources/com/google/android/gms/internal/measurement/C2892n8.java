package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2940q8;
import com.google.android.gms.internal.measurement.C2892n8;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.n8 */
/* loaded from: classes.dex */
public class C2892n8<MessageType extends AbstractC2940q8<MessageType, BuilderType>, BuilderType extends C2892n8<MessageType, BuilderType>> extends AbstractC2683a7<MessageType, BuilderType> {

    /* renamed from: w */
    private final AbstractC2940q8 f7890w;

    /* renamed from: x */
    protected AbstractC2940q8 f7891x;

    /* renamed from: y */
    protected boolean f7892y = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2892n8(MessageType messagetype) {
        this.f7890w = messagetype;
        this.f7891x = (AbstractC2940q8) messagetype.mo31692z(4, null, null);
    }

    /* renamed from: k */
    private static final void m32431k(AbstractC2940q8 abstractC2940q8, AbstractC2940q8 abstractC2940q82) {
        C2686aa.m32915a().m32914b(abstractC2940q8.getClass()).mo31900f(abstractC2940q8, abstractC2940q82);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2989t9
    /* renamed from: c */
    public final /* synthetic */ InterfaceC2973s9 mo32062c() {
        return this.f7890w;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2683a7
    /* renamed from: g */
    protected final /* synthetic */ AbstractC2683a7 mo32434g(AbstractC2699b7 abstractC2699b7) {
        m32428n((AbstractC2940q8) abstractC2699b7);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2683a7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC2683a7 mo32433i(byte[] bArr, int i, int i2) throws zzkh {
        m32427o(bArr, 0, i2, C2732d8.m32783a());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2683a7
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC2683a7 mo32432j(byte[] bArr, int i, int i2, C2732d8 c2732d8) throws zzkh {
        m32427o(bArr, 0, i2, c2732d8);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m32430l() {
        AbstractC2940q8 abstractC2940q8 = (AbstractC2940q8) this.f7891x.mo31692z(4, null, null);
        m32431k(abstractC2940q8, this.f7891x);
        this.f7891x = abstractC2940q8;
    }

    /* renamed from: m */
    public final C2892n8 clone() {
        C2892n8 c2892n8 = (C2892n8) this.f7890w.mo31692z(5, null, null);
        c2892n8.m32428n(mo32135v());
        return c2892n8;
    }

    /* renamed from: n */
    public final C2892n8 m32428n(AbstractC2940q8 abstractC2940q8) {
        if (this.f7892y) {
            m32430l();
            this.f7892y = false;
        }
        m32431k(this.f7891x, abstractC2940q8);
        return this;
    }

    /* renamed from: o */
    public final C2892n8 m32427o(byte[] bArr, int i, int i2, C2732d8 c2732d8) throws zzkh {
        if (this.f7892y) {
            m32430l();
            this.f7892y = false;
        }
        try {
            C2686aa.m32915a().m32914b(this.f7891x.getClass()).mo31903c(this.f7891x, bArr, 0, i2, new C2747e7(c2732d8));
            return this;
        } catch (zzkh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.m31635f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType m32426p() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.q8 r0 = r5.mo32135v()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo31692z(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.aa r3 = com.google.android.gms.internal.measurement.C2686aa.m32915a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.da r3 = r3.m32914b(r4)
            boolean r3 = r3.mo31904b(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.mo31692z(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.zzma r1 = new com.google.android.gms.internal.measurement.zzma
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2892n8.m32426p():com.google.android.gms.internal.measurement.q8");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2957r9
    /* renamed from: q */
    public MessageType mo32135v() {
        if (this.f7892y) {
            return (MessageType) this.f7891x;
        }
        AbstractC2940q8 abstractC2940q8 = this.f7891x;
        C2686aa.m32915a().m32914b(abstractC2940q8.getClass()).mo31905a(abstractC2940q8);
        this.f7892y = true;
        return (MessageType) this.f7891x;
    }
}
