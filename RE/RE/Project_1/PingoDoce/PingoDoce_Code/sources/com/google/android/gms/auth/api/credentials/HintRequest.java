package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.joda.time.DateTimeConstants;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<HintRequest> CREATOR = new C2413c();

    /* renamed from: A */
    private final String[] f7014A;

    /* renamed from: B */
    private final boolean f7015B;

    /* renamed from: C */
    private final String f7016C;

    /* renamed from: D */
    private final String f7017D;

    /* renamed from: w */
    final int f7018w;

    /* renamed from: x */
    private final CredentialPickerConfig f7019x;

    /* renamed from: y */
    private final boolean f7020y;

    /* renamed from: z */
    private final boolean f7021z;

    /* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    /* loaded from: classes.dex */
    public static final class C2410a {

        /* renamed from: a */
        private boolean f7022a;

        /* renamed from: b */
        private boolean f7023b;

        /* renamed from: c */
        private String[] f7024c;

        /* renamed from: d */
        private CredentialPickerConfig f7025d = new CredentialPickerConfig.C2409a().m33643a();

        /* renamed from: e */
        private boolean f7026e = false;

        /* renamed from: f */
        private String f7027f;

        /* renamed from: g */
        private String f7028g;

        @RecentlyNonNull
        /* renamed from: a */
        public HintRequest m33636a() {
            if (this.f7024c == null) {
                this.f7024c = new String[0];
            }
            boolean z = this.f7022a;
            if (!z && !this.f7023b && this.f7024c.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new HintRequest(2, this.f7025d, z, this.f7023b, this.f7024c, this.f7026e, this.f7027f, this.f7028g);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C2410a m33635b(boolean z) {
            this.f7023b = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f7018w = i;
        this.f7019x = (CredentialPickerConfig) C2597i.m33076j(credentialPickerConfig);
        this.f7020y = z;
        this.f7021z = z2;
        this.f7014A = (String[]) C2597i.m33076j(strArr);
        if (i < 2) {
            this.f7015B = true;
            this.f7016C = null;
            this.f7017D = null;
            return;
        }
        this.f7015B = z3;
        this.f7016C = str;
        this.f7017D = str2;
    }

    /* renamed from: D */
    public boolean m33642D() {
        return this.f7020y;
    }

    /* renamed from: E */
    public boolean m33641E() {
        return this.f7015B;
    }

    /* renamed from: h */
    public String[] m33640h() {
        return this.f7014A;
    }

    /* renamed from: t */
    public CredentialPickerConfig m33639t() {
        return this.f7019x;
    }

    @RecentlyNullable
    /* renamed from: v */
    public String m33638v() {
        return this.f7017D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 1, m33639t(), i, false);
        C0066a.m42018c(parcel, 2, m33642D());
        C0066a.m42018c(parcel, 3, this.f7021z);
        C0066a.m42002s(parcel, 4, m33640h(), false);
        C0066a.m42018c(parcel, 5, m33641E());
        C0066a.m42003r(parcel, 6, m33637y(), false);
        C0066a.m42003r(parcel, 7, m33638v(), false);
        C0066a.m42009l(parcel, DateTimeConstants.MILLIS_PER_SECOND, this.f7018w);
        C0066a.m42019b(parcel, m42020a);
    }

    @RecentlyNullable
    /* renamed from: y */
    public String m33637y() {
        return this.f7016C;
    }
}
