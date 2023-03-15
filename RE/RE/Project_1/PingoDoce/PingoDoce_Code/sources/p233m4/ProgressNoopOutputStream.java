package p233m4;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p181jd.Intrinsics;

/* renamed from: m4.g */
/* loaded from: classes.dex */
public final class ProgressNoopOutputStream extends OutputStream implements InterfaceC7129h {

    /* renamed from: A */
    private final Handler f18926A;

    /* renamed from: w */
    private final Map f18927w = new HashMap();

    /* renamed from: x */
    private GraphRequest f18928x;

    /* renamed from: y */
    private RequestProgress f18929y;

    /* renamed from: z */
    private int f18930z;

    public ProgressNoopOutputStream(Handler handler) {
        this.f18926A = handler;
    }

    /* renamed from: a */
    public void mo19110a(GraphRequest graphRequest) {
        this.f18928x = graphRequest;
        this.f18929y = graphRequest != null ? (RequestProgress) this.f18927w.get(graphRequest) : null;
    }

    /* renamed from: c */
    public final void m19113c(long j) {
        GraphRequest graphRequest = this.f18928x;
        if (graphRequest != null) {
            if (this.f18929y == null) {
                RequestProgress requestProgress = new RequestProgress(this.f18926A, graphRequest);
                this.f18929y = requestProgress;
                this.f18927w.put(graphRequest, requestProgress);
            }
            RequestProgress requestProgress2 = this.f18929y;
            if (requestProgress2 != null) {
                requestProgress2.m19108b(j);
            }
            this.f18930z += (int) j;
        }
    }

    /* renamed from: e */
    public final int m19112e() {
        return this.f18930z;
    }

    /* renamed from: h */
    public final Map m19111h() {
        return this.f18927w;
    }

    public void write(byte[] bArr) {
        Intrinsics.isThisObjectNull(bArr, "buffer");
        m19113c(bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        Intrinsics.isThisObjectNull(bArr, "buffer");
        m19113c(i2);
    }

    public void write(int i) {
        m19113c(1L);
    }
}
