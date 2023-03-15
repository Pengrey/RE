package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.joda.time.DateTimeConstants;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C2412b();

    /* renamed from: w */
    final int f7007w;

    /* renamed from: x */
    private final boolean f7008x;

    /* renamed from: y */
    private final boolean f7009y;

    /* renamed from: z */
    private final int f7010z;

    /* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* loaded from: classes.dex */
    public static class C2409a {

        /* renamed from: a */
        private boolean f7011a = false;

        /* renamed from: b */
        private boolean f7012b = true;

        /* renamed from: c */
        private int f7013c = 1;

        @RecentlyNonNull
        /* renamed from: a */
        public CredentialPickerConfig m33643a() {
            return new CredentialPickerConfig(2, this.f7011a, this.f7012b, false, this.f7013c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f7007w = i;
        this.f7008x = z;
        this.f7009y = z2;
        if (i < 2) {
            this.f7010z = true == z3 ? 3 : 1;
        } else {
            this.f7010z = i2;
        }
    }

    @Deprecated
    /* renamed from: h */
    public boolean m33646h() {
        return this.f7010z == 3;
    }

    /* renamed from: t */
    public boolean m33645t() {
        return this.f7008x;
    }

    /* renamed from: v */
    public boolean m33644v() {
        return this.f7009y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42018c(parcel, 1, m33645t());
        C0066a.m42018c(parcel, 2, m33644v());
        C0066a.m42018c(parcel, 3, m33646h());
        C0066a.m42009l(parcel, 4, this.f7010z);
        C0066a.m42009l(parcel, DateTimeConstants.MILLIS_PER_SECOND, this.f7007w);
        C0066a.m42019b(parcel, m42020a);
    }
}
