package p222lf;

import java.io.IOException;
import okhttp3.internal.connection.RealConnection;
import p107ff.Request;
import p107ff.Response;
import p356sf.InterfaceC10189f0;
import p356sf.InterfaceC10191h0;

/* renamed from: lf.d */
/* loaded from: classes2.dex */
public interface InterfaceC7051d {
    /* renamed from: a */
    void mo19471a() throws IOException;

    /* renamed from: b */
    InterfaceC10191h0 mo19470b(Response response) throws IOException;

    /* renamed from: c */
    void mo19469c() throws IOException;

    void cancel();

    /* renamed from: d */
    long mo19468d(Response response) throws IOException;

    /* renamed from: e */
    InterfaceC10189f0 mo19467e(Request request, long j) throws IOException;

    /* renamed from: f */
    Response.C5468a mo19466f(boolean z) throws IOException;

    /* renamed from: g */
    void mo19465g(Request request) throws IOException;

    /* renamed from: k */
    RealConnection mo19464k();
}
