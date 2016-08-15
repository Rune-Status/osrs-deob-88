import java.util.Comparator;

final class Class126 implements Comparator {
	int method456(final Class120 var1, final Class120 var2) {
		return var1.aClass125_850.anInt880 < var2.aClass125_850.anInt880 ? -1
				: (var1.aClass125_850.anInt880 == var2.aClass125_850.anInt880 ? 0 : 1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method456((Class120) var1, (Class120) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
