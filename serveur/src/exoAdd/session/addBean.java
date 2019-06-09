package exoAdd.session;
import javax.ejb.*;
import javax.jws.WebService;

@WebService
@Stateless (mappedName="lAdd")
public class addBean implements addItf {
	@Override
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
