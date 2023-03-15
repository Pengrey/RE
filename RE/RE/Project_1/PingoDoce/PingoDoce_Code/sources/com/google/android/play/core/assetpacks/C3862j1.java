package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p031b9.C1844a;
import p031b9.C1868y;
import p031b9.InterfaceC1864u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.j1 */
/* loaded from: classes.dex */
public final class C3862j1 {

    /* renamed from: g */
    private static final C1844a f10997g = new C1844a("ExtractorSessionStoreView");

    /* renamed from: a */
    private final C3924z f10998a;

    /* renamed from: b */
    private final InterfaceC1864u<InterfaceC3833c3> f10999b;

    /* renamed from: c */
    private final C3909v0 f11000c;

    /* renamed from: d */
    private final InterfaceC1864u<Executor> f11001d;

    /* renamed from: e */
    private final Map<Integer, C3850g1> f11002e = new HashMap();

    /* renamed from: f */
    private final ReentrantLock f11003f = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3862j1(C3924z c3924z, InterfaceC1864u<InterfaceC3833c3> interfaceC1864u, C3909v0 c3909v0, InterfaceC1864u<Executor> interfaceC1864u2) {
        this.f10998a = c3924z;
        this.f10999b = interfaceC1864u;
        this.f11000c = c3909v0;
        this.f11001d = interfaceC1864u2;
    }

    /* renamed from: a */
    private final <T> T m28732a(InterfaceC3858i1<T> interfaceC3858i1) {
        try {
            m28731b();
            return interfaceC3858i1.mo28575c();
        } finally {
            m28727f();
        }
    }

    /* renamed from: o */
    private final Map<String, C3850g1> m28718o(final List<String> list) {
        return (Map) m28732a(new InterfaceC3858i1(this, list) { // from class: com.google.android.play.core.assetpacks.b1

            /* renamed from: a */
            private final C3862j1 f10888a;

            /* renamed from: b */
            private final List f10889b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10888a = this;
                this.f10889b = list;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC3858i1
            /* renamed from: c */
            public final Object mo28575c() {
                return this.f10888a.m28721l(this.f10889b);
            }
        });
    }

