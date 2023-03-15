package androidx.compose.p018ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AccessibilityIterators.android.kt */
/* renamed from: androidx.compose.ui.platform.h */
/* loaded from: classes.dex */
public final class C0720h extends AbstractC0686b {

    /* renamed from: d */
    public static final C0721a f2264d = new C0721a(null);

    /* renamed from: e */
    private static C0720h f2265e;

    /* renamed from: c */
    private BreakIterator f2266c;

    /* compiled from: AccessibilityIterators.android.kt */
    /* renamed from: androidx.compose.ui.platform.h$a */
    /* loaded from: classes.dex */
    public static final class C0721a {
        private C0721a() {
        }

        public /* synthetic */ C0721a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0720h m39730a(Locale locale) {
            Intrinsics.isThisObjectNull(locale, "locale");
            if (C0720h.m39736g() == null) {
                C0720h.m39735h(new C0720h(locale, null));
            }
            C0720h m39736g = C0720h.m39736g();
            Objects.requireNonNull(m39736g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return m39736g;
        }
    }

    private C0720h(Locale locale) {
        m39731l(locale);
    }

    public /* synthetic */ C0720h(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    /* renamed from: g */
    public static final /* synthetic */ C0720h m39736g() {
        return f2265e;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m39735h(C0720h c0720h) {
        f2265e = c0720h;
    }

    /* renamed from: i */
    private final boolean m39734i(int i) {
        return i > 0 && m39733j(i + (-1)) && (i == m39827d().length() || !m39733j(i));
    }

    /* renamed from: j */
    private final boolean m39733j(int i) {
        if (i < 0 || i >= m39827d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m39827d().codePointAt(i));
    }

    /* renamed from: k */
    private final boolean m39732k(int i) {
        return m39733j(i) && (i == 0 || !m39733j(i - 1));
    }

    /* renamed from: l */
    private final void m39731l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        Intrinsics.checkIfNull(wordInstance, "getWordInstance(locale)");
        this.f2266c = wordInstance;
    }

    /* renamed from: a */
    public int[] mo39755a(int i) {
        int length = m39827d().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !m39733j(i - 1) && !m39734i(i)) {
                BreakIterator breakIterator = this.f2266c;
                if (breakIterator == null) {
                    Intrinsics.throwUninitPropException("impl");
                    breakIterator = null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f2266c;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitPropException("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding == -1 || !m39732k(preceding)) {
                return null;
            }
            return m39828c(preceding, i);
        }
        return null;
    }

    /* renamed from: b */
    public int[] mo39754b(int i) {
        if (m39827d().length() > 0 && i < m39827d().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!m39733j(i) && !m39732k(i)) {
                BreakIterator breakIterator = this.f2266c;
                if (breakIterator == null) {
                    Intrinsics.throwUninitPropException("impl");
                    breakIterator = null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f2266c;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitPropException("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i);
            if (following == -1 || !m39734i(following)) {
                return null;
            }
            return m39828c(i, following);
        }
        return null;
    }

    /* renamed from: e */
    public void m39737e(String str) {
        Intrinsics.isThisObjectNull(str, "text");
        super.m39826e(str);
        BreakIterator breakIterator = this.f2266c;
        if (breakIterator == null) {
            Intrinsics.throwUninitPropException("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
