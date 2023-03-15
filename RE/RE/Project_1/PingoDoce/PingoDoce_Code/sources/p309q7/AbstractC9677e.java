package p309q7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p270oa.C8056b;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.e */
/* loaded from: classes.dex */
public abstract class AbstractC9677e {

    /* renamed from: a */
    private static final C9696x f25522a;

    static {
        C9695w c9695w = new C9695w();
        C9676d.f25521a.mo667a(c9695w);
        f25522a = c9695w.m10197b();
    }

    private AbstractC9677e() {
    }

    /* renamed from: b */
    public static byte[] m10226b(Object obj) {
        C9696x c9696x = f25522a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c9696x.m10196a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public abstract C8056b m10227a();
}
