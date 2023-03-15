package p294p9;

import java.util.Objects;
import p294p9.AbstractC8520c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p9.w */
/* loaded from: classes.dex */
public final class C8579w extends AbstractC8520c0 {

    /* renamed from: a */
    private final AbstractC8520c0.AbstractC8521a f22165a;

    /* renamed from: b */
    private final AbstractC8520c0.AbstractC8523c f22166b;

    /* renamed from: c */
    private final AbstractC8520c0.AbstractC8522b f22167c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8579w(AbstractC8520c0.AbstractC8521a abstractC8521a, AbstractC8520c0.AbstractC8523c abstractC8523c, AbstractC8520c0.AbstractC8522b abstractC8522b) {
        Objects.requireNonNull(abstractC8521a, "Null appData");
        this.f22165a = abstractC8521a;
        Objects.requireNonNull(abstractC8523c, "Null osData");
        this.f22166b = abstractC8523c;
        Objects.requireNonNull(abstractC8522b, "Null deviceData");
        this.f22167c = abstractC8522b;
    }

    @Override // p294p9.AbstractC8520c0
    /* renamed from: a */
    public AbstractC8520c0.AbstractC8521a mo15113a() {
        return this.f22165a;
    }

    @Override // p294p9.AbstractC8520c0
    /* renamed from: c */
    public AbstractC8520c0.AbstractC8522b mo15112c() {
        return this.f22167c;
    }

    @Override // p294p9.AbstractC8520c0
    /* renamed from: d */
    public AbstractC8520c0.AbstractC8523c mo15111d() {
        return this.f22166b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8520c0) {
            AbstractC8520c0 abstractC8520c0 = (AbstractC8520c0) obj;
            return this.f22165a.equals(abstractC8520c0.mo15113a()) && this.f22166b.equals(abstractC8520c0.mo15111d()) && this.f22167c.equals(abstractC8520c0.mo15112c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22165a.hashCode() ^ 1000003) * 1000003) ^ this.f22166b.hashCode()) * 1000003) ^ this.f22167c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f22165a + ", osData=" + this.f22166b + ", deviceData=" + this.f22167c + "}";
    }
}
