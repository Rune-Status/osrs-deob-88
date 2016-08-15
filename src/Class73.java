import java.io.File;

public class Class73 {
	public static int anInt602;
	static File aFile603;
	public static Class132[] aClass132Array604;
	static String aString606;
	static int anInt607;
	static int anInt608;
	static Class78 aClass78_609;
	public static Class132 aClass132_600 = null;
	public static Class132 aClass132_605 = null;
	public static Class132 aClass132_601 = null;

	static final int method313(final int var0, int var1) {
		if (var0 == -1)
			return 12345678;
		else {
			var1 = (var1 * (var0 & 127)) / 128;
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return (var0 & '\uff80') + var1;
		}
	}
}
