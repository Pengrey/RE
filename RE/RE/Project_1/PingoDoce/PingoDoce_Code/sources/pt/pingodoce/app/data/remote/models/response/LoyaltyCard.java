package pt.pingodoce.app.data.remote.models.response;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.zxing.C4405j;
import com.google.zxing.EnumC4392a;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import fm.C5579c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p138hc.C5887b;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p239mb.C7155b;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus;

/* compiled from: LoyaltyCard.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LoyaltyCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8782a();
    @InterfaceC4469e(name = "statusPayload")

    /* renamed from: A */
    private final CardStatusPayload f23155A;
    @InterfaceC4469e(name = "hasRequests")

    /* renamed from: B */
    private final boolean f23156B;
    @InterfaceC4469e(name = "benefits")

    /* renamed from: C */
    private final List f23157C;
    @InterfaceC4469e(name = "activeBenefits")

    /* renamed from: D */
    private final int f23158D;
    @InterfaceC4469e(name = "benefitsToBeExpired")

    /* renamed from: E */
    private final String f23159E;
    @InterfaceC4469e(name = "benefitsBalance")

    /* renamed from: F */
    private final float f23160F;
    @InterfaceC4469e(name = "benefitsToBeExpiredColors")

    /* renamed from: G */
    private final BenefitsExpirationColors f23161G;
    @InterfaceC4469e(name = "fuelBenefitsToBeExpiredColors")

    /* renamed from: H */
    private final BenefitsExpirationColors f23162H;
    @InterfaceC4469e(name = "fuelBenefits")

    /* renamed from: I */
    private final float f23163I;
    @InterfaceC4469e(name = "fuelBenefitsToBeExpired")

    /* renamed from: J */
    private final String f23164J;
    @InterfaceC4469e(name = "fuelBenefitsPts")

    /* renamed from: K */
    private final int f23165K;
    @InterfaceC4469e(name = "totalSaved")

    /* renamed from: L */
    private final float f23166L;
    @InterfaceC4469e(name = "dateCreated")

    /* renamed from: M */
    private final String f23167M;
    @InterfaceC4469e(name = "dateUpdated")

    /* renamed from: N */
    private final String f23168N;
    @InterfaceC4469e(name = "cardType")

    /* renamed from: O */
    private final Type f23169O;
    @InterfaceC4469e(name = "poupaMaisStatus")

    /* renamed from: P */
    private final PoupaMaisStatus f23170P;
    @InterfaceC4469e(name = "pendingPoupaMaisNumber")

    /* renamed from: Q */
    private final String f23171Q;

    /* renamed from: R */
    private final String f23172R;
    @InterfaceC4469e(name = "cardNumber")

    /* renamed from: w */
    private final String f23173w;
    @InterfaceC4469e(name = "isDefault")

    /* renamed from: x */
    private final boolean f23174x;
    @InterfaceC4469e(name = "isOwner")

    /* renamed from: y */
    private final boolean f23175y;
    @InterfaceC4469e(name = "status")

    /* renamed from: z */
    private final String f23176z;

    /* compiled from: LoyaltyCard.kt */
    /* loaded from: classes2.dex */
    public enum PoupaMaisStatus implements Parcelable {
        UndefinedStatus,
        OwnerWithRequests,
        OwnerNoRequests,
        Approved,
        Unapproved,
        Pending,
        UnknownOwner,
        UnknownCard,
        OwnerInV2;
        
        public static final Parcelable.Creator CREATOR = new C8780a();

        /* compiled from: LoyaltyCard.kt */
        /* renamed from: pt.pingodoce.app.data.remote.models.response.LoyaltyCard$PoupaMaisStatus$a */
        /* loaded from: classes2.dex */
        public static final class C8780a implements Parcelable.Creator {
            /* renamed from: a */
            public final PoupaMaisStatus createFromParcel(Parcel parcel) {
                Intrinsics.isThisObjectNull(parcel, "parcel");
                return PoupaMaisStatus.valueOf(parcel.readString());
            }

            /* renamed from: b */
            public final PoupaMaisStatus[] newArray(int i) {
                return new PoupaMaisStatus[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.isThisObjectNull(parcel, "out");
            parcel.writeString(name());
        }
    }

    /* compiled from: LoyaltyCard.kt */
    /* loaded from: classes2.dex */
    public enum Type implements Parcelable {
        Undefined,
        PoupaMais,
        LoyaltyCard;
        
        public static final Parcelable.Creator CREATOR = new C8781a();

        /* compiled from: LoyaltyCard.kt */
        /* renamed from: pt.pingodoce.app.data.remote.models.response.LoyaltyCard$Type$a */
        /* loaded from: classes2.dex */
        public static final class C8781a implements Parcelable.Creator {
            /* renamed from: a */
            public final Type createFromParcel(Parcel parcel) {
                Intrinsics.isThisObjectNull(parcel, "parcel");
                return Type.valueOf(parcel.readString());
            }

            /* renamed from: b */
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.isThisObjectNull(parcel, "out");
            parcel.writeString(name());
        }
    }

    /* compiled from: LoyaltyCard.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.LoyaltyCard$a */
    /* loaded from: classes2.dex */
    public static final class C8782a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCard createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            CardStatusPayload cardStatusPayload = (CardStatusPayload) (parcel.readInt() == 0 ? null : CardStatusPayload.CREATOR.createFromParcel(parcel));
            boolean z3 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Benefit.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            float readFloat = parcel.readFloat();
            Parcelable.Creator creator = BenefitsExpirationColors.CREATOR;
            return new LoyaltyCard(readString, z, z2, readString2, cardStatusPayload, z3, arrayList, readInt2, readString3, readFloat, (BenefitsExpirationColors) creator.createFromParcel(parcel), (BenefitsExpirationColors) creator.createFromParcel(parcel), parcel.readFloat(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readString(), parcel.readString(), (Type) Type.CREATOR.createFromParcel(parcel), (PoupaMaisStatus) PoupaMaisStatus.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* renamed from: b */
        public final LoyaltyCard[] newArray(int i) {
            return new LoyaltyCard[i];
        }
    }

    /* compiled from: LoyaltyCard.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.LoyaltyCard$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8783b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23177a;

        static {
            int[] iArr = new int[LoyaltyCardStatus.values().length];
            iArr[LoyaltyCardStatus.PENDING.ordinal()] = 1;
            f23177a = iArr;
        }
    }

    public LoyaltyCard() {
        this(null, false, false, null, null, false, null, 0, null, 0.0f, null, null, 0.0f, null, 0, 0.0f, null, null, null, null, null, 2097151, null);
    }

    public LoyaltyCard(String str, boolean z, boolean z2, String str2, CardStatusPayload cardStatusPayload, boolean z3, List list, int i, String str3, float f, BenefitsExpirationColors benefitsExpirationColors, BenefitsExpirationColors benefitsExpirationColors2, float f2, String str4, int i2, float f3, String str5, String str6, Type type, PoupaMaisStatus poupaMaisStatus, String str7) {
        Intrinsics.isThisObjectNull(str, "typeCardNumber");
        Intrinsics.isThisObjectNull(str2, "status");
        Intrinsics.isThisObjectNull(list, "benefitList");
        Intrinsics.isThisObjectNull(str3, "benefitsToBeExpired");
        Intrinsics.isThisObjectNull(benefitsExpirationColors, "benefitsToBeExpiredColors");
        Intrinsics.isThisObjectNull(benefitsExpirationColors2, "fuelBenefitsToBeExpiredColors");
        Intrinsics.isThisObjectNull(str4, "fuelBenefitsToBeExpired");
        Intrinsics.isThisObjectNull(str5, "dateCreated");
        Intrinsics.isThisObjectNull(str6, "dateUpdated");
        Intrinsics.isThisObjectNull(type, "cardType");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "poupaMaisStatus");
        this.f23173w = str;
        this.f23174x = z;
        this.f23175y = z2;
        this.f23176z = str2;
        this.f23155A = cardStatusPayload;
        this.f23156B = z3;
        this.f23157C = list;
        this.f23158D = i;
        this.f23159E = str3;
        this.f23160F = f;
        this.f23161G = benefitsExpirationColors;
        this.f23162H = benefitsExpirationColors2;
        this.f23163I = f2;
        this.f23164J = str4;
        this.f23165K = i2;
        this.f23166L = f3;
        this.f23167M = str5;
        this.f23168N = str6;
        this.f23169O = type;
        this.f23170P = poupaMaisStatus;
        this.f23171Q = str7;
        this.f23172R = str;
    }

    /* renamed from: d */
    public static /* synthetic */ LoyaltyCard m13806d(LoyaltyCard loyaltyCard, String str, boolean z, boolean z2, String str2, CardStatusPayload cardStatusPayload, boolean z3, List list, int i, String str3, float f, BenefitsExpirationColors benefitsExpirationColors, BenefitsExpirationColors benefitsExpirationColors2, float f2, String str4, int i2, float f3, String str5, String str6, Type type, PoupaMaisStatus poupaMaisStatus, String str7, int i3, Object obj) {
        return loyaltyCard.m13807c((i3 & 1) != 0 ? loyaltyCard.f23173w : str, (i3 & 2) != 0 ? loyaltyCard.f23174x : z, (i3 & 4) != 0 ? loyaltyCard.f23175y : z2, (i3 & 8) != 0 ? loyaltyCard.f23176z : str2, (i3 & 16) != 0 ? loyaltyCard.f23155A : cardStatusPayload, (i3 & 32) != 0 ? loyaltyCard.f23156B : z3, (i3 & 64) != 0 ? loyaltyCard.f23157C : list, (i3 & 128) != 0 ? loyaltyCard.f23158D : i, (i3 & 256) != 0 ? loyaltyCard.f23159E : str3, (i3 & 512) != 0 ? loyaltyCard.f23160F : f, (i3 & 1024) != 0 ? loyaltyCard.f23161G : benefitsExpirationColors, (i3 & 2048) != 0 ? loyaltyCard.f23162H : benefitsExpirationColors2, (i3 & 4096) != 0 ? loyaltyCard.f23163I : f2, (i3 & 8192) != 0 ? loyaltyCard.f23164J : str4, (i3 & 16384) != 0 ? loyaltyCard.f23165K : i2, (i3 & 32768) != 0 ? loyaltyCard.f23166L : f3, (i3 & 65536) != 0 ? loyaltyCard.f23167M : str5, (i3 & 131072) != 0 ? loyaltyCard.f23168N : str6, (i3 & 262144) != 0 ? loyaltyCard.f23169O : type, (i3 & 524288) != 0 ? loyaltyCard.f23170P : poupaMaisStatus, (i3 & 1048576) != 0 ? loyaltyCard.f23171Q : str7);
    }

    /* renamed from: A */
    public final String m13827A() {
        int i = this.f23165K;
        return i + " pts";
    }

    /* renamed from: D */
    public final boolean m13826D() {
        return this.f23156B;
    }

    /* renamed from: E */
    public final String m13825E() {
        return this.f23171Q;
    }

    /* renamed from: F */
    public final PoupaMaisStatus m13824F() {
        return this.f23170P;
    }

    /* renamed from: G */
    public final String m13823G() {
        return this.f23176z;
    }

    /* renamed from: H */
    public final CardStatusPayload m13822H() {
        return this.f23155A;
    }

    /* renamed from: I */
    public final float m13821I() {
        return this.f23166L;
    }

    /* renamed from: J */
    public final String m13820J() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format(Locale.FRANCE, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f23166L)}, 1));
        Intrinsics.checkIfNull(format, "format(locale, format, *args)");
        return C5579c.m23715d(format, null, 1, null);
    }

    /* renamed from: K */
    public final String m13819K() {
        return this.f23173w;
    }

    /* renamed from: L */
    public final boolean m13818L() {
        return !this.f23157C.isEmpty();
    }

    /* renamed from: M */
    public final boolean m13817M() {
        return this.f23163I > 0.0f;
    }

    /* renamed from: N */
    public final boolean m13816N() {
        return !this.f23157C.isEmpty();
    }

    /* renamed from: O */
    public final boolean m13815O() {
        return this.f23166L > 0.0f;
    }

    /* renamed from: P */
    public final boolean m13814P() {
        return m13808b().isApproved();
    }

    /* renamed from: Q */
    public final boolean m13813Q() {
        return this.f23174x;
    }

    /* renamed from: R */
    public final boolean m13812R() {
        return this.f23175y;
    }

    /* renamed from: S */
    public final boolean m13811S() {
        return this.f23170P == PoupaMaisStatus.Approved;
    }

    /* renamed from: T */
    public final LoyaltyCardStatus m13810T() {
        if (C8783b.f23177a[m13808b().ordinal()] == 1) {
            CardStatusPayload cardStatusPayload = this.f23155A;
            if (cardStatusPayload != null) {
                return LoyaltyCardStatus.Companion.m14558c(cardStatusPayload.m13891b(), this.f23155A.m13892a());
            }
            return LoyaltyCardStatus.NONE;
        }
        return LoyaltyCardStatus.NONE;
    }

    /* renamed from: a */
    public final Bitmap m13809a() {
        C7155b m27654b;
        try {
            if (this.f23172R.length() == 0) {
                m27654b = new C4405j().m27654b(this.f23172R, EnumC4392a.EAN_13, UtilsExtensions.m35167e(400), UtilsExtensions.m35167e(50));
                Intrinsics.checkIfNull(m27654b, "{\n                MultiF…          )\n            }");
            } else {
                m27654b = new C4405j().m27654b(this.f23172R, EnumC4392a.EAN_13, UtilsExtensions.m35167e(400), UtilsExtensions.m35167e(50));
                Intrinsics.checkIfNull(m27654b, "{\n                MultiF…          )\n            }");
            }
            return new C5887b().m22818a(m27654b);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final LoyaltyCardStatus m13808b() {
        return LoyaltyCardStatus.Companion.m14560a(this.f23176z, this.f23156B);
    }

    /* renamed from: c */
    public final LoyaltyCard m13807c(String str, boolean z, boolean z2, String str2, CardStatusPayload cardStatusPayload, boolean z3, List list, int i, String str3, float f, BenefitsExpirationColors benefitsExpirationColors, BenefitsExpirationColors benefitsExpirationColors2, float f2, String str4, int i2, float f3, String str5, String str6, Type type, PoupaMaisStatus poupaMaisStatus, String str7) {
        Intrinsics.isThisObjectNull(str, "typeCardNumber");
        Intrinsics.isThisObjectNull(str2, "status");
        Intrinsics.isThisObjectNull(list, "benefitList");
        Intrinsics.isThisObjectNull(str3, "benefitsToBeExpired");
        Intrinsics.isThisObjectNull(benefitsExpirationColors, "benefitsToBeExpiredColors");
        Intrinsics.isThisObjectNull(benefitsExpirationColors2, "fuelBenefitsToBeExpiredColors");
        Intrinsics.isThisObjectNull(str4, "fuelBenefitsToBeExpired");
        Intrinsics.isThisObjectNull(str5, "dateCreated");
        Intrinsics.isThisObjectNull(str6, "dateUpdated");
        Intrinsics.isThisObjectNull(type, "cardType");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "poupaMaisStatus");
        return new LoyaltyCard(str, z, z2, str2, cardStatusPayload, z3, list, i, str3, f, benefitsExpirationColors, benefitsExpirationColors2, f2, str4, i2, f3, str5, str6, type, poupaMaisStatus, str7);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m13805e() {
        return this.f23158D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCard) {
            LoyaltyCard loyaltyCard = (LoyaltyCard) obj;
            return Intrinsics.equals(this.f23173w, loyaltyCard.f23173w) && this.f23174x == loyaltyCard.f23174x && this.f23175y == loyaltyCard.f23175y && Intrinsics.equals(this.f23176z, loyaltyCard.f23176z) && Intrinsics.equals(this.f23155A, loyaltyCard.f23155A) && this.f23156B == loyaltyCard.f23156B && Intrinsics.equals(this.f23157C, loyaltyCard.f23157C) && this.f23158D == loyaltyCard.f23158D && Intrinsics.equals(this.f23159E, loyaltyCard.f23159E) && Intrinsics.equals(Float.valueOf(this.f23160F), Float.valueOf(loyaltyCard.f23160F)) && Intrinsics.equals(this.f23161G, loyaltyCard.f23161G) && Intrinsics.equals(this.f23162H, loyaltyCard.f23162H) && Intrinsics.equals(Float.valueOf(this.f23163I), Float.valueOf(loyaltyCard.f23163I)) && Intrinsics.equals(this.f23164J, loyaltyCard.f23164J) && this.f23165K == loyaltyCard.f23165K && Intrinsics.equals(Float.valueOf(this.f23166L), Float.valueOf(loyaltyCard.f23166L)) && Intrinsics.equals(this.f23167M, loyaltyCard.f23167M) && Intrinsics.equals(this.f23168N, loyaltyCard.f23168N) && this.f23169O == loyaltyCard.f23169O && this.f23170P == loyaltyCard.f23170P && Intrinsics.equals(this.f23171Q, loyaltyCard.f23171Q);
        }
        return false;
    }

    /* renamed from: f */
    public final List m13804f() {
        return this.f23157C;
    }

    /* renamed from: h */
    public final float m13803h() {
        return this.f23160F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f23173w.hashCode() * 31;
        boolean z = this.f23174x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f23175y;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode2 = (((i2 + i3) * 31) + this.f23176z.hashCode()) * 31;
        CardStatusPayload cardStatusPayload = this.f23155A;
        int hashCode3 = (hashCode2 + (cardStatusPayload == null ? 0 : cardStatusPayload.hashCode())) * 31;
        boolean z3 = this.f23156B;
        int hashCode4 = (((((((((((((((((((((((((((((hashCode3 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.f23157C.hashCode()) * 31) + Integer.hashCode(this.f23158D)) * 31) + this.f23159E.hashCode()) * 31) + Float.hashCode(this.f23160F)) * 31) + this.f23161G.hashCode()) * 31) + this.f23162H.hashCode()) * 31) + Float.hashCode(this.f23163I)) * 31) + this.f23164J.hashCode()) * 31) + Integer.hashCode(this.f23165K)) * 31) + Float.hashCode(this.f23166L)) * 31) + this.f23167M.hashCode()) * 31) + this.f23168N.hashCode()) * 31) + this.f23169O.hashCode()) * 31) + this.f23170P.hashCode()) * 31;
        String str = this.f23171Q;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m13802i() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format(Locale.FRANCE, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f23160F)}, 1));
        Intrinsics.checkIfNull(format, "format(locale, format, *args)");
        return C5579c.m23715d(format, null, 1, null);
    }

    /* renamed from: j */
    public final String m13801j() {
        return this.f23159E;
    }

    /* renamed from: k */
    public final BenefitsExpirationColors m13800k() {
        return this.f23161G;
    }

    /* renamed from: m */
    public final String m13799m() {
        return this.f23172R;
    }

    /* renamed from: n */
    public final Type m13798n() {
        return this.f23169O;
    }

    /* renamed from: r */
    public final String m13797r() {
        return this.f23167M;
    }

    /* renamed from: s */
    public final String m13796s() {
        return this.f23168N;
    }

    /* renamed from: t */
    public final float m13795t() {
        return this.f23163I;
    }

    public String toString() {
        String str = this.f23173w;
        boolean z = this.f23174x;
        boolean z2 = this.f23175y;
        String str2 = this.f23176z;
        CardStatusPayload cardStatusPayload = this.f23155A;
        boolean z3 = this.f23156B;
        List list = this.f23157C;
        int i = this.f23158D;
        String str3 = this.f23159E;
        float f = this.f23160F;
        BenefitsExpirationColors benefitsExpirationColors = this.f23161G;
        BenefitsExpirationColors benefitsExpirationColors2 = this.f23162H;
        float f2 = this.f23163I;
        String str4 = this.f23164J;
        int i2 = this.f23165K;
        float f3 = this.f23166L;
        String str5 = this.f23167M;
        String str6 = this.f23168N;
        Type type = this.f23169O;
        PoupaMaisStatus poupaMaisStatus = this.f23170P;
        String str7 = this.f23171Q;
        return "LoyaltyCard(typeCardNumber=" + str + ", isDefault=" + z + ", isOwner=" + z2 + ", status=" + str2 + ", statusPayload=" + cardStatusPayload + ", hasRequests=" + z3 + ", benefitList=" + list + ", activeBenefits=" + i + ", benefitsToBeExpired=" + str3 + ", benefitsBalance=" + f + ", benefitsToBeExpiredColors=" + benefitsExpirationColors + ", fuelBenefitsToBeExpiredColors=" + benefitsExpirationColors2 + ", fuelBenefits=" + f2 + ", fuelBenefitsToBeExpired=" + str4 + ", fuelBenefitsPts=" + i2 + ", totalSaved=" + f3 + ", dateCreated=" + str5 + ", dateUpdated=" + str6 + ", cardType=" + type + ", poupaMaisStatus=" + poupaMaisStatus + ", pendingPoupaMaisNumber=" + str7 + ")";
    }

    /* renamed from: v */
    public final int m13794v() {
        return this.f23165K;
    }

    /* renamed from: w */
    public final String m13793w() {
        return this.f23164J;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23173w);
        parcel.writeInt(this.f23174x ? 1 : 0);
        parcel.writeInt(this.f23175y ? 1 : 0);
        parcel.writeString(this.f23176z);
        CardStatusPayload cardStatusPayload = this.f23155A;
        if (cardStatusPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardStatusPayload.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f23156B ? 1 : 0);
        List<Benefit> list = this.f23157C;
        parcel.writeInt(list.size());
        for (Benefit benefit : list) {
            benefit.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f23158D);
        parcel.writeString(this.f23159E);
        parcel.writeFloat(this.f23160F);
        this.f23161G.writeToParcel(parcel, i);
        this.f23162H.writeToParcel(parcel, i);
        parcel.writeFloat(this.f23163I);
        parcel.writeString(this.f23164J);
        parcel.writeInt(this.f23165K);
        parcel.writeFloat(this.f23166L);
        parcel.writeString(this.f23167M);
        parcel.writeString(this.f23168N);
        this.f23169O.writeToParcel(parcel, i);
        this.f23170P.writeToParcel(parcel, i);
        parcel.writeString(this.f23171Q);
    }

    /* renamed from: y */
    public final BenefitsExpirationColors m13792y() {
        return this.f23162H;
    }

    /* renamed from: z */
    public final String m13791z() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format(Locale.FRANCE, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f23163I)}, 1));
        Intrinsics.checkIfNull(format, "format(locale, format, *args)");
        return C5579c.m23715d(format, null, 1, null);
    }

    public /* synthetic */ LoyaltyCard(String str, boolean z, boolean z2, String str2, CardStatusPayload cardStatusPayload, boolean z3, List list, int i, String str3, float f, BenefitsExpirationColors benefitsExpirationColors, BenefitsExpirationColors benefitsExpirationColors2, float f2, String str4, int i2, float f3, String str5, String str6, Type type, PoupaMaisStatus poupaMaisStatus, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? LoyaltyCardStatus.NONE.name() : str2, (i3 & 16) != 0 ? null : cardStatusPayload, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? C13780s.m197g() : list, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? BuildConfig.VERSION_NAME : str3, (i3 & 512) != 0 ? 0.0f : f, (i3 & 1024) != 0 ? new BenefitsExpirationColors(null, null, 3, null) : benefitsExpirationColors, (i3 & 2048) != 0 ? new BenefitsExpirationColors(null, null, 3, null) : benefitsExpirationColors2, (i3 & 4096) != 0 ? 0.0f : f2, (i3 & 8192) != 0 ? BuildConfig.VERSION_NAME : str4, (i3 & 16384) != 0 ? 0 : i2, (i3 & 32768) != 0 ? 0.0f : f3, (i3 & 65536) != 0 ? BuildConfig.VERSION_NAME : str5, (i3 & 131072) != 0 ? BuildConfig.VERSION_NAME : str6, (i3 & 262144) != 0 ? Type.LoyaltyCard : type, (i3 & 524288) != 0 ? PoupaMaisStatus.UndefinedStatus : poupaMaisStatus, (i3 & 1048576) != 0 ? null : str7);
    }
}
