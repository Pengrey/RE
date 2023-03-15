package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.request.AppNotifications;
import pt.pingodoce.app.data.remote.models.response.Consent;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* compiled from: OnboardingFlowData.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class OnboardingFlowData extends PhoneFlowData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8675a();

    /* renamed from: A */
    private String f22397A;

    /* renamed from: B */
    private String f22398B;

    /* renamed from: C */
    private String f22399C;

    /* renamed from: D */
    private String f22400D;

    /* renamed from: E */
    private String f22401E;

    /* renamed from: F */
    private String f22402F;

    /* renamed from: G */
    private boolean f22403G;

    /* renamed from: H */
    private boolean f22404H;

    /* renamed from: I */
    private boolean f22405I;

    /* renamed from: J */
    private final EnumC8682a f22406J;

    /* renamed from: K */
    private final Consent f22407K;

    /* renamed from: L */
    private final AppNotifications f22408L;

    /* renamed from: M */
    private LoyaltyCardProvisory f22409M;

    /* renamed from: N */
    private List f22410N;

    /* renamed from: O */
    private final boolean f22411O;

    /* renamed from: P */
    private LoyaltyCardResumeViewModel f22412P;

    /* renamed from: Q */
    private LoyaltyCard.PoupaMaisStatus f22413Q;

    /* renamed from: y */
    private final String f22414y;

    /* renamed from: z */
    private String f22415z;

    /* compiled from: OnboardingFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.OnboardingFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8675a implements Parcelable.Creator {
        /* renamed from: a */
        public final OnboardingFlowData mo13561a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            EnumC8682a valueOf = EnumC8682a.valueOf(parcel.readString());
            Consent consent = (Consent) (parcel.readInt() == 0 ? null : Consent.CREATOR.createFromParcel(parcel));
            AppNotifications appNotifications = (AppNotifications) (parcel.readInt() == 0 ? null : AppNotifications.CREATOR.createFromParcel(parcel));
            LoyaltyCardProvisory loyaltyCardProvisory = (LoyaltyCardProvisory) LoyaltyCardProvisory.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                arrayList.add(LoyaltyCardProvisory.CREATOR.createFromParcel(parcel));
                i++;
                readInt = readInt;
            }
            return new OnboardingFlowData(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, z, z2, z3, valueOf, consent, appNotifications, loyaltyCardProvisory, arrayList, parcel.readInt() != 0, (LoyaltyCardResumeViewModel) (parcel.readInt() != 0 ? LoyaltyCardResumeViewModel.CREATOR.createFromParcel(parcel) : null), (LoyaltyCard.PoupaMaisStatus) LoyaltyCard.PoupaMaisStatus.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final OnboardingFlowData[] mo13560b(int i) {
            return new OnboardingFlowData[i];
        }
    }

    public OnboardingFlowData() {
        this(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, null, null, 524287, null);
    }

    public /* synthetic */ OnboardingFlowData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, EnumC8682a enumC8682a, Consent consent, AppNotifications appNotifications, LoyaltyCardProvisory loyaltyCardProvisory, List list, boolean z4, LoyaltyCardResumeViewModel loyaltyCardResumeViewModel, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i & 128) == 0 ? str8 : BuildConfig.VERSION_NAME, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? EnumC8682a.REGISTER : enumC8682a, (i & 4096) != 0 ? null : consent, (i & 8192) != 0 ? null : appNotifications, (i & 16384) != 0 ? new LoyaltyCardProvisory(null, null, null, 7, null) : loyaltyCardProvisory, (i & 32768) != 0 ? C13780s.m197g() : list, (i & 65536) != 0 ? false : z4, (i & 131072) != 0 ? null : loyaltyCardResumeViewModel, (i & 262144) != 0 ? LoyaltyCard.PoupaMaisStatus.UndefinedStatus : poupaMaisStatus);
    }

    /* renamed from: f */
    public static /* synthetic */ OnboardingFlowData m14720f(OnboardingFlowData onboardingFlowData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, EnumC8682a enumC8682a, Consent consent, AppNotifications appNotifications, LoyaltyCardProvisory loyaltyCardProvisory, List list, boolean z4, LoyaltyCardResumeViewModel loyaltyCardResumeViewModel, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, int i, Object obj) {
        return onboardingFlowData.m14721e((i & 1) != 0 ? onboardingFlowData.m14723b() : str, (i & 2) != 0 ? onboardingFlowData.f22415z : str2, (i & 4) != 0 ? onboardingFlowData.f22397A : str3, (i & 8) != 0 ? onboardingFlowData.f22398B : str4, (i & 16) != 0 ? onboardingFlowData.f22399C : str5, (i & 32) != 0 ? onboardingFlowData.f22400D : str6, (i & 64) != 0 ? onboardingFlowData.f22401E : str7, (i & 128) != 0 ? onboardingFlowData.f22402F : str8, (i & 256) != 0 ? onboardingFlowData.f22403G : z, (i & 512) != 0 ? onboardingFlowData.f22404H : z2, (i & 1024) != 0 ? onboardingFlowData.f22405I : z3, (i & 2048) != 0 ? onboardingFlowData.f22406J : enumC8682a, (i & 4096) != 0 ? onboardingFlowData.m14724a() : consent, (i & 8192) != 0 ? onboardingFlowData.f22408L : appNotifications, (i & 16384) != 0 ? onboardingFlowData.f22409M : loyaltyCardProvisory, (i & 32768) != 0 ? onboardingFlowData.f22410N : list, (i & 65536) != 0 ? onboardingFlowData.f22411O : z4, (i & 131072) != 0 ? onboardingFlowData.f22412P : loyaltyCardResumeViewModel, (i & 262144) != 0 ? onboardingFlowData.f22413Q : poupaMaisStatus);
    }

    /* renamed from: A */
    public final LoyaltyCardProvisory m14737A() {
        return this.f22409M;
    }

    /* renamed from: D */
    public final String m14736D() {
        return this.f22400D;
    }

    /* renamed from: E */
    public final boolean m14735E() {
        return this.f22405I;
    }

    /* renamed from: F */
    public final boolean m14734F() {
        return this.f22411O;
    }

    /* renamed from: G */
    public final void m14733G(LoyaltyCardResumeViewModel loyaltyCardResumeViewModel) {
        this.f22412P = loyaltyCardResumeViewModel;
    }

    /* renamed from: H */
    public final void m14732H(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22402F = str;
    }

    /* renamed from: I */
    public final void m14731I(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22398B = str;
    }

    /* renamed from: J */
    public final void m14730J(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22399C = str;
    }

    /* renamed from: K */
    public final void m14729K(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22397A = str;
    }

    /* renamed from: L */
    public final void m14728L(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22401E = str;
    }

    /* renamed from: M */
    public final void m14727M(boolean z) {
        this.f22405I = z;
    }

    /* renamed from: N */
    public final void m14726N(LoyaltyCard.PoupaMaisStatus poupaMaisStatus) {
        Intrinsics.isThisObjectNull(poupaMaisStatus, "<set-?>");
        this.f22413Q = poupaMaisStatus;
    }

    /* renamed from: O */
    public final void m14725O(LoyaltyCardProvisory loyaltyCardProvisory) {
        Intrinsics.isThisObjectNull(loyaltyCardProvisory, "<set-?>");
        this.f22409M = loyaltyCardProvisory;
    }

    /* renamed from: a */
    public Consent m14724a() {
        return this.f22407K;
    }

    /* renamed from: b */
    public String m14723b() {
        return this.f22414y;
    }

    /* renamed from: d */
    public final String m14722d() {
        String str = this.f22398B;
        String str2 = this.f22399C;
        return str + " " + str2;
    }

    /* renamed from: e */
    public final OnboardingFlowData m14721e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, EnumC8682a enumC8682a, Consent consent, AppNotifications appNotifications, LoyaltyCardProvisory loyaltyCardProvisory, List list, boolean z4, LoyaltyCardResumeViewModel loyaltyCardResumeViewModel, LoyaltyCard.PoupaMaisStatus poupaMaisStatus) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "password");
        Intrinsics.isThisObjectNull(str3, "maskedPhoneNumber");
        Intrinsics.isThisObjectNull(str4, "firstName");
        Intrinsics.isThisObjectNull(str5, "lastName");
        Intrinsics.isThisObjectNull(str6, "smsCode");
        Intrinsics.isThisObjectNull(str7, "nif");
        Intrinsics.isThisObjectNull(str8, "email");
        Intrinsics.isThisObjectNull(enumC8682a, "onboardingType");
        Intrinsics.isThisObjectNull(loyaltyCardProvisory, "selectedCard");
        Intrinsics.isThisObjectNull(list, "cards");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "poupaMaisStatus");
        return new OnboardingFlowData(str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, enumC8682a, consent, appNotifications, loyaltyCardProvisory, list, z4, loyaltyCardResumeViewModel, poupaMaisStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingFlowData) {
            OnboardingFlowData onboardingFlowData = (OnboardingFlowData) obj;
            return Intrinsics.equals(m14723b(), onboardingFlowData.m14723b()) && Intrinsics.equals(this.f22415z, onboardingFlowData.f22415z) && Intrinsics.equals(this.f22397A, onboardingFlowData.f22397A) && Intrinsics.equals(this.f22398B, onboardingFlowData.f22398B) && Intrinsics.equals(this.f22399C, onboardingFlowData.f22399C) && Intrinsics.equals(this.f22400D, onboardingFlowData.f22400D) && Intrinsics.equals(this.f22401E, onboardingFlowData.f22401E) && Intrinsics.equals(this.f22402F, onboardingFlowData.f22402F) && this.f22403G == onboardingFlowData.f22403G && this.f22404H == onboardingFlowData.f22404H && this.f22405I == onboardingFlowData.f22405I && this.f22406J == onboardingFlowData.f22406J && Intrinsics.equals(m14724a(), onboardingFlowData.m14724a()) && Intrinsics.equals(this.f22408L, onboardingFlowData.f22408L) && Intrinsics.equals(this.f22409M, onboardingFlowData.f22409M) && Intrinsics.equals(this.f22410N, onboardingFlowData.f22410N) && this.f22411O == onboardingFlowData.f22411O && Intrinsics.equals(this.f22412P, onboardingFlowData.f22412P) && this.f22413Q == onboardingFlowData.f22413Q;
        }
        return false;
    }

    /* renamed from: h */
    public final LoyaltyCardResumeViewModel m14719h() {
        return this.f22412P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((m14723b().hashCode() * 31) + this.f22415z.hashCode()) * 31) + this.f22397A.hashCode()) * 31) + this.f22398B.hashCode()) * 31) + this.f22399C.hashCode()) * 31) + this.f22400D.hashCode()) * 31) + this.f22401E.hashCode()) * 31) + this.f22402F.hashCode()) * 31;
        boolean z = this.f22403G;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f22404H;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f22405I;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode2 = (((((i4 + i5) * 31) + this.f22406J.hashCode()) * 31) + (m14724a() == null ? 0 : m14724a().hashCode())) * 31;
        AppNotifications appNotifications = this.f22408L;
        int hashCode3 = (((((hashCode2 + (appNotifications == null ? 0 : appNotifications.hashCode())) * 31) + this.f22409M.hashCode()) * 31) + this.f22410N.hashCode()) * 31;
        boolean z4 = this.f22411O;
        int i6 = (hashCode3 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel = this.f22412P;
        return ((i6 + (loyaltyCardResumeViewModel != null ? loyaltyCardResumeViewModel.hashCode() : 0)) * 31) + this.f22413Q.hashCode();
    }

    /* renamed from: i */
    public final List m14718i() {
        return this.f22410N;
    }

    /* renamed from: j */
    public final boolean m14717j() {
        return this.f22404H;
    }

    /* renamed from: k */
    public final String m14716k() {
        return this.f22402F;
    }

    /* renamed from: m */
    public final String m14715m() {
        return this.f22398B;
    }

    /* renamed from: n */
    public final boolean m14714n() {
        return this.f22403G;
    }

    /* renamed from: r */
    public final String m14713r() {
        return this.f22399C;
    }

    /* renamed from: s */
    public final String m14712s() {
        return this.f22397A;
    }

    /* renamed from: t */
    public final String m14711t() {
        return this.f22401E;
    }

    public String toString() {
        String m14723b = m14723b();
        String str = this.f22415z;
        String str2 = this.f22397A;
        String str3 = this.f22398B;
        String str4 = this.f22399C;
        String str5 = this.f22400D;
        String str6 = this.f22401E;
        String str7 = this.f22402F;
        boolean z = this.f22403G;
        boolean z2 = this.f22404H;
        boolean z3 = this.f22405I;
        EnumC8682a enumC8682a = this.f22406J;
        Consent m14724a = m14724a();
        AppNotifications appNotifications = this.f22408L;
        LoyaltyCardProvisory loyaltyCardProvisory = this.f22409M;
        List list = this.f22410N;
        boolean z4 = this.f22411O;
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel = this.f22412P;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = this.f22413Q;
        return "OnboardingFlowData(phoneNumber=" + m14723b + ", password=" + str + ", maskedPhoneNumber=" + str2 + ", firstName=" + str3 + ", lastName=" + str4 + ", smsCode=" + str5 + ", nif=" + str6 + ", email=" + str7 + ", hasGuests=" + z + ", delegateInvite=" + z2 + ", isOwner=" + z3 + ", onboardingType=" + enumC8682a + ", consents=" + m14724a + ", preferences=" + appNotifications + ", selectedCard=" + loyaltyCardProvisory + ", cards=" + list + ", isUpgradeFromV2=" + z4 + ", cardResumeRow=" + loyaltyCardResumeViewModel + ", poupaMaisStatus=" + poupaMaisStatus + ")";
    }

    /* renamed from: v */
    public final EnumC8682a m14710v() {
        return this.f22406J;
    }

    /* renamed from: w */
    public final String m14709w() {
        return this.f22415z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22414y);
        parcel.writeString(this.f22415z);
        parcel.writeString(this.f22397A);
        parcel.writeString(this.f22398B);
        parcel.writeString(this.f22399C);
        parcel.writeString(this.f22400D);
        parcel.writeString(this.f22401E);
        parcel.writeString(this.f22402F);
        parcel.writeInt(this.f22403G ? 1 : 0);
        parcel.writeInt(this.f22404H ? 1 : 0);
        parcel.writeInt(this.f22405I ? 1 : 0);
        parcel.writeString(this.f22406J.name());
        Consent consent = this.f22407K;
        if (consent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consent.writeToParcel(parcel, i);
        }
        AppNotifications appNotifications = this.f22408L;
        if (appNotifications == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appNotifications.writeToParcel(parcel, i);
        }
        this.f22409M.writeToParcel(parcel, i);
        List<LoyaltyCardProvisory> list = this.f22410N;
        parcel.writeInt(list.size());
        for (LoyaltyCardProvisory loyaltyCardProvisory : list) {
            loyaltyCardProvisory.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f22411O ? 1 : 0);
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel = this.f22412P;
        if (loyaltyCardResumeViewModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loyaltyCardResumeViewModel.writeToParcel(parcel, i);
        }
        this.f22413Q.writeToParcel(parcel, i);
    }

    /* renamed from: y */
    public final LoyaltyCard.PoupaMaisStatus m14708y() {
        return this.f22413Q;
    }

    /* renamed from: z */
    public final AppNotifications m14707z() {
        return this.f22408L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFlowData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, EnumC8682a enumC8682a, Consent consent, AppNotifications appNotifications, LoyaltyCardProvisory loyaltyCardProvisory, List list, boolean z4, LoyaltyCardResumeViewModel loyaltyCardResumeViewModel, LoyaltyCard.PoupaMaisStatus poupaMaisStatus) {
        super(str, consent);
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "password");
        Intrinsics.isThisObjectNull(str3, "maskedPhoneNumber");
        Intrinsics.isThisObjectNull(str4, "firstName");
        Intrinsics.isThisObjectNull(str5, "lastName");
        Intrinsics.isThisObjectNull(str6, "smsCode");
        Intrinsics.isThisObjectNull(str7, "nif");
        Intrinsics.isThisObjectNull(str8, "email");
        Intrinsics.isThisObjectNull(enumC8682a, "onboardingType");
        Intrinsics.isThisObjectNull(loyaltyCardProvisory, "selectedCard");
        Intrinsics.isThisObjectNull(list, "cards");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "poupaMaisStatus");
        this.f22414y = str;
        this.f22415z = str2;
        this.f22397A = str3;
        this.f22398B = str4;
        this.f22399C = str5;
        this.f22400D = str6;
        this.f22401E = str7;
        this.f22402F = str8;
        this.f22403G = z;
        this.f22404H = z2;
        this.f22405I = z3;
        this.f22406J = enumC8682a;
        this.f22407K = consent;
        this.f22408L = appNotifications;
        this.f22409M = loyaltyCardProvisory;
        this.f22410N = list;
        this.f22411O = z4;
        this.f22412P = loyaltyCardResumeViewModel;
        this.f22413Q = poupaMaisStatus;
    }
}
