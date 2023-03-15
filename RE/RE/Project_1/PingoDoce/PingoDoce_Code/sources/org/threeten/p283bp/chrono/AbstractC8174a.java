package org.threeten.p283bp.chrono;

import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.temporal.EnumC8289b;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import p405vf.C11251d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.chrono.a */
/* loaded from: classes2.dex */
public abstract class AbstractC8174a<D extends AbstractC8176b> extends AbstractC8176b implements InterfaceC8298d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoDateImpl.java */
    /* renamed from: org.threeten.bp.chrono.a$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8175a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21281a;

        static {
            int[] iArr = new int[EnumC8289b.values().length];
            f21281a = iArr;
            try {
                iArr[EnumC8289b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21281a[EnumC8289b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21281a[EnumC8289b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21281a[EnumC8289b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21281a[EnumC8289b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21281a[EnumC8289b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21281a[EnumC8289b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8298d
    /* renamed from: f */
    public long mo15872f(InterfaceC8298d interfaceC8298d, InterfaceC8314k interfaceC8314k) {
        AbstractC8176b mo16236c = mo16173j().mo16236c(interfaceC8298d);
        if (interfaceC8314k instanceof EnumC8289b) {
            return C8213d.m16160z(this).mo15872f(mo16236c, interfaceC8314k);
        }
        return interfaceC8314k.between(this, mo16236c);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: g */
    public AbstractC8178c<?> mo16175g(C8219f c8219f) {
        return C8180d.m16362w(this, c8219f);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: s */
    public AbstractC8174a<D> mo16168o(long j, InterfaceC8314k interfaceC8314k) {
        if (interfaceC8314k instanceof EnumC8289b) {
            switch (C8175a.f21281a[((EnumC8289b) interfaceC8314k).ordinal()]) {
                case 1:
                    return mo16211u(j);
                case 2:
                    return mo16211u(C11251d.m5620l(j, 7));
                case 3:
                    return mo16210w(j);
                case 4:
                    return mo16209x(j);
                case 5:
                    return mo16209x(C11251d.m5620l(j, 10));
                case 6:
                    return mo16209x(C11251d.m5620l(j, 100));
                case 7:
                    return mo16209x(C11251d.m5620l(j, DateTimeConstants.MILLIS_PER_SECOND));
                default:
                    throw new DateTimeException(interfaceC8314k + " not valid for chronology " + mo16173j().mo16233j());
            }
        }
        return (AbstractC8174a) mo16173j().m16351d(interfaceC8314k.addTo(this, j));
    }

    /* renamed from: u */
    abstract AbstractC8174a<D> mo16211u(long j);

    /* renamed from: w */
    abstract AbstractC8174a<D> mo16210w(long j);

    /* renamed from: x */
    abstract AbstractC8174a<D> mo16209x(long j);
}
