package p294p9;

import java.util.Objects;
import p219l9.C7008e;
import p294p9.AbstractC8520c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p9.x */
/* loaded from: classes.dex */
public final class C8580x extends AbstractC8520c0.AbstractC8521a {

    /* renamed from: a */
    private final String f22168a;

    /* renamed from: b */
    private final String f22169b;

    /* renamed from: c */
    private final String f22170c;

    /* renamed from: d */
    private final String f22171d;

    /* renamed from: e */
    private final int f22172e;

    /* renamed from: f */
    private final C7008e f22173f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8580x(String str, String str2, String str3, String str4, int i, C7008e c7008e) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f22168a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f22169b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f22170c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f22171d = str4;
        this.f22172e = i;
        Objects.requireNonNull(c7008e, "Null developmentPlatformProvider");
        this.f22173f = c7008e;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8521a
    /* renamed from: a */
    public String mo15110a() {
        return this.f22168a;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8521a
    /* renamed from: c */
    public int mo15109c() {
        return this.f22172e;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8521a
    /* renamed from: d */
    public C7008e mo15108d() {
        return this.f22173f;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8521a
    /* renamed from: e */
    public String mo15107e() {
        return this.f22171d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8520c0.AbstractC8521a) {
            AbstractC8520c0.AbstractC8521a abstractC8521a = (AbstractC8520c0.AbstractC8521a) obj;
            return this.f22168a.equals(abstractC8521a.mo15110a()) && this.f22169b.equals(abstractC8521a.mo15106f()) && this.f22170c.equals(abstractC8521a.mo15105g()) && this.f22171d.equals(abstractC8521a.mo15107e()) && this.f22172e == abstractC8521a.mo15109c() && this.f22173f.equals(abstractC8521a.mo15108d());
        }
        return false;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8521a
    /* renamed from: f */
    public String mo15106f() {
        return this.f22169b;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8521a
    /* renamed from: g */
    public String mo15105g() {
        return this.f22170c;
    }

    public int hashCode() {
        return ((((((((((this.f22168a.hashCode() ^ 1000003) * 1000003) ^ this.f22169b.hashCode()) * 1000003) ^ this.f22170c.hashCode()) * 1000003) ^ this.f22171d.hashCode()) * 1000003) ^ this.f22172e) * 1000003) ^ this.f22173f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f22168a + ", versionCode=" + this.f22169b + ", versionName=" + this.f22170c + ", installUuid=" + this.f22171d + ", deliveryMechanism=" + this.f22172e + ", developmentPlatformProvider=" + this.f22173f + "}";
    }
}
