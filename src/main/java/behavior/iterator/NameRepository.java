package behavior.iterator;

public class NameRepository implements Container {
	
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;

		public boolean hasNext() {

			if (index < names.length) {
				return true;
			}
			return false;
		}

		public Object next() {

			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

		public boolean hasPrevious() {
			if (index > 0) {
				return true;
			}
			return false;
		}

		public Object previous() {
			if (this.hasPrevious()) {
				return names[index--];
			}
			return null;
		}
	}
}
