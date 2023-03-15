package p356sf;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13769l0;
import p489zc._Collections;

/* renamed from: sf.h */
/* loaded from: classes2.dex */
public final class FileMetadata {

    /* renamed from: a */
    private final boolean f26554a;

    /* renamed from: b */
    private final boolean f26555b;

    /* renamed from: c */
    private final Path f26556c;

    /* renamed from: d */
    private final Long f26557d;

    /* renamed from: e */
    private final Long f26558e;

    /* renamed from: f */
    private final Long f26559f;

    /* renamed from: g */
    private final Long f26560g;

    /* renamed from: h */
    private final Map f26561h;

    public FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map) {
        Map m324o;
        Intrinsics.isThisObjectNull(map, "extras");
        this.f26554a = z;
        this.f26555b = z2;
        this.f26556c = path;
        this.f26557d = l;
        this.f26558e = l2;
        this.f26559f = l3;
        this.f26560g = l4;
        m324o = C13769l0.m324o(map);
        this.f26561h = m324o;
    }

    /* renamed from: b */
    public static /* synthetic */ FileMetadata m8675b(FileMetadata fileMetadata, boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map, int i, Object obj) {
        return fileMetadata.m8676a((i & 1) != 0 ? fileMetadata.f26554a : z, (i & 2) != 0 ? fileMetadata.f26555b : z2, (i & 4) != 0 ? fileMetadata.f26556c : path, (i & 8) != 0 ? fileMetadata.f26557d : l, (i & 16) != 0 ? fileMetadata.f26558e : l2, (i & 32) != 0 ? fileMetadata.f26559f : l3, (i & 64) != 0 ? fileMetadata.f26560g : l4, (i & 128) != 0 ? fileMetadata.f26561h : map);
    }

    /* renamed from: a */
    public final FileMetadata m8676a(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map) {
        Intrinsics.isThisObjectNull(map, "extras");
        return new FileMetadata(z, z2, path, l, l2, l3, l4, map);
    }

    /* renamed from: c */
    public final Long m8674c() {
        return this.f26559f;
    }

    /* renamed from: d */
    public final Long m8673d() {
        return this.f26557d;
    }

    /* renamed from: e */
    public final Path m8672e() {
        return this.f26556c;
    }

    /* renamed from: f */
    public final boolean m8671f() {
        return this.f26555b;
    }

    /* renamed from: g */
    public final boolean m8670g() {
        return this.f26554a;
    }

    public String toString() {
        String m474U;
        ArrayList arrayList = new ArrayList();
        if (this.f26554a) {
            arrayList.add("isRegularFile");
        }
        if (this.f26555b) {
            arrayList.add("isDirectory");
        }
        if (this.f26557d != null) {
            arrayList.add("byteCount=" + this.f26557d);
        }
        if (this.f26558e != null) {
            arrayList.add("createdAt=" + this.f26558e);
        }
        if (this.f26559f != null) {
            arrayList.add("lastModifiedAt=" + this.f26559f);
        }
        if (this.f26560g != null) {
            arrayList.add("lastAccessedAt=" + this.f26560g);
        }
        if (!this.f26561h.isEmpty()) {
            arrayList.add("extras=" + this.f26561h);
        }
        m474U = _Collections.m474U(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
        return m474U;
    }

    public /* synthetic */ FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : path, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? C13769l0.m334e() : map);
    }
}
