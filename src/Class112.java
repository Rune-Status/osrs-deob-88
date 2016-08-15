import java.util.Comparator;

final class Class112 implements Comparator {
	static int[] anIntArray818;

	int method433(final Class120 var1, final Class120 var2) {
		return var1.method445().compareTo(var2.method445());
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method433((Class120) var1, (Class120) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
