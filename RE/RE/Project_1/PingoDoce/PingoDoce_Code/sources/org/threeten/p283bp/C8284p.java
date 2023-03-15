package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.regex.Pattern;
import org.threeten.p283bp.zone.AbstractC8326f;
import org.threeten.p283bp.zone.ZoneRulesException;
import p405vf.C11251d;
import wf.AbstractC11665c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.p */
/* loaded from: classes2.dex */
public final class C8284p extends AbstractC8280n {

    /* renamed from: z */
    private static final Pattern f21492z = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: x */
    private final String f21493x;

    /* renamed from: y */
    private final transient AbstractC8326f f21494y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8284p(String str, AbstractC8326f abstractC8326f) {
        this.f21493x = str;
        this.f21494y = abstractC8326f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static C8284p m15912o(String str, boolean z) {
        C11251d.m5623i(str, "zoneId");
        if (str.length() >= 2 && f21492z.matcher(str).matches()) {
            AbstractC8326f abstractC8326f = null;
            try {
                abstractC8326f = AbstractC11665c.m4523b(str, true);
            } catch (ZoneRulesException e) {
                if (str.equals("GMT0")) {
                    abstractC8326f = C8282o.f21486B.mo15914i();
                } else if (z) {
                    throw e;
                }
            }
            return new C8284p(str, abstractC8326f);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    /* renamed from: p */
    private static C8284p m15911p(String str) {
        if (!str.equals("Z") && !str.startsWith("+") && !str.startsWith("-")) {
            if (!str.equals("UTC") && !str.equals("GMT") && !str.equals("UT")) {
                if (!str.startsWith("UTC+") && !str.startsWith("GMT+") && !str.startsWith("UTC-") && !str.startsWith("GMT-")) {
                    if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                        return m15912o(str, false);
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
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static AbstractC8280n m15910q(DataInput dataInput) throws IOException {
        return m15911p(dataInput.readUTF());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 7, this);
    }

    @Override // org.threeten.p283bp.AbstractC8280n
    /* renamed from: h */
    public String mo15915h() {
        return this.f21493x;
    }

    @Override // org.threeten.p283bp.AbstractC8280n
    /* renamed from: i */
    public AbstractC8326f mo15914i() {
        AbstractC8326f abstractC8326f = this.f21494y;
        return abstractC8326f != null ? abstractC8326f : AbstractC11665c.m4523b(this.f21493x, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.AbstractC8280n
    /* renamed from: n */
    public void mo15913n(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        m15909r(dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m15909r(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f21493x);
    }
}
