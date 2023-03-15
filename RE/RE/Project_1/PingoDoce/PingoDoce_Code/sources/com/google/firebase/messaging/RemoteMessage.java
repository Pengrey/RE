package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.C4275b;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C4313o0();

    /* renamed from: w */
    Bundle f11626w;

    /* renamed from: x */
    private Map<String, String> f11627x;

    /* renamed from: y */
    private C4269a f11628y;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.RemoteMessage$a */
    /* loaded from: classes.dex */
    public static class C4269a {

        /* renamed from: a */
        private final String f11629a;

        /* renamed from: b */
        private final String f11630b;

        private C4269a(C4301i0 c4301i0) {
            this.f11629a = c4301i0.m27954p("gcm.n.title");
            c4301i0.m27962h("gcm.n.title");
            m28084b(c4301i0, "gcm.n.title");
            this.f11630b = c4301i0.m27954p("gcm.n.body");
            c4301i0.m27962h("gcm.n.body");
            m28084b(c4301i0, "gcm.n.body");
            c4301i0.m27954p("gcm.n.icon");
            c4301i0.m27955o();
            c4301i0.m27954p("gcm.n.tag");
            c4301i0.m27954p("gcm.n.color");
            c4301i0.m27954p("gcm.n.click_action");
            c4301i0.m27954p("gcm.n.android_channel_id");
            c4301i0.m27964f();
            c4301i0.m27954p("gcm.n.image");
            c4301i0.m27954p("gcm.n.ticker");
            c4301i0.m27968b("gcm.n.notification_priority");
            c4301i0.m27968b("gcm.n.visibility");
            c4301i0.m27968b("gcm.n.notification_count");
            c4301i0.m27969a("gcm.n.sticky");
            c4301i0.m27969a("gcm.n.local_only");
            c4301i0.m27969a("gcm.n.default_sound");
            c4301i0.m27969a("gcm.n.default_vibrate_timings");
            c4301i0.m27969a("gcm.n.default_light_settings");
            c4301i0.m27960j("gcm.n.event_time");
            c4301i0.m27965e();
            c4301i0.m27953q();
        }

        /* renamed from: b */
        private static String[] m28084b(C4301i0 c4301i0, String str) {
            Object[] m27963g = c4301i0.m27963g(str);
            if (m27963g == null) {
                return null;
            }
            String[] strArr = new String[m27963g.length];
            for (int i = 0; i < m27963g.length; i++) {
                strArr[i] = String.valueOf(m27963g[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m28085a() {
            return this.f11630b;
        }

        /* renamed from: c */
        public String m28083c() {
            return this.f11629a;
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f11626w = bundle;
    }

    /* renamed from: h */
    public Map<String, String> m28088h() {
        if (this.f11627x == null) {
            this.f11627x = C4275b.C4276a.m28053a(this.f11626w);
        }
        return this.f11627x;
    }

    /* renamed from: t */
    public String m28087t() {
        return this.f11626w.getString("from");
    }

    /* renamed from: v */
    public C4269a m28086v() {
        if (this.f11628y == null && C4301i0.m27950t(this.f11626w)) {
            this.f11628y = new C4269a(new C4301i0(this.f11626w));
        }
        return this.f11628y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4313o0.m27920c(this, parcel, i);
    }
}
