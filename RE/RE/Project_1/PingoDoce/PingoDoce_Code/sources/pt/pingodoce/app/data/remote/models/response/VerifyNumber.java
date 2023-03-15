package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: VerifyNumber.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class VerifyNumber implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8797a();
    @InterfaceC4469e(name = "status")

    /* renamed from: w */
    private final int f23287w;
    @InterfaceC4469e(name = "message")

    /* renamed from: x */
    private final String f23288x;
    @InterfaceC4469e(name = "consents")

    /* renamed from: y */
    private final Consent f23289y;

    /* compiled from: VerifyNumber.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.VerifyNumber$a */
    /* loaded from: classes2.dex */
    public static final class C8797a implements Parcelable.Creator {
        /* renamed from: a */
        public final VerifyNumber mo12527a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new VerifyNumber(parcel.readInt(), parcel.readString(), (Consent) Consent.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final VerifyNumber[] mo12526b(int i) {
            return new VerifyNumber[i];
        }
    }

    /* compiled from: VerifyNumber.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.VerifyNumber$b */
    /* loaded from: classes2.dex */
    public enum EnumC8798b {
        USER_NOT_FOUND(404),
        USER_WITH_OUTDATED_CONSENT(220),
        USER_ALREADY_REGISTERED(200),
        USER_OK(-1);
        
        public static final C8799a Companion = new C8799a(null);

        /* renamed from: id */
        private final int f23290id;

        /* compiled from: VerifyNumber.kt */
        /* renamed from: pt.pingodoce.app.data.remote.models.response.VerifyNumber$b$a */
        /* loaded from: classes2.dex */
        public static final class C8799a {
            private C8799a() {
            }

            public /* synthetic */ C8799a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final EnumC8798b m13664a(int i) {
                EnumC8798b enumC8798b = EnumC8798b.USER_ALREADY_REGISTERED;
                if (i == enumC8798b.getId()) {
                    return enumC8798b;
                }
                EnumC8798b enumC8798b2 = EnumC8798b.USER_WITH_OUTDATED_CONSENT;
                return i == enumC8798b2.getId() ? enumC8798b2 : i == enumC8798b.getId() ? enumC8798b : EnumC8798b.USER_OK;
            }
        }

        EnumC8798b(int i) {
            this.f23290id = i;
        }

        public final int getId() {
            return this.f23290id;
        }
    }

    public VerifyNumber(int i, String str, Consent consent) {
        Intrinsics.isThisObjectNull(str, "message");
        Intrinsics.isThisObjectNull(consent, "consents");
        this.f23287w = i;
        this.f23288x = str;
        this.f23289y = consent;
    }

    /* renamed from: a */
    public final Consent m13670a() {
        return this.f23289y;
    }

    /* renamed from: b */
    public final String m13669b() {
        return this.f23288x;
    }

    /* renamed from: c */
    public final EnumC8798b m13668c() {
        return EnumC8798b.Companion.m13664a(this.f23287w);
    }

    /* renamed from: d */
    public final int m13667d() {
        return this.f23287w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifyNumber) {
            VerifyNumber verifyNumber = (VerifyNumber) obj;
            return this.f23287w == verifyNumber.f23287w && Intrinsics.equals(this.f23288x, verifyNumber.f23288x) && Intrinsics.equals(this.f23289y, verifyNumber.f23289y);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f23287w) * 31) + this.f23288x.hashCode()) * 31) + this.f23289y.hashCode();
    }

    public String toString() {
        int i = this.f23287w;
        String str = this.f23288x;
        Consent consent = this.f23289y;
        return "VerifyNumber(statusId=" + i + ", message=" + str + ", consents=" + consent + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23287w);
        parcel.writeString(this.f23288x);
        this.f23289y.writeToParcel(parcel, i);
    }

    public /* synthetic */ VerifyNumber(int i, String str, Consent consent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? new Consent(null, null, null, null, null, 31, null) : consent);
    }
}
