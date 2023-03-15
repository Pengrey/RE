package tf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import p181jd.Intrinsics;
import p356sf.FileMetadata;
import p356sf.FileSystem;
import p356sf.Path;
import p489zc.ArrayDeque;

/* compiled from: -FileSystem.kt */
/* renamed from: tf.h */
/* loaded from: classes2.dex */
public final class C10615h {
    /* renamed from: a */
    public static final void m7509a(FileSystem fileSystem, Path path, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(fileSystem, "<this>");
        Intrinsics.isThisObjectNull(path, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (Path path2 = path; path2 != null && !fileSystem.m8660j(path2); path2 = path2.m8524i()) {
            arrayDeque.m386h(path2);
        }
        if (z && arrayDeque.isEmpty()) {
            throw new IOException(path + " already exist.");
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            fileSystem.m8664f((Path) it.next());
        }
    }

    /* renamed from: b */
    public static final boolean m7508b(FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.isThisObjectNull(fileSystem, "<this>");
        Intrinsics.isThisObjectNull(path, "path");
        return fileSystem.m8657m(path) != null;
    }

    /* renamed from: c */
    public static final FileMetadata m7507c(FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.isThisObjectNull(fileSystem, "<this>");
        Intrinsics.isThisObjectNull(path, "path");
        FileMetadata m8657m = fileSystem.m8657m(path);
        if (m8657m != null) {
            return m8657m;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
