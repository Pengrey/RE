package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.tasks.C3963b;
import com.google.android.play.core.tasks.C3973l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p031b9.C1844a;
import p031b9.C1855l;
import p031b9.C1868y;
import p031b9.InterfaceC1864u;
import p101f9.AbstractC5433d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.r1 */
/* loaded from: classes.dex */
public final class C3894r1 implements InterfaceC3833c3 {

    /* renamed from: g */
    private static final C1844a f11114g = new C1844a("FakeAssetPackService");

    /* renamed from: a */
    private final String f11115a;

    /* renamed from: b */
    private final C3900t f11116b;

    /* renamed from: c */
    private final Context f11117c;

    /* renamed from: d */
    private final C3837d2 f11118d;

    /* renamed from: e */
    private final InterfaceC1864u<Executor> f11119e;

    /* renamed from: f */
    private final Handler f11120f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3894r1(File file, C3900t c3900t, C3909v0 c3909v0, Context context, C3837d2 c3837d2, InterfaceC1864u<Executor> interfaceC1864u) {
        this.f11115a = file.getAbsolutePath();
        this.f11116b = c3900t;
        this.f11117c = context;
        this.f11118d = c3837d2;
        this.f11119e = interfaceC1864u;
    }

    /* renamed from: b */
    static long m28652b(int i, long j) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return j;
            }
            return 0L;
        }
        return j / 2;
    }

    /* renamed from: d */
    private static String m28650d(File file) throws LocalTestingException {
        try {
            return C3902t1.m28637a(Arrays.asList(file));
        } catch (IOException e) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    /* renamed from: e */
    private final void m28649e(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f11118d.m28755a());
        bundle.putInt("session_id", i);
        File[] m28646h = m28646h(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : m28646h) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String m35255a = C1855l.m35255a(file);
            bundle.putParcelableArrayList(C1868y.m35243b("chunk_intents", str, m35255a), arrayList2);
            bundle.putString(C1868y.m35243b("uncompressed_hash_sha256", str, m35255a), m28650d(file));
            bundle.putLong(C1868y.m35243b("uncompressed_size", str, m35255a), file.length());
            arrayList.add(m35255a);
        }
        bundle.putStringArrayList(C1868y.m35244a("slice_ids", str), arrayList);
        bundle.putLong(C1868y.m35244a("pack_version", str), this.f11118d.m28755a());
        bundle.putInt(C1868y.m35244a("status", str), i2);
        bundle.putInt(C1868y.m35244a("error_code", str), 0);
        bundle.putLong(C1868y.m35244a("bytes_downloaded", str), m28652b(i2, j));
        bundle.putLong(C1868y.m35244a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m28652b(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f11120f.post(new Runnable(this, putExtra) { // from class: com.google.android.play.core.assetpacks.q1

            /* renamed from: w */
            private final C3894r1 f11107w;

            /* renamed from: x */
            private final Intent f11108x;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11107w = this;
                this.f11108x = putExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11107w.m28648f(this.f11108x);
            }
        });
    }

    /* renamed from: h */
    private final File[] m28646h(final String str) throws LocalTestingException {
        File file = new File(this.f11115a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.p1

                /* renamed from: a */
                private final String f11094a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11094a = str;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(this.f11094a).concat("-")) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (C1855l.m35255a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: C */
    public final void mo28657C(int i) {
        f11114g.m35277f("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: D */
    public final AbstractC5433d<List<String>> mo28656D(Map<String, Long> map) {
        f11114g.m35277f("syncPacks()", new Object[0]);
        return C3963b.m28515b(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: E */
    public final AbstractC5433d<ParcelFileDescriptor> mo28655E(int i, String str, String str2, int i2) {
        File[] m28646h;
        int i3;
        f11114g.m35277f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C3973l c3973l = new C3973l();
        try {
        } catch (LocalTestingException e) {
            f11114g.m35276g("getChunkFileDescriptor failed", e);
            c3973l.m28501b(e);
        } catch (FileNotFoundException e2) {
            f11114g.m35276g("getChunkFileDescriptor failed", e2);
            c3973l.m28501b(new LocalTestingException("Asset Slice file not found.", e2));
        }
        for (File file : m28646h(str)) {
            if (C1855l.m35255a(file).equals(str2)) {
                c3973l.m28500c(ParcelFileDescriptor.open(file, 268435456));
                return c3973l.m28502a();
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: F */
    public final void mo28654F(int i, String str, String str2, int i2) {
        f11114g.m35277f("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: a */
    public final void mo28653a(final int i, final String str) {
        f11114g.m35277f("notifyModuleCompleted", new Object[0]);
        this.f11119e.m35248c().execute(new Runnable(this, i, str) { // from class: com.google.android.play.core.assetpacks.o1

            /* renamed from: w */
            private final C3894r1 f11082w;

            /* renamed from: x */
            private final int f11083x;

            /* renamed from: y */
            private final String f11084y;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11082w = this;
                this.f11083x = i;
                this.f11084y = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11082w.m28647g(this.f11083x, this.f11084y);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: c */
    public final void mo28651c() {
        f11114g.m35277f("keepAlive", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m28648f(Intent intent) {
        this.f11116b.mo28641a(this.f11117c, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m28647g(int i, String str) {
        try {
            m28649e(i, str, 4);
        } catch (LocalTestingException e) {
            f11114g.m35276g("notifyModuleCompleted failed", e);
        }
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: r */
    public final void mo28645r(List<String> list) {
        f11114g.m35277f("cancelDownload(%s)", list);
    }
}
