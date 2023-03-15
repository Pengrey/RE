package com.github.aachartmodel.aainfographics.aachartcreator;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import p181jd.C6429c0;
import p181jd.Intrinsics;

/* compiled from: AAChartModel.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0003\b\u0090\u0001\u0018\u00002\u00020\u0001:\u0002Ð\u0001B±\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010'\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010'\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\bJ\u0017\u0010%\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b&\u0010 J\u001d\u0010(\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b*\u0010 J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nJ\u0017\u0010,\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b,\u0010 J\u0017\u0010-\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b-\u0010\u0007J\u001b\u0010.\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0'¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b1\u0010\u0017J\u0017\u00102\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b2\u0010 J\u0017\u00103\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b3\u0010 J\u0017\u00104\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b4\u0010 J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bJ\u0017\u00106\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b6\u0010\u0017J\u0017\u00107\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b7\u0010\u0017J\u0017\u00108\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b8\u0010\u0017J\u0017\u00109\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b9\u0010 J\u001b\u0010:\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b<\u0010 J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001J\u0017\u0010>\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b>\u0010\u0017J\u001b\u0010?\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b@\u0010 J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020AR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010>\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010$\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u00100\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010R\u001a\u0004\ba\u0010T\"\u0004\bb\u0010VR$\u00107\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010R\u001a\u0004\bc\u0010T\"\u0004\bd\u0010VR$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\\\u001a\u0004\be\u0010^\"\u0004\bf\u0010`R$\u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010C\u001a\u0004\bg\u0010E\"\u0004\bh\u0010GR*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u00103\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010W\u001a\u0004\b}\u0010Y\"\u0004\b~\u0010[R%\u00106\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b6\u0010R\u001a\u0004\b\u007f\u0010T\"\u0005\b\u0080\u0001\u0010VR)\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0004\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010,\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b,\u0010W\u001a\u0005\b\u0086\u0001\u0010Y\"\u0005\b\u0087\u0001\u0010[R,\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b?\u0010i\u001a\u0005\b\u0088\u0001\u0010k\"\u0005\b\u0089\u0001\u0010mR&\u00104\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b4\u0010W\u001a\u0005\b\u008a\u0001\u0010Y\"\u0005\b\u008b\u0001\u0010[R&\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0016\u0010R\u001a\u0005\b\u008c\u0001\u0010T\"\u0005\b\u008d\u0001\u0010VR&\u00102\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b2\u0010W\u001a\u0005\b\u008e\u0001\u0010Y\"\u0005\b\u008f\u0001\u0010[R&\u00105\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b5\u0010\\\u001a\u0005\b\u0090\u0001\u0010^\"\u0005\b\u0091\u0001\u0010`R&\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0010\u0010\\\u001a\u0005\b\u0092\u0001\u0010^\"\u0005\b\u0093\u0001\u0010`R)\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R/\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b.\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u00108\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b8\u0010R\u001a\u0005\b\u009e\u0001\u0010T\"\u0005\b\u009f\u0001\u0010VR)\u0010=\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b=\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R&\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u000f\u0010M\u001a\u0005\b¥\u0001\u0010O\"\u0005\b¦\u0001\u0010QR&\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b%\u0010W\u001a\u0005\b§\u0001\u0010Y\"\u0005\b¨\u0001\u0010[R&\u0010*\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b*\u0010W\u001a\u0005\b©\u0001\u0010Y\"\u0005\bª\u0001\u0010[R&\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001f\u0010W\u001a\u0005\b«\u0001\u0010Y\"\u0005\b¬\u0001\u0010[R&\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b!\u0010W\u001a\u0005\b\u00ad\u0001\u0010Y\"\u0005\b®\u0001\u0010[R)\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0019\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R)\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R/\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b(\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R&\u0010@\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b@\u0010W\u001a\u0005\b¾\u0001\u0010Y\"\u0005\b¿\u0001\u0010[R&\u00101\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b1\u0010R\u001a\u0005\bÀ\u0001\u0010T\"\u0005\bÁ\u0001\u0010VR&\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010W\u001a\u0005\bÂ\u0001\u0010Y\"\u0005\bÃ\u0001\u0010[R&\u00109\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b9\u0010W\u001a\u0005\bÄ\u0001\u0010Y\"\u0005\bÅ\u0001\u0010[R&\u0010&\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b&\u0010W\u001a\u0005\bÆ\u0001\u0010Y\"\u0005\bÇ\u0001\u0010[R&\u0010<\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b<\u0010W\u001a\u0005\bÈ\u0001\u0010Y\"\u0005\bÉ\u0001\u0010[R&\u0010+\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b+\u0010M\u001a\u0005\bÊ\u0001\u0010O\"\u0005\bË\u0001\u0010QR&\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\t\u0010\\\u001a\u0005\bÌ\u0001\u0010^\"\u0005\bÍ\u0001\u0010`¨\u0006Ñ\u0001"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;", "prop", "animationType", BuildConfig.VERSION_NAME, "animationDuration", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", BuildConfig.VERSION_NAME, "title", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "titleStyle", "subtitle", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "subtitleAlign", "subtitleStyle", "axesTextColor", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "chartType", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "stacking", BuildConfig.VERSION_NAME, "markerRadius", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;", "markerSymbol", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;", "markerSymbolStyle", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "zoomType", BuildConfig.VERSION_NAME, "inverted", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "xAxisReversed", "yAxisReversed", "tooltipEnabled", "tooltipValueSuffix", "gradientColorEnable", "polar", BuildConfig.VERSION_NAME, "margin", "([Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "dataLabelsEnabled", "dataLabelsStyle", "xAxisLabelsEnabled", "xAxisTickInterval", "categories", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "xAxisGridLineWidth", "yAxisGridLineWidth", "xAxisVisible", "yAxisVisible", "yAxisLabelsEnabled", "yAxisTitle", "yAxisLineWidth", "yAxisMin", "yAxisMax", "yAxisAllowDecimals", "colorsTheme", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "legendEnabled", "backgroundColor", "borderRadius", "series", "touchEventEnabled", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "scrollablePlotArea", "Ljava/lang/Integer;", "getAnimationDuration", "()Ljava/lang/Integer;", "setAnimationDuration", "(Ljava/lang/Integer;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "getZoomType", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "setZoomType", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getTitleStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setTitleStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "Ljava/lang/Float;", "getBorderRadius", "()Ljava/lang/Float;", "setBorderRadius", "(Ljava/lang/Float;)V", "Ljava/lang/Boolean;", "getYAxisReversed", "()Ljava/lang/Boolean;", "setYAxisReversed", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getTooltipValueSuffix", "()Ljava/lang/String;", "setTooltipValueSuffix", "(Ljava/lang/String;)V", "getXAxisGridLineWidth", "setXAxisGridLineWidth", "getYAxisMin", "setYAxisMin", "getSubtitle", "setSubtitle", "getXAxisTickInterval", "setXAxisTickInterval", "[Ljava/lang/Object;", "getColorsTheme", "()[Ljava/lang/Object;", "setColorsTheme", "([Ljava/lang/Object;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "getSubtitleAlign", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "setSubtitleAlign", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "getScrollablePlotArea", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "setScrollablePlotArea", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "getStacking", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "setStacking", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;)V", "getYAxisVisible", "setYAxisVisible", "getYAxisLineWidth", "setYAxisLineWidth", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;", "getAnimationType", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;", "setAnimationType", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;)V", "getXAxisLabelsEnabled", "setXAxisLabelsEnabled", "getSeries", "setSeries", "getYAxisLabelsEnabled", "setYAxisLabelsEnabled", "getMarkerRadius", "setMarkerRadius", "getXAxisVisible", "setXAxisVisible", "getYAxisTitle", "setYAxisTitle", "getAxesTextColor", "setAxesTextColor", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "getChartType", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "setChartType", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;)V", "[Ljava/lang/String;", "getCategories", "()[Ljava/lang/String;", "setCategories", "([Ljava/lang/String;)V", "getYAxisMax", "setYAxisMax", "Ljava/lang/Object;", "getBackgroundColor", "()Ljava/lang/Object;", "setBackgroundColor", "(Ljava/lang/Object;)V", "getSubtitleStyle", "setSubtitleStyle", "getGradientColorEnable", "setGradientColorEnable", "getDataLabelsEnabled", "setDataLabelsEnabled", "getInverted", "setInverted", "getXAxisReversed", "setXAxisReversed", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;", "getMarkerSymbol", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;", "setMarkerSymbol", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;", "getMarkerSymbolStyle", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;", "setMarkerSymbolStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;)V", "[Ljava/lang/Float;", "getMargin", "()[Ljava/lang/Float;", "setMargin", "([Ljava/lang/Float;)V", "getTouchEventEnabled", "setTouchEventEnabled", "getYAxisGridLineWidth", "setYAxisGridLineWidth", "getTooltipEnabled", "setTooltipEnabled", "getYAxisAllowDecimals", "setYAxisAllowDecimals", "getPolar", "setPolar", "getLegendEnabled", "setLegendEnabled", "getDataLabelsStyle", "setDataLabelsStyle", "getTitle", "setTitle", "<init>", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;Ljava/lang/Integer;Ljava/lang/String;Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;Ljava/lang/String;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;Ljava/lang/String;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;Ljava/lang/Float;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;[Ljava/lang/Float;Ljava/lang/Boolean;Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;Ljava/lang/Boolean;Ljava/lang/Integer;[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;[Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Float;[Ljava/lang/Object;Ljava/lang/Boolean;Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;)V", "Builder", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAChartModel {
    private Integer animationDuration;
    private AAChartAnimationType animationType;
    private String axesTextColor;
    private Object backgroundColor;
    private Float borderRadius;
    private String[] categories;
    private AAChartType chartType;
    private Object[] colorsTheme;
    private Boolean dataLabelsEnabled;
    private AAStyle dataLabelsStyle;
    private Boolean gradientColorEnable;
    private Boolean inverted;
    private Boolean legendEnabled;
    private Float[] margin;
    private Float markerRadius;
    private AAChartSymbolType markerSymbol;
    private AAChartSymbolStyleType markerSymbolStyle;
    private Boolean polar;
    private AAScrollablePlotArea scrollablePlotArea;
    private Object[] series;
    private AAChartStackingType stacking;
    private String subtitle;
    private AAChartAlignType subtitleAlign;
    private AAStyle subtitleStyle;
    private String title;
    private AAStyle titleStyle;
    private Boolean tooltipEnabled;
    private String tooltipValueSuffix;
    private Boolean touchEventEnabled;
    private Float xAxisGridLineWidth;
    private Boolean xAxisLabelsEnabled;
    private Boolean xAxisReversed;
    private Integer xAxisTickInterval;
    private Boolean xAxisVisible;
    private Boolean yAxisAllowDecimals;
    private Float yAxisGridLineWidth;
    private Boolean yAxisLabelsEnabled;
    private Float yAxisLineWidth;
    private Float yAxisMax;
    private Float yAxisMin;
    private Boolean yAxisReversed;
    private String yAxisTitle;
    private Boolean yAxisVisible;
    private AAChartZoomType zoomType;

    /* compiled from: AAChartModel.kt */
    @Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0013\u0012\b\u0010£\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001B\u001e\b\u0016\u0012\b\u0010£\u0001\u001a\u00030\u0087\u0001\u0012\u0007\u0010¦\u0001\u001a\u00020\u000f¢\u0006\u0006\b¤\u0001\u0010§\u0001J/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J-\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J-\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0017J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020 J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020&J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020(J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020*J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J-\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u0010\u0016J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u0012\u00106\u001a\u00020\u00002\n\u0010\u0010\u001a\u000205\"\u00020\rJ&\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\rJ&\u00106\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0002J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0017J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002J!\u0010C\u001a\u00020\u00002\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0004\"\u00020\u0006¢\u0006\u0004\bC\u0010DJ\u0012\u0010C\u001a\u00020\u00002\n\u0010F\u001a\u00020E\"\u00020\u0002J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010G\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J-\u0010L\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001¢\u0006\u0004\bL\u0010\u0016J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u0017\u0010N\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u0017\u0010P\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bP\u0010OJ\u000e\u0010P\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u001b\u0010R\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\bR\u0010SJ!\u0010R\u001a\u00020\u00002\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0004\"\u00020\u0006¢\u0006\u0004\bR\u0010DJ\u0012\u0010R\u001a\u00020\u00002\n\u0010T\u001a\u00020E\"\u00020\u0002J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010W\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010W\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J!\u0010Y\u001a\u00020\u00002\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020X0\u0004\"\u00020X¢\u0006\u0004\bY\u0010ZJ\u000e\u0010[\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020,J\u000e\u0010]\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\\J\u0006\u0010^\u001a\u00020\u000fR\u0018\u0010_\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010`R\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010j\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010l\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010kR\u0018\u0010r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010`R\u0018\u0010u\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010kR\u0018\u0010v\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001e\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010eR\u0018\u0010y\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010`R\u0018\u0010z\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010pR\u0018\u0010{\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010}\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u007f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010kR\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010`R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010`R!\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010pR$\u0010\u0089\u0001\u001a\r \u0088\u0001*\u0005\u0018\u00010\u0087\u00010\u0087\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010`R\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010`R\u001a\u0010\u008f\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010`R\u001a\u0010\u0090\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010kR\u001a\u0010\u0091\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010`R\u001a\u0010\u0092\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010`R\u001a\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010pR$\u0010\u0095\u0001\u001a\r \u0088\u0001*\u0005\u0018\u00010\u0094\u00010\u0094\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010sR\u001a\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010gR\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010`R\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010pR\u001a\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010gR\u001a\u0010\u009c\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010`R\u001a\u0010\u009d\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010kR\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010 \u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010¢\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010`¨\u0006¨\u0001"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel$Builder;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "id", BuildConfig.VERSION_NAME, "formatArgs", BuildConfig.VERSION_NAME, "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "colorResId", "getColor", "toColorString", "dimenResId", BuildConfig.VERSION_NAME, "getDimen", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "prop", "set", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;", "setAnimationType", "setAnimationDuration", "setTitle", "(I[Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel$Builder;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setTitleStyle", "setSubtitle", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "setSubtitleAlign", "setSubtitleStyle", "setAxesTextColor", "color", "setAxesTextColorRes", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "setChartType", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "setStacking", "setMarkerRadius", "setMarkerRadiusRes", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;", "setMarkerSymbol", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;", "setMarkerSymbolStyle", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "setZoomType", BuildConfig.VERSION_NAME, "setInverted", "setXAxisReversed", "setYAxisReversed", "setTooltipEnabled", "setTooltipValueSuffix", "stringResId", "setGradientColorEnable", "setPolar", BuildConfig.VERSION_NAME, "setMargin", "top", "left", "bottom", "right", "topResId", "leftResId", "bottomResId", "rightResId", "setDataLabelsEnabled", "setDataLabelsStyle", "setXAxisLabelsEnabled", "setXAxisTickInterval", "setCategories", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel$Builder;", BuildConfig.VERSION_NAME, "stringResIds", "setXAxisGridLineWidth", "setYAxisGridLineWidth", "setXAxisVisible", "setYAxisVisible", "setYAxisLabelsEnabled", "setYAxisTitle", "setYAxisLineWidth", "setYAxisMin", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel$Builder;", "setYAxisMax", "setYAxisAllowDecimals", "setColorsTheme", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel$Builder;", "colorResIds", "setLegendEnabled", "setBackgroundColor", "setBorderRadius", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "setSeries", "([Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel$Builder;", "setTouchEventEnabled", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "setScrollablePlotArea", "build", "tooltipEnabled", "Ljava/lang/Boolean;", "margin", "[Ljava/lang/Float;", "gradientColorEnable", "series", "[Ljava/lang/Object;", "dataLabelsStyle", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "subtitleAlign", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "yAxisLineWidth", "Ljava/lang/Float;", "stacking", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "yAxisMin", "title", "Ljava/lang/String;", "borderRadius", "animationDuration", "Ljava/lang/Integer;", "yAxisLabelsEnabled", "yAxisMax", "scrollablePlotArea", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "colorsTheme", "yAxisAllowDecimals", "subtitle", "chartType", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "animationType", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;", "markerRadius", "yAxisVisible", "xAxisVisible", "categories", "[Ljava/lang/String;", "markerSymbolStyle", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolStyleType;", "axesTextColor", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "zoomType", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "xAxisReversed", "legendEnabled", "dataLabelsEnabled", "xAxisGridLineWidth", "xAxisLabelsEnabled", "touchEventEnabled", "yAxisTitle", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Resources;", "xAxisTickInterval", "titleStyle", "polar", "tooltipValueSuffix", "subtitleStyle", "inverted", "yAxisGridLineWidth", "markerSymbol", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;", "backgroundColor", "Ljava/lang/Object;", "yAxisReversed", "context", "<init>", "(Landroid/content/Context;)V", "source", "(Landroid/content/Context;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;)V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class Builder {
        private Integer animationDuration;
        private AAChartAnimationType animationType;
        private final Context applicationContext;
        private String axesTextColor;
        private Object backgroundColor;
        private Float borderRadius;
        private String[] categories;
        private AAChartType chartType;
        private Object[] colorsTheme;
        private Boolean dataLabelsEnabled;
        private AAStyle dataLabelsStyle;
        private Boolean gradientColorEnable;
        private Boolean inverted;
        private Boolean legendEnabled;
        private Float[] margin;
        private Float markerRadius;
        private AAChartSymbolType markerSymbol;
        private AAChartSymbolStyleType markerSymbolStyle;
        private Boolean polar;
        private final Resources resources;
        private AAScrollablePlotArea scrollablePlotArea;
        private Object[] series;
        private AAChartStackingType stacking;
        private String subtitle;
        private AAChartAlignType subtitleAlign;
        private AAStyle subtitleStyle;
        private String title;
        private AAStyle titleStyle;
        private Boolean tooltipEnabled;
        private String tooltipValueSuffix;
        private Boolean touchEventEnabled;
        private Float xAxisGridLineWidth;
        private Boolean xAxisLabelsEnabled;
        private Boolean xAxisReversed;
        private Integer xAxisTickInterval;
        private Boolean xAxisVisible;
        private Boolean yAxisAllowDecimals;
        private Float yAxisGridLineWidth;
        private Boolean yAxisLabelsEnabled;
        private Float yAxisLineWidth;
        private Float yAxisMax;
        private Float yAxisMin;
        private Boolean yAxisReversed;
        private String yAxisTitle;
        private Boolean yAxisVisible;
        private AAChartZoomType zoomType;

        public Builder(Context context) {
            Intrinsics.isThisObjectNull(context, "context");
            Context applicationContext = context.getApplicationContext();
            this.applicationContext = applicationContext;
            Intrinsics.checkIfNull(applicationContext, "applicationContext");
            this.resources = applicationContext.getResources();
            this.animationType = AAChartAnimationType.Linear;
            this.animationDuration = 500;
            this.title = BuildConfig.VERSION_NAME;
            this.subtitle = BuildConfig.VERSION_NAME;
            this.chartType = AAChartType.Line;
            this.stacking = AAChartStackingType.False;
            this.markerRadius = Float.valueOf(6.0f);
            this.markerSymbolStyle = AAChartSymbolStyleType.Normal;
            this.zoomType = AAChartZoomType.None;
            Boolean bool = Boolean.FALSE;
            this.inverted = bool;
            this.xAxisReversed = bool;
            this.yAxisReversed = bool;
            this.gradientColorEnable = bool;
            this.polar = bool;
            this.dataLabelsEnabled = bool;
            Boolean bool2 = Boolean.TRUE;
            this.xAxisLabelsEnabled = bool2;
            Float valueOf = Float.valueOf(0.0f);
            this.xAxisGridLineWidth = valueOf;
            this.yAxisLabelsEnabled = bool2;
            this.yAxisGridLineWidth = Float.valueOf(1.0f);
            this.colorsTheme = new Object[]{"#fe117c", "#ffc069", "#06caf4", "#7dffc0"};
            this.legendEnabled = bool2;
            this.backgroundColor = "#ffffff";
            this.borderRadius = valueOf;
        }

        private final int getColor(int i) {
            if (Build.VERSION.SDK_INT >= 23) {
                return this.applicationContext.getColor(i);
            }
            return this.resources.getColor(i);
        }

        private final float getDimen(int i) {
            return this.resources.getDimension(i);
        }

        private final String getString(int i, Object... objArr) {
            String string = this.resources.getString(i, objArr);
            Intrinsics.checkIfNull(string, "resources.getString(id, formatArgs)");
            return string;
        }

        private final String toColorString(int i) {
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public final AAChartModel build() {
            return new AAChartModel(this.animationType, this.animationDuration, this.title, this.titleStyle, this.subtitle, this.subtitleAlign, this.subtitleStyle, this.axesTextColor, this.chartType, this.stacking, this.markerRadius, this.markerSymbol, this.markerSymbolStyle, this.zoomType, this.inverted, this.xAxisReversed, this.yAxisReversed, this.tooltipEnabled, this.tooltipValueSuffix, this.gradientColorEnable, this.polar, this.margin, this.dataLabelsEnabled, this.dataLabelsStyle, this.xAxisLabelsEnabled, this.xAxisTickInterval, this.categories, this.xAxisGridLineWidth, this.xAxisVisible, this.yAxisVisible, this.yAxisLabelsEnabled, this.yAxisTitle, this.yAxisLineWidth, this.yAxisMin, this.yAxisMax, this.yAxisAllowDecimals, this.yAxisGridLineWidth, this.colorsTheme, this.legendEnabled, this.backgroundColor, this.borderRadius, this.series, this.touchEventEnabled, this.scrollablePlotArea);
        }

        public final Builder set(AAChartModel aAChartModel) {
            Intrinsics.isThisObjectNull(aAChartModel, "prop");
            this.animationType = aAChartModel.getAnimationType();
            this.animationDuration = aAChartModel.getAnimationDuration();
            this.title = aAChartModel.getTitle();
            this.titleStyle = aAChartModel.getTitleStyle();
            this.subtitle = aAChartModel.getSubtitle();
            this.subtitleAlign = aAChartModel.getSubtitleAlign();
            this.subtitleStyle = aAChartModel.getSubtitleStyle();
            this.axesTextColor = aAChartModel.getAxesTextColor();
            this.chartType = aAChartModel.getChartType();
            this.stacking = aAChartModel.getStacking();
            this.markerRadius = aAChartModel.getMarkerRadius();
            this.markerSymbol = aAChartModel.getMarkerSymbol();
            this.markerSymbolStyle = aAChartModel.getMarkerSymbolStyle();
            this.zoomType = aAChartModel.getZoomType();
            this.inverted = aAChartModel.getInverted();
            this.xAxisReversed = aAChartModel.getXAxisReversed();
            this.yAxisReversed = aAChartModel.getYAxisReversed();
            this.tooltipEnabled = aAChartModel.getTooltipEnabled();
            this.tooltipValueSuffix = aAChartModel.getTooltipValueSuffix();
            this.gradientColorEnable = aAChartModel.getGradientColorEnable();
            this.polar = aAChartModel.getPolar();
            this.margin = aAChartModel.getMargin();
            this.dataLabelsEnabled = aAChartModel.getDataLabelsEnabled();
            this.dataLabelsStyle = aAChartModel.getDataLabelsStyle();
            this.xAxisLabelsEnabled = aAChartModel.getXAxisLabelsEnabled();
            this.xAxisTickInterval = aAChartModel.getXAxisTickInterval();
            this.categories = aAChartModel.getCategories();
            this.xAxisGridLineWidth = aAChartModel.getXAxisGridLineWidth();
            this.xAxisVisible = aAChartModel.getXAxisVisible();
            this.yAxisVisible = aAChartModel.getYAxisVisible();
            this.yAxisLabelsEnabled = aAChartModel.getYAxisLabelsEnabled();
            this.yAxisTitle = aAChartModel.getYAxisTitle();
            this.yAxisLineWidth = aAChartModel.getYAxisLineWidth();
            this.yAxisMin = aAChartModel.getYAxisMin();
            this.yAxisMax = aAChartModel.getYAxisMax();
            this.yAxisAllowDecimals = aAChartModel.getYAxisAllowDecimals();
            this.yAxisGridLineWidth = aAChartModel.getYAxisGridLineWidth();
            this.colorsTheme = aAChartModel.getColorsTheme();
            this.legendEnabled = aAChartModel.getLegendEnabled();
            this.backgroundColor = aAChartModel.getBackgroundColor();
            this.borderRadius = aAChartModel.getBorderRadius();
            this.series = aAChartModel.getSeries();
            this.touchEventEnabled = aAChartModel.getTouchEventEnabled();
            this.scrollablePlotArea = aAChartModel.getScrollablePlotArea();
            return this;
        }

        public final Builder setAnimationDuration(int i) {
            this.animationDuration = Integer.valueOf(i);
            return this;
        }

        public final Builder setAnimationType(AAChartAnimationType aAChartAnimationType) {
            Intrinsics.isThisObjectNull(aAChartAnimationType, "prop");
            this.animationType = aAChartAnimationType;
            return this;
        }

        public final Builder setAxesTextColor(String str) {
            Intrinsics.isThisObjectNull(str, "prop");
            this.axesTextColor = str;
            return this;
        }

        public final Builder setAxesTextColorRes(int i) {
            return setAxesTextColor(toColorString(getColor(i)));
        }

        public final Builder setBackgroundColor(String str) {
            Intrinsics.isThisObjectNull(str, "prop");
            this.backgroundColor = str;
            return this;
        }

        public final Builder setBorderRadius(float f) {
            this.borderRadius = Float.valueOf(f);
            return this;
        }

        public final Builder setCategories(String... strArr) {
            Intrinsics.isThisObjectNull(strArr, "prop");
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            this.categories = (String[]) array;
            return this;
        }

        public final Builder setChartType(AAChartType aAChartType) {
            Intrinsics.isThisObjectNull(aAChartType, "prop");
            this.chartType = aAChartType;
            return this;
        }

        public final Builder setColorsTheme(Object[] objArr) {
            Intrinsics.isThisObjectNull(objArr, "prop");
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            this.colorsTheme = array;
            return this;
        }

        public final Builder setDataLabelsEnabled(boolean z) {
            this.dataLabelsEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setDataLabelsStyle(AAStyle aAStyle) {
            Intrinsics.isThisObjectNull(aAStyle, "prop");
            this.dataLabelsStyle = aAStyle;
            return this;
        }

        public final Builder setGradientColorEnable(boolean z) {
            this.gradientColorEnable = Boolean.valueOf(z);
            return this;
        }

        public final Builder setInverted(boolean z) {
            this.inverted = Boolean.valueOf(z);
            return this;
        }

        public final Builder setLegendEnabled(boolean z) {
            this.legendEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setMargin(float f, float f2, float f3, float f4) {
            return setMargin(f, f2, f3, f4);
        }

        public final Builder setMarkerRadius(float f) {
            this.markerRadius = Float.valueOf(f);
            return this;
        }

        public final Builder setMarkerRadiusRes(int i) {
            return setMarkerRadius(getDimen(i));
        }

        public final Builder setMarkerSymbol(AAChartSymbolType aAChartSymbolType) {
            Intrinsics.isThisObjectNull(aAChartSymbolType, "prop");
            this.markerSymbol = aAChartSymbolType;
            return this;
        }

        public final Builder setMarkerSymbolStyle(AAChartSymbolStyleType aAChartSymbolStyleType) {
            Intrinsics.isThisObjectNull(aAChartSymbolStyleType, "prop");
            this.markerSymbolStyle = aAChartSymbolStyleType;
            return this;
        }

        public final Builder setPolar(boolean z) {
            this.polar = Boolean.valueOf(z);
            return this;
        }

        public final Builder setScrollablePlotArea(AAScrollablePlotArea aAScrollablePlotArea) {
            Intrinsics.isThisObjectNull(aAScrollablePlotArea, "prop");
            this.scrollablePlotArea = aAScrollablePlotArea;
            return this;
        }

        public final Builder setSeries(AASeriesElement... aASeriesElementArr) {
            Intrinsics.isThisObjectNull(aASeriesElementArr, "prop");
            ArrayList arrayList = new ArrayList(aASeriesElementArr.length);
            for (AASeriesElement aASeriesElement : aASeriesElementArr) {
                arrayList.add(aASeriesElement);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            this.series = array;
            return this;
        }

        public final Builder setStacking(AAChartStackingType aAChartStackingType) {
            Intrinsics.isThisObjectNull(aAChartStackingType, "prop");
            this.stacking = aAChartStackingType;
            return this;
        }

        public final Builder setSubtitle(String str) {
            Intrinsics.isThisObjectNull(str, "prop");
            this.subtitle = str;
            return this;
        }

        public final Builder setSubtitleAlign(AAChartAlignType aAChartAlignType) {
            Intrinsics.isThisObjectNull(aAChartAlignType, "prop");
            this.subtitleAlign = aAChartAlignType;
            return this;
        }

        public final Builder setSubtitleStyle(AAStyle aAStyle) {
            Intrinsics.isThisObjectNull(aAStyle, "prop");
            this.subtitleStyle = aAStyle;
            return this;
        }

        public final Builder setTitle(String str) {
            Intrinsics.isThisObjectNull(str, "prop");
            this.title = str;
            return this;
        }

        public final Builder setTitleStyle(AAStyle aAStyle) {
            Intrinsics.isThisObjectNull(aAStyle, "prop");
            this.titleStyle = aAStyle;
            return this;
        }

        public final Builder setTooltipEnabled(boolean z) {
            this.tooltipEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setTooltipValueSuffix(String str) {
            Intrinsics.isThisObjectNull(str, "prop");
            this.tooltipValueSuffix = str;
            return this;
        }

        public final Builder setTouchEventEnabled(boolean z) {
            this.touchEventEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setXAxisGridLineWidth(float f) {
            this.xAxisGridLineWidth = Float.valueOf(f);
            return this;
        }

        public final Builder setXAxisLabelsEnabled(boolean z) {
            this.xAxisLabelsEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setXAxisReversed(boolean z) {
            this.xAxisReversed = Boolean.valueOf(z);
            return this;
        }

        public final Builder setXAxisTickInterval(int i) {
            this.xAxisTickInterval = Integer.valueOf(i);
            return this;
        }

        public final Builder setXAxisVisible(boolean z) {
            this.xAxisVisible = Boolean.valueOf(z);
            return this;
        }

        public final Builder setYAxisAllowDecimals(boolean z) {
            this.yAxisAllowDecimals = Boolean.valueOf(z);
            return this;
        }

        public final Builder setYAxisGridLineWidth(float f) {
            this.yAxisGridLineWidth = Float.valueOf(f);
            return this;
        }

        public final Builder setYAxisLabelsEnabled(boolean z) {
            this.yAxisLabelsEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setYAxisLineWidth(float f) {
            this.yAxisLineWidth = Float.valueOf(f);
            return this;
        }

        public final Builder setYAxisMax(Float f) {
            this.yAxisMax = f;
            return this;
        }

        public final Builder setYAxisMin(Float f) {
            this.yAxisMin = f;
            return this;
        }

        public final Builder setYAxisReversed(boolean z) {
            this.yAxisReversed = Boolean.valueOf(z);
            return this;
        }

        public final Builder setYAxisTitle(String str) {
            Intrinsics.isThisObjectNull(str, "prop");
            this.yAxisTitle = str;
            return this;
        }

        public final Builder setYAxisVisible(boolean z) {
            this.yAxisVisible = Boolean.valueOf(z);
            return this;
        }

        public final Builder setZoomType(AAChartZoomType aAChartZoomType) {
            Intrinsics.isThisObjectNull(aAChartZoomType, "prop");
            this.zoomType = aAChartZoomType;
            return this;
        }

        public final Builder setAxesTextColor(int i) {
            return setAxesTextColor(toColorString(i));
        }

        public final Builder setBackgroundColor(int i) {
            return setBackgroundColor(toColorString(getColor(i)));
        }

        public final Builder setBorderRadius(int i) {
            return setBorderRadius(getDimen(i));
        }

        public final Builder setMargin(int i, int i2, int i3, int i4) {
            return setMargin(getDimen(i), getDimen(i2), getDimen(i3), getDimen(i4));
        }

        public final Builder setSubtitle(int i, Object... objArr) {
            Intrinsics.isThisObjectNull(objArr, "formatArgs");
            return setSubtitle(getString(i, objArr));
        }

        public final Builder setTitle(int i, Object... objArr) {
            Intrinsics.isThisObjectNull(objArr, "formatArgs");
            return setTitle(getString(i, objArr));
        }

        public final Builder setTooltipValueSuffix(int i, Object... objArr) {
            Intrinsics.isThisObjectNull(objArr, "formatArgs");
            return setTooltipValueSuffix(getString(i, objArr));
        }

        public final Builder setXAxisGridLineWidth(int i) {
            return setXAxisGridLineWidth(getDimen(i));
        }

        public final Builder setYAxisGridLineWidth(int i) {
            return setYAxisGridLineWidth(getDimen(i));
        }

        public final Builder setYAxisLineWidth(int i) {
            return setYAxisLineWidth(getDimen(i));
        }

        public final Builder setYAxisMax(int i) {
            return setYAxisMax(Float.valueOf(getDimen(i)));
        }

        public final Builder setYAxisMin(int i) {
            return setYAxisMin(Float.valueOf(getDimen(i)));
        }

        public final Builder setYAxisTitle(int i, Object... objArr) {
            Intrinsics.isThisObjectNull(objArr, "formatArgs");
            return setYAxisTitle(getString(i, objArr));
        }

        public final Builder setCategories(int... iArr) {
            Intrinsics.isThisObjectNull(iArr, "stringResIds");
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList.add(getString(i, new Object[0]));
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            return setCategories((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Builder setColorsTheme(String... strArr) {
            Intrinsics.isThisObjectNull(strArr, "prop");
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            this.colorsTheme = array;
            return this;
        }

        public final Builder setMargin(float... fArr) {
            Intrinsics.isThisObjectNull(fArr, "prop");
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f : fArr) {
                arrayList.add(Float.valueOf(f));
            }
            Object[] array = arrayList.toArray(new Float[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            this.margin = (Float[]) array;
            return this;
        }

        public final Builder setColorsTheme(int... iArr) {
            Intrinsics.isThisObjectNull(iArr, "colorResIds");
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList.add(toColorString(getColor(i)));
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            return setColorsTheme((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Context context, AAChartModel aAChartModel) {
            this(context);
            Intrinsics.isThisObjectNull(context, "context");
            Intrinsics.isThisObjectNull(aAChartModel, "source");
            set(aAChartModel);
        }
    }

    public AAChartModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4095, null);
    }

    public AAChartModel(AAChartAnimationType aAChartAnimationType, Integer num, String str, AAStyle aAStyle, String str2, AAChartAlignType aAChartAlignType, AAStyle aAStyle2, String str3, AAChartType aAChartType, AAChartStackingType aAChartStackingType, Float f, AAChartSymbolType aAChartSymbolType, AAChartSymbolStyleType aAChartSymbolStyleType, AAChartZoomType aAChartZoomType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str4, Boolean bool5, Boolean bool6, Float[] fArr, Boolean bool7, AAStyle aAStyle3, Boolean bool8, Integer num2, String[] strArr, Float f2, Boolean bool9, Boolean bool10, Boolean bool11, String str5, Float f3, Float f4, Float f5, Boolean bool12, Float f6, Object[] objArr, Boolean bool13, Object obj, Float f7, Object[] objArr2, Boolean bool14, AAScrollablePlotArea aAScrollablePlotArea) {
        this.animationType = aAChartAnimationType;
        this.animationDuration = num;
        this.title = str;
        this.titleStyle = aAStyle;
        this.subtitle = str2;
        this.subtitleAlign = aAChartAlignType;
        this.subtitleStyle = aAStyle2;
        this.axesTextColor = str3;
        this.chartType = aAChartType;
        this.stacking = aAChartStackingType;
        this.markerRadius = f;
        this.markerSymbol = aAChartSymbolType;
        this.markerSymbolStyle = aAChartSymbolStyleType;
        this.zoomType = aAChartZoomType;
        this.inverted = bool;
        this.xAxisReversed = bool2;
        this.yAxisReversed = bool3;
        this.tooltipEnabled = bool4;
        this.tooltipValueSuffix = str4;
        this.gradientColorEnable = bool5;
        this.polar = bool6;
        this.margin = fArr;
        this.dataLabelsEnabled = bool7;
        this.dataLabelsStyle = aAStyle3;
        this.xAxisLabelsEnabled = bool8;
        this.xAxisTickInterval = num2;
        this.categories = strArr;
        this.xAxisGridLineWidth = f2;
        this.xAxisVisible = bool9;
        this.yAxisVisible = bool10;
        this.yAxisLabelsEnabled = bool11;
        this.yAxisTitle = str5;
        this.yAxisLineWidth = f3;
        this.yAxisMin = f4;
        this.yAxisMax = f5;
        this.yAxisAllowDecimals = bool12;
        this.yAxisGridLineWidth = f6;
        this.colorsTheme = objArr;
        this.legendEnabled = bool13;
        this.backgroundColor = obj;
        this.borderRadius = f7;
        this.series = objArr2;
        this.touchEventEnabled = bool14;
        this.scrollablePlotArea = aAScrollablePlotArea;
    }

    public final AAChartModel animationDuration(Integer num) {
        this.animationDuration = num;
        return this;
    }

    public final AAChartModel animationType(AAChartAnimationType aAChartAnimationType) {
        Intrinsics.isThisObjectNull(aAChartAnimationType, "prop");
        this.animationType = aAChartAnimationType;
        return this;
    }

    public final AAChartModel axesTextColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.axesTextColor = str;
        return this;
    }

    public final AAChartModel backgroundColor(Object obj) {
        Intrinsics.isThisObjectNull(obj, "prop");
        this.backgroundColor = obj;
        return this;
    }

    public final AAChartModel borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AAChartModel categories(String[] strArr) {
        Intrinsics.isThisObjectNull(strArr, "prop");
        this.categories = strArr;
        return this;
    }

    public final AAChartModel chartType(AAChartType aAChartType) {
        Intrinsics.isThisObjectNull(aAChartType, "prop");
        this.chartType = aAChartType;
        return this;
    }

    public final AAChartModel colorsTheme(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.colorsTheme = objArr;
        return this;
    }

    public final AAChartModel dataLabelsEnabled(Boolean bool) {
        this.dataLabelsEnabled = bool;
        return this;
    }

    public final AAChartModel dataLabelsStyle(AAStyle aAStyle) {
        Intrinsics.isThisObjectNull(aAStyle, "prop");
        this.dataLabelsStyle = aAStyle;
        return this;
    }

    public final Integer getAnimationDuration() {
        return this.animationDuration;
    }

    public final AAChartAnimationType getAnimationType() {
        return this.animationType;
    }

    public final String getAxesTextColor() {
        return this.axesTextColor;
    }

    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Float getBorderRadius() {
        return this.borderRadius;
    }

    public final String[] getCategories() {
        return this.categories;
    }

    public final AAChartType getChartType() {
        return this.chartType;
    }

    public final Object[] getColorsTheme() {
        return this.colorsTheme;
    }

    public final Boolean getDataLabelsEnabled() {
        return this.dataLabelsEnabled;
    }

    public final AAStyle getDataLabelsStyle() {
        return this.dataLabelsStyle;
    }

    public final Boolean getGradientColorEnable() {
        return this.gradientColorEnable;
    }

    public final Boolean getInverted() {
        return this.inverted;
    }

    public final Boolean getLegendEnabled() {
        return this.legendEnabled;
    }

    public final Float[] getMargin() {
        return this.margin;
    }

    public final Float getMarkerRadius() {
        return this.markerRadius;
    }

    public final AAChartSymbolType getMarkerSymbol() {
        return this.markerSymbol;
    }

    public final AAChartSymbolStyleType getMarkerSymbolStyle() {
        return this.markerSymbolStyle;
    }

    public final Boolean getPolar() {
        return this.polar;
    }

    public final AAScrollablePlotArea getScrollablePlotArea() {
        return this.scrollablePlotArea;
    }

    public final Object[] getSeries() {
        return this.series;
    }

    public final AAChartStackingType getStacking() {
        return this.stacking;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final AAChartAlignType getSubtitleAlign() {
        return this.subtitleAlign;
    }

    public final AAStyle getSubtitleStyle() {
        return this.subtitleStyle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AAStyle getTitleStyle() {
        return this.titleStyle;
    }

    public final Boolean getTooltipEnabled() {
        return this.tooltipEnabled;
    }

    public final String getTooltipValueSuffix() {
        return this.tooltipValueSuffix;
    }

    public final Boolean getTouchEventEnabled() {
        return this.touchEventEnabled;
    }

    public final Float getXAxisGridLineWidth() {
        return this.xAxisGridLineWidth;
    }

    public final Boolean getXAxisLabelsEnabled() {
        return this.xAxisLabelsEnabled;
    }

    public final Boolean getXAxisReversed() {
        return this.xAxisReversed;
    }

    public final Integer getXAxisTickInterval() {
        return this.xAxisTickInterval;
    }

    public final Boolean getXAxisVisible() {
        return this.xAxisVisible;
    }

    public final Boolean getYAxisAllowDecimals() {
        return this.yAxisAllowDecimals;
    }

    public final Float getYAxisGridLineWidth() {
        return this.yAxisGridLineWidth;
    }

    public final Boolean getYAxisLabelsEnabled() {
        return this.yAxisLabelsEnabled;
    }

    public final Float getYAxisLineWidth() {
        return this.yAxisLineWidth;
    }

    public final Float getYAxisMax() {
        return this.yAxisMax;
    }

    public final Float getYAxisMin() {
        return this.yAxisMin;
    }

    public final Boolean getYAxisReversed() {
        return this.yAxisReversed;
    }

    public final String getYAxisTitle() {
        return this.yAxisTitle;
    }

    public final Boolean getYAxisVisible() {
        return this.yAxisVisible;
    }

    public final AAChartZoomType getZoomType() {
        return this.zoomType;
    }

    public final AAChartModel gradientColorEnable(Boolean bool) {
        this.gradientColorEnable = bool;
        return this;
    }

    public final AAChartModel inverted(Boolean bool) {
        this.inverted = bool;
        return this;
    }

    public final AAChartModel legendEnabled(Boolean bool) {
        this.legendEnabled = bool;
        return this;
    }

    public final AAChartModel margin(Float[] fArr) {
        this.margin = fArr;
        return this;
    }

    public final AAChartModel markerRadius(Float f) {
        this.markerRadius = f;
        return this;
    }

    public final AAChartModel markerSymbol(AAChartSymbolType aAChartSymbolType) {
        Intrinsics.isThisObjectNull(aAChartSymbolType, "prop");
        this.markerSymbol = aAChartSymbolType;
        return this;
    }

    public final AAChartModel markerSymbolStyle(AAChartSymbolStyleType aAChartSymbolStyleType) {
        Intrinsics.isThisObjectNull(aAChartSymbolStyleType, "prop");
        this.markerSymbolStyle = aAChartSymbolStyleType;
        return this;
    }

    public final AAChartModel polar(Boolean bool) {
        this.polar = bool;
        return this;
    }

    public final AAChartModel scrollablePlotArea(AAScrollablePlotArea aAScrollablePlotArea) {
        Intrinsics.isThisObjectNull(aAScrollablePlotArea, "prop");
        this.scrollablePlotArea = aAScrollablePlotArea;
        return this;
    }

    public final AAChartModel series(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.series = objArr;
        return this;
    }

    public final void setAnimationDuration(Integer num) {
        this.animationDuration = num;
    }

    public final void setAnimationType(AAChartAnimationType aAChartAnimationType) {
        this.animationType = aAChartAnimationType;
    }

    public final void setAxesTextColor(String str) {
        this.axesTextColor = str;
    }

    public final void setBackgroundColor(Object obj) {
        this.backgroundColor = obj;
    }

    public final void setBorderRadius(Float f) {
        this.borderRadius = f;
    }

    public final void setCategories(String[] strArr) {
        this.categories = strArr;
    }

    public final void setChartType(AAChartType aAChartType) {
        this.chartType = aAChartType;
    }

    public final void setColorsTheme(Object[] objArr) {
        this.colorsTheme = objArr;
    }

    public final void setDataLabelsEnabled(Boolean bool) {
        this.dataLabelsEnabled = bool;
    }

    public final void setDataLabelsStyle(AAStyle aAStyle) {
        this.dataLabelsStyle = aAStyle;
    }

    public final void setGradientColorEnable(Boolean bool) {
        this.gradientColorEnable = bool;
    }

    public final void setInverted(Boolean bool) {
        this.inverted = bool;
    }

    public final void setLegendEnabled(Boolean bool) {
        this.legendEnabled = bool;
    }

    public final void setMargin(Float[] fArr) {
        this.margin = fArr;
    }

    public final void setMarkerRadius(Float f) {
        this.markerRadius = f;
    }

    public final void setMarkerSymbol(AAChartSymbolType aAChartSymbolType) {
        this.markerSymbol = aAChartSymbolType;
    }

    public final void setMarkerSymbolStyle(AAChartSymbolStyleType aAChartSymbolStyleType) {
        this.markerSymbolStyle = aAChartSymbolStyleType;
    }

    public final void setPolar(Boolean bool) {
        this.polar = bool;
    }

    public final void setScrollablePlotArea(AAScrollablePlotArea aAScrollablePlotArea) {
        this.scrollablePlotArea = aAScrollablePlotArea;
    }

    public final void setSeries(Object[] objArr) {
        this.series = objArr;
    }

    public final void setStacking(AAChartStackingType aAChartStackingType) {
        this.stacking = aAChartStackingType;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setSubtitleAlign(AAChartAlignType aAChartAlignType) {
        this.subtitleAlign = aAChartAlignType;
    }

    public final void setSubtitleStyle(AAStyle aAStyle) {
        this.subtitleStyle = aAStyle;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTitleStyle(AAStyle aAStyle) {
        this.titleStyle = aAStyle;
    }

    public final void setTooltipEnabled(Boolean bool) {
        this.tooltipEnabled = bool;
    }

    public final void setTooltipValueSuffix(String str) {
        this.tooltipValueSuffix = str;
    }

    public final void setTouchEventEnabled(Boolean bool) {
        this.touchEventEnabled = bool;
    }

    public final void setXAxisGridLineWidth(Float f) {
        this.xAxisGridLineWidth = f;
    }

    public final void setXAxisLabelsEnabled(Boolean bool) {
        this.xAxisLabelsEnabled = bool;
    }

    public final void setXAxisReversed(Boolean bool) {
        this.xAxisReversed = bool;
    }

    public final void setXAxisTickInterval(Integer num) {
        this.xAxisTickInterval = num;
    }

    public final void setXAxisVisible(Boolean bool) {
        this.xAxisVisible = bool;
    }

    public final void setYAxisAllowDecimals(Boolean bool) {
        this.yAxisAllowDecimals = bool;
    }

    public final void setYAxisGridLineWidth(Float f) {
        this.yAxisGridLineWidth = f;
    }

    public final void setYAxisLabelsEnabled(Boolean bool) {
        this.yAxisLabelsEnabled = bool;
    }

    public final void setYAxisLineWidth(Float f) {
        this.yAxisLineWidth = f;
    }

    public final void setYAxisMax(Float f) {
        this.yAxisMax = f;
    }

    public final void setYAxisMin(Float f) {
        this.yAxisMin = f;
    }

    public final void setYAxisReversed(Boolean bool) {
        this.yAxisReversed = bool;
    }

    public final void setYAxisTitle(String str) {
        this.yAxisTitle = str;
    }

    public final void setYAxisVisible(Boolean bool) {
        this.yAxisVisible = bool;
    }

    public final void setZoomType(AAChartZoomType aAChartZoomType) {
        this.zoomType = aAChartZoomType;
    }

    public final AAChartModel stacking(AAChartStackingType aAChartStackingType) {
        Intrinsics.isThisObjectNull(aAChartStackingType, "prop");
        this.stacking = aAChartStackingType;
        return this;
    }

    public final AAChartModel subtitle(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.subtitle = str;
        return this;
    }

    public final AAChartModel subtitleAlign(AAChartAlignType aAChartAlignType) {
        Intrinsics.isThisObjectNull(aAChartAlignType, "prop");
        this.subtitleAlign = aAChartAlignType;
        return this;
    }

    public final AAChartModel subtitleStyle(AAStyle aAStyle) {
        Intrinsics.isThisObjectNull(aAStyle, "prop");
        this.subtitleStyle = aAStyle;
        return this;
    }

    public final AAChartModel title(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.title = str;
        return this;
    }

    public final AAChartModel titleStyle(AAStyle aAStyle) {
        Intrinsics.isThisObjectNull(aAStyle, "prop");
        this.titleStyle = aAStyle;
        return this;
    }

    public final AAChartModel tooltipEnabled(Boolean bool) {
        this.tooltipEnabled = bool;
        return this;
    }

    public final AAChartModel tooltipValueSuffix(String str) {
        this.tooltipValueSuffix = str;
        return this;
    }

    public final AAChartModel touchEventEnabled(Boolean bool) {
        this.touchEventEnabled = bool;
        return this;
    }

    public final AAChartModel xAxisGridLineWidth(Float f) {
        this.xAxisGridLineWidth = f;
        return this;
    }

    public final AAChartModel xAxisLabelsEnabled(Boolean bool) {
        this.xAxisLabelsEnabled = bool;
        return this;
    }

    public final AAChartModel xAxisReversed(Boolean bool) {
        this.xAxisReversed = bool;
        return this;
    }

    public final AAChartModel xAxisTickInterval(Integer num) {
        this.xAxisTickInterval = num;
        return this;
    }

    public final AAChartModel xAxisVisible(Boolean bool) {
        this.xAxisVisible = bool;
        return this;
    }

    public final AAChartModel yAxisAllowDecimals(Boolean bool) {
        this.yAxisAllowDecimals = bool;
        return this;
    }

    public final AAChartModel yAxisGridLineWidth(Float f) {
        this.yAxisGridLineWidth = f;
        return this;
    }

    public final AAChartModel yAxisLabelsEnabled(Boolean bool) {
        this.yAxisLabelsEnabled = bool;
        return this;
    }

    public final AAChartModel yAxisLineWidth(Float f) {
        this.yAxisLineWidth = f;
        return this;
    }

    public final AAChartModel yAxisMax(Float f) {
        this.yAxisMax = f;
        return this;
    }

    public final AAChartModel yAxisMin(Float f) {
        this.yAxisMin = f;
        return this;
    }

    public final AAChartModel yAxisReversed(Boolean bool) {
        this.yAxisReversed = bool;
        return this;
    }

    public final AAChartModel yAxisTitle(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.yAxisTitle = str;
        return this;
    }

    public final AAChartModel yAxisVisible(Boolean bool) {
        this.yAxisVisible = bool;
        return this;
    }

    public final AAChartModel zoomType(AAChartZoomType aAChartZoomType) {
        Intrinsics.isThisObjectNull(aAChartZoomType, "prop");
        this.zoomType = aAChartZoomType;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ AAChartModel(com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType r43, java.lang.Integer r44, java.lang.String r45, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r46, java.lang.String r47, com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r48, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r49, java.lang.String r50, com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r51, com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType r52, java.lang.Float r53, com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType r54, com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType r55, com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r56, java.lang.Boolean r57, java.lang.Boolean r58, java.lang.Boolean r59, java.lang.Boolean r60, java.lang.String r61, java.lang.Boolean r62, java.lang.Boolean r63, java.lang.Float[] r64, java.lang.Boolean r65, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r66, java.lang.Boolean r67, java.lang.Integer r68, java.lang.String[] r69, java.lang.Float r70, java.lang.Boolean r71, java.lang.Boolean r72, java.lang.Boolean r73, java.lang.String r74, java.lang.Float r75, java.lang.Float r76, java.lang.Float r77, java.lang.Boolean r78, java.lang.Float r79, java.lang.Object[] r80, java.lang.Boolean r81, java.lang.Object r82, java.lang.Float r83, java.lang.Object[] r84, java.lang.Boolean r85, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea r86, int r87, int r88, kotlin.jvm.internal.DefaultConstructorMarker r89) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel.<init>(com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType, java.lang.Integer, java.lang.String, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle, java.lang.String, com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle, java.lang.String, com.github.aachartmodel.aainfographics.aachartcreator.AAChartType, com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType, java.lang.Float, com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType, com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType, com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Float[], java.lang.Boolean, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle, java.lang.Boolean, java.lang.Integer, java.lang.String[], java.lang.Float, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Boolean, java.lang.Float, java.lang.Object[], java.lang.Boolean, java.lang.Object, java.lang.Float, java.lang.Object[], java.lang.Boolean, com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
