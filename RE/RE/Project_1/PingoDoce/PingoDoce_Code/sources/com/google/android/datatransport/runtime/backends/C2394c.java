package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import java.util.Objects;
import p216l6.InterfaceC6984a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.backends.c */
/* loaded from: classes.dex */
public final class C2394c extends AbstractC2399f {

    /* renamed from: a */
    private final Context f6984a;

    /* renamed from: b */
    private final InterfaceC6984a f6985b;

    /* renamed from: c */
    private final InterfaceC6984a f6986c;

    /* renamed from: d */
    private final String f6987d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2394c(Context context, InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f6984a = context;
        Objects.requireNonNull(interfaceC6984a, "Null wallClock");
        this.f6985b = interfaceC6984a;
        Objects.requireNonNull(interfaceC6984a2, "Null monotonicClock");
        this.f6986c = interfaceC6984a2;
        Objects.requireNonNull(str, "Null backendName");
        this.f6987d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2399f
    /* renamed from: b */
    public Context mo33683b() {
        return this.f6984a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2399f
    /* renamed from: c */
    public String mo33682c() {
        return this.f6987d;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2399f
    /* renamed from: d */
    public InterfaceC6984a mo33681d() {
        return this.f6986c;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2399f
    /* renamed from: e */
    public InterfaceC6984a mo33680e() {
        return this.f6985b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2399f) {
            AbstractC2399f abstractC2399f = (AbstractC2399f) obj;
            return this.f6984a.equals(abstractC2399f.mo33683b()) && this.f6985b.equals(abstractC2399f.mo33680e()) && this.f6986c.equals(abstractC2399f.mo33681d()) && this.f6987d.equals(abstractC2399f.mo33682c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f6984a.hashCode() ^ 1000003) * 1000003) ^ this.f6985b.hashCode()) * 1000003) ^ this.f6986c.hashCode()) * 1000003) ^ this.f6987d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f6984a + ", wallClock=" + this.f6985b + ", monotonicClock=" + this.f6986c + ", backendName=" + this.f6987d + "}";
    }
}
