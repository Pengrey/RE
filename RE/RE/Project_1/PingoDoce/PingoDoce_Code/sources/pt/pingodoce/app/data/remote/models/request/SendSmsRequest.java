package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: SendSmsRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SendSmsRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8750a();
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: w */
    private final String f22930w;
    @InterfaceC4469e(name = "consents")

    /* renamed from: x */
    private final Consent f22931x;

    /* compiled from: SendSmsRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.SendSmsRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8750a implements Parcelable.Creator {
        /* renamed from: a */
        public final SendSmsRequest mo12932a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new SendSmsRequest(parcel.readString(), (Consent) (parcel.readInt() == 0 ? null : Consent.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final SendSmsRequest[] mo12931b(int i) {
            return new SendSmsRequest[i];
        }
    }

    public SendSmsRequest(String str, Consent consent) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        this.f22930w = str;
        this.f22931x = consent;
    }

    /* renamed from: a */
    public final Consent m14073a() {
        return this.f22931x;
    }

    /* renamed from: b */
    public final String m14072b() {
        return this.f22930w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendSmsRequest) {
            SendSmsRequest sendSmsRequest = (SendSmsRequest) obj;
            return Intrinsics.equals(this.f22930w, sendSmsRequest.f22930w) && Intrinsics.equals(this.f22931x, sendSmsRequest.f22931x);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f22930w.hashCode() * 31;
        Consent consent = this.f22931x;
        return hashCode + (consent == null ? 0 : consent.hashCode());
    }

    public String toString() {
        String str = this.f22930w;
        Consent consent = this.f22931x;
        return "SendSmsRequest(phoneNumber=" + str + ", consent=" + consent + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22930w);
        Consent consent = this.f22931x;
        if (consent == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        consent.writeToParcel(parcel, i);
    }

    public /* synthetic */ SendSmsRequest(String str, Consent consent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : consent);
    }
}
