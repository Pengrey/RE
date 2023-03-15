package p129h3;

import android.content.Context;
import java.io.Closeable;
import p129h3.AbstractC5840n;
import p356sf.FileSystem;
import p356sf.InterfaceC10187e;
import p356sf.Path;
import p396v3.C11098i;

/* renamed from: h3.o */
/* loaded from: classes.dex */
public final class C5842o {
    /* renamed from: a */
    public static final AbstractC5840n m22953a(InterfaceC10187e interfaceC10187e, Context context) {
        return new C5844q(interfaceC10187e, C11098i.m6142n(context), null);
    }

    /* renamed from: b */
    public static final AbstractC5840n m22952b(InterfaceC10187e interfaceC10187e, Context context, AbstractC5840n.AbstractC5841a abstractC5841a) {
        return new C5844q(interfaceC10187e, C11098i.m6142n(context), abstractC5841a);
    }

    /* renamed from: c */
    public static final AbstractC5840n m22951c(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        return new C5839m(path, fileSystem, str, closeable, null);
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC5840n m22950d(Path path, FileSystem fileSystem, String str, Closeable closeable, int i, Object obj) {
        if ((i & 2) != 0) {
            fileSystem = FileSystem.f26563b;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return m22951c(path, fileSystem, str, closeable);
    }
}
