package com.google.gson;

import com.google.gson.stream.C4390c;
import java.io.IOException;
import java.io.StringWriter;
import sa.C10135l;

/* renamed from: com.google.gson.l */
/* loaded from: classes.dex */
public abstract class AbstractC4376l {
    /* renamed from: b */
    public C4373i m27764b() {
        if (m27761o()) {
            return (C4373i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: f */
    public C4378n m27763f() {
        if (m27759q()) {
            return (C4378n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: g */
    public C4379o m27762g() {
        if (m27758t()) {
            return (C4379o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public long mo27749h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: l */
    public String mo27748l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: o */
    public boolean m27761o() {
        return this instanceof C4373i;
    }

    /* renamed from: p */
    public boolean m27760p() {
        return this instanceof C4377m;
    }

    /* renamed from: q */
    public boolean m27759q() {
        return this instanceof C4378n;
    }

    /* renamed from: t */
    public boolean m27758t() {
        return this instanceof C4379o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C4390c c4390c = new C4390c(stringWriter);
            c4390c.m27708e0(true);
            C10135l.m9076b(this, c4390c);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
