import java.io.File;
import java.io.RandomAccessFile;

public class Class37 {
	static CacheArch aClass94_388;
	static Class134 aClass134_389;

	static boolean method197(final File var0, final boolean var1) {
		try {
			final RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			System.out.printf("RAF @ %s %n", var0.getAbsolutePath());
			final int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1)
				var0.delete();

			return true;
		} catch (final Exception var4) {
			return false;
		}
	}

	public static boolean method198(final int var0) {
		return ((var0 >> 21) & 1) != 0;
	}
}
