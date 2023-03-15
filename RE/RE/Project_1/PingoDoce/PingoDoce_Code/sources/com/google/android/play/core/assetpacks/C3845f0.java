package com.google.android.play.core.assetpacks;

import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.f0 */
/* loaded from: classes.dex */
final class C3845f0 extends AbstractC3824b {

    /* renamed from: a */
    private final long f10941a;

    /* renamed from: b */
    private final Map<String, AssetPackState> f10942b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3845f0(long j, Map<String, AssetPackState> map) {
        this.f10941a = j;
        this.f10942b = map;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC3824b
    /* renamed from: e */
    public final Map<String, AssetPackState> mo28748e() {
        return this.f10942b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3824b) {
            AbstractC3824b abstractC3824b = (AbstractC3824b) obj;
            if (this.f10941a == abstractC3824b.mo28747f() && this.f10942b.equals(abstractC3824b.mo28748e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC3824b
    /* renamed from: f */
    public final long mo28747f() {
        return this.f10941a;
    }

    public final int hashCode() {
        long j = this.f10941a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f10942b.hashCode();
    }

    public final String toString() {
        long j = this.f10941a;
        String valueOf = String.valueOf(this.f10942b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 61);
        sb2.append("AssetPackStates{totalBytes=");
        sb2.append(j);
        sb2.append(", packStates=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
