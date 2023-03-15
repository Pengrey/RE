package coil.network;

import p107ff.Response;

/* compiled from: HttpException.kt */
/* loaded from: classes.dex */
public final class HttpException extends RuntimeException {
    public HttpException(Response response) {
        super("HTTP " + response.m24197t() + ": " + response.m24210L());
    }
}
