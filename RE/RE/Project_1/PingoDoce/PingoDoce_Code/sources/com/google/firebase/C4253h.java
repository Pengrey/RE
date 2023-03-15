package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.C2633d;
import p484z6.C13701c;
import p484z6.C13708f;

/* renamed from: com.google.firebase.h */
/* loaded from: classes.dex */
public final class C4253h {

    /* renamed from: a */
    private final String f11565a;

    /* renamed from: b */
    private final String f11566b;

    /* renamed from: c */
    private final String f11567c;

    /* renamed from: d */
    private final String f11568d;

    /* renamed from: e */
    private final String f11569e;

    /* renamed from: f */
    private final String f11570f;

    /* renamed from: g */
    private final String f11571g;

    private C4253h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2597i.m33072n(!C2633d.m32992a(str), "ApplicationId must be set.");
        this.f11566b = str;
        this.f11565a = str2;
        this.f11567c = str3;
        this.f11568d = str4;
        this.f11569e = str5;
        this.f11570f = str6;
        this.f11571g = str7;
    }

    /* renamed from: a */
    public static C4253h m28183a(Context context) {
        C13708f c13708f = new C13708f(context);
        String m563a = c13708f.m563a("google_app_id");
        if (TextUtils.isEmpty(m563a)) {
            return null;
        }
        return new C4253h(m563a, c13708f.m563a("google_api_key"), c13708f.m563a("firebase_database_url"), c13708f.m563a("ga_trackingId"), c13708f.m563a("gcm_defaultSenderId"), c13708f.m563a("google_storage_bucket"), c13708f.m563a("project_id"));
    }

    /* renamed from: b */
    public String m28182b() {
        return this.f11565a;
    }

    /* renamed from: c */
    public String m28181c() {
        return this.f11566b;
    }

    /* renamed from: d */
    public String m28180d() {
        return this.f11569e;
    }

    /* renamed from: e */
    public String m28179e() {
        return this.f11571g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4253h) {
            C4253h c4253h = (C4253h) obj;
            return C13701c.m575a(this.f11566b, c4253h.f11566b) && C13701c.m575a(this.f11565a, c4253h.f11565a) && C13701c.m575a(this.f11567c, c4253h.f11567c) && C13701c.m575a(this.f11568d, c4253h.f11568d) && C13701c.m575a(this.f11569e, c4253h.f11569e) && C13701c.m575a(this.f11570f, c4253h.f11570f) && C13701c.m575a(this.f11571g, c4253h.f11571g);
        }
        return false;
    }

    public int hashCode() {
        return C13701c.m574b(this.f11566b, this.f11565a, this.f11567c, this.f11568d, this.f11569e, this.f11570f, this.f11571g);
    }

    public String toString() {
        return C13701c.m573c(this).m572a("applicationId", this.f11566b).m572a("apiKey", this.f11565a).m572a("databaseUrl", this.f11567c).m572a("gcmSenderId", this.f11569e).m572a("storageBucket", this.f11570f).m572a("projectId", this.f11571g).toString();
    }
}
