package org.threeten.p283bp.zone;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p405vf.C11251d;
import wf.AbstractC11665c;

/* renamed from: org.threeten.bp.zone.c */
/* loaded from: classes2.dex */
public final class C8320c extends AbstractC11665c {

    /* renamed from: c */
    private List<String> f21544c;

    /* renamed from: d */
    private final ConcurrentNavigableMap<String, C8321a> f21545d = new ConcurrentSkipListMap();

    /* renamed from: e */
    private Set<String> f21546e = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TzdbZoneRulesProvider.java */
    /* renamed from: org.threeten.bp.zone.c$a */
    /* loaded from: classes2.dex */
    public static class C8321a {

        /* renamed from: a */
        private final String f21547a;

        /* renamed from: b */
        private final String[] f21548b;

        /* renamed from: c */
        private final short[] f21549c;

        /* renamed from: d */
        private final AtomicReferenceArray<Object> f21550d;

        C8321a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f21550d = atomicReferenceArray;
            this.f21547a = str;
            this.f21548b = strArr;
            this.f21549c = sArr;
        }

        /* renamed from: b */
        AbstractC8326f m15804b(short s) throws Exception {
            Object obj = this.f21550d.get(s);
            if (obj instanceof byte[]) {
                obj = C8318a.m15823a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.f21550d.set(s, obj);
            }
            return (AbstractC8326f) obj;
        }

        /* renamed from: c */
        AbstractC8326f m15803c(String str) {
            int binarySearch = Arrays.binarySearch(this.f21548b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return m15804b(this.f21549c[binarySearch]);
            } catch (Exception e) {
                throw new ZoneRulesException("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.f21547a, e);
            }
        }

        public String toString() {
            return this.f21547a;
        }
    }

    public C8320c() {
        if (!m15808h(AbstractC11665c.class.getClassLoader())) {
            throw new ZoneRulesException("No time-zone rules found for 'TZDB'");
        }
    }

    /* renamed from: g */
    private boolean m15809g(InputStream inputStream) throws IOException, StreamCorruptedException {
        boolean z = false;
        for (C8321a c8321a : m15806j(inputStream)) {
            C8321a putIfAbsent = this.f21545d.putIfAbsent(c8321a.f21547a, c8321a);
            if (putIfAbsent != null && !putIfAbsent.f21547a.equals(c8321a.f21547a)) {
                throw new ZoneRulesException("Data already loaded for TZDB time-zone rules version: " + c8321a.f21547a);
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    private boolean m15808h(ClassLoader classLoader) {
        URL url = null;
        try {
            Enumeration<URL> resources = classLoader.getResources("org/threeten/bp/TZDB.dat");
            boolean z = false;
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                try {
                    z |= m15807i(nextElement);
                    url = nextElement;
                } catch (Exception e) {
                    e = e;
                    url = nextElement;
                    throw new ZoneRulesException("Unable to load TZDB time-zone rules: " + url, e);
                }
            }
            return z;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: i */
    private boolean m15807i(URL url) throws ClassNotFoundException, IOException, ZoneRulesException {
        boolean z = false;
        if (this.f21546e.add(url.toExternalForm())) {
            InputStream inputStream = null;
            try {
                inputStream = url.openStream();
                z = false | m15809g(inputStream);
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    private Iterable<C8321a> m15806j(InputStream inputStream) throws IOException, StreamCorruptedException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() == 1) {
            if ("TZDB".equals(dataInputStream.readUTF())) {
                int readShort = dataInputStream.readShort();
                String[] strArr = new String[readShort];
                for (int i = 0; i < readShort; i++) {
                    strArr[i] = dataInputStream.readUTF();
                }
                int readShort2 = dataInputStream.readShort();
                String[] strArr2 = new String[readShort2];
                for (int i2 = 0; i2 < readShort2; i2++) {
                    strArr2[i2] = dataInputStream.readUTF();
                }
                this.f21544c = Arrays.asList(strArr2);
                int readShort3 = dataInputStream.readShort();
                Object[] objArr = new Object[readShort3];
                for (int i3 = 0; i3 < readShort3; i3++) {
                    byte[] bArr = new byte[dataInputStream.readShort()];
                    dataInputStream.readFully(bArr);
                    objArr[i3] = bArr;
                }
                AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
                HashSet hashSet = new HashSet(readShort);
                for (int i4 = 0; i4 < readShort; i4++) {
                    int readShort4 = dataInputStream.readShort();
                    String[] strArr3 = new String[readShort4];
                    short[] sArr = new short[readShort4];
                    for (int i5 = 0; i5 < readShort4; i5++) {
                        strArr3[i5] = strArr2[dataInputStream.readShort()];
                        sArr[i5] = dataInputStream.readShort();
                    }
                    hashSet.add(new C8321a(strArr[i4], strArr3, sArr, atomicReferenceArray));
                }
                return hashSet;
            }
            throw new StreamCorruptedException("File format not recognised");
        }
        throw new StreamCorruptedException("File format not recognised");
    }

    @Override // wf.AbstractC11665c
    /* renamed from: c */
    protected AbstractC8326f mo4522c(String str, boolean z) {
        C11251d.m5623i(str, "zoneId");
        AbstractC8326f m15803c = this.f21545d.lastEntry().getValue().m15803c(str);
        if (m15803c != null) {
            return m15803c;
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    @Override // wf.AbstractC11665c
    /* renamed from: d */
    protected Set<String> mo4521d() {
        return new HashSet(this.f21544c);
    }

    public String toString() {
        return "TZDB";
    }
}
