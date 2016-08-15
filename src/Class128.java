import java.util.Comparator;

final class Class128 implements Comparator {
	public static Class94 aClass94_887;

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	int method462(final Class120 var1, final Class120 var2) {
		return var1.aLong849 < var2.aLong849 ? -1 : (var2.aLong849 == var1.aLong849 ? 0 : 1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method462((Class120) var1, (Class120) var2);
	}
}
