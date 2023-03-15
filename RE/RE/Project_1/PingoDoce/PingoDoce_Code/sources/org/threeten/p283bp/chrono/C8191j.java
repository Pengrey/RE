package org.threeten.p283bp.chrono;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8299e;

/* renamed from: org.threeten.bp.chrono.j */
/* loaded from: classes2.dex */
public final class C8191j extends AbstractC8188h implements Serializable {

    /* renamed from: A */
    private static final HashMap<String, String[]> f21292A;

    /* renamed from: B */
    private static final HashMap<String, String[]> f21293B;

    /* renamed from: y */
    public static final C8191j f21294y = new C8191j();

    /* renamed from: z */
    private static final HashMap<String, String[]> f21295z;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f21295z = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f21292A = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f21293B = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private C8191j() {
    }

    private Object readResolve() {
        return f21294y;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: i */
    public String mo16234i() {
        return "islamic-umalqura";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: j */
    public String mo16233j() {
        return "Hijrah-umalqura";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: l */
    public AbstractC8178c<C8192k> mo16232l(InterfaceC8299e interfaceC8299e) {
        return super.mo16232l(interfaceC8299e);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: q */
    public AbstractC8183f<C8192k> mo16231q(C8171c c8171c, AbstractC8280n abstractC8280n) {
        return super.mo16231q(c8171c, abstractC8280n);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: r */
    public AbstractC8183f<C8192k> mo16230r(InterfaceC8299e interfaceC8299e) {
        return super.mo16230r(interfaceC8299e);
    }

    /* renamed from: s */
    public C8192k m16341s(int i, int i2, int i3) {
        return C8192k.m16310c0(i, i2, i3);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: t */
    public C8192k mo16236c(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8192k) {
            return (C8192k) interfaceC8299e;
        }
        return C8192k.m16308e0(interfaceC8299e.getLong(EnumC8288a.EPOCH_DAY));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: u */
    public EnumC8194l mo16235g(int i) {
        if (i != 0) {
            if (i == 1) {
                return EnumC8194l.AH;
            }
            throw new DateTimeException("invalid Hijrah era");
        }
        return EnumC8194l.BEFORE_AH;
    }

    /* renamed from: v */
    public C8315l m16338v(EnumC8288a enumC8288a) {
        return enumC8288a.range();
    }
}
