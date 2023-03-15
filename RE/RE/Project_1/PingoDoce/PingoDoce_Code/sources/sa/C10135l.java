package sa;

import com.google.gson.AbstractC4376l;
import com.google.gson.C4377m;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import p368ta.C10432n;

/* renamed from: sa.l */
/* loaded from: classes2.dex */
public final class C10135l {
    /* renamed from: a */
    public static AbstractC4376l m9077a(C4387a c4387a) throws JsonParseException {
        boolean z;
        try {
            try {
                c4387a.mo8038o0();
                z = false;
                try {
                    return C10432n.f27130X.mo27782e(c4387a);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return C4377m.f11854a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    /* renamed from: b */
    public static void m9076b(AbstractC4376l abstractC4376l, C4390c c4390c) throws IOException {
        C10432n.f27130X.mo27781f(c4390c, abstractC4376l);
    }

    /* renamed from: c */
    public static Writer m9075c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C10136a(appendable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Streams.java */
    /* renamed from: sa.l$a */
    /* loaded from: classes2.dex */
    public static final class C10136a extends Writer {

        /* renamed from: w */
        private final Appendable f26437w;

        /* renamed from: x */
        private final C10137a f26438x = new C10137a();

        /* compiled from: Streams.java */
        /* renamed from: sa.l$a$a */
        /* loaded from: classes2.dex */
        static class C10137a implements CharSequence {

            /* renamed from: w */
            char[] f26439w;

            C10137a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f26439w[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f26439w.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f26439w, i, i2 - i);
            }
        }

        C10136a(Appendable appendable) {
            this.f26437w = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C10137a c10137a = this.f26438x;
            c10137a.f26439w = cArr;
            this.f26437w.append(c10137a, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.f26437w.append((char) i);
        }
    }
}
