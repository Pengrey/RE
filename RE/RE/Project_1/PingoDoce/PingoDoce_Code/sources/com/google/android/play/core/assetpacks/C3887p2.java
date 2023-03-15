package com.google.android.play.core.assetpacks;

import java.util.Arrays;
import p070e.C4906j;

/* renamed from: com.google.android.play.core.assetpacks.p2 */
/* loaded from: classes.dex */
final class C3887p2 {

    /* renamed from: a */
    private final String f11095a;

    /* renamed from: b */
    private final long f11096b;

    /* renamed from: c */
    private final int f11097c;

    /* renamed from: d */
    private final boolean f11098d;

    /* renamed from: e */
    private final boolean f11099e;

    /* renamed from: f */
    private final byte[] f11100f;

    C3887p2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3887p2(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f11095a = str;
        this.f11096b = j;
        this.f11097c = i;
        this.f11098d = z;
        this.f11099e = z2;
        this.f11100f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3887p2 m28666a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C3887p2(str, j, i, z, z2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m28665b() {
        if (m28663d() == null) {
            return false;
        }
        return m28663d().endsWith("/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m28664c() {
        return m28661f() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m28663d() {
        return this.f11095a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public long m28662e() {
        return this.f11096b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3887p2) {
            C3887p2 c3887p2 = (C3887p2) obj;
            String str = this.f11095a;
            if (str != null ? str.equals(c3887p2.m28663d()) : c3887p2.m28663d() == null) {
                if (this.f11096b == c3887p2.m28662e() && this.f11097c == c3887p2.m28661f() && this.f11098d == c3887p2.m28660g() && this.f11099e == c3887p2.m28659h() && Arrays.equals(this.f11100f, c3887p2.f11100f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m28661f() {
        return this.f11097c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m28660g() {
        return this.f11098d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m28659h() {
        return this.f11099e;
    }

    public int hashCode() {
        String str = this.f11095a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f11096b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f11097c) * 1000003) ^ (true != this.f11098d ? 1237 : 1231)) * 1000003) ^ (true == this.f11099e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f11100f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public byte[] m28658i() {
        return this.f11100f;
    }

    public String toString() {
        String str = this.f11095a;
        long j = this.f11096b;
        int i = this.f11097c;
        boolean z = this.f11098d;
        boolean z2 = this.f11099e;
        String arrays = Arrays.toString(this.f11100f);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + C4906j.f13420I0 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j);
        sb2.append(", compressionMethod=");
        sb2.append(i);
        sb2.append(", isPartial=");
        sb2.append(z);
        sb2.append(", isEndOfArchive=");
        sb2.append(z2);
        sb2.append(", headerBytes=");
        sb2.append(arrays);
        sb2.append("}");
        return sb2.toString();
    }
}
