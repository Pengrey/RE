package p031b9;

import java.util.Objects;

/* renamed from: b9.q */
/* loaded from: classes.dex */
final class C1860q extends AbstractC1857n {

    /* renamed from: a */
    private final C1859p f5583a = new C1859p();

    @Override // p031b9.AbstractC1857n
    /* renamed from: a */
    public final void mo35250a(Throwable th2, Throwable th3) {
        if (th3 == th2) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th3);
        }
        Objects.requireNonNull(th3, "The suppressed exception cannot be null.");
        this.f5583a.m35251a(th2).add(th3);
    }
}
