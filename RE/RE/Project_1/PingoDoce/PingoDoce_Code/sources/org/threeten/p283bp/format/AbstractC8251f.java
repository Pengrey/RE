package org.threeten.p283bp.format;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.p283bp.temporal.InterfaceC8304h;

/* renamed from: org.threeten.bp.format.f */
/* loaded from: classes2.dex */
public abstract class AbstractC8251f {

    /* renamed from: a */
    private static final AtomicReference<AbstractC8251f> f21455a = new AtomicReference<>();

    /* compiled from: DateTimeTextProvider.java */
    /* renamed from: org.threeten.bp.format.f$a */
    /* loaded from: classes2.dex */
    static class C8252a {

        /* renamed from: a */
        static final AbstractC8251f f21456a = m16025a();

        /* renamed from: a */
        static AbstractC8251f m16025a() {
            AbstractC8251f.f21455a.compareAndSet(null, new C8256j());
            return (AbstractC8251f) AbstractC8251f.f21455a.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC8251f m16026b() {
        return C8252a.f21456a;
    }

    /* renamed from: c */
    public abstract String mo16019c(InterfaceC8304h interfaceC8304h, long j, EnumC8259k enumC8259k, Locale locale);
}
