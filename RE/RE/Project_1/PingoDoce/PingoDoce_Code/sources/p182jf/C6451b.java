package p182jf;

import java.util.Arrays;
import java.util.logging.Logger;
import org.joda.time.DateTimeConstants;
import p181jd.C6429c0;
import p181jd.Intrinsics;

/* renamed from: jf.b */
/* loaded from: classes2.dex */
public final class C6451b {
    /* renamed from: a */
    public static final /* synthetic */ void m20884a(Task task, TaskQueue taskQueue, String str) {
        m20882c(task, taskQueue, str);
    }

    /* renamed from: b */
    public static final String m20883b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / ((long) DateTimeConstants.MILLIS_PER_SECOND)) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / ((long) DateTimeConstants.MILLIS_PER_SECOND)) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        return format;
    }

    /* renamed from: c */
    private static final void m20882c(Task task, TaskQueue taskQueue, String str) {
        Logger m20852a = TaskRunner.f17552h.m20852a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.m20875f());
        sb2.append(' ');
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(task.m20889b());
        m20852a.fine(sb2.toString());
    }
}
