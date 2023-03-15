package pt.pingodoce.app.data.local.models.p300goto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: pt.pingodoce.app.data.local.models.goto.PushActionGotoType */
/* loaded from: classes2.dex */
public enum PushActionGotoType implements Parcelable {
    UNKNOWN,
    HOME,
    PROMOTIONS,
    SHOPPING_LIST,
    SHOPPING_LISTS,
    TAKE_AWAY,
    LOYALTY_CARD_REQUESTS,
    TAKE_AWAY_ORDER_LIST,
    ACCOUNT,
    BENEFIT,
    DETAIL,
    SEARCH,
    PROFILE,
    DEFINITION,
    TERMS_OF_SERVICE,
    DATA_PROTECTION,
    PRODUCT_DETAIL,
    BANNER_DETAIL,
    HOUSE_HOLD_REMOVED;
    
    public static final C8696a Companion = new C8696a(null);
    public static final Parcelable.Creator CREATOR = new C8697b();

    /* compiled from: PushActionGotoType.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.goto.PushActionGotoType$a */
    /* loaded from: classes2.dex */
    public static final class C8696a {
        private C8696a() {
        }

        public /* synthetic */ C8696a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PushActionGotoType m14573a(String str) {
            Intrinsics.isThisObjectNull(str, "key");
            int hashCode = str.hashCode();
            if (hashCode != 1598) {
                if (hashCode != 1599) {
                    switch (hashCode) {
                        case 48:
                            if (str.equals("0")) {
                                return PushActionGotoType.HOME;
                            }
                            break;
                        case 49:
                            if (str.equals("1")) {
                                return PushActionGotoType.PROMOTIONS;
                            }
                            break;
                        case 50:
                            if (str.equals("2")) {
                                return PushActionGotoType.SHOPPING_LIST;
                            }
                            break;
                        case 51:
                            if (str.equals("3")) {
                                return PushActionGotoType.TAKE_AWAY;
                            }
                            break;
                        case 52:
                            if (str.equals("4")) {
                                return PushActionGotoType.ACCOUNT;
                            }
                            break;
                        case 53:
                            if (str.equals("5")) {
                                return PushActionGotoType.LOYALTY_CARD_REQUESTS;
                            }
                            break;
                        case 54:
                            if (str.equals("6")) {
                                return PushActionGotoType.SHOPPING_LISTS;
                            }
                            break;
                        case 55:
                            if (str.equals("7")) {
                                return PushActionGotoType.TAKE_AWAY_ORDER_LIST;
                            }
                            break;
                        case 56:
                            if (str.equals("8")) {
                                return PushActionGotoType.BENEFIT;
                            }
                            break;
                        case 57:
                            if (str.equals("9")) {
                                return PushActionGotoType.DETAIL;
                            }
                            break;
                        default:
                            switch (hashCode) {
                                case 1569:
                                    if (str.equals("12")) {
                                        return PushActionGotoType.SEARCH;
                                    }
                                    break;
                                case 1570:
                                    if (str.equals("13")) {
                                        return PushActionGotoType.PROFILE;
                                    }
                                    break;
                                case 1571:
                                    if (str.equals("14")) {
                                        return PushActionGotoType.DEFINITION;
                                    }
                                    break;
                                default:
                                    switch (hashCode) {
                                        case 1574:
                                            if (str.equals("17")) {
                                                return PushActionGotoType.TERMS_OF_SERVICE;
                                            }
                                            break;
                                        case 1575:
                                            if (str.equals("18")) {
                                                return PushActionGotoType.DATA_PROTECTION;
                                            }
                                            break;
                                        case 1576:
                                            if (str.equals("19")) {
                                                return PushActionGotoType.PRODUCT_DETAIL;
                                            }
                                            break;
                                    }
                            }
                    }
                } else if (str.equals("21")) {
                    return PushActionGotoType.HOUSE_HOLD_REMOVED;
                }
            } else if (str.equals("20")) {
                return PushActionGotoType.BANNER_DETAIL;
            }
            return PushActionGotoType.UNKNOWN;
        }
    }

    /* compiled from: PushActionGotoType.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.goto.PushActionGotoType$b */
    /* loaded from: classes2.dex */
    public static final class C8697b implements Parcelable.Creator {
        /* renamed from: a */
        public final PushActionGotoType mo14105a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return PushActionGotoType.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final PushActionGotoType[] mo14104b(int i) {
            return new PushActionGotoType[i];
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
