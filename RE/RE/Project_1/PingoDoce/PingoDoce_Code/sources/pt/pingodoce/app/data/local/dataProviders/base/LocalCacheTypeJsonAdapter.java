package pt.pingodoce.app.data.local.dataProviders.base;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Set;
import org.threeten.p283bp.C8216e;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: LocalCacheTypeJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class LocalCacheTypeJsonAdapter<T> extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22373a;

    /* renamed from: b */
    private final AbstractC4470f f22374b;

    /* renamed from: c */
    private final AbstractC4470f f22375c;

    public LocalCacheTypeJsonAdapter(C4496p c4496p, Type[] typeArr) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        Intrinsics.isThisObjectNull(typeArr, "types");
        if (typeArr.length == 1) {
            AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("refreshDate", "expiryDate", "value");
            Intrinsics.checkIfNull(m27461a, "of(\"refreshDate\", \"expiryDate\",\n      \"value\")");
            this.f22373a = m27461a;
            m208b = C13778q0.m208b();
            AbstractC4470f<T> m27366f = c4496p.m27366f(C8216e.class, m208b, "refreshDate");
            Intrinsics.checkIfNull(m27366f, "moshi.adapter(LocalDateT…mptySet(), \"refreshDate\")");
            this.f22374b = m27366f;
            Type type = typeArr[0];
            m208b2 = C13778q0.m208b();
            AbstractC4470f<T> m27366f2 = c4496p.m27366f(type, m208b2, "value");
            Intrinsics.checkIfNull(m27366f2, "moshi.adapter(types[0], emptySet(), \"value\")");
            this.f22375c = m27366f2;
            return;
        }
        String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + typeArr.length;
        Intrinsics.checkIfNull(str, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: k */
    public HashMapLocalDataProvider mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        C8216e c8216e = null;
        C8216e c8216e2 = null;
        Object obj = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22373a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                c8216e = (C8216e) this.f22374b.mo10144b(abstractC4476h);
                if (c8216e == null) {
                    JsonDataException m10121v = C9712b.m10121v("refreshDate", "refreshDate", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"refreshD…\", \"refreshDate\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                c8216e2 = (C8216e) this.f22374b.mo10144b(abstractC4476h);
                if (c8216e2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("expiryDate", "expiryDate", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"expiryDate\", \"expiryDate\", reader)");
                    throw m10121v2;
                }
            } else if (mo27436d0 == 2 && (obj = this.f22375c.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v3 = C9712b.m10121v("value__", "value", abstractC4476h);
                Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"value__\"…         \"value\", reader)");
                throw m10121v3;
            }
        }
        abstractC4476h.mo27433h();
        if (c8216e == null) {
            JsonDataException m10129n = C9712b.m10129n("refreshDate", "refreshDate", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"refresh…ate\",\n            reader)");
            throw m10129n;
        } else if (c8216e2 == null) {
            JsonDataException m10129n2 = C9712b.m10129n("expiryDate", "expiryDate", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"expiryD…e\", \"expiryDate\", reader)");
            throw m10129n2;
        } else if (obj != null) {
            return new HashMapLocalDataProvider(c8216e, c8216e2, obj);
        } else {
            JsonDataException m10129n3 = C9712b.m10129n("value__", "value", abstractC4476h);
            Intrinsics.checkIfNull(m10129n3, "missingProperty(\"value__\", \"value\", reader)");
            throw m10129n3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, HashMapLocalDataProvider hashMapLocalDataProvider) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(hashMapLocalDataProvider, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("refreshDate");
        this.f22374b.mo10143i(abstractC4483m, hashMapLocalDataProvider.m14780d());
        abstractC4483m.mo27417F("expiryDate");
        this.f22374b.mo10143i(abstractC4483m, hashMapLocalDataProvider.m14781c());
        abstractC4483m.mo27417F("value");
        this.f22375c.mo10143i(abstractC4483m, hashMapLocalDataProvider.m14779e());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LocalCacheType");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
