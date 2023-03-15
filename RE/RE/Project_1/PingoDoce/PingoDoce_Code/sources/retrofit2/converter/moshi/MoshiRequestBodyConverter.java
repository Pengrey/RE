package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4483m;
import java.io.IOException;
import p107ff.MediaType;
import p107ff.RequestBody;
import p356sf.Buffer;
import retrofit2.Converter;

/* loaded from: classes2.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.m23912e("application/json; charset=UTF-8");
    private final AbstractC4470f<T> adapter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MoshiRequestBodyConverter(AbstractC4470f<T> abstractC4470f) {
        this.adapter = abstractC4470f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((MoshiRequestBodyConverter<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        Buffer buffer = new Buffer();
        this.adapter.mo10143i(AbstractC4483m.m27415L(buffer), t);
        return RequestBody.create(MEDIA_TYPE, buffer.mo8751r());
    }
}
