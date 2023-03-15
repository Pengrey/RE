package p356sf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p181jd.Intrinsics;
import p356sf.Path;

@IgnoreJRERequirement
/* renamed from: sf.s */
/* loaded from: classes2.dex */
public final class NioSystemFileSystem extends JvmSystemFileSystem {
    /* renamed from: u */
    private final Long m8568u(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    /* renamed from: c */
    public void m8570c(Path path, Path path2) {
        Intrinsics.isThisObjectNull(path, "source");
        Intrinsics.isThisObjectNull(path2, "target");
        try {
            Files.move(path.m8519n(), path2.m8519n(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    /* renamed from: m */
    public FileMetadata m8569m(Path path) {
        Intrinsics.isThisObjectNull(path, "path");
        Path m8519n = path.m8519n();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(m8519n, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(m8519n) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            Path m8512f = readSymbolicLink != null ? Path.C10205a.m8512f(Path.f26595x, readSymbolicLink, false, 1, null) : null;
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long m8568u = creationTime != null ? m8568u(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long m8568u2 = lastModifiedTime != null ? m8568u(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new FileMetadata(isRegularFile, isDirectory, m8512f, valueOf, m8568u, m8568u2, lastAccessTime != null ? m8568u(lastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public String toString() {
        return "NioSystemFileSystem";
    }
}
