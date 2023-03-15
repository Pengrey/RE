package org.threeten.p283bp.chrono;

import java.io.Serializable;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8299e;

/* renamed from: org.threeten.bp.chrono.r */
/* loaded from: classes2.dex */
public final class C8202r extends AbstractC8188h implements Serializable {

    /* renamed from: y */
    public static final C8202r f21350y = new C8202r();

    /* compiled from: MinguoChronology.java */
    /* renamed from: org.threeten.bp.chrono.r$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C8203a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21351a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21351a = iArr;
            try {
                iArr[EnumC8288a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21351a[EnumC8288a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21351a[EnumC8288a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C8202r() {
    }

    private Object readResolve() {
        return f21350y;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: i */
    public String mo16234i() {
        return "roc";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: j */
    public String mo16233j() {
        return "Minguo";
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: l */
    public AbstractC8178c<C8204s> mo16232l(InterfaceC8299e interfaceC8299e) {
        return super.mo16232l(interfaceC8299e);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: q */
    public AbstractC8183f<C8204s> mo16231q(C8171c c8171c, AbstractC8280n abstractC8280n) {
        return super.mo16231q(c8171c, abstractC8280n);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: r */
    public AbstractC8183f<C8204s> mo16230r(InterfaceC8299e interfaceC8299e) {
        return super.mo16230r(interfaceC8299e);
    }

    /* renamed from: s */
    public C8204s m16257s(int i, int i2, int i3) {
        return new C8204s(C8213d.m16193O(i + 1911, i2, i3));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: t */
    public C8204s mo16236c(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8204s) {
            return (C8204s) interfaceC8299e;
        }
        return new C8204s(C8213d.m16160z(interfaceC8299e));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8188h
    /* renamed from: u */
    public EnumC8206t mo16235g(int i) {
        return EnumC8206t.m16239of(i);
    }

    /* renamed from: v */
    public C8315l m16254v(EnumC8288a enumC8288a) {
        int i = C8203a.f21351a[enumC8288a.ordinal()];
        if (i == 1) {
            C8315l range = EnumC8288a.PROLEPTIC_MONTH.range();
            return C8315l.m15846i(range.m15851d() - 22932, range.m15852c() - 22932);
        } else if (i == 2) {
            C8315l range2 = EnumC8288a.YEAR.range();
            return C8315l.m15845j(1L, range2.m15852c() - 1911, (-range2.m15851d()) + 1 + 1911);
        } else if (i != 3) {
            return enumC8288a.range();
        } else {
            C8315l range3 = EnumC8288a.YEAR.range();
            return C8315l.m15846i(range3.m15851d() - 1911, range3.m15852c() - 1911);
        }
    }
}
