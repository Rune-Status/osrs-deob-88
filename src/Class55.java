import java.net.MalformedURLException;
import java.net.URL;

public abstract class Class55 {
	static boolean aBool535 = false;

	static boolean method259(final String var0) {
		if (var0 == null)
			return false;
		else
			try {
				new URL(var0);
				return true;
			} catch (final MalformedURLException var2) {
				return false;
			}
	}

	abstract byte[] method260(int var1);

	abstract void method261(byte[] var1, byte var2);

	public static boolean method262(final CharSequence var0, final int var1, final boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			final int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				final char var3 = var0.charAt(var8);
				if (var8 == 0) {
					if (var3 == 45) {
						var4 = true;
						continue;
					}

					if (var3 == 43)
						continue;
				}

				int var10;
				if ((var3 >= 48) && (var3 <= 57))
					var10 = var3 - 48;
				else if ((var3 >= 65) && (var3 <= 90))
					var10 = var3 - 55;
				else {
					if ((var3 < 97) || (var3 > 122))
						return false;

					var10 = var3 - 87;
				}

				if (var10 >= var1)
					return false;

				if (var4)
					var10 = -var10;

				final int var9 = var10 + (var6 * var1);
				if (var6 != (var9 / var1))
					return false;

				var6 = var9;
				var5 = true;
			}

			return var5;
		} else
			throw new IllegalArgumentException("");
	}

	public static boolean method263(final char var0) {
		return (var0 >= 48) && (var0 <= 57);
	}
}
