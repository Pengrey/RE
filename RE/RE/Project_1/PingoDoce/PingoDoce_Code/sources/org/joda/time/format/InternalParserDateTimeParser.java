package org.joda.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class InternalParserDateTimeParser implements DateTimeParser, InternalParser {
    private final InternalParser underlying;

    private InternalParserDateTimeParser(InternalParser internalParser) {
        this.underlying = internalParser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: of */
    public static DateTimeParser m16411of(InternalParser internalParser) {
        if (internalParser instanceof DateTimeParserInternalParser) {
            return ((DateTimeParserInternalParser) internalParser).getUnderlying();
        }
        if (internalParser instanceof DateTimeParser) {
            return (DateTimeParser) internalParser;
        }
        if (internalParser == null) {
            return null;
        }
        return new InternalParserDateTimeParser(internalParser);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternalParserDateTimeParser) {
            return this.underlying.equals(((InternalParserDateTimeParser) obj).underlying);
        }
        return false;
    }

    @Override // org.joda.time.format.DateTimeParser, org.joda.time.format.InternalParser
    public int estimateParsedLength() {
        return this.underlying.estimateParsedLength();
    }

    @Override // org.joda.time.format.InternalParser
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
        return this.underlying.parseInto(dateTimeParserBucket, charSequence, i);
    }

    @Override // org.joda.time.format.DateTimeParser
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
        return this.underlying.parseInto(dateTimeParserBucket, str, i);
    }
}