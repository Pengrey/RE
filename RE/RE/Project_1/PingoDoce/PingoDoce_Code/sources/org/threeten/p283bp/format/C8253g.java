package org.threeten.p283bp.format;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: org.threeten.bp.format.g */
/* loaded from: classes2.dex */
public final class C8253g {

    /* renamed from: e */
    public static final C8253g f21457e = new C8253g('0', '+', '-', '.');

    /* renamed from: a */
    private final char f21458a;

    /* renamed from: b */
    private final char f21459b;

    /* renamed from: c */
    private final char f21460c;

    /* renamed from: d */
    private final char f21461d;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C8253g(char c, char c2, char c3, char c4) {
        this.f21458a = c;
        this.f21459b = c2;
        this.f21460c = c3;
        this.f21461d = c4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m16024a(String str) {
        char c = this.f21458a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    /* renamed from: b */
    public char m16023b() {
        return this.f21461d;
    }

    /* renamed from: c */
    public char m16022c() {
        return this.f21460c;
    }

    /* renamed from: d */
    public char m16021d() {
        return this.f21459b;
    }

    /* renamed from: e */
    public char m16020e() {
        return this.f21458a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8253g) {
            C8253g c8253g = (C8253g) obj;
            return this.f21458a == c8253g.f21458a && this.f21459b == c8253g.f21459b && this.f21460c == c8253g.f21460c && this.f21461d == c8253g.f21461d;
        }
        return false;
    }

    public int hashCode() {
        return this.f21458a + this.f21459b + this.f21460c + this.f21461d;
    }

    public String toString() {
        return "DecimalStyle[" + this.f21458a + this.f21459b + this.f21460c + this.f21461d + "]";
    }
}
