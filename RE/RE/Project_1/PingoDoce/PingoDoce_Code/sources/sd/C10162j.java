package sd;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p297pd.C8611f;
import p297pd._Ranges;

/* renamed from: sd.j */
/* loaded from: classes2.dex */
public final class C10162j {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final InterfaceC10152g m9014c(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C10153h(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final C8611f m9013d(MatchResult matchResult, int i) {
        C8611f m14992q;
        m14992q = _Ranges.m14992q(matchResult.start(i), matchResult.end(i));
        return m14992q;
    }
}
