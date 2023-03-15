package p356sf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p489zc.MutableCollectionsJVM;

/* renamed from: sf.r */
/* loaded from: classes2.dex */
public class JvmSystemFileSystem extends FileSystem {
    /* renamed from: r */
    private final List m8573r(Path path, boolean z) {
        File m8520m = path.m8520m();
        String[] list = m8520m.list();
        if (list == null) {
            if (z) {
                if (m8520m.exists()) {
                    throw new IOException("failed to list " + path);
                }
                throw new FileNotFoundException("no such file: " + path);
            } else {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.checkIfNull(str, "it");
            arrayList.add(path.m8522k(str));
        }
        MutableCollectionsJVM.m185s(arrayList);
        return arrayList;
    }

    /* renamed from: s */
    private final void m8572s(Path path) {
        if (m8660j(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    /* renamed from: t */
    private final void m8571t(Path path) {
        if (m8660j(path)) {
            return;
        }
        throw new IOException(path + " doesn't exist.");
    }

    /* renamed from: b */
    public InterfaceC10189f0 m8582b(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "file");
        if (z) {
            m8571t(path);
        }
        return C10200t.m8563e(path.m8520m(), true);
    }

    /* renamed from: c */
    public void m8581c(Path path, Path path2) {
        Intrinsics.isThisObjectNull(path, "source");
        Intrinsics.isThisObjectNull(path2, "target");
        if (path.m8520m().renameTo(path2.m8520m())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + path2);
    }

    /* renamed from: g */
    public void m8580g(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "dir");
        if (path.m8520m().mkdir()) {
            return;
        }
        FileMetadata m8577m = m8577m(path);
        boolean z2 = true;
        if (m8577m == null || !m8577m.m8671f()) {
            z2 = false;
        }
        if (!z2) {
            throw new IOException("failed to create directory: " + path);
        } else if (z) {
            throw new IOException(path + " already exist.");
        }
    }

    /* renamed from: i */
    public void m8579i(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "path");
        File m8520m = path.m8520m();
        if (m8520m.delete()) {
            return;
        }
        if (m8520m.exists()) {
            throw new IOException("failed to delete " + path);
        } else if (z) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    /* renamed from: k */
    public List m8578k(Path path) {
        Intrinsics.isThisObjectNull(path, "dir");
        List m8573r = m8573r(path, true);
        Intrinsics.ifNullDoSomething(m8573r);
        return m8573r;
    }

    /* renamed from: m */
    public FileMetadata m8577m(Path path) {
        Intrinsics.isThisObjectNull(path, "path");
        File m8520m = path.m8520m();
        boolean isFile = m8520m.isFile();
        boolean isDirectory = m8520m.isDirectory();
        long lastModified = m8520m.lastModified();
        long length = m8520m.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || m8520m.exists()) {
            return new FileMetadata(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    /* renamed from: n */
    public FileHandle m8576n(Path path) {
        Intrinsics.isThisObjectNull(path, "file");
        return new JvmFileHandle(false, new RandomAccessFile(path.m8520m(), "r"));
    }

    /* renamed from: p */
    public InterfaceC10189f0 m8575p(Path path, boolean z) {
        InterfaceC10189f0 m8551f;
        Intrinsics.isThisObjectNull(path, "file");
        if (z) {
            m8572s(path);
        }
        m8551f = C10201u.m8551f(path.m8520m(), false, 1, null);
        return m8551f;
    }

    /* renamed from: q */
    public InterfaceC10191h0 m8574q(Path path) {
        Intrinsics.isThisObjectNull(path, "file");
        return C10200t.m8559i(path.m8520m());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
