package p201kb;

import android.content.Intent;
import com.google.zxing.EnumC4392a;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: kb.f */
/* loaded from: classes2.dex */
public final class C6628f {

    /* renamed from: a */
    private static final Pattern f17889a = Pattern.compile(",");

    /* renamed from: b */
    static final Set<EnumC4392a> f17890b;

    /* renamed from: c */
    static final Set<EnumC4392a> f17891c;

    /* renamed from: d */
    private static final Set<EnumC4392a> f17892d;

    /* renamed from: e */
    static final Set<EnumC4392a> f17893e;

    /* renamed from: f */
    static final Set<EnumC4392a> f17894f;

    /* renamed from: g */
    static final Set<EnumC4392a> f17895g;

    /* renamed from: h */
    static final Set<EnumC4392a> f17896h;

    /* renamed from: i */
    private static final Map<String, Set<EnumC4392a>> f17897i;

    static {
        EnumSet of = EnumSet.of(EnumC4392a.QR_CODE);
        f17893e = of;
        EnumSet of2 = EnumSet.of(EnumC4392a.DATA_MATRIX);
        f17894f = of2;
        EnumSet of3 = EnumSet.of(EnumC4392a.AZTEC);
        f17895g = of3;
        EnumSet of4 = EnumSet.of(EnumC4392a.PDF_417);
        f17896h = of4;
        EnumSet of5 = EnumSet.of(EnumC4392a.UPC_A, EnumC4392a.UPC_E, EnumC4392a.EAN_13, EnumC4392a.EAN_8, EnumC4392a.RSS_14, EnumC4392a.RSS_EXPANDED);
        f17890b = of5;
        EnumSet of6 = EnumSet.of(EnumC4392a.CODE_39, EnumC4392a.CODE_93, EnumC4392a.CODE_128, EnumC4392a.ITF, EnumC4392a.CODABAR);
        f17891c = of6;
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        f17892d = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f17897i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }

    /* renamed from: a */
    public static Set<EnumC4392a> m20431a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return m20430b(stringExtra != null ? Arrays.asList(f17889a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* renamed from: b */
    private static Set<EnumC4392a> m20430b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(EnumC4392a.class);
            try {
                for (String str2 : iterable) {
                    noneOf.add(EnumC4392a.valueOf(str2));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f17897i.get(str);
        }
        return null;
    }
}
