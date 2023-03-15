package p461y5;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.a */
/* loaded from: classes.dex */
public final class C13110a<T> extends AbstractC13112c<T> {

    /* renamed from: a */
    private final Integer f34084a;

    /* renamed from: b */
    private final T f34085b;

    /* renamed from: c */
    private final EnumC13113d f34086c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13110a(Integer num, T t, EnumC13113d enumC13113d) {
        this.f34084a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f34085b = t;
        Objects.requireNonNull(enumC13113d, "Null priority");
        this.f34086c = enumC13113d;
    }

    @Override // p461y5.AbstractC13112c
    /* renamed from: a */
    public Integer mo1583a() {
        return this.f34084a;
    }

    @Override // p461y5.AbstractC13112c
    /* renamed from: b */
    public T mo1582b() {
        return this.f34085b;
    }

    @Override // p461y5.AbstractC13112c
    /* renamed from: c */
    public EnumC13113d mo1581c() {
        return this.f34086c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13112c) {
            AbstractC13112c abstractC13112c = (AbstractC13112c) obj;
            Integer num = this.f34084a;
            if (num != null ? num.equals(abstractC13112c.mo1583a()) : abstractC13112c.mo1583a() == null) {
                if (this.f34085b.equals(abstractC13112c.mo1582b()) && this.f34086c.equals(abstractC13112c.mo1581c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f34084a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f34085b.hashCode()) * 1000003) ^ this.f34086c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f34084a + ", payload=" + this.f34085b + ", priority=" + this.f34086c + "}";
    }
}
