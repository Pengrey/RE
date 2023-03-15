package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p107ff.RequestBody;
import p107ff.ResponseBody;

/* loaded from: classes2.dex */
public interface Converter<F, T> {

    /* loaded from: classes2.dex */
    public static abstract class Factory {
        /* JADX INFO: Access modifiers changed from: protected */
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Class<?> getRawType(Type type) {
            return Utils.getRawType(type);
        }

        @Nullable
        public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        @Nullable
        public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        @Nullable
        public Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    @Nullable
    T convert(F f) throws IOException;
}
