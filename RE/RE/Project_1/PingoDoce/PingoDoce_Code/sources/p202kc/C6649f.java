package p202kc;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import kotlin.TypeCastException;
import p489zc._Collections;
import sd.StringsJVM;
import sd._Strings;

/* renamed from: kc.f */
/* loaded from: classes2.dex */
public final class C6649f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m20391b(String str) {
        CharSequence m8866P0;
        String m8935y;
        String m8935y2;
        String m8935y3;
        String m8935y4;
        String m474U;
        if (str != null) {
            m8866P0 = _Strings.m8866P0(str);
            m8935y = StringsJVM.m8935y(m8866P0.toString(), "[\\", "\\]", false, 4, null);
            m8935y2 = StringsJVM.m8935y(m8935y, "]\\", "\\[", false, 4, null);
            m8935y3 = StringsJVM.m8935y(m8935y2, "{\\", "\\}", false, 4, null);
            m8935y4 = StringsJVM.m8935y(m8935y3, "}\\", "\\{", false, 4, null);
            ArrayList arrayList = new ArrayList(m8935y4.length());
            for (int i = 0; i < m8935y4.length(); i++) {
                char charAt = m8935y4.charAt(i);
                if (charAt == '[') {
                    charAt = ']';
                } else if (charAt == ']') {
                    charAt = '[';
                } else if (charAt == '{') {
                    charAt = '}';
                } else if (charAt == '}') {
                    charAt = '{';
                }
                arrayList.add(Character.valueOf(charAt));
            }
            m474U = _Collections.m474U(arrayList, BuildConfig.VERSION_NAME, null, null, 0, null, null, 62, null);
            return m474U;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
