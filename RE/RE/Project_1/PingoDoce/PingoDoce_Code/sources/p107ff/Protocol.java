package p107ff;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: ff.a0 */
/* loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final C5457a Companion = new C5457a(null);
    private final String protocol;

    /* compiled from: Protocol.kt */
    /* renamed from: ff.a0$a */
    /* loaded from: classes2.dex */
    public static final class C5457a {
        private C5457a() {
        }

        public /* synthetic */ C5457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Protocol m24278a(String str) throws IOException {
            Intrinsics.isThisObjectNull(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!Intrinsics.equals(str, Protocol.access$getProtocol$p(protocol))) {
                protocol = Protocol.HTTP_1_1;
                if (!Intrinsics.equals(str, Protocol.access$getProtocol$p(protocol))) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics.equals(str, Protocol.access$getProtocol$p(protocol))) {
                        protocol = Protocol.HTTP_2;
                        if (!Intrinsics.equals(str, Protocol.access$getProtocol$p(protocol))) {
                            protocol = Protocol.SPDY_3;
                            if (!Intrinsics.equals(str, Protocol.access$getProtocol$p(protocol))) {
                                protocol = Protocol.QUIC;
                                if (!Intrinsics.equals(str, Protocol.access$getProtocol$p(protocol))) {
                                    throw new IOException(Intrinsics.addStrAndObj("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final /* synthetic */ String access$getProtocol$p(Protocol protocol) {
        return protocol.protocol;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.m24278a(str);
    }

    public String toString() {
        return this.protocol;
    }
}
