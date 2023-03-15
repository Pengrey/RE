package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ElectronicInvoiceFlowData.kt */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceFlowData extends PhoneFlowData {
    public static final Parcelable.Creator CREATOR = new C8672a();

    /* renamed from: A */
    private final String f22384A;

    /* renamed from: B */
    private final boolean f22385B;

    /* renamed from: y */
    private final String f22386y;

    /* renamed from: z */
    private final String f22387z;

    /* compiled from: ElectronicInvoiceFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8672a implements Parcelable.Creator {
        /* renamed from: a */
        public final ElectronicInvoiceFlowData mo13604a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ElectronicInvoiceFlowData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final ElectronicInvoiceFlowData[] mo13603b(int i) {
            return new ElectronicInvoiceFlowData[i];
        }
    }

    public /* synthetic */ ElectronicInvoiceFlowData(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? false : z);
    }

    /* renamed from: e */
    public static /* synthetic */ ElectronicInvoiceFlowData m14757e(ElectronicInvoiceFlowData electronicInvoiceFlowData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = electronicInvoiceFlowData.m14759b();
        }
        if ((i & 2) != 0) {
            str2 = electronicInvoiceFlowData.f22387z;
        }
        if ((i & 4) != 0) {
            str3 = electronicInvoiceFlowData.f22384A;
        }
        if ((i & 8) != 0) {
            z = electronicInvoiceFlowData.f22385B;
        }
        return electronicInvoiceFlowData.m14758d(str, str2, str3, z);
    }

    /* renamed from: b */
    public String m14759b() {
        return this.f22386y;
    }

    /* renamed from: d */
    public final ElectronicInvoiceFlowData m14758d(String str, String str2, String str3, boolean z) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "email");
        Intrinsics.isThisObjectNull(str3, "cardNumber");
        return new ElectronicInvoiceFlowData(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ElectronicInvoiceFlowData) {
            ElectronicInvoiceFlowData electronicInvoiceFlowData = (ElectronicInvoiceFlowData) obj;
            return Intrinsics.equals(m14759b(), electronicInvoiceFlowData.m14759b()) && Intrinsics.equals(this.f22387z, electronicInvoiceFlowData.f22387z) && Intrinsics.equals(this.f22384A, electronicInvoiceFlowData.f22384A) && this.f22385B == electronicInvoiceFlowData.f22385B;
        }
        return false;
    }

    /* renamed from: f */
    public final String m14756f() {
        return this.f22384A;
    }

    /* renamed from: h */
    public final String m14755h() {
        return this.f22387z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((m14759b().hashCode() * 31) + this.f22387z.hashCode()) * 31) + this.f22384A.hashCode()) * 31;
        boolean z = this.f22385B;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final boolean m14754i() {
        return this.f22385B;
    }

    public String toString() {
        String m14759b = m14759b();
        String str = this.f22387z;
        String str2 = this.f22384A;
        boolean z = this.f22385B;
        return "ElectronicInvoiceFlowData(phoneNumber=" + m14759b + ", email=" + str + ", cardNumber=" + str2 + ", isRegistered=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22386y);
        parcel.writeString(this.f22387z);
        parcel.writeString(this.f22384A);
        parcel.writeInt(this.f22385B ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectronicInvoiceFlowData(String str, String str2, String str3, boolean z) {
        super(str, null);
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "email");
        Intrinsics.isThisObjectNull(str3, "cardNumber");
        this.f22386y = str;
        this.f22387z = str2;
        this.f22384A = str3;
        this.f22385B = z;
    }
}
