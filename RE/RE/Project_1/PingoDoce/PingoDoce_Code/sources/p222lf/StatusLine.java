package p222lf;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.Protocol;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* renamed from: lf.k */
/* loaded from: classes2.dex */
public final class StatusLine {

    /* renamed from: d */
    public static final C7053a f18731d = new C7053a(null);

    /* renamed from: a */
    public final Protocol f18732a;

    /* renamed from: b */
    public final int f18733b;

    /* renamed from: c */
    public final String f18734c;

    /* compiled from: StatusLine.kt */
    /* renamed from: lf.k$a */
    /* loaded from: classes2.dex */
    public static final class C7053a {
        private C7053a() {
        }

        public /* synthetic */ C7053a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final StatusLine m19430a(String str) throws IOException {
            boolean m8948C;
            boolean m8948C2;
            Protocol protocol;
            String str2;
            Intrinsics.isThisObjectNull(str, "statusLine");
            m8948C = StringsJVM.m8948C(str, "HTTP/1.", false, 2, null);
            int i = 9;
            if (m8948C) {
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt == 0) {
                        protocol = Protocol.HTTP_1_0;
                    } else if (charAt == 1) {
                        protocol = Protocol.HTTP_1_1;
                    } else {
                        throw new ProtocolException(Intrinsics.addStrAndObj("Unexpected status line: ", str));
                    }
                } else {
                    throw new ProtocolException(Intrinsics.addStrAndObj("Unexpected status line: ", str));
                }
            } else {
                m8948C2 = StringsJVM.m8948C(str, "ICY ", false, 2, null);
                if (m8948C2) {
                    protocol = Protocol.HTTP_1_0;
                    i = 4;
                } else {
                    throw new ProtocolException(Intrinsics.addStrAndObj("Unexpected status line: ", str));
                }
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = BuildConfig.VERSION_NAME;
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        Intrinsics.checkIfNull(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(Intrinsics.addStrAndObj("Unexpected status line: ", str));
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(Intrinsics.addStrAndObj("Unexpected status line: ", str));
                }
            }
            throw new ProtocolException(Intrinsics.addStrAndObj("Unexpected status line: ", str));
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        Intrinsics.isThisObjectNull(protocol, "protocol");
        Intrinsics.isThisObjectNull(str, "message");
        this.f18732a = protocol;
        this.f18733b = i;
        this.f18734c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f18732a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f18733b);
        sb2.append(' ');
        sb2.append(this.f18734c);
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
