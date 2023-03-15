package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p107ff.FormBody;
import p107ff.Headers;
import p107ff.HttpUrl;
import p107ff.MediaType;
import p107ff.MultipartBody;
import p107ff.Request;
import p107ff.RequestBody;
import p356sf.Buffer;
import p356sf.InterfaceC10186d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final HttpUrl baseUrl;
    @Nullable
    private RequestBody body;
    @Nullable
    private MediaType contentType;
    @Nullable
    private FormBody.C5493a formBuilder;
    private final boolean hasBody;
    private final Headers.C5498a headersBuilder;
    private final String method;
    @Nullable
    private MultipartBody.C5506a multipartBuilder;
    @Nullable
    private String relativeUrl;
    private final Request.C5460a requestBuilder = new Request.C5460a();
    @Nullable
    private HttpUrl.C5500a urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* loaded from: classes2.dex */
    private static class ContentTypeOverridingRequestBody extends RequestBody {
        private final MediaType contentType;
        private final RequestBody delegate;

        ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.delegate = requestBody;
            this.contentType = mediaType;
        }

        @Override // p107ff.RequestBody
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // p107ff.RequestBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // p107ff.RequestBody
        public void writeTo(InterfaceC10186d interfaceC10186d) throws IOException {
            this.delegate.writeTo(interfaceC10186d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestBuilder(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        this.contentType = mediaType;
        this.hasBody = z;
        if (headers != null) {
            this.headersBuilder = headers.m24011l();
        } else {
            this.headersBuilder = new Headers.C5498a();
        }
        if (z2) {
            this.formBuilder = new FormBody.C5493a();
        } else if (z3) {
            MultipartBody.C5506a c5506a = new MultipartBody.C5506a();
            this.multipartBuilder = c5506a;
            c5506a.m23902d(MultipartBody.f15572h);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                Buffer buffer = new Buffer();
                buffer.m8813J0(str, 0, i);
                canonicalizeForPath(buffer, str, i, length, z);
                return buffer.m8801d0();
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.m24025b(str, str2);
        } else {
            this.formBuilder.m24026a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.contentType = MediaType.m23912e(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        }
        this.headersBuilder.m24007a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addHeaders(Headers headers) {
        this.headersBuilder.m24006b(headers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPart(Headers headers, RequestBody requestBody) {
        this.multipartBuilder.m23905a(headers, requestBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl != null) {
            String canonicalizeForPath = canonicalizeForPath(str2, z);
            String str3 = this.relativeUrl;
            String replace = str3.replace("{" + str + "}", canonicalizeForPath);
            if (!PATH_TRAVERSAL.matcher(replace).matches()) {
                this.relativeUrl = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addQueryParam(String str, @Nullable String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            HttpUrl.C5500a m23980l = this.baseUrl.m23980l(str3);
            this.urlBuilder = m23980l;
            if (m23980l != null) {
                this.relativeUrl = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        if (z) {
            this.urlBuilder.m23965a(str, str2);
        } else {
            this.urlBuilder.m23964b(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void addTag(Class<T> cls, @Nullable T t) {
        this.requestBuilder.m24251o(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request.C5460a get() {
        HttpUrl m23975q;
        HttpUrl.C5500a c5500a = this.urlBuilder;
        if (c5500a != null) {
            m23975q = c5500a.m23963c();
        } else {
            m23975q = this.baseUrl.m23975q(this.relativeUrl);
            if (m23975q == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        ContentTypeOverridingRequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            FormBody.C5493a c5493a = this.formBuilder;
            if (c5493a != null) {
                contentTypeOverridingRequestBody = c5493a.m24024c();
            } else {
                MultipartBody.C5506a c5506a = this.multipartBuilder;
                if (c5506a != null) {
                    contentTypeOverridingRequestBody = c5506a.m23903c();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.contentType;
        if (mediaType != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, mediaType);
            } else {
                this.headersBuilder.m24007a("Content-Type", mediaType.toString());
            }
        }
        return this.requestBuilder.m24250p(m23975q).m24259g(this.headersBuilder.m24002f()).m24258h(this.method, contentTypeOverridingRequestBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPart(MultipartBody.C5508c c5508c) {
        this.multipartBuilder.m23904b(c5508c);
    }

    private static void canonicalizeForPath(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    buffer.m8812K0(codePointAt);
                } else {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.m8812K0(codePointAt);
                    while (!buffer2.mo8762Q()) {
                        int readByte = buffer2.readByte() & 255;
                        buffer.m8791x0(37);
                        char[] cArr = HEX_DIGITS;
                        buffer.m8791x0(cArr[(readByte >> 4) & 15]);
                        buffer.m8791x0(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }
}
