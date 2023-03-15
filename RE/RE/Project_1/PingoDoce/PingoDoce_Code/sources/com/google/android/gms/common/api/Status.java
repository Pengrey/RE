package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.joda.time.DateTimeConstants;
import p008a7.C0066a;
import p462y6.C13118a;
import p462y6.InterfaceC13123e;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC13123e, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: A */
    private final ConnectionResult f7160A;

    /* renamed from: w */
    final int f7161w;

    /* renamed from: x */
    private final int f7162x;

    /* renamed from: y */
    private final String f7163y;

    /* renamed from: z */
    private final PendingIntent f7164z;

    /* renamed from: B */
    public static final Status f7155B = new Status(0);

    /* renamed from: C */
    public static final Status f7156C = new Status(14);

    /* renamed from: D */
    public static final Status f7157D = new Status(8);

    /* renamed from: E */
    public static final Status f7158E = new Status(15);

    /* renamed from: F */
    public static final Status f7159F = new Status(16);

    static {
        new Status(17);
        new Status(18);
        CREATOR = new C2479e();
    }

    public Status(int i) {
        this(i, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f7161w = i;
        this.f7162x = i2;
        this.f7163y = str;
        this.f7164z = pendingIntent;
        this.f7160A = connectionResult;
    }

    /* renamed from: D */
    public boolean m33511D() {
        return this.f7162x <= 0;
    }

    /* renamed from: E */
    public final String m33510E() {
        String str = this.f7163y;
        return str != null ? str : C13118a.m1573a(this.f7162x);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f7161w == status.f7161w && this.f7162x == status.f7162x && C13701c.m575a(this.f7163y, status.f7163y) && C13701c.m575a(this.f7164z, status.f7164z) && C13701c.m575a(this.f7160A, status.f7160A);
        }
        return false;
    }

    @Override // p462y6.InterfaceC13123e
    public Status getStatus() {
        return this;
    }

    /* renamed from: h */
    public ConnectionResult m33509h() {
        return this.f7160A;
    }

    public int hashCode() {
        return C13701c.m574b(Integer.valueOf(this.f7161w), Integer.valueOf(this.f7162x), this.f7163y, this.f7164z, this.f7160A);
    }

    /* renamed from: t */
    public int m33508t() {
        return this.f7162x;
    }

    public String toString() {
        C13701c.C13702a m573c = C13701c.m573c(this);
        m573c.m572a("statusCode", m33510E());
        m573c.m572a("resolution", this.f7164z);
        return m573c.toString();
    }

    /* renamed from: v */
    public String m33507v() {
        return this.f7163y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, m33508t());
        C0066a.m42003r(parcel, 2, m33507v(), false);
        C0066a.m42004q(parcel, 3, this.f7164z, i, false);
        C0066a.m42004q(parcel, 4, m33509h(), i, false);
        C0066a.m42009l(parcel, DateTimeConstants.MILLIS_PER_SECOND, this.f7161w);
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public boolean m33506y() {
        return this.f7164z != null;
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i) {
        this(1, i, str, connectionResult.m33520v(), connectionResult);
    }
}
