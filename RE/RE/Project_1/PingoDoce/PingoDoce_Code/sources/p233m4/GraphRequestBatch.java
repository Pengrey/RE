package p233m4;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc._ArraysJvm;

/* renamed from: m4.d */
/* loaded from: classes.dex */
public final class GraphRequestBatch extends AbstractList {

    /* renamed from: C */
    private static final AtomicInteger f18913C;

    /* renamed from: A */
    private List f18914A;

    /* renamed from: B */
    private String f18915B;

    /* renamed from: w */
    private Handler f18916w;

    /* renamed from: x */
    private int f18917x;

    /* renamed from: y */
    private final String f18918y;

    /* renamed from: z */
    private List f18919z;

    /* compiled from: GraphRequestBatch.kt */
    /* renamed from: m4.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7124a {
        /* renamed from: a */
        void m19127a(GraphRequestBatch graphRequestBatch);
    }

    /* compiled from: GraphRequestBatch.kt */
    /* renamed from: m4.d$b */
    /* loaded from: classes.dex */
    public static final class C7125b {
        private C7125b() {
        }

        public /* synthetic */ C7125b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GraphRequestBatch.kt */
    /* renamed from: m4.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC7126c extends InterfaceC7124a {
        /* renamed from: b */
        void m19126b(GraphRequestBatch graphRequestBatch, long j, long j2);
    }

    static {
        new C7125b(null);
        f18913C = new AtomicInteger();
    }

    public GraphRequestBatch(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "requests");
        this.f18918y = String.valueOf(f18913C.incrementAndGet());
        this.f18914A = new ArrayList();
        this.f18919z = new ArrayList(collection);
    }

    /* renamed from: o */
    private final List m19135o() {
        return GraphRequest.f6606s.m34160h(this);
    }

    /* renamed from: q */
    private final GraphRequestAsyncTask m19133q() {
        return GraphRequest.f6606s.m34157k(this);
    }

    /* renamed from: B */
    public final List m19149B() {
        return this.f18919z;
    }

    /* renamed from: C */
    public int m19148C() {
        return this.f18919z.size();
    }

    /* renamed from: D */
    public final int m19147D() {
        return this.f18917x;
    }

    /* renamed from: E */
    public /* bridge */ int m19146E(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    /* renamed from: F */
    public /* bridge */ int m19145F(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    /* renamed from: G */
    public /* bridge */ boolean m19144G(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    /* renamed from: H */
    public GraphRequest mo18573H(int i) {
        return (GraphRequest) this.f18919z.remove(i);
    }

    /* renamed from: I */
    public GraphRequest mo18572I(int i, GraphRequest graphRequest) {
        Intrinsics.isThisObjectNull(graphRequest, "element");
        return (GraphRequest) this.f18919z.set(i, graphRequest);
    }

    /* renamed from: J */
    public final void m19141J(Handler handler) {
        this.f18916w = handler;
    }

    /* renamed from: b */
    public void mo18570b(int i, GraphRequest graphRequest) {
        Intrinsics.isThisObjectNull(graphRequest, "element");
        this.f18919z.add(i, graphRequest);
    }

    public void clear() {
        this.f18919z.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m19137h((GraphRequest) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo18569f(GraphRequest graphRequest) {
        Intrinsics.isThisObjectNull(graphRequest, "element");
        return this.f18919z.add(graphRequest);
    }

    /* renamed from: g */
    public final void m19138g(InterfaceC7124a interfaceC7124a) {
        Intrinsics.isThisObjectNull(interfaceC7124a, "callback");
        if (this.f18914A.contains(interfaceC7124a)) {
            return;
        }
        this.f18914A.add(interfaceC7124a);
    }

    /* renamed from: h */
    public /* bridge */ boolean m19137h(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m19146E((GraphRequest) obj);
        }
        return -1;
    }

    /* renamed from: l */
    public final List m19136l() {
        return m19135o();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m19145F((GraphRequest) obj);
        }
        return -1;
    }

    /* renamed from: p */
    public final GraphRequestAsyncTask m19134p() {
        return m19133q();
    }

    public final /* bridge */ int size() {
        return m19148C();
    }

    /* renamed from: t */
    public GraphRequest mo18562t(int i) {
        return (GraphRequest) this.f18919z.get(i);
    }

    /* renamed from: u */
    public final String m19131u() {
        return this.f18915B;
    }

    /* renamed from: v */
    public final Handler m19130v() {
        return this.f18916w;
    }

    /* renamed from: x */
    public final List m19129x() {
        return this.f18914A;
    }

    /* renamed from: y */
    public final String m19128y() {
        return this.f18918y;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m19144G((GraphRequest) obj);
        }
        return false;
    }

    public GraphRequestBatch(GraphRequest... graphRequestArr) {
        List m320d;
        Intrinsics.isThisObjectNull(graphRequestArr, "requests");
        this.f18918y = String.valueOf(f18913C.incrementAndGet());
        this.f18914A = new ArrayList();
        m320d = _ArraysJvm.m320d(graphRequestArr);
        this.f18919z = new ArrayList(m320d);
    }
}
