import java.io.EOFException;
import java.io.IOException;

public class Class132 {
	long aLong897 = -1L;
	long aLong900 = -1L;
	int anInt901 = 0;
	Class127 aClass127_895;
	long aLong905;
	long aLong904;
	byte[] aByteArray903;
	byte[] aByteArray896;
	long aLong899;
	long aLong902;
	int anInt898;

	public Class132(final Class127 var1, final int var2, final int var3) throws IOException {
		aClass127_895 = var1;
		final long var10003 = var1.method460();
		aLong905 = var10003 * 8559571044073087659L;
		aLong904 = var10003;
		aByteArray903 = new byte[var2];
		aByteArray896 = new byte[var3];
		aLong899 = 0L;
	}

	public void method474(final long var1) throws IOException {
		if (var1 < 0L)
			throw new IOException("");
		else
			aLong899 = var1;
	}

	public void method475(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((aLong899 + var3) > aLong904)
				aLong904 = var3 + aLong899;

			if ((aLong900 != -1L) && ((aLong899 < aLong900) || (aLong899 > (anInt901 + aLong900))))
				method480();

			if ((-1L != aLong900) && ((aLong899 + var3) > (aLong900 + aByteArray896.length))) {
				final int var4 = (int) (aByteArray896.length - (aLong899 - aLong900));
				System.arraycopy(var1, var2, aByteArray896, (int) (aLong899 - aLong900), var4);
				aLong899 += var4;
				var2 += var4;
				var3 -= var4;
				anInt901 = aByteArray896.length;
				method480();
			}

			if (var3 <= aByteArray896.length) {
				if (var3 > 0) {
					if (aLong900 == -1L)
						aLong900 = aLong899;

					System.arraycopy(var1, var2, aByteArray896, (int) (aLong899 - aLong900), var3);
					aLong899 += var3;
					if ((aLong899 - aLong900) > anInt901)
						anInt901 = (int) (aLong899 - aLong900);

				}
			} else {
				if (aLong902 != aLong899) {
					aClass127_895.method457(aLong899);
					aLong902 = aLong899;
				}

				aClass127_895.method458(var1, var2, var3);
				aLong902 += var3;
				if (aLong902 > aLong905)
					aLong905 = aLong902;

				long var5 = -1L;
				long var7 = -1L;
				if ((aLong899 >= aLong897) && (aLong899 < (aLong897 + anInt898)))
					var5 = aLong899;
				else if ((aLong897 >= aLong899) && (aLong897 < (aLong899 + var3)))
					var5 = aLong897;

				if (((aLong899 + var3) > aLong897) && ((var3 + aLong899) <= (anInt898 + aLong897)))
					var7 = var3 + aLong899;
				else if (((anInt898 + aLong897) > aLong899) && ((aLong897 + anInt898) <= (aLong899 + var3)))
					var7 = anInt898 + aLong897;

				if ((var5 > -1L) && (var7 > var5)) {
					final int var9 = (int) (var7 - var5);
					System.arraycopy(var1, (int) ((var2 + var5) - aLong899), aByteArray903, (int) (var5 - aLong897),
							var9);
				}

				aLong899 += var3;
			}
		} catch (final IOException var11) {
			aLong902 = -1L;
			throw var11;
		}
	}

	public void method476(final byte[] var1) throws IOException {
		method477(var1, 0, var1.length);
	}

	public void method477(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((var3 + var2) > var1.length)
				throw new ArrayIndexOutOfBoundsException((var3 + var2) - var1.length);

			if ((aLong900 != -1L) && (aLong899 >= aLong900) && ((var3 + aLong899) <= (aLong900 + anInt901))) {
				System.arraycopy(aByteArray896, (int) (aLong899 - aLong900), var1, var2, var3);
				aLong899 += var3;
				return;
			}

			final long var4 = aLong899;
			final int var7 = var3;
			int var8;
			if ((aLong899 >= aLong897) && (aLong899 < (aLong897 + anInt898))) {
				var8 = (int) (anInt898 - (aLong899 - aLong897));
				if (var8 > var3)
					var8 = var3;

				System.arraycopy(aByteArray903, (int) (aLong899 - aLong897), var1, var2, var8);
				aLong899 += var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > aByteArray903.length) {
				aClass127_895.method457(aLong899);

				for (aLong902 = aLong899; var3 > 0; var3 -= var8) {
					var8 = aClass127_895.method459(var1, var2, var3);
					if (var8 == -1)
						break;

					aLong902 += var8;
					aLong899 += var8;
					var2 += var8;
				}
			} else if (var3 > 0) {
				method478();
				var8 = var3;
				if (var3 > anInt898)
					var8 = anInt898;

				System.arraycopy(aByteArray903, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				aLong899 += var8;
			}

			if (-1L != aLong900) {
				if ((aLong900 > aLong899) && (var3 > 0)) {
					var8 = (int) (aLong900 - aLong899) + var2;
					if (var8 > (var3 + var2))
						var8 = var3 + var2;

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						++aLong899;
					}
				}

				long var9 = -1L;
				long var11 = -1L;
				if ((aLong900 >= var4) && (aLong900 < (var7 + var4)))
					var9 = aLong900;
				else if ((var4 >= aLong900) && (var4 < (aLong900 + anInt901)))
					var9 = var4;

				if (((anInt901 + aLong900) > var4) && ((aLong900 + anInt901) <= (var7 + var4)))
					var11 = aLong900 + anInt901;
				else if (((var4 + var7) > aLong900) && ((var4 + var7) <= (anInt901 + aLong900)))
					var11 = var4 + var7;

				if ((var9 > -1L) && (var11 > var9)) {
					final int var13 = (int) (var11 - var9);
					System.arraycopy(aByteArray896, (int) (var9 - aLong900), var1, var2 + (int) (var9 - var4), var13);
					if (var11 > aLong899) {
						var3 = (int) (var3 - (var11 - aLong899));
						aLong899 = var11;
					}
				}
			}
		} catch (final IOException var15) {
			aLong902 = -1L;
			throw var15;
		}

		if (var3 > 0)
			throw new EOFException();
	}

	void method478() throws IOException {
		anInt898 = 0;
		if (aLong902 != aLong899) {
			aClass127_895.method457(aLong899);
			aLong902 = aLong899;
		}

		int var1;
		for (aLong897 = aLong899; anInt898 < aByteArray903.length; anInt898 += var1) {
			var1 = aClass127_895.method459(aByteArray903, anInt898, aByteArray903.length - anInt898);
			if (var1 == -1)
				break;

			aLong902 += var1;
		}

	}

	public void method479() throws IOException {
		method480();
		aClass127_895.method461();
	}

	void method480() throws IOException {
		if (aLong900 != -1L) {
			if (aLong902 != aLong900) {
				aClass127_895.method457(aLong900);
				aLong902 = aLong900;
			}

			aClass127_895.method458(aByteArray896, 0, anInt901);
			aLong902 += -1795411631L * anInt901 * 1880209329;
			if (aLong902 > aLong905)
				aLong905 = aLong902;

			long var3 = -1L;
			long var1 = -1L;
			if ((aLong900 >= aLong897) && (aLong900 < (aLong897 + anInt898)))
				var3 = aLong900;
			else if ((aLong897 >= aLong900) && (aLong897 < (anInt901 + aLong900)))
				var3 = aLong897;

			if (((aLong900 + anInt901) > aLong897) && ((anInt901 + aLong900) <= (anInt898 + aLong897)))
				var1 = aLong900 + anInt901;
			else if (((anInt898 + aLong897) > aLong900) && ((anInt898 + aLong897) <= (anInt901 + aLong900)))
				var1 = anInt898 + aLong897;

			if ((var3 > -1L) && (var1 > var3)) {
				final int var5 = (int) (var1 - var3);
				System.arraycopy(aByteArray896, (int) (var3 - aLong900), aByteArray903, (int) (var3 - aLong897), var5);
			}

			aLong900 = -1L;
			anInt901 = 0;
		}

	}

	public long method481() {
		return aLong904;
	}
}
