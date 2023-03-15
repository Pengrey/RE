package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: LoginFlowData.kt */
/* loaded from: classes2.dex */
public final class LoginFlowData extends PhoneFlowData {
    public static final Parcelable.Creator CREATOR = new C8673a();

    /* renamed from: A */
    private final Consent f22388A;

    /* renamed from: B */
    private final boolean f22389B;

    /* renamed from: C */
    private final boolean f22390C;

    /* renamed from: y */
    private final String f22391y;

    /* renamed from: z */
    private final String f22392z;

    /* compiled from: LoginFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.LoginFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8673a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoginFlowData mo13597a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LoginFlowData(parcel.readString(), parcel.readString(), (Consent) (parcel.readInt() == 0 ? null : Consent.CREATOR.createFromParcel(parcel)), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LoginFlowData[] mo13596b(int i) {
            return new LoginFlowData[i];
        }
    }

    public LoginFlowData() {
        this(null, null, null, false, false, 31, null);
    }

    public /* synthetic */ LoginFlowData(String str, String str2, Consent consent, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) == 0 ? str2 : BuildConfig.VERSION_NAME, (i & 4) != 0 ? null : consent, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* renamed from: e */
    public static /* synthetic */ LoginFlowData m14748e(LoginFlowData loginFlowData, String str, String str2, Consent consent, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginFlowData.f22391y;
        }
        if ((i & 2) != 0) {
            str2 = loginFlowData.m14750b();
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            consent = loginFlowData.m14751a();
        }
        Consent consent2 = consent;
        if ((i & 8) != 0) {
            z = loginFlowData.f22389B;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = loginFlowData.f22390C;
        }
        return loginFlowData.m14749d(str, str3, consent2, z3, z2);
    }

    /* renamed from: a */
    public Consent m14751a() {
        return this.f22388A;
    }

    /* renamed from: b */
    public String m14750b() {
        return this.f22392z;
    }

    /* renamed from: d */
    public final LoginFlowData m14749d(String str, String str2, Consent consent, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(str, "code");
        Intrinsics.isThisObjectNull(str2, "phoneNumber");
        return new LoginFlowData(str, str2, consent, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginFlowData) {
            LoginFlowData loginFlowData = (LoginFlowData) obj;
            return Intrinsics.equals(this.f22391y, loginFlowData.f22391y) && Intrinsics.equals(m14750b(), loginFlowData.m14750b()) && Intrinsics.equals(m14751a(), loginFlowData.m14751a()) && this.f22389B == loginFlowData.f22389B && this.f22390C == loginFlowData.f22390C;
        }
        return false;
    }

    /* renamed from: f */
    public final String m14747f() {
        return this.f22391y;
    }

    /* renamed from: h */
    public final boolean m14746h() {
        return this.f22390C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f22391y.hashCode() * 31) + m14750b().hashCode()) * 31) + (m14751a() == null ? 0 : m14751a().hashCode())) * 31;
        boolean z = this.f22389B;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f22390C;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m14745i() {
        return this.f22389B;
    }

    public String toString() {
        String str = this.f22391y;
        String m14750b = m14750b();
        Consent m14751a = m14751a();
        boolean z = this.f22389B;
        boolean z2 = this.f22390C;
        return "LoginFlowData(code=" + str + ", phoneNumber=" + m14750b + ", consents=" + m14751a + ", isUpgradeFromV2=" + z + ", isNewUser=" + z2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22391y);
        parcel.writeString(this.f22392z);
        Consent consent = this.f22388A;
        if (consent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consent.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f22389B ? 1 : 0);
        parcel.writeInt(this.f22390C ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFlowData(String str, String str2, Consent consent, boolean z, boolean z2) {
        super(str2, consent);
        Intrinsics.isThisObjectNull(str, "code");
        Intrinsics.isThisObjectNull(str2, "phoneNumber");
        this.f22391y = str;
        this.f22392z = str2;
        this.f22388A = consent;
        this.f22389B = z;
        this.f22390C = z2;
    }
}
