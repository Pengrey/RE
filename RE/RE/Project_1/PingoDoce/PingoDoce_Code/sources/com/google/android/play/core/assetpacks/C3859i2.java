package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.i2 */
/* loaded from: classes.dex */
final class C3859i2 {

    /* renamed from: a */
    private final int f10990a;

    /* renamed from: b */
    private final String f10991b;

    /* renamed from: c */
    private final long f10992c;

    /* renamed from: d */
    private final long f10993d;

    /* renamed from: e */
    private final int f10994e;

    C3859i2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3859i2(int i, String str, long j, long j2, int i2) {
        this();
        this.f10990a = i;
        this.f10991b = str;
        this.f10992c = j;
        this.f10993d = j2;
        this.f10994e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m28738a() {
        return this.f10990a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m28737b() {
        return this.f10991b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public long m28736c() {
        return this.f10992c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public long m28735d() {
        return this.f10993d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m28734e() {
        return this.f10994e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3859i2) {
            C3859i2 c3859i2 = (C3859i2) obj;
            if (this.f10990a == c3859i2.m28738a() && ((str = this.f10991b) != null ? str.equals(c3859i2.m28737b()) : c3859i2.m28737b() == null) && this.f10992c == c3859i2.m28736c() && this.f10993d == c3859i2.m28735d() && this.f10994e == c3859i2.m28734e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f10990a ^ 1000003) * 1000003;
        String str = this.f10991b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f10992c;
        long j2 = this.f10993d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f10994e;
    }

    public String toString() {
        int i = this.f10990a;
        String str = this.f10991b;
        long j = this.f10992c;
        long j2 = this.f10993d;
        int i2 = this.f10994e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j);
        sb2.append(", remainingBytes=");
        sb2.append(j2);
        sb2.append(", previousChunk=");
        sb2.append(i2);
        sb2.append("}");
        return sb2.toString();
    }
}
