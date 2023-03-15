package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import p107ff.Headers;
import p107ff.Protocol;
import p107ff.Request;
import p107ff.Response;
import p107ff.ResponseBody;
import retrofit2.OkHttpCall;

/* loaded from: classes2.dex */
public final class Response<T> {
    @Nullable
    private final T body;
    @Nullable
    private final ResponseBody errorBody;
    private final p107ff.Response rawResponse;

    private Response(p107ff.Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t;
        this.errorBody = responseBody;
    }

    public static <T> Response<T> error(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i >= 400) {
            return error(responseBody, new Response.C5468a().m24187b(new OkHttpCall.NoContentResponseBody(responseBody.contentType(), responseBody.contentLength())).m24182g(i).m24175n("Response.error()").m24172q(Protocol.HTTP_1_1).m24170s(new Request.C5460a().m24249q("http://localhost/").m24264b()).m24186c());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> Response<T> success(@Nullable T t) {
        return success(t, new Response.C5468a().m24182g(200).m24175n("OK").m24172q(Protocol.HTTP_1_1).m24170s(new Request.C5460a().m24249q("http://localhost/").m24264b()).m24186c());
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.m24197t();
    }

    @Nullable
    public ResponseBody errorBody() {
        return this.errorBody;
    }

    public Headers headers() {
        return this.rawResponse.m24211H();
    }

    public boolean isSuccessful() {
        return this.rawResponse.m24206V();
    }

    public String message() {
        return this.rawResponse.m24210L();
    }

    public p107ff.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i, @Nullable T t) {
        if (i >= 200 && i < 300) {
            return success(t, new Response.C5468a().m24182g(i).m24175n("Response.success()").m24172q(Protocol.HTTP_1_1).m24170s(new Request.C5460a().m24249q("http://localhost/").m24264b()).m24186c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    public static <T> Response<T> error(ResponseBody responseBody, p107ff.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.m24206V()) {
            return new Response<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@Nullable T t, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        return success(t, new Response.C5468a().m24182g(200).m24175n("OK").m24172q(Protocol.HTTP_1_1).m24177l(headers).m24170s(new Request.C5460a().m24249q("http://localhost/").m24264b()).m24186c());
    }

    public static <T> Response<T> success(@Nullable T t, p107ff.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.m24206V()) {
            return new Response<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
