package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.lifecycle.InterfaceC1491v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p413w2.C11551b;

/* renamed from: androidx.loader.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC1497a {

    /* compiled from: LoaderManager.java */
    /* renamed from: androidx.loader.app.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1498a<D> {
        /* renamed from: a */
        void mo33562a(C11551b<D> c11551b, D d);

        /* renamed from: b */
        void mo33561b(C11551b<D> c11551b);

        /* renamed from: c */
        C11551b<D> mo33560c(int i, Bundle bundle);
    }

    /* renamed from: b */
    public static <T extends InterfaceC1491v & InterfaceC1488t0> AbstractC1497a m36943b(T t) {
        return new C1499b(t, t.mo36970z());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo36942a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C11551b<D> mo36941c(int i, Bundle bundle, InterfaceC1498a<D> interfaceC1498a);

    /* renamed from: d */
    public abstract void mo36940d();
}
