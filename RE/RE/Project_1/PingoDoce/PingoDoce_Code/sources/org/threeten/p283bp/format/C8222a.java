package org.threeten.p283bp.format;

import java.util.HashMap;
import java.util.Map;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import p387uf.C10878b;
import p405vf.AbstractC11250c;
import p405vf.C11251d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.format.a */
/* loaded from: classes2.dex */
public final class C8222a extends AbstractC11250c implements Cloneable {

    /* renamed from: A */
    C8219f f21382A;

    /* renamed from: B */
    boolean f21383B;

    /* renamed from: C */
    C10878b f21384C;

    /* renamed from: w */
    final Map<InterfaceC8304h, Long> f21385w = new HashMap();

    /* renamed from: x */
    AbstractC8188h f21386x;

    /* renamed from: y */
    AbstractC8280n f21387y;

    /* renamed from: z */
    AbstractC8176b f21388z;

    /* renamed from: g */
    private Long m16092g(InterfaceC8304h interfaceC8304h) {
        return this.f21385w.get(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        C11251d.m5623i(interfaceC8304h, "field");
        Long m16092g = m16092g(interfaceC8304h);
        if (m16092g == null) {
            AbstractC8176b abstractC8176b = this.f21388z;
            if (abstractC8176b != null && abstractC8176b.isSupported(interfaceC8304h)) {
                return this.f21388z.getLong(interfaceC8304h);
            }
            C8219f c8219f = this.f21382A;
            if (c8219f != null && c8219f.isSupported(interfaceC8304h)) {
                return this.f21382A.getLong(interfaceC8304h);
            }
            throw new DateTimeException("Field not found: " + interfaceC8304h);
        }
        return m16092g.longValue();
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        AbstractC8176b abstractC8176b;
        C8219f c8219f;
        if (interfaceC8304h == null) {
            return false;
        }
        return this.f21385w.containsKey(interfaceC8304h) || ((abstractC8176b = this.f21388z) != null && abstractC8176b.isSupported(interfaceC8304h)) || ((c8219f = this.f21382A) != null && c8219f.isSupported(interfaceC8304h));
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15863g()) {
            return (R) this.f21387y;
        }
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) this.f21386x;
        }
        if (interfaceC8313j == C8305i.m15868b()) {
            AbstractC8176b abstractC8176b = this.f21388z;
            if (abstractC8176b != null) {
                return (R) C8213d.m16160z(abstractC8176b);
            }
            return null;
        } else if (interfaceC8313j == C8305i.m15867c()) {
            return (R) this.f21382A;
        } else {
            if (interfaceC8313j != C8305i.m15864f() && interfaceC8313j != C8305i.m15866d()) {
                if (interfaceC8313j == C8305i.m15865e()) {
                    return null;
                }
                return interfaceC8313j.mo16124b(this);
            }
            return interfaceC8313j.mo16124b(this);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("DateTimeBuilder[");
        if (this.f21385w.size() > 0) {
            sb2.append("fields=");
            sb2.append(this.f21385w);
        }
        sb2.append(", ");
        sb2.append(this.f21386x);
        sb2.append(", ");
        sb2.append(this.f21387y);
        sb2.append(", ");
        sb2.append(this.f21388z);
        sb2.append(", ");
        sb2.append(this.f21382A);
        sb2.append(']');
        return sb2.toString();
    }
}
