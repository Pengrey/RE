package com.google.android.datatransport.cct;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p007a6.InterfaceC0044g;
import p461y5.C13111b;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes.dex */
public final class C2383a implements InterfaceC0044g {

    /* renamed from: c */
    static final String f6956c;

    /* renamed from: d */
    static final String f6957d;

    /* renamed from: e */
    private static final String f6958e;

    /* renamed from: f */
    private static final Set<C13111b> f6959f;

    /* renamed from: g */
    public static final C2383a f6960g;

    /* renamed from: a */
    private final String f6961a;

    /* renamed from: b */
    private final String f6962b;

    static {
        String m33697a = C2389e.m33697a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f6956c = m33697a;
        String m33697a2 = C2389e.m33697a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f6957d = m33697a2;
        String m33697a3 = C2389e.m33697a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6958e = m33697a3;
        f6959f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C13111b.m1584b("proto"), C13111b.m1584b("json"))));
        new C2383a(m33697a, null);
        f6960g = new C2383a(m33697a2, m33697a3);
    }

    public C2383a(String str, String str2) {
        this.f6961a = str;
        this.f6962b = str2;
    }

    /* renamed from: e */
    public static C2383a m33715e(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C2383a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p007a6.InterfaceC0043f
    /* renamed from: a */
    public String mo33719a() {
        return "cct";
    }

    @Override // p007a6.InterfaceC0044g
    /* renamed from: b */
    public Set<C13111b> mo33718b() {
        return f6959f;
    }

    @Override // p007a6.InterfaceC0043f
    /* renamed from: c */
    public byte[] mo33717c() {
        return m33716d();
    }

    /* renamed from: d */
    public byte[] m33716d() {
        String str = this.f6962b;
        if (str == null && this.f6961a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f6961a;
        objArr[2] = "\\";
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: f */
    public String m33714f() {
        return this.f6962b;
    }

    /* renamed from: g */
    public String m33713g() {
        return this.f6961a;
    }
}
