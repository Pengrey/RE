package p483z5;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: z5.n */
/* loaded from: classes.dex */
public abstract class AbstractC13691n {
    /* renamed from: a */
    static AbstractC13691n m589a(long j) {
        return new C13679h(j);
    }

    /* renamed from: b */
    public static AbstractC13691n m588b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return m589a(Long.parseLong(jsonReader.nextString()));
                    }
                    return m589a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo587c();
}
