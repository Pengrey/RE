package p355s9;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: s9.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10094b implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C10094b f26365a = new C10094b();

    private /* synthetic */ C10094b() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith("event");
        return startsWith;
    }
}
