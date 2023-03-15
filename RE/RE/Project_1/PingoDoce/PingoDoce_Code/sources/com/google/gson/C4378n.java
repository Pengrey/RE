package com.google.gson;

import java.util.Map;
import java.util.Set;
import sa.C10124h;

/* renamed from: com.google.gson.n */
/* loaded from: classes.dex */
public final class C4378n extends AbstractC4376l {

    /* renamed from: a */
    private final C10124h<String, AbstractC4376l> f11855a = new C10124h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4378n) && ((C4378n) obj).f11855a.equals(this.f11855a));
    }

    public int hashCode() {
        return this.f11855a.hashCode();
    }

    /* renamed from: u */
    public void m27757u(String str, AbstractC4376l abstractC4376l) {
        C10124h<String, AbstractC4376l> c10124h = this.f11855a;
        if (abstractC4376l == null) {
            abstractC4376l = C4377m.f11854a;
        }
        c10124h.put(str, abstractC4376l);
    }

    /* renamed from: v */
    public Set<Map.Entry<String, AbstractC4376l>> m27756v() {
        return this.f11855a.entrySet();
    }

    /* renamed from: x */
    public AbstractC4376l m27755x(String str) {
        return this.f11855a.get(str);
    }

    /* renamed from: y */
    public boolean m27754y(String str) {
        return this.f11855a.containsKey(str);
    }
}
