package p107ff;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p181jd.Intrinsics;
import p489zc._Arrays;

/* renamed from: ff.q */
/* loaded from: classes2.dex */
public interface Dns {

    /* renamed from: a */
    public static final Dns f15524a;

    /* compiled from: Dns.kt */
    /* renamed from: ff.q$a */
    /* loaded from: classes2.dex */
    public static final class C5488a {

        /* renamed from: a */
        static final /* synthetic */ C5488a f15525a = new C5488a();

        /* compiled from: Dns.kt */
        /* renamed from: ff.q$a$a */
        /* loaded from: classes2.dex */
        private static final class C5489a implements Dns {
            /* renamed from: a */
            public List m24056a(String str) {
                List m276R;
                Intrinsics.isThisObjectNull(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    Intrinsics.checkIfNull(allByName, "getAllByName(hostname)");
                    m276R = _Arrays.m276R(allByName);
                    return m276R;
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.addStrAndObj("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private C5488a() {
        }
    }

    static {
        C5488a c5488a = C5488a.f15525a;
        f15524a = new C5488a.C5489a();
    }

    /* renamed from: a */
    List m24057a(String str) throws UnknownHostException;
}
