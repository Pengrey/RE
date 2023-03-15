package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: BenefitsExpirationColors.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class BenefitsExpirationColors implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8769a();
    @InterfaceC4469e(name = "backgroundColor")

    /* renamed from: w */
    private final String f23069w;
    @InterfaceC4469e(name = "titleColor")

    /* renamed from: x */
    private final String f23070x;

    /* compiled from: BenefitsExpirationColors.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.BenefitsExpirationColors$a */
    /* loaded from: classes2.dex */
    public static final class C8769a implements Parcelable.Creator {
        /* renamed from: a */
        public final BenefitsExpirationColors mo12777a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new BenefitsExpirationColors(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BenefitsExpirationColors[] mo12776b(int i) {
            return new BenefitsExpirationColors[i];
        }
    }

    public BenefitsExpirationColors() {
        this(null, null, 3, null);
    }

    public BenefitsExpirationColors(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "backgroundColor");
        Intrinsics.isThisObjectNull(str2, "titleColor");
        this.f23069w = str;
        this.f23070x = str2;
    }

    /* renamed from: a */
    public final String m13918a() {
        return this.f23069w;
    }

    /* renamed from: b */
    public final String m13917b() {
        return this.f23070x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BenefitsExpirationColors) {
            BenefitsExpirationColors benefitsExpirationColors = (BenefitsExpirationColors) obj;
            return Intrinsics.equals(this.f23069w, benefitsExpirationColors.f23069w) && Intrinsics.equals(this.f23070x, benefitsExpirationColors.f23070x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f23069w.hashCode() * 31) + this.f23070x.hashCode();
    }

    public String toString() {
        String str = this.f23069w;
        String str2 = this.f23070x;
        return "BenefitsExpirationColors(backgroundColor=" + str + ", titleColor=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23069w);
        parcel.writeString(this.f23070x);
    }

    public /* synthetic */ BenefitsExpirationColors(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#CF5362" : str, (i & 2) != 0 ? "#FAEEEF" : str2);
    }
}
