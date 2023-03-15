package p396v3;

import java.io.FileNotFoundException;
import java.io.IOException;
import p356sf.FileSystem;
import p356sf.Path;

/* renamed from: v3.e */
/* loaded from: classes.dex */
public final class C11093e {
    /* renamed from: a */
    public static final void m6163a(FileSystem fileSystem, Path path) {
        if (fileSystem.m8660j(path)) {
            return;
        }
        C11098i.m6152d(fileSystem.m8655o(path));
    }

    /* renamed from: b */
    public static final void m6162b(FileSystem fileSystem, Path path) {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.m8659k(path)) {
                try {
                    if (fileSystem.m8658l(path2).m8671f()) {
                        m6162b(fileSystem, path2);
                    }
                    fileSystem.m8662h(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
