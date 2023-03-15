package p356sf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p181jd.Intrinsics;
import sd.C10171u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* renamed from: sf.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10201u {

    /* renamed from: a */
    private static final Logger f26589a = Logger.getLogger("okio.Okio");

    /* renamed from: a */
    public static final /* synthetic */ Logger m8556a() {
        return f26589a;
    }

    /* renamed from: b */
    public static final boolean m8555b(AssertionError assertionError) {
        Intrinsics.isThisObjectNull(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message != null ? C10171u.m8922H(message, "getsockname failed", false, 2, null) : false;
        }
        return false;
    }

    /* renamed from: c */
    public static final InterfaceC10189f0 m8554c(File file, boolean z) throws FileNotFoundException {
        Intrinsics.isThisObjectNull(file, "<this>");
        return C10200t.m8562f(new FileOutputStream(file, z));
    }

    /* renamed from: d */
    public static final InterfaceC10189f0 m8553d(OutputStream outputStream) {
        Intrinsics.isThisObjectNull(outputStream, "<this>");
        return new C10204x(outputStream, new Timeout());
    }

    /* renamed from: e */
    public static final InterfaceC10189f0 m8552e(Socket socket) throws IOException {
        Intrinsics.isThisObjectNull(socket, "<this>");
        JvmOkio jvmOkio = new JvmOkio(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkIfNull(outputStream, "getOutputStream()");
        return jvmOkio.m8838x(new C10204x(outputStream, jvmOkio));
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC10189f0 m8551f(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return C10200t.m8563e(file, z);
    }

    /* renamed from: g */
    public static final InterfaceC10191h0 m8550g(File file) throws FileNotFoundException {
        Intrinsics.isThisObjectNull(file, "<this>");
        return new C10199p(new FileInputStream(file), Timeout.f26564d);
    }

    /* renamed from: h */
    public static final InterfaceC10191h0 m8549h(InputStream inputStream) {
        Intrinsics.isThisObjectNull(inputStream, "<this>");
        return new C10199p(inputStream, new Timeout());
    }

    /* renamed from: i */
    public static final InterfaceC10191h0 m8548i(Socket socket) throws IOException {
        Intrinsics.isThisObjectNull(socket, "<this>");
        JvmOkio jvmOkio = new JvmOkio(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkIfNull(inputStream, "getInputStream()");
        return jvmOkio.m8837y(new C10199p(inputStream, jvmOkio));
    }
}
