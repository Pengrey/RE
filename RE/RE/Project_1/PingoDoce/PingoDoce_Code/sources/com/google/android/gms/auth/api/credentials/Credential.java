package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Credential> CREATOR = new C2411a();

    /* renamed from: A */
    private final String f6999A;

    /* renamed from: B */
    private final String f7000B;

    /* renamed from: C */
    private final String f7001C;

    /* renamed from: D */
    private final String f7002D;
    @Nonnull

    /* renamed from: w */
    private final String f7003w;

    /* renamed from: x */
    private final String f7004x;

    /* renamed from: y */
    private final Uri f7005y;
    @Nonnull

    /* renamed from: z */
    private final List<IdToken> f7006z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> unmodifiableList;
        Boolean bool;
        String trim = ((String) C2597i.m33075k(str, "credential identifier cannot be null")).trim();
        C2597i.m33079g(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                bool = Boolean.FALSE;
            } else {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority())) {
                    boolean z = true;
                    if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f7004x = str2;
        this.f7005y = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f7006z = unmodifiableList;
        this.f7003w = trim;
        this.f6999A = str3;
        this.f7000B = str4;
        this.f7001C = str5;
        this.f7002D = str6;
    }

    @Nonnull
    /* renamed from: D */
    public List<IdToken> m33654D() {
        return this.f7006z;
    }

    @RecentlyNullable
    /* renamed from: E */
    public String m33653E() {
        return this.f7004x;
    }

    @RecentlyNullable
    /* renamed from: F */
    public String m33652F() {
        return this.f6999A;
    }

    @RecentlyNullable
    /* renamed from: G */
    public Uri m33651G() {
        return this.f7005y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Credential) {
            Credential credential = (Credential) obj;
            return TextUtils.equals(this.f7003w, credential.f7003w) && TextUtils.equals(this.f7004x, credential.f7004x) && C13701c.m575a(this.f7005y, credential.f7005y) && TextUtils.equals(this.f6999A, credential.f6999A) && TextUtils.equals(this.f7000B, credential.f7000B);
        }
        return false;
    }

    @RecentlyNullable
    /* renamed from: h */
    public String m33650h() {
        return this.f7000B;
    }

    public int hashCode() {
        return C13701c.m574b(this.f7003w, this.f7004x, this.f7005y, this.f6999A, this.f7000B);
    }

    @RecentlyNullable
    /* renamed from: t */
    public String m33649t() {
        return this.f7002D;
    }

    @RecentlyNullable
    /* renamed from: v */
    public String m33648v() {
        return this.f7001C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 1, m33647y(), false);
        C0066a.m42003r(parcel, 2, m33653E(), false);
        C0066a.m42004q(parcel, 3, m33651G(), i, false);
        C0066a.m41999v(parcel, 4, m33654D(), false);
        C0066a.m42003r(parcel, 5, m33652F(), false);
        C0066a.m42003r(parcel, 6, m33650h(), false);
        C0066a.m42003r(parcel, 9, m33648v(), false);
        C0066a.m42003r(parcel, 10, m33649t(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    @Nonnull
    /* renamed from: y */
    public String m33647y() {
        return this.f7003w;
    }
}
