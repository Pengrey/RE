package com.google.gson;

import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import p368ta.C10412f;

/* renamed from: com.google.gson.s */
/* loaded from: classes.dex */
public abstract class AbstractC4385s<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapter.java */
    /* renamed from: com.google.gson.s$a */
    /* loaded from: classes.dex */
    public class C4386a extends AbstractC4385s<T> {
        C4386a() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: b */
        public T mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return (T) AbstractC4385s.this.mo27782e(c4387a);
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: d */
        public void mo27781f(C4390c c4390c, T t) throws IOException {
            if (t == null) {
                c4390c.mo8031P();
            } else {
                AbstractC4385s.this.mo27781f(c4390c, t);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC4385s<T> m27742a() {
        return new C4386a();
    }

    /* renamed from: b */
    public abstract T mo27782e(C4387a c4387a) throws IOException;

    /* renamed from: c */
    public final AbstractC4376l m27741c(T t) {
        try {
            C10412f c10412f = new C10412f();
            mo27781f(c10412f, t);
            return c10412f.m8035A0();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: d */
    public abstract void mo27781f(C4390c c4390c, T t) throws IOException;
}
