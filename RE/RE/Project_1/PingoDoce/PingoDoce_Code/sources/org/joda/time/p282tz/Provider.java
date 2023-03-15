package org.joda.time.p282tz;

import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.Provider */
/* loaded from: classes2.dex */
public interface Provider {
    Set<String> getAvailableIDs();

    DateTimeZone getZone(String str);
}
