package org.threeten.p283bp.chrono;

import java.io.Serializable;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8216e;
import org.threeten.p283bp.C8285q;
import org.threeten.p283bp.temporal.InterfaceC8299e;

/* renamed from: org.threeten.bp.chrono.m */
/* loaded from: classes2.dex */
public final class C8195m extends AbstractC8188h implements Serializable {

    /* renamed from: y */
    public static final C8195m f21328y = new C8195m();

    private C8195m() {
    }

    private Object readResolve() {
        return f21328y;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: i */
    public String mo16234i() {
        return "iso8601";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: j */
    public String mo16233j() {
        return "ISO";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: s */
    public C8213d mo16236c(InterfaceC8299e interfaceC8299e) {
        return C8213d.m16160z(interfaceC8299e);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: t */
    public EnumC8196n mo16235g(int i) {
        return EnumC8196n.m16287of(i);
    }

    /* renamed from: u */
    public boolean m16291u(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: v */
    public C8216e mo16232l(InterfaceC8299e interfaceC8299e) {
        return C8216e.m16158A(interfaceC8299e);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: w */
    public C8285q mo16231q(C8171c c8171c, AbstractC8280n abstractC8280n) {
        return C8285q.m15906C(c8171c, abstractC8280n);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: x */
    public C8285q mo16230r(InterfaceC8299e interfaceC8299e) {
        return C8285q.m15877x(interfaceC8299e);
    }
}
