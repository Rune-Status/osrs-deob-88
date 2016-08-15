import java.util.Comparator;

final class Class133 implements Comparator {
	@Override
	public int compare(final Object var1, final Object var2) {
		return method482((Class120) var1, (Class120) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	int method482(final Class120 var1, final Class120 var2) {
		return var1.anInt851 >= var2.anInt851 ? (var2.anInt851 == var1.anInt851 ? 0 : 1) : -1;
	}
}
