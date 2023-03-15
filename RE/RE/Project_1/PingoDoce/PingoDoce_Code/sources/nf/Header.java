package nf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p356sf.ByteString;

/* renamed from: nf.a */
/* loaded from: classes2.dex */
public final class Header {

    /* renamed from: d */
    public static final ByteString f20308d;

    /* renamed from: e */
    public static final ByteString f20309e;

    /* renamed from: f */
    public static final ByteString f20310f;

    /* renamed from: g */
    public static final ByteString f20311g;

    /* renamed from: h */
    public static final ByteString f20312h;

    /* renamed from: i */
    public static final ByteString f20313i;

    /* renamed from: a */
    public final ByteString f20314a;

    /* renamed from: b */
    public final ByteString f20315b;

    /* renamed from: c */
    public final int f20316c;

    /* compiled from: Header.kt */
    /* renamed from: nf.a$a */
    /* loaded from: classes2.dex */
    public static final class C7704a {
        private C7704a() {
        }

        public /* synthetic */ C7704a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7704a(null);
        ByteString.C10188a c10188a = ByteString.f26546z;
        f20308d = c10188a.m8692d(":");
        f20309e = c10188a.m8692d(":status");
        f20310f = c10188a.m8692d(":method");
        f20311g = c10188a.m8692d(":path");
        f20312h = c10188a.m8692d(":scheme");
        f20313i = c10188a.m8692d(":authority");
    }

    public Header(ByteString byteString, ByteString byteString2) {
        Intrinsics.isThisObjectNull(byteString, "name");
        Intrinsics.isThisObjectNull(byteString2, "value");
        this.f20314a = byteString;
        this.f20315b = byteString2;
        this.f20316c = byteString.size() + 32 + byteString2.size();
    }

    /* renamed from: a */
    public final ByteString m17666a() {
        return this.f20314a;
    }

    /* renamed from: b */
    public final ByteString m17665b() {
        return this.f20315b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Header) {
            Header header = (Header) obj;
            return Intrinsics.equals(this.f20314a, header.f20314a) && Intrinsics.equals(this.f20315b, header.f20315b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f20314a.hashCode() * 31) + this.f20315b.hashCode();
    }

    public String toString() {
        return this.f20314a.m8722F() + ": " + this.f20315b.m8722F();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Header(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            java.lang.String r0 = "value"
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            sf.f$a r0 = p356sf.ByteString.f26546z
            sf.f r2 = r0.m8692d(r2)
            sf.f r3 = r0.m8692d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.f26546z.m8692d(str));
        Intrinsics.isThisObjectNull(byteString, "name");
        Intrinsics.isThisObjectNull(str, "value");
    }
}
