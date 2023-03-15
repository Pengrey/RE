package com.google.gson;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p368ta.C10427l;
import p368ta.C10432n;
import p421wa.C11605a;
import sa.C10099a;
import sa.C10119d;

/* renamed from: com.google.gson.g */
/* loaded from: classes.dex */
public final class C4371g {

    /* renamed from: h */
    private String f11844h;

    /* renamed from: a */
    private C10119d f11837a = C10119d.f26399C;

    /* renamed from: b */
    private EnumC4382r f11838b = EnumC4382r.DEFAULT;

    /* renamed from: c */
    private InterfaceC4363e f11839c = EnumC4356d.IDENTITY;

    /* renamed from: d */
    private final Map<Type, InterfaceC4372h<?>> f11840d = new HashMap();

    /* renamed from: e */
    private final List<InterfaceC4391t> f11841e = new ArrayList();

    /* renamed from: f */
    private final List<InterfaceC4391t> f11842f = new ArrayList();

    /* renamed from: g */
    private boolean f11843g = false;

    /* renamed from: i */
    private int f11845i = 2;

    /* renamed from: j */
    private int f11846j = 2;

    /* renamed from: k */
    private boolean f11847k = false;

    /* renamed from: l */
    private boolean f11848l = false;

    /* renamed from: m */
    private boolean f11849m = true;

    /* renamed from: n */
    private boolean f11850n = false;

    /* renamed from: o */
    private boolean f11851o = false;

    /* renamed from: p */
    private boolean f11852p = false;

    /* renamed from: a */
    private void m27771a(String str, int i, int i2, List<InterfaceC4391t> list) {
        C4353a c4353a;
        C4353a c4353a2;
        C4353a c4353a3;
        if (str != null && !BuildConfig.VERSION_NAME.equals(str.trim())) {
            c4353a = new C4353a(Date.class, str);
            c4353a2 = new C4353a(Timestamp.class, str);
            c4353a3 = new C4353a(java.sql.Date.class, str);
        } else if (i == 2 || i2 == 2) {
            return;
        } else {
            C4353a c4353a4 = new C4353a(Date.class, i, i2);
            C4353a c4353a5 = new C4353a(Timestamp.class, i, i2);
            C4353a c4353a6 = new C4353a(java.sql.Date.class, i, i2);
            c4353a = c4353a4;
            c4353a2 = c4353a5;
            c4353a3 = c4353a6;
        }
        list.add(C10432n.m8002a(Date.class, c4353a));
        list.add(C10432n.m8002a(Timestamp.class, c4353a2));
        list.add(C10432n.m8002a(java.sql.Date.class, c4353a3));
    }

    /* renamed from: b */
    public C4364f m27770b() {
        List<InterfaceC4391t> arrayList = new ArrayList<>(this.f11841e.size() + this.f11842f.size() + 3);
        arrayList.addAll(this.f11841e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f11842f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m27771a(this.f11844h, this.f11845i, this.f11846j, arrayList);
        return new C4364f(this.f11837a, this.f11839c, this.f11840d, this.f11843g, this.f11847k, this.f11851o, this.f11849m, this.f11850n, this.f11852p, this.f11848l, this.f11838b, this.f11844h, this.f11845i, this.f11846j, this.f11841e, this.f11842f, arrayList);
    }

    /* renamed from: c */
    public C4371g m27769c(Type type, Object obj) {
        boolean z = obj instanceof InterfaceC4381q;
        C10099a.m9144a(z || (obj instanceof InterfaceC4375k) || (obj instanceof InterfaceC4372h) || (obj instanceof AbstractC4385s));
        if (obj instanceof InterfaceC4372h) {
            this.f11840d.put(type, (InterfaceC4372h) obj);
        }
        if (z || (obj instanceof InterfaceC4375k)) {
            this.f11841e.add(C10427l.m8004f(C11605a.m4630b(type), obj));
        }
        if (obj instanceof AbstractC4385s) {
            this.f11841e.add(C10432n.m8000c(C11605a.m4630b(type), (AbstractC4385s) obj));
        }
        return this;
    }
}
