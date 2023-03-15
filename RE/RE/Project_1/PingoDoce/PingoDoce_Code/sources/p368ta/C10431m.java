package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p368ta.C10419i;
import p421wa.C11605a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ta.m */
/* loaded from: classes2.dex */
public final class C10431m<T> extends AbstractC4385s<T> {

    /* renamed from: a */
    private final C4364f f27104a;

    /* renamed from: b */
    private final AbstractC4385s<T> f27105b;

    /* renamed from: c */
    private final Type f27106c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10431m(C4364f c4364f, AbstractC4385s<T> abstractC4385s, Type type) {
        this.f27104a = c4364f;
        this.f27105b = abstractC4385s;
        this.f27106c = type;
    }

    /* renamed from: e */
    private Type m8003e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: b */
    public T mo27782e(C4387a c4387a) throws IOException {
        return this.f27105b.mo27782e(c4387a);
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: d */
    public void mo27781f(C4390c c4390c, T t) throws IOException {
        AbstractC4385s<T> abstractC4385s = this.f27105b;
        Type m8003e = m8003e(this.f27106c, t);
        if (m8003e != this.f27106c) {
            abstractC4385s = this.f27104a.m27794l(C11605a.m4630b(m8003e));
            if (abstractC4385s instanceof C10419i.C10421b) {
                AbstractC4385s<T> abstractC4385s2 = this.f27105b;
                if (!(abstractC4385s2 instanceof C10419i.C10421b)) {
                    abstractC4385s = abstractC4385s2;
                }
            }
        }
        abstractC4385s.mo27781f(c4390c, t);
    }
}
