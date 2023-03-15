package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p030b8.C1837a;
import p301q.C9552b;
import p484z6.C13717n;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes.dex */
public final class C2583c {
    @Nullable

    /* renamed from: a */
    private final Account f7468a;

    /* renamed from: b */
    private final Set<Scope> f7469b;

    /* renamed from: c */
    private final Set<Scope> f7470c;

    /* renamed from: d */
    private final Map<C2461a<?>, C13717n> f7471d;

    /* renamed from: e */
    private final String f7472e;

    /* renamed from: f */
    private final String f7473f;

    /* renamed from: g */
    private final C1837a f7474g;

    /* renamed from: h */
    private Integer f7475h;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.internal.c$a */
    /* loaded from: classes.dex */
    public static final class C2584a {
        @Nullable

        /* renamed from: a */
        private Account f7476a;

        /* renamed from: b */
        private C9552b<Scope> f7477b;

        /* renamed from: c */
        private String f7478c;

        /* renamed from: d */
        private String f7479d;

        /* renamed from: e */
        private C1837a f7480e = C1837a.f5543F;

        /* renamed from: a */
        public C2583c m33124a() {
            return new C2583c(this.f7476a, this.f7477b, null, 0, null, this.f7478c, this.f7479d, this.f7480e, false);
        }

        /* renamed from: b */
        public C2584a m33123b(String str) {
            this.f7478c = str;
            return this;
        }

        /* renamed from: c */
        public final C2584a m33122c(Collection<Scope> collection) {
            if (this.f7477b == null) {
                this.f7477b = new C9552b<>();
            }
            this.f7477b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C2584a m33121d(@Nullable Account account) {
            this.f7476a = account;
            return this;
        }

        /* renamed from: e */
        public final C2584a m33120e(String str) {
            this.f7479d = str;
            return this;
        }
    }

    public C2583c(@Nullable Account account, Set<Scope> set, Map<C2461a<?>, C13717n> map, int i, @Nullable View view, String str, String str2, @Nullable C1837a c1837a, boolean z) {
        this.f7468a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f7469b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f7471d = map;
        this.f7472e = str;
        this.f7473f = str2;
        this.f7474g = c1837a == null ? C1837a.f5543F : c1837a;
        HashSet hashSet = new HashSet(emptySet);
        for (C13717n c13717n : map.values()) {
            hashSet.addAll(c13717n.f34829a);
        }
        this.f7470c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m33135a() {
        return this.f7468a;
    }

    @Deprecated
    /* renamed from: b */
    public String m33134b() {
        Account account = this.f7468a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m33133c() {
        Account account = this.f7468a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public Set<Scope> m33132d() {
        return this.f7470c;
    }

    /* renamed from: e */
    public Set<Scope> m33131e(C2461a<?> c2461a) {
        C13717n c13717n = this.f7471d.get(c2461a);
        if (c13717n != null && !c13717n.f34829a.isEmpty()) {
            HashSet hashSet = new HashSet(this.f7469b);
            hashSet.addAll(c13717n.f34829a);
            return hashSet;
        }
        return this.f7469b;
    }

    /* renamed from: f */
    public String m33130f() {
        return this.f7472e;
    }

    /* renamed from: g */
    public Set<Scope> m33129g() {
        return this.f7469b;
    }

    /* renamed from: h */
    public final C1837a m33128h() {
        return this.f7474g;
    }

    /* renamed from: i */
    public final Integer m33127i() {
        return this.f7475h;
    }

    /* renamed from: j */
    public final String m33126j() {
        return this.f7473f;
    }

    /* renamed from: k */
    public final void m33125k(Integer num) {
        this.f7475h = num;
    }
}
