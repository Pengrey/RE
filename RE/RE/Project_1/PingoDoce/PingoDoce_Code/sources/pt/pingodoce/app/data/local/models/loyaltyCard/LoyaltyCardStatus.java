package pt.pingodoce.app.data.local.models.loyaltyCard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: LoyaltyCardStatus.kt */
/* loaded from: classes2.dex */
public enum LoyaltyCardStatus implements Parcelable {
    NONE,
    APPROVED,
    APPROVED_WITH_REQUESTS,
    PENDING,
    PENDING_WAITING_FOR_OWNER_REGISTRATION,
    PENDING_WAITING_FOR_OWNER_APPROVAL,
    PENDING_WAITING_FOR_LOYALTY_CARD_APPROVAL,
    NOT_REGISTERED;
    
    public static final C8699a Companion = new C8699a(null);
    public static final Parcelable.Creator CREATOR = new C8700b();

    /* compiled from: LoyaltyCardStatus.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus$a */
    /* loaded from: classes2.dex */
    public static final class C8699a {
        private C8699a() {
        }

        public /* synthetic */ C8699a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ LoyaltyCardStatus m14559b(C8699a c8699a, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return c8699a.m14560a(str, z);
        }

        /* renamed from: a */
        public final LoyaltyCardStatus m14560a(String str, boolean z) {
            Intrinsics.isThisObjectNull(str, "status");
            int hashCode = str.hashCode();
            if (hashCode != -526380146) {
                if (hashCode != 35394935) {
                    if (hashCode == 1967871671 && str.equals("APPROVED")) {
                        return z ? LoyaltyCardStatus.APPROVED_WITH_REQUESTS : LoyaltyCardStatus.APPROVED;
                    }
                } else if (str.equals("PENDING")) {
                    return LoyaltyCardStatus.PENDING;
                }
            } else if (str.equals("NOT_REGISTERED")) {
                return LoyaltyCardStatus.NOT_REGISTERED;
            }
            return LoyaltyCardStatus.NONE;
        }

        /* renamed from: c */
        public final LoyaltyCardStatus m14558c(String str, boolean z) {
            Intrinsics.isThisObjectNull(str, "maskedPhoneNumber");
            if (str.length() == 0) {
                return LoyaltyCardStatus.PENDING_WAITING_FOR_LOYALTY_CARD_APPROVAL;
            }
            return z ? LoyaltyCardStatus.PENDING_WAITING_FOR_OWNER_REGISTRATION : LoyaltyCardStatus.PENDING_WAITING_FOR_OWNER_APPROVAL;
        }
    }

    /* compiled from: LoyaltyCardStatus.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus$b */
    /* loaded from: classes2.dex */
    public static final class C8700b implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardStatus mo14090a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return LoyaltyCardStatus.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final LoyaltyCardStatus[] mo14089b(int i) {
            return new LoyaltyCardStatus[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public final boolean isApproved() {
        return this == APPROVED || this == APPROVED_WITH_REQUESTS;
    }

    public final boolean isRegistered() {
        return (this == NOT_REGISTERED || this == NONE) ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(name());
    }
}