    /* renamed from: q */
    private final C3850g1 m28716q(int i) {
        Map<Integer, C3850g1> map = this.f11002e;
        Integer valueOf = Integer.valueOf(i);
        C3850g1 c3850g1 = map.get(valueOf);
        if (c3850g1 != null) {
            return c3850g1;
        }
        throw new C3893r0(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    /* renamed from: r */
    private static String m28715r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new C3893r0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    /* renamed from: s */
    private static <T> List<T> m28714s(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m28731b() {
        this.f11003f.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m28730c(final int i) {
        m28732a(new InterfaceC3858i1(this, i) { // from class: com.google.android.play.core.assetpacks.d1

            /* renamed from: a */
            private final C3862j1 f10915a;

            /* renamed from: b */
            private final int f10916b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10915a = this;
                this.f10916b = i;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC3858i1
            /* renamed from: c */
            public final Object mo28575c() {
                this.f10915a.m28720m(this.f10916b);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m28729d(final String str, final int i, final long j) {
        m28732a(new InterfaceC3858i1(this, str, i, j) { // from class: com.google.android.play.core.assetpacks.a1

            /* renamed from: a */
            private final C3862j1 f10880a;

            /* renamed from: b */
            private final String f10881b;

            /* renamed from: c */
            private final int f10882c;

            /* renamed from: d */
            private final long f10883d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10880a = this;
                this.f10881b = str;
                this.f10882c = i;
                this.f10883d = j;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC3858i1
            /* renamed from: c */
            public final Object mo28575c() {
                this.f10880a.m28725h(this.f10881b, this.f10882c, this.f10883d);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m28728e(final Bundle bundle) {
        return ((Boolean) m28732a(new InterfaceC3858i1(this, bundle) { // from class: com.google.android.play.core.assetpacks.y0

            /* renamed from: a */
            private final C3862j1 f11216a;

            /* renamed from: b */
            private final Bundle f11217b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11216a = this;
                this.f11217b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC3858i1
            /* renamed from: c */
            public final Object mo28575c() {
                return this.f11216a.m28719n(this.f11217b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m28727f() {
        this.f11003f.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m28726g(int i) {
        m28716q(i).f10962c.f10945c = 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m28725h(String str, int i, long j) {
        C3850g1 c3850g1 = m28718o(Arrays.asList(str)).get(str);
        if (c3850g1 == null || C3902t1.m28632f(c3850g1.f10962c.f10945c)) {
            f10997g.m35278e(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f10998a.m28608A(str, i, j);
        c3850g1.f10962c.f10945c = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean m28724i(final Bundle bundle) {
        return ((Boolean) m28732a(new InterfaceC3858i1(this, bundle) { // from class: com.google.android.play.core.assetpacks.z0

            /* renamed from: a */
            private final C3862j1 f11225a;

            /* renamed from: b */
            private final Bundle f11226b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11225a = this;
                this.f11226b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC3858i1
            /* renamed from: c */
            public final Object mo28575c() {
                return this.f11225a.m28723j(this.f11226b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ Boolean m28723j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, C3850g1> map = this.f11002e;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C3850g1 c3850g1 = this.f11002e.get(valueOf);
            if (c3850g1.f10962c.f10945c == 6) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(!C3902t1.m28634d(c3850g1.f10962c.f10945c, bundle.getInt(C1868y.m35244a("status", m28715r(bundle)))));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final Map<Integer, C3850g1> m28722k() {
        return this.f11002e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ Map m28721l(List list) {
        HashMap hashMap = new HashMap();
        for (C3850g1 c3850g1 : this.f11002e.values()) {
            String str = c3850g1.f10962c.f10943a;
            if (list.contains(str)) {
                C3850g1 c3850g12 = (C3850g1) hashMap.get(str);
                if ((c3850g12 == null ? -1 : c3850g12.f10960a) < c3850g1.f10960a) {
                    hashMap.put(str, c3850g1);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void m28720m(int i) {
        C3850g1 m28716q = m28716q(i);
        if (!C3902t1.m28632f(m28716q.f10962c.f10945c)) {
            throw new C3893r0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        C3924z c3924z = this.f10998a;
        C3846f1 c3846f1 = m28716q.f10962c;
        c3924z.m28608A(c3846f1.f10943a, m28716q.f10961b, c3846f1.f10944b);
        C3846f1 c3846f12 = m28716q.f10962c;
        int i2 = c3846f12.f10945c;
        if (i2 == 5 || i2 == 6) {
            this.f10998a.m28582t(c3846f12.f10943a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ Boolean m28719n(Bundle bundle) {
        C3854h1 c3854h1;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C3850g1> map = this.f11002e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(valueOf)) {
            C3850g1 m28716q = m28716q(i);
            int i2 = bundle.getInt(C1868y.m35244a("status", m28716q.f10962c.f10943a));
            if (C3902t1.m28634d(m28716q.f10962c.f10945c, i2)) {
                f10997g.m35280c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(m28716q.f10962c.f10945c));
                C3846f1 c3846f1 = m28716q.f10962c;
                String str = c3846f1.f10943a;
                int i3 = c3846f1.f10945c;
                if (i3 == 4) {
                    this.f10999b.m35248c().mo28653a(i, str);
                } else if (i3 == 5) {
                    this.f10999b.m35248c().mo28657C(i);
                } else if (i3 == 6) {
                    this.f10999b.m35248c().mo28645r(Arrays.asList(str));
                }
            } else {
                m28716q.f10962c.f10945c = i2;
                if (C3902t1.m28632f(i2)) {
                    m28730c(i);
                    this.f11000c.m28623b(m28716q.f10962c.f10943a);
                } else {
                    List<C3854h1> list = m28716q.f10962c.f10947e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C3854h1 c3854h12 = list.get(i4);
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C1868y.m35243b("chunk_intents", m28716q.f10962c.f10943a, c3854h12.f10974a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    c3854h12.f10977d.get(i5).f10933a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String m28715r = m28715r(bundle);
            long j = bundle.getLong(C1868y.m35244a("pack_version", m28715r));
            int i6 = bundle.getInt(C1868y.m35244a("status", m28715r));
            long j2 = bundle.getLong(C1868y.m35244a("total_bytes_to_download", m28715r));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(C1868y.m35244a("slice_ids", m28715r));
            ArrayList arrayList = new ArrayList();
            Iterator it = m28714s(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C1868y.m35243b("chunk_intents", m28715r, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m28714s(parcelableArrayList2)) {
                    Iterator it2 = it;
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new C3841e1(z));
                    it = it2;
                    z = false;
                }
                Iterator it3 = it;
                String string = bundle.getString(C1868y.m35243b("uncompressed_hash_sha256", m28715r, str2));
                long j3 = bundle.getLong(C1868y.m35243b("uncompressed_size", m28715r, str2));
                int i7 = bundle.getInt(C1868y.m35243b("patch_format", m28715r, str2), 0);
                if (i7 != 0) {
                    c3854h1 = new C3854h1(str2, string, j3, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    c3854h1 = new C3854h1(str2, string, j3, arrayList2, bundle.getInt(C1868y.m35243b("compression_format", m28715r, str2), 0), 0);
                }
                arrayList.add(c3854h1);
                it = it3;
            }
            this.f11002e.put(Integer.valueOf(i), new C3850g1(i, bundle.getInt("app_version_code"), new C3846f1(m28715r, j, i6, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m28717p(final int i) {
        m28732a(new InterfaceC3858i1(this, i) { // from class: com.google.android.play.core.assetpacks.c1

            /* renamed from: a */
            private final C3862j1 f10902a;

            /* renamed from: b */
            private final int f10903b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10902a = this;
                this.f10903b = i;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC3858i1
            /* renamed from: c */
            public final Object mo28575c() {
                this.f10902a.m28726g(this.f10903b);
                return null;
            }
        });
    }
}
