package retrofit2;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p107ff.InterfaceC5469e;
import p107ff.InterfaceC5474f;
import p107ff.MediaType;
import p107ff.Request;
import p107ff.ResponseBody;
import p356sf.Buffer;
import p356sf.C10200t;
import p356sf.ForwardingSource;
import p356sf.InterfaceC10187e;
import p356sf.Timeout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final InterfaceC5469e.InterfaceC5470a callFactory;
    private volatile boolean canceled;
    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;
    @GuardedBy("this")
    private boolean executed;
    @GuardedBy("this")
    @Nullable
    private InterfaceC5469e rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final InterfaceC10187e delegateSource;
        @Nullable
        IOException thrownException;

        ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = C10200t.m8565c(new ForwardingSource(responseBody.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // p356sf.ForwardingSource, p356sf.InterfaceC10191h0
                public long read(Buffer buffer, long j) throws IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // p107ff.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // p107ff.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // p107ff.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // p107ff.ResponseBody
        public InterfaceC10187e source() {
            return this.delegateSource;
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        @Nullable
        private final MediaType contentType;

        /* JADX INFO: Access modifiers changed from: package-private */
        public NoContentResponseBody(@Nullable MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // p107ff.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // p107ff.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // p107ff.ResponseBody
        public InterfaceC10187e source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, InterfaceC5469e.InterfaceC5470a interfaceC5470a, Converter<ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = interfaceC5470a;
        this.responseConverter = converter;
    }

    private InterfaceC5469e createRawCall() throws IOException {
        InterfaceC5469e mo24161a = this.callFactory.mo24161a(this.requestFactory.create(this.args));
        Objects.requireNonNull(mo24161a, "Call.Factory returned null.");
        return mo24161a;
    }

    @GuardedBy("this")
    private InterfaceC5469e getRawCall() throws IOException {
        InterfaceC5469e interfaceC5469e = this.rawCall;
        if (interfaceC5469e != null) {
            return interfaceC5469e;
        }
        Throwable th2 = this.creationFailure;
        if (th2 != null) {
            if (!(th2 instanceof IOException)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw ((Error) th2);
            }
            throw ((IOException) th2);
        }
        try {
            InterfaceC5469e createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        InterfaceC5469e interfaceC5469e;
        this.canceled = true;
        synchronized (this) {
            interfaceC5469e = this.rawCall;
        }
        if (interfaceC5469e != null) {
            interfaceC5469e.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        InterfaceC5469e interfaceC5469e;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                interfaceC5469e = this.rawCall;
                th2 = this.creationFailure;
                if (interfaceC5469e == null && th2 == null) {
                    InterfaceC5469e createRawCall = createRawCall();
                    this.rawCall = createRawCall;
                    interfaceC5469e = createRawCall;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.canceled) {
            interfaceC5469e.cancel();
        }
        interfaceC5469e.mo24162E(new InterfaceC5474f() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th3) {
                try {
                    callback.onFailure(OkHttpCall.this, th3);
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    th4.printStackTrace();
                }
            }

            @Override // p107ff.InterfaceC5474f
            public void onFailure(InterfaceC5469e interfaceC5469e2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // p107ff.InterfaceC5474f
            public void onResponse(InterfaceC5469e interfaceC5469e2, p107ff.Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response));
                    } catch (Throwable th3) {
                        Utils.throwIfFatal(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    callFailure(th4);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        InterfaceC5469e rawCall;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                rawCall = getRawCall();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(rawCall.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            InterfaceC5469e interfaceC5469e = this.rawCall;
            if (interfaceC5469e == null || !interfaceC5469e.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    Response<T> parseResponse(p107ff.Response response) throws IOException {
        ResponseBody m24203a = response.m24203a();
        p107ff.Response m24186c = response.m24208P().m24187b(new NoContentResponseBody(m24203a.contentType(), m24203a.contentLength())).m24186c();
        int m24197t = m24186c.m24197t();
        if (m24197t < 200 || m24197t >= 300) {
            try {
                return Response.error(Utils.buffer(m24203a), m24186c);
            } finally {
                m24203a.close();
            }
        } else if (m24197t != 204 && m24197t != 205) {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(m24203a);
            try {
                return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), m24186c);
            } catch (RuntimeException e) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw e;
            }
        } else {
            m24203a.close();
            return Response.success((Object) null, m24186c);
        }
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized Timeout timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return getRawCall().mo40276timeout();
    }

    @Override // retrofit2.Call
    /* renamed from: clone */
    public OkHttpCall<T> mo39647clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
