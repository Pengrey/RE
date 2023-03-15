package p356sf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p489zc.MutableCollectionsJVM;

/* renamed from: sf.j */
/* loaded from: classes2.dex */
public abstract class ForwardingFileSystem extends FileSystem {

    /* renamed from: c */
    private final FileSystem f26568c;

    public ForwardingFileSystem(FileSystem fileSystem) {
        Intrinsics.isThisObjectNull(fileSystem, "delegate");
        this.f26568c = fileSystem;
    }

    /* renamed from: b */
    public InterfaceC10189f0 m8641b(Path path, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(path, "file");
        return this.f26568c.m8668b(m8632r(path, "appendingSink", "file"), z);
    }

    /* renamed from: c */
    public void m8640c(Path path, Path path2) throws IOException {
        Intrinsics.isThisObjectNull(path, "source");
        Intrinsics.isThisObjectNull(path2, "target");
        this.f26568c.m8667c(m8632r(path, "atomicMove", "source"), m8632r(path2, "atomicMove", "target"));
    }

    /* renamed from: g */
    public void m8639g(Path path, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(path, "dir");
        this.f26568c.m8663g(m8632r(path, "createDirectory", "dir"), z);
    }

    /* renamed from: i */
    public void m8638i(Path path, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(path, "path");
        this.f26568c.m8661i(m8632r(path, "delete", "path"), z);
    }

    /* renamed from: k */
    public List m8637k(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "dir");
        List<Path> m8659k = this.f26568c.m8659k(m8632r(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        for (Path path2 : m8659k) {
            arrayList.add(m8631s(path2, "list"));
        }
        MutableCollectionsJVM.m185s(arrayList);
        return arrayList;
    }

    /* renamed from: m */
    public FileMetadata m8636m(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "path");
        FileMetadata m8657m = this.f26568c.m8657m(m8632r(path, "metadataOrNull", "path"));
        if (m8657m == null) {
            return null;
        }
        return m8657m.m8672e() == null ? m8657m : FileMetadata.m8675b(m8657m, false, false, m8631s(m8657m.m8672e(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    /* renamed from: n */
    public FileHandle m8635n(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "file");
        return this.f26568c.m8656n(m8632r(path, "openReadOnly", "file"));
    }

    /* renamed from: p */
    public InterfaceC10189f0 m8634p(Path path, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(path, "file");
        return this.f26568c.m8654p(m8632r(path, "sink", "file"), z);
    }

    /* renamed from: q */
    public InterfaceC10191h0 m8633q(Path path) throws IOException {
        Intrinsics.isThisObjectNull(path, "file");
        return this.f26568c.m8653q(m8632r(path, "source", "file"));
    }

    /* renamed from: r */
    public Path m8632r(Path path, String str, String str2) {
        Intrinsics.isThisObjectNull(path, "path");
        Intrinsics.isThisObjectNull(str, "functionName");
        Intrinsics.isThisObjectNull(str2, "parameterName");
        return path;
    }

    /* renamed from: s */
    public Path m8631s(Path path, String str) {
        Intrinsics.isThisObjectNull(path, "path");
        Intrinsics.isThisObjectNull(str, "functionName");
        return path;
    }

    public String toString() {
        return C6450z.m20906b(getClass()).mo10119a() + '(' + this.f26568c + ')';
    }
}
