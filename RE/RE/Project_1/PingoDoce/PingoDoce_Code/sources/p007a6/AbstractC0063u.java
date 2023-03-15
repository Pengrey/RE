package p007a6;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p174j6.InterfaceC6313d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.u */
/* loaded from: classes.dex */
public abstract class AbstractC0063u implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransportRuntimeComponent.java */
    /* renamed from: a6.u$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0064a {
        /* renamed from: a */
        InterfaceC0064a mo42024a(Context context);

        AbstractC0063u build();
    }

    /* renamed from: a */
    abstract InterfaceC6313d mo42026a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C0062t mo42025c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo42026a().close();
    }
}
