package androidx.compose.p018ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AccessibilityIterators.android.kt */
/* renamed from: androidx.compose.ui.platform.c */
/* loaded from: classes.dex */
public class C0690c extends AbstractC0686b {

    /* renamed from: d */
    public static final C0691a f2191d = new C0691a(null);

    /* renamed from: e */
    private static C0690c f2192e;

    /* renamed from: c */
    private BreakIterator f2193c;

    /* compiled from: AccessibilityIterators.android.kt */
    /* renamed from: androidx.compose.ui.platform.c$a */
    /* loaded from: classes.dex */
    public static final class C0691a {
        private C0691a() {
        }

        public /* synthetic */ C0691a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0690c m39803a(Locale locale) {
            Intrinsics.isThisObjectNull(locale, "locale");
            if (C0690c.m39806g() == null) {
                C0690c.m39805h(new C0690c(locale, null));
            }
            C0690c m39806g = C0690c.m39806g();
            Objects.requireNonNull(m39806g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return m39806g;
        }
    }

    private C0690c(Locale locale) {
        m39804i(locale);
    }

    public /* synthetic */ C0690c(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    /* renamed from: g */
    public static final /* synthetic */ C0690c m39806g() {
        return f2192e;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m39805h(C0690c c0690c) {
        f2192e = c0690c;
    }

    /* renamed from: i */
    private final void m39804i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        Intrinsics.checkIfNull(characterInstance, "getCharacterInstance(locale)");
        this.f2193c = characterInstance;
    }

    /* renamed from: a */
    public int[] mo39755a(int i) {
        int length = m39827d().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            do {
                BreakIterator breakIterator = this.f2193c;
                if (breakIterator == null) {
                    Intrinsics.throwUninitPropException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.f2193c;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitPropException("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                } else {
                    BreakIterator breakIterator3 = this.f2193c;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitPropException("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i);
                    if (preceding == -1) {
                        return null;
                    }
                    return m39828c(preceding, i);
                }
            } while (i != -1);
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public int[] mo39754b(int i) {
        int length = m39827d().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.f2193c;
                if (breakIterator == null) {
                    Intrinsics.throwUninitPropException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.f2193c;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitPropException("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                } else {
                    BreakIterator breakIterator3 = this.f2193c;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitPropException("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i);
                    if (following == -1) {
                        return null;
                    }
                    return m39828c(i, following);
                }
            } while (i != -1);
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public void m39807e(String str) {
        Intrinsics.isThisObjectNull(str, "text");
        super.m39826e(str);
        BreakIterator breakIterator = this.f2193c;
        if (breakIterator == null) {
            Intrinsics.throwUninitPropException("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
