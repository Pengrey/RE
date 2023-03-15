package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
/* loaded from: classes.dex */
public final class C1047a {

    /* renamed from: d */
    static final InterfaceC1058e f3365d;

    /* renamed from: e */
    private static final String f3366e;

    /* renamed from: f */
    private static final String f3367f;

    /* renamed from: g */
    static final C1047a f3368g;

    /* renamed from: h */
    static final C1047a f3369h;

    /* renamed from: a */
    private final boolean f3370a;

    /* renamed from: b */
    private final int f3371b;

    /* renamed from: c */
    private final InterfaceC1058e f3372c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: androidx.core.text.a$a */
    /* loaded from: classes.dex */
    public static final class C1048a {

        /* renamed from: a */
        private boolean f3373a;

        /* renamed from: b */
        private int f3374b;

        /* renamed from: c */
        private InterfaceC1058e f3375c;

        public C1048a() {
            m38676c(C1047a.m38685e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C1047a m38677b(boolean z) {
            return z ? C1047a.f3369h : C1047a.f3368g;
        }

        /* renamed from: c */
        private void m38676c(boolean z) {
            this.f3373a = z;
            this.f3375c = C1047a.f3365d;
            this.f3374b = 2;
        }

        /* renamed from: a */
        public C1047a m38678a() {
            if (this.f3374b == 2 && this.f3375c == C1047a.f3365d) {
                return m38677b(this.f3373a);
            }
            return new C1047a(this.f3373a, this.f3374b, this.f3375c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* renamed from: androidx.core.text.a$b */
    /* loaded from: classes.dex */
    public static class C1049b {

        /* renamed from: f */
        private static final byte[] f3376f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f3377a;

        /* renamed from: b */
        private final boolean f3378b;

        /* renamed from: c */
        private final int f3379c;

        /* renamed from: d */
        private int f3380d;

        /* renamed from: e */
        private char f3381e;

        static {
            for (int i = 0; i < 1792; i++) {
                f3376f[i] = Character.getDirectionality(i);
            }
        }

        C1049b(CharSequence charSequence, boolean z) {
            this.f3377a = charSequence;
            this.f3378b = z;
            this.f3379c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m38673c(char c) {
            return c < 1792 ? f3376f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m38670f() {
            char charAt;
            int i = this.f3380d;
            do {
                int i2 = this.f3380d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3377a;
                int i3 = i2 - 1;
                this.f3380d = i3;
                charAt = charSequence.charAt(i3);
                this.f3381e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f3380d = i;
            this.f3381e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        private byte m38669g() {
            char charAt;
            do {
                int i = this.f3380d;
                if (i >= this.f3379c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3377a;
                this.f3380d = i + 1;
                charAt = charSequence.charAt(i);
                this.f3381e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m38668h() {
            char charAt;
            int i = this.f3380d;
            while (true) {
                int i2 = this.f3380d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3377a;
                int i3 = i2 - 1;
                this.f3380d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f3381e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f3380d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f3377a;
                            int i5 = i4 - 1;
                            this.f3380d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f3381e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f3380d = i;
            this.f3381e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        private byte m38667i() {
            char charAt;
            int i = this.f3380d;
            while (true) {
                int i2 = this.f3380d;
                if (i2 < this.f3379c) {
                    CharSequence charSequence = this.f3377a;
                    this.f3380d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f3381e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f3380d;
                            if (i3 < this.f3379c) {
                                CharSequence charSequence2 = this.f3377a;
                                this.f3380d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f3381e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3380d = i;
                    this.f3381e = '<';
                    return (byte) 13;
                }
            }
        }

        /* renamed from: a */
        byte m38675a() {
            char charAt = this.f3377a.charAt(this.f3380d - 1);
            this.f3381e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3377a, this.f3380d);
                this.f3380d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3380d--;
            byte m38673c = m38673c(this.f3381e);
            if (this.f3378b) {
                char c = this.f3381e;
                if (c == '>') {
                    return m38668h();
                }
                return c == ';' ? m38670f() : m38673c;
            }
            return m38673c;
        }

        /* renamed from: b */
        byte m38674b() {
            char charAt = this.f3377a.charAt(this.f3380d);
            this.f3381e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3377a, this.f3380d);
                this.f3380d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3380d++;
            byte m38673c = m38673c(this.f3381e);
            if (this.f3378b) {
                char c = this.f3381e;
                if (c == '<') {
                    return m38667i();
                }
                return c == '&' ? m38669g() : m38673c;
            }
            return m38673c;
        }

        /* renamed from: d */
        int m38672d() {
            this.f3380d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f3380d < this.f3379c && i == 0) {
                byte m38674b = m38674b();
                if (m38674b != 0) {
                    if (m38674b == 1 || m38674b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (m38674b != 9) {
                        switch (m38674b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f3380d > 0) {
                switch (m38675a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        int m38671e() {
            this.f3380d = this.f3379c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f3380d > 0) {
                    byte m38675a = m38675a();
                    if (m38675a != 0) {
                        if (m38675a == 1 || m38675a == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i2 == 0) {
                                break;
                            }
                        } else if (m38675a != 9) {
                            switch (m38675a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    i--;
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        InterfaceC1058e interfaceC1058e = C1059f.f3397c;
        f3365d = interfaceC1058e;
        f3366e = Character.toString((char) 8206);
        f3367f = Character.toString((char) 8207);
        f3368g = new C1047a(false, 2, interfaceC1058e);
        f3369h = new C1047a(true, 2, interfaceC1058e);
    }

    C1047a(boolean z, int i, InterfaceC1058e interfaceC1058e) {
        this.f3370a = z;
        this.f3371b = i;
        this.f3372c = interfaceC1058e;
    }

    /* renamed from: a */
    private static int m38689a(CharSequence charSequence) {
        return new C1049b(charSequence, false).m38672d();
    }

    /* renamed from: b */
    private static int m38688b(CharSequence charSequence) {
        return new C1049b(charSequence, false).m38671e();
    }

    /* renamed from: c */
    public static C1047a m38687c() {
        return new C1048a().m38678a();
    }

    /* renamed from: e */
    static boolean m38685e(Locale locale) {
        return C1066g.m38637b(locale) == 1;
    }

    /* renamed from: f */
    private String m38684f(CharSequence charSequence, InterfaceC1058e interfaceC1058e) {
        boolean mo38641a = interfaceC1058e.mo38641a(charSequence, 0, charSequence.length());
        if (this.f3370a || !(mo38641a || m38688b(charSequence) == 1)) {
            return this.f3370a ? (!mo38641a || m38688b(charSequence) == -1) ? f3367f : BuildConfig.VERSION_NAME : BuildConfig.VERSION_NAME;
        }
        return f3366e;
    }

    /* renamed from: g */
    private String m38683g(CharSequence charSequence, InterfaceC1058e interfaceC1058e) {
        boolean mo38641a = interfaceC1058e.mo38641a(charSequence, 0, charSequence.length());
        if (this.f3370a || !(mo38641a || m38689a(charSequence) == 1)) {
            return this.f3370a ? (!mo38641a || m38689a(charSequence) == -1) ? f3367f : BuildConfig.VERSION_NAME : BuildConfig.VERSION_NAME;
        }
        return f3366e;
    }

    /* renamed from: d */
    public boolean m38686d() {
        return (this.f3371b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m38682h(CharSequence charSequence) {
        return m38681i(charSequence, this.f3372c, true);
    }

    /* renamed from: i */
    public CharSequence m38681i(CharSequence charSequence, InterfaceC1058e interfaceC1058e, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean mo38641a = interfaceC1058e.mo38641a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m38686d() && z) {
            spannableStringBuilder.append((CharSequence) m38683g(charSequence, mo38641a ? C1059f.f3396b : C1059f.f3395a));
        }
        if (mo38641a != this.f3370a) {
            spannableStringBuilder.append(mo38641a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m38684f(charSequence, mo38641a ? C1059f.f3396b : C1059f.f3395a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m38680j(String str) {
        return m38679k(str, this.f3372c, true);
    }

    /* renamed from: k */
    public String m38679k(String str, InterfaceC1058e interfaceC1058e, boolean z) {
        if (str == null) {
            return null;
        }
        return m38681i(str, interfaceC1058e, z).toString();
    }
}
