package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ElectronicInvoice.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ElectronicInvoice implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8778a();
    @InterfaceC4469e(name = "email")

    /* renamed from: w */
    private final String f23131w;
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: x */
    private final String f23132x;
    @InterfaceC4469e(name = "cardNumber")

    /* renamed from: y */
    private final String f23133y;
    @InterfaceC4469e(name = "registered")

    /* renamed from: z */
    private final boolean f23134z;

    /* compiled from: ElectronicInvoice.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.ElectronicInvoice$a */
    /* loaded from: classes2.dex */
    public static final class C8778a implements Parcelable.Creator {
        /* renamed from: a */
        public final ElectronicInvoice mo12707a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ElectronicInvoice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final ElectronicInvoice[] mo12706b(int i) {
            return new ElectronicInvoice[i];
        }
    }

    public ElectronicInvoice() {
        this(null, null, null, false, 15, null);
    }

    public ElectronicInvoice(String str, String str2, String str3, boolean z) {
        Intrinsics.isThisObjectNull(str, "email");
        Intrinsics.isThisObjectNull(str2, "phoneNumber");
        Intrinsics.isThisObjectNull(str3, "cardNumber");
        this.f23131w = str;
        this.f23132x = str2;
        this.f23133y = str3;
        this.f23134z = z;
    }

    /* renamed from: a */
    public final String m13850a() {
        return this.f23133y;
    }

    /* renamed from: b */
    public final String m13849b() {
        return this.f23131w;
    }

    /* renamed from: c */
    public final String m13848c() {
        return this.f23132x;
    }

    /* renamed from: d */
    public final boolean m13847d() {
        return this.f23134z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ElectronicInvoice) {
            ElectronicInvoice electronicInvoice = (ElectronicInvoice) obj;
            return Intrinsics.equals(this.f23131w, electronicInvoice.f23131w) && Intrinsics.equals(this.f23132x, electronicInvoice.f23132x) && Intrinsics.equals(this.f23133y, electronicInvoice.f23133y) && this.f23134z == electronicInvoice.f23134z;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f23131w.hashCode() * 31) + this.f23132x.hashCode()) * 31) + this.f23133y.hashCode()) * 31;
        boolean z = this.f23134z;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f23131w;
        String str2 = this.f23132x;
        String str3 = this.f23133y;
        boolean z = this.f23134z;
        return "ElectronicInvoice(email=" + str + ", phoneNumber=" + str2 + ", cardNumber=" + str3 + ", registered=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23131w);
        parcel.writeString(this.f23132x);
        parcel.writeString(this.f23133y);
        parcel.writeInt(this.f23134z ? 1 : 0);
    }

    public /* synthetic */ ElectronicInvoice(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? false : z);
    }
}
