package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import com.github.aachartmodel.aainfographics.BuildConfig;

/* renamed from: androidx.core.app.m */
/* loaded from: classes.dex */
public class C0920m {

    /* renamed from: a */
    CharSequence f3172a;

    /* renamed from: b */
    IconCompat f3173b;

    /* renamed from: c */
    String f3174c;

    /* renamed from: d */
    String f3175d;

    /* renamed from: e */
    boolean f3176e;

    /* renamed from: f */
    boolean f3177f;

    /* compiled from: Person.java */
    /* renamed from: androidx.core.app.m$a */
    /* loaded from: classes.dex */
    static class C0921a {
        /* renamed from: a */
        static C0920m m39137a(Person person) {
            return new C0922b().m39130f(person.getName()).m39133c(person.getIcon() != null ? IconCompat.m38909a(person.getIcon()) : null).m39129g(person.getUri()).m39131e(person.getKey()).m39134b(person.isBot()).m39132d(person.isImportant()).m39135a();
        }

        /* renamed from: b */
        static Person m39136b(C0920m c0920m) {
            return new Person.Builder().setName(c0920m.m39143c()).setIcon(c0920m.m39145a() != null ? c0920m.m39145a().m38893q() : null).setUri(c0920m.m39142d()).setKey(c0920m.m39144b()).setBot(c0920m.m39141e()).setImportant(c0920m.m39140f()).build();
        }
    }

    /* compiled from: Person.java */
    /* renamed from: androidx.core.app.m$b */
    /* loaded from: classes.dex */
    public static class C0922b {

        /* renamed from: a */
        CharSequence f3178a;

        /* renamed from: b */
        IconCompat f3179b;

        /* renamed from: c */
        String f3180c;

        /* renamed from: d */
        String f3181d;

        /* renamed from: e */
        boolean f3182e;

        /* renamed from: f */
        boolean f3183f;

        /* renamed from: a */
        public C0920m m39135a() {
            return new C0920m(this);
        }

        /* renamed from: b */
        public C0922b m39134b(boolean z) {
            this.f3182e = z;
            return this;
        }

        /* renamed from: c */
        public C0922b m39133c(IconCompat iconCompat) {
            this.f3179b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C0922b m39132d(boolean z) {
            this.f3183f = z;
            return this;
        }

        /* renamed from: e */
        public C0922b m39131e(String str) {
            this.f3181d = str;
            return this;
        }

        /* renamed from: f */
        public C0922b m39130f(CharSequence charSequence) {
            this.f3178a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0922b m39129g(String str) {
            this.f3180c = str;
            return this;
        }
    }

    C0920m(C0922b c0922b) {
        this.f3172a = c0922b.f3178a;
        this.f3173b = c0922b.f3179b;
        this.f3174c = c0922b.f3180c;
        this.f3175d = c0922b.f3181d;
        this.f3176e = c0922b.f3182e;
        this.f3177f = c0922b.f3183f;
    }

    /* renamed from: a */
    public IconCompat m39145a() {
        return this.f3173b;
    }

    /* renamed from: b */
    public String m39144b() {
        return this.f3175d;
    }

    /* renamed from: c */
    public CharSequence m39143c() {
        return this.f3172a;
    }

    /* renamed from: d */
    public String m39142d() {
        return this.f3174c;
    }

    /* renamed from: e */
    public boolean m39141e() {
        return this.f3176e;
    }

    /* renamed from: f */
    public boolean m39140f() {
        return this.f3177f;
    }

    /* renamed from: g */
    public String m39139g() {
        String str = this.f3174c;
        if (str != null) {
            return str;
        }
        if (this.f3172a != null) {
            return "name:" + ((Object) this.f3172a);
        }
        return BuildConfig.VERSION_NAME;
    }

    /* renamed from: h */
    public Person m39138h() {
        return C0921a.m39136b(this);
    }
}
