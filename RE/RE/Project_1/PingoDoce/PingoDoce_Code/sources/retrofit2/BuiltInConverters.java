package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p107ff.RequestBody;
import p107ff.ResponseBody;
import p468yc.C13195u;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    /* loaded from: classes2.dex */
    static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return Utils.buffer(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        RequestBodyConverter() {
        }

        @Override // retrofit2.Converter
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* loaded from: classes2.dex */
    static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        StreamingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        ToStringConverter() {
        }

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes2.dex */
    static final class UnitResponseBodyConverter implements Converter<ResponseBody, C13195u> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public C13195u convert(ResponseBody responseBody) {
            responseBody.close();
            return C13195u.f34156a;
        }
    }

    /* loaded from: classes2.dex */
    static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            if (Utils.isAnnotationPresent(annotationArr, Streaming.class)) {
                return StreamingResponseBodyConverter.INSTANCE;
            }
            return BufferingResponseBodyConverter.INSTANCE;
        } else if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        } else {
            if (this.checkForKotlinUnit && type == C13195u.class) {
                try {
                    return UnitResponseBodyConverter.INSTANCE;
                } catch (NoClassDefFoundError unused) {
                    this.checkForKotlinUnit = false;
                    return null;
                }
            }
            return null;
        }
    }
}
