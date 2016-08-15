import java.util.Iterator;

public final class Class116 implements Iterable {
	Class124 aClass124_829;
	int anInt830;
	Class124[] aClass124Array828;

	public Class124 method438(final long var1) {
		final Class124 var3 = aClass124Array828[(int) (var1 & anInt830 - 1)];

		for (aClass124_829 = var3.aClass124_875; aClass124_829 != var3; aClass124_829 = aClass124_829.aClass124_875)
			if (aClass124_829.aLong874 == var1) {
				final Class124 var4 = aClass124_829;
				aClass124_829 = aClass124_829.aClass124_875;
				return var4;
			}

		aClass124_829 = null;
		return null;
	}

	public void method439(final Class124 var1, final long var2) {
		if (var1.aClass124_876 != null)
			var1.method450();

		final Class124 var4 = aClass124Array828[(int) (var2 & anInt830 - 1)];
		var1.aClass124_876 = var4.aClass124_876;
		var1.aClass124_875 = var4;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
		var1.aLong874 = var2;
	}

	public void method440() {
		for (int var1 = 0; var1 < anInt830; ++var1) {
			final Class124 var3 = aClass124Array828[var1];

			while (true) {
				final Class124 var2 = var3.aClass124_875;
				if (var2 == var3)
					break;

				var2.method450();
			}
		}

		aClass124_829 = null;
	}

	@Override
	public Iterator iterator() {
		return new Class118(this);
	}

	public Class116(final int var1) {
		anInt830 = var1;
		aClass124Array828 = new Class124[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			final Class124 var3 = aClass124Array828[var2] = new Class124();
			var3.aClass124_875 = var3;
			var3.aClass124_876 = var3;
		}

	}
}
