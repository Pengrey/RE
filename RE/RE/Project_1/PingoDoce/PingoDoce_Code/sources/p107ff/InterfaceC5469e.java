package p107ff;

import java.io.IOException;
import p356sf.Timeout;

/* renamed from: ff.e */
/* loaded from: classes2.dex */
public interface InterfaceC5469e extends Cloneable {

    /* compiled from: Call.kt */
    /* renamed from: ff.e$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5470a {
        /* renamed from: a */
        InterfaceC5469e mo24161a(Request request);
    }

    /* renamed from: E */
    void mo24162E(InterfaceC5474f interfaceC5474f);

    void cancel();

    Response execute() throws IOException;

    boolean isCanceled();

    Request request();

    /* renamed from: timeout */
    Timeout mo40276timeout();
}
