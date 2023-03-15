package p377u4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C2290b;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: u4.h */
/* loaded from: classes.dex */
public final class SessionInfo {

    /* renamed from: g */
    public static final C10838a f28017g = new C10838a(null);

    /* renamed from: a */
    private int f28018a;

    /* renamed from: b */
    private Long f28019b;

    /* renamed from: c */
    private C10839j f28020c;

    /* renamed from: d */
    private final Long f28021d;

    /* renamed from: e */
    private Long f28022e;

    /* renamed from: f */
    private UUID f28023f;

    /* compiled from: SessionInfo.kt */
    /* renamed from: u4.h$a */
    /* loaded from: classes.dex */
    public static final class C10838a {
        private C10838a() {
        }

        /* renamed from: a */
        public final void m6909a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            C10839j.f28027c.m6901a();
        }

        /* renamed from: b */
        public final SessionInfo m6908b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            SessionInfo.m6922a(sessionInfo, defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0));
            sessionInfo.m6911l(C10839j.f28027c.m6900b());
            sessionInfo.m6914i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            Intrinsics.checkIfNull(fromString, "UUID.fromString(sessionIDStr)");
            sessionInfo.m6913j(fromString);
            return sessionInfo;
        }

        public /* synthetic */ C10838a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SessionInfo(Long l, Long l2, UUID uuid) {
        Intrinsics.isThisObjectNull(uuid, "sessionId");
        this.f28021d = l;
        this.f28022e = l2;
        this.f28023f = uuid;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m6922a(SessionInfo sessionInfo, int i) {
        sessionInfo.f28018a = i;
    }

    /* renamed from: b */
    public final Long m6921b() {
        Long l = this.f28019b;
        return Long.valueOf(l != null ? l.longValue() : 0L);
    }

    /* renamed from: c */
    public final int m6920c() {
        return this.f28018a;
    }

    /* renamed from: d */
    public final UUID m6919d() {
        return this.f28023f;
    }

    /* renamed from: e */
    public final Long m6918e() {
        return this.f28022e;
    }

    /* renamed from: f */
    public final long m6917f() {
        Long l;
        if (this.f28021d == null || (l = this.f28022e) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.f28021d.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: g */
    public final C10839j m6916g() {
        return this.f28020c;
    }

    /* renamed from: h */
    public final void m6915h() {
        this.f28018a++;
    }

    /* renamed from: i */
    public final void m6914i(Long l) {
        this.f28019b = l;
    }

    /* renamed from: j */
    public final void m6913j(UUID uuid) {
        Intrinsics.isThisObjectNull(uuid, "<set-?>");
        this.f28023f = uuid;
    }

    /* renamed from: k */
    public final void m6912k(Long l) {
        this.f28022e = l;
    }

    /* renamed from: l */
    public final void m6911l(C10839j c10839j) {
        this.f28020c = c10839j;
    }

    /* renamed from: m */
    public final void m6910m() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e()).edit();
        Long l = this.f28021d;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = this.f28022e;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f28018a);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f28023f.toString());
        edit.apply();
        C10839j c10839j = this.f28020c;
        if (c10839j == null || c10839j == null) {
            return;
        }
        c10839j.m6902a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SessionInfo(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "UUID.randomUUID()"
            p181jd.Intrinsics.checkIfNull(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p377u4.SessionInfo.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
