package sa;

/* renamed from: sa.e */
/* loaded from: classes2.dex */
public final class C10121e {

    /* renamed from: a */
    private static final int f26412a = m9105a();

    /* renamed from: a */
    private static int m9105a() {
        return m9102d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m9104b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m9103c() {
        return f26412a;
    }

    /* renamed from: d */
    static int m9102d(String str) {
        int m9100f = m9100f(str);
        if (m9100f == -1) {
            m9100f = m9104b(str);
        }
        if (m9100f == -1) {
            return 6;
        }
        return m9100f;
    }

    /* renamed from: e */
    public static boolean m9101e() {
        return f26412a >= 9;
    }

    /* renamed from: f */
    private static int m9100f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
