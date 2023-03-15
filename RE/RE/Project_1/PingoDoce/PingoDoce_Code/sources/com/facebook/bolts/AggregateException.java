package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AggregateException.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m20207d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AggregateException extends Exception {

    /* renamed from: w */
    private final List f6664w;

    /* compiled from: AggregateException.kt */
    /* renamed from: com.facebook.bolts.AggregateException$a */
    /* loaded from: classes.dex */
    public static final class C2301a {
        private C2301a() {
        }

        public /* synthetic */ C2301a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2301a(null);
    }

    public void printStackTrace(PrintStream printStream) {
        Intrinsics.isThisObjectNull(printStream, "err");
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th2 : this.f6664w) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) String.valueOf(i));
            printStream.append(": ");
            if (th2 != null) {
                th2.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        Intrinsics.isThisObjectNull(printWriter, "err");
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th2 : this.f6664w) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) String.valueOf(i));
            printWriter.append(": ");
            if (th2 != null) {
                th2.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }
}
