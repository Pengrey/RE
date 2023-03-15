package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.exifinterface.media.b */
/* loaded from: classes.dex */
public class C1295b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterfaceUtils.java */
    /* renamed from: androidx.exifinterface.media.b$a */
    /* loaded from: classes.dex */
    public static class C1296a {
        /* renamed from: a */
        static void m37677a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        /* renamed from: b */
        static FileDescriptor m37676b(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static long m37675c(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterfaceUtils.java */
    /* renamed from: androidx.exifinterface.media.b$b */
    /* loaded from: classes.dex */
    public static class C1297b {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static void m37674a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m37680a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long[] m37679b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m37678c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
