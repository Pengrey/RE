package wf;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.p283bp.zone.AbstractC8326f;
import org.threeten.p283bp.zone.ZoneRulesException;
import p405vf.C11251d;

/* renamed from: wf.c */
/* loaded from: classes2.dex */
public abstract class AbstractC11665c {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<AbstractC11665c> f29805a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private static final ConcurrentMap<String, AbstractC11665c> f29806b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        AbstractC11661a.m4527a();
    }

    /* renamed from: a */
    private static AbstractC11665c m4524a(String str) {
        ConcurrentMap<String, AbstractC11665c> concurrentMap = f29806b;
        AbstractC11665c abstractC11665c = concurrentMap.get(str);
        if (abstractC11665c == null) {
            if (concurrentMap.isEmpty()) {
                throw new ZoneRulesException("No time-zone data files registered");
            }
            throw new ZoneRulesException("Unknown time-zone ID: " + str);
        }
        return abstractC11665c;
    }

    /* renamed from: b */
    public static AbstractC8326f m4523b(String str, boolean z) {
        C11251d.m5623i(str, "zoneId");
        return m4524a(str).mo4522c(str, z);
    }

    /* renamed from: e */
    public static void m4520e(AbstractC11665c abstractC11665c) {
        C11251d.m5623i(abstractC11665c, "provider");
        m4519f(abstractC11665c);
        f29805a.add(abstractC11665c);
    }

    /* renamed from: f */
    private static void m4519f(AbstractC11665c abstractC11665c) {
        for (String str : abstractC11665c.mo4521d()) {
            C11251d.m5623i(str, "zoneId");
            if (f29806b.putIfAbsent(str, abstractC11665c) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + abstractC11665c);
            }
        }
    }

    /* renamed from: c */
    protected abstract AbstractC8326f mo4522c(String str, boolean z);

    /* renamed from: d */
    protected abstract Set<String> mo4521d();
}
