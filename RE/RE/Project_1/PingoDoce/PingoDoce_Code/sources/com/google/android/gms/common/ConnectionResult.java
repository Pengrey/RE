package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: A */
    public static final ConnectionResult f7139A = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C2572h();

    /* renamed from: w */
    final int f7140w;

    /* renamed from: x */
    private final int f7141x;

    /* renamed from: y */
    private final PendingIntent f7142y;

    /* renamed from: z */
    private final String f7143z;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f7140w = i;
        this.f7141x = i2;
        this.f7142y = pendingIntent;
        this.f7143z = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static String m33523E(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                StringBuilder sb2 = new StringBuilder(31);
                                sb2.append("UNKNOWN_ERROR_CODE(");
                                sb2.append(i);
                                sb2.append(")");
                                return sb2.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    /* renamed from: D */
    public boolean m33524D() {
        return this.f7141x == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionResult) {
            ConnectionResult connectionResult = (ConnectionResult) obj;
            return this.f7141x == connectionResult.f7141x && C13701c.m575a(this.f7142y, connectionResult.f7142y) && C13701c.m575a(this.f7143z, connectionResult.f7143z);
        }
        return false;
    }

    /* renamed from: h */
    public int m33522h() {
        return this.f7141x;
    }

    public int hashCode() {
        return C13701c.m574b(Integer.valueOf(this.f7141x), this.f7142y, this.f7143z);
    }

    /* renamed from: t */
    public String m33521t() {
        return this.f7143z;
    }

    public String toString() {
        C13701c.C13702a m573c = C13701c.m573c(this);
        m573c.m572a("statusCode", m33523E(this.f7141x));
        m573c.m572a("resolution", this.f7142y);
        m573c.m572a("message", this.f7143z);
        return m573c.toString();
    }

    /* renamed from: v */
    public PendingIntent m33520v() {
        return this.f7142y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7140w);
        C0066a.m42009l(parcel, 2, m33522h());
        C0066a.m42004q(parcel, 3, m33520v(), i, false);
        C0066a.m42003r(parcel, 4, m33521t(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public boolean m33519y() {
        return (this.f7141x == 0 || this.f7142y == null) ? false : true;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
