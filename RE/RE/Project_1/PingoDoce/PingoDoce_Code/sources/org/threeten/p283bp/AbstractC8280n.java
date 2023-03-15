package org.threeten.p283bp;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.zone.AbstractC8326f;
import org.threeten.p283bp.zone.ZoneRulesException;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.n */
/* loaded from: classes2.dex */
public abstract class AbstractC8280n implements Serializable {

    /* renamed from: w */
    public static final Map<String, String> f21484w;

    /* compiled from: ZoneId.java */
    /* renamed from: org.threeten.bp.n$a */
    /* loaded from: classes2.dex */
    class C8281a implements InterfaceC8313j<AbstractC8280n> {
        C8281a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public AbstractC8280n mo16124b(InterfaceC8299e interfaceC8299e) {
            return AbstractC8280n.m15934g(interfaceC8299e);
        }
    }

    static {
        new C8281a();
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f21484w = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8280n() {
        if (getClass() != C8282o.class && getClass() != C8284p.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* renamed from: g */
    public static AbstractC8280n m15934g(InterfaceC8299e interfaceC8299e) {
        AbstractC8280n abstractC8280n = (AbstractC8280n) interfaceC8299e.query(C8305i.m15864f());
        if (abstractC8280n != null) {
            return abstractC8280n;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
    }

    /* renamed from: k */
    public static AbstractC8280n m15932k(String str) {
        C11251d.m5623i(str, "zoneId");
        if (str.equals("Z")) {
            return C8282o.f21486B;
        }
        if (str.length() != 1) {
            if (!str.startsWith("+") && !str.startsWith("-")) {
                if (!str.equals("UTC") && !str.equals("GMT") && !str.equals("UT")) {
                    if (!str.startsWith("UTC+") && !str.startsWith("GMT+") && !str.startsWith("UTC-") && !str.startsWith("GMT-")) {
                        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                            return C8284p.m15912o(str, true);
                        }
                        C8282o m15924s = C8282o.m15924s(str.substring(2));
                        if (m15924s.m15925r() == 0) {
                            return new C8284p("UT", m15924s.mo15914i());
                        }
                        return new C8284p("UT" + m15924s.mo15915h(), m15924s.mo15914i());
                    }
                    C8282o m15924s2 = C8282o.m15924s(str.substring(3));
                    if (m15924s2.m15925r() == 0) {
                        return new C8284p(str.substring(0, 3), m15924s2.mo15914i());
                    }
                    return new C8284p(str.substring(0, 3) + m15924s2.mo15915h(), m15924s2.mo15914i());
                }
                return new C8284p(str, C8282o.f21486B.mo15914i());
            }
            return C8282o.m15924s(str);
        }
        throw new DateTimeException("Invalid zone: " + str);
    }

    /* renamed from: l */
    public static AbstractC8280n m15931l(String str, Map<String, String> map) {
        C11251d.m5623i(str, "zoneId");
        C11251d.m5623i(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return m15932k(str);
    }

    /* renamed from: m */
    public static AbstractC8280n m15930m() {
        return m15931l(TimeZone.getDefault().getID(), f21484w);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC8280n) {
            return mo15915h().equals(((AbstractC8280n) obj).mo15915h());
        }
        return false;
    }

    /* renamed from: h */
    public abstract String mo15915h();

    public int hashCode() {
        return mo15915h().hashCode();
    }

    /* renamed from: i */
    public abstract AbstractC8326f mo15914i();

    /* renamed from: j */
    public AbstractC8280n m15933j() {
        try {
            AbstractC8326f mo15914i = mo15914i();
            if (mo15914i.mo15780e()) {
                return mo15914i.mo15784a(C8171c.f21276y);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract void mo15913n(DataOutput dataOutput) throws IOException;

    public String toString() {
        return mo15915h();
    }
}
