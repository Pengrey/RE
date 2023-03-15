package p248n4;

import com.facebook.internal.Utility;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: n4.a */
/* loaded from: classes.dex */
public final class AccessTokenAppIdPair implements Serializable {

    /* renamed from: w */
    private final String f20194w;

    /* renamed from: x */
    private final String f20195x;

    /* compiled from: AccessTokenAppIdPair.kt */
    /* renamed from: n4.a$a */
    /* loaded from: classes.dex */
    public static final class C7642a {
        private C7642a() {
        }

        public /* synthetic */ C7642a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AccessTokenAppIdPair.kt */
    /* renamed from: n4.a$b */
    /* loaded from: classes.dex */
    public static final class C7643b implements Serializable {

        /* renamed from: w */
        private final String f20196w;

        /* renamed from: x */
        private final String f20197x;

        /* compiled from: AccessTokenAppIdPair.kt */
        /* renamed from: n4.a$b$a */
        /* loaded from: classes.dex */
        public static final class C7644a {
            private C7644a() {
            }

            public /* synthetic */ C7644a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C7644a(null);
        }

        public C7643b(String str, String str2) {
            Intrinsics.isThisObjectNull(str2, "appId");
            this.f20196w = str;
            this.f20197x = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(this.f20196w, this.f20197x);
        }
    }

    static {
        new C7642a(null);
    }

    public AccessTokenAppIdPair(String str, String str2) {
        Intrinsics.isThisObjectNull(str2, "applicationId");
        this.f20195x = str2;
        this.f20194w = Utility.m33977G(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new C7643b(this.f20194w, this.f20195x);
    }

    /* renamed from: a */
    public final String m17864a() {
        return this.f20194w;
    }

    /* renamed from: b */
    public final String m17863b() {
        return this.f20195x;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AccessTokenAppIdPair) {
            AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
            return Utility.m33957a(accessTokenAppIdPair.f20194w, this.f20194w) && Utility.m33957a(accessTokenAppIdPair.f20195x, this.f20195x);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20194w;
        return (str != null ? str.hashCode() : 0) ^ this.f20195x.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AccessTokenAppIdPair(com.facebook.AccessToken r3) {
        /*
            r2 = this;
            java.lang.String r0 = "accessToken"
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            java.lang.String r3 = r3.m34246n()
            java.lang.String r0 = com.facebook.C2290b.m34109f()
            java.lang.String r1 = "FacebookSdk.getApplicationId()"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p248n4.AccessTokenAppIdPair.<init>(com.facebook.AccessToken):void");
    }
}
