package com.google.android.play.core.assetpacks;

import java.util.Objects;

/* renamed from: com.google.android.play.core.assetpacks.e0 */
/* loaded from: classes.dex */
final class C3840e0 extends AssetPackState {

    /* renamed from: a */
    private final String f10927a;

    /* renamed from: b */
    private final int f10928b;

    /* renamed from: c */
    private final int f10929c;

    /* renamed from: d */
    private final long f10930d;

    /* renamed from: e */
    private final long f10931e;

    /* renamed from: f */
    private final int f10932f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3840e0(String str, int i, int i2, long j, long j2, int i3) {
        Objects.requireNonNull(str, "Null name");
        this.f10927a = str;
        this.f10928b = i;
        this.f10929c = i2;
        this.f10930d = j;
        this.f10931e = j2;
        this.f10932f = i3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: c */
    public final long mo28754c() {
        return this.f10930d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: d */
    public final int mo28753d() {
        return this.f10929c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: e */
    public final String mo28752e() {
        return this.f10927a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f10927a.equals(assetPackState.mo28752e()) && this.f10928b == assetPackState.mo28751f() && this.f10929c == assetPackState.mo28753d() && this.f10930d == assetPackState.mo28754c() && this.f10931e == assetPackState.mo28750g() && this.f10932f == assetPackState.mo28749h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: f */
    public final int mo28751f() {
        return this.f10928b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: g */
    public final long mo28750g() {
        return this.f10931e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: h */
    public final int mo28749h() {
        return this.f10932f;
    }

    public final int hashCode() {
        int hashCode = this.f10927a.hashCode();
        int i = this.f10928b;
        int i2 = this.f10929c;
        long j = this.f10930d;
        long j2 = this.f10931e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f10932f;
    }

    public final String toString() {
        String str = this.f10927a;
        int i = this.f10928b;
        int i2 = this.f10929c;
        long j = this.f10930d;
        long j2 = this.f10931e;
        int i3 = this.f10932f;
        StringBuilder sb2 = new StringBuilder(str.length() + 185);
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i);
        sb2.append(", errorCode=");
        sb2.append(i2);
        sb2.append(", bytesDownloaded=");
        sb2.append(j);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j2);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i3);
        sb2.append("}");
        return sb2.toString();
    }
}
