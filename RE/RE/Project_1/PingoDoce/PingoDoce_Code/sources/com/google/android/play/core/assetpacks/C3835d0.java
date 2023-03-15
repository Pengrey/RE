package com.google.android.play.core.assetpacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.d0 */
/* loaded from: classes.dex */
public final class C3835d0 extends AbstractC3819a {

    /* renamed from: a */
    private final int f10912a;

    /* renamed from: b */
    private final String f10913b;

    /* renamed from: c */
    private final String f10914c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3835d0(int i, String str, String str2) {
        this.f10912a = i;
        this.f10913b = str;
        this.f10914c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC3819a
    /* renamed from: b */
    public final String mo28758b() {
        return this.f10914c;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC3819a
    /* renamed from: c */
    public final int mo28757c() {
        return this.f10912a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC3819a
    /* renamed from: d */
    public final String mo28756d() {
        return this.f10913b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3819a) {
            AbstractC3819a abstractC3819a = (AbstractC3819a) obj;
            if (this.f10912a == abstractC3819a.mo28757c() && ((str = this.f10913b) != null ? str.equals(abstractC3819a.mo28756d()) : abstractC3819a.mo28756d() == null)) {
                String str2 = this.f10914c;
                String mo28758b = abstractC3819a.mo28758b();
                if (str2 != null ? str2.equals(mo28758b) : mo28758b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f10912a ^ 1000003) * 1000003;
        String str = this.f10913b;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10914c;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f10912a;
        String str = this.f10913b;
        String str2 = this.f10914c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
