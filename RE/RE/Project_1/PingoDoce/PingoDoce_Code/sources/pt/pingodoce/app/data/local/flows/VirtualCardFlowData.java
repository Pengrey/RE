package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: VirtualCardFlowData.kt */
/* loaded from: classes2.dex */
public final class VirtualCardFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8681a();

    /* renamed from: A */
    private final boolean f22441A;

    /* renamed from: B */
    private final boolean f22442B;

    /* renamed from: C */
    private final boolean f22443C;

    /* renamed from: D */
    private final Consent f22444D;

    /* renamed from: w */
    private final String f22445w;

    /* renamed from: x */
    private final String f22446x;

    /* renamed from: y */
    private final String f22447y;

    /* renamed from: z */
    private final String f22448z;

    /* compiled from: VirtualCardFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.VirtualCardFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8681a implements Parcelable.Creator {
        /* renamed from: a */
        public final VirtualCardFlowData mo13526a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new VirtualCardFlowData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (Consent) (parcel.readInt() == 0 ? null : Consent.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final VirtualCardFlowData[] mo13525b(int i) {
            return new VirtualCardFlowData[i];
        }
    }

    public VirtualCardFlowData() {
        this(null, null, null, null, false, false, false, null, 255, null);
    }

    public VirtualCardFlowData(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, Consent consent) {
        Intrinsics.isThisObjectNull(str, "firstName");
        Intrinsics.isThisObjectNull(str2, "lastName");
        Intrinsics.isThisObjectNull(str3, "phoneNumber");
        Intrinsics.isThisObjectNull(str4, "email");
        this.f22445w = str;
        this.f22446x = str2;
        this.f22447y = str3;
        this.f22448z = str4;
        this.f22441A = z;
        this.f22442B = z2;
        this.f22443C = z3;
        this.f22444D = consent;
    }

    /* renamed from: b */
    public static /* synthetic */ VirtualCardFlowData m14677b(VirtualCardFlowData virtualCardFlowData, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, Consent consent, int i, Object obj) {
        return virtualCardFlowData.m14678a((i & 1) != 0 ? virtualCardFlowData.f22445w : str, (i & 2) != 0 ? virtualCardFlowData.f22446x : str2, (i & 4) != 0 ? virtualCardFlowData.f22447y : str3, (i & 8) != 0 ? virtualCardFlowData.f22448z : str4, (i & 16) != 0 ? virtualCardFlowData.f22441A : z, (i & 32) != 0 ? virtualCardFlowData.f22442B : z2, (i & 64) != 0 ? virtualCardFlowData.f22443C : z3, (i & 128) != 0 ? virtualCardFlowData.f22444D : consent);
    }

    /* renamed from: a */
    public final VirtualCardFlowData m14678a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, Consent consent) {
        Intrinsics.isThisObjectNull(str, "firstName");
        Intrinsics.isThisObjectNull(str2, "lastName");
        Intrinsics.isThisObjectNull(str3, "phoneNumber");
        Intrinsics.isThisObjectNull(str4, "email");
        return new VirtualCardFlowData(str, str2, str3, str4, z, z2, z3, consent);
    }

    /* renamed from: c */
    public final boolean m14676c() {
        return this.f22443C;
    }

    /* renamed from: d */
    public final boolean m14675d() {
        return this.f22441A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14674e() {
        return this.f22448z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualCardFlowData) {
            VirtualCardFlowData virtualCardFlowData = (VirtualCardFlowData) obj;
            return Intrinsics.equals(this.f22445w, virtualCardFlowData.f22445w) && Intrinsics.equals(this.f22446x, virtualCardFlowData.f22446x) && Intrinsics.equals(this.f22447y, virtualCardFlowData.f22447y) && Intrinsics.equals(this.f22448z, virtualCardFlowData.f22448z) && this.f22441A == virtualCardFlowData.f22441A && this.f22442B == virtualCardFlowData.f22442B && this.f22443C == virtualCardFlowData.f22443C && Intrinsics.equals(this.f22444D, virtualCardFlowData.f22444D);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14673f() {
        return this.f22445w;
    }

    /* renamed from: h */
    public final boolean m14672h() {
        return this.f22442B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f22445w.hashCode() * 31) + this.f22446x.hashCode()) * 31) + this.f22447y.hashCode()) * 31) + this.f22448z.hashCode()) * 31;
        boolean z = this.f22441A;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f22442B;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f22443C;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        Consent consent = this.f22444D;
        return i5 + (consent == null ? 0 : consent.hashCode());
    }

    /* renamed from: i */
    public final String m14671i() {
        return this.f22446x;
    }

    /* renamed from: j */
    public final String m14670j() {
        return this.f22447y;
    }

    public String toString() {
        String str = this.f22445w;
        String str2 = this.f22446x;
        String str3 = this.f22447y;
        String str4 = this.f22448z;
        boolean z = this.f22441A;
        boolean z2 = this.f22442B;
        boolean z3 = this.f22443C;
        Consent consent = this.f22444D;
        return "VirtualCardFlowData(firstName=" + str + ", lastName=" + str2 + ", phoneNumber=" + str3 + ", email=" + str4 + ", communications=" + z + ", geoLocation=" + z2 + ", analytics=" + z3 + ", consents=" + consent + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22445w);
        parcel.writeString(this.f22446x);
        parcel.writeString(this.f22447y);
        parcel.writeString(this.f22448z);
        parcel.writeInt(this.f22441A ? 1 : 0);
        parcel.writeInt(this.f22442B ? 1 : 0);
        parcel.writeInt(this.f22443C ? 1 : 0);
        Consent consent = this.f22444D;
        if (consent == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        consent.writeToParcel(parcel, i);
    }

    public /* synthetic */ VirtualCardFlowData(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, Consent consent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) == 0 ? str4 : BuildConfig.VERSION_NAME, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) == 0 ? z3 : false, (i & 128) != 0 ? null : consent);
    }
}
