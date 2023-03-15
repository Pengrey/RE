package p232m3;

import java.io.File;
import p305q3.C9635k;

/* renamed from: m3.a */
/* loaded from: classes.dex */
public final class C7112a implements InterfaceC7113b<File> {

    /* renamed from: a */
    private final boolean f18879a;

    public C7112a(boolean z) {
        this.f18879a = z;
    }

    @Override // p232m3.InterfaceC7113b
    /* renamed from: b */
    public String mo19194b(File file, C9635k c9635k) {
        if (this.f18879a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
