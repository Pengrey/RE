package p368ta;

import com.google.gson.AbstractC4376l;
import com.google.gson.C4373i;
import com.google.gson.C4377m;
import com.google.gson.C4378n;
import com.google.gson.C4379o;
import com.google.gson.stream.C4390c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ta.f */
/* loaded from: classes2.dex */
public final class C10412f extends C4390c {

    /* renamed from: K */
    private static final Writer f27058K = new C10413a();

    /* renamed from: L */
    private static final C4379o f27059L = new C4379o("closed");

    /* renamed from: H */
    private final List<AbstractC4376l> f27060H;

    /* renamed from: I */
    private String f27061I;

    /* renamed from: J */
    private AbstractC4376l f27062J;

    /* compiled from: JsonTreeWriter.java */
    /* renamed from: ta.f$a */
    /* loaded from: classes2.dex */
    class C10413a extends Writer {
        C10413a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C10412f() {
        super(f27058K);
        this.f27060H = new ArrayList();
        this.f27062J = C4377m.f11854a;
    }

    /* renamed from: D0 */
    private AbstractC4376l m8034D0() {
        List<AbstractC4376l> list = this.f27060H;
        return list.get(list.size() - 1);
    }

    /* renamed from: E0 */
    private void m8033E0(AbstractC4376l abstractC4376l) {
        if (this.f27061I != null) {
            if (!abstractC4376l.m27760p() || m27720E()) {
                ((C4378n) m8034D0()).m27757u(this.f27061I, abstractC4376l);
            }
            this.f27061I = null;
        } else if (this.f27060H.isEmpty()) {
            this.f27062J = abstractC4376l;
        } else {
            AbstractC4376l m8034D0 = m8034D0();
            if (m8034D0 instanceof C4373i) {
                ((C4373i) m8034D0).m27767u(abstractC4376l);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: A0 */
    public AbstractC4376l m8035A0() {
        if (this.f27060H.isEmpty()) {
            return this.f27062J;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f27060H);
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: L */
    public C4390c mo8032L(String str) throws IOException {
        if (!this.f27060H.isEmpty() && this.f27061I == null) {
            if (m8034D0() instanceof C4378n) {
                this.f27061I = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: P */
    public C4390c mo8031P() throws IOException {
        m8033E0(C4377m.f11854a);
        return this;
    }

    @Override // com.google.gson.stream.C4390c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f27060H.isEmpty()) {
            this.f27060H.add(f27059L);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: e */
    public C4390c mo8030e() throws IOException {
        C4373i c4373i = new C4373i();
        m8033E0(c4373i);
        this.f27060H.add(c4373i);
        return this;
    }

    @Override // com.google.gson.stream.C4390c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: h */
    public C4390c mo8029h() throws IOException {
        C4378n c4378n = new C4378n();
        m8033E0(c4378n);
        this.f27060H.add(c4378n);
        return this;
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: l0 */
    public C4390c mo8028l0(long j) throws IOException {
        m8033E0(new C4379o(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: o0 */
    public C4390c mo8027o0(Boolean bool) throws IOException {
        if (bool == null) {
            return mo8031P();
        }
        m8033E0(new C4379o(bool));
        return this;
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: q0 */
    public C4390c mo8026q0(Number number) throws IOException {
        if (number == null) {
            return mo8031P();
        }
        if (!m27718H()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m8033E0(new C4379o(number));
        return this;
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: t0 */
    public C4390c mo8025t0(String str) throws IOException {
        if (str == null) {
            return mo8031P();
        }
        m8033E0(new C4379o(str));
        return this;
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: v */
    public C4390c mo8024v() throws IOException {
        if (!this.f27060H.isEmpty() && this.f27061I == null) {
            if (m8034D0() instanceof C4373i) {
                List<AbstractC4376l> list = this.f27060H;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: v0 */
    public C4390c mo8023v0(boolean z) throws IOException {
        m8033E0(new C4379o(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.C4390c
    /* renamed from: y */
    public C4390c mo8022y() throws IOException {
        if (!this.f27060H.isEmpty() && this.f27061I == null) {
            if (m8034D0() instanceof C4378n) {
                List<AbstractC4376l> list = this.f27060H;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
