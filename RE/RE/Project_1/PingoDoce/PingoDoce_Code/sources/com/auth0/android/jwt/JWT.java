package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.gson.C4364f;
import com.google.gson.C4371g;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;
import p421wa.C11605a;

/* loaded from: classes.dex */
public class JWT implements Parcelable {
    public static final Parcelable.Creator<JWT> CREATOR = new C2257a();

    /* renamed from: w */
    private final String f6561w;

    /* renamed from: x */
    private Map<String, String> f6562x;

    /* renamed from: y */
    private C2262d f6563y;

    /* renamed from: com.auth0.android.jwt.JWT$a */
    /* loaded from: classes.dex */
    static class C2257a implements Parcelable.Creator<JWT> {
        C2257a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public JWT createFromParcel(Parcel parcel) {
            return new JWT(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public JWT[] newArray(int i) {
            return new JWT[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.auth0.android.jwt.JWT$b */
    /* loaded from: classes.dex */
    public class C2258b extends C11605a<Map<String, String>> {
        C2258b(JWT jwt) {
        }
    }

    public JWT(String str) {
        m34268b(str);
        this.f6561w = str;
    }

    /* renamed from: a */
    private String m34269a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e) {
            throw new DecodeException("Received bytes didn't correspond to a valid Base64 encoded string.", e);
        }
    }

    /* renamed from: b */
    private void m34268b(String str) {
        String[] m34264f = m34264f(str);
        this.f6562x = (Map) m34265e(m34269a(m34264f[0]), new C2258b(this).m4627e());
        this.f6563y = (C2262d) m34265e(m34269a(m34264f[1]), C2262d.class);
        String str2 = m34264f[2];
    }

    /* renamed from: c */
    static C4364f m34267c() {
        return new C4371g().m27769c(C2262d.class, new C2261c()).m27770b();
    }

    /* renamed from: e */
    private <T> T m34265e(String str, Type type) {
        try {
            return (T) m34267c().m27796j(str, type);
        } catch (Exception e) {
            throw new DecodeException("The token's payload had an invalid JSON format.", e);
        }
    }

    /* renamed from: f */
    private String[] m34264f(String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(".")) {
            split = new String[]{split[0], split[1], BuildConfig.VERSION_NAME};
        }
        if (split.length == 3) {
            return split;
        }
        throw new DecodeException(String.format("The token was expected to have 3 parts, but got %s.", Integer.valueOf(split.length)));
    }

    /* renamed from: d */
    public boolean m34266d(long j) {
        if (j >= 0) {
            long floor = (long) (Math.floor(new Date().getTime() / 1000) * 1000.0d);
            long j2 = j * 1000;
            Date date = new Date(floor + j2);
            Date date2 = new Date(floor - j2);
            Date date3 = this.f6563y.f6564a;
            boolean z = date3 == null || !date2.after(date3);
            Date date4 = this.f6563y.f6565b;
            return (z && (date4 == null || !date.before(date4))) ? false : true;
        }
        throw new IllegalArgumentException("The leeway must be a positive value.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f6561w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6561w);
    }
}
