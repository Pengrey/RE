package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: CardStatusPayload.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CardStatusPayload implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8772a();
    @InterfaceC4469e(name = "delegateInvite")

    /* renamed from: w */
    private final boolean f23093w;
    @InterfaceC4469e(name = "maskedPhoneNumber")

    /* renamed from: x */
    private final String f23094x;
    @InterfaceC4469e(name = "isOwner")

    /* renamed from: y */
    private final boolean f23095y;

    /* compiled from: CardStatusPayload.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.CardStatusPayload$a */
    /* loaded from: classes2.dex */
    public static final class C8772a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardStatusPayload mo13422a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new CardStatusPayload(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final CardStatusPayload[] mo13421b(int i) {
            return new CardStatusPayload[i];
        }
    }

    public CardStatusPayload() {
        this(false, null, false, 7, null);
    }

    public CardStatusPayload(boolean z, String str, boolean z2) {
        Intrinsics.isThisObjectNull(str, "maskedPhoneNumber");
        this.f23093w = z;
        this.f23094x = str;
        this.f23095y = z2;
    }

    /* renamed from: a */
    public final boolean m13892a() {
        return this.f23093w;
    }

    /* renamed from: b */
    public final String m13891b() {
        return this.f23094x;
    }

    /* renamed from: c */
    public final boolean m13890c() {
        return this.f23095y;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23093w ? 1 : 0);
        parcel.writeString(this.f23094x);
        parcel.writeInt(this.f23095y ? 1 : 0);
    }

    public /* synthetic */ CardStatusPayload(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i & 4) != 0 ? false : z2);
    }
}
