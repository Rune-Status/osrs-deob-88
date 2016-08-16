public class Class90 {
	static Class78 aClass78_708;
	public static Somet1 aClass124_Sub22_Sub16_Sub4_Sub1_709;
	public static char[] aCharArray710 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026',
			'\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000',
			'\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122',
			'\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

	static final void method347(final String var0) {
		if (!var0.equals("")) {
			client.secbuf.writeOpcode(36);
			client.secbuf.writeByte(Class54.method258(var0));
			client.secbuf.writestr(var0);
		}
	}
}
