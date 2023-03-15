package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.m */
/* loaded from: classes2.dex */
public final class C4409m {

    /* renamed from: a */
    private final String f11928a;

    /* renamed from: b */
    private final byte[] f11929b;

    /* renamed from: c */
    private C4411o[] f11930c;

    /* renamed from: d */
    private final EnumC4392a f11931d;

    /* renamed from: e */
    private Map<EnumC4410n, Object> f11932e;

    public C4409m(String str, byte[] bArr, C4411o[] c4411oArr, EnumC4392a enumC4392a) {
        this(str, bArr, c4411oArr, enumC4392a, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void m27650a(C4411o[] c4411oArr) {
        C4411o[] c4411oArr2 = this.f11930c;
        if (c4411oArr2 == null) {
            this.f11930c = c4411oArr;
        } else if (c4411oArr == null || c4411oArr.length <= 0) {
        } else {
            C4411o[] c4411oArr3 = new C4411o[c4411oArr2.length + c4411oArr.length];
            System.arraycopy(c4411oArr2, 0, c4411oArr3, 0, c4411oArr2.length);
            System.arraycopy(c4411oArr, 0, c4411oArr3, c4411oArr2.length, c4411oArr.length);
            this.f11930c = c4411oArr3;
        }
    }

    /* renamed from: b */
    public EnumC4392a m27649b() {
        return this.f11931d;
    }

    /* renamed from: c */
    public byte[] m27648c() {
        return this.f11929b;
    }

    /* renamed from: d */
    public Map<EnumC4410n, Object> m27647d() {
        return this.f11932e;
    }

    /* renamed from: e */
    public C4411o[] m27646e() {
        return this.f11930c;
    }

    /* renamed from: f */
    public String m27645f() {
        return this.f11928a;
    }

    /* renamed from: g */
    public void m27644g(Map<EnumC4410n, Object> map) {
        if (map != null) {
            Map<EnumC4410n, Object> map2 = this.f11932e;
            if (map2 == null) {
                this.f11932e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void m27643h(EnumC4410n enumC4410n, Object obj) {
        if (this.f11932e == null) {
            this.f11932e = new EnumMap(EnumC4410n.class);
        }
        this.f11932e.put(enumC4410n, obj);
    }

    public String toString() {
        return this.f11928a;
    }

    public C4409m(String str, byte[] bArr, C4411o[] c4411oArr, EnumC4392a enumC4392a, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c4411oArr, enumC4392a, j);
    }

    public C4409m(String str, byte[] bArr, int i, C4411o[] c4411oArr, EnumC4392a enumC4392a, long j) {
        this.f11928a = str;
        this.f11929b = bArr;
        this.f11930c = c4411oArr;
        this.f11931d = enumC4392a;
        this.f11932e = null;
    }
}
