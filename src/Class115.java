import java.util.Iterator;

public class Class115 implements Iterator {
	Node aClass124_827 = null;
	Node aClass124_826;
	Class110 aClass110_825;

	@Override
	public void remove() {
		if (aClass124_827 != null) {
			aClass124_827.method450();
			aClass124_827 = null;
		} else
			throw new IllegalStateException();
	}

	@Override
	public Object next() {
		Node var1 = aClass124_826;
		if (var1 == aClass110_825.aClass124_815) {
			var1 = null;
			aClass124_826 = null;
		} else
			aClass124_826 = var1.aClass124_875;

		aClass124_827 = var1;
		return var1;
	}

	Class115(final Class110 var1) {
		aClass110_825 = var1;
		aClass124_826 = aClass110_825.aClass124_815.aClass124_875;
		aClass124_827 = null;
	}

	@Override
	public boolean hasNext() {
		return aClass124_826 != aClass110_825.aClass124_815;
	}
}
