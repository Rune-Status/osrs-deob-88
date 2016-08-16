import java.util.Iterator;

public class Class110 implements Iterable {
	Node aClass124_815 = new Node();

	public void method420(final Node var1) {
		if (var1.aClass124_876 != null)
			var1.method450();

		var1.aClass124_876 = aClass124_815.aClass124_876;
		var1.aClass124_875 = aClass124_815;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
	}

	public Node method421() {
		return method422((Node) null);
	}

	public Class110() {
		aClass124_815.aClass124_875 = aClass124_815;
		aClass124_815.aClass124_876 = aClass124_815;
	}

	@Override
	public Iterator iterator() {
		return new Class115(this);
	}

	Node method422(final Node var1) {
		Node var2;
		if (var1 == null)
			var2 = aClass124_815.aClass124_875;
		else
			var2 = var1;

		return var2 == aClass124_815 ? null : var2;
	}
}
