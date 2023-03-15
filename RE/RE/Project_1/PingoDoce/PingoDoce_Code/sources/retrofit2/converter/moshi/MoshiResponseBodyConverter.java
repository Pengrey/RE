package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import p107ff.ResponseBody;
import p356sf.ByteString;
import p356sf.InterfaceC10187e;
import retrofit2.Converter;

/* loaded from: classes2.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final ByteString UTF8_BOM = ByteString.m8718d("EFBBBF");
    private final AbstractC4470f<T> adapter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MoshiResponseBodyConverter(AbstractC4470f<T> abstractC4470f) {
        this.adapter = abstractC4470f;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        InterfaceC10187e source = responseBody.source();
        try {
            ByteString byteString = UTF8_BOM;
            if (source.mo8749s(0L, byteString)) {
                source.skip(byteString.size());
            }
            AbstractC4476h m27468W = AbstractC4476h.m27468W(source);
            T mo10144b = this.adapter.mo10144b(m27468W);
            if (m27468W.mo27440X() == AbstractC4476h.EnumC4478b.END_DOCUMENT) {
                return mo10144b;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
