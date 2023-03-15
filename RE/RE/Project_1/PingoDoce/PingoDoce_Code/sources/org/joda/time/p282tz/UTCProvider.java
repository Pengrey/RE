package org.joda.time.p282tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.UTCProvider */
/* loaded from: classes2.dex */
public final class UTCProvider implements Provider {
    private static final Set<String> AVAILABLE_IDS = Collections.singleton("UTC");

    @Override // org.joda.time.p282tz.Provider
    public Set<String> getAvailableIDs() {
        return AVAILABLE_IDS;
    }

    @Override // org.joda.time.p282tz.Provider
    public DateTimeZone getZone(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }
}
