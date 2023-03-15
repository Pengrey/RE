package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.p5 */
/* loaded from: classes.dex */
final class C2921p5 extends AbstractC2858l6 {

    /* renamed from: a */
    private final Context f7921a;

    /* renamed from: b */
    private final InterfaceC3016v6 f7922b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2921p5(Context context, @Nullable InterfaceC3016v6 interfaceC3016v6) {
        Objects.requireNonNull(context, "Null context");
        this.f7921a = context;
        this.f7922b = interfaceC3016v6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2858l6
    /* renamed from: a */
    public final Context mo32205a() {
        return this.f7921a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2858l6
    @Nullable
    /* renamed from: b */
    public final InterfaceC3016v6 mo32204b() {
        return this.f7922b;
    }

    public final boolean equals(Object obj) {
        InterfaceC3016v6 interfaceC3016v6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2858l6) {
            AbstractC2858l6 abstractC2858l6 = (AbstractC2858l6) obj;
            if (this.f7921a.equals(abstractC2858l6.mo32205a()) && ((interfaceC3016v6 = this.f7922b) != null ? interfaceC3016v6.equals(abstractC2858l6.mo32204b()) : abstractC2858l6.mo32204b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7921a.hashCode() ^ 1000003) * 1000003;
        InterfaceC3016v6 interfaceC3016v6 = this.f7922b;
        return hashCode ^ (interfaceC3016v6 == null ? 0 : interfaceC3016v6.hashCode());
    }

    public final String toString() {
        String obj = this.f7921a.toString();
        String valueOf = String.valueOf(this.f7922b);
        StringBuilder sb2 = new StringBuilder(obj.length() + 46 + valueOf.length());
        sb2.append("FlagsContext{context=");
        sb2.append(obj);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
