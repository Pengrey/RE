package sd;

import id.InterfaceC6108l;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p337rd.InterfaceC9870e;
import p337rd._Sequences;
import p489zc.AbstractCollection;
import p489zc.C13780s;
import p489zc._Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Regex.kt */
/* renamed from: sd.h */
/* loaded from: classes2.dex */
public final class C10153h implements InterfaceC10152g {

    /* renamed from: a */
    private final Matcher f26487a;

    /* renamed from: b */
    private final CharSequence f26488b;

    /* compiled from: Regex.kt */
    /* renamed from: sd.h$a */
    /* loaded from: classes2.dex */
    public static final class C10154a extends AbstractCollection {

        /* compiled from: Regex.kt */
        /* renamed from: sd.h$a$a */
        /* loaded from: classes2.dex */
        static final class C10155a extends AbstractC6438m implements InterfaceC6108l {
            C10155a() {
                super(1);
            }

            /* renamed from: a */
            public final Regex m9025a(int i) {
                return C10154a.this.m9026h(i);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                return m9025a(((Number) obj).intValue());
            }
        }

        C10154a() {
        }

        /* renamed from: b */
        public int m9028b() {
            return C10153h.m9030a(C10153h.this).groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof Regex) {
                return m9027f((Regex) obj);
            }
            return false;
        }

        /* renamed from: f */
        public /* bridge */ boolean m9027f(Regex regex) {
            return super.contains(regex);
        }

        /* renamed from: h */
        public Regex m9026h(int i) {
            C8611f m9013d;
            m9013d = C10162j.m9013d(C10153h.m9030a(C10153h.this), i);
            if (m9013d.m15026u().intValue() >= 0) {
                String group = C10153h.m9030a(C10153h.this).group(i);
                Intrinsics.checkIfNull(group, "matchResult.group(index)");
                return new Regex(group, m9013d);
            }
            return null;
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator iterator() {
            C8611f m196h;
            InterfaceC9870e m491D;
            InterfaceC9870e m9753k;
            m196h = C13780s.m196h(this);
            m491D = _Collections.m491D(m196h);
            m9753k = _Sequences.m9753k(m491D, new C10155a());
            return m9753k.iterator();
        }
    }

    public C10153h(Matcher matcher, CharSequence charSequence) {
        Intrinsics.isThisObjectNull(matcher, "matcher");
        Intrinsics.isThisObjectNull(charSequence, "input");
        this.f26487a = matcher;
        this.f26488b = charSequence;
        new C10154a();
    }

    /* renamed from: a */
    public static final /* synthetic */ MatchResult m9030a(C10153h c10153h) {
        return c10153h.m9029b();
    }

    /* renamed from: b */
    private final MatchResult m9029b() {
        return this.f26487a;
    }

    public String getValue() {
        String group = m9029b().group();
        Intrinsics.checkIfNull(group, "matchResult.group()");
        return group;
    }

    public InterfaceC10152g next() {
        InterfaceC10152g m9014c;
        int end = m9029b().end() + (m9029b().end() == m9029b().start() ? 1 : 0);
        if (end <= this.f26488b.length()) {
            Matcher matcher = this.f26487a.pattern().matcher(this.f26488b);
            Intrinsics.checkIfNull(matcher, "matcher.pattern().matcher(input)");
            m9014c = C10162j.m9014c(matcher, end, this.f26488b);
            return m9014c;
        }
        return null;
    }
}
