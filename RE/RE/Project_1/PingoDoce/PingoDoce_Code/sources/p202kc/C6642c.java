package p202kc;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.redmadrobot.inputmask.helper.Compiler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.AbstractC7034d;
import lc.C7028a;
import lc.C7032b;
import mc.C7166a;
import mc.C7167b;
import mc.C7168c;
import mc.C7169d;
import mc.C7175e;
import p181jd.Intrinsics;
import sd._Strings;

/* renamed from: kc.c */
/* loaded from: classes2.dex */
public class C6642c {

    /* renamed from: a */
    private final AbstractC7034d f17926a;

    /* renamed from: b */
    private final List f17927b;

    /* renamed from: d */
    public static final C6644b f17925d = new C6644b(null);

    /* renamed from: c */
    private static final Map f17924c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mask.kt */
    /* renamed from: kc.c$a */
    /* loaded from: classes2.dex */
    public static final class C6643a extends Stack {
        /* renamed from: b */
        public /* bridge */ boolean m20409b(C7032b c7032b) {
            return super.contains(c7032b);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof C7032b : true) {
                return m20409b((C7032b) obj);
            }
            return false;
        }

        /* renamed from: f */
        public /* bridge */ int m20408f() {
            return super.size();
        }

        /* renamed from: g */
        public /* bridge */ int m20407g(C7032b c7032b) {
            return super.indexOf(c7032b);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj != null ? obj instanceof C7032b : true) {
                return m20407g((C7032b) obj);
            }
            return -1;
        }

        /* renamed from: l */
        public /* bridge */ int m20406l(C7032b c7032b) {
            return super.lastIndexOf(c7032b);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj != null ? obj instanceof C7032b : true) {
                return m20406l((C7032b) obj);
            }
            return -1;
        }

        /* renamed from: o */
        public C7032b push(C7032b c7032b) {
            if (c7032b != null) {
                return (C7032b) super.push(c7032b);
            }
            removeAllElements();
            return null;
        }

        /* renamed from: p */
        public /* bridge */ boolean m20404p(C7032b c7032b) {
            return super.remove(c7032b);
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj != null ? obj instanceof C7032b : true) {
                return m20404p((C7032b) obj);
            }
            return false;
        }

        public final /* bridge */ int size() {
            return m20408f();
        }
    }

    /* compiled from: Mask.kt */
    /* renamed from: kc.c$b */
    /* loaded from: classes2.dex */
    public static final class C6644b {
        private C6644b() {
        }

        /* renamed from: a */
        public final C6642c m20403a(String str, List list) {
            Intrinsics.m20926i(str, "format");
            Intrinsics.m20926i(list, "customNotations");
            C6642c c6642c = (C6642c) C6642c.m20413a().get(str);
            if (c6642c == null) {
                C6642c c6642c2 = new C6642c(str, list);
                C6642c.m20413a().put(str, c6642c2);
                return c6642c2;
            }
            return c6642c;
        }

        public /* synthetic */ C6644b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Mask.kt */
    /* renamed from: kc.c$c */
    /* loaded from: classes2.dex */
    public static final class C6645c {

        /* renamed from: a */
        private final C7028a f17928a;

        /* renamed from: b */
        private final String f17929b;

        /* renamed from: c */
        private final int f17930c;

        /* renamed from: d */
        private final boolean f17931d;

        public C6645c(C7028a c7028a, String str, int i, boolean z) {
            Intrinsics.m20926i(c7028a, "formattedText");
            Intrinsics.m20926i(str, "extractedValue");
            this.f17928a = c7028a;
            this.f17929b = str;
            this.f17930c = i;
            this.f17931d = z;
        }

        /* renamed from: a */
        public final int m20402a() {
            return this.f17930c;
        }

        /* renamed from: b */
        public final boolean m20401b() {
            return this.f17931d;
        }

        /* renamed from: c */
        public final String m20400c() {
            return this.f17929b;
        }

        /* renamed from: d */
        public final C7028a m20399d() {
            return this.f17928a;
        }

        /* renamed from: e */
        public final C6645c m20398e() {
            CharSequence m8866P0;
            C7028a m19548d = this.f17928a.m19548d();
            String str = this.f17929b;
            if (str != null) {
                m8866P0 = _Strings.m8866P0(str);
                return new C6645c(m19548d, m8866P0.toString(), this.f17930c, this.f17931d);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6645c) {
                    C6645c c6645c = (C6645c) obj;
                    if (Intrinsics.equals(this.f17928a, c6645c.f17928a) && Intrinsics.equals(this.f17929b, c6645c.f17929b)) {
                        if (this.f17930c == c6645c.f17930c) {
                            if (this.f17931d == c6645c.f17931d) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            C7028a c7028a = this.f17928a;
            int hashCode = (c7028a != null ? c7028a.hashCode() : 0) * 31;
            String str = this.f17929b;
            int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f17930c) * 31;
            boolean z = this.f17931d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Result(formattedText=" + this.f17928a + ", extractedValue=" + this.f17929b + ", affinity=" + this.f17930c + ", complete=" + this.f17931d + ")";
        }
    }

    public C6642c(String str, List list) {
        Intrinsics.m20926i(str, "format");
        Intrinsics.m20926i(list, "customNotations");
        this.f17927b = list;
        this.f17926a = new Compiler(list).m27501a(str);
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m20413a() {
        return f17924c;
    }

    /* renamed from: d */
    private final boolean m20412d(AbstractC7034d abstractC7034d) {
        if (abstractC7034d instanceof C7166a) {
            return true;
        }
        if (abstractC7034d instanceof C7175e) {
            return ((C7175e) abstractC7034d).m19001f();
        }
        if (abstractC7034d instanceof C7167b) {
            return false;
        }
        return m20412d(abstractC7034d.mo19003d());
    }

    /* renamed from: b */
    public C6645c mo20395b(C7028a c7028a) {
        char m8867O0;
        String m8869M0;
        char m8867O02;
        C7032b mo19008b;
        Intrinsics.m20926i(c7028a, "text");
        C6641b mo20394c = mo20394c(c7028a);
        int m19550b = c7028a.m19550b();
        AbstractC7034d abstractC7034d = this.f17926a;
        C6643a c6643a = new C6643a();
        boolean mo20397d = mo20394c.mo20397d();
        boolean m20417a = mo20394c.m20417a();
        Character m20414e = mo20394c.m20414e();
        int i = 0;
        String str = BuildConfig.VERSION_NAME;
        String str2 = str;
        while (m20414e != null) {
            C7032b mo19004a = abstractC7034d.mo19004a(m20414e.charValue());
            if (mo19004a != null) {
                if (m20417a) {
                    c6643a.push(abstractC7034d.mo19008b());
                }
                abstractC7034d = mo19004a.m19541c();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                Character m19543a = mo19004a.m19543a();
                if (m19543a == null) {
                    m19543a = BuildConfig.VERSION_NAME;
                }
                sb2.append(m19543a);
                str = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                Character m19540d = mo19004a.m19540d();
                if (m19540d == null) {
                    m19540d = BuildConfig.VERSION_NAME;
                }
                sb3.append(m19540d);
                str2 = sb3.toString();
                if (mo19004a.m19542b()) {
                    mo20397d = mo20394c.mo20397d();
                    m20417a = mo20394c.m20417a();
                    m20414e = mo20394c.m20414e();
                    i++;
                } else if (mo20397d && mo19004a.m19543a() != null) {
                    m19550b++;
                }
            } else {
                if (m20417a) {
                    m19550b--;
                }
                mo20397d = mo20394c.mo20397d();
                m20417a = mo20394c.m20417a();
                m20414e = mo20394c.m20414e();
            }
            i--;
        }
        while (c7028a.m19551a().m19547a() && mo20397d && (mo19008b = abstractC7034d.mo19008b()) != null) {
            abstractC7034d = mo19008b.m19541c();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            Character m19543a2 = mo19008b.m19543a();
            if (m19543a2 == null) {
                m19543a2 = BuildConfig.VERSION_NAME;
            }
            sb4.append(m19543a2);
            str = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            Character m19540d2 = mo19008b.m19540d();
            if (m19540d2 == null) {
                m19540d2 = BuildConfig.VERSION_NAME;
            }
            sb5.append(m19540d2);
            str2 = sb5.toString();
            if (mo19008b.m19543a() != null) {
                m19550b++;
            }
        }
        while (c7028a.m19551a().m19546b() && !c6643a.empty()) {
            Object pop = c6643a.pop();
            Intrinsics.isNotNull(pop, "autocompletionStack.pop()");
            C7032b c7032b = (C7032b) pop;
            if (str.length() == m19550b) {
                if (c7032b.m19543a() != null) {
                    Character m19543a3 = c7032b.m19543a();
                    m8867O02 = _Strings.m8867O0(str);
                    if (m19543a3 != null && m19543a3.charValue() == m8867O02) {
                        str = _Strings.m8869M0(str, 1);
                        m19550b--;
                    }
                }
                if (c7032b.m19540d() != null) {
                    Character m19540d3 = c7032b.m19540d();
                    m8867O0 = _Strings.m8867O0(str2);
                    if (m19540d3 != null && m19540d3.charValue() == m8867O0) {
                        m8869M0 = _Strings.m8869M0(str2, 1);
                        str2 = m8869M0;
                    }
                }
            } else if (c7032b.m19543a() != null) {
                m19550b--;
            }
        }
        return new C6645c(new C7028a(str, m19550b, c7028a.m19551a()), str2, i, m20412d(abstractC7034d));
    }

    /* renamed from: c */
    public C6641b mo20394c(C7028a c7028a) {
        Intrinsics.m20926i(c7028a, "text");
        return new C6641b(c7028a, 0, 2, null);
    }

    /* renamed from: e */
    public final int m20411e() {
        int i = 0;
        for (AbstractC7034d abstractC7034d = this.f17926a; abstractC7034d != null && !(abstractC7034d instanceof C7166a); abstractC7034d = abstractC7034d.m19536c()) {
            if ((abstractC7034d instanceof C7167b) || (abstractC7034d instanceof C7168c) || (abstractC7034d instanceof C7175e) || (abstractC7034d instanceof C7169d)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final int m20410f() {
        int i = 0;
        for (AbstractC7034d abstractC7034d = this.f17926a; abstractC7034d != null && !(abstractC7034d instanceof C7166a); abstractC7034d = abstractC7034d.m19536c()) {
            if ((abstractC7034d instanceof C7167b) || (abstractC7034d instanceof C7175e) || (abstractC7034d instanceof C7169d)) {
                i++;
            }
        }
        return i;
    }
}
