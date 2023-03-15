package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.C4496p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import p107ff.RequestBody;
import p107ff.ResponseBody;
import p296pc.InterfaceC8603a;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final C4496p moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(C4496p c4496p, boolean z, boolean z2, boolean z3) {
        this.moshi = c4496p;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public static MoshiConverterFactory create() {
        return create(new C4496p.C4497a().m27364a());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC8603a.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        AbstractC4470f m27367e = this.moshi.m27367e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            m27367e = m27367e.m27475e();
        }
        if (this.failOnUnknown) {
            m27367e = m27367e.m27477a();
        }
        if (this.serializeNulls) {
            m27367e = m27367e.m27473g();
        }
        return new MoshiRequestBodyConverter(m27367e);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        AbstractC4470f m27367e = this.moshi.m27367e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            m27367e = m27367e.m27475e();
        }
        if (this.failOnUnknown) {
            m27367e = m27367e.m27477a();
        }
        if (this.serializeNulls) {
            m27367e = m27367e.m27473g();
        }
        return new MoshiResponseBodyConverter(m27367e);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(C4496p c4496p) {
        Objects.requireNonNull(c4496p, "moshi == null");
        return new MoshiConverterFactory(c4496p, false, false, false);
    }
}
