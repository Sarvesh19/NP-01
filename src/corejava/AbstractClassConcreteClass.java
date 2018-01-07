package corejava;

abstract class Employeer {
	void login_Auth() {

	}

	abstract void getEmployeerName();
}

abstract class ATCS extends Employeer {
	abstract void ATCS_EmplName();

	@Override
	void getEmployeerName() {

	}
}

public class AbstractClassConcreteClass extends ATCS {

	@Override
	void ATCS_EmplName() {
		// TODO Auto-generated method stub

	}

}
