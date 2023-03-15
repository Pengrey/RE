package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.i */
/* loaded from: classes.dex */
public final class C4373i extends AbstractC4376l implements Iterable<AbstractC4376l> {

    /* renamed from: w */
    private final List<AbstractC4376l> f11853w = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4373i) && ((C4373i) obj).f11853w.equals(this.f11853w));
    }

    @Override // com.google.gson.AbstractC4376l
    /* renamed from: h */
    public long mo27749h() {
        if (this.f11853w.size() == 1) {
            return this.f11853w.get(0).mo27749h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f11853w.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC4376l> iterator() {
        return this.f11853w.iterator();
    }

    @Override // com.google.gson.AbstractC4376l
    /* renamed from: l */
    public String mo27748l() {
        if (this.f11853w.size() == 1) {
            return this.f11853w.get(0).mo27748l();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.f11853w.size();
    }

    /* renamed from: u */
    public void m27767u(AbstractC4376l abstractC4376l) {
        if (abstractC4376l == null) {
            abstractC4376l = C4377m.f11854a;
        }
        this.f11853w.add(abstractC4376l);
    }

    /* renamed from: v */
    public AbstractC4376l m27766v(int i) {
        return this.f11853w.get(i);
    }
}
