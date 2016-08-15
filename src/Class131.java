import java.util.Comparator;

final class Class131 implements Comparator {
	@Override
	public int compare(final Object var1, final Object var2) {
		return method473((Class120) var1, (Class120) var2);
	}

	int method473(final Class120 var1, final Class120 var2) {
		return var1.aClass125_850.anInt881 < var2.aClass125_850.anInt881 ? -1
				: (var2.aClass125_850.anInt881 != var1.aClass125_850.anInt881 ? 1 : 0);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
