package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.AbstractC3938g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.google.android.play.core.assetpacks.c0 */
/* loaded from: classes.dex */
final class C3830c0 extends AbstractC3938g {

    /* renamed from: w */
    private final File f10899w;

    /* renamed from: x */
    private final File f10900x;

    /* renamed from: y */
    private final NavigableMap<Long, File> f10901y = new TreeMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3830c0(File file, File file2) throws IOException {
        this.f10899w = file;
        this.f10900x = file2;
        List<File> m28696a = C3871l2.m28696a(file, file2);
        if (m28696a.isEmpty()) {
            throw new C3893r0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        int size = m28696a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            File file3 = m28696a.get(i);
            this.f10901y.put(Long.valueOf(j), file3);
            j += file3.length();
        }
    }

    /* renamed from: h */
    private final InputStream m28759h(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f10901y.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C3893r0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // com.google.android.play.core.internal.AbstractC3938g
    /* renamed from: a */
    public final long mo28562a() {
        Map.Entry<Long, File> lastEntry = this.f10901y.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractC3938g
    /* renamed from: c */
    public final InputStream mo28561c(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C3893r0(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= mo28562a()) {
            Long floorKey = this.f10901y.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f10901y.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C3825b0(m28759h(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m28759h(j, floorKey));
            Collection<File> values = this.f10901y.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C3906u1(Collections.enumeration(values)));
            }
            arrayList.add(new C3825b0(new FileInputStream((File) this.f10901y.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C3893r0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo28562a()), Long.valueOf(j3)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
