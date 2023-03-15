package p177j9;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: j9.p */
/* loaded from: classes.dex */
class C6397p {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* renamed from: j9.p$b */
    /* loaded from: classes.dex */
    public static class C6399b {

        /* renamed from: a */
        private final C6378d<?> f17454a;

        /* renamed from: b */
        private final Set<C6399b> f17455b = new HashSet();

        /* renamed from: c */
        private final Set<C6399b> f17456c = new HashSet();

        C6399b(C6378d<?> c6378d) {
            this.f17454a = c6378d;
        }

        /* renamed from: a */
        void m21059a(C6399b c6399b) {
            this.f17455b.add(c6399b);
        }

        /* renamed from: b */
        void m21058b(C6399b c6399b) {
            this.f17456c.add(c6399b);
        }

        /* renamed from: c */
        C6378d<?> m21057c() {
            return this.f17454a;
        }

        /* renamed from: d */
        Set<C6399b> m21056d() {
            return this.f17455b;
        }

        /* renamed from: e */
        boolean m21055e() {
            return this.f17455b.isEmpty();
        }

        /* renamed from: f */
        boolean m21054f() {
            return this.f17456c.isEmpty();
        }

        /* renamed from: g */
        void m21053g(C6399b c6399b) {
            this.f17456c.remove(c6399b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* renamed from: j9.p$c */
    /* loaded from: classes.dex */
    public static class C6400c {

        /* renamed from: a */
        private final Class<?> f17457a;

        /* renamed from: b */
        private final boolean f17458b;

        public boolean equals(Object obj) {
            if (obj instanceof C6400c) {
                C6400c c6400c = (C6400c) obj;
                return c6400c.f17457a.equals(this.f17457a) && c6400c.f17458b == this.f17458b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f17457a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f17458b).hashCode();
        }

        private C6400c(Class<?> cls, boolean z) {
            this.f17457a = cls;
            this.f17458b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21062a(List<C6378d<?>> list) {
        Set<C6399b> m21060c = m21060c(list);
        Set<C6399b> m21061b = m21061b(m21060c);
        int i = 0;
        while (!m21061b.isEmpty()) {
            C6399b next = m21061b.iterator().next();
            m21061b.remove(next);
            i++;
            for (C6399b c6399b : next.m21056d()) {
                c6399b.m21053g(next);
                if (c6399b.m21054f()) {
                    m21061b.add(c6399b);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C6399b c6399b2 : m21060c) {
            if (!c6399b2.m21054f() && !c6399b2.m21055e()) {
                arrayList.add(c6399b2.m21057c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    /* renamed from: b */
    private static Set<C6399b> m21061b(Set<C6399b> set) {
        HashSet hashSet = new HashSet();
        for (C6399b c6399b : set) {
            if (c6399b.m21054f()) {
                hashSet.add(c6399b);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C6399b> m21060c(List<C6378d<?>> list) {
        Set<C6399b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C6378d<?> c6378d : list) {
            C6399b c6399b = new C6399b(c6378d);
            for (Class<? super Object> cls : c6378d.m21115g()) {
                C6400c c6400c = new C6400c(cls, !c6378d.m21109m());
                if (!hashMap.containsKey(c6400c)) {
                    hashMap.put(c6400c, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c6400c);
                if (!set2.isEmpty() && !c6400c.f17458b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(c6399b);
            }
        }
        for (Set<C6399b> set3 : hashMap.values()) {
            for (C6399b c6399b2 : set3) {
                for (C6401q c6401q : c6399b2.m21057c().m21117e()) {
                    if (c6401q.m21047e() && (set = (Set) hashMap.get(new C6400c(c6401q.m21049c(), c6401q.m21045g()))) != null) {
                        for (C6399b c6399b3 : set) {
                            c6399b2.m21059a(c6399b3);
                            c6399b3.m21058b(c6399b2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
