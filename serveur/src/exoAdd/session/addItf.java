package exoAdd.session;

import javax.ejb.Remote;

@Remote
public interface addItf {
	public int add(int n1, int n2);
}
